public class AutoBoxing {
	public static void main(String[] args){
		/* Integer x = new Integer(555);
		int a = x.intValue();
		a++;
		x = new Integer ();
		System.out.println(x.intValue()); */
		
		Integer x = 555;
		x++;
		System.out.println(x);
		
		x.intValue();//floatValue, doubleValue
		
		Boolean v = new Boolean("TRUE");
		if (v) {
			System.out.println(v);
		} 
	}
}