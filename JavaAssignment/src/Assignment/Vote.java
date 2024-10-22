package Assignment;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		//Write a program that checks if a person is eligible to vote.(Consider the minimum age to vote is 18.)
	Scanner ob= new Scanner(System.in);
	System.out.println("Enter A=");
	int a=ob.nextInt();
	if(a>18) {
		System.out.println("Eligible for vote");
	}
	else {
		System.out.println("Not eligible for vote");
	}
	}

}
