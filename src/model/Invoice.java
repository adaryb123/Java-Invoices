/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author uzivatel
 */
public class Invoice implements Serializable {
    
    private Customer customer;
    private ArrayList<ItemAndCount> itemAndCount;
    private String date;
    private double totalPrice;

    public Invoice(Customer customer, ArrayList<ItemAndCount> itemAndCount, String date) {
        this.customer = customer;
        this.itemAndCount = itemAndCount;
        this.date = date;
        calculatePrice();
    }

    public void calculatePrice(){
        totalPrice = 0;
        for (int i = 0; i < itemAndCount.size(); i++)
        {
            totalPrice += itemAndCount.get(i).getItem().getPrice() * itemAndCount.get(i).getCount();
        }
    }
    
    /**
     * Get the value of totalPrice
     *
     * @return the value of totalPrice
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Set the value of totalPrice
     *
     * @param totalPrice new value of totalPrice
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


    /**
     * Get the value of date
     *
     * @return the value of date
     */
    public String getDate() {
        return date;
    }

    /**
     * Set the value of date
     *
     * @param date new value of date
     */
    public void setDate(String date) {
        this.date = date;
    }


    /**
     * Get the value of itemAndCount
     *
     * @return the value of itemAndCount
     */
    public ArrayList<ItemAndCount> getItemAndCount() {
        return itemAndCount;
    }

    /**
     * Set the value of itemAndCount
     *
     * @param itemAndCount new value of itemAndCount
     */
    public void setItemAndCount(ArrayList<ItemAndCount> itemAndCount) {
        this.itemAndCount = itemAndCount;
    }

    
    /**
     * Get the value of customer
     *
     * @return the value of customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Set the value of customer
     *
     * @param customer new value of customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
