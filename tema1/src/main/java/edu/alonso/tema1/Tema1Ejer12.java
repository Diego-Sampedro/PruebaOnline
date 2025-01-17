package edu.alonso.tema1;

import java.util.Scanner;

public class Tema1Ejer12 {
	public static void main(String[] args) {
		//Escribe un programa que recoja por teclado tu nombre y luego lo muestre por pantalla. 

		
		System.out.println("Escribe y muestra tu nombre");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe tu nombre completo: ");
		String nombre = sc.next();
		String apellido1 = sc.next();
		String apellido2 = sc.next();

		sc.close();
		
		System.out.print("Tu nombre es: " + nombre + " " + apellido1 + " " + apellido2);
		
	}

}
