package javadays;
import java.util.*;
public class Months {
/*
 * Jason Yang
 * CIS 4160
 */
	public static void main(String[] args)
	{
		String Month;
		Scanner month = new Scanner(System.in);
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Please enter the name of the month");
		System.out.println("-----------------------------------------------------------------------------");
		
		Month=month.next() .toUpperCase();

		if (Month.equals("JANUARY"))
		{
			System.out.println("You have picked January, the month number is 1");
			System.out.println("It has 31 days");
			Months.main(args);
		}
		else if (Month.equals("FEBUARY"))
		{
			System.out.println("You have picked Febuary, the month number is 2");
			System.out.println("It has 28 days but if in leaf year 29 days");
			Months.main(args);
		}
		else if (Month.equals("MARCH"))
		{
			System.out.println("You have picked March, the month number is 3");
			System.out.println("It has 31 days");
			Months.main(args);
		}
		else if (Month.equals("APRIL"))
		{
			System.out.println("You have picked April, the month number is 4");
			System.out.println("It has 30 days");
		}
		else if (Month.equals("MAY"))
		{
			System.out.println("You have picked May, the month number is 5");
			System.out.println("It has 31 days");
		}
		else if (Month.equals("JUNE"))
		{
			System.out.println("You have picked June, the month number is 6");
			System.out.println("It has 30 days");
			Months.main(args);
		}
		else if (Month.equals("JULY"))
		{
			System.out.println("You have picked July, the month number is 7");
			System.out.println("It has 31 days");
			Months.main(args);
		}
		else if (Month.equals("AUGUST"))
		{
			System.out.println("You have picked August, the month number is 8");
			System.out.println("It has 31 days");
			Months.main(args);
		}
		else if (Month.equals("SEPTEMBER"))
		{
			System.out.println("You have picked September, the month number is 9");
			System.out.println("It has 30 days");
			Months.main(args);
		}
		else if (Month.equals("OCTOBER"))
		{
			System.out.println("You have picked October, the month number 10");
			System.out.println("It has 31 days");
			Months.main(args);
		}
		else if (Month.equals("NOVEMBER"))
		{
			System.out.println("You have picked November, the month number is 11");
			System.out.println("It has 30 days");
			Months.main(args);
		}
		else if (Month.equals("DECEMBER"))
		{
			System.out.println("You have picked December, the month number is 12");
			System.out.println("It has 31 days");
			Months.main(args);
		}
		else
		{
			System.out.println("You have enter an invaild month please try again");
			Months.main(args);
		}
		month.close(); // closing scanner
	}
}