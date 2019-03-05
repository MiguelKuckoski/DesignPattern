package design_pattern.estrutural.bridge;

public class MinhaApp {
	public static void main(String[] args) {
		Professor grad = new ProfessorGraduacao(new ProfessorImplGraduacao());
		grad.op();
	
		Professor pos = new ProfessorPosGraduacao(new ProfessorImpPosGraduacao());
		pos.op();
	}
}
