package week1day1;

public class Assignment1 {

	public static void main(String[] args) {
		//1. 1st assignment: find if negative is negative than convert into positive
		int i= -40;
		if(i<0)
		{
			System.out.println("the number you entered id negative");
			System.out.println("After converting into positive is = " +(0-i));
		}
		else 
		{
			System.out.println("The number is positive");
		}
		
		// 2nd assignment: find the number is positive,negative or nor positive nor negative
		
		int j= 35;
		if(j<0)
		{
			System.out.println("The number is negative");
		}
		else if (j>0)
		{
			System.out.println("The number is positive");
		}
		else
		{
			System.out.println("The number is not positive nor negative");
		}

	}

}
