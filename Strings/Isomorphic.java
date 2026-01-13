import java.util.HashMap;

class IsomorphicSolution{
    boolean isIsomorphic(String s, String t){
        //checking if both the strings are of same length
        if(s.length() != t.length()){
            return false;
        }

        //declaring HashMap
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            //check mapping s->t
            if(mapST.containsKey(c1)){
                if(mapST.get(c1)!=c2){
                    return false;
                }
            }
            else{
                mapST.put(c1,c2);
            }

            //check mapping t->s
            if(mapTS.containsKey(c2)){
                if(mapTS.get(c2)!=c1){
                    return false;
                }
            }
            else{
                mapTS.put(c2, c1);
            }
        }

        return true;
    }
}

public class Isomorphic{
    public static void main(String[] args) {
        IsomorphicSolution i1 = new IsomorphicSolution();

        String s = "eggd";
        String t = "foo";
        System.out.println(i1.isIsomorphic(s, t));
    }
}