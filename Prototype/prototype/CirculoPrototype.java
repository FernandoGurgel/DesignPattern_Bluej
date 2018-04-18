package prototype;

import prototype.interfaceGrafica.*;
import java.awt.Graphics;
/**
 * implementação de um Formaprototype
 * @author Fernando Gugel 
 * @version 18 abr 2018 
 */

public class CirculoPrototype extends FormaPrototype {

	
	public CirculoPrototype() {}
	
	/**
	 * Construtor inicializar os atributos tais como o posicionamento do elemento na tela X e Y,
	 * para o tamanho do elemento os atributos encarregados são largura e altura, 
	 * Cor será passado através de um inteiro que retorna a cor correspondente. 
	 * (1-Vermelho; 2-Preto; 3-Azul, 4-Laranja)
	 */
	public CirculoPrototype(int x, int y, int largura, int altura, int cor) {
		this.altura = altura;
		this.cor = new ECor().getCor(cor);
		this.largura = largura;
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Método responsável desenha uma circulo do diâmetro especificado(non-Javadoc)
	 * 
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(cor);
		g.fillOval(x, y, largura, altura); // desenha um círculo
	}

	/**
	 * Método para clona o objeto com atributos tais como o posicionamento do elemento na tela X e Y,
	 * para o tamanho do elemento os atributos encarregados são largura e altura, 
	 * Cor será passado através de um inteiro que retorna a cor correspondente. 
	 * (1-Vermelho; 2-Preto; 3-Azul, 4-Laranja)
	 */
	@Override
	public FormaPrototype clonar(int x, int y, int largura, int altura, int cor) {
		return new CirculoPrototype(x, y,largura, altura,cor);
	}
	
}