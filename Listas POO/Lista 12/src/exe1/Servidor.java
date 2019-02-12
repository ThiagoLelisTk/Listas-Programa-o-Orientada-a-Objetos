package exe1;

import java.io.InputStream;
import java.util.Scanner;

public class Servidor implements Runnable {
	 
	   private InputStream servidor;
	 
	   public Servidor(InputStream servidor) {
	     this.servidor = servidor;
	   }
	 
	   public void run() {
	     // recebe msgs do servidor e imprime na tela
	     Scanner s = new Scanner(this.servidor);
	     while (s.hasNextLine()) {
	       System.out.println(s.nextLine());
	     }
	   }
	 }