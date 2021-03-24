package com.senati.eti;

import java.util.Scanner;

public class caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cliente: ");
		String cliente = sc.nextLine();
		
		System.out.print("Ingrese producto [TB/LT/MN/IM]: ");
		String producto = sc.nextLine();
		
		System.out.print("Ingrese cantidad: ");
		int cantidad = sc.nextInt();
	
		sc.nextLine();
		
		System.out.print("Ingrese forma de pago [C1/C2]: ");
		String forma = sc.nextLine();
	
		float monto = 0;
		
		switch(producto) {
		case "TB":
			monto = 350;
			producto = "Tablet";
			break;
		case "LT":
			monto = 2300;
			producto = "Laptop";
			break;
		case "MN":
			monto = 850;
			producto = "Monitor";
			break;
		case "IM":
			monto = 680;
			producto = "Impresora";
			break;
			default:
				producto = "Producto desconocido";
		}
		
		float importe = monto * cantidad;
		float total_a_pagar = 0, incremento = 0, desct = 0;
		
		switch(forma) {
		case "C1":
			forma = "Contado";
			desct = importe * 0.05f;
			total_a_pagar = importe - desct;
			break;
			
		case "C2":
			forma = "Crédito";
			incremento = importe * 0.12f;
			total_a_pagar = importe + incremento;
			break;
		
		}
		
		System.out.println("Cliente..............................: " + cliente.toUpperCase());
		System.out.println("Producto.............................: " + producto);
		System.out.println("Precio...............................: " + monto);
		System.out.println("Cantidad.............................: " + cantidad);
		System.out.println("Importe..............................: " + importe);
		System.out.println("Forma de pago........................: " + forma);
		if(forma == "Contado")
			System.out.println("Descuento..............................: " + desct);
		else
			System.out.println("Incremento.............................: " + incremento);
		System.out.println("Total a pagar........................: " + total_a_pagar);
	}

}
