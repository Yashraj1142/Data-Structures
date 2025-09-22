import java.util.*;

public class intersection {
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 3, 4, 5 };
        int[] arr2 = { 4, 5, 6, 7, 8 };

        ArrayList<Integer> interArr = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                if (interArr.isEmpty() || interArr.get(interArr.size() - 1) != arr1[i]) {
                    interArr.add(arr1[i]);
                }
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }

        for (Integer m : interArr) {
            System.out.println(m);
        }
    }
}
