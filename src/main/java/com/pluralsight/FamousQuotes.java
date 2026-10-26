package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {

            String[] quotes = new String[10];

        try {Scanner input = new Scanner(System.in);
            quotes[0] = ("Strive not to be a success, but rather to be of value. –Albert Einstein");
            quotes[1] = (" You miss 100% of the shots you don’t take. –Wayne Gretzky");
            quotes[2] = ("The most difficult thing is the decision to act, the rest is merely tenacity. –Amelia Earhart");
            quotes[3] = ("Life is 10% what happens to me and 90% of how I react to it");
            quotes[4] = ("The most common way people give up their power is by thinking they don’t have any. –Alice Walker");
            quotes[5] = ("The mind is everything. What you think you become.  –Buddha ");
            quotes[6] = (" An unexamined life is not worth living. –Socrates");
            quotes[7] = ("Eighty percent of success is showing up. –Woody Allen");
            quotes[8] = ("Your time is limited, so don’t waste it living someone else’s life. –Steve Jobs");
            quotes[9] = ("Winning isn’t everything, but wanting to win is. –Vince Lombardi ");

            System.out.print("Enter a number between 1 and 10 to see a famous quote: ");
            int userInput = input.nextInt();

            System.out.println(quotes[userInput]);
            System.out.println();
        } catch (Exception e) {
            System.out.println("Sorry, make sure the number is between 1 and 9(included)");

        }
    }
}
