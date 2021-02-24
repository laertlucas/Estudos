import javax.swing.JOptionPane;

public class Q4 {
	public static void main(String[] args){
		int i = 4;
		int v[] = new int [i];
		int m1 = 0;  
		int m2 = 0;
		int s;
		int soma;
		
		for (i = 1; i < v.length; i++) {
			s = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe " + i + "º numero"));
			if (s > m1) {
				m1 = s;
			}
			if (s > m2) {
				m2 = s;
			}
		}
		
		soma = m1 + m2;
		
		JOptionPane.showMessageDialog(null, soma);
		
	}
}

/*
 *Escreva um programa para calcular, dados três números inteiros, a soma
  dos dois maiores.
 */