import java.util.Vector;
import java.util.Collections;

public class Curso {
  
  private Vector<Estudante> lista;
  private String nomeDoCurso;
  private int vagas;

  public Curso(String nomeDoCurso, int vagas){
    lista = new Vector<Estudante>();
    this.nomeDoCurso = nomeDoCurso;
    this.vagas = vagas;
  }

  // Adiciona e ordena o vetor de estudantes em ordem decrescente da nota
  public void adicionar(Estudante est) {
      //aluno já adicionado
      if(existe(est.getNome())) 
        return;
      lista.add(est);
      Collections.sort(lista);
  }

  //Retorna estudante caso estja no vetor, retorna null caso contrário
  //Parâmetro: nome do aluno
  private Estudante procurar(String nomeEstudante) {
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i).getNome() == nomeEstudante) {
        return lista.get(i);
      }
    }
    return null;
  }

  //Retorna true caso o aluno esteja na lista, retorna null caso contrário
  public boolean existe(String nomeEstudante) {
    return procurar(nomeEstudante) != null;
  }
  
  //remove estudante
  public void remover(Estudante est) {
      //Caso o aluno não esteja na lista
      if(procurar(est.getNome()) == null || lista.isEmpty()) 
        return;
      lista.remove(est);
  }

  // Imprimir os objetos do vetor
  public void imprimirLista(){
    
    //Caso a lista esteja vazia
    if (lista.isEmpty()) {
      System.out.println("Lista vazia");
      return;
    }

    //Caso a lista não esteja vazia
    for (Estudante estudante : lista) {
        System.out.println(estudante.getNome() + ": " + estudante.getNota());
    }
  }
  
}