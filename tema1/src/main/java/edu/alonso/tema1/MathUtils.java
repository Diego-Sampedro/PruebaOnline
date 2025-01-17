package edu.alonso.tema1;

public class MathUtils {

	public static void main(String[] args) {
		
		/*Operaciones aritmeticas*/
		
		double dato1, dato2, resultado;
		
		dato1 = 2.5;
		dato2 = 3.10;
		
		// Suma
		resultado = dato1 + dato2;
		System.out.println(dato1 + " + " + dato2 + " = " + resultado);
		// Resta
		resultado = dato1 - dato2;
		System.out.println(dato1 + " - " + dato2 + " = " + resultado);
		// Producto
		resultado = dato1 * dato2;
		System.out.println(dato1 + " * " + dato2 + " = " + resultado);
		// Cociente
		resultado = dato1 / dato2;
		System.out.println(dato1 + " / " + dato2 + " = " + resultado);
	}
}
