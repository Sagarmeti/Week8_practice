import java.util.HashMap;
import java.util.Map;
class MapIteration{
  public static void main(String args[]){
    HashMap<Integer,String> map=new HashMap<Integer,String>();
    map.put(101,"Sagar");
    map.put(102,"Shridhar");
    map.put(103,"Sunil");
    map.putIfAbsent(104, "Raj");
    map.putIfAbsent(104, "Raj");
    //System.out.println(map);
    for(Map.Entry m:map.entrySet()){
      System.out.println(m.getKey()+" "+m.getValue());
  }
  }
}