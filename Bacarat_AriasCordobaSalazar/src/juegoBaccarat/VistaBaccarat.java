package juegoBaccarat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VistaBaccarat extends JFrame{


	private int saldo=100;
	private JButton apostarJugador;
	private JButton apostarBanca; 
	private JButton pedirCarta;
	// Tamaño del JFrame
	private int ancho = 520, largo = 700;
	private JLabel title;
	private PanelImagen panel;
	private ControlBaccarat control;
	
	private int apuesta=50;
	
	public VistaBaccarat() {
		
		super ("Casino!");
		initGUI();
		pack();
		
		this.setSize(largo,ancho);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		
	}
	
	public void initGUI() {
		
		this.getContentPane().setBackground(Color.GREEN.darker().darker()); //cambiar el color del JFrame

		Font font = new Font(Font.DIALOG,Font.BOLD+Font.ITALIC,25);
		
		title = new JLabel("¡Casino \" la Bendicion\" !");
		title.setForeground(Color.RED.darker());
		title.setFont(font);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(title,BorderLayout.NORTH);
		
		panel = new PanelImagen();
		//panel.setBackground(Color.GREEN.darker().darker());
		panel.setLayout(null);
		this.add(panel);
		
		pedirCarta = new JButton("JUGAR");
		pedirCarta.setBackground(Color.ORANGE);
		pedirCarta.setBounds(550, largo/2 +40,100,30);
		panel.add(pedirCarta);
		
		apostarBanca = new JButton("<html><p>+ 50</p>BANCA</html>");
		apostarBanca.setBackground(Color.ORANGE);
		apostarBanca.setBounds(430, largo/2 +40,100,50);
		panel.add(apostarBanca);
		
		apostarJugador = new JButton("<html><p>+ 50</p>JUGADOR</html>");
		apostarJugador.setBackground(Color.ORANGE);
		apostarJugador.setBounds(310, largo/2 +40,100,50);
		panel.add(apostarJugador);
		
		JTextField cuadroTexto0 = new JTextField(50);
		cuadroTexto0.setText(String.valueOf(saldo));
		cuadroTexto0.setBounds(160, 310, 100, 20);
		panel.add(cuadroTexto0);
		
		JTextField cuadroTexto1 = new JTextField(50);
		cuadroTexto1.setText(String.valueOf(saldo));
		cuadroTexto1.setBounds(160, 330, 100, 20);
		panel.add(cuadroTexto1);
		
		JTextField cuadroTexto2 = new JTextField(50);
		cuadroTexto2.setText(String.valueOf(saldo));
		cuadroTexto2.setBounds(160, 350, 100, 20);
		panel.add(cuadroTexto2);
		
		JTextField cuadroTexto3 = new JTextField(50);
		cuadroTexto3.setText(String.valueOf(saldo));
		cuadroTexto3.setBounds(130, 400, 100, 20);
		panel.add(cuadroTexto3);
		
	}



	
	private class EscuchaMouse implements MouseListener{
		
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		control.iniciarJogo();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
}



