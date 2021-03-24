package com.senati.eti;

import java.util.Scanner;

public class caso3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número 1: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese número 2: ");
		int n2 = sc.nextInt();
		
		System.out.print("Ingrese número 3: ");
		int n3 = sc.nextInt();
		
		String mensaje = "";
		
		if (n1 == n2 && n1 == n3)
			mensaje = "Los tres números son iguales";
		else if (n1 > n2 && n1 > n3)
			mensaje = "El primer número " + n1 + " es mayor";
		else if (n2 > n1 && n2 > n3)
			mensaje = "El segundo número " + n2 + " es mayor";
		else
			mensaje = "El tercer número " + n3 + " es mayor";
		
		System.out.println("======== R E S U L T A D O ========");
		System.out.println("Mensaje: " + mensaje);
		
	}

}
