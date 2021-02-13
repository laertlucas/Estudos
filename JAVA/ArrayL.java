import java.util.ArrayList;

public class ArrayL{
	public static void main(String[] args){
		ArrayList<String> cores = new ArrayList<>();
		cores.add("Branco");
		cores.add(0, "Preto");
		cores.add("Cinza");
		cores.add("Amarelo");
		System.out.println(cores.toString());
		System.out.println("Tamanho=" +cores.size());
		System.out.println("Elemento2=" +cores.get(2));
		System.out.println("Indice Branco=" +cores.indexOf("Branco"));
		
		cores.remove("Branco");
		cores.contains("Cinza");
		System.out.println("Tem Cinza?=" + cores.contains("Cinza"));
		
	}
}