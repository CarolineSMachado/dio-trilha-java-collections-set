package set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatoPorNome = new HashSet<>();
		for(Contato c : contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatoPorNome.add(c);
			}
		}
		return contatoPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for(Contato c : contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.exibirContatos();
		
		agendaContatos.adicionarContato("Caroline", 888888);
		agendaContatos.adicionarContato("Maria José", 854888);
		agendaContatos.adicionarContato("Maria de Gaudalupe", 885528);
		agendaContatos.adicionarContato("José", 0000);
		
		agendaContatos.exibirContatos();
		agendaContatos.pesquisarPorNome("Maria");
		System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("José", 887766));
		agendaContatos.exibirContatos();
	}
	
}
