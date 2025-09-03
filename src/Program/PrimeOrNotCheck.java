package Program;

import java.util.Scanner;

public class PrimeOrNotCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		boolean flag=false;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("This is not prime number");
		else
			System.out.println("This is prime number");
		
		
	}

}
