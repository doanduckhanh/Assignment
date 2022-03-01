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
    private Customer Cus;
    private Book book;
    private Date start;
    private Date end;

    public Order() {
    }

    public Order(int orid, Customer Cus, Book book, Date start, Date end) {
        this.orid = orid;
        this.Cus = Cus;
        this.book = book;
        this.start = start;
        this.end = end;
    }

    public int getOrid() {
        return orid;
    }

    public void setOrid(int orid) {
        this.orid = orid;
    }

    public Customer getCus() {
        return Cus;
    }

    public void setCus(Customer Cus) {
        this.Cus = Cus;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
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
}
