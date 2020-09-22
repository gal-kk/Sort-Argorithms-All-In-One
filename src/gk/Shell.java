package gk;

public class Shell {
    public int[] sort(int[] arr) {

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            // 从第gap个元素，逐个对其所在的组进行直接插入排序
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j - gap]) {
                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        //移动
                        arr[j] = arr[j-gap];
                        j -= gap;
                    }
                    //当退出while后，就给temp找到插入的位置
                    arr[j] = temp;
                }

            }
        }
        return arr;
//        int gap = nums.length/2;
//        while (gap >=1){
//            for (int i = gap; i<nums.length; i++){
//                int j = i;
//                int temp = nums[j];
//                if (temp<nums[j-gap]){
//                    while(j-gap>=0 && temp < nums[j-gap]){
//                        nums[j] = nums[j-gap];
//                        j-=gap;
//                    }
//                }
//                nums[j] = temp;
//            }
//            gap /= 2;
//        }
//        return nums;
    }
}

