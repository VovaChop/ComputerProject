/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.vova.entities;

/**
 *
 * @author lord
 */
public class User {
    private int ID;
    private String login;
    private String password;
    private int totalGames;

    public int getID() {
        return ID;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getTotalGames() {
        return totalGames;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTotalGames(int totalGames) {
        this.totalGames = totalGames;
    }
    
    
}
