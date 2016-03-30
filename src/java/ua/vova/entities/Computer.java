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
public class Computer {
    private String monitor;
    private String printer;
    private String scaner;
    private String modem;
    private String processor;
    private String HDD;
    private int RAM;
    private String soundCard;
    private String videoCard;

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getPrinter() {
        return printer;
    }

    public void setPrinter(String printer) {
        this.printer = printer;
    }

    public String getScaner() {
        return scaner;
    }

    public void setScaner(String scaner) {
        this.scaner = scaner;
    }

    public String getModem() {
        return modem;
    }

    public void setModem(String modem) {
        this.modem = modem;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getSoundCard() {
        return soundCard;
    }

    public void setSoundCard(String soundCard) {
        this.soundCard = soundCard;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }
    
}
