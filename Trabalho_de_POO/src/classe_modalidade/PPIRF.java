package classe_modalidade;

import classe_estudante.Estudante;

public class PPIRF extends RendaFamiliar{
	private String name = "PPI com Baixa Renda";
	public PPIRF(int vagas) {
		super(vagas);
	}

	public Boolean verificaPPI(Estudante e){
		if(e.getEtnia() == "Branco") {
			e.setExc("PPI");
			return false;
		}
	    return true;
	}
	public String getName() {
		return name;
	}
}
