package ra;

import java.util.ArrayList;

public class Radix {
    public int[] sort(int[] nums){
        if (nums == null || nums.length < 2)
            return nums;
        // 1.先算出最大数的位数；
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        int maxDigit = 0;
        while (max != 0) {
            max /= 10;
            maxDigit++;
        }

        int mod = 10, div = 1;
        //二维数组,第一维是桶,第二维是桶里的元素
        ArrayList<ArrayList<Integer>> bucketList = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 10; i++)
            bucketList.add(new ArrayList<Integer>());

        for (int i = 0; i < maxDigit; i++, mod *= 10, div *= 10) {
            //对mod取模,除以div,可以获得数字在当前位的数字,放进合适的桶里.
            for (int j = 0; j < nums.length; j++) {
                int num = (nums[j] % mod) / div;
                bucketList.get(num).add(nums[j]);
            }
            int index = 0;
            //将每个通内的元素按顺序拿出来,此时的顺序已经是按照当前位排序后的元素
            for (int j = 0; j < bucketList.size(); j++) {
                for (int k = 0; k < bucketList.get(j).size(); k++)
                    nums[index++] = bucketList.get(j).get(k);
                bucketList.get(j).clear();
            }
        }
        return nums;
    }
}
