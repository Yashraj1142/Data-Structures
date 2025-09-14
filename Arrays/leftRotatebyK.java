public class leftRotatebyK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] newarr = new int[arr.length];
        int k=3;

        for(int i=0;i<k;i++){
            newarr[arr.length-k+i] = arr[i];
        }

        for(int i=0;i<arr.length-k;i++){
            newarr[i] = arr[i+k];
        }


        for(int j=0;j<arr.length;j++){
            System.out.println(newarr[j]);
        }
    }
}
