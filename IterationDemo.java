import java.util.*;

public class IterationDemo {
    public static void main(String[] args) {
        
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");


        for (String color : colors) {
            System.out.println(color);
        }
    }
}