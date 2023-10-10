package tarea3;

import excepciones.ExcepcionEjercicio2;

public class Tarea3MainApp {
	public static void main(String args[]) {
		System.out.println("Generando número aleatorio...");
		int num = (int)( Math.random() * (999 - 1) + 1);
		System.out.println("El numero aleatorio generado es: "+ num);
		try {
		if (num%2 == 0) {throw new ExcepcionEjercicio2(222);}
		else {throw new ExcepcionEjercicio2(333);}
		}
		catch(ExcepcionEjercicio2 m){
			System.out.println(m.getMessage());
		}
	}
}
