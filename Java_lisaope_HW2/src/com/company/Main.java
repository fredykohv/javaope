package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main { //Start of Main class

    private static int moneySpent = 0;
    private static int numberOfGuesses = 0;
    private static int win = 1000000;


    public static void main(String[] args) { //Start of Main

        Scanner input = new Scanner (System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100000); //0-1000000

        System.out.println("Want to win a million dollars?");
        System.out.println("If so, guess the winning number (a number between 0 and 100000)");

        startGuessing(input, numberToGuess);
    } //End of main

    public static void startGuessing(Scanner input, int numberToGuess) { //Start of startGuessing
        //System.out.println(numberToGuess); //Prindib testimiseks õige vastuse
        System.out.println("Insert $1.00 and enter your number or 'q' to quit: ");
        String guess = input.nextLine(); //Sisestan arvu
        int guessInt = -1;
        if (changeStringToInt(guess)) {
            guessInt = Integer.parseInt(guess);
        }
        if(guess.equals("q")) { //Quit function
            System.out.println("You chose to quit!");
            System.out.println(String.format("You guessed %d time(s).", numberOfGuesses));
            if (moneySpent > -1) {
                System.out.println(String.format("You spent: $%d!", moneySpent));
            }
            System.exit(0);
        }else if (guessInt == numberToGuess) { //Win function
            System.out.println(String.format("Congratulations! You guessed the right number: %s", guess));
            System.out.println("You won $1000000. Lucky!");
            numberOfGuesses ++;

            //Concludes
            System.out.println(String.format("You guessed %d time(s).", numberOfGuesses));
            //System.out.println(String.format("You spent: $%d!", moneySpent));
            //System.out.println("You profited: " + "$" + (win - moneySpent));
            System.exit(0);
            } else {
                numberOfGuesses ++;
                System.out.println("Sorry, good guess, but not quite right. Do you want me to give you a hint (y|n)?");
                giveHint(input, guessInt, numberToGuess);
            }

    } //End of startGuessing

    private static void giveHint(Scanner input, int guessInt, int numberToGuess ) {
        String usersNewAnswer = input.nextLine();

        if(usersNewAnswer.equals("y") || usersNewAnswer.equals("n")) {
            if (usersNewAnswer.equals("n")) {
                startGuessing(input, numberToGuess);
            } else if (usersNewAnswer.equals("y")) {
                moneySpent += 2;
                System.out.println("Insert $2.00 for the hint!");
                //moneySpent += 2;
                if (guessInt > numberToGuess) {
                    moneySpent += 2;
                    System.out.println("Your number is too high!");
                    startGuessing(input, numberToGuess);
                } else if (guessInt < numberToGuess) {
                    moneySpent += 2;
                    System.out.println("Your number is too low!");
                    startGuessing(input, numberToGuess);
                }
            }

        } else {
            System.out.println("The console accepts only 'y' and 'n'!");
        }
    }

    private static boolean changeStringToInt(String string) throws NumberFormatException {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException exception) {
            return false;
        }
    } //End of changeStringToInt

} //End of class Main
