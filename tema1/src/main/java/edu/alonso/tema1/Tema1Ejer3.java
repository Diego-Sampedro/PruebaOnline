package edu.alonso.tema1;

import java.util.Scanner;

public class Tema1Ejer3 {
	public static void main(String[] args) {
		//Desarrolla un programa que compruebe si un número introducido por teclado es múltiplo de 7.
		
		System.out.println("Comprueba si un numero es multiplo de 7");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un numero: ");
		final int MULTIPLO = 7;
		final int RESTO = 0;
		double numero = sc.nextInt();
		sc.close();
		System.out.println("Resultado: " + (numero%MULTIPLO==RESTO?"Si es multiplo":"No es multiplo"));
		
	}
}
