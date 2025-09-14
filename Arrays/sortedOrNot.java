public class sortedOrNot {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        boolean ascending = true;
        boolean descending = true;

        for(int i=0;i<(arr.length-1);i++){
            if(arr[i]<arr[i+1]){
                descending = false;
            } else if(arr[i]>arr[i+1]){
                ascending = false;
            }
        }

        if(ascending){
            System.out.println("The array is sorted in ascending order.");
        } else if(descending){
            System.out.println("The array is sorted in descending order.");
        } else{
            System.out.println("The array is not sorted.");
        }
    }
}
