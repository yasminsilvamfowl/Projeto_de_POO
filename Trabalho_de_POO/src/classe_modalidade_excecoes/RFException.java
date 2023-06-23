package classe_modalidade_excecoes;

import classe_estudante.Estudante;

public class RFException extends Exception{
	private static final long serialVersionUID = 1L;
	Estudante e;

	public RFException(Estudante e) {
		super("Estudante possui renda acima de 1,5 salarios minimos");
		this.e = e;
	}
	
	public String getNome(){
		return e.getNome();
	}
	
	public float getNota() {
		return e.getNota();
	}

}
