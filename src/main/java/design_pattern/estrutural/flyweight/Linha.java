package design_pattern.estrutural.flyweight;

public class Linha extends Figura {

	public Linha(){
		super();
	}
	
	public void desenha(String cor) {
		System.out.println("Figura linha " + cor);
	}

}
