package edu.alonso.tema1;

import java.util.Scanner;

public class Tema1Ejer7 {
	public static void main(String[] args) {
		//Realiza un programa que calcule cuántos billetes hay que darle a un cliente que quiera sacar cierta cantidad de dinero de su banco. Siempre calcularemos la mínima cantidad de billetes.

		
		System.out.println("Calcular billetes a devolver ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el dinero que ha dado el cliente: ");
		int dineroCliente = sc.nextInt();
		sc.close();
		int billete500 = dineroCliente/500;
		int billete200 = dineroCliente%500/200;
		int billete100 = dineroCliente%500%200/100;
		int billete50 = dineroCliente%500%200%100/50;
		int billete20 = dineroCliente%500%200%100%50/20;
		int billete10 = dineroCliente%500%200%100%50%20/10;
		int billete5 = dineroCliente%500%200%100%50%20%10/5;
		System.out.println("Resultado: " + "\nBilletes de 500: " + billete500 + "\nBilletes de 200: " + billete200 + "\nBilletes de 100: " + billete100 + "\nBilletes de 50: " + billete50 + "\nBilletes de 20: " + billete20 + "\nBilletes de 10: " + billete10 + "\nBilletes de 5: " + billete5);
		
	}
}
