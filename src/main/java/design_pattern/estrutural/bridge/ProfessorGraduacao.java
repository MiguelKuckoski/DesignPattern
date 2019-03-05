package design_pattern.estrutural.bridge;

public class ProfessorGraduacao extends Professor{
	
	
	public ProfessorGraduacao(Implementador imp){
		super(imp);
	}
	
	public void op() {
		System.out.println("Olá");
		super.imp.opImp();
	}
}
