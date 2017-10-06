/** Ejercicio 6
 * tema 2 */
 
public class Ejercicio6 {
	public static void main (String [] args) {
		
	double baseImponible = 25.50;
	
	System.out.printf(" Base imponible %8.2f\n", baseImponible);
	System.out.printf("IVA             %8.2f\n", (baseImponible * 0.21));
	System.out.printf("-----------------------\n");
	System.out.printf("Total           %8.2f\n", (baseImponible * 1.21));
	
	
	
	/** otra forma de hacerlo
	 * 
	 * double precioSinIva = 1352.15;
	 * double iva = precioSinIva * 0.21
	 * double totalFactura = precioSinIva + iva;
	 * 
	 * System.out.printf("Precio sin IVA: %10.2f\n", precioSinIva);
	 * System.out.printf("IVA:            %10.2f\n", iva);
	 * System.out.printf("\033[31m________________________\n);
	 * System.out.prinln("\033[37m El iva es" + iva + " Y su total " + totalFactura);
	 * 
	 * */
}
}
