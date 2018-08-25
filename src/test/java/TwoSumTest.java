import answers.lyc.TwoSum1;
import answers.veteran.TwoSum2;
import org.junit.Test;
import problems.easy.TwoSum;
import utils.ArraysUtil;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class TwoSumTest {
    @Test
    public void test1(){
        TwoSum ans = new TwoSum1();
        assertTrue(ArraysUtil.equals(ans.twoSum(new int[]{2,7,11,15},9),new int[]{0,1}));
    }

    @Test
    public void test2(){
        TwoSum ans = new TwoSum1();
        assertTrue(ArraysUtil.equals(ans.twoSum(new int[]{3,2,4},6),new int[]{1,2}));
    }

    @Test
    public void test3(){
        TwoSum ans = new TwoSum2();
        assertTrue(ArraysUtil.equals(ans.twoSum(new int[]{3,2,4},6),new int[]{1,2}));
    }



}
