package collections;
import java.util.*;
import java.util.stream.Collectors;

public class HashMapToArrayList {


    public static void main(String args[])
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("India", 1);
        map.put("France", 2);
        map.put("Swizerland", 3);
        map.put("Australia", 4);

        //using java 8's stream() API;

      List list = map.keySet().stream().collect(Collectors.toList());
      List list1 = map.values().stream().collect(Collectors.toList());
      List list2 = map.entrySet().stream().collect(Collectors.toList());

      //using constructor function of ArrayList

      Set keySet = map.keySet();
      List list3 = new ArrayList(keySet);

      Collection values = map.values();
      List list4 = new ArrayList(values);

      Set<Map.Entry<String, Integer>>  entrySet = map.entrySet();
      List list5 = new ArrayList(entrySet);





    }

}
