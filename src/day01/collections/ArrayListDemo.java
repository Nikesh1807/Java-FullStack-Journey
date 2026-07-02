package day01.collections;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> technologies = new ArrayList<>();

        // Adding elements
        technologies.add("Java");
        technologies.add("Spring Boot");
        technologies.add("MySQL");
        technologies.add("React");

        //printing all elements
        System.out.println("Technologies"+technologies);

        //remove one element
        technologies.remove("Spring Boot");
        // printing after removing element
        System.out.println("Technologies"+technologies);

        //checking if java exists
        System.out.println("Contains Java? " + technologies.contains("Java"));

        // Printing size
        System.out.println("Total Technologies: " + technologies.size());
    }
}
