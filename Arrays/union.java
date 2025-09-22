import java.util.*;

public class union {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};

        Set<Integer> unionSet = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            unionSet.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            unionSet.add(arr2[j]);
        }

        int[] unionArr = new int[unionSet.size()];
        List<Integer> unionList = new ArrayList<>(unionSet);

        for(int k=0;k<unionSet.size();k++){
            unionArr[k] = unionList.get(k);
        }

        for (int l : unionArr) {
            System.out.println(l);
        }
    }
}
