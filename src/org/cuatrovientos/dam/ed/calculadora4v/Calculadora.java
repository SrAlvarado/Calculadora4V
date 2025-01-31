package org.cuatrovientos.dam.ed.calculadora4v;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double operando1, operando2;
		int opcionElegida;
		double resultado = 0;

		//TODO poner más comentarios en el código
		
		// Muestro título calculadora
		System.out.println("CALCULADORA (Elegir un número de operación 1-5)");
		System.out.println("===============================================");

		operando1 = operando1(console);
		operando2 = operando2(console);
		System.out.println("1. SUMA");
		System.out.println("2. RESTA");
		System.out.println("3. MULTIPLICACIÓN");
		System.out.println("4. DIVISIÓN");
		System.out.println("5. SALIR");
		System.out.print("Operación a elegir (Introduce el número de la operación): ");
		opcionElegida = console.nextInt();

		//FIXME (bugs) resolver problema con el switch
		switch (opcionElegida) {
		case 1:
			resultado = suma(operando1, operando2);
		case 2:
			resultado = resta(operando1, operando2);
		case 3:
			resultado = multiplicacion(operando1, operando2);
		case 4:
			resultado = division(operando1, operando2);
			break;
		case 5:
			System.out.println("Saliendo...");
			return;
		default:
			System.out.println("Opción no válida");
			return;
		}

		System.out.println("El resultado es: " + resultado);
	}

	private static double operando2(Scanner console) {
		double operando2;
		System.out.println("Introduce el segundo operando: ");
		operando2 = console.nextDouble();
		return operando2;
	}

	private static double operando1(Scanner console) {
		double operando1;
		System.out.println("Introduce el primer operando: ");
		operando1 = console.nextDouble();
		return operando1;
	}

	/**
	 * Esta función devuelve el resultado de la división entre operando1 y operando2
	 * @param operando1
	 * @param operando2
	 * @return
	 */
	
	private static double division(double operando1, double operando2) {
		return operando1 / operando2;
	}

	private static double multiplicacion(double operando1, double operando2) {
		return operando1 * operando2;
	}

	private static double suma(double operando1, double operando2) {
		return operando1 + operando2;
	}

	private static double resta(double operando1, double operando2) {
		return operando1 - operando2;
	}
}
