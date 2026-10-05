package javaprograming;

import java.util.Scanner;

public class startnoeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println( " Enter a first number: ");
		int n = sc.nextInt();
		while( n >9)
		{
			n=n/10;
		}
		if( n%2==0)
		{
			System.out.println( " given no is start with even no ");
		}
		else
		{
			System.out.println( " gven no start with odd no");
		}

	}

}
