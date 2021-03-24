package com.senati.eti;

import java.util.Scanner;

public class caso12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====================================");
		System.out.println("======== R E S U L T A D O S ========");
		System.out.println("=====================================");
		
		System.out.print("Empleado.........: ");
		String nd = sc.nextLine();
		
		System.out.print("Nivel [1-4]......: ");
		int nivel = sc.nextInt();
		
		System.out.print("Sueldo...........: ");
		float sueldo = sc.nextFloat();
		
		float incremento = 0;
		
		switch (nivel) {
			case 1:
				incremento = 0.045f;
				break;
			case 2:
				incremento = 0.06f;
				break;
			case 3:
				incremento = 0.085f;
				break;
			case 4:
				incremento = 0.11f;
				break;
			default:
				incremento = 0;
				
		}
		
		float k = sueldo * incremento;
		float nuevo_Sueldo = sueldo + k;
		
		System.out.println("Incremento............: " + (incremento * 100) + "%");
		System.out.println("Nuevo Sueldo..........: " + nuevo_Sueldo);
		
	}

}
