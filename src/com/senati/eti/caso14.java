package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Alumno(a): ");
		String alumno = sc.nextLine();
		
		System.out.print("Carrera[DS,RC,DG]: ");
		String carrera = sc.nextLine();
		
		System.out.print("Turno[M,T,N]: ");
		String turno = sc.nextLine();
		
		float monto = 0;
		float des = 0;
		
		switch (carrera) {
		
		case "DS":
			monto = 1500;
			carrera = "Desarrollo de Software";
			break;
		case "RC":
			monto = 1400;
			carrera = "Redes Sociales";
			break;
		case "DG":
			monto = 1500;
			carrera = "Diseño Grafico";
			break;
		default:
			carrera = "No coincide";
		}
		switch (turno) {
		
		case "M":
			des = monto * 0.1f;
			turno = "Mañana";
			break;
		case "T":
			des = monto * 0.1f;
			turno = "Tarde";
			break;
		case "N":
			des = monto * 0.1f;
			turno = "Noche";
			break;
		default:
			turno = "Desconocido";
		}
		
		float total_a_pagar = monto - des;
		float total_dolares =  total_a_pagar / 3.33f;
		
		System.out.println("=====================================");
		System.out.println("========= R S U L T A D O S =========");
		System.out.println("=====================================");
		System.out.println("Alumno(a).....................: " + alumno.toUpperCase());
		System.out.println("Monto.........................: " + df.format(monto));
		System.out.println("Carrrera......................: " + carrera);
		System.out.println("Nombre del turno..............: " + turno);
		System.out.println("Descuento.....................: " + df.format(des));
		System.out.println("Total a pagar.................: " + df.format(total_a_pagar));
		System.out.println("Total a pagar en dolares......: " + df.format(total_dolares));

	}

}
