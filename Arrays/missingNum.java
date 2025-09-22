public class missingNum {
    public static void main(String[] args) {
        int[] arr = {0,1};

        //finding the maximum number (end point of the range)
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        //Thus, the range is from 0 to max
        int missing = -1;
        for(int j=0;j<max;j++){
            boolean present = false;
            for(int k=0;k<arr.length;k++){
                if(arr[k] == j){
                    present = true;
                }
                if(present) break;
            }
            if(present){
                continue;
            }
            else{
                missing = j;
                break;
            }
        }

        if(missing == -1){
            missing = max+1;
        }

        System.out.println("The missing element is: " + missing);
    }
}
