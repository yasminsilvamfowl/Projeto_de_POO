import java.util.Vector;
import java.util.Collections;

public class Lista {
  
  private Vector<Estudante> lista;  
  private int vagas;
  
  public Lista (int vagas){
    lista = new Vector<Estudante>();
    this.vagas = vagas;
  }
  
  // Adiciona e ordena a lista de estudantes em ordem decrescente da nota
  public void adicionar(Estudante est) {
      //execessão de aluno já adicionado
      if(existe(est.getNome())) 
        return;
      lista.add(est);
      Collections.sort(lista, new CompararNotaEstudante());
  }

  //Retorna estudante caso estja no vetor, retorna null caso contrário
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

  //retorna o primeiro colocado da lista
  public Estudante primeiroColocado() {
      if (lista.isEmpty()) {
        return null;
      }
      return lista.get(0);
  }

  // Imprimir os objetos do vetor
  public void imprimirLista(){
    
    //Caso a lista esteja vazia
    if (lista.isEmpty()) {
      System.out.println("lista vazia");
      return;
    }

    //Caso a lista não esteja vazia
    for (Estudante estudante : lista) {
        System.out.println(estudante.getNome() + ": " + estudante.getNota());
    }
  }
  
}