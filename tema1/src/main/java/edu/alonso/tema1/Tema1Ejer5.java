package edu.alonso.tema1;

import java.util.Scanner;

public class Tema1Ejer5 {
	public static void main(String[] args) {
		//Desarrolla un programa que indique el peso que tienes en al luna.Gravedad en la tierra 9.8 y en la luna 1,62.
		
		System.out.println("Comprueba tu peso en la luna");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduze tu peso: ");
		double gravedadTierra = 9.8;
		double gravedadLuna= 1.62;
		double pesoPersona = sc.nextInt();
		sc.close();
		double masa = pesoPersona/gravedadTierra;
		double pesoLuna = masa*gravedadLuna;
		System.out.println("Resultado: " + pesoLuna);
		
	}
}
