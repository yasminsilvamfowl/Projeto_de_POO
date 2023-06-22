package classe_sisu;

import java.util.Vector;
import classe_instituicao.*;

// Cadastrar, Listar e Excluir Instituições Superiores
public class Sisu {

	private Vector<Instituicao> listaInstituicoes;
	private boolean estaAbertoInscricoes;

	public Sisu() {
		listaInstituicoes = new Vector<Instituicao>();
		estaAbertoInscricoes = true;
	}

	public Instituicao procurar(String instituicao) {
		
		if (listaInstituicoes.size() <= 0) {
			return null;
		}
		
		for(int i = 0; i < listaInstituicoes.size(); i++) {
			if(listaInstituicoes.get(i).getNome().equals(instituicao)) {				
				return listaInstituicoes.get(i);
			}
		}
		
		return null;
	}

	public void adicionarInstituicao(Instituicao instituicao) {
		if(estaAbertoInscricoes == true) {
			if(procurar(instituicao.getNome()) == null) {				
				listaInstituicoes.add(instituicao);
			}else {
				System.out.println("A instituicao ja foi cadastrada");
			}
		}else {
			System.out.println("O Sisu esta encerrado!");
		}
	}

	public void removerInstituicao(Instituicao instituicao) {
		if(estaAbertoInscricoes == true) {
			if(procurar(instituicao.getNome()) != null) {
				listaInstituicoes.remove(instituicao);
			}else {
				System.out.println("Não foi possivel remover o elemento no momento");
			}
		}else {
			System.out.println("O Sisu esta encerrado!");
		}
		
	}

	public void listarInstituicoes() {
		
		if(estaAbertoInscricoes == true) {
			//Caso a lista esteja vazia
		    if (listaInstituicoes.isEmpty()) {
		      System.out.println("lista vazia");
		      return;
		    }
		
		    //Caso a lista não esteja vazia
		    for (Instituicao instituicao : listaInstituicoes) {
		        System.out.println(instituicao.getNome());
		    }
		}else {
			System.out.println("O Sisu esta encerrado!");
		}
		
	}

	public boolean getEstaAbertoInscricoes() {
		return this.estaAbertoInscricoes;
	}

	public void setEstaAbertoInscricoes(boolean estaAbertoInscricoes) {
		this.estaAbertoInscricoes = estaAbertoInscricoes;
	}
}