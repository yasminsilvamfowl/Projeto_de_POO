package classe_modalidade;

import classe_estudante.Estudante;

public class PPIEP extends EscolaPublica{

	public PPIEP(int vagas) {
		super(vagas);
	}


	public Boolean verificaPPI(Estudante e){
		if(e.getEtnia() == "Branco") {
			e.setExc("PPI");
			return false;
		}
	    return true;
	}
	




}
