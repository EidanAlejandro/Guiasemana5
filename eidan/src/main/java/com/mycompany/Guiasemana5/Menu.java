/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Guiasemana5;
import java.util.Scanner;
/**
 *
 * @author mplab4.pc04
 */
public class Menu {
    public void Menu() {
        Scanner scanner = new Scanner(System.in);
        
        int op, a, b;
        do {
            System.out.println("\nMenu operaciones matematicas");
            System.out.println("Ingrese 1 para contar digitos");
            System.out.println("Ingrese 2 para suma de digitos");
            System.out.println("Ingrese 3 para maximo comun divisor");
            System.out.println("Ingrese 4 para invertir cadena");
            System.out.println("Ingrese 0 para finalizar el programa");
            
            while (!scanner.hasNextInt()) {
            System.out.println("Ingrese un numero entero valido: ");
            scanner.next();
            }
            op = scanner.nextInt();
            switch (op) {
                case 1: {
                    System.out.print("Ingrese un numero: ");
                    a = Validarnumero(scanner);
                    System.out.println("el numero tiene " + Operaciones.Contar(a) + (" digitos"));                  
                    break;
                }
                case 2: {
                    System.out.print("Ingrese un numero: ");
                    a = Validarnumero(scanner);
                    System.out.println("la suma de los digitos es: " + Operaciones.Suma(a));        
                    break;
                }
                case 3: {
                    System.out.print("Ingrese el primer numero: ");
                    a = Validarnumero(scanner);
                    System.out.print("Ingrese el segundo numero: ");
                    b = Validarnumero(scanner);
                    System.out.println("el maximo comun divisor es: " + Operaciones.MCD(a, b));
                    break;
                }
                case 4: {
                    System.out.println("Ingrese una palabra");
                    scanner.nextLine();
                    String palabra = scanner.nextLine();
                    System.out.println("la palabra invertida es: " + Operaciones.Invertir(palabra));
                    break;
                }
                case 0: {
                    System.out.println("Hasta luego");            
                    break;
                }
                default:{
                    System.out.println("opcion invalida, por favor ingresar opcion valida.");
                }
            }
        } while (op != 0);
        scanner.close();
    }
     private int Validarnumero(Scanner scanner) {
        int num;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("error debe ingresar un numero entero");
                scanner.next();
            }
            num = scanner.nextInt();
            if (num <= 0) {
                System.out.println("error debe ingresar un numero entero positivo");
            }
        } while (num <= 0);
        return num;
    }
}


