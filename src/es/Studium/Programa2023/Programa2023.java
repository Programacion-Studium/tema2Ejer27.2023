package es.Studium.Programa2023;

import java.util.Scanner;

public class Programa2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos el objeto que nos permite leer por teclados
				java.util.Scanner teclado = new Scanner(System.in);
				//mostramos por pantalla y recojemos un numero por teclado
				System.out.println("Introduzca su nombre");
				String nom = teclado.next();
				System.out.println("Introduzca el año de nacimiento");
				int anyo = teclado.nextInt();
				teclado.close();
				System.out.println("Hola "+nom+ ", en el año 2030 tendás " + (2030-anyo) + " años");
	}

}
