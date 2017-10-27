/**
 * Ejercicio 22
 *
 * @author Jose Manuel Lopez
 */
public class Ejercicio22 {
  public static void main(String[] args) {

    System.out.println("Programa que calcula cuantos minutos faltan para el fin de semana");
    System.out.print("Introduce un día: ");
    String dia = (System.console().readLine()).toLowerCase();
  
    System.out.print("Introduce una hora: ");
    int hora = Integer.parseInt(System.console().readLine());
  
    System.out.print("Introduce minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());


    if ((hora < 0) || (hora >23) || (minutos < 0) || (minutos > 59)){  
    System.out.print("Hora o minutos incorrectos rango 0-23h y 0-59m");
    }
    else {
      int diaIn = 0;

      switch (dia){
        case "lunes":
          diaIn = 0;
          break;
        case "martes":
          diaIn = 1;
          break;
        case "miércoles":
        case "miercoles":
          diaIn = 2;
          break;
        case "jueves":
          diaIn = 3;
          break;
        case "viernes":
          diaIn = 4;
          break;
        default:
          System.out.print("Día incorrecto.");
      }
    // con esto calculamos los minutos totales semanales hasta v 15:00
    int minutosTotalesSem = (4 * 60 * 24) + (15 * 60);
    int minutosActuales = (diaIn * 24 * 60) + (hora * 60) + minutos;
    int minutosFinde = minutosTotalesSem - minutosActuales;

    System.out.println("Dia introducido: " + dia);
    System.out.println("Hora introducida " + hora);
    System.out.println("Minutos introducidos: " + minutos);
    System.out.println("Minutos que faltan hasta el fin de semana: " + minutosFinde);
    }
  }
}
