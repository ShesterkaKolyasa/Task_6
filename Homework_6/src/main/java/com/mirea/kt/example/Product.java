/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.example;

import java.util.ArrayList;
import java.io.File;
import java.io.*;

/**
 *
 * @author 467
 */
public class Product implements Serializable{
    long code;
    String name;
    String type;
    boolean isDiscount;
    ArrayList ingredients;
    
    private static final long serialVersionUID = -3536693998646060163L;

    public Product() {
    }

    public Product(long code, String name, String type, boolean isDiscount, ArrayList ingredients) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.isDiscount = isDiscount;
        this.ingredients = ingredients;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isIsDiscount() {
        return isDiscount;
    }

    public void setIsDiscount(boolean isDiscount) {
        this.isDiscount = isDiscount;
    }

    public ArrayList getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Product{" + "code=" + code + ", name=" + name + ", type=" + type + ", isDiscount=" + isDiscount + ", ingredients=" + ingredients + '}';
    }
    
}
