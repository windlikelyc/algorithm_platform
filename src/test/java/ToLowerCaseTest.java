import answers.lyc.ToLowerCaseImpl;
import org.junit.Test;
import problems.easy.ToLowerCase;
import utils.ArraysUtil;
import utils.ClassUtil;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ToLowerCaseTest {
    @Test
    public void test() {
        ClassUtil classUtil = new ClassUtil() {
            public void check(Object ans) {
                assertTrue(ans.equals("apple"));
            };
        };
        classUtil.runAllMethod(ToLowerCase.class,"ApPle");

    }

    @Test
    public void test2(){
        ToLowerCase toLowerCase = new ToLowerCaseImpl();
        String ans = toLowerCase.toLowerCase("");
        assertEquals(ans,"");
    }

    @Test
    public void test3(){
        ToLowerCase toLowerCase = new ToLowerCaseImpl();
        String ans = toLowerCase.toLowerCase("A");
        assertEquals(ans,"a");
    }
}
