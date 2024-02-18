package Week1;

public class utils_library {
}

import static input.InputUtils.stringInput;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String userName = stringInput("Please enter your name: ");
        System.out.println("Welcome, “ + userName);

        int howManyClasses = intInput("How many classes are you taking?");
        System.out.println("you are taking " + howManyClasses + " classes");
    }
}