class LargestOddStringSolution{
    public String oddString(String s){
        int i = s.length()-1;

        while(i>=0){
            int num = s.charAt(i) - '0';
            if(num%2!=0){
                return s.substring(0, i+1); 
            }
            i--;
        }

        return "";
    }
}

public class LargeOddString {
    public static void main(String[] args) {
        LargestOddStringSolution o1 = new LargestOddStringSolution();

        String s = "546782";
        System.out.println(o1.oddString(s));
    }
}
