package edu.alonso.tema1;

import java.util.Scanner;

public class Tema1Ejer11 {
	public static void main(String[] args) {
		//Conversión de tipos: convertir un entero a un char y comprobarlo con la tabla ASCII. 

		
		System.out.println("Convertir un entero en un caracter");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un numero: ");
		int numero = sc.nextInt();
		sc.close();
		char caracter = (char)numero;
		
		System.out.print("Resultado de la conversion: \nEl numero " + numero + " se transforma a " + caracter + " en ASCII");
		
	}
}
