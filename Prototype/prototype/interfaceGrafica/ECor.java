package prototype.interfaceGrafica;

import java.awt.Color;

/**
 * Classe ECor é uma classe que retorna cores.
 * 
 * @author Fernando Gugel 
 * @version 18 abr 2018 
 */

public class ECor {
	
	private int idCor;
	
	public Color getCor(int idCor) {
		Color saida;
		switch (idCor) {
		case 1:
			saida = Color.RED;
			break;
		case 2:
			saida = Color.BLACK;
			break;
		case 3:
			saida = Color.BLUE;
			break;
		case 4:
			saida = Color.ORANGE;
			break;

		default:
			saida = Color.CYAN;
			break;
		}
		return saida;
	}
}
