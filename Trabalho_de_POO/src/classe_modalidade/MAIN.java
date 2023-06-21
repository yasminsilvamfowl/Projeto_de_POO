package classe_modalidade;

import classe_estudante.Estudante;

// classe para testes
public class MAIN {
	public static void main(String[] args) {
		Estudante eS = new Estudante("Maria", 500);
		Estudante eS1 = new Estudante("joao", 200);
		Estudante eS2 = new Estudante("pedro", 300);
		Estudante eS3 = new Estudante("ryan", 800);
		
		AmplaConcorrencia ac = new AmplaConcorrencia();
		EscolaPublica es = new EscolaPublica();
		ac.adicionaEstudante(eS);
		ac.adicionaEstudante(eS1);
		es.adicionaEstudante(eS2);
		es.adicionaEstudante(eS3);
		es.OrganizaEstudante();
		es.imprimirLista();

	}
}
