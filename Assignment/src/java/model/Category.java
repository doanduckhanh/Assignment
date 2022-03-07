/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author khanh doan
 */
public class Category {
    private int ID;
    private String name;
    private int numB;

    public Category() {
    }

    public Category(int ID, String name, int numB) {
        this.ID = ID;
        this.name = name;
        this.numB = numB;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }
}
