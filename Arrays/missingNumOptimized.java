class Missing{
    int findMissing(int[] arr){
        
        //finding the max
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max) max = arr[i];
        }

        //finding the missing
        int expectedSum = (max*(max+1))/2;
        int actualSum = 0;
        for (int j : arr) {
            actualSum += j;
        }

        int missing = expectedSum - actualSum;
        
        //if the sum is zero
        boolean zeroPresent = false;
        for (int k : arr) {
            if(k==0){
                zeroPresent = true;
                break;
            }
        }

        if(!zeroPresent){
            missing = 0;
        } else if(missing == 0){
            missing = max+1;
        }

        return missing;
    }
}

public class missingNumOptimized {
    public static void main(String[] args) {
        int[] arr = {1,0,2};

        Missing m1 = new Missing();
        System.out.println(m1.findMissing(arr));
    }
}
