//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickle =JOptionPane.showInputDialog("How many nickles do you have?");
		// Convert their answer to an int using Integer.parseInt()
int nickle2 = Integer.parseInt(nickle)*5;
		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog("how many dimes do you have?");
int dimes2 = Integer.parseInt(dimes)*10;
		// Ask the user how many quarters they have, and convert their answer
String quarters = JOptionPane.showInputDialog("how many quarters do you have?");
int quarters2 = Integer.parseInt(quarters)*25;
		// Calculate how much money the user has and save it in a double variable 
double total=nickle2+dimes2+quarters2;
System.out.println(total/100);
		// Tell the user how much money they have

	}
}

