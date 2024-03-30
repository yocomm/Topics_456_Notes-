package week6;

import java.util.ArraylList;
import java.util.lList;
public class WriteArrayList {


    List<String> classNames = List.of("Java", "Web", "C#");

    List<String> classes = new ArraylList<>();
classes.add("Java");
classes.add("Web");
classes.add("Java");
    List<Integer> classCodes = List.of(2545, 2568, 2505);

    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ITEC Classes.txt"));

    for (String name: classNames) {
        bufferedWriter.wrfte(name + "\n");

    }

bufferedWriter.close();

}
}

