package design_pattern.criacao.singleton;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Janela extends JFrame{

	private static Janela janela = null;
	
	private Janela () {
		setPreferredSize(new Dimension(640, 400));
	}
	
	public static Janela getInstance() {
		if(janela == null) {
			janela = new Janela();
		}
		return janela;
	}

	
}
