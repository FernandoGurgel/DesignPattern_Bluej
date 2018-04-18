package prototype;

import prototype.interfaceGrafica.*;
import prototype.CirculoPrototype;
import prototype.FormaPrototype;
/**
 * Classe cliente cria um novo objeto através de um FormaPrototype que é capaz de clonar a si mesmo.
 * @author Fernando Gugel 
 * @version 18 abr 2018 
*/

public class Cliente {
	/**
	 * Atributo que referencia o a Classe Cenário que cria a tela
	 * 	
	 */
	private Cenario cenario;
	//private CirculoPrototype circulo;
	
	/**
	 * Construtor que instancia a classe cenário
	 */
	public Cliente() {
		cenario = new Cenario();
		//circulo = new CirculoPrototype();
	}
	
	/**
	 * Método para adiciona o objeto Forma Prototype na tela.
	 * 
	 */
	public void addTela(FormaPrototype prototype) {
		cenario.add(prototype);
		cenario.revalidate();
		cenario.repaint();
	}
	
	/**
	 * Método que clonar dois objetos e adicionar na tela utilizando o método clonar.
	 * 
	 */
	public void init() {
		/*FormaPrototype prototype1 = circulo.clonar(10, 10, 20, 20, 1);
		addTela(prototype1);
		FormaPrototype prototype = circulo.clonar(10, 50, 60, 60, 2);
		addTela(prototype);*/
	}
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.init();
	}
}