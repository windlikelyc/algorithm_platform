package problems.easy;

import annotation.DataStructure;
import enums.DataStructureEnum;

import static enums.DataStructureEnum.ARRAY;
import static enums.DataStructureEnum.HASHTABLE;

@DataStructure(type = {ARRAY,HASHTABLE})
public interface TwoSum {
    /**
     *  给定一组整数，返回两者之和等于某个数的下标
     *  默认只有一组解,不可以返回下标相同的数
     * @param nums 一组数
     * @param target 目标和
     * @return 下标
     */
    public int[] twoSum(int[] nums, int target);

}
