package kata5.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Histogram < T >{

    private final Map<T, Integer> map;

    public Histogram() {
        this.map = new HashMap<>();
    }

    public int get( T key ){
        int valor = map.get(key);
        return valor;
    }

    public Set<T> keySet() {
        return map.keySet();
    }

    public void increment( T key ) {
        map.put(key, map.containsKey(key)? map.get(key)+1:1);
    }
}