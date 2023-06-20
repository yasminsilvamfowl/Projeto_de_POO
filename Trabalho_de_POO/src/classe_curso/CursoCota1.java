public class CursoCota1 extends CursoAC {

  private Lista listaC1;
  private int vagasC1;

  public CursoCota1(String nomeDoCurso, int vagasAC, int vagasC1){
    super(nomeDoCurso,vagasAC);
    this.vagasC1 = vagasC1;
    this.listaC1 = new Lista(vagasC1);
  }

  public void adicionarC1(Estudante est) {
      listaC1.adicionar(est);
  }

  //Retorna true caso o aluno esteja na lista, retorna null caso contrário
  public boolean existeC1(String nomeEstudante) {
    return listaC1.existe(nomeEstudante);
  }
  
  //remove estudante
  public void removerC1(Estudante est) {
      listaC1.remover(est);
  }

  //retorna o primeiro colocado da lista
  public Estudante primeiroColocadoC1() {    
      return listaC1.primeiroColocado();
  }

  // Imprimir os objetos do vetor
  public void imprimirListaC1(){
    listaC1.imprimirLista();
  }
}