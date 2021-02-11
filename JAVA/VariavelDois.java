public class VariavelDois {
	public static void main (String[] args) {
		int idade = 23;
		double preco = 12.45;
		char sexo = 'M';
		boolean casado = true;
		
		byte b = 127;//Cem
		short s = 32767;//32 Mil
		int i = 2_000_000_000;//2 Bilhões
		long l = 9_000_000_000_000_000L;//9 Quintilhões
		double d = 1.7976931348623157E+308;//IEEE 
		float f = 123F;
		
		/*i = s;//Cast Implícito
		System.out.println(s);
		System.out.println(i);
		*/
		i = (int) l;//Cast Explícito
		System.out.println(l);
		System.out.println(i);
	}
}