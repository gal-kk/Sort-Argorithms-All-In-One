package gk;

public class Insertion {
    public int[] sort(int[] nums){

//        for (int i = 1; i< nums.length; i++){
//            for (int j = i; j>0; j--){
//                if (nums[j] < nums[j-1]){
//                    int temp = nums[j];
//                    nums[j] = nums[j-1];
//                    nums[j-1] = temp;
//                }else
//                    break;
//            }
//        }

        for (int i = 1; i< nums.length; i++){
            int min = nums[i];
            int j;
            for (j = i; j>0 && min < nums[j-1]; j--){
                    nums[j] = nums[j-1];
            }
            nums[j] = min;
        }

        return nums;
    }
}
