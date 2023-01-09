/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mainarrayordenado;

/**
 *
 * @author a22lucasmpg
 */
public class MainArrayOrdenado {

    public static void main(String[] args) {

        ArrayOrdenado miArray = new ArrayOrdenado();
        
        System.out.println("ARRAY SIN ORDENAR: ");
        miArray.amosarArray();
        System.out.println("");
        System.out.println("ARRAY ORDENADO: ");
        miArray.ordenarArray();
        miArray.amosarArray();
        
        //COMENTARIO HECHO EN RAMA DEVELOP POR MATIAS
    }
}
