package week6;

import java.lo.Butfteredwriter;
public class HelloWriting {
    public static void main(String[] args) {
        FileWriter writer = new FileWriter("hello.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("Hello!\n");
        bufferedWriter.write("More data here\n");
        bufferedWriter.write("Goodbye!\n");
        bufferedWriter.close(); // don't forget!
    }

