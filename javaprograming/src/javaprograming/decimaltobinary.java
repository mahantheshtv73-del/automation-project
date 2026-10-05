package javaprograming;

import java.util.Scanner;

public class decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println( " Enter a first number: ");
		int n = sc.nextInt();
		
		int pow = 1,sum = 0;
		while ( n!=0)
		{
			sum = sum +( n% 2)*pow;
			pow = pow * 10;
			n = n/2;
		}
		System.out.println( " sum= " +sum);


	}

}
