import java.util.*;

public class unionOptimized {
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 3, 4, 5 };
        int[] arr2 = { 4, 5, 6, 7, 8 };

        ArrayList<Integer> unionArr = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arr1[i]) {
                    unionArr.add(arr1[i]);
                }
                i++;
            } else {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arr2[j]) {
                    unionArr.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < arr1.length) {
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arr1[i]) {
                unionArr.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arr2[j]) {
                unionArr.add(arr2[j]);
            }
            j++;
        }

        for (Integer m : unionArr) {
            System.out.println(m);
        }
    }
}
