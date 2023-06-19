public class CursoAC {

  private String nomeDoCurso;
  
  private Lista listaAC;
  private int vagasAC;

  public CursoAC(String nomeDoCurso, int vagasAC){
    this.vagasAC = vagasAC;
    this.listaAC = new Lista(vagasAC);
    this.nomeDoCurso = nomeDoCurso;
  }

  public void adicionarAC(Estudante est) {
      listaAC.adicionar(est);
  }

  //Retorna true caso o aluno esteja na lista, retorna null caso contrário
  public boolean existeAC(String nomeEstudante) {
    return listaAC.existe(nomeEstudante);
  }
  
  //remove estudante
  public void removerAC(Estudante est) {
      listaAC.remover(est);
  }

  //retorna o primeiro colocado da lista
  public Estudante primeiroColocadoAC() {    
      return listaAC.primeiroColocado();
  }

  // Imprimir os objetos do vetor
  public void imprimirListaAC(){
    listaAC.imprimirLista();
  } 
  
  
}