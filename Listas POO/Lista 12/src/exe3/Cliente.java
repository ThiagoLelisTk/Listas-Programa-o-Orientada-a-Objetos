package exe3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

@SuppressWarnings("unused")
public class Cliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.pegaArquivo();

	}
	void pegaArquivo() {

		Socket sockServer = null;
		FileOutputStream saida = null;
		InputStream input = null;
		try {
			System.out.println("Conectando com Servidor porta 1337");
			sockServer = new Socket("127.0.0.1", 1337);
			input = sockServer.getInputStream();
			saida = new FileOutputStream(new File("C:\\Users\\codigo.zip"));
			System.out.println("O arquivo local foi criado nesse caminho: C:\\Users\\codigo.zip");
			byte[] buff = new byte[1024];
			int ler;
			System.out.println("Recebendo...");
			while ((ler = input.read(buff)) != -1) {
				saida.write(buff, 0, ler);
			}
			System.out.println("Arquivo foi recebido com sucesso!");
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}
}