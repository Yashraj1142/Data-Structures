class Recur{
    void RecurBubble(int[] arr, int n){
        //Base case
        if(n<=1) return;

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        RecurBubble(arr, n-1);
    }
}

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,2,9,6,1};

        Recur r1 = new Recur();
        r1.RecurBubble(arr, arr.length);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
