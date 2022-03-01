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
public class Author {
    private int AuID;
    private String name;
    private String infor;

    public Author() {
    }

    public Author(int AuID, String name, String infor) {
        this.AuID = AuID;
        this.name = name;
        this.infor = infor;
    }

    public int getAuID() {
        return AuID;
    }

    public void setAuID(int AuID) {
        this.AuID = AuID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfor() {
        return infor;
    }

    public void setInfor(String infor) {
        this.infor = infor;
    }
}
