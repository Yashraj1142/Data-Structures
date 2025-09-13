class Recur{
    void RecurInsertion(int[] arr, int n){
        //Base case
        if(n<=1) return;

        RecurInsertion(arr, n-1);

        int last = arr[n-1];
        int j = n-2;
        while(j>=0 && arr[j]>last){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
}

public class RecurInsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,1,2,6};
        Recur r1 = new Recur();

        r1.RecurInsertion(arr, arr.length);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
