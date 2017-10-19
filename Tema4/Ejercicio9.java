/**Ejercicio 9 Tema 4
 * 
 * 
 *
 * @author Jose Manuel Lopez Martin
 */
 
public class Ejercicio9 {
	public static void main (String [] args) {
		
	System.out.println("Programa que calcula la ecuacion ax2+bx+c=0");
    System.out.print("Por favor, introduzca valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
	System.out.print("Por favor, introduzca valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca valor de c: ");
    double c = Double.parseDouble(System.console().readLine());
    
    
	/** Si a,b y c son ceros entonces nuestra equacion tiene infinitas
	    soluciones
	 *  0*x^2+0*x+0=0
	 */
		
		if ((a == 0) && (b == 0) && (c == 0)) {
			System.out.println("La ecuacion es un identidad");
		}
		
	/** Si a y b son 0 pero c es distinto de 0
	 *  0*x^2+0*x+c=0
	 */	
		if ((a == 0) && (b == 0) && (c != 0)) {
			System.out.println("No tiene resultado.");
		}
			
	/** Si a y b son 0 pero c es igual a 0
	 *  a*x^2+b*x+c=0  //  -b / a
	 */
		
		if ((a != 0) && (b != 0) && (c == 0)) {
			System.out.println("x1 = 0");
			System.out.println("x2 = " + (-b / a));
		}

	/** Si a es 0 pero b y c es distinto de 0
	 *  a*0^2+b*x+c=0  //  -c / b
	 */
		
		if ((a == 0) && (b != 0) && (c != 0)) {
			System.out.println("x1 = x2 = " + (-c / b));
		}

	/** Si a b y c son distintos de 0
	 *  a*x^2+b*x+c=0  //  x= (-b+-Math.sqrt(b*b-(4*a*c)))/2*a
	 */
		
		if ((a != 0) && (b != 0) && (c != 0)) {	
				
			double ecuacion = b*b - (4 * a * c);
			
			if (ecuacion < 0) {
					System.out.println("La ecuación no tiene soluciones reales");
			}	else {
				System.out.println("x1 = " + (-b + Math.sqrt(ecuacion))/(2 * a));
				System.out.println("x2 = " + (-b - Math.sqrt(ecuacion))/(2 * a));
				}

}
}
}
