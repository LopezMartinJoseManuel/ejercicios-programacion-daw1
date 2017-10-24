/**
 * Sentencia múltiple (switch) 
 *
 * @author José Manuel López Martín
 */

public class Ejercicio10 {
  public static void main(String[] args) {   
    System.out.println("Programa que dice tu Signo del Zodiaco :D");   
    System.out.print("Por favor, introduzca dia de nacimiento (1-31): ");
    int dia = Integer.parseInt(System.console().readLine());
    System.out.print("Porfavor, introduzca mes de nacimiento (1-12):");
    int mes = Integer.parseInt(System.console().readLine());
    //preguntarle al profe como hacer restriccion de 31 dias   
    
    if ((dia > 31) || (dia < 1) || (mes <1) || (mes > 12)){
	System.out.print("Dia o mes no valido");
    } 
    else{
    
    switch (mes) {
      case 1:
        if(dia <=20){
		System.out.print("Eres signo Capricornio");
		}
		else{
		System.out.print("Eres signo Acuario");
		}	
        break;
      case 2:
        if(dia <=18){
		System.out.print("Eres signo Acuario");
		}
		else{
		System.out.print("Eres signo Piscis");
		}
		break;
      case 3:
        if(dia <=20){
		System.out.print("Eres signo Piscis");
		}
		else{
		System.out.print("Eres signo Aries");
		}
		break;
      case 4:
        if(dia <=24){
		System.out.print("Eres signo Aries");
		}
		else{
		System.out.print("Eres signo Tauro");
		}
		break;
      case 5:
        if(dia <=20){
		System.out.print("Eres signo Tauro");
		}
		else{
		System.out.print("Eres signo Géminis");
		}
		break;
      case 6:
        if(dia <=20){
		System.out.print("Eres signo Géminis");
		}
		else{
		System.out.print("Eres signo Cáncer");
		}
		break;
      case 7:
        if(dia <=20){
		System.out.print("Eres signo Cáncer");
		}
		else{
		System.out.print("Eres signo Leo");
		}
		break;
      case 8:
        if(dia <=21){
		System.out.print("Eres Leo");
		}
		else{
		System.out.print("Eres signo Virgo");
		}
		break;
      case 9:
        if(dia <=22){
		System.out.print("Eres signo Virgo");
		}
		else{
		System.out.print("Eres signo Libra");
		}
		break;
      case 10:
        if(dia <=22){
		System.out.print("Eres signo Libra");
		}
		else{
		System.out.print("Eres signo Escorpio");
		}
		break;
      case 11:
        if(dia <=22){
		System.out.print("Eres signo Escorpio");
		}
		else{
		System.out.print("Eres signo Sagitario");
		}
		break;
      case 12:
        if(dia <=20){
		System.out.print("Eres signo Sagitario");
		}
		else{
		System.out.print("Eres signo Capricornio");
		}
		break;
      default:
        System.out.print("no es un mes válido");
     }//switch
	}//if(dia) ... else
  }
}
