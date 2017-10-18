/**Ejercicio 6 Tema 4
 * 
 * 
 *
 * @author Jose Manuel Lopez Martin
 */
 
public class Ejercicio6 {
	public static void main (String [] args) {
		
	System.out.println("Programa que calcula la ecuacion t=√2h/g");
    System.out.print("Por favor, introduzca el valor de h: ");
    double h = Double.parseDouble(System.console().readLine());
	double g = 9.81;
	
	if ((h == 0) || (h < 0)){
	System.out.println("No tiene solucion real");	
	}
	else{
	double solucion = Math.sqrt(2 * h / g);
	System.out.printf("\n El resultado de t es : %.2f", solucion);
	}
	

}
}

