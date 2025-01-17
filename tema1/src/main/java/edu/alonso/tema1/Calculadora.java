package edu.alonso.tema1;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
			
			/*Calculadora*/
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Calculadora");
			
			System.out.print("Introduzca primer numero: ");
			double dato1 = sc.nextInt();
			
			System.out.print("Introduzca Segundo numero: ");
			double dato2 = sc.nextInt();
			
			sc.close();
			double resultado = dato1*dato2;
			System.out.print("Resultado de " + dato1 + " * " + dato2 + " = " + resultado);
		}

}
