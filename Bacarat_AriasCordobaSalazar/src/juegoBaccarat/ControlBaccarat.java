package juegoBaccarat;

import java.util.Random;


/**
 * @author Carlos Andres Cordoba
 *
 */
public class ControlBaccarat {
	private Carta[] manoJugador;
	private Carta[] manoBanca;
	private Carta[] mazo= new Carta[52];
	private int[] utilizadas = new int[10];

	/*
	 * Entrada: null
	 * Salida:void
	 * Funcion: Asignar Valores a cada Carta del mazo
	 */
	public void crearMazo() {
		int n=0;
	   for (int i=0;i<13;i++) {
		   switch(i) {
		   case 0:{
			   mazo[n]= new Carta(1,"A");
			   mazo[n+1]= new Carta(1,"A");
			   mazo[n+2]= new Carta(1,"A");
			   mazo[n+3]= new Carta(1,"A");
		   }
		   break;
		   case 1:{
			   mazo[n]= new Carta(2,"2");
			   mazo[n+1]= new Carta(2,"2");
			   mazo[n+2]= new Carta(2,"2");
			   mazo[n+3]= new Carta(2,"2");
		   }
		   break;
		   case 2:{
			   mazo[n]= new Carta(3,"3");
			   mazo[n+1]= new Carta(3,"3");
			   mazo[n+2]= new Carta(3,"3");
			   mazo[n+3]= new Carta(3,"3");
		   }
		   break;
		   case 3:{
			   mazo[n]= new Carta(4,"4");
			   mazo[n+1]= new Carta(4,"4");
			   mazo[n+2]= new Carta(4,"4");
			   mazo[n+3]= new Carta(4,"4");
		   }
		   break;
		   case 4:{
			   mazo[n]= new Carta(5,"5");
			   mazo[n+1]= new Carta(5,"5");
			   mazo[n+2]= new Carta(5,"5");
			   mazo[n+3]= new Carta(5,"5");
		   }
		   break;
		   case 5:{
			   mazo[n]= new Carta(6,"6");
			   mazo[n+1]= new Carta(6,"6");
			   mazo[n+2]= new Carta(6,"6");
			   mazo[n+3]= new Carta(6,"6");
		   }
		   break;
		   case 6:{
			   mazo[n]= new Carta(7,"7");
			   mazo[n+1]= new Carta(7,"7");
			   mazo[n+2]= new Carta(7,"7");
			   mazo[n+3]= new Carta(7,"7");
		   }
		   break;
		   case 7:{
			   mazo[n]= new Carta(8,"8");
			   mazo[n+1]= new Carta(8,"8");
			   mazo[n+2]= new Carta(8,"8");
			   mazo[n+3]= new Carta(8,"8");
		   }
		   break;
		   case 8:{
			   mazo[n]= new Carta(9,"9");
			   mazo[n+1]= new Carta(9,"9");
			   mazo[n+2]= new Carta(9,"9");
			   mazo[n+3]= new Carta(9,"9");
		   }
		   break;
		   case 9:{
			   mazo[n]= new Carta(0,"10");
			   mazo[n+1]= new Carta(0,"10");
			   mazo[n+2]= new Carta(0,"10");
			   mazo[n+3]= new Carta(0,"10");
		   }
		   break;
		   case 10:{
			   mazo[n]= new Carta(0,"J");
			   mazo[n+1]= new Carta(0,"J");
			   mazo[n+2]= new Carta(0,"J");
			   mazo[n+3]= new Carta(0,"J");
		   }
		   break;
		   case 11:{
			   mazo[n]= new Carta(0,"Q");
			   mazo[n+1]= new Carta(0,"Q");
			   mazo[n+2]= new Carta(0,"Q");
			   mazo[n+3]= new Carta(0,"Q");
		   }
		   break;
		   case 12:{
			   mazo[n]= new Carta(0,"K");
			   mazo[n+1]= new Carta(0,"K");
			   mazo[n+2]= new Carta(0,"K");
			   mazo[n+3]= new Carta(0,"K");
		   }
		   break;
		   }
		   n+=4;
	   }
	}
	/*
	 * Entrada: null
	 * Salida: Instancia de la Clase Carta
	 * Funcion: verifica si el valor aleatorio de la variable n ya se encuentra en el arreglo llamado utilizados,
	 * si no se encuentra lo inserta y retorna la instancia de la clase Carta en esa posicion del arreglo mazo.
	 */
 	public Carta devolverCarta() {
 		Random r=new Random();
 		int n;
 		boolean st=false;
 		do{
 			n=r.nextInt(mazo.length);
 			for(int x:utilizadas) {
 				if (utilizadas[0] ==  0) {
 					utilizadas[0]=n;
 					st=true;
 				}else if (utilizadas[x] == 0){
 					utilizadas[x]=n;
 					st=true;
 				}
 			}
 			
 		}while(st==false);
 		return mazo[n];
 	}
 	
 	
 }
 
