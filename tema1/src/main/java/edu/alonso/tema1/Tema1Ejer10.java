package edu.alonso.tema1;

import java.util.Scanner;

public class Tema1Ejer10 {
	public static void main(String[] args) {
		//Crea un programa que pida cuál es el radio de una circunferencia y nos calcule cuál es la longitud y el área. 

		
		System.out.println("Con el radio calcular la longitud y el area de una circunferencia con el radio");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el radio: ");
		double radio = sc.nextInt();
		sc.close();
		final double pi = Math.PI;
		double longitud = 2*pi*radio;
		double area = pi*(radio*radio);
		System.out.println("La longitud es: " + longitud);
		System.out.println("La area es: " + area);
		
	}
}
