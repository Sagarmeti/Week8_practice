import java.util.*;
class ArrayListDemo{
  public static void main(String args[]){
    List list=new ArrayList();
    list.add(123);
    list.add("Sagar");
    list.add(77.75f);
    System.out.println(list);
    for( Object obj:list){
      System.out.println(obj);
    }
      
  }
}