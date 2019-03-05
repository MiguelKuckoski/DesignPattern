package design_pattern.criacao.singleton;

public class MinhaApp {

	public static void main(String[] args) {
//		Janela janela = new Janela();

		Janela j1 = Janela.getInstance();
		j1.pack();
		j1.setVisible(true);
		
		Janela j2 = Janela.getInstance();
		j2.pack();
		j2.setVisible(true);
	}

}
