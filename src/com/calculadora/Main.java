package com.calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner numeros = new Scanner (System.in);
	    float atributo1, atributo2, suma, resta, multiplicacion, division, modulo;
	    System.out.print ("Escribe dos númmros compare. Con confianza: ");
        atributo1 = numeros. nextFloat();
        atributo2 = numeros. nextFloat();

        suma = atributo1 + atributo2;
        resta = atributo1 - atributo2;
        multiplicacion = atributo1 * atributo2;
        division =  atributo1 / atributo2;
        modulo = atributo1 % atributo2;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("El resultado de la división es: " + division);
        System.out.println("El resultado del módulo es: " + modulo);




    }
}
