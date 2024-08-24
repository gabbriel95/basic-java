
public class GneeradorEmail {
	public static void main(String[] args) {
		var nombreCompleto = " Juan Gabriel Mendez ";
		var nombreEmpresa = "Global Mentoring";
		var dominio = "com.ar";
		
		System.out.println(nombreCompleto
				.strip()
				.replace(" ", ".")
				.toLowerCase()
				.concat("@")
				.concat(nombreEmpresa.toLowerCase()).replace(" ", "")
				.concat(".")
				.concat(dominio));
		
	}
}
