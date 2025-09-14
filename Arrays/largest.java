public class largest {
    public static void main(String[] args) {
        int[] arr = {5,41,23,67,32,12};

        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Largest element is: " + max);
    }
}
