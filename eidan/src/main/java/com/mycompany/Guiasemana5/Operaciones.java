/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Guiasemana5;

/**
 *
 * @author mplab4.pc04
 */
public class Operaciones {
    
    public static int Contar(int a){
        if (a < 10) {
            return 1;
        } else {
            return 1 + Contar(a / 10);
        }
    }
    
    public static int Suma(int a){
        if (a < 10) {
            return a;
        } else {
            return a % 10 + Suma(a / 10);
        }
    }
    
    public static int MCD(int a, int b ){
        if (b == 0) {
            return a;
        } else {
            return MCD(b, a % b);
        }
    }
    
    public static String Invertir(String palabra){
        if (palabra.isEmpty()) {
            return palabra;
        } else {
            return Invertir(palabra.substring(1)) + palabra.charAt(0);
        }
    }
    
}
