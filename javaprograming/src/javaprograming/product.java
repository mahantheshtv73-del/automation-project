package javaprograming;

import java.util.Scanner;

public class product {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println( " Enter a first number: ");
		int n = sc.nextInt();
		int product = 1;
      while (n!=0)
      {
    	  int rem=  n%10;
    	  product = product *rem;
    	
    	  
    	  n = n/10;
    	  
      }
      System.out.println( product);
	}

}
