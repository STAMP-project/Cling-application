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
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("{1256121915}");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("");
        int int4 = node3.getLength();
        node3.setLength((int) 'a');
        com.google.javascript.rhino.Node node7 = node3.getFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile8 = node3.getStaticSourceFile();
        boolean boolean9 = node3.isCall();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node3.new FileLevelJsDocBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node3);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        int int3 = node1.getIntProp((int) 'a');
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        int int6 = node5.getLength();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node5.siblings();
        java.lang.String str8 = node5.toString();
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newExpr(node5);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("");
        int int12 = node11.getLength();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node11.siblings();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("");
        int int17 = node15.getIntProp((int) 'a');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable18 = node15.siblings();
        java.lang.String str19 = com.google.javascript.jscomp.NodeUtil.getSourceName(node15);
        com.google.javascript.rhino.Node node20 = node11.clonePropsFrom(node15);
        boolean boolean21 = node11.isFalse();
        com.google.javascript.jscomp.CodingConvention.Bind bind22 = new com.google.javascript.jscomp.CodingConvention.Bind(node1, node5, node11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node24 = node5.getChildAtIndex(37);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("function ({proxy:{1010162445}}, {proxy:{1969256060}}, {({proxy:{1059774494}},{1218333605})}): {276342154}");
        boolean boolean2 = node1.isNoSideEffectsCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = node1.getChildAtIndex(1);
    }
}

