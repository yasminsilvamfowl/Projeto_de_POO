package classe_modalidade;

import classe_estudante.Estudante;
import classe_modalidade_excecoes.VIException;

import java.util.Vector;

// classe para testes
public class MAIN {
	public static void main(String[] args) {
		Estudante eS = new Estudante("Maria", 500);
		Estudante eS1 = new Estudante("joao", 200);
		Estudante eS2 = new Estudante("pedro", 300);
		Estudante eS3 = new Estudante("ryan", 800);
		
		AmplaConcorrencia ac = new AmplaConcorrencia(2);
		EscolaPublica es = new EscolaPublica(2);
		es.adicionaEstudante(eS);
		es.adicionaEstudante(eS1);
		es.adicionaEstudante(eS2);
		es.adicionaEstudante(eS3);
		for(int i = 0; i < es.tamanho() ;i++) {
		   try {
			   Estudante e = es.Colocacao(i);
		   }catch(VIException vi) {
			   System.out.println(vi.getMessage());
			   System.out.println(vi.getNome() + ": " + vi.getNota());
		   }
		}

	}
}
