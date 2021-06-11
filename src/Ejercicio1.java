package src;

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Ejercicio1 a = new Ejercicio1();
    }

    int[] numeros = new int[5];
    Scanner teclado = new Scanner(System.in);

    public Ejercicio1() {

        for (int i = 0; i < 5; i++){
            pedirValor(i);
        }

        for (int i = 0; i < 5; i++){
            mostrarDatos(i);
        }

    }

    public void pedirValor(int numero) {
        System.out.print("Ingrese un numero: ");
        numeros[numero] = teclado.nextInt();
    }

    public void mostrarDatos(int numero) {
        System.out.println("El indice "+numero+" pertenece al valor: "+numeros[numero]);
    }
}