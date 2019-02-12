package exercicios;

public class Triangulo {

	public void Hipotenusa(int x, int y, int z){
		if(x == 0 || y == 0 || z == 0){
			System.out.println("Digite numeros diferentes de zero");
		}else{
			if(x > y && x > z) {

				if(y*y + z*z == x*x){
					System.out.println("Os numeros formam triangulo retangulo");
				}
				else{
					System.out.println("Os numeros não formam triangulo retangulo");
				}
			}else if(y > x && y > z) {
				if(x*x + z*z == y*y){
					System.out.println("Os numeros formam triangulo retangulo");
				}
				else{
					System.out.println("Os numeros não formam triangulo retangulo");
				}
			}else if(z > x && z > y) {
				if(x*x + y*y == z*z){
					System.out.println("Os numeros formam triangulo retangulo");
				}
				else{
					System.out.println("Os numeros não formam triangulo retangulo");
				}
			}else {
				System.out.println("Esses numeros não podem formar um triangulo retangulo");
			}
		}
	}

}
