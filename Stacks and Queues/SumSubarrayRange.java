class SumSubarrayRangeSolution{
    long subArrayRanges(int[] nums) {
        long sum = 0;

        for(int i=0;i<nums.length;i++){
            int max = nums[i];
            int min = nums[i];
            
            for(int j=i;j<nums.length;j++){
                if(nums[j]>max) max=nums[j];
                if(nums[j]<min) min=nums[j];
                sum = sum + (max - min);
            }
        }

        return sum;
    }
}

public class SumSubarrayRange {
    public static void main(String[] args) {
        SumSubarrayRangeSolution s1 = new SumSubarrayRangeSolution();

        int[] nums = {1,2,3};
        System.out.println("Ans: " + s1.subArrayRanges(nums));
    }
}
