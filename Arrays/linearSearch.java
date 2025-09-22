public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {9,2,4,6,4,9,10,21,9};
        int target = 9;
        int occurences = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                occurences++;
            }
        }

        if(occurences == 0){
            System.out.println("No such element found");
        } else{
            int[] position = new int[occurences];
        int k=0;

        for(int j=0;j<arr.length;j++){
            if(arr[j] == target){
                position[k] = j;
                k++;
            }
        }

        System.out.print(target + " is present at indexes: ");
        for(int l=0;l<position.length;l++){
            System.out.print(position[l] + " ");
        }
        }
    }
}
