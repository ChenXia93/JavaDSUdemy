package JavaSelfLearning.Array.LeetCodeArray;

class Solution {
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i< nums.length; i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}


public class RunningSum {
    public static void main(String [] args){
        int[] nums = {1,2,3,4};
        Solution.runningSum(nums);

        for (int x: nums) {
            System.out.print(x + " ");
        }
    }
}
