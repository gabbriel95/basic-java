
public class ReemplazarSubcadenas {
	public static void main(String[] args) {
		// Reemplazar subcadenas
		var cadena = "Hola Mundo";
		System.out.println(cadena);
		
		// Reemplazar "mundo" por "a todos"
		
		var nuevaCadena = cadena.replace("Mundo","a todos");
		System.out.println(nuevaCadena);
		
		nuevaCadena = cadena.replace("Hola", "Saludos");
		System.out.println(nuevaCadena);

	}
}
