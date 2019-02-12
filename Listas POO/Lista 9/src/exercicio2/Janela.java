package exercicio2;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela extends JFrame implements ActionListener{
	private JButton j1, j2;
	private int contador = 0;
	private JLabel lcontador;
	
	public Janela(){
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 3));
		j1 = new JButton("Somar");
		j2 = new JButton("Subtrair");
		lcontador = new JLabel(""+contador);
		c.add(j1); c.add(j2); c.add(lcontador);
		j1.addActionListener(this); j2.addActionListener(this);
		pack();
		setVisible(true);
		setDefaultCloseOperation(3);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == j1){
			contador++;
		}
		else if(e.getSource() ==  j2){
			contador--;
		}
		lcontador.setText(""+contador);
		
	}
	
	public static void main(String[] args){
		Janela j = new Janela();
	}

}
