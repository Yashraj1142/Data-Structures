public class SelectionSort{
        public static void main(String[] args) {
            int sizeOfArr = 5;
            int[] arr = {12,54,32,89,10};

            for(int i=0;i<=sizeOfArr-2;i++){
                int min = i;
                for(int j=i;j<=sizeOfArr-1;j++){
                    if(arr[j]<arr[min]){
                        min = j;
                    }
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
            }

            for(int i=0;i<sizeOfArr;i++){
                System.out.println(arr[i]);
            }
    }
}