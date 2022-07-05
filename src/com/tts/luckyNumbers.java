package com.tts;

import java.util.*;
;

public class luckyNumbers 
{
	public static void main (String[] args) 
	{
		
		//System.out.println("Hello World!");
		// call static methods of class AsciiChars
		AsciiChars.printNumbers();
		AsciiChars.printUpperCase();
		AsciiChars.printLowerCase();
		
		Scanner scanner = new Scanner(System.in);
		String continueOption;
		
        // simple interaction
        System.out.println("\nPlease enter your name : ");
        String name = scanner.next();
        System.out.println("Hello "+ name);
        
        System.out.println("If you wish to continue to the interactive portion. Enter yes/no : ");
        String option = scanner.next();
        if(option.equals("yes") || option.equals("y"))
        {
        	do
        	{
            	 // continue to the interaction
        		System.out.println("Do you have a red car?(yes, no) : ");
        		String redCar = scanner.next();

        		System.out.println("What is the name of your favorite pet : ");
        		String petName = scanner.next();
                
        		System.out.println("What is the age of your favorite pet : ");
        		int petAge = scanner.nextInt();
                
        		System.out.println("What is your lucky number : ");
                int luckyNumber = scanner.nextInt();
                
                System.out.println("Do you have a favorite quarterback?(yes, no)  : ");
                option = scanner.next();
                int jerseyNumber = 0;
        
                
                if(option.equals("yes") || option.equals("y"))
                {
                	System.out.println("What is their jersey number : ");
                	jerseyNumber = scanner.nextInt();
             
                }
                
            	System.out.println("What is the two-digit model year of your car?  : ");
            	int modelyear = scanner.nextInt();
                
            	System.out.println("What is the first name of the their favorite actor or actress?  : ");
                String actressFirstName = scanner.next(); 
                
                System.out.print("Enter a random number between 1 and 50  : ");
                int randomNumber = scanner.nextInt(); 
                
                //generating output
                Random rand = new Random(); 
                int magicballNumber;  
                
                int rand1 = rand.nextInt(50);
                int rand2 = rand.nextInt(50);
                int rand3 = rand.nextInt(50);
                
                if((rand.nextInt(2) == 1) && (jerseyNumber != 0) ) 
                {
                    // choose the jersey number else choose the lucky number
                    magicballNumber = jerseyNumber * rand1;
                }
                else 
                {
                	magicballNumber = luckyNumber * rand1;
                }
                if(magicballNumber > 75) 
                {
                		//subtract 75 from it
                		magicballNumber = magicballNumber - 75;
                }
                // generate other 5 numbers
                int number1 = 0;
                int number2 = 0; 
                int number3 = 0;
                int number4 = 0; 
                int number5 = 0;
                
                //choice of method -- model number + lucky number
                number1 = modelyear + luckyNumber;
                //numbers are in range
                
                if(number1 > 65) 
                {
                	number1 = number1 - 65;
                }
                if(number1 < 1) 
                {
                	number1 = number1 + 65;
                }
                
             // choosing the options =  random numbers between 1 and 50 and subtract rand2
                number2 = rand2 - rand.nextInt(50);
                if(number2 > 65) 
                {
                	number2 = number2 - 65;
                }
                if(number2 < 1) 
                {
                	number2 = number2 + 65;
                }
                
                //Choose 42
                number3 = 42;
              
                // choosing the options = age of the favorite pet + model year
                number4 =  petAge + modelyear;
                // checking if the numbers are in range
                if(number4 > 65) {
                	number4 = number4 - 65;
                } 
                if(number4 < 1) 
                {
                    number4 = number4 + 65;
                }
                
                // choosing the options =  first letter of favorite actress
                number5 =  (int)actressFirstName.charAt(0);
                // checking if the numbers are in range
                if(number5 > 65) 
                {
                    number5 = number5 - 65;
                }    
                if(number5 < 1)
                {
                    number5 = number5 + 65;
                }
                 
                System.out.print("Lottery numbers : ");
                System.out.print(number1 + ", ");
                System.out.print(number2 +", ");
                System.out.print(number3 +", ");
                System.out.print(number4 +", ");
                System.out.print(number5 +", ");
                System.out.print(" Magic ball: "+magicballNumber);
//                
                //Play again?
                System.out.println("\nIf you like to answer questions to generate another set of numbers, (yes ,no)? :");
                continueOption = scanner.next();
        	}while(continueOption.equals("yes"));
        } 
        
        else 
        {
            System.out.println("please return later to complete the survey.");
            	
        }
            
            System.out.println("Thank you for participating!");
	}

}


