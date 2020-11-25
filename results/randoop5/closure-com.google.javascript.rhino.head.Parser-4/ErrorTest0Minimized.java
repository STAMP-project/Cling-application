import com.google.javascript.rhino.head.Parser;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0Minimized {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        Parser parser0 = new Parser();
        parser0.eof();
    }
}
