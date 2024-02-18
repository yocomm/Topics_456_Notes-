package Week1;

public class input {
    import static input.InputUtils.intInput;
    import static input.InputUtils.stringInput;

    public class input {
        public static void main(String[] args) {
            String name = stringInput("Please enter your name");
            System.out.println("Hello, " + name + "!");

            int numberOfClasses = positivelntInput("How many classes are you taking this semester?");
            System.out.println("You are taking " + numberOfClasses + " class(es)this semester.");
        }

