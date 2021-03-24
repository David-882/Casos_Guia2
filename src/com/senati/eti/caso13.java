package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese número 1: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese número 2: ");
		int n2 = sc.nextInt();
		
		System.out.print("Operación[1-6]: ");
		int op = sc.nextInt();
		
		float solucion = 0;
		
		String operacion = "";
		
		switch(op) {
		
		case 1:
			operacion = "Suma";
			solucion = n1 + n2;
			break;
		case 2:
			operacion = "Resta";
			solucion = n1 - n2;
			break;
		case 3:
			operacion = "Producto";
			solucion = n1 * n2;
			break;
		case 4:
			if(n2 == 0) {
				operacion = "No es posible dividir entre 0";
				solucion = 0;
			}
			else {
				operacion = "División";
				solucion = n1 / n2;
			}
			break;
		case 5:
			if(n2 == 0) {
				operacion = "No es posible hallar el resto entero";
				solucion = 0;
			}
			else {
				operacion = "Resto entero";
				solucion = n1 % n2;
			}
			break;
		case 6:
			operacion = "Promedio";
			solucion = (n1 + n2) / 2;
			break;
		default:
			operacion = "Desconocido";
			solucion = 0;
		}
		
		System.out.println("=====================================");
		System.out.println("======== R E S U L T A D O S ========");
		System.out.println("=====================================");
		System.out.println("Número 1: " + n1);
		System.out.println("Número 2: " + n2);
		System.out.println("Operación: " + operacion);
		System.out.println("Operación: " + solucion);
		
	}

}
