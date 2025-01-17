package edu.alonso.tema1;

import java.util.Scanner;

public class Init {
	public static void main(String[] args) {
		/*
		System.out.println("New Vegas fue el mejor Fallout");
		
		int edadAlumno; 
		edadAlumno = 17;
		
		System.out.println("Edad del alumno: " + (edadAlumno / edadAlumno) + " Años");
		
		String apellidos; 
		apellidos = "Gonzalez";
		
		System.out.println("Sara " + apellidos);
		
		final float PI; 
		PI = 3.1415f;
		
		System.out.println("El valor de PI es: " + PI);
		
		boolean meGustaELQueso; 
		meGustaELQueso = true;
		
		System.out.println("Me gusta el queso? " + meGustaELQueso);
		
		System.out.print("asfasfvasfva \tafasfafea \\navsbvsb");
		//HOLA
		System.out.print("asfasfvasfva \tafasfafea \navsbvsb");
		System.out.print("asfasfvasfva \tafasfafea \navsbvsb");
		System.out.print("asfasfvasfva \tafasfafea \navsbvsb");
		System.out.print("asfasfvasfva \tafasfafea \navsbvsb");
		*/
		
		/*int num1 = 3;
		int num2 = 2;
		double resultado = num1 / num2;
		
		System.out.println(num1 + " * " + num2 + " = " + resultado);
		
		int num3 = 3;
		int num4 = 2;
		double resultado2 = (double) num3 / num4;
		
		System.out.println(num3 + " * " + num4 + " = " + resultado2);
		
		int num5 = 3;
		int num6= 2;
		double resultado3 = (double) num5 + num6;
		
		System.out.println("El resultado es "+ resultado3++);
		System.out.println("El resultado es "+ resultado3);
		System.out.println("El resultado es "+ ++resultado3);
		
		int num0 = 3;
		int resultado4 = num1 + 5;
		
		System.out.println(resultado4);
		System.out.println(resultado4 + 5);
		System.out.println(num0-=3);*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Multiplcacion automaticas");
		
		System.out.print("Introduzca primer numero: ");
		double a = sc.nextInt();
		
		System.out.print("Introduzca Segundo numero: ");
		double b = sc.nextInt();
		
		sc.close();
		double c = a*b;
		System.out.print("Resultado de " + a + " * " + b + " = " + c);
	}
	
	

}
