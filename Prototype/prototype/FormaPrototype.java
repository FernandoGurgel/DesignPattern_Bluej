package prototype;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Classe FormaPrototype que declara uma interface para objetos capazes de clonar a si mesmo.
 * @author Fernando Gugel 
 * @version 18 abr 2018 
 */

public abstract class FormaPrototype extends JPanel{
    
    protected Color cor;
    protected int x;
    protected int y;
    protected int altura;
    protected int largura;
    
    /**
     * Método responsável desenha.
     * 
     */
    public abstract void paintComponent(Graphics g);
    
    /**
         * Método para clona o objeto.
         * @param  x  posicionamento do elemento na tela no eixo X 
         * @param  y  posicionamento do elemento na tela no eixo Y
         * @param  largura tamanho do elemento largura
         * @param  altura altura do elemento
         * @param  cor (1-Vermelho; 2-Preto; 3-Azul, 4-Laranja)
         * 
         * @returna objeto FormaPrototype
         */
    public abstract FormaPrototype clonar(int x, int y, int largura, int altura, int cor);
}