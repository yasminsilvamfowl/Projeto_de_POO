package classe_modalidade;

import classe_estudante.Estudante;

public class EscolaPublica extends AmplaConcorrencia {
	public EscolaPublica(int vagas) {
		super(vagas);
	}
	
	public  Boolean verificaEscolaPublica(Estudante e){
		if(e.isEscolaPublica() == false) {
			e.setExc("EscolaPublica");
			return false;
		}
		return true;
	}
}
