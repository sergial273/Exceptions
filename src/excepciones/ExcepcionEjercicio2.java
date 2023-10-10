package excepciones;

@SuppressWarnings("serial")
public class ExcepcionEjercicio2 extends Exception {
	private int codigoException;
	
	public ExcepcionEjercicio2(int codigoError) {
		super();
		this.codigoException = codigoError;
	}
	
	public ExcepcionEjercicio2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getMessage() {
		String mensaje = "";
		
		switch(codigoException) {
		case 111:
			mensaje = "Esto es un objecto Exception";
			break;
		case 222:
			mensaje = "Es par";
			break;
		case 333:
			mensaje = "Es impar";
			break;
		}
		
		
		return mensaje;		
	}
}
