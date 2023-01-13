package day5;

import java.util.Scanner;

public class HarmonicNum 
{
	public static double harmonicValue(double n)
	{
		
        double sum = 0.0;

		for (int i = 1; i <= n; i++) 
		{
		sum = sum + (1.0/i);
		}
	return sum;
	}

	public static void main(String[] args) 
	{
	   	System.out.println("Enter a number: ");
	   	Scanner sc = new Scanner(System.in);
		double n=sc.nextDouble();
    	double result=harmonicValue(n);
		
		if(n>0)
	 	{
			System.out.println("The Harmonic Value for the number is: "+result);
	 	}
		else
		{
			System.out.println("The number should be greater than zero");
		}
	}
}


