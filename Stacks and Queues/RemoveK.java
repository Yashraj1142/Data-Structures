import java.util.*;

class RemoveKSolution{
    String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();

        if(num.length() == 1){
            return "0";
        }

        int i = 0;
        int removeCount = 0;
        while(i<num.length() && removeCount<k){
            if(s.isEmpty()){
                s.push(num.charAt(i));
                i++;
                continue;
            }

            if(s.peek() > num.charAt(i)){
                s.pop();
                removeCount++;
                continue;
            }
            s.push(num.charAt(i));

            i++;
        }

        while (i<num.length()) {
            s.push(num.charAt(i));
            i++;
        }

        while(removeCount < k && !(s.isEmpty())){
            s.pop();
            removeCount++;
        }

        char[] res = new char[s.size()];
        for(int j=s.size()-1;j>=0;j--){
            res[j] = s.pop();
        }
        String result = new String(res);

        int j = 0;
        while(j<result.length() && result.charAt(j)=='0'){
            j++;
        }
        result = result.substring(j);

        if(result.length() == 0) return "0";
        return result;
    }
}

public class RemoveK {
    public static void main(String[] args) {
        RemoveKSolution r = new RemoveKSolution();
        String s = r.removeKdigits("112", 1);
        System.out.println(s);
    }
}
