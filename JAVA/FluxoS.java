import java.util.Scanner;

public class FluxoS {
	public static void main(String[] args){
		
		char sexo = 'M';
		switch(sexo) {
			case 'M':
				System.out.println("Sexo Masculino");
				break;
			case 'F':
				System.out.println("Sexo Feminino");
				break;
			default:
				System.out.println("Outros");
		}
	}
}