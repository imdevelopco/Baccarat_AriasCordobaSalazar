package juegoBaccarat;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VistaBaccarat extends JFrame{


	private JButton pedirCarta;
	// Tamaño del JFrame
	private int ancho = 900, largo = 900;
	private JLabel title;
	private JPanel panelCartas;
	
	
	
	public VistaBaccarat() {
		
		super ("Casino!");
		initGUI();
		//pack();
		
		this.setSize(largo,ancho);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setVisible(true);
		
	}
	
	public void initGUI() {

		title = new JLabel("¡Casino \" la Bendicion\" !");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(title,BorderLayout.NORTH);
		
		panelCartas = new JPanel();
		panelCartas.setBackground(Color.GREEN.darker());
		panelCartas.setLayout(null);
		this.add(panelCartas);
		
		pedirCarta = new JButton("Apostar");
		pedirCarta.setBackground(Color.ORANGE);

		pedirCarta.setBounds(ancho-100, largo/2,80,30);
		panelCartas.add(pedirCarta);
		
		
	}
}
