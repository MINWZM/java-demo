package overrides_and_overload_diff;

import org.junit.Test;

public class MinTest {
    @Test
    public void testMin(){
        Min min = new Min();
        System.out.println(min.introdution());
        Min min1 = new Min("male");
        System.out.println(min1.introdution());
    }
}
