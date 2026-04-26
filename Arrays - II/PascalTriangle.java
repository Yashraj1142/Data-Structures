import java.util.*;

class Pascal{
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> list = new ArrayList<>();

        if(numRows > 0){
            List<Integer> row1 = new ArrayList<>();
            row1.add(1);
            list.add(row1);
        }

        if(numRows > 1){
            List<Integer> row2 = new ArrayList<>();
            row2.add(1);
            row2.add(1);
            list.add(row2);
        }


        for(int i=2;i<numRows;i++){
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);

            for(int j=1;j<i;j++){
                newRow.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
            }
            newRow.add(1);
            list.add(newRow);
        }

        return list;
    }
}

public class PascalTriangle {
    public static void main(String[] args) {
        Pascal p1 = new Pascal();
        List<List<Integer>> res = p1.generate(5);

        System.out.println(res);
    }
}
