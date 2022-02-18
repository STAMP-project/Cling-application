import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest31 {

    public static boolean debug = false;

    @Test
    public void test15501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15501");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        int int12 = scriptNode1.getIntProp(6, 2);
        int int13 = scriptNode1.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope17 = scope15.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node18 = scope15.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType22 = null;
        com.google.javascript.rhino.head.ast.Comment comment24 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType22, "Scope");
        scriptNode19.setParent((com.google.javascript.rhino.head.ast.AstNode) comment24);
        scope15.setJsDocNode(comment24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType30 = null;
        com.google.javascript.rhino.head.ast.Comment comment32 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType30, "Scope");
        scriptNode27.setParent((com.google.javascript.rhino.head.ast.AstNode) comment32);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList34 = scriptNode27.getSymbols();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode1, (com.google.javascript.rhino.head.Node) scope15, (com.google.javascript.rhino.head.Node) scriptNode27);
        scriptNode27.setPosition((int) (byte) 0);
        scriptNode27.setEncodedSourceStart((int) (byte) 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType43 = null;
        com.google.javascript.rhino.head.ast.Comment comment45 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType43, "Scope");
        scriptNode40.setParent((com.google.javascript.rhino.head.ast.AstNode) comment45);
        scriptNode40.setEncodedSourceStart((int) (byte) 100);
        int int51 = scriptNode40.getIntProp(6, 2);
        int int52 = scriptNode40.getParamCount();
        java.lang.String str53 = scriptNode40.debugPrint();
        int int56 = scriptNode40.getIntProp(17, 10);
        scriptNode27.setTop(scriptNode40);
        java.lang.Object obj59 = scriptNode40.getProp(17);
        int int60 = scriptNode40.getFunctionCount();
        boolean boolean61 = scriptNode40.hasSideEffects();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap62 = null;
        scriptNode40.setSymbolTable(strMap62);
        scriptNode40.setEncodedSourceBounds((int) '4', 17);
        boolean boolean67 = scriptNode40.hasChildren();
        com.google.javascript.rhino.head.Node node68 = scriptNode40.getLastSibling();
        node68.putIntProp(69, 20);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(symbolList34);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str53, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node68);
    }

    @Test
    public void test15502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15502");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        int int11 = scriptNode0.getIntProp(6, 2);
        int int12 = scriptNode0.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType16 = null;
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType16, "Scope");
        scriptNode13.setParent((com.google.javascript.rhino.head.ast.AstNode) comment18);
        scriptNode13.setEncodedSourceStart((int) (byte) 100);
        int int24 = scriptNode13.getIntProp(6, 2);
        int int25 = scriptNode13.getParamCount();
        scriptNode0.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode13);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList27 = scriptNode0.getFunctions();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList28 = scriptNode0.getStatements();
        java.lang.String str29 = scriptNode0.getJsDoc();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType35 = null;
        com.google.javascript.rhino.head.ast.Comment comment37 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType35, "Scope");
        scriptNode32.setParent((com.google.javascript.rhino.head.ast.AstNode) comment37);
        scriptNode32.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = scriptNode32.getTop();
        scriptNode41.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int46 = scriptNode45.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str48 = scriptNode47.getEncodedSource();
        scriptNode47.setEncodedSourceEnd(18);
        scriptNode45.target = scriptNode47;
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode41, (com.google.javascript.rhino.head.Node) scriptNode47);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str54 = scriptNode53.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode56 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType59 = null;
        com.google.javascript.rhino.head.ast.Comment comment61 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType59, "Scope");
        scriptNode56.setParent((com.google.javascript.rhino.head.ast.AstNode) comment61);
        scriptNode56.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str65 = scriptNode56.getSourceName();
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode56, 26);
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node((int) (byte) -1, node52, (com.google.javascript.rhino.head.Node) scriptNode53, (com.google.javascript.rhino.head.Node) scriptNode56);
        com.google.javascript.rhino.head.Node node69 = scriptNode56.getLastSibling();
        boolean boolean70 = scriptNode56.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode72 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType75 = null;
        com.google.javascript.rhino.head.ast.Comment comment77 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType75, "Scope");
        scriptNode72.setParent((com.google.javascript.rhino.head.ast.AstNode) comment77);
        scriptNode72.setEncodedSourceStart((int) (byte) 100);
        int int83 = scriptNode72.getIntProp(6, 2);
        scriptNode56.putProp((int) (byte) 0, (java.lang.Object) int83);
        com.google.javascript.rhino.head.ast.AstNode astNode85 = scriptNode56.getParent();
        int int86 = scriptNode56.getEncodedSourceStart();
        java.lang.String str87 = scriptNode56.getEncodedSource();
        scriptNode56.setSourceName("129");
        int int90 = scriptNode56.getEncodedSourceEnd();
        scriptNode0.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode56);
        scriptNode0.setSourceName("                                    {\n                                    }\n");
        scriptNode0.setEncodedSource("+=");
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator96 = scriptNode0.new NodeIterator();
        com.google.javascript.rhino.head.Node node97 = nodeIterator96.next();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(functionNodeList27);
        org.junit.Assert.assertNotNull(astNodeList28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(scriptNode41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 2 + "'", int83 == 2);
        org.junit.Assert.assertNotNull(astNode85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 100 + "'", int86 == 100);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(node97);
    }

    @Test
    public void test15503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15503");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = scriptNode1.getTop();
        scriptNode10.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int15 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str17 = scriptNode16.getEncodedSource();
        scriptNode16.setEncodedSourceEnd(18);
        scriptNode14.target = scriptNode16;
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode10, (com.google.javascript.rhino.head.Node) scriptNode16);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType26, "Scope");
        scriptNode23.setParent((com.google.javascript.rhino.head.ast.AstNode) comment28);
        scriptNode23.setEncodedSourceStart((int) (byte) 100);
        int int34 = scriptNode23.getIntProp(6, 2);
        int int35 = scriptNode23.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope37 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope39 = scope37.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node40 = scope37.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType44 = null;
        com.google.javascript.rhino.head.ast.Comment comment46 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType44, "Scope");
        scriptNode41.setParent((com.google.javascript.rhino.head.ast.AstNode) comment46);
        scope37.setJsDocNode(comment46);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType52 = null;
        com.google.javascript.rhino.head.ast.Comment comment54 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType52, "Scope");
        scriptNode49.setParent((com.google.javascript.rhino.head.ast.AstNode) comment54);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList56 = scriptNode49.getSymbols();
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode23, (com.google.javascript.rhino.head.Node) scope37, (com.google.javascript.rhino.head.Node) scriptNode49);
        scriptNode16.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode23);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType62 = null;
        com.google.javascript.rhino.head.ast.Comment comment64 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType62, "Scope");
        scriptNode59.setParent((com.google.javascript.rhino.head.ast.AstNode) comment64);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList66 = scriptNode59.getSymbols();
        scriptNode23.setSymbols(symbolList66);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList68 = scriptNode23.getSymbols();
        scriptNode23.setRelative((int) (byte) 1);
        java.lang.String str71 = scriptNode23.toSource();
        scriptNode23.setPosition(7);
        // The following exception was thrown during execution in test generation
        try {
            int int74 = scriptNode23.getParamAndVarCount();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scriptNode10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(scope39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(symbolList56);
        org.junit.Assert.assertNotNull(symbolList66);
        org.junit.Assert.assertNotNull(symbolList68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "{\n}\n" + "'", str71, "{\n}\n");
    }

    @Test
    public void test15504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15504");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList3 = scriptNode2.getFunctions();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator4 = scriptNode2.new NodeIterator();
        com.google.javascript.rhino.head.ast.Scope scope6 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope6.setPosition(100);
        com.google.javascript.rhino.head.Node node9 = scope6.getLastSibling();
        node9.removeChildren();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator11 = node9.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType16 = null;
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType16, "Scope");
        scriptNode13.setParent((com.google.javascript.rhino.head.ast.AstNode) comment18);
        scriptNode13.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = scriptNode13.getTop();
        scriptNode22.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int27 = scriptNode26.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str29 = scriptNode28.getEncodedSource();
        scriptNode28.setEncodedSourceEnd(18);
        scriptNode26.target = scriptNode28;
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode22, (com.google.javascript.rhino.head.Node) scriptNode28);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList34 = null;
        scriptNode28.setSymbols(symbolList34);
        node9.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode28);
        com.google.javascript.rhino.head.ast.Symbol symbol38 = scriptNode28.getSymbol("41");
        com.google.javascript.rhino.head.ast.Scope scope40 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope40.setPosition(100);
        com.google.javascript.rhino.head.Node node43 = scope40.getLastSibling();
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(100, (com.google.javascript.rhino.head.Node) scriptNode2, (com.google.javascript.rhino.head.Node) scriptNode28, (com.google.javascript.rhino.head.Node) scope40, 12);
        java.lang.Object obj46 = scriptNode28.getCompilerData();
        com.google.javascript.rhino.head.Node node47 = scriptNode28.getNext();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator48 = scriptNode28.new NodeIterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = scriptNode28.getTop();
        com.google.javascript.rhino.head.ast.Comment comment50 = scriptNode49.getJsDocNode();
        org.junit.Assert.assertNotNull(functionNodeList3);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeSpliterator11);
        org.junit.Assert.assertNotNull(scriptNode22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(symbol38);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(scriptNode49);
        org.junit.Assert.assertNull(comment50);
    }

    @Test
    public void test15505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15505");
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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str29 = scriptNode28.getEncodedSource();
        scriptNode28.setEncodedSourceEnd(18);
        java.lang.String str33 = scriptNode28.makeIndent((int) '#');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType37 = null;
        com.google.javascript.rhino.head.ast.Comment comment39 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType37, "Scope");
        scriptNode34.setParent((com.google.javascript.rhino.head.ast.AstNode) comment39);
        scriptNode34.setEncodedSourceStart((int) (byte) 100);
        scriptNode28.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode34);
        boolean boolean44 = scriptNode28.hasSideEffects();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap45 = scriptNode28.getSymbolTable();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode20, (com.google.javascript.rhino.head.ast.Scope) scriptNode28);
        int int47 = scriptNode20.getParamAndVarCount();
        scriptNode20.setEncodedSourceEnd(0);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(nodeSpliterator9);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNotNull(nodeSpliterator19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "                                                                      " + "'", str33, "                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(strMap45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test15506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15506");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) ' ');
        scope1.putIntProp(1278533831, (int) 'a');
        boolean boolean5 = scope1.hasChildren();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test15507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15507");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(51);
        scriptNode1.setEncodedSourceBounds(0, (-53635080));
    }

    @Test
    public void test15508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15508");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.setSourceName("                                              Scope");
        java.lang.String str3 = scriptNode0.getJsDoc();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType8 = null;
        com.google.javascript.rhino.head.ast.Comment comment10 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType8, "Scope");
        scriptNode5.setParent((com.google.javascript.rhino.head.ast.AstNode) comment10);
        scriptNode5.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = scriptNode5.getTop();
        scriptNode14.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int19 = scriptNode18.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getEncodedSource();
        scriptNode20.setEncodedSourceEnd(18);
        scriptNode18.target = scriptNode20;
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode14, (com.google.javascript.rhino.head.Node) scriptNode20);
        com.google.javascript.rhino.head.ast.Scope scope27 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope29 = scope27.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node30 = scope27.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType34 = null;
        com.google.javascript.rhino.head.ast.Comment comment36 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType34, "Scope");
        scriptNode31.setParent((com.google.javascript.rhino.head.ast.AstNode) comment36);
        scope27.setJsDocNode(comment36);
        boolean boolean39 = scope27.hasChildren();
        scriptNode0.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode20, (com.google.javascript.rhino.head.Node) scope27);
        int int41 = scriptNode0.getLength();
        scriptNode0.setBaseLineno(845940330);
        java.lang.Object obj45 = scriptNode0.getProp(845940331);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = scriptNode0.getRegexpFlags(874571570);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(scriptNode14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(scope29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test15509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15509");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) -1, 100);
        com.google.javascript.rhino.head.ast.Symbol symbol4 = scope2.getSymbol("$0");
        boolean boolean5 = scope2.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str8 = scriptNode6.toSource(18);
        scriptNode6.setCompilerData((java.lang.Object) 100L);
        com.google.javascript.rhino.head.Node node11 = scriptNode6.getNext();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType16 = null;
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType16, "Scope");
        scriptNode13.setParent((com.google.javascript.rhino.head.ast.AstNode) comment18);
        scriptNode13.setEncodedSourceStart((int) (byte) 100);
        int int24 = scriptNode13.getIntProp(6, 2);
        int int25 = scriptNode13.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope27 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope29 = scope27.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node30 = scope27.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType34 = null;
        com.google.javascript.rhino.head.ast.Comment comment36 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType34, "Scope");
        scriptNode31.setParent((com.google.javascript.rhino.head.ast.AstNode) comment36);
        scope27.setJsDocNode(comment36);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType42 = null;
        com.google.javascript.rhino.head.ast.Comment comment44 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType42, "Scope");
        scriptNode39.setParent((com.google.javascript.rhino.head.ast.AstNode) comment44);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList46 = scriptNode39.getSymbols();
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode13, (com.google.javascript.rhino.head.Node) scope27, (com.google.javascript.rhino.head.Node) scriptNode39);
        scriptNode39.setPosition((int) (byte) 0);
        com.google.javascript.rhino.head.Node node50 = scriptNode39.target;
        scope2.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode6, (com.google.javascript.rhino.head.Node) scriptNode39);
        java.lang.Object obj53 = scriptNode6.getProp((-207519868));
        org.junit.Assert.assertNull(symbol4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                    {\n                                    }\n" + "'", str8, "                                    {\n                                    }\n");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(scope29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(symbolList46);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test15510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15510");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        int int11 = scriptNode0.getIntProp(6, 2);
        int int12 = scriptNode0.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str14 = scriptNode13.getEncodedSource();
        int int15 = scriptNode13.getBaseLineno();
        java.lang.String str16 = scriptNode13.getNextTempName();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode13);
        java.lang.String str18 = scriptNode13.debugPrint();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType22 = null;
        com.google.javascript.rhino.head.ast.Comment comment24 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType22, "Scope");
        scriptNode19.setParent((com.google.javascript.rhino.head.ast.AstNode) comment24);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList26 = scriptNode19.getSymbols();
        scriptNode13.setSymbols(symbolList26);
        int int28 = scriptNode13.getRegexpCount();
        int int29 = scriptNode13.getPosition();
        com.google.javascript.rhino.head.Node node30 = scriptNode13.getLastChild();
        boolean boolean31 = scriptNode13.hasSideEffects();
        com.google.javascript.rhino.head.ast.Comment comment32 = scriptNode13.getJsDocNode();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$0" + "'", str16, "$0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "51\t    SCRIPT 52 1\n" + "'", str18, "51\t    SCRIPT 52 1\n");
        org.junit.Assert.assertNotNull(symbolList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(comment32);
    }

    @Test
    public void test15511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15511");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(6);
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope3.setPosition(100);
        com.google.javascript.rhino.head.Node node6 = scope3.getLastSibling();
        node6.removeChildren();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator8 = node6.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType13 = null;
        com.google.javascript.rhino.head.ast.Comment comment15 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType13, "Scope");
        scriptNode10.setParent((com.google.javascript.rhino.head.ast.AstNode) comment15);
        scriptNode10.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = scriptNode10.getTop();
        scriptNode19.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int24 = scriptNode23.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str26 = scriptNode25.getEncodedSource();
        scriptNode25.setEncodedSourceEnd(18);
        scriptNode23.target = scriptNode25;
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode19, (com.google.javascript.rhino.head.Node) scriptNode25);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList31 = null;
        scriptNode25.setSymbols(symbolList31);
        node6.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode25);
        java.lang.String str34 = scriptNode1.toStringTree(scriptNode25);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType38 = null;
        com.google.javascript.rhino.head.ast.Comment comment40 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType38, "Scope");
        scriptNode35.setParent((com.google.javascript.rhino.head.ast.AstNode) comment40);
        scriptNode35.setEncodedSourceStart((int) (byte) 100);
        int int46 = scriptNode35.getIntProp(6, 2);
        int int47 = scriptNode35.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str49 = scriptNode48.getEncodedSource();
        int int50 = scriptNode48.getBaseLineno();
        java.lang.String str51 = scriptNode48.getNextTempName();
        scriptNode35.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode48);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode25, (com.google.javascript.rhino.head.ast.Scope) scriptNode48);
        com.google.javascript.rhino.head.ast.Scope scope55 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope57 = scope55.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node58 = scope55.target;
        scope55.setPosition(2);
        java.lang.String str61 = scope55.toSource();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap62 = scope55.getSymbolTable();
        boolean boolean63 = scope55.hasChildren();
        com.google.javascript.rhino.head.Node node64 = scope55.getNext();
        com.google.javascript.rhino.head.ast.Scope scope66 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope68 = scope66.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node69 = scope66.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode70 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType73 = null;
        com.google.javascript.rhino.head.ast.Comment comment75 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType73, "Scope");
        scriptNode70.setParent((com.google.javascript.rhino.head.ast.AstNode) comment75);
        scope66.setJsDocNode(comment75);
        java.lang.String str79 = comment75.toSource((int) (short) 10);
        scope55.setJsDocNode(comment75);
        scriptNode25.addChildToBack((com.google.javascript.rhino.head.Node) comment75);
        com.google.javascript.rhino.head.Token.CommentType commentType82 = comment75.getCommentType();
        java.lang.String str83 = comment75.debugPrint();
        com.google.javascript.rhino.head.Token.CommentType commentType84 = comment75.getCommentType();
        java.lang.String str86 = comment75.makeIndent(129);
        com.google.javascript.rhino.head.Token.CommentType commentType87 = null;
        comment75.setCommentType(commentType87);
        comment75.setRelative(0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeSpliterator8);
        org.junit.Assert.assertNotNull(scriptNode19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "$0" + "'", str51, "$0");
        org.junit.Assert.assertNull(scope57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "{\n}\n" + "'", str61, "{\n}\n");
        org.junit.Assert.assertNull(strMap62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(scope68);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "                    Scope" + "'", str79, "                    Scope");
        org.junit.Assert.assertNull(commentType82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "52\tCOMMENT 52 6\n" + "'", str83, "52\tCOMMENT 52 6\n");
        org.junit.Assert.assertNull(commentType84);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "                                                                                                                                                                                                                                                                  " + "'", str86, "                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test15512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15512");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        int int2 = scriptNode0.getBaseLineno();
        java.lang.Object obj3 = scriptNode0.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType7 = null;
        com.google.javascript.rhino.head.ast.Comment comment9 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType7, "Scope");
        scriptNode4.setParent((com.google.javascript.rhino.head.ast.AstNode) comment9);
        java.lang.String str12 = scriptNode4.toSource(26);
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode4);
        java.lang.String str14 = scriptNode0.toString();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap15 = scriptNode0.getSymbolTable();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str17 = scriptNode16.getEncodedSource();
        scriptNode16.setEncodedSourceEnd(18);
        java.lang.String str21 = scriptNode16.makeIndent((int) '#');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int24 = scriptNode23.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str26 = scriptNode25.getEncodedSource();
        scriptNode25.setEncodedSourceEnd(18);
        scriptNode23.target = scriptNode25;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode((-1));
        scriptNode31.setLineno((int) (byte) 1);
        scriptNode23.setCompilerData((java.lang.Object) (byte) 1);
        scriptNode16.setCompilerData((java.lang.Object) (byte) 1);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList36 = scriptNode16.getSymbols();
        scriptNode0.setSymbols(symbolList36);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                    {\n                                                    }\n" + "'", str12, "                                                    {\n                                                    }\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "136" + "'", str14, "136");
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                      " + "'", str21, "                                                                      ");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(symbolList36);
    }

    @Test
    public void test15513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15513");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        java.lang.String str4 = scope2.makeIndent(0);
        int int7 = scope2.getIntProp((int) (byte) 10, (int) (byte) -1);
        com.google.javascript.rhino.head.ast.Scope scope9 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope9.setPosition(100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType16 = null;
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType16, "Scope");
        scriptNode13.setParent((com.google.javascript.rhino.head.ast.AstNode) comment18);
        scriptNode13.setEncodedSourceStart((int) (byte) 100);
        int int24 = scriptNode13.getIntProp(6, 2);
        int int25 = scriptNode13.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope27 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope29 = scope27.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node30 = scope27.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType34 = null;
        com.google.javascript.rhino.head.ast.Comment comment36 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType34, "Scope");
        scriptNode31.setParent((com.google.javascript.rhino.head.ast.AstNode) comment36);
        scope27.setJsDocNode(comment36);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType42 = null;
        com.google.javascript.rhino.head.ast.Comment comment44 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType42, "Scope");
        scriptNode39.setParent((com.google.javascript.rhino.head.ast.AstNode) comment44);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList46 = scriptNode39.getSymbols();
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode13, (com.google.javascript.rhino.head.Node) scope27, (com.google.javascript.rhino.head.Node) scriptNode39);
        scriptNode39.setPosition((int) (byte) 0);
        scope9.setTop(scriptNode39);
        int int51 = scriptNode39.getParamCount();
        scope2.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode39);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType56 = null;
        com.google.javascript.rhino.head.ast.Comment comment58 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType56, "Scope");
        scriptNode53.setParent((com.google.javascript.rhino.head.ast.AstNode) comment58);
        scriptNode53.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode62 = scriptNode53.getTop();
        java.lang.String str63 = scriptNode62.shortName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode64 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType67 = null;
        com.google.javascript.rhino.head.ast.Comment comment69 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType67, "Scope");
        scriptNode64.setParent((com.google.javascript.rhino.head.ast.AstNode) comment69);
        scriptNode64.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode73 = scriptNode64.getTop();
        java.lang.String str74 = scriptNode73.shortName();
        scriptNode62.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode73);
        java.lang.String str76 = scope2.toStringTree(scriptNode62);
        java.lang.Object obj77 = scriptNode62.getCompilerData();
        java.lang.String str78 = scriptNode62.getEncodedSource();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList79 = scriptNode62.getSymbols();
        com.google.javascript.rhino.head.Token.CommentType commentType82 = null;
        com.google.javascript.rhino.head.ast.Comment comment84 = new com.google.javascript.rhino.head.ast.Comment(845940331, (-399411339), commentType82, "          ");
        com.google.javascript.rhino.head.Token.CommentType commentType85 = null;
        comment84.setCommentType(commentType85);
        com.google.javascript.rhino.head.Token.CommentType commentType89 = null;
        com.google.javascript.rhino.head.ast.Comment comment91 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 35, commentType89, "    Scope");
        com.google.javascript.rhino.head.Token.CommentType commentType92 = null;
        comment91.setCommentType(commentType92);
        com.google.javascript.rhino.head.Node node94 = new com.google.javascript.rhino.head.Node((-440693037), (com.google.javascript.rhino.head.Node) scriptNode62, (com.google.javascript.rhino.head.Node) comment84, (com.google.javascript.rhino.head.Node) comment91);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node95 = scriptNode62.getContinue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(scope29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(symbolList46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(scriptNode62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "ScriptNode" + "'", str63, "ScriptNode");
        org.junit.Assert.assertNotNull(scriptNode73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "ScriptNode" + "'", str74, "ScriptNode");
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(symbolList79);
    }

    @Test
    public void test15514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15514");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        int int12 = scriptNode1.getIntProp(6, 2);
        int int13 = scriptNode1.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope17 = scope15.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node18 = scope15.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType22 = null;
        com.google.javascript.rhino.head.ast.Comment comment24 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType22, "Scope");
        scriptNode19.setParent((com.google.javascript.rhino.head.ast.AstNode) comment24);
        scope15.setJsDocNode(comment24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType30 = null;
        com.google.javascript.rhino.head.ast.Comment comment32 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType30, "Scope");
        scriptNode27.setParent((com.google.javascript.rhino.head.ast.AstNode) comment32);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList34 = scriptNode27.getSymbols();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode1, (com.google.javascript.rhino.head.Node) scope15, (com.google.javascript.rhino.head.Node) scriptNode27);
        scriptNode27.setPosition((int) (byte) 0);
        scriptNode27.setEncodedSourceStart((int) (byte) 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType43 = null;
        com.google.javascript.rhino.head.ast.Comment comment45 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType43, "Scope");
        scriptNode40.setParent((com.google.javascript.rhino.head.ast.AstNode) comment45);
        scriptNode40.setEncodedSourceStart((int) (byte) 100);
        int int51 = scriptNode40.getIntProp(6, 2);
        int int52 = scriptNode40.getParamCount();
        java.lang.String str53 = scriptNode40.debugPrint();
        int int56 = scriptNode40.getIntProp(17, 10);
        scriptNode27.setTop(scriptNode40);
        int int58 = scriptNode40.getEncodedSourceStart();
        java.lang.String str59 = scriptNode40.toString();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator60 = scriptNode40.new NodeIterator();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap61 = scriptNode40.getSymbolTable();
        int int62 = scriptNode40.getEncodedSourceStart();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(symbolList34);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str53, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "136" + "'", str59, "136");
        org.junit.Assert.assertNull(strMap61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
    }

    @Test
    public void test15515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15515");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope4 = scope2.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node5 = scope2.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType9 = null;
        com.google.javascript.rhino.head.ast.Comment comment11 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType9, "Scope");
        scriptNode6.setParent((com.google.javascript.rhino.head.ast.AstNode) comment11);
        scope2.setJsDocNode(comment11);
        java.lang.String str15 = comment11.toSource((int) (short) 10);
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) comment11);
        java.lang.Object obj18 = comment11.getProp((int) (short) -1);
        java.lang.String str20 = comment11.makeIndent((int) (short) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType24 = null;
        com.google.javascript.rhino.head.ast.Comment comment26 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType24, "Scope");
        scriptNode21.setParent((com.google.javascript.rhino.head.ast.AstNode) comment26);
        scriptNode21.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = scriptNode21.getTop();
        scriptNode30.setPosition(6);
        comment11.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode30);
        com.google.javascript.rhino.head.ast.AstNode astNode34 = scriptNode30.getParent();
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                    Scope" + "'", str15, "                    Scope");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(scriptNode30);
        org.junit.Assert.assertNotNull(astNode34);
    }

    @Test
    public void test15516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15516");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = scriptNode1.getTop();
        scriptNode10.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int15 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str17 = scriptNode16.getEncodedSource();
        scriptNode16.setEncodedSourceEnd(18);
        scriptNode14.target = scriptNode16;
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode10, (com.google.javascript.rhino.head.Node) scriptNode16);
        node21.removeProp(0);
        boolean boolean24 = node21.hasSideEffects();
        int int27 = node21.getIntProp((int) '4', 4);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType31 = null;
        com.google.javascript.rhino.head.ast.Comment comment33 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType31, "Scope");
        scriptNode28.setParent((com.google.javascript.rhino.head.ast.AstNode) comment33);
        java.lang.String str36 = scriptNode28.toSource(26);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator37 = scriptNode28.new NodeIterator();
        boolean boolean38 = scriptNode28.hasConsistentReturnUsage();
        int int41 = scriptNode28.getIntProp(18, 19);
        node21.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode28);
        scriptNode28.putIntProp(1404628457, (-207519868));
        org.junit.Assert.assertNotNull(scriptNode10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "                                                    {\n                                                    }\n" + "'", str36, "                                                    {\n                                                    }\n");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 19 + "'", int41 == 19);
    }

    @Test
    public void test15517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15517");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList7 = scriptNode0.getSymbols();
        java.lang.String str8 = scriptNode0.debugPrint();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str10 = scriptNode9.getEncodedSource();
        com.google.javascript.rhino.head.Node node11 = scriptNode9.getLastSibling();
        scriptNode9.setEncodedSource("Scope");
        scriptNode9.setEndLineno(100);
        scriptNode0.setCompilerData((java.lang.Object) 100);
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope18.putProp(25, (java.lang.Object) 100L);
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) scope18);
        scriptNode0.setLength(0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType28 = null;
        com.google.javascript.rhino.head.ast.Comment comment30 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType28, "Scope");
        scriptNode25.setParent((com.google.javascript.rhino.head.ast.AstNode) comment30);
        scriptNode25.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str34 = scriptNode25.getSourceName();
        int int35 = scriptNode25.getFunctionCount();
        int int36 = scriptNode25.getFunctionCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType41 = null;
        com.google.javascript.rhino.head.ast.Comment comment43 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType41, "Scope");
        scriptNode38.setParent((com.google.javascript.rhino.head.ast.AstNode) comment43);
        scriptNode38.setEncodedSourceStart((int) (byte) 100);
        int int47 = scriptNode38.getEncodedSourceStart();
        java.lang.String str48 = scriptNode38.getSourceName();
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) (short) 100, (com.google.javascript.rhino.head.Node) scriptNode38);
        scriptNode38.setEncodedSourceEnd(17);
        scriptNode25.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode38);
        scriptNode0.setParentScope((com.google.javascript.rhino.head.ast.Scope) scriptNode25);
        scriptNode25.setEncodedSourceBounds(1034180762, (-54843021));
        com.google.javascript.rhino.head.Node node57 = scriptNode25.target;
        org.junit.Assert.assertNotNull(symbolList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str8, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(node57);
    }

    @Test
    public void test15518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15518");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType5 = null;
        com.google.javascript.rhino.head.ast.Comment comment7 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType5, "Scope");
        scriptNode2.setParent((com.google.javascript.rhino.head.ast.AstNode) comment7);
        scriptNode2.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = scriptNode2.getTop();
        scriptNode11.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int16 = scriptNode15.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str18 = scriptNode17.getEncodedSource();
        scriptNode17.setEncodedSourceEnd(18);
        scriptNode15.target = scriptNode17;
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode11, (com.google.javascript.rhino.head.Node) scriptNode17);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str24 = scriptNode23.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType29 = null;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType29, "Scope");
        scriptNode26.setParent((com.google.javascript.rhino.head.ast.AstNode) comment31);
        scriptNode26.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str35 = scriptNode26.getSourceName();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode26, 26);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node((int) (byte) -1, node22, (com.google.javascript.rhino.head.Node) scriptNode23, (com.google.javascript.rhino.head.Node) scriptNode26);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType42 = null;
        com.google.javascript.rhino.head.ast.Comment comment44 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType42, "Scope");
        scriptNode39.setParent((com.google.javascript.rhino.head.ast.AstNode) comment44);
        scriptNode39.setEncodedSourceStart((int) (byte) 100);
        int int50 = scriptNode39.getIntProp(6, 2);
        scriptNode39.setEndLineno(18);
        scriptNode26.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode39);
        scriptNode26.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode56 = scriptNode26.getTop();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList57 = scriptNode26.getSymbols();
        int int58 = scriptNode26.getLineno();
        java.lang.String str59 = scriptNode26.getEncodedSource();
        org.junit.Assert.assertNotNull(scriptNode11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(scriptNode56);
        org.junit.Assert.assertNotNull(symbolList57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test15519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15519");
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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str35 = scriptNode34.getEncodedSource();
        scriptNode34.setEncodedSourceEnd(18);
        java.lang.String str39 = scriptNode34.makeIndent((int) '#');
        node32.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode34);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator41 = scriptNode34.new NodeIterator();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.Scope scope42 = com.google.javascript.rhino.head.ast.Scope.splitScope((com.google.javascript.rhino.head.ast.Scope) scriptNode34);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.Scope cannot be cast to com.google.javascript.rhino.head.ast.ScriptNode");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(nodeSpliterator9);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNotNull(nodeSpliterator19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "                                                                      " + "'", str39, "                                                                      ");
    }

    @Test
    public void test15520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15520");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str10 = scriptNode1.getSourceName();
        int int11 = scriptNode1.getLineno();
        int int12 = scriptNode1.getLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType16 = null;
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType16, "Scope");
        scriptNode13.setParent((com.google.javascript.rhino.head.ast.AstNode) comment18);
        scriptNode13.setEncodedSourceStart((int) (byte) 100);
        int int24 = scriptNode13.getIntProp(6, 2);
        scriptNode13.setEndLineno(18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str28 = scriptNode27.getEncodedSource();
        scriptNode27.setEncodedSourceEnd(18);
        java.lang.String str32 = scriptNode27.makeIndent((int) '#');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType38 = null;
        com.google.javascript.rhino.head.ast.Comment comment40 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType38, "Scope");
        scriptNode35.setParent((com.google.javascript.rhino.head.ast.AstNode) comment40);
        scriptNode35.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = scriptNode35.getTop();
        scriptNode44.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int49 = scriptNode48.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str51 = scriptNode50.getEncodedSource();
        scriptNode50.setEncodedSourceEnd(18);
        scriptNode48.target = scriptNode50;
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode44, (com.google.javascript.rhino.head.Node) scriptNode50);
        com.google.javascript.rhino.head.Token.CommentType commentType58 = null;
        com.google.javascript.rhino.head.ast.Comment comment60 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType58, "Scope");
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node(21, (com.google.javascript.rhino.head.Node) scriptNode44, (com.google.javascript.rhino.head.Node) comment60);
        int int62 = scriptNode44.depth();
        int int63 = scriptNode44.getEndLineno();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor64 = scriptNode44.iterator();
        scriptNode27.setTop(scriptNode44);
        com.google.javascript.rhino.head.ast.Scope scope67 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope69 = scope67.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node70 = scope67.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode71 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType74 = null;
        com.google.javascript.rhino.head.ast.Comment comment76 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType74, "Scope");
        scriptNode71.setParent((com.google.javascript.rhino.head.ast.AstNode) comment76);
        scope67.setJsDocNode(comment76);
        com.google.javascript.rhino.head.Node node79 = comment76.getFirstChild();
        scriptNode44.setJsDocNode(comment76);
        scriptNode44.setEncodedSourceBounds((int) ' ', 0);
        int int84 = scriptNode44.getBaseLineno();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator85 = scriptNode44.new NodeIterator();
        scriptNode13.setTop(scriptNode44);
        com.google.javascript.rhino.head.Node node88 = new com.google.javascript.rhino.head.Node((-613442063), (com.google.javascript.rhino.head.Node) scriptNode1, (com.google.javascript.rhino.head.Node) scriptNode44, 25);
        java.lang.Class<?> wildcardClass89 = node88.getClass();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "                                                                      " + "'", str32, "                                                                      ");
        org.junit.Assert.assertNotNull(scriptNode44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(nodeItor64);
        org.junit.Assert.assertNull(scope69);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test15521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15521");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope1.setPosition(100);
        com.google.javascript.rhino.head.Node node4 = scope1.getLastSibling();
        node4.removeChildren();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator6 = node4.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType11 = null;
        com.google.javascript.rhino.head.ast.Comment comment13 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType11, "Scope");
        scriptNode8.setParent((com.google.javascript.rhino.head.ast.AstNode) comment13);
        scriptNode8.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = scriptNode8.getTop();
        scriptNode17.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int22 = scriptNode21.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str24 = scriptNode23.getEncodedSource();
        scriptNode23.setEncodedSourceEnd(18);
        scriptNode21.target = scriptNode23;
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode17, (com.google.javascript.rhino.head.Node) scriptNode23);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList29 = null;
        scriptNode23.setSymbols(symbolList29);
        node4.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode23);
        scriptNode23.removeChildren();
        scriptNode23.setEncodedSource("in");
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = scriptNode23.getAstRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = astRoot35.shortName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeSpliterator6);
        org.junit.Assert.assertNotNull(scriptNode17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(astRoot35);
    }

    @Test
    public void test15522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15522");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = scriptNode1.getTop();
        scriptNode10.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int15 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str17 = scriptNode16.getEncodedSource();
        scriptNode16.setEncodedSourceEnd(18);
        scriptNode14.target = scriptNode16;
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode10, (com.google.javascript.rhino.head.Node) scriptNode16);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode22 = scriptNode16.getEnclosingFunction();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType26, "Scope");
        scriptNode23.setParent((com.google.javascript.rhino.head.ast.AstNode) comment28);
        scriptNode23.setEncodedSourceStart((int) (byte) 100);
        int int34 = scriptNode23.getIntProp(6, 2);
        int int35 = scriptNode23.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str37 = scriptNode36.getEncodedSource();
        int int38 = scriptNode36.getBaseLineno();
        java.lang.String str39 = scriptNode36.getNextTempName();
        scriptNode23.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode36);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType46 = null;
        com.google.javascript.rhino.head.ast.Comment comment48 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType46, "Scope");
        scriptNode43.setParent((com.google.javascript.rhino.head.ast.AstNode) comment48);
        scriptNode43.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = scriptNode43.getTop();
        scriptNode52.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode56 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int57 = scriptNode56.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode58 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str59 = scriptNode58.getEncodedSource();
        scriptNode58.setEncodedSourceEnd(18);
        scriptNode56.target = scriptNode58;
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode52, (com.google.javascript.rhino.head.Node) scriptNode58);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode64 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str65 = scriptNode64.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType70 = null;
        com.google.javascript.rhino.head.ast.Comment comment72 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType70, "Scope");
        scriptNode67.setParent((com.google.javascript.rhino.head.ast.AstNode) comment72);
        scriptNode67.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str76 = scriptNode67.getSourceName();
        com.google.javascript.rhino.head.Node node78 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode67, 26);
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node((int) (byte) -1, node63, (com.google.javascript.rhino.head.Node) scriptNode64, (com.google.javascript.rhino.head.Node) scriptNode67);
        node79.setLineno(5);
        scriptNode23.setCompilerData((java.lang.Object) node79);
        com.google.javascript.rhino.head.Node node83 = scriptNode23.getNext();
        java.lang.String str84 = scriptNode16.toStringTree(scriptNode23);
        com.google.javascript.rhino.head.Token.CommentType commentType88 = null;
        com.google.javascript.rhino.head.ast.Comment comment90 = new com.google.javascript.rhino.head.ast.Comment(9, 9, commentType88, "{\n}\n");
        com.google.javascript.rhino.head.Node node92 = new com.google.javascript.rhino.head.Node((int) (short) 1, (com.google.javascript.rhino.head.Node) comment90, (-53));
        int int93 = comment90.getAbsolutePosition();
        java.lang.String str95 = comment90.toSource((int) 'a');
        scriptNode23.addChildrenToFront((com.google.javascript.rhino.head.Node) comment90);
        com.google.javascript.rhino.head.Token.CommentType commentType97 = null;
        comment90.setCommentType(commentType97);
        com.google.javascript.rhino.head.Token.CommentType commentType99 = comment90.getCommentType();
        org.junit.Assert.assertNotNull(scriptNode10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(functionNode22);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "$0" + "'", str39, "$0");
        org.junit.Assert.assertNotNull(scriptNode52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 9 + "'", int93 == 9);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "                                                                                                                                                                                                  {\n}\n" + "'", str95, "                                                                                                                                                                                                  {\n}\n");
        org.junit.Assert.assertNull(commentType99);
    }

    @Test
    public void test15523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15523");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode0.toSource(18);
        java.lang.Object obj3 = scriptNode0.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType8 = null;
        com.google.javascript.rhino.head.ast.Comment comment10 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType8, "Scope");
        scriptNode5.setParent((com.google.javascript.rhino.head.ast.AstNode) comment10);
        scriptNode5.setEncodedSourceStart((int) (byte) 100);
        int int16 = scriptNode5.getIntProp(6, 2);
        int int17 = scriptNode5.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope21 = scope19.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node22 = scope19.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType26, "Scope");
        scriptNode23.setParent((com.google.javascript.rhino.head.ast.AstNode) comment28);
        scope19.setJsDocNode(comment28);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType34 = null;
        com.google.javascript.rhino.head.ast.Comment comment36 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType34, "Scope");
        scriptNode31.setParent((com.google.javascript.rhino.head.ast.AstNode) comment36);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList38 = scriptNode31.getSymbols();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode5, (com.google.javascript.rhino.head.Node) scope19, (com.google.javascript.rhino.head.Node) scriptNode31);
        scriptNode31.setPosition((int) (byte) 0);
        com.google.javascript.rhino.head.Node node42 = scriptNode31.target;
        scriptNode0.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode31);
        java.lang.String str44 = scriptNode0.getEncodedSource();
        scriptNode0.setLength(20);
        scriptNode0.putIntProp(12, 18);
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor50 = null;
        // The following exception was thrown during execution in test generation
        try {
            scriptNode0.visit(nodeVisitor50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    {\n                                    }\n" + "'", str2, "                                    {\n                                    }\n");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(symbolList38);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test15524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15524");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) -1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.Jump jump3 = scope2.getJumpStatement();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15525");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = scriptNode1.getTop();
        scriptNode10.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int15 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str17 = scriptNode16.getEncodedSource();
        scriptNode16.setEncodedSourceEnd(18);
        scriptNode14.target = scriptNode16;
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode10, (com.google.javascript.rhino.head.Node) scriptNode16);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType26, "Scope");
        scriptNode23.setParent((com.google.javascript.rhino.head.ast.AstNode) comment28);
        scriptNode23.setEncodedSourceStart((int) (byte) 100);
        int int34 = scriptNode23.getIntProp(6, 2);
        int int35 = scriptNode23.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope37 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope39 = scope37.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node40 = scope37.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType44 = null;
        com.google.javascript.rhino.head.ast.Comment comment46 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType44, "Scope");
        scriptNode41.setParent((com.google.javascript.rhino.head.ast.AstNode) comment46);
        scope37.setJsDocNode(comment46);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType52 = null;
        com.google.javascript.rhino.head.ast.Comment comment54 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType52, "Scope");
        scriptNode49.setParent((com.google.javascript.rhino.head.ast.AstNode) comment54);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList56 = scriptNode49.getSymbols();
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode23, (com.google.javascript.rhino.head.Node) scope37, (com.google.javascript.rhino.head.Node) scriptNode49);
        scriptNode16.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode23);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType62 = null;
        com.google.javascript.rhino.head.ast.Comment comment64 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType62, "Scope");
        scriptNode59.setParent((com.google.javascript.rhino.head.ast.AstNode) comment64);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList66 = scriptNode59.getSymbols();
        scriptNode23.setSymbols(symbolList66);
        int int68 = scriptNode23.getParamCount();
        java.lang.String str69 = scriptNode23.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode70 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str71 = scriptNode70.getEncodedSource();
        int int72 = scriptNode70.getBaseLineno();
        java.lang.Object obj73 = scriptNode70.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode74 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType77 = null;
        com.google.javascript.rhino.head.ast.Comment comment79 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType77, "Scope");
        scriptNode74.setParent((com.google.javascript.rhino.head.ast.AstNode) comment79);
        java.lang.String str82 = scriptNode74.toSource(26);
        scriptNode70.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode74);
        com.google.javascript.rhino.head.Node node85 = scriptNode74.setType((int) (short) 10);
        int int86 = scriptNode74.getFunctionCount();
        java.lang.Object obj88 = scriptNode74.getProp(0);
        java.lang.String str89 = scriptNode74.getJsDoc();
        com.google.javascript.rhino.head.ast.Symbol symbol91 = scriptNode74.getSymbol("|");
        scriptNode23.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode74);
        org.junit.Assert.assertNotNull(scriptNode10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(scope39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(symbolList56);
        org.junit.Assert.assertNotNull(symbolList66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "                                                    {\n                                                    }\n" + "'", str82, "                                                    {\n                                                    }\n");
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNull(symbol91);
    }

    @Test
    public void test15526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15526");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        java.lang.String str4 = scope2.makeIndent(0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType11 = null;
        com.google.javascript.rhino.head.ast.Comment comment13 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType11, "Scope");
        scriptNode8.setParent((com.google.javascript.rhino.head.ast.AstNode) comment13);
        scriptNode8.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str17 = scriptNode8.getSourceName();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode8, 26);
        scriptNode6.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode8);
        java.lang.String str21 = scriptNode6.getNextTempName();
        scope2.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode6);
        boolean boolean23 = scriptNode6.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType27 = null;
        com.google.javascript.rhino.head.ast.Comment comment29 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType27, "Scope");
        scriptNode24.setParent((com.google.javascript.rhino.head.ast.AstNode) comment29);
        scriptNode24.setEncodedSourceStart((int) (byte) 100);
        int int35 = scriptNode24.getIntProp(6, 2);
        int int36 = scriptNode24.getRegexpCount();
        java.lang.String str37 = scriptNode24.getSourceName();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node(9, (com.google.javascript.rhino.head.Node) scriptNode6, (com.google.javascript.rhino.head.Node) scriptNode24, 16);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList40 = scriptNode6.getFunctions();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = scriptNode6.getTop();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList42 = scriptNode41.getFunctions();
        com.google.javascript.rhino.head.Node node44 = scriptNode41.setType((-1919164661));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "$0" + "'", str21, "$0");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(functionNodeList40);
        org.junit.Assert.assertNotNull(scriptNode41);
        org.junit.Assert.assertNotNull(functionNodeList42);
        org.junit.Assert.assertNotNull(node44);
    }

    @Test
    public void test15527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15527");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList7 = scriptNode0.getSymbols();
        java.lang.String str8 = scriptNode0.debugPrint();
        java.lang.String str9 = scriptNode0.getEncodedSource();
        java.lang.String str10 = scriptNode0.getNextTempName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node11 = scriptNode0.getContinue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(symbolList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str8, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$0" + "'", str10, "$0");
    }

    @Test
    public void test15528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15528");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        int int11 = scriptNode0.getIntProp(6, 2);
        int int12 = scriptNode0.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str14 = scriptNode13.getEncodedSource();
        int int15 = scriptNode13.getBaseLineno();
        java.lang.String str16 = scriptNode13.getNextTempName();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode13);
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10, (int) (byte) -1);
        int int21 = scope20.depth();
        scriptNode0.replaceWith(scope20);
        com.google.javascript.rhino.head.Node node24 = scriptNode0.setType(0);
        boolean boolean25 = scriptNode0.hasSideEffects();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$0" + "'", str16, "$0");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test15529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15529");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        java.lang.String str8 = scriptNode0.toSource(26);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator9 = scriptNode0.new NodeIterator();
        java.lang.String str10 = scriptNode0.getNextTempName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType14 = null;
        com.google.javascript.rhino.head.ast.Comment comment16 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType14, "Scope");
        scriptNode11.setParent((com.google.javascript.rhino.head.ast.AstNode) comment16);
        scriptNode0.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode11);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = scriptNode0.addFunction(functionNode19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                    {\n                                                    }\n" + "'", str8, "                                                    {\n                                                    }\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$0" + "'", str10, "$0");
    }

    @Test
    public void test15530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15530");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        int int11 = scriptNode0.getIntProp(6, 2);
        int int12 = scriptNode0.getRegexpCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str15 = scriptNode13.toSource(18);
        java.lang.Object obj16 = scriptNode13.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType21 = null;
        com.google.javascript.rhino.head.ast.Comment comment23 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType21, "Scope");
        scriptNode18.setParent((com.google.javascript.rhino.head.ast.AstNode) comment23);
        scriptNode18.setEncodedSourceStart((int) (byte) 100);
        int int29 = scriptNode18.getIntProp(6, 2);
        int int30 = scriptNode18.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope32 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope34 = scope32.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node35 = scope32.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType39 = null;
        com.google.javascript.rhino.head.ast.Comment comment41 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType39, "Scope");
        scriptNode36.setParent((com.google.javascript.rhino.head.ast.AstNode) comment41);
        scope32.setJsDocNode(comment41);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType47 = null;
        com.google.javascript.rhino.head.ast.Comment comment49 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType47, "Scope");
        scriptNode44.setParent((com.google.javascript.rhino.head.ast.AstNode) comment49);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList51 = scriptNode44.getSymbols();
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode18, (com.google.javascript.rhino.head.Node) scope32, (com.google.javascript.rhino.head.Node) scriptNode44);
        scriptNode44.setPosition((int) (byte) 0);
        com.google.javascript.rhino.head.Node node55 = scriptNode44.target;
        scriptNode13.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode44);
        int int57 = scriptNode44.getLineno();
        scriptNode0.setCompilerData((java.lang.Object) scriptNode44);
        scriptNode0.setRelative((int) (byte) 0);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap61 = scriptNode0.getSymbolTable();
        com.google.javascript.rhino.head.Node node62 = scriptNode0.getLastSibling();
        com.google.javascript.rhino.head.Token.CommentType commentType65 = null;
        com.google.javascript.rhino.head.ast.Comment comment67 = new com.google.javascript.rhino.head.ast.Comment(53, 53, commentType65, "                  Scope");
        node62.addChildrenToBack((com.google.javascript.rhino.head.Node) comment67);
        comment67.setLength(53);
        // The following exception was thrown during execution in test generation
        try {
            comment67.setDouble((double) (-220138142));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.Comment cannot be cast to com.google.javascript.rhino.head.ast.NumberLiteral");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                    {\n                                    }\n" + "'", str15, "                                    {\n                                    }\n");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(symbolList51);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNull(strMap61);
        org.junit.Assert.assertNotNull(node62);
    }

    @Test
    public void test15531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15531");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope(35, (-389829193));
        java.lang.String str3 = scope2.toSource();
        com.google.javascript.rhino.head.Node node5 = scope2.setType((int) (short) 1);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList6 = scope2.getStatements();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{\n}\n" + "'", str3, "{\n}\n");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(astNodeList6);
    }

    @Test
    public void test15532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15532");
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str7 = scriptNode6.getEncodedSource();
        scriptNode6.setEncodedSourceEnd(18);
        java.lang.String str10 = comment5.toStringTree(scriptNode6);
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("{\n}\n");
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode6, node12);
        scriptNode6.setEncodedSourceStart(25);
        com.google.javascript.rhino.head.ast.Scope scope17 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope19 = scope17.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node20 = scope17.target;
        scope17.setPosition(2);
        java.lang.String str23 = scope17.toSource();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap24 = scope17.getSymbolTable();
        boolean boolean25 = scope17.hasChildren();
        com.google.javascript.rhino.head.Node node26 = scope17.getNext();
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope30 = scope28.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node31 = scope28.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType35 = null;
        com.google.javascript.rhino.head.ast.Comment comment37 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType35, "Scope");
        scriptNode32.setParent((com.google.javascript.rhino.head.ast.AstNode) comment37);
        scope28.setJsDocNode(comment37);
        java.lang.String str41 = comment37.toSource((int) (short) 10);
        scope17.setJsDocNode(comment37);
        comment37.setRelative(4);
        scriptNode6.setJsDocNode(comment37);
        com.google.javascript.rhino.head.Token.CommentType commentType49 = null;
        com.google.javascript.rhino.head.ast.Comment comment51 = new com.google.javascript.rhino.head.ast.Comment(9, 9, commentType49, "{\n}\n");
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node((int) (short) 1, (com.google.javascript.rhino.head.Node) comment51, (-53));
        com.google.javascript.rhino.head.Token.CommentType commentType54 = null;
        comment51.setCommentType(commentType54);
        scriptNode6.setJsDocNode(comment51);
        com.google.javascript.rhino.head.Node node57 = scriptNode6.getLastChild();
        java.lang.String str59 = scriptNode6.makeIndent((-389829193));
        scriptNode6.setEncodedSource("161");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{\n}\n" + "'", str23, "{\n}\n");
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(scope30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "                    Scope" + "'", str41, "                    Scope");
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test15533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15533");
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment(53, 53, commentType3, "                  Scope");
        java.lang.String str6 = comment5.debugPrint();
        int int7 = comment5.getPosition();
        java.lang.String str8 = comment5.getValue();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator9 = comment5.new NodeIterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType13 = null;
        com.google.javascript.rhino.head.ast.Comment comment15 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType13, "Scope");
        scriptNode10.setParent((com.google.javascript.rhino.head.ast.AstNode) comment15);
        scriptNode10.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str19 = scriptNode10.getSourceName();
        int int20 = scriptNode10.getLineno();
        java.lang.String str21 = scriptNode10.getSourceName();
        int int22 = scriptNode10.getEncodedSourceEnd();
        int int23 = scriptNode10.getRegexpCount();
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) comment5, (com.google.javascript.rhino.head.Node) scriptNode10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "53\tCOMMENT 53 53\n" + "'", str6, "53\tCOMMENT 53 53\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                  Scope" + "'", str8, "                  Scope");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test15534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15534");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        int int12 = scriptNode1.getIntProp(6, 2);
        int int13 = scriptNode1.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope17 = scope15.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node18 = scope15.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType22 = null;
        com.google.javascript.rhino.head.ast.Comment comment24 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType22, "Scope");
        scriptNode19.setParent((com.google.javascript.rhino.head.ast.AstNode) comment24);
        scope15.setJsDocNode(comment24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType30 = null;
        com.google.javascript.rhino.head.ast.Comment comment32 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType30, "Scope");
        scriptNode27.setParent((com.google.javascript.rhino.head.ast.AstNode) comment32);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList34 = scriptNode27.getSymbols();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode1, (com.google.javascript.rhino.head.Node) scope15, (com.google.javascript.rhino.head.Node) scriptNode27);
        scriptNode27.setPosition((int) (byte) 0);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList38 = scriptNode27.getFunctions();
        java.lang.String str39 = scriptNode27.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = scriptNode27.getAstRoot();
        // The following exception was thrown during execution in test generation
        try {
            int int41 = astRoot40.labelId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(symbolList34);
        org.junit.Assert.assertNotNull(functionNodeList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "52\t  SCRIPT 0 1\n" + "'", str39, "52\t  SCRIPT 0 1\n");
        org.junit.Assert.assertNull(astRoot40);
    }

    @Test
    public void test15535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15535");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType6 = null;
        com.google.javascript.rhino.head.ast.Comment comment8 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType6, "Scope");
        scriptNode3.setParent((com.google.javascript.rhino.head.ast.AstNode) comment8);
        scriptNode3.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = scriptNode3.getTop();
        scriptNode12.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int17 = scriptNode16.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str19 = scriptNode18.getEncodedSource();
        scriptNode18.setEncodedSourceEnd(18);
        scriptNode16.target = scriptNode18;
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode12, (com.google.javascript.rhino.head.Node) scriptNode18);
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType26, "Scope");
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node(21, (com.google.javascript.rhino.head.Node) scriptNode12, (com.google.javascript.rhino.head.Node) comment28);
        boolean boolean30 = comment28.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType31 = null;
        comment28.setCommentType(commentType31);
        java.lang.String str34 = comment28.toSource(3);
        boolean boolean35 = comment28.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Token.CommentType commentType36 = comment28.getCommentType();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node(52, (com.google.javascript.rhino.head.Node) comment28);
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor38 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment28.visit(nodeVisitor38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "      Scope" + "'", str34, "      Scope");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(commentType36);
    }

    @Test
    public void test15536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15536");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = scriptNode1.getTop();
        scriptNode10.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int15 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str17 = scriptNode16.getEncodedSource();
        scriptNode16.setEncodedSourceEnd(18);
        scriptNode14.target = scriptNode16;
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode10, (com.google.javascript.rhino.head.Node) scriptNode16);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType26, "Scope");
        scriptNode23.setParent((com.google.javascript.rhino.head.ast.AstNode) comment28);
        scriptNode23.setEncodedSourceStart((int) (byte) 100);
        int int34 = scriptNode23.getIntProp(6, 2);
        int int35 = scriptNode23.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope37 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope39 = scope37.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node40 = scope37.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType44 = null;
        com.google.javascript.rhino.head.ast.Comment comment46 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType44, "Scope");
        scriptNode41.setParent((com.google.javascript.rhino.head.ast.AstNode) comment46);
        scope37.setJsDocNode(comment46);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType52 = null;
        com.google.javascript.rhino.head.ast.Comment comment54 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType52, "Scope");
        scriptNode49.setParent((com.google.javascript.rhino.head.ast.AstNode) comment54);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList56 = scriptNode49.getSymbols();
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode23, (com.google.javascript.rhino.head.Node) scope37, (com.google.javascript.rhino.head.Node) scriptNode49);
        scriptNode16.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode23);
        scriptNode16.putIntProp((-1), 13);
        int int62 = scriptNode16.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.Symbol symbol64 = scriptNode16.getSymbol("                                                                                                                                                                                                        Scope");
        int int65 = scriptNode16.getFunctionCount();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap66 = scriptNode16.getSymbolTable();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList67 = scriptNode16.getChildScopes();
        int int68 = scriptNode16.getEndLineno();
        java.lang.String str69 = scriptNode16.toSource();
        scriptNode16.setEncodedSource("                                                                {\n                                                                }\n");
        boolean boolean72 = scriptNode16.hasSideEffects();
        org.junit.Assert.assertNotNull(scriptNode10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(scope39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(symbolList56);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 18 + "'", int62 == 18);
        org.junit.Assert.assertNull(symbol64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNull(strMap66);
        org.junit.Assert.assertNull(scopeList67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "{\n}\n" + "'", str69, "{\n}\n");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test15537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15537");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        int int2 = scriptNode1.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType6 = null;
        com.google.javascript.rhino.head.ast.Comment comment8 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType6, "Scope");
        scriptNode3.setParent((com.google.javascript.rhino.head.ast.AstNode) comment8);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList10 = scriptNode3.getSymbols();
        java.lang.String str11 = scriptNode3.debugPrint();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str13 = scriptNode12.getEncodedSource();
        com.google.javascript.rhino.head.Node node14 = scriptNode12.getLastSibling();
        scriptNode12.setEncodedSource("Scope");
        scriptNode12.setEndLineno(100);
        scriptNode3.setCompilerData((java.lang.Object) 100);
        com.google.javascript.rhino.head.ast.Scope scope21 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope21.putProp(25, (java.lang.Object) 100L);
        scriptNode3.setParent((com.google.javascript.rhino.head.ast.AstNode) scope21);
        java.lang.String str26 = scriptNode3.debugPrint();
        scriptNode1.addChildrenToFront((com.google.javascript.rhino.head.Node) scriptNode3);
        scriptNode1.setBaseLineno(1404628457);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(symbolList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str11, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1\t  SCRIPT -1 1\n" + "'", str26, "-1\t  SCRIPT -1 1\n");
    }

    @Test
    public void test15538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15538");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = scriptNode0.getTop();
        java.lang.String str10 = scriptNode9.shortName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType14 = null;
        com.google.javascript.rhino.head.ast.Comment comment16 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType14, "Scope");
        scriptNode11.setParent((com.google.javascript.rhino.head.ast.AstNode) comment16);
        scriptNode11.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = scriptNode11.getTop();
        java.lang.String str21 = scriptNode20.shortName();
        scriptNode9.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode20);
        java.lang.String str24 = scriptNode9.makeIndent(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType29 = null;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType29, "Scope");
        scriptNode26.setParent((com.google.javascript.rhino.head.ast.AstNode) comment31);
        scriptNode26.setEncodedSourceStart((int) (byte) 100);
        int int37 = scriptNode26.getIntProp(6, 2);
        int int38 = scriptNode26.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope40 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope42 = scope40.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node43 = scope40.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType47 = null;
        com.google.javascript.rhino.head.ast.Comment comment49 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType47, "Scope");
        scriptNode44.setParent((com.google.javascript.rhino.head.ast.AstNode) comment49);
        scope40.setJsDocNode(comment49);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType55 = null;
        com.google.javascript.rhino.head.ast.Comment comment57 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType55, "Scope");
        scriptNode52.setParent((com.google.javascript.rhino.head.ast.AstNode) comment57);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList59 = scriptNode52.getSymbols();
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode26, (com.google.javascript.rhino.head.Node) scope40, (com.google.javascript.rhino.head.Node) scriptNode52);
        scriptNode52.setPosition((int) (byte) 0);
        scriptNode52.setEncodedSourceStart((int) (byte) 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode65 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType68 = null;
        com.google.javascript.rhino.head.ast.Comment comment70 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType68, "Scope");
        scriptNode65.setParent((com.google.javascript.rhino.head.ast.AstNode) comment70);
        scriptNode65.setEncodedSourceStart((int) (byte) 100);
        int int76 = scriptNode65.getIntProp(6, 2);
        int int77 = scriptNode65.getParamCount();
        java.lang.String str78 = scriptNode65.debugPrint();
        int int81 = scriptNode65.getIntProp(17, 10);
        scriptNode52.setTop(scriptNode65);
        scriptNode52.setEncodedSourceEnd(9);
        com.google.javascript.rhino.head.Node node85 = scriptNode52.getLastChild();
        scriptNode9.setTop(scriptNode52);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList87 = scriptNode9.getFunctions();
        int int88 = scriptNode9.getEncodedSourceEnd();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList89 = scriptNode9.getChildScopes();
        org.junit.Assert.assertNotNull(scriptNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ScriptNode" + "'", str10, "ScriptNode");
        org.junit.Assert.assertNotNull(scriptNode20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ScriptNode" + "'", str21, "ScriptNode");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "            " + "'", str24, "            ");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(scope42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(symbolList59);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str78, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 10 + "'", int81 == 10);
        org.junit.Assert.assertNull(node85);
        org.junit.Assert.assertNotNull(functionNodeList87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNull(scopeList89);
    }

    @Test
    public void test15539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15539");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode0.toSource(18);
        scriptNode0.setCompilerData((java.lang.Object) 100L);
        com.google.javascript.rhino.head.Node node6 = scriptNode0.setType(136);
        scriptNode0.setSourceName("                                                    {\n                                                    }\n");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = scriptNode0.getEnclosingFunction();
        // The following exception was thrown during execution in test generation
        try {
            functionNode9.setDouble((double) 754207379);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    {\n                                    }\n" + "'", str2, "                                    {\n                                    }\n");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(functionNode9);
    }

    @Test
    public void test15540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15540");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope(812687858, 0);
    }

    @Test
    public void test15541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15541");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope(13, 17);
        int int3 = scope2.getType();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 129 + "'", int3 == 129);
    }

    @Test
    public void test15542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15542");
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node4 = scope3.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType8 = null;
        com.google.javascript.rhino.head.ast.Comment comment10 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType8, "Scope");
        scriptNode5.setParent((com.google.javascript.rhino.head.ast.AstNode) comment10);
        scriptNode5.setEncodedSourceStart((int) (byte) 100);
        int int16 = scriptNode5.getIntProp(6, 2);
        int int17 = scriptNode5.getRegexpCount();
        scriptNode5.setEncodedSource("0\tBLOCK 0 1\n");
        scriptNode5.setLineno((int) '#');
        int int22 = scriptNode5.getLineno();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode23 = scriptNode5.getEnclosingFunction();
        int int24 = scriptNode5.getFunctionCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int27 = scriptNode26.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope scope29 = scriptNode26.getDefiningScope("51\t    SCRIPT 52 1\n");
        scriptNode26.setSourceName("");
        com.google.javascript.rhino.head.ast.AstNode astNode32 = scriptNode26.getParent();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList33 = scriptNode26.getChildScopes();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(98666588, (com.google.javascript.rhino.head.Node) scope3, (com.google.javascript.rhino.head.Node) scriptNode5, (com.google.javascript.rhino.head.Node) scriptNode26, (-243114478));
        int int36 = scriptNode26.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator37 = scriptNode26.new NodeIterator();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node38 = nodeIterator37.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNull(functionNode23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(scope29);
        org.junit.Assert.assertNull(astNode32);
        org.junit.Assert.assertNull(scopeList33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test15543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15543");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node(942365810);
    }

    @Test
    public void test15544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15544");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        int int10 = scriptNode1.getEncodedSourceStart();
        java.lang.String str11 = scriptNode1.getSourceName();
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node((int) (short) 100, (com.google.javascript.rhino.head.Node) scriptNode1);
        scriptNode1.setEncodedSourceEnd(17);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType18 = null;
        com.google.javascript.rhino.head.ast.Comment comment20 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType18, "Scope");
        scriptNode15.setParent((com.google.javascript.rhino.head.ast.AstNode) comment20);
        scriptNode15.setEncodedSourceStart((int) (byte) 100);
        int int26 = scriptNode15.getIntProp(6, 2);
        int int27 = scriptNode15.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str29 = scriptNode28.getEncodedSource();
        int int30 = scriptNode28.getBaseLineno();
        java.lang.String str31 = scriptNode28.getNextTempName();
        scriptNode15.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode28);
        java.lang.String str33 = scriptNode28.debugPrint();
        java.lang.String str35 = scriptNode28.toSource((int) (short) 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType39 = null;
        com.google.javascript.rhino.head.ast.Comment comment41 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType39, "Scope");
        scriptNode36.setParent((com.google.javascript.rhino.head.ast.AstNode) comment41);
        scriptNode36.setEncodedSourceStart((int) (byte) 100);
        int int45 = scriptNode36.getEncodedSourceStart();
        scriptNode36.setLineno(1);
        scriptNode28.addChildrenToFront((com.google.javascript.rhino.head.Node) scriptNode36);
        scriptNode1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "$0" + "'", str31, "$0");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "51\t    SCRIPT 52 1\n" + "'", str33, "51\t    SCRIPT 52 1\n");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "  {\n  }\n" + "'", str35, "  {\n  }\n");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
    }

    @Test
    public void test15545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15545");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = scriptNode1.getTop();
        scriptNode10.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int15 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str17 = scriptNode16.getEncodedSource();
        scriptNode16.setEncodedSourceEnd(18);
        scriptNode14.target = scriptNode16;
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode10, (com.google.javascript.rhino.head.Node) scriptNode16);
        int int22 = scriptNode16.getLength();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType27 = null;
        com.google.javascript.rhino.head.ast.Comment comment29 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType27, "Scope");
        scriptNode24.setParent((com.google.javascript.rhino.head.ast.AstNode) comment29);
        scriptNode24.setEncodedSourceStart((int) (byte) 100);
        int int35 = scriptNode24.getIntProp(6, 2);
        int int36 = scriptNode24.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str38 = scriptNode37.getEncodedSource();
        int int39 = scriptNode37.getBaseLineno();
        java.lang.String str40 = scriptNode37.getNextTempName();
        scriptNode24.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode37);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType45 = null;
        com.google.javascript.rhino.head.ast.Comment comment47 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType45, "Scope");
        scriptNode42.setParent((com.google.javascript.rhino.head.ast.AstNode) comment47);
        scriptNode42.setEncodedSourceStart((int) (byte) 100);
        int int53 = scriptNode42.getIntProp(6, 2);
        scriptNode42.setEndLineno(18);
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node(1, (com.google.javascript.rhino.head.Node) scriptNode37, (com.google.javascript.rhino.head.Node) scriptNode42, (int) (byte) -1);
        scriptNode16.target = scriptNode42;
        scriptNode42.clearParentScope();
        com.google.javascript.rhino.head.ast.AstRoot astRoot60 = scriptNode42.getAstRoot();
        java.lang.String str61 = scriptNode42.toSource();
        int int62 = scriptNode42.getAbsolutePosition();
        java.lang.String str63 = scriptNode42.getJsDoc();
        com.google.javascript.rhino.head.Node node65 = com.google.javascript.rhino.head.Node.newString("                        {\n                        }\n");
        scriptNode42.target = node65;
        com.google.javascript.rhino.head.Node node67 = scriptNode42.getLastChild();
        boolean boolean68 = scriptNode42.hasConsistentReturnUsage();
        org.junit.Assert.assertNotNull(scriptNode10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "$0" + "'", str40, "$0");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNull(astRoot60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "{\n}\n" + "'", str61, "{\n}\n");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test15546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15546");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int5 = scriptNode2.getIntProp(23, (int) (short) 1);
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope7.setPosition(100);
        com.google.javascript.rhino.head.Node node10 = scope7.getLastSibling();
        node10.removeChildren();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator12 = node10.spliterator();
        scriptNode2.setCompilerData((java.lang.Object) node10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType19 = null;
        com.google.javascript.rhino.head.ast.Comment comment21 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType19, "Scope");
        scriptNode16.setParent((com.google.javascript.rhino.head.ast.AstNode) comment21);
        scriptNode16.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = scriptNode16.getTop();
        scriptNode25.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int30 = scriptNode29.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str32 = scriptNode31.getEncodedSource();
        scriptNode31.setEncodedSourceEnd(18);
        scriptNode29.target = scriptNode31;
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode25, (com.google.javascript.rhino.head.Node) scriptNode31);
        com.google.javascript.rhino.head.Token.CommentType commentType39 = null;
        com.google.javascript.rhino.head.ast.Comment comment41 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType39, "Scope");
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(21, (com.google.javascript.rhino.head.Node) scriptNode25, (com.google.javascript.rhino.head.Node) comment41);
        java.lang.String str43 = scriptNode2.toStringTree(scriptNode25);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) scriptNode45);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType51 = null;
        com.google.javascript.rhino.head.ast.Comment comment53 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType51, "Scope");
        scriptNode48.setParent((com.google.javascript.rhino.head.ast.AstNode) comment53);
        scriptNode48.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = scriptNode48.getTop();
        scriptNode57.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode61 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int62 = scriptNode61.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str64 = scriptNode63.getEncodedSource();
        scriptNode63.setEncodedSourceEnd(18);
        scriptNode61.target = scriptNode63;
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode57, (com.google.javascript.rhino.head.Node) scriptNode63);
        scriptNode63.setEncodedSourceStart((int) ' ');
        scriptNode63.setEndLineno(23);
        scriptNode63.setEncodedSourceStart((int) '#');
        com.google.javascript.rhino.head.Node node76 = new com.google.javascript.rhino.head.Node(21, (com.google.javascript.rhino.head.Node) scriptNode2, node46, (com.google.javascript.rhino.head.Node) scriptNode63, 24);
        scriptNode2.setEncodedSource("in");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode79 = scriptNode2.getTop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str81 = scriptNode2.getRegexpFlags(440593346);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeSpliterator12);
        org.junit.Assert.assertNotNull(scriptNode25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(scriptNode57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(scriptNode79);
    }

    @Test
    public void test15547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15547");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int2 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str4 = scriptNode3.getEncodedSource();
        scriptNode3.setEncodedSourceEnd(18);
        scriptNode1.target = scriptNode3;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((-1));
        scriptNode9.setLineno((int) (byte) 1);
        scriptNode1.setCompilerData((java.lang.Object) (byte) 1);
        int int13 = scriptNode1.depth();
        scriptNode1.setRelative(22);
        int int16 = scriptNode1.getEndLineno();
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray17 = scriptNode1.getParamAndVarConst();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test15548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15548");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        boolean boolean7 = scope1.hasSideEffects();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString(52, "13");
        scope1.target = node10;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node12 = scope1.getFinally();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test15549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15549");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        int int11 = scriptNode0.getIntProp(6, 2);
        int int12 = scriptNode0.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str14 = scriptNode13.getEncodedSource();
        int int15 = scriptNode13.getBaseLineno();
        java.lang.String str16 = scriptNode13.getNextTempName();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode13);
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10, (int) (byte) -1);
        int int21 = scope20.depth();
        scriptNode0.replaceWith(scope20);
        com.google.javascript.rhino.head.Token.CommentType commentType25 = null;
        com.google.javascript.rhino.head.ast.Comment comment27 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType25, "Scope");
        java.lang.String str28 = comment27.getValue();
        scriptNode0.setJsDocNode(comment27);
        com.google.javascript.rhino.head.Node node30 = comment27.getLastSibling();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode31 = comment27.getEnclosingFunction();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$0" + "'", str16, "$0");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Scope" + "'", str28, "Scope");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(functionNode31);
    }

    @Test
    public void test15550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15550");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope4 = scope2.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node5 = scope2.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType9 = null;
        com.google.javascript.rhino.head.ast.Comment comment11 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType9, "Scope");
        scriptNode6.setParent((com.google.javascript.rhino.head.ast.AstNode) comment11);
        scope2.setJsDocNode(comment11);
        boolean boolean14 = scope2.hasChildren();
        java.lang.String str15 = scope2.debugPrint();
        int int16 = scope2.getLineno();
        com.google.javascript.rhino.head.Node node17 = scope2.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType21 = null;
        com.google.javascript.rhino.head.ast.Comment comment23 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType21, "Scope");
        scriptNode18.setParent((com.google.javascript.rhino.head.ast.AstNode) comment23);
        scriptNode18.clearParentScope();
        scriptNode18.setEncodedSourceBounds(9, (int) (short) -1);
        com.google.javascript.rhino.head.Node node29 = scriptNode18.target;
        scriptNode18.clearParentScope();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray31 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList32 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList32, symbolArray31);
        scriptNode18.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList32);
        int int35 = scriptNode18.getType();
        boolean boolean36 = scriptNode18.hasSideEffects();
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node(23, (com.google.javascript.rhino.head.Node) scope2, (com.google.javascript.rhino.head.Node) scriptNode18, (-1850081477));
        // The following exception was thrown during execution in test generation
        try {
            scriptNode18.setDouble(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.ScriptNode cannot be cast to com.google.javascript.rhino.head.ast.NumberLiteral");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0\tBLOCK 0 1\n" + "'", str15, "0\tBLOCK 0 1\n");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(symbolArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 136 + "'", int35 == 136);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test15551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15551");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (byte) 0, 14);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType7 = null;
        com.google.javascript.rhino.head.ast.Comment comment9 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType7, "Scope");
        scriptNode4.setParent((com.google.javascript.rhino.head.ast.AstNode) comment9);
        scriptNode4.setEncodedSourceStart((int) (byte) 100);
        int int15 = scriptNode4.getIntProp(6, 2);
        int int16 = scriptNode4.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str18 = scriptNode17.getEncodedSource();
        int int19 = scriptNode17.getBaseLineno();
        java.lang.String str20 = scriptNode17.getNextTempName();
        scriptNode4.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        int int22 = scriptNode17.getType();
        java.lang.String str23 = scriptNode17.debugPrint();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList24 = scriptNode17.getSymbols();
        int int25 = scriptNode17.getFunctionCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType29 = null;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType29, "Scope");
        scriptNode26.setParent((com.google.javascript.rhino.head.ast.AstNode) comment31);
        scriptNode26.setEncodedSourceStart((int) (byte) 100);
        int int37 = scriptNode26.getIntProp(6, 2);
        int int38 = scriptNode26.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str40 = scriptNode39.getEncodedSource();
        int int41 = scriptNode39.getBaseLineno();
        java.lang.String str42 = scriptNode39.getNextTempName();
        scriptNode26.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode39);
        java.lang.String str44 = scriptNode39.debugPrint();
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(2, (com.google.javascript.rhino.head.Node) scriptNode17, (com.google.javascript.rhino.head.Node) scriptNode39);
        int int46 = scriptNode17.getType();
        scope2.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        int int48 = scriptNode17.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType52 = null;
        com.google.javascript.rhino.head.ast.Comment comment54 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType52, "Scope");
        scriptNode49.setParent((com.google.javascript.rhino.head.ast.AstNode) comment54);
        scriptNode49.setEncodedSourceStart((int) (byte) 100);
        int int60 = scriptNode49.getIntProp(6, 2);
        int int61 = scriptNode49.getRegexpCount();
        boolean boolean62 = scriptNode49.hasSideEffects();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap63 = scriptNode49.getSymbolTable();
        java.lang.Object obj65 = scriptNode49.getProp((int) ' ');
        scriptNode17.setCompilerData((java.lang.Object) scriptNode49);
        int int67 = scriptNode17.getAbsolutePosition();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "$0" + "'", str20, "$0");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 136 + "'", int22 == 136);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "51\t    SCRIPT 52 1\n" + "'", str23, "51\t    SCRIPT 52 1\n");
        org.junit.Assert.assertNotNull(symbolList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "$0" + "'", str42, "$0");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "51\t    SCRIPT 52 1\n" + "'", str44, "51\t    SCRIPT 52 1\n");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 136 + "'", int46 == 136);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(strMap63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 51 + "'", int67 == 51);
    }

    @Test
    public void test15552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15552");
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
        int int17 = scriptNode1.getBaseLineno();
        scriptNode1.removeProp(1487440633);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getEncodedSource();
        scriptNode20.setEncodedSourceEnd(18);
        java.lang.String str25 = scriptNode20.makeIndent((int) '#');
        scriptNode20.setLineno(15);
        scriptNode1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode20);
        scriptNode20.setEncodedSourceEnd(226035720);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeSpliterator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                          {\n                                          }\n" + "'", str14, "                                          {\n                                          }\n");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "                                                                      " + "'", str25, "                                                                      ");
    }

    @Test
    public void test15553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15553");
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment(15, 52, commentType3, "                        ");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str7 = scriptNode6.getEncodedSource();
        scriptNode6.setEncodedSourceEnd(18);
        java.lang.String str11 = scriptNode6.makeIndent((int) '#');
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node((int) (byte) -1, (com.google.javascript.rhino.head.Node) comment5, (com.google.javascript.rhino.head.Node) scriptNode6);
        com.google.javascript.rhino.head.Token.CommentType commentType13 = comment5.getCommentType();
        com.google.javascript.rhino.head.Node node14 = comment5.getLastChild();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = node14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                      " + "'", str11, "                                                                      ");
        org.junit.Assert.assertNull(commentType13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test15554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15554");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str9 = scriptNode0.getSourceName();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor10 = scriptNode0.iterator();
        scriptNode0.setBounds((-613442063), 1278533831);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType19 = null;
        com.google.javascript.rhino.head.ast.Comment comment21 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType19, "Scope");
        scriptNode16.setParent((com.google.javascript.rhino.head.ast.AstNode) comment21);
        scriptNode16.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = scriptNode16.getTop();
        scriptNode25.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int30 = scriptNode29.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str32 = scriptNode31.getEncodedSource();
        scriptNode31.setEncodedSourceEnd(18);
        scriptNode29.target = scriptNode31;
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode25, (com.google.javascript.rhino.head.Node) scriptNode31);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str38 = scriptNode37.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType43 = null;
        com.google.javascript.rhino.head.ast.Comment comment45 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType43, "Scope");
        scriptNode40.setParent((com.google.javascript.rhino.head.ast.AstNode) comment45);
        scriptNode40.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str49 = scriptNode40.getSourceName();
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode40, 26);
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node((int) (byte) -1, node36, (com.google.javascript.rhino.head.Node) scriptNode37, (com.google.javascript.rhino.head.Node) scriptNode40);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap53 = null;
        scriptNode40.setSymbolTable(strMap53);
        java.lang.String str55 = scriptNode40.debugPrint();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType60 = null;
        com.google.javascript.rhino.head.ast.Comment comment62 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType60, "Scope");
        scriptNode57.setParent((com.google.javascript.rhino.head.ast.AstNode) comment62);
        scriptNode57.setEncodedSourceStart((int) (byte) 100);
        int int68 = scriptNode57.getIntProp(6, 2);
        int int69 = scriptNode57.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope71 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope73 = scope71.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node74 = scope71.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode75 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType78 = null;
        com.google.javascript.rhino.head.ast.Comment comment80 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType78, "Scope");
        scriptNode75.setParent((com.google.javascript.rhino.head.ast.AstNode) comment80);
        scope71.setJsDocNode(comment80);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode83 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType86 = null;
        com.google.javascript.rhino.head.ast.Comment comment88 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType86, "Scope");
        scriptNode83.setParent((com.google.javascript.rhino.head.ast.AstNode) comment88);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList90 = scriptNode83.getSymbols();
        com.google.javascript.rhino.head.Node node91 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode57, (com.google.javascript.rhino.head.Node) scope71, (com.google.javascript.rhino.head.Node) scriptNode83);
        boolean boolean92 = scriptNode57.hasChildren();
        java.lang.String str93 = scriptNode40.toStringTree(scriptNode57);
        scriptNode0.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode57);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode96 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) -1);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList97 = scriptNode96.getSymbols();
        scriptNode57.setSymbols(symbolList97);
        int int99 = scriptNode57.getLineno();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(nodeItor10);
        org.junit.Assert.assertNotNull(scriptNode25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str55, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNull(scope73);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNotNull(symbolList90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNull(str93);
        org.junit.Assert.assertNotNull(symbolList97);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + (-1) + "'", int99 == (-1));
    }

    @Test
    public void test15555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15555");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.clearParentScope();
        com.google.javascript.rhino.head.ast.Scope scope9 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope11 = scope9.getDefiningScope("Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType17 = null;
        com.google.javascript.rhino.head.ast.Comment comment19 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType17, "Scope");
        scriptNode14.setParent((com.google.javascript.rhino.head.ast.AstNode) comment19);
        scriptNode14.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = scriptNode14.getTop();
        scriptNode23.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int28 = scriptNode27.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str30 = scriptNode29.getEncodedSource();
        scriptNode29.setEncodedSourceEnd(18);
        scriptNode27.target = scriptNode29;
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode23, (com.google.javascript.rhino.head.Node) scriptNode29);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str36 = scriptNode35.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType41 = null;
        com.google.javascript.rhino.head.ast.Comment comment43 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType41, "Scope");
        scriptNode38.setParent((com.google.javascript.rhino.head.ast.AstNode) comment43);
        scriptNode38.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str47 = scriptNode38.getSourceName();
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode38, 26);
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node((int) (byte) -1, node34, (com.google.javascript.rhino.head.Node) scriptNode35, (com.google.javascript.rhino.head.Node) scriptNode38);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType54 = null;
        com.google.javascript.rhino.head.ast.Comment comment56 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType54, "Scope");
        scriptNode51.setParent((com.google.javascript.rhino.head.ast.AstNode) comment56);
        scriptNode51.setEncodedSourceStart((int) (byte) 100);
        int int62 = scriptNode51.getIntProp(6, 2);
        scriptNode51.setEndLineno(18);
        scriptNode38.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode51);
        scriptNode0.addChildAfter((com.google.javascript.rhino.head.Node) scope9, (com.google.javascript.rhino.head.Node) scriptNode38);
        int int67 = scriptNode0.getEncodedSourceEnd();
        boolean boolean68 = scriptNode0.hasSideEffects();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator69 = scriptNode0.spliterator();
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNotNull(scriptNode23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator69);
    }

    @Test
    public void test15556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15556");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((-25), (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            node2.setDouble((double) 581273883);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Node cannot be cast to com.google.javascript.rhino.head.ast.NumberLiteral");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15557");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        java.lang.String str7 = scope1.toSource();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap8 = scope1.getSymbolTable();
        boolean boolean9 = scope1.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType13 = null;
        com.google.javascript.rhino.head.ast.Comment comment15 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType13, "Scope");
        scriptNode10.setParent((com.google.javascript.rhino.head.ast.AstNode) comment15);
        scriptNode10.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = scriptNode10.getTop();
        scope1.target = scriptNode10;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList21 = scriptNode10.getFunctions();
        scriptNode10.setEncodedSourceStart(52);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap24 = scriptNode10.getSymbolTable();
        int int25 = scriptNode10.getType();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\n}\n" + "'", str7, "{\n}\n");
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(scriptNode19);
        org.junit.Assert.assertNotNull(functionNodeList21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 136 + "'", int25 == 136);
    }

    @Test
    public void test15558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15558");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType5 = null;
        com.google.javascript.rhino.head.ast.Comment comment7 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType5, "Scope");
        scriptNode2.setParent((com.google.javascript.rhino.head.ast.AstNode) comment7);
        scriptNode2.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = scriptNode2.getTop();
        scriptNode11.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int16 = scriptNode15.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str18 = scriptNode17.getEncodedSource();
        scriptNode17.setEncodedSourceEnd(18);
        scriptNode15.target = scriptNode17;
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode11, (com.google.javascript.rhino.head.Node) scriptNode17);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str24 = scriptNode23.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType29 = null;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType29, "Scope");
        scriptNode26.setParent((com.google.javascript.rhino.head.ast.AstNode) comment31);
        scriptNode26.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str35 = scriptNode26.getSourceName();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode26, 26);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node((int) (byte) -1, node22, (com.google.javascript.rhino.head.Node) scriptNode23, (com.google.javascript.rhino.head.Node) scriptNode26);
        com.google.javascript.rhino.head.Node node39 = scriptNode26.getLastSibling();
        java.lang.String str40 = scriptNode26.getEncodedSource();
        com.google.javascript.rhino.head.Node node42 = scriptNode26.setType(8);
        com.google.javascript.rhino.head.ast.Scope scope46 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope48 = scope46.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node49 = scope46.target;
        scope46.setPosition(2);
        scope46.setLength((int) (byte) 1);
        java.lang.Object obj55 = scope46.getProp((int) 'a');
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node((int) (byte) 10, (com.google.javascript.rhino.head.Node) scope46);
        com.google.javascript.rhino.head.ast.Scope scope58 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope60 = scope58.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node61 = scope58.target;
        scope58.setPosition(2);
        java.lang.String str64 = scope58.toSource();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap65 = scope58.getSymbolTable();
        boolean boolean66 = scope58.hasChildren();
        com.google.javascript.rhino.head.Node node67 = scope58.getNext();
        scope46.addChildrenToFront((com.google.javascript.rhino.head.Node) scope58);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode69 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType72 = null;
        com.google.javascript.rhino.head.ast.Comment comment74 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType72, "Scope");
        scriptNode69.setParent((com.google.javascript.rhino.head.ast.AstNode) comment74);
        scriptNode69.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode78 = scriptNode69.getTop();
        scriptNode78.setPosition(6);
        com.google.javascript.rhino.head.Token.CommentType commentType83 = null;
        com.google.javascript.rhino.head.ast.Comment comment85 = new com.google.javascript.rhino.head.ast.Comment(9, 9, commentType83, "{\n}\n");
        java.lang.String str86 = comment85.getValue();
        comment85.setLength(129);
        com.google.javascript.rhino.head.Node node89 = new com.google.javascript.rhino.head.Node(35, (com.google.javascript.rhino.head.Node) scope46, (com.google.javascript.rhino.head.Node) scriptNode78, (com.google.javascript.rhino.head.Node) comment85);
        scriptNode78.setEncodedSourceStart(14);
        scriptNode26.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode78);
        int int93 = scriptNode78.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope94 = scriptNode78.getParentScope();
        scriptNode78.putIntProp((-85), 701595233);
        org.junit.Assert.assertNotNull(scriptNode11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(scope48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(scope60);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "{\n}\n" + "'", str64, "{\n}\n");
        org.junit.Assert.assertNull(strMap65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(scriptNode78);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "{\n}\n" + "'", str86, "{\n}\n");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNull(scope94);
    }

    @Test
    public void test15559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15559");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        scriptNode1.setBaseLineno((int) (short) 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType7 = null;
        com.google.javascript.rhino.head.ast.Comment comment9 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType7, "Scope");
        scriptNode4.setParent((com.google.javascript.rhino.head.ast.AstNode) comment9);
        scriptNode4.setEncodedSourceStart((int) (byte) 100);
        int int13 = scriptNode4.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType18 = null;
        com.google.javascript.rhino.head.ast.Comment comment20 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType18, "Scope");
        scriptNode15.setParent((com.google.javascript.rhino.head.ast.AstNode) comment20);
        scriptNode15.setEncodedSourceStart((int) (byte) 100);
        int int26 = scriptNode15.getIntProp(6, 2);
        int int27 = scriptNode15.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope29 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope31 = scope29.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node32 = scope29.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType36 = null;
        com.google.javascript.rhino.head.ast.Comment comment38 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType36, "Scope");
        scriptNode33.setParent((com.google.javascript.rhino.head.ast.AstNode) comment38);
        scope29.setJsDocNode(comment38);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType44 = null;
        com.google.javascript.rhino.head.ast.Comment comment46 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType44, "Scope");
        scriptNode41.setParent((com.google.javascript.rhino.head.ast.AstNode) comment46);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList48 = scriptNode41.getSymbols();
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode15, (com.google.javascript.rhino.head.Node) scope29, (com.google.javascript.rhino.head.Node) scriptNode41);
        scriptNode41.setPosition((int) (byte) 0);
        scriptNode41.setEncodedSourceStart((int) (byte) 1);
        java.lang.String str55 = scriptNode41.makeIndent(0);
        java.lang.String str56 = scriptNode4.toStringTree(scriptNode41);
        java.lang.String str58 = scriptNode41.makeIndent(12);
        java.lang.String str59 = scriptNode41.getSourceName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str62 = scriptNode60.toSource(18);
        int int63 = scriptNode60.getEndLineno();
        com.google.javascript.rhino.head.ast.Comment comment64 = scriptNode60.getJsDocNode();
        int int65 = scriptNode60.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList66 = scriptNode60.getChildScopes();
        com.google.javascript.rhino.head.ast.Scope scope69 = new com.google.javascript.rhino.head.ast.Scope((int) (short) -1, 100);
        com.google.javascript.rhino.head.ast.Symbol symbol71 = scope69.getSymbol("$0");
        boolean boolean72 = scope69.hasSideEffects();
        boolean boolean73 = scope69.hasChildren();
        scriptNode60.addChildToFront((com.google.javascript.rhino.head.Node) scope69);
        scriptNode41.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode60);
        scriptNode1.setCompilerData((java.lang.Object) scriptNode41);
        scriptNode41.setLength((-389829193));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(scope31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(symbolList48);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "                        " + "'", str58, "                        ");
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "                                    {\n                                    }\n" + "'", str62, "                                    {\n                                    }\n");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNull(comment64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNull(scopeList66);
        org.junit.Assert.assertNull(symbol71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test15560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15560");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType5 = null;
        com.google.javascript.rhino.head.ast.Comment comment7 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType5, "Scope");
        scriptNode2.setParent((com.google.javascript.rhino.head.ast.AstNode) comment7);
        scriptNode2.setEncodedSourceStart((int) (byte) 100);
        int int13 = scriptNode2.getIntProp(6, 2);
        int int14 = scriptNode2.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope16 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope18 = scope16.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node19 = scope16.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType23 = null;
        com.google.javascript.rhino.head.ast.Comment comment25 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType23, "Scope");
        scriptNode20.setParent((com.google.javascript.rhino.head.ast.AstNode) comment25);
        scope16.setJsDocNode(comment25);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType31 = null;
        com.google.javascript.rhino.head.ast.Comment comment33 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType31, "Scope");
        scriptNode28.setParent((com.google.javascript.rhino.head.ast.AstNode) comment33);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList35 = scriptNode28.getSymbols();
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode2, (com.google.javascript.rhino.head.Node) scope16, (com.google.javascript.rhino.head.Node) scriptNode28);
        scriptNode28.setPosition((int) (byte) 0);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList39 = scriptNode28.getFunctions();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode40 = scriptNode28.getEnclosingFunction();
        com.google.javascript.rhino.head.ast.AstNode astNode41 = scriptNode28.getParent();
        com.google.javascript.rhino.head.Token.CommentType commentType45 = null;
        com.google.javascript.rhino.head.ast.Comment comment47 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType45, "Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str49 = scriptNode48.getEncodedSource();
        scriptNode48.setEncodedSourceEnd(18);
        java.lang.String str52 = comment47.toStringTree(scriptNode48);
        com.google.javascript.rhino.head.Node node54 = com.google.javascript.rhino.head.Node.newString("{\n}\n");
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode48, node54);
        int int56 = scriptNode48.getRegexpCount();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator57 = scriptNode48.spliterator();
        int int58 = scriptNode48.getBaseLineno();
        int int59 = scriptNode48.depth();
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node(2018070520, (com.google.javascript.rhino.head.Node) scriptNode28, (com.google.javascript.rhino.head.Node) scriptNode48, 0);
        // The following exception was thrown during execution in test generation
        try {
            scriptNode28.setString("                                                                                                                    {\n                                                                                                                    }\n");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.ScriptNode cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(symbolList35);
        org.junit.Assert.assertNotNull(functionNodeList39);
        org.junit.Assert.assertNull(functionNode40);
        org.junit.Assert.assertNotNull(astNode41);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(nodeSpliterator57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test15561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15561");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        int int12 = scriptNode1.getIntProp(6, 2);
        int int13 = scriptNode1.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope17 = scope15.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node18 = scope15.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType22 = null;
        com.google.javascript.rhino.head.ast.Comment comment24 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType22, "Scope");
        scriptNode19.setParent((com.google.javascript.rhino.head.ast.AstNode) comment24);
        scope15.setJsDocNode(comment24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType30 = null;
        com.google.javascript.rhino.head.ast.Comment comment32 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType30, "Scope");
        scriptNode27.setParent((com.google.javascript.rhino.head.ast.AstNode) comment32);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList34 = scriptNode27.getSymbols();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode1, (com.google.javascript.rhino.head.Node) scope15, (com.google.javascript.rhino.head.Node) scriptNode27);
        scriptNode27.setPosition((int) (byte) 0);
        scriptNode27.setEncodedSourceStart((int) (byte) 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType43 = null;
        com.google.javascript.rhino.head.ast.Comment comment45 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType43, "Scope");
        scriptNode40.setParent((com.google.javascript.rhino.head.ast.AstNode) comment45);
        scriptNode40.setEncodedSourceStart((int) (byte) 100);
        int int51 = scriptNode40.getIntProp(6, 2);
        int int52 = scriptNode40.getParamCount();
        java.lang.String str53 = scriptNode40.debugPrint();
        int int56 = scriptNode40.getIntProp(17, 10);
        scriptNode27.setTop(scriptNode40);
        int int58 = scriptNode40.getParamCount();
        boolean boolean59 = scriptNode40.hasChildren();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList60 = scriptNode40.getFunctions();
        java.lang.String str61 = scriptNode40.toSource();
        // The following exception was thrown during execution in test generation
        try {
            scriptNode40.setDouble((double) 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.ScriptNode cannot be cast to com.google.javascript.rhino.head.ast.NumberLiteral");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(symbolList34);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str53, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(functionNodeList60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "{\n}\n" + "'", str61, "{\n}\n");
    }

    @Test
    public void test15562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15562");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        java.lang.String str7 = scope1.toSource();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap8 = scope1.getSymbolTable();
        boolean boolean9 = scope1.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType13 = null;
        com.google.javascript.rhino.head.ast.Comment comment15 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType13, "Scope");
        scriptNode10.setParent((com.google.javascript.rhino.head.ast.AstNode) comment15);
        scriptNode10.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = scriptNode10.getTop();
        scope1.target = scriptNode10;
        com.google.javascript.rhino.head.Node node21 = scriptNode10.target;
        int int22 = scriptNode10.getEncodedSourceEnd();
        int int23 = scriptNode10.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType28 = null;
        com.google.javascript.rhino.head.ast.Comment comment30 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType28, "Scope");
        scriptNode25.setParent((com.google.javascript.rhino.head.ast.AstNode) comment30);
        scriptNode25.setEncodedSourceStart((int) (byte) 100);
        int int36 = scriptNode25.getIntProp(6, 2);
        int int37 = scriptNode25.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope39 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope41 = scope39.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node42 = scope39.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType46 = null;
        com.google.javascript.rhino.head.ast.Comment comment48 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType46, "Scope");
        scriptNode43.setParent((com.google.javascript.rhino.head.ast.AstNode) comment48);
        scope39.setJsDocNode(comment48);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType54 = null;
        com.google.javascript.rhino.head.ast.Comment comment56 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType54, "Scope");
        scriptNode51.setParent((com.google.javascript.rhino.head.ast.AstNode) comment56);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList58 = scriptNode51.getSymbols();
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode25, (com.google.javascript.rhino.head.Node) scope39, (com.google.javascript.rhino.head.Node) scriptNode51);
        scriptNode51.setPosition((int) (byte) 0);
        scriptNode51.setEncodedSourceStart((int) (byte) 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode64 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType67 = null;
        com.google.javascript.rhino.head.ast.Comment comment69 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType67, "Scope");
        scriptNode64.setParent((com.google.javascript.rhino.head.ast.AstNode) comment69);
        scriptNode64.setEncodedSourceStart((int) (byte) 100);
        int int75 = scriptNode64.getIntProp(6, 2);
        int int76 = scriptNode64.getParamCount();
        java.lang.String str77 = scriptNode64.debugPrint();
        int int80 = scriptNode64.getIntProp(17, 10);
        scriptNode51.setTop(scriptNode64);
        scriptNode51.setEncodedSourceEnd(9);
        com.google.javascript.rhino.head.Node node84 = scriptNode51.getLastChild();
        java.lang.String str85 = scriptNode51.getJsDoc();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList86 = scriptNode51.getFunctions();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode88 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int89 = scriptNode88.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode90 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str91 = scriptNode90.getEncodedSource();
        scriptNode90.setEncodedSourceEnd(18);
        scriptNode88.target = scriptNode90;
        com.google.javascript.rhino.head.Node node95 = scriptNode90.getFirstChild();
        scriptNode51.setTop(scriptNode90);
        boolean boolean97 = scriptNode90.hasSideEffects();
        scriptNode10.addChildrenToFront((com.google.javascript.rhino.head.Node) scriptNode90);
        int int99 = scriptNode90.getLineno();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\n}\n" + "'", str7, "{\n}\n");
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(scriptNode19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(scope41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(symbolList58);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2 + "'", int75 == 2);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str77, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 10 + "'", int80 == 10);
        org.junit.Assert.assertNull(node84);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNotNull(functionNodeList86);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNull(str91);
        org.junit.Assert.assertNull(node95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + (-1) + "'", int99 == (-1));
    }

    @Test
    public void test15563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15563");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        scriptNode0.setEncodedSourceEnd(18);
        com.google.javascript.rhino.head.ast.Scope scope6 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10, (int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType10 = null;
        com.google.javascript.rhino.head.ast.Comment comment12 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType10, "Scope");
        scriptNode7.setParent((com.google.javascript.rhino.head.ast.AstNode) comment12);
        scriptNode7.clearParentScope();
        scriptNode7.setEncodedSourceBounds(9, (int) (short) -1);
        com.google.javascript.rhino.head.Node node18 = scriptNode7.target;
        scriptNode7.clearParentScope();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getEncodedSource();
        scriptNode20.setEncodedSourceEnd(18);
        java.lang.String str25 = scriptNode20.makeIndent((int) '#');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType29 = null;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType29, "Scope");
        scriptNode26.setParent((com.google.javascript.rhino.head.ast.AstNode) comment31);
        scriptNode26.setEncodedSourceStart((int) (byte) 100);
        scriptNode20.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode26);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode7, (com.google.javascript.rhino.head.ast.Scope) scriptNode20);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap37 = scriptNode20.getSymbolTable();
        scope6.setSymbolTable(strMap37);
        scriptNode0.setSymbolTable(strMap37);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = scriptNode0.getTop();
        // The following exception was thrown during execution in test generation
        try {
            int int41 = scriptNode0.getParamAndVarCount();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "                                                                      " + "'", str25, "                                                                      ");
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(scriptNode40);
    }

    @Test
    public void test15564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15564");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        java.lang.String str4 = scope2.makeIndent(0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType11 = null;
        com.google.javascript.rhino.head.ast.Comment comment13 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType11, "Scope");
        scriptNode8.setParent((com.google.javascript.rhino.head.ast.AstNode) comment13);
        scriptNode8.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str17 = scriptNode8.getSourceName();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode8, 26);
        scriptNode6.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode8);
        java.lang.String str21 = scriptNode6.getNextTempName();
        scope2.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode6);
        com.google.javascript.rhino.head.ast.Scope scope24 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope26 = scope24.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node27 = scope24.target;
        scope24.setPosition(2);
        int int30 = scope24.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope31 = scope24.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator32 = scope24.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope34 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope36 = scope34.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node37 = scope34.target;
        scope34.setPosition(2);
        int int40 = scope34.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope41 = scope34.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator42 = scope34.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str44 = scriptNode43.getEncodedSource();
        int int45 = scriptNode43.getBaseLineno();
        java.lang.Object obj46 = scriptNode43.getCompilerData();
        scriptNode43.flattenSymbolTable(false);
        scope24.addChildAfter((com.google.javascript.rhino.head.Node) scope34, (com.google.javascript.rhino.head.Node) scriptNode43);
        java.lang.String str51 = scriptNode43.makeIndent((-1));
        scope2.target = scriptNode43;
        scriptNode43.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.Scope scope56 = scriptNode43.getDefiningScope("                                                                                                        Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType60 = null;
        com.google.javascript.rhino.head.ast.Comment comment62 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType60, "Scope");
        scriptNode57.setParent((com.google.javascript.rhino.head.ast.AstNode) comment62);
        scriptNode57.setEncodedSourceStart((int) (byte) 100);
        int int68 = scriptNode57.getIntProp(6, 2);
        int int69 = scriptNode57.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode70 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType73 = null;
        com.google.javascript.rhino.head.ast.Comment comment75 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType73, "Scope");
        scriptNode70.setParent((com.google.javascript.rhino.head.ast.AstNode) comment75);
        scriptNode70.setEncodedSourceStart((int) (byte) 100);
        int int81 = scriptNode70.getIntProp(6, 2);
        int int82 = scriptNode70.getParamCount();
        scriptNode57.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode70);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap84 = scriptNode70.getSymbolTable();
        java.lang.String str85 = scriptNode70.getSourceName();
        int int86 = scriptNode70.getBaseLineno();
        scriptNode43.setTop(scriptNode70);
        scriptNode43.setEncodedSourceEnd((-25));
        com.google.javascript.rhino.head.Node node91 = new com.google.javascript.rhino.head.Node(371991955, (com.google.javascript.rhino.head.Node) scriptNode43, 70);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.Scope scope92 = com.google.javascript.rhino.head.ast.Scope.splitScope((com.google.javascript.rhino.head.ast.Scope) scriptNode43);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.Scope cannot be cast to com.google.javascript.rhino.head.ast.ScriptNode");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "$0" + "'", str21, "$0");
        org.junit.Assert.assertNull(scope26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(scope31);
        org.junit.Assert.assertNotNull(nodeSpliterator32);
        org.junit.Assert.assertNull(scope36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(scope41);
        org.junit.Assert.assertNotNull(nodeSpliterator42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNull(scope56);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 2 + "'", int81 == 2);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNull(strMap84);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
    }

    @Test
    public void test15565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15565");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode1.setSourceName("                                              Scope");
        java.lang.String str4 = scriptNode1.getJsDoc();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType9 = null;
        com.google.javascript.rhino.head.ast.Comment comment11 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType9, "Scope");
        scriptNode6.setParent((com.google.javascript.rhino.head.ast.AstNode) comment11);
        scriptNode6.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = scriptNode6.getTop();
        scriptNode15.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int20 = scriptNode19.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str22 = scriptNode21.getEncodedSource();
        scriptNode21.setEncodedSourceEnd(18);
        scriptNode19.target = scriptNode21;
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode15, (com.google.javascript.rhino.head.Node) scriptNode21);
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope30 = scope28.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node31 = scope28.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType35 = null;
        com.google.javascript.rhino.head.ast.Comment comment37 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType35, "Scope");
        scriptNode32.setParent((com.google.javascript.rhino.head.ast.AstNode) comment37);
        scope28.setJsDocNode(comment37);
        boolean boolean40 = scope28.hasChildren();
        scriptNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode21, (com.google.javascript.rhino.head.Node) scope28);
        com.google.javascript.rhino.head.ast.Comment comment42 = scriptNode21.getJsDocNode();
        scriptNode21.setLineno((int) (short) 100);
        scriptNode21.flattenSymbolTable(false);
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node((-992272926), (com.google.javascript.rhino.head.Node) scriptNode21);
        java.lang.String str49 = scriptNode21.toSource((-2));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType53 = null;
        com.google.javascript.rhino.head.ast.Comment comment55 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType53, "Scope");
        scriptNode50.setParent((com.google.javascript.rhino.head.ast.AstNode) comment55);
        scriptNode50.setEncodedSourceStart((int) (byte) 100);
        int int59 = scriptNode50.getEncodedSourceStart();
        int int60 = scriptNode50.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.Scope scope62 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope64 = scope62.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node65 = scope62.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType69 = null;
        com.google.javascript.rhino.head.ast.Comment comment71 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType69, "Scope");
        scriptNode66.setParent((com.google.javascript.rhino.head.ast.AstNode) comment71);
        scope62.setJsDocNode(comment71);
        com.google.javascript.rhino.head.Token.CommentType commentType74 = null;
        comment71.setCommentType(commentType74);
        com.google.javascript.rhino.head.ast.AstRoot astRoot76 = comment71.getAstRoot();
        scriptNode50.setJsDocNode(comment71);
        scriptNode21.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode50);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(scriptNode15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(scope30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(comment42);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "{\n}\n" + "'", str49, "{\n}\n");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNull(scope64);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNull(astRoot76);
    }

    @Test
    public void test15566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15566");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope1.setPosition(100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType8 = null;
        com.google.javascript.rhino.head.ast.Comment comment10 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType8, "Scope");
        scriptNode5.setParent((com.google.javascript.rhino.head.ast.AstNode) comment10);
        scriptNode5.setEncodedSourceStart((int) (byte) 100);
        int int16 = scriptNode5.getIntProp(6, 2);
        int int17 = scriptNode5.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope21 = scope19.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node22 = scope19.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType26, "Scope");
        scriptNode23.setParent((com.google.javascript.rhino.head.ast.AstNode) comment28);
        scope19.setJsDocNode(comment28);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType34 = null;
        com.google.javascript.rhino.head.ast.Comment comment36 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType34, "Scope");
        scriptNode31.setParent((com.google.javascript.rhino.head.ast.AstNode) comment36);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList38 = scriptNode31.getSymbols();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode5, (com.google.javascript.rhino.head.Node) scope19, (com.google.javascript.rhino.head.Node) scriptNode31);
        scriptNode31.setPosition((int) (byte) 0);
        scope1.setTop(scriptNode31);
        int int43 = scriptNode31.getParamCount();
        boolean boolean44 = scriptNode31.hasConsistentReturnUsage();
        java.lang.String str45 = scriptNode31.getEncodedSource();
        com.google.javascript.rhino.head.Node node47 = scriptNode31.setType(136);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType51 = null;
        com.google.javascript.rhino.head.ast.Comment comment53 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType51, "Scope");
        scriptNode48.setParent((com.google.javascript.rhino.head.ast.AstNode) comment53);
        scriptNode48.setEncodedSourceStart((int) (byte) 100);
        int int59 = scriptNode48.getIntProp(6, 2);
        int int60 = scriptNode48.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode61 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType64 = null;
        com.google.javascript.rhino.head.ast.Comment comment66 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType64, "Scope");
        scriptNode61.setParent((com.google.javascript.rhino.head.ast.AstNode) comment66);
        scriptNode61.setEncodedSourceStart((int) (byte) 100);
        int int72 = scriptNode61.getIntProp(6, 2);
        int int73 = scriptNode61.getParamCount();
        scriptNode48.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode61);
        scriptNode61.setEncodedSourceStart((int) (byte) 1);
        scriptNode61.setEncodedSource("                                                                                                                                                                                                        Scope");
        int int79 = scriptNode61.depth();
        scriptNode61.setEncodedSourceEnd((int) (byte) 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode82 = scriptNode61.getTop();
        scriptNode31.setParentScope((com.google.javascript.rhino.head.ast.Scope) scriptNode82);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(symbolList38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2 + "'", int72 == 2);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(scriptNode82);
    }

    @Test
    public void test15567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15567");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        int int11 = scriptNode0.getIntProp(6, 2);
        int int12 = scriptNode0.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str14 = scriptNode13.getEncodedSource();
        int int15 = scriptNode13.getBaseLineno();
        java.lang.String str16 = scriptNode13.getNextTempName();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode13);
        java.lang.String str18 = scriptNode13.debugPrint();
        java.lang.String str20 = scriptNode13.toSource((int) (short) 1);
        int int21 = scriptNode13.getLineno();
        java.lang.String str22 = scriptNode13.debugPrint();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = scriptNode13.getTop();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$0" + "'", str16, "$0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "51\t    SCRIPT 52 1\n" + "'", str18, "51\t    SCRIPT 52 1\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "  {\n  }\n" + "'", str20, "  {\n  }\n");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "51\t    SCRIPT 52 1\n" + "'", str22, "51\t    SCRIPT 52 1\n");
        org.junit.Assert.assertNotNull(scriptNode23);
    }

    @Test
    public void test15568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15568");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode0.toSource(18);
        java.lang.Object obj3 = scriptNode0.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType8 = null;
        com.google.javascript.rhino.head.ast.Comment comment10 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType8, "Scope");
        scriptNode5.setParent((com.google.javascript.rhino.head.ast.AstNode) comment10);
        scriptNode5.setEncodedSourceStart((int) (byte) 100);
        int int16 = scriptNode5.getIntProp(6, 2);
        int int17 = scriptNode5.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope21 = scope19.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node22 = scope19.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType26, "Scope");
        scriptNode23.setParent((com.google.javascript.rhino.head.ast.AstNode) comment28);
        scope19.setJsDocNode(comment28);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType34 = null;
        com.google.javascript.rhino.head.ast.Comment comment36 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType34, "Scope");
        scriptNode31.setParent((com.google.javascript.rhino.head.ast.AstNode) comment36);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList38 = scriptNode31.getSymbols();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode5, (com.google.javascript.rhino.head.Node) scope19, (com.google.javascript.rhino.head.Node) scriptNode31);
        scriptNode31.setPosition((int) (byte) 0);
        com.google.javascript.rhino.head.Node node42 = scriptNode31.target;
        scriptNode0.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode31);
        int int44 = scriptNode31.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope45 = scriptNode31.getEnclosingScope();
        java.lang.String str46 = scriptNode31.toString();
        scriptNode31.putIntProp(22, (int) '#');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType53 = null;
        com.google.javascript.rhino.head.ast.Comment comment55 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType53, "Scope");
        scriptNode50.setParent((com.google.javascript.rhino.head.ast.AstNode) comment55);
        scriptNode50.clearParentScope();
        scriptNode50.setEncodedSourceBounds(9, (int) (short) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode61 = scriptNode50.getTop();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode62 = scriptNode50.getTop();
        scriptNode50.setEncodedSource("10");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList65 = scriptNode50.getSymbols();
        scriptNode31.target = scriptNode50;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    {\n                                    }\n" + "'", str2, "                                    {\n                                    }\n");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(symbolList38);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(scope45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "136" + "'", str46, "136");
        org.junit.Assert.assertNotNull(scriptNode61);
        org.junit.Assert.assertNotNull(scriptNode62);
        org.junit.Assert.assertNotNull(symbolList65);
    }

    @Test
    public void test15569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15569");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope(20);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType6 = null;
        com.google.javascript.rhino.head.ast.Comment comment8 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType6, "Scope");
        scriptNode3.setParent((com.google.javascript.rhino.head.ast.AstNode) comment8);
        scriptNode3.setEncodedSourceStart((int) (byte) 100);
        int int12 = scriptNode3.getEncodedSourceStart();
        int int13 = scriptNode3.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType17 = null;
        com.google.javascript.rhino.head.ast.Comment comment19 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType17, "Scope");
        scriptNode14.setParent((com.google.javascript.rhino.head.ast.AstNode) comment19);
        scriptNode14.setEncodedSourceStart((int) (byte) 100);
        int int25 = scriptNode14.getIntProp(6, 2);
        int int26 = scriptNode14.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str28 = scriptNode27.getEncodedSource();
        int int29 = scriptNode27.getBaseLineno();
        java.lang.String str30 = scriptNode27.getNextTempName();
        scriptNode14.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode27);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType37 = null;
        com.google.javascript.rhino.head.ast.Comment comment39 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType37, "Scope");
        scriptNode34.setParent((com.google.javascript.rhino.head.ast.AstNode) comment39);
        scriptNode34.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = scriptNode34.getTop();
        scriptNode43.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int48 = scriptNode47.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str50 = scriptNode49.getEncodedSource();
        scriptNode49.setEncodedSourceEnd(18);
        scriptNode47.target = scriptNode49;
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode43, (com.google.javascript.rhino.head.Node) scriptNode49);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode55 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str56 = scriptNode55.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode58 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType61 = null;
        com.google.javascript.rhino.head.ast.Comment comment63 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType61, "Scope");
        scriptNode58.setParent((com.google.javascript.rhino.head.ast.AstNode) comment63);
        scriptNode58.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str67 = scriptNode58.getSourceName();
        com.google.javascript.rhino.head.Node node69 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode58, 26);
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node((int) (byte) -1, node54, (com.google.javascript.rhino.head.Node) scriptNode55, (com.google.javascript.rhino.head.Node) scriptNode58);
        node70.setLineno(5);
        scriptNode14.setCompilerData((java.lang.Object) node70);
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scope2, (com.google.javascript.rhino.head.Node) scriptNode3, node70);
        scriptNode3.setEncodedSource("                        {\n                        }\n");
        boolean boolean77 = scriptNode3.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node78 = scriptNode3.target;
        scriptNode3.flattenSymbolTable(false);
        // The following exception was thrown during execution in test generation
        try {
            scriptNode3.labelId(412649354);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "$0" + "'", str30, "$0");
        org.junit.Assert.assertNotNull(scriptNode43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNull(node78);
    }

    @Test
    public void test15570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15570");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = scriptNode1.getTop();
        scriptNode10.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int15 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str17 = scriptNode16.getEncodedSource();
        scriptNode16.setEncodedSourceEnd(18);
        scriptNode14.target = scriptNode16;
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode10, (com.google.javascript.rhino.head.Node) scriptNode16);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType26, "Scope");
        scriptNode23.setParent((com.google.javascript.rhino.head.ast.AstNode) comment28);
        scriptNode23.setEncodedSourceStart((int) (byte) 100);
        int int34 = scriptNode23.getIntProp(6, 2);
        int int35 = scriptNode23.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope37 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope39 = scope37.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node40 = scope37.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType44 = null;
        com.google.javascript.rhino.head.ast.Comment comment46 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType44, "Scope");
        scriptNode41.setParent((com.google.javascript.rhino.head.ast.AstNode) comment46);
        scope37.setJsDocNode(comment46);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType52 = null;
        com.google.javascript.rhino.head.ast.Comment comment54 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType52, "Scope");
        scriptNode49.setParent((com.google.javascript.rhino.head.ast.AstNode) comment54);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList56 = scriptNode49.getSymbols();
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode23, (com.google.javascript.rhino.head.Node) scope37, (com.google.javascript.rhino.head.Node) scriptNode49);
        scriptNode16.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode23);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int61 = scriptNode60.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope scope63 = scriptNode60.getDefiningScope("51\t    SCRIPT 52 1\n");
        java.lang.String str64 = scriptNode60.shortName();
        scriptNode23.setCompilerData((java.lang.Object) scriptNode60);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) 10);
        java.lang.String str69 = scriptNode67.toSource(26);
        int int70 = scriptNode67.getType();
        int int71 = scriptNode67.getType();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode60, (com.google.javascript.rhino.head.ast.Scope) scriptNode67);
        int int73 = scriptNode67.getRegexpCount();
        // The following exception was thrown during execution in test generation
        try {
            scriptNode67.setEndLineno((-42));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scriptNode10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(scope39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(symbolList56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(scope63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "ScriptNode" + "'", str64, "ScriptNode");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "                                                    {\n                                                    }\n" + "'", str69, "                                                    {\n                                                    }\n");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 136 + "'", int70 == 136);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 136 + "'", int71 == 136);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test15571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15571");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType6 = null;
        com.google.javascript.rhino.head.ast.Comment comment8 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType6, "Scope");
        scriptNode3.setParent((com.google.javascript.rhino.head.ast.AstNode) comment8);
        scriptNode3.setEncodedSourceStart((int) (byte) 100);
        int int14 = scriptNode3.getIntProp(6, 2);
        int int15 = scriptNode3.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope17 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope19 = scope17.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node20 = scope17.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType24 = null;
        com.google.javascript.rhino.head.ast.Comment comment26 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType24, "Scope");
        scriptNode21.setParent((com.google.javascript.rhino.head.ast.AstNode) comment26);
        scope17.setJsDocNode(comment26);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType32 = null;
        com.google.javascript.rhino.head.ast.Comment comment34 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType32, "Scope");
        scriptNode29.setParent((com.google.javascript.rhino.head.ast.AstNode) comment34);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList36 = scriptNode29.getSymbols();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode3, (com.google.javascript.rhino.head.Node) scope17, (com.google.javascript.rhino.head.Node) scriptNode29);
        scriptNode29.setPosition((int) (byte) 0);
        scriptNode29.setEncodedSourceStart((int) (byte) 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType45 = null;
        com.google.javascript.rhino.head.ast.Comment comment47 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType45, "Scope");
        scriptNode42.setParent((com.google.javascript.rhino.head.ast.AstNode) comment47);
        scriptNode42.setEncodedSourceStart((int) (byte) 100);
        int int53 = scriptNode42.getIntProp(6, 2);
        int int54 = scriptNode42.getParamCount();
        java.lang.String str55 = scriptNode42.debugPrint();
        int int58 = scriptNode42.getIntProp(17, 10);
        scriptNode29.setTop(scriptNode42);
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node(10, (com.google.javascript.rhino.head.Node) scriptNode29);
        scriptNode29.setEncodedSource("                                                                                                                                                                                                  {\n                                                                                                                                                                                                  }\n");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType66 = null;
        com.google.javascript.rhino.head.ast.Comment comment68 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType66, "Scope");
        scriptNode63.setParent((com.google.javascript.rhino.head.ast.AstNode) comment68);
        scriptNode63.setEncodedSourceStart((int) (byte) 100);
        int int72 = scriptNode63.getEncodedSourceStart();
        scriptNode63.setLineno(1);
        com.google.javascript.rhino.head.Node node76 = new com.google.javascript.rhino.head.Node(129, (com.google.javascript.rhino.head.Node) scriptNode29, (com.google.javascript.rhino.head.Node) scriptNode63, (int) '#');
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap77 = scriptNode63.getSymbolTable();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node78 = scriptNode63.getFinally();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(symbolList36);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str55, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
        org.junit.Assert.assertNull(strMap77);
    }

    @Test
    public void test15572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15572");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        int int12 = scriptNode1.getIntProp(6, 2);
        int int13 = scriptNode1.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope17 = scope15.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node18 = scope15.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType22 = null;
        com.google.javascript.rhino.head.ast.Comment comment24 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType22, "Scope");
        scriptNode19.setParent((com.google.javascript.rhino.head.ast.AstNode) comment24);
        scope15.setJsDocNode(comment24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType30 = null;
        com.google.javascript.rhino.head.ast.Comment comment32 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType30, "Scope");
        scriptNode27.setParent((com.google.javascript.rhino.head.ast.AstNode) comment32);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList34 = scriptNode27.getSymbols();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode1, (com.google.javascript.rhino.head.Node) scope15, (com.google.javascript.rhino.head.Node) scriptNode27);
        scriptNode27.setPosition((int) (byte) 0);
        com.google.javascript.rhino.head.Node node38 = scriptNode27.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType43 = null;
        com.google.javascript.rhino.head.ast.Comment comment45 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType43, "Scope");
        scriptNode40.setParent((com.google.javascript.rhino.head.ast.AstNode) comment45);
        scriptNode40.setEncodedSourceStart((int) (byte) 100);
        int int51 = scriptNode40.getIntProp(6, 2);
        int int52 = scriptNode40.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope54 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope56 = scope54.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node57 = scope54.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode58 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType61 = null;
        com.google.javascript.rhino.head.ast.Comment comment63 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType61, "Scope");
        scriptNode58.setParent((com.google.javascript.rhino.head.ast.AstNode) comment63);
        scope54.setJsDocNode(comment63);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType69 = null;
        com.google.javascript.rhino.head.ast.Comment comment71 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType69, "Scope");
        scriptNode66.setParent((com.google.javascript.rhino.head.ast.AstNode) comment71);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList73 = scriptNode66.getSymbols();
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode40, (com.google.javascript.rhino.head.Node) scope54, (com.google.javascript.rhino.head.Node) scriptNode66);
        java.lang.String str75 = scriptNode66.getEncodedSource();
        int int76 = scriptNode66.getAbsolutePosition();
        int int77 = scriptNode66.getLineno();
        java.lang.String str78 = scriptNode66.getEncodedSource();
        int int79 = scriptNode27.compareTo((com.google.javascript.rhino.head.ast.AstNode) scriptNode66);
        scriptNode27.setEncodedSourceEnd((-547629399));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(symbolList34);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(scope56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(symbolList73);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
    }

    @Test
    public void test15573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15573");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode(6);
        scriptNode2.setEndLineno(0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType9 = null;
        com.google.javascript.rhino.head.ast.Comment comment11 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType9, "Scope");
        scriptNode6.setParent((com.google.javascript.rhino.head.ast.AstNode) comment11);
        scriptNode6.setEncodedSourceStart((int) (byte) 100);
        int int15 = scriptNode6.getEncodedSourceStart();
        scriptNode6.flattenSymbolTable(true);
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node(11, (com.google.javascript.rhino.head.Node) scriptNode6);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList19 = scriptNode6.getSymbols();
        scriptNode2.setSymbols(symbolList19);
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node(1, (com.google.javascript.rhino.head.Node) scriptNode2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(symbolList19);
    }

    @Test
    public void test15574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15574");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType6 = null;
        com.google.javascript.rhino.head.ast.Comment comment8 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType6, "Scope");
        scriptNode3.setParent((com.google.javascript.rhino.head.ast.AstNode) comment8);
        scriptNode3.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = scriptNode3.getTop();
        scriptNode12.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int17 = scriptNode16.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str19 = scriptNode18.getEncodedSource();
        scriptNode18.setEncodedSourceEnd(18);
        scriptNode16.target = scriptNode18;
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode12, (com.google.javascript.rhino.head.Node) scriptNode18);
        java.lang.String str24 = node23.getJsDoc();
        com.google.javascript.rhino.head.ast.Scope scope26 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope28 = scope26.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node29 = scope26.getLastSibling();
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node(23, node23, (com.google.javascript.rhino.head.Node) scope26, (int) (byte) 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType35 = null;
        com.google.javascript.rhino.head.ast.Comment comment37 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType35, "Scope");
        scriptNode32.setParent((com.google.javascript.rhino.head.ast.AstNode) comment37);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList39 = scriptNode32.getSymbols();
        java.lang.String str40 = scriptNode32.debugPrint();
        scriptNode32.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Scope scope44 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope46 = scope44.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node47 = scope44.target;
        scope44.setPosition(2);
        scope44.putIntProp(17, 25);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap53 = null;
        scope44.setSymbolTable(strMap53);
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node(2, (com.google.javascript.rhino.head.Node) scope26, (com.google.javascript.rhino.head.Node) scriptNode32, (com.google.javascript.rhino.head.Node) scope44);
        int int56 = scriptNode32.getLineno();
        scriptNode32.setEncodedSourceStart(19);
        int int59 = scriptNode32.depth();
        scriptNode32.setEncodedSourceBounds(17, 6);
        java.lang.Object obj63 = scriptNode32.getCompilerData();
        com.google.javascript.rhino.head.ast.Scope scope65 = new com.google.javascript.rhino.head.ast.Scope(3);
        scriptNode32.setParentScope(scope65);
        scriptNode32.setEncodedSource("                                                ");
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(symbolList39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str40, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertNull(scope46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test15575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15575");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        int int9 = scriptNode0.getEncodedSourceStart();
        java.lang.String str10 = scriptNode0.getSourceName();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap11 = null;
        scriptNode0.setSymbolTable(strMap11);
        scriptNode0.setRelative(371991955);
        scriptNode0.setBaseLineno(69);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15576");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        int int2 = scriptNode0.getBaseLineno();
        java.lang.Object obj3 = scriptNode0.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType7 = null;
        com.google.javascript.rhino.head.ast.Comment comment9 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType7, "Scope");
        scriptNode4.setParent((com.google.javascript.rhino.head.ast.AstNode) comment9);
        java.lang.String str12 = scriptNode4.toSource(26);
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode4);
        com.google.javascript.rhino.head.Node node15 = scriptNode4.setType((int) (short) 10);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor16 = scriptNode4.iterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int22 = scriptNode19.getIntProp(23, (int) (short) 1);
        com.google.javascript.rhino.head.ast.Scope scope24 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope24.setPosition(100);
        com.google.javascript.rhino.head.Node node27 = scope24.getLastSibling();
        node27.removeChildren();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator29 = node27.spliterator();
        scriptNode19.setCompilerData((java.lang.Object) node27);
        java.lang.String str32 = scriptNode19.toSource(21);
        int int33 = scriptNode19.getEncodedSourceStart();
        boolean boolean34 = scriptNode19.hasChildren();
        int int35 = scriptNode19.getBaseLineno();
        scriptNode19.removeProp(1487440633);
        scriptNode4.putProp((int) (byte) -1, (java.lang.Object) scriptNode19);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                    {\n                                                    }\n" + "'", str12, "                                                    {\n                                                    }\n");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeItor16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeSpliterator29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "                                          {\n                                          }\n" + "'", str32, "                                          {\n                                          }\n");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test15577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15577");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node(917696443);
    }

    @Test
    public void test15578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15578");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope1.setPosition(100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType8 = null;
        com.google.javascript.rhino.head.ast.Comment comment10 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType8, "Scope");
        scriptNode5.setParent((com.google.javascript.rhino.head.ast.AstNode) comment10);
        scriptNode5.setEncodedSourceStart((int) (byte) 100);
        int int16 = scriptNode5.getIntProp(6, 2);
        int int17 = scriptNode5.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope21 = scope19.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node22 = scope19.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType26, "Scope");
        scriptNode23.setParent((com.google.javascript.rhino.head.ast.AstNode) comment28);
        scope19.setJsDocNode(comment28);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType34 = null;
        com.google.javascript.rhino.head.ast.Comment comment36 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType34, "Scope");
        scriptNode31.setParent((com.google.javascript.rhino.head.ast.AstNode) comment36);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList38 = scriptNode31.getSymbols();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode5, (com.google.javascript.rhino.head.Node) scope19, (com.google.javascript.rhino.head.Node) scriptNode31);
        scriptNode31.setPosition((int) (byte) 0);
        scope1.setTop(scriptNode31);
        int int43 = scriptNode31.getParamCount();
        boolean boolean44 = scriptNode31.hasConsistentReturnUsage();
        boolean boolean45 = scriptNode31.hasChildren();
        int int46 = scriptNode31.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = scriptNode31.getTop();
        java.lang.String str48 = scriptNode47.toSource();
        java.lang.String str50 = scriptNode47.toSource((int) (short) 1);
        scriptNode47.setLength((int) 'a');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(symbolList38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(scriptNode47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "{\n}\n" + "'", str48, "{\n}\n");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "  {\n  }\n" + "'", str50, "  {\n  }\n");
    }

    @Test
    public void test15579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15579");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        int int11 = scriptNode0.getIntProp(6, 2);
        int int12 = scriptNode0.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType16 = null;
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType16, "Scope");
        scriptNode13.setParent((com.google.javascript.rhino.head.ast.AstNode) comment18);
        scriptNode13.setEncodedSourceStart((int) (byte) 100);
        int int24 = scriptNode13.getIntProp(6, 2);
        int int25 = scriptNode13.getParamCount();
        scriptNode0.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode13);
        java.lang.String str27 = scriptNode0.debugPrint();
        java.lang.String str29 = scriptNode0.makeIndent(15);
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor30 = null;
        // The following exception was thrown during execution in test generation
        try {
            scriptNode0.visit(nodeVisitor30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1\t  SCRIPT -53 1\n-1\t  SCRIPT -53 1\n" + "'", str27, "-1\t  SCRIPT -53 1\n-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "                              " + "'", str29, "                              ");
    }

    @Test
    public void test15580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15580");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope1.setPosition(100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType8 = null;
        com.google.javascript.rhino.head.ast.Comment comment10 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType8, "Scope");
        scriptNode5.setParent((com.google.javascript.rhino.head.ast.AstNode) comment10);
        scriptNode5.setEncodedSourceStart((int) (byte) 100);
        int int16 = scriptNode5.getIntProp(6, 2);
        int int17 = scriptNode5.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope21 = scope19.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node22 = scope19.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType26, "Scope");
        scriptNode23.setParent((com.google.javascript.rhino.head.ast.AstNode) comment28);
        scope19.setJsDocNode(comment28);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType34 = null;
        com.google.javascript.rhino.head.ast.Comment comment36 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType34, "Scope");
        scriptNode31.setParent((com.google.javascript.rhino.head.ast.AstNode) comment36);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList38 = scriptNode31.getSymbols();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode5, (com.google.javascript.rhino.head.Node) scope19, (com.google.javascript.rhino.head.Node) scriptNode31);
        scriptNode31.setPosition((int) (byte) 0);
        scope1.setTop(scriptNode31);
        java.lang.String str44 = scriptNode31.makeIndent((int) (short) 100);
        int int45 = scriptNode31.getFunctionCount();
        com.google.javascript.rhino.head.Token.CommentType commentType49 = null;
        com.google.javascript.rhino.head.ast.Comment comment51 = new com.google.javascript.rhino.head.ast.Comment(9, 9, commentType49, "{\n}\n");
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node((int) (short) 1, (com.google.javascript.rhino.head.Node) comment51, (-53));
        com.google.javascript.rhino.head.Token.CommentType commentType54 = null;
        comment51.setCommentType(commentType54);
        com.google.javascript.rhino.head.Token.CommentType commentType56 = null;
        comment51.setCommentType(commentType56);
        scriptNode31.setJsDocNode(comment51);
        int int59 = scriptNode31.getBaseLineno();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(symbolList38);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "                                                                                                                                                                                                        " + "'", str44, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test15581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15581");
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope(100, 15);
        com.google.javascript.rhino.head.ast.Scope scope4 = scope3.getParentScope();
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(53, (com.google.javascript.rhino.head.Node) scope3, 6);
        com.google.javascript.rhino.head.Node node8 = node6.setType((int) (short) 10);
        node6.removeChildren();
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test15582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15582");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope4 = scope2.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node5 = scope2.target;
        scope2.setPosition(2);
        scope2.setLength((int) (byte) 1);
        java.lang.Object obj11 = scope2.getProp((int) 'a');
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node((int) (byte) 10, (com.google.javascript.rhino.head.Node) scope2);
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope16 = scope14.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node17 = scope14.target;
        scope14.setPosition(2);
        java.lang.String str20 = scope14.toSource();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap21 = scope14.getSymbolTable();
        boolean boolean22 = scope14.hasChildren();
        com.google.javascript.rhino.head.Node node23 = scope14.getNext();
        scope2.addChildrenToFront((com.google.javascript.rhino.head.Node) scope14);
        java.lang.String str25 = scope2.debugPrint();
        com.google.javascript.rhino.head.Token.CommentType commentType29 = null;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, (int) (short) 100, commentType29, "Scope");
        int int32 = comment31.getLength();
        com.google.javascript.rhino.head.Token.CommentType commentType33 = null;
        comment31.setCommentType(commentType33);
        com.google.javascript.rhino.head.Token.CommentType commentType35 = null;
        comment31.setCommentType(commentType35);
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node(102, (com.google.javascript.rhino.head.Node) comment31);
        scope2.addChildrenToFront((com.google.javascript.rhino.head.Node) comment31);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\n}\n" + "'", str20, "{\n}\n");
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2\tBLOCK 2 1\n2\tBLOCK 2 1\n" + "'", str25, "2\tBLOCK 2 1\n2\tBLOCK 2 1\n");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test15583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15583");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        java.lang.String str7 = scope1.toSource();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap8 = scope1.getSymbolTable();
        boolean boolean9 = scope1.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType13 = null;
        com.google.javascript.rhino.head.ast.Comment comment15 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType13, "Scope");
        scriptNode10.setParent((com.google.javascript.rhino.head.ast.AstNode) comment15);
        scriptNode10.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = scriptNode10.getTop();
        scope1.target = scriptNode10;
        com.google.javascript.rhino.head.Node node21 = scriptNode10.target;
        scriptNode10.setBaseLineno(10);
        scriptNode10.setEncodedSourceEnd((int) (short) -1);
        int int26 = scriptNode10.getParamCount();
        java.lang.String str27 = scriptNode10.getSourceName();
        java.lang.String str29 = scriptNode10.makeIndent(16);
        com.google.javascript.rhino.head.Node node30 = scriptNode10.getLastSibling();
        com.google.javascript.rhino.head.ast.Symbol symbol32 = scriptNode10.getSymbol("                        ");
        scriptNode10.removeChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType37 = null;
        com.google.javascript.rhino.head.ast.Comment comment39 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType37, "Scope");
        scriptNode34.setParent((com.google.javascript.rhino.head.ast.AstNode) comment39);
        scriptNode34.setEncodedSourceStart((int) (byte) 100);
        int int45 = scriptNode34.getIntProp(6, 2);
        int int46 = scriptNode34.getRegexpCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str49 = scriptNode47.toSource(18);
        java.lang.Object obj50 = scriptNode47.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType55 = null;
        com.google.javascript.rhino.head.ast.Comment comment57 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType55, "Scope");
        scriptNode52.setParent((com.google.javascript.rhino.head.ast.AstNode) comment57);
        scriptNode52.setEncodedSourceStart((int) (byte) 100);
        int int63 = scriptNode52.getIntProp(6, 2);
        int int64 = scriptNode52.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope66 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope68 = scope66.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node69 = scope66.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode70 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType73 = null;
        com.google.javascript.rhino.head.ast.Comment comment75 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType73, "Scope");
        scriptNode70.setParent((com.google.javascript.rhino.head.ast.AstNode) comment75);
        scope66.setJsDocNode(comment75);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode78 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType81 = null;
        com.google.javascript.rhino.head.ast.Comment comment83 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType81, "Scope");
        scriptNode78.setParent((com.google.javascript.rhino.head.ast.AstNode) comment83);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList85 = scriptNode78.getSymbols();
        com.google.javascript.rhino.head.Node node86 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode52, (com.google.javascript.rhino.head.Node) scope66, (com.google.javascript.rhino.head.Node) scriptNode78);
        scriptNode78.setPosition((int) (byte) 0);
        com.google.javascript.rhino.head.Node node89 = scriptNode78.target;
        scriptNode47.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode78);
        int int91 = scriptNode78.getLineno();
        scriptNode34.setCompilerData((java.lang.Object) scriptNode78);
        scriptNode10.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode78);
        java.lang.String str95 = scriptNode10.makeIndent(97);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\n}\n" + "'", str7, "{\n}\n");
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(scriptNode19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "                                " + "'", str29, "                                ");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(symbol32);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "                                    {\n                                    }\n" + "'", str49, "                                    {\n                                    }\n");
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNull(scope68);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNotNull(symbolList85);
        org.junit.Assert.assertNull(node89);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "                                                                                                                                                                                                  " + "'", str95, "                                                                                                                                                                                                  ");
    }

    @Test
    public void test15584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15584");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((-53));
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList2 = scriptNode1.getStatements();
        org.junit.Assert.assertNotNull(astNodeList2);
    }

    @Test
    public void test15585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15585");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        int int12 = scriptNode1.getIntProp(6, 2);
        int int13 = scriptNode1.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope17 = scope15.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node18 = scope15.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType22 = null;
        com.google.javascript.rhino.head.ast.Comment comment24 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType22, "Scope");
        scriptNode19.setParent((com.google.javascript.rhino.head.ast.AstNode) comment24);
        scope15.setJsDocNode(comment24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType30 = null;
        com.google.javascript.rhino.head.ast.Comment comment32 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType30, "Scope");
        scriptNode27.setParent((com.google.javascript.rhino.head.ast.AstNode) comment32);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList34 = scriptNode27.getSymbols();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode1, (com.google.javascript.rhino.head.Node) scope15, (com.google.javascript.rhino.head.Node) scriptNode27);
        scriptNode27.setPosition((int) (byte) 0);
        scriptNode27.setEncodedSourceStart((int) (byte) 1);
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray40 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList41 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList41, symbolArray40);
        scriptNode27.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList41);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList44 = scriptNode27.getFunctions();
        com.google.javascript.rhino.head.ast.Scope scope46 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope48 = scope46.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node49 = scope46.target;
        scope46.setPosition(2);
        java.lang.String str52 = scope46.toSource();
        com.google.javascript.rhino.head.Node node53 = scope46.getLastChild();
        int int54 = scope46.depth();
        scriptNode27.setParentScope(scope46);
        com.google.javascript.rhino.head.ast.Scope scope57 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope59 = scope57.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node60 = scope57.target;
        scope57.setPosition(2);
        java.lang.String str63 = scope57.toSource();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap64 = scope57.getSymbolTable();
        boolean boolean65 = scope57.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType69 = null;
        com.google.javascript.rhino.head.ast.Comment comment71 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType69, "Scope");
        scriptNode66.setParent((com.google.javascript.rhino.head.ast.AstNode) comment71);
        scriptNode66.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode75 = scriptNode66.getTop();
        scope57.target = scriptNode66;
        com.google.javascript.rhino.head.Node node77 = scriptNode66.target;
        scriptNode66.setBaseLineno(10);
        scriptNode66.setEncodedSourceEnd((int) (short) -1);
        scope46.setTop(scriptNode66);
        com.google.javascript.rhino.head.ast.Scope scope84 = scriptNode66.getDefiningScope("            ");
        scriptNode66.flattenSymbolTable(true);
        com.google.javascript.rhino.head.Node node87 = scriptNode66.getFirstChild();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(symbolList34);
        org.junit.Assert.assertNotNull(symbolArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(functionNodeList44);
        org.junit.Assert.assertNull(scope48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "{\n}\n" + "'", str52, "{\n}\n");
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(scope59);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "{\n}\n" + "'", str63, "{\n}\n");
        org.junit.Assert.assertNull(strMap64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(scriptNode75);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNull(scope84);
        org.junit.Assert.assertNull(node87);
    }

    @Test
    public void test15586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15586");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) scriptNode1);
        com.google.javascript.rhino.head.ast.Scope scope4 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope6 = scope4.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node7 = scope4.target;
        scope4.setPosition(2);
        java.lang.String str10 = scope4.toSource();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap11 = scope4.getSymbolTable();
        boolean boolean12 = scope4.hasChildren();
        com.google.javascript.rhino.head.Node node13 = scope4.getNext();
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope17 = scope15.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node18 = scope15.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType22 = null;
        com.google.javascript.rhino.head.ast.Comment comment24 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType22, "Scope");
        scriptNode19.setParent((com.google.javascript.rhino.head.ast.AstNode) comment24);
        scope15.setJsDocNode(comment24);
        java.lang.String str28 = comment24.toSource((int) (short) 10);
        scope4.setJsDocNode(comment24);
        scriptNode1.replaceWith(scope4);
        com.google.javascript.rhino.head.Node node32 = scope4.setType((int) (short) 1);
        com.google.javascript.rhino.head.ast.Symbol symbol34 = scope4.getSymbol("");
        int int35 = scope4.getLength();
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{\n}\n" + "'", str10, "{\n}\n");
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "                    Scope" + "'", str28, "                    Scope");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(symbol34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test15587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15587");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int5 = scriptNode2.getIntProp(23, (int) (short) 1);
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope7.setPosition(100);
        com.google.javascript.rhino.head.Node node10 = scope7.getLastSibling();
        node10.removeChildren();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator12 = node10.spliterator();
        scriptNode2.setCompilerData((java.lang.Object) node10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType19 = null;
        com.google.javascript.rhino.head.ast.Comment comment21 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType19, "Scope");
        scriptNode16.setParent((com.google.javascript.rhino.head.ast.AstNode) comment21);
        scriptNode16.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = scriptNode16.getTop();
        scriptNode25.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int30 = scriptNode29.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str32 = scriptNode31.getEncodedSource();
        scriptNode31.setEncodedSourceEnd(18);
        scriptNode29.target = scriptNode31;
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode25, (com.google.javascript.rhino.head.Node) scriptNode31);
        com.google.javascript.rhino.head.Token.CommentType commentType39 = null;
        com.google.javascript.rhino.head.ast.Comment comment41 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType39, "Scope");
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(21, (com.google.javascript.rhino.head.Node) scriptNode25, (com.google.javascript.rhino.head.Node) comment41);
        java.lang.String str43 = scriptNode2.toStringTree(scriptNode25);
        int int44 = scriptNode25.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType48 = null;
        com.google.javascript.rhino.head.ast.Comment comment50 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType48, "Scope");
        scriptNode45.setParent((com.google.javascript.rhino.head.ast.AstNode) comment50);
        scriptNode45.setEncodedSourceStart((int) (byte) 100);
        int int56 = scriptNode45.getIntProp(6, 2);
        scriptNode45.setEndLineno(18);
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode25, (com.google.javascript.rhino.head.Node) scriptNode45);
        com.google.javascript.rhino.head.Node node60 = scriptNode25.target;
        int int61 = scriptNode25.getFunctionCount();
        com.google.javascript.rhino.head.Token.CommentType commentType64 = null;
        com.google.javascript.rhino.head.ast.Comment comment66 = new com.google.javascript.rhino.head.ast.Comment((-1), 6, commentType64, "hi!");
        scriptNode25.setJsDocNode(comment66);
        com.google.javascript.rhino.head.Token.CommentType commentType68 = comment66.getCommentType();
        java.lang.String str70 = comment66.toSource(20);
        int int71 = comment66.depth();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode72 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType75 = null;
        com.google.javascript.rhino.head.ast.Comment comment77 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType75, "Scope");
        scriptNode72.setParent((com.google.javascript.rhino.head.ast.AstNode) comment77);
        scriptNode72.setEncodedSourceStart((int) (byte) 100);
        int int83 = scriptNode72.getIntProp(6, 2);
        int int84 = scriptNode72.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode85 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str86 = scriptNode85.getEncodedSource();
        int int87 = scriptNode85.getBaseLineno();
        java.lang.String str88 = scriptNode85.getNextTempName();
        scriptNode72.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode85);
        int int90 = scriptNode85.getType();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList91 = scriptNode85.getStatements();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor92 = scriptNode85.iterator();
        comment66.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode85);
        scriptNode85.setEncodedSourceBounds(595467506, 226035720);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeSpliterator12);
        org.junit.Assert.assertNotNull(scriptNode25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(commentType68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "                                        hi!" + "'", str70, "                                        hi!");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 2 + "'", int83 == 2);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "$0" + "'", str88, "$0");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 136 + "'", int90 == 136);
        org.junit.Assert.assertNotNull(astNodeList91);
        org.junit.Assert.assertNotNull(nodeItor92);
    }

    @Test
    public void test15588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15588");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        int int2 = scriptNode0.getBaseLineno();
        java.lang.Object obj3 = scriptNode0.getCompilerData();
        scriptNode0.setEncodedSourceBounds((int) '4', 0);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList7 = scriptNode0.getStatements();
        java.lang.Object obj8 = scriptNode0.getCompilerData();
        int int9 = scriptNode0.getEncodedSourceStart();
        int int10 = scriptNode0.getLength();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList11 = scriptNode0.getFunctions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(astNodeList7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(functionNodeList11);
    }

    @Test
    public void test15589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15589");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType7 = null;
        com.google.javascript.rhino.head.ast.Comment comment9 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType7, "Scope");
        scriptNode4.setParent((com.google.javascript.rhino.head.ast.AstNode) comment9);
        scriptNode4.setEncodedSourceStart((int) (byte) 100);
        int int15 = scriptNode4.getIntProp(6, 2);
        int int16 = scriptNode4.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope20 = scope18.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node21 = scope18.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType25 = null;
        com.google.javascript.rhino.head.ast.Comment comment27 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType25, "Scope");
        scriptNode22.setParent((com.google.javascript.rhino.head.ast.AstNode) comment27);
        scope18.setJsDocNode(comment27);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType33 = null;
        com.google.javascript.rhino.head.ast.Comment comment35 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType33, "Scope");
        scriptNode30.setParent((com.google.javascript.rhino.head.ast.AstNode) comment35);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList37 = scriptNode30.getSymbols();
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode4, (com.google.javascript.rhino.head.Node) scope18, (com.google.javascript.rhino.head.Node) scriptNode30);
        scriptNode30.setPosition((int) (byte) 0);
        scriptNode30.setEncodedSourceStart((int) (byte) 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType46 = null;
        com.google.javascript.rhino.head.ast.Comment comment48 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType46, "Scope");
        scriptNode43.setParent((com.google.javascript.rhino.head.ast.AstNode) comment48);
        scriptNode43.setEncodedSourceStart((int) (byte) 100);
        int int54 = scriptNode43.getIntProp(6, 2);
        int int55 = scriptNode43.getParamCount();
        java.lang.String str56 = scriptNode43.debugPrint();
        int int59 = scriptNode43.getIntProp(17, 10);
        scriptNode30.setTop(scriptNode43);
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node(10, (com.google.javascript.rhino.head.Node) scriptNode30);
        scriptNode30.setEncodedSource("                                                                                                                                                                                                  {\n                                                                                                                                                                                                  }\n");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode64 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType67 = null;
        com.google.javascript.rhino.head.ast.Comment comment69 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType67, "Scope");
        scriptNode64.setParent((com.google.javascript.rhino.head.ast.AstNode) comment69);
        scriptNode64.clearParentScope();
        scriptNode64.setEncodedSourceBounds(9, (int) (short) -1);
        int int75 = scriptNode64.getBaseLineno();
        com.google.javascript.rhino.head.Node node78 = com.google.javascript.rhino.head.Node.newString(25, "-1\t  SCRIPT -53 1\n");
        com.google.javascript.rhino.head.Node node79 = node78.getLastSibling();
        com.google.javascript.rhino.head.Node node81 = new com.google.javascript.rhino.head.Node(5, (com.google.javascript.rhino.head.Node) scriptNode30, (com.google.javascript.rhino.head.Node) scriptNode64, node79, 129);
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node(97, (com.google.javascript.rhino.head.Node) scriptNode64, (-53));
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator84 = node83.new NodeIterator();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(symbolList37);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str56, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node79);
    }

    @Test
    public void test15590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15590");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType5 = null;
        com.google.javascript.rhino.head.ast.Comment comment7 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType5, "Scope");
        scriptNode2.setParent((com.google.javascript.rhino.head.ast.AstNode) comment7);
        scriptNode2.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = scriptNode2.getTop();
        scriptNode11.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int16 = scriptNode15.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str18 = scriptNode17.getEncodedSource();
        scriptNode17.setEncodedSourceEnd(18);
        scriptNode15.target = scriptNode17;
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode11, (com.google.javascript.rhino.head.Node) scriptNode17);
        scriptNode17.setEncodedSourceEnd(11);
        java.lang.String str25 = scriptNode17.getEncodedSource();
        scriptNode17.setEncodedSource("52\tCOMMENT 52 6\n");
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(6, (com.google.javascript.rhino.head.Node) scriptNode17);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator29 = node28.spliterator();
        com.google.javascript.rhino.head.Token.CommentType commentType32 = null;
        com.google.javascript.rhino.head.ast.Comment comment34 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType32, "Scope");
        java.lang.String str36 = comment34.toSource(19);
        node28.setJsDocNode(comment34);
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor38 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment34.visit(nodeVisitor38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scriptNode11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(nodeSpliterator29);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "                                      Scope" + "'", str36, "                                      Scope");
    }

    @Test
    public void test15591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15591");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        int int11 = scriptNode0.getIntProp(6, 2);
        boolean boolean12 = scriptNode0.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType16 = null;
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType16, "Scope");
        scriptNode13.setParent((com.google.javascript.rhino.head.ast.AstNode) comment18);
        scriptNode13.clearParentScope();
        com.google.javascript.rhino.head.ast.Scope scope22 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope24 = scope22.getDefiningScope("Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType30 = null;
        com.google.javascript.rhino.head.ast.Comment comment32 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType30, "Scope");
        scriptNode27.setParent((com.google.javascript.rhino.head.ast.AstNode) comment32);
        scriptNode27.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = scriptNode27.getTop();
        scriptNode36.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int41 = scriptNode40.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str43 = scriptNode42.getEncodedSource();
        scriptNode42.setEncodedSourceEnd(18);
        scriptNode40.target = scriptNode42;
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode36, (com.google.javascript.rhino.head.Node) scriptNode42);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str49 = scriptNode48.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType54 = null;
        com.google.javascript.rhino.head.ast.Comment comment56 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType54, "Scope");
        scriptNode51.setParent((com.google.javascript.rhino.head.ast.AstNode) comment56);
        scriptNode51.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str60 = scriptNode51.getSourceName();
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode51, 26);
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) (byte) -1, node47, (com.google.javascript.rhino.head.Node) scriptNode48, (com.google.javascript.rhino.head.Node) scriptNode51);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode64 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType67 = null;
        com.google.javascript.rhino.head.ast.Comment comment69 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType67, "Scope");
        scriptNode64.setParent((com.google.javascript.rhino.head.ast.AstNode) comment69);
        scriptNode64.setEncodedSourceStart((int) (byte) 100);
        int int75 = scriptNode64.getIntProp(6, 2);
        scriptNode64.setEndLineno(18);
        scriptNode51.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode64);
        scriptNode13.addChildAfter((com.google.javascript.rhino.head.Node) scope22, (com.google.javascript.rhino.head.Node) scriptNode51);
        int int80 = scriptNode51.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode0, (com.google.javascript.rhino.head.ast.Scope) scriptNode51);
        scriptNode51.setEndLineno(5);
        int int84 = scriptNode51.getAbsolutePosition();
        java.lang.Class<?> wildcardClass85 = scriptNode51.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(scope24);
        org.junit.Assert.assertNotNull(scriptNode36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2 + "'", int75 == 2);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 100 + "'", int80 == 100);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test15592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15592");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope1.setPosition(100);
        com.google.javascript.rhino.head.Node node4 = scope1.getLastSibling();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = scope1.getEnclosingFunction();
        com.google.javascript.rhino.head.Node node7 = scope1.setType(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType11 = null;
        com.google.javascript.rhino.head.ast.Comment comment13 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType11, "Scope");
        scriptNode8.setParent((com.google.javascript.rhino.head.ast.AstNode) comment13);
        scriptNode8.clearParentScope();
        java.lang.String str16 = scriptNode8.toString();
        scope1.target = scriptNode8;
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator18 = scriptNode8.spliterator();
        com.google.javascript.rhino.head.ast.AstNode astNode19 = scriptNode8.getParent();
        scriptNode8.clearParentScope();
        int int21 = scriptNode8.getEncodedSourceStart();
        int int24 = scriptNode8.getIntProp(0, 5);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType28 = null;
        com.google.javascript.rhino.head.ast.Comment comment30 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType28, "Scope");
        scriptNode25.setParent((com.google.javascript.rhino.head.ast.AstNode) comment30);
        scriptNode25.setEncodedSourceStart((int) (byte) 100);
        int int36 = scriptNode25.getIntProp(6, 2);
        scriptNode25.setEndLineno(18);
        int int39 = scriptNode25.getParamCount();
        com.google.javascript.rhino.head.ast.Scope scope40 = scriptNode25.getParentScope();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator41 = scriptNode25.new NodeIterator();
        int int42 = scriptNode25.getPosition();
        scriptNode25.setSourceName("23");
        // The following exception was thrown during execution in test generation
        try {
            scriptNode8.setLoop((com.google.javascript.rhino.head.ast.Jump) scriptNode25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(functionNode5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "136" + "'", str16, "136");
        org.junit.Assert.assertNotNull(nodeSpliterator18);
        org.junit.Assert.assertNotNull(astNode19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(scope40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-53) + "'", int42 == (-53));
    }

    @Test
    public void test15593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15593");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int4 = scriptNode1.getIntProp(23, (int) (short) 1);
        com.google.javascript.rhino.head.ast.Scope scope5 = scriptNode1.getParentScope();
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope9 = scope7.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node10 = scope7.target;
        scope7.setPosition(2);
        java.lang.String str13 = scope7.toSource();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap14 = scope7.getSymbolTable();
        boolean boolean15 = scope7.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType19 = null;
        com.google.javascript.rhino.head.ast.Comment comment21 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType19, "Scope");
        scriptNode16.setParent((com.google.javascript.rhino.head.ast.AstNode) comment21);
        scriptNode16.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = scriptNode16.getTop();
        scope7.target = scriptNode16;
        com.google.javascript.rhino.head.Node node27 = scriptNode16.target;
        int int28 = scriptNode16.getAbsolutePosition();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType32 = null;
        com.google.javascript.rhino.head.ast.Comment comment34 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType32, "Scope");
        scriptNode29.setParent((com.google.javascript.rhino.head.ast.AstNode) comment34);
        scriptNode29.setEncodedSourceStart((int) (byte) 100);
        int int40 = scriptNode29.getIntProp(6, 2);
        int int41 = scriptNode29.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str43 = scriptNode42.getEncodedSource();
        int int44 = scriptNode42.getBaseLineno();
        java.lang.String str45 = scriptNode42.getNextTempName();
        scriptNode29.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode42);
        java.lang.String str47 = scriptNode42.debugPrint();
        com.google.javascript.rhino.head.ast.Scope scope51 = new com.google.javascript.rhino.head.ast.Scope(22, (int) 'a');
        java.lang.String str53 = scope51.toSource(12);
        scope51.setRelative(1);
        scriptNode42.putProp(17, (java.lang.Object) 1);
        scriptNode16.target = scriptNode42;
        int int58 = scriptNode16.getEncodedSourceEnd();
        java.lang.Object obj59 = scriptNode16.getCompilerData();
        int int60 = scriptNode16.getEndLineno();
        scriptNode1.setTop(scriptNode16);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode62 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str64 = scriptNode62.toSource(18);
        int int65 = scriptNode62.getEndLineno();
        int int66 = scriptNode62.getRegexpCount();
        scriptNode62.setEncodedSource("Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode70 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType73 = null;
        com.google.javascript.rhino.head.ast.Comment comment75 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType73, "Scope");
        scriptNode70.setParent((com.google.javascript.rhino.head.ast.AstNode) comment75);
        scriptNode70.setEncodedSourceStart((int) (byte) 100);
        int int81 = scriptNode70.getIntProp(6, 2);
        int int82 = scriptNode70.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode83 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str84 = scriptNode83.getEncodedSource();
        int int85 = scriptNode83.getBaseLineno();
        java.lang.String str86 = scriptNode83.getNextTempName();
        scriptNode70.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode83);
        int int88 = scriptNode83.getType();
        int int89 = scriptNode83.getParamCount();
        com.google.javascript.rhino.head.Node node91 = scriptNode83.setType((int) '#');
        com.google.javascript.rhino.head.Node node93 = new com.google.javascript.rhino.head.Node((-51), (com.google.javascript.rhino.head.Node) scriptNode83, 52);
        scriptNode62.addChildToBack(node93);
        java.lang.String str95 = scriptNode1.toStringTree(scriptNode62);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{\n}\n" + "'", str13, "{\n}\n");
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(scriptNode25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "$0" + "'", str45, "$0");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "51\t    SCRIPT 52 1\n" + "'", str47, "51\t    SCRIPT 52 1\n");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "                        {\n                        }\n" + "'", str53, "                        {\n                        }\n");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "                                    {\n                                    }\n" + "'", str64, "                                    {\n                                    }\n");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 2 + "'", int81 == 2);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "$0" + "'", str86, "$0");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 136 + "'", int88 == 136);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test15594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15594");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = scriptNode1.getTop();
        scriptNode10.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int15 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str17 = scriptNode16.getEncodedSource();
        scriptNode16.setEncodedSourceEnd(18);
        scriptNode14.target = scriptNode16;
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode10, (com.google.javascript.rhino.head.Node) scriptNode16);
        scriptNode16.setEncodedSourceEnd(11);
        java.lang.String str24 = scriptNode16.getEncodedSource();
        scriptNode16.setEncodedSource("52\tCOMMENT 52 6\n");
        int int27 = scriptNode16.getLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol29 = scriptNode16.getSymbol("-1\t  SCRIPT -53 1\n");
        int int30 = scriptNode16.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str32 = scriptNode31.getEncodedSource();
        com.google.javascript.rhino.head.Node node33 = scriptNode31.getLastSibling();
        scriptNode31.setEncodedSourceEnd(136);
        boolean boolean36 = scriptNode31.hasConsistentReturnUsage();
        int int37 = scriptNode31.getType();
        com.google.javascript.rhino.head.Token.CommentType commentType40 = null;
        com.google.javascript.rhino.head.ast.Comment comment42 = new com.google.javascript.rhino.head.ast.Comment(0, 1487440633, commentType40, "52\tCOMMENT 52 6\n");
        scriptNode31.setJsDocNode(comment42);
        scriptNode16.setJsDocNode(comment42);
        scriptNode16.setBounds((int) (short) 1, (-2));
        int int48 = scriptNode16.getLineno();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList49 = scriptNode16.getStatements();
        java.lang.String str50 = scriptNode16.getEncodedSource();
        org.junit.Assert.assertNotNull(scriptNode10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(symbol29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 136 + "'", int37 == 136);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(astNodeList49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "52\tCOMMENT 52 6\n" + "'", str50, "52\tCOMMENT 52 6\n");
    }

    @Test
    public void test15595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15595");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode0.toSource(18);
        java.lang.Object obj3 = scriptNode0.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType8 = null;
        com.google.javascript.rhino.head.ast.Comment comment10 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType8, "Scope");
        scriptNode5.setParent((com.google.javascript.rhino.head.ast.AstNode) comment10);
        scriptNode5.setEncodedSourceStart((int) (byte) 100);
        int int16 = scriptNode5.getIntProp(6, 2);
        int int17 = scriptNode5.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope21 = scope19.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node22 = scope19.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType26, "Scope");
        scriptNode23.setParent((com.google.javascript.rhino.head.ast.AstNode) comment28);
        scope19.setJsDocNode(comment28);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType34 = null;
        com.google.javascript.rhino.head.ast.Comment comment36 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType34, "Scope");
        scriptNode31.setParent((com.google.javascript.rhino.head.ast.AstNode) comment36);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList38 = scriptNode31.getSymbols();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode5, (com.google.javascript.rhino.head.Node) scope19, (com.google.javascript.rhino.head.Node) scriptNode31);
        scriptNode31.setPosition((int) (byte) 0);
        com.google.javascript.rhino.head.Node node42 = scriptNode31.target;
        scriptNode0.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode31);
        java.lang.String str44 = scriptNode0.getSourceName();
        java.lang.String str45 = scriptNode0.getNextTempName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = scriptNode0.getRegexpFlags((-51099649));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    {\n                                    }\n" + "'", str2, "                                    {\n                                    }\n");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(symbolList38);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "$0" + "'", str45, "$0");
    }

    @Test
    public void test15596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15596");
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope((int) (short) -1, 100);
        com.google.javascript.rhino.head.ast.Symbol symbol5 = scope3.getSymbol("$0");
        int int6 = scope3.getType();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType10 = null;
        com.google.javascript.rhino.head.ast.Comment comment12 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType10, "Scope");
        scriptNode7.setParent((com.google.javascript.rhino.head.ast.AstNode) comment12);
        scriptNode7.setEncodedSourceStart((int) (byte) 100);
        int int18 = scriptNode7.getIntProp(6, 2);
        int int19 = scriptNode7.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getEncodedSource();
        int int22 = scriptNode20.getBaseLineno();
        java.lang.String str23 = scriptNode20.getNextTempName();
        scriptNode7.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode20);
        java.lang.String str25 = scriptNode20.debugPrint();
        scope3.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode20);
        scriptNode20.setEncodedSourceBounds(9, 2);
        java.lang.String str30 = scriptNode20.toString();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator31 = scriptNode20.spliterator();
        int int32 = scriptNode20.getBaseLineno();
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(2018070520, (com.google.javascript.rhino.head.Node) scriptNode20, 21);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.Scope scope35 = scriptNode20.getScope();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.ScriptNode cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(symbol5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 129 + "'", int6 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "$0" + "'", str23, "$0");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "51\t    SCRIPT 52 1\n" + "'", str25, "51\t    SCRIPT 52 1\n");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "136" + "'", str30, "136");
        org.junit.Assert.assertNotNull(nodeSpliterator31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test15597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15597");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(6);
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope3.setPosition(100);
        com.google.javascript.rhino.head.Node node6 = scope3.getLastSibling();
        node6.removeChildren();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator8 = node6.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType13 = null;
        com.google.javascript.rhino.head.ast.Comment comment15 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType13, "Scope");
        scriptNode10.setParent((com.google.javascript.rhino.head.ast.AstNode) comment15);
        scriptNode10.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = scriptNode10.getTop();
        scriptNode19.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int24 = scriptNode23.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str26 = scriptNode25.getEncodedSource();
        scriptNode25.setEncodedSourceEnd(18);
        scriptNode23.target = scriptNode25;
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode19, (com.google.javascript.rhino.head.Node) scriptNode25);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList31 = null;
        scriptNode25.setSymbols(symbolList31);
        node6.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode25);
        java.lang.String str34 = scriptNode1.toStringTree(scriptNode25);
        com.google.javascript.rhino.head.ast.Scope scope37 = new com.google.javascript.rhino.head.ast.Scope((int) (short) -1, 100);
        int int38 = scope37.getLength();
        com.google.javascript.rhino.head.ast.Scope scope41 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope43 = scope41.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node44 = scope41.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType48 = null;
        com.google.javascript.rhino.head.ast.Comment comment50 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType48, "Scope");
        scriptNode45.setParent((com.google.javascript.rhino.head.ast.AstNode) comment50);
        scope41.setJsDocNode(comment50);
        java.lang.String str54 = comment50.toSource((int) (short) 10);
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) comment50);
        java.lang.Object obj57 = comment50.getProp((int) (short) -1);
        java.lang.String str59 = comment50.makeIndent((int) (short) -1);
        scope37.setJsDocNode(comment50);
        scriptNode25.addChild((com.google.javascript.rhino.head.ast.AstNode) scope37);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode62 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int63 = scriptNode25.addFunction(functionNode62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeSpliterator8);
        org.junit.Assert.assertNotNull(scriptNode19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNull(scope43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "                    Scope" + "'", str54, "                    Scope");
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test15598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15598");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType6 = null;
        com.google.javascript.rhino.head.ast.Comment comment8 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType6, "Scope");
        scriptNode3.setParent((com.google.javascript.rhino.head.ast.AstNode) comment8);
        scriptNode3.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = scriptNode3.getTop();
        scriptNode12.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int17 = scriptNode16.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str19 = scriptNode18.getEncodedSource();
        scriptNode18.setEncodedSourceEnd(18);
        scriptNode16.target = scriptNode18;
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode12, (com.google.javascript.rhino.head.Node) scriptNode18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str25 = scriptNode24.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType30 = null;
        com.google.javascript.rhino.head.ast.Comment comment32 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType30, "Scope");
        scriptNode27.setParent((com.google.javascript.rhino.head.ast.AstNode) comment32);
        scriptNode27.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str36 = scriptNode27.getSourceName();
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode27, 26);
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node((int) (byte) -1, node23, (com.google.javascript.rhino.head.Node) scriptNode24, (com.google.javascript.rhino.head.Node) scriptNode27);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap40 = null;
        scriptNode27.setSymbolTable(strMap40);
        java.lang.Object obj43 = scriptNode27.getProp((int) (short) 0);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList44 = scriptNode27.getChildScopes();
        int int45 = scriptNode27.getFunctionCount();
        com.google.javascript.rhino.head.ast.Scope scope48 = new com.google.javascript.rhino.head.ast.Scope((int) (byte) 100, 4);
        int int49 = scope48.depth();
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode27, (com.google.javascript.rhino.head.Node) scope48, 8);
        scriptNode27.flattenSymbolTable(true);
        int int54 = scriptNode27.getPosition();
        scriptNode27.flattenSymbolTable(true);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap57 = scriptNode27.getSymbolTable();
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(scopeList44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-53) + "'", int54 == (-53));
        org.junit.Assert.assertNull(strMap57);
    }

    @Test
    public void test15599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15599");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(6);
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope3.setPosition(100);
        com.google.javascript.rhino.head.Node node6 = scope3.getLastSibling();
        node6.removeChildren();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator8 = node6.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType13 = null;
        com.google.javascript.rhino.head.ast.Comment comment15 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType13, "Scope");
        scriptNode10.setParent((com.google.javascript.rhino.head.ast.AstNode) comment15);
        scriptNode10.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = scriptNode10.getTop();
        scriptNode19.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int24 = scriptNode23.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str26 = scriptNode25.getEncodedSource();
        scriptNode25.setEncodedSourceEnd(18);
        scriptNode23.target = scriptNode25;
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode19, (com.google.javascript.rhino.head.Node) scriptNode25);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList31 = null;
        scriptNode25.setSymbols(symbolList31);
        node6.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode25);
        java.lang.String str34 = scriptNode1.toStringTree(scriptNode25);
        com.google.javascript.rhino.head.ast.Scope scope37 = new com.google.javascript.rhino.head.ast.Scope((int) (short) -1, 100);
        int int38 = scope37.getLength();
        com.google.javascript.rhino.head.ast.Scope scope41 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope43 = scope41.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node44 = scope41.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType48 = null;
        com.google.javascript.rhino.head.ast.Comment comment50 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType48, "Scope");
        scriptNode45.setParent((com.google.javascript.rhino.head.ast.AstNode) comment50);
        scope41.setJsDocNode(comment50);
        java.lang.String str54 = comment50.toSource((int) (short) 10);
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) comment50);
        java.lang.Object obj57 = comment50.getProp((int) (short) -1);
        java.lang.String str59 = comment50.makeIndent((int) (short) -1);
        scope37.setJsDocNode(comment50);
        scriptNode25.addChild((com.google.javascript.rhino.head.ast.AstNode) scope37);
        int int62 = scriptNode25.getEncodedSourceStart();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeSpliterator8);
        org.junit.Assert.assertNotNull(scriptNode19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNull(scope43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "                    Scope" + "'", str54, "                    Scope");
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
    }

    @Test
    public void test15600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15600");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        int int11 = scriptNode0.getIntProp(6, 2);
        scriptNode0.setEndLineno(18);
        int int14 = scriptNode0.getParamCount();
        com.google.javascript.rhino.head.ast.Scope scope15 = scriptNode0.getParentScope();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator16 = scriptNode0.new NodeIterator();
        int int17 = scriptNode0.getPosition();
        scriptNode0.setSourceName("23");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = scriptNode0.getRegexpFlags(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-53) + "'", int17 == (-53));
    }

    @Test
    public void test15601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15601");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((-1209607347), (-899539259));
        com.google.javascript.rhino.head.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scope2.setFinally(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15602");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        scriptNode0.setEncodedSourceEnd(18);
        java.lang.String str5 = scriptNode0.makeIndent((int) '#');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType9 = null;
        com.google.javascript.rhino.head.ast.Comment comment11 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType9, "Scope");
        scriptNode6.setParent((com.google.javascript.rhino.head.ast.AstNode) comment11);
        scriptNode6.setEncodedSourceStart((int) (byte) 100);
        scriptNode0.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode6);
        int int16 = scriptNode0.getRegexpCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType21 = null;
        com.google.javascript.rhino.head.ast.Comment comment23 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType21, "Scope");
        scriptNode18.setParent((com.google.javascript.rhino.head.ast.AstNode) comment23);
        scriptNode18.setEncodedSourceStart((int) (byte) 100);
        int int29 = scriptNode18.getIntProp(6, 2);
        int int30 = scriptNode18.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope32 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope34 = scope32.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node35 = scope32.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType39 = null;
        com.google.javascript.rhino.head.ast.Comment comment41 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType39, "Scope");
        scriptNode36.setParent((com.google.javascript.rhino.head.ast.AstNode) comment41);
        scope32.setJsDocNode(comment41);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType47 = null;
        com.google.javascript.rhino.head.ast.Comment comment49 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType47, "Scope");
        scriptNode44.setParent((com.google.javascript.rhino.head.ast.AstNode) comment49);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList51 = scriptNode44.getSymbols();
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode18, (com.google.javascript.rhino.head.Node) scope32, (com.google.javascript.rhino.head.Node) scriptNode44);
        scriptNode44.setPosition((int) (byte) 0);
        scriptNode44.setEncodedSourceStart((int) (byte) 1);
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray57 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList58 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList58, symbolArray57);
        scriptNode44.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList58);
        scriptNode0.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList58);
        java.lang.String str62 = scriptNode0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray63 = scriptNode0.getParamAndVarNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                      " + "'", str5, "                                                                      ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(symbolList51);
        org.junit.Assert.assertNotNull(symbolArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "136" + "'", str62, "136");
    }

    @Test
    public void test15603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15603");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = scriptNode1.getTop();
        scriptNode10.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int15 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str17 = scriptNode16.getEncodedSource();
        scriptNode16.setEncodedSourceEnd(18);
        scriptNode14.target = scriptNode16;
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode10, (com.google.javascript.rhino.head.Node) scriptNode16);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType26, "Scope");
        scriptNode23.setParent((com.google.javascript.rhino.head.ast.AstNode) comment28);
        scriptNode23.setEncodedSourceStart((int) (byte) 100);
        int int34 = scriptNode23.getIntProp(6, 2);
        int int35 = scriptNode23.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope37 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope39 = scope37.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node40 = scope37.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType44 = null;
        com.google.javascript.rhino.head.ast.Comment comment46 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType44, "Scope");
        scriptNode41.setParent((com.google.javascript.rhino.head.ast.AstNode) comment46);
        scope37.setJsDocNode(comment46);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType52 = null;
        com.google.javascript.rhino.head.ast.Comment comment54 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType52, "Scope");
        scriptNode49.setParent((com.google.javascript.rhino.head.ast.AstNode) comment54);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList56 = scriptNode49.getSymbols();
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode23, (com.google.javascript.rhino.head.Node) scope37, (com.google.javascript.rhino.head.Node) scriptNode49);
        scriptNode16.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode23);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType62 = null;
        com.google.javascript.rhino.head.ast.Comment comment64 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType62, "Scope");
        scriptNode59.setParent((com.google.javascript.rhino.head.ast.AstNode) comment64);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList66 = scriptNode59.getSymbols();
        scriptNode23.setSymbols(symbolList66);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList68 = scriptNode23.getSymbols();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList69 = scriptNode23.getFunctions();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList70 = scriptNode23.getChildScopes();
        java.lang.Object obj72 = scriptNode23.getProp((int) (byte) -1);
        java.lang.Object obj73 = scriptNode23.getCompilerData();
        scriptNode23.setEncodedSourceBounds(2, 2);
        scriptNode23.removeChildren();
        scriptNode23.setEndLineno((int) ' ');
        scriptNode23.setEncodedSource("                                      Scope");
        scriptNode23.setPosition(401277611);
        org.junit.Assert.assertNotNull(scriptNode10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(scope39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(symbolList56);
        org.junit.Assert.assertNotNull(symbolList66);
        org.junit.Assert.assertNotNull(symbolList68);
        org.junit.Assert.assertNotNull(functionNodeList69);
        org.junit.Assert.assertNull(scopeList70);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test15604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15604");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString("                                                                      ");
        com.google.javascript.rhino.head.ast.Scope scope4 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope6 = scope4.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node7 = scope4.target;
        scope4.setPosition(2);
        int int10 = scope4.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope11 = scope4.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator12 = scope4.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope16 = scope14.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node17 = scope14.target;
        scope14.setPosition(2);
        int int20 = scope14.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope21 = scope14.getEnclosingScope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator22 = scope14.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str24 = scriptNode23.getEncodedSource();
        int int25 = scriptNode23.getBaseLineno();
        java.lang.Object obj26 = scriptNode23.getCompilerData();
        scriptNode23.flattenSymbolTable(false);
        scope4.addChildAfter((com.google.javascript.rhino.head.Node) scope14, (com.google.javascript.rhino.head.Node) scriptNode23);
        int int30 = scriptNode23.getLength();
        scriptNode23.setEncodedSourceEnd((int) (byte) 0);
        int int33 = scriptNode23.getLineno();
        scriptNode23.setEncodedSourceBounds((-51), 20);
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node(129, node2, (com.google.javascript.rhino.head.Node) scriptNode23);
        com.google.javascript.rhino.head.Node node38 = scriptNode23.target;
        java.lang.String str39 = scriptNode23.getEncodedSource();
        scriptNode23.setEncodedSourceBounds(22, 2018070520);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNotNull(nodeSpliterator12);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNotNull(nodeSpliterator22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test15605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15605");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        int int11 = scriptNode0.getIntProp(6, 2);
        int int12 = scriptNode0.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str14 = scriptNode13.getEncodedSource();
        int int15 = scriptNode13.getBaseLineno();
        java.lang.String str16 = scriptNode13.getNextTempName();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode13);
        int int18 = scriptNode13.getType();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList19 = scriptNode13.getChildScopes();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType23 = null;
        com.google.javascript.rhino.head.ast.Comment comment25 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType23, "Scope");
        scriptNode20.setParent((com.google.javascript.rhino.head.ast.AstNode) comment25);
        scriptNode20.setEncodedSourceStart((int) (byte) 100);
        int int31 = scriptNode20.getIntProp(6, 2);
        int int32 = scriptNode20.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str34 = scriptNode33.getEncodedSource();
        int int35 = scriptNode33.getBaseLineno();
        java.lang.String str36 = scriptNode33.getNextTempName();
        scriptNode20.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode33);
        java.lang.String str38 = scriptNode33.toSource();
        scriptNode13.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode33);
        scriptNode13.setLineno((int) (byte) 1);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator42 = scriptNode13.new NodeIterator();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node43 = nodeIterator42.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$0" + "'", str16, "$0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 136 + "'", int18 == 136);
        org.junit.Assert.assertNull(scopeList19);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "$0" + "'", str36, "$0");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{\n}\n" + "'", str38, "{\n}\n");
    }

    @Test
    public void test15606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15606");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((-1));
        java.lang.Object obj2 = scriptNode1.getCompilerData();
        scriptNode1.setLineno(53);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str6 = scriptNode5.getEncodedSource();
        int int7 = scriptNode5.getBaseLineno();
        java.lang.Object obj8 = scriptNode5.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType12 = null;
        com.google.javascript.rhino.head.ast.Comment comment14 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType12, "Scope");
        scriptNode9.setParent((com.google.javascript.rhino.head.ast.AstNode) comment14);
        java.lang.String str17 = scriptNode9.toSource(26);
        scriptNode5.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        com.google.javascript.rhino.head.Node node20 = scriptNode9.setType((int) (short) 10);
        java.lang.String str21 = scriptNode9.getNextTempName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType25 = null;
        com.google.javascript.rhino.head.ast.Comment comment27 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType25, "Scope");
        scriptNode22.setParent((com.google.javascript.rhino.head.ast.AstNode) comment27);
        scriptNode22.setEncodedSourceStart((int) (byte) 100);
        int int33 = scriptNode22.getIntProp(6, 2);
        int int34 = scriptNode22.getRegexpCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str37 = scriptNode35.toSource(18);
        java.lang.Object obj38 = scriptNode35.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType43 = null;
        com.google.javascript.rhino.head.ast.Comment comment45 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType43, "Scope");
        scriptNode40.setParent((com.google.javascript.rhino.head.ast.AstNode) comment45);
        scriptNode40.setEncodedSourceStart((int) (byte) 100);
        int int51 = scriptNode40.getIntProp(6, 2);
        int int52 = scriptNode40.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope54 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope56 = scope54.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node57 = scope54.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode58 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType61 = null;
        com.google.javascript.rhino.head.ast.Comment comment63 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType61, "Scope");
        scriptNode58.setParent((com.google.javascript.rhino.head.ast.AstNode) comment63);
        scope54.setJsDocNode(comment63);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType69 = null;
        com.google.javascript.rhino.head.ast.Comment comment71 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType69, "Scope");
        scriptNode66.setParent((com.google.javascript.rhino.head.ast.AstNode) comment71);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList73 = scriptNode66.getSymbols();
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode40, (com.google.javascript.rhino.head.Node) scope54, (com.google.javascript.rhino.head.Node) scriptNode66);
        scriptNode66.setPosition((int) (byte) 0);
        com.google.javascript.rhino.head.Node node77 = scriptNode66.target;
        scriptNode35.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode66);
        int int79 = scriptNode66.getLineno();
        scriptNode22.setCompilerData((java.lang.Object) scriptNode66);
        scriptNode22.setRelative((int) (byte) 0);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap83 = scriptNode22.getSymbolTable();
        scriptNode9.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode22);
        java.lang.String str85 = scriptNode1.toStringTree(scriptNode9);
        // The following exception was thrown during execution in test generation
        try {
            scriptNode9.setString("              ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.ScriptNode cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                    {\n                                                    }\n" + "'", str17, "                                                    {\n                                                    }\n");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "$0" + "'", str21, "$0");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "                                    {\n                                    }\n" + "'", str37, "                                    {\n                                    }\n");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(scope56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(symbolList73);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNull(strMap83);
        org.junit.Assert.assertNull(str85);
    }

    @Test
    public void test15607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15607");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        scriptNode0.setEndLineno(5);
        com.google.javascript.rhino.head.ast.Symbol symbol12 = scriptNode0.getSymbol("                    Scope");
        scriptNode0.setEncodedSourceEnd(581273883);
        org.junit.Assert.assertNull(symbol12);
    }

    @Test
    public void test15608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15608");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType6 = null;
        com.google.javascript.rhino.head.ast.Comment comment8 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType6, "Scope");
        scriptNode3.setParent((com.google.javascript.rhino.head.ast.AstNode) comment8);
        scriptNode3.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = scriptNode3.getTop();
        scriptNode12.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int17 = scriptNode16.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str19 = scriptNode18.getEncodedSource();
        scriptNode18.setEncodedSourceEnd(18);
        scriptNode16.target = scriptNode18;
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode12, (com.google.javascript.rhino.head.Node) scriptNode18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str25 = scriptNode24.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType30 = null;
        com.google.javascript.rhino.head.ast.Comment comment32 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType30, "Scope");
        scriptNode27.setParent((com.google.javascript.rhino.head.ast.AstNode) comment32);
        scriptNode27.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str36 = scriptNode27.getSourceName();
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode27, 26);
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node((int) (byte) -1, node23, (com.google.javascript.rhino.head.Node) scriptNode24, (com.google.javascript.rhino.head.Node) scriptNode27);
        com.google.javascript.rhino.head.Node node40 = scriptNode27.getLastSibling();
        boolean boolean41 = scriptNode27.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType46 = null;
        com.google.javascript.rhino.head.ast.Comment comment48 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType46, "Scope");
        scriptNode43.setParent((com.google.javascript.rhino.head.ast.AstNode) comment48);
        scriptNode43.setEncodedSourceStart((int) (byte) 100);
        int int54 = scriptNode43.getIntProp(6, 2);
        scriptNode27.putProp((int) (byte) 0, (java.lang.Object) int54);
        com.google.javascript.rhino.head.ast.AstNode astNode56 = scriptNode27.getParent();
        com.google.javascript.rhino.head.ast.Scope scope57 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode27.setParent((com.google.javascript.rhino.head.ast.AstNode) scope57);
        boolean boolean59 = scriptNode27.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node((int) (byte) -1, (com.google.javascript.rhino.head.Node) scriptNode27);
        int int61 = scriptNode27.getEndLineno();
        java.lang.String str62 = scriptNode27.debugPrint();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = scriptNode27.getTop();
        scriptNode63.setBounds((-769830162), 7);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(astNode56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "-1\t  SCRIPT 0 1\n" + "'", str62, "-1\t  SCRIPT 0 1\n");
        org.junit.Assert.assertNotNull(scriptNode63);
    }

    @Test
    public void test15609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15609");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        com.google.javascript.rhino.head.ast.Comment comment2 = scriptNode1.getJsDocNode();
        scriptNode1.flattenSymbolTable(true);
        int int5 = scriptNode1.getLength();
        scriptNode1.setEncodedSourceEnd(23);
        int int8 = scriptNode1.getPosition();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = scriptNode1.getEnclosingFunction();
        org.junit.Assert.assertNull(comment2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertNull(functionNode9);
    }

    @Test
    public void test15610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15610");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList7 = scriptNode0.getSymbols();
        java.lang.String str8 = scriptNode0.debugPrint();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str10 = scriptNode9.getEncodedSource();
        com.google.javascript.rhino.head.Node node11 = scriptNode9.getLastSibling();
        scriptNode9.setEncodedSource("Scope");
        scriptNode9.setEndLineno(100);
        scriptNode0.setCompilerData((java.lang.Object) 100);
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope18.putProp(25, (java.lang.Object) 100L);
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) scope18);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap23 = scriptNode0.getSymbolTable();
        scriptNode0.setEncodedSource("-1\tSCRIPT -1 1\n");
        com.google.javascript.rhino.head.ast.AstNode astNode26 = scriptNode0.getParent();
        scriptNode0.setEncodedSourceStart(24);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap29 = scriptNode0.getSymbolTable();
        scriptNode0.setRelative(1320165685);
        org.junit.Assert.assertNotNull(symbolList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str8, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(strMap23);
        org.junit.Assert.assertNotNull(astNode26);
        org.junit.Assert.assertNull(strMap29);
    }

    @Test
    public void test15611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15611");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        int int11 = scriptNode0.getIntProp(6, 2);
        int int12 = scriptNode0.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str14 = scriptNode13.getEncodedSource();
        int int15 = scriptNode13.getBaseLineno();
        java.lang.String str16 = scriptNode13.getNextTempName();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode13);
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10, (int) (byte) -1);
        int int21 = scope20.depth();
        scriptNode0.replaceWith(scope20);
        com.google.javascript.rhino.head.ast.Symbol symbol24 = scriptNode0.getSymbol("                                      Scope");
        int int25 = scriptNode0.getLineno();
        int int26 = scriptNode0.getLength();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Scope scope29 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope31 = scope29.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node32 = scope29.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = null;
        scope29.setTop(scriptNode33);
        scriptNode27.target = scope29;
        int int36 = scriptNode27.getEncodedSourceStart();
        int int37 = scriptNode0.compareTo((com.google.javascript.rhino.head.ast.AstNode) scriptNode27);
        scriptNode0.putIntProp((int) (byte) 1, 24);
        int int41 = scriptNode0.getParamCount();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator42 = scriptNode0.new NodeIterator();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$0" + "'", str16, "$0");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(symbol24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 53 + "'", int26 == 53);
        org.junit.Assert.assertNull(scope31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test15612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15612");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType5 = null;
        com.google.javascript.rhino.head.ast.Comment comment7 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType5, "Scope");
        scriptNode2.setParent((com.google.javascript.rhino.head.ast.AstNode) comment7);
        scriptNode2.setEncodedSourceStart((int) (byte) 100);
        int int13 = scriptNode2.getIntProp(6, 2);
        int int14 = scriptNode2.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope16 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope18 = scope16.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node19 = scope16.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType23 = null;
        com.google.javascript.rhino.head.ast.Comment comment25 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType23, "Scope");
        scriptNode20.setParent((com.google.javascript.rhino.head.ast.AstNode) comment25);
        scope16.setJsDocNode(comment25);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType31 = null;
        com.google.javascript.rhino.head.ast.Comment comment33 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType31, "Scope");
        scriptNode28.setParent((com.google.javascript.rhino.head.ast.AstNode) comment33);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList35 = scriptNode28.getSymbols();
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode2, (com.google.javascript.rhino.head.Node) scope16, (com.google.javascript.rhino.head.Node) scriptNode28);
        scriptNode28.setPosition((int) (byte) 0);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList39 = scriptNode28.getFunctions();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode40 = scriptNode28.getEnclosingFunction();
        com.google.javascript.rhino.head.ast.AstNode astNode41 = scriptNode28.getParent();
        com.google.javascript.rhino.head.Token.CommentType commentType45 = null;
        com.google.javascript.rhino.head.ast.Comment comment47 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType45, "Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str49 = scriptNode48.getEncodedSource();
        scriptNode48.setEncodedSourceEnd(18);
        java.lang.String str52 = comment47.toStringTree(scriptNode48);
        com.google.javascript.rhino.head.Node node54 = com.google.javascript.rhino.head.Node.newString("{\n}\n");
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode48, node54);
        int int56 = scriptNode48.getRegexpCount();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator57 = scriptNode48.spliterator();
        int int58 = scriptNode48.getBaseLineno();
        int int59 = scriptNode48.depth();
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node(2018070520, (com.google.javascript.rhino.head.Node) scriptNode28, (com.google.javascript.rhino.head.Node) scriptNode48, 0);
        int int62 = scriptNode48.getBaseLineno();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.Scope scope63 = scriptNode48.getScope();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.ScriptNode cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(symbolList35);
        org.junit.Assert.assertNotNull(functionNodeList39);
        org.junit.Assert.assertNull(functionNode40);
        org.junit.Assert.assertNotNull(astNode41);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(nodeSpliterator57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
    }

    @Test
    public void test15613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15613");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType8 = null;
        com.google.javascript.rhino.head.ast.Comment comment10 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType8, "Scope");
        scriptNode5.setParent((com.google.javascript.rhino.head.ast.AstNode) comment10);
        scope1.setJsDocNode(comment10);
        comment10.setPosition((-1));
        comment10.setBounds(20, 5);
        com.google.javascript.rhino.head.Token.CommentType commentType18 = comment10.getCommentType();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(commentType18);
    }

    @Test
    public void test15614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15614");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope1.setPosition(100);
        com.google.javascript.rhino.head.Node node4 = scope1.getLastSibling();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = scope1.getEnclosingFunction();
        com.google.javascript.rhino.head.Node node7 = scope1.setType(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType11 = null;
        com.google.javascript.rhino.head.ast.Comment comment13 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType11, "Scope");
        scriptNode8.setParent((com.google.javascript.rhino.head.ast.AstNode) comment13);
        scriptNode8.clearParentScope();
        java.lang.String str16 = scriptNode8.toString();
        scope1.target = scriptNode8;
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope21 = scope19.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node22 = scope19.target;
        scope19.setPosition(2);
        java.lang.String str25 = scope19.toSource();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap26 = scope19.getSymbolTable();
        boolean boolean27 = scope19.hasChildren();
        com.google.javascript.rhino.head.Node node28 = scope19.getNext();
        com.google.javascript.rhino.head.ast.Scope scope30 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope32 = scope30.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node33 = scope30.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType37 = null;
        com.google.javascript.rhino.head.ast.Comment comment39 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType37, "Scope");
        scriptNode34.setParent((com.google.javascript.rhino.head.ast.AstNode) comment39);
        scope30.setJsDocNode(comment39);
        java.lang.String str43 = comment39.toSource((int) (short) 10);
        scope19.setJsDocNode(comment39);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator45 = comment39.spliterator();
        java.lang.String str46 = comment39.getValue();
        boolean boolean47 = comment39.hasChildren();
        int int48 = scope1.compareTo((com.google.javascript.rhino.head.ast.AstNode) comment39);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator49 = comment39.spliterator();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(functionNode5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "136" + "'", str16, "136");
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{\n}\n" + "'", str25, "{\n}\n");
        org.junit.Assert.assertNull(strMap26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(scope32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "                    Scope" + "'", str43, "                    Scope");
        org.junit.Assert.assertNotNull(nodeSpliterator45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Scope" + "'", str46, "Scope");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(nodeSpliterator49);
    }

    @Test
    public void test15615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15615");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) -1, 100);
        com.google.javascript.rhino.head.ast.Symbol symbol4 = scope2.getSymbol("$0");
        boolean boolean5 = scope2.hasSideEffects();
        boolean boolean6 = scope2.hasChildren();
        int int9 = scope2.getIntProp((int) (byte) 100, 0);
        org.junit.Assert.assertNull(symbol4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test15616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15616");
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str8 = scriptNode7.getEncodedSource();
        scriptNode7.setEncodedSourceEnd(18);
        java.lang.String str11 = comment6.toStringTree(scriptNode7);
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newString("{\n}\n");
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode7, node13);
        scriptNode7.setEncodedSourceStart(25);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType20 = null;
        com.google.javascript.rhino.head.ast.Comment comment22 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType20, "Scope");
        scriptNode17.setParent((com.google.javascript.rhino.head.ast.AstNode) comment22);
        scriptNode17.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str26 = scriptNode17.getSourceName();
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope28.putProp(25, (java.lang.Object) 100L);
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node(9, (com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scriptNode17, (com.google.javascript.rhino.head.Node) scope28, (int) (byte) 10);
        int int34 = scriptNode17.getEncodedSourceEnd();
        scriptNode17.setEncodedSourceStart(1404628457);
        // The following exception was thrown during execution in test generation
        try {
            scriptNode17.labelId((-864528307));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test15617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15617");
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str7 = scriptNode6.getEncodedSource();
        scriptNode6.setEncodedSourceEnd(18);
        java.lang.String str10 = comment5.toStringTree(scriptNode6);
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("{\n}\n");
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode6, node12);
        int int14 = scriptNode6.getRegexpCount();
        scriptNode6.setBaseLineno((int) '#');
        java.lang.String str17 = scriptNode6.toString();
        boolean boolean18 = scriptNode6.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode19.toSource(18);
        scriptNode6.setTop(scriptNode19);
        scriptNode6.removeChildren();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "136" + "'", str17, "136");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                    {\n                                    }\n" + "'", str21, "                                    {\n                                    }\n");
    }

    @Test
    public void test15618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15618");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope4 = scope2.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node5 = scope2.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType9 = null;
        com.google.javascript.rhino.head.ast.Comment comment11 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType9, "Scope");
        scriptNode6.setParent((com.google.javascript.rhino.head.ast.AstNode) comment11);
        scope2.setJsDocNode(comment11);
        com.google.javascript.rhino.head.Node node14 = scope2.target;
        java.lang.String str15 = scope2.debugPrint();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType19 = null;
        com.google.javascript.rhino.head.ast.Comment comment21 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType19, "Scope");
        scriptNode16.setParent((com.google.javascript.rhino.head.ast.AstNode) comment21);
        scriptNode16.setEncodedSourceStart((int) (byte) 100);
        int int27 = scriptNode16.getIntProp(6, 2);
        int int28 = scriptNode16.getRegexpCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType32 = null;
        com.google.javascript.rhino.head.ast.Comment comment34 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType32, "Scope");
        scriptNode29.setParent((com.google.javascript.rhino.head.ast.AstNode) comment34);
        scriptNode29.setEncodedSourceStart((int) (byte) 100);
        int int40 = scriptNode29.getIntProp(6, 2);
        int int41 = scriptNode29.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str43 = scriptNode42.getEncodedSource();
        int int44 = scriptNode42.getBaseLineno();
        java.lang.String str45 = scriptNode42.getNextTempName();
        scriptNode29.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode42);
        int int47 = scriptNode42.getType();
        java.lang.String str48 = scriptNode42.debugPrint();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList49 = scriptNode42.getSymbols();
        java.lang.String str50 = scriptNode16.toStringTree(scriptNode42);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList51 = scriptNode16.getStatements();
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node(371991955);
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node(754207379, (com.google.javascript.rhino.head.Node) scope2, (com.google.javascript.rhino.head.Node) scriptNode16, node53, (-243114478));
        scriptNode16.flattenSymbolTable(false);
        int int58 = scriptNode16.getBaseLineno();
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0\tBLOCK 0 1\n" + "'", str15, "0\tBLOCK 0 1\n");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "$0" + "'", str45, "$0");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 136 + "'", int47 == 136);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "51\t    SCRIPT 52 1\n" + "'", str48, "51\t    SCRIPT 52 1\n");
        org.junit.Assert.assertNotNull(symbolList49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(astNodeList51);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test15619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15619");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        int int12 = scriptNode1.getIntProp(6, 2);
        com.google.javascript.rhino.head.ast.AstNode astNode13 = scriptNode1.getParent();
        scriptNode1.setEncodedSource("/");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode((-1));
        java.lang.Object obj18 = scriptNode17.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        scriptNode17.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode20);
        scriptNode1.target = scriptNode17;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType26, "Scope");
        scriptNode23.setParent((com.google.javascript.rhino.head.ast.AstNode) comment28);
        scriptNode23.clearParentScope();
        scriptNode23.setEncodedSourceBounds(9, (int) (short) -1);
        com.google.javascript.rhino.head.Node node34 = scriptNode23.target;
        scriptNode23.clearParentScope();
        scriptNode23.setEncodedSourceEnd(6);
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node((int) '#', (com.google.javascript.rhino.head.Node) scriptNode1, (com.google.javascript.rhino.head.Node) scriptNode23, 0);
        com.google.javascript.rhino.head.Token.CommentType commentType43 = null;
        com.google.javascript.rhino.head.ast.Comment comment45 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType43, "Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str47 = scriptNode46.getEncodedSource();
        scriptNode46.setEncodedSourceEnd(18);
        java.lang.String str50 = comment45.toStringTree(scriptNode46);
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newString("{\n}\n");
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode46, node52);
        int int54 = scriptNode46.getRegexpCount();
        java.lang.String str55 = scriptNode46.getEncodedSource();
        scriptNode23.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode46);
        int int57 = scriptNode23.getEncodedSourceEnd();
        scriptNode23.setEncodedSourceEnd((-927222420));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode61 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int64 = scriptNode61.getIntProp(23, (int) (short) 1);
        com.google.javascript.rhino.head.ast.Scope scope66 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope66.setPosition(100);
        com.google.javascript.rhino.head.Node node69 = scope66.getLastSibling();
        node69.removeChildren();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator71 = node69.spliterator();
        scriptNode61.setCompilerData((java.lang.Object) node69);
        java.lang.String str73 = scriptNode61.getSourceName();
        int int74 = scriptNode61.getEncodedSourceStart();
        scriptNode61.setEncodedSourceStart((int) (byte) 0);
        com.google.javascript.rhino.head.Node node77 = scriptNode61.getNext();
        scriptNode23.setTop(scriptNode61);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(astNode13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 6 + "'", int57 == 6);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(nodeSpliterator71);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNull(node77);
    }

    @Test
    public void test15620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15620");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        scope1.putIntProp(17, 25);
        scope1.setLength((int) ' ');
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap12 = null;
        scope1.setSymbolTable(strMap12);
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope17 = scope15.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node18 = scope15.target;
        scope15.setPosition(2);
        java.lang.String str21 = scope15.toSource();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap22 = scope15.getSymbolTable();
        boolean boolean23 = scope15.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType27 = null;
        com.google.javascript.rhino.head.ast.Comment comment29 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType27, "Scope");
        scriptNode24.setParent((com.google.javascript.rhino.head.ast.AstNode) comment29);
        scriptNode24.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = scriptNode24.getTop();
        scope15.target = scriptNode24;
        com.google.javascript.rhino.head.Node node35 = scriptNode24.target;
        int int36 = scriptNode24.getPosition();
        scriptNode24.removeChildren();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList38 = scriptNode24.getStatements();
        scope1.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode24);
        scope1.setLineno((-9));
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator42 = scope1.new NodeIterator();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{\n}\n" + "'", str21, "{\n}\n");
        org.junit.Assert.assertNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(scriptNode33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-53) + "'", int36 == (-53));
        org.junit.Assert.assertNotNull(astNodeList38);
    }

    @Test
    public void test15621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15621");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        int int12 = scriptNode1.getIntProp(6, 2);
        int int13 = scriptNode1.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType17 = null;
        com.google.javascript.rhino.head.ast.Comment comment19 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType17, "Scope");
        scriptNode14.setParent((com.google.javascript.rhino.head.ast.AstNode) comment19);
        scriptNode14.setEncodedSourceStart((int) (byte) 100);
        int int25 = scriptNode14.getIntProp(6, 2);
        int int26 = scriptNode14.getParamCount();
        scriptNode1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode14);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList28 = scriptNode1.getFunctions();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap29 = scriptNode1.getSymbolTable();
        scriptNode1.putIntProp(0, 21);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int35 = scriptNode34.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope scope37 = scriptNode34.getDefiningScope("51\t    SCRIPT 52 1\n");
        java.lang.String str38 = scriptNode34.shortName();
        com.google.javascript.rhino.head.ast.Scope scope40 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope42 = scope40.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node43 = scope40.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType47 = null;
        com.google.javascript.rhino.head.ast.Comment comment49 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType47, "Scope");
        scriptNode44.setParent((com.google.javascript.rhino.head.ast.AstNode) comment49);
        scope40.setJsDocNode(comment49);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor52 = scope40.iterator();
        boolean boolean53 = scope40.hasSideEffects();
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node(53, (com.google.javascript.rhino.head.Node) scriptNode1, (com.google.javascript.rhino.head.Node) scriptNode34, (com.google.javascript.rhino.head.Node) scope40, 8);
        com.google.javascript.rhino.head.ast.Symbol symbol57 = scope40.getSymbol("                                      Scope");
        com.google.javascript.rhino.head.Node node58 = scope40.getFirstChild();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode59 = scope40.getEnclosingFunction();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str61 = scriptNode60.getEncodedSource();
        scriptNode60.setEncodedSourceEnd(18);
        java.lang.String str65 = scriptNode60.makeIndent((int) '#');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int68 = scriptNode67.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode69 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str70 = scriptNode69.getEncodedSource();
        scriptNode69.setEncodedSourceEnd(18);
        scriptNode67.target = scriptNode69;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode75 = new com.google.javascript.rhino.head.ast.ScriptNode((-1));
        scriptNode75.setLineno((int) (byte) 1);
        scriptNode67.setCompilerData((java.lang.Object) (byte) 1);
        scriptNode60.setCompilerData((java.lang.Object) (byte) 1);
        java.lang.Object obj80 = scriptNode60.getCompilerData();
        scope40.setParentScope((com.google.javascript.rhino.head.ast.Scope) scriptNode60);
        int int82 = scope40.depth();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(functionNodeList28);
        org.junit.Assert.assertNull(strMap29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(scope37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ScriptNode" + "'", str38, "ScriptNode");
        org.junit.Assert.assertNull(scope42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(nodeItor52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(symbol57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(functionNode59);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "                                                                      " + "'", str65, "                                                                      ");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + (byte) 1 + "'", obj80, (byte) 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
    }

    @Test
    public void test15622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15622");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType5 = null;
        com.google.javascript.rhino.head.ast.Comment comment7 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType5, "Scope");
        scriptNode2.setParent((com.google.javascript.rhino.head.ast.AstNode) comment7);
        scriptNode2.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = scriptNode2.getTop();
        scriptNode11.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int16 = scriptNode15.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str18 = scriptNode17.getEncodedSource();
        scriptNode17.setEncodedSourceEnd(18);
        scriptNode15.target = scriptNode17;
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode11, (com.google.javascript.rhino.head.Node) scriptNode17);
        com.google.javascript.rhino.head.Token.CommentType commentType25 = null;
        com.google.javascript.rhino.head.ast.Comment comment27 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType25, "Scope");
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(21, (com.google.javascript.rhino.head.Node) scriptNode11, (com.google.javascript.rhino.head.Node) comment27);
        boolean boolean29 = comment27.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType30 = null;
        comment27.setCommentType(commentType30);
        java.lang.String str33 = comment27.toSource(3);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str38 = scriptNode36.toSource(18);
        scriptNode36.flattenSymbolTable(false);
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(3, (com.google.javascript.rhino.head.Node) scriptNode36, 19);
        comment27.putProp(14, (java.lang.Object) node42);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator44 = node42.new NodeIterator();
        boolean boolean45 = nodeIterator44.hasNext();
        com.google.javascript.rhino.head.Node node46 = nodeIterator44.next();
        org.junit.Assert.assertNotNull(scriptNode11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "      Scope" + "'", str33, "      Scope");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "                                    {\n                                    }\n" + "'", str38, "                                    {\n                                    }\n");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(node46);
    }

    @Test
    public void test15623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15623");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType5 = null;
        com.google.javascript.rhino.head.ast.Comment comment7 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType5, "Scope");
        scriptNode2.setParent((com.google.javascript.rhino.head.ast.AstNode) comment7);
        scriptNode2.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = scriptNode2.getTop();
        scriptNode11.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int16 = scriptNode15.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str18 = scriptNode17.getEncodedSource();
        scriptNode17.setEncodedSourceEnd(18);
        scriptNode15.target = scriptNode17;
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode11, (com.google.javascript.rhino.head.Node) scriptNode17);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str24 = scriptNode23.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType29 = null;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType29, "Scope");
        scriptNode26.setParent((com.google.javascript.rhino.head.ast.AstNode) comment31);
        scriptNode26.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str35 = scriptNode26.getSourceName();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode26, 26);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node((int) (byte) -1, node22, (com.google.javascript.rhino.head.Node) scriptNode23, (com.google.javascript.rhino.head.Node) scriptNode26);
        com.google.javascript.rhino.head.Node node39 = scriptNode26.getLastSibling();
        java.lang.String str40 = scriptNode26.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) scriptNode42);
        scriptNode42.setEndLineno(20);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode26, (com.google.javascript.rhino.head.ast.Scope) scriptNode42);
        scriptNode26.setBounds(7, 24);
        com.google.javascript.rhino.head.ast.Scope scope51 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope53 = scope51.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node54 = scope51.target;
        scope51.setPosition(2);
        scope51.setLength((int) (byte) 1);
        com.google.javascript.rhino.head.ast.Scope scope60 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope62 = scope60.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node63 = scope60.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode64 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType67 = null;
        com.google.javascript.rhino.head.ast.Comment comment69 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType67, "Scope");
        scriptNode64.setParent((com.google.javascript.rhino.head.ast.AstNode) comment69);
        scope60.setJsDocNode(comment69);
        java.lang.String str73 = comment69.toSource((int) (short) 10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot74 = comment69.getAstRoot();
        scope51.setParent((com.google.javascript.rhino.head.ast.AstNode) comment69);
        scriptNode26.addChild((com.google.javascript.rhino.head.ast.AstNode) comment69);
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor77 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment69.visit(nodeVisitor77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scriptNode11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(scope53);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(scope62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "                    Scope" + "'", str73, "                    Scope");
        org.junit.Assert.assertNull(astRoot74);
    }

    @Test
    public void test15624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15624");
        com.google.javascript.rhino.head.Token.CommentType commentType2 = null;
        com.google.javascript.rhino.head.ast.Comment comment4 = new com.google.javascript.rhino.head.ast.Comment(6, 53, commentType2, "                                  Scope");
        java.lang.String str5 = comment4.getValue();
        com.google.javascript.rhino.head.Token.CommentType commentType6 = comment4.getCommentType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.Scope scope7 = comment4.getScope();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.Comment cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                  Scope" + "'", str5, "                                  Scope");
        org.junit.Assert.assertNull(commentType6);
    }

    @Test
    public void test15625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15625");
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str7 = scriptNode6.getEncodedSource();
        scriptNode6.setEncodedSourceEnd(18);
        java.lang.String str10 = comment5.toStringTree(scriptNode6);
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("{\n}\n");
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode6, node12);
        scriptNode6.setSourceName("hi!");
        scriptNode6.setSourceName("0\tSCRIPT 0 1\n");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType21 = null;
        com.google.javascript.rhino.head.ast.Comment comment23 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType21, "Scope");
        scriptNode18.setParent((com.google.javascript.rhino.head.ast.AstNode) comment23);
        scriptNode18.setEncodedSourceStart((int) (byte) 100);
        int int29 = scriptNode18.getIntProp(6, 2);
        int int30 = scriptNode18.getParamCount();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList31 = null;
        scriptNode18.setSymbols(symbolList31);
        com.google.javascript.rhino.head.ast.Scope scope35 = new com.google.javascript.rhino.head.ast.Scope((int) (short) -1, 100);
        scriptNode18.setParentScope(scope35);
        int int37 = scriptNode18.getType();
        com.google.javascript.rhino.head.Node node38 = scriptNode18.getLastChild();
        java.lang.String str39 = scriptNode6.toStringTree(scriptNode18);
        int int40 = scriptNode18.getLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType45 = null;
        com.google.javascript.rhino.head.ast.Comment comment47 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType45, "Scope");
        scriptNode42.setParent((com.google.javascript.rhino.head.ast.AstNode) comment47);
        scriptNode42.setEncodedSourceStart((int) (byte) 100);
        int int53 = scriptNode42.getIntProp(6, 2);
        int int54 = scriptNode42.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope56 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope58 = scope56.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node59 = scope56.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType63 = null;
        com.google.javascript.rhino.head.ast.Comment comment65 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType63, "Scope");
        scriptNode60.setParent((com.google.javascript.rhino.head.ast.AstNode) comment65);
        scope56.setJsDocNode(comment65);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode68 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType71 = null;
        com.google.javascript.rhino.head.ast.Comment comment73 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType71, "Scope");
        scriptNode68.setParent((com.google.javascript.rhino.head.ast.AstNode) comment73);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList75 = scriptNode68.getSymbols();
        com.google.javascript.rhino.head.Node node76 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode42, (com.google.javascript.rhino.head.Node) scope56, (com.google.javascript.rhino.head.Node) scriptNode68);
        java.lang.String str77 = scriptNode68.getEncodedSource();
        int int78 = scriptNode68.getAbsolutePosition();
        int int79 = scriptNode68.getLineno();
        java.lang.String str80 = scriptNode68.getEncodedSource();
        com.google.javascript.rhino.head.Node node82 = scriptNode68.setType(51);
        // The following exception was thrown during execution in test generation
        try {
            scriptNode18.setContinue(node82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 136 + "'", int37 == 136);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(scope58);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(symbolList75);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNotNull(node82);
    }

    @Test
    public void test15626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15626");
        com.google.javascript.rhino.head.Token.CommentType commentType2 = null;
        com.google.javascript.rhino.head.ast.Comment comment4 = new com.google.javascript.rhino.head.ast.Comment(19, 2, commentType2, "  {\n  }\n");
        int int5 = comment4.depth();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str7 = scriptNode6.getEncodedSource();
        scriptNode6.setEncodedSourceEnd(18);
        java.lang.String str11 = scriptNode6.makeIndent((int) '#');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType15 = null;
        com.google.javascript.rhino.head.ast.Comment comment17 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType15, "Scope");
        scriptNode12.setParent((com.google.javascript.rhino.head.ast.AstNode) comment17);
        scriptNode12.setEncodedSourceStart((int) (byte) 100);
        scriptNode6.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode12);
        boolean boolean22 = scriptNode6.hasSideEffects();
        com.google.javascript.rhino.head.ast.Scope scope25 = new com.google.javascript.rhino.head.ast.Scope(9);
        boolean boolean26 = scope25.hasSideEffects();
        scriptNode6.putProp((int) (short) 1, (java.lang.Object) boolean26);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor28 = scriptNode6.iterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = scriptNode6.getTop();
        int int30 = comment4.compareTo((com.google.javascript.rhino.head.ast.AstNode) scriptNode6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                      " + "'", str11, "                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(nodeItor28);
        org.junit.Assert.assertNotNull(scriptNode29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test15627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15627");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        java.lang.String str3 = scope1.makeIndent(0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType10 = null;
        com.google.javascript.rhino.head.ast.Comment comment12 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType10, "Scope");
        scriptNode7.setParent((com.google.javascript.rhino.head.ast.AstNode) comment12);
        scriptNode7.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str16 = scriptNode7.getSourceName();
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode7, 26);
        scriptNode5.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode7);
        java.lang.String str20 = scriptNode5.getNextTempName();
        scope1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode5);
        boolean boolean22 = scriptNode5.hasChildren();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor23 = scriptNode5.iterator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "$0" + "'", str20, "$0");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeItor23);
    }

    @Test
    public void test15628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15628");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = scriptNode0.getTop();
        scriptNode9.setPosition(6);
        int int12 = scriptNode9.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = scriptNode9.getTop();
        com.google.javascript.rhino.head.ast.Comment comment14 = scriptNode9.getJsDocNode();
        com.google.javascript.rhino.head.ast.Scope scope16 = scriptNode9.getDefiningScope("              {\n              }\n");
        scriptNode9.setEncodedSourceBounds(396011107, 170200694);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType25 = null;
        com.google.javascript.rhino.head.ast.Comment comment27 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType25, "Scope");
        scriptNode22.setParent((com.google.javascript.rhino.head.ast.AstNode) comment27);
        scriptNode22.setEncodedSourceStart((int) (byte) 100);
        int int31 = scriptNode22.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType36 = null;
        com.google.javascript.rhino.head.ast.Comment comment38 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType36, "Scope");
        scriptNode33.setParent((com.google.javascript.rhino.head.ast.AstNode) comment38);
        scriptNode33.setEncodedSourceStart((int) (byte) 100);
        int int44 = scriptNode33.getIntProp(6, 2);
        int int45 = scriptNode33.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope47 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope49 = scope47.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node50 = scope47.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType54 = null;
        com.google.javascript.rhino.head.ast.Comment comment56 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType54, "Scope");
        scriptNode51.setParent((com.google.javascript.rhino.head.ast.AstNode) comment56);
        scope47.setJsDocNode(comment56);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType62 = null;
        com.google.javascript.rhino.head.ast.Comment comment64 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType62, "Scope");
        scriptNode59.setParent((com.google.javascript.rhino.head.ast.AstNode) comment64);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList66 = scriptNode59.getSymbols();
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode33, (com.google.javascript.rhino.head.Node) scope47, (com.google.javascript.rhino.head.Node) scriptNode59);
        scriptNode59.setPosition((int) (byte) 0);
        scriptNode59.setEncodedSourceStart((int) (byte) 1);
        java.lang.String str73 = scriptNode59.makeIndent(0);
        java.lang.String str74 = scriptNode22.toStringTree(scriptNode59);
        java.lang.String str76 = scriptNode59.makeIndent(12);
        java.lang.String str77 = scriptNode59.getSourceName();
        scriptNode21.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode59);
        java.lang.String str79 = scriptNode21.toString();
        // The following exception was thrown during execution in test generation
        try {
            scriptNode9.setContinue((com.google.javascript.rhino.head.Node) scriptNode21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scriptNode9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(scriptNode13);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(scope49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(symbolList66);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "                        " + "'", str76, "                        ");
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "136" + "'", str79, "136");
    }

    @Test
    public void test15629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15629");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("*");
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope3.setPosition(100);
        com.google.javascript.rhino.head.Node node6 = scope3.getLastSibling();
        com.google.javascript.rhino.head.ast.Scope scope8 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope10 = scope8.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node11 = scope8.target;
        scope8.setPosition(2);
        scope8.setLength((int) (byte) 1);
        com.google.javascript.rhino.head.Node node16 = scope8.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str18 = scriptNode17.getEncodedSource();
        scriptNode17.setEncodedSourceEnd(18);
        java.lang.String str22 = scriptNode17.makeIndent((int) '#');
        scope8.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode17);
        com.google.javascript.rhino.head.ast.Scope scope25 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope27 = scope25.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node28 = scope25.target;
        scope25.setPosition(2);
        scope25.putIntProp(17, 25);
        scope25.setLength((int) ' ');
        scriptNode17.addChild((com.google.javascript.rhino.head.ast.AstNode) scope25);
        int int37 = scriptNode17.getLength();
        int int38 = scriptNode17.getEndLineno();
        java.lang.String str39 = scriptNode17.toSource();
        scope3.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        java.lang.String str41 = node1.toStringTree(scriptNode17);
        com.google.javascript.rhino.head.Node node42 = node1.getLastSibling();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                      " + "'", str22, "                                                                      ");
        org.junit.Assert.assertNull(scope27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "{\n  {\n  }\n}\n" + "'", str39, "{\n  {\n  }\n}\n");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(node42);
    }

    @Test
    public void test15630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15630");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str9 = scriptNode0.getSourceName();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator10 = scriptNode0.new NodeIterator();
        boolean boolean11 = nodeIterator10.hasNext();
        boolean boolean12 = nodeIterator10.hasNext();
        boolean boolean13 = nodeIterator10.hasNext();
        boolean boolean14 = nodeIterator10.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node15 = nodeIterator10.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15631");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        int int12 = scriptNode1.getIntProp(6, 2);
        int int13 = scriptNode1.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str15 = scriptNode14.getEncodedSource();
        int int16 = scriptNode14.getBaseLineno();
        java.lang.String str17 = scriptNode14.getNextTempName();
        scriptNode1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode14);
        scriptNode14.setEncodedSource("                        ");
        scriptNode14.setRelative(14);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType26, "Scope");
        scriptNode23.setParent((com.google.javascript.rhino.head.ast.AstNode) comment28);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList30 = scriptNode23.getSymbols();
        scriptNode14.setSymbols(symbolList30);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) -1);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList34 = scriptNode33.getSymbols();
        com.google.javascript.rhino.head.ast.Symbol symbol36 = scriptNode33.getSymbol("^");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType42 = null;
        com.google.javascript.rhino.head.ast.Comment comment44 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType42, "Scope");
        scriptNode39.setParent((com.google.javascript.rhino.head.ast.AstNode) comment44);
        scriptNode39.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = scriptNode39.getTop();
        scriptNode48.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int53 = scriptNode52.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str55 = scriptNode54.getEncodedSource();
        scriptNode54.setEncodedSourceEnd(18);
        scriptNode52.target = scriptNode54;
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode48, (com.google.javascript.rhino.head.Node) scriptNode54);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str61 = scriptNode60.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType66 = null;
        com.google.javascript.rhino.head.ast.Comment comment68 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType66, "Scope");
        scriptNode63.setParent((com.google.javascript.rhino.head.ast.AstNode) comment68);
        scriptNode63.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str72 = scriptNode63.getSourceName();
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode63, 26);
        com.google.javascript.rhino.head.Node node75 = new com.google.javascript.rhino.head.Node((int) (byte) -1, node59, (com.google.javascript.rhino.head.Node) scriptNode60, (com.google.javascript.rhino.head.Node) scriptNode63);
        com.google.javascript.rhino.head.Node node76 = scriptNode63.getLastSibling();
        boolean boolean77 = scriptNode63.hasSideEffects();
        java.lang.String str78 = scriptNode63.toSource();
        scriptNode63.setLineno((-613442063));
        com.google.javascript.rhino.head.Node node81 = new com.google.javascript.rhino.head.Node(17, (com.google.javascript.rhino.head.Node) scriptNode14, (com.google.javascript.rhino.head.Node) scriptNode33, (com.google.javascript.rhino.head.Node) scriptNode63);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str83 = scriptNode63.getParamOrVarName((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$0" + "'", str17, "$0");
        org.junit.Assert.assertNotNull(symbolList30);
        org.junit.Assert.assertNotNull(symbolList34);
        org.junit.Assert.assertNull(symbol36);
        org.junit.Assert.assertNotNull(scriptNode48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "{\n}\n" + "'", str78, "{\n}\n");
    }

    @Test
    public void test15632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15632");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        scriptNode0.setEncodedSourceEnd(18);
        java.lang.String str5 = scriptNode0.makeIndent((int) '#');
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator6 = scriptNode0.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str8 = scriptNode7.getEncodedSource();
        int int9 = scriptNode7.getBaseLineno();
        java.lang.Object obj10 = scriptNode7.getCompilerData();
        scriptNode7.flattenSymbolTable(false);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap13 = null;
        scriptNode7.setSymbolTable(strMap13);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str17 = scriptNode15.toSource(18);
        int int18 = scriptNode15.getEndLineno();
        com.google.javascript.rhino.head.ast.Comment comment19 = scriptNode15.getJsDocNode();
        int int20 = scriptNode15.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList21 = scriptNode15.getChildScopes();
        com.google.javascript.rhino.head.ast.Scope scope24 = new com.google.javascript.rhino.head.ast.Scope((int) (short) -1, 100);
        com.google.javascript.rhino.head.ast.Symbol symbol26 = scope24.getSymbol("$0");
        boolean boolean27 = scope24.hasSideEffects();
        boolean boolean28 = scope24.hasChildren();
        scriptNode15.addChildToFront((com.google.javascript.rhino.head.Node) scope24);
        scriptNode7.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode15);
        scriptNode0.target = scriptNode15;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str34 = scriptNode32.toSource(18);
        int int35 = scriptNode32.getEndLineno();
        com.google.javascript.rhino.head.ast.Comment comment36 = scriptNode32.getJsDocNode();
        int int37 = scriptNode32.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList38 = scriptNode32.getChildScopes();
        // The following exception was thrown during execution in test generation
        try {
            scriptNode15.setDefault((com.google.javascript.rhino.head.Node) scriptNode32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                      " + "'", str5, "                                                                      ");
        org.junit.Assert.assertNotNull(nodeSpliterator6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                    {\n                                    }\n" + "'", str17, "                                    {\n                                    }\n");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(comment19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(scopeList21);
        org.junit.Assert.assertNull(symbol26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "                                    {\n                                    }\n" + "'", str34, "                                    {\n                                    }\n");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(comment36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(scopeList38);
    }

    @Test
    public void test15633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15633");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope1.setPosition(100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType8 = null;
        com.google.javascript.rhino.head.ast.Comment comment10 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType8, "Scope");
        scriptNode5.setParent((com.google.javascript.rhino.head.ast.AstNode) comment10);
        scriptNode5.setEncodedSourceStart((int) (byte) 100);
        int int16 = scriptNode5.getIntProp(6, 2);
        int int17 = scriptNode5.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope21 = scope19.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node22 = scope19.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType26, "Scope");
        scriptNode23.setParent((com.google.javascript.rhino.head.ast.AstNode) comment28);
        scope19.setJsDocNode(comment28);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType34 = null;
        com.google.javascript.rhino.head.ast.Comment comment36 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType34, "Scope");
        scriptNode31.setParent((com.google.javascript.rhino.head.ast.AstNode) comment36);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList38 = scriptNode31.getSymbols();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode5, (com.google.javascript.rhino.head.Node) scope19, (com.google.javascript.rhino.head.Node) scriptNode31);
        scriptNode31.setPosition((int) (byte) 0);
        scope1.setTop(scriptNode31);
        int int43 = scriptNode31.getParamCount();
        boolean boolean44 = scriptNode31.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator45 = scriptNode31.new NodeIterator();
        scriptNode31.setLineno(16);
        scriptNode31.removeProp(1583199871);
        com.google.javascript.rhino.head.ast.Scope scope51 = scriptNode31.getDefiningScope("                                                                                                                                                                                                  {\n}\n");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(symbolList38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(scope51);
    }

    @Test
    public void test15634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15634");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode(6);
        com.google.javascript.rhino.head.ast.Scope scope4 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope4.setPosition(100);
        com.google.javascript.rhino.head.Node node7 = scope4.getLastSibling();
        node7.removeChildren();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator9 = node7.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType14 = null;
        com.google.javascript.rhino.head.ast.Comment comment16 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType14, "Scope");
        scriptNode11.setParent((com.google.javascript.rhino.head.ast.AstNode) comment16);
        scriptNode11.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = scriptNode11.getTop();
        scriptNode20.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int25 = scriptNode24.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str27 = scriptNode26.getEncodedSource();
        scriptNode26.setEncodedSourceEnd(18);
        scriptNode24.target = scriptNode26;
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode20, (com.google.javascript.rhino.head.Node) scriptNode26);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList32 = null;
        scriptNode26.setSymbols(symbolList32);
        node7.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode26);
        java.lang.String str35 = scriptNode2.toStringTree(scriptNode26);
        int int36 = scriptNode2.getFunctionCount();
        scriptNode2.setPosition(19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType43 = null;
        com.google.javascript.rhino.head.ast.Comment comment45 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType43, "Scope");
        scriptNode40.setParent((com.google.javascript.rhino.head.ast.AstNode) comment45);
        scriptNode40.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str49 = scriptNode40.getSourceName();
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode40, 26);
        com.google.javascript.rhino.head.Token.CommentType commentType54 = null;
        com.google.javascript.rhino.head.ast.Comment comment56 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType54, "Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str58 = scriptNode57.getEncodedSource();
        scriptNode57.setEncodedSourceEnd(18);
        java.lang.String str61 = comment56.toStringTree(scriptNode57);
        int int62 = comment56.getType();
        java.lang.String str63 = comment56.getValue();
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node((int) (byte) -1, (com.google.javascript.rhino.head.Node) scriptNode2, (com.google.javascript.rhino.head.Node) scriptNode40, (com.google.javascript.rhino.head.Node) comment56);
        com.google.javascript.rhino.head.Token.CommentType commentType67 = null;
        com.google.javascript.rhino.head.ast.Comment comment69 = new com.google.javascript.rhino.head.ast.Comment(161, 15, commentType67, "                                                                                                                                                                                                                                                                                                                                  {\n                                                                                                                                                                                                                                                                                                                                  }\n");
        comment56.setJsDocNode(comment69);
        com.google.javascript.rhino.head.Token.CommentType commentType71 = null;
        comment69.setCommentType(commentType71);
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor73 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment69.visit(nodeVisitor73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeSpliterator9);
        org.junit.Assert.assertNotNull(scriptNode20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 161 + "'", int62 == 161);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Scope" + "'", str63, "Scope");
    }

    @Test
    public void test15635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15635");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (byte) 0, (-389829193));
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scope2.visit(nodeVisitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15636");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int5 = scriptNode2.getIntProp(23, (int) (short) 1);
        com.google.javascript.rhino.head.Node node7 = scriptNode2.setType(0);
        com.google.javascript.rhino.head.ast.Scope scope9 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope11 = scope9.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node12 = scope9.target;
        scope9.setPosition(2);
        java.lang.String str15 = scope9.toSource();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap16 = scope9.getSymbolTable();
        boolean boolean17 = scope9.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType21 = null;
        com.google.javascript.rhino.head.ast.Comment comment23 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType21, "Scope");
        scriptNode18.setParent((com.google.javascript.rhino.head.ast.AstNode) comment23);
        scriptNode18.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = scriptNode18.getTop();
        scope9.target = scriptNode18;
        com.google.javascript.rhino.head.Node node29 = scriptNode18.target;
        scriptNode18.setBaseLineno(10);
        scriptNode18.setEncodedSourceEnd((int) (short) -1);
        int int34 = scriptNode18.getParamCount();
        java.lang.String str35 = scriptNode18.getEncodedSource();
        com.google.javascript.rhino.head.Token.CommentType commentType38 = null;
        com.google.javascript.rhino.head.ast.Comment comment40 = new com.google.javascript.rhino.head.ast.Comment((-1), 6, commentType38, "hi!");
        com.google.javascript.rhino.head.ast.Scope scope43 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope45 = scope43.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node46 = scope43.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType50 = null;
        com.google.javascript.rhino.head.ast.Comment comment52 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType50, "Scope");
        scriptNode47.setParent((com.google.javascript.rhino.head.ast.AstNode) comment52);
        scope43.setJsDocNode(comment52);
        java.lang.String str56 = comment52.toSource((int) (short) 10);
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) comment52);
        comment40.addChildToBack(node57);
        java.lang.String str59 = comment40.getValue();
        int int62 = comment40.getIntProp((int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node(966852023, node7, (com.google.javascript.rhino.head.Node) scriptNode18, (com.google.javascript.rhino.head.Node) comment40);
        com.google.javascript.rhino.head.Node node64 = comment40.getFirstChild();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{\n}\n" + "'", str15, "{\n}\n");
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(scriptNode27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(scope45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "                    Scope" + "'", str56, "                    Scope");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertNotNull(node64);
    }

    @Test
    public void test15637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15637");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList7 = scriptNode0.getSymbols();
        java.lang.String str8 = scriptNode0.debugPrint();
        scriptNode0.setBaseLineno((int) (byte) 10);
        java.lang.String str11 = scriptNode0.getSourceName();
        java.lang.String str12 = scriptNode0.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str14 = scriptNode13.getEncodedSource();
        scriptNode13.setEncodedSourceEnd(18);
        java.lang.String str18 = scriptNode13.makeIndent((int) '#');
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator19 = scriptNode13.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope20 = scriptNode13.getParentScope();
        java.lang.String str21 = scriptNode13.getNextTempName();
        int int22 = scriptNode13.getType();
        com.google.javascript.rhino.head.Node node24 = scriptNode13.setType(0);
        java.lang.String str25 = scriptNode13.getSourceName();
        // The following exception was thrown during execution in test generation
        try {
            scriptNode0.setCompilerData((java.lang.Object) str25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: arg cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(symbolList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str8, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                      " + "'", str18, "                                                                      ");
        org.junit.Assert.assertNotNull(nodeSpliterator19);
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "$0" + "'", str21, "$0");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 136 + "'", int22 == 136);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test15638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15638");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((-366869103));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType5 = null;
        com.google.javascript.rhino.head.ast.Comment comment7 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType5, "Scope");
        scriptNode2.setParent((com.google.javascript.rhino.head.ast.AstNode) comment7);
        scriptNode2.setEncodedSourceStart((int) (byte) 100);
        int int13 = scriptNode2.getIntProp(6, 2);
        int int14 = scriptNode2.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str16 = scriptNode15.getEncodedSource();
        int int17 = scriptNode15.getBaseLineno();
        java.lang.String str18 = scriptNode15.getNextTempName();
        scriptNode2.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode15);
        int int20 = scriptNode2.getEndLineno();
        int int21 = scriptNode2.getEncodedSourceEnd();
        java.lang.String str23 = scriptNode2.toSource((int) (byte) -1);
        com.google.javascript.rhino.head.Node node24 = scriptNode2.getNext();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap25 = scriptNode2.getSymbolTable();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType29 = null;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType29, "Scope");
        scriptNode26.setParent((com.google.javascript.rhino.head.ast.AstNode) comment31);
        scriptNode26.setEncodedSourceStart((int) (byte) 100);
        int int37 = scriptNode26.getIntProp(6, 2);
        int int38 = scriptNode26.getRegexpCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str41 = scriptNode39.toSource(18);
        java.lang.Object obj42 = scriptNode39.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType47 = null;
        com.google.javascript.rhino.head.ast.Comment comment49 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType47, "Scope");
        scriptNode44.setParent((com.google.javascript.rhino.head.ast.AstNode) comment49);
        scriptNode44.setEncodedSourceStart((int) (byte) 100);
        int int55 = scriptNode44.getIntProp(6, 2);
        int int56 = scriptNode44.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope58 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope60 = scope58.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node61 = scope58.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode62 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType65 = null;
        com.google.javascript.rhino.head.ast.Comment comment67 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType65, "Scope");
        scriptNode62.setParent((com.google.javascript.rhino.head.ast.AstNode) comment67);
        scope58.setJsDocNode(comment67);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode70 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType73 = null;
        com.google.javascript.rhino.head.ast.Comment comment75 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType73, "Scope");
        scriptNode70.setParent((com.google.javascript.rhino.head.ast.AstNode) comment75);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList77 = scriptNode70.getSymbols();
        com.google.javascript.rhino.head.Node node78 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode44, (com.google.javascript.rhino.head.Node) scope58, (com.google.javascript.rhino.head.Node) scriptNode70);
        scriptNode70.setPosition((int) (byte) 0);
        com.google.javascript.rhino.head.Node node81 = scriptNode70.target;
        scriptNode39.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode70);
        int int83 = scriptNode70.getLineno();
        scriptNode26.setCompilerData((java.lang.Object) scriptNode70);
        scriptNode70.setBaseLineno(0);
        java.lang.Object obj87 = scriptNode70.getCompilerData();
        int int88 = scriptNode70.getEncodedSourceStart();
        java.lang.String str89 = scriptNode2.toStringTree(scriptNode70);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList90 = scriptNode2.getSymbols();
        scriptNode1.setSymbols(symbolList90);
        int int92 = scriptNode1.getFunctionCount();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "$0" + "'", str18, "$0");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{\n{\n}\n}\n" + "'", str23, "{\n{\n}\n}\n");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(strMap25);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "                                    {\n                                    }\n" + "'", str41, "                                    {\n                                    }\n");
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(scope60);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNotNull(symbolList77);
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNotNull(symbolList90);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
    }

    @Test
    public void test15639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15639");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType5 = null;
        com.google.javascript.rhino.head.ast.Comment comment7 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType5, "Scope");
        scriptNode2.setParent((com.google.javascript.rhino.head.ast.AstNode) comment7);
        scriptNode2.setEncodedSourceStart((int) (byte) 100);
        int int13 = scriptNode2.getIntProp(6, 2);
        int int14 = scriptNode2.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope16 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope18 = scope16.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node19 = scope16.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType23 = null;
        com.google.javascript.rhino.head.ast.Comment comment25 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType23, "Scope");
        scriptNode20.setParent((com.google.javascript.rhino.head.ast.AstNode) comment25);
        scope16.setJsDocNode(comment25);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType31 = null;
        com.google.javascript.rhino.head.ast.Comment comment33 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType31, "Scope");
        scriptNode28.setParent((com.google.javascript.rhino.head.ast.AstNode) comment33);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList35 = scriptNode28.getSymbols();
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode2, (com.google.javascript.rhino.head.Node) scope16, (com.google.javascript.rhino.head.Node) scriptNode28);
        scriptNode28.setPosition((int) (byte) 0);
        scriptNode28.setEncodedSourceStart((int) (byte) 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType44 = null;
        com.google.javascript.rhino.head.ast.Comment comment46 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType44, "Scope");
        scriptNode41.setParent((com.google.javascript.rhino.head.ast.AstNode) comment46);
        scriptNode41.setEncodedSourceStart((int) (byte) 100);
        int int52 = scriptNode41.getIntProp(6, 2);
        int int53 = scriptNode41.getParamCount();
        java.lang.String str54 = scriptNode41.debugPrint();
        int int57 = scriptNode41.getIntProp(17, 10);
        scriptNode28.setTop(scriptNode41);
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node(10, (com.google.javascript.rhino.head.Node) scriptNode28);
        scriptNode28.setEncodedSource("                                                                                                                                                                                                  {\n                                                                                                                                                                                                  }\n");
        scriptNode28.setEncodedSourceStart(7);
        boolean boolean64 = scriptNode28.hasChildren();
        com.google.javascript.rhino.head.ast.Symbol symbol66 = scriptNode28.getSymbol("                                  {\n                                  }\n");
        int int67 = scriptNode28.getAbsolutePosition();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(symbolList35);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str54, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(symbol66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 52 + "'", int67 == 52);
    }

    @Test
    public void test15640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15640");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        scriptNode0.setEncodedSourceEnd(18);
        java.lang.String str5 = scriptNode0.makeIndent((int) '#');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType9 = null;
        com.google.javascript.rhino.head.ast.Comment comment11 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType9, "Scope");
        scriptNode6.setParent((com.google.javascript.rhino.head.ast.AstNode) comment11);
        scriptNode6.setEncodedSourceStart((int) (byte) 100);
        scriptNode0.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode6);
        int int16 = scriptNode0.getRegexpCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType21 = null;
        com.google.javascript.rhino.head.ast.Comment comment23 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType21, "Scope");
        scriptNode18.setParent((com.google.javascript.rhino.head.ast.AstNode) comment23);
        scriptNode18.setEncodedSourceStart((int) (byte) 100);
        int int29 = scriptNode18.getIntProp(6, 2);
        int int30 = scriptNode18.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope32 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope34 = scope32.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node35 = scope32.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType39 = null;
        com.google.javascript.rhino.head.ast.Comment comment41 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType39, "Scope");
        scriptNode36.setParent((com.google.javascript.rhino.head.ast.AstNode) comment41);
        scope32.setJsDocNode(comment41);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType47 = null;
        com.google.javascript.rhino.head.ast.Comment comment49 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType47, "Scope");
        scriptNode44.setParent((com.google.javascript.rhino.head.ast.AstNode) comment49);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList51 = scriptNode44.getSymbols();
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode18, (com.google.javascript.rhino.head.Node) scope32, (com.google.javascript.rhino.head.Node) scriptNode44);
        scriptNode44.setPosition((int) (byte) 0);
        scriptNode44.setEncodedSourceStart((int) (byte) 1);
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray57 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList58 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList58, symbolArray57);
        scriptNode44.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList58);
        scriptNode0.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList58);
        scriptNode0.setBounds((int) (byte) -1, 0);
        int int65 = scriptNode0.depth();
        scriptNode0.flattenSymbolTable(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                      " + "'", str5, "                                                                      ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(symbolList51);
        org.junit.Assert.assertNotNull(symbolArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test15641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15641");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        scope1.setLength((int) (byte) 1);
        com.google.javascript.rhino.head.ast.Scope scope10 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope12 = scope10.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node13 = scope10.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType17 = null;
        com.google.javascript.rhino.head.ast.Comment comment19 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType17, "Scope");
        scriptNode14.setParent((com.google.javascript.rhino.head.ast.AstNode) comment19);
        scope10.setJsDocNode(comment19);
        java.lang.String str23 = comment19.toSource((int) (short) 10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = comment19.getAstRoot();
        scope1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment19);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator26 = scope1.new NodeIterator();
        boolean boolean27 = nodeIterator26.hasNext();
        boolean boolean28 = nodeIterator26.hasNext();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "                    Scope" + "'", str23, "                    Scope");
        org.junit.Assert.assertNull(astRoot24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test15642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15642");
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope5 = scope3.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node6 = scope3.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType10 = null;
        com.google.javascript.rhino.head.ast.Comment comment12 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType10, "Scope");
        scriptNode7.setParent((com.google.javascript.rhino.head.ast.AstNode) comment12);
        scope3.setJsDocNode(comment12);
        boolean boolean15 = scope3.hasChildren();
        com.google.javascript.rhino.head.ast.Scope scope17 = new com.google.javascript.rhino.head.ast.Scope(9);
        boolean boolean18 = scope17.hasSideEffects();
        java.lang.String str19 = scope17.toSource();
        com.google.javascript.rhino.head.ast.Scope scope21 = new com.google.javascript.rhino.head.ast.Scope(9);
        boolean boolean22 = scope21.hasSideEffects();
        java.lang.String str23 = scope21.toSource();
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(13, (com.google.javascript.rhino.head.Node) scope3, (com.google.javascript.rhino.head.Node) scope17, (com.google.javascript.rhino.head.Node) scope21, 17);
        java.lang.String str27 = scope21.toSource(4);
        com.google.javascript.rhino.head.ast.Scope scope29 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        java.lang.String str31 = scope29.makeIndent(0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType38 = null;
        com.google.javascript.rhino.head.ast.Comment comment40 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType38, "Scope");
        scriptNode35.setParent((com.google.javascript.rhino.head.ast.AstNode) comment40);
        scriptNode35.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str44 = scriptNode35.getSourceName();
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode35, 26);
        scriptNode33.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode35);
        java.lang.String str48 = scriptNode33.getNextTempName();
        scope29.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode33);
        boolean boolean50 = scriptNode33.hasChildren();
        scriptNode33.setBaseLineno(4);
        java.lang.String str53 = scriptNode33.getNextTempName();
        java.lang.String str54 = scriptNode33.debugPrint();
        scriptNode33.setEncodedSource("%");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType60 = null;
        com.google.javascript.rhino.head.ast.Comment comment62 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType60, "Scope");
        scriptNode57.setParent((com.google.javascript.rhino.head.ast.AstNode) comment62);
        scriptNode57.setEncodedSourceStart((int) (byte) 100);
        int int68 = scriptNode57.getIntProp(6, 2);
        int int69 = scriptNode57.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode70 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str71 = scriptNode70.getEncodedSource();
        int int72 = scriptNode70.getBaseLineno();
        java.lang.String str73 = scriptNode70.getNextTempName();
        scriptNode57.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode70);
        com.google.javascript.rhino.head.ast.Scope scope77 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10, (int) (byte) -1);
        int int78 = scope77.depth();
        scriptNode57.replaceWith(scope77);
        com.google.javascript.rhino.head.Token.CommentType commentType82 = null;
        com.google.javascript.rhino.head.ast.Comment comment84 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType82, "Scope");
        java.lang.String str85 = comment84.getValue();
        scriptNode57.setJsDocNode(comment84);
        com.google.javascript.rhino.head.Node node88 = new com.google.javascript.rhino.head.Node((-243114478), (com.google.javascript.rhino.head.Node) scope21, (com.google.javascript.rhino.head.Node) scriptNode33, (com.google.javascript.rhino.head.Node) scriptNode57, (int) (byte) 0);
        java.lang.String str89 = scriptNode57.getSourceName();
        scriptNode57.setSourceName("                  ");
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{\n}\n" + "'", str19, "{\n}\n");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{\n}\n" + "'", str23, "{\n}\n");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "        {\n        }\n" + "'", str27, "        {\n        }\n");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "$0" + "'", str48, "$0");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "$1" + "'", str53, "$1");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "6\tSCRIPT 6 1\n" + "'", str54, "6\tSCRIPT 6 1\n");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "$0" + "'", str73, "$0");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Scope" + "'", str85, "Scope");
        org.junit.Assert.assertNull(str89);
    }

    @Test
    public void test15643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15643");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEndLineno(14);
        boolean boolean10 = scriptNode1.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType17 = null;
        com.google.javascript.rhino.head.ast.Comment comment19 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType17, "Scope");
        scriptNode14.setParent((com.google.javascript.rhino.head.ast.AstNode) comment19);
        scriptNode14.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = scriptNode14.getTop();
        scriptNode23.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int28 = scriptNode27.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str30 = scriptNode29.getEncodedSource();
        scriptNode29.setEncodedSourceEnd(18);
        scriptNode27.target = scriptNode29;
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode23, (com.google.javascript.rhino.head.Node) scriptNode29);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str36 = scriptNode35.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType41 = null;
        com.google.javascript.rhino.head.ast.Comment comment43 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType41, "Scope");
        scriptNode38.setParent((com.google.javascript.rhino.head.ast.AstNode) comment43);
        scriptNode38.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str47 = scriptNode38.getSourceName();
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode38, 26);
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node((int) (byte) -1, node34, (com.google.javascript.rhino.head.Node) scriptNode35, (com.google.javascript.rhino.head.Node) scriptNode38);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap51 = null;
        scriptNode38.setSymbolTable(strMap51);
        java.lang.Object obj54 = scriptNode38.getProp((int) (short) 0);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList55 = scriptNode38.getChildScopes();
        int int56 = scriptNode38.getFunctionCount();
        com.google.javascript.rhino.head.ast.Scope scope59 = new com.google.javascript.rhino.head.ast.Scope((int) (byte) 100, 4);
        int int60 = scope59.depth();
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode38, (com.google.javascript.rhino.head.Node) scope59, 8);
        scope59.setLength(908331048);
        java.lang.String str65 = scope59.getJsDoc();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType69 = null;
        com.google.javascript.rhino.head.ast.Comment comment71 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType69, "Scope");
        scriptNode66.setParent((com.google.javascript.rhino.head.ast.AstNode) comment71);
        scriptNode66.setEncodedSourceStart((int) (byte) 100);
        int int77 = scriptNode66.getIntProp(6, 2);
        int int78 = scriptNode66.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode79 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str80 = scriptNode79.getEncodedSource();
        int int81 = scriptNode79.getBaseLineno();
        java.lang.String str82 = scriptNode79.getNextTempName();
        scriptNode66.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode79);
        com.google.javascript.rhino.head.ast.Scope scope86 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10, (int) (byte) -1);
        int int87 = scope86.depth();
        scriptNode66.replaceWith(scope86);
        com.google.javascript.rhino.head.Token.CommentType commentType91 = null;
        com.google.javascript.rhino.head.ast.Comment comment93 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType91, "Scope");
        java.lang.String str94 = comment93.getValue();
        scriptNode66.setJsDocNode(comment93);
        int int96 = scriptNode66.getPosition();
        com.google.javascript.rhino.head.Node node97 = new com.google.javascript.rhino.head.Node(371991955, (com.google.javascript.rhino.head.Node) scriptNode1, (com.google.javascript.rhino.head.Node) scope59, (com.google.javascript.rhino.head.Node) scriptNode66);
        // The following exception was thrown during execution in test generation
        try {
            node97.setDouble(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Node cannot be cast to com.google.javascript.rhino.head.ast.NumberLiteral");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(scriptNode23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(scopeList55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "$0" + "'", str82, "$0");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Scope" + "'", str94, "Scope");
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-53) + "'", int96 == (-53));
    }

    @Test
    public void test15644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15644");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int2 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str4 = scriptNode3.getEncodedSource();
        scriptNode3.setEncodedSourceEnd(18);
        scriptNode1.target = scriptNode3;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((-1));
        scriptNode9.setLineno((int) (byte) 1);
        scriptNode1.setCompilerData((java.lang.Object) (byte) 1);
        int int13 = scriptNode1.depth();
        int int14 = scriptNode1.getRegexpCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test15645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15645");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType5 = null;
        com.google.javascript.rhino.head.ast.Comment comment7 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType5, "Scope");
        scriptNode2.setParent((com.google.javascript.rhino.head.ast.AstNode) comment7);
        scriptNode2.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = scriptNode2.getTop();
        scriptNode11.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int16 = scriptNode15.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str18 = scriptNode17.getEncodedSource();
        scriptNode17.setEncodedSourceEnd(18);
        scriptNode15.target = scriptNode17;
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode11, (com.google.javascript.rhino.head.Node) scriptNode17);
        java.lang.String str23 = node22.getJsDoc();
        com.google.javascript.rhino.head.ast.Scope scope25 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope27 = scope25.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node28 = scope25.getLastSibling();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node(23, node22, (com.google.javascript.rhino.head.Node) scope25, (int) (byte) 1);
        com.google.javascript.rhino.head.Token.CommentType commentType33 = null;
        com.google.javascript.rhino.head.ast.Comment comment35 = new com.google.javascript.rhino.head.ast.Comment(0, 5, commentType33, "-1\t  SCRIPT -53 1\n-1\t  SCRIPT -53 1\n");
        comment35.setPosition(16);
        com.google.javascript.rhino.head.Token.CommentType commentType38 = comment35.getCommentType();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType42 = null;
        com.google.javascript.rhino.head.ast.Comment comment44 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType42, "Scope");
        scriptNode39.setParent((com.google.javascript.rhino.head.ast.AstNode) comment44);
        scriptNode39.setEncodedSourceStart((int) (byte) 100);
        int int50 = scriptNode39.getIntProp(6, 2);
        int int51 = scriptNode39.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType55 = null;
        com.google.javascript.rhino.head.ast.Comment comment57 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType55, "Scope");
        scriptNode52.setParent((com.google.javascript.rhino.head.ast.AstNode) comment57);
        scriptNode52.setEncodedSourceStart((int) (byte) 100);
        int int63 = scriptNode52.getIntProp(6, 2);
        int int64 = scriptNode52.getParamCount();
        scriptNode39.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode52);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = new com.google.javascript.rhino.head.ast.ScriptNode(22);
        scriptNode39.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode67);
        java.lang.String str69 = scriptNode39.getEncodedSource();
        node30.addChildAfter((com.google.javascript.rhino.head.Node) comment35, (com.google.javascript.rhino.head.Node) scriptNode39);
        com.google.javascript.rhino.head.Node node71 = node30.getFirstChild();
        org.junit.Assert.assertNotNull(scriptNode11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(scope27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(commentType38);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(node71);
    }

    @Test
    public void test15646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15646");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        int int11 = scriptNode0.getIntProp(6, 2);
        int int12 = scriptNode0.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str14 = scriptNode13.getEncodedSource();
        int int15 = scriptNode13.getBaseLineno();
        java.lang.String str16 = scriptNode13.getNextTempName();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode13);
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10, (int) (byte) -1);
        int int21 = scope20.depth();
        scriptNode0.replaceWith(scope20);
        com.google.javascript.rhino.head.ast.Symbol symbol24 = scriptNode0.getSymbol("                                      Scope");
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(19);
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope28.setPosition(100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType35 = null;
        com.google.javascript.rhino.head.ast.Comment comment37 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType35, "Scope");
        scriptNode32.setParent((com.google.javascript.rhino.head.ast.AstNode) comment37);
        scriptNode32.setEncodedSourceStart((int) (byte) 100);
        int int43 = scriptNode32.getIntProp(6, 2);
        int int44 = scriptNode32.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope46 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope48 = scope46.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node49 = scope46.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType53 = null;
        com.google.javascript.rhino.head.ast.Comment comment55 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType53, "Scope");
        scriptNode50.setParent((com.google.javascript.rhino.head.ast.AstNode) comment55);
        scope46.setJsDocNode(comment55);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode58 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType61 = null;
        com.google.javascript.rhino.head.ast.Comment comment63 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType61, "Scope");
        scriptNode58.setParent((com.google.javascript.rhino.head.ast.AstNode) comment63);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList65 = scriptNode58.getSymbols();
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode32, (com.google.javascript.rhino.head.Node) scope46, (com.google.javascript.rhino.head.Node) scriptNode58);
        scriptNode58.setPosition((int) (byte) 0);
        scope28.setTop(scriptNode58);
        java.lang.String str71 = scriptNode58.makeIndent((int) (short) 100);
        node26.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode58);
        scriptNode0.setParentScope((com.google.javascript.rhino.head.ast.Scope) scriptNode58);
        int int74 = scriptNode0.getEncodedSourceStart();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator75 = scriptNode0.spliterator();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$0" + "'", str16, "$0");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(symbol24);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(scope48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(symbolList65);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "                                                                                                                                                                                                        " + "'", str71, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 100 + "'", int74 == 100);
        org.junit.Assert.assertNotNull(nodeSpliterator75);
    }

    @Test
    public void test15647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15647");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType5 = null;
        com.google.javascript.rhino.head.ast.Comment comment7 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType5, "Scope");
        scriptNode2.setParent((com.google.javascript.rhino.head.ast.AstNode) comment7);
        scriptNode2.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = scriptNode2.getTop();
        scriptNode11.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int16 = scriptNode15.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str18 = scriptNode17.getEncodedSource();
        scriptNode17.setEncodedSourceEnd(18);
        scriptNode15.target = scriptNode17;
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode11, (com.google.javascript.rhino.head.Node) scriptNode17);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str24 = scriptNode23.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType29 = null;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType29, "Scope");
        scriptNode26.setParent((com.google.javascript.rhino.head.ast.AstNode) comment31);
        scriptNode26.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str35 = scriptNode26.getSourceName();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode26, 26);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node((int) (byte) -1, node22, (com.google.javascript.rhino.head.Node) scriptNode23, (com.google.javascript.rhino.head.Node) scriptNode26);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap39 = null;
        scriptNode26.setSymbolTable(strMap39);
        scriptNode26.setSourceName("0\tBLOCK 0 1\n");
        com.google.javascript.rhino.head.Token.CommentType commentType46 = null;
        com.google.javascript.rhino.head.ast.Comment comment48 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType46, "Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str50 = scriptNode49.getEncodedSource();
        scriptNode49.setEncodedSourceEnd(18);
        java.lang.String str53 = comment48.toStringTree(scriptNode49);
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newString("{\n}\n");
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode49, node55);
        int int57 = scriptNode49.getRegexpCount();
        scriptNode49.setBaseLineno((int) '#');
        java.lang.String str60 = scriptNode49.toString();
        boolean boolean61 = scriptNode49.hasChildren();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList62 = scriptNode49.getFunctions();
        scriptNode26.setParentScope((com.google.javascript.rhino.head.ast.Scope) scriptNode49);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator64 = scriptNode49.new NodeIterator();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node65 = nodeIterator64.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scriptNode11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "136" + "'", str60, "136");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(functionNodeList62);
    }

    @Test
    public void test15648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15648");
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
        com.google.javascript.rhino.head.Node node31 = scriptNode10.getFirstChild();
        scriptNode10.setPosition(51);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList34 = scriptNode10.getFunctions();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                      " + "'", str15, "                                                                      ");
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionNodeList34);
    }

    @Test
    public void test15649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15649");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope(22, (int) 'a');
        java.lang.String str4 = scope2.toSource(12);
        scope2.setRelative(1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor7 = scope2.iterator();
        boolean boolean8 = nodeItor7.hasNext();
        boolean boolean9 = nodeItor7.hasNext();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                        {\n                        }\n" + "'", str4, "                        {\n                        }\n");
        org.junit.Assert.assertNotNull(nodeItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test15650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15650");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        int int11 = scriptNode0.getIntProp(6, 2);
        int int12 = scriptNode0.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str14 = scriptNode13.getEncodedSource();
        int int15 = scriptNode13.getBaseLineno();
        java.lang.String str16 = scriptNode13.getNextTempName();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode13);
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10, (int) (byte) -1);
        int int21 = scope20.depth();
        scriptNode0.replaceWith(scope20);
        com.google.javascript.rhino.head.ast.Symbol symbol24 = scriptNode0.getSymbol("                                      Scope");
        int int25 = scriptNode0.getLineno();
        int int26 = scriptNode0.getLength();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Scope scope29 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope31 = scope29.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node32 = scope29.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = null;
        scope29.setTop(scriptNode33);
        scriptNode27.target = scope29;
        int int36 = scriptNode27.getEncodedSourceStart();
        int int37 = scriptNode0.compareTo((com.google.javascript.rhino.head.ast.AstNode) scriptNode27);
        int int38 = scriptNode0.getAbsolutePosition();
        com.google.javascript.rhino.head.Node node39 = scriptNode0.getNext();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$0" + "'", str16, "$0");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(symbol24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 53 + "'", int26 == 53);
        org.junit.Assert.assertNull(scope31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test15651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15651");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = scriptNode0.getTop();
        scriptNode9.setPosition(6);
        int int12 = scriptNode9.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = scriptNode9.getTop();
        com.google.javascript.rhino.head.Node node14 = scriptNode9.getLastChild();
        scriptNode9.setBounds(24, 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode18 = scriptNode9.getEnclosingFunction();
        int int19 = scriptNode9.getFunctionCount();
        org.junit.Assert.assertNotNull(scriptNode9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(scriptNode13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(functionNode18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test15652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15652");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope4 = scope2.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node5 = scope2.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = null;
        scope2.setTop(scriptNode6);
        scriptNode0.target = scope2;
        java.lang.String str10 = scriptNode0.toSource((int) 'a');
        com.google.javascript.rhino.head.ast.Scope scope12 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope14 = scope12.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node15 = scope12.target;
        scope12.setPosition(2);
        java.lang.String str18 = scope12.toSource();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap19 = scope12.getSymbolTable();
        boolean boolean20 = scope12.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType24 = null;
        com.google.javascript.rhino.head.ast.Comment comment26 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType24, "Scope");
        scriptNode21.setParent((com.google.javascript.rhino.head.ast.AstNode) comment26);
        scriptNode21.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = scriptNode21.getTop();
        scope12.target = scriptNode21;
        com.google.javascript.rhino.head.Node node32 = scriptNode21.target;
        scriptNode21.setBaseLineno(10);
        scriptNode21.setEncodedSourceEnd((int) (short) -1);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap37 = null;
        scriptNode21.setSymbolTable(strMap37);
        scriptNode0.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode21);
        java.lang.String str40 = scriptNode21.getNextTempName();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor41 = scriptNode21.iterator();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral42 = null;
        // The following exception was thrown during execution in test generation
        try {
            scriptNode21.addRegExp(regExpLiteral42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                                                                                                                  {\n                                                                                                                                                                                                  }\n" + "'", str10, "                                                                                                                                                                                                  {\n                                                                                                                                                                                                  }\n");
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{\n}\n" + "'", str18, "{\n}\n");
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(scriptNode30);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "$0" + "'", str40, "$0");
        org.junit.Assert.assertNotNull(nodeItor41);
    }

    @Test
    public void test15653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15653");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        java.lang.String str8 = scriptNode0.toSource(26);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator9 = scriptNode0.new NodeIterator();
        java.lang.String str10 = scriptNode0.getNextTempName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType14 = null;
        com.google.javascript.rhino.head.ast.Comment comment16 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType14, "Scope");
        scriptNode11.setParent((com.google.javascript.rhino.head.ast.AstNode) comment16);
        scriptNode0.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode11);
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = scriptNode11.getAstRoot();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node20 = astRoot19.getContinue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                    {\n                                                    }\n" + "'", str8, "                                                    {\n                                                    }\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$0" + "'", str10, "$0");
        org.junit.Assert.assertNull(astRoot19);
    }

    @Test
    public void test15654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15654");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.clearParentScope();
        com.google.javascript.rhino.head.ast.Scope scope9 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope11 = scope9.getDefiningScope("Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType17 = null;
        com.google.javascript.rhino.head.ast.Comment comment19 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType17, "Scope");
        scriptNode14.setParent((com.google.javascript.rhino.head.ast.AstNode) comment19);
        scriptNode14.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = scriptNode14.getTop();
        scriptNode23.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int28 = scriptNode27.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str30 = scriptNode29.getEncodedSource();
        scriptNode29.setEncodedSourceEnd(18);
        scriptNode27.target = scriptNode29;
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode23, (com.google.javascript.rhino.head.Node) scriptNode29);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str36 = scriptNode35.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType41 = null;
        com.google.javascript.rhino.head.ast.Comment comment43 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType41, "Scope");
        scriptNode38.setParent((com.google.javascript.rhino.head.ast.AstNode) comment43);
        scriptNode38.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str47 = scriptNode38.getSourceName();
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode38, 26);
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node((int) (byte) -1, node34, (com.google.javascript.rhino.head.Node) scriptNode35, (com.google.javascript.rhino.head.Node) scriptNode38);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType54 = null;
        com.google.javascript.rhino.head.ast.Comment comment56 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType54, "Scope");
        scriptNode51.setParent((com.google.javascript.rhino.head.ast.AstNode) comment56);
        scriptNode51.setEncodedSourceStart((int) (byte) 100);
        int int62 = scriptNode51.getIntProp(6, 2);
        scriptNode51.setEndLineno(18);
        scriptNode38.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode51);
        scriptNode0.addChildAfter((com.google.javascript.rhino.head.Node) scope9, (com.google.javascript.rhino.head.Node) scriptNode38);
        int int67 = scriptNode38.getEncodedSourceStart();
        com.google.javascript.rhino.head.Token.CommentType commentType71 = null;
        com.google.javascript.rhino.head.ast.Comment comment73 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType71, "Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode74 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str75 = scriptNode74.getEncodedSource();
        scriptNode74.setEncodedSourceEnd(18);
        java.lang.String str78 = comment73.toStringTree(scriptNode74);
        com.google.javascript.rhino.head.Node node80 = com.google.javascript.rhino.head.Node.newString("{\n}\n");
        com.google.javascript.rhino.head.Node node81 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode74, node80);
        scriptNode74.setSourceName("hi!");
        scriptNode38.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode74);
        com.google.javascript.rhino.head.Node node85 = scriptNode38.getNext();
        scriptNode38.setEncodedSourceStart(727575172);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNotNull(scriptNode23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 100 + "'", int67 == 100);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node85);
    }

    @Test
    public void test15655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15655");
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str7 = scriptNode6.getEncodedSource();
        scriptNode6.setEncodedSourceEnd(18);
        java.lang.String str10 = comment5.toStringTree(scriptNode6);
        int int11 = comment5.getType();
        java.lang.String str12 = comment5.getValue();
        java.lang.Object obj14 = comment5.getProp(220850805);
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) comment5);
        java.lang.String str17 = comment5.toSource((-272528452));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = comment5.labelId();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 161 + "'", int11 == 161);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Scope" + "'", str12, "Scope");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Scope" + "'", str17, "Scope");
    }

    @Test
    public void test15656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15656");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        scope1.setLength((int) (byte) 1);
        java.lang.Object obj10 = scope1.getProp((int) 'a');
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap11 = scope1.getSymbolTable();
        int int14 = scope1.getIntProp(5, (-51));
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-51) + "'", int14 == (-51));
    }

    @Test
    public void test15657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15657");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(180367011, (-1369635813));
    }

    @Test
    public void test15658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15658");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0, (int) (short) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType9 = null;
        com.google.javascript.rhino.head.ast.Comment comment11 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType9, "Scope");
        scriptNode6.setParent((com.google.javascript.rhino.head.ast.AstNode) comment11);
        scriptNode6.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = scriptNode6.getTop();
        scriptNode15.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int20 = scriptNode19.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str22 = scriptNode21.getEncodedSource();
        scriptNode21.setEncodedSourceEnd(18);
        scriptNode19.target = scriptNode21;
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode15, (com.google.javascript.rhino.head.Node) scriptNode21);
        scriptNode21.setEncodedSourceEnd(11);
        java.lang.String str29 = scriptNode21.getEncodedSource();
        scriptNode21.setEncodedSource("52\tCOMMENT 52 6\n");
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node(6, (com.google.javascript.rhino.head.Node) scriptNode21);
        java.lang.String str33 = scriptNode21.getEncodedSource();
        com.google.javascript.rhino.head.Node node34 = scriptNode21.target;
        int int35 = scriptNode21.getEndLineno();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap36 = null;
        scriptNode21.setSymbolTable(strMap36);
        boolean boolean38 = scriptNode21.hasSideEffects();
        scriptNode21.flattenSymbolTable(true);
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) scriptNode21, 17);
        boolean boolean43 = scriptNode21.hasSideEffects();
        java.lang.String str44 = scriptNode21.getEncodedSource();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList45 = scriptNode21.getSymbols();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node46 = scope2.getChildBefore((com.google.javascript.rhino.head.Node) scriptNode21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scriptNode15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "52\tCOMMENT 52 6\n" + "'", str33, "52\tCOMMENT 52 6\n");
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "52\tCOMMENT 52 6\n" + "'", str44, "52\tCOMMENT 52 6\n");
        org.junit.Assert.assertNotNull(symbolList45);
    }

    @Test
    public void test15659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15659");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType8 = null;
        com.google.javascript.rhino.head.ast.Comment comment10 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType8, "Scope");
        scriptNode5.setParent((com.google.javascript.rhino.head.ast.AstNode) comment10);
        scope1.setJsDocNode(comment10);
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope16 = scope14.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node17 = scope14.target;
        scope14.setPosition(2);
        scope14.setLength((int) (byte) 1);
        com.google.javascript.rhino.head.Node node22 = scope14.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str24 = scriptNode23.getEncodedSource();
        scriptNode23.setEncodedSourceEnd(18);
        java.lang.String str28 = scriptNode23.makeIndent((int) '#');
        scope14.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode23);
        com.google.javascript.rhino.head.ast.Scope.joinScopes(scope1, (com.google.javascript.rhino.head.ast.Scope) scriptNode23);
        com.google.javascript.rhino.head.ast.Scope scope31 = scope1.getParentScope();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType35 = null;
        com.google.javascript.rhino.head.ast.Comment comment37 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType35, "Scope");
        scriptNode32.setParent((com.google.javascript.rhino.head.ast.AstNode) comment37);
        scriptNode32.setEncodedSourceStart((int) (byte) 100);
        int int43 = scriptNode32.getIntProp(6, 2);
        int int44 = scriptNode32.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str46 = scriptNode45.getEncodedSource();
        int int47 = scriptNode45.getBaseLineno();
        java.lang.String str48 = scriptNode45.getNextTempName();
        scriptNode32.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode45);
        int int50 = scriptNode32.getEndLineno();
        scope1.addChildrenToFront((com.google.javascript.rhino.head.Node) scriptNode32);
        com.google.javascript.rhino.head.ast.Scope scope53 = scriptNode32.getDefiningScope("            ");
        com.google.javascript.rhino.head.ast.Scope scope54 = scriptNode32.getEnclosingScope();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList55 = scriptNode32.getFunctions();
        com.google.javascript.rhino.head.ast.Symbol symbol56 = null;
        // The following exception was thrown during execution in test generation
        try {
            scriptNode32.putSymbol(symbol56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "                                                                      " + "'", str28, "                                                                      ");
        org.junit.Assert.assertNull(scope31);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "$0" + "'", str48, "$0");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNull(scope53);
        org.junit.Assert.assertNull(scope54);
        org.junit.Assert.assertNotNull(functionNodeList55);
    }

    @Test
    public void test15660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15660");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType8 = null;
        com.google.javascript.rhino.head.ast.Comment comment10 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType8, "Scope");
        scriptNode5.setParent((com.google.javascript.rhino.head.ast.AstNode) comment10);
        scope1.setJsDocNode(comment10);
        com.google.javascript.rhino.head.Token.CommentType commentType13 = null;
        comment10.setCommentType(commentType13);
        java.lang.String str15 = comment10.getValue();
        java.lang.String str16 = comment10.toSource();
        java.lang.String str17 = comment10.getValue();
        com.google.javascript.rhino.head.Token.CommentType commentType18 = comment10.getCommentType();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = comment10.getAstRoot();
        com.google.javascript.rhino.head.Token.CommentType commentType20 = comment10.getCommentType();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Scope" + "'", str15, "Scope");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Scope" + "'", str16, "Scope");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Scope" + "'", str17, "Scope");
        org.junit.Assert.assertNull(commentType18);
        org.junit.Assert.assertNull(astRoot19);
        org.junit.Assert.assertNull(commentType20);
    }

    @Test
    public void test15661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15661");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((-547629399), (-769830162));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((-366869103));
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator5 = scriptNode4.spliterator();
        java.lang.Object obj6 = scriptNode4.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType10 = null;
        com.google.javascript.rhino.head.ast.Comment comment12 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType10, "Scope");
        scriptNode7.setParent((com.google.javascript.rhino.head.ast.AstNode) comment12);
        scriptNode7.setEncodedSourceStart((int) (byte) 100);
        int int18 = scriptNode7.getIntProp(6, 2);
        int int19 = scriptNode7.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getEncodedSource();
        int int22 = scriptNode20.getBaseLineno();
        java.lang.String str23 = scriptNode20.getNextTempName();
        scriptNode7.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode20);
        java.lang.String str25 = scriptNode20.debugPrint();
        int int26 = scriptNode20.getEndLineno();
        scriptNode20.setSourceName("hi!");
        int int29 = scriptNode20.getLineno();
        scriptNode4.setCompilerData((java.lang.Object) scriptNode20);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType35 = null;
        com.google.javascript.rhino.head.ast.Comment comment37 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType35, "Scope");
        scriptNode32.setParent((com.google.javascript.rhino.head.ast.AstNode) comment37);
        scriptNode32.setEncodedSourceStart((int) (byte) 100);
        int int43 = scriptNode32.getIntProp(6, 2);
        int int44 = scriptNode32.getParamCount();
        java.lang.String str45 = scriptNode32.debugPrint();
        com.google.javascript.rhino.head.ast.Scope scope47 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope49 = scope47.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node50 = scope47.target;
        scope47.setPosition(2);
        int int53 = scope47.getLineno();
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node((-51), (com.google.javascript.rhino.head.Node) scriptNode32, (com.google.javascript.rhino.head.Node) scope47);
        int int55 = scriptNode32.getLineno();
        scriptNode20.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode32);
        scriptNode20.flattenSymbolTable(false);
        scope2.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode20);
        org.junit.Assert.assertNotNull(nodeSpliterator5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "$0" + "'", str23, "$0");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "51\t    SCRIPT 52 1\n" + "'", str25, "51\t    SCRIPT 52 1\n");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str45, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertNull(scope49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test15662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15662");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(13);
        int int4 = scriptNode1.getIntProp(161, (int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = scriptNode1.getTop();
        scriptNode1.setEncodedSource("0\tBLOCK 0 1\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(scriptNode5);
    }

    @Test
    public void test15663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15663");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        com.google.javascript.rhino.head.Node node2 = scriptNode0.getLastSibling();
        java.lang.String str3 = scriptNode0.shortName();
        boolean boolean4 = scriptNode0.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType10 = null;
        com.google.javascript.rhino.head.ast.Comment comment12 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType10, "Scope");
        scriptNode7.setParent((com.google.javascript.rhino.head.ast.AstNode) comment12);
        scriptNode7.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = scriptNode7.getTop();
        scriptNode16.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType23 = null;
        com.google.javascript.rhino.head.ast.Comment comment25 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType23, "Scope");
        scriptNode20.setParent((com.google.javascript.rhino.head.ast.AstNode) comment25);
        scriptNode20.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = scriptNode20.getTop();
        scriptNode29.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int34 = scriptNode33.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str36 = scriptNode35.getEncodedSource();
        scriptNode35.setEncodedSourceEnd(18);
        scriptNode33.target = scriptNode35;
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode29, (com.google.javascript.rhino.head.Node) scriptNode35);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType45 = null;
        com.google.javascript.rhino.head.ast.Comment comment47 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType45, "Scope");
        scriptNode42.setParent((com.google.javascript.rhino.head.ast.AstNode) comment47);
        scriptNode42.setEncodedSourceStart((int) (byte) 100);
        int int53 = scriptNode42.getIntProp(6, 2);
        int int54 = scriptNode42.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope56 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope58 = scope56.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node59 = scope56.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType63 = null;
        com.google.javascript.rhino.head.ast.Comment comment65 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType63, "Scope");
        scriptNode60.setParent((com.google.javascript.rhino.head.ast.AstNode) comment65);
        scope56.setJsDocNode(comment65);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode68 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType71 = null;
        com.google.javascript.rhino.head.ast.Comment comment73 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType71, "Scope");
        scriptNode68.setParent((com.google.javascript.rhino.head.ast.AstNode) comment73);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList75 = scriptNode68.getSymbols();
        com.google.javascript.rhino.head.Node node76 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode42, (com.google.javascript.rhino.head.Node) scope56, (com.google.javascript.rhino.head.Node) scriptNode68);
        scriptNode35.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode42);
        com.google.javascript.rhino.head.ast.Scope scope79 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope81 = scope79.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node82 = scope79.target;
        scope79.setPosition(2);
        scope79.setLength((int) (byte) 1);
        com.google.javascript.rhino.head.Node node87 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) scriptNode16, (com.google.javascript.rhino.head.Node) scriptNode35, (com.google.javascript.rhino.head.Node) scope79);
        int int88 = scriptNode35.getEndLineno();
        com.google.javascript.rhino.head.Node node89 = new com.google.javascript.rhino.head.Node(22, (com.google.javascript.rhino.head.Node) scriptNode35);
        scriptNode0.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode35);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ScriptNode" + "'", str3, "ScriptNode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(scriptNode29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(scope58);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(symbolList75);
        org.junit.Assert.assertNull(scope81);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
    }

    @Test
    public void test15664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15664");
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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = null;
        java.lang.String str33 = scriptNode10.toStringTree(scriptNode32);
        java.lang.String str34 = scriptNode10.getSourceName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType38 = null;
        com.google.javascript.rhino.head.ast.Comment comment40 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType38, "Scope");
        scriptNode35.setParent((com.google.javascript.rhino.head.ast.AstNode) comment40);
        scriptNode35.setEncodedSourceStart((int) (byte) 100);
        int int46 = scriptNode35.getIntProp(6, 2);
        int int47 = scriptNode35.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str49 = scriptNode48.getEncodedSource();
        int int50 = scriptNode48.getBaseLineno();
        java.lang.String str51 = scriptNode48.getNextTempName();
        scriptNode35.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode48);
        int int53 = scriptNode35.getEndLineno();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator54 = scriptNode35.spliterator();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator55 = scriptNode35.spliterator();
        com.google.javascript.rhino.head.ast.Symbol symbol57 = scriptNode35.getSymbol("                                                {\n                                                }\n");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode58 = scriptNode35.getTop();
        scriptNode35.flattenSymbolTable(false);
        scriptNode10.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str63 = scriptNode35.getRegexpString((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                      " + "'", str15, "                                                                      ");
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "$0" + "'", str51, "$0");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(nodeSpliterator54);
        org.junit.Assert.assertNotNull(nodeSpliterator55);
        org.junit.Assert.assertNull(symbol57);
        org.junit.Assert.assertNotNull(scriptNode58);
    }

    @Test
    public void test15665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15665");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        int int12 = scriptNode1.getIntProp(6, 2);
        int int13 = scriptNode1.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str15 = scriptNode14.getEncodedSource();
        int int16 = scriptNode14.getBaseLineno();
        java.lang.String str17 = scriptNode14.getNextTempName();
        scriptNode1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode14);
        java.lang.String str19 = scriptNode14.debugPrint();
        int int20 = scriptNode14.getEndLineno();
        int int21 = scriptNode14.getType();
        int int22 = scriptNode14.getFunctionCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType26, "Scope");
        scriptNode23.setParent((com.google.javascript.rhino.head.ast.AstNode) comment28);
        scriptNode23.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = scriptNode23.getTop();
        java.lang.String str33 = scriptNode32.shortName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType37 = null;
        com.google.javascript.rhino.head.ast.Comment comment39 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType37, "Scope");
        scriptNode34.setParent((com.google.javascript.rhino.head.ast.AstNode) comment39);
        scriptNode34.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = scriptNode34.getTop();
        java.lang.String str44 = scriptNode43.shortName();
        scriptNode32.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode43);
        java.lang.String str47 = scriptNode32.makeIndent(6);
        scriptNode32.putProp((-1), (java.lang.Object) "0\tBLOCK 0 1\n");
        int int51 = scriptNode32.getType();
        scriptNode32.clearParentScope();
        scriptNode14.setTop(scriptNode32);
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node(1487440633, (com.google.javascript.rhino.head.Node) scriptNode14, (-207519868));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$0" + "'", str17, "$0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "51\t    SCRIPT 52 1\n" + "'", str19, "51\t    SCRIPT 52 1\n");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 136 + "'", int21 == 136);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(scriptNode32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ScriptNode" + "'", str33, "ScriptNode");
        org.junit.Assert.assertNotNull(scriptNode43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ScriptNode" + "'", str44, "ScriptNode");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "            " + "'", str47, "            ");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 136 + "'", int51 == 136);
    }

    @Test
    public void test15666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15666");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int2 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope scope4 = scriptNode1.getDefiningScope("51\t    SCRIPT 52 1\n");
        boolean boolean5 = scriptNode1.hasSideEffects();
        java.lang.String str6 = scriptNode1.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = scriptNode1.getTop();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "136" + "'", str6, "136");
        org.junit.Assert.assertNotNull(scriptNode7);
    }

    @Test
    public void test15667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15667");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int4 = scriptNode1.getIntProp(23, (int) (short) 1);
        com.google.javascript.rhino.head.Node node6 = scriptNode1.setType(0);
        int int7 = scriptNode1.getPosition();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str11 = scriptNode9.toSource(18);
        java.lang.Object obj12 = scriptNode9.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType17 = null;
        com.google.javascript.rhino.head.ast.Comment comment19 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType17, "Scope");
        scriptNode14.setParent((com.google.javascript.rhino.head.ast.AstNode) comment19);
        scriptNode14.setEncodedSourceStart((int) (byte) 100);
        int int25 = scriptNode14.getIntProp(6, 2);
        int int26 = scriptNode14.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope30 = scope28.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node31 = scope28.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType35 = null;
        com.google.javascript.rhino.head.ast.Comment comment37 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType35, "Scope");
        scriptNode32.setParent((com.google.javascript.rhino.head.ast.AstNode) comment37);
        scope28.setJsDocNode(comment37);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType43 = null;
        com.google.javascript.rhino.head.ast.Comment comment45 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType43, "Scope");
        scriptNode40.setParent((com.google.javascript.rhino.head.ast.AstNode) comment45);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList47 = scriptNode40.getSymbols();
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode14, (com.google.javascript.rhino.head.Node) scope28, (com.google.javascript.rhino.head.Node) scriptNode40);
        scriptNode40.setPosition((int) (byte) 0);
        com.google.javascript.rhino.head.Node node51 = scriptNode40.target;
        scriptNode9.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode40);
        java.lang.String str53 = scriptNode9.getSourceName();
        com.google.javascript.rhino.head.ast.Scope scope55 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope57 = scope55.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node58 = scope55.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int63 = scriptNode60.getIntProp(23, (int) (short) 1);
        boolean boolean64 = scriptNode60.hasSideEffects();
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node(4, (com.google.javascript.rhino.head.Node) scriptNode9, (com.google.javascript.rhino.head.Node) scope55, (com.google.javascript.rhino.head.Node) scriptNode60);
        com.google.javascript.rhino.head.Node node67 = scriptNode9.setType((-7));
        scriptNode1.setCompilerData((java.lang.Object) scriptNode9);
        int int69 = scriptNode9.getRegexpCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                    {\n                                    }\n" + "'", str11, "                                    {\n                                    }\n");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(scope30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(symbolList47);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(scope57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test15668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15668");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        int int9 = scriptNode0.getEncodedSourceStart();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList10 = scriptNode0.getChildScopes();
        java.lang.String str12 = scriptNode0.makeIndent((int) '#');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType18 = null;
        com.google.javascript.rhino.head.ast.Comment comment20 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType18, "Scope");
        scriptNode15.setParent((com.google.javascript.rhino.head.ast.AstNode) comment20);
        scriptNode15.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = scriptNode15.getTop();
        scriptNode24.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int29 = scriptNode28.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str31 = scriptNode30.getEncodedSource();
        scriptNode30.setEncodedSourceEnd(18);
        scriptNode28.target = scriptNode30;
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode24, (com.google.javascript.rhino.head.Node) scriptNode30);
        com.google.javascript.rhino.head.Token.CommentType commentType38 = null;
        com.google.javascript.rhino.head.ast.Comment comment40 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType38, "Scope");
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node(21, (com.google.javascript.rhino.head.Node) scriptNode24, (com.google.javascript.rhino.head.Node) comment40);
        scriptNode0.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode24);
        int int43 = scriptNode0.getParamCount();
        com.google.javascript.rhino.head.ast.Scope scope45 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope47 = scope45.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node48 = scope45.target;
        scope45.setPosition(2);
        java.lang.String str51 = scope45.toSource();
        boolean boolean52 = scope45.hasSideEffects();
        int int53 = scope45.getType();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode55 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType58 = null;
        com.google.javascript.rhino.head.ast.Comment comment60 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType58, "Scope");
        scriptNode55.setParent((com.google.javascript.rhino.head.ast.AstNode) comment60);
        scriptNode55.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str64 = scriptNode55.getSourceName();
        int int65 = scriptNode55.getFunctionCount();
        scope45.putProp(19, (java.lang.Object) scriptNode55);
        com.google.javascript.rhino.head.Node node68 = scriptNode55.setType((int) (byte) -1);
        scriptNode0.setCompilerData((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.head.Node node70 = scriptNode0.target;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(scopeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                      " + "'", str12, "                                                                      ");
        org.junit.Assert.assertNotNull(scriptNode24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(scope47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "{\n}\n" + "'", str51, "{\n}\n");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 129 + "'", int53 == 129);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNull(node70);
    }

    @Test
    public void test15669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15669");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10, (int) (byte) -1);
        java.lang.String str3 = scope2.toString();
        scope2.putIntProp((-314896491), 98666588);
        scope2.setPosition(1246415336);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "129" + "'", str3, "129");
    }

    @Test
    public void test15670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15670");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = scriptNode0.getTop();
        java.lang.String str10 = scriptNode9.shortName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType14 = null;
        com.google.javascript.rhino.head.ast.Comment comment16 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType14, "Scope");
        scriptNode11.setParent((com.google.javascript.rhino.head.ast.AstNode) comment16);
        scriptNode11.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = scriptNode11.getTop();
        java.lang.String str21 = scriptNode20.shortName();
        scriptNode9.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode20);
        java.lang.String str24 = scriptNode9.makeIndent(6);
        scriptNode9.putProp((-1), (java.lang.Object) "0\tBLOCK 0 1\n");
        java.lang.String str28 = scriptNode9.toString();
        scriptNode9.clearParentScope();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType33 = null;
        com.google.javascript.rhino.head.ast.Comment comment35 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType33, "Scope");
        scriptNode30.setParent((com.google.javascript.rhino.head.ast.AstNode) comment35);
        scriptNode30.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = scriptNode30.getTop();
        int int40 = scriptNode9.compareTo((com.google.javascript.rhino.head.ast.AstNode) scriptNode39);
        org.junit.Assert.assertNotNull(scriptNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ScriptNode" + "'", str10, "ScriptNode");
        org.junit.Assert.assertNotNull(scriptNode20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ScriptNode" + "'", str21, "ScriptNode");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "            " + "'", str24, "            ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "136" + "'", str28, "136");
        org.junit.Assert.assertNotNull(scriptNode39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1630693578 + "'", int40 == 1630693578);
    }

    @Test
    public void test15671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15671");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int2 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str4 = scriptNode3.getEncodedSource();
        scriptNode3.setEncodedSourceEnd(18);
        scriptNode1.target = scriptNode3;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((-1));
        scriptNode9.setLineno((int) (byte) 1);
        scriptNode1.setCompilerData((java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.ast.Comment comment13 = scriptNode1.getJsDocNode();
        java.lang.String str15 = scriptNode1.toSource((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = scriptNode1.getParamOrVarName(1320165685);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(comment13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                {\n                                                                }\n" + "'", str15, "                                                                {\n                                                                }\n");
    }

    @Test
    public void test15672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15672");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope4 = scope2.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node5 = scope2.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = null;
        scope2.setTop(scriptNode6);
        scriptNode0.target = scope2;
        java.lang.String str10 = scriptNode0.toSource((int) 'a');
        int int11 = scriptNode0.getPosition();
        boolean boolean12 = scriptNode0.hasSideEffects();
        java.lang.Object obj13 = scriptNode0.getCompilerData();
        java.lang.String str14 = scriptNode0.getNextTempName();
        com.google.javascript.rhino.head.ast.Symbol symbol16 = scriptNode0.getSymbol("52\tCOMMENT 52 6\n");
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                                                                                                                  {\n                                                                                                                                                                                                  }\n" + "'", str10, "                                                                                                                                                                                                  {\n                                                                                                                                                                                                  }\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$0" + "'", str14, "$0");
        org.junit.Assert.assertNull(symbol16);
    }

    @Test
    public void test15673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15673");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        scriptNode0.setEncodedSourceEnd(18);
        java.lang.Object obj4 = scriptNode0.getCompilerData();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap5 = scriptNode0.getSymbolTable();
        com.google.javascript.rhino.head.ast.Scope scope7 = scriptNode0.getDefiningScope("                                                    Scope");
        scriptNode0.setEncodedSourceEnd(161);
        int int10 = scriptNode0.getLineno();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test15674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15674");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope(15, (-296494744));
        scope2.putIntProp((-53635080), 5);
    }

    @Test
    public void test15675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15675");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope4 = scope2.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node5 = scope2.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = null;
        scope2.setTop(scriptNode6);
        scriptNode0.target = scope2;
        java.lang.String str10 = scriptNode0.toSource((int) 'a');
        com.google.javascript.rhino.head.Token.CommentType commentType15 = null;
        com.google.javascript.rhino.head.ast.Comment comment17 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType15, "Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str19 = scriptNode18.getEncodedSource();
        scriptNode18.setEncodedSourceEnd(18);
        java.lang.String str22 = comment17.toStringTree(scriptNode18);
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newString("{\n}\n");
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode18, node24);
        scriptNode18.setSourceName("hi!");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType32 = null;
        com.google.javascript.rhino.head.ast.Comment comment34 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType32, "Scope");
        scriptNode29.setParent((com.google.javascript.rhino.head.ast.AstNode) comment34);
        scriptNode29.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = scriptNode29.getTop();
        scriptNode38.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int43 = scriptNode42.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str45 = scriptNode44.getEncodedSource();
        scriptNode44.setEncodedSourceEnd(18);
        scriptNode42.target = scriptNode44;
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode38, (com.google.javascript.rhino.head.Node) scriptNode44);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType54 = null;
        com.google.javascript.rhino.head.ast.Comment comment56 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType54, "Scope");
        scriptNode51.setParent((com.google.javascript.rhino.head.ast.AstNode) comment56);
        scriptNode51.setEncodedSourceStart((int) (byte) 100);
        int int62 = scriptNode51.getIntProp(6, 2);
        int int63 = scriptNode51.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope65 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope67 = scope65.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node68 = scope65.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode69 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType72 = null;
        com.google.javascript.rhino.head.ast.Comment comment74 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType72, "Scope");
        scriptNode69.setParent((com.google.javascript.rhino.head.ast.AstNode) comment74);
        scope65.setJsDocNode(comment74);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode77 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType80 = null;
        com.google.javascript.rhino.head.ast.Comment comment82 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType80, "Scope");
        scriptNode77.setParent((com.google.javascript.rhino.head.ast.AstNode) comment82);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList84 = scriptNode77.getSymbols();
        com.google.javascript.rhino.head.Node node85 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode51, (com.google.javascript.rhino.head.Node) scope65, (com.google.javascript.rhino.head.Node) scriptNode77);
        com.google.javascript.rhino.head.Node node87 = scriptNode51.setType((int) (short) 100);
        com.google.javascript.rhino.head.Node node88 = new com.google.javascript.rhino.head.Node(2, (com.google.javascript.rhino.head.Node) scriptNode18, (com.google.javascript.rhino.head.Node) scriptNode38, (com.google.javascript.rhino.head.Node) scriptNode51);
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode18);
        java.lang.String str90 = scriptNode0.toString();
        com.google.javascript.rhino.head.ast.Symbol symbol92 = scriptNode0.getSymbol("                                                                                                                                                                                                        Scope");
        scriptNode0.clearParentScope();
        java.lang.String str94 = scriptNode0.getSourceName();
        scriptNode0.setLength(1583199871);
        com.google.javascript.rhino.head.Node node97 = scriptNode0.getLastSibling();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode98 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int99 = scriptNode0.addFunction(functionNode98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                                                                                                                  {\n                                                                                                                                                                                                  }\n" + "'", str10, "                                                                                                                                                                                                  {\n                                                                                                                                                                                                  }\n");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(scriptNode38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(scope67);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(symbolList84);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "136" + "'", str90, "136");
        org.junit.Assert.assertNull(symbol92);
        org.junit.Assert.assertNull(str94);
        org.junit.Assert.assertNotNull(node97);
    }

    @Test
    public void test15676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15676");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList7 = scriptNode0.getSymbols();
        java.lang.String str8 = scriptNode0.debugPrint();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str10 = scriptNode9.getEncodedSource();
        com.google.javascript.rhino.head.Node node11 = scriptNode9.getLastSibling();
        scriptNode9.setEncodedSource("Scope");
        scriptNode9.setEndLineno(100);
        scriptNode0.setCompilerData((java.lang.Object) 100);
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope18.putProp(25, (java.lang.Object) 100L);
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) scope18);
        com.google.javascript.rhino.head.Node node23 = scriptNode0.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType27 = null;
        com.google.javascript.rhino.head.ast.Comment comment29 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType27, "Scope");
        scriptNode24.setParent((com.google.javascript.rhino.head.ast.AstNode) comment29);
        scriptNode24.setEncodedSourceStart((int) (byte) 100);
        int int35 = scriptNode24.getIntProp(6, 2);
        int int36 = scriptNode24.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str38 = scriptNode37.getEncodedSource();
        int int39 = scriptNode37.getBaseLineno();
        java.lang.String str40 = scriptNode37.getNextTempName();
        scriptNode24.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode37);
        scriptNode37.setEncodedSource("                        ");
        int int44 = scriptNode37.getLineno();
        scriptNode0.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode37);
        int int46 = scriptNode0.getLineno();
        int int47 = scriptNode0.getRegexpCount();
        scriptNode0.setEncodedSourceStart((-613442063));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType54 = null;
        com.google.javascript.rhino.head.ast.Comment comment56 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType54, "Scope");
        scriptNode51.setParent((com.google.javascript.rhino.head.ast.AstNode) comment56);
        scriptNode51.setEncodedSourceStart((int) (byte) 100);
        int int62 = scriptNode51.getIntProp(6, 2);
        int int63 = scriptNode51.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope65 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope67 = scope65.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node68 = scope65.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode69 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType72 = null;
        com.google.javascript.rhino.head.ast.Comment comment74 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType72, "Scope");
        scriptNode69.setParent((com.google.javascript.rhino.head.ast.AstNode) comment74);
        scope65.setJsDocNode(comment74);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode77 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType80 = null;
        com.google.javascript.rhino.head.ast.Comment comment82 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType80, "Scope");
        scriptNode77.setParent((com.google.javascript.rhino.head.ast.AstNode) comment82);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList84 = scriptNode77.getSymbols();
        com.google.javascript.rhino.head.Node node85 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode51, (com.google.javascript.rhino.head.Node) scope65, (com.google.javascript.rhino.head.Node) scriptNode77);
        scriptNode77.setPosition((int) (byte) 0);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList88 = scriptNode77.getFunctions();
        java.lang.String str89 = scriptNode77.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot90 = scriptNode77.getAstRoot();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode0, (com.google.javascript.rhino.head.ast.Scope) scriptNode77);
        java.lang.String str92 = scriptNode0.getNextTempName();
        com.google.javascript.rhino.head.ast.Symbol symbol93 = null;
        // The following exception was thrown during execution in test generation
        try {
            scriptNode0.putSymbol(symbol93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(symbolList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str8, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "$0" + "'", str40, "$0");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(scope67);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(symbolList84);
        org.junit.Assert.assertNotNull(functionNodeList88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "52\t  SCRIPT 0 1\n" + "'", str89, "52\t  SCRIPT 0 1\n");
        org.junit.Assert.assertNull(astRoot90);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "$0" + "'", str92, "$0");
    }

    @Test
    public void test15677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15677");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((-107359633), (-107359633));
        com.google.javascript.rhino.head.ast.Scope scope4 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope6 = scope4.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node7 = scope4.target;
        scope4.setPosition(2);
        java.lang.String str10 = scope4.toSource();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap11 = scope4.getSymbolTable();
        boolean boolean12 = scope4.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType16 = null;
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType16, "Scope");
        scriptNode13.setParent((com.google.javascript.rhino.head.ast.AstNode) comment18);
        scriptNode13.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = scriptNode13.getTop();
        scope4.target = scriptNode13;
        com.google.javascript.rhino.head.Node node24 = scriptNode13.target;
        int int25 = scriptNode13.getAbsolutePosition();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType29 = null;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType29, "Scope");
        scriptNode26.setParent((com.google.javascript.rhino.head.ast.AstNode) comment31);
        scriptNode26.setEncodedSourceStart((int) (byte) 100);
        int int37 = scriptNode26.getIntProp(6, 2);
        int int38 = scriptNode26.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str40 = scriptNode39.getEncodedSource();
        int int41 = scriptNode39.getBaseLineno();
        java.lang.String str42 = scriptNode39.getNextTempName();
        scriptNode26.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode39);
        java.lang.String str44 = scriptNode39.debugPrint();
        com.google.javascript.rhino.head.ast.Scope scope48 = new com.google.javascript.rhino.head.ast.Scope(22, (int) 'a');
        java.lang.String str50 = scope48.toSource(12);
        scope48.setRelative(1);
        scriptNode39.putProp(17, (java.lang.Object) 1);
        scriptNode13.target = scriptNode39;
        int int55 = scriptNode13.getEncodedSourceEnd();
        java.lang.Object obj56 = scriptNode13.getCompilerData();
        java.lang.String str57 = scriptNode13.shortName();
        scriptNode13.setSourceName("    {\n      {\n      }\n    }\n");
        // The following exception was thrown during execution in test generation
        try {
            scope2.setContinue((com.google.javascript.rhino.head.Node) scriptNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{\n}\n" + "'", str10, "{\n}\n");
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(scriptNode22);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "$0" + "'", str42, "$0");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "51\t    SCRIPT 52 1\n" + "'", str44, "51\t    SCRIPT 52 1\n");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "                        {\n                        }\n" + "'", str50, "                        {\n                        }\n");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ScriptNode" + "'", str57, "ScriptNode");
    }

    @Test
    public void test15678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15678");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType5 = null;
        com.google.javascript.rhino.head.ast.Comment comment7 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType5, "Scope");
        scriptNode2.setParent((com.google.javascript.rhino.head.ast.AstNode) comment7);
        scriptNode2.setEncodedSourceStart((int) (byte) 100);
        int int13 = scriptNode2.getIntProp(6, 2);
        int int14 = scriptNode2.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope16 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope18 = scope16.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node19 = scope16.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType23 = null;
        com.google.javascript.rhino.head.ast.Comment comment25 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType23, "Scope");
        scriptNode20.setParent((com.google.javascript.rhino.head.ast.AstNode) comment25);
        scope16.setJsDocNode(comment25);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType31 = null;
        com.google.javascript.rhino.head.ast.Comment comment33 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType31, "Scope");
        scriptNode28.setParent((com.google.javascript.rhino.head.ast.AstNode) comment33);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList35 = scriptNode28.getSymbols();
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode2, (com.google.javascript.rhino.head.Node) scope16, (com.google.javascript.rhino.head.Node) scriptNode28);
        com.google.javascript.rhino.head.Node node38 = scriptNode2.setType((int) (short) 100);
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newNumber(10.0d);
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(129, (com.google.javascript.rhino.head.Node) scriptNode2, node40, 13);
        int int43 = scriptNode2.getFunctionCount();
        scriptNode2.setEncodedSourceEnd(14);
        scriptNode2.setBaseLineno(1246415336);
        int int48 = scriptNode2.getType();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(symbolList35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
    }

    @Test
    public void test15679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15679");
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope((int) (short) -1, 100);
        int int4 = scope3.getLength();
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope9 = scope7.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node10 = scope7.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType14 = null;
        com.google.javascript.rhino.head.ast.Comment comment16 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType14, "Scope");
        scriptNode11.setParent((com.google.javascript.rhino.head.ast.AstNode) comment16);
        scope7.setJsDocNode(comment16);
        java.lang.String str20 = comment16.toSource((int) (short) 10);
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) comment16);
        java.lang.Object obj23 = comment16.getProp((int) (short) -1);
        java.lang.String str25 = comment16.makeIndent((int) (short) -1);
        scope3.setJsDocNode(comment16);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int31 = scriptNode28.getIntProp(23, (int) (short) 1);
        com.google.javascript.rhino.head.ast.Scope scope33 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope33.setPosition(100);
        com.google.javascript.rhino.head.Node node36 = scope33.getLastSibling();
        node36.removeChildren();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator38 = node36.spliterator();
        scriptNode28.setCompilerData((java.lang.Object) node36);
        java.lang.String str40 = scriptNode28.getSourceName();
        int int41 = scriptNode28.getEncodedSourceStart();
        scriptNode28.setEncodedSourceStart((int) (byte) 0);
        com.google.javascript.rhino.head.Token.CommentType commentType47 = null;
        com.google.javascript.rhino.head.ast.Comment comment49 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType47, "Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str51 = scriptNode50.getEncodedSource();
        scriptNode50.setEncodedSourceEnd(18);
        java.lang.String str54 = comment49.toStringTree(scriptNode50);
        com.google.javascript.rhino.head.Node node56 = com.google.javascript.rhino.head.Node.newString("{\n}\n");
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode50, node56);
        com.google.javascript.rhino.head.Node node58 = new com.google.javascript.rhino.head.Node(18, (com.google.javascript.rhino.head.Node) scope3, (com.google.javascript.rhino.head.Node) scriptNode28, (com.google.javascript.rhino.head.Node) scriptNode50);
        com.google.javascript.rhino.head.Node node59 = scriptNode50.getLastChild();
        int int60 = scriptNode50.depth();
        scriptNode50.setLineno(5);
        com.google.javascript.rhino.head.Node node63 = scriptNode50.getLastChild();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                    Scope" + "'", str20, "                    Scope");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeSpliterator38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(node63);
    }

    @Test
    public void test15680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15680");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        java.lang.String str7 = scope1.toSource();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap8 = scope1.getSymbolTable();
        boolean boolean9 = scope1.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType13 = null;
        com.google.javascript.rhino.head.ast.Comment comment15 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType13, "Scope");
        scriptNode10.setParent((com.google.javascript.rhino.head.ast.AstNode) comment15);
        scriptNode10.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = scriptNode10.getTop();
        scope1.target = scriptNode10;
        com.google.javascript.rhino.head.Node node21 = scriptNode10.target;
        int int22 = scriptNode10.getPosition();
        int int23 = scriptNode10.getFunctionCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType27 = null;
        com.google.javascript.rhino.head.ast.Comment comment29 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType27, "Scope");
        scriptNode24.setParent((com.google.javascript.rhino.head.ast.AstNode) comment29);
        scriptNode24.setEncodedSourceStart((int) (byte) 100);
        int int35 = scriptNode24.getIntProp(6, 2);
        int int36 = scriptNode24.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str38 = scriptNode37.getEncodedSource();
        int int39 = scriptNode37.getBaseLineno();
        java.lang.String str40 = scriptNode37.getNextTempName();
        scriptNode24.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode37);
        scriptNode37.setEncodedSource("                        ");
        int int44 = scriptNode37.getLineno();
        java.lang.String str45 = scriptNode10.toStringTree(scriptNode37);
        com.google.javascript.rhino.head.Token.CommentType commentType48 = null;
        com.google.javascript.rhino.head.ast.Comment comment50 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 0, 21, commentType48, "");
        comment50.setRelative(3);
        scriptNode10.setCompilerData((java.lang.Object) comment50);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode54 = scriptNode10.getEnclosingFunction();
        int int55 = scriptNode10.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.Symbol symbol57 = scriptNode10.getSymbol("-1\t  SCRIPT -53 1\n");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str59 = scriptNode10.getParamOrVarName(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\n}\n" + "'", str7, "{\n}\n");
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(scriptNode19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-53) + "'", int22 == (-53));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "$0" + "'", str40, "$0");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(functionNode54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertNull(symbol57);
    }

    @Test
    public void test15681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15681");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        int int11 = scriptNode0.getIntProp(6, 2);
        int int12 = scriptNode0.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str14 = scriptNode13.getEncodedSource();
        int int15 = scriptNode13.getBaseLineno();
        java.lang.String str16 = scriptNode13.getNextTempName();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode13);
        java.lang.String str18 = scriptNode13.debugPrint();
        java.lang.String str20 = scriptNode13.toSource((int) (short) 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType26, "Scope");
        scriptNode23.setParent((com.google.javascript.rhino.head.ast.AstNode) comment28);
        scriptNode23.setEncodedSourceStart((int) (byte) 100);
        int int34 = scriptNode23.getIntProp(6, 2);
        int int35 = scriptNode23.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str37 = scriptNode36.getEncodedSource();
        int int38 = scriptNode36.getBaseLineno();
        java.lang.String str39 = scriptNode36.getNextTempName();
        scriptNode23.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode36);
        java.lang.String str41 = scriptNode36.toSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType47 = null;
        com.google.javascript.rhino.head.ast.Comment comment49 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType47, "Scope");
        scriptNode44.setParent((com.google.javascript.rhino.head.ast.AstNode) comment49);
        scriptNode44.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = scriptNode44.getTop();
        scriptNode53.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int58 = scriptNode57.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str60 = scriptNode59.getEncodedSource();
        scriptNode59.setEncodedSourceEnd(18);
        scriptNode57.target = scriptNode59;
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode53, (com.google.javascript.rhino.head.Node) scriptNode59);
        com.google.javascript.rhino.head.Token.CommentType commentType67 = null;
        com.google.javascript.rhino.head.ast.Comment comment69 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType67, "Scope");
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(21, (com.google.javascript.rhino.head.Node) scriptNode53, (com.google.javascript.rhino.head.Node) comment69);
        int int71 = scriptNode53.depth();
        int int72 = scriptNode53.getEndLineno();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor73 = scriptNode53.iterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode74 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType77 = null;
        com.google.javascript.rhino.head.ast.Comment comment79 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType77, "Scope");
        scriptNode74.setParent((com.google.javascript.rhino.head.ast.AstNode) comment79);
        scriptNode74.setEncodedSourceStart((int) (byte) 100);
        int int83 = scriptNode74.getEncodedSourceStart();
        com.google.javascript.rhino.head.Node node85 = new com.google.javascript.rhino.head.Node(25, (com.google.javascript.rhino.head.Node) scriptNode36, (com.google.javascript.rhino.head.Node) scriptNode53, (com.google.javascript.rhino.head.Node) scriptNode74, 23);
        com.google.javascript.rhino.head.Node node86 = new com.google.javascript.rhino.head.Node(35, (com.google.javascript.rhino.head.Node) scriptNode74);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator87 = scriptNode74.spliterator();
        scriptNode13.setParentScope((com.google.javascript.rhino.head.ast.Scope) scriptNode74);
        int int89 = scriptNode74.getLineno();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$0" + "'", str16, "$0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "51\t    SCRIPT 52 1\n" + "'", str18, "51\t    SCRIPT 52 1\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "  {\n  }\n" + "'", str20, "  {\n  }\n");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "$0" + "'", str39, "$0");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "{\n}\n" + "'", str41, "{\n}\n");
        org.junit.Assert.assertNotNull(scriptNode53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(nodeItor73);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 100 + "'", int83 == 100);
        org.junit.Assert.assertNotNull(nodeSpliterator87);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test15682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15682");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node(41);
    }

    @Test
    public void test15683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15683");
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
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor32 = scriptNode20.iterator();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(nodeSpliterator9);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNotNull(nodeSpliterator19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ScriptNode" + "'", str30, "ScriptNode");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(nodeItor32);
    }

    @Test
    public void test15684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15684");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode0.toSource(18);
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("-1\t  SCRIPT -53 1\n-1\t  SCRIPT -53 1\n");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str7 = scriptNode6.getEncodedSource();
        int int8 = scriptNode6.getBaseLineno();
        java.lang.Object obj9 = scriptNode6.getCompilerData();
        scriptNode6.flattenSymbolTable(false);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap12 = null;
        scriptNode6.setSymbolTable(strMap12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str16 = scriptNode14.toSource(18);
        int int17 = scriptNode14.getEndLineno();
        com.google.javascript.rhino.head.ast.Comment comment18 = scriptNode14.getJsDocNode();
        int int19 = scriptNode14.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList20 = scriptNode14.getChildScopes();
        com.google.javascript.rhino.head.ast.Scope scope23 = new com.google.javascript.rhino.head.ast.Scope((int) (short) -1, 100);
        com.google.javascript.rhino.head.ast.Symbol symbol25 = scope23.getSymbol("$0");
        boolean boolean26 = scope23.hasSideEffects();
        boolean boolean27 = scope23.hasChildren();
        scriptNode14.addChildToFront((com.google.javascript.rhino.head.Node) scope23);
        scriptNode6.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode14);
        com.google.javascript.rhino.head.ast.Scope scope32 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope34 = scope32.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node35 = scope32.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType39 = null;
        com.google.javascript.rhino.head.ast.Comment comment41 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType39, "Scope");
        scriptNode36.setParent((com.google.javascript.rhino.head.ast.AstNode) comment41);
        scope32.setJsDocNode(comment41);
        boolean boolean44 = scope32.hasChildren();
        com.google.javascript.rhino.head.ast.Scope scope46 = new com.google.javascript.rhino.head.ast.Scope(9);
        boolean boolean47 = scope46.hasSideEffects();
        java.lang.String str48 = scope46.toSource();
        com.google.javascript.rhino.head.ast.Scope scope50 = new com.google.javascript.rhino.head.ast.Scope(9);
        boolean boolean51 = scope50.hasSideEffects();
        java.lang.String str52 = scope50.toSource();
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node(13, (com.google.javascript.rhino.head.Node) scope32, (com.google.javascript.rhino.head.Node) scope46, (com.google.javascript.rhino.head.Node) scope50, 17);
        java.lang.String str56 = scope50.toSource(4);
        com.google.javascript.rhino.head.Node node58 = new com.google.javascript.rhino.head.Node(7, node5, (com.google.javascript.rhino.head.Node) scriptNode6, (com.google.javascript.rhino.head.Node) scope50, 22);
        scriptNode0.addChildToBack(node5);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator60 = scriptNode0.new NodeIterator();
        // The following exception was thrown during execution in test generation
        try {
            nodeIterator60.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: next() has not been called");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    {\n                                    }\n" + "'", str2, "                                    {\n                                    }\n");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                    {\n                                    }\n" + "'", str16, "                                    {\n                                    }\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(comment18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(scopeList20);
        org.junit.Assert.assertNull(symbol25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "{\n}\n" + "'", str48, "{\n}\n");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "{\n}\n" + "'", str52, "{\n}\n");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "        {\n        }\n" + "'", str56, "        {\n        }\n");
    }

    @Test
    public void test15685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15685");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType6 = null;
        com.google.javascript.rhino.head.ast.Comment comment8 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType6, "Scope");
        scriptNode3.setParent((com.google.javascript.rhino.head.ast.AstNode) comment8);
        scriptNode3.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = scriptNode3.getTop();
        scriptNode12.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int17 = scriptNode16.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str19 = scriptNode18.getEncodedSource();
        scriptNode18.setEncodedSourceEnd(18);
        scriptNode16.target = scriptNode18;
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode12, (com.google.javascript.rhino.head.Node) scriptNode18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str25 = scriptNode24.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType30 = null;
        com.google.javascript.rhino.head.ast.Comment comment32 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType30, "Scope");
        scriptNode27.setParent((com.google.javascript.rhino.head.ast.AstNode) comment32);
        scriptNode27.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str36 = scriptNode27.getSourceName();
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode27, 26);
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node((int) (byte) -1, node23, (com.google.javascript.rhino.head.Node) scriptNode24, (com.google.javascript.rhino.head.Node) scriptNode27);
        com.google.javascript.rhino.head.ast.Scope scope41 = scriptNode27.getDefiningScope("");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        scriptNode27.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode43);
        int int45 = scriptNode27.getType();
        int int48 = scriptNode27.getIntProp(97, (int) (byte) -1);
        java.lang.String str50 = scriptNode27.makeIndent(0);
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node(1583199871, (com.google.javascript.rhino.head.Node) scriptNode27);
        com.google.javascript.rhino.head.ast.Scope scope52 = scriptNode27.getEnclosingScope();
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(scope41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 136 + "'", int45 == 136);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNull(scope52);
    }

    @Test
    public void test15686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15686");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType8 = null;
        com.google.javascript.rhino.head.ast.Comment comment10 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType8, "Scope");
        scriptNode5.setParent((com.google.javascript.rhino.head.ast.AstNode) comment10);
        scope1.setJsDocNode(comment10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType17 = null;
        com.google.javascript.rhino.head.ast.Comment comment19 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType17, "Scope");
        scriptNode14.setParent((com.google.javascript.rhino.head.ast.AstNode) comment19);
        scriptNode14.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = scriptNode14.getTop();
        scriptNode23.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int28 = scriptNode27.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str30 = scriptNode29.getEncodedSource();
        scriptNode29.setEncodedSourceEnd(18);
        scriptNode27.target = scriptNode29;
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode23, (com.google.javascript.rhino.head.Node) scriptNode29);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType39 = null;
        com.google.javascript.rhino.head.ast.Comment comment41 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType39, "Scope");
        scriptNode36.setParent((com.google.javascript.rhino.head.ast.AstNode) comment41);
        scriptNode36.setEncodedSourceStart((int) (byte) 100);
        int int47 = scriptNode36.getIntProp(6, 2);
        int int48 = scriptNode36.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope50 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope52 = scope50.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node53 = scope50.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType57 = null;
        com.google.javascript.rhino.head.ast.Comment comment59 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType57, "Scope");
        scriptNode54.setParent((com.google.javascript.rhino.head.ast.AstNode) comment59);
        scope50.setJsDocNode(comment59);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode62 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType65 = null;
        com.google.javascript.rhino.head.ast.Comment comment67 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType65, "Scope");
        scriptNode62.setParent((com.google.javascript.rhino.head.ast.AstNode) comment67);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList69 = scriptNode62.getSymbols();
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode36, (com.google.javascript.rhino.head.Node) scope50, (com.google.javascript.rhino.head.Node) scriptNode62);
        scriptNode29.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode36);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode72 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType75 = null;
        com.google.javascript.rhino.head.ast.Comment comment77 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType75, "Scope");
        scriptNode72.setParent((com.google.javascript.rhino.head.ast.AstNode) comment77);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList79 = scriptNode72.getSymbols();
        scriptNode36.setSymbols(symbolList79);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList81 = scriptNode36.getSymbols();
        scriptNode36.setPosition(18);
        comment10.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode36);
        scriptNode36.clearParentScope();
        com.google.javascript.rhino.head.Node node86 = scriptNode36.getLastSibling();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(scriptNode23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(scope52);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(symbolList69);
        org.junit.Assert.assertNotNull(symbolList79);
        org.junit.Assert.assertNotNull(symbolList81);
        org.junit.Assert.assertNotNull(node86);
    }

    @Test
    public void test15687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15687");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList7 = scriptNode0.getSymbols();
        java.lang.String str8 = scriptNode0.debugPrint();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str10 = scriptNode9.getEncodedSource();
        com.google.javascript.rhino.head.Node node11 = scriptNode9.getLastSibling();
        scriptNode9.setEncodedSource("Scope");
        scriptNode9.setEndLineno(100);
        scriptNode0.setCompilerData((java.lang.Object) 100);
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope18.putProp(25, (java.lang.Object) 100L);
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) scope18);
        com.google.javascript.rhino.head.ast.Scope scope24 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope26 = scope24.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node27 = scope24.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType31 = null;
        com.google.javascript.rhino.head.ast.Comment comment33 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType31, "Scope");
        scriptNode28.setParent((com.google.javascript.rhino.head.ast.AstNode) comment33);
        scope24.setJsDocNode(comment33);
        scope24.putIntProp(9, 13);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str40 = scriptNode39.getEncodedSource();
        int int41 = scriptNode39.getBaseLineno();
        java.lang.Object obj42 = scriptNode39.getCompilerData();
        scriptNode39.setEncodedSourceBounds((int) '4', 0);
        scope24.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode39);
        scope24.setPosition(5);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType52 = null;
        com.google.javascript.rhino.head.ast.Comment comment54 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType52, "Scope");
        scriptNode49.setParent((com.google.javascript.rhino.head.ast.AstNode) comment54);
        scriptNode49.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode58 = scriptNode49.getTop();
        scriptNode58.setPosition(6);
        scope24.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode58);
        scriptNode0.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode58);
        scriptNode58.setEncodedSourceEnd((int) '#');
        int int65 = scriptNode58.getEncodedSourceEnd();
        scriptNode58.flattenSymbolTable(true);
        org.junit.Assert.assertNotNull(symbolList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str8, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(scope26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(scriptNode58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 35 + "'", int65 == 35);
    }

    @Test
    public void test15688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15688");
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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str35 = scriptNode34.getEncodedSource();
        scriptNode34.setEncodedSourceEnd(18);
        java.lang.String str39 = scriptNode34.makeIndent((int) '#');
        node32.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode34);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator41 = scriptNode34.new NodeIterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray42 = scriptNode34.getParamAndVarConst();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(nodeSpliterator9);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNotNull(nodeSpliterator19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "                                                                      " + "'", str39, "                                                                      ");
    }

    @Test
    public void test15689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15689");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((-700164298), 52);
        com.google.javascript.rhino.head.Node node3 = node2.getFirstChild();
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test15690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15690");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType6 = null;
        com.google.javascript.rhino.head.ast.Comment comment8 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType6, "Scope");
        scriptNode3.setParent((com.google.javascript.rhino.head.ast.AstNode) comment8);
        scriptNode3.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = scriptNode3.getTop();
        scriptNode12.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int17 = scriptNode16.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str19 = scriptNode18.getEncodedSource();
        scriptNode18.setEncodedSourceEnd(18);
        scriptNode16.target = scriptNode18;
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode12, (com.google.javascript.rhino.head.Node) scriptNode18);
        java.lang.String str24 = node23.getJsDoc();
        com.google.javascript.rhino.head.ast.Scope scope26 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope28 = scope26.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node29 = scope26.getLastSibling();
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node(23, node23, (com.google.javascript.rhino.head.Node) scope26, (int) (byte) 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType35 = null;
        com.google.javascript.rhino.head.ast.Comment comment37 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType35, "Scope");
        scriptNode32.setParent((com.google.javascript.rhino.head.ast.AstNode) comment37);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList39 = scriptNode32.getSymbols();
        java.lang.String str40 = scriptNode32.debugPrint();
        scriptNode32.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Scope scope44 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope46 = scope44.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node47 = scope44.target;
        scope44.setPosition(2);
        scope44.putIntProp(17, 25);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap53 = null;
        scope44.setSymbolTable(strMap53);
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node(2, (com.google.javascript.rhino.head.Node) scope26, (com.google.javascript.rhino.head.Node) scriptNode32, (com.google.javascript.rhino.head.Node) scope44);
        int int56 = scriptNode32.getLineno();
        java.lang.String str58 = scriptNode32.makeIndent(136);
        java.lang.String str59 = scriptNode32.getSourceName();
        int int60 = scriptNode32.getLength();
        int int61 = scriptNode32.depth();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.Jump jump62 = scriptNode32.getJumpStatement();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(symbolList39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str40, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertNull(scope46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "                                                                                                                                                                                                                                                                                " + "'", str58, "                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
    }

    @Test
    public void test15691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15691");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope4 = scope2.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node5 = scope2.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType9 = null;
        com.google.javascript.rhino.head.ast.Comment comment11 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType9, "Scope");
        scriptNode6.setParent((com.google.javascript.rhino.head.ast.AstNode) comment11);
        scope2.setJsDocNode(comment11);
        java.lang.String str15 = comment11.toSource((int) (short) 10);
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) comment11);
        java.lang.Object obj18 = comment11.getProp((int) (short) -1);
        java.lang.String str20 = comment11.makeIndent((int) (short) -1);
        java.lang.String str22 = comment11.toSource(2);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator23 = comment11.spliterator();
        com.google.javascript.rhino.head.Token.CommentType commentType24 = null;
        comment11.setCommentType(commentType24);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                    Scope" + "'", str15, "                    Scope");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "    Scope" + "'", str22, "    Scope");
        org.junit.Assert.assertNotNull(nodeSpliterator23);
    }

    @Test
    public void test15692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15692");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope(0);
        java.lang.Object obj3 = scope1.getProp((-243114478));
        com.google.javascript.rhino.head.Token.CommentType commentType7 = null;
        com.google.javascript.rhino.head.ast.Comment comment9 = new com.google.javascript.rhino.head.ast.Comment(15, 52, commentType7, "                        ");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str11 = scriptNode10.getEncodedSource();
        scriptNode10.setEncodedSourceEnd(18);
        java.lang.String str15 = scriptNode10.makeIndent((int) '#');
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node((int) (byte) -1, (com.google.javascript.rhino.head.Node) comment9, (com.google.javascript.rhino.head.Node) scriptNode10);
        int int17 = scriptNode10.depth();
        com.google.javascript.rhino.head.ast.Scope.joinScopes(scope1, (com.google.javascript.rhino.head.ast.Scope) scriptNode10);
        java.lang.String str20 = scriptNode10.toSource(97);
        scriptNode10.setSourceName("                  ");
        int int25 = scriptNode10.getIntProp(98666588, 440593346);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                      " + "'", str15, "                                                                      ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                                                                                                                  {\n                                                                                                                                                                                                  }\n" + "'", str20, "                                                                                                                                                                                                  {\n                                                                                                                                                                                                  }\n");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 440593346 + "'", int25 == 440593346);
    }

    @Test
    public void test15693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15693");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        int int12 = scriptNode1.getIntProp(6, 2);
        int int13 = scriptNode1.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType17 = null;
        com.google.javascript.rhino.head.ast.Comment comment19 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType17, "Scope");
        scriptNode14.setParent((com.google.javascript.rhino.head.ast.AstNode) comment19);
        scriptNode14.setEncodedSourceStart((int) (byte) 100);
        int int25 = scriptNode14.getIntProp(6, 2);
        int int26 = scriptNode14.getParamCount();
        scriptNode1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode14);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap28 = scriptNode14.getSymbolTable();
        java.lang.String str29 = scriptNode14.getSourceName();
        int int30 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node(11, (com.google.javascript.rhino.head.Node) scriptNode14, (-51));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str34 = scriptNode33.getEncodedSource();
        int int35 = scriptNode33.getBaseLineno();
        java.lang.Object obj36 = scriptNode33.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType40 = null;
        com.google.javascript.rhino.head.ast.Comment comment42 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType40, "Scope");
        scriptNode37.setParent((com.google.javascript.rhino.head.ast.AstNode) comment42);
        java.lang.String str45 = scriptNode37.toSource(26);
        scriptNode33.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode37);
        java.lang.String str47 = scriptNode37.toString();
        com.google.javascript.rhino.head.ast.Symbol symbol49 = scriptNode37.getSymbol("/");
        scriptNode14.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode37);
        java.lang.String str52 = scriptNode37.toSource((-207519868));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(strMap28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "                                                    {\n                                                    }\n" + "'", str45, "                                                    {\n                                                    }\n");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "136" + "'", str47, "136");
        org.junit.Assert.assertNull(symbol49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "{\n}\n" + "'", str52, "{\n}\n");
    }

    @Test
    public void test15694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15694");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = scriptNode1.getTop();
        scriptNode10.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int15 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str17 = scriptNode16.getEncodedSource();
        scriptNode16.setEncodedSourceEnd(18);
        scriptNode14.target = scriptNode16;
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode10, (com.google.javascript.rhino.head.Node) scriptNode16);
        java.lang.String str22 = scriptNode16.getNextTempName();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment(15, 52, commentType26, "                        ");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str30 = scriptNode29.getEncodedSource();
        scriptNode29.setEncodedSourceEnd(18);
        java.lang.String str34 = scriptNode29.makeIndent((int) '#');
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node((int) (byte) -1, (com.google.javascript.rhino.head.Node) comment28, (com.google.javascript.rhino.head.Node) scriptNode29);
        com.google.javascript.rhino.head.Token.CommentType commentType36 = null;
        comment28.setCommentType(commentType36);
        scriptNode16.target = comment28;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType44 = null;
        com.google.javascript.rhino.head.ast.Comment comment46 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType44, "Scope");
        scriptNode41.setParent((com.google.javascript.rhino.head.ast.AstNode) comment46);
        scriptNode41.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = scriptNode41.getTop();
        scriptNode50.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int55 = scriptNode54.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode56 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str57 = scriptNode56.getEncodedSource();
        scriptNode56.setEncodedSourceEnd(18);
        scriptNode54.target = scriptNode56;
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode50, (com.google.javascript.rhino.head.Node) scriptNode56);
        com.google.javascript.rhino.head.Token.CommentType commentType64 = null;
        com.google.javascript.rhino.head.ast.Comment comment66 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType64, "Scope");
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node(21, (com.google.javascript.rhino.head.Node) scriptNode50, (com.google.javascript.rhino.head.Node) comment66);
        scriptNode16.addChildToBack(node67);
        // The following exception was thrown during execution in test generation
        try {
            scriptNode16.setString("58\t  SCRIPT 6 1\n");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.ScriptNode cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scriptNode10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "$0" + "'", str22, "$0");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "                                                                      " + "'", str34, "                                                                      ");
        org.junit.Assert.assertNotNull(scriptNode50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test15695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15695");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        int int11 = scriptNode0.getIntProp(6, 2);
        int int12 = scriptNode0.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType16 = null;
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType16, "Scope");
        scriptNode13.setParent((com.google.javascript.rhino.head.ast.AstNode) comment18);
        scriptNode13.setEncodedSourceStart((int) (byte) 100);
        int int24 = scriptNode13.getIntProp(6, 2);
        int int25 = scriptNode13.getParamCount();
        scriptNode0.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode13);
        scriptNode13.setEncodedSourceStart((int) (byte) 1);
        scriptNode13.setEncodedSource("                                                                                                                                                                                                        Scope");
        int int31 = scriptNode13.depth();
        java.lang.String str32 = scriptNode13.getEncodedSource();
        com.google.javascript.rhino.head.ast.Comment comment33 = scriptNode13.getJsDocNode();
        java.lang.String str34 = scriptNode13.getSourceName();
        com.google.javascript.rhino.head.ast.Symbol symbol36 = scriptNode13.getSymbol("Scope");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "                                                                                                                                                                                                        Scope" + "'", str32, "                                                                                                                                                                                                        Scope");
        org.junit.Assert.assertNull(comment33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(symbol36);
    }

    @Test
    public void test15696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15696");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(5, 21);
        com.google.javascript.rhino.head.ast.Scope scope6 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope8 = scope6.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node9 = scope6.target;
        scope6.setPosition(2);
        scope6.setLength((int) (byte) 1);
        java.lang.Object obj15 = scope6.getProp((int) 'a');
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node((int) (byte) 10, (com.google.javascript.rhino.head.Node) scope6);
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope20 = scope18.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node21 = scope18.target;
        scope18.setPosition(2);
        java.lang.String str24 = scope18.toSource();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap25 = scope18.getSymbolTable();
        boolean boolean26 = scope18.hasChildren();
        com.google.javascript.rhino.head.Node node27 = scope18.getNext();
        scope6.addChildrenToFront((com.google.javascript.rhino.head.Node) scope18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType32 = null;
        com.google.javascript.rhino.head.ast.Comment comment34 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType32, "Scope");
        scriptNode29.setParent((com.google.javascript.rhino.head.ast.AstNode) comment34);
        scriptNode29.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = scriptNode29.getTop();
        scriptNode38.setPosition(6);
        com.google.javascript.rhino.head.Token.CommentType commentType43 = null;
        com.google.javascript.rhino.head.ast.Comment comment45 = new com.google.javascript.rhino.head.ast.Comment(9, 9, commentType43, "{\n}\n");
        java.lang.String str46 = comment45.getValue();
        comment45.setLength(129);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(35, (com.google.javascript.rhino.head.Node) scope6, (com.google.javascript.rhino.head.Node) scriptNode38, (com.google.javascript.rhino.head.Node) comment45);
        com.google.javascript.rhino.head.Token.CommentType commentType50 = null;
        comment45.setCommentType(commentType50);
        java.lang.String str52 = comment45.getJsDoc();
        node2.setJsDocNode(comment45);
        boolean boolean54 = comment45.hasChildren();
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{\n}\n" + "'", str24, "{\n}\n");
        org.junit.Assert.assertNull(strMap25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(scriptNode38);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "{\n}\n" + "'", str46, "{\n}\n");
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test15697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15697");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(1404628457);
        scriptNode1.setBaseLineno(98666588);
        com.google.javascript.rhino.head.ast.Symbol symbol4 = null;
        // The following exception was thrown during execution in test generation
        try {
            scriptNode1.putSymbol(symbol4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15698");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int2 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope scope4 = scriptNode1.getDefiningScope("51\t    SCRIPT 52 1\n");
        boolean boolean5 = scriptNode1.hasSideEffects();
        com.google.javascript.rhino.head.Node node6 = scriptNode1.getNext();
        int int7 = scriptNode1.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.Scope scope10 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope12 = scope10.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node13 = scope10.target;
        scope10.setPosition(2);
        int int16 = scope10.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope20 = scope18.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node21 = scope18.target;
        scope18.setPosition(2);
        scope18.setLength((int) (byte) 1);
        com.google.javascript.rhino.head.ast.Scope scope27 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope29 = scope27.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node30 = scope27.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType34 = null;
        com.google.javascript.rhino.head.ast.Comment comment36 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType34, "Scope");
        scriptNode31.setParent((com.google.javascript.rhino.head.ast.AstNode) comment36);
        scope27.setJsDocNode(comment36);
        java.lang.String str40 = comment36.toSource((int) (short) 10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot41 = comment36.getAstRoot();
        scope18.setParent((com.google.javascript.rhino.head.ast.AstNode) comment36);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType46 = null;
        com.google.javascript.rhino.head.ast.Comment comment48 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType46, "Scope");
        scriptNode43.setParent((com.google.javascript.rhino.head.ast.AstNode) comment48);
        scriptNode43.setEncodedSourceStart((int) (byte) 100);
        int int54 = scriptNode43.getIntProp(6, 2);
        int int55 = scriptNode43.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode56 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str57 = scriptNode56.getEncodedSource();
        int int58 = scriptNode56.getBaseLineno();
        java.lang.String str59 = scriptNode56.getNextTempName();
        scriptNode43.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode56);
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node(129, (com.google.javascript.rhino.head.Node) scope10, (com.google.javascript.rhino.head.Node) scope18, (com.google.javascript.rhino.head.Node) scriptNode56, 136);
        int int65 = scope10.getIntProp((int) (byte) 10, 23);
        com.google.javascript.rhino.head.Token.CommentType commentType69 = null;
        com.google.javascript.rhino.head.ast.Comment comment71 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType69, "Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode72 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str73 = scriptNode72.getEncodedSource();
        scriptNode72.setEncodedSourceEnd(18);
        java.lang.String str76 = comment71.toStringTree(scriptNode72);
        com.google.javascript.rhino.head.Node node78 = com.google.javascript.rhino.head.Node.newString("{\n}\n");
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode72, node78);
        scriptNode72.setSourceName("hi!");
        com.google.javascript.rhino.head.Node node82 = scriptNode72.getLastChild();
        int int83 = scriptNode72.getEndLineno();
        scope10.setTop(scriptNode72);
        com.google.javascript.rhino.head.Token.CommentType commentType87 = null;
        com.google.javascript.rhino.head.ast.Comment comment89 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType87, "Scope");
        java.lang.String str90 = comment89.getValue();
        scriptNode72.addChildrenToFront((com.google.javascript.rhino.head.Node) comment89);
        scriptNode1.setJsDocNode(comment89);
        com.google.javascript.rhino.head.ast.AstRoot astRoot93 = scriptNode1.getAstRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(scope29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "                    Scope" + "'", str40, "                    Scope");
        org.junit.Assert.assertNull(astRoot41);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "$0" + "'", str59, "$0");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 23 + "'", int65 == 23);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Scope" + "'", str90, "Scope");
        org.junit.Assert.assertNull(astRoot93);
    }

    @Test
    public void test15699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15699");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        int int2 = scriptNode0.getBaseLineno();
        java.lang.Object obj3 = scriptNode0.getCompilerData();
        scriptNode0.flattenSymbolTable(false);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap6 = null;
        scriptNode0.setSymbolTable(strMap6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = scriptNode0.getTop();
        com.google.javascript.rhino.head.ast.Symbol symbol10 = scriptNode0.getSymbol("          {\n}\n");
        com.google.javascript.rhino.head.ast.Scope scope12 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        java.lang.String str14 = scope12.makeIndent(0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType21 = null;
        com.google.javascript.rhino.head.ast.Comment comment23 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType21, "Scope");
        scriptNode18.setParent((com.google.javascript.rhino.head.ast.AstNode) comment23);
        scriptNode18.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str27 = scriptNode18.getSourceName();
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode18, 26);
        scriptNode16.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode18);
        java.lang.String str31 = scriptNode16.getNextTempName();
        scope12.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode16);
        int int33 = scriptNode16.getFunctionCount();
        scriptNode0.addChildrenToFront((com.google.javascript.rhino.head.Node) scriptNode16);
        int int35 = scriptNode0.getRegexpCount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(scriptNode8);
        org.junit.Assert.assertNull(symbol10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "$0" + "'", str31, "$0");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test15700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15700");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        scriptNode0.setEncodedSourceEnd(18);
        scriptNode0.putIntProp(26, 4);
        int int7 = scriptNode0.getFunctionCount();
        int int8 = scriptNode0.getParamCount();
        java.lang.String str9 = scriptNode0.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.Jump jump10 = scriptNode0.getLoop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "136" + "'", str9, "136");
    }

    @Test
    public void test15701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15701");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        int int12 = scriptNode1.getIntProp(6, 2);
        int int13 = scriptNode1.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope17 = scope15.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node18 = scope15.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType22 = null;
        com.google.javascript.rhino.head.ast.Comment comment24 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType22, "Scope");
        scriptNode19.setParent((com.google.javascript.rhino.head.ast.AstNode) comment24);
        scope15.setJsDocNode(comment24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType30 = null;
        com.google.javascript.rhino.head.ast.Comment comment32 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType30, "Scope");
        scriptNode27.setParent((com.google.javascript.rhino.head.ast.AstNode) comment32);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList34 = scriptNode27.getSymbols();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode1, (com.google.javascript.rhino.head.Node) scope15, (com.google.javascript.rhino.head.Node) scriptNode27);
        scriptNode27.setPosition((int) (byte) 0);
        scriptNode27.setEncodedSourceStart((int) (byte) 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType43 = null;
        com.google.javascript.rhino.head.ast.Comment comment45 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType43, "Scope");
        scriptNode40.setParent((com.google.javascript.rhino.head.ast.AstNode) comment45);
        scriptNode40.setEncodedSourceStart((int) (byte) 100);
        int int51 = scriptNode40.getIntProp(6, 2);
        int int52 = scriptNode40.getParamCount();
        java.lang.String str53 = scriptNode40.debugPrint();
        int int56 = scriptNode40.getIntProp(17, 10);
        scriptNode27.setTop(scriptNode40);
        java.lang.Object obj59 = scriptNode40.getProp(17);
        int int60 = scriptNode40.getFunctionCount();
        boolean boolean61 = scriptNode40.hasSideEffects();
        java.lang.String str63 = scriptNode40.toSource(53);
        java.lang.String str64 = scriptNode40.toSource();
        scriptNode40.clearParentScope();
        scriptNode40.removeChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode68 = new com.google.javascript.rhino.head.ast.ScriptNode(14);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node69 = scriptNode40.getChildBefore((com.google.javascript.rhino.head.Node) scriptNode68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(symbolList34);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str53, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "                                                                                                          {\n                                                                                                          }\n" + "'", str63, "                                                                                                          {\n                                                                                                          }\n");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "{\n}\n" + "'", str64, "{\n}\n");
    }

    @Test
    public void test15702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15702");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        scriptNode2.setBaseLineno((int) (short) 0);
        com.google.javascript.rhino.head.Node node5 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode2);
        java.lang.Class<?> wildcardClass6 = scriptNode2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test15703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15703");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode0.toSource(18);
        java.lang.Object obj3 = scriptNode0.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType8 = null;
        com.google.javascript.rhino.head.ast.Comment comment10 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType8, "Scope");
        scriptNode5.setParent((com.google.javascript.rhino.head.ast.AstNode) comment10);
        scriptNode5.setEncodedSourceStart((int) (byte) 100);
        int int16 = scriptNode5.getIntProp(6, 2);
        int int17 = scriptNode5.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope21 = scope19.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node22 = scope19.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType26, "Scope");
        scriptNode23.setParent((com.google.javascript.rhino.head.ast.AstNode) comment28);
        scope19.setJsDocNode(comment28);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType34 = null;
        com.google.javascript.rhino.head.ast.Comment comment36 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType34, "Scope");
        scriptNode31.setParent((com.google.javascript.rhino.head.ast.AstNode) comment36);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList38 = scriptNode31.getSymbols();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode5, (com.google.javascript.rhino.head.Node) scope19, (com.google.javascript.rhino.head.Node) scriptNode31);
        scriptNode31.setPosition((int) (byte) 0);
        com.google.javascript.rhino.head.Node node42 = scriptNode31.target;
        scriptNode0.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode31);
        int int44 = scriptNode31.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope45 = scriptNode31.getEnclosingScope();
        java.lang.String str46 = scriptNode31.toString();
        com.google.javascript.rhino.head.Node node48 = scriptNode31.setType((-243114478));
        com.google.javascript.rhino.head.ast.Symbol symbol50 = scriptNode31.getSymbol("                                                                                                        hi!");
        com.google.javascript.rhino.head.ast.Scope scope51 = scriptNode31.getEnclosingScope();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    {\n                                    }\n" + "'", str2, "                                    {\n                                    }\n");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(symbolList38);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(scope45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "136" + "'", str46, "136");
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(symbol50);
        org.junit.Assert.assertNull(scope51);
    }

    @Test
    public void test15704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15704");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        scriptNode0.setEncodedSourceEnd(18);
        java.lang.String str5 = scriptNode0.makeIndent((int) '#');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType9 = null;
        com.google.javascript.rhino.head.ast.Comment comment11 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType9, "Scope");
        scriptNode6.setParent((com.google.javascript.rhino.head.ast.AstNode) comment11);
        scriptNode6.setEncodedSourceStart((int) (byte) 100);
        scriptNode0.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode6);
        scriptNode0.putIntProp((-547629399), (-547629399));
        scriptNode0.removeProp((int) (short) 0);
        scriptNode0.setLineno(412649354);
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral23 = null;
        // The following exception was thrown during execution in test generation
        try {
            scriptNode0.addRegExp(regExpLiteral23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                      " + "'", str5, "                                                                      ");
    }

    @Test
    public void test15705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15705");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        int int11 = scriptNode0.getIntProp(6, 2);
        int int12 = scriptNode0.getRegexpCount();
        java.lang.String str13 = scriptNode0.getSourceName();
        scriptNode0.setEncodedSourceEnd(2);
        scriptNode0.setEndLineno(20);
        com.google.javascript.rhino.head.Node node18 = scriptNode0.getLastChild();
        java.lang.String str19 = scriptNode0.shortName();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ScriptNode" + "'", str19, "ScriptNode");
    }

    @Test
    public void test15706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15706");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode0.toSource(18);
        int int3 = scriptNode0.getEndLineno();
        int int4 = scriptNode0.getRegexpCount();
        scriptNode0.setEncodedSource("Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType11 = null;
        com.google.javascript.rhino.head.ast.Comment comment13 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType11, "Scope");
        scriptNode8.setParent((com.google.javascript.rhino.head.ast.AstNode) comment13);
        scriptNode8.setEncodedSourceStart((int) (byte) 100);
        int int19 = scriptNode8.getIntProp(6, 2);
        int int20 = scriptNode8.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str22 = scriptNode21.getEncodedSource();
        int int23 = scriptNode21.getBaseLineno();
        java.lang.String str24 = scriptNode21.getNextTempName();
        scriptNode8.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode21);
        int int26 = scriptNode21.getType();
        int int27 = scriptNode21.getParamCount();
        com.google.javascript.rhino.head.Node node29 = scriptNode21.setType((int) '#');
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((-51), (com.google.javascript.rhino.head.Node) scriptNode21, 52);
        scriptNode0.addChildToBack(node31);
        java.lang.String str33 = scriptNode0.getSourceName();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator34 = scriptNode0.new NodeIterator();
        // The following exception was thrown during execution in test generation
        try {
            nodeIterator34.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: next() has not been called");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    {\n                                    }\n" + "'", str2, "                                    {\n                                    }\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "$0" + "'", str24, "$0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 136 + "'", int26 == 136);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test15707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15707");
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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType30 = null;
        com.google.javascript.rhino.head.ast.Comment comment32 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType30, "Scope");
        scriptNode27.setParent((com.google.javascript.rhino.head.ast.AstNode) comment32);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList34 = scriptNode27.getSymbols();
        java.lang.String str35 = scriptNode27.debugPrint();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str37 = scriptNode36.getEncodedSource();
        com.google.javascript.rhino.head.Node node38 = scriptNode36.getLastSibling();
        scriptNode36.setEncodedSource("Scope");
        scriptNode36.setEndLineno(100);
        scriptNode27.setCompilerData((java.lang.Object) 100);
        com.google.javascript.rhino.head.ast.Scope scope45 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope45.putProp(25, (java.lang.Object) 100L);
        scriptNode27.setParent((com.google.javascript.rhino.head.ast.AstNode) scope45);
        scriptNode27.setSourceName("*");
        // The following exception was thrown during execution in test generation
        try {
            scope1.setLoop((com.google.javascript.rhino.head.ast.Jump) scriptNode27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(nodeSpliterator9);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNotNull(nodeSpliterator19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(symbolList34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str35, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test15708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15708");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        int int10 = scriptNode1.getEncodedSourceStart();
        scriptNode1.flattenSymbolTable(true);
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node(11, (com.google.javascript.rhino.head.Node) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList14 = scriptNode1.getSymbols();
        scriptNode1.setEncodedSourceBounds((int) (byte) 10, (int) (short) 1);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList18 = scriptNode1.getSymbols();
        com.google.javascript.rhino.head.Node node19 = scriptNode1.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = scriptNode1.getTop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = scriptNode1.getRegexpFlags((-1072816741));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(symbolList14);
        org.junit.Assert.assertNotNull(symbolList18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(scriptNode20);
    }

    @Test
    public void test15709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15709");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        int int11 = scriptNode0.getIntProp(6, 2);
        int int12 = scriptNode0.getRegexpCount();
        scriptNode0.setEncodedSource("0\tBLOCK 0 1\n");
        scriptNode0.setLineno((int) '#');
        int int17 = scriptNode0.getLineno();
        java.lang.String str18 = scriptNode0.getNextTempName();
        com.google.javascript.rhino.head.Node node19 = scriptNode0.getFirstChild();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = scriptNode0.getEnclosingFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node21 = functionNode20.target;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "$0" + "'", str18, "$0");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(functionNode20);
    }

    @Test
    public void test15710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15710");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        int int12 = scriptNode1.getIntProp(6, 2);
        int int13 = scriptNode1.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope17 = scope15.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node18 = scope15.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType22 = null;
        com.google.javascript.rhino.head.ast.Comment comment24 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType22, "Scope");
        scriptNode19.setParent((com.google.javascript.rhino.head.ast.AstNode) comment24);
        scope15.setJsDocNode(comment24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType30 = null;
        com.google.javascript.rhino.head.ast.Comment comment32 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType30, "Scope");
        scriptNode27.setParent((com.google.javascript.rhino.head.ast.AstNode) comment32);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList34 = scriptNode27.getSymbols();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode1, (com.google.javascript.rhino.head.Node) scope15, (com.google.javascript.rhino.head.Node) scriptNode27);
        scriptNode27.setPosition((int) (byte) 0);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList38 = scriptNode27.getFunctions();
        java.lang.String str39 = scriptNode27.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = scriptNode27.getAstRoot();
        int int41 = scriptNode27.getEncodedSourceStart();
        scriptNode27.setRelative((-1369635813));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(symbolList34);
        org.junit.Assert.assertNotNull(functionNodeList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "52\t  SCRIPT 0 1\n" + "'", str39, "52\t  SCRIPT 0 1\n");
        org.junit.Assert.assertNull(astRoot40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test15711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15711");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = scriptNode1.getTop();
        scriptNode10.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int15 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str17 = scriptNode16.getEncodedSource();
        scriptNode16.setEncodedSourceEnd(18);
        scriptNode14.target = scriptNode16;
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode10, (com.google.javascript.rhino.head.Node) scriptNode16);
        int int24 = scriptNode10.getIntProp(2, 100);
        int int25 = scriptNode10.getEndLineno();
        int int26 = scriptNode10.getFunctionCount();
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope30 = scope28.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node31 = scope28.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType35 = null;
        com.google.javascript.rhino.head.ast.Comment comment37 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType35, "Scope");
        scriptNode32.setParent((com.google.javascript.rhino.head.ast.AstNode) comment37);
        scope28.setJsDocNode(comment37);
        scope28.putIntProp(9, 13);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str44 = scriptNode43.getEncodedSource();
        int int45 = scriptNode43.getBaseLineno();
        java.lang.Object obj46 = scriptNode43.getCompilerData();
        scriptNode43.setEncodedSourceBounds((int) '4', 0);
        scope28.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode43);
        scope28.setPosition(5);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType56 = null;
        com.google.javascript.rhino.head.ast.Comment comment58 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType56, "Scope");
        scriptNode53.setParent((com.google.javascript.rhino.head.ast.AstNode) comment58);
        scriptNode53.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode62 = scriptNode53.getTop();
        scriptNode62.setPosition(6);
        scope28.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode62);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int70 = scriptNode67.getIntProp(23, (int) (short) 1);
        com.google.javascript.rhino.head.ast.Scope scope72 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope72.setPosition(100);
        com.google.javascript.rhino.head.Node node75 = scope72.getLastSibling();
        node75.removeChildren();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator77 = node75.spliterator();
        scriptNode67.setCompilerData((java.lang.Object) node75);
        java.lang.String str79 = scriptNode67.getSourceName();
        scriptNode62.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode67);
        // The following exception was thrown during execution in test generation
        try {
            scriptNode10.setFinally((com.google.javascript.rhino.head.Node) scriptNode62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scriptNode10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(scope30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(scriptNode62);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(nodeSpliterator77);
        org.junit.Assert.assertNull(str79);
    }

    @Test
    public void test15712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15712");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType5 = null;
        com.google.javascript.rhino.head.ast.Comment comment7 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType5, "Scope");
        scriptNode2.setParent((com.google.javascript.rhino.head.ast.AstNode) comment7);
        scriptNode2.setEncodedSourceStart((int) (byte) 100);
        int int13 = scriptNode2.getIntProp(6, 2);
        int int14 = scriptNode2.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope16 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope18 = scope16.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node19 = scope16.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType23 = null;
        com.google.javascript.rhino.head.ast.Comment comment25 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType23, "Scope");
        scriptNode20.setParent((com.google.javascript.rhino.head.ast.AstNode) comment25);
        scope16.setJsDocNode(comment25);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType31 = null;
        com.google.javascript.rhino.head.ast.Comment comment33 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType31, "Scope");
        scriptNode28.setParent((com.google.javascript.rhino.head.ast.AstNode) comment33);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList35 = scriptNode28.getSymbols();
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode2, (com.google.javascript.rhino.head.Node) scope16, (com.google.javascript.rhino.head.Node) scriptNode28);
        com.google.javascript.rhino.head.Node node38 = scriptNode2.setType((int) (short) 100);
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newNumber(10.0d);
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(129, (com.google.javascript.rhino.head.Node) scriptNode2, node40, 13);
        int int43 = scriptNode2.getLineno();
        java.lang.String str44 = scriptNode2.debugPrint();
        int int45 = scriptNode2.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.Symbol symbol46 = null;
        // The following exception was thrown during execution in test generation
        try {
            scriptNode2.putSymbol(symbol46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(symbolList35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "-1\t  ASSIGN_DIV -53 1\n" + "'", str44, "-1\t  ASSIGN_DIV -53 1\n");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
    }

    @Test
    public void test15713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15713");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        int int2 = scriptNode0.getBaseLineno();
        java.lang.Object obj3 = scriptNode0.getCompilerData();
        scriptNode0.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.Scope scope6 = scriptNode0.getEnclosingScope();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType10 = null;
        com.google.javascript.rhino.head.ast.Comment comment12 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType10, "Scope");
        scriptNode7.setParent((com.google.javascript.rhino.head.ast.AstNode) comment12);
        scriptNode7.setEncodedSourceStart((int) (byte) 100);
        int int18 = scriptNode7.getIntProp(6, 2);
        int int19 = scriptNode7.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType23 = null;
        com.google.javascript.rhino.head.ast.Comment comment25 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType23, "Scope");
        scriptNode20.setParent((com.google.javascript.rhino.head.ast.AstNode) comment25);
        scriptNode20.setEncodedSourceStart((int) (byte) 100);
        int int31 = scriptNode20.getIntProp(6, 2);
        int int32 = scriptNode20.getParamCount();
        scriptNode7.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode20);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap34 = scriptNode20.getSymbolTable();
        int int35 = scriptNode20.depth();
        int int36 = scriptNode20.getEncodedSourceStart();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode20);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType44 = null;
        com.google.javascript.rhino.head.ast.Comment comment46 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType44, "Scope");
        scriptNode41.setParent((com.google.javascript.rhino.head.ast.AstNode) comment46);
        scriptNode41.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = scriptNode41.getTop();
        scriptNode50.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int55 = scriptNode54.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode56 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str57 = scriptNode56.getEncodedSource();
        scriptNode56.setEncodedSourceEnd(18);
        scriptNode54.target = scriptNode56;
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode50, (com.google.javascript.rhino.head.Node) scriptNode56);
        java.lang.String str62 = node61.getJsDoc();
        com.google.javascript.rhino.head.ast.Scope scope64 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope66 = scope64.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node67 = scope64.getLastSibling();
        com.google.javascript.rhino.head.Node node69 = new com.google.javascript.rhino.head.Node(23, node61, (com.google.javascript.rhino.head.Node) scope64, (int) (byte) 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode70 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType73 = null;
        com.google.javascript.rhino.head.ast.Comment comment75 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType73, "Scope");
        scriptNode70.setParent((com.google.javascript.rhino.head.ast.AstNode) comment75);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList77 = scriptNode70.getSymbols();
        java.lang.String str78 = scriptNode70.debugPrint();
        scriptNode70.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Scope scope82 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope84 = scope82.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node85 = scope82.target;
        scope82.setPosition(2);
        scope82.putIntProp(17, 25);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap91 = null;
        scope82.setSymbolTable(strMap91);
        com.google.javascript.rhino.head.Node node93 = new com.google.javascript.rhino.head.Node(2, (com.google.javascript.rhino.head.Node) scope64, (com.google.javascript.rhino.head.Node) scriptNode70, (com.google.javascript.rhino.head.Node) scope82);
        int int94 = scope64.getAbsolutePosition();
        scriptNode0.target = scope64;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(strMap34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(scriptNode50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(scope66);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(symbolList77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str78, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertNull(scope84);
        org.junit.Assert.assertNull(node85);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
    }

    @Test
    public void test15714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15714");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        int int12 = scriptNode1.getIntProp(6, 2);
        int int13 = scriptNode1.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope17 = scope15.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node18 = scope15.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType22 = null;
        com.google.javascript.rhino.head.ast.Comment comment24 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType22, "Scope");
        scriptNode19.setParent((com.google.javascript.rhino.head.ast.AstNode) comment24);
        scope15.setJsDocNode(comment24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType30 = null;
        com.google.javascript.rhino.head.ast.Comment comment32 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType30, "Scope");
        scriptNode27.setParent((com.google.javascript.rhino.head.ast.AstNode) comment32);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList34 = scriptNode27.getSymbols();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode1, (com.google.javascript.rhino.head.Node) scope15, (com.google.javascript.rhino.head.Node) scriptNode27);
        scriptNode27.setPosition((int) (byte) 0);
        com.google.javascript.rhino.head.Node node38 = scriptNode27.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType43 = null;
        com.google.javascript.rhino.head.ast.Comment comment45 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType43, "Scope");
        scriptNode40.setParent((com.google.javascript.rhino.head.ast.AstNode) comment45);
        scriptNode40.setEncodedSourceStart((int) (byte) 100);
        int int51 = scriptNode40.getIntProp(6, 2);
        int int52 = scriptNode40.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope54 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope56 = scope54.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node57 = scope54.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode58 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType61 = null;
        com.google.javascript.rhino.head.ast.Comment comment63 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType61, "Scope");
        scriptNode58.setParent((com.google.javascript.rhino.head.ast.AstNode) comment63);
        scope54.setJsDocNode(comment63);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType69 = null;
        com.google.javascript.rhino.head.ast.Comment comment71 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType69, "Scope");
        scriptNode66.setParent((com.google.javascript.rhino.head.ast.AstNode) comment71);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList73 = scriptNode66.getSymbols();
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode40, (com.google.javascript.rhino.head.Node) scope54, (com.google.javascript.rhino.head.Node) scriptNode66);
        java.lang.String str75 = scriptNode66.getEncodedSource();
        int int76 = scriptNode66.getAbsolutePosition();
        int int77 = scriptNode66.getLineno();
        java.lang.String str78 = scriptNode66.getEncodedSource();
        int int79 = scriptNode27.compareTo((com.google.javascript.rhino.head.ast.AstNode) scriptNode66);
        int int82 = scriptNode66.getIntProp(0, 396011107);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(symbolList34);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(scope56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(symbolList73);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 396011107 + "'", int82 == 396011107);
    }

    @Test
    public void test15715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15715");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        int int10 = scriptNode1.getEncodedSourceStart();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList11 = scriptNode1.getChildScopes();
        scriptNode1.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType17 = null;
        com.google.javascript.rhino.head.ast.Comment comment19 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType17, "Scope");
        scriptNode14.setParent((com.google.javascript.rhino.head.ast.AstNode) comment19);
        scriptNode14.setEncodedSourceStart((int) (byte) 100);
        int int25 = scriptNode14.getIntProp(6, 2);
        int int26 = scriptNode14.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str28 = scriptNode27.getEncodedSource();
        int int29 = scriptNode27.getBaseLineno();
        java.lang.String str30 = scriptNode27.getNextTempName();
        scriptNode14.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode27);
        java.lang.String str32 = scriptNode27.debugPrint();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int37 = scriptNode34.getIntProp(23, (int) (short) 1);
        com.google.javascript.rhino.head.ast.Scope scope39 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope39.setPosition(100);
        com.google.javascript.rhino.head.Node node42 = scope39.getLastSibling();
        node42.removeChildren();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator44 = node42.spliterator();
        scriptNode34.setCompilerData((java.lang.Object) node42);
        java.lang.String str46 = scriptNode34.getSourceName();
        int int47 = scriptNode34.getEncodedSourceStart();
        scriptNode34.setEncodedSourceStart((int) (byte) 0);
        scriptNode27.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode34);
        java.lang.Object obj52 = scriptNode27.getProp((int) (byte) -1);
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node(136, (com.google.javascript.rhino.head.Node) scriptNode1, (com.google.javascript.rhino.head.Node) scriptNode27, (int) ' ');
        com.google.javascript.rhino.head.ast.Scope scope55 = scriptNode27.getEnclosingScope();
        java.lang.String str57 = scriptNode27.makeIndent(1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode58 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType61 = null;
        com.google.javascript.rhino.head.ast.Comment comment63 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType61, "Scope");
        scriptNode58.setParent((com.google.javascript.rhino.head.ast.AstNode) comment63);
        scriptNode58.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str67 = scriptNode58.getSourceName();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor68 = scriptNode58.iterator();
        int int69 = scriptNode58.getParamCount();
        scriptNode27.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode58);
        com.google.javascript.rhino.head.ast.Scope scope72 = scriptNode27.getDefiningScope("                                            {\n                                            }\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(scopeList11);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "$0" + "'", str30, "$0");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "51\t    SCRIPT 52 1\n" + "'", str32, "51\t    SCRIPT 52 1\n");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeSpliterator44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(scope55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "  " + "'", str57, "  ");
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(nodeItor68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNull(scope72);
    }

    @Test
    public void test15716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15716");
        com.google.javascript.rhino.head.Token.CommentType commentType2 = null;
        com.google.javascript.rhino.head.ast.Comment comment4 = new com.google.javascript.rhino.head.ast.Comment(6, (int) (short) -1, commentType2, "                    hi!");
        com.google.javascript.rhino.head.Token.CommentType commentType5 = null;
        comment4.setCommentType(commentType5);
        com.google.javascript.rhino.head.Node node7 = comment4.getLastSibling();
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test15717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15717");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str9 = scriptNode0.getSourceName();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor10 = scriptNode0.iterator();
        int int11 = scriptNode0.getParamCount();
        com.google.javascript.rhino.head.Node node13 = scriptNode0.setType(17);
        com.google.javascript.rhino.head.Node node14 = scriptNode0.target;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = scriptNode0.getExistingIntProp((-1805289491));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(nodeItor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test15718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15718");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((-700164298), "                      ");
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test15719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15719");
        com.google.javascript.rhino.head.Token.CommentType commentType2 = null;
        com.google.javascript.rhino.head.ast.Comment comment4 = new com.google.javascript.rhino.head.ast.Comment(9, 9, commentType2, "{\n}\n");
        java.lang.String str5 = comment4.getValue();
        comment4.setLength(129);
        java.lang.String str9 = comment4.toSource(5);
        java.lang.Object obj11 = comment4.getProp(26);
        java.lang.String str12 = comment4.getValue();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{\n}\n" + "'", str5, "{\n}\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "          {\n}\n" + "'", str9, "          {\n}\n");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{\n}\n" + "'", str12, "{\n}\n");
    }

    @Test
    public void test15720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15720");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) (short) 1, "hi!");
        com.google.javascript.rhino.head.ast.Scope scope5 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope7 = scope5.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node8 = scope5.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType12 = null;
        com.google.javascript.rhino.head.ast.Comment comment14 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType12, "Scope");
        scriptNode9.setParent((com.google.javascript.rhino.head.ast.AstNode) comment14);
        scope5.setJsDocNode(comment14);
        com.google.javascript.rhino.head.Token.CommentType commentType17 = null;
        comment14.setCommentType(commentType17);
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node(25, (com.google.javascript.rhino.head.Node) comment14, 14);
        node2.addChildToBack((com.google.javascript.rhino.head.Node) comment14);
        com.google.javascript.rhino.head.ast.AstNode astNode22 = comment14.getParent();
        java.lang.String str23 = comment14.getValue();
        comment14.setRelative((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = comment14.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.Comment cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(astNode22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Scope" + "'", str23, "Scope");
    }

    @Test
    public void test15721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15721");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) -1);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList2 = scriptNode1.getSymbols();
        com.google.javascript.rhino.head.ast.Symbol symbol4 = scriptNode1.getSymbol("^");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str6 = scriptNode5.getEncodedSource();
        com.google.javascript.rhino.head.Node node7 = scriptNode5.getLastSibling();
        scriptNode5.setEncodedSource("Scope");
        scriptNode5.setEndLineno(100);
        scriptNode5.putIntProp(14, 3);
        java.lang.String str15 = scriptNode1.toStringTree(scriptNode5);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor16 = scriptNode1.iterator();
        boolean boolean17 = scriptNode1.hasSideEffects();
        org.junit.Assert.assertNotNull(symbolList2);
        org.junit.Assert.assertNull(symbol4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(nodeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15722");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType8 = null;
        com.google.javascript.rhino.head.ast.Comment comment10 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType8, "Scope");
        scriptNode5.setParent((com.google.javascript.rhino.head.ast.AstNode) comment10);
        scope1.setJsDocNode(comment10);
        scope1.putIntProp(9, 13);
        int int16 = scope1.getPosition();
        boolean boolean17 = scope1.hasSideEffects();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test15723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15723");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("      Scope");
        boolean boolean2 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.Scope scope4 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        java.lang.String str6 = scope4.makeIndent(0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType13 = null;
        com.google.javascript.rhino.head.ast.Comment comment15 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType13, "Scope");
        scriptNode10.setParent((com.google.javascript.rhino.head.ast.AstNode) comment15);
        scriptNode10.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str19 = scriptNode10.getSourceName();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode10, 26);
        scriptNode8.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode10);
        java.lang.String str23 = scriptNode8.getNextTempName();
        scope4.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode8);
        node1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode8);
        scriptNode8.setEncodedSourceEnd(35);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode28 = scriptNode8.getEnclosingFunction();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "$0" + "'", str23, "$0");
        org.junit.Assert.assertNull(functionNode28);
    }

    @Test
    public void test15724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15724");
        com.google.javascript.rhino.head.Token.CommentType commentType2 = null;
        com.google.javascript.rhino.head.ast.Comment comment4 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType2, "Scope");
        java.lang.String str6 = comment4.toSource(19);
        com.google.javascript.rhino.head.ast.Scope scope8 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope8.setPosition(100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType15 = null;
        com.google.javascript.rhino.head.ast.Comment comment17 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType15, "Scope");
        scriptNode12.setParent((com.google.javascript.rhino.head.ast.AstNode) comment17);
        scriptNode12.setEncodedSourceStart((int) (byte) 100);
        int int23 = scriptNode12.getIntProp(6, 2);
        int int24 = scriptNode12.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope26 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope28 = scope26.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node29 = scope26.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType33 = null;
        com.google.javascript.rhino.head.ast.Comment comment35 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType33, "Scope");
        scriptNode30.setParent((com.google.javascript.rhino.head.ast.AstNode) comment35);
        scope26.setJsDocNode(comment35);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType41 = null;
        com.google.javascript.rhino.head.ast.Comment comment43 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType41, "Scope");
        scriptNode38.setParent((com.google.javascript.rhino.head.ast.AstNode) comment43);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList45 = scriptNode38.getSymbols();
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode12, (com.google.javascript.rhino.head.Node) scope26, (com.google.javascript.rhino.head.Node) scriptNode38);
        scriptNode38.setPosition((int) (byte) 0);
        scope8.setTop(scriptNode38);
        int int50 = scriptNode38.getParamCount();
        comment4.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode38);
        java.lang.String str52 = scriptNode38.getNextTempName();
        com.google.javascript.rhino.head.ast.Symbol symbol53 = null;
        // The following exception was thrown during execution in test generation
        try {
            scriptNode38.putSymbol(symbol53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                      Scope" + "'", str6, "                                      Scope");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(symbolList45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "$0" + "'", str52, "$0");
    }

    @Test
    public void test15725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15725");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int2 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str4 = scriptNode3.getEncodedSource();
        scriptNode3.setEncodedSourceEnd(18);
        scriptNode1.target = scriptNode3;
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList8 = scriptNode3.getStatements();
        com.google.javascript.rhino.head.Token.CommentType commentType12 = null;
        com.google.javascript.rhino.head.ast.Comment comment14 = new com.google.javascript.rhino.head.ast.Comment(15, 52, commentType12, "                        ");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str16 = scriptNode15.getEncodedSource();
        scriptNode15.setEncodedSourceEnd(18);
        java.lang.String str20 = scriptNode15.makeIndent((int) '#');
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (byte) -1, (com.google.javascript.rhino.head.Node) comment14, (com.google.javascript.rhino.head.Node) scriptNode15);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode22 = comment14.getEnclosingFunction();
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(21, 2);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType29 = null;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType29, "Scope");
        scriptNode26.setParent((com.google.javascript.rhino.head.ast.AstNode) comment31);
        scriptNode26.setEncodedSourceStart((int) (byte) 100);
        int int37 = scriptNode26.getIntProp(6, 2);
        int int38 = scriptNode26.getRegexpCount();
        scriptNode26.setEncodedSource("0\tBLOCK 0 1\n");
        scriptNode26.setLineno((int) '#');
        int int43 = scriptNode26.getLineno();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode44 = scriptNode26.getEnclosingFunction();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList45 = scriptNode26.getStatements();
        scriptNode26.removeProp(1);
        comment14.addChildAfter(node25, (com.google.javascript.rhino.head.Node) scriptNode26);
        scriptNode3.addChildrenToFront((com.google.javascript.rhino.head.Node) comment14);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType54 = null;
        com.google.javascript.rhino.head.ast.Comment comment56 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType54, "Scope");
        scriptNode51.setParent((com.google.javascript.rhino.head.ast.AstNode) comment56);
        scriptNode51.setEncodedSourceStart((int) (byte) 100);
        int int62 = scriptNode51.getIntProp(6, 2);
        int int63 = scriptNode51.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope65 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope67 = scope65.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node68 = scope65.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode69 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType72 = null;
        com.google.javascript.rhino.head.ast.Comment comment74 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType72, "Scope");
        scriptNode69.setParent((com.google.javascript.rhino.head.ast.AstNode) comment74);
        scope65.setJsDocNode(comment74);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode77 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType80 = null;
        com.google.javascript.rhino.head.ast.Comment comment82 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType80, "Scope");
        scriptNode77.setParent((com.google.javascript.rhino.head.ast.AstNode) comment82);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList84 = scriptNode77.getSymbols();
        com.google.javascript.rhino.head.Node node85 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode51, (com.google.javascript.rhino.head.Node) scope65, (com.google.javascript.rhino.head.Node) scriptNode77);
        scriptNode77.setPosition((int) (byte) 0);
        com.google.javascript.rhino.head.Node node88 = scriptNode77.target;
        scriptNode77.setBounds(16, 13);
        int int92 = scriptNode77.getPosition();
        com.google.javascript.rhino.head.Node node93 = scriptNode77.getFirstChild();
        com.google.javascript.rhino.head.ast.Scope scope95 = scriptNode77.getDefiningScope("52\t  SCRIPT 0 1\n");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode3, scope95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(astNodeList8);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                      " + "'", str20, "                                                                      ");
        org.junit.Assert.assertNull(functionNode22);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertNull(functionNode44);
        org.junit.Assert.assertNotNull(astNodeList45);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(scope67);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(symbolList84);
        org.junit.Assert.assertNull(node88);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 16 + "'", int92 == 16);
        org.junit.Assert.assertNull(node93);
        org.junit.Assert.assertNull(scope95);
    }

    @Test
    public void test15726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15726");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        int int11 = scriptNode0.getIntProp(6, 2);
        int int12 = scriptNode0.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType16 = null;
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType16, "Scope");
        scriptNode13.setParent((com.google.javascript.rhino.head.ast.AstNode) comment18);
        scriptNode13.setEncodedSourceStart((int) (byte) 100);
        int int24 = scriptNode13.getIntProp(6, 2);
        int int25 = scriptNode13.getParamCount();
        scriptNode0.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode13);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap27 = scriptNode13.getSymbolTable();
        java.lang.String str28 = scriptNode13.getSourceName();
        int int29 = scriptNode13.getBaseLineno();
        int int30 = scriptNode13.getLength();
        java.lang.String str31 = scriptNode13.toSource();
        com.google.javascript.rhino.head.ast.Scope scope33 = scriptNode13.getDefiningScope("                              {\n                              }\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(strMap27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{\n}\n" + "'", str31, "{\n}\n");
        org.junit.Assert.assertNull(scope33);
    }

    @Test
    public void test15727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15727");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType5 = null;
        com.google.javascript.rhino.head.ast.Comment comment7 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType5, "Scope");
        scriptNode2.setParent((com.google.javascript.rhino.head.ast.AstNode) comment7);
        scriptNode2.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = scriptNode2.getTop();
        scriptNode11.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int16 = scriptNode15.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str18 = scriptNode17.getEncodedSource();
        scriptNode17.setEncodedSourceEnd(18);
        scriptNode15.target = scriptNode17;
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode11, (com.google.javascript.rhino.head.Node) scriptNode17);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str24 = scriptNode23.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType29 = null;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType29, "Scope");
        scriptNode26.setParent((com.google.javascript.rhino.head.ast.AstNode) comment31);
        scriptNode26.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str35 = scriptNode26.getSourceName();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode26, 26);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node((int) (byte) -1, node22, (com.google.javascript.rhino.head.Node) scriptNode23, (com.google.javascript.rhino.head.Node) scriptNode26);
        com.google.javascript.rhino.head.ast.Scope scope40 = scriptNode26.getDefiningScope("");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        scriptNode26.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode42);
        scriptNode42.setBaseLineno((int) '4');
        com.google.javascript.rhino.head.Node node46 = scriptNode42.target;
        com.google.javascript.rhino.head.Node node47 = scriptNode42.getFirstChild();
        java.lang.String str48 = scriptNode42.toSource();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator49 = scriptNode42.new NodeIterator();
        boolean boolean50 = nodeIterator49.hasNext();
        boolean boolean51 = nodeIterator49.hasNext();
        boolean boolean52 = nodeIterator49.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node53 = nodeIterator49.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scriptNode11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(scope40);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "{\n}\n" + "'", str48, "{\n}\n");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test15728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15728");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        java.lang.String str7 = scope1.toSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int12 = scriptNode9.getIntProp(23, (int) (short) 1);
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope14.setPosition(100);
        com.google.javascript.rhino.head.Node node17 = scope14.getLastSibling();
        node17.removeChildren();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator19 = node17.spliterator();
        scriptNode9.setCompilerData((java.lang.Object) node17);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType26, "Scope");
        scriptNode23.setParent((com.google.javascript.rhino.head.ast.AstNode) comment28);
        scriptNode23.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = scriptNode23.getTop();
        scriptNode32.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int37 = scriptNode36.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str39 = scriptNode38.getEncodedSource();
        scriptNode38.setEncodedSourceEnd(18);
        scriptNode36.target = scriptNode38;
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode32, (com.google.javascript.rhino.head.Node) scriptNode38);
        com.google.javascript.rhino.head.Token.CommentType commentType46 = null;
        com.google.javascript.rhino.head.ast.Comment comment48 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType46, "Scope");
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(21, (com.google.javascript.rhino.head.Node) scriptNode32, (com.google.javascript.rhino.head.Node) comment48);
        java.lang.String str50 = scriptNode9.toStringTree(scriptNode32);
        scope1.setTop(scriptNode32);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = scope1.getTop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = scriptNode52.getRegexpString((-1919164661));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\n}\n" + "'", str7, "{\n}\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeSpliterator19);
        org.junit.Assert.assertNotNull(scriptNode32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(scriptNode52);
    }

    @Test
    public void test15729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15729");
        com.google.javascript.rhino.head.Token.CommentType commentType2 = null;
        com.google.javascript.rhino.head.ast.Comment comment4 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 100, 10, commentType2, "{\n{\n}\n}\n");
        java.lang.String str5 = comment4.getValue();
        java.lang.String str6 = comment4.getValue();
        boolean boolean7 = comment4.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.AstNode astNode8 = comment4.getParent();
        com.google.javascript.rhino.head.Token.CommentType commentType9 = null;
        comment4.setCommentType(commentType9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{\n{\n}\n}\n" + "'", str5, "{\n{\n}\n}\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{\n{\n}\n}\n" + "'", str6, "{\n{\n}\n}\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(astNode8);
    }

    @Test
    public void test15730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15730");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType8 = null;
        com.google.javascript.rhino.head.ast.Comment comment10 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType8, "Scope");
        scriptNode5.setParent((com.google.javascript.rhino.head.ast.AstNode) comment10);
        scope1.setJsDocNode(comment10);
        boolean boolean13 = scope1.hasChildren();
        boolean boolean14 = scope1.hasChildren();
        com.google.javascript.rhino.head.ast.Scope scope15 = scope1.getParentScope();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(scope15);
    }

    @Test
    public void test15731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15731");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope4 = scope2.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node5 = scope2.target;
        scope2.setPosition(2);
        java.lang.String str8 = scope2.toSource();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap9 = scope2.getSymbolTable();
        boolean boolean10 = scope2.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType14 = null;
        com.google.javascript.rhino.head.ast.Comment comment16 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType14, "Scope");
        scriptNode11.setParent((com.google.javascript.rhino.head.ast.AstNode) comment16);
        scriptNode11.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = scriptNode11.getTop();
        scope2.target = scriptNode11;
        com.google.javascript.rhino.head.Node node22 = scriptNode11.target;
        scriptNode11.setBaseLineno(10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType30 = null;
        com.google.javascript.rhino.head.ast.Comment comment32 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType30, "Scope");
        scriptNode27.setParent((com.google.javascript.rhino.head.ast.AstNode) comment32);
        scriptNode27.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = scriptNode27.getTop();
        scriptNode36.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int41 = scriptNode40.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str43 = scriptNode42.getEncodedSource();
        scriptNode42.setEncodedSourceEnd(18);
        scriptNode40.target = scriptNode42;
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode36, (com.google.javascript.rhino.head.Node) scriptNode42);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str49 = scriptNode48.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType54 = null;
        com.google.javascript.rhino.head.ast.Comment comment56 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType54, "Scope");
        scriptNode51.setParent((com.google.javascript.rhino.head.ast.AstNode) comment56);
        scriptNode51.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str60 = scriptNode51.getSourceName();
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode51, 26);
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) (byte) -1, node47, (com.google.javascript.rhino.head.Node) scriptNode48, (com.google.javascript.rhino.head.Node) scriptNode51);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode64 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType67 = null;
        com.google.javascript.rhino.head.ast.Comment comment69 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType67, "Scope");
        scriptNode64.setParent((com.google.javascript.rhino.head.ast.AstNode) comment69);
        scriptNode64.setEncodedSourceStart((int) (byte) 100);
        int int75 = scriptNode64.getIntProp(6, 2);
        scriptNode64.setEndLineno(18);
        scriptNode51.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode64);
        scriptNode51.flattenSymbolTable(false);
        scriptNode11.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode51);
        int int82 = scriptNode51.getPosition();
        com.google.javascript.rhino.head.Node node84 = new com.google.javascript.rhino.head.Node(6, (com.google.javascript.rhino.head.Node) scriptNode51, 9);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{\n}\n" + "'", str8, "{\n}\n");
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(scriptNode20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(scriptNode36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2 + "'", int75 == 2);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-53) + "'", int82 == (-53));
    }

    @Test
    public void test15732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15732");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope3 = scope1.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node4 = scope1.target;
        scope1.setPosition(2);
        int int7 = scope1.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope8 = scope1.getEnclosingScope();
        java.lang.String str10 = scope1.makeIndent(0);
        int int11 = scope1.getLength();
        com.google.javascript.rhino.head.Node node13 = scope1.setType(3);
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newString((int) (byte) 10, "");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType22 = null;
        com.google.javascript.rhino.head.ast.Comment comment24 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType22, "Scope");
        scriptNode19.setParent((com.google.javascript.rhino.head.ast.AstNode) comment24);
        scriptNode19.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = scriptNode19.getTop();
        scriptNode28.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int33 = scriptNode32.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str35 = scriptNode34.getEncodedSource();
        scriptNode34.setEncodedSourceEnd(18);
        scriptNode32.target = scriptNode34;
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode28, (com.google.javascript.rhino.head.Node) scriptNode34);
        com.google.javascript.rhino.head.Token.CommentType commentType42 = null;
        com.google.javascript.rhino.head.ast.Comment comment44 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType42, "Scope");
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(21, (com.google.javascript.rhino.head.Node) scriptNode28, (com.google.javascript.rhino.head.Node) comment44);
        java.lang.String str46 = node16.toStringTree(scriptNode28);
        scope1.setParentScope((com.google.javascript.rhino.head.ast.Scope) scriptNode28);
        scriptNode28.putIntProp(18, 10);
        scriptNode28.setLineno(1784707759);
        int int53 = scriptNode28.getEncodedSourceStart();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(scriptNode28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
    }

    @Test
    public void test15733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15733");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        scriptNode0.setEncodedSourceEnd(18);
        java.lang.String str5 = scriptNode0.makeIndent((int) '#');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType11 = null;
        com.google.javascript.rhino.head.ast.Comment comment13 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType11, "Scope");
        scriptNode8.setParent((com.google.javascript.rhino.head.ast.AstNode) comment13);
        scriptNode8.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = scriptNode8.getTop();
        scriptNode17.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int22 = scriptNode21.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str24 = scriptNode23.getEncodedSource();
        scriptNode23.setEncodedSourceEnd(18);
        scriptNode21.target = scriptNode23;
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode17, (com.google.javascript.rhino.head.Node) scriptNode23);
        com.google.javascript.rhino.head.Token.CommentType commentType31 = null;
        com.google.javascript.rhino.head.ast.Comment comment33 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType31, "Scope");
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(21, (com.google.javascript.rhino.head.Node) scriptNode17, (com.google.javascript.rhino.head.Node) comment33);
        int int35 = scriptNode17.depth();
        int int36 = scriptNode17.getEndLineno();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor37 = scriptNode17.iterator();
        scriptNode0.setTop(scriptNode17);
        com.google.javascript.rhino.head.ast.Scope scope40 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope42 = scope40.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node43 = scope40.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType47 = null;
        com.google.javascript.rhino.head.ast.Comment comment49 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType47, "Scope");
        scriptNode44.setParent((com.google.javascript.rhino.head.ast.AstNode) comment49);
        scope40.setJsDocNode(comment49);
        com.google.javascript.rhino.head.Node node52 = comment49.getFirstChild();
        scriptNode17.setJsDocNode(comment49);
        scriptNode17.setEncodedSourceBounds((int) ' ', 0);
        java.lang.Object obj58 = scriptNode17.getProp(22);
        scriptNode17.setBounds((int) 'a', (-51));
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList62 = scriptNode17.getChildScopes();
        com.google.javascript.rhino.head.ast.Scope scope63 = scriptNode17.getParentScope();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                      " + "'", str5, "                                                                      ");
        org.junit.Assert.assertNotNull(scriptNode17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(nodeItor37);
        org.junit.Assert.assertNull(scope42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(scopeList62);
        org.junit.Assert.assertNull(scope63);
    }

    @Test
    public void test15734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15734");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType5 = null;
        com.google.javascript.rhino.head.ast.Comment comment7 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType5, "Scope");
        scriptNode2.setParent((com.google.javascript.rhino.head.ast.AstNode) comment7);
        scriptNode2.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = scriptNode2.getTop();
        scriptNode11.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int16 = scriptNode15.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str18 = scriptNode17.getEncodedSource();
        scriptNode17.setEncodedSourceEnd(18);
        scriptNode15.target = scriptNode17;
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode11, (com.google.javascript.rhino.head.Node) scriptNode17);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str24 = scriptNode23.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType29 = null;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType29, "Scope");
        scriptNode26.setParent((com.google.javascript.rhino.head.ast.AstNode) comment31);
        scriptNode26.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str35 = scriptNode26.getSourceName();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode26, 26);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node((int) (byte) -1, node22, (com.google.javascript.rhino.head.Node) scriptNode23, (com.google.javascript.rhino.head.Node) scriptNode26);
        com.google.javascript.rhino.head.Node node39 = scriptNode26.getLastSibling();
        boolean boolean40 = scriptNode26.hasSideEffects();
        java.lang.String str41 = scriptNode26.toSource();
        java.lang.String str43 = scriptNode26.toSource(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType47 = null;
        com.google.javascript.rhino.head.ast.Comment comment49 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType47, "Scope");
        scriptNode44.setParent((com.google.javascript.rhino.head.ast.AstNode) comment49);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList51 = scriptNode44.getSymbols();
        java.lang.String str52 = scriptNode44.debugPrint();
        scriptNode44.setRelative((int) ' ');
        scriptNode26.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode44);
        java.lang.String str56 = scriptNode44.toString();
        boolean boolean57 = scriptNode44.hasConsistentReturnUsage();
        int int58 = scriptNode44.getEncodedSourceEnd();
        int int59 = scriptNode44.getFunctionCount();
        org.junit.Assert.assertNotNull(scriptNode11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "{\n}\n" + "'", str41, "{\n}\n");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "                      {\n                      }\n" + "'", str43, "                      {\n                      }\n");
        org.junit.Assert.assertNotNull(symbolList51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "-1\t  SCRIPT -53 1\n" + "'", str52, "-1\t  SCRIPT -53 1\n");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "136" + "'", str56, "136");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test15735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15735");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope1.setPosition(100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType8 = null;
        com.google.javascript.rhino.head.ast.Comment comment10 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType8, "Scope");
        scriptNode5.setParent((com.google.javascript.rhino.head.ast.AstNode) comment10);
        scriptNode5.setEncodedSourceStart((int) (byte) 100);
        int int16 = scriptNode5.getIntProp(6, 2);
        int int17 = scriptNode5.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope21 = scope19.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node22 = scope19.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType26, "Scope");
        scriptNode23.setParent((com.google.javascript.rhino.head.ast.AstNode) comment28);
        scope19.setJsDocNode(comment28);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType34 = null;
        com.google.javascript.rhino.head.ast.Comment comment36 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType34, "Scope");
        scriptNode31.setParent((com.google.javascript.rhino.head.ast.AstNode) comment36);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList38 = scriptNode31.getSymbols();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode5, (com.google.javascript.rhino.head.Node) scope19, (com.google.javascript.rhino.head.Node) scriptNode31);
        scriptNode31.setPosition((int) (byte) 0);
        scope1.setTop(scriptNode31);
        int int43 = scriptNode31.getParamCount();
        boolean boolean44 = scriptNode31.hasConsistentReturnUsage();
        java.lang.String str45 = scriptNode31.getEncodedSource();
        com.google.javascript.rhino.head.Token.CommentType commentType50 = null;
        com.google.javascript.rhino.head.ast.Comment comment52 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType50, "Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str54 = scriptNode53.getEncodedSource();
        scriptNode53.setEncodedSourceEnd(18);
        java.lang.String str57 = comment52.toStringTree(scriptNode53);
        com.google.javascript.rhino.head.Node node59 = com.google.javascript.rhino.head.Node.newString("{\n}\n");
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode53, node59);
        scriptNode53.setEncodedSourceStart(25);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType66 = null;
        com.google.javascript.rhino.head.ast.Comment comment68 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType66, "Scope");
        scriptNode63.setParent((com.google.javascript.rhino.head.ast.AstNode) comment68);
        scriptNode63.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str72 = scriptNode63.getSourceName();
        com.google.javascript.rhino.head.ast.Scope scope74 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope74.putProp(25, (java.lang.Object) 100L);
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node(9, (com.google.javascript.rhino.head.Node) scriptNode53, (com.google.javascript.rhino.head.Node) scriptNode63, (com.google.javascript.rhino.head.Node) scope74, (int) (byte) 10);
        java.lang.String str80 = scriptNode53.getNextTempName();
        java.lang.String str81 = scriptNode31.toStringTree(scriptNode53);
        com.google.javascript.rhino.head.Node node82 = scriptNode53.getLastChild();
        com.google.javascript.rhino.head.Node node83 = scriptNode53.target;
        int int84 = scriptNode53.getParamCount();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(symbolList38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "$0" + "'", str80, "$0");
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test15736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15736");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType4, "Scope");
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        scriptNode1.setEncodedSourceStart((int) (byte) 100);
        int int12 = scriptNode1.getIntProp(6, 2);
        int int13 = scriptNode1.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str15 = scriptNode14.getEncodedSource();
        int int16 = scriptNode14.getBaseLineno();
        java.lang.String str17 = scriptNode14.getNextTempName();
        scriptNode1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode14);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType22 = null;
        com.google.javascript.rhino.head.ast.Comment comment24 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType22, "Scope");
        scriptNode19.setParent((com.google.javascript.rhino.head.ast.AstNode) comment24);
        scriptNode19.setEncodedSourceStart((int) (byte) 100);
        int int30 = scriptNode19.getIntProp(6, 2);
        scriptNode19.setEndLineno(18);
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(1, (com.google.javascript.rhino.head.Node) scriptNode14, (com.google.javascript.rhino.head.Node) scriptNode19, (int) (byte) -1);
        com.google.javascript.rhino.head.ast.AstNode astNode35 = scriptNode19.getParent();
        int int36 = scriptNode19.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.Scope scope38 = scriptNode19.getDefiningScope("      ");
        int int39 = scriptNode19.getEncodedSourceEnd();
        scriptNode19.setLength(22);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$0" + "'", str17, "$0");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(astNode35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNull(scope38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test15737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15737");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(21);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType6 = null;
        com.google.javascript.rhino.head.ast.Comment comment8 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType6, "Scope");
        scriptNode3.setParent((com.google.javascript.rhino.head.ast.AstNode) comment8);
        scriptNode3.setEncodedSourceStart((int) (byte) 100);
        int int14 = scriptNode3.getIntProp(6, 2);
        scriptNode3.setEndLineno(18);
        int int17 = scriptNode3.getParamCount();
        com.google.javascript.rhino.head.ast.Scope scope18 = scriptNode3.getParentScope();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator19 = scriptNode3.new NodeIterator();
        boolean boolean20 = nodeIterator19.hasNext();
        boolean boolean21 = nodeIterator19.hasNext();
        scriptNode1.putProp((int) (byte) 10, (java.lang.Object) nodeIterator19);
        boolean boolean23 = nodeIterator19.hasNext();
        boolean boolean24 = nodeIterator19.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node25 = nodeIterator19.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test15738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15738");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType5 = null;
        com.google.javascript.rhino.head.ast.Comment comment7 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType5, "Scope");
        scriptNode2.setParent((com.google.javascript.rhino.head.ast.AstNode) comment7);
        scriptNode2.setEncodedSourceStart((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = scriptNode2.getTop();
        scriptNode11.setPosition(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int16 = scriptNode15.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str18 = scriptNode17.getEncodedSource();
        scriptNode17.setEncodedSourceEnd(18);
        scriptNode15.target = scriptNode17;
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (com.google.javascript.rhino.head.Node) scriptNode11, (com.google.javascript.rhino.head.Node) scriptNode17);
        scriptNode17.setEncodedSourceEnd(11);
        java.lang.String str25 = scriptNode17.getEncodedSource();
        scriptNode17.setEncodedSource("52\tCOMMENT 52 6\n");
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(6, (com.google.javascript.rhino.head.Node) scriptNode17);
        java.lang.String str29 = scriptNode17.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str31 = scriptNode30.getEncodedSource();
        scriptNode30.setEncodedSourceEnd(18);
        java.lang.String str35 = scriptNode30.makeIndent((int) '#');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType39 = null;
        com.google.javascript.rhino.head.ast.Comment comment41 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType39, "Scope");
        scriptNode36.setParent((com.google.javascript.rhino.head.ast.AstNode) comment41);
        scriptNode36.setEncodedSourceStart((int) (byte) 100);
        scriptNode30.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode36);
        int int46 = scriptNode30.getRegexpCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType51 = null;
        com.google.javascript.rhino.head.ast.Comment comment53 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType51, "Scope");
        scriptNode48.setParent((com.google.javascript.rhino.head.ast.AstNode) comment53);
        scriptNode48.setEncodedSourceStart((int) (byte) 100);
        int int59 = scriptNode48.getIntProp(6, 2);
        int int60 = scriptNode48.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope62 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope64 = scope62.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node65 = scope62.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType69 = null;
        com.google.javascript.rhino.head.ast.Comment comment71 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType69, "Scope");
        scriptNode66.setParent((com.google.javascript.rhino.head.ast.AstNode) comment71);
        scope62.setJsDocNode(comment71);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode74 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType77 = null;
        com.google.javascript.rhino.head.ast.Comment comment79 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType77, "Scope");
        scriptNode74.setParent((com.google.javascript.rhino.head.ast.AstNode) comment79);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList81 = scriptNode74.getSymbols();
        com.google.javascript.rhino.head.Node node82 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode48, (com.google.javascript.rhino.head.Node) scope62, (com.google.javascript.rhino.head.Node) scriptNode74);
        scriptNode74.setPosition((int) (byte) 0);
        scriptNode74.setEncodedSourceStart((int) (byte) 1);
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray87 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList88 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList88, symbolArray87);
        scriptNode74.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList88);
        scriptNode30.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList88);
        scriptNode17.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList88);
        java.lang.String str93 = scriptNode17.getEncodedSource();
        int int94 = scriptNode17.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.Comment comment95 = scriptNode17.getJsDocNode();
        boolean boolean96 = scriptNode17.hasChildren();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode97 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int98 = scriptNode17.addFunction(functionNode97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scriptNode11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "52\tCOMMENT 52 6\n" + "'", str29, "52\tCOMMENT 52 6\n");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "                                                                      " + "'", str35, "                                                                      ");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(scope64);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNotNull(symbolList81);
        org.junit.Assert.assertNotNull(symbolArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "52\tCOMMENT 52 6\n" + "'", str93, "52\tCOMMENT 52 6\n");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertNull(comment95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test15739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15739");
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
        com.google.javascript.rhino.head.ast.Scope scope37 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        scope37.setPosition(100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType44 = null;
        com.google.javascript.rhino.head.ast.Comment comment46 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType44, "Scope");
        scriptNode41.setParent((com.google.javascript.rhino.head.ast.AstNode) comment46);
        scriptNode41.setEncodedSourceStart((int) (byte) 100);
        int int52 = scriptNode41.getIntProp(6, 2);
        int int53 = scriptNode41.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope55 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope57 = scope55.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node58 = scope55.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType62 = null;
        com.google.javascript.rhino.head.ast.Comment comment64 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType62, "Scope");
        scriptNode59.setParent((com.google.javascript.rhino.head.ast.AstNode) comment64);
        scope55.setJsDocNode(comment64);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType70 = null;
        com.google.javascript.rhino.head.ast.Comment comment72 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType70, "Scope");
        scriptNode67.setParent((com.google.javascript.rhino.head.ast.AstNode) comment72);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList74 = scriptNode67.getSymbols();
        com.google.javascript.rhino.head.Node node75 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode41, (com.google.javascript.rhino.head.Node) scope55, (com.google.javascript.rhino.head.Node) scriptNode67);
        scriptNode67.setPosition((int) (byte) 0);
        scope37.setTop(scriptNode67);
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node(5, (com.google.javascript.rhino.head.Node) scriptNode67);
        scriptNode20.addChildrenToFront((com.google.javascript.rhino.head.Node) scriptNode67);
        boolean boolean81 = scriptNode20.hasConsistentReturnUsage();
        java.lang.String str82 = scriptNode20.getJsDoc();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(nodeSpliterator9);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNotNull(nodeSpliterator19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(scope57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(symbolList74);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNull(str82);
    }

    @Test
    public void test15740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15740");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType3, "Scope");
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment5);
        scriptNode0.setEncodedSourceStart((int) (byte) 100);
        java.lang.String str9 = scriptNode0.getSourceName();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator10 = scriptNode0.new NodeIterator();
        java.lang.String str11 = scriptNode0.shortName();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray12 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList13 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList13, symbolArray12);
        scriptNode0.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList13);
        scriptNode0.flattenSymbolTable(false);
        int int18 = scriptNode0.getParamCount();
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope22 = scope20.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node23 = scope20.target;
        scope20.setPosition(2);
        scope20.setLength((int) (byte) 1);
        com.google.javascript.rhino.head.Node node28 = scope20.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str30 = scriptNode29.getEncodedSource();
        scriptNode29.setEncodedSourceEnd(18);
        java.lang.String str34 = scriptNode29.makeIndent((int) '#');
        scope20.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode29);
        com.google.javascript.rhino.head.ast.Scope scope37 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 0);
        com.google.javascript.rhino.head.ast.Scope scope39 = scope37.getDefiningScope("Scope");
        com.google.javascript.rhino.head.Node node40 = scope37.target;
        scope37.setPosition(2);
        scope37.putIntProp(17, 25);
        scope37.setLength((int) ' ');
        scriptNode29.addChild((com.google.javascript.rhino.head.ast.AstNode) scope37);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str50 = scriptNode49.getEncodedSource();
        int int51 = scriptNode49.getBaseLineno();
        java.lang.Object obj52 = scriptNode49.getCompilerData();
        scriptNode49.setEncodedSourceBounds((int) '4', 0);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList56 = scriptNode49.getSymbols();
        scope37.setTop(scriptNode49);
        scriptNode49.setEncodedSourceBounds((int) (short) -1, 19);
        scriptNode0.target = scriptNode49;
        java.lang.String str62 = scriptNode0.getEncodedSource();
        // The following exception was thrown during execution in test generation
        try {
            scriptNode0.setDouble((double) (-399411339));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.ScriptNode cannot be cast to com.google.javascript.rhino.head.ast.NumberLiteral");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ScriptNode" + "'", str11, "ScriptNode");
        org.junit.Assert.assertNotNull(symbolArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "                                                                      " + "'", str34, "                                                                      ");
        org.junit.Assert.assertNull(scope39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(symbolList56);
        org.junit.Assert.assertNull(str62);
    }

    @Test
    public void test15741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15741");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getEncodedSource();
        scriptNode0.setEncodedSourceEnd(18);
        java.lang.String str5 = scriptNode0.makeIndent((int) '#');
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator6 = scriptNode0.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope7 = scriptNode0.getParentScope();
        java.lang.String str8 = scriptNode0.getNextTempName();
        int int9 = scriptNode0.getType();
        com.google.javascript.rhino.head.Node node11 = scriptNode0.setType(0);
        java.lang.String str12 = scriptNode0.getSourceName();
        com.google.javascript.rhino.head.Node node13 = scriptNode0.getFirstChild();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                      " + "'", str5, "                                                                      ");
        org.junit.Assert.assertNotNull(nodeSpliterator6);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$0" + "'", str8, "$0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 136 + "'", int9 == 136);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test15742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15742");
        com.google.javascript.rhino.head.Token.CommentType commentType2 = null;
        com.google.javascript.rhino.head.ast.Comment comment4 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType2, "Scope");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str6 = scriptNode5.getEncodedSource();
        scriptNode5.setEncodedSourceEnd(18);
        java.lang.String str9 = comment4.toStringTree(scriptNode5);
        int int10 = comment4.getType();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode(11);
        int int13 = scriptNode12.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str15 = scriptNode14.getEncodedSource();
        scriptNode14.setEncodedSourceEnd(18);
        scriptNode12.target = scriptNode14;
        int int19 = scriptNode14.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Token.CommentType commentType23 = null;
        com.google.javascript.rhino.head.ast.Comment comment25 = new com.google.javascript.rhino.head.ast.Comment((int) '4', 6, commentType23, "Scope");
        scriptNode20.setParent((com.google.javascript.rhino.head.ast.AstNode) comment25);
        scriptNode20.setEncodedSourceStart((int) (byte) 100);
        int int31 = scriptNode20.getIntProp(6, 2);
        int int32 = scriptNode20.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str34 = scriptNode33.getEncodedSource();
        int int35 = scriptNode33.getBaseLineno();
        java.lang.String str36 = scriptNode33.getNextTempName();
        scriptNode20.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode33);
        int int38 = scriptNode33.getType();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList39 = scriptNode33.getChildScopes();
        comment4.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode14, (com.google.javascript.rhino.head.Node) scriptNode33);
        comment4.putIntProp(23, 17);
        boolean boolean44 = comment4.hasSideEffects();
        java.lang.String str45 = comment4.shortName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 161 + "'", int10 == 161);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "$0" + "'", str36, "$0");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 136 + "'", int38 == 136);
        org.junit.Assert.assertNull(scopeList39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Comment" + "'", str45, "Comment");
    }
}
