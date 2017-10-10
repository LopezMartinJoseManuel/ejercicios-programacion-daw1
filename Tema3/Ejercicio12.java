/**Ejercicio 12 Tema 3
* Realiza un programa que calcule la nota que hace falta sacar en el segundo
* examen de la asignatura Programación para obtener la media deseada. Hay
* que tener en cuenta que la nota del primer examen cuenta el 40% y la del
* segundo examen un 60%.
* Ejemplo 1:
* Introduce la nota del primer examen: 7
* ¿Qué nota quieres sacar en el trimestre? 8.5
* Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
* Ejemplo 2:
* Introduce la nota del primer examen: 8
* ¿Qué nota quieres sacar en el trimestre? 7
* Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen.	
*
* @author Jose Manuel Lopez Martin
*/
 
public class Ejercicio12 {
	public static void main (String [] args) {
	
	System.out.println("Programa que calcula la nota necesaria del 2º examen para la media deseada");	
	System.out.print("Nota de tu primer examen: ");
    double nota1Er = Double.parseDouble(System.console().readLine());
    System.out.print("Nota media deseada: ");
    double notaDes = Double.parseDouble(System.console().readLine());
	
	double notaCalc = ((notaDes * 100) - (nota1Er * 40)) / 60;
	
	System.out.println("");
	System.out.println("----------------------------------------");
	System.out.println("Nota primer examen: " + nota1Er);
	System.out.println("Nota media deseada: " + notaDes);
	System.out.printf("Nota necesaria en el segundo examen: %.1f", notaCalc);
}
}
