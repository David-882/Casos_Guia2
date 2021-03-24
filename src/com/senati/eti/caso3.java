package com.senati.eti;

import java.util.Scanner;

public class caso3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número 1: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese número 2: ");
		int n2 = sc.nextInt();
		
		String mensaje = "";
		
		if (n1 == n2)
			mensaje = "Los números son iguales";
		else if (n1 > n2)
			mensaje = "El primer número " + n1 + " es mayor";
		else
			mensaje = "El segundo número " + n2 + " es mayor";
		
		System.out.println("======== R E S U L T A D O========");
		System.out.println("Mensaje: " + mensaje);
	}

}
