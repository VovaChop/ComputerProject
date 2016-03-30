/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.vova.connections;

import java.util.Vector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 *
 * @author lord
 */
public class ConnectionPool {
    private Vector<Connection> availableConns = new Vector<Connection>();
    private Vector<Connection> usedConns = new Vector<Connection>();
    //String url = "jdbc:mysql://localhost:3306/";
    String url = null;
    private Properties properties = null;
    
	public ConnectionPool (String url, Properties prop, int initConnCnt) {
            this.url = url;
            this.properties = prop;
            for(int i = 0; i < initConnCnt; i++) {
		availableConns.addElement(getConnection(prop));
            }
	}
        
        public ConnectionPool (Properties prop, int initConnCnt) {
		this.properties = prop;
		for(int i = 0; i < initConnCnt; i++) {
			availableConns.addElement(getConnection(prop));
		}
	}
	
	/**
	 * Create connection to DB
	 * @param properties for connection
	 * @return connection
	 */
	private Connection getConnection (Properties properties) {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, properties);
		} catch (SQLException e){
			System.out.println("Cannot create connection"); //will be changed to log soon
		}
		return connection;
	}
	
	/**
	 * Gives instance of the connections
	 * @return connection for use
	 * @throws SQLException
	 */
	public synchronized Connection retreive () throws SQLException {
		Connection newConn = null;
		if(availableConns.size() == 0) {
			newConn = getConnection(properties);
		} else {
			newConn = availableConns.lastElement();
			availableConns.removeElement(newConn);
		}
		usedConns.addElement(newConn);
		return newConn;
	}
	
	/**
	 * Put connection back into pool
	 * @param conn to put into pool
	 * @throws SQLException
	 */
	public synchronized void putBack (Connection conn) throws SQLException {
		if (conn != null) {
			if(usedConns.removeElement(conn)) {
				availableConns.addElement(conn);
			} else {
				System.out.println("Connection is not in usedConns"); //will be log soon
				throw new NullPointerException("Connection is not in usedConns");
			}
		}
	}
	
	/**
	 * Show how many of connections are available
	 * @return number of available connections
	 */
	public int getAvailableConnsCnt() {
		return availableConns.size();
	}
	
	/**
	 * Close all connections
	 */
	public synchronized void releases () {
		Iterator<Connection> iter = availableConns.iterator();
		while (iter.hasNext()) {
			Connection connection = iter.next();
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("cannot close connection"); //will be logged soon
			}
		}
	}
}
