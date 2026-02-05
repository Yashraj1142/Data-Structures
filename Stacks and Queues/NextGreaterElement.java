import java.util.*;

class NextGreaterElementSolution{
    int[] findNextGreater(int[] nums1, int[] nums2){
        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[nums1.length];

        //map numbers to next greater number
        for(int num:nums2){
            while(!(s.isEmpty()) && num>s.peek()){
                map.put(s.pop(), num);
            }
            s.push(num);
        }

        //map remaining numbers to -1
        while(!(s.isEmpty())){
            map.put(s.pop(), -1);
        }

        //create the ans array
        for(int i=0;i<nums1.length;i++){
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}

public class NextGreaterElement{
    public static void main(String[] args) {
        NextGreaterElementSolution n1 = new NextGreaterElementSolution();
        int[] nums1 = {4, 2, 1, 6};
        int[] nums2 = {3, 6, 4, 2, 1, 5};

        int[] res = n1.findNextGreater(nums1, nums2);

        for(int i=0;i<res.length;i++){
            System.out.print(res[i] + ", ");
        }
    }
}