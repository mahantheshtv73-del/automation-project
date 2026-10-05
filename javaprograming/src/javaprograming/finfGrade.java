package javaprograming;
import java.util.Scanner;

public class finfGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a Grade");
		char ch =sc.next().charAt(0);
		 System.out.println(findGrade(ch));

	}
	public static String findGrade(char ch)
	{
		switch(ch)
		{
		case 'A':return"You are Excelent";
		case'B':return"good job";
		case'C':return"not bad";
		case'D':return "Worast";
		default:return " Invalid";
		}
	}

}
