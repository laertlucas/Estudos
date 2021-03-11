import java.util.ArrayList;

public class FluxEach {
	public static void main(String[] args) {
		
		int[] pares = {2,4,6,8};
		
		 for(int i=0; i<pares.length; i++){
			int par = pares[i];
			System.out.print(par);
		} 
		
	 int[] pares = {2, 4, 6, 8};
		for (int par : pares){
			System.out.print(par);
		} 
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10; i++){
			list.add(i);
		}
		for(Integer numero : list){
			System.out.print(numero);
		}
	}
	
}