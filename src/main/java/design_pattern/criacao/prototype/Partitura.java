package design_pattern.criacao.prototype;

import java.util.HashMap;
import java.util.Map;

public class Partitura {
	private static Map<String, NotaMusical> notaMap = new HashMap<>();
	
	public static void carregaNotas() {
		Do notaDo = new Do();
		Re notaRe = new Re();
		Mi notaMi = new Mi();
		Fa notaFa = new Fa();
		Sol notaSol = new Sol();
		La notaLa = new La();
		Si notaSi = new Si();
		
		notaMap.put("Do", notaDo);
		notaMap.put("Re", notaRe);
		notaMap.put("Mi", notaMi);
		notaMap.put("Fa", notaFa);
		notaMap.put("Sol", notaSol);
		notaMap.put("La", notaLa);
		notaMap.put("Si", notaSi);
	}

	public static NotaMusical getNota(String nome) {
		NotaMusical nota = notaMap.get(nome);
		
		return nota.clone();
	}
}
