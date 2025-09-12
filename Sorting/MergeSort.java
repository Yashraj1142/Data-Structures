class func{
    void divide(int[] arr, int low, int high){
        if(low>=high){
            return;
        }

        int mid = (low+high)/2;
        divide(arr, low, mid);
        divide(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int i = 0;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[i] = arr[left];
                i++;
                left++;
            }
            else{
                temp[i] = arr[right];
                i++;
                right++;
            }
        }

        while(left<=mid){
            temp[i] = arr[left];
            i++;
            left++;
        }
        while(right<=high){
            temp[i] = arr[right];
            i++;
            right++;
        }

        for(int j=0;j<temp.length;j++){
            arr[low+j] = temp[j];
        }
    }
}

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,1,5,2,6,4};
        
        int low = 0;
        int high = arr.length-1;

        func f1 = new func();
        f1.divide(arr, low, high);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
