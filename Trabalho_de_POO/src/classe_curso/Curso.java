public class Curso {

  private String nomeDoCurso;
  
  private AmplaConcorrencia listaAC;
  private EscolaPublica listaEP;
  private PPIEP listaPPIEP;
  private PPIRF listaPPIRF;
  private PcDEP listaPcDEP;
  private PcDRF listaPcDRF;
  private RendaFamiliar listaRF;
  private int vagasAC;
  private int vagasEP;
  private int vagasPPIEP;
  private int vagasPPIRF;
  private int vagasPcDEP;
  private int vagasPcDRF;
  private int vagasRF;

  public Curso(String nomeDoCurso, int vagasAC, int vagasEP, int vagasPPIEP, int vagasPPIRF, int vagasPcDEP, int vagasPcDRF, int vagasRF) {
    this.vagasAC = vagasAC;
    this.vagasRF = vagasEP;
    this.vagasAC = vagasPPIEP;
    this.vagasRF = vagasPPIRF;
    this.vagasAC = vagasPcDEP;
    this.vagasRF = vagasPcDRF;
    this.vagasAC = vagasRF;
    listaAC = new AmplaConcorrencia(vagasAC);
    listaEP = new RendaFamiliar(vagasEP);
    listaPPIEP = new RendaFamiliar(vagasPPIEP);
    listaPPIRF = new RendaFamiliar(vagasPPIRF);
    listaPcDEP = new RendaFamiliar(vagasPcDEP);
    listaPcDRF = new RendaFamiliar(vagasPcDRF);
    listaRF = new RendaFamiliar(vagasRF);
    this.nomeDoCurso = nomeDoCurso;
  }

  public void adicionar(Estudante est, String modalidade) {
    if(modalidade == "AC")
      listaAC.adicionaEstudante(est);
    else if(modalidade == "EP") {
      listaEP.adicionaEstudante(est);
    }
    else if(modalidade == "PPIEP") {
      listaPPIEP.adicionaEstudante(est);
    }
    else if(modalidade == "PPIRF") {
      listaPPIRF.adicionaEstudante(est);
    }
    else if(modalidade == "PcDEP") {
      vagasPcDEP.adicionaEstudante(est);
    }
    else if(modalidade == "PcDRF") {
      listaPcDRF.adicionaEstudante(est);
    }
    else if(modalidade == "RF") {
      listaRF.adicionaEstudante(est);
    }
  }

  //Retorna true caso o aluno esteja na lista, retorna null caso contrário
  public boolean existe(String nomeEstudante, String modalidade) {
    if(modalidade == "AC"){
      return listaAC.existe(nomeEstudante);
    }
    else if(modalidade == "EP") {
      return listaEP.existe(nomeEstudante);
    }
    else if(modalidade == "PPIEP") {
      return listaPPIEP.existe(nomeEstudante);
    }
    else if(modalidade == "PPIRF") {
      return listaPPIRF.existe(nomeEstudante);
    }
    else if(modalidade == "PcDEP") {
      return listaPcDEP.existe(nomeEstudante);
    }
    else if(modalidade == "PcDRF") {
      return listaPcDRF.existe(nomeEstudante);
    }
    else if(modalidade == "RF") {
      return listaRF.existe(nomeEstudante);
    }    

    return false;
  }

  //remove estudante
  public void remover(Estudante est, String modalidade) {

    if(modalidade == "AC"){
      listaAC.remover(est);
    }
    else if(modalidade == "EP") {
      listaEP.remover(est);
    }
    else if(modalidade == "PPIEP") {
      listaPPIEP.remover(est);
    }
    else if(modalidade == "PPIRF") {
      listaPPIRF.remover(est);
    }
    else if(modalidade == "PcDEP") {
      listaPcDEP.remover(est);
    }
    else if(modalidade == "PcDRF") {
      listaPcDRF.remover(est);
    }
    else if(modalidade == "RF") {
      listaRF.remover(est);
    }   
         
  }

  //retorna o primeiro colocado da lista
  public Estudante primeiroColocado(String modalidade) {    

    if(modalidade == "AC") {
      return listaAC.primeiroColocado();
    }
    else if(modalidade == "EP") {
      return listaEP.primeiroColocado();
    }
    else if(modalidade == "PPIEP") {
      return listaPPIEP.primeiroColocado();
    }
    else if(modalidade == "PPIRF") {
      return listaPPIRF.primeiroColocado();
    }
    else if(modalidade == "PcDEP") {
      return listaPcDEP.primeiroColocado();
    }
    else if(modalidade == "PcDRF") {
      return listaPcDRF.primeiroColocado();
    }
    else if(modalidade == "RF") {
      return listaRF.primeiroColocado();
    }       
        
    return null;
  }

  // Imprimir os objetos do vetor
  public void imprimirLista(String modalidade){

    if(modalidade == "AC") {
      listaAC.imprimirLista();
    }
    else if(modalidade == "EP") {
      listaEP.imprimirLista();
    }
    else if(modalidade == "PPIEP") {
      listaPPIEP.imprimirLista();
    }
    else if(modalidade == "PPIRF") {
      listaPPIRF.imprimirLista();
    }
    else if(modalidade == "PcDEP") {
      listaPcDEP.imprimirLista();
    }
    else if(modalidade == "PcDRF") {
      listaPcDRF.imprimirLista();
    }
    else if(modalidade == "RF") {
      listaRF.imprimirLista();
    }    
       
  } 
  
  
}
