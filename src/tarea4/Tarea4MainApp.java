package tarea4;

import java.util.Scanner;

public class Tarea4MainApp {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String operacion = pedirOperacion(sc);
		
		double num1 = perdirNum(sc);
		double num2 = -1;
		
		if (!operacion.equals("/**") && !operacion.equals("/**")) {
			num2 = perdirNum(sc);
		}
		
		
		Operacion op = new Operacion(operacion, num1, num2);
		op.calcularResultado();
		
		
		sc.close();
	}
	
	public static String pedirOperacion(Scanner sc) {

		boolean seguir = true;
		
		String n = "";
		while (seguir) {
			System.out.println("Que operacion quieres realizar:");
			System.out.println("sumar(+), restar(-), multiplicacion(*), potencia(^), raiz cuadrada(/**), raiz cubica(/***), division(/)");
			try {
				n = sc.next();
				if (n.equals("+") || n.equals("-") || n.equals("*") || n.equals("^") || n.equals("/**") ||n.equals("/***") || n.equals("/")) {seguir = false;;}
				else {throw new Exception();}
				
			}
			catch(Exception a) {
				System.out.println("Error! Operacion invalida");
			}
			
		}
			
		return n;
	}
	
	public static double perdirNum(Scanner sc) {
		boolean seguir = true;
		
		double n = 0;
		while (seguir) {
			System.out.println("Cual es el operando:");
			try {
				n = sc.nextDouble();
				seguir = false;
			}
			catch(Exception a) {
				System.out.println("Error! Número invalido");
			}
			
		}
		return n;
	}
}