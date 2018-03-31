package juegoBaccarat;

import java.util.Random;
import java.util.Scanner;


/**
 * @author Carlos Andres Cordoba
 *
 */
public class ControlBaccarat {
	private Carta[] manoJugador;
	private Carta[] manoBanca;
	private Carta[] mazo= new Carta[104];
	private int[] utilizadas = new int[10];
	private Scanner leer;
	private int cartasEnJuego =0;

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
			   mazo[n+4]= new Carta(1,"A");
			   mazo[n+5]= new Carta(1,"A");
			   mazo[n+6]= new Carta(1,"A");
			   mazo[n+7]= new Carta(1,"A");
		   }
		   break;
		   case 1:{
			   mazo[n]= new Carta(2,"2");
			   mazo[n+1]= new Carta(2,"2");
			   mazo[n+2]= new Carta(2,"2");
			   mazo[n+3]= new Carta(2,"2");
			   mazo[n+4]= new Carta(2,"2");
			   mazo[n+5]= new Carta(2,"2");
			   mazo[n+6]= new Carta(2,"2");
			   mazo[n+7]= new Carta(2,"2");
		   }
		   break;
		   case 2:{
			   mazo[n]= new Carta(3,"3");
			   mazo[n+1]= new Carta(3,"3");
			   mazo[n+2]= new Carta(3,"3");
			   mazo[n+3]= new Carta(3,"3");
			   mazo[n+4]= new Carta(3,"3");
			   mazo[n+5]= new Carta(3,"3");
			   mazo[n+6]= new Carta(3,"3");
			   mazo[n+7]= new Carta(3,"3");
		   }
		   break;
		   case 3:{
			   mazo[n]= new Carta(4,"4");
			   mazo[n+1]= new Carta(4,"4");
			   mazo[n+2]= new Carta(4,"4");
			   mazo[n+3]= new Carta(4,"4");
			   mazo[n+4]= new Carta(4,"4");
			   mazo[n+5]= new Carta(4,"4");
			   mazo[n+6]= new Carta(4,"4");
			   mazo[n+7]= new Carta(4,"4");
		   }
		   break;
		   case 4:{
			   mazo[n]= new Carta(5,"5");
			   mazo[n+1]= new Carta(5,"5");
			   mazo[n+2]= new Carta(5,"5");
			   mazo[n+3]= new Carta(5,"5");
			   mazo[n+4]= new Carta(5,"5");
			   mazo[n+5]= new Carta(5,"5");
			   mazo[n+6]= new Carta(5,"5");
			   mazo[n+7]= new Carta(5,"5");
		   }
		   break;
		   case 5:{
			   mazo[n]= new Carta(6,"6");
			   mazo[n+1]= new Carta(6,"6");
			   mazo[n+2]= new Carta(6,"6");
			   mazo[n+3]= new Carta(6,"6");
			   mazo[n+4]= new Carta(6,"6");
			   mazo[n+5]= new Carta(6,"6");
			   mazo[n+6]= new Carta(6,"6");
			   mazo[n+7]= new Carta(6,"6");
		   }
		   break;
		   case 6:{
			   mazo[n]= new Carta(7,"7");
			   mazo[n+1]= new Carta(7,"7");
			   mazo[n+2]= new Carta(7,"7");
			   mazo[n+3]= new Carta(7,"7");
			   mazo[n+4]= new Carta(7,"7");
			   mazo[n+5]= new Carta(7,"7");
			   mazo[n+6]= new Carta(7,"7");
			   mazo[n+7]= new Carta(7,"7");
		   }
		   break;
		   case 7:{
			   mazo[n]= new Carta(8,"8");
			   mazo[n+1]= new Carta(8,"8");
			   mazo[n+2]= new Carta(8,"8");
			   mazo[n+3]= new Carta(8,"8");
			   mazo[n+4]= new Carta(8,"8");
			   mazo[n+5]= new Carta(8,"8");
			   mazo[n+6]= new Carta(8,"8");
			   mazo[n+7]= new Carta(8,"8");
		   }
		   break;
		   case 8:{
			   mazo[n]= new Carta(9,"9");
			   mazo[n+1]= new Carta(9,"9");
			   mazo[n+2]= new Carta(9,"9");
			   mazo[n+3]= new Carta(9,"9");
			   mazo[n+4]= new Carta(9,"9");
			   mazo[n+5]= new Carta(9,"9");
			   mazo[n+6]= new Carta(9,"9");
			   mazo[n+7]= new Carta(9,"9");
		   }
		   break;
		   case 9:{
			   mazo[n]= new Carta(0,"10");
			   mazo[n+1]= new Carta(0,"10");
			   mazo[n+2]= new Carta(0,"10");
			   mazo[n+3]= new Carta(0,"10");
			   mazo[n+4]= new Carta(0,"10");
			   mazo[n+5]= new Carta(0,"10");
			   mazo[n+6]= new Carta(0,"10");
			   mazo[n+7]= new Carta(0,"10");
		   }
		   break;
		   case 10:{
			   mazo[n]= new Carta(0,"J");
			   mazo[n+1]= new Carta(0,"J");
			   mazo[n+2]= new Carta(0,"J");
			   mazo[n+3]= new Carta(0,"J");
			   mazo[n+4]= new Carta(0,"J");
			   mazo[n+5]= new Carta(0,"J");
			   mazo[n+6]= new Carta(0,"J");
			   mazo[n+7]= new Carta(0,"J");
		   }
		   break;
		   case 11:{
			   mazo[n]= new Carta(0,"Q");
			   mazo[n+1]= new Carta(0,"Q");
			   mazo[n+2]= new Carta(0,"Q");
			   mazo[n+3]= new Carta(0,"Q");
			   mazo[n+4]= new Carta(0,"Q");
			   mazo[n+5]= new Carta(0,"Q");
			   mazo[n+6]= new Carta(0,"Q");
			   mazo[n+7]= new Carta(0,"Q");
		   }
		   break;
		   case 12:{
			   mazo[n]= new Carta(0,"K");
			   mazo[n+1]= new Carta(0,"K");
			   mazo[n+2]= new Carta(0,"K");
			   mazo[n+3]= new Carta(0,"K");
			   mazo[n+4]= new Carta(0,"K");
			   mazo[n+5]= new Carta(0,"K");
			   mazo[n+6]= new Carta(0,"K");
			   mazo[n+7]= new Carta(0,"K");
		   }
		   break;
		   }
		   n+=8;
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
 		int n,x=0;
 		boolean st=false;
 			do{
 				n=r.nextInt(mazo.length);
 				
 				for(int i =0 ;i<utilizadas.length;i++) {
 					if(utilizadas[i] != n)
 						st=true;
 				}
 				if(0 == utilizadas[x]) {
 					utilizadas[x]=n;	
 				}
 				x++;
 				
 			}while(st==false);
 		
 			return mazo[n];
 	}
 	
 	/*
 	 * 
 	 */
 	public void iniciarJogo() {
 		crearMazo();
 		String decision;
 		int num;
 		boolean st = false;
		Jugador elMocho = new Jugador();
		System.out.println("Digita el nombre del jugador");
 		leer =new Scanner(System.in);
 		elMocho.setNombreJugador(leer.nextLine());
 		// se llenan datos del jugador
 		do{
 			System.out.println("Digita el tipo de apuesta:");
 			System.out.println("0 = al jugador \n1 = a la banca\n2 = al empate");
 			leer=new Scanner(System.in);
 			num = leer.nextInt();
 			elMocho.setTipoApuesta(num);
 		}while(num != 1 && num != 2 && num != 0);
 		
 		System.out.println("Bienvenido a este Baccarat!: "+ elMocho.getNombreJugador());
 		// variables donde se alojan las cartas en juego tanto como para el jugador como para
 		// el cupier.
 		Carta carta1J = devolverCarta(),carta2J = new Carta();
 				
 		Carta carta1C = devolverCarta(),carta2C=new Carta(),carta3C = new Carta();
 		int acumuladorGeneralJugador=0;
 		int acumuladorGeneralCupier=0;
 		int ganador=0;
 		/* dependiendo a que quiere apostar el jugador
 		 * 0 = Apuesta al jugador
 		 * 1 = Apuesta a la Banca
 		 * 2 = Apuesta al empate
 		 */
 		do {
 			acumuladorGeneralCupier=carta1C.getNumero()+carta2C.getNumero()+carta3C.getNumero();
 			acumuladorGeneralJugador=carta1J.getNumero()+carta2J.getNumero();
 			System.out.println("Carta 1 de J: "+carta1J.getNombre());
 			System.out.println("Carta 1 de C: "+carta1C.getNombre());
	 		System.out.println(carta1J.getNumero()+" "+carta2J.getNumero()+"||"+carta1C.getNumero()+" "+carta2C.getNumero()+" "+carta3C.getNumero());
	 		if ((acumuladorGeneralJugador == 9  || acumuladorGeneralJugador == 8)){
	 			ganador=0;
	 			st=true;
	 		}
	 		else if(acumuladorGeneralCupier==9 || acumuladorGeneralCupier== 8){
	 			ganador=1;
	 			st=true;
	 		}
			else if((acumuladorGeneralJugador == 9  || acumuladorGeneralJugador == 8) && (acumuladorGeneralCupier==9 || acumuladorGeneralCupier== 8)) {
				ganador=2;
				st=true;
	 		}else if(acumuladorGeneralJugador < 8 && acumuladorGeneralCupier<8){
	 			carta2J=devolverCarta();
	 			System.out.println("Carta 2 de J: "+carta2J.getNombre());
	 			carta2C=devolverCarta();
	 			System.out.println("Carta 2 de C: "+carta2C.getNombre());
	 			if(acumuladorGeneralJugador >= 10) {
	 				acumuladorGeneralJugador-=10;
	 			}
	 			if(acumuladorGeneralCupier>=10){
	 				acumuladorGeneralCupier-=10;
	 			}
	 			st=true;
	 			System.out.println(carta1J.getNumero()+" "+carta2J.getNumero()+"||"+carta1C.getNumero()+" "+carta2C.getNumero()+" "+carta3C.getNumero());
	 		}else if (acumuladorGeneralCupier<8){
	 			carta3C=devolverCarta();
	 			System.out.println("Carta 3 de C: "+carta3C.getNombre());
	 			st=true;
	 			System.out.println(carta1J.getNumero()+" "+carta2J.getNumero()+"||"+carta1C.getNumero()+" "+carta2C.getNumero()+" "+carta3C.getNumero());
	 		}
 		}while(st=false);
 		if(elMocho.getTipoApuesta() == ganador) {
 			System.out.println("Ganaste Cabron!");
 		}else {
 			System.out.println("Perdiste");
 		}
 	}
 	public Jugador crearJugador(Jugador gamer) {
 		
 		return gamer;
 	}
 }
 
