/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author uzivatel
 */
public class ItemAndCount implements Serializable{
    
    private Item item;
    private int count;

    public ItemAndCount(Item item, int count) {
        this.item = item;
        this.count = count;
    }
    
    /**
     * Get the value of count
     *
     * @return the value of count
     */
    public int getCount() {
        return count;
    }

    /**
     * Set the value of count
     *
     * @param count new value of count
     */
    public void setCount(int count) {
        this.count = count;
    }

    
    /**
     * Get the value of item
     *
     * @return the value of item
     */
    public Item getItem() {
        return item;
    }

    /**
     * Set the value of item
     *
     * @param item new value of item
     */
    public void setItem(Item item) {
        this.item = item;
    }

}
