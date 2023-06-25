package classe_modalidade;

import classe_estudante.Estudante;

public class RendaFamiliar extends EscolaPublica{
	private String name = "Baixa Renda";
	public RendaFamiliar(int vagas) {
		super(vagas);
	}
	
	public Boolean verificaRenda(Estudante e){
		if(e.getRenda() > 1950) {
			e.setExc("Renda");
			return false;
		}
	    return true;
	}
	
	public String getName() {
		return name;
	}
}
