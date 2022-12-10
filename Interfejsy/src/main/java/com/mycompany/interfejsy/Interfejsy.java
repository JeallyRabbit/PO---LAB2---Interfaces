/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.interfejsy;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Interfejsy {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        myList lista = new myList(0);
        Scanner input = new Scanner(System.in);
        System.out.println("1 - dodaj element");
        System.out.println("2 - wyswietl");
        System.out.println("3 - posortuj");
        System.out.println("4 - znajdz max");
        System.out.println("5 - znajdz min");
        System.out.println("6 - wyczysc liste");
        System.out.println("7 - zakoncz");
        int start=1;
        while(start==1)
        {
            String input2 = input.nextLine();
            
            switch(input2)
            {
                case "1":
                    try{
                        System.out.println("Podaj liczbe");
                        lista.add(input.nextDouble());
                        input=new Scanner (System.in);
                    }catch(InputMismatchException e)
                            {
                                System.out.println("Nie wpisano liczby");
                            }
                    break;
                case "2":
                    System.out.println(lista.toString());
                    break;
                case "3":
                    lista.sort();
                    System.out.println(lista.toString());
                    break;
                case "4":
                    System.out.println(lista.max());
                    break;
                case "5":
                    System.out.println(lista.min());
                    break;
                case "6":
                    try{
                        System.out.println("Podaj liczbe");
                        lista.clear(input.nextDouble());
                        input=new Scanner (System.in);
                    }catch(InputMismatchException e)
                            {
                                System.out.println("Nie wpisano liczby");
                            }
                    break;
                case "7":
                    start=2;
            }
        }
    }
}
