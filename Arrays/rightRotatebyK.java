public class rightRotatebyK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] newarr = new int[arr.length];
        int k=3;

        k = k%(arr.length);

        for(int i=0;i<k;i++){
            newarr[i] = arr[arr.length-k+i];
        }

        for(int i=k;i<arr.length;i++){
            newarr[i] = arr[i-k];
        }


        for(int j=0;j<arr.length;j++){
            System.out.println(newarr[j]);
        }
    }
}
