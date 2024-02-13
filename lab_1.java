public class lab_1 {
    int age = 21;
    int numberOfStudents = 32;
    int pixels = 480000;
}

String name = stringInput(“"What is your name?");

int candyBars = intInput("How many candy bars?");

// As above, but checks number is positive

int people = positiveIntInput(“How many people?");

double price = doubleInput("What is the price of the item?");

// As above but checks number is positive

double length = positiveDoubleInput("How long is the string?");
// User can type "y" or "n" or "yes" or "no" or any of these in uppercase
boolean ok = yesNoInput("OK to continue?");

//The question is optional, so you can also write code like this,
System.out.println("What is your name?");

String data = stringInput()

 // __________________________________________________________________________________________

// Add an if statement
String name = stringInput("Please enter your name");
System.out.println("Hello " + name);
int numberOfClasses = positiveIntInput("How many classes are you taking this semester?");
String units = “classes";
        if (numberOfClasses == 1) {

units = "class";
        }
        {

        System.out.println("You are taking " + numberOfClasses + " " + uynits + " this semester.");


// ____ Java If statement examples____

import static input.InputUtils.x;
public class Prices {
    public static void main(String[] args) {
        String productName = stringInput("What is the name of the product?");
        double price = doubleInput("What does " + productName + " cost?");
        int quantity = intInput("How many " + productName + " to sell?");
        double totalPrice = price * quantity;

        System.out.println(quantity + " of " + productName + " at $" +
                price + " each costs $" + totalPrice);
        System.out.printf("%d of %s at %.2f each costs $%.2f", quantity, price, price,
    }


// ____ Used to evaluate a condition tor truth; and act based on result ____

import static input.InputUtils.doubleInput;
    public class AboveFreezing {
        public static void main(String[] args) {
            System.out.println("Enter today's temperature in F");
            double temp = doubleInput();
            if (temp > 32) {
                System.out.println("It's above freezing"); N
            }
//Indentation in if blocks is optional but strongly suggested
//It's a standard convention and helps readability


// ____ Java if else if else and and and or ____
            public class Dinner {
                public static void main(String[] args) {

                    String dinnerSuggestion = stringInput(“What should we have for dinner?");

// Computers only like pizza and tacos.

// So, print one response for pizza,

// a different response for tacos,

// and another response for anything else.

’ if (dinnerSuggestion.equalsIgnoreCase("pizza")) {

                        System.out.println("Pizza sounds good!");

                    } else if (dinnerSuggestion.equalsIgnoreCase("tacos")) {
                        System.out.println("Great! I like tacos");

                    } else {
                        System.out.println("How about pizza, or tacos?");

                    }


                    public class NumberQuizElseIfElse {
                        public static void main(String[] args) {

                            int secretNumber = 6;

                            int guess = intInput("Guess the number I am thinking of");

                            if (guess == secretNumber) {
                                System.out.println("You guessed correctly!");

                            } else if ( guess - secretNumber == 1) {
                                S N T8 T U T G VT T R R T R B T R

                            } else if ( secretNumber - guess == 1) {
                                System.out.println("Your guess is 1 too low!");

                            } else {
                                System.out.println("No, I was thinking of " + secretNumber);