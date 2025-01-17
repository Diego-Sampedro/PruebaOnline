package edu.alonso.tema1;

import java.util.Scanner;

public class Tema1Ejer9 {
	public static void main(String[] args) {
		//Crea un programa que pida los coeficientes de una ecuación de 2ºgrado, y muestre sus soluciones reales. Si no existen, debe indicarlo. 

		
		System.out.println("Realizar una ecuacion de segundo grado: ax^2 + bx + c = 0");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca a en la equacion: ");
		double a = sc.nextInt();
		System.out.print("Introduzca b en la equacion: ");
		double b = sc.nextInt();
		System.out.print("Introduzca c en la equacion: ");
		double c = sc.nextInt();
		sc.close();

		double raiz = (b*b) - (4*a*c);
		double solucionA = (-b + Math.sqrt(raiz)) / (2*a);
		double solucionB = (-b - Math.sqrt(raiz)) / (2*a); 
		System.out.print("Resultado de la ecuacion: " + (raiz>=0? "Tiene 2 soluciones " + solucionA + " y " + solucionB : "No tiene solucion" ));
		
	}
}
