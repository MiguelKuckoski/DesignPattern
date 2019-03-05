package design_pattern.comportamental.mediator;


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class ChatMediator extends Mediator {

	private Hashtable<String, Participante> participantes = new Hashtable<String, Participante>();
	
	private List<String> palavrasProibidas = new ArrayList<String>();
	
	public ChatMediator() {
		palavrasProibidas.add("xxxxx");
		palavrasProibidas.add("@!xxx");
		palavrasProibidas.add("###@!");
	}
	
	public void registraParticipante(Participante p) {
		if(!participantes.containsKey(p.getNome())){
			participantes.put(p.getNome(), p);
		}
		else{
			System.out.println("Usuario ja cadastrado.");
		}
	}
	
	public void enviaMensagem(String remetente, String destinatario, String mensagem) {
		if(participantes.containsKey(remetente) && participantes.containsKey(destinatario)){
			Participante pRemetente = participantes.get(remetente);
			Participante pDestinatario = participantes.get(destinatario);
			
			for(String proibido : palavrasProibidas){
				if(mensagem.contains(proibido)){
					pRemetente.recebeMensagem("Mediador", "Voce escreveu uma mensagem contendo palavras improprias.");
					return;
				}
			}
			
			pDestinatario.recebeMensagem(remetente, mensagem);
		}
	}

}
