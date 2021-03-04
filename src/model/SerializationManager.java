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
public class SerializationManager {
    
    public static ArrayList<User> loadUsers()
    {
        ArrayList<User> users = new ArrayList();
        
        try
        {
            FileInputStream file = new FileInputStream("Users.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);
            
            boolean eof = false;
            while (!eof)
            {
                try
                {
                    users.add((User)inputFile.readObject());
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
        return users;
    }
    
    public static void saveUsers(ArrayList<User> users){
        try{
            FileOutputStream file = new FileOutputStream("Users.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            for (int i = 0; i < users.size(); i++){
                outputFile.writeObject(users.get(i));
            }
            outputFile.close();
            JOptionPane.showMessageDialog(null,"Succesfully saved!");
            //this.dispose();
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}
