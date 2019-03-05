package design_pattern.estrutural.bridge;

public class ProfessorPosGraduacao extends Professor{

	protected ProfessorPosGraduacao(Implementador imp) {
		super(imp);
	}
	
	public void op() {
		System.out.println("Olá");
		super.imp.opImp();
	}

}
