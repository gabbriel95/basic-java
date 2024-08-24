
public class MetodosDeCadenas {
	public static void main(String[] args) {
		
		// Metodos de cadenas
		
		var cadena1 = "Hola Mundo";
		
		// Largo de la cadena
		var longitud = cadena1.length();
		System.out.println(longitud);
		
		// Reemplazar caracteres
		var nuevaCadena = cadena1.replace('o', 'a');
		System.out.println(nuevaCadena);
		
		// Convertir a mayusculas
		var mayusculas = cadena1.toUpperCase();
		System.out.println(mayusculas);
		
		// Convertir a minusculas
		System.out.println(cadena1.toLowerCase());
		
		// Eliminar espacios al inicio y final de las cadenas
		var cadena2 = " Leo Reyes ";
		System.out.println(cadena2);
		System.out.println(cadena2.trim());


	}
}
