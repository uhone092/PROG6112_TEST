/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consolesales;

/**
 *
 * @author Asus
 */
public class ConsoleSales extends Console {

    // Constructor
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    // Print report
    public void printReport() {

        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE NAME: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
        System.out.println("--------------------------------");
    }
}