package tarea5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea5MainApp {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		boolean seguir = true;
		
		int n = 0;
		while (seguir) {
			System.out.println("Cuantas contraseñas quieres generar:");
			try {
				n = sc.nextInt();
				if (n<=0) {throw new Exception();}
				seguir = false;
			}
			catch(InputMismatchException a) {
				System.out.println("Error! Eso no es un número.");
				sc.next();
			}
			catch(Exception a) {
				System.out.println("Error! Número invalido");
			}
			
		}
		boolean v[] = new boolean[n];
		Password c[] = rellenar(n, v);
		 
		sc.close();
	}
	
	public static Password[] rellenar(int n, boolean[] v) {
		Scanner cs = new Scanner(System.in);
		Password a[] = new Password[n];
		
		for (int i=0;i<a.length;i++) {
			boolean seguir = true;
			int con = 0;
			while (seguir) {
				System.out.println("De que tamaño quieres las contraseñas:");
				try {
					con = cs.nextInt();
					if (con<=0) {throw new Exception();}
					seguir = false;
				}
				catch(InputMismatchException b) {
					System.out.println("Error! Eso no es un número.");
					cs.nextLine();
				}
				catch(Exception b) {
					System.out.println("Error! Número invalido");
					
				}
				
			}
			a[i] = new Password(con);
			if (a[i].esFuerte()) {
				v[i] = true;
			}
			else{
				v[i] = false;
			}
		}
		cs.close();
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i].getContraseña() + " " + v[i]);
		}
		return a;
	}
	
	
	
}
