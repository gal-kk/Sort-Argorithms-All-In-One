package gk;

public class Selection {
    public int[] sort(int[] nums){
        int temp;
        int min_index;
        for (int i = 0; i< nums.length; i++){
            min_index = i;
            for (int j = i; j< nums.length; j++){
                if (nums[j] < nums[min_index]){
                    min_index = j;
                }
            }
            temp = nums[min_index];
            nums[min_index] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
