package ra;

public class Selection {
    public int[] sort(int[] nums) {
        if (nums == null || nums.length == 0) return nums;
        selectionSort(nums);
        return nums;
    }
    private void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) minIndex = j;
            }
            // when it comes to two same number (34,34), xor will cause mistake
            if (minIndex != i) {
                swap(nums, i, minIndex);
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }
}
