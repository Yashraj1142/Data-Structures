class Once{
    int findOnceAppearing(int[] arr){
        int ans = 0;
        for(int num:arr){
            ans = ans ^ num;
        }

        return ans;
    }
}

public class appearOnce {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};

        Once o1 = new Once();
        System.out.println(o1.findOnceAppearing(arr));
    }
}
