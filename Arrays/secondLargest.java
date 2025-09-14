public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {5,41,23,67,32,12};

        if(arr.length<2){
            System.out.println("Array must have more elements.");
            return;
        }

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            } else if(arr[i] > secMax && arr[i] < max){
                secMax = arr[i];
            }
        }

        if(secMax == Integer.MIN_VALUE){
            System.out.println("No second largest number found.");
        } else{
            System.out.println("The second largest number is: " + secMax);
        }
    }
}
