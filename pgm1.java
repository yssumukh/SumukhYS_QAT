package test;
import java.util.Scanner;

public class pgm1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String str = in.nextLine();
		
		String[] strarr = str.split(" ");
		
		System.out.println();
		
		for(int i=strarr.length-1;i>=0;i--)
			System.out.print(strarr[i]+" ");
		
		in.close();


	}

}
