/**Ejercicio 11 Tema 3
* Realiza un conversor de Kb a Mb.	
*
* @author Jose Manuel Lopez Martin
*/
 
public class Ejercicio11 {
	public static void main (String [] args) {
		
	System.out.println("Programa conversor de KB a MB");
	System.out.println("-----------------------------");
	System.out.print("Introduzca cantidad en KB: ");
	double conversor = Double.parseDouble(System.console().readLine());
	
	double kilobitos = conversor / 1024;
	
	System.out.printf("%.2f KB son %.5f MB", conversor, kilobitos);
}
}
