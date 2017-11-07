/**
 * Realiza una programa que calcule las horas transcurridas entre dos horas de
 * dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
 * El día de la semana se puede pedir como un número (del 1 al 7) o como una
 * cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
 * los datos correctamente y que el segundo día es posterior al primero.
 * Ejemplo:
 * Por favor, introduzca la primera hora.
 * Día: lunes
 * Hora: 18
 * Por favor, introduzca la segunda hora.
 * Día: martes
 * Hora: 20
 * Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
 *
 * @author Jose Manuel Lopez Martin
 */
import java.util.Scanner;

public class Ejercicio30 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    String dia1 = "";
    String dia2 = "";
    int diaPri = 0;
    int diaSeg = 0;
    int hora1 = 0;
    int hora2 = 0;
    String nomDia1 = "";
    String nomDia2 = "";
    boolean datosCorrectos = true;
    
    System.out.println("Programa que calcula las horas entre dos dias de la semana");
    
    do { 
    //preguntamos primera dia y primera hora
    System.out.print("Por favor, introduzca el primer día: ");
    dia1 = System.console().readLine().toLowerCase();
    System.out.print("Por favor, introduzca la primera hora: ");
    hora1 = Integer.parseInt(System.console().readLine());
  
      switch (dia1) {
        case "lunes":
        case "1":
          diaPri= 1;
          nomDia1 = "Lunes";
          break;
        case "martes":
        case "2":
          diaPri= 2;
          nomDia1 = "Martes";
          break;
        case "miercoles":
        case "miércoles":
        case "3":
          diaPri= 3;
          nomDia1 = "Miércoles";
          break;
        case "jueves":
        case "4":
          diaPri= 4;
          nomDia1 = "Jueves";
          break;
        case "viernes":
        case "5":
          diaPri= 5;
          nomDia1 = "Viermes";
          break;
        case "sabado":
        case "sábado": 
        case "6":
          diaPri= 6;
          nomDia1 = "Sabado";
          break;
        case "domingo":
        case "7":
          diaPri= 7;
          nomDia1 = "Domingo";
          break;
        default:
          diaPri = 0;
      }
    //preguntamos segundo dia y segunda hora
    System.out.print("Por favor, introduzca el segundo día: ");
    dia2 = System.console().readLine().toLowerCase();
    System.out.print("Por favor, introduzca la segunda hora: ");
    hora2 = Integer.parseInt(System.console().readLine());
    
      switch (dia2) {
          case "lunes":
          case "1":
            diaSeg = 1;
            nomDia2 = "Lunes";
            break;
          case "martes":
          case "2":
            diaSeg = 2;
            nomDia2 = "Martes";
            break;
          case "miercoles":
          case "miércoles":
          case "3":
            diaSeg = 3;
            nomDia2 = "Miércoles";
            break;
          case "jueves":
          case "4":
            diaSeg = 4;
            nomDia2 = "Jueves";
            break;
          case "viernes":
          case "5":
            diaSeg = 5;
            nomDia2 = "Viernes";
            break;
          case "sabado":
          case "sábado": 
          case "6":
            diaSeg = 6;
            nomDia2 = "Sábado";
            break;
          case "domingo":
          case "7":
            diaSeg = 7;
            nomDia2 = "Domingo";
            break;
          default:
            diaSeg = 0;
        }
      //si hasta aqui los datos son correctos ponemos datos = a verdaderos
      datosCorrectos = true;
      // miramos si los datos se han introducimos como pedía el ejercicio
      if (diaPri == 0 || diaSeg == 0){
        System.out.println("Error datos: Día incorrecto introduzca dia formato (1-7) o (lunes-domingo)");
        datosCorrectos = false;
        }
      if (diaSeg <= diaPri){
        System.out.println("Error datos: El segundo día a de ser posterior al primero");
        datosCorrectos = false;
        }
      if ((hora1 < 0) || (hora1 > 23) || (hora2 < 0) || (hora2 > 23)){
        System.out.println("Error datos: hora incorrecta formato (0-23)");
        datosCorrectos = false;
        }
    }
    //terminamos de recoger y comprobar los datos y procedemos a las operaciones
    while(!datosCorrectos);
      int calculo = ((diaSeg * 24) + hora2) - ((diaPri * 24) + hora1);
      System.out.println("Entre las " + hora1 + ".00h del " + nomDia1 + " y las " + hora2 + ".00h del " + nomDia2+ " hay " + calculo + " horas");
      
  
  

}
}

