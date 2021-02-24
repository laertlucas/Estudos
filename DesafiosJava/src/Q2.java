import javax.swing.JOptionPane;
public class Q2 {
	public static void main(String[] args) {
		int n1, n2, n3;

		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro número: "));
		
		if ((n1 > n2) && (n1 > n3)) {
			JOptionPane.showMessageDialog(null,"O maior número é o " + n1);
		} else if ((n2 > n1) && (n2 > n3)) {
			JOptionPane.showMessageDialog(null,"O maior número é o " + n2);
		} else {
		
		JOptionPane.showMessageDialog(null,"O maior número é o " + n3);
		}
}
}
/*
 * Escreva um programa para calcular o maior de três números inteiros.
 */