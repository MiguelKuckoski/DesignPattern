package design_pattern.estrutural.adapter;

public abstract class Tomada <P>{
	public abstract String conecta(P plug);
	
	public abstract String getNomeRede();
}
