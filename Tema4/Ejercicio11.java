/**
 * Ejercicio11 
 *
 * @author Jose Manuel Lopez Martin
 */

public class Ejercicio11 {
  public static void main(String[] args) {   
    System.out.println("Programa que calcula los segundos que faltan para medianoche");   
    System.out.print("Introduzca una hora (1-24)");
    int hora = Integer.parseInt(System.console().readLine());
	System.out.print("Introduzca minutos (1-60)");
    int minutos = Integer.parseInt(System.console().readLine());
    
    if ((hora <= 0) || (hora > 24) || (minutos <= 0) || (minutos > 60)){	
	System.out.println("Hora o minutos incorrecto, recuerda (1-24)h (1-60)m");
	}
	else{
	int segundosDia = 60 * 60 * 24;
	int horaSegundos = hora * 60 * 60;
	int minutoSegundos = minutos * 60;
	int segundosFinal = segundosDia - (horaSegundos + minutoSegundos) ;
	
	System.out.println("Los dias que faltan para llegar a medianoche son " + segundosFinal + " segundos");
    }

  }
}
