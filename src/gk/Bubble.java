package gk;

public class Bubble {
    public int[] sort(int[] nums){
        int temp;
        for (int i = 1; i< nums.length; i++){
            for (int j = 1; j< nums.length-i+1; j++){
                if (nums[j] < nums[j-1]){
                    temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        return nums;
    }
}
