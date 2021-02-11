import java.util.Scanner;

public class OpEspeciais{
	public static void main(String[] args){
		/*int idade = 18;
		String x = (idade >= 18) ? "Maior de Idade" : "Menor de Idade";// Operador Ternário
		String sexo = "M", pais = "Brasil";//Operadores de Separação de expressões*/
		
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o Raio: ");
		double raio = s.nextDouble();
		//Diâmetro : 2r
		//double raio = 10;
		double diametro = 2 * raio; 
		System.out.println("diametro= "+diametro);
		
		//Circunferência : 2 PI r
		double pi = Math.PI;
		double circunferencia = 2 * pi * raio;
		System.out.println("circunferencia= "+circunferencia);
		
		//Area PI r2
		double area = pi * (raio * raio);
		System.out.println("area= "+area);
	}
}