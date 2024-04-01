import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class cha3 {
    public static void main(String[] args) {
       Map<String,Integer> j=new HashMap<>();
       j.put("sri",1);
       j.put("srinath",5);
       j.put("sainath",8);
       j.put("santhosh",7);
       Map<String,Integer> sorts=sortByValues(j);
       System.out.println("Sorted Map By Values:");
        for (Map.Entry<String, Integer> entry : sorts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    private static Map<String, Integer> sortByValues(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());

        // Using a lambda expression for custom comparator
        entryList.sort((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()));

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
