package juegoBaccarat;

import javax.swing.ImageIcon;

public class Carta {
	private int numeroCarta;
	private String nombreCarta,rutaImagen;
	private ImageIcon tipoCarta;

	public Carta() {
		this.numeroCarta	= 	0;
		this.nombreCarta	=	"";	
	}
	public Carta(int num,String name,String typeCard) {
		this.numeroCarta	= 	num;
		this.nombreCarta	=	name;
		this.tipoCarta      =   new ImageIcon("typecard");
		
	}
	
	public int getNumero() {
		return numeroCarta;
	}
	
	public String getNombre() {
		return nombreCarta;
	}
}
