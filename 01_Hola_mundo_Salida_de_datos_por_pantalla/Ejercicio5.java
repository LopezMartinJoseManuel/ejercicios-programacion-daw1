/** En este ejercicio tendremos que dar color a cada asignatura 
 * para ello primero asignamos con String mas una palabra el color
 * para cada caso de la siguiente forma 
 * Los colores ocupan caracteres invisibles 1 o 2
 * */
 
 public class Ejercicio5 {
  public static void main(String[] args) {
	  
	String rojo = "\033[31m";
	String verde = "\033[32m";
	String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String celeste = "\033[36m";
    String blanco = "\033[37m";
    
System.out.println("|Lunes|\t|Martes|\t|Miercoles|\t|Jueves|\t|Viernes|");
System.out.println("=========================================");
System.out.println(rojo + "|SINF|" + verde + "\t|PRO|" + rojo + "        \t|SINF|" + verde + "\t|PRO|\t|PRO|");
System.out.println(rojo + "|SINF|"+ verde + "\t|PRO|" + rojo + "        \t|SINF|" + verde + "\t|PRO|\t|PRO|");
System.out.println(rojo + "|SINF|" + verde + "\t|PRO|" + rojo + "        \t|SINF|" + verde + "\t|PRO|" + celeste + "\t|ED|");
System.out.println(naranja + "|FOL|" + morado + "\t|BBDD|" + celeste + "       \t|ED|" + morado + "\t|BBDD|" + blanco + "\t|LM|");
System.out.println(naranja + "|FOL|" + morado + "\t|BBDD|" + celeste + "       \t|ED|" + morado + "\t|BBDD|" + blanco + "\t|LM|");
System.out.println(naranja + "|FOL|" + morado + "\t|BBDD|" + blanco + "        \t|LM|" + morado + "\t|BBDD|" + blanco + "\t|LM|");
}
}
