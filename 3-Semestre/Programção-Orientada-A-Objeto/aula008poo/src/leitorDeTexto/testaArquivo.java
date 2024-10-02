package leitorDeTexto;

import java.io.FileNotFoundException;
import java.io.IOException;

public class testaArquivo {
	public static void main(String[] args) {
		try {
			System.out.println(ArquivoUtil.lerArquivo("C:\\teste\\arquivo.txt"));
		} catch (FileNotFoundException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(IOException e) {
			//Aqui trata IOException
		}catch(Exception e) {
			//Aqui trata Exception geral
		}finally {
			System.out.println("Passou no Finnlly");
		}
		System.out.println("Continua executando");
	}
}