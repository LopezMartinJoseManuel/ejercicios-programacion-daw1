/**
 * Ejercicio 22
 *
 * @author Jose Manuel Lopez
 */
public class Ejercicio23 {
  public static void main(String[] args) {

  System.out.print("Programa que calcula el precio final de producto");
  System.out.println("segun su base imponible");
  System.out.print("Introduzca la base imponible: ");
  double base = Double.parseDouble(System.console().readLine());
  System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido");
  double iva = Double.parseDouble(System.console().readLine()); 
  System.out.print("Introduzca codigo promocional(nopro, mitad, meno5 o 5porc: ");
  double codigo = Double.parseDouble(System.console().readLine());
  
  switch (iva){
    case "general":
      double ivaG = base * 0.21;
      break;
    case "reducido":
      double ivaR = base * 0.10;
      break;
    case "superreducido":
      double ivaSr = base * 0.4;
      break;
    default:
    System.out.print("Iva incorrecto");
    }
  switch (codigo){
    case "nopro":
      double baseNo = base;
      break;
    case "mitad":
      double baseMitad =  base / 2;
      break;
    case "meno5":
      double baseMenos5 = base - 5;
      break;
    case "5porc":
      double base5porc = base * 0.5;
     default:
     System.out.print("Codigo Incorrecto"); 
    }
}
}
