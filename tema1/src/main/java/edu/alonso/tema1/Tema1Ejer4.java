package edu.alonso.tema1;

import java.util.Scanner;

public class Tema1Ejer4 {
	public static void main(String[] args) {
		//Crea un programa que compruebe si un año es bisiesto.
		
		System.out.println("Comprueba si es año bisiesto");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un año: ");
		double multiplo1 = 4;
		double resto = 0;
		double año = sc.nextInt();
		sc.close();

		System.out.println("Resultado: " + (año%multiplo1==resto && año%100!=0?"Si es año bisiesto":"No es año bisiesto"));
		
	}
}
