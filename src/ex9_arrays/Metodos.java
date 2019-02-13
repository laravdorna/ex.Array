/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9_arrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author lvazquezdorna
 */
public class Metodos {

    int tam = 8;
    private int[] notas = new int[tam];
    private int[] repetidos = new int[notas.length];
    private int[] copia = new int[notas.length];

    public int darValor() {
        return Integer.parseInt(JOptionPane.showInputDialog("valor"));

    }

    public void crearArray() {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = darValor();
        }
    }

    //creo un array con el numero de elementos que quieran y le llaman como quieran
    public int[] crearArray(int[] lista, int ele) {
        for (int i = 0; i < ele; i++) {
            lista[i] = darValor();
        }
        return lista;
    }

    public int[] engadir(int lista[], int posiscion, int nelem, int valor) {
        if (nelem < lista.length) {
            for (int i = nelem - 1; i >= posiscion - 1; i--) {
                lista[i + 1] = lista[i];
            }
            lista[posiscion - 1] = valor;
            Ex9_Arrays.nelementos++;

        } else {
            String mensaje;
            System.out.println("No se pueden engadir elementos a la lista, no hay espacio ");

        }
        return lista;
    }

    public void amosar() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("nota" + i + ": " + notas[i]);
        }
    }

    public void amosar(int notas[]) {
        for (int i = 0; i < Ex9_Arrays.nelementos; i++) {
            System.out.println("nota" + i + ": " + notas[i]);
        }

    }

    public void amosarForEach() {
        System.out.println("****amosa con for each****");
        for (int elemento : notas) {
            System.out.println(elemento);
        }
    }

    public void buscarElemento() {
        int buscado = darValor();
        int atopado = 0;//bandera 

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == buscado) {
                System.out.println("posicion" + i + ": " + notas[i]);
                atopado = 1;
                i = notas.length;//break;
            }
        }
        if (atopado == 0) {
            System.out.println("El elemento no se encuentra en la lista");
        }
    }

    public void buscarElementoRepetido() {
        int j = 0;
        int buscado = darValor();

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] == buscado) {
                repetidos[j] = i + 1;
                j++;

            }
        }
        System.out.println("El numero " + buscado + " está en las posiciones");

        if (j == 0) {
            System.out.println("El elemento no se encuentra en la lista");
        } else if (j == 1) {
            System.out.println("El elemento solo está una vez");
        } else {
            for (int i = 0; i < j; i++) {
                System.out.println(" Se encuentra en la posicion " + repetidos[i]);
            }
        }
    }

    public void odenarMenorMayordirecto() {
        int aux;
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = i + 1; j > notas.length; j++) {
                if (notas[i] > notas[j]) {
                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                }
            }
        }
    }

    public void odenarMayorMenordirecto() {
        int aux;
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = i + 1; j > notas.length; j++) {
                if (notas[i] < notas[j]) {
                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;

                }
            }
        }
    }

    public void ordenarSort() {
        Arrays.sort(notas);

    }

    public void eliminarElemento() {

    }

}
