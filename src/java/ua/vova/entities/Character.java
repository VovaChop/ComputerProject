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
public class Character {
    
    private int money;
    private String status;
    private String work;
    private String satiety; //сытность
    private String mood; //настроение
    private String education; //school
    private String english;
    
    private Property property;

    public Character() {
        this.money = 0;
        this.status = "base";
        this.property = property;
    }

    
    
    public Character(int money, String status, String work, String satiety, String mood, String education, String english, Property property) {
        this.money = money;
        this.status = status;
        this.work = work;
        this.satiety = satiety;
        this.mood = mood;
        this.education = education;
        this.english = english;
        this.property = property;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getSatiety() {
        return satiety;
    }

    public void setSatiety(String satiety) {
        this.satiety = satiety;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
    
    
    
}
