/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.vova.entities;

import ua.vova.entities.enums.BathroomSet;
import ua.vova.entities.enums.CarSet;
import ua.vova.entities.enums.ClothesSet;
import ua.vova.entities.enums.FurnitureSet;
import ua.vova.entities.enums.KitchenSet;

/**
 *
 * @author lord
 */
public class Property {
    
    private int numbersOfRoom;
    private FurnitureSet furniture; //мебель
    private KitchenSet kitchen;
    private BathroomSet bathroom;
    private ClothesSet clothes;
    private CarSet car;

    public Property() {
        this.numbersOfRoom = 1;
        this.furniture = FurnitureSet.CHAIR;
        this.kitchen = KitchenSet.SMALL;
        this.bathroom = BathroomSet.BUCKET;
        this.clothes = ClothesSet.T_SHIRT;
        this.car = CarSet.LADA;
    }

    
    
    public Property(int numbersOfRoom, FurnitureSet furniture, KitchenSet kitchen, 
            BathroomSet bathroom, ClothesSet clothes, CarSet car) {
        this.numbersOfRoom = numbersOfRoom;
        this.furniture = furniture;
        this.kitchen = kitchen;
        this.bathroom = bathroom;
        this.clothes = clothes;
        this.car = car;
    }

    
    
    public int getNumbersOfRoom() {
        return numbersOfRoom;
    }

    public void setNumbersOfRoom(int numbersOfRoom) {
        this.numbersOfRoom = numbersOfRoom;
    }

    public FurnitureSet getFurniture() {
        return furniture;
    }

    public void setFurniture(FurnitureSet furniture) {
        this.furniture = furniture;
    }

    public KitchenSet getKitchen() {
        return kitchen;
    }

    public void setKitchen(KitchenSet kitchen) {
        this.kitchen = kitchen;
    }

    public BathroomSet getBathroom() {
        return bathroom;
    }

    public void setBathroom(BathroomSet bathroom) {
        this.bathroom = bathroom;
    }

    public ClothesSet getClothes() {
        return clothes;
    }

    public void setClothes(ClothesSet clothes) {
        this.clothes = clothes;
    }

    public CarSet getCar() {
        return car;
    }

    public void setCar(CarSet car) {
        this.car = car;
    }
    
    
}
