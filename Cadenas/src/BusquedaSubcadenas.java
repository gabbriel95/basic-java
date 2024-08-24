
public class BusquedaSubcadenas {
	public static void main(String[] args) {
		
		// Buscar subcadenas
		// indexOf - devuelve el indice de la primera apariciond de la subcadena
		
		var cadena1 = "Hola Mundo";
		// subadena a buscar 'hola'
		var indice1 = cadena1.indexOf("Hola");
		System.out.println(indice1);
		
		// lastIndexOf - devuelve el indice de la ultima aparicion de la subcadena
		
		var indice2 = cadena1.lastIndexOf("Mundo");
		System.out.println(indice2);
		
		// si no encuentra la subcadena devuelve -1

	}
}
