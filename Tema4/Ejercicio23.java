/**
 * Ejercicio 23
 *
 * @author Jose Manuel Lopez
 */
public class Ejercicio23 {
  public static void main(String[] args) {

  System.out.print("Programa que calcula el precio final de producto");
  System.out.println(" segun su base imponible");
  System.out.print("Introduzca la base imponible: ");
  double base = Double.parseDouble(System.console().readLine());
  System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
  String iva = System.console().readLine().toLowerCase(); 
  System.out.print("Introduzca codigo promocional(nopro, mitad, meno5 o 5porc): ");
  String codigo = System.console().readLine().toLowerCase();
  
  int tipoIva = 0;
  double ivaCalc = 0;
  double calcCodi = 0;
  String tipoCodigo = "";
  

  switch (iva){
    case "general":
       ivaCalc = base * 0.21;
       tipoIva = 21;
      break;
    case "reducido":
      ivaCalc = base * 0.10;
      tipoIva = 10;
      break;
    case "superreducido":
      ivaCalc = base * 0.4;
      tipoIva = 4;
      break;
    default:
    System.out.print("\nIva incorrecto");
    }
  double precioIva = base + ivaCalc;
  
  switch (codigo){
    case "nopro":
      calcCodi = 0;
      tipoCodigo = "nopro";
      break;
    case "mitad":
      calcCodi =  precioIva / 2;
      tipoCodigo = "mitad";
      break;
    case "meno5":
      calcCodi = 5;
      tipoCodigo = "meno5";
      break;
    case "5porc":
      calcCodi = (precioIva * 5) /100;
      tipoCodigo = "5porc";
      break;
     default:
     System.out.print("\nCodigo Incorrecto"); 
    }
  double total = precioIva - calcCodi;
  
  System.out.println("Base imponible        " + base);
  System.out.printf("Tipo de iva(%2d%%)      %.2f\n", tipoIva, ivaCalc);
  System.out.println("Precio con Iva        " + precioIva);
  System.out.printf("Cód. promo. (%s): -%.2f\n", tipoCodigo, calcCodi);
  //preguntar profe formato printf
  System.out.print("TOTAL	              " + total);
}
}
