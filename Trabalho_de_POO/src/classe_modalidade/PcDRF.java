package classe_modalidade;

import classe_estudante.Estudante;

public class PcDRF extends RendaFamiliar {

	public PcDRF(int vagas) {
		super(vagas);
	}
	
	public Boolean verificaPcD(Estudante e){
		if(e.isDeficiencia() == false) {
			e.setExc("PcD");
			return false;
		}
	    return true;
	}

}
