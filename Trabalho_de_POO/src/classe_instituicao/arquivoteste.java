package classe_instituicao;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Vector;

import classe_estudante.Estudante;

import java.io.IOException;
import java.io.File;
import classe_modalidade_excecoes.*;
import classe_modalidade.*;


public class arquivoteste {
	File file;
	FileWriter ler;
	public arquivoteste() {
		
		
	}
	
	public void criaArquivo() {
		try {
			file = new File("Testes.txt");
			file.createNewFile();
		}catch(IOException io) {
			System.out.println("erro");
		}
	}
	public void escreveArquivo(AmplaConcorrencia es) {
		
		try {
			
			FileWriter ler = new FileWriter(file, true);
			PrintWriter lerb = new PrintWriter(ler);
			Vector <Estudante> est = es.retornaResultado();
			lerb.println(es.getName());
			for(int i = 0; i < es.tamanho() ;i++) {
				   try {
					   es.Colocacao(i);
					   lerb.println(est.get(i).getNome() + ":" + est.get(i).getNota() + "----" + est.get(i).getExc());
				   }catch(VIException vi) {
					   lerb.println(vi.getNome() + ": " + vi.getNota() + "----" + vi.getMessage());
				   }catch(EPException ep) {
					   lerb.println(ep.getNome() + ": " + ep.getNota() + "----" + ep.getMessage());
				   }catch(PPIException ppi) {
					   lerb.println(ppi.getNome() + ": " + ppi.getNota() + "----" + ppi.getMessage());
				   }catch(PcDException pcd) {
					   lerb.println(pcd.getNome() + ": " + pcd.getNota() + "----" + pcd.getMessage());
				   }catch(RFException rf) {
					   lerb.println(rf.getNome() + ": " + rf.getNota() + "----" + rf.getMessage());
				   }
				}
			
			ler.close();
			lerb.close();
		}catch(IOException io) {
			System.out.println("erro");
		}
	}
	
	
}
