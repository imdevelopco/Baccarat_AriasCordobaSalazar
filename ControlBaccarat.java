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
	private String[] corazones= {"src/imagenes/Corazones/asC.png","src/imagenes/Corazones/2C.png","src/imagenes/Corazones/3C.png",
			"src/imagenes/Corazones/4C.png","src/imagenes/Corazones/5C.png","src/imagenes/Corazones/6C.png","src/imagenes/Corazones/7C.png",
			"src/imagenes/Corazones/8C.png","src/imagenes/Corazones/9C.png","src/imagenes/Corazones/10C.png","src/imagenes/Corazones/JC.png"
			,"src/imagenes/Corazones/QC.png","src/imagenes/Corazones/KC.png"};
	private String[] diamantes = {"src/imagenes/diamantes/asD.png","src/imagenes/diamantes/2D.png","src/imagenes/diamantes/3D.png",
			"src/imagenes/diamantes/4D.png","src/imagenes/diamantes/5D.png","src/imagenes/diamantes/6D.png","src/imagenes/diamantes/7D.png",
			"src/imagenes/diamantes/8D.png","src/imagenes/diamantes/9D.png","src/imagenes/diamantes/10D.png","src/imagenes/diamantes/JD.png",
			"src/imagenes/diamantes/QD.png","src/imagenes/diamantes/KD.png"};
	private String[] picas = {"src/imagenes/picas/asP.png","src/imagenes/picas/2P.png","src/imagenes/picas/3P.png","src/imagenes/picas/4P.png",
			"src/imagenes/picas/5P.png","src/imagenes/picas/6P.png","src/imagenes/picas/7P.png","src/imagenes/picas/8P.png","src/imagenes/picas/9P.png",
			"src/imagenes/picas/10P.png","src/imagenes/picas/JP.png","src/imagenes/picas/QP.png","src/imagenes/picas/KP.png"};
	private String[] treboles = {"src/imagenes/trebol/asT.png","src/imagenes/trebol/2T.png","src/imagenes/trebol/3T.png","src/imagenes/trebol/4T.png",
			"src/imagenes/trebol/5T.png","src/imagenes/trebol/6T.png","src/imagenes/trebol/7T.png","src/imagenes/trebol/8T.png","src/imagenes/trebol/9T.png",
			"src/imagenes/trebol/10T.png","src/imagenes/trebol/JT.png","src/imagenes/trebol/QT.png","src/imagenes/trebol/KT.png"};

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
			   mazo[n]= new Carta(1,"A",corazones[i]);
			   mazo[n+1]= new Carta(1,"A",corazones[i]);
			   mazo[n+2]= new Carta(1,"A",diamantes[i]);
			   mazo[n+3]= new Carta(1,"A",diamantes[i]);
			   mazo[n+4]= new Carta(1,"A",picas[i]);
			   mazo[n+5]= new Carta(1,"A",picas[i]);
			   mazo[n+6]= new Carta(1,"A",treboles[i]);
			   mazo[n+7]= new Carta(1,"A",treboles[i]);
		   }
		   break;
		   case 1:{
			   mazo[n]= new Carta(2,"2",corazones[i]);
			   mazo[n+1]= new Carta(2,"2",corazones[i]);
			   mazo[n+2]= new Carta(2,"2",diamantes[i]);
			   mazo[n+3]= new Carta(2,"2",diamantes[i]);
			   mazo[n+4]= new Carta(2,"2",picas[i]);
			   mazo[n+5]= new Carta(2,"2",picas[i]);
			   mazo[n+6]= new Carta(2,"2",treboles[i]);
			   mazo[n+7]= new Carta(2,"2",treboles[i]);
		   }
		   break;
		   case 2:{
			   mazo[n]= new Carta(3,"3",corazones[i]);
			   mazo[n+1]= new Carta(3,"3",corazones[i]);
			   mazo[n+2]= new Carta(3,"3",diamantes[i]);
			   mazo[n+3]= new Carta(3,"3",diamantes[i]);
			   mazo[n+4]= new Carta(3,"3",picas[i]);
			   mazo[n+5]= new Carta(3,"3",picas[i]);
			   mazo[n+6]= new Carta(3,"3",treboles[i]);
			   mazo[n+7]= new Carta(3,"3",treboles[i]);
		   }
		   break;
		   case 3:{
			   mazo[n]= new Carta(4,"4",corazones[i]);
			   mazo[n+1]= new Carta(4,"4",corazones[i]);
			   mazo[n+2]= new Carta(4,"4",diamantes[i]);
			   mazo[n+3]= new Carta(4,"4",diamantes[i]);
			   mazo[n+4]= new Carta(4,"4",picas[i]);
			   mazo[n+5]= new Carta(4,"4",picas[i]);
			   mazo[n+6]= new Carta(4,"4",treboles[i]);
			   mazo[n+7]= new Carta(4,"4",treboles[i]);
		   }
		   break;
		   case 4:{
			   mazo[n]= new Carta(5,"5",corazones[i]);
			   mazo[n+1]= new Carta(5,"5",corazones[i]);
			   mazo[n+2]= new Carta(5,"5",diamantes[i]);
			   mazo[n+3]= new Carta(5,"5",diamantes[i]);
			   mazo[n+4]= new Carta(5,"5",picas[i]);
			   mazo[n+5]= new Carta(5,"5",picas[i]);
			   mazo[n+6]= new Carta(5,"5",treboles[i]);
			   mazo[n+7]= new Carta(5,"5",treboles[i]);
		   }
		   break;
		   case 5:{
			   mazo[n]= new Carta(6,"6",corazones[i]);
			   mazo[n+1]= new Carta(6,"6",corazones[i]);
			   mazo[n+2]= new Carta(6,"6",diamantes[i]);
			   mazo[n+3]= new Carta(6,"6",diamantes[i]);
			   mazo[n+4]= new Carta(6,"6",picas[i]);
			   mazo[n+5]= new Carta(6,"6",picas[i]);
			   mazo[n+6]= new Carta(6,"6",treboles[i]);
			   mazo[n+7]= new Carta(6,"6",treboles[i]);
		   }
		   break;
		   case 6:{
			   mazo[n]= new Carta(7,"7",corazones[i]);
			   mazo[n+1]= new Carta(7,"7",corazones[i]);
			   mazo[n+2]= new Carta(7,"7",diamantes[i]);
			   mazo[n+3]= new Carta(7,"7",diamantes[i]);
			   mazo[n+4]= new Carta(7,"7",picas[i]);
			   mazo[n+5]= new Carta(7,"7",picas[i]);
			   mazo[n+6]= new Carta(7,"7",treboles[i]);
			   mazo[n+7]= new Carta(7,"7",treboles[i]);
		   }
		   break;
		   case 7:{
			   mazo[n]= new Carta(8,"8",corazones[i]);
			   mazo[n+1]= new Carta(8,"8",corazones[i]);
			   mazo[n+2]= new Carta(8,"8",diamantes[i]);
			   mazo[n+3]= new Carta(8,"8",diamantes[i]);
			   mazo[n+4]= new Carta(8,"8",picas[i]);
			   mazo[n+5]= new Carta(8,"8",picas[i]);
			   mazo[n+6]= new Carta(8,"8",treboles[i]);
			   mazo[n+7]= new Carta(8,"8",treboles[i]);
		   }
		   break;
		   case 8:{
			   mazo[n]= new Carta(9,"9",corazones[i]);
			   mazo[n+1]= new Carta(9,"9",corazones[i]);
			   mazo[n+2]= new Carta(9,"9",diamantes[i]);
			   mazo[n+3]= new Carta(9,"9",diamantes[i]);
			   mazo[n+4]= new Carta(9,"9",picas[i]);
			   mazo[n+5]= new Carta(9,"9",picas[i]);
			   mazo[n+6]= new Carta(9,"9",treboles[i]);
			   mazo[n+7]= new Carta(9,"9",treboles[i]);
		   }
		   break;
		   case 9:{
			   mazo[n]= new Carta(0,"10",corazones[i]);
			   mazo[n+1]= new Carta(0,"10",corazones[i]);
			   mazo[n+2]= new Carta(0,"10",diamantes[i]);
			   mazo[n+3]= new Carta(0,"10",diamantes[i]);
			   mazo[n+4]= new Carta(0,"10",picas[i]);
			   mazo[n+5]= new Carta(0,"10",picas[i]);
			   mazo[n+6]= new Carta(0,"10",treboles[i]);
			   mazo[n+7]= new Carta(0,"10",treboles[i]);
		   }
		   break;
		   case 10:{
			   mazo[n]= new Carta(0,"J",corazones[i]);
			   mazo[n+1]= new Carta(0,"J",corazones[i]);
			   mazo[n+2]= new Carta(0,"J",diamantes[i]);
			   mazo[n+3]= new Carta(0,"J",diamantes[i]);
			   mazo[n+4]= new Carta(0,"J",picas[i]);
			   mazo[n+5]= new Carta(0,"J",picas[i]);
			   mazo[n+6]= new Carta(0,"J",treboles[i]);
			   mazo[n+7]= new Carta(0,"J",treboles[i]);
		   }
		   break;
		   case 11:{
			   mazo[n]= new Carta(0,"Q",corazones[i]);
			   mazo[n+1]= new Carta(0,"Q",corazones[i]);
			   mazo[n+2]= new Carta(0,"Q",diamantes[i]);
			   mazo[n+3]= new Carta(0,"Q",diamantes[i]);
			   mazo[n+4]= new Carta(0,"Q",picas[i]);
			   mazo[n+5]= new Carta(0,"Q",picas[i]);
			   mazo[n+6]= new Carta(0,"Q",treboles[i]);
			   mazo[n+7]= new Carta(0,"Q",treboles[i]);
		   }
		   break;
		   case 12:{
			   mazo[n]= new Carta(0,"K",corazones[i]);
			   mazo[n+1]= new Carta(0,"K",corazones[i]);
			   mazo[n+2]= new Carta(0,"K",diamantes[i]);
			   mazo[n+3]= new Carta(0,"K",diamantes[i]);
			   mazo[n+4]= new Carta(0,"K",picas[i]);
			   mazo[n+5]= new Carta(0,"K",picas[i]);
			   mazo[n+6]= new Carta(0,"K",treboles[i]);
			   mazo[n+7]= new Carta(0,"K",treboles[i]);
		   }
		   break;
		   }
		   n+=8;
	   }
	}
	/*
	 * Entrada: null
	 * Salida: Instancia de la Clase Carta
	 * Funcion: Verifica que la carta que se va a dar no este en uso. Si el valor aleatorio de la variable n ya se encuentra en el arreglo llamado utilizados,
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
 		leer = new Scanner(System.in);
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
 		Carta carta1J = devolverCarta(),
 		      carta2J = devolverCarta(),
 		      carta3J;
 				
 		Carta carta1C = devolverCarta(),
 		      carta2C = devolverCarta(),
 		      carta3C;

 		int acumuladorGeneralJugador = 0;
 		int acumuladorGeneralCupier  = 0;
 		int ganador = 0;
 		/* dependiendo a que quiere apostar el jugador
 		 * 0 = Apuesta a la mano del jugador
 		 * 1 = Apuesta a la mano de la Banca
 		 * 2 = Apuesta al empate
 		 */

 			acumuladorGeneralCupier  = carta1C.getNumero()+carta2C.getNumero();
 			acumuladorGeneralJugador = carta1J.getNumero()+carta2J.getNumero();

 			System.out.println("Cartas Jugador: primera = "+carta1J.getNombre()+",valor="+carta1J.getNumero()+" segunda = "+carta2J.getNombre()+",valor="+carta2J.getNumero()+" Total="+acumuladorGeneralJugador );
 			System.out.println("Cartas Cupier: primera = "+carta1C.getNombre()+",valor="+carta1C.getNumero()+" segunda = "+carta2C.getNombre()+",valor="+carta2C.getNumero()+" Total="+acumuladorGeneralCupier );
	 		System.out.println( carta1J.getNumero()+" "+carta2J.getNumero()+"||"+carta1C.getNumero()+" "+carta2C.getNumero() );
	 		if ((acumuladorGeneralJugador == 9  || acumuladorGeneralJugador == 8) && (acumuladorGeneralCupier != 8 && acumuladorGeneralCupier != 9) ){
	 			ganador = 0; //gana la mano del jugador
	 			st      = true;
	 		}
	 		else if( (acumuladorGeneralCupier==9 || acumuladorGeneralCupier== 8) && (acumuladorGeneralJugador != 8 && acumuladorGeneralJugador != 9) ){
	 			ganador = 1; //gana la mano de la Banca
	 			st      = true;
	 		}
			else if((acumuladorGeneralJugador == 9  || acumuladorGeneralJugador == 8) && (acumuladorGeneralCupier==9 || acumuladorGeneralCupier== 8)) {
				if(acumuladorGeneralJugador > acumuladorGeneralCupier){ //si el jugador saco más (9) que la banca (8), gana la mano del jugador
					ganador = 0; //gana la mano del jugador
				}
				else if(acumuladorGeneralJugador < acumuladorGeneralCupier){ //si el jugador saco menos (8) que la banca (9), gana la mano de la banca
					ganador = 1; //gana la mano de la Banca
				}
				else if(acumuladorGeneralJugador == acumuladorGeneralCupier){ //si sacaron numero iguales es un empate
					ganador = 2; //gano el empate
				}

				st=true;
	 		}
	 		else{ //cuando ni el jugador ni el cupier sacan un natural 
	 			if(acumuladorGeneralJugador >= 10){
	 				acumuladorGeneralJugador-=10;
	 			}
	 			if(acumuladorGeneralCupier >= 10){
	 				acumuladorGeneralCupier-=10;
	 			}

	 			if(acumuladorGeneralJugador <= 5){ //si el jugador tiene 5 o menos se le da otra carta
	 				carta3J = devolverCarta();
	 				//si el valor de la tercera carta sumada a las otras dos da mayor o igual que 10 se le resta 10, si no se suma la tercera carta
	 				acumuladorGeneralJugador = (acumuladorGeneralJugador+carta3J.getNumero() >= 10) ? (acumuladorGeneralJugador+carta3J.getNumero())-10 : acumuladorGeneralJugador+carta3J.getNumero() ;
	 				System.out.println("Cartas Jugador: Tercera = "+carta3J.getNombre()+",valor="+carta3J.getNumero()+" Total="+acumuladorGeneralJugador);

	 				//verificamos si se le da otra carta al cupier dependiendo  del valor de la tercera carta del jugador y el todal del cupier
	 				if( (acumuladorGeneralCupier == 6 && (carta3J.getNumero() == 7 || carta3J.getNumero() == 6)) ||
	 				    (acumuladorGeneralCupier == 5 && (carta3J.getNumero() == 7 || carta3J.getNumero() == 4)) ||
	 				    (acumuladorGeneralCupier == 4 && (carta3J.getNumero() == 7 || carta3J.getNumero() == 2)) ||
	 				    (acumuladorGeneralCupier == 3 && carta3J.getNumero() != 8) )
	 				{
	 					carta3C = devolverCarta();
	 					acumuladorGeneralCupier = (acumuladorGeneralCupier+carta3C.getNumero() >= 10) ? (acumuladorGeneralCupier+carta3C.getNumero())-10 : acumuladorGeneralCupier+carta3C.getNumero();
	 					System.out.println("Cartas Cupier: Tercera = "+carta3C.getNombre()+",valor="+carta3C.getNumero()+" Total="+acumuladorGeneralCupier);
	 				}
	 			}
	 			else{ //condiciones para que el cupier saque una tercera carta sin depender de la tercera del jugador
	 				if(acumuladorGeneralCupier <= 2){
	 					carta3C = devolverCarta();
	 					acumuladorGeneralCupier = (acumuladorGeneralCupier+carta3C.getNumero() >= 10) ? (acumuladorGeneralCupier+carta3C.getNumero())-10 : acumuladorGeneralCupier+carta3C.getNumero();
	 					System.out.println("Cartas Cupier: Tercera = "+carta3C.getNombre()+",valor="+carta3C.getNumero()+" Total="+acumuladorGeneralCupier);
	 				}
	 			}

	 			if(acumuladorGeneralJugador > acumuladorGeneralCupier){ //si el jugador saco más que la banca, gana la mano del jugador
					ganador = 0; //gana la mano del jugador
				}
				else if(acumuladorGeneralJugador < acumuladorGeneralCupier){ //si el jugador saco menos que la banca, gana la mano de la banca
					ganador = 1; //gana la mano de la Banca
				}
				else if(acumuladorGeneralJugador == acumuladorGeneralCupier){ //si sacaron numeros iguales es un empate
					ganador = 2; //gano el empate
				}

	 		}
 		

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
 
