import org.junit.Test;

public class VariableTest {
    //全局变量
    int glo_var;
    @Test
    public void testGlo_var(){
        //局部变量
        int loc_var=0;
        System.out.println(glo_var);
        System.out.println(loc_var);
    }
}
