import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Example class using {@link java.util.List} and {@link java.util.Map}.
 * 
 */
public final class UseCollection {
    private static final int MAX_VALUE = 2000;
    private static final int MAX_ITER_TIMES = 100000;
    private static final int MAX_ITERATION = 1000;
    private static final int DIV = 2;

    private UseCollection() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
        List<Integer> nums = new ArrayList<Integer>();
        
        for (int min = 1000; min < MAX_VALUE; min++) {
            nums.add(min);
        }

        List<Integer> numsOneLineCode = new LinkedList<Integer>();
        numsOneLineCode.addAll(nums);
        
        int firstValue = nums.get(0);
        int lastValue = nums.get(nums.size() - 1);
        nums.set(0, lastValue);
        nums.set(nums.size() - 1, firstValue);
        
        for (var value : nums) {
            System.out.println(value);
        }

        long init = System.nanoTime();
        for (int i = 0; i < MAX_ITER_TIMES; i++) {
            nums.set(0, i);
            numsOneLineCode.set(0, i);
        }
        long end = System.nanoTime() - init;
        System.out.println("Performance :" + end);
       
        int getMiddle = nums.size() / DIV;
        init = System.nanoTime();
        for (int i = 0; i < MAX_ITERATION; i++) {
            int value = nums.get(getMiddle);
            int v = nums.get(getMiddle);
        }
        end = System.nanoTime();
        System.out.println("Performance :" + end);
       
        Map<String, Long> continents = new HashMap<String, Long>();
        continents.put("Africa", 1110635000L);
        continents.put("Americas", 972005000L);
        continents.put("Antarctica", 0L);
        continents.put("Asia", 4298723000L);
        continents.put("Europe", 742452000L);
        continents.put("Oceania", 38304000L);
       
        Iterator<Entry<String, Long>> it = continents.entrySet().iterator();
        long worldPopulation = 0L;
        while (it.hasNext()) {
            Map.Entry<String, Long> new_Map = (Map.Entry<String, Long>)it.next();
            worldPopulation += new_Map.getValue();
        }
        System.out.println("World Population : "  + worldPopulation);
    }
}
