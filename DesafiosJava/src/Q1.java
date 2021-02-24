import javax.swing.JOptionPane;

public class Q1 {
	public static void main (String[] args) {
		int soma = 0;
		int n1, n2 = 0;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o primeiro numero: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o segundo numero: "));
		
		if ((n1 >= 0 && n2 >= 0 ) && (n1 <= 1000 && n2 <= 1000)) {
			soma = n1 + n2;
			
			JOptionPane.showMessageDialog(null,"A soma dos numeros e igual a: "+ soma);
		} else {
			JOptionPane.showMessageDialog(null,"A soma dos valores informados sao inacessiveis! ");
		}
	}
}

/*

  Escreva um programa para calcular a soma
  dos numeros positivos, inferiores ou 
  iguais a 1000.
  
*/