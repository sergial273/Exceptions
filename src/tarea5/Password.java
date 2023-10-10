package tarea5;


import java.util.Random;

public class Password {

	private final int LONGITUD = 8;
	private final  String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	
	private int longitud;
	private String contraseña;
	
	public Password() {
		this.longitud = LONGITUD;
		
		StringBuilder cadenaAleatoria = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indice);
            cadenaAleatoria.append(caracterAleatorio);
        }
		this.contraseña = cadenaAleatoria.toString();
	}
	
	public Password(int lon) {
		this.longitud = lon;
		
		StringBuilder cadenaAleatoria = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indice);
            cadenaAleatoria.append(caracterAleatorio);
        }
		this.contraseña = cadenaAleatoria.toString();
	}

	public int getLongitud() {
		return longitud;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public boolean esFuerte() {
		int ma = 0, min = 0, num = 0;
		 
        for(int i = 0; i < contraseña.length(); i++)
        {
            char ch = contraseña.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
            	ma++;
            else if (ch >= 'a' && ch <= 'z')
                min++;
            else if (ch >= '0' && ch <= '9')
                num++;
        }
        if(ma>2 && min>1 && num>5) {
        	return true;
        }
		
		return false;
	}
	
	public void generarPassword() {
		StringBuilder cadenaAleatoria = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indice);
            cadenaAleatoria.append(caracterAleatorio);
        }
		this.contraseña = cadenaAleatoria.toString();
	}
	
}
