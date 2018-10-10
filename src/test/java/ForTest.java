import org.junit.Test;

import java.util.*;

public class ForTest {
    @Test
    public void forTest(){
       String[] str = new String[]{"0","1","2","3","4"};
        for (String aStr : str) {
            System.out.println(aStr);
        }
    }
    @Test
    public void forArrayListTest(){
        List<String> lists = new ArrayList<String>();
        lists.add("0");
        lists.add("1");
        lists.add("2");
        lists.add("3");
        for (String list: lists) {
            System.out.println(list);
        }
    }
    @Test
    public void forHashSetTest(){
        Set<Float> sets = new HashSet<Float>();
        sets.add(0f);
        sets.add(1f);
        sets.add(2f);
        for(Float set : sets){
            System.out.println(set);
        }
    }
    @Test
    public void forHashMapTest(){
        Map<Integer,String> maps = new HashMap<Integer, String>();
        maps.put(0,"0");
        maps.put(1,"1");
        maps.put(2,"2");
        maps.put(0,"a");
        maps.put(1,"b");
        maps.put(2,"c");
        for (Map.Entry<Integer,String> map : maps.entrySet()){
            System.out.println(map.getKey()+":"+map.getValue());
        }
    }

    @Test
    public void forTreeSetTest(){
        Set<Double> sets = new TreeSet<Double>();
        sets.add(2d);
        sets.add(0d);
        sets.add(1d);
        for(Double set : sets){
            System.out.println(set);
        }
    }


}
