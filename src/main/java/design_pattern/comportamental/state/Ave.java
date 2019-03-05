package design_pattern.comportamental.state;


public abstract class Ave{
	public abstract void setComportamentoVoar(Comportamento c);
	public abstract void voar();
	public abstract void setComportamentoGrasnar(Comportamento c);
	public abstract void grasnar();
}
