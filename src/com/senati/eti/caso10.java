package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese Nombre............: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese horas.............: ");
		float horas = sc.nextFloat();
		
		System.out.print("Ingrese tarfifa por hora..: ");
		float tarifa = sc.nextFloat();
		
		System.out.print("Minutos...................: ");
		int min = sc.nextInt();
		
		float importe =  horas * tarifa;
		
		float bono = 0;
		
		if (horas > 60)
			bono = importe * 0.13f;
		else
			bono = importe * 0.04f;
		
		float desc = 0;
		if(min > 15)
			desc = importe * 0.03f;
		
		float horaspor = (horas / 70) * 100;
		
		System.out.println("=====================================");
		System.out.println("======== R E S U L T A D O S ========");
		System.out.println("=====================================");
		System.out.println("Trabajador..................: " + nombre);
		System.out.println("Horas Trabajadas............: " + horas);
		System.out.println("Tarifa por horas............: " + tarifa);
		System.out.println("Importe.....................: " + importe);
		System.out.println("Bono........................: " + df.format(bono));
		System.out.println("Descuento...................: " + desc);
		System.out.println("Meta alcanzada..............: " + df.format(horaspor) + "%");
		

	}

}
