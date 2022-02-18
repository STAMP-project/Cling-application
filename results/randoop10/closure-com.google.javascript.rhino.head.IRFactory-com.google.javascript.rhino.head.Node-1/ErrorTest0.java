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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = scriptNode0.getFunctionNode((int) (byte) 10);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList3 = scriptNode1.getFunctions();
        scriptNode1.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList9 = scriptNode7.getChildScopes();
        int int10 = scriptNode7.getBaseLineno();
        com.google.javascript.rhino.head.Node node11 = scriptNode7.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node12 = scriptNode1.getChildBefore(node11);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator1 = astRoot0.new NodeIterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = astRoot0.getRegexpFlags(0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = scriptNode1.getRegexpString(1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList9 = scriptNode7.getChildScopes();
        java.lang.String str11 = scriptNode7.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scriptNode13);
        java.lang.Object obj16 = scriptNode7.getProp((int) (short) -1);
        scriptNode7.setSourceName("-1\tSCRIPT -1 1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = scriptNode7.getRegexpString(18);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean11 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean13 = compilerEnvirons12.isReservedKeywordAsIdentifier();
        boolean boolean14 = compilerEnvirons12.getWarnTrailingComma();
        compilerEnvirons12.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet17 = compilerEnvirons12.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter18 = compilerEnvirons12.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = iRFactory19.eof();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList9 = scriptNode7.getChildScopes();
        java.lang.String str11 = scriptNode7.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scriptNode13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = scriptNode1.getRegexpString(23);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator1 = scriptNode0.spliterator();
        com.google.javascript.rhino.head.Node node3 = scriptNode0.setType((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = scriptNode0.getRegexpFlags(1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        int int6 = scriptNode1.getEndLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = scriptNode1.getRegexpFlags((int) (byte) 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode4.removeProp(10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator8 = astRoot7.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor9 = astRoot7.iterator();
        scriptNode4.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot7);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode11.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode12);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList14 = scriptNode12.getChildScopes();
        int int15 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot7, (com.google.javascript.rhino.head.ast.AstNode) scriptNode12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = scriptNode12.getRegexpFlags(0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet1 = astRoot0.getComments();
        int int2 = astRoot0.getEndLineno();
        com.google.javascript.rhino.head.Node node4 = astRoot0.setType((int) (short) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode6);
        scriptNode6.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap12 = scriptNode11.getSymbolTable();
        scriptNode6.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode14.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode15);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList17 = scriptNode15.getChildScopes();
        int int18 = scriptNode15.getBaseLineno();
        com.google.javascript.rhino.head.Node node19 = scriptNode15.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode20.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode21);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList23 = scriptNode21.getChildScopes();
        java.lang.String str25 = scriptNode21.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode15.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode21, (com.google.javascript.rhino.head.Node) scriptNode27);
        scriptNode6.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode15);
        int int30 = scriptNode6.getRegexpCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode31.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode32);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList34 = scriptNode32.getChildScopes();
        int int35 = scriptNode32.getBaseLineno();
        com.google.javascript.rhino.head.Node node36 = scriptNode32.getLastSibling();
        int int37 = scriptNode32.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator38 = scriptNode32.new NodeIterator();
        int int39 = scriptNode32.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        astRoot0.replaceChildAfter((com.google.javascript.rhino.head.Node) scriptNode6, (com.google.javascript.rhino.head.Node) scriptNode32);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int2 = compilerEnvirons0.getLanguageVersion();
        int int3 = compilerEnvirons0.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean5 = compilerEnvirons4.isReservedKeywordAsIdentifier();
        compilerEnvirons4.setStrictMode(true);
        compilerEnvirons4.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean11 = compilerEnvirons10.isReservedKeywordAsIdentifier();
        boolean boolean12 = compilerEnvirons10.getWarnTrailingComma();
        compilerEnvirons10.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet15 = compilerEnvirons10.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = compilerEnvirons10.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter16);
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = iRFactory18.eof();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode6);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList8 = scriptNode6.getChildScopes();
        java.lang.String str10 = scriptNode6.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode11.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode12);
        scriptNode12.setEncodedSourceEnd(11);
        int int16 = scriptNode6.compareTo((com.google.javascript.rhino.head.ast.AstNode) scriptNode12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node17 = scriptNode1.getChildBefore((com.google.javascript.rhino.head.Node) scriptNode12);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList9 = scriptNode7.getChildScopes();
        int int10 = scriptNode7.getBaseLineno();
        com.google.javascript.rhino.head.Node node11 = scriptNode7.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode12.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode13);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = scriptNode13.getChildScopes();
        java.lang.String str17 = scriptNode13.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode7.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode13, (com.google.javascript.rhino.head.Node) scriptNode19);
        java.lang.Object obj22 = scriptNode13.getProp((int) (short) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str25 = scriptNode23.toSource((int) '4');
        java.lang.String str26 = scriptNode13.toStringTree(scriptNode23);
        scriptNode23.setLength((-1));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode30.removeProp(10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator34 = astRoot33.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor35 = astRoot33.iterator();
        scriptNode30.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot33);
        java.lang.String str37 = scriptNode30.toString();
        scriptNode23.setCompilerData((java.lang.Object) scriptNode30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node39 = node5.getChildBefore((com.google.javascript.rhino.head.Node) scriptNode30);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        int int6 = scriptNode1.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = scriptNode1.new NodeIterator();
        int int8 = scriptNode1.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = scriptNode1.getRegexpFlags(136);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        java.lang.String str7 = scriptNode1.toSource((int) (short) -1);
        int int8 = scriptNode1.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = scriptNode1.getFunctionNode((int) (byte) -1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        int int5 = scriptNode1.getParamCount();
        scriptNode1.flattenSymbolTable(true);
        com.google.javascript.rhino.head.ast.Scope scope8 = scriptNode1.getEnclosingScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = scriptNode1.getFunctionNode(12);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        scriptNode1.clearParentScope();
        java.lang.String str5 = scriptNode1.getSourceName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = scriptNode1.getRegexpString(0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList9 = scriptNode7.getChildScopes();
        java.lang.String str11 = scriptNode7.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scriptNode13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = scriptNode7.getFunctionNode(65536);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        java.lang.Object obj2 = scriptNode1.getCompilerData();
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator4 = scope3.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode6);
        scope3.setTop(scriptNode6);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode1, (com.google.javascript.rhino.head.ast.Scope) scriptNode6);
        int int12 = scriptNode1.getIntProp(9, 9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = scriptNode1.getRegexpFlags((int) (byte) 100);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compilerEnvirons0.getErrorReporter();
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setGeneratingSource(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean11 = compilerEnvirons10.isReservedKeywordAsIdentifier();
        int int12 = compilerEnvirons10.getLanguageVersion();
        int int13 = compilerEnvirons10.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean15 = compilerEnvirons14.isReservedKeywordAsIdentifier();
        compilerEnvirons14.setStrictMode(true);
        compilerEnvirons14.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean21 = compilerEnvirons20.isReservedKeywordAsIdentifier();
        boolean boolean22 = compilerEnvirons20.getWarnTrailingComma();
        compilerEnvirons20.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet25 = compilerEnvirons20.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = compilerEnvirons20.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons14, errorReporter26);
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter26);
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean30 = iRFactory29.eof();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        scriptNode1.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode8.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList11 = scriptNode9.getFunctions();
        scriptNode9.setPosition((int) (byte) 10);
        java.lang.String str14 = scriptNode1.toStringTree(scriptNode9);
        int int15 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node17 = scriptNode1.setType((int) (byte) -1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor18 = scriptNode1.iterator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator19 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator20 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator21 = positionComparator19.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator20);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int23 = astRoot22.getBaseLineno();
        java.lang.String str24 = astRoot22.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator26 = astRoot25.new NodeIterator();
        int int27 = positionComparator20.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot22, (com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        boolean boolean28 = astRoot22.isInStrictMode();
        scriptNode1.addChildToFront((com.google.javascript.rhino.head.Node) astRoot22);
        com.google.javascript.rhino.head.Node node30 = scriptNode1.getNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = scriptNode1.getRegexpString((-325419474));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.putIntProp((int) (short) 1, 1);
        scriptNode0.setEncodedSource("typeof");
        java.lang.Object obj7 = scriptNode0.getProp(2);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList8 = scriptNode0.getStatements();
        java.lang.String str9 = scriptNode0.toSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = scriptNode0.getRegexpFlags((int) (short) 1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray1 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList2 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList2, symbolArray1);
        scriptNode0.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList2);
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int6 = astRoot5.getParamCount();
        int int7 = astRoot5.getRegexpCount();
        scriptNode0.addChildToBack((com.google.javascript.rhino.head.Node) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = astRoot5.getAstRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = astRoot5.getRegexpFlags(0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        boolean boolean3 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean8 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean12 = compilerEnvirons11.isReservedKeywordAsIdentifier();
        boolean boolean13 = compilerEnvirons11.getWarnTrailingComma();
        compilerEnvirons11.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet16 = compilerEnvirons11.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = compilerEnvirons11.getErrorReporter();
        java.lang.String[] strArray23 = new java.lang.String[] { "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n", "                                ", "typeof", "                                                                                                                                                                                                        ", "{\n}\n" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        compilerEnvirons11.setActivationNames((java.util.Set<java.lang.String>) strSet24);
        boolean boolean27 = compilerEnvirons11.isGenerateDebugInfo();
        boolean boolean28 = compilerEnvirons11.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean30 = compilerEnvirons29.isReservedKeywordAsIdentifier();
        int int31 = compilerEnvirons29.getLanguageVersion();
        int int32 = compilerEnvirons29.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons33 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean34 = compilerEnvirons33.isReservedKeywordAsIdentifier();
        compilerEnvirons33.setStrictMode(true);
        compilerEnvirons33.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons39 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean40 = compilerEnvirons39.isReservedKeywordAsIdentifier();
        boolean boolean41 = compilerEnvirons39.getWarnTrailingComma();
        compilerEnvirons39.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet44 = compilerEnvirons39.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter45 = compilerEnvirons39.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory46 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons33, errorReporter45);
        com.google.javascript.rhino.head.IRFactory iRFactory47 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter45);
        com.google.javascript.rhino.head.IRFactory iRFactory48 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons11, errorReporter45);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons49 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray55 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        compilerEnvirons49.setActivationNames((java.util.Set<java.lang.String>) strSet56);
        boolean boolean59 = compilerEnvirons49.isGenerateDebugInfo();
        compilerEnvirons49.setOptimizationLevel((int) (short) 1);
        compilerEnvirons49.setAllowSharpComments(true);
        boolean boolean64 = compilerEnvirons49.getAllowSharpComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter65 = compilerEnvirons49.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser66 = new com.google.javascript.rhino.head.Parser(compilerEnvirons11, errorReporter65);
        com.google.javascript.rhino.head.IRFactory iRFactory67 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean68 = iRFactory67.eof();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        int int5 = scriptNode1.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList9 = scriptNode7.getFunctions();
        scriptNode7.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope12 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scope12);
        scriptNode7.setEncodedSource("-1\tSCRIPT -1 1\n");
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList16 = scriptNode7.getStatements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = scriptNode7.getRegexpString((int) (byte) -1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = iRFactory1.eof();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        int int5 = scriptNode1.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList9 = scriptNode7.getFunctions();
        scriptNode7.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope12 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scope12);
        scriptNode7.setEncodedSourceEnd(18);
        java.lang.String str16 = scriptNode7.getJsDoc();
        int int17 = scriptNode7.depth();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode18.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode19);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList21 = scriptNode19.getChildScopes();
        int int22 = scriptNode19.getBaseLineno();
        com.google.javascript.rhino.head.Node node23 = scriptNode19.getLastSibling();
        scriptNode19.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode26.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode27);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList29 = scriptNode27.getFunctions();
        scriptNode27.setPosition((int) (byte) 10);
        java.lang.String str32 = scriptNode19.toStringTree(scriptNode27);
        int int33 = scriptNode19.getBaseLineno();
        com.google.javascript.rhino.head.Node node35 = scriptNode19.setType((int) (byte) -1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor36 = scriptNode19.iterator();
        java.lang.String str38 = scriptNode19.makeIndent(26);
        int int39 = scriptNode19.depth();
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newNumber(10.0d);
        double double42 = node41.getDouble();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode7.replaceChildAfter((com.google.javascript.rhino.head.Node) scriptNode19, node41);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode1.removeProp(10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator5 = astRoot4.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor6 = astRoot4.iterator();
        scriptNode1.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot4);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode8.putIntProp((int) (short) 1, 1);
        scriptNode8.setEncodedSource("typeof");
        java.lang.Object obj15 = scriptNode8.getProp(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        astRoot4.removeChild((com.google.javascript.rhino.head.Node) scriptNode8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet1 = astRoot0.getComments();
        java.lang.String str2 = astRoot0.getSourceName();
        boolean boolean3 = astRoot0.hasChildren();
        com.google.javascript.rhino.head.Node node4 = astRoot0.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = astRoot0.getRegexpString(22);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        java.lang.Object obj3 = scriptNode2.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode4.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode5);
        int int7 = scriptNode4.getEndLineno();
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(170, (com.google.javascript.rhino.head.Node) scriptNode2, (com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator10 = astRoot9.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType13 = null;
        com.google.javascript.rhino.head.ast.Comment comment15 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType13, "");
        boolean boolean16 = comment15.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType19 = null;
        com.google.javascript.rhino.head.ast.Comment comment21 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType19, "");
        boolean boolean22 = comment21.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType25 = null;
        com.google.javascript.rhino.head.ast.Comment comment27 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType25, "");
        java.lang.String str29 = comment27.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray30 = new com.google.javascript.rhino.head.ast.Comment[] { comment15, comment21, comment27 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet31 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet31, commentArray30);
        astRoot9.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet31);
        java.lang.String str34 = astRoot9.getEncodedSource();
        com.google.javascript.rhino.head.Node node35 = astRoot9.target;
        scriptNode2.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot9);
        java.lang.String str37 = astRoot9.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator39 = astRoot38.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType42 = null;
        com.google.javascript.rhino.head.ast.Comment comment44 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType42, "");
        boolean boolean45 = comment44.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType48 = null;
        com.google.javascript.rhino.head.ast.Comment comment50 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType48, "");
        boolean boolean51 = comment50.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType54 = null;
        com.google.javascript.rhino.head.ast.Comment comment56 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType54, "");
        java.lang.String str58 = comment56.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray59 = new com.google.javascript.rhino.head.ast.Comment[] { comment44, comment50, comment56 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet60 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet60, commentArray59);
        astRoot38.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet60);
        boolean boolean63 = astRoot38.isInStrictMode();
        com.google.javascript.rhino.head.ast.AstNode astNode64 = astRoot38.getParent();
        java.lang.String str65 = astRoot38.debugPrint();
        int int66 = astRoot38.getEncodedSourceStart();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet67 = astRoot38.getComments();
        astRoot9.setComments(commentSet67);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on commentSet60, commentSet67, and commentSet31.", !(commentSet60.equals(commentSet67) && commentSet67.equals(commentSet31)) || commentSet60.equals(commentSet31));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        java.lang.String str5 = scriptNode1.makeIndent((int) (byte) -1);
        java.lang.String str6 = scriptNode1.debugPrint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = scriptNode1.getRegexpString(19);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        int int5 = scriptNode1.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList9 = scriptNode7.getFunctions();
        scriptNode7.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope12 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scope12);
        boolean boolean14 = scriptNode7.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = scriptNode7.getFunctionNode(16);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode2);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList4 = scriptNode2.getFunctions();
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode2, 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = scriptNode2.getRegexpString((-213029975));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        int int5 = scriptNode1.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList9 = scriptNode7.getFunctions();
        scriptNode7.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope12 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scope12);
        scriptNode7.setEncodedSourceEnd(18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = scriptNode7.getRegexpFlags((int) (byte) 1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        int int5 = scriptNode1.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList9 = scriptNode7.getFunctions();
        scriptNode7.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope12 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scope12);
        int int14 = scriptNode7.getEndLineno();
        scriptNode7.setEncodedSource("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode18 = scriptNode7.getFunctionNode(0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        com.google.javascript.rhino.head.Parser parser10 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        compilerEnvirons0.setRecoverFromErrors(false);
        com.google.javascript.rhino.head.Parser parser13 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = parser13.eof();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator2 = astRoot1.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType5 = null;
        com.google.javascript.rhino.head.ast.Comment comment7 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType5, "");
        boolean boolean8 = comment7.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType11 = null;
        com.google.javascript.rhino.head.ast.Comment comment13 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType11, "");
        boolean boolean14 = comment13.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType17 = null;
        com.google.javascript.rhino.head.ast.Comment comment19 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType17, "");
        java.lang.String str21 = comment19.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray22 = new com.google.javascript.rhino.head.ast.Comment[] { comment7, comment13, comment19 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet23 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet23, commentArray22);
        astRoot1.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet23);
        boolean boolean26 = astRoot1.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray27 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList28 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList28, symbolArray27);
        astRoot1.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList28);
        int int31 = astRoot1.getLineno();
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator33 = astRoot32.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType36 = null;
        com.google.javascript.rhino.head.ast.Comment comment38 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType36, "");
        boolean boolean39 = comment38.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType42 = null;
        com.google.javascript.rhino.head.ast.Comment comment44 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType42, "");
        boolean boolean45 = comment44.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType48 = null;
        com.google.javascript.rhino.head.ast.Comment comment50 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType48, "");
        java.lang.String str52 = comment50.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray53 = new com.google.javascript.rhino.head.ast.Comment[] { comment38, comment44, comment50 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet54 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet54, commentArray53);
        astRoot32.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet54);
        boolean boolean57 = astRoot32.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray58 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList59 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList59, symbolArray58);
        astRoot32.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList59);
        com.google.javascript.rhino.head.Node node62 = astRoot32.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode64 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode63.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode64);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot32, (com.google.javascript.rhino.head.ast.Scope) scriptNode64);
        com.google.javascript.rhino.head.ast.AstRoot astRoot67 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator68 = astRoot67.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor69 = astRoot67.iterator();
        astRoot67.setInStrictMode(true);
        com.google.javascript.rhino.head.Node node73 = new com.google.javascript.rhino.head.Node(136, (com.google.javascript.rhino.head.Node) astRoot1, (com.google.javascript.rhino.head.Node) astRoot32, (com.google.javascript.rhino.head.Node) astRoot67, (int) (byte) 0);
        astRoot32.setInStrictMode(false);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet76 = astRoot32.getComments();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on commentSet54, commentSet76, and commentSet23.", !(commentSet54.equals(commentSet76) && commentSet76.equals(commentSet23)) || commentSet54.equals(commentSet23));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator1 = astRoot0.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType4, "");
        boolean boolean7 = comment6.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType10 = null;
        com.google.javascript.rhino.head.ast.Comment comment12 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType10, "");
        boolean boolean13 = comment12.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType16 = null;
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType16, "");
        java.lang.String str20 = comment18.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray21 = new com.google.javascript.rhino.head.ast.Comment[] { comment6, comment12, comment18 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet22 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet22, commentArray21);
        astRoot0.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet22);
        boolean boolean25 = astRoot0.isInStrictMode();
        com.google.javascript.rhino.head.ast.AstNode astNode26 = astRoot0.getParent();
        java.lang.String str27 = astRoot0.debugPrint();
        int int28 = astRoot0.getEncodedSourceStart();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet29 = astRoot0.getComments();
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator31 = astRoot30.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType34 = null;
        com.google.javascript.rhino.head.ast.Comment comment36 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType34, "");
        boolean boolean37 = comment36.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType40 = null;
        com.google.javascript.rhino.head.ast.Comment comment42 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType40, "");
        boolean boolean43 = comment42.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType46 = null;
        com.google.javascript.rhino.head.ast.Comment comment48 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType46, "");
        java.lang.String str50 = comment48.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray51 = new com.google.javascript.rhino.head.ast.Comment[] { comment36, comment42, comment48 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet52 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet52, commentArray51);
        astRoot30.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet52);
        boolean boolean55 = astRoot30.isInStrictMode();
        com.google.javascript.rhino.head.Token.CommentType commentType58 = null;
        com.google.javascript.rhino.head.ast.Comment comment60 = new com.google.javascript.rhino.head.ast.Comment((int) '#', 2, commentType58, "hi!");
        astRoot30.addComment(comment60);
        int int62 = astRoot0.compareTo((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on commentSet29 and commentSet52.", commentSet29.equals(commentSet52) == commentSet52.equals(commentSet29));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getParamCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = astRoot0.getRegexpString(17);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setXmlAvailable(true);
        compilerEnvirons0.setXmlAvailable(true);
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = iRFactory8.eof();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int4 = astRoot3.getBaseLineno();
        java.lang.String str5 = astRoot3.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = astRoot6.new NodeIterator();
        int int8 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot3, (com.google.javascript.rhino.head.ast.AstNode) astRoot6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator10 = scriptNode9.spliterator();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator11 = scriptNode9.new NodeIterator();
        astRoot6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        astRoot6.checkParentLinks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = astRoot6.getRegexpFlags(17);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getBaseLineno();
        int int2 = astRoot0.getLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode3.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode4);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList6 = scriptNode4.getChildScopes();
        int int7 = scriptNode4.getBaseLineno();
        com.google.javascript.rhino.head.Node node8 = scriptNode4.getLastSibling();
        scriptNode4.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode11.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode12);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList14 = scriptNode12.getFunctions();
        scriptNode12.setPosition((int) (byte) 10);
        java.lang.String str17 = scriptNode4.toStringTree(scriptNode12);
        int int18 = scriptNode4.getBaseLineno();
        astRoot0.target = scriptNode4;
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet20 = astRoot0.getComments();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = astRoot0.getRegexpFlags((-405371752));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        scriptNode1.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap7 = scriptNode6.getSymbolTable();
        scriptNode1.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode6);
        int int9 = scriptNode6.getLineno();
        int int10 = scriptNode6.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope13 = new com.google.javascript.rhino.head.ast.Scope(10, 9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode6.replaceChild((com.google.javascript.rhino.head.Node) scope13, (com.google.javascript.rhino.head.Node) scriptNode15);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        int int5 = scriptNode1.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList9 = scriptNode7.getFunctions();
        scriptNode7.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope12 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scope12);
        int int14 = scriptNode7.getEndLineno();
        scriptNode7.setEncodedSource("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = scriptNode7.getRegexpFlags(18);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        com.google.javascript.rhino.head.ErrorReporter errorReporter10 = compilerEnvirons0.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = iRFactory11.eof();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        scriptNode1.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode6);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList8 = scriptNode6.getChildScopes();
        int int9 = scriptNode6.getBaseLineno();
        com.google.javascript.rhino.head.Node node10 = scriptNode6.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode11.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode12);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList14 = scriptNode12.getChildScopes();
        java.lang.String str16 = scriptNode12.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode6.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode12, (com.google.javascript.rhino.head.Node) scriptNode18);
        int int20 = scriptNode12.getType();
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode12);
        int int22 = scriptNode12.getParamCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = scriptNode12.getRegexpFlags((int) (byte) 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(true);
        int int4 = compilerEnvirons0.getOptimizationLevel();
        int int5 = compilerEnvirons0.getLanguageVersion();
        boolean boolean6 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = iRFactory7.eof();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getParamCount();
        int int2 = astRoot0.getRegexpCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = astRoot0.getRegexpFlags(12);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int4 = astRoot3.getBaseLineno();
        java.lang.String str5 = astRoot3.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = astRoot6.new NodeIterator();
        int int8 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot3, (com.google.javascript.rhino.head.ast.AstNode) astRoot6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode9.putIntProp((int) (short) 1, 1);
        java.lang.String str13 = scriptNode9.getEncodedSource();
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator15 = scope14.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode16.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        scope14.setTop(scriptNode17);
        scope14.setLineno((int) (short) -1);
        int int22 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode9, (com.google.javascript.rhino.head.ast.AstNode) scope14);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode23.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode24);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList26 = scriptNode24.getChildScopes();
        int int27 = scriptNode24.getBaseLineno();
        int int28 = scriptNode24.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode29.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode30);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList32 = scriptNode30.getFunctions();
        scriptNode30.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope35 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode24.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode30, (com.google.javascript.rhino.head.Node) scope35);
        scriptNode30.setEncodedSource("-1\tSCRIPT -1 1\n");
        java.lang.String str39 = scriptNode9.toStringTree(scriptNode30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str41 = scriptNode9.getRegexpString((-110742292));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope(10, 9);
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.Node node4 = scope3.getLastSibling();
        java.lang.String str5 = scope3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scope2.removeChild((com.google.javascript.rhino.head.Node) scope3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.google.javascript.rhino.head.ast.Scope scope0 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator1 = scope0.spliterator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = scope0.getAstRoot();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode3.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode4);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList6 = scriptNode4.getChildScopes();
        int int7 = scriptNode4.getBaseLineno();
        com.google.javascript.rhino.head.Node node8 = scriptNode4.getLastSibling();
        int int9 = scriptNode4.getEndLineno();
        scriptNode4.setBaseLineno(4);
        scriptNode4.clearParentScope();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = scriptNode4.getEnclosingFunction();
        scope0.target = scriptNode4;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = scriptNode4.getFunctionNode((int) (byte) 10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(1);
        com.google.javascript.rhino.head.Node node3 = scriptNode1.setType(1490422031);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = scriptNode1.getRegexpFlags((-447184571));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.putIntProp((int) (short) 1, 1);
        scriptNode0.setEncodedSource("typeof");
        java.lang.Object obj7 = scriptNode0.getProp(2);
        java.lang.Object obj8 = scriptNode0.getCompilerData();
        scriptNode0.setSourceName("-213029975\tSCRIPT -213029975 1\n");
        com.google.javascript.rhino.head.ast.Scope scope12 = new com.google.javascript.rhino.head.ast.Scope(2);
        scriptNode0.setParentScope(scope12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode14.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode15);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList17 = scriptNode15.getChildScopes();
        int int18 = scriptNode15.getBaseLineno();
        com.google.javascript.rhino.head.Node node19 = scriptNode15.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode20.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode21);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList23 = scriptNode21.getChildScopes();
        java.lang.String str25 = scriptNode21.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode15.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode21, (com.google.javascript.rhino.head.Node) scriptNode27);
        java.lang.String str29 = scriptNode15.getSourceName();
        com.google.javascript.rhino.head.Node node31 = scriptNode15.setType(25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node32 = scope12.getChildBefore(node31);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator1 = astRoot0.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType4, "");
        boolean boolean7 = comment6.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType10 = null;
        com.google.javascript.rhino.head.ast.Comment comment12 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType10, "");
        boolean boolean13 = comment12.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType16 = null;
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType16, "");
        java.lang.String str20 = comment18.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray21 = new com.google.javascript.rhino.head.ast.Comment[] { comment6, comment12, comment18 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet22 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet22, commentArray21);
        astRoot0.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet22);
        boolean boolean25 = astRoot0.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray26 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList27 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList27, symbolArray26);
        astRoot0.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList27);
        int int30 = astRoot0.getBaseLineno();
        com.google.javascript.rhino.head.ast.Comment comment31 = astRoot0.getJsDocNode();
        astRoot0.setBaseLineno((int) '4');
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator35 = astRoot34.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType38 = null;
        com.google.javascript.rhino.head.ast.Comment comment40 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType38, "");
        boolean boolean41 = comment40.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType44 = null;
        com.google.javascript.rhino.head.ast.Comment comment46 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType44, "");
        boolean boolean47 = comment46.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType50 = null;
        com.google.javascript.rhino.head.ast.Comment comment52 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType50, "");
        java.lang.String str54 = comment52.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray55 = new com.google.javascript.rhino.head.ast.Comment[] { comment40, comment46, comment52 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet56 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet56, commentArray55);
        astRoot34.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet56);
        boolean boolean59 = astRoot34.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray60 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList61 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList61, symbolArray60);
        astRoot34.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList61);
        int int64 = astRoot34.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode65 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode65.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode66);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList68 = scriptNode66.getChildScopes();
        int int69 = scriptNode66.getBaseLineno();
        com.google.javascript.rhino.head.Node node70 = scriptNode66.getLastSibling();
        scriptNode66.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode73 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode74 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode73.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode74);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList76 = scriptNode74.getFunctions();
        scriptNode74.setPosition((int) (byte) 10);
        java.lang.String str79 = scriptNode66.toStringTree(scriptNode74);
        int int80 = scriptNode66.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot34, (com.google.javascript.rhino.head.ast.Scope) scriptNode66);
        astRoot0.setParentScope((com.google.javascript.rhino.head.ast.Scope) astRoot34);
        astRoot0.setLineno((int) (short) 0);
        int int85 = astRoot0.getLength();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet86 = astRoot0.getComments();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on commentSet22, commentSet86, and commentSet56.", !(commentSet22.equals(commentSet86) && commentSet86.equals(commentSet56)) || commentSet22.equals(commentSet56));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        int int6 = scriptNode1.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = scriptNode1.new NodeIterator();
        int int8 = scriptNode1.getLineno();
        scriptNode1.setEncodedSourceEnd((int) (byte) -1);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap11 = scriptNode1.getSymbolTable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = scriptNode1.getRegexpFlags(603173706);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        boolean boolean1 = astRoot0.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = astRoot0.getRegexpFlags(875237497);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setGenerateDebugInfo(true);
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean10 = compilerEnvirons0.getWarnTrailingComma();
        com.google.javascript.rhino.head.Parser parser11 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = parser11.eof();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator1 = scriptNode0.spliterator();
        com.google.javascript.rhino.head.Node node3 = scriptNode0.setType((int) '#');
        boolean boolean4 = scriptNode0.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.Symbol symbol6 = scriptNode0.getSymbol("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = scriptNode0.getFunctionNode((-603115504));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.putIntProp((int) (short) 1, 1);
        scriptNode0.setEncodedSource("typeof");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = scriptNode0.getFunctionNode(17);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode2.flattenSymbolTable(true);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(538062289, (com.google.javascript.rhino.head.Node) scriptNode2, (-603115504));
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int8 = astRoot7.getBaseLineno();
        java.lang.String str9 = astRoot7.debugPrint();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList10 = astRoot7.getSymbols();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node11 = scriptNode2.getChildBefore((com.google.javascript.rhino.head.Node) astRoot7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (byte) 100, 24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode3.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode4);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList6 = scriptNode3.getStatements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node7 = scope2.getChildBefore((com.google.javascript.rhino.head.Node) scriptNode3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode2);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList4 = scriptNode2.getChildScopes();
        int int5 = scriptNode2.getBaseLineno();
        int int6 = scriptNode2.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode7.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode8);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList10 = scriptNode8.getFunctions();
        scriptNode8.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope13 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode2.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode8, (com.google.javascript.rhino.head.Node) scope13);
        scriptNode8.setEncodedSourceEnd(18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode17.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode18);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList20 = scriptNode18.getChildScopes();
        int int21 = scriptNode18.getBaseLineno();
        com.google.javascript.rhino.head.Node node22 = scriptNode18.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode23.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode24);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList26 = scriptNode24.getChildScopes();
        java.lang.String str28 = scriptNode24.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode18.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode24, (com.google.javascript.rhino.head.Node) scriptNode30);
        java.lang.Object obj33 = scriptNode24.getProp((int) (short) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str36 = scriptNode34.toSource((int) '4');
        java.lang.String str37 = scriptNode24.toStringTree(scriptNode34);
        scriptNode34.setLength((-1));
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) scriptNode8, (com.google.javascript.rhino.head.Node) scriptNode34, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str43 = scriptNode8.getRegexpString((int) '#');
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons6 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean7 = compilerEnvirons6.isReservedKeywordAsIdentifier();
        compilerEnvirons6.setStrictMode(true);
        compilerEnvirons6.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean13 = compilerEnvirons12.isReservedKeywordAsIdentifier();
        boolean boolean14 = compilerEnvirons12.getWarnTrailingComma();
        compilerEnvirons12.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet17 = compilerEnvirons12.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter18 = compilerEnvirons12.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons6, errorReporter18);
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = iRFactory20.eof();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        boolean boolean6 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = iRFactory7.eof();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int4 = astRoot3.getBaseLineno();
        java.lang.String str5 = astRoot3.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = astRoot6.new NodeIterator();
        int int8 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot3, (com.google.javascript.rhino.head.ast.AstNode) astRoot6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode9.putIntProp((int) (short) 1, 1);
        java.lang.String str13 = scriptNode9.getEncodedSource();
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator15 = scope14.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode16.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        scope14.setTop(scriptNode17);
        scope14.setLineno((int) (short) -1);
        int int22 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode9, (com.google.javascript.rhino.head.ast.AstNode) scope14);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode23.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode24);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList26 = scriptNode24.getChildScopes();
        int int27 = scriptNode24.getBaseLineno();
        int int28 = scriptNode24.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode29.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode30);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList32 = scriptNode30.getFunctions();
        scriptNode30.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope35 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode24.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode30, (com.google.javascript.rhino.head.Node) scope35);
        scriptNode30.setEncodedSource("-1\tSCRIPT -1 1\n");
        java.lang.String str39 = scriptNode9.toStringTree(scriptNode30);
        java.lang.Object obj40 = scriptNode9.getCompilerData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = scriptNode9.getRegexpFlags(0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setOptimizationLevel((int) (short) 1);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean15 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = compilerEnvirons0.getErrorReporter();
        int int17 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setXmlAvailable(false);
        com.google.javascript.rhino.head.Parser parser22 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = parser22.eof();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        int int6 = scriptNode1.getLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode7.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode8);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList10 = scriptNode8.getChildScopes();
        int int11 = scriptNode8.getBaseLineno();
        int int12 = scriptNode8.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode13.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode14);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList16 = scriptNode14.getFunctions();
        scriptNode14.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode8.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode14, (com.google.javascript.rhino.head.Node) scope19);
        scriptNode1.setTop(scriptNode8);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode23.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode24);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList26 = scriptNode24.getChildScopes();
        int int27 = scriptNode24.getBaseLineno();
        int int28 = scriptNode24.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode29.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode30);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList32 = scriptNode30.getFunctions();
        scriptNode30.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope35 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode24.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode30, (com.google.javascript.rhino.head.Node) scope35);
        int int37 = scriptNode30.getEndLineno();
        scriptNode30.setEncodedSource("hi!");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode43.flattenSymbolTable(true);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode46.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode47);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray50 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList51 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList51, symbolArray50);
        scriptNode49.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList51);
        scriptNode46.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList51);
        scriptNode43.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList51);
        scriptNode41.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList51);
        scriptNode30.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList51);
        com.google.javascript.rhino.head.ast.AstRoot astRoot59 = new com.google.javascript.rhino.head.ast.AstRoot(136);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator61 = scriptNode60.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode62 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode62.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode63);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList65 = scriptNode63.getChildScopes();
        int int66 = scriptNode63.getBaseLineno();
        com.google.javascript.rhino.head.Node node67 = scriptNode63.getLastSibling();
        int int68 = scriptNode63.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator69 = scriptNode63.new NodeIterator();
        int int70 = scriptNode63.getLineno();
        com.google.javascript.rhino.head.ast.AstRoot astRoot71 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator72 = astRoot71.new NodeIterator();
        scriptNode63.setCompilerData((java.lang.Object) nodeIterator72);
        scriptNode60.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode63);
        astRoot59.setParentScope((com.google.javascript.rhino.head.ast.Scope) scriptNode60);
        com.google.javascript.rhino.head.Node node77 = new com.google.javascript.rhino.head.Node((-933351410), (com.google.javascript.rhino.head.Node) scriptNode30, (com.google.javascript.rhino.head.Node) astRoot59, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node78 = scriptNode1.getChildBefore((com.google.javascript.rhino.head.Node) astRoot59);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet1 = astRoot0.getComments();
        int int2 = astRoot0.getEndLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = astRoot0.getFunctionNode(1879633086);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        boolean boolean5 = compilerEnvirons0.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        com.google.javascript.rhino.head.ast.AstRoot astRoot8 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet9 = astRoot8.getComments();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode10.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode11);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode11.getChildScopes();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator15 = scriptNode14.spliterator();
        com.google.javascript.rhino.head.Node node17 = scriptNode14.setType((int) '#');
        boolean boolean18 = scriptNode14.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node(13, (com.google.javascript.rhino.head.Node) astRoot8, (com.google.javascript.rhino.head.Node) scriptNode11, (com.google.javascript.rhino.head.Node) scriptNode14);
        com.google.javascript.rhino.head.Node node20 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode11);
        int int21 = scriptNode11.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode23.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode24);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList26 = scriptNode24.getChildScopes();
        int int27 = scriptNode24.getBaseLineno();
        com.google.javascript.rhino.head.Node node28 = scriptNode24.getLastSibling();
        int int29 = scriptNode24.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator30 = scriptNode24.new NodeIterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode31.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode32);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList34 = scriptNode32.getChildScopes();
        int int35 = scriptNode32.getBaseLineno();
        com.google.javascript.rhino.head.Node node36 = scriptNode32.getLastSibling();
        scriptNode32.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode39.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode40);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList42 = scriptNode40.getFunctions();
        scriptNode40.setPosition((int) (byte) 10);
        java.lang.String str45 = scriptNode32.toStringTree(scriptNode40);
        int int46 = scriptNode32.getBaseLineno();
        com.google.javascript.rhino.head.Node node48 = scriptNode32.setType((int) (byte) -1);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(9, (com.google.javascript.rhino.head.Node) scriptNode24, node48);
        scriptNode24.setEncodedSourceStart(100);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode11, (com.google.javascript.rhino.head.ast.Scope) scriptNode24);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons53 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean54 = compilerEnvirons53.isReservedKeywordAsIdentifier();
        boolean boolean55 = compilerEnvirons53.getWarnTrailingComma();
        compilerEnvirons53.setXmlAvailable(true);
        boolean boolean58 = compilerEnvirons53.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.IRFactory iRFactory59 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons53);
        com.google.javascript.rhino.head.ast.AstRoot astRoot61 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet62 = astRoot61.getComments();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode64 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode63.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode64);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList66 = scriptNode64.getChildScopes();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator68 = scriptNode67.spliterator();
        com.google.javascript.rhino.head.Node node70 = scriptNode67.setType((int) '#');
        boolean boolean71 = scriptNode67.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node(13, (com.google.javascript.rhino.head.Node) astRoot61, (com.google.javascript.rhino.head.Node) scriptNode64, (com.google.javascript.rhino.head.Node) scriptNode67);
        com.google.javascript.rhino.head.Node node73 = iRFactory59.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode11.removeChild(node73);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator3 = positionComparator0.reversed();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator4 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator5 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator6 = positionComparator4.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator5);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator7 = astNodeComparator6.reversed();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator8 = positionComparator0.thenComparing(astNodeComparator7);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode9.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList12 = scriptNode10.getChildScopes();
        int int13 = scriptNode10.getBaseLineno();
        com.google.javascript.rhino.head.Node node14 = scriptNode10.getLastSibling();
        int int15 = scriptNode10.getLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode16.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList19 = scriptNode17.getChildScopes();
        int int20 = scriptNode17.getBaseLineno();
        int int21 = scriptNode17.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode22.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode23);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList25 = scriptNode23.getFunctions();
        scriptNode23.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode17.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode23, (com.google.javascript.rhino.head.Node) scope28);
        scriptNode10.setTop(scriptNode17);
        scriptNode17.setEncodedSourceStart((int) (short) 10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet34 = astRoot33.getComments();
        java.lang.String str35 = astRoot33.getSourceName();
        boolean boolean36 = astRoot33.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode37.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode38);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList40 = scriptNode38.getChildScopes();
        int int41 = scriptNode38.getBaseLineno();
        com.google.javascript.rhino.head.Node node42 = scriptNode38.getLastSibling();
        scriptNode38.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode45.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode46);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList48 = scriptNode46.getFunctions();
        scriptNode46.setPosition((int) (byte) 10);
        java.lang.String str51 = scriptNode38.toStringTree(scriptNode46);
        int int52 = scriptNode38.getBaseLineno();
        boolean boolean53 = scriptNode38.hasConsistentReturnUsage();
        astRoot33.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode38);
        scriptNode17.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot33);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        java.lang.Object obj58 = scriptNode57.getCompilerData();
        com.google.javascript.rhino.head.ast.Scope scope59 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator60 = scope59.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode61 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode62 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode61.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode62);
        scope59.setTop(scriptNode62);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode57, (com.google.javascript.rhino.head.ast.Scope) scriptNode62);
        int int66 = positionComparator0.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode17, (com.google.javascript.rhino.head.ast.AstNode) scriptNode57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str68 = scriptNode57.getRegexpFlags((-568490075));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray20 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        compilerEnvirons14.setActivationNames((java.util.Set<java.lang.String>) strSet21);
        boolean boolean24 = compilerEnvirons14.isGenerateDebugInfo();
        compilerEnvirons14.setOptimizationLevel((int) (short) 1);
        compilerEnvirons14.setAllowSharpComments(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = compilerEnvirons14.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean31 = iRFactory30.eof();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode2.putIntProp((int) (short) 1, 1);
        scriptNode2.setEncodedSource("typeof");
        com.google.javascript.rhino.head.Node node8 = scriptNode2.getLastChild();
        java.lang.String str9 = scriptNode2.getNextTempName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node10 = scriptNode1.getChildBefore((com.google.javascript.rhino.head.Node) scriptNode2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        scriptNode1.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap7 = scriptNode6.getSymbolTable();
        scriptNode1.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode6);
        int int9 = scriptNode6.getParamCount();
        int int10 = scriptNode6.getBaseLineno();
        scriptNode6.setEndLineno(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = scriptNode6.getRegexpString(1836062230);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray1 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList2 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList2, symbolArray1);
        scriptNode0.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList2);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        java.lang.Object obj8 = scriptNode7.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode9.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode10);
        int int12 = scriptNode9.getEndLineno();
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node(170, (com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scriptNode9);
        scriptNode0.setCompilerData((java.lang.Object) scriptNode7);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode15.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode16);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList18 = scriptNode16.getChildScopes();
        int int19 = scriptNode16.getBaseLineno();
        com.google.javascript.rhino.head.Node node20 = scriptNode16.getLastSibling();
        scriptNode16.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode23.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode24);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList26 = scriptNode24.getFunctions();
        scriptNode24.setPosition((int) (byte) 10);
        java.lang.String str29 = scriptNode16.toStringTree(scriptNode24);
        int int30 = scriptNode16.getBaseLineno();
        com.google.javascript.rhino.head.Node node32 = scriptNode16.setType((int) (byte) -1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor33 = scriptNode16.iterator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator34 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator35 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator36 = positionComparator34.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator35);
        com.google.javascript.rhino.head.ast.AstRoot astRoot37 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int38 = astRoot37.getBaseLineno();
        java.lang.String str39 = astRoot37.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator41 = astRoot40.new NodeIterator();
        int int42 = positionComparator35.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot37, (com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        boolean boolean43 = astRoot37.isInStrictMode();
        scriptNode16.addChildToFront((com.google.javascript.rhino.head.Node) astRoot37);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode0, (com.google.javascript.rhino.head.ast.Scope) astRoot37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode47 = astRoot37.getFunctionNode(1879633086);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        scriptNode1.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode8.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList11 = scriptNode9.getFunctions();
        scriptNode9.setPosition((int) (byte) 10);
        java.lang.String str14 = scriptNode1.toStringTree(scriptNode9);
        int int15 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node17 = scriptNode1.setType((int) (byte) -1);
        scriptNode1.setSourceName("typeof");
        com.google.javascript.rhino.head.Node node20 = scriptNode1.getLastSibling();
        java.lang.String str21 = scriptNode1.debugPrint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = scriptNode1.getRegexpFlags((-603115504));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        scriptNode1.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode8.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList11 = scriptNode9.getFunctions();
        scriptNode9.setPosition((int) (byte) 10);
        java.lang.String str14 = scriptNode1.toStringTree(scriptNode9);
        int int15 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int17 = astRoot16.getParamCount();
        int int18 = astRoot16.getRegexpCount();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator19 = astRoot16.new NodeIterator();
        scriptNode1.setTop((com.google.javascript.rhino.head.ast.ScriptNode) astRoot16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode22 = astRoot16.getFunctionNode(5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        boolean boolean3 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean8 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        boolean boolean11 = compilerEnvirons0.reportWarningAsError();
        com.google.javascript.rhino.head.Parser parser12 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = parser12.eof();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet1 = astRoot0.getComments();
        int int2 = astRoot0.getEndLineno();
        com.google.javascript.rhino.head.Node node4 = astRoot0.setType((int) (short) 10);
        astRoot0.putIntProp(24, (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode8.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        scriptNode9.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode13.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode14);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList16 = scriptNode14.getChildScopes();
        int int17 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.Node node18 = scriptNode14.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode19.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode20);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode20.getChildScopes();
        java.lang.String str24 = scriptNode20.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode14.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode20, (com.google.javascript.rhino.head.Node) scriptNode26);
        int int28 = scriptNode20.getType();
        scriptNode9.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode20);
        int int30 = scriptNode20.getParamCount();
        com.google.javascript.rhino.head.Node node31 = scriptNode20.getLastSibling();
        astRoot0.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode20);
        astRoot0.putIntProp((-1), (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = astRoot0.getRegexpFlags(52);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList3 = scriptNode0.getStatements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = scriptNode0.getRegexpFlags(26);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(true);
        int int4 = compilerEnvirons0.getOptimizationLevel();
        int int5 = compilerEnvirons0.getLanguageVersion();
        boolean boolean6 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setIdeMode(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean10 = compilerEnvirons9.isReservedKeywordAsIdentifier();
        compilerEnvirons9.setStrictMode(true);
        int int13 = compilerEnvirons9.getOptimizationLevel();
        int int14 = compilerEnvirons9.getLanguageVersion();
        compilerEnvirons9.setXmlAvailable(true);
        boolean boolean17 = compilerEnvirons9.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean19 = compilerEnvirons18.isReservedKeywordAsIdentifier();
        compilerEnvirons18.setStrictMode(true);
        compilerEnvirons18.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean25 = compilerEnvirons24.isReservedKeywordAsIdentifier();
        boolean boolean26 = compilerEnvirons24.getWarnTrailingComma();
        compilerEnvirons24.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet29 = compilerEnvirons24.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = compilerEnvirons24.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons18, errorReporter30);
        compilerEnvirons9.setErrorReporter(errorReporter30);
        com.google.javascript.rhino.head.Parser parser33 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean34 = parser33.eof();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode2);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList4 = scriptNode2.getChildScopes();
        int int5 = scriptNode2.getBaseLineno();
        int int6 = scriptNode2.getParamCount();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList7 = scriptNode2.getSymbols();
        int int8 = scriptNode2.getPosition();
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node(13, (com.google.javascript.rhino.head.Node) scriptNode2);
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope(18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = scope11.getTop();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode14.removeProp(10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator18 = astRoot17.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor19 = astRoot17.iterator();
        scriptNode14.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot17);
        scope11.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode14);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        java.lang.Object obj24 = scriptNode23.getCompilerData();
        com.google.javascript.rhino.head.ast.Scope scope25 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator26 = scope25.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode27.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode28);
        scope25.setTop(scriptNode28);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode23, (com.google.javascript.rhino.head.ast.Scope) scriptNode28);
        java.lang.String str32 = scope11.toStringTree(scriptNode23);
        scriptNode2.setTop(scriptNode23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str35 = scriptNode23.getRegexpString(25);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setOptimizationLevel((int) (short) 1);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean15 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = compilerEnvirons0.getErrorReporter();
        int int17 = compilerEnvirons0.getLanguageVersion();
        com.google.javascript.rhino.head.Parser parser18 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = parser18.eof();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getBaseLineno();
        java.lang.String str2 = astRoot0.debugPrint();
        astRoot0.setEncodedSourceBounds((int) (byte) -1, 18);
        com.google.javascript.rhino.head.ast.Scope scope7 = astRoot0.getDefiningScope("136");
        int int8 = astRoot0.getEncodedSourceStart();
        astRoot0.setEndLineno(24);
        com.google.javascript.rhino.head.ast.Comment comment11 = astRoot0.getJsDocNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = astRoot0.getRegexpFlags((int) 'a');
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getBaseLineno();
        int int2 = astRoot0.getPosition();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor3 = null;
        astRoot0.visitComments(nodeVisitor3);
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator6 = astRoot5.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType9 = null;
        com.google.javascript.rhino.head.ast.Comment comment11 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType9, "");
        boolean boolean12 = comment11.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType15 = null;
        com.google.javascript.rhino.head.ast.Comment comment17 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType15, "");
        boolean boolean18 = comment17.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType21 = null;
        com.google.javascript.rhino.head.ast.Comment comment23 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType21, "");
        java.lang.String str25 = comment23.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray26 = new com.google.javascript.rhino.head.ast.Comment[] { comment11, comment17, comment23 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet27 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet27, commentArray26);
        astRoot5.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet27);
        boolean boolean30 = astRoot5.isInStrictMode();
        com.google.javascript.rhino.head.ast.AstNode astNode31 = astRoot5.getParent();
        java.lang.String str32 = astRoot5.debugPrint();
        int int33 = astRoot5.getEncodedSourceStart();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet34 = astRoot5.getComments();
        astRoot0.setComments(commentSet34);
        com.google.javascript.rhino.head.ast.AstRoot astRoot36 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator37 = astRoot36.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType40 = null;
        com.google.javascript.rhino.head.ast.Comment comment42 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType40, "");
        boolean boolean43 = comment42.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType46 = null;
        com.google.javascript.rhino.head.ast.Comment comment48 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType46, "");
        boolean boolean49 = comment48.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType52 = null;
        com.google.javascript.rhino.head.ast.Comment comment54 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType52, "");
        java.lang.String str56 = comment54.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray57 = new com.google.javascript.rhino.head.ast.Comment[] { comment42, comment48, comment54 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet58 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet58, commentArray57);
        astRoot36.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet58);
        boolean boolean61 = astRoot36.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray62 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList63 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList63, symbolArray62);
        astRoot36.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList63);
        int int66 = astRoot36.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode68 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode67.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode68);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList70 = scriptNode68.getChildScopes();
        int int71 = scriptNode68.getBaseLineno();
        com.google.javascript.rhino.head.Node node72 = scriptNode68.getLastSibling();
        scriptNode68.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode75 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode76 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode75.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode76);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList78 = scriptNode76.getFunctions();
        scriptNode76.setPosition((int) (byte) 10);
        java.lang.String str81 = scriptNode68.toStringTree(scriptNode76);
        int int82 = scriptNode68.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot36, (com.google.javascript.rhino.head.ast.Scope) scriptNode68);
        java.lang.String str84 = astRoot36.getSourceName();
        astRoot0.addChildScope((com.google.javascript.rhino.head.ast.Scope) astRoot36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on commentSet34 and commentSet58.", commentSet34.equals(commentSet58) == commentSet58.equals(commentSet34));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        int int6 = scriptNode1.getLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode7.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode8);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList10 = scriptNode8.getChildScopes();
        int int11 = scriptNode8.getBaseLineno();
        int int12 = scriptNode8.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode13.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode14);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList16 = scriptNode14.getFunctions();
        scriptNode14.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode8.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode14, (com.google.javascript.rhino.head.Node) scope19);
        scriptNode1.setTop(scriptNode8);
        com.google.javascript.rhino.head.ast.Comment comment22 = scriptNode1.getJsDocNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = scriptNode1.getRegexpString(10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet1 = astRoot0.getComments();
        java.lang.String str2 = astRoot0.getSourceName();
        boolean boolean3 = astRoot0.hasChildren();
        int int4 = astRoot0.getLineno();
        astRoot0.setEncodedSourceBounds((int) (byte) 10, (int) (short) 100);
        boolean boolean8 = astRoot0.isInStrictMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = astRoot0.getFunctionNode(133136743);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope(15);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode2.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode3);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList5 = scriptNode3.getChildScopes();
        int int6 = scriptNode3.getBaseLineno();
        com.google.javascript.rhino.head.Node node7 = scriptNode3.getLastSibling();
        java.lang.String str9 = scriptNode3.toSource((int) (short) -1);
        int int10 = scriptNode3.getLength();
        scope1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode3);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList12 = scriptNode3.getChildScopes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = scriptNode3.getRegexpString((int) '4');
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList9 = scriptNode7.getChildScopes();
        java.lang.String str11 = scriptNode7.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scriptNode13);
        java.lang.Object obj16 = scriptNode7.getProp((int) (short) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str19 = scriptNode17.toSource((int) '4');
        java.lang.String str20 = scriptNode7.toStringTree(scriptNode17);
        scriptNode17.setLength((-1));
        com.google.javascript.rhino.head.Node node23 = scriptNode17.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = scriptNode17.getRegexpString(0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int2 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setLanguageVersion((int) (byte) 100);
        boolean boolean5 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        boolean boolean18 = compilerEnvirons8.isGenerateDebugInfo();
        compilerEnvirons8.setOptimizationLevel((int) (short) 1);
        compilerEnvirons8.setAllowSharpComments(true);
        boolean boolean23 = compilerEnvirons8.getAllowSharpComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = compilerEnvirons8.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter24);
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = compilerEnvirons0.getErrorReporter();
        boolean boolean27 = compilerEnvirons0.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean29 = compilerEnvirons28.isReservedKeywordAsIdentifier();
        boolean boolean30 = compilerEnvirons28.isIdeMode();
        boolean boolean31 = compilerEnvirons28.getWarnTrailingComma();
        compilerEnvirons28.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons28.setAllowSharpComments(true);
        boolean boolean36 = compilerEnvirons28.isRecordingLocalJsDocComments();
        compilerEnvirons28.setAllowMemberExprAsFunctionName(true);
        boolean boolean39 = compilerEnvirons28.reportWarningAsError();
        com.google.javascript.rhino.head.Parser parser40 = new com.google.javascript.rhino.head.Parser(compilerEnvirons28);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons41 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean42 = compilerEnvirons41.isReservedKeywordAsIdentifier();
        boolean boolean43 = compilerEnvirons41.isIdeMode();
        boolean boolean44 = compilerEnvirons41.getWarnTrailingComma();
        compilerEnvirons41.setAllowMemberExprAsFunctionName(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons47 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean48 = compilerEnvirons47.isReservedKeywordAsIdentifier();
        int int49 = compilerEnvirons47.getLanguageVersion();
        int int50 = compilerEnvirons47.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons51 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean52 = compilerEnvirons51.isReservedKeywordAsIdentifier();
        compilerEnvirons51.setStrictMode(true);
        compilerEnvirons51.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons57 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean58 = compilerEnvirons57.isReservedKeywordAsIdentifier();
        boolean boolean59 = compilerEnvirons57.getWarnTrailingComma();
        compilerEnvirons57.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet62 = compilerEnvirons57.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter63 = compilerEnvirons57.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory64 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons51, errorReporter63);
        com.google.javascript.rhino.head.IRFactory iRFactory65 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons47, errorReporter63);
        com.google.javascript.rhino.head.IRFactory iRFactory66 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons41, errorReporter63);
        com.google.javascript.rhino.head.IRFactory iRFactory67 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons28, errorReporter63);
        com.google.javascript.rhino.head.IRFactory iRFactory68 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter63);
        com.google.javascript.rhino.head.ast.AstRoot astRoot72 = iRFactory68.parse("                                                                                                                                                                                                                                                    ", "{\n  {\n  }\n}\n", 1344201075);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str74 = astRoot72.getRegexpFlags(1891424362);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        int int6 = scriptNode1.getLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode7.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode8);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList10 = scriptNode8.getChildScopes();
        int int11 = scriptNode8.getBaseLineno();
        int int12 = scriptNode8.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode13.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode14);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList16 = scriptNode14.getFunctions();
        scriptNode14.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode8.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode14, (com.google.javascript.rhino.head.Node) scope19);
        scriptNode1.setTop(scriptNode8);
        scriptNode8.setEncodedSourceStart((int) (short) 10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet25 = astRoot24.getComments();
        java.lang.String str26 = astRoot24.getSourceName();
        boolean boolean27 = astRoot24.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode28.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode29);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList31 = scriptNode29.getChildScopes();
        int int32 = scriptNode29.getBaseLineno();
        com.google.javascript.rhino.head.Node node33 = scriptNode29.getLastSibling();
        scriptNode29.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode36.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode37);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList39 = scriptNode37.getFunctions();
        scriptNode37.setPosition((int) (byte) 10);
        java.lang.String str42 = scriptNode29.toStringTree(scriptNode37);
        int int43 = scriptNode29.getBaseLineno();
        boolean boolean44 = scriptNode29.hasConsistentReturnUsage();
        astRoot24.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode29);
        scriptNode8.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode48 = scriptNode8.getFunctionNode((-748307395));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator1 = astRoot0.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor2 = astRoot0.iterator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = new com.google.javascript.rhino.head.ast.AstRoot((-270991973));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray6 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList7 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList7, symbolArray6);
        scriptNode5.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList7);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int11 = astRoot10.getParamCount();
        int int12 = astRoot10.getRegexpCount();
        scriptNode5.addChildToBack((com.google.javascript.rhino.head.Node) astRoot10);
        com.google.javascript.rhino.head.ast.Scope scope15 = scriptNode5.getDefiningScope("136");
        java.lang.String str16 = scriptNode5.toSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = scriptNode5.getTop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        astRoot0.replaceChild((com.google.javascript.rhino.head.Node) astRoot4, (com.google.javascript.rhino.head.Node) scriptNode5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        boolean boolean3 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean8 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        boolean boolean11 = compilerEnvirons0.reportWarningAsError();
        com.google.javascript.rhino.head.Parser parser12 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean14 = compilerEnvirons13.isReservedKeywordAsIdentifier();
        boolean boolean15 = compilerEnvirons13.isIdeMode();
        boolean boolean16 = compilerEnvirons13.getWarnTrailingComma();
        compilerEnvirons13.setAllowMemberExprAsFunctionName(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean20 = compilerEnvirons19.isReservedKeywordAsIdentifier();
        int int21 = compilerEnvirons19.getLanguageVersion();
        int int22 = compilerEnvirons19.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean24 = compilerEnvirons23.isReservedKeywordAsIdentifier();
        compilerEnvirons23.setStrictMode(true);
        compilerEnvirons23.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean30 = compilerEnvirons29.isReservedKeywordAsIdentifier();
        boolean boolean31 = compilerEnvirons29.getWarnTrailingComma();
        compilerEnvirons29.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet34 = compilerEnvirons29.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter35 = compilerEnvirons29.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory36 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons23, errorReporter35);
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons19, errorReporter35);
        com.google.javascript.rhino.head.IRFactory iRFactory38 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons13, errorReporter35);
        com.google.javascript.rhino.head.IRFactory iRFactory39 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean40 = iRFactory39.eof();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.putIntProp((int) (short) 1, 1);
        java.lang.String str4 = scriptNode0.getEncodedSource();
        com.google.javascript.rhino.head.Node node5 = scriptNode0.getFirstChild();
        int int6 = scriptNode0.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = scriptNode0.getFunctionNode((int) '4');
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setGenerateDebugInfo(true);
        compilerEnvirons0.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = iRFactory10.eof();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList9 = scriptNode7.getChildScopes();
        java.lang.String str11 = scriptNode7.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scriptNode13);
        java.lang.Object obj16 = scriptNode7.getProp((int) (short) -1);
        java.lang.Object obj18 = scriptNode7.getProp((int) (byte) 100);
        java.lang.String str19 = scriptNode7.getSourceName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator21 = scriptNode20.spliterator();
        com.google.javascript.rhino.head.Node node23 = scriptNode20.setType((int) '#');
        java.lang.Object obj24 = scriptNode20.getCompilerData();
        com.google.javascript.rhino.head.ast.Symbol symbol26 = scriptNode20.getSymbol("typeof");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode7.removeChild((com.google.javascript.rhino.head.Node) scriptNode20);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        int int6 = scriptNode1.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = scriptNode1.new NodeIterator();
        int int8 = scriptNode1.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope9 = scriptNode1.getParentScope();
        scriptNode1.removeProp(65536);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = scriptNode1.getRegexpFlags((-929928321));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = compilerEnvirons0.getErrorReporter();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean6 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean7 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setRecoverFromErrors(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean11 = compilerEnvirons10.isReservedKeywordAsIdentifier();
        boolean boolean12 = compilerEnvirons10.isIdeMode();
        boolean boolean13 = compilerEnvirons10.getWarnTrailingComma();
        compilerEnvirons10.setAllowMemberExprAsFunctionName(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean17 = compilerEnvirons16.isReservedKeywordAsIdentifier();
        int int18 = compilerEnvirons16.getLanguageVersion();
        int int19 = compilerEnvirons16.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean21 = compilerEnvirons20.isReservedKeywordAsIdentifier();
        compilerEnvirons20.setStrictMode(true);
        compilerEnvirons20.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean27 = compilerEnvirons26.isReservedKeywordAsIdentifier();
        boolean boolean28 = compilerEnvirons26.getWarnTrailingComma();
        compilerEnvirons26.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet31 = compilerEnvirons26.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = compilerEnvirons26.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons20, errorReporter32);
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons16, errorReporter32);
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter32);
        boolean boolean36 = compilerEnvirons10.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons37 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean38 = compilerEnvirons37.isReservedKeywordAsIdentifier();
        boolean boolean39 = compilerEnvirons37.getWarnTrailingComma();
        compilerEnvirons37.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet42 = compilerEnvirons37.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter43 = compilerEnvirons37.getErrorReporter();
        boolean boolean44 = compilerEnvirons37.isRecordingComments();
        compilerEnvirons37.setGeneratingSource(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons47 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean48 = compilerEnvirons47.isReservedKeywordAsIdentifier();
        int int49 = compilerEnvirons47.getLanguageVersion();
        int int50 = compilerEnvirons47.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons51 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean52 = compilerEnvirons51.isReservedKeywordAsIdentifier();
        compilerEnvirons51.setStrictMode(true);
        compilerEnvirons51.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons57 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean58 = compilerEnvirons57.isReservedKeywordAsIdentifier();
        boolean boolean59 = compilerEnvirons57.getWarnTrailingComma();
        compilerEnvirons57.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet62 = compilerEnvirons57.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter63 = compilerEnvirons57.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory64 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons51, errorReporter63);
        com.google.javascript.rhino.head.IRFactory iRFactory65 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons47, errorReporter63);
        com.google.javascript.rhino.head.IRFactory iRFactory66 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons37, errorReporter63);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons67 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean68 = compilerEnvirons67.isReservedKeywordAsIdentifier();
        boolean boolean69 = compilerEnvirons67.isIdeMode();
        compilerEnvirons67.setRecordingLocalJsDocComments(false);
        boolean boolean72 = compilerEnvirons67.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons73 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean74 = compilerEnvirons73.isReservedKeywordAsIdentifier();
        int int75 = compilerEnvirons73.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons76 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean77 = compilerEnvirons76.isReservedKeywordAsIdentifier();
        boolean boolean78 = compilerEnvirons76.isIdeMode();
        compilerEnvirons76.setRecordingLocalJsDocComments(false);
        boolean boolean81 = compilerEnvirons76.isGenerateDebugInfo();
        compilerEnvirons76.setRecordingLocalJsDocComments(true);
        boolean boolean84 = compilerEnvirons76.isXmlAvailable();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons85 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean86 = compilerEnvirons85.isReservedKeywordAsIdentifier();
        boolean boolean87 = compilerEnvirons85.getWarnTrailingComma();
        boolean boolean88 = compilerEnvirons85.isRecordingComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter89 = compilerEnvirons85.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser90 = new com.google.javascript.rhino.head.Parser(compilerEnvirons76, errorReporter89);
        compilerEnvirons73.setErrorReporter(errorReporter89);
        compilerEnvirons67.setErrorReporter(errorReporter89);
        compilerEnvirons37.setErrorReporter(errorReporter89);
        compilerEnvirons10.setErrorReporter(errorReporter89);
        com.google.javascript.rhino.head.Parser parser95 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter89);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean96 = parser95.eof();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        java.lang.String str5 = scriptNode1.makeIndent((int) (byte) -1);
        java.lang.String str6 = scriptNode1.debugPrint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = scriptNode1.getFunctionNode((int) (short) 100);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int4 = astRoot3.getBaseLineno();
        java.lang.String str5 = astRoot3.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = astRoot6.new NodeIterator();
        int int8 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot3, (com.google.javascript.rhino.head.ast.AstNode) astRoot6);
        boolean boolean9 = astRoot3.isInStrictMode();
        com.google.javascript.rhino.head.ast.Scope scope12 = new com.google.javascript.rhino.head.ast.Scope(14, (int) '4');
        astRoot3.addChildrenToFront((com.google.javascript.rhino.head.Node) scope12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = astRoot3.getRegexpString((-253374738));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet1 = astRoot0.getComments();
        int int2 = astRoot0.getEndLineno();
        com.google.javascript.rhino.head.Node node4 = astRoot0.setType((int) (short) 10);
        com.google.javascript.rhino.head.ast.Scope scope5 = astRoot0.getParentScope();
        int int8 = astRoot0.getIntProp((-1), 18);
        astRoot0.setEncodedSourceEnd(161);
        int int11 = astRoot0.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = astRoot0.getFunctionNode(1617059566);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int4 = astRoot3.getBaseLineno();
        java.lang.String str5 = astRoot3.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = astRoot6.new NodeIterator();
        int int8 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot3, (com.google.javascript.rhino.head.ast.AstNode) astRoot6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode9.putIntProp((int) (short) 1, 1);
        java.lang.String str13 = scriptNode9.getEncodedSource();
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator15 = scope14.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode16.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        scope14.setTop(scriptNode17);
        scope14.setLineno((int) (short) -1);
        int int22 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode9, (com.google.javascript.rhino.head.ast.AstNode) scope14);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode23.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode24);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList26 = scriptNode24.getChildScopes();
        int int27 = scriptNode24.getBaseLineno();
        int int28 = scriptNode24.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode29.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode30);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList32 = scriptNode30.getFunctions();
        scriptNode30.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope35 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode24.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode30, (com.google.javascript.rhino.head.Node) scope35);
        scriptNode30.setEncodedSource("-1\tSCRIPT -1 1\n");
        java.lang.String str39 = scriptNode9.toStringTree(scriptNode30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str41 = scriptNode30.getRegexpFlags(871114474);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        scriptNode1.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode6);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList8 = scriptNode6.getChildScopes();
        int int9 = scriptNode6.getBaseLineno();
        com.google.javascript.rhino.head.Node node10 = scriptNode6.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode11.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode12);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList14 = scriptNode12.getChildScopes();
        java.lang.String str16 = scriptNode12.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode6.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode12, (com.google.javascript.rhino.head.Node) scriptNode18);
        int int20 = scriptNode12.getType();
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode12);
        int int22 = scriptNode12.getParamCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = scriptNode12.getRegexpString(161);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean5 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean9 = compilerEnvirons8.isReservedKeywordAsIdentifier();
        boolean boolean10 = compilerEnvirons8.getWarnTrailingComma();
        boolean boolean11 = compilerEnvirons8.isRecordingComments();
        boolean boolean12 = compilerEnvirons8.getWarnTrailingComma();
        boolean boolean13 = compilerEnvirons8.isRecordingLocalJsDocComments();
        boolean boolean14 = compilerEnvirons8.isIdeMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray21 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean28 = iRFactory27.eof();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList9 = scriptNode7.getChildScopes();
        java.lang.String str11 = scriptNode7.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scriptNode13);
        java.lang.Object obj16 = scriptNode7.getProp((int) (short) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str19 = scriptNode17.toSource((int) '4');
        java.lang.String str20 = scriptNode7.toStringTree(scriptNode17);
        com.google.javascript.rhino.head.Node node21 = scriptNode17.target;
        java.lang.String str22 = scriptNode17.getSourceName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = scriptNode17.getFunctionNode(136);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        int int6 = scriptNode1.getLineno();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor7 = scriptNode1.iterator();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean9 = compilerEnvirons8.isReservedKeywordAsIdentifier();
        boolean boolean10 = compilerEnvirons8.isIdeMode();
        int int11 = compilerEnvirons8.getOptimizationLevel();
        scriptNode1.setCompilerData((java.lang.Object) compilerEnvirons8);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode13.putIntProp((int) (short) 1, 1);
        scriptNode13.setEncodedSource("typeof");
        com.google.javascript.rhino.head.Node node19 = scriptNode13.getLastChild();
        scriptNode1.setParentScope((com.google.javascript.rhino.head.ast.Scope) scriptNode13);
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet22 = astRoot21.getComments();
        com.google.javascript.rhino.head.ast.Comment comment23 = astRoot21.getJsDocNode();
        scriptNode1.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = astRoot21.getRegexpString(209601021);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compilerEnvirons0.getErrorReporter();
        boolean boolean7 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean8 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setOptimizationLevel((int) (short) 0);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean12 = compilerEnvirons11.isReservedKeywordAsIdentifier();
        boolean boolean13 = compilerEnvirons11.getWarnTrailingComma();
        compilerEnvirons11.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet16 = compilerEnvirons11.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = compilerEnvirons11.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter17);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode19.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode20);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode20.getChildScopes();
        int int23 = scriptNode20.getBaseLineno();
        com.google.javascript.rhino.head.Node node24 = scriptNode20.getLastSibling();
        int int25 = scriptNode20.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator26 = scriptNode20.new NodeIterator();
        int int27 = scriptNode20.getLineno();
        boolean boolean28 = scriptNode20.hasConsistentReturnUsage();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList29 = scriptNode20.getFunctions();
        com.google.javascript.rhino.head.Node node30 = iRFactory18.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode20);
        boolean boolean31 = scriptNode20.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode33 = scriptNode20.getFunctionNode((-1496675853));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode1.removeProp(10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator5 = astRoot4.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor6 = astRoot4.iterator();
        scriptNode1.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot4);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap8 = scriptNode1.getSymbolTable();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode9.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList12 = scriptNode10.getFunctions();
        scriptNode10.setPosition((int) (byte) 10);
        int int15 = scriptNode10.getEncodedSourceEnd();
        int int16 = scriptNode10.getBaseLineno();
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newString(1275261773, "$0");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode1.replaceChildAfter((com.google.javascript.rhino.head.Node) scriptNode10, node19);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        scriptNode1.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode8.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList11 = scriptNode9.getFunctions();
        scriptNode9.setPosition((int) (byte) 10);
        java.lang.String str14 = scriptNode1.toStringTree(scriptNode9);
        int int15 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node17 = scriptNode1.setType((int) (byte) -1);
        scriptNode1.setSourceName("typeof");
        scriptNode1.setEncodedSource("                                                                                                        {\n                                                                                                        }\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = scriptNode1.getRegexpFlags(989140197);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        int int6 = scriptNode1.getLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode7.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode8);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList10 = scriptNode8.getChildScopes();
        int int11 = scriptNode8.getBaseLineno();
        com.google.javascript.rhino.head.Node node12 = scriptNode8.getLastSibling();
        scriptNode8.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode15.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode16);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList18 = scriptNode16.getFunctions();
        scriptNode16.setPosition((int) (byte) 10);
        java.lang.String str21 = scriptNode8.toStringTree(scriptNode16);
        int int22 = scriptNode8.getBaseLineno();
        com.google.javascript.rhino.head.Node node24 = scriptNode8.setType((int) (byte) -1);
        scriptNode1.target = scriptNode8;
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope(6, (int) (short) -1);
        scriptNode8.addChildrenToFront((com.google.javascript.rhino.head.Node) scope28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode31 = scriptNode8.getFunctionNode((-253374738));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode2.flattenSymbolTable(true);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(538062289, (com.google.javascript.rhino.head.Node) scriptNode2, (-603115504));
        scriptNode2.setEncodedSource("-1\tSCRIPT -1 1\n");
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet10 = astRoot9.getComments();
        int int11 = astRoot9.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode13.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode14);
        scriptNode14.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap20 = scriptNode19.getSymbolTable();
        scriptNode14.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList22 = scriptNode14.getStatements();
        com.google.javascript.rhino.head.ast.Scope scope23 = scriptNode14.getEnclosingScope();
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int25 = astRoot24.getBaseLineno();
        java.lang.String str26 = astRoot24.debugPrint();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList27 = astRoot24.getSymbols();
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scope23, (com.google.javascript.rhino.head.Node) astRoot24, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode2.replaceChildAfter((com.google.javascript.rhino.head.Node) astRoot9, (com.google.javascript.rhino.head.Node) scope23);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        int int3 = scriptNode0.getEndLineno();
        com.google.javascript.rhino.head.ast.Scope scope4 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode0.setParentScope(scope4);
        com.google.javascript.rhino.head.Node node6 = scriptNode0.getNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = scriptNode0.getRegexpFlags(605628279);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        int int5 = scriptNode1.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList9 = scriptNode7.getFunctions();
        scriptNode7.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope12 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scope12);
        int int14 = scriptNode7.getEndLineno();
        scriptNode7.setEncodedSource("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = scriptNode7.getRegexpString(14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator1 = astRoot0.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType4, "");
        boolean boolean7 = comment6.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType10 = null;
        com.google.javascript.rhino.head.ast.Comment comment12 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType10, "");
        boolean boolean13 = comment12.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType16 = null;
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType16, "");
        java.lang.String str20 = comment18.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray21 = new com.google.javascript.rhino.head.ast.Comment[] { comment6, comment12, comment18 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet22 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet22, commentArray21);
        astRoot0.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet22);
        com.google.javascript.rhino.head.Token.CommentType commentType27 = null;
        com.google.javascript.rhino.head.ast.Comment comment29 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType27, "");
        boolean boolean30 = comment29.hasSideEffects();
        int int31 = comment29.getLineno();
        com.google.javascript.rhino.head.Node node33 = comment29.setType(18);
        boolean boolean34 = comment29.hasSideEffects();
        astRoot0.addComment(comment29);
        com.google.javascript.rhino.head.Node node36 = astRoot0.target;
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator39 = astRoot38.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType42 = null;
        com.google.javascript.rhino.head.ast.Comment comment44 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType42, "");
        boolean boolean45 = comment44.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType48 = null;
        com.google.javascript.rhino.head.ast.Comment comment50 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType48, "");
        boolean boolean51 = comment50.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType54 = null;
        com.google.javascript.rhino.head.ast.Comment comment56 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType54, "");
        java.lang.String str58 = comment56.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray59 = new com.google.javascript.rhino.head.ast.Comment[] { comment44, comment50, comment56 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet60 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet60, commentArray59);
        astRoot38.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet60);
        boolean boolean63 = astRoot38.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray64 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList65 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList65, symbolArray64);
        astRoot38.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList65);
        com.google.javascript.rhino.head.Node node68 = astRoot38.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode69 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode70 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode69.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode70);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot38, (com.google.javascript.rhino.head.ast.Scope) scriptNode70);
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node(4, (com.google.javascript.rhino.head.Node) astRoot38, 129);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet75 = astRoot38.getComments();
        astRoot0.setComments(commentSet75);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on commentSet60, commentSet75, and commentSet22.", !(commentSet60.equals(commentSet75) && commentSet75.equals(commentSet22)) || commentSet60.equals(commentSet22));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator1 = astRoot0.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType4, "");
        boolean boolean7 = comment6.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType10 = null;
        com.google.javascript.rhino.head.ast.Comment comment12 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType10, "");
        boolean boolean13 = comment12.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType16 = null;
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType16, "");
        java.lang.String str20 = comment18.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray21 = new com.google.javascript.rhino.head.ast.Comment[] { comment6, comment12, comment18 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet22 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet22, commentArray21);
        astRoot0.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet22);
        boolean boolean25 = astRoot0.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray26 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList27 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList27, symbolArray26);
        astRoot0.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList27);
        astRoot0.setInStrictMode(false);
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator34 = astRoot33.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType37 = null;
        com.google.javascript.rhino.head.ast.Comment comment39 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType37, "");
        boolean boolean40 = comment39.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType43 = null;
        com.google.javascript.rhino.head.ast.Comment comment45 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType43, "");
        boolean boolean46 = comment45.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType49 = null;
        com.google.javascript.rhino.head.ast.Comment comment51 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType49, "");
        java.lang.String str53 = comment51.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray54 = new com.google.javascript.rhino.head.ast.Comment[] { comment39, comment45, comment51 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet55 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet55, commentArray54);
        astRoot33.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet55);
        boolean boolean58 = astRoot33.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray59 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList60 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList60, symbolArray59);
        astRoot33.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList60);
        com.google.javascript.rhino.head.Node node63 = astRoot33.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode64 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode65 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode64.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode65);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot33, (com.google.javascript.rhino.head.ast.Scope) scriptNode65);
        com.google.javascript.rhino.head.Node node69 = new com.google.javascript.rhino.head.Node(4, (com.google.javascript.rhino.head.Node) astRoot33, 129);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet70 = astRoot33.getComments();
        astRoot0.addChildScope((com.google.javascript.rhino.head.ast.Scope) astRoot33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on commentSet70 and commentSet22.", commentSet70.equals(commentSet22) == commentSet22.equals(commentSet70));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode2);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList4 = scriptNode2.getChildScopes();
        int int5 = scriptNode2.getBaseLineno();
        int int6 = scriptNode2.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode7.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode8);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList10 = scriptNode8.getFunctions();
        scriptNode8.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope13 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode2.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode8, (com.google.javascript.rhino.head.Node) scope13);
        scriptNode8.setEncodedSource("-1\tSCRIPT -1 1\n");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode18.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode19);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList21 = scriptNode19.getChildScopes();
        int int22 = scriptNode19.getBaseLineno();
        com.google.javascript.rhino.head.Node node23 = scriptNode19.getLastSibling();
        int int24 = scriptNode19.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope27 = new com.google.javascript.rhino.head.ast.Scope(5, (int) '#');
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator29 = astRoot28.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType32 = null;
        com.google.javascript.rhino.head.ast.Comment comment34 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType32, "");
        boolean boolean35 = comment34.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType38 = null;
        com.google.javascript.rhino.head.ast.Comment comment40 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType38, "");
        boolean boolean41 = comment40.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType44 = null;
        com.google.javascript.rhino.head.ast.Comment comment46 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType44, "");
        java.lang.String str48 = comment46.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray49 = new com.google.javascript.rhino.head.ast.Comment[] { comment34, comment40, comment46 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet50 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet50, commentArray49);
        astRoot28.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet50);
        boolean boolean53 = astRoot28.isInStrictMode();
        com.google.javascript.rhino.head.ast.AstNode astNode54 = astRoot28.getParent();
        astRoot28.setEndLineno((int) (short) 0);
        com.google.javascript.rhino.head.Node node58 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode19, (com.google.javascript.rhino.head.Node) scope27, (com.google.javascript.rhino.head.Node) astRoot28, 6);
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((int) (byte) 10, (com.google.javascript.rhino.head.Node) scriptNode8, (com.google.javascript.rhino.head.Node) astRoot28);
        com.google.javascript.rhino.head.ast.AstRoot astRoot61 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator62 = astRoot61.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType65 = null;
        com.google.javascript.rhino.head.ast.Comment comment67 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType65, "");
        boolean boolean68 = comment67.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType71 = null;
        com.google.javascript.rhino.head.ast.Comment comment73 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType71, "");
        boolean boolean74 = comment73.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType77 = null;
        com.google.javascript.rhino.head.ast.Comment comment79 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType77, "");
        java.lang.String str81 = comment79.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray82 = new com.google.javascript.rhino.head.ast.Comment[] { comment67, comment73, comment79 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet83 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet83, commentArray82);
        astRoot61.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet83);
        boolean boolean86 = astRoot61.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray87 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList88 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList88, symbolArray87);
        astRoot61.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList88);
        com.google.javascript.rhino.head.Node node91 = astRoot61.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode92 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode93 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode92.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode93);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot61, (com.google.javascript.rhino.head.ast.Scope) scriptNode93);
        com.google.javascript.rhino.head.Node node97 = new com.google.javascript.rhino.head.Node(4, (com.google.javascript.rhino.head.Node) astRoot61, 129);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet98 = astRoot61.getComments();
        java.lang.String str99 = node59.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) astRoot61);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on commentSet98 and commentSet50.", commentSet98.equals(commentSet50) == commentSet50.equals(commentSet98));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean14 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setIdeMode(true);
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = iRFactory17.eof();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        com.google.javascript.rhino.head.Parser parser4 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = iRFactory5.eof();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator1 = scriptNode0.spliterator();
        com.google.javascript.rhino.head.Node node3 = scriptNode0.setType((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = scriptNode0.getRegexpFlags(1560112722);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        scriptNode1.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode6);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList8 = scriptNode6.getChildScopes();
        int int9 = scriptNode6.getBaseLineno();
        com.google.javascript.rhino.head.Node node10 = scriptNode6.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode11.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode12);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList14 = scriptNode12.getChildScopes();
        java.lang.String str16 = scriptNode12.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode6.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode12, (com.google.javascript.rhino.head.Node) scriptNode18);
        int int20 = scriptNode12.getType();
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode12);
        int int22 = scriptNode12.getParamCount();
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(100, (int) (byte) 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode26.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode27);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList29 = scriptNode27.getChildScopes();
        int int30 = scriptNode27.getBaseLineno();
        com.google.javascript.rhino.head.Node node31 = scriptNode27.getLastSibling();
        scriptNode27.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode34.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode35);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList37 = scriptNode35.getFunctions();
        scriptNode35.setPosition((int) (byte) 10);
        java.lang.String str40 = scriptNode27.toStringTree(scriptNode35);
        java.lang.String str41 = scriptNode35.shortName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode12.replaceChildAfter(node25, (com.google.javascript.rhino.head.Node) scriptNode35);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList3 = scriptNode1.getFunctions();
        scriptNode1.setPosition((int) (byte) 10);
        int int6 = scriptNode1.getEncodedSourceEnd();
        int int7 = scriptNode1.getLineno();
        scriptNode1.removeProp((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = scriptNode1.getRegexpString((int) 'a');
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        scriptNode1.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode8.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList11 = scriptNode9.getFunctions();
        scriptNode9.setPosition((int) (byte) 10);
        java.lang.String str14 = scriptNode1.toStringTree(scriptNode9);
        int int15 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node17 = scriptNode1.setType((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode18.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode19);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList21 = scriptNode19.getChildScopes();
        int int22 = scriptNode19.getBaseLineno();
        com.google.javascript.rhino.head.Node node23 = scriptNode19.getLastSibling();
        int int24 = scriptNode19.getLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode25.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode26);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList28 = scriptNode26.getChildScopes();
        int int29 = scriptNode26.getBaseLineno();
        int int30 = scriptNode26.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode31.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode32);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList34 = scriptNode32.getFunctions();
        scriptNode32.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope37 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode26.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode32, (com.google.javascript.rhino.head.Node) scope37);
        scriptNode19.setTop(scriptNode26);
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int41 = astRoot40.getBaseLineno();
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int43 = astRoot42.getBaseLineno();
        int int44 = astRoot42.getLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode45.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode46);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList48 = scriptNode46.getChildScopes();
        int int49 = scriptNode46.getBaseLineno();
        com.google.javascript.rhino.head.Node node50 = scriptNode46.getLastSibling();
        scriptNode46.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode53.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode54);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList56 = scriptNode54.getFunctions();
        scriptNode54.setPosition((int) (byte) 10);
        java.lang.String str59 = scriptNode46.toStringTree(scriptNode54);
        int int60 = scriptNode46.getBaseLineno();
        astRoot42.target = scriptNode46;
        int int62 = astRoot40.compareTo((com.google.javascript.rhino.head.ast.AstNode) scriptNode46);
        int int63 = astRoot40.getEncodedSourceEnd();
        astRoot40.checkParentLinks();
        boolean boolean65 = astRoot40.hasConsistentReturnUsage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode1.replaceChild((com.google.javascript.rhino.head.Node) scriptNode26, (com.google.javascript.rhino.head.Node) astRoot40);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        boolean boolean3 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean10 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.Parser parser11 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        compilerEnvirons0.setWarnTrailingComma(true);
        com.google.javascript.rhino.head.Parser parser14 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = parser14.eof();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        boolean boolean6 = compilerEnvirons0.isGeneratingSource();
        boolean boolean7 = compilerEnvirons0.isStrictMode();
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = iRFactory9.eof();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        scriptNode1.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap7 = scriptNode6.getSymbolTable();
        scriptNode1.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode6);
        int int9 = scriptNode6.getParamCount();
        int int10 = scriptNode6.getBaseLineno();
        scriptNode6.setEndLineno(3);
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = new com.google.javascript.rhino.head.ast.AstRoot(1499437464);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator17 = scriptNode16.spliterator();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator18 = scriptNode16.new NodeIterator();
        java.lang.String str19 = scriptNode16.getNextTempName();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor20 = scriptNode16.iterator();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node(21, (com.google.javascript.rhino.head.Node) astRoot15, (com.google.javascript.rhino.head.Node) scriptNode16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode6.removeChild((com.google.javascript.rhino.head.Node) scriptNode16);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int2 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setLanguageVersion((int) (byte) 100);
        boolean boolean5 = compilerEnvirons0.isXmlAvailable();
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean7 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray18 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        boolean boolean22 = compilerEnvirons12.isGenerateDebugInfo();
        boolean boolean23 = compilerEnvirons12.isReservedKeywordAsIdentifier();
        compilerEnvirons12.setGenerateObserverCount(false);
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons12);
        java.util.Set<java.lang.String> strSet27 = compilerEnvirons12.getActivationNames();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode28.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode29);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList31 = scriptNode29.getChildScopes();
        int int32 = scriptNode29.getBaseLineno();
        com.google.javascript.rhino.head.Node node33 = scriptNode29.getLastSibling();
        int int34 = scriptNode29.getLineno();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor35 = scriptNode29.iterator();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons36 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean37 = compilerEnvirons36.isReservedKeywordAsIdentifier();
        boolean boolean38 = compilerEnvirons36.isIdeMode();
        int int39 = compilerEnvirons36.getOptimizationLevel();
        scriptNode29.setCompilerData((java.lang.Object) compilerEnvirons36);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons41 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean42 = compilerEnvirons41.isReservedKeywordAsIdentifier();
        boolean boolean43 = compilerEnvirons41.isIdeMode();
        compilerEnvirons41.setRecordingLocalJsDocComments(false);
        boolean boolean46 = compilerEnvirons41.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons47 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean48 = compilerEnvirons47.isReservedKeywordAsIdentifier();
        int int49 = compilerEnvirons47.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons50 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean51 = compilerEnvirons50.isReservedKeywordAsIdentifier();
        boolean boolean52 = compilerEnvirons50.isIdeMode();
        compilerEnvirons50.setRecordingLocalJsDocComments(false);
        boolean boolean55 = compilerEnvirons50.isGenerateDebugInfo();
        compilerEnvirons50.setRecordingLocalJsDocComments(true);
        boolean boolean58 = compilerEnvirons50.isXmlAvailable();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons59 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean60 = compilerEnvirons59.isReservedKeywordAsIdentifier();
        boolean boolean61 = compilerEnvirons59.getWarnTrailingComma();
        boolean boolean62 = compilerEnvirons59.isRecordingComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter63 = compilerEnvirons59.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser64 = new com.google.javascript.rhino.head.Parser(compilerEnvirons50, errorReporter63);
        compilerEnvirons47.setErrorReporter(errorReporter63);
        compilerEnvirons41.setErrorReporter(errorReporter63);
        compilerEnvirons36.setErrorReporter(errorReporter63);
        com.google.javascript.rhino.head.Parser parser68 = new com.google.javascript.rhino.head.Parser(compilerEnvirons12, errorReporter63);
        com.google.javascript.rhino.head.Parser parser69 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean70 = parser69.eof();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope(0, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode4.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode5);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList7 = scriptNode5.getChildScopes();
        int int8 = scriptNode5.getBaseLineno();
        com.google.javascript.rhino.head.Node node9 = scriptNode5.getLastSibling();
        scriptNode5.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode12.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode13);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList15 = scriptNode13.getFunctions();
        scriptNode13.setPosition((int) (byte) 10);
        java.lang.String str18 = scriptNode5.toStringTree(scriptNode13);
        int int19 = scriptNode5.getBaseLineno();
        com.google.javascript.rhino.head.Node node21 = scriptNode5.setType((int) (byte) -1);
        scriptNode5.setSourceName("typeof");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode25.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode26);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList28 = scriptNode26.getChildScopes();
        int int29 = scriptNode26.getBaseLineno();
        com.google.javascript.rhino.head.Node node30 = scriptNode26.getLastSibling();
        int int31 = scriptNode26.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator32 = scriptNode26.new NodeIterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode33.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode34);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList36 = scriptNode34.getChildScopes();
        int int37 = scriptNode34.getBaseLineno();
        com.google.javascript.rhino.head.Node node38 = scriptNode34.getLastSibling();
        scriptNode34.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode41.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode42);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList44 = scriptNode42.getFunctions();
        scriptNode42.setPosition((int) (byte) 10);
        java.lang.String str47 = scriptNode34.toStringTree(scriptNode42);
        int int48 = scriptNode34.getBaseLineno();
        com.google.javascript.rhino.head.Node node50 = scriptNode34.setType((int) (byte) -1);
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node(9, (com.google.javascript.rhino.head.Node) scriptNode26, node50);
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) scope3, (com.google.javascript.rhino.head.Node) scriptNode5, node51, 17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot55 = new com.google.javascript.rhino.head.ast.AstRoot((int) '4');
        node53.addChildrenToFront((com.google.javascript.rhino.head.Node) astRoot55);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = astRoot55.getTop();
        int int58 = astRoot55.getParamCount();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList59 = astRoot55.getStatements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str61 = astRoot55.getRegexpString(0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(1410155489);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = scriptNode1.getRegexpFlags((-325419474));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet1 = astRoot0.getComments();
        com.google.javascript.rhino.head.ast.Symbol symbol3 = astRoot0.getSymbol("                                                                                                                                                                                                        ");
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = new com.google.javascript.rhino.head.ast.AstRoot((int) '4');
        astRoot0.setCompilerData((java.lang.Object) astRoot5);
        java.lang.String str7 = astRoot5.debugPrint();
        int int8 = astRoot5.getFunctionCount();
        astRoot5.setInStrictMode(true);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = astRoot5.getEnclosingFunction();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = astRoot5.getRegexpFlags(100);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        int int6 = scriptNode1.getLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode7.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode8);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList10 = scriptNode8.getChildScopes();
        int int11 = scriptNode8.getBaseLineno();
        com.google.javascript.rhino.head.Node node12 = scriptNode8.getLastSibling();
        scriptNode8.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode15.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode16);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList18 = scriptNode16.getFunctions();
        scriptNode16.setPosition((int) (byte) 10);
        java.lang.String str21 = scriptNode8.toStringTree(scriptNode16);
        int int22 = scriptNode8.getBaseLineno();
        com.google.javascript.rhino.head.Node node24 = scriptNode8.setType((int) (byte) -1);
        scriptNode1.target = scriptNode8;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str28 = scriptNode26.toSource((int) '4');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode29.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode30);
        int int32 = scriptNode29.getEndLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode26, (com.google.javascript.rhino.head.ast.Scope) scriptNode29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node34 = scriptNode1.getChildBefore((com.google.javascript.rhino.head.Node) scriptNode29);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList3 = scriptNode1.getFunctions();
        scriptNode1.setEncodedSourceStart((int) 'a');
        java.lang.String str6 = scriptNode1.shortName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode8.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList11 = scriptNode9.getChildScopes();
        scriptNode9.setBaseLineno(18);
        scriptNode9.setEndLineno(26);
        com.google.javascript.rhino.head.Node node16 = scriptNode9.getLastSibling();
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node(1275261773, (com.google.javascript.rhino.head.Node) scriptNode9, 4);
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        int int20 = scriptNode1.getLineno();
        scriptNode1.setRelative(13);
        int int23 = scriptNode1.getAbsolutePosition();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator24 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator25 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator26 = positionComparator24.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator25);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode27.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode28);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList30 = scriptNode28.getChildScopes();
        int int31 = scriptNode28.getBaseLineno();
        int int32 = scriptNode28.getParamCount();
        scriptNode28.flattenSymbolTable(true);
        com.google.javascript.rhino.head.ast.Scope scope35 = scriptNode28.getEnclosingScope();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode36.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode37);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList39 = scriptNode37.getChildScopes();
        int int40 = scriptNode37.getBaseLineno();
        com.google.javascript.rhino.head.Node node41 = scriptNode37.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode42.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode43);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList45 = scriptNode43.getChildScopes();
        java.lang.String str47 = scriptNode43.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode37.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode43, (com.google.javascript.rhino.head.Node) scriptNode49);
        scriptNode37.setEncodedSourceEnd(170);
        int int53 = positionComparator25.compare((com.google.javascript.rhino.head.ast.AstNode) scope35, (com.google.javascript.rhino.head.ast.AstNode) scriptNode37);
        scriptNode1.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode37);
        scriptNode37.setLineno(225099420);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = scriptNode37.getTop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str59 = scriptNode57.getRegexpFlags(1879633086);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = new com.google.javascript.rhino.head.ast.AstRoot(1499437464);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator4 = scriptNode3.spliterator();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator5 = scriptNode3.new NodeIterator();
        java.lang.String str6 = scriptNode3.getNextTempName();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor7 = scriptNode3.iterator();
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(21, (com.google.javascript.rhino.head.Node) astRoot2, (com.google.javascript.rhino.head.Node) scriptNode3);
        com.google.javascript.rhino.head.ast.Scope scope10 = scriptNode3.getDefiningScope("9\t  SCRIPT 10 1\n");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator12 = scriptNode11.spliterator();
        scriptNode11.setRelative((int) (byte) 100);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode3, (com.google.javascript.rhino.head.ast.Scope) scriptNode11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = scriptNode3.getRegexpString(0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray1 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList2 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList2, symbolArray1);
        scriptNode0.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList2);
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int6 = astRoot5.getParamCount();
        int int7 = astRoot5.getRegexpCount();
        scriptNode0.addChildToBack((com.google.javascript.rhino.head.Node) astRoot5);
        int int9 = astRoot5.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = new com.google.javascript.rhino.head.ast.AstRoot();
        astRoot5.addChild((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        astRoot10.setSourceName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = astRoot10.getRegexpString(1782152993);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int2 = compilerEnvirons0.getLanguageVersion();
        int int3 = compilerEnvirons0.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean5 = compilerEnvirons4.isReservedKeywordAsIdentifier();
        compilerEnvirons4.setStrictMode(true);
        compilerEnvirons4.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean11 = compilerEnvirons10.isReservedKeywordAsIdentifier();
        boolean boolean12 = compilerEnvirons10.getWarnTrailingComma();
        compilerEnvirons10.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet15 = compilerEnvirons10.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = compilerEnvirons10.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter16);
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter16);
        compilerEnvirons0.setAllowSharpComments(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean22 = compilerEnvirons21.isReservedKeywordAsIdentifier();
        boolean boolean23 = compilerEnvirons21.getWarnTrailingComma();
        boolean boolean24 = compilerEnvirons21.isRecordingComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = compilerEnvirons21.getErrorReporter();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean27 = compilerEnvirons26.isReservedKeywordAsIdentifier();
        int int28 = compilerEnvirons26.getLanguageVersion();
        compilerEnvirons26.setLanguageVersion((int) (byte) 100);
        boolean boolean31 = compilerEnvirons26.isAllowMemberExprAsFunctionName();
        compilerEnvirons26.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray40 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        compilerEnvirons34.setActivationNames((java.util.Set<java.lang.String>) strSet41);
        boolean boolean44 = compilerEnvirons34.isGenerateDebugInfo();
        compilerEnvirons34.setOptimizationLevel((int) (short) 1);
        compilerEnvirons34.setAllowSharpComments(true);
        boolean boolean49 = compilerEnvirons34.getAllowSharpComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter50 = compilerEnvirons34.getErrorReporter();
        compilerEnvirons26.setErrorReporter(errorReporter50);
        com.google.javascript.rhino.head.ErrorReporter errorReporter52 = compilerEnvirons26.getErrorReporter();
        compilerEnvirons21.setErrorReporter(errorReporter52);
        com.google.javascript.rhino.head.IRFactory iRFactory54 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean55 = iRFactory54.eof();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean11 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        java.util.Set<java.lang.String> strSet15 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode16.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList19 = scriptNode17.getChildScopes();
        int int20 = scriptNode17.getBaseLineno();
        com.google.javascript.rhino.head.Node node21 = scriptNode17.getLastSibling();
        int int22 = scriptNode17.getLineno();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor23 = scriptNode17.iterator();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean25 = compilerEnvirons24.isReservedKeywordAsIdentifier();
        boolean boolean26 = compilerEnvirons24.isIdeMode();
        int int27 = compilerEnvirons24.getOptimizationLevel();
        scriptNode17.setCompilerData((java.lang.Object) compilerEnvirons24);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean30 = compilerEnvirons29.isReservedKeywordAsIdentifier();
        boolean boolean31 = compilerEnvirons29.isIdeMode();
        compilerEnvirons29.setRecordingLocalJsDocComments(false);
        boolean boolean34 = compilerEnvirons29.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean36 = compilerEnvirons35.isReservedKeywordAsIdentifier();
        int int37 = compilerEnvirons35.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons38 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean39 = compilerEnvirons38.isReservedKeywordAsIdentifier();
        boolean boolean40 = compilerEnvirons38.isIdeMode();
        compilerEnvirons38.setRecordingLocalJsDocComments(false);
        boolean boolean43 = compilerEnvirons38.isGenerateDebugInfo();
        compilerEnvirons38.setRecordingLocalJsDocComments(true);
        boolean boolean46 = compilerEnvirons38.isXmlAvailable();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons47 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean48 = compilerEnvirons47.isReservedKeywordAsIdentifier();
        boolean boolean49 = compilerEnvirons47.getWarnTrailingComma();
        boolean boolean50 = compilerEnvirons47.isRecordingComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter51 = compilerEnvirons47.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser52 = new com.google.javascript.rhino.head.Parser(compilerEnvirons38, errorReporter51);
        compilerEnvirons35.setErrorReporter(errorReporter51);
        compilerEnvirons29.setErrorReporter(errorReporter51);
        compilerEnvirons24.setErrorReporter(errorReporter51);
        com.google.javascript.rhino.head.Parser parser56 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean57 = parser56.eof();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode1.flattenSymbolTable(true);
        com.google.javascript.rhino.head.ast.Scope scope4 = scriptNode1.getEnclosingScope();
        java.lang.String str5 = scriptNode1.getEncodedSource();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode((-9));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node8 = scriptNode1.getChildBefore((com.google.javascript.rhino.head.Node) scriptNode7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator1 = scriptNode0.spliterator();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator2 = scriptNode0.new NodeIterator();
        int int3 = scriptNode0.getBaseLineno();
        java.lang.String str4 = scriptNode0.shortName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = scriptNode0.getFunctionNode((-110742292));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int4 = astRoot3.getBaseLineno();
        java.lang.String str5 = astRoot3.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = astRoot6.new NodeIterator();
        int int8 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot3, (com.google.javascript.rhino.head.ast.AstNode) astRoot6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode9.putIntProp((int) (short) 1, 1);
        java.lang.String str13 = scriptNode9.getEncodedSource();
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator15 = scope14.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode16.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        scope14.setTop(scriptNode17);
        scope14.setLineno((int) (short) -1);
        int int22 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode9, (com.google.javascript.rhino.head.ast.AstNode) scope14);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode23.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode24);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList26 = scriptNode24.getChildScopes();
        int int27 = scriptNode24.getBaseLineno();
        int int28 = scriptNode24.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode29.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode30);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList32 = scriptNode30.getFunctions();
        scriptNode30.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope35 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode24.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode30, (com.google.javascript.rhino.head.Node) scope35);
        scriptNode30.setEncodedSource("-1\tSCRIPT -1 1\n");
        java.lang.String str39 = scriptNode9.toStringTree(scriptNode30);
        int int42 = scriptNode9.getIntProp((-1721493936), (int) (short) 1);
        scriptNode9.putIntProp((-325419474), 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = scriptNode9.getRegexpFlags((-476424842));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        boolean boolean3 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean10 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.Parser parser11 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        com.google.javascript.rhino.head.Parser parser12 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = parser12.eof();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        int int5 = scriptNode1.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList9 = scriptNode7.getFunctions();
        scriptNode7.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope12 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scope12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode14.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode15);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList17 = scriptNode15.getChildScopes();
        int int18 = scriptNode15.getBaseLineno();
        com.google.javascript.rhino.head.Node node19 = scriptNode15.getLastSibling();
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = scriptNode15.getAstRoot();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode1, (com.google.javascript.rhino.head.ast.Scope) scriptNode15);
        java.lang.String str23 = scriptNode15.makeIndent((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = scriptNode15.getRegexpFlags((-1496675853));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compilerEnvirons0.getErrorReporter();
        java.lang.String[] strArray12 = new java.lang.String[] { "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n", "                                ", "typeof", "                                                                                                                                                                                                        ", "{\n}\n" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet13);
        boolean boolean16 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowSharpComments(true);
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = iRFactory19.eof();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        boolean boolean9 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setIdeMode(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean13 = compilerEnvirons12.isReservedKeywordAsIdentifier();
        boolean boolean14 = compilerEnvirons12.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean16 = compilerEnvirons15.isReservedKeywordAsIdentifier();
        boolean boolean17 = compilerEnvirons15.getWarnTrailingComma();
        compilerEnvirons15.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet20 = compilerEnvirons15.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = compilerEnvirons15.getErrorReporter();
        java.lang.String[] strArray27 = new java.lang.String[] { "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n", "                                ", "typeof", "                                                                                                                                                                                                        ", "{\n}\n" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet28);
        com.google.javascript.rhino.head.ErrorReporter errorReporter31 = compilerEnvirons15.getErrorReporter();
        compilerEnvirons12.setErrorReporter(errorReporter31);
        com.google.javascript.rhino.head.Parser parser33 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean34 = parser33.eof();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        java.lang.Object obj2 = scriptNode1.getCompilerData();
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator4 = scope3.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode6);
        scope3.setTop(scriptNode6);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode1, (com.google.javascript.rhino.head.ast.Scope) scriptNode6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = scriptNode6.getFunctionNode(402672405);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        int int3 = scriptNode0.getEndLineno();
        com.google.javascript.rhino.head.ast.Scope scope4 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode0.setParentScope(scope4);
        java.lang.String str6 = scriptNode0.debugPrint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = scriptNode0.getRegexpFlags((-449082186));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = compilerEnvirons0.getErrorReporter();
        boolean boolean12 = compilerEnvirons0.isRecordingComments();
        boolean boolean13 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean15 = compilerEnvirons14.isReservedKeywordAsIdentifier();
        int int16 = compilerEnvirons14.getLanguageVersion();
        compilerEnvirons14.setLanguageVersion((int) (byte) 100);
        boolean boolean19 = compilerEnvirons14.isXmlAvailable();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean21 = compilerEnvirons20.isReservedKeywordAsIdentifier();
        compilerEnvirons20.setStrictMode(true);
        compilerEnvirons20.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean27 = compilerEnvirons26.isReservedKeywordAsIdentifier();
        compilerEnvirons26.setStrictMode(true);
        compilerEnvirons26.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean33 = compilerEnvirons32.isReservedKeywordAsIdentifier();
        boolean boolean34 = compilerEnvirons32.getWarnTrailingComma();
        compilerEnvirons32.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet37 = compilerEnvirons32.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter38 = compilerEnvirons32.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory39 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter38);
        com.google.javascript.rhino.head.IRFactory iRFactory40 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons20, errorReporter38);
        com.google.javascript.rhino.head.Parser parser41 = new com.google.javascript.rhino.head.Parser(compilerEnvirons14, errorReporter38);
        com.google.javascript.rhino.head.Parser parser42 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean43 = parser42.eof();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        int int3 = scriptNode0.getEndLineno();
        com.google.javascript.rhino.head.ast.Scope scope4 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode0.setParentScope(scope4);
        java.lang.String str6 = scriptNode0.debugPrint();
        java.lang.String str7 = scriptNode0.getSourceName();
        int int8 = scriptNode0.getEncodedSourceEnd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = scriptNode0.getRegexpFlags((-202912574));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList9 = scriptNode7.getChildScopes();
        java.lang.String str11 = scriptNode7.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scriptNode13);
        java.lang.Object obj16 = scriptNode7.getProp((int) (short) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str19 = scriptNode17.toSource((int) '4');
        java.lang.String str20 = scriptNode7.toStringTree(scriptNode17);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList21 = scriptNode7.getFunctions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode23 = scriptNode7.getFunctionNode(709071950);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        java.lang.Object obj2 = scriptNode1.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode3.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode4);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray7 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList8 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList8, symbolArray7);
        scriptNode6.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList8);
        scriptNode3.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList8);
        scriptNode1.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = scriptNode1.getRegexpFlags((-253374738));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet1 = astRoot0.getComments();
        int int2 = astRoot0.getEndLineno();
        com.google.javascript.rhino.head.Node node4 = astRoot0.setType((int) (short) 10);
        astRoot0.putIntProp(24, (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode8.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        scriptNode9.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode13.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode14);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList16 = scriptNode14.getChildScopes();
        int int17 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.Node node18 = scriptNode14.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode19.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode20);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode20.getChildScopes();
        java.lang.String str24 = scriptNode20.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode14.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode20, (com.google.javascript.rhino.head.Node) scriptNode26);
        int int28 = scriptNode20.getType();
        scriptNode9.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode20);
        int int30 = scriptNode20.getParamCount();
        com.google.javascript.rhino.head.Node node31 = scriptNode20.getLastSibling();
        astRoot0.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode20);
        com.google.javascript.rhino.head.ast.Scope scope33 = astRoot0.getEnclosingScope();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList34 = astRoot0.getFunctions();
        astRoot0.setPosition(1755968153);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str38 = astRoot0.getRegexpFlags((-837790279));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator2 = astRoot1.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType5 = null;
        com.google.javascript.rhino.head.ast.Comment comment7 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType5, "");
        boolean boolean8 = comment7.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType11 = null;
        com.google.javascript.rhino.head.ast.Comment comment13 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType11, "");
        boolean boolean14 = comment13.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType17 = null;
        com.google.javascript.rhino.head.ast.Comment comment19 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType17, "");
        java.lang.String str21 = comment19.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray22 = new com.google.javascript.rhino.head.ast.Comment[] { comment7, comment13, comment19 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet23 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet23, commentArray22);
        astRoot1.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet23);
        boolean boolean26 = astRoot1.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray27 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList28 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList28, symbolArray27);
        astRoot1.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList28);
        com.google.javascript.rhino.head.Node node31 = astRoot1.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode32.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode33);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot1, (com.google.javascript.rhino.head.ast.Scope) scriptNode33);
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node(4, (com.google.javascript.rhino.head.Node) astRoot1, 129);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet38 = astRoot1.getComments();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode39.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode40);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList42 = scriptNode40.getFunctions();
        scriptNode40.setPosition((int) (byte) 10);
        astRoot1.target = scriptNode40;
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newNumber((double) 36);
        com.google.javascript.rhino.head.ast.AstRoot astRoot49 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator50 = astRoot49.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType53 = null;
        com.google.javascript.rhino.head.ast.Comment comment55 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType53, "");
        boolean boolean56 = comment55.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType59 = null;
        com.google.javascript.rhino.head.ast.Comment comment61 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType59, "");
        boolean boolean62 = comment61.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType65 = null;
        com.google.javascript.rhino.head.ast.Comment comment67 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType65, "");
        java.lang.String str69 = comment67.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray70 = new com.google.javascript.rhino.head.ast.Comment[] { comment55, comment61, comment67 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet71 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet71, commentArray70);
        astRoot49.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet71);
        node47.putProp(709071950, (java.lang.Object) astRoot49);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode40, (com.google.javascript.rhino.head.ast.Scope) astRoot49);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on commentSet38 and commentSet71.", commentSet38.equals(commentSet71) == commentSet71.equals(commentSet38));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) '#', "$0");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator5 = scriptNode4.spliterator();
        com.google.javascript.rhino.head.Node node7 = scriptNode4.setType((int) '#');
        java.lang.Object obj8 = scriptNode4.getCompilerData();
        com.google.javascript.rhino.head.ast.Symbol symbol10 = scriptNode4.getSymbol("typeof");
        scriptNode4.setEncodedSource("{\n}\n");
        scriptNode4.setEncodedSourceBounds((int) (short) 100, 8);
        int int16 = scriptNode4.getRegexpCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode17.putIntProp((int) (short) 1, 1);
        scriptNode17.setEncodedSource("typeof");
        java.lang.Object obj24 = scriptNode17.getProp(2);
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(574921099, (com.google.javascript.rhino.head.Node) scriptNode4, (com.google.javascript.rhino.head.Node) scriptNode17);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode27.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode28);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList30 = scriptNode28.getChildScopes();
        int int31 = scriptNode28.getBaseLineno();
        int int32 = scriptNode28.getParamCount();
        scriptNode28.flattenSymbolTable(true);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode35.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode36);
        scriptNode36.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap42 = scriptNode41.getSymbolTable();
        scriptNode36.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode41);
        com.google.javascript.rhino.head.ast.Scope scope44 = scriptNode36.getParentScope();
        boolean boolean45 = scriptNode36.hasChildren();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList46 = scriptNode36.getSymbols();
        scriptNode28.setSymbols(symbolList46);
        node25.putProp(1275261773, (java.lang.Object) scriptNode28);
        int int49 = scriptNode28.getPosition();
        java.lang.String str50 = scriptNode28.debugPrint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node51 = node2.getChildBefore((com.google.javascript.rhino.head.Node) scriptNode28);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compilerEnvirons0.getErrorReporter();
        boolean boolean7 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean8 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setOptimizationLevel((int) (short) 0);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean12 = compilerEnvirons11.isReservedKeywordAsIdentifier();
        boolean boolean13 = compilerEnvirons11.getWarnTrailingComma();
        compilerEnvirons11.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet16 = compilerEnvirons11.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = compilerEnvirons11.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter17);
        com.google.javascript.rhino.head.ast.Scope scope21 = new com.google.javascript.rhino.head.ast.Scope(20, (-325419474));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node22 = iRFactory18.transform((com.google.javascript.rhino.head.ast.AstNode) scope21);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        boolean boolean4 = compilerEnvirons0.getWarnTrailingComma();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean6 = compilerEnvirons5.isReservedKeywordAsIdentifier();
        boolean boolean7 = compilerEnvirons5.getWarnTrailingComma();
        compilerEnvirons5.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet10 = compilerEnvirons5.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = compilerEnvirons5.getErrorReporter();
        compilerEnvirons5.setReservedKeywordAsIdentifier(false);
        boolean boolean14 = compilerEnvirons5.isGeneratingSource();
        compilerEnvirons5.setIdeMode(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean18 = compilerEnvirons17.isReservedKeywordAsIdentifier();
        boolean boolean19 = compilerEnvirons17.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean21 = compilerEnvirons20.isReservedKeywordAsIdentifier();
        boolean boolean22 = compilerEnvirons20.getWarnTrailingComma();
        compilerEnvirons20.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet25 = compilerEnvirons20.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = compilerEnvirons20.getErrorReporter();
        java.lang.String[] strArray32 = new java.lang.String[] { "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n", "                                ", "typeof", "                                                                                                                                                                                                        ", "{\n}\n" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        compilerEnvirons20.setActivationNames((java.util.Set<java.lang.String>) strSet33);
        com.google.javascript.rhino.head.ErrorReporter errorReporter36 = compilerEnvirons20.getErrorReporter();
        compilerEnvirons17.setErrorReporter(errorReporter36);
        com.google.javascript.rhino.head.Parser parser38 = new com.google.javascript.rhino.head.Parser(compilerEnvirons5, errorReporter36);
        com.google.javascript.rhino.head.IRFactory iRFactory39 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean40 = iRFactory39.eof();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = astRoot1.getFunctionNode(338455453);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        scriptNode1.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap7 = scriptNode6.getSymbolTable();
        scriptNode1.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode6);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList9 = scriptNode1.getStatements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = scriptNode1.getRegexpFlags(842975161);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        int int6 = scriptNode1.getLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode8.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList11 = scriptNode9.getChildScopes();
        java.lang.String str13 = scriptNode9.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode14.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode15);
        scriptNode15.setEncodedSourceEnd(11);
        int int19 = scriptNode9.compareTo((com.google.javascript.rhino.head.ast.AstNode) scriptNode15);
        scriptNode1.putProp(8, (java.lang.Object) scriptNode15);
        scriptNode1.setEndLineno(14);
        com.google.javascript.rhino.head.Node node24 = scriptNode1.setType(23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = scriptNode1.getRegexpString((-488381886));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        com.google.javascript.rhino.head.ErrorReporter errorReporter10 = compilerEnvirons0.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode12.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode13);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = scriptNode13.getChildScopes();
        int int16 = scriptNode13.getBaseLineno();
        int int17 = scriptNode13.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode18.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode19);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList21 = scriptNode19.getFunctions();
        scriptNode19.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope24 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode13.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode19, (com.google.javascript.rhino.head.Node) scope24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode26.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode27);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList29 = scriptNode27.getChildScopes();
        int int30 = scriptNode27.getBaseLineno();
        com.google.javascript.rhino.head.Node node31 = scriptNode27.getLastSibling();
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = scriptNode27.getAstRoot();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode13, (com.google.javascript.rhino.head.ast.Scope) scriptNode27);
        com.google.javascript.rhino.head.Node node34 = iRFactory11.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode27);
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = iRFactory11.parse("                  ", "10", 1490422031);
        java.lang.String str39 = astRoot38.getSourceName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str41 = astRoot38.getRegexpFlags(133136743);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope(18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = scope1.getTop();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode4.removeProp(10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator8 = astRoot7.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor9 = astRoot7.iterator();
        scriptNode4.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot7);
        scope1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newString(4, "");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode15.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode16);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList18 = scriptNode16.getChildScopes();
        int int19 = scriptNode16.getBaseLineno();
        com.google.javascript.rhino.head.Node node20 = scriptNode16.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode21.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode22);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList24 = scriptNode22.getChildScopes();
        java.lang.String str26 = scriptNode22.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode16.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode22, (com.google.javascript.rhino.head.Node) scriptNode28);
        java.lang.Object obj31 = scriptNode22.getProp((int) (short) -1);
        java.lang.Object obj33 = scriptNode22.getProp((int) (byte) 100);
        java.lang.String str34 = scriptNode22.getSourceName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode4.replaceChild(node14, (com.google.javascript.rhino.head.Node) scriptNode22);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode2);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList4 = scriptNode2.getChildScopes();
        int int5 = scriptNode2.getBaseLineno();
        com.google.javascript.rhino.head.Node node6 = scriptNode2.getLastSibling();
        int int7 = scriptNode2.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator8 = scriptNode2.new NodeIterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode9.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList12 = scriptNode10.getChildScopes();
        int int13 = scriptNode10.getBaseLineno();
        com.google.javascript.rhino.head.Node node14 = scriptNode10.getLastSibling();
        scriptNode10.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode17.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode18);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList20 = scriptNode18.getFunctions();
        scriptNode18.setPosition((int) (byte) 10);
        java.lang.String str23 = scriptNode10.toStringTree(scriptNode18);
        int int24 = scriptNode10.getBaseLineno();
        com.google.javascript.rhino.head.Node node26 = scriptNode10.setType((int) (byte) -1);
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node(9, (com.google.javascript.rhino.head.Node) scriptNode2, node26);
        scriptNode2.setEncodedSourceStart(100);
        boolean boolean30 = scriptNode2.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = scriptNode2.getRegexpString(204947058);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        int int3 = scriptNode0.getEndLineno();
        com.google.javascript.rhino.head.ast.Scope scope4 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode0.setParentScope(scope4);
        scriptNode0.setLineno((int) '4');
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap8 = scriptNode0.getSymbolTable();
        java.lang.String str9 = scriptNode0.debugPrint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = scriptNode0.getRegexpString(850021394);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet1 = astRoot0.getComments();
        int int2 = astRoot0.getEndLineno();
        com.google.javascript.rhino.head.Node node4 = astRoot0.setType((int) (short) 10);
        com.google.javascript.rhino.head.ast.Scope scope5 = astRoot0.getParentScope();
        int int8 = astRoot0.getIntProp((-1), 18);
        astRoot0.setEncodedSourceEnd(161);
        int int11 = astRoot0.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = astRoot0.getRegexpString((-1608028689));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList9 = scriptNode7.getChildScopes();
        java.lang.String str11 = scriptNode7.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scriptNode13);
        int int15 = scriptNode7.getType();
        java.lang.String str16 = scriptNode7.getSourceName();
        java.lang.String str17 = scriptNode7.toSource();
        java.lang.String str19 = scriptNode7.toSource((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = scriptNode7.getFunctionNode(163023072);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode0.toSource((int) '4');
        com.google.javascript.rhino.head.Node node3 = scriptNode0.getFirstChild();
        com.google.javascript.rhino.head.ast.Symbol symbol5 = scriptNode0.getSymbol("35");
        com.google.javascript.rhino.head.Node node6 = scriptNode0.getFirstChild();
        int int7 = scriptNode0.getPosition();
        scriptNode0.setEndLineno(129);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = scriptNode0.getFunctionNode(1410155489);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setGenerateDebugInfo(true);
        compilerEnvirons0.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean12 = compilerEnvirons11.isReservedKeywordAsIdentifier();
        boolean boolean13 = compilerEnvirons11.getWarnTrailingComma();
        compilerEnvirons11.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet16 = compilerEnvirons11.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = compilerEnvirons11.getErrorReporter();
        boolean boolean18 = compilerEnvirons11.isRecordingComments();
        compilerEnvirons11.setGeneratingSource(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean22 = compilerEnvirons21.isReservedKeywordAsIdentifier();
        int int23 = compilerEnvirons21.getLanguageVersion();
        compilerEnvirons21.setLanguageVersion((int) (byte) 100);
        boolean boolean26 = compilerEnvirons21.isAllowMemberExprAsFunctionName();
        compilerEnvirons21.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray35 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        compilerEnvirons29.setActivationNames((java.util.Set<java.lang.String>) strSet36);
        boolean boolean39 = compilerEnvirons29.isGenerateDebugInfo();
        compilerEnvirons29.setOptimizationLevel((int) (short) 1);
        compilerEnvirons29.setAllowSharpComments(true);
        boolean boolean44 = compilerEnvirons29.getAllowSharpComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter45 = compilerEnvirons29.getErrorReporter();
        compilerEnvirons21.setErrorReporter(errorReporter45);
        compilerEnvirons11.setErrorReporter(errorReporter45);
        com.google.javascript.rhino.head.IRFactory iRFactory48 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter45);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode49.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode50);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList52 = scriptNode50.getChildScopes();
        int int53 = scriptNode50.getBaseLineno();
        com.google.javascript.rhino.head.Node node54 = scriptNode50.getLastSibling();
        scriptNode50.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode58 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode57.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode58);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList60 = scriptNode58.getFunctions();
        scriptNode58.setPosition((int) (byte) 10);
        java.lang.String str63 = scriptNode50.toStringTree(scriptNode58);
        int int64 = scriptNode50.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode66.removeProp(10);
        com.google.javascript.rhino.head.ast.Scope scope69 = scriptNode66.getParentScope();
        scriptNode50.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode66);
        com.google.javascript.rhino.head.ast.Scope scope72 = new com.google.javascript.rhino.head.ast.Scope(7);
        scriptNode50.target = scope72;
        int int74 = scope72.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node75 = iRFactory48.transform((com.google.javascript.rhino.head.ast.AstNode) scope72);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList9 = scriptNode7.getChildScopes();
        java.lang.String str11 = scriptNode7.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scriptNode13);
        java.lang.Object obj16 = scriptNode7.getProp((int) (short) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str19 = scriptNode17.toSource((int) '4');
        java.lang.String str20 = scriptNode7.toStringTree(scriptNode17);
        com.google.javascript.rhino.head.Node node21 = scriptNode17.target;
        java.lang.String str22 = scriptNode17.getSourceName();
        int int23 = scriptNode17.getFunctionCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = scriptNode17.getFunctionNode(342312986);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        scriptNode1.setPosition(24);
        java.lang.String str8 = scriptNode1.shortName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = scriptNode1.getRegexpFlags((int) (byte) 1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot(16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = astRoot1.getFunctionNode((-117418037));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        java.lang.Object obj2 = scriptNode1.getCompilerData();
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator4 = scope3.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode6);
        scope3.setTop(scriptNode6);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode1, (com.google.javascript.rhino.head.ast.Scope) scriptNode6);
        scriptNode6.clearParentScope();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("$0");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode6.removeChild(node12);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getParamCount();
        int int2 = astRoot0.getPosition();
        com.google.javascript.rhino.head.Node node3 = astRoot0.target;
        astRoot0.checkParentLinks();
        boolean boolean5 = astRoot0.isInStrictMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = astRoot0.getRegexpFlags((int) 'a');
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int2 = astRoot1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = new com.google.javascript.rhino.head.Node(100, (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node((int) (short) 100, (com.google.javascript.rhino.head.Node) astRoot1, node5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = astRoot1.getFunctionNode((-1616119957));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet1 = astRoot0.getComments();
        java.lang.String str2 = astRoot0.getSourceName();
        boolean boolean3 = astRoot0.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode4.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode5);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList7 = scriptNode5.getChildScopes();
        int int8 = scriptNode5.getBaseLineno();
        com.google.javascript.rhino.head.Node node9 = scriptNode5.getLastSibling();
        scriptNode5.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode12.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode13);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList15 = scriptNode13.getFunctions();
        scriptNode13.setPosition((int) (byte) 10);
        java.lang.String str18 = scriptNode5.toStringTree(scriptNode13);
        int int19 = scriptNode5.getBaseLineno();
        boolean boolean20 = scriptNode5.hasConsistentReturnUsage();
        astRoot0.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode5);
        astRoot0.setBaseLineno(14);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet24 = astRoot0.getComments();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = astRoot0.getFunctionNode((int) '#');
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator1 = scriptNode0.spliterator();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator2 = scriptNode0.new NodeIterator();
        java.lang.String str3 = scriptNode0.getNextTempName();
        int int4 = scriptNode0.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = scriptNode0.getFunctionNode(1617059566);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getBaseLineno();
        java.lang.String str2 = astRoot0.debugPrint();
        astRoot0.setEncodedSourceBounds((int) (byte) -1, 18);
        com.google.javascript.rhino.head.ast.Scope scope7 = astRoot0.getDefiningScope("136");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = astRoot0.getFunctionNode(1001288202);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        java.lang.Object obj2 = scriptNode1.getCompilerData();
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator4 = scope3.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode6);
        scope3.setTop(scriptNode6);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode1, (com.google.javascript.rhino.head.ast.Scope) scriptNode6);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor10 = scriptNode6.iterator();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newNumber((double) (-1034592013));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node13 = scriptNode6.getChildBefore(node12);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot(1499437464);
        int int2 = astRoot1.depth();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = astRoot1.getRegexpString(209601021);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator1 = astRoot0.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType4, "");
        boolean boolean7 = comment6.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType10 = null;
        com.google.javascript.rhino.head.ast.Comment comment12 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType10, "");
        boolean boolean13 = comment12.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType16 = null;
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType16, "");
        java.lang.String str20 = comment18.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray21 = new com.google.javascript.rhino.head.ast.Comment[] { comment6, comment12, comment18 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet22 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet22, commentArray21);
        astRoot0.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet22);
        boolean boolean25 = astRoot0.isInStrictMode();
        com.google.javascript.rhino.head.Token.CommentType commentType28 = null;
        com.google.javascript.rhino.head.ast.Comment comment30 = new com.google.javascript.rhino.head.ast.Comment((int) '#', 2, commentType28, "hi!");
        astRoot0.addComment(comment30);
        astRoot0.setEncodedSource("typeof");
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet35 = astRoot34.getComments();
        int int36 = astRoot34.getEndLineno();
        com.google.javascript.rhino.head.Node node38 = astRoot34.setType((int) (short) 10);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot0, (com.google.javascript.rhino.head.ast.Scope) astRoot34);
        astRoot0.setBaseLineno((int) (byte) 0);
        astRoot0.setEncodedSourceStart((-1));
        com.google.javascript.rhino.head.ast.AstRoot astRoot44 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator45 = astRoot44.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType48 = null;
        com.google.javascript.rhino.head.ast.Comment comment50 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType48, "");
        boolean boolean51 = comment50.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType54 = null;
        com.google.javascript.rhino.head.ast.Comment comment56 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType54, "");
        boolean boolean57 = comment56.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType60 = null;
        com.google.javascript.rhino.head.ast.Comment comment62 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType60, "");
        java.lang.String str64 = comment62.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray65 = new com.google.javascript.rhino.head.ast.Comment[] { comment50, comment56, comment62 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet66 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet66, commentArray65);
        astRoot44.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet66);
        boolean boolean69 = astRoot44.hasChildren();
        java.lang.String str70 = astRoot44.debugPrint();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet71 = astRoot44.getComments();
        astRoot0.setComments(commentSet71);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on commentSet66, commentSet71, and commentSet22.", !(commentSet66.equals(commentSet71) && commentSet71.equals(commentSet22)) || commentSet66.equals(commentSet22));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.putIntProp((int) (short) 1, 1);
        scriptNode0.setEncodedSource("typeof");
        java.lang.String str7 = scriptNode0.toSource(23);
        com.google.javascript.rhino.head.ast.Scope scope9 = scriptNode0.getDefiningScope("                                ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = scriptNode0.getFunctionNode(1248074761);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setGenerateDebugInfo(true);
        compilerEnvirons0.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean12 = compilerEnvirons11.isReservedKeywordAsIdentifier();
        boolean boolean13 = compilerEnvirons11.getWarnTrailingComma();
        compilerEnvirons11.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet16 = compilerEnvirons11.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = compilerEnvirons11.getErrorReporter();
        boolean boolean18 = compilerEnvirons11.isRecordingComments();
        compilerEnvirons11.setGeneratingSource(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean22 = compilerEnvirons21.isReservedKeywordAsIdentifier();
        int int23 = compilerEnvirons21.getLanguageVersion();
        compilerEnvirons21.setLanguageVersion((int) (byte) 100);
        boolean boolean26 = compilerEnvirons21.isAllowMemberExprAsFunctionName();
        compilerEnvirons21.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray35 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        compilerEnvirons29.setActivationNames((java.util.Set<java.lang.String>) strSet36);
        boolean boolean39 = compilerEnvirons29.isGenerateDebugInfo();
        compilerEnvirons29.setOptimizationLevel((int) (short) 1);
        compilerEnvirons29.setAllowSharpComments(true);
        boolean boolean44 = compilerEnvirons29.getAllowSharpComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter45 = compilerEnvirons29.getErrorReporter();
        compilerEnvirons21.setErrorReporter(errorReporter45);
        compilerEnvirons11.setErrorReporter(errorReporter45);
        com.google.javascript.rhino.head.IRFactory iRFactory48 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter45);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons49 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean50 = compilerEnvirons49.isReservedKeywordAsIdentifier();
        compilerEnvirons49.setStrictMode(true);
        compilerEnvirons49.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons55 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean56 = compilerEnvirons55.isReservedKeywordAsIdentifier();
        compilerEnvirons55.setStrictMode(true);
        compilerEnvirons55.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons61 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean62 = compilerEnvirons61.isReservedKeywordAsIdentifier();
        boolean boolean63 = compilerEnvirons61.getWarnTrailingComma();
        compilerEnvirons61.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet66 = compilerEnvirons61.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter67 = compilerEnvirons61.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory68 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons55, errorReporter67);
        com.google.javascript.rhino.head.IRFactory iRFactory69 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons49, errorReporter67);
        com.google.javascript.rhino.head.ast.AstRoot astRoot73 = iRFactory69.parse("2\tSCRIPT 2 1\n", "35", 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode74 = iRFactory48.transformTree(astRoot73);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean75 = iRFactory48.eof();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList9 = scriptNode7.getChildScopes();
        java.lang.String str11 = scriptNode7.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scriptNode13);
        com.google.javascript.rhino.head.ast.AstNode astNode15 = scriptNode1.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = scriptNode1.getRegexpString((-603173706));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.google.javascript.rhino.head.ast.Scope scope0 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator1 = scope0.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode2.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode3);
        scope0.setTop(scriptNode3);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor6 = scope0.iterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode7.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode8);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList10 = scriptNode8.getChildScopes();
        int int11 = scriptNode8.getBaseLineno();
        com.google.javascript.rhino.head.Node node12 = scriptNode8.getLastSibling();
        int int13 = scriptNode8.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator14 = scriptNode8.new NodeIterator();
        java.lang.Object obj15 = scriptNode8.getCompilerData();
        scope0.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode8);
        java.lang.String str17 = scriptNode8.getSourceName();
        scriptNode8.setEncodedSourceEnd((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = scriptNode8.getFunctionNode(1278095946);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        scriptNode1.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode6);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList8 = scriptNode6.getChildScopes();
        int int9 = scriptNode6.getBaseLineno();
        com.google.javascript.rhino.head.Node node10 = scriptNode6.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode11.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode12);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList14 = scriptNode12.getChildScopes();
        java.lang.String str16 = scriptNode12.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode6.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode12, (com.google.javascript.rhino.head.Node) scriptNode18);
        int int20 = scriptNode12.getType();
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode22.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode23);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList25 = scriptNode23.getChildScopes();
        int int26 = scriptNode23.getBaseLineno();
        com.google.javascript.rhino.head.Node node27 = scriptNode23.getLastSibling();
        scriptNode23.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode30.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode31);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList33 = scriptNode31.getFunctions();
        scriptNode31.setPosition((int) (byte) 10);
        java.lang.String str36 = scriptNode23.toStringTree(scriptNode31);
        int int37 = scriptNode23.getBaseLineno();
        scriptNode23.setEncodedSourceStart((int) '4');
        scriptNode12.addChildrenToFront((com.google.javascript.rhino.head.Node) scriptNode23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode42 = scriptNode12.getFunctionNode(601078793);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean3 = compilerEnvirons0.reportWarningAsError();
        java.util.Set<java.lang.String> strSet4 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet7 = astRoot6.getComments();
        com.google.javascript.rhino.head.ast.Symbol symbol9 = astRoot6.getSymbol("                                                                                                                                                                                                        ");
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = new com.google.javascript.rhino.head.ast.AstRoot((int) '4');
        astRoot6.setCompilerData((java.lang.Object) astRoot11);
        java.lang.String str13 = astRoot11.debugPrint();
        int int14 = astRoot11.getFunctionCount();
        astRoot11.setInStrictMode(true);
        java.lang.String str18 = astRoot11.toSource(538062289);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = iRFactory5.transformTree(astRoot11);
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = iRFactory5.parse("-1\tSCRIPT -1 1\n", "                                                                hi!", 189974018);
        boolean boolean24 = iRFactory5.eof();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator25 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator26 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator27 = positionComparator25.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator26);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode29.removeProp(10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator33 = astRoot32.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor34 = astRoot32.iterator();
        scriptNode29.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot32);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode36.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode37);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList39 = scriptNode37.getChildScopes();
        int int40 = positionComparator26.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot32, (com.google.javascript.rhino.head.ast.AstNode) scriptNode37);
        boolean boolean41 = astRoot32.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = iRFactory5.transformTree(astRoot32);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        int int6 = scriptNode1.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = scriptNode1.new NodeIterator();
        int int8 = scriptNode1.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope9 = scriptNode1.getParentScope();
        scriptNode1.removeProp(65536);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = scriptNode1.getRegexpFlags((-891351598));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int2 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setLanguageVersion((int) (byte) 100);
        compilerEnvirons0.setXmlAvailable(false);
        int int7 = compilerEnvirons0.getOptimizationLevel();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = iRFactory8.eof();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        scriptNode1.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode8.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList11 = scriptNode9.getFunctions();
        scriptNode9.setPosition((int) (byte) 10);
        java.lang.String str14 = scriptNode1.toStringTree(scriptNode9);
        int int15 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node17 = scriptNode1.setType((int) (byte) -1);
        scriptNode1.setSourceName("typeof");
        scriptNode1.setEncodedSource("                                                                                                        {\n                                                                                                        }\n");
        int int24 = scriptNode1.getIntProp(325741318, 327994914);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = scriptNode1.getFunctionNode((int) (short) 1);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.putIntProp((int) (short) 1, 1);
        scriptNode0.setEncodedSource("typeof");
        com.google.javascript.rhino.head.Node node6 = scriptNode0.getLastChild();
        scriptNode0.setBaseLineno(13);
        scriptNode0.setLength(23);
        scriptNode0.setPosition((-213029975));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = scriptNode0.getFunctionNode((-1088649131));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray1 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList2 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList2, symbolArray1);
        scriptNode0.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList2);
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int6 = astRoot5.getParamCount();
        int int7 = astRoot5.getRegexpCount();
        scriptNode0.addChildToBack((com.google.javascript.rhino.head.Node) astRoot5);
        int int9 = astRoot5.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = new com.google.javascript.rhino.head.ast.AstRoot();
        astRoot5.addChild((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = astRoot10.target;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = astRoot10.getFunctionNode(709071950);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot(1499437464);
        int int2 = astRoot1.depth();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = astRoot1.getFunctionNode(402672405);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        int int6 = scriptNode1.getEndLineno();
        scriptNode1.setBaseLineno(4);
        int int9 = scriptNode1.getRegexpCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int11 = astRoot10.getBaseLineno();
        java.lang.String str12 = astRoot10.debugPrint();
        astRoot10.setEncodedSourceBounds((int) (byte) -1, 18);
        astRoot10.clearParentScope();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode17.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode18);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList20 = scriptNode18.getChildScopes();
        int int21 = scriptNode18.getBaseLineno();
        com.google.javascript.rhino.head.Node node22 = scriptNode18.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode23.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode24);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList26 = scriptNode24.getChildScopes();
        java.lang.String str28 = scriptNode24.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode18.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode24, (com.google.javascript.rhino.head.Node) scriptNode30);
        java.lang.Object obj33 = scriptNode24.getProp((int) (short) -1);
        scriptNode24.setSourceName("-1\tSCRIPT -1 1\n");
        boolean boolean36 = scriptNode24.hasSideEffects();
        java.lang.String str37 = scriptNode24.getNextTempName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode1.replaceChildAfter((com.google.javascript.rhino.head.Node) astRoot10, (com.google.javascript.rhino.head.Node) scriptNode24);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        scriptNode1.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode8.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList11 = scriptNode9.getFunctions();
        scriptNode9.setPosition((int) (byte) 10);
        java.lang.String str14 = scriptNode1.toStringTree(scriptNode9);
        int int15 = scriptNode1.getRegexpCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray17 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList18 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList18, symbolArray17);
        scriptNode16.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int22 = astRoot21.getParamCount();
        int int23 = astRoot21.getRegexpCount();
        scriptNode16.addChildToBack((com.google.javascript.rhino.head.Node) astRoot21);
        int int25 = astRoot21.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = new com.google.javascript.rhino.head.ast.AstRoot();
        astRoot21.addChild((com.google.javascript.rhino.head.ast.AstNode) astRoot26);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = astRoot26.getAstRoot();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode((-552755211));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode1.replaceChild((com.google.javascript.rhino.head.Node) astRoot28, (com.google.javascript.rhino.head.Node) scriptNode30);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray1 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList2 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList2, symbolArray1);
        scriptNode0.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList2);
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int6 = astRoot5.getParamCount();
        int int7 = astRoot5.getRegexpCount();
        scriptNode0.addChildToBack((com.google.javascript.rhino.head.Node) astRoot5);
        astRoot5.checkParentLinks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = astRoot5.getRegexpString(520206471);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int2 = compilerEnvirons0.getLanguageVersion();
        boolean boolean3 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray11 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet12);
        boolean boolean15 = compilerEnvirons5.isGenerateDebugInfo();
        boolean boolean16 = compilerEnvirons5.isGeneratingSource();
        compilerEnvirons5.setIdeMode(false);
        java.util.Set<java.lang.String> strSet19 = compilerEnvirons5.getActivationNames();
        compilerEnvirons0.setActivationNames(strSet19);
        boolean boolean21 = compilerEnvirons0.isXmlAvailable();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean23 = compilerEnvirons22.isReservedKeywordAsIdentifier();
        boolean boolean24 = compilerEnvirons22.getWarnTrailingComma();
        compilerEnvirons22.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet27 = compilerEnvirons22.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = compilerEnvirons22.getErrorReporter();
        compilerEnvirons22.setReservedKeywordAsIdentifier(false);
        int int31 = compilerEnvirons22.getOptimizationLevel();
        boolean boolean32 = compilerEnvirons22.isGenerateObserverCount();
        compilerEnvirons22.setRecordingLocalJsDocComments(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray41 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        compilerEnvirons35.setActivationNames((java.util.Set<java.lang.String>) strSet42);
        boolean boolean45 = compilerEnvirons35.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter46 = compilerEnvirons35.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser47 = new com.google.javascript.rhino.head.Parser(compilerEnvirons22, errorReporter46);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons48 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean49 = compilerEnvirons48.isReservedKeywordAsIdentifier();
        int int50 = compilerEnvirons48.getLanguageVersion();
        compilerEnvirons48.setLanguageVersion((int) (byte) 100);
        boolean boolean53 = compilerEnvirons48.isXmlAvailable();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons54 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean55 = compilerEnvirons54.isReservedKeywordAsIdentifier();
        compilerEnvirons54.setStrictMode(true);
        compilerEnvirons54.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons60 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean61 = compilerEnvirons60.isReservedKeywordAsIdentifier();
        compilerEnvirons60.setStrictMode(true);
        compilerEnvirons60.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons66 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean67 = compilerEnvirons66.isReservedKeywordAsIdentifier();
        boolean boolean68 = compilerEnvirons66.getWarnTrailingComma();
        compilerEnvirons66.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet71 = compilerEnvirons66.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter72 = compilerEnvirons66.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory73 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons60, errorReporter72);
        com.google.javascript.rhino.head.IRFactory iRFactory74 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons54, errorReporter72);
        com.google.javascript.rhino.head.Parser parser75 = new com.google.javascript.rhino.head.Parser(compilerEnvirons48, errorReporter72);
        compilerEnvirons22.setErrorReporter(errorReporter72);
        com.google.javascript.rhino.head.IRFactory iRFactory77 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean78 = iRFactory77.eof();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setGenerateDebugInfo(true);
        compilerEnvirons0.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean12 = compilerEnvirons11.isReservedKeywordAsIdentifier();
        boolean boolean13 = compilerEnvirons11.getWarnTrailingComma();
        compilerEnvirons11.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet16 = compilerEnvirons11.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = compilerEnvirons11.getErrorReporter();
        boolean boolean18 = compilerEnvirons11.isRecordingComments();
        compilerEnvirons11.setGeneratingSource(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean22 = compilerEnvirons21.isReservedKeywordAsIdentifier();
        int int23 = compilerEnvirons21.getLanguageVersion();
        compilerEnvirons21.setLanguageVersion((int) (byte) 100);
        boolean boolean26 = compilerEnvirons21.isAllowMemberExprAsFunctionName();
        compilerEnvirons21.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray35 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        compilerEnvirons29.setActivationNames((java.util.Set<java.lang.String>) strSet36);
        boolean boolean39 = compilerEnvirons29.isGenerateDebugInfo();
        compilerEnvirons29.setOptimizationLevel((int) (short) 1);
        compilerEnvirons29.setAllowSharpComments(true);
        boolean boolean44 = compilerEnvirons29.getAllowSharpComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter45 = compilerEnvirons29.getErrorReporter();
        compilerEnvirons21.setErrorReporter(errorReporter45);
        compilerEnvirons11.setErrorReporter(errorReporter45);
        com.google.javascript.rhino.head.IRFactory iRFactory48 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter45);
        com.google.javascript.rhino.head.ast.AstRoot astRoot49 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet50 = astRoot49.getComments();
        java.lang.String str51 = astRoot49.getSourceName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = iRFactory48.transformTree(astRoot49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean53 = iRFactory48.eof();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean3 = compilerEnvirons0.reportWarningAsError();
        java.util.Set<java.lang.String> strSet4 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet7 = astRoot6.getComments();
        com.google.javascript.rhino.head.ast.Symbol symbol9 = astRoot6.getSymbol("                                                                                                                                                                                                        ");
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = new com.google.javascript.rhino.head.ast.AstRoot((int) '4');
        astRoot6.setCompilerData((java.lang.Object) astRoot11);
        java.lang.String str13 = astRoot11.debugPrint();
        int int14 = astRoot11.getFunctionCount();
        astRoot11.setInStrictMode(true);
        java.lang.String str18 = astRoot11.toSource(538062289);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = iRFactory5.transformTree(astRoot11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = scriptNode19.getRegexpFlags(189974018);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet1 = astRoot0.getComments();
        com.google.javascript.rhino.head.ast.Symbol symbol3 = astRoot0.getSymbol("                                                                                                                                                                                                        ");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str6 = scriptNode4.toSource((int) '4');
        com.google.javascript.rhino.head.Node node7 = scriptNode4.getFirstChild();
        java.lang.Object obj9 = scriptNode4.getProp(18);
        boolean boolean10 = scriptNode4.hasConsistentReturnUsage();
        java.lang.String str11 = astRoot0.toStringTree(scriptNode4);
        int int12 = astRoot0.getEncodedSourceEnd();
        astRoot0.setBounds(1384960853, (-405371752));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode17 = astRoot0.getFunctionNode(338455453);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = compilerEnvirons0.getErrorReporter();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean6 = compilerEnvirons0.isGeneratingSource();
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = iRFactory7.eof();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        boolean boolean3 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean8 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        boolean boolean11 = compilerEnvirons0.reportWarningAsError();
        com.google.javascript.rhino.head.Parser parser12 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setRecoverFromErrors(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean20 = compilerEnvirons19.isReservedKeywordAsIdentifier();
        int int21 = compilerEnvirons19.getLanguageVersion();
        compilerEnvirons19.setLanguageVersion((int) (byte) 100);
        boolean boolean24 = compilerEnvirons19.isXmlAvailable();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean26 = compilerEnvirons25.isReservedKeywordAsIdentifier();
        compilerEnvirons25.setStrictMode(true);
        compilerEnvirons25.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean32 = compilerEnvirons31.isReservedKeywordAsIdentifier();
        compilerEnvirons31.setStrictMode(true);
        compilerEnvirons31.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons37 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean38 = compilerEnvirons37.isReservedKeywordAsIdentifier();
        boolean boolean39 = compilerEnvirons37.getWarnTrailingComma();
        compilerEnvirons37.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet42 = compilerEnvirons37.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter43 = compilerEnvirons37.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory44 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons31, errorReporter43);
        com.google.javascript.rhino.head.IRFactory iRFactory45 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons25, errorReporter43);
        com.google.javascript.rhino.head.Parser parser46 = new com.google.javascript.rhino.head.Parser(compilerEnvirons19, errorReporter43);
        com.google.javascript.rhino.head.IRFactory iRFactory47 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean48 = iRFactory47.eof();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope(18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = scope1.getTop();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode4.removeProp(10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator8 = astRoot7.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor9 = astRoot7.iterator();
        scriptNode4.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot7);
        scope1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        java.lang.Object obj14 = scriptNode13.getCompilerData();
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator16 = scope15.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode17.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode18);
        scope15.setTop(scriptNode18);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode13, (com.google.javascript.rhino.head.ast.Scope) scriptNode18);
        java.lang.String str22 = scope1.toStringTree(scriptNode13);
        com.google.javascript.rhino.head.ast.Scope scope24 = scriptNode13.getDefiningScope("            {\n            }\n");
        com.google.javascript.rhino.head.Node node26 = scriptNode13.setType(8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = scriptNode13.getRegexpString(161);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean5 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        boolean boolean8 = compilerEnvirons0.isXmlAvailable();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean10 = compilerEnvirons9.isReservedKeywordAsIdentifier();
        boolean boolean11 = compilerEnvirons9.getWarnTrailingComma();
        boolean boolean12 = compilerEnvirons9.isRecordingComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = compilerEnvirons9.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser14 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter13);
        boolean boolean15 = compilerEnvirons0.isStrictMode();
        com.google.javascript.rhino.head.Parser parser16 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = parser16.eof();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = scriptNode1.getFunctionNode(161);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int2 = compilerEnvirons0.getLanguageVersion();
        boolean boolean3 = compilerEnvirons0.reportWarningAsError();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean5 = compilerEnvirons4.isReservedKeywordAsIdentifier();
        boolean boolean6 = compilerEnvirons4.getWarnTrailingComma();
        boolean boolean7 = compilerEnvirons4.isRecordingComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = compilerEnvirons4.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter8);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode11.removeProp(10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot14 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator15 = astRoot14.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor16 = astRoot14.iterator();
        scriptNode11.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot14);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory9.transformTree(astRoot14);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory9.parse("-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  LSH 2 0\n", "                                                                                                                                                                                                        ", 717018487);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode23.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode24);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList26 = scriptNode24.getChildScopes();
        int int27 = scriptNode24.getBaseLineno();
        int int28 = scriptNode24.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode29.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode30);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList32 = scriptNode30.getFunctions();
        scriptNode30.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope35 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode24.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode30, (com.google.javascript.rhino.head.Node) scope35);
        int int37 = scriptNode30.getEndLineno();
        int int38 = scriptNode30.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node39 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode30);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        java.lang.Object obj2 = scriptNode1.getCompilerData();
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator4 = scope3.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode6);
        scope3.setTop(scriptNode6);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode1, (com.google.javascript.rhino.head.ast.Scope) scriptNode6);
        int int12 = scriptNode1.getIntProp(9, 9);
        scriptNode1.setEncodedSourceBounds(481479666, (-87298254));
        int int16 = scriptNode1.getPosition();
        java.lang.String str17 = scriptNode1.getEncodedSource();
        scriptNode1.setRelative(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = scriptNode1.getRegexpString(1647296145);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray1 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList2 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList2, symbolArray1);
        scriptNode0.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList2);
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int6 = astRoot5.getParamCount();
        int int7 = astRoot5.getRegexpCount();
        scriptNode0.addChildToBack((com.google.javascript.rhino.head.Node) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator10 = astRoot9.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType13 = null;
        com.google.javascript.rhino.head.ast.Comment comment15 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType13, "");
        boolean boolean16 = comment15.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType19 = null;
        com.google.javascript.rhino.head.ast.Comment comment21 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType19, "");
        boolean boolean22 = comment21.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType25 = null;
        com.google.javascript.rhino.head.ast.Comment comment27 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType25, "");
        java.lang.String str29 = comment27.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray30 = new com.google.javascript.rhino.head.ast.Comment[] { comment15, comment21, comment27 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet31 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet31, commentArray30);
        astRoot9.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet31);
        boolean boolean34 = astRoot9.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray35 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList36 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList36, symbolArray35);
        astRoot9.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList36);
        com.google.javascript.rhino.head.Node node39 = astRoot9.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode40.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode41);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot9, (com.google.javascript.rhino.head.ast.Scope) scriptNode41);
        int int44 = astRoot9.depth();
        com.google.javascript.rhino.head.ast.Comment comment45 = astRoot9.getJsDocNode();
        astRoot5.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot9);
        com.google.javascript.rhino.head.ast.Comment comment47 = astRoot9.getJsDocNode();
        java.lang.String str48 = astRoot9.toSource();
        com.google.javascript.rhino.head.ast.AstRoot astRoot49 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator50 = astRoot49.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType53 = null;
        com.google.javascript.rhino.head.ast.Comment comment55 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType53, "");
        boolean boolean56 = comment55.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType59 = null;
        com.google.javascript.rhino.head.ast.Comment comment61 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType59, "");
        boolean boolean62 = comment61.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType65 = null;
        com.google.javascript.rhino.head.ast.Comment comment67 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType65, "");
        java.lang.String str69 = comment67.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray70 = new com.google.javascript.rhino.head.ast.Comment[] { comment55, comment61, comment67 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet71 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet71, commentArray70);
        astRoot49.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet71);
        boolean boolean74 = astRoot49.isInStrictMode();
        com.google.javascript.rhino.head.ast.AstNode astNode75 = astRoot49.getParent();
        java.lang.String str76 = astRoot49.debugPrint();
        int int77 = astRoot49.getFunctionCount();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet78 = astRoot49.getComments();
        astRoot9.setComments(commentSet78);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on commentSet71, commentSet78, and commentSet31.", !(commentSet71.equals(commentSet78) && commentSet78.equals(commentSet31)) || commentSet71.equals(commentSet31));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.putIntProp((int) (short) 1, 1);
        scriptNode0.setEncodedSource("typeof");
        com.google.javascript.rhino.head.Node node6 = scriptNode0.getLastChild();
        scriptNode0.setBaseLineno(13);
        scriptNode0.setLength(23);
        scriptNode0.setPosition((-213029975));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = scriptNode0.getRegexpFlags(603173706);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        int int5 = scriptNode1.getParamCount();
        scriptNode1.flattenSymbolTable(true);
        com.google.javascript.rhino.head.ast.AstNode astNode8 = scriptNode1.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = scriptNode1.getRegexpString(692787021);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compilerEnvirons0.getErrorReporter();
        java.lang.String[] strArray12 = new java.lang.String[] { "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n", "                                ", "typeof", "                                                                                                                                                                                                        ", "{\n}\n" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet13);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean17 = compilerEnvirons16.isReservedKeywordAsIdentifier();
        boolean boolean18 = compilerEnvirons16.isIdeMode();
        compilerEnvirons16.setRecordingLocalJsDocComments(false);
        boolean boolean21 = compilerEnvirons16.isGenerateDebugInfo();
        compilerEnvirons16.setRecordingLocalJsDocComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean25 = compilerEnvirons24.isReservedKeywordAsIdentifier();
        boolean boolean26 = compilerEnvirons24.getWarnTrailingComma();
        boolean boolean27 = compilerEnvirons24.isRecordingComments();
        boolean boolean28 = compilerEnvirons24.getWarnTrailingComma();
        boolean boolean29 = compilerEnvirons24.isRecordingLocalJsDocComments();
        boolean boolean30 = compilerEnvirons24.isIdeMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray37 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        compilerEnvirons31.setActivationNames((java.util.Set<java.lang.String>) strSet38);
        compilerEnvirons24.setActivationNames((java.util.Set<java.lang.String>) strSet38);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet38);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet38);
        compilerEnvirons0.setAllowSharpComments(true);
        com.google.javascript.rhino.head.IRFactory iRFactory46 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean47 = iRFactory46.eof();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = scriptNode1.getRegexpFlags(1683826323);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot(2);
        boolean boolean2 = astRoot1.isInStrictMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = astRoot1.getRegexpFlags(933351434);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator1 = astRoot0.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType4, "");
        boolean boolean7 = comment6.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType10 = null;
        com.google.javascript.rhino.head.ast.Comment comment12 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType10, "");
        boolean boolean13 = comment12.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType16 = null;
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType16, "");
        java.lang.String str20 = comment18.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray21 = new com.google.javascript.rhino.head.ast.Comment[] { comment6, comment12, comment18 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet22 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet22, commentArray21);
        astRoot0.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet22);
        boolean boolean25 = astRoot0.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray26 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList27 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList27, symbolArray26);
        astRoot0.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList27);
        int int30 = astRoot0.getBaseLineno();
        com.google.javascript.rhino.head.ast.Comment comment31 = astRoot0.getJsDocNode();
        astRoot0.setBaseLineno((int) '4');
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator35 = astRoot34.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType38 = null;
        com.google.javascript.rhino.head.ast.Comment comment40 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType38, "");
        boolean boolean41 = comment40.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType44 = null;
        com.google.javascript.rhino.head.ast.Comment comment46 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType44, "");
        boolean boolean47 = comment46.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType50 = null;
        com.google.javascript.rhino.head.ast.Comment comment52 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType50, "");
        java.lang.String str54 = comment52.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray55 = new com.google.javascript.rhino.head.ast.Comment[] { comment40, comment46, comment52 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet56 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet56, commentArray55);
        astRoot34.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet56);
        boolean boolean59 = astRoot34.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray60 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList61 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList61, symbolArray60);
        astRoot34.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList61);
        int int64 = astRoot34.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode65 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode65.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode66);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList68 = scriptNode66.getChildScopes();
        int int69 = scriptNode66.getBaseLineno();
        com.google.javascript.rhino.head.Node node70 = scriptNode66.getLastSibling();
        scriptNode66.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode73 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode74 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode73.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode74);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList76 = scriptNode74.getFunctions();
        scriptNode74.setPosition((int) (byte) 10);
        java.lang.String str79 = scriptNode66.toStringTree(scriptNode74);
        int int80 = scriptNode66.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot34, (com.google.javascript.rhino.head.ast.Scope) scriptNode66);
        astRoot0.setParentScope((com.google.javascript.rhino.head.ast.Scope) astRoot34);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet83 = astRoot0.getComments();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on commentSet22, commentSet83, and commentSet56.", !(commentSet22.equals(commentSet83) && commentSet83.equals(commentSet56)) || commentSet22.equals(commentSet56));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getBaseLineno();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons2.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean6 = compilerEnvirons5.isReservedKeywordAsIdentifier();
        boolean boolean7 = compilerEnvirons5.getWarnTrailingComma();
        compilerEnvirons5.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet10 = compilerEnvirons5.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = compilerEnvirons5.getErrorReporter();
        java.lang.String[] strArray17 = new java.lang.String[] { "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n", "                                ", "typeof", "                                                                                                                                                                                                        ", "{\n}\n" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = compilerEnvirons5.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser22 = new com.google.javascript.rhino.head.Parser(compilerEnvirons2, errorReporter21);
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = parser22.parse("          hi!", "hi!", 2);
        astRoot0.setTop((com.google.javascript.rhino.head.ast.ScriptNode) astRoot26);
        java.lang.String str29 = astRoot0.toSource(149284087);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode31 = astRoot0.getFunctionNode((-992112407));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList3 = scriptNode1.getFunctions();
        scriptNode1.setEncodedSourceStart((int) 'a');
        java.lang.String str7 = scriptNode1.makeIndent((int) (byte) -1);
        boolean boolean8 = scriptNode1.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = scriptNode1.getFunctionNode(604841955);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator1 = astRoot0.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType4, "");
        boolean boolean7 = comment6.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType10 = null;
        com.google.javascript.rhino.head.ast.Comment comment12 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType10, "");
        boolean boolean13 = comment12.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType16 = null;
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType16, "");
        java.lang.String str20 = comment18.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray21 = new com.google.javascript.rhino.head.ast.Comment[] { comment6, comment12, comment18 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet22 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet22, commentArray21);
        astRoot0.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet22);
        boolean boolean25 = astRoot0.isInStrictMode();
        com.google.javascript.rhino.head.ast.AstNode astNode26 = astRoot0.getParent();
        java.lang.String str27 = astRoot0.debugPrint();
        int int28 = astRoot0.getEncodedSourceStart();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet29 = astRoot0.getComments();
        astRoot0.checkParentLinks();
        astRoot0.setEndLineno(842975161);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode34.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode35);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList37 = scriptNode35.getChildScopes();
        int int38 = scriptNode35.getBaseLineno();
        int int39 = scriptNode35.getParamCount();
        scriptNode35.flattenSymbolTable(true);
        com.google.javascript.rhino.head.ast.Scope scope42 = scriptNode35.getEnclosingScope();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode43 = scriptNode35.getEnclosingFunction();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList44 = scriptNode35.getFunctions();
        com.google.javascript.rhino.head.ast.Scope scope45 = scriptNode35.getEnclosingScope();
        astRoot0.putProp((-527128964), (java.lang.Object) scriptNode35);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor47 = scriptNode35.iterator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot49 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator50 = astRoot49.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType53 = null;
        com.google.javascript.rhino.head.ast.Comment comment55 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType53, "");
        boolean boolean56 = comment55.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType59 = null;
        com.google.javascript.rhino.head.ast.Comment comment61 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType59, "");
        boolean boolean62 = comment61.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType65 = null;
        com.google.javascript.rhino.head.ast.Comment comment67 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType65, "");
        java.lang.String str69 = comment67.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray70 = new com.google.javascript.rhino.head.ast.Comment[] { comment55, comment61, comment67 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet71 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet71, commentArray70);
        astRoot49.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet71);
        boolean boolean74 = astRoot49.isInStrictMode();
        int int75 = astRoot49.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot76 = new com.google.javascript.rhino.head.ast.AstRoot();
        boolean boolean77 = astRoot76.hasSideEffects();
        astRoot49.target = astRoot76;
        java.lang.String str79 = astRoot76.getSourceName();
        com.google.javascript.rhino.head.Node node81 = new com.google.javascript.rhino.head.Node((-405371752), (com.google.javascript.rhino.head.Node) astRoot76, (int) (byte) 1);
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node(1891424362);
        astRoot76.target = node83;
        scriptNode35.setParent((com.google.javascript.rhino.head.ast.AstNode) astRoot76);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on commentSet29 and commentSet71.", commentSet29.equals(commentSet71) == commentSet71.equals(commentSet29));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet1 = astRoot0.getComments();
        java.lang.String str2 = astRoot0.getSourceName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = astRoot0.getRegexpFlags((-2));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getParamCount();
        java.lang.String str2 = astRoot0.getNextTempName();
        astRoot0.setLength(875237497);
        java.lang.String str5 = astRoot0.debugPrint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = astRoot0.getFunctionNode((-1728226312));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode0.toSource((int) '4');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode3.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode4);
        int int6 = scriptNode3.getEndLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode0, (com.google.javascript.rhino.head.ast.Scope) scriptNode3);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str10 = scriptNode8.toSource((int) '4');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode11.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode12);
        int int14 = scriptNode11.getEndLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode8, (com.google.javascript.rhino.head.ast.Scope) scriptNode11);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode0, (com.google.javascript.rhino.head.ast.Scope) scriptNode11);
        java.lang.String str17 = scriptNode11.toSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = scriptNode11.getRegexpFlags((-34));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray1 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList2 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList2, symbolArray1);
        scriptNode0.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList2);
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int6 = astRoot5.getParamCount();
        int int7 = astRoot5.getRegexpCount();
        scriptNode0.addChildToBack((com.google.javascript.rhino.head.Node) astRoot5);
        int int9 = astRoot5.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode11.flattenSymbolTable(true);
        com.google.javascript.rhino.head.ast.Scope scope14 = scriptNode11.getEnclosingScope();
        java.lang.String str15 = scriptNode11.getEncodedSource();
        java.lang.String str16 = scriptNode11.getJsDoc();
        astRoot5.setParentScope((com.google.javascript.rhino.head.ast.Scope) scriptNode11);
        int int18 = scriptNode11.getPosition();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList19 = scriptNode11.getSymbols();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = scriptNode11.getFunctionNode((-1662832286));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot(14);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator2 = astRoot1.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = astRoot1.getRegexpString(1617059566);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        scriptNode1.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode8.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList11 = scriptNode9.getFunctions();
        scriptNode9.setPosition((int) (byte) 10);
        java.lang.String str14 = scriptNode1.toStringTree(scriptNode9);
        int int15 = scriptNode1.getBaseLineno();
        scriptNode1.removeProp((int) (byte) -1);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean19 = compilerEnvirons18.isReservedKeywordAsIdentifier();
        boolean boolean20 = compilerEnvirons18.getWarnTrailingComma();
        compilerEnvirons18.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet23 = compilerEnvirons18.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = compilerEnvirons18.getErrorReporter();
        java.lang.String[] strArray30 = new java.lang.String[] { "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n", "                                ", "typeof", "                                                                                                                                                                                                        ", "{\n}\n" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        compilerEnvirons18.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        boolean boolean34 = compilerEnvirons18.isGenerateDebugInfo();
        boolean boolean35 = compilerEnvirons18.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons36 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean37 = compilerEnvirons36.isReservedKeywordAsIdentifier();
        int int38 = compilerEnvirons36.getLanguageVersion();
        int int39 = compilerEnvirons36.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons40 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean41 = compilerEnvirons40.isReservedKeywordAsIdentifier();
        compilerEnvirons40.setStrictMode(true);
        compilerEnvirons40.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons46 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean47 = compilerEnvirons46.isReservedKeywordAsIdentifier();
        boolean boolean48 = compilerEnvirons46.getWarnTrailingComma();
        compilerEnvirons46.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet51 = compilerEnvirons46.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter52 = compilerEnvirons46.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory53 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons40, errorReporter52);
        com.google.javascript.rhino.head.IRFactory iRFactory54 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons36, errorReporter52);
        com.google.javascript.rhino.head.IRFactory iRFactory55 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons18, errorReporter52);
        com.google.javascript.rhino.head.ast.AstRoot astRoot59 = iRFactory55.parse("0\tSCRIPT 0 1\n", "                                ", 13);
        astRoot59.setPosition(0);
        java.lang.String str63 = astRoot59.toSource(1);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList64 = astRoot59.getSymbols();
        scriptNode1.setSymbols(symbolList64);
        com.google.javascript.rhino.head.Node node67 = com.google.javascript.rhino.head.Node.newString("  ");
        com.google.javascript.rhino.head.Node node69 = com.google.javascript.rhino.head.Node.newString("AstRoot");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode1.replaceChildAfter(node67, node69);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean13 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean15 = compilerEnvirons14.isReservedKeywordAsIdentifier();
        compilerEnvirons14.setStrictMode(true);
        compilerEnvirons14.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean21 = compilerEnvirons20.isReservedKeywordAsIdentifier();
        compilerEnvirons20.setStrictMode(true);
        compilerEnvirons20.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean27 = compilerEnvirons26.isReservedKeywordAsIdentifier();
        boolean boolean28 = compilerEnvirons26.getWarnTrailingComma();
        compilerEnvirons26.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet31 = compilerEnvirons26.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = compilerEnvirons26.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons20, errorReporter32);
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons14, errorReporter32);
        compilerEnvirons14.setLanguageVersion(0);
        compilerEnvirons14.setAllowMemberExprAsFunctionName(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons39 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean40 = compilerEnvirons39.isReservedKeywordAsIdentifier();
        boolean boolean41 = compilerEnvirons39.isIdeMode();
        boolean boolean42 = compilerEnvirons39.getWarnTrailingComma();
        compilerEnvirons39.setAllowMemberExprAsFunctionName(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons45 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean46 = compilerEnvirons45.isReservedKeywordAsIdentifier();
        int int47 = compilerEnvirons45.getLanguageVersion();
        int int48 = compilerEnvirons45.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons49 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean50 = compilerEnvirons49.isReservedKeywordAsIdentifier();
        compilerEnvirons49.setStrictMode(true);
        compilerEnvirons49.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons55 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean56 = compilerEnvirons55.isReservedKeywordAsIdentifier();
        boolean boolean57 = compilerEnvirons55.getWarnTrailingComma();
        compilerEnvirons55.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet60 = compilerEnvirons55.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter61 = compilerEnvirons55.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory62 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons49, errorReporter61);
        com.google.javascript.rhino.head.IRFactory iRFactory63 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons45, errorReporter61);
        com.google.javascript.rhino.head.IRFactory iRFactory64 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons39, errorReporter61);
        compilerEnvirons14.setErrorReporter(errorReporter61);
        com.google.javascript.rhino.head.Parser parser66 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean67 = parser66.eof();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int2 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setLanguageVersion((int) (byte) 100);
        boolean boolean5 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean10 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean11 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        com.google.javascript.rhino.head.Parser parser12 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = parser12.eof();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator1 = astRoot0.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType4, "");
        boolean boolean7 = comment6.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType10 = null;
        com.google.javascript.rhino.head.ast.Comment comment12 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType10, "");
        boolean boolean13 = comment12.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType16 = null;
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType16, "");
        java.lang.String str20 = comment18.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray21 = new com.google.javascript.rhino.head.ast.Comment[] { comment6, comment12, comment18 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet22 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet22, commentArray21);
        astRoot0.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet22);
        boolean boolean25 = astRoot0.isInStrictMode();
        com.google.javascript.rhino.head.ast.AstNode astNode26 = astRoot0.getParent();
        java.lang.String str27 = astRoot0.debugPrint();
        int int28 = astRoot0.getEncodedSourceStart();
        java.lang.String str29 = astRoot0.getNextTempName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode31.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode32);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList34 = scriptNode32.getChildScopes();
        int int35 = scriptNode32.getBaseLineno();
        com.google.javascript.rhino.head.Node node36 = scriptNode32.getLastSibling();
        int int37 = scriptNode32.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope40 = new com.google.javascript.rhino.head.ast.Scope(5, (int) '#');
        com.google.javascript.rhino.head.ast.AstRoot astRoot41 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator42 = astRoot41.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType45 = null;
        com.google.javascript.rhino.head.ast.Comment comment47 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType45, "");
        boolean boolean48 = comment47.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType51 = null;
        com.google.javascript.rhino.head.ast.Comment comment53 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType51, "");
        boolean boolean54 = comment53.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType57 = null;
        com.google.javascript.rhino.head.ast.Comment comment59 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType57, "");
        java.lang.String str61 = comment59.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray62 = new com.google.javascript.rhino.head.ast.Comment[] { comment47, comment53, comment59 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet63 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet63, commentArray62);
        astRoot41.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet63);
        boolean boolean66 = astRoot41.isInStrictMode();
        com.google.javascript.rhino.head.ast.AstNode astNode67 = astRoot41.getParent();
        astRoot41.setEndLineno((int) (short) 0);
        com.google.javascript.rhino.head.Node node71 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode32, (com.google.javascript.rhino.head.Node) scope40, (com.google.javascript.rhino.head.Node) astRoot41, 6);
        astRoot41.setInStrictMode(true);
        int int74 = astRoot41.getParamCount();
        astRoot41.setInStrictMode(true);
        java.lang.String str78 = astRoot41.toSource(6);
        int int79 = astRoot41.getFunctionCount();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet80 = astRoot41.getComments();
        astRoot0.setComments(commentSet80);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on commentSet63, commentSet80, and commentSet22.", !(commentSet63.equals(commentSet80) && commentSet80.equals(commentSet22)) || commentSet63.equals(commentSet22));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setOptimizationLevel((int) (short) 1);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean15 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = compilerEnvirons0.getErrorReporter();
        int int17 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setIdeMode(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean25 = compilerEnvirons24.isReservedKeywordAsIdentifier();
        boolean boolean26 = compilerEnvirons24.isIdeMode();
        boolean boolean27 = compilerEnvirons24.getWarnTrailingComma();
        compilerEnvirons24.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons24.setAllowSharpComments(true);
        boolean boolean32 = compilerEnvirons24.isRecordingLocalJsDocComments();
        compilerEnvirons24.setAllowMemberExprAsFunctionName(true);
        int int35 = compilerEnvirons24.getOptimizationLevel();
        boolean boolean36 = compilerEnvirons24.isGeneratingSource();
        compilerEnvirons24.setStrictMode(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons39 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean40 = compilerEnvirons39.isReservedKeywordAsIdentifier();
        boolean boolean41 = compilerEnvirons39.getWarnTrailingComma();
        compilerEnvirons39.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet44 = compilerEnvirons39.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter45 = compilerEnvirons39.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser46 = new com.google.javascript.rhino.head.Parser(compilerEnvirons24, errorReporter45);
        com.google.javascript.rhino.head.Parser parser47 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean48 = parser47.eof();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        com.google.javascript.rhino.head.ast.Scope scope0 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator1 = scope0.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode2.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode3);
        scope0.setTop(scriptNode3);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor6 = scope0.iterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode7.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode8);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList10 = scriptNode8.getChildScopes();
        int int11 = scriptNode8.getBaseLineno();
        com.google.javascript.rhino.head.Node node12 = scriptNode8.getLastSibling();
        int int13 = scriptNode8.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator14 = scriptNode8.new NodeIterator();
        java.lang.Object obj15 = scriptNode8.getCompilerData();
        scope0.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode8);
        java.lang.String str17 = scriptNode8.getSourceName();
        scriptNode8.setEncodedSourceEnd((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = scriptNode8.getRegexpString(0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compilerEnvirons0.getErrorReporter();
        boolean boolean7 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean8 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setOptimizationLevel((int) (short) 0);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean12 = compilerEnvirons11.isReservedKeywordAsIdentifier();
        boolean boolean13 = compilerEnvirons11.getWarnTrailingComma();
        compilerEnvirons11.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet16 = compilerEnvirons11.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = compilerEnvirons11.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter17);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode19.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode20);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode20.getChildScopes();
        int int23 = scriptNode20.getBaseLineno();
        com.google.javascript.rhino.head.Node node24 = scriptNode20.getLastSibling();
        int int25 = scriptNode20.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator26 = scriptNode20.new NodeIterator();
        int int27 = scriptNode20.getLineno();
        boolean boolean28 = scriptNode20.hasConsistentReturnUsage();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList29 = scriptNode20.getFunctions();
        com.google.javascript.rhino.head.Node node30 = iRFactory18.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean31 = iRFactory18.eof();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(1152923454);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode2.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode3);
        scriptNode3.setEncodedSourceEnd((-505759099));
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int8 = astRoot7.getParamCount();
        java.lang.String str9 = astRoot7.getJsDoc();
        java.lang.String str10 = astRoot7.getNextTempName();
        scriptNode3.setParentScope((com.google.javascript.rhino.head.ast.Scope) astRoot7);
        astRoot7.setInStrictMode(false);
        astRoot7.setEncodedSourceBounds((-777163487), 97);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode17.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode18);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList20 = scriptNode17.getStatements();
        scriptNode17.setLineno((-777447127));
        int int23 = scriptNode17.getEncodedSourceStart();
        java.lang.String str24 = astRoot7.toStringTree(scriptNode17);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode25.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode26);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList28 = scriptNode26.getChildScopes();
        int int29 = scriptNode26.getBaseLineno();
        com.google.javascript.rhino.head.Node node30 = scriptNode26.getLastSibling();
        int int31 = scriptNode26.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator32 = scriptNode26.new NodeIterator();
        int int33 = scriptNode26.getLineno();
        scriptNode26.clearParentScope();
        int int35 = scriptNode26.depth();
        scriptNode26.setRelative(626782571);
        int int38 = scriptNode26.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode1.replaceChildAfter((com.google.javascript.rhino.head.Node) astRoot7, (com.google.javascript.rhino.head.Node) scriptNode26);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray1 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList2 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList2, symbolArray1);
        scriptNode0.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList2);
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int6 = astRoot5.getParamCount();
        int int7 = astRoot5.getRegexpCount();
        scriptNode0.addChildToBack((com.google.javascript.rhino.head.Node) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = astRoot5.getAstRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = astRoot9.getFunctionNode(21);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int4 = astRoot3.getBaseLineno();
        java.lang.String str5 = astRoot3.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = astRoot6.new NodeIterator();
        int int8 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot3, (com.google.javascript.rhino.head.ast.AstNode) astRoot6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode9.putIntProp((int) (short) 1, 1);
        java.lang.String str13 = scriptNode9.getEncodedSource();
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator15 = scope14.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode16.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        scope14.setTop(scriptNode17);
        scope14.setLineno((int) (short) -1);
        int int22 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode9, (com.google.javascript.rhino.head.ast.AstNode) scope14);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode23.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode24);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList26 = scriptNode24.getChildScopes();
        int int27 = scriptNode24.getBaseLineno();
        int int28 = scriptNode24.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode29.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode30);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList32 = scriptNode30.getFunctions();
        scriptNode30.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope35 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode24.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode30, (com.google.javascript.rhino.head.Node) scope35);
        scriptNode30.setEncodedSource("-1\tSCRIPT -1 1\n");
        java.lang.String str39 = scriptNode9.toStringTree(scriptNode30);
        scriptNode30.putIntProp(13, (-607685701));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator44 = scriptNode43.spliterator();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator45 = scriptNode43.new NodeIterator();
        int int46 = scriptNode43.getBaseLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node47 = scriptNode30.getChildBefore((com.google.javascript.rhino.head.Node) scriptNode43);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        scriptNode1.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap7 = scriptNode6.getSymbolTable();
        scriptNode1.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode6);
        int int9 = scriptNode6.getParamCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = scriptNode6.getRegexpFlags((-301300370));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode2);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList4 = scriptNode2.getChildScopes();
        int int5 = scriptNode2.getBaseLineno();
        int int6 = scriptNode2.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode7.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode8);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList10 = scriptNode8.getFunctions();
        scriptNode8.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope13 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode2.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode8, (com.google.javascript.rhino.head.Node) scope13);
        int int15 = scriptNode8.getEndLineno();
        scriptNode8.setEncodedSource("hi!");
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node(18, (com.google.javascript.rhino.head.Node) scriptNode8, (int) (byte) 0);
        boolean boolean20 = scriptNode8.hasSideEffects();
        boolean boolean21 = scriptNode8.hasSideEffects();
        scriptNode8.flattenSymbolTable(false);
        int int24 = scriptNode8.getLineno();
        scriptNode8.setEncodedSourceStart((-1396314680));
        int int27 = scriptNode8.depth();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = scriptNode8.getRegexpString(104131204);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int2 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setLanguageVersion((int) (byte) 100);
        boolean boolean5 = compilerEnvirons0.isGenerateObserverCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList9 = scriptNode7.getChildScopes();
        int int10 = scriptNode7.getBaseLineno();
        com.google.javascript.rhino.head.Node node11 = scriptNode7.getLastSibling();
        int int12 = scriptNode7.getLineno();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor13 = scriptNode7.iterator();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean15 = compilerEnvirons14.isReservedKeywordAsIdentifier();
        boolean boolean16 = compilerEnvirons14.isIdeMode();
        int int17 = compilerEnvirons14.getOptimizationLevel();
        scriptNode7.setCompilerData((java.lang.Object) compilerEnvirons14);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean20 = compilerEnvirons19.isReservedKeywordAsIdentifier();
        boolean boolean21 = compilerEnvirons19.isIdeMode();
        compilerEnvirons19.setRecordingLocalJsDocComments(false);
        boolean boolean24 = compilerEnvirons19.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean26 = compilerEnvirons25.isReservedKeywordAsIdentifier();
        int int27 = compilerEnvirons25.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean29 = compilerEnvirons28.isReservedKeywordAsIdentifier();
        boolean boolean30 = compilerEnvirons28.isIdeMode();
        compilerEnvirons28.setRecordingLocalJsDocComments(false);
        boolean boolean33 = compilerEnvirons28.isGenerateDebugInfo();
        compilerEnvirons28.setRecordingLocalJsDocComments(true);
        boolean boolean36 = compilerEnvirons28.isXmlAvailable();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons37 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean38 = compilerEnvirons37.isReservedKeywordAsIdentifier();
        boolean boolean39 = compilerEnvirons37.getWarnTrailingComma();
        boolean boolean40 = compilerEnvirons37.isRecordingComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter41 = compilerEnvirons37.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser42 = new com.google.javascript.rhino.head.Parser(compilerEnvirons28, errorReporter41);
        compilerEnvirons25.setErrorReporter(errorReporter41);
        compilerEnvirons19.setErrorReporter(errorReporter41);
        compilerEnvirons14.setErrorReporter(errorReporter41);
        com.google.javascript.rhino.head.Parser parser46 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean47 = parser46.eof();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet1 = astRoot0.getComments();
        int int2 = astRoot0.getEndLineno();
        com.google.javascript.rhino.head.Node node4 = astRoot0.setType((int) (short) 10);
        astRoot0.putIntProp(24, (int) 'a');
        java.lang.String str8 = astRoot0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = astRoot0.getFunctionNode(1076412275);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setXmlAvailable(true);
        compilerEnvirons0.setXmlAvailable(true);
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("-1\tSCRIPT -1 1\n", "129", 20);
        astRoot12.flattenSymbolTable(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = astRoot12.getFunctionNode(908241034);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        boolean boolean3 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean10 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons11.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean15 = compilerEnvirons14.isReservedKeywordAsIdentifier();
        boolean boolean16 = compilerEnvirons14.getWarnTrailingComma();
        compilerEnvirons14.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet19 = compilerEnvirons14.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter20 = compilerEnvirons14.getErrorReporter();
        java.lang.String[] strArray26 = new java.lang.String[] { "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n", "                                ", "typeof", "                                                                                                                                                                                                        ", "{\n}\n" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        compilerEnvirons14.setActivationNames((java.util.Set<java.lang.String>) strSet27);
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = compilerEnvirons14.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser31 = new com.google.javascript.rhino.head.Parser(compilerEnvirons11, errorReporter30);
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean33 = iRFactory32.eof();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        int int6 = scriptNode1.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.Scope scope8 = new com.google.javascript.rhino.head.ast.Scope(16);
        scriptNode1.addChildToBack((com.google.javascript.rhino.head.Node) scope8);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator10 = scope8.new NodeIterator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet12 = astRoot11.getComments();
        java.lang.String str13 = astRoot11.getSourceName();
        boolean boolean14 = astRoot11.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode15.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode16);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList18 = scriptNode16.getChildScopes();
        int int19 = scriptNode16.getBaseLineno();
        com.google.javascript.rhino.head.Node node20 = scriptNode16.getLastSibling();
        scriptNode16.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode23.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode24);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList26 = scriptNode24.getFunctions();
        scriptNode24.setPosition((int) (byte) 10);
        java.lang.String str29 = scriptNode16.toStringTree(scriptNode24);
        int int30 = scriptNode16.getBaseLineno();
        boolean boolean31 = scriptNode16.hasConsistentReturnUsage();
        astRoot11.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode16);
        astRoot11.setBaseLineno(14);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet35 = astRoot11.getComments();
        astRoot11.clearParentScope();
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newString(0, "typeof");
        astRoot11.target = node39;
        astRoot11.setInStrictMode(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scope8.removeChild((com.google.javascript.rhino.head.Node) astRoot11);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        int int6 = scriptNode1.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = scriptNode1.new NodeIterator();
        int int8 = scriptNode1.getLineno();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = new com.google.javascript.rhino.head.ast.AstRoot(365503559);
        java.lang.String str11 = scriptNode1.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) astRoot10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = astRoot10.getRegexpFlags((-476424842));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator1 = astRoot0.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType4, "");
        boolean boolean7 = comment6.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType10 = null;
        com.google.javascript.rhino.head.ast.Comment comment12 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType10, "");
        boolean boolean13 = comment12.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType16 = null;
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType16, "");
        java.lang.String str20 = comment18.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray21 = new com.google.javascript.rhino.head.ast.Comment[] { comment6, comment12, comment18 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet22 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet22, commentArray21);
        astRoot0.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet22);
        boolean boolean25 = astRoot0.isInStrictMode();
        com.google.javascript.rhino.head.Token.CommentType commentType28 = null;
        com.google.javascript.rhino.head.ast.Comment comment30 = new com.google.javascript.rhino.head.ast.Comment((int) '#', 2, commentType28, "hi!");
        astRoot0.addComment(comment30);
        astRoot0.setEncodedSource("typeof");
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet35 = astRoot34.getComments();
        int int36 = astRoot34.getEndLineno();
        com.google.javascript.rhino.head.Node node38 = astRoot34.setType((int) (short) 10);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot0, (com.google.javascript.rhino.head.ast.Scope) astRoot34);
        astRoot0.setBaseLineno((int) (byte) 0);
        int int42 = astRoot0.getEndLineno();
        com.google.javascript.rhino.head.ast.AstRoot astRoot43 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator44 = astRoot43.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType47 = null;
        com.google.javascript.rhino.head.ast.Comment comment49 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType47, "");
        boolean boolean50 = comment49.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType53 = null;
        com.google.javascript.rhino.head.ast.Comment comment55 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType53, "");
        boolean boolean56 = comment55.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType59 = null;
        com.google.javascript.rhino.head.ast.Comment comment61 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType59, "");
        java.lang.String str63 = comment61.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray64 = new com.google.javascript.rhino.head.ast.Comment[] { comment49, comment55, comment61 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet65 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet65, commentArray64);
        astRoot43.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet65);
        boolean boolean68 = astRoot43.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray69 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList70 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList70, symbolArray69);
        astRoot43.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList70);
        int int73 = astRoot43.getLineno();
        com.google.javascript.rhino.head.ast.Comment comment74 = astRoot43.getJsDocNode();
        com.google.javascript.rhino.head.ast.Symbol symbol76 = astRoot43.getSymbol("                                  hi!");
        int int77 = astRoot43.getParamCount();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet78 = astRoot43.getComments();
        astRoot0.setComments(commentSet78);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on commentSet65, commentSet78, and commentSet22.", !(commentSet65.equals(commentSet78) && commentSet78.equals(commentSet22)) || commentSet65.equals(commentSet22));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        com.google.javascript.rhino.head.ast.Scope scope0 = new com.google.javascript.rhino.head.ast.Scope();
        int int3 = scope0.getIntProp(16, 22);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode(527308207);
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet7 = astRoot6.getComments();
        java.lang.String str8 = astRoot6.getSourceName();
        boolean boolean9 = astRoot6.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode10.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode11);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode11.getChildScopes();
        int int14 = scriptNode11.getBaseLineno();
        com.google.javascript.rhino.head.Node node15 = scriptNode11.getLastSibling();
        scriptNode11.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode18.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode19);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList21 = scriptNode19.getFunctions();
        scriptNode19.setPosition((int) (byte) 10);
        java.lang.String str24 = scriptNode11.toStringTree(scriptNode19);
        int int25 = scriptNode11.getBaseLineno();
        boolean boolean26 = scriptNode11.hasConsistentReturnUsage();
        astRoot6.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode11);
        com.google.javascript.rhino.head.Node node29 = astRoot6.setType((int) (short) 1);
        com.google.javascript.rhino.head.Node node30 = node29.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scope0.replaceChildAfter((com.google.javascript.rhino.head.Node) scriptNode5, node30);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int4 = astRoot3.getBaseLineno();
        java.lang.String str5 = astRoot3.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = astRoot6.new NodeIterator();
        int int8 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot3, (com.google.javascript.rhino.head.ast.AstNode) astRoot6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator10 = scriptNode9.spliterator();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator11 = scriptNode9.new NodeIterator();
        astRoot6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        int int13 = astRoot6.getParamCount();
        astRoot6.clearParentScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = astRoot6.getRegexpString((-1020608546));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode4.removeProp(10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator8 = astRoot7.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor9 = astRoot7.iterator();
        scriptNode4.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot7);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode11.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode12);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList14 = scriptNode12.getChildScopes();
        int int15 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot7, (com.google.javascript.rhino.head.ast.AstNode) scriptNode12);
        com.google.javascript.rhino.head.Node node16 = astRoot7.getLastSibling();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor17 = astRoot7.iterator();
        astRoot7.setInStrictMode(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = astRoot7.getRegexpFlags(601078793);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compilerEnvirons0.getErrorReporter();
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setGeneratingSource(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean11 = compilerEnvirons10.isReservedKeywordAsIdentifier();
        int int12 = compilerEnvirons10.getLanguageVersion();
        int int13 = compilerEnvirons10.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean15 = compilerEnvirons14.isReservedKeywordAsIdentifier();
        compilerEnvirons14.setStrictMode(true);
        compilerEnvirons14.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean21 = compilerEnvirons20.isReservedKeywordAsIdentifier();
        boolean boolean22 = compilerEnvirons20.getWarnTrailingComma();
        compilerEnvirons20.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet25 = compilerEnvirons20.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = compilerEnvirons20.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons14, errorReporter26);
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter26);
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter26);
        java.util.Set<java.lang.String> strSet30 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean32 = compilerEnvirons31.isReservedKeywordAsIdentifier();
        boolean boolean33 = compilerEnvirons31.isReservedKeywordAsIdentifier();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean35 = compilerEnvirons34.isReservedKeywordAsIdentifier();
        int int36 = compilerEnvirons34.getLanguageVersion();
        boolean boolean37 = compilerEnvirons34.isGenerateObserverCount();
        com.google.javascript.rhino.head.Parser parser38 = new com.google.javascript.rhino.head.Parser(compilerEnvirons34);
        com.google.javascript.rhino.head.ErrorReporter errorReporter39 = compilerEnvirons34.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser40 = new com.google.javascript.rhino.head.Parser(compilerEnvirons31, errorReporter39);
        boolean boolean41 = compilerEnvirons31.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode42.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode43);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList45 = scriptNode43.getChildScopes();
        int int46 = scriptNode43.getBaseLineno();
        com.google.javascript.rhino.head.Node node47 = scriptNode43.getLastSibling();
        int int48 = scriptNode43.getLineno();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor49 = scriptNode43.iterator();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons50 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean51 = compilerEnvirons50.isReservedKeywordAsIdentifier();
        boolean boolean52 = compilerEnvirons50.isIdeMode();
        int int53 = compilerEnvirons50.getOptimizationLevel();
        scriptNode43.setCompilerData((java.lang.Object) compilerEnvirons50);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons55 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean56 = compilerEnvirons55.isReservedKeywordAsIdentifier();
        boolean boolean57 = compilerEnvirons55.getWarnTrailingComma();
        compilerEnvirons55.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet60 = compilerEnvirons55.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter61 = compilerEnvirons55.getErrorReporter();
        compilerEnvirons55.setReservedKeywordAsIdentifier(false);
        boolean boolean64 = compilerEnvirons55.isGeneratingSource();
        compilerEnvirons55.setGenerateDebugInfo(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons67 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean68 = compilerEnvirons67.isReservedKeywordAsIdentifier();
        boolean boolean69 = compilerEnvirons67.isReservedKeywordAsIdentifier();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons70 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean71 = compilerEnvirons70.isReservedKeywordAsIdentifier();
        int int72 = compilerEnvirons70.getLanguageVersion();
        boolean boolean73 = compilerEnvirons70.isGenerateObserverCount();
        com.google.javascript.rhino.head.Parser parser74 = new com.google.javascript.rhino.head.Parser(compilerEnvirons70);
        com.google.javascript.rhino.head.ErrorReporter errorReporter75 = compilerEnvirons70.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser76 = new com.google.javascript.rhino.head.Parser(compilerEnvirons67, errorReporter75);
        compilerEnvirons55.setErrorReporter(errorReporter75);
        com.google.javascript.rhino.head.IRFactory iRFactory78 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons50, errorReporter75);
        compilerEnvirons31.setErrorReporter(errorReporter75);
        com.google.javascript.rhino.head.Parser parser80 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean81 = parser80.eof();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet2 = astRoot1.getComments();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode3.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode4);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList6 = scriptNode4.getChildScopes();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator8 = scriptNode7.spliterator();
        com.google.javascript.rhino.head.Node node10 = scriptNode7.setType((int) '#');
        boolean boolean11 = scriptNode7.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(13, (com.google.javascript.rhino.head.Node) astRoot1, (com.google.javascript.rhino.head.Node) scriptNode4, (com.google.javascript.rhino.head.Node) scriptNode7);
        scriptNode7.clearParentScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode15 = scriptNode7.getFunctionNode((-1094142582));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList9 = scriptNode7.getChildScopes();
        java.lang.String str11 = scriptNode7.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scriptNode13);
        java.lang.Object obj16 = scriptNode7.getProp((int) (short) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str19 = scriptNode17.toSource((int) '4');
        java.lang.String str20 = scriptNode7.toStringTree(scriptNode17);
        boolean boolean21 = scriptNode7.hasChildren();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator22 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator23 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator24 = positionComparator22.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator23);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator25 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator26 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator27 = positionComparator25.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator26);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int29 = astRoot28.getBaseLineno();
        java.lang.String str30 = astRoot28.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator32 = astRoot31.new NodeIterator();
        int int33 = positionComparator26.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot28, (com.google.javascript.rhino.head.ast.AstNode) astRoot31);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator34 = positionComparator22.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator26);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode35.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode36);
        int int38 = scriptNode35.getEndLineno();
        com.google.javascript.rhino.head.ast.Scope scope39 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode35.setParentScope(scope39);
        scriptNode35.setLineno((int) '4');
        com.google.javascript.rhino.head.ast.AstRoot astRoot43 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator44 = astRoot43.new NodeIterator();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList45 = astRoot43.getStatements();
        int int46 = positionComparator22.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode35, (com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.Node node47 = scriptNode35.getLastChild();
        scriptNode35.setEncodedSourceEnd(850021394);
        scriptNode7.setParentScope((com.google.javascript.rhino.head.ast.Scope) scriptNode35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode52 = scriptNode35.getFunctionNode(100);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int2 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean7 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean8 = compilerEnvirons0.recoverFromErrors();
        boolean boolean9 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean11 = compilerEnvirons10.isReservedKeywordAsIdentifier();
        compilerEnvirons10.setStrictMode(true);
        compilerEnvirons10.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean17 = compilerEnvirons16.isReservedKeywordAsIdentifier();
        compilerEnvirons16.setStrictMode(true);
        compilerEnvirons16.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean23 = compilerEnvirons22.isReservedKeywordAsIdentifier();
        boolean boolean24 = compilerEnvirons22.getWarnTrailingComma();
        compilerEnvirons22.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet27 = compilerEnvirons22.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = compilerEnvirons22.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons16, errorReporter28);
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter28);
        com.google.javascript.rhino.head.ErrorReporter errorReporter31 = compilerEnvirons10.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean33 = iRFactory32.eof();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int4 = astRoot3.getBaseLineno();
        java.lang.String str5 = astRoot3.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = astRoot6.new NodeIterator();
        int int8 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot3, (com.google.javascript.rhino.head.ast.AstNode) astRoot6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator10 = scriptNode9.spliterator();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator11 = scriptNode9.new NodeIterator();
        astRoot6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        int int13 = scriptNode9.getRegexpCount();
        boolean boolean14 = scriptNode9.hasChildren();
        scriptNode9.flattenSymbolTable(true);
        scriptNode9.setRelative(1041503403);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = scriptNode9.getRegexpFlags((-306271829));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        int int6 = scriptNode1.getLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode7.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode8);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList10 = scriptNode8.getChildScopes();
        int int11 = scriptNode8.getBaseLineno();
        com.google.javascript.rhino.head.Node node12 = scriptNode8.getLastSibling();
        scriptNode8.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode15.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode16);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList18 = scriptNode16.getFunctions();
        scriptNode16.setPosition((int) (byte) 10);
        java.lang.String str21 = scriptNode8.toStringTree(scriptNode16);
        int int22 = scriptNode8.getBaseLineno();
        com.google.javascript.rhino.head.Node node24 = scriptNode8.setType((int) (byte) -1);
        scriptNode1.target = scriptNode8;
        java.lang.String str26 = scriptNode1.getEncodedSource();
        java.lang.Object obj28 = scriptNode1.getProp((-704784932));
        scriptNode1.setLength((-352107342));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = scriptNode1.getRegexpString((-1396314680));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.putIntProp((int) (short) 1, 1);
        java.lang.String str4 = scriptNode0.getEncodedSource();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator5 = scriptNode0.new NodeIterator();
        boolean boolean6 = scriptNode0.hasChildren();
        scriptNode0.setBounds((-933351410), 24);
        int int10 = scriptNode0.getLength();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = scriptNode0.getTop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = scriptNode0.getFunctionNode((-788482790));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setOptimizationLevel((int) (short) 1);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean15 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = compilerEnvirons0.getErrorReporter();
        int int17 = compilerEnvirons0.getLanguageVersion();
        com.google.javascript.rhino.head.Parser parser18 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        boolean boolean19 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setRecordingComments(true);
        boolean boolean22 = compilerEnvirons0.recoverFromErrors();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray29 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        compilerEnvirons23.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        boolean boolean33 = compilerEnvirons23.isGenerateDebugInfo();
        boolean boolean34 = compilerEnvirons23.isReservedKeywordAsIdentifier();
        compilerEnvirons23.setGenerateObserverCount(false);
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons23);
        java.util.Set<java.lang.String> strSet38 = compilerEnvirons23.getActivationNames();
        compilerEnvirons0.setActivationNames(strSet38);
        com.google.javascript.rhino.head.Parser parser40 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean41 = parser40.eof();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int2 = compilerEnvirons0.getLanguageVersion();
        boolean boolean3 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        com.google.javascript.rhino.head.Parser parser6 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = parser6.eof();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator2 = astRoot1.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType5 = null;
        com.google.javascript.rhino.head.ast.Comment comment7 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType5, "");
        boolean boolean8 = comment7.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType11 = null;
        com.google.javascript.rhino.head.ast.Comment comment13 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType11, "");
        boolean boolean14 = comment13.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType17 = null;
        com.google.javascript.rhino.head.ast.Comment comment19 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType17, "");
        java.lang.String str21 = comment19.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray22 = new com.google.javascript.rhino.head.ast.Comment[] { comment7, comment13, comment19 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet23 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet23, commentArray22);
        astRoot1.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet23);
        boolean boolean26 = astRoot1.isInStrictMode();
        int int27 = astRoot1.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = new com.google.javascript.rhino.head.ast.AstRoot();
        boolean boolean29 = astRoot28.hasSideEffects();
        astRoot1.target = astRoot28;
        java.lang.String str31 = astRoot28.getSourceName();
        astRoot28.putIntProp(11, 4);
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node(23, (com.google.javascript.rhino.head.Node) astRoot28, (-476424842));
        com.google.javascript.rhino.head.ast.AstRoot astRoot37 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator38 = astRoot37.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType41 = null;
        com.google.javascript.rhino.head.ast.Comment comment43 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType41, "");
        boolean boolean44 = comment43.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType47 = null;
        com.google.javascript.rhino.head.ast.Comment comment49 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType47, "");
        boolean boolean50 = comment49.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType53 = null;
        com.google.javascript.rhino.head.ast.Comment comment55 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType53, "");
        java.lang.String str57 = comment55.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray58 = new com.google.javascript.rhino.head.ast.Comment[] { comment43, comment49, comment55 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet59 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet59, commentArray58);
        astRoot37.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet59);
        boolean boolean62 = astRoot37.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray63 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList64 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList64, symbolArray63);
        astRoot37.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList64);
        int int67 = astRoot37.getEncodedSourceStart();
        astRoot37.setEncodedSourceStart(9);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode70 = astRoot37.getEnclosingFunction();
        int int71 = astRoot37.depth();
        int int72 = astRoot37.getFunctionCount();
        int int73 = astRoot37.getPosition();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet74 = astRoot37.getComments();
        astRoot28.setComments(commentSet74);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on commentSet59, commentSet74, and commentSet23.", !(commentSet59.equals(commentSet74) && commentSet74.equals(commentSet23)) || commentSet59.equals(commentSet23));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator1 = scriptNode0.spliterator();
        scriptNode0.setRelative((int) (byte) 100);
        int int4 = scriptNode0.getRegexpCount();
        int int5 = scriptNode0.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = scriptNode0.getTop();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node9 = scriptNode0.getChildBefore(node8);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean11 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean14 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean15 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean16 = compilerEnvirons0.recoverFromErrors();
        boolean boolean17 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean19 = compilerEnvirons18.isReservedKeywordAsIdentifier();
        boolean boolean20 = compilerEnvirons18.getWarnTrailingComma();
        boolean boolean21 = compilerEnvirons18.isRecordingComments();
        boolean boolean22 = compilerEnvirons18.getWarnTrailingComma();
        boolean boolean23 = compilerEnvirons18.isRecordingLocalJsDocComments();
        boolean boolean24 = compilerEnvirons18.isIdeMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray31 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        compilerEnvirons25.setActivationNames((java.util.Set<java.lang.String>) strSet32);
        compilerEnvirons18.setActivationNames((java.util.Set<java.lang.String>) strSet32);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons36 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons36.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons39 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean40 = compilerEnvirons39.isReservedKeywordAsIdentifier();
        boolean boolean41 = compilerEnvirons39.getWarnTrailingComma();
        compilerEnvirons39.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet44 = compilerEnvirons39.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter45 = compilerEnvirons39.getErrorReporter();
        java.lang.String[] strArray51 = new java.lang.String[] { "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n", "                                ", "typeof", "                                                                                                                                                                                                        ", "{\n}\n" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        compilerEnvirons39.setActivationNames((java.util.Set<java.lang.String>) strSet52);
        com.google.javascript.rhino.head.ErrorReporter errorReporter55 = compilerEnvirons39.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser56 = new com.google.javascript.rhino.head.Parser(compilerEnvirons36, errorReporter55);
        compilerEnvirons36.setRecordingComments(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter59 = compilerEnvirons36.getErrorReporter();
        compilerEnvirons18.setErrorReporter(errorReporter59);
        com.google.javascript.rhino.head.Parser parser61 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean62 = parser61.eof();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        boolean boolean3 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons6 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean7 = compilerEnvirons6.isReservedKeywordAsIdentifier();
        int int8 = compilerEnvirons6.getLanguageVersion();
        int int9 = compilerEnvirons6.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean11 = compilerEnvirons10.isReservedKeywordAsIdentifier();
        compilerEnvirons10.setStrictMode(true);
        compilerEnvirons10.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean17 = compilerEnvirons16.isReservedKeywordAsIdentifier();
        boolean boolean18 = compilerEnvirons16.getWarnTrailingComma();
        compilerEnvirons16.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet21 = compilerEnvirons16.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = compilerEnvirons16.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter22);
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons6, errorReporter22);
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter22);
        boolean boolean26 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean30 = compilerEnvirons29.isReservedKeywordAsIdentifier();
        boolean boolean31 = compilerEnvirons29.getWarnTrailingComma();
        compilerEnvirons29.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet34 = compilerEnvirons29.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter35 = compilerEnvirons29.getErrorReporter();
        compilerEnvirons29.setReservedKeywordAsIdentifier(false);
        int int38 = compilerEnvirons29.getOptimizationLevel();
        boolean boolean39 = compilerEnvirons29.isGenerateObserverCount();
        compilerEnvirons29.setRecordingLocalJsDocComments(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons42 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray48 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        compilerEnvirons42.setActivationNames((java.util.Set<java.lang.String>) strSet49);
        boolean boolean52 = compilerEnvirons42.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter53 = compilerEnvirons42.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser54 = new com.google.javascript.rhino.head.Parser(compilerEnvirons29, errorReporter53);
        com.google.javascript.rhino.head.Parser parser55 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean56 = parser55.eof();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(true);
        int int4 = compilerEnvirons0.getOptimizationLevel();
        java.lang.String[] strArray25 = new java.lang.String[] { "-1\tSCRIPT -1 1\n", "                    ", "35\t  COMMENT 36 2\n", "typeof", "$0", "                    ", "Comment", "                    {\n                    }\n", "35\t  COMMENT 36 2\n", "                      ", "                                                                                                        ", "136", "$0", "                    {\n                    }\n", "                                                                                                        ", "{\n}\n", "ScriptNode", "                      ", "                      ", "typeof" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        boolean boolean29 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setIdeMode(true);
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean34 = compilerEnvirons0.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean36 = compilerEnvirons35.isReservedKeywordAsIdentifier();
        boolean boolean37 = compilerEnvirons35.isIdeMode();
        boolean boolean38 = compilerEnvirons35.getWarnTrailingComma();
        compilerEnvirons35.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons35.setAllowSharpComments(true);
        boolean boolean43 = compilerEnvirons35.isRecordingLocalJsDocComments();
        compilerEnvirons35.setAllowMemberExprAsFunctionName(true);
        boolean boolean46 = compilerEnvirons35.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons47 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray53 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        compilerEnvirons47.setActivationNames((java.util.Set<java.lang.String>) strSet54);
        boolean boolean57 = compilerEnvirons47.isGenerateDebugInfo();
        compilerEnvirons47.setGenerateObserverCount(false);
        compilerEnvirons47.setGeneratingSource(false);
        compilerEnvirons47.setGenerateObserverCount(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons64 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean65 = compilerEnvirons64.isReservedKeywordAsIdentifier();
        boolean boolean66 = compilerEnvirons64.getWarnTrailingComma();
        compilerEnvirons64.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet69 = compilerEnvirons64.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter70 = compilerEnvirons64.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser71 = new com.google.javascript.rhino.head.Parser(compilerEnvirons47, errorReporter70);
        compilerEnvirons35.setErrorReporter(errorReporter70);
        com.google.javascript.rhino.head.IRFactory iRFactory73 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter70);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode74 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode75 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode74.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode75);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList77 = scriptNode75.getChildScopes();
        int int78 = scriptNode75.getBaseLineno();
        com.google.javascript.rhino.head.Node node79 = scriptNode75.getLastSibling();
        scriptNode75.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode82 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode83 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode82.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode83);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList85 = scriptNode83.getFunctions();
        scriptNode83.setPosition((int) (byte) 10);
        java.lang.String str88 = scriptNode75.toStringTree(scriptNode83);
        int int89 = scriptNode75.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode91 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode91.removeProp(10);
        com.google.javascript.rhino.head.ast.Scope scope94 = scriptNode91.getParentScope();
        scriptNode75.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode91);
        com.google.javascript.rhino.head.ast.Scope scope97 = new com.google.javascript.rhino.head.ast.Scope(7);
        scriptNode75.target = scope97;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node99 = iRFactory73.transform((com.google.javascript.rhino.head.ast.AstNode) scope97);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = scriptNode1.getRegexpFlags(1278095946);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope(12, (-777163487));
        com.google.javascript.rhino.head.ast.Scope scope5 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10, 1410155489);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scope2.removeChild((com.google.javascript.rhino.head.Node) scope5);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet1 = astRoot0.getComments();
        java.lang.String str2 = astRoot0.getSourceName();
        boolean boolean3 = astRoot0.hasChildren();
        int int4 = astRoot0.getLineno();
        astRoot0.setEncodedSourceBounds((int) (byte) 10, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = astRoot0.getRegexpFlags(226177397);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean15 = compilerEnvirons14.isReservedKeywordAsIdentifier();
        int int16 = compilerEnvirons14.getLanguageVersion();
        compilerEnvirons14.setLanguageVersion((int) (byte) 100);
        boolean boolean19 = compilerEnvirons14.isGenerateObserverCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode20.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode21);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList23 = scriptNode21.getChildScopes();
        int int24 = scriptNode21.getBaseLineno();
        com.google.javascript.rhino.head.Node node25 = scriptNode21.getLastSibling();
        int int26 = scriptNode21.getLineno();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor27 = scriptNode21.iterator();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean29 = compilerEnvirons28.isReservedKeywordAsIdentifier();
        boolean boolean30 = compilerEnvirons28.isIdeMode();
        int int31 = compilerEnvirons28.getOptimizationLevel();
        scriptNode21.setCompilerData((java.lang.Object) compilerEnvirons28);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons33 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean34 = compilerEnvirons33.isReservedKeywordAsIdentifier();
        boolean boolean35 = compilerEnvirons33.isIdeMode();
        compilerEnvirons33.setRecordingLocalJsDocComments(false);
        boolean boolean38 = compilerEnvirons33.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons39 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean40 = compilerEnvirons39.isReservedKeywordAsIdentifier();
        int int41 = compilerEnvirons39.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons42 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean43 = compilerEnvirons42.isReservedKeywordAsIdentifier();
        boolean boolean44 = compilerEnvirons42.isIdeMode();
        compilerEnvirons42.setRecordingLocalJsDocComments(false);
        boolean boolean47 = compilerEnvirons42.isGenerateDebugInfo();
        compilerEnvirons42.setRecordingLocalJsDocComments(true);
        boolean boolean50 = compilerEnvirons42.isXmlAvailable();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons51 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean52 = compilerEnvirons51.isReservedKeywordAsIdentifier();
        boolean boolean53 = compilerEnvirons51.getWarnTrailingComma();
        boolean boolean54 = compilerEnvirons51.isRecordingComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter55 = compilerEnvirons51.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser56 = new com.google.javascript.rhino.head.Parser(compilerEnvirons42, errorReporter55);
        compilerEnvirons39.setErrorReporter(errorReporter55);
        compilerEnvirons33.setErrorReporter(errorReporter55);
        compilerEnvirons28.setErrorReporter(errorReporter55);
        com.google.javascript.rhino.head.Parser parser60 = new com.google.javascript.rhino.head.Parser(compilerEnvirons14, errorReporter55);
        com.google.javascript.rhino.head.IRFactory iRFactory61 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean62 = iRFactory61.eof();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compilerEnvirons0.getErrorReporter();
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setGeneratingSource(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean11 = compilerEnvirons10.isReservedKeywordAsIdentifier();
        int int12 = compilerEnvirons10.getLanguageVersion();
        int int13 = compilerEnvirons10.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean15 = compilerEnvirons14.isReservedKeywordAsIdentifier();
        compilerEnvirons14.setStrictMode(true);
        compilerEnvirons14.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean21 = compilerEnvirons20.isReservedKeywordAsIdentifier();
        boolean boolean22 = compilerEnvirons20.getWarnTrailingComma();
        compilerEnvirons20.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet25 = compilerEnvirons20.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = compilerEnvirons20.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons14, errorReporter26);
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter26);
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter26);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons30 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray36 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        compilerEnvirons30.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        boolean boolean40 = compilerEnvirons30.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter41 = compilerEnvirons30.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser42 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean43 = parser42.eof();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator1 = scriptNode0.spliterator();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator2 = scriptNode0.new NodeIterator();
        int int3 = scriptNode0.getBaseLineno();
        int int4 = scriptNode0.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = scriptNode0.getRegexpString(101564782);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = compilerEnvirons0.getErrorReporter();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean10 = compilerEnvirons0.isGenerateObserverCount();
        int int11 = compilerEnvirons0.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray18 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        boolean boolean22 = compilerEnvirons12.isGenerateDebugInfo();
        boolean boolean23 = compilerEnvirons12.isReservedKeywordAsIdentifier();
        boolean boolean24 = compilerEnvirons12.isGenerateObserverCount();
        java.util.Set<java.lang.String> strSet25 = compilerEnvirons12.getActivationNames();
        compilerEnvirons0.setActivationNames(strSet25);
        com.google.javascript.rhino.head.Parser parser27 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean28 = parser27.eof();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int2 = compilerEnvirons0.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons3 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean4 = compilerEnvirons3.isReservedKeywordAsIdentifier();
        boolean boolean5 = compilerEnvirons3.isIdeMode();
        compilerEnvirons3.setRecordingLocalJsDocComments(false);
        boolean boolean8 = compilerEnvirons3.isGenerateDebugInfo();
        compilerEnvirons3.setRecordingLocalJsDocComments(true);
        boolean boolean11 = compilerEnvirons3.isXmlAvailable();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean13 = compilerEnvirons12.isReservedKeywordAsIdentifier();
        boolean boolean14 = compilerEnvirons12.getWarnTrailingComma();
        boolean boolean15 = compilerEnvirons12.isRecordingComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = compilerEnvirons12.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser17 = new com.google.javascript.rhino.head.Parser(compilerEnvirons3, errorReporter16);
        compilerEnvirons0.setErrorReporter(errorReporter16);
        boolean boolean19 = compilerEnvirons0.isRecordingComments();
        int int20 = compilerEnvirons0.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean22 = compilerEnvirons21.isReservedKeywordAsIdentifier();
        boolean boolean23 = compilerEnvirons21.getWarnTrailingComma();
        boolean boolean24 = compilerEnvirons21.isRecordingComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = compilerEnvirons21.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean27 = iRFactory26.eof();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setGenerateDebugInfo(true);
        compilerEnvirons0.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode11.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode12);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList14 = scriptNode12.getChildScopes();
        java.lang.String str15 = scriptNode12.getSourceName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode16.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList19 = scriptNode17.getChildScopes();
        int int20 = scriptNode17.getBaseLineno();
        com.google.javascript.rhino.head.Node node21 = scriptNode17.getLastSibling();
        int int22 = scriptNode17.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator23 = scriptNode17.new NodeIterator();
        int int24 = scriptNode17.getLineno();
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator26 = astRoot25.new NodeIterator();
        scriptNode17.setCompilerData((java.lang.Object) nodeIterator26);
        int int28 = scriptNode12.compareTo((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        scriptNode17.setLineno(20);
        com.google.javascript.rhino.head.Node node31 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean32 = iRFactory10.eof();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        boolean boolean4 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean5 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setOptimizationLevel((int) (short) -1);
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = iRFactory8.eof();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList9 = scriptNode7.getChildScopes();
        java.lang.String str11 = scriptNode7.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode7, (com.google.javascript.rhino.head.Node) scriptNode13);
        com.google.javascript.rhino.head.ast.AstNode astNode15 = scriptNode1.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = scriptNode1.getRegexpFlags((-704784932));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getParamCount();
        int int2 = astRoot0.getPosition();
        com.google.javascript.rhino.head.Node node3 = astRoot0.target;
        astRoot0.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray6 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList7 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList7, symbolArray6);
        scriptNode5.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList7);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int11 = astRoot10.getParamCount();
        int int12 = astRoot10.getRegexpCount();
        scriptNode5.addChildToBack((com.google.javascript.rhino.head.Node) astRoot10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node14 = astRoot0.getChildBefore((com.google.javascript.rhino.head.Node) astRoot10);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int4 = astRoot3.getBaseLineno();
        java.lang.String str5 = astRoot3.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = astRoot6.new NodeIterator();
        int int8 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot3, (com.google.javascript.rhino.head.ast.AstNode) astRoot6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode9.putIntProp((int) (short) 1, 1);
        java.lang.String str13 = scriptNode9.getEncodedSource();
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator15 = scope14.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode16.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        scope14.setTop(scriptNode17);
        scope14.setLineno((int) (short) -1);
        int int22 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode9, (com.google.javascript.rhino.head.ast.AstNode) scope14);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode23.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode24);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList26 = scriptNode24.getChildScopes();
        int int27 = scriptNode24.getBaseLineno();
        int int28 = scriptNode24.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode29.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode30);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList32 = scriptNode30.getFunctions();
        scriptNode30.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope35 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode24.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode30, (com.google.javascript.rhino.head.Node) scope35);
        scriptNode30.setEncodedSource("-1\tSCRIPT -1 1\n");
        java.lang.String str39 = scriptNode9.toStringTree(scriptNode30);
        scriptNode9.clearParentScope();
        int int41 = scriptNode9.depth();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str44 = scriptNode42.toSource((int) '4');
        com.google.javascript.rhino.head.Node node45 = scriptNode42.getFirstChild();
        java.lang.Object obj47 = scriptNode42.getProp(18);
        boolean boolean48 = scriptNode42.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.Comment comment49 = scriptNode42.getJsDocNode();
        scriptNode42.setPosition((int) ' ');
        scriptNode42.setEncodedSourceStart(8);
        scriptNode42.setBaseLineno((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node56 = scriptNode9.getChildBefore((com.google.javascript.rhino.head.Node) scriptNode42);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int4 = astRoot3.getBaseLineno();
        java.lang.String str5 = astRoot3.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = astRoot6.new NodeIterator();
        int int8 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot3, (com.google.javascript.rhino.head.ast.AstNode) astRoot6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode9.putIntProp((int) (short) 1, 1);
        java.lang.String str13 = scriptNode9.getEncodedSource();
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator15 = scope14.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode16.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        scope14.setTop(scriptNode17);
        scope14.setLineno((int) (short) -1);
        int int22 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode9, (com.google.javascript.rhino.head.ast.AstNode) scope14);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode23.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode24);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList26 = scriptNode24.getChildScopes();
        int int27 = scriptNode24.getBaseLineno();
        int int28 = scriptNode24.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode29.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode30);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList32 = scriptNode30.getFunctions();
        scriptNode30.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope35 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode24.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode30, (com.google.javascript.rhino.head.Node) scope35);
        scriptNode30.setEncodedSource("-1\tSCRIPT -1 1\n");
        java.lang.String str39 = scriptNode9.toStringTree(scriptNode30);
        int int40 = scriptNode9.getAbsolutePosition();
        scriptNode9.setEncodedSource("136");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons44 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean45 = compilerEnvirons44.isReservedKeywordAsIdentifier();
        boolean boolean46 = compilerEnvirons44.isIdeMode();
        compilerEnvirons44.setRecordingLocalJsDocComments(false);
        boolean boolean49 = compilerEnvirons44.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons50 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean51 = compilerEnvirons50.isReservedKeywordAsIdentifier();
        int int52 = compilerEnvirons50.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons53 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean54 = compilerEnvirons53.isReservedKeywordAsIdentifier();
        boolean boolean55 = compilerEnvirons53.isIdeMode();
        compilerEnvirons53.setRecordingLocalJsDocComments(false);
        boolean boolean58 = compilerEnvirons53.isGenerateDebugInfo();
        compilerEnvirons53.setRecordingLocalJsDocComments(true);
        boolean boolean61 = compilerEnvirons53.isXmlAvailable();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons62 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean63 = compilerEnvirons62.isReservedKeywordAsIdentifier();
        boolean boolean64 = compilerEnvirons62.getWarnTrailingComma();
        boolean boolean65 = compilerEnvirons62.isRecordingComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter66 = compilerEnvirons62.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser67 = new com.google.javascript.rhino.head.Parser(compilerEnvirons53, errorReporter66);
        compilerEnvirons50.setErrorReporter(errorReporter66);
        compilerEnvirons44.setErrorReporter(errorReporter66);
        scriptNode9.putProp(129, (java.lang.Object) errorReporter66);
        scriptNode9.setLength(11);
        java.lang.String str73 = scriptNode9.getNextTempName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str75 = scriptNode9.getRegexpFlags(66852059);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        int int1 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean4 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = iRFactory5.eof();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        boolean boolean5 = compilerEnvirons0.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        com.google.javascript.rhino.head.ast.AstRoot astRoot8 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet9 = astRoot8.getComments();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode10.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode11);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode11.getChildScopes();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator15 = scriptNode14.spliterator();
        com.google.javascript.rhino.head.Node node17 = scriptNode14.setType((int) '#');
        boolean boolean18 = scriptNode14.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node(13, (com.google.javascript.rhino.head.Node) astRoot8, (com.google.javascript.rhino.head.Node) scriptNode11, (com.google.javascript.rhino.head.Node) scriptNode14);
        com.google.javascript.rhino.head.Node node20 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode11);
        int int21 = scriptNode11.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode23.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode24);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList26 = scriptNode24.getChildScopes();
        int int27 = scriptNode24.getBaseLineno();
        com.google.javascript.rhino.head.Node node28 = scriptNode24.getLastSibling();
        int int29 = scriptNode24.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator30 = scriptNode24.new NodeIterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode31.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode32);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList34 = scriptNode32.getChildScopes();
        int int35 = scriptNode32.getBaseLineno();
        com.google.javascript.rhino.head.Node node36 = scriptNode32.getLastSibling();
        scriptNode32.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode39.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode40);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList42 = scriptNode40.getFunctions();
        scriptNode40.setPosition((int) (byte) 10);
        java.lang.String str45 = scriptNode32.toStringTree(scriptNode40);
        int int46 = scriptNode32.getBaseLineno();
        com.google.javascript.rhino.head.Node node48 = scriptNode32.setType((int) (byte) -1);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(9, (com.google.javascript.rhino.head.Node) scriptNode24, node48);
        scriptNode24.setEncodedSourceStart(100);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode11, (com.google.javascript.rhino.head.ast.Scope) scriptNode24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str54 = scriptNode24.getRegexpFlags((-1664105353));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(327994914);
        com.google.javascript.rhino.head.ast.AstNode astNode2 = scriptNode1.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode3.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode4);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList6 = scriptNode4.getChildScopes();
        int int7 = scriptNode4.getBaseLineno();
        com.google.javascript.rhino.head.Node node8 = scriptNode4.getLastSibling();
        int int9 = scriptNode4.getLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode10.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode11);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode11.getChildScopes();
        int int14 = scriptNode11.getBaseLineno();
        com.google.javascript.rhino.head.Node node15 = scriptNode11.getLastSibling();
        scriptNode11.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode18.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode19);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList21 = scriptNode19.getFunctions();
        scriptNode19.setPosition((int) (byte) 10);
        java.lang.String str24 = scriptNode11.toStringTree(scriptNode19);
        int int25 = scriptNode11.getBaseLineno();
        com.google.javascript.rhino.head.Node node27 = scriptNode11.setType((int) (byte) -1);
        scriptNode4.target = scriptNode11;
        java.lang.String str29 = scriptNode4.getEncodedSource();
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode4);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator31 = scriptNode1.new NodeIterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = scriptNode1.getRegexpString((-788482790));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean10 = compilerEnvirons9.isReservedKeywordAsIdentifier();
        boolean boolean11 = compilerEnvirons9.getWarnTrailingComma();
        compilerEnvirons9.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet14 = compilerEnvirons9.getActivationNames();
        boolean boolean15 = compilerEnvirons9.isRecordingComments();
        compilerEnvirons9.setIdeMode(false);
        boolean boolean18 = compilerEnvirons9.isAllowMemberExprAsFunctionName();
        boolean boolean19 = compilerEnvirons9.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean21 = compilerEnvirons20.isReservedKeywordAsIdentifier();
        compilerEnvirons20.setStrictMode(true);
        compilerEnvirons20.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean27 = compilerEnvirons26.isReservedKeywordAsIdentifier();
        compilerEnvirons26.setStrictMode(true);
        compilerEnvirons26.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean33 = compilerEnvirons32.isReservedKeywordAsIdentifier();
        boolean boolean34 = compilerEnvirons32.getWarnTrailingComma();
        compilerEnvirons32.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet37 = compilerEnvirons32.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter38 = compilerEnvirons32.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory39 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter38);
        com.google.javascript.rhino.head.IRFactory iRFactory40 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons20, errorReporter38);
        com.google.javascript.rhino.head.IRFactory iRFactory41 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons9, errorReporter38);
        com.google.javascript.rhino.head.IRFactory iRFactory42 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean43 = iRFactory42.eof();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compilerEnvirons0.getErrorReporter();
        java.lang.String[] strArray12 = new java.lang.String[] { "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n", "                                ", "typeof", "                                                                                                                                                                                                        ", "{\n}\n" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet13);
        boolean boolean16 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean17 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean19 = compilerEnvirons18.isReservedKeywordAsIdentifier();
        int int20 = compilerEnvirons18.getLanguageVersion();
        int int21 = compilerEnvirons18.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean23 = compilerEnvirons22.isReservedKeywordAsIdentifier();
        compilerEnvirons22.setStrictMode(true);
        compilerEnvirons22.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean29 = compilerEnvirons28.isReservedKeywordAsIdentifier();
        boolean boolean30 = compilerEnvirons28.getWarnTrailingComma();
        compilerEnvirons28.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet33 = compilerEnvirons28.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter34 = compilerEnvirons28.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons22, errorReporter34);
        com.google.javascript.rhino.head.IRFactory iRFactory36 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons18, errorReporter34);
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter34);
        compilerEnvirons0.setStrictMode(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons40 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean41 = compilerEnvirons40.isReservedKeywordAsIdentifier();
        int int42 = compilerEnvirons40.getLanguageVersion();
        compilerEnvirons40.setLanguageVersion((int) (byte) 100);
        compilerEnvirons40.setXmlAvailable(false);
        compilerEnvirons40.setAllowMemberExprAsFunctionName(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter49 = compilerEnvirons40.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser50 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean51 = parser50.eof();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator1 = astRoot0.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType4, "");
        boolean boolean7 = comment6.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType10 = null;
        com.google.javascript.rhino.head.ast.Comment comment12 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType10, "");
        boolean boolean13 = comment12.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType16 = null;
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType16, "");
        java.lang.String str20 = comment18.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray21 = new com.google.javascript.rhino.head.ast.Comment[] { comment6, comment12, comment18 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet22 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet22, commentArray21);
        astRoot0.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet22);
        boolean boolean25 = astRoot0.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray26 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList27 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList27, symbolArray26);
        astRoot0.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList27);
        int int30 = astRoot0.getBaseLineno();
        com.google.javascript.rhino.head.ast.Comment comment31 = astRoot0.getJsDocNode();
        astRoot0.setBaseLineno((int) '4');
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator35 = astRoot34.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType38 = null;
        com.google.javascript.rhino.head.ast.Comment comment40 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType38, "");
        boolean boolean41 = comment40.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType44 = null;
        com.google.javascript.rhino.head.ast.Comment comment46 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType44, "");
        boolean boolean47 = comment46.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType50 = null;
        com.google.javascript.rhino.head.ast.Comment comment52 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType50, "");
        java.lang.String str54 = comment52.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray55 = new com.google.javascript.rhino.head.ast.Comment[] { comment40, comment46, comment52 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet56 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet56, commentArray55);
        astRoot34.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet56);
        boolean boolean59 = astRoot34.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray60 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList61 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList61, symbolArray60);
        astRoot34.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList61);
        int int64 = astRoot34.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode65 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode65.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode66);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList68 = scriptNode66.getChildScopes();
        int int69 = scriptNode66.getBaseLineno();
        com.google.javascript.rhino.head.Node node70 = scriptNode66.getLastSibling();
        scriptNode66.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode73 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode74 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode73.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode74);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList76 = scriptNode74.getFunctions();
        scriptNode74.setPosition((int) (byte) 10);
        java.lang.String str79 = scriptNode66.toStringTree(scriptNode74);
        int int80 = scriptNode66.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot34, (com.google.javascript.rhino.head.ast.Scope) scriptNode66);
        astRoot0.setParentScope((com.google.javascript.rhino.head.ast.Scope) astRoot34);
        astRoot0.setLineno((int) (short) 0);
        astRoot0.flattenSymbolTable(false);
        int int87 = astRoot0.getLineno();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet88 = astRoot0.getComments();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on commentSet22, commentSet88, and commentSet56.", !(commentSet22.equals(commentSet88) && commentSet88.equals(commentSet56)) || commentSet22.equals(commentSet56));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        com.google.javascript.rhino.head.Parser parser10 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        compilerEnvirons0.setRecoverFromErrors(false);
        com.google.javascript.rhino.head.Parser parser13 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean15 = compilerEnvirons14.isReservedKeywordAsIdentifier();
        boolean boolean16 = compilerEnvirons14.getWarnTrailingComma();
        boolean boolean17 = compilerEnvirons14.isRecordingComments();
        boolean boolean18 = compilerEnvirons14.getWarnTrailingComma();
        boolean boolean19 = compilerEnvirons14.isRecordingLocalJsDocComments();
        boolean boolean20 = compilerEnvirons14.isIdeMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray27 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        compilerEnvirons21.setActivationNames((java.util.Set<java.lang.String>) strSet28);
        compilerEnvirons14.setActivationNames((java.util.Set<java.lang.String>) strSet28);
        boolean boolean32 = compilerEnvirons14.isGenerateDebugInfo();
        boolean boolean33 = compilerEnvirons14.isRecordingLocalJsDocComments();
        boolean boolean34 = compilerEnvirons14.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray41 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        compilerEnvirons35.setActivationNames((java.util.Set<java.lang.String>) strSet42);
        boolean boolean45 = compilerEnvirons35.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter46 = compilerEnvirons35.getErrorReporter();
        boolean boolean47 = compilerEnvirons35.isReservedKeywordAsIdentifier();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons48 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean49 = compilerEnvirons48.isReservedKeywordAsIdentifier();
        boolean boolean50 = compilerEnvirons48.getWarnTrailingComma();
        compilerEnvirons48.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet53 = compilerEnvirons48.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter54 = compilerEnvirons48.getErrorReporter();
        compilerEnvirons48.setReservedKeywordAsIdentifier(false);
        boolean boolean57 = compilerEnvirons48.isGeneratingSource();
        compilerEnvirons48.setIdeMode(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons60 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean61 = compilerEnvirons60.isReservedKeywordAsIdentifier();
        boolean boolean62 = compilerEnvirons60.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons63 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean64 = compilerEnvirons63.isReservedKeywordAsIdentifier();
        boolean boolean65 = compilerEnvirons63.getWarnTrailingComma();
        compilerEnvirons63.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet68 = compilerEnvirons63.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter69 = compilerEnvirons63.getErrorReporter();
        java.lang.String[] strArray75 = new java.lang.String[] { "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n", "                                ", "typeof", "                                                                                                                                                                                                        ", "{\n}\n" };
        java.util.LinkedHashSet<java.lang.String> strSet76 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet76, strArray75);
        compilerEnvirons63.setActivationNames((java.util.Set<java.lang.String>) strSet76);
        com.google.javascript.rhino.head.ErrorReporter errorReporter79 = compilerEnvirons63.getErrorReporter();
        compilerEnvirons60.setErrorReporter(errorReporter79);
        com.google.javascript.rhino.head.Parser parser81 = new com.google.javascript.rhino.head.Parser(compilerEnvirons48, errorReporter79);
        com.google.javascript.rhino.head.IRFactory iRFactory82 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons35, errorReporter79);
        compilerEnvirons14.setErrorReporter(errorReporter79);
        compilerEnvirons0.setErrorReporter(errorReporter79);
        com.google.javascript.rhino.head.Parser parser85 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean86 = parser85.eof();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setWarnTrailingComma(true);
        int int6 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = iRFactory11.eof();
    }
}

