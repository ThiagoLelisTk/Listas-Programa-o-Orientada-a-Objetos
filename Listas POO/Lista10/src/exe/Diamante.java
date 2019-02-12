package exe;

public class Diamante {
	private char alfabeto;
	private char[] a = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
			'U', 'V', 'W', 'X', 'Y', 'Z' };

	public Diamante(char letra) {
		this.alfabeto = letra;
	}

	public void mostrar() {
		int i = alfabeto - 65;
		if (i > 0) {
			for (int j = 0; j <= i; j++) {
				for (int k = j; k < i; k++) {
					System.out.printf(" ");
				}
				System.out.print(a[j]);
				for (int k = 1; k <= j * 2; k++) {
					System.out.printf(" ");
				}
				if (j != 0)
					System.out.print(a[j]);
				System.out.println();
			}
			for (int j = i - 1; j >= 0; j--) {
				for (int k = j; k < i; k++) {
					System.out.printf(" ");
				}
				System.out.print(a[j]);
				for (int k = 1; k <= j * 2; k++) {
					System.out.printf(" ");
				}
				if (j != 0)
					System.out.print(a[j]);
				System.out.println();
			}
		}
		else
			System.out.println(alfabeto);
	}
	public static void main(String[] args){
		Diamante d;
		char ch = 'Z';
		d = new Diamante(ch);
		d.mostrar();
		
	}
	
}
