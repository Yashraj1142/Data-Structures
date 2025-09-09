public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {79,22,34,12,58};

        for(int i=0;i<arr.length-1;i++){
            int j = i+1;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
