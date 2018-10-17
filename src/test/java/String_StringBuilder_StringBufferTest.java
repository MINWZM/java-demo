import org.junit.Test;

public class String_StringBuilder_StringBufferTest {

    //private final char value[],线程安全;
    @Test
    public void testString(){
        String str = new String("String");
        System.out.println(str);
    }


    //单线程,线程不安全
    @Test
    public void testStringBuilder(){
        StringBuilder str = new StringBuilder("StringBuilder");
        str.append("+append");
        System.out.println(str);
    }
    //多线程,线程安全
    @Test
    public void testStringBuffer(){
        StringBuffer str = new StringBuffer("StringBuffer");
        str.append("+append");
        System.out.println(str);
    }
}
