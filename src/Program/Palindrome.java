package Program;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String output ="";
        for(int i=s.length()-1;i>=0;i--)
        {
        	output=output+s.charAt(i);
        }
        System.out.println(output);
        if(output.equals(s))
        {
        	System.out.println("String is Palindrome");
        }
        else
        {
        	System.out.println("String is not Palindrome");
        }
	}

}
