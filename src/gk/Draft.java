package gk;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Draft {
    public int[] sort(int[] arr) {
        for (int i = arr.length/2-1; i >= 0; i--){
            gk(arr, i, arr.length-1);
        }
        for (int i = arr.length-1; i > 0; i--){
            swap(arr, 0, i);
            gk(arr, 0, i-1);
        }
        return arr;
    }

    public void gk(int[] arr, int i, int end){
        while (i <= end){
            int maxIndex = i;
            int left = 2*i+1;
            int right = 2*i+2;
            if (left <= end && arr[maxIndex] < arr[left]){
                maxIndex = left;
            }
            if (right <= end && arr[maxIndex] < arr[right]){
                maxIndex = right;
            }
            if (maxIndex == i)
                break;
            swap(arr, maxIndex, i);
            i = maxIndex;
        }
    }

    public void swap(int[] arr, int maxIndex, int i){
        arr[i] = arr[i] ^ arr[maxIndex];
        arr[maxIndex] = arr[i] ^ arr[maxIndex];
        arr[i] = arr[i] ^ arr[maxIndex];
    }
}
