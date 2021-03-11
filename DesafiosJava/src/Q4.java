import javax.swing.JOptionPane;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args){
	/*	int i = 3;
		int[] v = new int[i];
		
		for (i = 1; i < 3; i++) {
			JOptionPane.showInputDialog("Insira "+ i + "º");
			v[i] = 
		}*/
		
		Scanner input = new Scanner(System.in);
	    int[] grade = new int[3];

	    for (int i = 0; i < 3; i++) {
	        System.out.println("Insert your grade: ");
	        grade[i] = input.nextInt();
	    }
	    System.out.println(grade[1]);
}
}
/*
 *Escreva um programa para calcular, dados três números inteiros, a soma
  dos dois maiores.
 */