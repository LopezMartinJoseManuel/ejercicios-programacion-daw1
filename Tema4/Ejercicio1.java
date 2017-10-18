/**
 * Ejercicio 1 Tema 4
 *
 * @author Jose Manuel López Martín
 */

public class Ejercicio1 {
  public static void main(String[] args) {
  
    System.out.println(" Programa horario 1era Hora");
    System.out.println(" --------------------------");
    System.out.print("\n Introduzca un dia de la semana: ");
    String dia = (System.console().readLine()).toLowerCase();
    //dia.toLowerCase();
    
    switch (dia) {
      case "lunes":
        System.out.print("1era Hora, Sistema Informáticos");
        break;
      case "martes":
        System.out.print("1era Hora, Programación");
        break;
      case "miercoles":
        System.out.print("1era Hora, Sistemas Informáticos");
        break;
      case "jueves":
        System.out.print("1era Hora, Programación");
        break;
      case "viernes":
        System.out.print("1era Hora, Programación");
        break;
      case "sabado":
        System.out.print("Ese dia no hay clases!");
        break;
      case "domingo":
        System.out.print("Ese dia no hay clases!");
        break;    
      default:
        System.out.print("Dia incorrecto ejecute el programa de nuevo.");
    }
}
}
