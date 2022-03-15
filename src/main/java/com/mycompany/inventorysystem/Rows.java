/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorysystem;

/**
 *
 * @author Janaka
 */
public class Rows {
    private static int row;
    public static int getRow(){
        return row;
    }
    public static void setRow(){
        row++;
    }
    public static void setRow( int temp){
        row= temp;
    }

    
}
