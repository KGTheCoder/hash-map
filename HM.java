import java.util.HashMap;
import java.util.Map;

public class HM {
   public static void main(String[] args) {
      HashMap<String, Integer> map = new  HashMap<>();
      
      print(map);
      map.put("cat", 2);
      map.put("dog", 3);
      map.put("crow", 4);
      
      System.out.println("Map size: " + map.size());
      
      print(map);
      
      map.put("snake", 32);
      System.out.print(map.get("crow"));
   }
   
   public static void print(Map<String, Integer> map) {
      if (map.isEmpty()) {
         System.out.println("map is empty");
      } else {
         System.out.println(map);
      }
   }
}

