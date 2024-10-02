package task_02;
/*
 Create a Guessing Game

Build a program that generates a random number and challenges the user to guess it. 
The program should prompt the user to input their guess, compare it to the generated number, 
and provide feedback if the guess is too high or too low. It should continue until the user 
correctly guesses the number and then display the number of attempts it took to win the game.
Filename: C:\Users\Shaibaj\eclipse-workspace\PRODIGY_SD_02\src\task_02\TemperatureConverter.java
 Path: C:\Users\Shaibaj\eclipse-workspace\PRODIGY_SD_02\src\task_02\TemperatureConverter.java
 Created Date: Monday, September 30 2024, 09:38:43 am
 Author: Shaibaj
 Copyright (c) 2024 
*/
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1; 

      
        Scanner sc = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

           
            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("It took you " + attempts + " attempts.");
            }
        } while (guess != numberToGuess);

        
        sc.close();
    }
}
