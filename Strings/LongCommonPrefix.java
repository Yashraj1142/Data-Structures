class LongCommonPrefixSolution{
    public String commonPrefix(String[] str){
        String prefix = str[0];

        for(int i=1;i<str.length;i++){
            while(!str[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);    //shrinking the prefix

                if(prefix.length()==0){
                    return "";
                }
            }
        }

        return prefix;
    }
}

public class LongCommonPrefix {
    public static void main(String[] args) {
        LongCommonPrefixSolution l1 = new LongCommonPrefixSolution();

        String[] str = {"flow", "flight", "flower"};
        System.out.println(l1.commonPrefix(str));
    }
}
