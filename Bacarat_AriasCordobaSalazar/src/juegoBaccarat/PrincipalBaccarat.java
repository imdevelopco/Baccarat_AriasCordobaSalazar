package juegoBaccarat;

public class PrincipalBaccarat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControlBaccarat c = new ControlBaccarat();
		c.crearMazo();
		System.out.println(c.devolverCarta().getNombre())	;
	}

}
