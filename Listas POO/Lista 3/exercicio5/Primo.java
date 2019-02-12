package br.com.exercicio5;

public class Primo {

	public static void main(String[] args) {
		System.out.println("Numeros primos: ");
		for(int x = 2; x<= 1000; x++ )
            if (primo(x) == true) 
            	System.out.println(x);    
 }
	public static boolean primo(int num){
     boolean primo;
     int cont = 0;
     int x = 1;
     while(x <= num)  
     {
         if (num  % x == 0)  cont++; 
         x++;
     }
     if (cont <= 2){ 
    	 primo = true;
     }
     else {
    	 primo = false;
     }
     return primo;
 }
}