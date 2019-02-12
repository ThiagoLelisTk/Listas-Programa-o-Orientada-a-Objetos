package br.com.exercicio3;

import java.text.NumberFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Estacionamento {

	public static void main(String[] args) {
		double total;
		NumberFormat totalFormat = NumberFormat.getCurrencyInstance();
		Calendar cal = Calendar.getInstance();
		int data = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo que ficou no estacionamento em horas:"));
		cal.set(Calendar.HOUR, data );
		int horas = cal.get(Calendar.HOUR);
		if(horas > 3){
			int extrahoras = horas - 3;
			double soma = extrahoras * 0.5;
			total = soma + 2.00;
		} else {
			total = 2.00;
		}
		 JOptionPane.showMessageDialog(null,"Você deverá pagar : "+totalFormat.format(total));
	}


	}

	


