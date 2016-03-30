/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.vova.connections;

import java.sql.Connection;
import java.util.Properties;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lord
 */
public class ConnectionPoolTest {
    
    public ConnectionPoolTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of create pool connections
     */
    @Test
    public void testConnectionPool() throws Exception {
        System.out.println("Connect pool");
        //String url = "jdbc:mysql://localhost:3306/";
        String url = "jdbc:mysql://localhost:3306/DBComputerGame";
        Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "qwerty");
		prop.put("autoReconnect", "true");
		prop.put("characterEncoding", "UTF-8");
		prop.put("useUnicode", "true");
        ConnectionPool pool = new ConnectionPool(url, prop, 10);
	System.out.println("we have " + pool.getAvailableConnsCnt() + " available connections");
	Connection cn = pool.retreive();
	System.out.println("we have " + pool.getAvailableConnsCnt() + " available connections");
        pool.putBack(cn);
	System.out.println("we have " + pool.getAvailableConnsCnt() + " available connections");
        pool.releases();
        System.out.println("we have after release " + pool.getAvailableConnsCnt());
    }
    
    
}
