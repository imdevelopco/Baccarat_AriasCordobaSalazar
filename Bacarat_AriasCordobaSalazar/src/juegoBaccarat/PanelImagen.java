package juegoBaccarat;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelImagen extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		Font font = new Font(Font.DIALOG,Font.BOLD+Font.ITALIC,25);
		Font font2 = new Font(Font.DIALOG,Font.BOLD+Font.ITALIC,20);

		g.setFont(font);
		
		g.drawString("Mano Jugador", 10, 30);
		
		g.drawRect(30, 50, 300, 150);
		
		g.drawString("Mano Banca", 500, 30);
		
		g.drawRect(370, 50, 300, 150);
				
		g.drawString("Apuestas:", 50, 300);
		g.setFont(font2);
		g.drawString("Banca     =", 50, 330);
		g.drawString("Jugador  =", 50, 350);
		g.drawString("Empate   =", 50, 370);
		g.drawString("Saldo =", 50, 420);


		
	}

}