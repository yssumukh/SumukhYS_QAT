package test;

import java.util.*;

public class prg1Alternative {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		ArrayList<String> arrL = new ArrayList<String>();
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter number of words: ");
		int n = in.nextInt();
		for(int i=0;i<n;i++) {
			arrL.add(in.next());
		}
		System.out.println("Reversed Strings : ");
		for(int j=arrL.size()-1;j>=0;j--) {
			System.out.print(arrL.get(j));
		}

	}

}
