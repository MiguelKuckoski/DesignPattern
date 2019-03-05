package design_pattern.comportamental.chainOfResponsability;


class Presidente extends TomadorDeDecisao {

	public void aprova(Compra compra) {
		if (compra.getValor() < 100000F) {
			System.out.println("Compra aprovada pelo Presidente.");
		}

		else {
			System.out.println("Compra nao aprovada.");
		}
	}
}
