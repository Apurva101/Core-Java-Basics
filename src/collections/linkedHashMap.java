package collections;

import java.util.LinkedHashMap;
class LRUCache{

    private LinkedHashMap<Integer, Integer> map;
    LRUCache(int capacity)
    {
        map = new LinkedHashMap<>(capacity, 0.75f, true);

    }

    public int getKey(int key)
    {
        return map.get(key);
    }

    public void set(int key, int value)
    {
        map.put(key, value);
    }

    @Override
    public String toString() {
        return map.toString();
    }
};

public class linkedHashMap {

    public static void main(String args[])
    {
        LRUCache cache = new LRUCache(2);
        cache.set(2,16);
        cache.set(4,12);
        System.out.println(cache);

        cache.getKey(2);

        System.out.println(cache);


    }
}
