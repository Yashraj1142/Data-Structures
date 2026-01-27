class LongestPalindromeSolution{
    String palindromeLength(String s){
        if(s==null || s.length()<1) return "";

        int start=0, end=0;
        
        for(int i=0;i<s.length();i++){
            int len1 = expand(s, i, i); //odd palindrome length
            int len2 = expand(s, i, i+1);   //even palindrome length
            int len = Math.max(len1, len2);

            if(len > end-start){
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }

        return s.substring(start, end+1);
    }

    int expand(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(right) == s.charAt(left)){
            left--;
            right++;
        }
        return right-left-1;
    }
}

public class LongestPalindrome {
    public static void main(String[] args) {
        LongestPalindromeSolution l1 = new LongestPalindromeSolution();
        System.out.println(l1.palindromeLength("cbbd"));
    }
}
