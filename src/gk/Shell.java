package gk;

public class Shell {
    public int[] sort(int[] nums) {
        int temp;
        int gap = nums.length/2;
        while (gap >=1){
            for (int i = 0;i< gap; i++){
                for (int j = gap + i; j< nums.length; j+=gap){
                    for (int l= j; l>gap -1; l-=gap){
                        if (nums[l] < nums[l-gap]){
                            temp = nums[l];
                            nums[l] = nums[l-gap];
                            nums[l-gap] = temp;
                        }
                    }
                }
            }
            gap /= 2;
        }
        return nums;
    }
}

