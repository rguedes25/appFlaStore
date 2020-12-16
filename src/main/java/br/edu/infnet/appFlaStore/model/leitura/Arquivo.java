package src.main.java.br.edu.infnet.appFlaStore.model.leitura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.edu.infnet.appLanche.model.exception.AdicionalCaldaInvalidaException;
import br.edu.infnet.appLanche.model.exception.MedidaNegativaException;
import br.edu.infnet.appLanche.model.exception.PorcaoInvalidaException;
import br.edu.infnet.appLanche.model.negocio.Bebida;
import br.edu.infnet.appLanche.model.negocio.Comida;
import br.edu.infnet.appLanche.model.negocio.Sobremesa;

public class Arquivo {

	public static void main(String[] args) {
		String dir = "C:\\Users\\Usuário\\Desktop\\Estudos Java\\eclipse-workspace\\AT\\appFlaStore";
		
		String arquivo = "pedidos.txt";
		
		try {
			FileReader leitura = new FileReader(dir+arquivo);			
			BufferedReader in = new BufferedReader(leitura);
			
			FileWriter escrita = new FileWriter(dir+"out_"+arquivo);
			BufferedWriter out = new BufferedWriter(escrita);
			
			String linha = in.readLine();
			
			while(linha != null) {
				String[] campos = linha.split(";");
				
				if(campos.length != 5) {
					switch (campos[0].toUpperCase()) {
					case "B":
						Chuteira chuteira = new Chuteira(campos[1], Float.valueOf(campos[2]), Boolean.valueOf(campos[3]));
						chuteira.setMedida(Float.valueOf(campos[4]));
						chuteira.setMarca(campos[5]);
						
						out.write(bebida.obterValorProduto());
						break;

					case "C":
						Bola bola = new Bola(campos[1], Float.valueOf(campos[2]), Boolean.valueOf(campos[3]));
						bola.setPersonalizada(Boolean.valueOf(campos[4]));
						bola.setTamanho(Integer.valueOf(campos[5]));

						out.write(bola.obterValorProduto());
						break;

					case "S":
						Camisa camisa = new Camisa(campos[1], Float.valueOf(campos[2]), Boolean.valueOf(campos[3]));
						camisa.setMangaLonga(Boolean.valueOf(campos[4]));
						camisa.setTamanho(Float.valueOf(campos[5]));

						out.write(camisa.obterValorProduto());
						break;
						
					default:
						break;
					}
				}
				
				linha = in.readLine();
			}

			in.close();
			leitura.close();
			out.close();
			escrita.close();
			System.out.println(args.length == 1 ? args[0] : "Pronto!!!");
			
		} catch (IOException | MedidaInvalidaException | PorcaoInvalidaException | NumeroCamisaException e) {
			System.out.println(e.getMessage());
		}		
	}
}