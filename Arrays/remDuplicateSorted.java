class remove{
    int removeDulplicate(int[] arr, int  n){
        int i = 0;
        int j = i+1;

        while(j<arr.length){
            if(arr[i]==arr[j]){
                j++;
            } else{
                arr[i+1] = arr[j];
                i++;
                j++;
            }
        }

        return i+1;
    }
}

public class remDuplicateSorted {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,3,3,3,3,3,4,5,6,6,7,7,7};

        remove r1 = new remove();

        int newlen = r1.removeDulplicate(arr, arr.length);

        for(int i=0;i<newlen;i++){
            System.out.println(arr[i]);
        }
    }
}
