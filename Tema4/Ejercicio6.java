/**Ejercicio 6 Tema 4
 * 
 * 
 *
 * @author Jose Manuel Lopez Martin
 */
 
public class Ejercicio6 {
	public static void main (String [] args) {
	System.out.println("Calcularemos el tiempo que tarda en caer un objeto");	
	System.out.println("usaremos la ecuacion t=√2h/g");
    System.out.print("Por favor, introduzca el valor de h (altura): ");
    double h = Double.parseDouble(System.console().readLine());
	final double g = 9.81;

	if ((h == 0) || (h < 0)){
	System.out.println("La altura tiene que ser mayor que 0");	
	}
	else{
	double solucion = Math.sqrt(2 * h / g);
	System.out.printf("\n El objeto tardara en caer %.2f segundos", solucion);
	}
	

}
}

