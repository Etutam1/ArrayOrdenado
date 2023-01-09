/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainarrayordenado;

/**
 *
 * @author a22lucasmpg
 */
public class ArrayOrdenado {

    //ATRIBUTO
    private static int[] array;

    //MÉTODOS
    public ArrayOrdenado() {
        
        this.array = new int[] {3, 8, 4, 1, 0, 7};
        
    }

    public static int[] getArray() {
        return array;
    }

    public static void setArray(int[] array) {
        ArrayOrdenado.array = array;
    }
// hola dadasdasded
    public void ordenarArray() {
        int tmp;
        for (int i = 0; i < getArray().length - 1; i++) {
            for (int j = i + 1; j < getArray().length; j++) {
                if (getArray()[i] > getArray()[j]) {
                    tmp = getArray()[i];
                    getArray()[i] = getArray()[j];
                    getArray()[j] = tmp;
                }
            }
        }
    }

    public void amosarArray() {
        
        for (int i = 0; i < getArray().length; i++){
            System.out.print(getArray()[i]);
            System.out.print(" ");
        }
    }
   //comentario hecho en la rama master
}
