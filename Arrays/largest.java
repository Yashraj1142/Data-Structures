public class largest {
    public static void main(String[] args) {
        int[] arr = {5,41,23,67,32,12};

        if(arr.length < 1){
            System.out.println("Array must contain elements.");
            return;
        }

        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Largest element is: " + max);
    }
}
