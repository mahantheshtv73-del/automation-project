package javaprograming;

import java.util.Scanner;

public class binaeytodecimal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println( " Enter a first number: ");
		int n = sc.nextInt();
		
		int pow = 1,sum = 0;
		while ( n!=0)
		{
			sum = sum +( n% 10)*pow;
			pow = pow * 2;
			n = n/10;
		}
		System.out.println( " sum= " +sum);

	}

}
