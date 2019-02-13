/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9_arrays;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class Ex9_Arrays {
public static int nelementos;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Metodos obx = new Metodos();
        int tam = obx.darValor();
        int[] numeros = new int[tam];
      numeros=  obx.crearArray(numeros,tam);
    }

}
