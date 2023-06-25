package classe_instituicao;

import classe_estudante.Estudante;
import classe_modalidade.*;

public class main2 {

	public static void main(String[] args) {
		Estudante eS = new Estudante("Maria", 500, "Privada");
		Estudante eS1 = new Estudante("joao", 200, "Publica");
		Estudante eS2 = new Estudante("pedro", 300, "Publica");
		Estudante eS3 = new Estudante("ryan", 800, "Publica");
		PcDEP KN = new PcDEP(1);
		EscolaPublica es = new EscolaPublica(2);
		es.adicionaEstudante(eS);
		KN.adicionaEstudante(eS1);
		KN.adicionaEstudante(eS2);
		es.adicionaEstudante(eS3);
		es.Verificacao();
		
		arquivoteste e = new arquivoteste();
		e.criaArquivo();
		e.escreveArquivo(es);
		e.escreveArquivo(KN);
		
	}

}
