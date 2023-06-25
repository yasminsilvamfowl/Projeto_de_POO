package classe_modalidade;

import java.util.Vector;
import classe_estudante.*;
import classe_modalidade_excecoes.*;

public class AmplaConcorrencia{
    private Vector<Estudante> estudantes = new Vector<Estudante>();
    private int vagas;
    private String name = "Ampla Concorrencia";
    
	public AmplaConcorrencia(int vagas){
		setVagas(vagas);
	}
	
	
	public void Verificacao() {
		for(int i = 0; estudantes.size() > i; i++) {
			if(!verificaPPI(estudantes.get(i))) {
				Final(i);
			}
			else if(!verificaPcD(estudantes.get(i))){
				Final(i);
			}else if(!verificaRenda(estudantes.get(i))) {
				Final(i);
			}else if(!verificaEscolaPublica(estudantes.get(i))) {
				Final(i);
			}	
		}
	}
	
	public void Final(int i) {
		Estudante e = estudantes.remove(i);
		estudantes.add(e);
		
	}
	
	public void Colocacao(int i) throws VIException, EPException, RFException, PPIException, PcDException {		
			if(estudantes.get(i).getExc() == "EscolaPublica") {
				throw new EPException(estudantes.get(i));
			}
			else if(estudantes.get(i).getExc() == "Renda") {
				throw new RFException(estudantes.get(i));
			}
			else if(estudantes.get(i).getExc() == "PPI") {
				throw new PPIException(estudantes.get(i));
			}
			else if(estudantes.get(i).getExc() == "PcD") {
				throw new PcDException(estudantes.get(i));
			}
			else if(i + 1 > vagas) {
				throw new VIException(estudantes.get(i));
			}
			else {
				estudantes.get(i).setExc("Aprovado(a)");
			}
	}
	
	
	
	public void adicionaEstudante(Estudante e) {
		 if(existe(e.getNome())) 
		        return;
		 estudantes.add(e);
		 OrganizaEstudante();
	}
	
	public void OrganizaEstudante(){
		for(int i =0; i < estudantes.size() - 1; i++ ) {
			int maior = i;
			for(int j = i + 1; j < estudantes.size(); j++) {
				if(estudantes.get(j).getNota() > estudantes.get(maior).getNota()) {
					maior = j;
				}
			}
			if(maior != i) {
				Estudante temp = estudantes.get(i);
				estudantes.set(i, estudantes.get(maior));
				estudantes.set(maior, temp);
			}
		}
	}
	
	public void remover(Estudante est) {
	      if(procurar(est.getNome()) == null || estudantes.isEmpty()) 
	        return;
	      estudantes.remove(est);
	  }

	public Estudante primeiroColocado() {
	      if (estudantes.isEmpty()) {
	        return null;
	      }
	      return estudantes.get(0);
	  }
	
	public Boolean verificaRenda(Estudante e){
	    return true;
	}
	
	public  Boolean verificaEscolaPublica(Estudante e){
	    return true;
	}
	
	public Boolean verificaPPI(Estudante e){
	    return true;
	}
	
	public Boolean verificaPcD(Estudante e){
	    return true;
	}
	
	public boolean existe(String nomeEstudante) {
	    return procurar(nomeEstudante) != null;
	  }
	  
	
	private Estudante procurar(String nomeEstudante) {
	    for (int i = 0; i < estudantes.size(); i++) {
	      if (estudantes.get(i).getNome() == nomeEstudante) {
	        return estudantes.get(i);
	      }
	    }
	    return null;
	  }
	
	public void imprimirLista() {
		for (Estudante estudante : estudantes) {
	        System.out.println(estudante.getNome() + ": " + estudante.getNota());
	    }
	}
	
	public Vector<Estudante> retornaResultado(){
	    return estudantes;
	    
	}
	public int getVagas() {
		return vagas;
	}


	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
	
	public int tamanho() {
		return estudantes.size();
	}


	public String getName() {
		return name;
	}
	
}
