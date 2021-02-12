import javax.swing.JOptionPane;

public class OpImc {
	public static void main(String[] args){
		String peso = JOptionPane.showInputDialog("Qual o seu peso em KG: ");
		String altura = JOptionPane.showInputDialog("Qual sua altura em metros: ");
		double pesoEmQuilogramas = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);
		double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);
		
		String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal" : "Sobre Peso";
		
		msg = "IMC = " + imc + "\n" + msg;
		JOptionPane.showMessageDialog(null, msg);
		System.out.println("IMC = "+ imc);
		System.out.println(msg);
	}
}