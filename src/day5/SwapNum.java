package day5;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num = sc.nextInt();
        System.out.println("enter the second num");
        int num1 = sc.nextInt();
        System.out.println("Before swaping number are");
        System.out.println("First number = " + num);
        System.out.println("Second number = " + num1);
        
        int temp = num; 
        num = num1;        
        num1 = temp;    

        System.out.println("After swapping the numbers: ");
        System.out.println("First number = " + num);
        System.out.println("Second number = " + num1);
    }
}


