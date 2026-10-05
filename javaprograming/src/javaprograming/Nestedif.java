package javaprograming;
import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a character");
		char ch =sc.next().charAt(0);
				readcharacter(ch);
	}
		
		public static  void readcharacter(char ch)
		{
			if(ch >= 'a'&& ch <= 'z'|| ch >= 'A' && ch <='Z')
			{
				if(ch >= 'a'&& ch <= 'z')
				{
					System.out.println( " Lower case characters");
				}
				else
				{
					System.out.println( " Upper case character ");
				}
				
			}
		}
		

	

}
