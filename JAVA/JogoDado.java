import java.util.Scanner;
import java.util.Random;

public class JogoDado{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Qual o seu palpite?");
		int palpite = s.nextInt();
		
		Random n = new Random();
		int dado = n.nextInt(6)+1;
		System.out.println("Palpite= " +palpite);
		System.out.println("Dado= " +dado);
		if(palpite == dado) {
			System.out.println("Você acertou ");
		} else {
			System.out.println("Errou!!!");
		}
	}
}