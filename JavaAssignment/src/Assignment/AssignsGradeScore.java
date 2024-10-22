package Assignment;

import java.util.Scanner;

public class AssignsGradeScore {

	public static void main(String[] args) {
		// Write a program that assigns a grade based on the score.
		
		Scanner ob= new Scanner(System.in);
		System.out.println("Enter marks");
		int Marks=ob.nextInt();
     if(Marks>80) {
    	 System.out.println("Grade A");
     }
     else if(Marks>65) {
    	 System.out.println("Grade B");
     }
     else if(Marks>45) {
    	 System.out.println("Grade C");
     }
     else
     {
    	 System.out.println("Fail");
     
	
	}

	}}
