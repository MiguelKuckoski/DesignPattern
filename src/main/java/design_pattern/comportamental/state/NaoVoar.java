package design_pattern.comportamental.state;


public class NaoVoar extends Comportamento{
	public void exec() {
		System.out.println("Esta ave nao voa :(");
	}
}
