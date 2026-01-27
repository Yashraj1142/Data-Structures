class AtoiSolution{
    int atoiResult(String s){
        long result = 0;
        int i=0;
        int sign = 1;

        //skip white spaces
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }

        //sign identification
        while(i<s.length() && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            if(s.charAt(i)=='-'){
                sign = -1;
            } else{
                sign = 1;
            }
            i++;
        }

        //Convert digit
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            result = result*10 + (s.charAt(i)-'0');

            if(result*sign >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(result*sign <= Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int) (result*sign);
    }
}


public class Atoi {
    public static void main(String[] args) {
        AtoiSolution a1 = new AtoiSolution();
        System.out.println(a1.atoiResult("0-1"));
    }
}
