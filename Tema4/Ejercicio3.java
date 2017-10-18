/**
 * Ejercicio 3 Tema 4
 *
 * @author Jose Manuel López Martín
 */

public class Ejercicio3 {
  public static void main(String[] args) {
  
    System.out.println(" Programa enlazador de numero/dia");
    System.out.println(" --------------------------------");
    System.out.print("\n Introduzca un numero del 1 al 7: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    switch (hora) {
      case 1:
        System.out.print("Ese dia es Lunes! :D");
        break;
      case 2:
        System.out.print("Ese dia es Martes! :D");
        break;
      case 3:
        System.out.print("Ese dia es Miercoles! :D");
        break;
      case 4:
        System.out.print("Ese dia es Jueves! :D");
        break;
      case 5:
        System.out.print("Ese dia es Viernes! :D");
        break;
      case 6:
        System.out.print("Ese dia es Sabado! :D");
        break;
      case 7:
        System.out.print("Ese dia es Domingo! :D");
        break;    
      default:
        System.out.print("Numero introducido no valido");
    }
}
}
