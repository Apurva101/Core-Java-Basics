package collections;

import java.util.Comparator;
import java.util.TreeMap;
import collections.Country;

public class TreeMapMain {

    public static void main(String args[]) {

        TreeMap<String, String> map = new TreeMap<String, String>();

        map.put("Apuva", "Singh");
        map.put("Java", "learning");
        map.put("C++", "know");

        map.forEach(( name, desc) ->
        {
            System.out.println(name+"->"+desc);
        });

        //comparator function

                Country india = new Country("India", 2000);
                Country america = new Country("America", 1200);
                Country newzealand = new Country("newzealand", 3000);
                Country france = new Country("france", 400);

//                Comparator comp = new Comparator(Country c1, Country c2) {
//                    @Override
//                    public int compare(Country o1, Country o2) {
//                        return o1.population <= o2.population;
//                    }
//                };








    }
}
