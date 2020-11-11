package collections;

import java.util.HashMap;

public class hashMap{


     public static void main(String args[])
     {
         HashMap map = new HashMap();
         map.put("Apurva", 23);
         map.put("Shankarjee", 21);
         map.put("Mummy", 45);
         map.put("papa", 47);

        // System.out.println(map.entrySet());
         //System.out.println(map.keySet());
         //System.out.println(map.values());




        // map.put("Apurva", 24);
      //   map.putIfAbsent("Shankarjee", 20);
      // map.remove("Apurva", 23);
    //    boolean check = map.containsValue(23);

       // HashMap duplicate = map.clone();
       // System.out.println(check);
      //   System.out.println(map);

         /* Iterators in Hashmap */

         map.forEach((name, age) ->
         {
             System.out.println(name + "->" + age);
         });


     }


}