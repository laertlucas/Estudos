import java.util.Scanner;

public class Fluxo {
	public static void main(String[] args){
		/*int idade;
		int num;
		System.out.println("Informe sua idade: ");
		idade = new Scanner(System.in).nextInt();
		if (idade >= 18) {
			System.out.println("Já pode fazer mininu");	
		} else {
			System.out.println("Aqueta o facho!!!");
		}
		
		System.out.println("Informe um número: ");
		num = new Scanner(System.in).nextInt();
		if ((num % 2) == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}*/
		
		int n1, n2, n3;
		double media;
		System.out.println("Informe a primeira nota");
		n1 = new Scanner(System.in).nextInt();
		System.out.println("Informe a segunda nota");
		n2 = new Scanner(System.in).nextInt();
		System.out.println("Informe a terceira nota");
		n3 = new Scanner(System.in).nextInt();
		
		media = ((n1 + n2 + n3) / 3);
		
		if (media >= 7) {
			System.out.println("Aluno aprovado com media " +media);
		} else {
			System.out.println("Aluno reprovado com media " +media);
			if (media >= 5) {
				System.out.println("Mas pode fazer a recuperação!!!");
			}
		}
	}
}