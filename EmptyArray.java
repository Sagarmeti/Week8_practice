import java.util.*;
class EmptyArray {
  public static void main(String[] args) {
     ArrayList<String> list = new ArrayList<String>();

        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("Mango");

        System.out.println("ArrayList before clearing: " + list);
     
        list.clear();
    
        System.out.println("ArrayList after clearing: " + list);
    }
}
