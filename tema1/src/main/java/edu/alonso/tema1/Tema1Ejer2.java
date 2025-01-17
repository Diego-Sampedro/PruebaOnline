package edu.alonso.tema1;

import java.util.Scanner;

public class Tema1Ejer2 {

	public static void main(String[] args) {
		//Comprueba si eres mayor de edad
		
		System.out.println("Compruebe si es mayor de dead");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca su edad: ");
		double mayorEdad = 18;
		double edad = sc.nextInt();
		sc.close();
		
		System.out.println("Resultado: " + (edad>=mayorEdad?"Si eres mayor de edad":"No eres mayor de edad"));
		
	}
}
