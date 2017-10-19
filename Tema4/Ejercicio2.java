/**
 * Ejercicio 2 Tema 4
 *
 * @author Jose Manuel Lopez Martin
 */

public class Ejercicio2 {
  public static void main(String[] args) {
    System.out.println("Programa educado");
    System.out.print("Introduce una hora en numero entero: ");
    int hora = Integer.parseInt(System.console().readLine());

    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("Buenos dias! :D");     
    }   
  
    if ((hora >=13) && (hora <= 20)) {
      System.out.println("Buenas tardes! :D");
	}
    if (((hora >=21) && (hora <= 23)) || ((hora ==0) && (hora <= 5))){
      System.out.println("Buenas noches! :D"); 
    }
    //se expresan las doce con 00
     if ((hora >23) || (hora < 0)) {
      System.out.println("Esa hora no existe :D");
	}
  }
}
