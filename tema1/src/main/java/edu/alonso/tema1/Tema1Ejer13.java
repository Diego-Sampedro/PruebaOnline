package edu.alonso.tema1;

import java.util.Scanner;

public class Tema1Ejer13 {
	public static void main(String[] args) {
		//Escribe un programa que recoja por teclado tu nombre, numero de telefono y direccion y luego lo muestre por pantalla. 

		
		System.out.println("Escribe y muestra tu nombre, telefono y direccion");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe tu nombre completo: ");
		String nombre = sc.nextLine();


		System.out.print("Escribe tu telefono: ");
		String telefono = sc.nextLine();
		
		System.out.print("Escribe tu direccion: ");
		String direccion = sc.nextLine();
		
		sc.close();
		
		System.out.println("Tu nombre es: " + nombre);
		System.out.println("Tu telefono es: " + telefono);
		System.out.println("Tu direccion es: " + direccion);
	}
}
