import answers.veteran.TwoSumImpl;
import org.junit.Test;
import problems.easy.TwoSum;
import utils.ArraysUtil;
import utils.ClassUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;

import static org.junit.Assert.assertTrue;
import static utils.ClassUtil.getAllAssignedClass;

public class TwoSumTest {


    @Test
    public void testAll() throws IOException, ClassNotFoundException {
        ClassUtil classUtil = new ClassUtil() {
            public void check(Object ans) {
                assertTrue(ArraysUtil.equals((int[])ans,new int[]{1,2}));
            };
        };
        classUtil.runAllMethod(TwoSum.class,new Object[]{new int[]{3,2,4},6});
    }



}
