package ra;

public class Draft {
    public int[] sort(int[] arr) {
        gk(arr, 0, arr.length-1);
        return arr;
    }

    public void gk(int[] arr, int left, int right){
        if (left >= right)
            return;
        int mid = left + (right - left)/2;
        gk(arr, left, mid);
        gk(arr, mid+1, right);
        merge(arr, left, right);
    }

    private void merge(int[] arr, int left, int right) {
        int[] temp = new int[right-left+1];
        int l = left;
        int mid = left + (right-left)/2;
        int r = mid + 1;
        int index = 0;
        while(l <= mid || r <= right){
            if (l > mid || r <= right && arr[l] > arr[r]){
                temp[index++] = arr[r++];
            }else{
                temp[index++] = arr[l++];
            }
        }
        System.arraycopy(temp, 0, arr, left, right-left+1);
    }

    private void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
