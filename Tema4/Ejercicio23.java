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
  String iva = System.console().readLine().toLowerCase(); 
  System.out.print("Introduzca codigo promocional(nopro, mitad, meno5 o 5porc: ");
  String codigo = System.console().readLine().toLowerCase();
  int tipoIva = 0;
  switch (iva){
    case "general":
      double IvaCalc = base * 0.21;
       tipoIva = 21;
      break;
    case "reducido":
      IvaCalc = base * 0.10;
      tipoIva = 10;
      break;
    case "superreducido":
      IvaCalc = base * 0.4;
      tipoIva = 4;
      break;
    default:
    System.out.print("Iva incorrecto");
    }
  switch (codigo){
    case "nopro":
      double baseNo = base;
      String tipoCodigo = "base";
      break;
    case "mitad":
      double baseMitad =  base / 2;
      tipoCodigo = "mitad";
      break;
    case "meno5":
      double baseMenos5 = base - 5;
      tipoCodigo = "meno5";
      break;
    case "5porc":
      double base5porc = base * 0.5;
      tipoCodigo = "5porc";
     default:
     System.out.print("Codigo Incorrecto"); 
    }
    
  System.out.print("Base imponible     " + base);
  System.out.println("Tipo de iva:" + tipoIva);


}
}
