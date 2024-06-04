package programs;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			int i = 0,j=s.length()-1,c=0;
			while(i<j) {
				if(s.charAt(i)!=s.charAt(j)) c+=1;
				i++;
				j--;
			}
		if(c==0)
			System.out.println("Palindrome");
		else 
			System.out.println("Not Palindrome");
	}

}
