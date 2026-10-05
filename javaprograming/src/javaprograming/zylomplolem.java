package javaprograming;

import java.util.Scanner;

public class zylomplolem {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println( " Enter a first number: ");
		int n = sc.nextInt();
		 
				 int os=0,in=0;
		 os = os+n%10;
		 n= n/10;
		 while(n >9)
		 {
			 in = in +n%10;
			 n=n/10;
		 }
		 os = os+n;
		 if(os==in)
		 {
			 System.out.println( " zylom");
		 }
		 else
		 {
			 System.out.println( " pholem");
		 }

	}

}
