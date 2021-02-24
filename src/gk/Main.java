package gk;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] nums = {23,78,34,12,3,6,56,39,19,34};
//	    int[] nums = {3,2,2,1,5,0};
//        int[] nums = {5,3,5,9,7,3,4,7,23,4,3,2,6};
        Draft ob = new Draft();
        ob.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
