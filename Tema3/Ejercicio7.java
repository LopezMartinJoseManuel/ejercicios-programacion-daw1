/**Ejercicio 7 Tema 3
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 *
 * @author Jose Manuel Lopez Martin
 * 
 */
 
public class Ejercicio7 {
	public static void main (String [] args) {
		
	System.out.println("Programa que calcula el total de una factura a partir de la base imponible");
    System.out.print("Por favor, introduzca un valor: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
	
	
	
	System.out.printf(" Base imponible %8.2f\n", baseImponible);
	System.out.printf("IVA             %8.2f\n", (baseImponible * 0.21));
	System.out.printf("-----------------------\n");
	System.out.printf("Total           %8.2f\n", (baseImponible * 1.21));
	
	
}
}
