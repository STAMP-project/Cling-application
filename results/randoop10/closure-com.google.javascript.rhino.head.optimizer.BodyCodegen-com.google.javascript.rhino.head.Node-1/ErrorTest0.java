import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        scope1.setLength((int) (byte) 1);
        com.google.javascript.rhino.head.ast.Scope scope10 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope10.setPosition(100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str14 = scriptNode13.getEncodedSource();
        int int15 = scriptNode13.getBaseLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scope1.replaceChild((com.google.javascript.rhino.head.Node) scope10, (com.google.javascript.rhino.head.Node) scriptNode13);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        scriptNode0.setEncodedSourceEnd(18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = scriptNode0.getRegexpFlags(1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        scope1.setLength((int) (byte) 1);
        com.google.javascript.rhino.head.Node node9 = scope1.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str11 = scriptNode10.getEncodedSource();
        scriptNode10.setEncodedSourceEnd(18);
        java.lang.String str15 = scriptNode10.makeIndent((int) '#');
        scope1.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode18 = scriptNode10.getFunctionNode(1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) scriptNode1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = scriptNode1.getRegexpFlags((-1));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int4 = scriptNode1.getIntProp(23, (int) (short) 1);
        com.google.javascript.rhino.head.ast.Scope scope6 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope6.setPosition(100);
        com.google.javascript.rhino.head.Node node9 = scope6.getLastSibling();
        node9.removeChildren();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator11 = node9.spliterator();
        scriptNode1.setCompilerData((java.lang.Object) node9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = scriptNode1.getFunctionNode((int) (byte) 100);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        int int7 = scope1.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope8 = scope1.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator9 = scope1.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope13 = scope11.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node14 = scope11.target;
        scope11.setPosition(2);
        int int17 = scope11.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope18 = scope11.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator19 = scope11.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getEncodedSource();
        int int22 = scriptNode20.getBaseLineno();
        java.lang.Object obj23 = scriptNode20.getCompilerData();
        scriptNode20.flattenSymbolTable(false);
        scope1.addChildAfter((com.google.javascript.rhino.head.Node) scope11, (com.google.javascript.rhino.head.Node) scriptNode20);
        scriptNode20.putIntProp(12, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode31 = scriptNode20.getFunctionNode(20);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) scriptNode1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = scriptNode1.getFunctionNode(5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int9 = scriptNode6.getIntProp(23, (int) (short) 1);
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope11.setPosition(100);
        com.google.javascript.rhino.head.Node node14 = scope11.getLastSibling();
        node14.removeChildren();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator16 = node14.spliterator();
        scriptNode6.setCompilerData((java.lang.Object) node14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scope1.removeChild((com.google.javascript.rhino.head.Node) scriptNode6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = scriptNode1.getRegexpString(19);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node3 = scope2.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int8 = scriptNode5.getIntProp(23, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild((com.google.javascript.rhino.head.Node) scriptNode5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope(5, 5);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newString("Scope");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scope2.removeChild(node4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        int int7 = scope1.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope8 = scope1.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator9 = scope1.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope13 = scope11.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node14 = scope11.target;
        scope11.setPosition(2);
        int int17 = scope11.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope18 = scope11.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator19 = scope11.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getEncodedSource();
        int int22 = scriptNode20.getBaseLineno();
        java.lang.Object obj23 = scriptNode20.getCompilerData();
        scriptNode20.flattenSymbolTable(false);
        scope1.addChildAfter((com.google.javascript.rhino.head.Node) scope11, (com.google.javascript.rhino.head.Node) scriptNode20);
        int int27 = scriptNode20.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = scriptNode20.getFunctionNode(6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = scriptNode1.getRegexpString(21);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int2 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str4 = scriptNode3.getEncodedSource();
        scriptNode3.setEncodedSourceEnd(18);
        scriptNode1.target = scriptNode3;
        scriptNode3.setEncodedSourceBounds((int) (byte) -1, 11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = scriptNode3.getRegexpFlags(14);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = scriptNode1.getRegexpString((-53));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((-1));
        java.lang.Object obj2 = scriptNode1.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        scriptNode1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = scriptNode1.getRegexpFlags((int) ' ');
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        int int7 = scope1.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope8 = scope1.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator9 = scope1.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope13 = scope11.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node14 = scope11.target;
        scope11.setPosition(2);
        int int17 = scope11.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope18 = scope11.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator19 = scope11.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getEncodedSource();
        int int22 = scriptNode20.getBaseLineno();
        java.lang.Object obj23 = scriptNode20.getCompilerData();
        scriptNode20.flattenSymbolTable(false);
        scope1.addChildAfter((com.google.javascript.rhino.head.Node) scope11, (com.google.javascript.rhino.head.Node) scriptNode20);
        com.google.javascript.rhino.head.ast.Scope scope27 = scriptNode20.getEnclosingScope();
        java.lang.String str28 = scriptNode20.getSourceName();
        int int29 = scriptNode20.getAbsolutePosition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = scriptNode20.getRegexpString(17);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int2 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope scope4 = scriptNode1.getDefiningScope("51\t    SCRIPT 52 1\n");
        scriptNode1.setSourceName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = scriptNode1.getFunctionNode((-53));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList2 = scriptNode1.getFunctions();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator3 = scriptNode1.new NodeIterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = scriptNode1.getRegexpFlags(26);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        int int7 = scope1.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope8 = scope1.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator9 = scope1.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope13 = scope11.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node14 = scope11.target;
        scope11.setPosition(2);
        int int17 = scope11.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope18 = scope11.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator19 = scope11.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getEncodedSource();
        int int22 = scriptNode20.getBaseLineno();
        java.lang.Object obj23 = scriptNode20.getCompilerData();
        scriptNode20.flattenSymbolTable(false);
        scope1.addChildAfter((com.google.javascript.rhino.head.Node) scope11, (com.google.javascript.rhino.head.Node) scriptNode20);
        int int27 = scriptNode20.getLength();
        com.google.javascript.rhino.head.ast.Scope scope28 = scriptNode20.getEnclosingScope();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = scriptNode20.getEnclosingFunction();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode31 = scriptNode20.getFunctionNode((int) (byte) 100);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(35);
        int int2 = scriptNode1.getFunctionCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = scriptNode1.getFunctionNode((int) ' ');
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        scriptNode0.setEncodedSourceEnd(18);
        java.lang.String str5 = scriptNode0.makeIndent((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = scriptNode0.getRegexpString(4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        int int7 = scope1.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope8 = scope1.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator9 = scope1.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope13 = scope11.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node14 = scope11.target;
        scope11.setPosition(2);
        int int17 = scope11.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope18 = scope11.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator19 = scope11.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getEncodedSource();
        int int22 = scriptNode20.getBaseLineno();
        java.lang.Object obj23 = scriptNode20.getCompilerData();
        scriptNode20.flattenSymbolTable(false);
        scope1.addChildAfter((com.google.javascript.rhino.head.Node) scope11, (com.google.javascript.rhino.head.Node) scriptNode20);
        int int27 = scriptNode20.getLength();
        scriptNode20.removeProp(6);
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node(13, 8);
        scriptNode20.addChildToBack(node32);
        int int34 = scriptNode20.getBaseLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode36 = scriptNode20.getFunctionNode((int) 'a');
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode0.toSource(18);
        scriptNode0.setCompilerData((java.lang.Object) 100L);
        com.google.javascript.rhino.head.Node node5 = scriptNode0.getNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = scriptNode0.getRegexpString(2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        com.google.javascript.rhino.head.Node node2 = scriptNode0.getLastSibling();
        scriptNode0.setEncodedSource("Scope");
        java.lang.String str5 = scriptNode0.getEncodedSource();
        int int6 = scriptNode0.getEndLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = scriptNode0.getRegexpFlags(4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = scriptNode0.getFunctionNode(97);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        scope1.setLength((int) (byte) 1);
        com.google.javascript.rhino.head.Node node9 = scope1.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str11 = scriptNode10.getEncodedSource();
        scriptNode10.setEncodedSourceEnd(18);
        java.lang.String str15 = scriptNode10.makeIndent((int) '#');
        scope1.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode10);
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope20 = scope18.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node21 = scope18.target;
        scope18.setPosition(2);
        scope18.putIntProp(17, 25);
        scope18.setLength((int) ' ');
        scriptNode10.addChild((com.google.javascript.rhino.head.ast.AstNode) scope18);
        int int30 = scriptNode10.getLength();
        int int31 = scriptNode10.getEndLineno();
        java.lang.String str32 = scriptNode10.toSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = scriptNode10.getRegexpFlags(7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode0.toSource(18);
        int int3 = scriptNode0.getEndLineno();
        com.google.javascript.rhino.head.ast.Comment comment4 = scriptNode0.getJsDocNode();
        int int5 = scriptNode0.getBaseLineno();
        scriptNode0.setEncodedSourceBounds(129, 7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = scriptNode0.getRegexpFlags(220850805);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = scriptNode1.getRegexpString(5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode0.toSource(18);
        int int3 = scriptNode0.getEndLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = scriptNode0.getFunctionNode(19);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int4 = scriptNode1.getIntProp(23, (int) (short) 1);
        com.google.javascript.rhino.head.ast.Scope scope5 = scriptNode1.getParentScope();
        int int6 = scriptNode1.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str8 = scriptNode7.getEncodedSource();
        scriptNode7.setEncodedSourceEnd(18);
        com.google.javascript.rhino.head.ast.Scope scope12 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope14 = scope12.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node15 = scope12.target;
        scope12.setPosition(2);
        int int18 = scope12.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope19 = scope12.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator20 = scope12.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope22 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope24 = scope22.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node25 = scope22.target;
        scope22.setPosition(2);
        int int28 = scope22.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope29 = scope22.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator30 = scope22.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str32 = scriptNode31.getEncodedSource();
        int int33 = scriptNode31.getBaseLineno();
        java.lang.Object obj34 = scriptNode31.getCompilerData();
        scriptNode31.flattenSymbolTable(false);
        scope12.addChildAfter((com.google.javascript.rhino.head.Node) scope22, (com.google.javascript.rhino.head.Node) scriptNode31);
        int int38 = scriptNode31.getLength();
        scriptNode31.clearParentScope();
        int int40 = scriptNode31.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode1.addChildBefore((com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scriptNode31);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        scope1.setLength((int) (byte) 1);
        com.google.javascript.rhino.head.Node node9 = scope1.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str11 = scriptNode10.getEncodedSource();
        scriptNode10.setEncodedSourceEnd(18);
        java.lang.String str15 = scriptNode10.makeIndent((int) '#');
        scope1.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode10);
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope20 = scope18.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node21 = scope18.target;
        scope18.setPosition(2);
        scope18.putIntProp(17, 25);
        scope18.setLength((int) ' ');
        scriptNode10.addChild((com.google.javascript.rhino.head.ast.AstNode) scope18);
        java.lang.String str30 = scriptNode10.getEncodedSource();
        int int31 = scriptNode10.getEncodedSourceEnd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = scriptNode10.getRegexpFlags(2);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        java.lang.String str7 = scope1.toSource();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap8 = scope1.getSymbolTable();
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node12 = scope11.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scope1.removeChild(node12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((-1));
        java.lang.Object obj2 = scriptNode1.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = scriptNode1.getTop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = scriptNode1.getRegexpString(1278533831);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        int int7 = scope1.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope8 = scope1.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator9 = scope1.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope13 = scope11.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node14 = scope11.target;
        scope11.setPosition(2);
        int int17 = scope11.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope18 = scope11.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator19 = scope11.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getEncodedSource();
        int int22 = scriptNode20.getBaseLineno();
        java.lang.Object obj23 = scriptNode20.getCompilerData();
        scriptNode20.flattenSymbolTable(false);
        scope1.addChildAfter((com.google.javascript.rhino.head.Node) scope11, (com.google.javascript.rhino.head.Node) scriptNode20);
        scriptNode20.putIntProp(12, (int) (byte) 0);
        com.google.javascript.rhino.head.ast.AstNode astNode30 = scriptNode20.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode32 = scriptNode20.getFunctionNode(7);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int2 = scriptNode1.getBaseLineno();
        int int3 = scriptNode1.getFunctionCount();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList4 = scriptNode1.getChildScopes();
        scriptNode1.setPosition(24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = scriptNode1.getRegexpString((-547629399));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int2 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope scope4 = scriptNode1.getDefiningScope("51\t    SCRIPT 52 1\n");
        scriptNode1.setSourceName("");
        java.lang.String str7 = scriptNode1.getEncodedSource();
        scriptNode1.setRelative((int) (short) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str11 = scriptNode10.getEncodedSource();
        int int12 = scriptNode10.getBaseLineno();
        java.lang.Object obj13 = scriptNode10.getCompilerData();
        scriptNode10.setEncodedSourceBounds((int) '4', 0);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList17 = scriptNode10.getStatements();
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope19.setPosition(100);
        com.google.javascript.rhino.head.Node node22 = scope19.getLastSibling();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode23 = scope19.getEnclosingFunction();
        com.google.javascript.rhino.head.Node node25 = scope19.setType(6);
        java.lang.Object obj27 = scope19.getProp(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode1.replaceChildAfter((com.google.javascript.rhino.head.Node) scriptNode10, (com.google.javascript.rhino.head.Node) scope19);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode0.toSource(18);
        int int3 = scriptNode0.getEndLineno();
        com.google.javascript.rhino.head.ast.Comment comment4 = scriptNode0.getJsDocNode();
        int int5 = scriptNode0.getBaseLineno();
        scriptNode0.setEncodedSourceBounds(1487440633, (int) (byte) -1);
        scriptNode0.setSourceName("        {\n        }\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = scriptNode0.getFunctionNode(0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int2 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope scope4 = scriptNode1.getDefiningScope("51\t    SCRIPT 52 1\n");
        scriptNode1.setSourceName("");
        com.google.javascript.rhino.head.ast.AstNode astNode7 = scriptNode1.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = scriptNode1.getFunctionNode(2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str3 = scriptNode1.toSource(18);
        scriptNode1.flattenSymbolTable(false);
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(3, (com.google.javascript.rhino.head.Node) scriptNode1, 19);
        scriptNode1.putIntProp(53, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = scriptNode1.getFunctionNode((-389829193));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int4 = scriptNode1.getIntProp(23, (int) (short) 1);
        com.google.javascript.rhino.head.ast.Scope scope6 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope6.setPosition(100);
        com.google.javascript.rhino.head.Node node9 = scope6.getLastSibling();
        node9.removeChildren();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator11 = node9.spliterator();
        scriptNode1.setCompilerData((java.lang.Object) node9);
        java.lang.String str13 = scriptNode1.getSourceName();
        com.google.javascript.rhino.head.ast.Scope scope14 = scriptNode1.getEnclosingScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = scriptNode1.getFunctionNode(15);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scriptNode1.getDefiningScope("                                                    {\n                                                    }\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = scriptNode1.getRegexpFlags(129);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        scriptNode0.setEncodedSourceEnd(18);
        java.lang.String str5 = scriptNode0.makeIndent((int) '#');
        int int8 = scriptNode0.getIntProp((int) '4', 4);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator9 = scriptNode0.spliterator();
        com.google.javascript.rhino.head.Node node10 = scriptNode0.getFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = scriptNode0.getRegexpFlags(0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList2 = scriptNode1.getFunctions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = scriptNode1.getRegexpString(272356811);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int2 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str4 = scriptNode3.getEncodedSource();
        scriptNode3.setEncodedSourceEnd(18);
        scriptNode1.target = scriptNode3;
        int int8 = scriptNode3.getParamCount();
        java.lang.String str9 = scriptNode3.getNextTempName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = scriptNode3.getRegexpFlags(35);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        scope1.setLength((int) (byte) 1);
        com.google.javascript.rhino.head.Node node9 = scope1.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str11 = scriptNode10.getEncodedSource();
        scriptNode10.setEncodedSourceEnd(18);
        java.lang.String str15 = scriptNode10.makeIndent((int) '#');
        scope1.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode10);
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope20 = scope18.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node21 = scope18.target;
        scope18.setPosition(2);
        scope18.putIntProp(17, 25);
        scope18.setLength((int) ' ');
        scriptNode10.addChild((com.google.javascript.rhino.head.ast.AstNode) scope18);
        int int30 = scriptNode10.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = scriptNode10.getRegexpString(9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        scriptNode0.setEncodedSourceEnd(18);
        java.lang.String str5 = scriptNode0.makeIndent((int) '#');
        int int8 = scriptNode0.getIntProp((int) '4', 4);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator9 = scriptNode0.spliterator();
        scriptNode0.setSourceName("5");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = scriptNode0.getRegexpString(12);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scriptNode1.getDefiningScope("                                                    {\n                                                    }\n");
        java.lang.String str4 = scriptNode1.debugPrint();
        java.lang.String str5 = scriptNode1.shortName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str7 = scriptNode6.getEncodedSource();
        int int8 = scriptNode6.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope scope10 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope12 = scope10.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node13 = scope10.getNext();
        com.google.javascript.rhino.head.ast.Scope scope14 = scope10.getParentScope();
        scriptNode6.addChildScope(scope10);
        int int16 = scriptNode6.getBaseLineno();
        java.lang.String str17 = scriptNode1.toStringTree(scriptNode6);
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope21 = scope19.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node22 = scope19.target;
        scope19.setPosition(2);
        int int25 = scope19.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope26 = scope19.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator27 = scope19.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope29 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope31 = scope29.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node32 = scope29.target;
        scope29.setPosition(2);
        int int35 = scope29.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope36 = scope29.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator37 = scope29.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str39 = scriptNode38.getEncodedSource();
        int int40 = scriptNode38.getBaseLineno();
        java.lang.Object obj41 = scriptNode38.getCompilerData();
        scriptNode38.flattenSymbolTable(false);
        scope19.addChildAfter((com.google.javascript.rhino.head.Node) scope29, (com.google.javascript.rhino.head.Node) scriptNode38);
        int int45 = scriptNode38.getLength();
        scriptNode38.removeProp(6);
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node(13, 8);
        scriptNode38.addChildToBack(node50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node52 = scriptNode6.getChildBefore(node50);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        int int2 = scriptNode0.getBaseLineno();
        java.lang.Object obj3 = scriptNode0.getCompilerData();
        scriptNode0.flattenSymbolTable(false);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList6 = scriptNode0.getFunctions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = scriptNode0.getRegexpFlags((int) (short) 1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) 5);
        com.google.javascript.rhino.head.Node node4 = new com.google.javascript.rhino.head.Node(25, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node5 = node1.getChildBefore(node4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str3 = scriptNode1.toSource(18);
        scriptNode1.flattenSymbolTable(false);
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(3, (com.google.javascript.rhino.head.Node) scriptNode1, 19);
        com.google.javascript.rhino.head.Node node8 = scriptNode1.getFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = scriptNode1.getRegexpFlags(701595233);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int2 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope scope4 = scriptNode1.getDefiningScope("51\t    SCRIPT 52 1\n");
        scriptNode1.setSourceName("");
        com.google.javascript.rhino.head.ast.AstNode astNode7 = scriptNode1.getParent();
        int int8 = scriptNode1.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = scriptNode1.getRegexpString(0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        int int2 = scriptNode0.getBaseLineno();
        java.lang.Object obj3 = scriptNode0.getCompilerData();
        scriptNode0.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.Scope scope6 = scriptNode0.getEnclosingScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = scriptNode0.getRegexpString(20);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        java.lang.Object obj2 = scriptNode1.getCompilerData();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList3 = scriptNode1.getFunctions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = scriptNode1.getRegexpFlags((int) '#');
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int2 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str4 = scriptNode3.getEncodedSource();
        scriptNode3.setEncodedSourceEnd(18);
        scriptNode1.target = scriptNode3;
        int int8 = scriptNode3.getEncodedSourceEnd();
        java.lang.Object obj9 = scriptNode3.getCompilerData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = scriptNode3.getRegexpString(20);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        scriptNode0.setEncodedSourceEnd(18);
        java.lang.String str5 = scriptNode0.makeIndent((int) '#');
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator6 = scriptNode0.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope7 = scriptNode0.getParentScope();
        java.lang.String str8 = scriptNode0.getNextTempName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = scriptNode0.getTop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = scriptNode0.getRegexpString(226035720);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        scriptNode0.setEncodedSourceEnd(18);
        java.lang.String str5 = scriptNode0.makeIndent((int) '#');
        int int8 = scriptNode0.getIntProp((int) '4', 4);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator9 = scriptNode0.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = scriptNode0.getFunctionNode((-769830162));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((-1));
        java.lang.Object obj2 = scriptNode1.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        scriptNode1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = scriptNode4.getFunctionNode((-674152164));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(6);
        scriptNode1.setEncodedSource("                                    {\n                                    }\n");
        com.google.javascript.rhino.head.ast.Scope scope5 = scriptNode1.getDefiningScope("35\tSCRIPT 35 1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = scriptNode1.getRegexpString(0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((-366869103));
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator2 = scriptNode1.spliterator();
        java.lang.Object obj3 = scriptNode1.getCompilerData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = scriptNode1.getRegexpFlags(13);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        int int7 = scope1.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope8 = scope1.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator9 = scope1.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope13 = scope11.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node14 = scope11.target;
        scope11.setPosition(2);
        int int17 = scope11.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope18 = scope11.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator19 = scope11.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getEncodedSource();
        int int22 = scriptNode20.getBaseLineno();
        java.lang.Object obj23 = scriptNode20.getCompilerData();
        scriptNode20.flattenSymbolTable(false);
        scope1.addChildAfter((com.google.javascript.rhino.head.Node) scope11, (com.google.javascript.rhino.head.Node) scriptNode20);
        scriptNode20.putIntProp(12, (int) (byte) 0);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList30 = scriptNode20.getStatements();
        com.google.javascript.rhino.head.Node node31 = scriptNode20.getFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = scriptNode20.getRegexpFlags((int) 'a');
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int2 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope scope4 = scriptNode1.getDefiningScope("51\t    SCRIPT 52 1\n");
        boolean boolean5 = scriptNode1.hasSideEffects();
        java.lang.String str6 = scriptNode1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = scriptNode1.getFunctionNode(20);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((-824625719));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = scriptNode1.getRegexpString((int) (byte) 100);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode0.toSource(18);
        int int3 = scriptNode0.getEndLineno();
        int int4 = scriptNode0.getRegexpCount();
        scriptNode0.setEncodedSource("Scope");
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = scriptNode0.new NodeIterator();
        java.lang.String str8 = scriptNode0.getSourceName();
        boolean boolean9 = scriptNode0.hasSideEffects();
        int int12 = scriptNode0.getIntProp(727575172, (-25));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = scriptNode0.getFunctionNode((-1072816741));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node3 = scope2.getLastSibling();
        node3.removeProp((int) (byte) -1);
        com.google.javascript.rhino.head.Node node7 = node3.setType(18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int10 = scriptNode9.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str12 = scriptNode11.getEncodedSource();
        scriptNode11.setEncodedSourceEnd(18);
        scriptNode9.target = scriptNode11;
        int int16 = scriptNode11.getParamCount();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList17 = scriptNode11.getStatements();
        java.lang.String str18 = scriptNode11.getEncodedSource();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newString((-1379055074), "                                      Scope");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node7.replaceChildAfter((com.google.javascript.rhino.head.Node) scriptNode11, node21);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope1.putProp(25, (java.lang.Object) 100L);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator5 = scope1.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope9 = scope7.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node10 = scope7.target;
        scope7.setPosition(2);
        scope7.setLength((int) (byte) 1);
        boolean boolean15 = scope7.hasSideEffects();
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newString("$0");
        node18.putIntProp(25, 1);
        com.google.javascript.rhino.head.Node node22 = node18.getFirstChild();
        scope7.putProp((int) (short) 100, (java.lang.Object) node18);
        com.google.javascript.rhino.head.ast.Scope scope26 = new com.google.javascript.rhino.head.ast.Scope(5, 5);
        scope26.setBounds((int) '#', 371991955);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scope1.addChildBefore((com.google.javascript.rhino.head.Node) scope7, (com.google.javascript.rhino.head.Node) scope26);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        scope1.setLength((int) (byte) 1);
        com.google.javascript.rhino.head.Node node9 = scope1.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str11 = scriptNode10.getEncodedSource();
        scriptNode10.setEncodedSourceEnd(18);
        java.lang.String str15 = scriptNode10.makeIndent((int) '#');
        scope1.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode10);
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope20 = scope18.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node21 = scope18.target;
        scope18.setPosition(2);
        scope18.putIntProp(17, 25);
        scope18.setLength((int) ' ');
        scriptNode10.addChild((com.google.javascript.rhino.head.ast.AstNode) scope18);
        int int30 = scriptNode10.getLength();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList31 = scriptNode10.getFunctions();
        java.lang.Object obj33 = scriptNode10.getProp(26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode35 = scriptNode10.getFunctionNode(934127539);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(35);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap2 = scriptNode1.getSymbolTable();
        com.google.javascript.rhino.head.Node node3 = scriptNode1.getLastChild();
        int int4 = scriptNode1.getFunctionCount();
        scriptNode1.setBaseLineno(220850805);
        int int9 = scriptNode1.getIntProp((-1), 19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = scriptNode1.getRegexpFlags((-51099649));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(960854933, "");
        com.google.javascript.rhino.head.Node node5 = new com.google.javascript.rhino.head.Node(52, 213295120);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        int int7 = scope1.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope8 = scope1.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator9 = scope1.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope13 = scope11.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node14 = scope11.target;
        scope11.setPosition(2);
        int int17 = scope11.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope18 = scope11.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator19 = scope11.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getEncodedSource();
        int int22 = scriptNode20.getBaseLineno();
        java.lang.Object obj23 = scriptNode20.getCompilerData();
        scriptNode20.flattenSymbolTable(false);
        scope1.addChildAfter((com.google.javascript.rhino.head.Node) scope11, (com.google.javascript.rhino.head.Node) scriptNode20);
        scriptNode20.clearParentScope();
        int int28 = scriptNode20.getFunctionCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = scriptNode20.getRegexpFlags((-54843021));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str3 = scriptNode1.toSource(18);
        scriptNode1.flattenSymbolTable(false);
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(3, (com.google.javascript.rhino.head.Node) scriptNode1, 19);
        int int8 = scriptNode1.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = scriptNode1.getRegexpFlags((-748421155));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scriptNode1.getDefiningScope("                                                    {\n                                                    }\n");
        java.lang.String str4 = scriptNode1.toSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = scriptNode1.getRegexpFlags(213295120);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        int int2 = scriptNode0.getBaseLineno();
        java.lang.Object obj3 = scriptNode0.getCompilerData();
        scriptNode0.setEncodedSourceBounds((int) '4', 0);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList7 = scriptNode0.getStatements();
        java.lang.Object obj8 = scriptNode0.getCompilerData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = scriptNode0.getRegexpString(1246415336);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int4 = scriptNode1.getIntProp(23, (int) (short) 1);
        com.google.javascript.rhino.head.ast.Scope scope6 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope6.setPosition(100);
        com.google.javascript.rhino.head.Node node9 = scope6.getLastSibling();
        node9.removeChildren();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator11 = node9.spliterator();
        scriptNode1.setCompilerData((java.lang.Object) node9);
        java.lang.String str14 = scriptNode1.toSource(21);
        int int15 = scriptNode1.getEncodedSourceStart();
        boolean boolean16 = scriptNode1.hasChildren();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList17 = scriptNode1.getStatements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = scriptNode1.getFunctionNode(966852023);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        int int7 = scope1.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope8 = scope1.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator9 = scope1.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope13 = scope11.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node14 = scope11.target;
        scope11.setPosition(2);
        int int17 = scope11.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope18 = scope11.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator19 = scope11.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getEncodedSource();
        int int22 = scriptNode20.getBaseLineno();
        java.lang.Object obj23 = scriptNode20.getCompilerData();
        scriptNode20.flattenSymbolTable(false);
        scope1.addChildAfter((com.google.javascript.rhino.head.Node) scope11, (com.google.javascript.rhino.head.Node) scriptNode20);
        int int27 = scriptNode20.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = scriptNode20.getRegexpFlags(135357821);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = scriptNode1.getRegexpString((-314896491));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (short) 0);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newString((int) (byte) 100, "            ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int2 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope scope4 = scriptNode1.getDefiningScope("51\t    SCRIPT 52 1\n");
        scriptNode1.setSourceName("");
        int int7 = scriptNode1.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.Scope scope9 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope11 = scope9.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node12 = scope9.target;
        scope9.setPosition(2);
        int int15 = scope9.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope16 = scope9.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator17 = scope9.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope21 = scope19.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node22 = scope19.target;
        scope19.setPosition(2);
        int int25 = scope19.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope26 = scope19.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator27 = scope19.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str29 = scriptNode28.getEncodedSource();
        int int30 = scriptNode28.getBaseLineno();
        java.lang.Object obj31 = scriptNode28.getCompilerData();
        scriptNode28.flattenSymbolTable(false);
        scope9.addChildAfter((com.google.javascript.rhino.head.Node) scope19, (com.google.javascript.rhino.head.Node) scriptNode28);
        int int35 = scriptNode28.getLength();
        scriptNode1.setTop(scriptNode28);
        int int37 = scriptNode1.getFunctionCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str40 = scriptNode38.toSource(18);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode1, (com.google.javascript.rhino.head.ast.Scope) scriptNode38);
        java.lang.String str42 = scriptNode1.getSourceName();
        java.lang.String str43 = scriptNode1.shortName();
        java.lang.Object obj45 = scriptNode1.getProp(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode47 = scriptNode1.getFunctionNode((-53));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode0.toSource(18);
        int int3 = scriptNode0.getEndLineno();
        int int4 = scriptNode0.getRegexpCount();
        scriptNode0.setEncodedSource("Scope");
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = scriptNode0.new NodeIterator();
        java.lang.String str8 = scriptNode0.getSourceName();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator9 = scriptNode0.new NodeIterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = scriptNode0.getRegexpString((-2));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        scriptNode0.setEncodedSourceEnd(18);
        java.lang.String str5 = scriptNode0.makeIndent((int) '#');
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator6 = scriptNode0.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope7 = scriptNode0.getParentScope();
        scriptNode0.clearParentScope();
        scriptNode0.setSourceName("                                                                                                        Scope");
        java.lang.String str11 = scriptNode0.getEncodedSource();
        scriptNode0.setLength(7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = scriptNode0.getRegexpFlags((-1666765792));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode0.toSource(18);
        int int3 = scriptNode0.getEndLineno();
        int int4 = scriptNode0.getRegexpCount();
        scriptNode0.setEncodedSource("Scope");
        scriptNode0.setBounds(22, 1487440633);
        int int10 = scriptNode0.getLength();
        com.google.javascript.rhino.head.Node node11 = scriptNode0.getFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = scriptNode0.getFunctionNode(0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(595467506);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = scriptNode1.getRegexpString((-7));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(17);
        java.lang.Object obj2 = scriptNode1.getCompilerData();
        int int3 = scriptNode1.getParamCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = scriptNode1.getRegexpString((int) (short) 10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int2 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope scope4 = scriptNode1.getDefiningScope("51\t    SCRIPT 52 1\n");
        boolean boolean5 = scriptNode1.hasSideEffects();
        com.google.javascript.rhino.head.Node node6 = scriptNode1.getNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = scriptNode1.getFunctionNode(1558149202);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int2 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str4 = scriptNode3.getEncodedSource();
        scriptNode3.setEncodedSourceEnd(18);
        scriptNode1.target = scriptNode3;
        boolean boolean8 = scriptNode3.hasChildren();
        scriptNode3.setEndLineno(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = scriptNode3.getRegexpFlags((int) (short) 10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = scriptNode1.getFunctionNode(272356811);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        int int7 = scope1.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope8 = scope1.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator9 = scope1.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope13 = scope11.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node14 = scope11.target;
        scope11.setPosition(2);
        int int17 = scope11.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope18 = scope11.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator19 = scope11.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getEncodedSource();
        int int22 = scriptNode20.getBaseLineno();
        java.lang.Object obj23 = scriptNode20.getCompilerData();
        scriptNode20.flattenSymbolTable(false);
        scope1.addChildAfter((com.google.javascript.rhino.head.Node) scope11, (com.google.javascript.rhino.head.Node) scriptNode20);
        com.google.javascript.rhino.head.ast.Scope scope27 = scriptNode20.getEnclosingScope();
        java.lang.String str28 = scriptNode20.getSourceName();
        int int29 = scriptNode20.getAbsolutePosition();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode30 = scriptNode20.getEnclosingFunction();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = scriptNode20.getRegexpFlags(0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        com.google.javascript.rhino.head.ast.Scope scope4 = scriptNode2.getDefiningScope("                                                    {\n                                                    }\n");
        java.lang.String str5 = scriptNode2.debugPrint();
        com.google.javascript.rhino.head.Node node6 = scriptNode2.getNext();
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(135357821, (com.google.javascript.rhino.head.Node) scriptNode2, 734000496);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = scriptNode2.getRegexpString((-706949563));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(2);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = scriptNode1.getTop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = scriptNode1.getRegexpFlags(5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        int int7 = scope1.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope8 = scope1.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator9 = scope1.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope13 = scope11.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node14 = scope11.target;
        scope11.setPosition(2);
        int int17 = scope11.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope18 = scope11.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator19 = scope11.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getEncodedSource();
        int int22 = scriptNode20.getBaseLineno();
        java.lang.Object obj23 = scriptNode20.getCompilerData();
        scriptNode20.flattenSymbolTable(false);
        scope1.addChildAfter((com.google.javascript.rhino.head.Node) scope11, (com.google.javascript.rhino.head.Node) scriptNode20);
        int int27 = scriptNode20.getLength();
        scriptNode20.setEncodedSourceEnd((int) (byte) 0);
        java.lang.String str30 = scriptNode20.shortName();
        java.lang.Object obj31 = scriptNode20.getCompilerData();
        java.lang.String str32 = scriptNode20.getSourceName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode34 = scriptNode20.getFunctionNode(135357821);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("                        {\n                        }\n");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) 98666588);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node3);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(13);
        int int4 = scriptNode1.getIntProp(161, (int) (byte) -1);
        scriptNode1.removeChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = scriptNode1.getFunctionNode(966852023);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope1.setPosition(100);
        com.google.javascript.rhino.head.Node node5 = scope1.setType((int) (byte) 0);
        java.lang.String str6 = scope1.shortName();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newNumber((double) 'a');
        java.lang.String str9 = node8.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scope1.removeChild(node8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((-1));
        java.lang.Object obj2 = scriptNode1.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = scriptNode1.getTop();
        java.lang.Object obj4 = scriptNode1.getCompilerData();
        int int5 = scriptNode1.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = scriptNode1.getRegexpFlags((-1072816741));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        com.google.javascript.rhino.head.Node node2 = scriptNode0.getLastSibling();
        scriptNode0.setEncodedSourceEnd(136);
        scriptNode0.setSourceName("                                    {\n                                    }\n");
        java.lang.Object obj7 = scriptNode0.getCompilerData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = scriptNode0.getRegexpFlags(581273883);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int2 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str4 = scriptNode3.getEncodedSource();
        scriptNode3.setEncodedSourceEnd(18);
        scriptNode1.target = scriptNode3;
        scriptNode3.setEncodedSourceBounds((int) (byte) -1, 11);
        int int11 = scriptNode3.getBaseLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol13 = scriptNode3.getSymbol("                                                                {\n                                                                }\n");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = scriptNode3.getEnclosingFunction();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = scriptNode3.getRegexpFlags(1246415336);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str3 = scriptNode1.toSource(18);
        scriptNode1.flattenSymbolTable(false);
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(3, (com.google.javascript.rhino.head.Node) scriptNode1, 19);
        int int8 = scriptNode1.getType();
        int int9 = scriptNode1.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = scriptNode1.getRegexpFlags(69);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        scriptNode0.setEncodedSourceEnd(18);
        java.lang.String str5 = scriptNode0.makeIndent((int) '#');
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator6 = scriptNode0.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope7 = scriptNode0.getParentScope();
        scriptNode0.clearParentScope();
        scriptNode0.setSourceName("                                                                                                        Scope");
        scriptNode0.clearParentScope();
        java.lang.String str12 = scriptNode0.getEncodedSource();
        int int13 = scriptNode0.getBaseLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = scriptNode0.getRegexpFlags((-1666765792));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 10);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList2 = scriptNode1.getStatements();
        int int3 = scriptNode1.getPosition();
        com.google.javascript.rhino.head.ast.Comment comment4 = scriptNode1.getJsDocNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = scriptNode1.getRegexpString(7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        com.google.javascript.rhino.head.Node node2 = scriptNode0.getLastSibling();
        scriptNode0.setEncodedSourceEnd(136);
        scriptNode0.setSourceName("                                    {\n                                    }\n");
        java.lang.Object obj7 = scriptNode0.getCompilerData();
        com.google.javascript.rhino.head.ast.Scope scope8 = scriptNode0.getParentScope();
        scriptNode0.flattenSymbolTable(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = scriptNode0.getRegexpFlags(1583199871);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        int int7 = scope1.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope8 = scope1.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator9 = scope1.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope13 = scope11.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node14 = scope11.target;
        scope11.setPosition(2);
        int int17 = scope11.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope18 = scope11.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator19 = scope11.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getEncodedSource();
        int int22 = scriptNode20.getBaseLineno();
        java.lang.Object obj23 = scriptNode20.getCompilerData();
        scriptNode20.flattenSymbolTable(false);
        scope1.addChildAfter((com.google.javascript.rhino.head.Node) scope11, (com.google.javascript.rhino.head.Node) scriptNode20);
        scriptNode20.putIntProp(12, (int) (byte) 0);
        scriptNode20.setRelative(100);
        int int32 = scriptNode20.getEncodedSourceEnd();
        scriptNode20.clearParentScope();
        scriptNode20.removeChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode36 = scriptNode20.getFunctionNode(1558149202);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        com.google.javascript.rhino.head.ast.Comment comment2 = scriptNode1.getJsDocNode();
        java.lang.Object obj4 = scriptNode1.getProp(136);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = scriptNode1.getRegexpString((int) (short) -1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        com.google.javascript.rhino.head.Node node2 = scriptNode0.getLastSibling();
        scriptNode0.setEncodedSource("Scope");
        scriptNode0.setEndLineno(100);
        scriptNode0.putIntProp(14, 3);
        java.lang.String str10 = scriptNode0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = scriptNode0.getRegexpString((int) (byte) 1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int2 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope scope4 = scriptNode1.getDefiningScope("51\t    SCRIPT 52 1\n");
        scriptNode1.setSourceName("");
        java.lang.String str7 = scriptNode1.getEncodedSource();
        scriptNode1.setRelative((int) (short) 100);
        int int10 = scriptNode1.getEndLineno();
        int int11 = scriptNode1.getRegexpCount();
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) 135357821);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode1.removeChild(node13);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        int int7 = scope1.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope8 = scope1.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator9 = scope1.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope13 = scope11.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node14 = scope11.target;
        scope11.setPosition(2);
        int int17 = scope11.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope18 = scope11.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator19 = scope11.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getEncodedSource();
        int int22 = scriptNode20.getBaseLineno();
        java.lang.Object obj23 = scriptNode20.getCompilerData();
        scriptNode20.flattenSymbolTable(false);
        scope1.addChildAfter((com.google.javascript.rhino.head.Node) scope11, (com.google.javascript.rhino.head.Node) scriptNode20);
        int int27 = scriptNode20.getLength();
        scriptNode20.removeProp(6);
        scriptNode20.setBounds(0, (-53));
        int int33 = scriptNode20.getEndLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str35 = scriptNode20.getRegexpFlags(12);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        java.lang.String str3 = scope1.makeIndent(0);
        com.google.javascript.rhino.head.ast.Scope scope4 = scope1.getParentScope();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList5 = scope1.getChildScopes();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str7 = scriptNode6.getEncodedSource();
        com.google.javascript.rhino.head.Node node8 = scriptNode6.getLastSibling();
        scriptNode6.setEncodedSourceEnd(136);
        boolean boolean11 = scriptNode6.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int16 = scriptNode13.getIntProp(23, (int) (short) 1);
        boolean boolean17 = scriptNode13.hasSideEffects();
        int int18 = scriptNode13.depth();
        int int19 = scriptNode13.getFunctionCount();
        int int20 = scriptNode13.getEncodedSourceEnd();
        java.lang.String str22 = scriptNode13.toSource((-547629399));
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode13);
        java.lang.String str24 = scope1.toStringTree(scriptNode13);
        java.lang.String str25 = scriptNode13.getJsDoc();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator26 = scriptNode13.spliterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor27 = scriptNode13.iterator();
        scriptNode13.flattenSymbolTable(true);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList30 = scriptNode13.getChildScopes();
        scriptNode13.setEncodedSource("                {\n                }\n");
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList33 = scriptNode13.getFunctions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str35 = scriptNode13.getRegexpString(655773337);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        scope1.setLength((int) (byte) 1);
        com.google.javascript.rhino.head.Node node9 = scope1.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str11 = scriptNode10.getEncodedSource();
        scriptNode10.setEncodedSourceEnd(18);
        java.lang.String str15 = scriptNode10.makeIndent((int) '#');
        scope1.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode10);
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope20 = scope18.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node21 = scope18.target;
        scope18.setPosition(2);
        scope18.putIntProp(17, 25);
        scope18.setLength((int) ' ');
        scriptNode10.addChild((com.google.javascript.rhino.head.ast.AstNode) scope18);
        int int30 = scriptNode10.getLength();
        int int31 = scriptNode10.getEndLineno();
        com.google.javascript.rhino.head.Node node32 = scriptNode10.getFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode34 = scriptNode10.getFunctionNode(170200694);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.setSourceName("                                              Scope");
        java.lang.String str3 = scriptNode0.getJsDoc();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = scriptNode0.getSymbols();
        com.google.javascript.rhino.head.ast.Scope scope6 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope8 = scope6.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node9 = scope6.target;
        scope6.setPosition(2);
        int int12 = scope6.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope13 = scope6.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator14 = scope6.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope16 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope18 = scope16.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node19 = scope16.target;
        scope16.setPosition(2);
        int int22 = scope16.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope23 = scope16.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator24 = scope16.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str26 = scriptNode25.getEncodedSource();
        int int27 = scriptNode25.getBaseLineno();
        java.lang.Object obj28 = scriptNode25.getCompilerData();
        scriptNode25.flattenSymbolTable(false);
        scope6.addChildAfter((com.google.javascript.rhino.head.Node) scope16, (com.google.javascript.rhino.head.Node) scriptNode25);
        com.google.javascript.rhino.head.Node node32 = scope16.getNext();
        scriptNode0.setParentScope(scope16);
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = scriptNode0.getAstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = scriptNode0.getAstRoot();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList36 = scriptNode0.getSymbols();
        java.lang.String str37 = scriptNode0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode39 = scriptNode0.getFunctionNode((-864528307));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        int int7 = scope1.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope8 = scope1.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator9 = scope1.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope13 = scope11.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node14 = scope11.target;
        scope11.setPosition(2);
        int int17 = scope11.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope18 = scope11.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator19 = scope11.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getEncodedSource();
        int int22 = scriptNode20.getBaseLineno();
        java.lang.Object obj23 = scriptNode20.getCompilerData();
        scriptNode20.flattenSymbolTable(false);
        scope1.addChildAfter((com.google.javascript.rhino.head.Node) scope11, (com.google.javascript.rhino.head.Node) scriptNode20);
        scriptNode20.putIntProp(12, (int) (byte) 0);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList30 = scriptNode20.getStatements();
        com.google.javascript.rhino.head.Node node31 = scriptNode20.getFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = scriptNode20.getRegexpFlags(1670905977);
    }
}

