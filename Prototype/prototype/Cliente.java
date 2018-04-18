package prototype;

import java.awt.Color;

public class Cliente {

	Cenario cenario;
	
	public Cliente(FormaPrototype prototype) {
		cenario = new Cenario();
		cenario.add(prototype);
	}
	
	public void addTela(FormaPrototype prototype) {
		cenario.add(prototype);
		cenario.revalidate();
		cenario.repaint();
	}
}

