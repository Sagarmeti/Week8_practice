import java.util.*;

class Retrieve {
  public static void main(String[] args) {
        
    ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int element = list.get(1);
        System.out.println("Element at index 1: " + element);
    }
}