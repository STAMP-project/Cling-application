import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = parser0.eof();
    }
}

