package juegoBaccarat;

public class Carta {
	private int numeroCarta;
	private String nombreCarta;

	public Carta(int num,String name) {
		this.numeroCarta	= 	num;
		this.nombreCarta	=	name;
	}
	
	public int getNumero() {
		return numeroCarta;
	}
	
	public String getNombre() {
		return nombreCarta;
	}
}
