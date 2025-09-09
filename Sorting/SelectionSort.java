public class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {79,22,34,12,58};
        
        for(int i=0;i<(arr.length-1);i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            //swapping
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println("Sorted array: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}