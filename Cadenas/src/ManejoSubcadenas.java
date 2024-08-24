
public class ManejoSubcadenas {
	public static void main(String[] args) {
		
		var cadena1 = "Hola Mundo";
		System.out.println(cadena1);
		
		var subCadena1 = cadena1.substring(0,4);
		System.out.println(subCadena1);
		
		var subCadena2 = cadena1.substring(5, cadena1.length());
		System.out.println(subCadena2);

	}
}
