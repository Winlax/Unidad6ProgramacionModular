package src;

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Ejercicio2 b = new Ejercicio2();
    }

    int[] numeros = new int[10];
    int mayor = 0;
    int contador = 0;
    Scanner teclado = new Scanner(System.in);

    public Ejercicio2() {

        for (int i = 0; i < 10; i++) {
            valorAleatorio(i);
            mostrar(i);
            numeroMayor(i);
        }

        repetirMayor(10);
        System.out.println("El numero mayor es: "+mayor+" y se repite "+contador+" veces");

    }

    public void valorAleatorio(int numero) {
        int min = 0;
        int mayor = 0;
        int max = 99;

        numeros[numero] = (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    public void mostrar(int numero) {
        System.out.println(numeros[numero]);
    }

    public void numeroMayor(int numero) {

        for (int i = 0; i < numero; i++) {

            if (numeros[numero] > mayor) {
                mayor = numeros[numero];
            }

        }

    }

    public void repetirMayor(int numero) {

        for (int i = 0; i< numero; i++){

            if (mayor == numeros[i]){
                contador += 1;
            }

        }

    }

}