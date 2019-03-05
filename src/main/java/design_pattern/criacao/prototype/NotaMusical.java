package design_pattern.criacao.prototype;

public abstract class NotaMusical implements Cloneable{

	public NotaMusical clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (NotaMusical) clone;
		
	}
	
	public abstract void desenha();
}
