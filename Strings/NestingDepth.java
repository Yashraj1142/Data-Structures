class NestingDepthSolution{
    int maxDepth(String s){
        int depth = 0;
        int count = 0;
        for(char c:s.toCharArray()){
            if(c=='('){
                count++;
            } else if(c==')'){
                count--;
            }
            
            if(count>depth){
                depth = count;
            }
        }
        return depth;
    }
}

public class NestingDepth {
    public static void main(String[] args) {
        NestingDepthSolution n1 = new NestingDepthSolution();

        System.out.println(n1.maxDepth("(1+(2*3)+((8)/4))+1"));
    }
}
