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
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(12, "{proxy:{1724660795}}");
        boolean boolean3 = node2.isThis();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 100, "PARAM_LIST\n");
        boolean boolean7 = node6.isReturn();
        boolean boolean8 = node6.isContinue();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("{proxy:{890514683}}", 0, 0);
        boolean boolean13 = node12.isNew();
        boolean boolean14 = node12.isWhile();
        boolean boolean15 = node12.isFalse();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChild(node6, node12);
    }
}

