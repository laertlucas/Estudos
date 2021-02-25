import javax.swing.JOptionPane;
public class Q5 {
	public static void main(String[] args) {
		double band = 4.20;
		double kmr = 0.65; 
		float dist_client;
		float valor_client;
		float tot = (float)14.20;
		
		/*dist_client = Float.parseFloat(JOptionPane.showInputDialog("Informe a distancia a percorrer"));
		
		valor_client = (float)kmr * dist_client;
		tot = valor_client + (float)band; 
		
		JOptionPane.showMessageDialog(null,"A corrida custou " + tot + "$");*/ 
		
		tot = tot - (float)band;
		tot = tot * (float)kmr;
			
			JOptionPane.showMessageDialog(null,"Quilometros percorridos na corrida " + tot + "KM");
	}
}


/*
 *- Em nossa cidade, o preço pago por uma corrida de táxi inclui uma parcela fixa,
denominada bandeirada, e uma parcela que depende da distância percorrida. A
bandeirada custa R$ 4,20 e cada quilômetro rodado custa R$ 0,65.
 *
 * faça um programa que receba a quilometragem rodada e informe quanto foi à
corrida deste taxista.
 *
 *um determinado passageiro pagou R$ 14,20 em uma corrida, agora ele quer saber
quantos quilômetros ele viajou, vamos ajuda-lo fazendo um programa que descubra
quantos quilômetros ele viajou para pagar o valor acima.
*/