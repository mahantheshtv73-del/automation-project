package javaprograming;
import java.util.Scanner;

public class calci {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println( " Enter a first number: ");
		int a = sc.nextInt();
		System.out.println( " Eneter a second number");
		int b = sc.nextInt();
		System.out.println( "Enter operator (+,-,*,/,%)");
		String p = sc.next();
		simplecalculator(a,b,p);
		

	}
	public static void simplecalculator( int a, int b, String p)
	{
		switch(p)
		{
			case "+":System.out.println( "Addition = " + (a+b));
			break;
			case "-":System.out.println( "Substraction = " + (a-b));
			break;
		
			case "*":System.out.println( "Multiplication = " + (a*b));
			break;
			case "/":System.out.println( "division = " + (a/b));
			break ;
			case "%":System.out.println( "Modulas= " + (a%b));
			break;
			default:System.out.println( " Invalid input");
			
		}
	}

}
