package org.example;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
       // Welcome then list my number
        System.out.println("Welcome! Guess the number I am thinking of.");
        int myNumber = 10;

        Scanner reader = new Scanner(System.in);
        int userNumber = reader.nextInt();

        if (myNumber == userNumber) {
            System.out.println("Well Done! You guessed it correctly!");
        }

        else if ( userNumber < myNumber && userNumber >= 8) {
            System.out.println("A bit more higher! Try again!");
        }
         else if ( userNumber > myNumber && userNumber <= 11) {
            System.out.println("A bit more lower! Try again!");
        }

        else if (myNumber > userNumber) {
            System.out.println("Oh no! You guessed a number too LOW. Try again!");
        }

         else if (myNumber < userNumber) {
                System.out.println("Oh no! You guessed a number too HIGH. Try again!");
         }








            }
        }


