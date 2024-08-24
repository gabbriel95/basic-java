
public class DetalleProducto {
	public static void main(String[] args) {
		String nombreProducto = "Banana";
		float precioProducto = 5.50F;
		int cantidadProducto = 200;
		boolean diponibilidadVenta = true;
		
		System.out.println("Nombre producto = " + nombreProducto);
		System.out.println("Precio producto = " + precioProducto);
		System.out.println("Cantidad producto = " + cantidadProducto);
		System.out.println("Hay stock? = " + diponibilidadVenta);
		
		nombreProducto = "Manzanas";
		precioProducto = 2.34F;
		cantidadProducto = 0;
		diponibilidadVenta = false;
		
		System.out.println("----------------");

		System.out.println("Nombre producto = " + nombreProducto);
		System.out.println("Precio producto = " + precioProducto);
		System.out.println("Cantidad producto = " + cantidadProducto);
		System.out.println("Hay stock? = " + diponibilidadVenta);
		
	}
}
