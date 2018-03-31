package juegoBaccarat;

import java.util.Scanner;

public class Jugador {
	private int saldo= 20000;
	private String nombre;
	/*
	 * Cantidad a apostar del jugador
	 */
	private int apuestaValor;
	/* dependiendo a que quiere apostar el jugador
	 * 0 = Apuesta al jugador
	 * 1 = Apuesta a la Banca
	 * 2 = Apuesta al empate
	 */
	private int tipoApuesta;
	private Scanner leer;
	/*
	 * Entrada: null
	 * Salida: Cadena de Texto
	 * Funcion: retorna el nombre actual de un Jugador
	 */
	public String getNombreJugador() {
		return nombre;
	}
	/*
	 * Entrada: null
	 * Salida: Numero Entero
	 * Funcion: Retorna el saldo actual de un Jugador
	 */
	
	public int getSaldo() {
		return saldo;
	}
	/*
	 * Entrada: null
	 * Salida: Numero Entero
	 * Funcion: Retorna el valor de la apuesta actual de un Jugador
	 */
	public int getApuestaValor() {
		return apuestaValor;
	}
	/*
	 * Entrada: null
	 * Salida: Numero Entero
	 * Funcion: Retorna a que le aposto un Jugador
	 */
	public int getTipoApuesta() {
		return tipoApuesta;
	}
	/*
	 * Entrada: Numero Entero
	 * Salida: void
	 * Funcion: cambia el valor de la apuesta actual de un Jugador
	 */
	public void setApuestaValor(int newVal) {
		apuestaValor=newVal;
	}
	/*
	 * Entrada: Numero Entero
	 * Salida: void
	 * Funcion: cambia el tipo de la apuesta actual de un Jugador, validando que el parametro
	 * que ingresa sea uno de los valor permitidos.
	 */
	public void setTipoApuesta(int newVal ) {
		if(newVal == 0 || newVal == 1 || newVal == 2) {
			tipoApuesta=newVal;
		}else {
			System.out.println("Tipo de Apuesta no permitida");
		}
	}
	/*
	 * Entrada: Numero Entero
	 * Salida: void
	 * Funcion: cambia el valor del saldo actual de un Jugador
	 */
	public void setSaldo(int newVal) {
		saldo=newVal;
	}
	/*
	 * Entrada: cadena de texto
	 * Salida: void
	 * Funcion: cambia el valor del saldo actual de un Jugador
	 */
	public void setNombreJugador (String newVal) {
		nombre=newVal;
	}
	public int makeApuesta(int cantidad) {
		do {
			leer=new Scanner(System.in);
			cantidad=leer.nextInt();
			if(cantidad<=saldo) {
				saldo=saldo-cantidad;
			}
		}while(cantidad>saldo);
		return cantidad;
	}
}
