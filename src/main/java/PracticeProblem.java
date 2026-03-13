import java.util.Scanner;

/**
 * Lesson: String Manipulation
 * Author: Mr. Kalisz
 * Date Created: Feb 26, 2026
 * Date Last Modified: Feb 26, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
	}
	

	public static void q1() {
		// Write question 1 code here
		// Ask the user to "Input a sentence: ". If the setence 
		// includes the word "on", output true 
		// (Even if the "on" is inside another word such as "pond"). 
		// Otherwise output false.
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String visagaan = input.nextLine();
		boolean bool1 = visagaan.contains("on");
		System.out.println(bool1);
		input.close();
	}

	public static void q2() {
		// Write question 2 code here 
		// Ask the user to "Input the word mango: ". 
		// Output true if they put any variation of the casing for mango. 
		// false otherwise.
		Scanner input = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String mangoVisagaan = input.nextLine();
		mangoVisagaan = mangoVisagaan.toLowerCase();
		boolean bool1 = mangoVisagaan.equals("mango");
		System.out.println(bool1);
		input.close();
	}

	public static void q3() {
		// Write question 3 code here 
		// Ask the user to "Input a word: ". 
		// Ask the user to "Input a letter: " 
		// Output the first index and 
		// last index of the letter in the word on seperate lines.
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String inputWord = input.nextLine();
		System.out.print("Input a letter: ");
		String inputLet = input.nextLine();
		System.out.println(inputWord.indexOf(inputLet));
		System.out.println(inputWord.lastIndexOf(inputLet));
		input.close();
		
	}

	public static void q4() {
		// Write question 4 code here 
		// Ask the user to "Input a sentence: ". 
		// Output "Your sentence is length characters long", 
		// where length is the amount of 
		// characters in their sentence.
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String input1 = input.nextLine();
		int inputLen = input1.length();
		System.out.println("Your sentence is " + inputLen + " characters long");
		input.close();
	}

	public static void q5() {
		// Write question 5 code here 
		// Ask the user to "Input a sentence: " 
		// Ask the user "Input a word to replace: ". 
		// Ask the user "What word would you like to replace it with: ". 
		// Replace all instances of the first word provided 
		// with the second word provided in the sentence.
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String inputSen = input.nextLine();
		System.out.print("Input a word to replace: ");
		String inputRepl1 = input.nextLine(); 
		System.out.print("What word would you like to replace it with: ");
		String inputRepl2 = input.nextLine(); 
		System.out.println(inputSen.replaceAll(inputRepl1, inputRepl2));
		input.close();
	}

	public static void q6() {
		//Write question 6 code here Ask the user to "Input a sentence: " 
		// Output the sentence in all uppercase and all lowercase 
		// on seperate lines in that order. 
		// Remove any extra spaces at the beginning or end.
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String inputSen = input.nextLine();
		inputSen = inputSen.trim();
		System.out.println(inputSen.toUpperCase());
		System.out.println(inputSen.toLowerCase());
		input.close();
	}

	public static void q7() {
		//Write question 7 code here 
		// Ask the user to "Input a word: ". 
		// Output the first four letters and 
		// last four letters of the word on seperate lines.
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String inputWord = input.nextLine();
		System.out.println(inputWord.substring(0,4));
		int wordLength = inputWord.length();
		System.out.println(inputWord.substring((wordLength - 4), (wordLength)));
		input.close();

		
	}

	public static void q8() {
		//Write question 8 code here
	}

}
