package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for(Convidado c : convidadoSet) {
			if(c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		
		System.out.println("Foram convidados " + conjuntoConvidados.contarConvidados() + " pessoas para o evento.");
		
		conjuntoConvidados.adicionarConvidado("Clara", 154);
		conjuntoConvidados.adicionarConvidado("Bárbara", 154);
		conjuntoConvidados.adicionarConvidado("Gonzaga", 887);
		conjuntoConvidados.adicionarConvidado("Fábio", 245);
		conjuntoConvidados.adicionarConvidado("Tomás", 678);
		
		conjuntoConvidados.exibirConvidados();
		conjuntoConvidados.removerConvidadoPorCodigoConvite(245);
		System.out.println("Foram convidados " + conjuntoConvidados.contarConvidados() + " pessoas para o evento.");
		conjuntoConvidados.exibirConvidados();
	}
	
}
