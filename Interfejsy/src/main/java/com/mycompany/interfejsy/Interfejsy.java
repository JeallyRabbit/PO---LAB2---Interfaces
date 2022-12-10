/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.interfejsy;

/**
 *
 * @author student
 */
public class Interfejsy {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        myList lista = new myList(4);
        lista.add(1);
        lista.add(7);
        lista.add(11);
        lista.add(3);
        lista.sort();
        System.out.println(lista);
    }
}
