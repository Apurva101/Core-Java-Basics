package collections;

import java.util.ArrayList;

public class ArrayListMain {

    public static void main (String args[])
    {
        ArrayList list = new ArrayList();

        list.add("Apurva");
        list.add("Deblina");
        list.add("Archita");
        list.add("Antima");

        ArrayList actoress = new ArrayList();

        actoress.add("Katrina");
        actoress.add("kaira");
        actoress.add("Priyanka");

        System.out.println(list);

        list.addAll(actoress);

        System.out.println(list);

        list.retainAll(actoress);

        System.out.println(list);

        list.removeAll(actoress);

        System.out.println(list);

    }
}
