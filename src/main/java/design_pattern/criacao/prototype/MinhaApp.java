package design_pattern.criacao.prototype;

public class MinhaApp {

	public static void main(String[] args) {
		Partitura.carregaNotas();
		
		Partitura.getNota("Do").desenha();
		Partitura.getNota("Re").desenha();
		Partitura.getNota("Re").desenha();
		Partitura.getNota("Sol").desenha();
		Partitura.getNota("Re").desenha();
		Partitura.getNota("Si").desenha();
		Partitura.getNota("Do").desenha();
		Partitura.getNota("Sol").desenha();
		Partitura.getNota("Re").desenha();
	}

}
