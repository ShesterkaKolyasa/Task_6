/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework_6;

import java.util.Scanner;

/**
 *
 * @author 467
 */
public class Homework_6 {

    public static void main(String[] args) {
        System.out.println("Практическая работа № 11, Вариант 5, Панкратов Максим Максимович, РИБО-02-21");
        Scanner scan = new Scanner(System.in);
        System.out.println("Input file path");
        String path = scan.next();
        System.out.println("Hello, I am " + Thread.currentThread().getName());
        LoaderRunnableForProduct lrfp = new LoaderRunnableForProduct("C:\\Ivanov\\product.ser");
        Thread th = new Thread(lrfp);
        th.start();
    }
}
