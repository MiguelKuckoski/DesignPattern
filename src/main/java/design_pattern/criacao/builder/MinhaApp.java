package design_pattern.criacao.builder;

public class MinhaApp {

	public static void main(String[] args) {
		Cozinha cozinha = new Cozinha();
		SanduicheBuilder hamb = new HamburguerBuilder();
		SanduicheBuilder fish = new FishBuilder();
		
		cozinha.fazSanduiche(fish);
		fish.getSanduiche();
		cozinha.fazSanduiche(hamb);
		fish.getSanduiche();
	}

}
