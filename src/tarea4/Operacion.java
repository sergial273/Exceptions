package tarea4;

public class Operacion {
	private double num1;
	private double num2;
	private String op;
	
	public Operacion(String op, double n, double n2) {
		this.num1 = n;
		this.num2 = n2;
		this.op = op;
		
	}

	public double getNum1() {
		return num1;
	}

	public double getNum2() {
		return num2;
	}

	public String getOp() {
		return op;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public void setOp(String op) {
		this.op = op;
	}
	
	public void calcularResultado() {
		try {
		if (op.equals("+")) {System.out.println("El resultado es: " + (num1+num2));}
		if (op.equals("-")) {System.out.println("El resultado es: " + (num1-num2));}
		if (op.equals("*")) {System.out.println("El resultado es: " + (num1*num2));}
		if (op.equals("^")) {System.out.println("El resultado es: " + Math.pow(num1, num2));}
		if (op.equals("/**")) {System.out.println("El resultado es: " + Math.sqrt(num1));}
		if (op.equals("/***")) {System.out.println("El resultado es: " + Math.cbrt(num1));}
		if (op.equals("/")) {System.out.println("El resultado es: " + (num1/num2));}
		}
		catch(Exception e){
			System.out.println("MATH ERROR");
		}
	}
}
