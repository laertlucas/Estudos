import java.util.ArrayList;
import java.util.Scanner;

public class While {
	public static void main(String[] args){
		int i = 3;
		
		/*while(i < 2) {
			System.out.println(i);
			i++;
		}
		do {
			System.out.println(i);
			i++;
		} while(i<2);*/
		
		ArrayList<String> produtos = new ArrayList<String>();
		Scanner s = new Scanner (System.in);
		System.out.println("Liste seus produtos: E para sair digite FIM");
		
		String produto;
		
		while(!"FIM".equals(produto = s.nextLine())) {
			produtos.add(produto);
		}
		System.out.println(produtos.toString());
	}
}