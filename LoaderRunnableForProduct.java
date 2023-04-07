/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework_6;
import com.mirea.kt.example.*;
import java.io.File;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author 467
 */
public class LoaderRunnableForProduct implements Runnable {
    private String path;
    
    public LoaderRunnableForProduct(String path){
        this.path = path;
    }
    @Override
    public void run(){
        FileInputStream fis;
        if(this.path != null && new File(this.path).exists()){
            try{
                fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Product product = (Product)ois.readObject();
                ois.close();
                System.out.println(product.toString());
            }catch (ClassNotFoundException | IOException ex){
                System.out.println("Error loading object from path " + this.path);
                System.out.println(ex.getMessage());
            }
        }
    }
}
