package classe_modalidade_excecoes;

import classe_estudante.*;

public class EPException extends Exception {

	private static final long serialVersionUID = 1L;
	Estudante e;
	
	public EPException(Estudante e) {
		super("Estudante não estudou em escola publica");
		this.e = e;
	}
	
	public String getNome(){
		return e.getNome();
	}
	
	public float getNota() {
		return e.getNota();
	}

	
}
