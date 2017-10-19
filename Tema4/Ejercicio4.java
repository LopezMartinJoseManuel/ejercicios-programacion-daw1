/**Ejercicio 4 Tema 4
 * 
 * 
 *
 * @author Jose Manuel Lopez Martin
 */
 
public class Ejercicio4 {
	public static void main (String [] args) {
		
	System.out.println("Programa que calcula el salario semanal segun horas trabajadas");
    System.out.println("Tenga en cuenta que el valor será de 12€/h y mas de 40h 16€/h");
    System.out.print("Por favor, introduzca horas trabajadas: ");
    int horas = Integer.parseInt(System.console().readLine());
	
	if (horas <= 40){
	System.out.println("El sueldo es " + (horas * 12) + "€");	
	}
	else{
	// las primeras horas se multiplican por 12 y restas las primeras 40h
	// introducidas por teclado y el resto de esto se multiplican por 16€
	int sueldo = (12 * 40) + ((horas - 40) *16);
	System.out.println("El sueldo es " + sueldo + "€");
	
	}
	

}
}

