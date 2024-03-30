package week4;

import java.util.lList;
public class Removing {
    public static void main(String[] args) {
        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");
        System.out.println(classNames);

        classNames.remove("Project Management");
        System.out.println(classNames);
        classNames.remove(0);
        System.out.println(classNames);
    }
}