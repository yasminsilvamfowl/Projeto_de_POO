package classe_instituicao;

import classe_estudante.Estudante;
import classe_modalidade.EscolaPublica;

public class main2 {

	public static void main(String[] args) {
		Estudante eS = new Estudante("Maria", 500, "Privada");
		Estudante eS1 = new Estudante("joao", 200, "Publica");
		Estudante eS2 = new Estudante("pedro", 300, "Publica");
		Estudante eS3 = new Estudante("ryan", 800, "Publica");
		EscolaPublica es = new EscolaPublica(2);
		es.adicionaEstudante(eS);
		es.adicionaEstudante(eS1);
		es.adicionaEstudante(eS2);
		es.adicionaEstudante(eS3);
		es.Verificacao();
		
		arquivoteste e = new arquivoteste();
		e.criaArquivo(es);
		
	}

}
