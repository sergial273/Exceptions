package tarea2;
import excepciones.ExcepcionEjercicio2;

public class Tarea2MainApp {
	public static void main(String args[]) {
		try {
			System.out.println("Mensaje mostrado por pantalla");
			throw new ExcepcionEjercicio2(111);
		}
		catch(ExcepcionEjercicio2 m){
			System.out.println("Excepcion capturada con mensaje: "+m.getMessage());
		}
		finally {
			System.out.println("Programa terminado");
		}
	}
}
