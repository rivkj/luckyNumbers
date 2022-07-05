package com.tts;

public class AsciiChars {
	 public static void printNumbers(){
	        // prints valid numeric numbers
	        System.out.print("\nThe valid numbers are : ");
	        for(int i=0;i<10;i++){
	            System.out.print(i+" ");
		 }
	 }
	 public static void printLowerCase()
	 {
		// prints valid lower case alphabet
	        System.out.print("\nThe valid lowercase alphebets are : ");
	        for(char ch='a';ch<='z';ch++){
				System.out.print(ch + " ");	
	    }
	 }

	 public static void printUpperCase()
	 {
		// prints valid upper case alphabets
	        System.out.print("\nThe valid uppercase alphebets are : ");
	        for(char ch='A';ch<='Z';ch++){
				System.out.print(ch + " ");
	    }
	    
	    
	 }
}
