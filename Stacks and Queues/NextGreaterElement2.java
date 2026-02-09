import java.util.*;

class NextGreaterElement2Solution{
    int[] nextGreaterElements(int[] nums){
        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[nums.length];
        int cirNum = nums[nums.length-1];

        //map each number to next greater
        for(int num:nums){
            while(!(s.isEmpty()) && num>s.peek()){
                map.put(s.pop(), num);
            }
            s.push(num);
        }

        //map remaining numbers to -1 except the circular number
        while(!(s.isEmpty())) {
            if(s.pop() != cirNum){
                map.put(s.pop(), -1);
            }
            s.pop();
        }

        //preparing the ans array
        for(int i=0;i<nums.length;i++){
            ans[i] = map.get(nums[i]);
        }

        return ans;
    }
}

public class NextGreaterElement2 {
    public static void main(String[] args) {
        NextGreaterElement2Solution n1 = new NextGreaterElement2Solution();
        int[] nums1 = {2, 5, 3, 4, 1, 3};

        int[] res = n1.nextGreaterElements(nums1);

        for(int i=0;i<res.length;i++){
            System.out.print(res[i] + ", ");
        }
    }
}
