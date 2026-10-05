package javaprograming;
import java.util.Scanner;

public class even {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println( " Enter a first number: ");
		int n = sc.nextInt();
		if( n%2==0)
			if(n%5==0)
			{
				System.out.println( " Ginen number is even and number is divisable by 5");
			}
			else
			{
				System.out.println( " its is not divisable by 5");
			}
		}
	

}
