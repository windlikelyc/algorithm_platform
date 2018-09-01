package answers.veteran;

import problems.easy.TwoSum;

import java.util.HashMap;

public class TwoSumImpl implements TwoSum{
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();

        for(int i =0; i < nums.length; i++) {
            int result = target - nums[i];

            // 首先从一个数减掉当钱数，查看之前是否有等待凑满的数，有就返回
            if(myMap.containsKey(result)) {
                solution[0] = i;
                solution[1] = myMap.get(result);
                return solution;
            }
            // 没有就放入map，等着将来凑
            myMap.put(nums[i], i);
        }
        return null;
    }
}
