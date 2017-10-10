/**Ejercicio 3 Tema 3
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 *
 * @author Jose Manuel Lopez Martin
 */

public class Ejercicio3 {
  public static void main(String[] args) {
	
	
	System.out.println("Esto es un programa conversor de pesetas a €");
	System.out.print("Introduzca una cantidad en pesetas: ");
	int pesetas1 = Integer.parseInt(System.console().readLine());
	double pesetas2;  
	
	pesetas1 = 8300;
	pesetas2 = 166.83;
	
	double conversoreuro = (int) pesetas1 / (int) pesetas2;
	
	System.out.println(pesetas1 + " pts cambiados a euros son " + conversoreuro + " euros");

}
}
