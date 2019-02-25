/*
 *Programmed By: Martin Horciak
 *Programmed For: Mr.L.Calomeni
 *Course: ICS201
 *Date: Tuesday, December 20, 2016.
 *Program Description:	Create an application that prompts the user for their gender and height
 *						in inches. Then it must determine their ideal body weight dependant on their
 *						gender and height.
 */

 import java.util.Scanner;													//import scanner package
 import java.text.DecimalFormat;											//import Decimal format package

 class MartinHorciak5{														//class decloration w/ opening and closing braces
 	public static void main (String [] args){								//main method w/ opening and closing braces

 		int gender, ideal, height;											//Int variable decloration
 		double kg, pounds;													//Double variable decloration
 		Scanner input = new Scanner(System.in);								//Creation of Scanner

 		System.out.println ("Ideal Body Weight");							//System output, title/ header
 		System.out.print ("Enter 1 for Male or enter 2 for female: ");		//System output asking for gender(1 or 2)
 		gender = input.nextInt();											//user input of gender
 		System.out.print ("Enter your height in inches(1 foot = 12 inches): ");	//System output asking for height in inches
 		height = input.nextInt();											//user input of height
 		input.close();														//closing of the scanner

 		ideal = height - 60;												//calculation for kg equation

 		if (gender == 1) {													//if statement for male
 			kg = 50 + (2.3*ideal);											//calculation for male kg
 			pounds = kg*2.2;												//calculation for pounds
 			System.out.println ("Your ideal body weight is: " + kg + " kilograms or " + pounds + " pounds.");
 		}else if (gender == 2) {											//else if statement for female
 			kg = 45.5 + (2.3*ideal);										//calculation for female kg
 			pounds = kg*2.2;												//calculation for pounds
 			System.out.println ("Your ideal body weight is: " + kg + " kilograms or " + pounds + " pounds.");
 		}else{																//else statement for incorrect input(not 1 or 2)
 			System.out.println ("Error,Please restart the application and enter 1 for male or 2 for female");
 		}
 	}
 }