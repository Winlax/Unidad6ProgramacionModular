package src;

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Ejercicio4 d = new Ejercicio4();
    }
    int[] numeros = new int[10];
    int mayor = 0;
    Scanner teclado = new Scanner(System.in);

    public Ejercicio4() {
        for (int i = 0; i < 10; i++) {
            numeroAleatorio(i);
        }
        numeroMayor(9);
        masCercano(numeros, mayor);
    }

    public void numeroAleatorio(int numero) {
        int max = 50;
        int min = 1;

        numeros[numero] = (int)Math.floor(Math.random()*(max-min+1)+min);   
    }

    public void numeroMayor(int numero) {
        for(int i = 0; i < numero; i++){
            if(numeros[numero] > mayor) {
                mayor = numeros[numero];
            }
        }
    }

    public static int masCercano(int[] num, int nume) {
        int cercano = 0;
        int diferencia = Integer.MAX_VALUE; //inicializado valor máximo de variable de tipo int
        for (int i = 0; i < num.length; i++) {
            if (num[i] == nume) {
                return num[i];
            } else {
                if(Math.abs(num[i]-nume)<diferencia){
                    cercano=num[i];
                    diferencia = Math.abs(num[i]-nume);
                }
            }
        }
        return cercano;
    }

}