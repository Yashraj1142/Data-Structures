class Ones{
    int findMaxOnes(int[] arr){
        int count = 0;
        int maximum = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                count++;
            }
            else{
                if(count > maximum){
                    maximum = count;
                }
                count = 0;
            }
        }

        if(count > maximum){
            maximum = count;
        }

        return maximum;
    }
}

public class maxOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,1,1,1,1};

        Ones o1 = new Ones();
        System.out.println(o1.findMaxOnes(arr));
    }
}
