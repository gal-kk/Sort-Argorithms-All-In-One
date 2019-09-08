package gk;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Draft {

    public int[] sort(int[] nums) {
        int[] base = new int[10];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        ArrayList<ArrayList<Integer>> dual = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < 10; i++) {
            dual.add(new ArrayList<Integer>());
        }

        int under = 1;

        while (max % 10 != 0) {
            for (int i = 0; i < nums.length; i++) {
                dual.get((nums[i]/under) % 10).add(nums[i]);
            }

            int index = 0;

            for (int j = 0; j < 10; j++) {
                for (int i = 0; i < dual.get(j).size(); i++) {
                    if (!dual.get(j).isEmpty()) {
                        nums[index] = dual.get(j).get(i);
                        index++;
                    }
                }
                dual.get(j).clear();
            }

            max /= 10;
            under *= 10;

        }
        return nums;
    }
}
