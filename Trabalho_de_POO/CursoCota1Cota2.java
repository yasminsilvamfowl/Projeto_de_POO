public class CursoCota1Cota2 extends CursoCota1 {

  private Lista listaC2;
  private int vagasC2;

  public CursoCota1Cota2(String nomeDoCurso, int vagasAC, int vagasC1, int vagasC2){
    super(nomeDoCurso,vagasAC,vagasC1);
    this.vagasC2 = vagasC2;
    this.listaC2 = new Lista(vagasC2);
  }

  public void adicionarC2(Estudante est) {
      listaC2.adicionar(est);
  }

  //Retorna true caso o aluno esteja na lista, retorna null caso contrário
  public boolean existeC2(String nomeEstudante) {
    return listaC2.existe(nomeEstudante);
  }
  
  //remove estudante
  public void removerC2(Estudante est) {
      listaC2.remover(est);
  }

  //retorna o primeiro colocado da lista
  public Estudante primeiroColocadoC2() {    
      return listaC2.primeiroColocado();
  }

  // Imprimir os objetos do vetor
  public void imprimirListaC2(){
    listaC2.imprimirLista();
  }
}