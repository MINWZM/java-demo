import org.junit.Test;

public class ExceptionTest {
    private static final Object runtimeException = new RuntimeException();

    @Test
    public void testException() {
        try {
            System.out.print("a");
            throw (Throwable) runtimeException;
        } catch (RuntimeException e) {
            System.out.print("b");
        } catch (Exception e) {
            System.out.print("c");
        } catch (Throwable throwable) {
            System.out.print("c");
        } finally {
            System.out.print("d");
        }
        System.out.print("e");
    }
}
