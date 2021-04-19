package ra;

import java.util.Arrays;

public class Counting {
        public static int[] sort(int[] input) {
            if (input.length == 0) {
                return input;
            }
            //求出最大最小值
            int bias, min = input[0], max = input[0];
            for (int i = 1; i < input.length; i++) {
                if (input[i] > max) {
                    max = input[i];
                }
                if (input[i] < min) {
                    min = input[i];
                }
            }
            //最小值距离0的距离
            bias = 0 - min;
            //计数用的数组
            int[] bucket = new int[max - min + 1];
            Arrays.fill(bucket, 0);
            //计数
            for (int i = 0; i < input.length; i++) {
                bucket[input[i] + bias]++;
            }
            //
            int index = 0, i = 0;
            while (index < input.length) {
                if (bucket[i] != 0) {
                    //下标数字存在,注意放入结果中
                    input[index] = i - bias;
                    bucket[i]--;
                    index++;
                } else {
                    //下标数字不存在,后移一位
                    i++;
                }
            }
            return input;
        }

    public static void main(String[] argv){
        int[] nums = {5,2,3,5,1,7,0,1,3,4,7};
        Draft draft = new Draft();
//        draft.sort(nums);
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
