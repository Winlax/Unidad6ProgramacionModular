package src;

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Ejercicio3 c = new Ejercicio3();
    }
    int[] numeros = new int[8];
    int busqueda;
    Scanner teclado = new Scanner(System.in);



    public Ejercicio3() {
        for (int i = 0; i < 8; i++) {
            valorAleatorio(i);
        }
        System.out.println("Ingrese un numero a buscar");
        busqueda = teclado.nextInt();
        for (int i = 0; i < 8; i++) {
            buscarNumero(i);
        }
        
        
    }

    public void valorAleatorio(int numero) {
        int min = 0;
        int max = 10;
        numeros[numero] = (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    public void buscarNumero(int numero) {
        for (int i = 0; i < numero; i++) {
            if (busqueda == numeros[numero]) {
                
                System.out.println(numeros[numero]+" CORRECTO");
            } else {
                
                System.out.println(numeros[numero]+" FALSO");
            }
        }

    }



}