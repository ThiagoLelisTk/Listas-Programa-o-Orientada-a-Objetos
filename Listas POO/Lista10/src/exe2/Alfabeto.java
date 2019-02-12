package exe2;

import java.util.Scanner;

public class Alfabeto {
	String letras;
	String[] b = { "a", "b", "d", "e", "g", "o", "p", "q", "4", "6", "9" }, doisB = { "8" };

	public Alfabeto(String palavra) {
		this.letras = palavra;
	}

	public void buracos() {
		int contador = 0;
		String[] letra = letras.split("");
		for (int i = 0; i < letra.length; i++) {
			letra[i] = letra[i].toLowerCase();
			for (int j = 0; j < b.length; j++) {
				try {
					if (letra[i].equals(b[j]))
						contador += 1;
					else if (letra[i].equals(doisB[j]))
						contador += 2;
				} catch (Exception e) {
					if (letra[i].equals(b[j]))
						contador += 1;
				}
			}
		}
		System.out.println("No texto existem: "+ contador + " buracos ");
	}

	}


