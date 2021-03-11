public class Fibonacci {
	public static void main(String[] args){
		/* int f1, f2, f3;
		
		f1 = 0;
		f2 = 1;
	
		System.out.println(f1);
		System.out.println(f2);

		for (int i=0; i < 15; i++){
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			System.out.println(f3);
		} */
		
		int anterior = 0;
		int proximo = 1;
		System.out.println(anterior);
		
		while (proximo < 50) {
			System.out.println(proximo);
			proximo = proximo + anterior;
			anterior = proximo - anterior;
		}
	}
}

/*
 * Desafio: Fibonacci
 * Começa-se a série com 0 (zero) e 1 (um)
 * Obtém-se o próximo número de Fibonacci
 * Somando-se os dois anteriores e, assim,
 * sucessiva e infinitamente.
 *
 * Ex: 1+2[3]  2+3[5]  3+5[8] 5+8[13] ...
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
 * 144, 233, 377, 610, 987, 1597, 2584, ...
 */