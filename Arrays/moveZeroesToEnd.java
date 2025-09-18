class ZeroMove{
    void movezero(int[] arr){
        int[] newarr = new int[arr.length];
        int i = 0;
        int j = 0;

        while(i<arr.length){
            if(arr[i] != 0){
                newarr[j] = arr[i];
                j++;
            }
            i++;
        }

        //fill all the remaining positions with zero
        for(int k=j;k<arr.length;k++){
            newarr[k] = 0;
        }

        //copy the elements back to the original array
        for(int l=0;l<arr.length;l++){
            arr[l] = newarr[l];
        }
    }
}

public class moveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        
        ZeroMove z1 = new ZeroMove();
        z1.movezero(arr);

        for(int num:arr){
            System.out.println(num);
        }
    }
}
