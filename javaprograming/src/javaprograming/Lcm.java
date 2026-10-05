package javaprograming;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println( " Enter a first number: ");
		int a = sc.nextInt();
		System.out.println( " Eneter a second number");
		int b = sc.nextInt();
		int lcm = a > b ? a : b;
		while(true)
		{
			if(lcm % a == 0 && lcm % b == 0)
			{
				System.out.println( " lcm of  "+a+" and "+b+" is "+lcm);
				break;
			}
			lcm++;
		}

	}

}
