package prototype;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class FormaPrototype extends JPanel{
	
	protected Color cor;
	protected int x;
	protected int y;
	protected int altura;
	protected int largura;
	
	
	public abstract void paintComponent(Graphics g);
	
	public abstract FormaPrototype clonar(int x, int y, int largura, int altura);
}