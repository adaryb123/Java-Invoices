/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author uzivatel
 * 
 * This class is based on code from https://www.youtube.com/watch?v=GZ9MT2myBf8&t=2669s 
 * It loads and saves objects to their .dat files
 */
public final class SerializationManager {

    private SerializationManager() {
    }
    
    public static ArrayList<Customer> loadCustomers()
    {
        ArrayList<Customer> customers = new ArrayList();
        
        try
        {
            FileInputStream file = new FileInputStream("Customers.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);
            
            boolean eof = false;
            while (!eof)
            {
                try
                {
                    customers.add((Customer)inputFile.readObject());
                }
                catch (EOFException e){
                     eof = true;
                }
                catch(Exception e){
                     JOptionPane.showMessageDialog(null,e.getMessage());
                }
            }
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return customers;
    }
    
    public static void saveCustomers(ArrayList<Customer> customers){
        try{
            FileOutputStream file = new FileOutputStream("Customers.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            for (int i = 0; i < customers.size(); i++){
                outputFile.writeObject(customers.get(i));
            }
            outputFile.close();
            //this.dispose();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    public static void deleteCustomer(Customer customer){
        ArrayList<Customer> customers = loadCustomers();
        for (Customer i : customers){
            if (i.getName().equals(customer.getName()) && i.getAddress().equals(customer.getAddress())
                    && i.getCity().equals(customer.getCity()) && i.getPostcode().equals(customer.getPostcode()))
            {
                customers.remove(i);
                break;
            }
        }
        saveCustomers(customers);
    }
    
    //________________________________________________________________________________________________________________
    
    public static ArrayList<Item> loadItems()
    {
        ArrayList<Item> items = new ArrayList();
        
        try
        {
            FileInputStream file = new FileInputStream("Items.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);
            
            boolean eof = false;
            while (!eof)
            {
                try
                {
                    items.add((Item)inputFile.readObject());
                }
                catch (EOFException e){
                     eof = true;
                }
                catch(Exception e){
                     JOptionPane.showMessageDialog(null,e.getMessage());
                }
            }
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return items;
    }
    
    public static void saveItems(ArrayList<Item> items){
        try{
            FileOutputStream file = new FileOutputStream("Items.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            for (int i = 0; i < items.size(); i++){
                outputFile.writeObject(items.get(i));
            }
            outputFile.close();
            //this.dispose();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    public static void deleteItem(Item item){
        ArrayList<Item> items = loadItems();
        for (Item i : items){
            if (i.getName().equals(item.getName()) && i.getDescription().equals(item.getDescription())
                    && (int)i.getPrice() == (int)item.getPrice())
            {
                items.remove(i);
                break;
            }
        }
        saveItems(items);
    }
}
