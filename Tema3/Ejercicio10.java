/**Ejercicio 10 Tema 3
* Realiza un conversor de Mb a Kb.	
*
* @author Jose Manuel Lopez Martin
*/
 
public class Ejercicio10 {
	public static void main (String [] args) {
		
	System.out.println("Programa conversor de MB a KB");
	System.out.println("-----------------------------");
	System.out.print("Introduzca cantidad en MB: ");
	int conversor = Integer.parseInt(System.console().readLine());
	
	int kilobitos = conversor * 1024;
	
	System.out.println(conversor +" MB son: " + kilobitos + " KB");
}
}
