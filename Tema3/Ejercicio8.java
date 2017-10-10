/**Ejercicio 8 Tema 3
* Escribe un programa que calcule el salario semanal de un empleado en base
* a las horas trabajadas, a razón de 12 euros la hora.
*
* @author Jose Manuel Lopez Martin
*/
 
public class Ejercicio8 {
	public static void main (String [] args) {
		
	System.out.println("Programa que calcula el salario semanal segun horas trabajadas");
    System.out.println("Tenga en cuenta que el valor será de 12€/h");
    System.out.print("Por favor, introduzca horas trabajadas: ");
    int horas = Integer.parseInt(System.console().readLine());
	
	int total = horas * 12;
	int dias = 7;
	
	System.out.println("Horas trabajadas: " + horas);
	System.out.println("---------------------------");
	System.out.println("Dias trabajados: " + dias);
	System.out.println("---------------------------");
	System.out.println("Salario semanal: " + total);
	
}
}
