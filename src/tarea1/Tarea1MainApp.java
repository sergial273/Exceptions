package tarea1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea1MainApp {
	public static void main(String args[]) {
		int num = (int)( Math.random() * (500 - 1) + 1);
		int adv = 0;
		int intentos = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Adivina el numero que he pensado!");
		while (num != adv) {
			System.out.println("Llevas "+intentos+" intentos");
			System.out.println("Cual es tu proximo intento:");
			try {
				adv = sc.nextInt();
				if (adv>num) {
					System.out.println("El número es mas pequeño");
				}
				if (adv<num) {
					System.out.println("El número es mas grande");
				}
				System.out.println();
				intentos++;
			}
			catch(InputMismatchException a) {
				intentos++;
				System.out.println("Numero no reconocido");
				sc.next();
			}
			
		}
		System.out.println("Acertaste tras "+ intentos + " intentos. El numero era: "+ num);
		sc.close();
	}
}
