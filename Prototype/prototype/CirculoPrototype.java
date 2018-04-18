package prototype;


import java.awt.Color;
import java.awt.Graphics;

public class CirculoPrototype extends FormaPrototype {

	
	public CirculoPrototype() {}
	
	public CirculoPrototype(int x, int y, int largura, int altura) {
		this.altura = altura;
		this.cor = Color.RED;
		this.largura = largura;
		this.x = x;
		this.y = y;
	}
	
	// desenha uma circulo do diâmetro especificado
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(cor);
		g.fillOval(x, y, largura, altura); // desenha um círculo
	}

	@Override
	public FormaPrototype clonar(int x, int y, int largura, int altura) {
		return new CirculoPrototype(x, y,largura, altura);
	}
	
}
