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
public class Customer implements Serializable{
    
    private String name;
    private String address;
    private String city;
    private String postcode;

    public Customer(String name, String address, String city, String postcode) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.postcode = postcode;
    }
    
    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Get the value of address
     *
     * @return the value of address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the value of address
     *
     * @param address new value of address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get the value of city
     *
     * @return the value of city
     */
    public String getCity() {
        return city;
    }

    /**
     * Set the value of city
     *
     * @param city new value of city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Get the value of postcode
     *
     * @return the value of postcode
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Set the value of postcode
     *
     * @param postcode new value of postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    
}
