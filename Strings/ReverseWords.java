class ReverseWordsSolution{
    public String reverse(String s){
        StringBuilder res = new StringBuilder();
        int i = s.length()-1;

        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }

            if(i<0){
                break;
            }

            int j = i;

            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }

            res.append(s.substring(i+1, j+1));
            res.append(" ");
        }
        
        return res.toString().trim();
    }
}

public class ReverseWords{
    public static void main(String[] args) {
        ReverseWordsSolution r1 = new ReverseWordsSolution();

        String s = "  Welcome to my house  ";
        System.out.println(r1.reverse(s));

    }
}