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
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(167941, "OR  [quoted: 1] [source_file: Not declared as a type name]", (-1), 44);
        com.google.javascript.rhino.Node node5 = node4.cloneTree();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = node8.getParent();
        com.google.javascript.rhino.Node node11 = node8.getAncestor((int) (short) 0);
        node11.setType(50);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder14 = node11.getJsDocBuilderForNode();
        node11.setSourceFileForTesting("JSDocInfo");
        boolean boolean17 = node11.isVoid();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("java.io.IOException: java.io.IOException: JSDocInfo");
        node11.addChildToBack(node19);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("OR  [input_id: InputId: [class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]]");
        boolean boolean23 = node22.isGetterDef();
        boolean boolean24 = node19.isEquivalentToTyped(node22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node22);
    }
}

