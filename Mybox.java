/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_sql;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author joe
 */
public class Mybox implements Serializable {
    public int height;
    public int widht;
    
    //declaring the setter and the getter methods in java.
    public  void setheight(int height){
        height =height;
    }
    public void setwidth(int width){
        widht = width;
    }
    public static void main(String[] args){
    Mybox box = new Mybox();
    box.setheight(40);
    box.setwidth(50);
    System.out.println("Success, Objects already serialized");
    
    try{
    FileOutputStream filestream = new FileOutputStream("bobo.ser");
    ObjectOutputStream objectstream = new ObjectOutputStream(filestream);
    objectstream.writeObject(box);
    objectstream.close();
   

}catch(IOException ex){
    ex.printStackTrace();
}
    //to deserialize the object.
    try{
    FileInputStream fileinstream = new FileInputStream("bobo.ser");
    ObjectInputStream objectinstream = new ObjectInputStream(fileinstream);
    //objectinstream.readObject(box);
    
    //Gamecharacter elf = (Gamecharacter) one;
    
    
    }catch(IOException ex){
    ex.printStackTrace();
    }
    
    }
    
}
