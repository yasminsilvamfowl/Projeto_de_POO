package Estudantes;

public class Estudante {
	
	private String nome; //nome publico
	private float nota; //nota do Enem
	
	public static void main(String[] args ) {
	}
	
	public Estudante(String nome, float nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	public int compararEstudante (Estudante outroEstudante) {
		return Float.compare(outroEstudante.getNota(), this.nota);
		//0: if f1 is numerically equal to f2.
		//Negative value: if f1 is numerically less than f2.
		//Positive value: if f1 is numerically greater than f2.
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public float getNota() {
		return this.nota;
	}
}
