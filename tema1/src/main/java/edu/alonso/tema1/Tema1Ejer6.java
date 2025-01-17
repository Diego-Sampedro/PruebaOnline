package edu.alonso.tema1;

import java.util.Scanner;

public class Tema1Ejer6 {
	public static void main(String[] args) {
		//Realiza un programa que nos pida cuantos segundos duró un concierto, y nos calcule cuántas horas, minutos y segundos son.
		
		System.out.println("Comprueba el tiempo que dura un concierto en horas, minutos y segundos");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduze los segundos que duro un cocierto: ");
		final int segundosEnUnaHora = 3600;
		final int segundosEnUnMinuto= 60;
		int segundosQueDura = sc.nextInt();
		sc.close();
		int horas = segundosQueDura/segundosEnUnaHora;
		int minutos = segundosQueDura%segundosEnUnaHora/segundosEnUnMinuto;
		int segundos = segundosQueDura%segundosEnUnaHora%segundosEnUnMinuto;
		System.out.println("Resultado: " + "Horas:" + horas + " Minutos:" + minutos + " Segundos:" + segundos);
		
	}
}
