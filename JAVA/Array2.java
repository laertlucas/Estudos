import java.util.Arrays;

public class Array2{
	public static void main(String[] args){
		String[] uma = {"Ricardo","Sandra"};
		String[][] duas = {{"Ricardo", "M", "DF"},{"Sandra", "F", "MG"}};
		//System.out.println(duas[1][2]);
		//System.out.println(duas.length);
		
		duas[1][0] = "SANDRA";
		
		System.out.println(duas[1][0]);
	}
}