import org.junit.Test;
import problems.easy.ToLowerCase;
import problems.easy.UniqueMorseCodeWords;
import utils.ClassUtil;

import static org.junit.Assert.assertTrue;

public class UniqueMorseCodeWordsTest {

    @Test
    public void test(){
        ClassUtil classUtil = new ClassUtil() {
            public void check(Object ans) {
                assertTrue(ans.equals(2));
            };
        };
        classUtil.runAllMethod(UniqueMorseCodeWords.class,new Object[]{new String[]{"gin", "zen", "gig", "msg"}});
    }
}
