package classe_modalidade;

import classe_estudante.Estudante;
import classe_modalidade_excecoes.*;


// classe para testes
public class MAIN {
	public static void main(String[] args) {
		Estudante eS = new Estudante("Maria", 500, false);
		Estudante eS1 = new Estudante("joao", 200, true);
		Estudante eS2 = new Estudante("pedro", 300, true);
		Estudante eS3 = new Estudante("ryan", 800, true);
		
		AmplaConcorrencia ac = new AmplaConcorrencia(2);
		EscolaPublica es = new EscolaPublica(2);
		es.adicionaEstudante(eS);
		es.adicionaEstudante(eS1);
		es.adicionaEstudante(eS2);
		es.adicionaEstudante(eS3);
		es.Verificacao();
		for(int i = 0; i < es.tamanho() ;i++) {
		   try {
			   es.Colocacao(i);
		   }catch(VIException vi) {
			   System.out.println(vi.getMessage());
			   System.out.println(vi.getNome() + ": " + vi.getNota());
		   }catch(EPException ep) {
			   System.out.println(ep.getMessage());
			   System.out.println(ep.getNome() + ": " + ep.getNota());
		   }
		}

	}
}
