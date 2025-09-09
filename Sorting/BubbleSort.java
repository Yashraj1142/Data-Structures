public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {79,22,34,12,58};

        for(int i=arr.length-1;i>0;i--){
            boolean didswap = false;

            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    //swap(arr[j], arr[j+1])
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didswap = true;
                }
            }
            if(!didswap){
                    break;  //this will break the loop if the array gets sorted at any point
                }
        }

        System.out.println("Sorted Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
