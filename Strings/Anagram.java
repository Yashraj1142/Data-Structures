class AnagramSolution{
    boolean isAnagram(String s, String t){
        //checking lengths
        if(s.length() != t.length()){
            return false;
        }

        int arr[] = new int[26];
        
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for(int c: arr){
            if(c!=0){
                return false;
            }
        }

        return true;
    }
}

public class Anagram {
    public static void main(String[] args) {
        AnagramSolution a1 = new AnagramSolution();

        String s = "cat";
        String t = "tac";
        System.out.println(a1.isAnagram(s, t));
    }
}
