package HashMap;

import java.util.*;

public class First {
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();

    //Insertion
    map.put("India",120);
    map.put("US",30);
    map.put("China",150);
    System.out.println(map);
    map.put("China",180);
    System.out.println(map);

    if(map.containsKey("China")){
      System.out.println("Present");
    }
    //key nhi h to null
    else{
      System.out.println("Not");
    }
    System.out.println(map.get("China"));
    int arr[]={12,15,18};
    for(int val :arr){
      System.out.println(val + " ");
    }

    //Iteration in HashMap
    for(Map.Entry<String,Integer> e :map.entrySet()){
      System.out.println(e.getKey());
      System.out.println(e.getValue());
    }
    Set<String> keys =map.keySet();
    for(String key: keys){
      System.out.println(key+ " " + map.get(key));

    }
   map.remove("China");
System.out.println("Removed China");

  }
}
