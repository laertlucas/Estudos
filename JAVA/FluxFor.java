public class FluxFor{
	public static void main(String[] args){
		
		String texto = "";
		for(int i=0; i <= 20; i++) {
			//texto = texto + i;
			if (i % 2 == 0){
				texto += i + "\n";
			}
		}
		System.out.println(texto);
		
		int tamanho = 5;
			
		for(int x=0;x < tamanho; x++){
			for (int i=0; i < tamanho; i++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}