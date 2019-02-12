package exe3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;

public class Servidor {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		JFrame janela = new JFrame();
		Servidor server = new Servidor();
		server.esperaCliente();
	}

	public void esperaCliente() {
		OutputStream saida = null;
		ServerSocket socket = null;
		FileInputStream arquivo = null;
		try {
			socket = new ServerSocket(13267);
			System.out.println("Porta de conexao aberta 1337");
			Socket s = socket.accept();
			System.out.println("A conexão foi feita com o cliente");
			byte[] buff = new byte[1024];
			int ler;
			File file = new File("C:\\Users\\jp-to\\OneDrive\\Documentos\\Requisitos.txt");
			arquivo = new FileInputStream(file);
			System.out.println("Lendo...");
			saida = s.getOutputStream();
			// Lendo arquivo criado e enviado para o canal de transferencia
			System.out.println("Enviando...");
			while ((ler = arquivo.read(buff)) != -1) {
				saida.write(buff, 0, ler);
				saida.flush();
			}
			System.out.println("O arquivo foi enviado com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (saida != null) {
				try {
					saida.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (arquivo != null) {
				try {
					arquivo.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}