
public class TiposDatos {
	public static void main(String[] args) {
		// Tipos de Datos en Java
		
		// Enteros (valor por default es 0)
		byte tipoByte = 127;
		System.out.println("tipoByte = " + tipoByte);
		
		short tipoShort = 32000;
		System.out.println("Short = " + tipoShort);
		
		int tipoInt = 2147483647;
		System.out.println("Int = " + tipoInt);
		
		long tipoLong = 987654321098765432L; // L para indicar que es de tipo long
		System.out.println("Long = " + tipoLong);
		
		
		// Punto flotante (valor por default es 0.0)
		float tipoFloat = 3.14F; // F para indicar que es tipo float
		System.out.println("Float = " + tipoFloat);
		
		double tipoDouble = 3.1315;
		System.out.println("Double = " + tipoDouble);

		
		// Caracter (Valor por default: '\u0000')
		char tipoChar = 'A'; // Caracteres del juego unicode
		System.out.println("tipoChar = " + tipoChar);
		tipoChar = 65;
		System.out.println("tipoChar = " + tipoChar);
		tipoChar = '@';
		System.out.println("tipoChar = " + tipoChar);

		// Booleano (Valor por default: false)
		boolean tipoBoolean = true;
		System.out.println("tipoBoolean = " + tipoBoolean);
		tipoBoolean = false;
		System.out.println("tipoBoolean = " + tipoBoolean);
		
		// Tipos Object (Referencia)
		String nombre = null; // Valor por default es (null)
		System.out.println("nombre = " + nombre);
		nombre = "Juan";
		System.out.println("nombre = " + nombre);

	}
}
