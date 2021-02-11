public class Operadores {
	public static void main (String[] args){
		// 2+3 operador binário
		// -2 operador unário
		// true ? "sim" : "não" operador ternário
		
		/*int x = 9 + 4;
		int y = 9 * 4;
		int o = 9 - 4;
		float i = 9 / 4;
		float u = 9 % 4;
		int x1 = +4;
		int y1 = -4;
		int x2 = -(+4);
		int y2 = -(-4);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(o);
		System.out.println(i);
		System.out.println(u);
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(x2);
		System.out.println(y2);
		
		double y = (7 - 4 + 3) * 2;
		System.out.println(y);*/
		
		int x = 6;
		//int y = ++x;//pré-incremento
		//int y = x++;//pós-incremento
		//int y = --x;//pré-decremento
		int y = x--;//pós-decremento
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}