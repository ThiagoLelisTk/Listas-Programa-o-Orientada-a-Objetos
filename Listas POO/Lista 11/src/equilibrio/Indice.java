package equilibrio;

import java.util.Scanner;

public class Indice {
	
	int A[] = {-7, 1, 5, 2, -4, 3, 0};
	Scanner leitor;
	int soma1 = ((-7) + 1 + 5);
	int soma2 = ((-4) + 3 + 0);
	static int result =  -1;
	
	
	public int equilibrio(int a){
		if(soma1 == result && soma2 == result){
			System.out.println("Os números tem equilibrio");
		}else{
			return -1;
		}
		return a;
	}
	public static void main(String[] args){
		Indice i = new Indice();
		i.equilibrio(result);
		
		
		
	}

}
