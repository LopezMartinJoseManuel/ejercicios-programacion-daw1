/**
 * Ejercicio 24
 *
 * @author Jose Manuel Lopez
 */
public class Ejercicio24 {
  public static void main(String[] args) {
  
  System.out.println("################################");
  System.out.println("#Programa que genera una nomina#");
  System.out.println("################################");
  System.out.println("Tipo de cargo");
  System.out.println("1. Programador junior");
  System.out.println("2. Prog. senior ");
  System.out.println("3. Jefe de proyecto");
  System.out.print("Introduzca el cargo de empleado(1-3): ");
  int cargo = Integer.parseInt(System.console().readLine());
  System.out.print("¿Cuántos días ha estado visitando clientes?: ");
  int dias = Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
  int estadoCivil = Integer.parseInt(System.console().readLine());
  
  double sueldoBase = 0;
  double irpf = 0;
  int tipoIrpf = 0;
  
  switch (cargo){
    case 1:
      sueldoBase = 950.00;
      break;
    case 2:
      sueldoBase = 1200.00;
      break;
    case 3:
      sueldoBase = 1600.00;
      break;
    default:
    System.out.print("Cargo incorrecto");
    }
    
  double sueldoViajes = dias * 30;
  double sueldoBruto = sueldoBase + sueldoViajes;
  
  switch (estadoCivil){
    case 1:
      irpf = (sueldoBruto * 25) / 100;
      tipoIrpf = 25;
      break;
    case 2:
      irpf = (sueldoBruto * 20) / 100;
      tipoIrpf = 20;
      break;
     default:
     System.out.print("Estado civil erróneo");
     }
     
  double sueldoNeto = sueldoBruto - irpf;
  
  System.out.println("##############################");
  System.out.println("Sueldo base             " + sueldoBase);
  System.out.printf("Dietas (%2d)             %.2f\n ", dias, sueldoViajes);
  System.out.println("##############################");
  System.out.println("Sueldo bruto            " + sueldoBruto);
  System.out.printf("Retención IRPF( %2d%%)    %.2f\n", tipoIrpf, irpf);
  System.out.println("##############################");
  System.out.println("Sueldo neto             " + sueldoNeto);
  System.out.println("##############################");
  
  }
}
