package gk;

import java.util.Arrays;

public class Merge {
    public int[] sort(int[] nums){
        if (nums.length < 2){
            return nums;
        }

        int mid = nums.length/2;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);

        return merge(sort(left), sort(right));
    }
    public int[] merge(int[] left, int[] right){
        int result[] = new int[left.length + right.length];
        int i = 0, j = 0, h = 0;

        while (i < left.length && j < right.length){
            if (left[i] > right[j]){
                result[h] = right[j];
                j++;
            }else if (left[i] <= right[j]){
                result[h] = left[i];
                i++;
            }
            h++;
        }

        for (; i < left.length; i++){
            result[h] = left[i];
        }

        for (; j < right.length; j++){
            result[h] = right[j];
        }

        return result;
    }
}
