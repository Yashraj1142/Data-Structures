class Quick{
    void QuickSort(int[] arr, int low, int high){
        if(low<high){
            int partionIndex = sort(arr, low, high);
            QuickSort(arr, low, partionIndex-1);
            QuickSort(arr, partionIndex+1, high);
        }
    }

    int sort(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i<j){
            while(arr[i]<=pivot && i<high){
                i++;
            }
            while(arr[j]>pivot && j>low){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap arr[j] and arr[low]
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;

        return j;
    }
}

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,3,7,1,9,2};

        Quick q1 = new Quick();
        q1.QuickSort(arr, 0, arr.length-1);

        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
        
    }
}
