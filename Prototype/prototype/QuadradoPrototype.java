package prototype;

import java.awt.Graphics;
import prototype.interfaceGrafica.*;
/**
 * implementação de um Formaprototype
 * @author Fernando Gugel 
 * @version 18 abr 2018 
 */

public class QuadradoPrototype extends FormaPrototype {

    public QuadradoPrototype() {}
    

    /**
     * Construtor inicializar os atributos tais como o posicionamento do elemento na tela X e Y,
     * para o tamanho do elemento os atributos encarregados são largura e altura, 
     * Cor será passado através de um inteiro que retorna a cor correspondente. 
     * (1-Vermelho; 2-Preto; 3-Azul, 4-Laranja)
     */
    public QuadradoPrototype(int x, int y, int largura, int altura, int cor) {
        this.altura = altura;
        this.cor = new ECor().getCor(cor);
        this.largura = largura;
        this.x = x;
        this.y = y;
    }
    
    /**
     * Método responsável desenha uma quadrado do diâmetro especificado(non-Javadoc)
     * 
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        g.setColor(cor);
        g.drawRect(x, y, largura, altura); // desenha um quadrado 
    }

    /**
     * Método para clona o objeto.
     * @param  x  posicionamento do elemento na tela no eixo X 
     * @param  y  posicionamento do elemento na tela no eixo Y
     * @param  largura tamanho do elemento largura
     * @param  altura altura do elemento
     * @param cor (1-Vermelho; 2-Preto; 3-Azul, 4-Laranja)
     * 
     * @returna objeto FormaPrototype
     */
    @Override
    public FormaPrototype clonar(int x, int y, int largura, int altura, int cor) {
        return new QuadradoPrototype(x, y,largura, altura, cor);
    }
    
}
