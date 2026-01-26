import java.util.*;

class SortByFrequencySolution {
    String frequencySort(String s){
        Map<Character, Integer> freq = new HashMap<>();
        
        for(char c:s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }

        //converting map to list
        List<Character> chars = new ArrayList<>(freq.keySet());

        //sort in descending order (as per frequency)
        chars.sort((a,b)->freq.get(b)-freq.get(a));

        StringBuilder sb = new StringBuilder();
        for(char c:chars){
            sb.append(String.valueOf(c).repeat(freq.get(c)));
        }
        return sb.toString();
    }
}

public class SortByFrequency {
    public static void main(String[] args) {
        SortByFrequencySolution s1 = new SortByFrequencySolution();

        System.out.println(s1.frequencySort("tree"));
    }
}
