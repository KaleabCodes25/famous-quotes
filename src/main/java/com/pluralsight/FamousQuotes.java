package com.pluralsight;


import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {



        try {Scanner input = new Scanner(System.in);
            String[] quotes = {
                    "Strive not to be a success, but rather to be of value. –Albert Einstein",
                    " You miss 100% of the shots you don’t take. –Wayne Gretzky",
                    "The most difficult thing is the decision to act, the rest is merely tenacity. –Amelia Earhart",
                    "Life is 10% what happens to me and 90% of how I react to it",
                    "The most common way people give up their power is by thinking they don’t have any. –Alice Walker",
                    "The mind is everything. What you think you become.  –Buddha ",
                    " An unexamined life is not worth living. –Socrates",
                    "Eighty percent of success is showing up. –Woody Allen",
                    "Your time is limited, so don’t waste it living someone else’s life. –Steve Jobs",
                    "Winning isn’t everything, but wanting to win is. –Vince Lombardi"};

                System.out.print("Enter a number between 1 and 10 to see a famous quote: ");
                int userInput = input.nextInt();
                input.nextLine();
                System.out.println(quotes[userInput - 1]);

                System.out.println("Would you like to see another quote?: ");
                String answer = input.nextLine().toLowerCase().trim();
                while (answer.equalsIgnoreCase("yes")){
                    System.out.print("Enter a number between 1 and 10 to see a famous quote: ");
                    input.nextInt();
                    System.out.println(quotes[userInput -1]);
                }


        } catch (Exception e) {
            System.out.println("Sorry, make sure the number is between 1 and 10");

        }

    }
}
