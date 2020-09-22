package gk;

public class Quick {
    public int[] sort(int[] nums) {
        sort(nums, 0, nums.length-1);
        return nums;
    }

    private void sort(int[] nums, int left, int right) {
        int l = left; //左下标
        int r = right; //右下标
        //pivot 中轴值
        int pivot = nums[(left + right) / 2];
        int temp = 0; //临时变量，作为交换时使用
        //while循环的目的是让比pivot 值小放到左边
        //比pivot 值大放到右边
        while( l < r) {
            //在pivot的左边一直找,找到大于等于pivot值,才退出
            while( nums[l] < pivot) {
                l += 1;
            }
            //在pivot的右边一直找,找到小于等于pivot值,才退出
            while(nums[r] > pivot) {
                r -= 1;
            }
            //如果l >= r说明pivot 的左右两的值，已经按照左边全部是
            //小于等于pivot值，右边全部是大于等于pivot值
            if( l >= r) {
                break;
            }

            //交换
            temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;

            //如果交换完后，发现这个nums[l] == pivot值 相等 r--， 前移
            if(nums[l] == pivot) {
                r -= 1;
            }
            //如果交换完后，发现这个nums[r] == pivot值 相等 l++， 后移
            if(nums[r] == pivot) {
                l += 1;
            }
        }

        // 如果 l == r, 必须l++, r--, 否则为出现栈溢出
        if (l == r) {
            l += 1;
            r -= 1;
        }
        //向左递归
        if(left < r) {
            sort(nums, left, r);
        }
        //向右递归
        if(right > l) {
            sort(nums, l, right);
        }
    }
}
