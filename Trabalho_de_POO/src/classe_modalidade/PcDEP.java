package classe_modalidade;

import classe_estudante.Estudante;

public class PcDEP extends EscolaPublica{
	private String name = "PcD";
	public PcDEP(int vagas) {
		super(vagas);
	}

	public Boolean verificaPcD(Estudante e){
		if(e.isDeficiencia() == false) {
			e.setExc("PcD");
			return false;
		}
	    return true;
	}
	public String getName() {
		return name;
	}
	
}
