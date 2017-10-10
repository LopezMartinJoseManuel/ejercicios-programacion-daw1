/**
 * Ejercicio 5 tema2
 *
 * @author Jose Manuel Lopez Martin
 */

public class Ejercicio5 {
  public static void main(String[] args) {
	
	int pesetas1; /** int pesetas = 8300; acostumbrate */
	double pesetas2;  
	
	pesetas1 = 8300;
	pesetas2 = 166.83;
	
	double conversoreuro = (int) pesetas1 / (int) pesetas2;
	
	System.out.println(pesetas1 + " pts cambiados a euros son " + conversoreuro + " euros");

/** int pesetas = 1000;
 * 	double euros = (pesetas / 166.386);
 * 
 * System.out.println(pesetas + " pts son " + euros + "euros");
 * otra forma
 * System.out.printf("%d pesetas son %.2f", pesetas, euros);
 * System.out.printf("%d %s %.2f", pesetas, "pesetas son", euros);
 * otra forma
 * System.out.printf(pesetas);
 * System.out.printf(" pesetas son ");
 * System.out.printf("%.2f\n", euros);
 * */
}
}
