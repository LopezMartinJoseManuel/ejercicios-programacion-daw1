/**Ejercicio 15 Tema 4
 * 
 * 
 *
 * @author Jose Manuel Lopez Martin
 */
 
public class Ejercicio15 {
  public static void main (String [] args) {
  System.out.println("Programa que realiza una piramide con un simbolo");
  System.out.print("Introduce el símbolo: ");
  String p = System.console().readLine();
  System.out.println("Elige el lado al que quieres que este la piramide:");
  System.out.println("1.Vértice arriba");
  System.out.println("2.Vértice abajo");
  System.out.println("3.Vértice izquierda");
  System.out.println("4.Vétice derecha");
  System.out.print("respuesta => (1-4):");
  int respuesta = Integer.parseInt(System.console().readLine());  
  
//para usar programas modo "menú" usar switch por norma general  
  switch (respuesta) {
     case 1:
       System.out.println("  " + p);
       System.out.println(" " + p + p + p);
       System.out.println("" + p + p + p + p + p);
       break;
     case 2:
       System.out.println("" + p + p + p + p + p);
       System.out.println(" " + p + p + p);
       System.out.println("  " + p);
       break;
     case 3:
       System.out.println("      " + p);
       System.out.println("    " + p + " " + p);
       System.out.println("  " + p + " " + p + " " + p);
       System.out.println(p + " " + p + " " + p + " " + p);
       System.out.println("  " + p + " " + p + " " + p + " ");
       System.out.println("    " + p + " " + p);
       System.out.println("      " + p );
       break;
     case 4:
       System.out.println(" " + p );
       System.out.println(" " + p + " " + p);
       System.out.println(" " + p + " "+ p + " " + p );
       System.out.println(" " + p + " " + p + " " + p + " " + p);
       System.out.println(" " + p + " "+ p + " " + p );
       System.out.println(" " + p + " " + p);
       System.out.println(" " + p );
       break;   
     default:
       System.out.print("Intentalo de nuevo");
    }
  }
}
