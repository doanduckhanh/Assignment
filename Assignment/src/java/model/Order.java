/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author khanh doan
 */
public class Order {
    private int orid;
    private String book;
    private Date start;
    private Date end;
    private boolean status;
    private String cus;

    public Order(int orid, String book, Date start, Date end, boolean status, String cus) {
        this.orid = orid;
        this.book = book;
        this.start = start;
        this.end = end;
        this.status = status;
        this.cus = cus;
    }

    public Order() {
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getOrid() {
        return orid;
    }

    public void setOrid(int orid) {
        this.orid = orid;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getCus() {
        return cus;
    }

    public void setCus(String cus) {
        this.cus = cus;
    } 
    
    
    @Override
    public String toString() {
        return "Order{" + "orid=" + orid + ", book=" + book + ", start=" + start + ", end=" + end + '}';
    }
}
