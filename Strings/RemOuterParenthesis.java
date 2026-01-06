class OuterParenSolution{
    public String remover(String s){
        StringBuilder res = new StringBuilder();
        int ctr = 0;

        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(ctr > 0){
                    res.append(ch);
                }
                ctr++;
            }
            else{
                ctr--;
                if(ctr>0){
                    res.append(ch);
                }
            }
        }

        return res.toString();
    }
}

public class RemOuterParenthesis{
    public static void main(String[] args) {
        OuterParenSolution o1 = new OuterParenSolution();

        String s = "()(()())(())";
        System.out.println(o1.remover(s));
    }
}