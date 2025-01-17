package edu.alonso.tema1;

import java.util.Scanner;

public class Tema1Ejer8 {
	public static void main(String[] args) {
		//Desarrolla un programa que solicite 3 números y compruebe si están ordenados.

		
		System.out.println("Comprueba si una serie de numeros estan ordenados");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una serie de tres numeros: ");
		double numero1 = sc.nextInt();
		double numero2 = sc.nextInt();
		double numero3 = sc.nextInt();
		sc.close();

		System.out.println("Resultado: " + (numero1<numero2? (numero2<numero3?"Si esta ordenado":"No esta ordenado"):"No esta ordenado"));
		
	}
}
