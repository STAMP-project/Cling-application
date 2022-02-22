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
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int4 = scriptNode3.getEndLineno();
        int int5 = scriptNode3.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int8 = scriptNode7.getEndLineno();
        int int9 = scriptNode7.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList10 = scriptNode7.getChildScopes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode1.replaceChildAfter((com.google.javascript.rhino.head.Node) scriptNode3, (com.google.javascript.rhino.head.Node) scriptNode7);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        scriptNode1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = scriptNode1.getRegexpString((int) 'a');
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int4 = scriptNode3.getEndLineno();
        int int5 = scriptNode3.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int8 = scriptNode7.getEndLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode0.replaceChildAfter((com.google.javascript.rhino.head.Node) scriptNode3, (com.google.javascript.rhino.head.Node) scriptNode7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int3 = functionNode2.getLp();
        functionNode2.setIsExpressionClosure(false);
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        jump8.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode1.addChildBefore((com.google.javascript.rhino.head.Node) functionNode2, (com.google.javascript.rhino.head.Node) scriptNode10);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.google.javascript.rhino.head.ast.Jump jump3 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump3.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump3, 0);
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump11.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump15 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump11, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int17 = functionNode16.getLp();
        functionNode16.setEncodedSource("");
        functionNode16.flattenSymbolTable(false);
        jump3.addChildAfter((com.google.javascript.rhino.head.Node) jump11, (com.google.javascript.rhino.head.Node) functionNode16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = functionNode16.toSource(13);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        int int3 = scriptNode1.getBaseLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = scriptNode1.getRegexpString((int) (byte) 1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.google.javascript.rhino.head.ast.Jump jump2 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump2.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int7 = scriptNode6.getEndLineno();
        int int8 = scriptNode6.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList9 = scriptNode6.getChildScopes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        jump2.removeChild((com.google.javascript.rhino.head.Node) scriptNode6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        int int3 = scriptNode1.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList4 = scriptNode1.getChildScopes();
        com.google.javascript.rhino.head.ast.Scope scope5 = scriptNode1.getEnclosingScope();
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump8.removeProp((int) 'a');
        com.google.javascript.rhino.head.Node node11 = jump8.getFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node12 = scriptNode1.getChildBefore((com.google.javascript.rhino.head.Node) jump8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral1 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str3 = regExpLiteral1.toSource((int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int6 = scriptNode5.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int9 = scriptNode8.getEndLineno();
        scriptNode5.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode8);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        jump17.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        java.lang.String str24 = scriptNode19.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode12, (com.google.javascript.rhino.head.ast.Scope) scriptNode19);
        int int26 = scriptNode19.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        regExpLiteral1.replaceChildAfter((com.google.javascript.rhino.head.Node) scriptNode5, (com.google.javascript.rhino.head.Node) scriptNode19);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        int int3 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump6 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int9 = scriptNode8.getEndLineno();
        int int10 = scriptNode8.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList11 = scriptNode8.getChildScopes();
        jump6.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode8);
        java.lang.String str13 = scriptNode8.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode1, (com.google.javascript.rhino.head.ast.Scope) scriptNode8);
        int int15 = scriptNode8.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = scriptNode8.getRegexpString(0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        int int1 = scriptNode0.getEncodedSourceEnd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = scriptNode0.getRegexpString((int) (byte) 100);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor5 = functionNode0.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = functionNode0.toSource();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int2 = functionNode1.getEncodedSourceStart();
        int int3 = functionNode1.getFunctionCount();
        boolean boolean4 = functionNode1.isGetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = functionNode1.toSource(10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int6 = scriptNode5.getEndLineno();
        int int7 = scriptNode5.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = scriptNode12.getChildScopes();
        jump10.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode12);
        java.lang.String str17 = scriptNode12.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode5, (com.google.javascript.rhino.head.ast.Scope) scriptNode12);
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode12.target = scope19;
        functionNode0.addChildScope(scope19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = functionNode0.toSource((int) (byte) -1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral1 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (byte) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump8.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump12 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump8, 0);
        com.google.javascript.rhino.head.ast.Jump jump16 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump16.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump20 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump16, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int22 = functionNode21.getLp();
        functionNode21.setEncodedSource("");
        functionNode21.flattenSymbolTable(false);
        jump8.addChildAfter((com.google.javascript.rhino.head.Node) jump16, (com.google.javascript.rhino.head.Node) functionNode21);
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode4, (com.google.javascript.rhino.head.Node) jump8);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode30 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = functionNode30.getTop();
        java.lang.String str32 = scriptNode31.getJsDoc();
        com.google.javascript.rhino.head.Node node34 = scriptNode31.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode35 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int36 = functionNode35.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str39 = functionNode35.toStringTree(scriptNode38);
        com.google.javascript.rhino.head.ast.Scope scope41 = scriptNode38.getDefiningScope("");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int44 = scriptNode43.getEndLineno();
        int int45 = scriptNode43.getBaseLineno();
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node(25, node34, (com.google.javascript.rhino.head.Node) scriptNode38, (com.google.javascript.rhino.head.Node) scriptNode43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        regExpLiteral1.replaceChild((com.google.javascript.rhino.head.Node) scriptNode4, (com.google.javascript.rhino.head.Node) scriptNode38);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = functionNode0.toSource();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral2 = new com.google.javascript.rhino.head.ast.RegExpLiteral((-1), 3);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int4 = functionNode3.getLp();
        functionNode3.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope9 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = functionNode10.getTop();
        functionNode10.setParens((int) (byte) 1, (int) (short) 1);
        functionNode10.setEncodedSourceStart((-1));
        functionNode10.setFunctionIsGetter();
        scope9.addChildToFront((com.google.javascript.rhino.head.Node) functionNode10);
        functionNode7.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode10);
        int int20 = functionNode3.addFunction(functionNode7);
        java.lang.String str21 = functionNode3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        regExpLiteral2.removeChild((com.google.javascript.rhino.head.Node) functionNode3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.google.javascript.rhino.head.ast.Jump jump3 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump3.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump3, 0);
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump11.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump15 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump11, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int17 = functionNode16.getLp();
        functionNode16.setEncodedSource("");
        functionNode16.flattenSymbolTable(false);
        jump3.addChildAfter((com.google.javascript.rhino.head.Node) jump11, (com.google.javascript.rhino.head.Node) functionNode16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = functionNode16.toSource(0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump7.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump7, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int14 = scriptNode13.getEndLineno();
        int int15 = scriptNode13.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList16 = scriptNode13.getChildScopes();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump7, (com.google.javascript.rhino.head.Node) scriptNode13);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList18 = scriptNode13.getFunctions();
        functionNodeList18.clear();
        com.google.javascript.rhino.head.ast.Jump jump24 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump24.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump28 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump24, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int31 = scriptNode30.getEndLineno();
        int int32 = scriptNode30.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList33 = scriptNode30.getChildScopes();
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump24, (com.google.javascript.rhino.head.Node) scriptNode30);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList35 = scriptNode30.getFunctions();
        boolean boolean36 = functionNodeList18.removeAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList35);
        functionNode1.putProp(20, (java.lang.Object) functionNodeList18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int40 = scriptNode39.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int43 = scriptNode42.getEndLineno();
        scriptNode39.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode42);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        com.google.javascript.rhino.head.ast.Comment comment47 = scriptNode46.getJsDocNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode1.replaceChild((com.google.javascript.rhino.head.Node) scriptNode39, (com.google.javascript.rhino.head.Node) scriptNode46);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = functionNode1.toSource(0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.google.javascript.rhino.head.ast.Jump jump2 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        int int6 = scriptNode4.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList7 = scriptNode4.getChildScopes();
        jump2.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int11 = functionNode10.getLp();
        functionNode10.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int15 = functionNode14.getLp();
        functionNode14.setEncodedSource("");
        functionNode14.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int21 = functionNode20.getLp();
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode10, (com.google.javascript.rhino.head.Node) functionNode14, (com.google.javascript.rhino.head.Node) functionNode20, (int) '#');
        jump2.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode10);
        int int25 = functionNode10.getLength();
        functionNode10.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int30 = functionNode29.getLp();
        functionNode29.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode33 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int34 = functionNode33.getLp();
        functionNode33.setEncodedSource("");
        functionNode33.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode39 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int40 = functionNode39.getLp();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode29, (com.google.javascript.rhino.head.Node) functionNode33, (com.google.javascript.rhino.head.Node) functionNode39, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node43 = functionNode10.getChildBefore((com.google.javascript.rhino.head.Node) functionNode29);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.google.javascript.rhino.head.ast.Jump jump2 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        int int6 = scriptNode4.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList7 = scriptNode4.getChildScopes();
        jump2.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int11 = functionNode10.getLp();
        functionNode10.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int15 = functionNode14.getLp();
        functionNode14.setEncodedSource("");
        functionNode14.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int21 = functionNode20.getLp();
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode10, (com.google.javascript.rhino.head.Node) functionNode14, (com.google.javascript.rhino.head.Node) functionNode20, (int) '#');
        jump2.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode10);
        int int25 = functionNode10.getLength();
        boolean boolean26 = functionNode10.isGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = functionNode10.toSource(26);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str4 = functionNode0.toStringTree(scriptNode3);
        com.google.javascript.rhino.head.ast.Scope scope6 = scriptNode3.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList7 = scriptNode3.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int10 = scriptNode9.getEndLineno();
        int int11 = scriptNode9.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode3, (com.google.javascript.rhino.head.ast.Scope) scriptNode9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = scriptNode9.getRegexpFlags(18);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        int int3 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node4 = scriptNode1.getNext();
        scriptNode1.setPosition((int) (byte) -1);
        com.google.javascript.rhino.head.Node node7 = scriptNode1.getNext();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int9 = functionNode8.getLp();
        functionNode8.setLp((int) (short) 1);
        com.google.javascript.rhino.head.ast.Jump jump14 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.Scope scope16 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        jump14.addChildrenToBack((com.google.javascript.rhino.head.Node) scope16);
        jump14.setBounds(5, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode1.addChildBefore((com.google.javascript.rhino.head.Node) functionNode8, (com.google.javascript.rhino.head.Node) jump14);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral1 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str3 = regExpLiteral1.toSource((int) (byte) 10);
        regExpLiteral1.setFlags("-1\tSCRIPT -1 1\n");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = functionNode7.getTop();
        java.lang.String str9 = scriptNode8.getJsDoc();
        com.google.javascript.rhino.head.Node node11 = scriptNode8.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int13 = functionNode12.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str16 = functionNode12.toStringTree(scriptNode15);
        com.google.javascript.rhino.head.ast.Scope scope18 = scriptNode15.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList19 = scriptNode15.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int22 = scriptNode21.getEndLineno();
        int int23 = scriptNode21.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode15, (com.google.javascript.rhino.head.ast.Scope) scriptNode21);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int27 = scriptNode26.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int30 = scriptNode29.getEndLineno();
        scriptNode26.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode29);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode32 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int33 = functionNode32.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = functionNode32.getTop();
        boolean boolean35 = functionNode32.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int38 = scriptNode37.getEndLineno();
        int int39 = scriptNode37.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump42 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int45 = scriptNode44.getEndLineno();
        int int46 = scriptNode44.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList47 = scriptNode44.getChildScopes();
        jump42.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode44);
        java.lang.String str49 = scriptNode44.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode37, (com.google.javascript.rhino.head.ast.Scope) scriptNode44);
        com.google.javascript.rhino.head.ast.Scope scope51 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode44.target = scope51;
        functionNode32.addChildScope(scope51);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode29, (com.google.javascript.rhino.head.ast.Scope) functionNode32);
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node(20, (com.google.javascript.rhino.head.Node) scriptNode8, (com.google.javascript.rhino.head.Node) scriptNode15, (com.google.javascript.rhino.head.Node) scriptNode29);
        boolean boolean56 = scriptNode15.hasSideEffects();
        com.google.javascript.rhino.head.ast.Jump jump61 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump61.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump65 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump61, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int68 = scriptNode67.getEndLineno();
        int int69 = scriptNode67.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList70 = scriptNode67.getChildScopes();
        com.google.javascript.rhino.head.Node node71 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump61, (com.google.javascript.rhino.head.Node) scriptNode67);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList72 = scriptNode67.getChildScopes();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList73 = scriptNode67.getSymbols();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        regExpLiteral1.replaceChild((com.google.javascript.rhino.head.Node) scriptNode15, (com.google.javascript.rhino.head.Node) scriptNode67);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = functionNode0.getSymbols();
        int int5 = functionNode0.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = functionNode0.toSource((int) ' ');
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.google.javascript.rhino.head.ast.Scope scope0 = new com.google.javascript.rhino.head.ast.Scope();
        java.lang.Object obj2 = scope0.getProp(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = functionNode4.getTop();
        java.lang.String str6 = scriptNode5.getJsDoc();
        com.google.javascript.rhino.head.Node node8 = scriptNode5.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int10 = functionNode9.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str13 = functionNode9.toStringTree(scriptNode12);
        com.google.javascript.rhino.head.ast.Scope scope15 = scriptNode12.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList16 = scriptNode12.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int19 = scriptNode18.getEndLineno();
        int int20 = scriptNode18.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode12, (com.google.javascript.rhino.head.ast.Scope) scriptNode18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int24 = scriptNode23.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int27 = scriptNode26.getEndLineno();
        scriptNode23.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode26);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int30 = functionNode29.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = functionNode29.getTop();
        boolean boolean32 = functionNode29.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int35 = scriptNode34.getEndLineno();
        int int36 = scriptNode34.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump39 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int42 = scriptNode41.getEndLineno();
        int int43 = scriptNode41.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList44 = scriptNode41.getChildScopes();
        jump39.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode41);
        java.lang.String str46 = scriptNode41.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode34, (com.google.javascript.rhino.head.ast.Scope) scriptNode41);
        com.google.javascript.rhino.head.ast.Scope scope48 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode41.target = scope48;
        functionNode29.addChildScope(scope48);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode26, (com.google.javascript.rhino.head.ast.Scope) functionNode29);
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node(20, (com.google.javascript.rhino.head.Node) scriptNode5, (com.google.javascript.rhino.head.Node) scriptNode12, (com.google.javascript.rhino.head.Node) scriptNode26);
        boolean boolean53 = scriptNode12.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scope0.removeChild((com.google.javascript.rhino.head.Node) scriptNode12);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        functionNode1.setParens((int) (byte) 1, (int) (short) 1);
        int int6 = functionNode1.getRp();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString((int) (byte) 100, "");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int11 = functionNode10.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str14 = functionNode10.toStringTree(scriptNode13);
        com.google.javascript.rhino.head.ast.Scope scope16 = scriptNode13.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList17 = scriptNode13.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode13, (com.google.javascript.rhino.head.ast.Scope) scriptNode19);
        java.lang.String str23 = scriptNode19.getEncodedSource();
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(136, (com.google.javascript.rhino.head.Node) functionNode1, node9, (com.google.javascript.rhino.head.Node) scriptNode19, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode27 = functionNode1.getFunctionNode(12);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode3 = functionNode0.getBody();
        com.google.javascript.rhino.head.ast.Scope scope4 = functionNode0.getParentScope();
        java.lang.String str5 = functionNode0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = functionNode0.getFunctionNode((int) ' ');
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setEncodedSource("");
        functionNode0.flattenSymbolTable(false);
        java.lang.String str6 = functionNode0.getName();
        com.google.javascript.rhino.head.Node node7 = functionNode0.target;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = functionNode0.getFunctionNode(1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        int int3 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump6 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int9 = scriptNode8.getEndLineno();
        int int10 = scriptNode8.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList11 = scriptNode8.getChildScopes();
        jump6.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode8);
        java.lang.String str13 = scriptNode8.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode1, (com.google.javascript.rhino.head.ast.Scope) scriptNode8);
        int int15 = scriptNode8.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode17 = scriptNode8.getFunctionNode((-1));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.google.javascript.rhino.head.ast.Jump jump2 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        int int6 = scriptNode4.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList7 = scriptNode4.getChildScopes();
        jump2.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int11 = functionNode10.getLp();
        functionNode10.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int15 = functionNode14.getLp();
        functionNode14.setEncodedSource("");
        functionNode14.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int21 = functionNode20.getLp();
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode10, (com.google.javascript.rhino.head.Node) functionNode14, (com.google.javascript.rhino.head.Node) functionNode20, (int) '#');
        jump2.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode10);
        int int25 = functionNode10.getLength();
        functionNode10.setEncodedSource("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = functionNode10.getFunctionNode((int) (byte) 100);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLp((int) (short) 1);
        int int6 = functionNode0.getIntProp(4, 26);
        functionNode0.flattenSymbolTable(true);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList9 = functionNode0.getParams();
        com.google.javascript.rhino.head.ast.Jump jump15 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump15.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump19 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump15, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int22 = scriptNode21.getEndLineno();
        int int23 = scriptNode21.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList24 = scriptNode21.getChildScopes();
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump15, (com.google.javascript.rhino.head.Node) scriptNode21);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int28 = scriptNode27.getEndLineno();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral30 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str32 = regExpLiteral30.toSource((int) (byte) 10);
        regExpLiteral30.setFlags("-1\tSCRIPT -1 1\n");
        regExpLiteral30.removeProp(8);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node(10, node25, (com.google.javascript.rhino.head.Node) scriptNode27, (com.google.javascript.rhino.head.Node) regExpLiteral30, 3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node39 = functionNode0.getChildBefore(node25);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        int int3 = scriptNode1.getBaseLineno();
        scriptNode1.removeProp(0);
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.Scope scope10 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        jump8.addChildrenToBack((com.google.javascript.rhino.head.Node) scope10);
        com.google.javascript.rhino.head.Node node12 = jump8.getLastChild();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = functionNode13.getTop();
        functionNode13.setParens((int) (byte) 1, (int) (short) 1);
        functionNode13.setEncodedSourceStart((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode1.addChildBefore(node12, (com.google.javascript.rhino.head.Node) functionNode13);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        boolean boolean15 = functionNode11.isGenerator();
        int int16 = functionNode11.getFunctionType();
        com.google.javascript.rhino.head.Node node17 = functionNode11.getFirstChild();
        int int18 = functionNode11.getEncodedSourceStart();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = functionNode11.toSource(0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        com.google.javascript.rhino.head.ast.Comment comment15 = functionNode11.getJsDocNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = functionNode19.getTop();
        functionNode19.setParens((int) (byte) 1, (int) (short) 1);
        functionNode19.setEncodedSourceStart((-1));
        functionNode19.setFunctionIsGetter();
        scope18.addChildToFront((com.google.javascript.rhino.head.Node) functionNode19);
        functionNode16.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode19);
        boolean boolean29 = functionNode11.isParam((com.google.javascript.rhino.head.ast.AstNode) functionNode16);
        functionNode11.setFunctionType(13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = functionNode11.getRegexpFlags(109);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        scriptNode1.removeChildren();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        boolean boolean5 = functionNode4.isExpressionClosure();
        com.google.javascript.rhino.head.Token.CommentType commentType8 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment10 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType8, "109");
        comment10.putIntProp(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode1.replaceChildAfter((com.google.javascript.rhino.head.Node) functionNode4, (com.google.javascript.rhino.head.Node) comment10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor5 = functionNode0.iterator();
        functionNode0.setLp(136);
        int int8 = functionNode0.getFunctionType();
        com.google.javascript.rhino.head.Node node9 = functionNode0.getLastChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = functionNode0.toSource((int) (short) 10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node((int) (byte) 100, (com.google.javascript.rhino.head.Node) functionNode3, 19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = functionNode3.getRegexpString(22);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList15 = scriptNode10.getFunctions();
        functionNodeList15.clear();
        com.google.javascript.rhino.head.ast.Jump jump21 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump21.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump25 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump21, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int28 = scriptNode27.getEndLineno();
        int int29 = scriptNode27.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList30 = scriptNode27.getChildScopes();
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump21, (com.google.javascript.rhino.head.Node) scriptNode27);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList32 = scriptNode27.getFunctions();
        functionNodeList32.clear();
        boolean boolean34 = functionNodeList15.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList32);
        functionNodeList15.clear();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode36 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = functionNode36.getTop();
        functionNode36.setParens((int) (byte) 1, (int) (short) 1);
        functionNode36.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList43 = functionNode36.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope45 = functionNode36.getDefiningScope("hi!");
        boolean boolean46 = functionNode36.isGetterOrSetter();
        int int47 = functionNodeList15.lastIndexOf((java.lang.Object) functionNode36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str49 = functionNode36.getRegexpFlags((int) (byte) 1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        com.google.javascript.rhino.head.ast.Comment comment15 = functionNode11.getJsDocNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = functionNode19.getTop();
        functionNode19.setParens((int) (byte) 1, (int) (short) 1);
        functionNode19.setEncodedSourceStart((-1));
        functionNode19.setFunctionIsGetter();
        scope18.addChildToFront((com.google.javascript.rhino.head.Node) functionNode19);
        functionNode16.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode19);
        boolean boolean29 = functionNode11.isParam((com.google.javascript.rhino.head.ast.AstNode) functionNode16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = functionNode16.toSource(19);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral16 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str18 = regExpLiteral16.toSource((int) (byte) 10);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator19 = regExpLiteral16.new NodeIterator();
        regExpLiteral16.setFlags("$0");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node22 = jump4.getChildBefore((com.google.javascript.rhino.head.Node) regExpLiteral16);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        symbol0.setIndex(6);
        java.lang.String str3 = symbol0.toString();
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump7.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump7, 0);
        com.google.javascript.rhino.head.ast.Jump jump15 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump15.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump19 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump15, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int21 = functionNode20.getLp();
        functionNode20.setEncodedSource("");
        functionNode20.flattenSymbolTable(false);
        jump7.addChildAfter((com.google.javascript.rhino.head.Node) jump15, (com.google.javascript.rhino.head.Node) functionNode20);
        com.google.javascript.rhino.head.Node node27 = functionNode20.target;
        boolean boolean28 = functionNode20.hasConsistentReturnUsage();
        symbol0.setContainingTable((com.google.javascript.rhino.head.ast.Scope) functionNode20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = functionNode20.getRegexpString(1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode3 = functionNode0.getBody();
        com.google.javascript.rhino.head.ast.Jump jump9 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump9.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump13 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump9, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int16 = scriptNode15.getEndLineno();
        int int17 = scriptNode15.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList18 = scriptNode15.getChildScopes();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump9, (com.google.javascript.rhino.head.Node) scriptNode15);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList20 = scriptNode15.getChildScopes();
        com.google.javascript.rhino.head.ast.Jump jump21 = new com.google.javascript.rhino.head.ast.Jump(11, (com.google.javascript.rhino.head.Node) scriptNode15);
        functionNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = scriptNode15.getFunctionNode(15);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        jump17.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor24 = scriptNode19.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int26 = functionNode25.getLp();
        functionNode25.setEncodedSource("");
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode19, (com.google.javascript.rhino.head.ast.Scope) functionNode25);
        com.google.javascript.rhino.head.ast.Jump jump34 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump34.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump38 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump34, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int41 = scriptNode40.getEndLineno();
        int int42 = scriptNode40.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList43 = scriptNode40.getChildScopes();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump34, (com.google.javascript.rhino.head.Node) scriptNode40);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList45 = scriptNode40.getFunctions();
        functionNodeList45.clear();
        int int48 = functionNodeList45.lastIndexOf((java.lang.Object) (-1L));
        com.google.javascript.rhino.head.ast.Jump jump53 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump53.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump57 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump53, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int60 = scriptNode59.getEndLineno();
        int int61 = scriptNode59.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList62 = scriptNode59.getChildScopes();
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump53, (com.google.javascript.rhino.head.Node) scriptNode59);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList64 = scriptNode59.getFunctions();
        functionNodeList64.clear();
        int int67 = functionNodeList64.lastIndexOf((java.lang.Object) (-1L));
        boolean boolean68 = functionNodeList45.removeAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList64);
        com.google.javascript.rhino.head.ast.Jump jump73 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump73.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump77 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump73, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode79 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int80 = scriptNode79.getEndLineno();
        int int81 = scriptNode79.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList82 = scriptNode79.getChildScopes();
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump73, (com.google.javascript.rhino.head.Node) scriptNode79);
        com.google.javascript.rhino.head.Node node85 = scriptNode79.setType(0);
        int int86 = functionNodeList64.lastIndexOf((java.lang.Object) scriptNode79);
        functionNode11.addChildAfter((com.google.javascript.rhino.head.Node) functionNode25, (com.google.javascript.rhino.head.Node) scriptNode79);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode89 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int90 = functionNode89.getEncodedSourceStart();
        int int91 = functionNode89.getFunctionCount();
        functionNode25.addParam((com.google.javascript.rhino.head.ast.AstNode) functionNode89);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str93 = functionNode89.debugPrint();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        functionNode1.setSourceName("                                                                                                                                                                                                        /null/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = functionNode1.toSource();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral1 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str3 = regExpLiteral1.toSource((int) (byte) 10);
        regExpLiteral1.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str7 = regExpLiteral1.toSource((int) (short) -1);
        regExpLiteral1.setFlags("EOF");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int12 = functionNode11.getBaseLineno();
        boolean boolean13 = functionNode11.isExpressionClosure();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        regExpLiteral1.removeChild((com.google.javascript.rhino.head.Node) functionNode11);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        boolean boolean3 = functionNode1.isGetter();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral5 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral5.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str8 = regExpLiteral5.getValue();
        regExpLiteral5.setFlags("52");
        functionNode1.addChildrenToFront((com.google.javascript.rhino.head.Node) regExpLiteral5);
        boolean boolean12 = functionNode1.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = functionNode13.getTop();
        int int15 = functionNode13.getRegexpCount();
        int int16 = functionNode13.getParamCount();
        com.google.javascript.rhino.head.ast.AstNode astNode17 = functionNode13.getBody();
        int int18 = functionNode1.addFunction(functionNode13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = functionNode13.toSource(3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        java.lang.String str3 = scriptNode2.getJsDoc();
        com.google.javascript.rhino.head.Node node5 = scriptNode2.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int7 = functionNode6.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str10 = functionNode6.toStringTree(scriptNode9);
        com.google.javascript.rhino.head.ast.Scope scope12 = scriptNode9.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList13 = scriptNode9.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int16 = scriptNode15.getEndLineno();
        int int17 = scriptNode15.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode9, (com.google.javascript.rhino.head.ast.Scope) scriptNode15);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int21 = scriptNode20.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int24 = scriptNode23.getEndLineno();
        scriptNode20.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode23);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int27 = functionNode26.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = functionNode26.getTop();
        boolean boolean29 = functionNode26.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int32 = scriptNode31.getEndLineno();
        int int33 = scriptNode31.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump36 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int39 = scriptNode38.getEndLineno();
        int int40 = scriptNode38.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList41 = scriptNode38.getChildScopes();
        jump36.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode38);
        java.lang.String str43 = scriptNode38.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode31, (com.google.javascript.rhino.head.ast.Scope) scriptNode38);
        com.google.javascript.rhino.head.ast.Scope scope45 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode38.target = scope45;
        functionNode26.addChildScope(scope45);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode23, (com.google.javascript.rhino.head.ast.Scope) functionNode26);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(20, (com.google.javascript.rhino.head.Node) scriptNode2, (com.google.javascript.rhino.head.Node) scriptNode9, (com.google.javascript.rhino.head.Node) scriptNode23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str51 = scriptNode2.getRegexpString(26);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int3 = functionNode2.getEncodedSourceStart();
        int int4 = functionNode2.getFunctionCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = functionNode5.getTop();
        functionNode5.setParens((int) (byte) 1, (int) (short) 1);
        int int10 = functionNode5.getRp();
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(17, (com.google.javascript.rhino.head.Node) functionNode2, (com.google.javascript.rhino.head.Node) functionNode5, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = functionNode5.getFunctionNode(1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        scriptNode1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int8 = functionNode7.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode7.getTop();
        boolean boolean10 = functionNode7.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        jump17.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        java.lang.String str24 = scriptNode19.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode12, (com.google.javascript.rhino.head.ast.Scope) scriptNode19);
        com.google.javascript.rhino.head.ast.Scope scope26 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode19.target = scope26;
        functionNode7.addChildScope(scope26);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode4, (com.google.javascript.rhino.head.ast.Scope) functionNode7);
        int int30 = functionNode7.getFunctionCount();
        java.lang.String str31 = functionNode7.shortName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = functionNode7.toSource();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        com.google.javascript.rhino.head.ast.Scope scope3 = scriptNode1.getParentScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = scriptNode1.getRegexpString(0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        functionNode0.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode3);
        functionNode0.setFunctionIsSetter();
        boolean boolean14 = functionNode0.isExpressionClosure();
        functionNode0.setFunctionType((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = functionNode0.toSource(5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode8.getTop();
        functionNode8.setParens((int) (byte) 1, (int) (short) 1);
        functionNode8.setEncodedSourceStart((-1));
        functionNode8.setFunctionIsGetter();
        scope7.addChildToFront((com.google.javascript.rhino.head.Node) functionNode8);
        functionNode5.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode8);
        functionNode5.setFunctionIsSetter();
        int int19 = functionNode0.addFunction(functionNode5);
        functionNode0.setEncodedSourceStart(1);
        boolean boolean22 = functionNode0.isExpressionClosure();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = functionNode0.getRegexpString(136);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = scriptNode10.getRegexpFlags(15);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode1.getTop();
        boolean boolean4 = functionNode1.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int7 = scriptNode6.getEndLineno();
        int int8 = scriptNode6.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int14 = scriptNode13.getEndLineno();
        int int15 = scriptNode13.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList16 = scriptNode13.getChildScopes();
        jump11.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode13);
        java.lang.String str18 = scriptNode13.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode6, (com.google.javascript.rhino.head.ast.Scope) scriptNode13);
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode13.target = scope20;
        functionNode1.addChildScope(scope20);
        boolean boolean23 = functionNode1.hasConsistentReturnUsage();
        java.lang.String str24 = functionNode1.getNextTempName();
        com.google.javascript.rhino.head.ast.Jump jump25 = new com.google.javascript.rhino.head.ast.Jump((int) (short) -1, (com.google.javascript.rhino.head.Node) functionNode1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = functionNode1.debugPrint();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int2 = functionNode1.getEncodedSourceStart();
        int int3 = functionNode1.getFunctionCount();
        boolean boolean4 = functionNode1.isGetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = functionNode1.toSource((int) (short) 100);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) (byte) 1, "$0");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int4 = functionNode3.getLp();
        functionNode3.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope9 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = functionNode10.getTop();
        functionNode10.setParens((int) (byte) 1, (int) (short) 1);
        functionNode10.setEncodedSourceStart((-1));
        functionNode10.setFunctionIsGetter();
        scope9.addChildToFront((com.google.javascript.rhino.head.Node) functionNode10);
        functionNode7.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode10);
        int int20 = functionNode3.addFunction(functionNode7);
        com.google.javascript.rhino.head.ast.Symbol symbol22 = functionNode3.getSymbol("-1\tBLOCK -1 1\n");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int25 = scriptNode24.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol27 = scriptNode24.getSymbol("hi!");
        scriptNode24.putIntProp(3, 0);
        functionNode3.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode24);
        java.lang.String str32 = node2.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode3);
        int int33 = functionNode3.getRp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = functionNode3.toSource();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        functionNode11.setEncodedSourceStart(25);
        boolean boolean17 = functionNode11.requiresActivation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = functionNode11.toSource(109);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode2.getTop();
        functionNode2.setParens((int) (byte) 1, (int) (short) 1);
        functionNode2.setEncodedSourceStart((-1));
        functionNode2.setFunctionIsGetter();
        scope1.addChildToFront((com.google.javascript.rhino.head.Node) functionNode2);
        com.google.javascript.rhino.head.ast.Scope scope12 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = functionNode13.getTop();
        functionNode13.setParens((int) (byte) 1, (int) (short) 1);
        functionNode13.setEncodedSourceStart((-1));
        functionNode13.setFunctionIsGetter();
        scope12.addChildToFront((com.google.javascript.rhino.head.Node) functionNode13);
        functionNode13.setRp(19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int26 = scriptNode25.getEndLineno();
        int int27 = scriptNode25.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump30 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int33 = scriptNode32.getEndLineno();
        int int34 = scriptNode32.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList35 = scriptNode32.getChildScopes();
        jump30.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode32);
        java.lang.String str37 = scriptNode32.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode25, (com.google.javascript.rhino.head.ast.Scope) scriptNode32);
        com.google.javascript.rhino.head.ast.Scope scope39 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode32.target = scope39;
        java.lang.String str41 = functionNode13.toStringTree(scriptNode32);
        java.lang.String str43 = scriptNode32.toSource((int) (short) 10);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap44 = scriptNode32.getSymbolTable();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int47 = scriptNode46.getEndLineno();
        int int48 = scriptNode46.getBaseLineno();
        scriptNode46.removeProp(0);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList51 = scriptNode46.getSymbols();
        boolean boolean52 = strMap44.containsValue((java.lang.Object) symbolList51);
        com.google.javascript.rhino.head.ast.Symbol symbol54 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str55 = symbol54.getDeclTypeName();
        com.google.javascript.rhino.head.ast.Scope scope56 = symbol54.getContainingTable();
        symbol54.setName("                                      109");
        com.google.javascript.rhino.head.Node node59 = symbol54.getNode();
        com.google.javascript.rhino.head.ast.Symbol symbol60 = new com.google.javascript.rhino.head.ast.Symbol();
        com.google.javascript.rhino.head.Node node61 = symbol60.getNode();
        symbol60.setIndex(4);
        java.lang.String str64 = symbol60.getDeclTypeName();
        java.lang.String str65 = symbol60.toString();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode66 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int67 = functionNode66.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode68 = functionNode66.getTop();
        boolean boolean69 = functionNode66.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode71 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int72 = scriptNode71.getEndLineno();
        int int73 = scriptNode71.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump76 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode78 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int79 = scriptNode78.getEndLineno();
        int int80 = scriptNode78.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList81 = scriptNode78.getChildScopes();
        jump76.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode78);
        java.lang.String str83 = scriptNode78.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode71, (com.google.javascript.rhino.head.ast.Scope) scriptNode78);
        com.google.javascript.rhino.head.ast.Scope scope85 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode78.target = scope85;
        functionNode66.addChildScope(scope85);
        boolean boolean88 = functionNode66.isGetter();
        symbol60.setNode((com.google.javascript.rhino.head.Node) functionNode66);
        boolean boolean90 = strMap44.replace("{\n}\n", symbol54, symbol60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scope1.putSymbol(symbol54);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = functionNode1.getEnclosingFunction();
        com.google.javascript.rhino.head.Node node3 = functionNode1.target;
        functionNode1.setLineno((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = functionNode1.getRegexpString(2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        functionNode0.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode3);
        functionNode0.setFunctionIsSetter();
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newString("                                                                                                                                                                                                        ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode0.removeChild(node15);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        functionNode0.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode3);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = functionNode13.getTop();
        functionNode13.setParens((int) (byte) 1, (int) (short) 1);
        functionNode13.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList20 = functionNode13.getResumptionPoints();
        int int21 = functionNode13.getLp();
        functionNode0.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = functionNode0.getRegexpFlags(0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.google.javascript.rhino.head.ast.Jump jump2 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        int int6 = scriptNode4.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList7 = scriptNode4.getChildScopes();
        jump2.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int11 = functionNode10.getLp();
        functionNode10.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int15 = functionNode14.getLp();
        functionNode14.setEncodedSource("");
        functionNode14.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int21 = functionNode20.getLp();
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode10, (com.google.javascript.rhino.head.Node) functionNode14, (com.google.javascript.rhino.head.Node) functionNode20, (int) '#');
        jump2.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode10);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList25 = functionNode10.getStatements();
        boolean boolean26 = functionNode10.requiresActivation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = functionNode10.toSource(48);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = functionNode0.getSymbols();
        functionNode0.setRp(5);
        functionNode0.setParens((int) '#', 24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = functionNode0.toSource(11);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope6 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = functionNode7.getTop();
        functionNode7.setParens((int) (byte) 1, (int) (short) 1);
        functionNode7.setEncodedSourceStart((-1));
        functionNode7.setFunctionIsGetter();
        scope6.addChildToFront((com.google.javascript.rhino.head.Node) functionNode7);
        functionNode4.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode7);
        int int17 = functionNode0.addFunction(functionNode4);
        java.lang.Object obj18 = functionNode4.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int21 = scriptNode20.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int24 = scriptNode23.getEndLineno();
        scriptNode20.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode23);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int27 = functionNode26.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = functionNode26.getTop();
        boolean boolean29 = functionNode26.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int32 = scriptNode31.getEndLineno();
        int int33 = scriptNode31.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump36 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int39 = scriptNode38.getEndLineno();
        int int40 = scriptNode38.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList41 = scriptNode38.getChildScopes();
        jump36.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode38);
        java.lang.String str43 = scriptNode38.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode31, (com.google.javascript.rhino.head.ast.Scope) scriptNode38);
        com.google.javascript.rhino.head.ast.Scope scope45 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode38.target = scope45;
        functionNode26.addChildScope(scope45);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode23, (com.google.javascript.rhino.head.ast.Scope) functionNode26);
        int int49 = functionNode26.getFunctionCount();
        int int50 = functionNode26.getLineno();
        int int51 = functionNode26.getAbsolutePosition();
        java.lang.String str52 = functionNode4.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str53 = functionNode4.toSource();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.google.javascript.rhino.head.ast.Jump jump3 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump3.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump3, 0);
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump11.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump15 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump11, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int17 = functionNode16.getLp();
        functionNode16.setEncodedSource("");
        functionNode16.flattenSymbolTable(false);
        jump3.addChildAfter((com.google.javascript.rhino.head.Node) jump11, (com.google.javascript.rhino.head.Node) functionNode16);
        com.google.javascript.rhino.head.Node node23 = functionNode16.target;
        boolean boolean24 = functionNode16.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.Name name25 = functionNode16.getFunctionName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = functionNode29.getTop();
        functionNode29.setParens((int) (byte) 1, (int) (short) 1);
        functionNode29.setEncodedSourceStart((-1));
        functionNode29.setFunctionIsGetter();
        scope28.addChildToFront((com.google.javascript.rhino.head.Node) functionNode29);
        functionNode26.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode29);
        functionNode29.setRelative(0);
        functionNode16.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode29);
        functionNode16.setEncodedSourceStart((int) (byte) 0);
        com.google.javascript.rhino.head.ast.AstNode astNode44 = functionNode16.getBody();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode45 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = functionNode45.getTop();
        functionNode45.setParens((int) (byte) 1, (int) (short) 1);
        functionNode45.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList52 = functionNode45.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope54 = functionNode45.getDefiningScope("hi!");
        boolean boolean55 = functionNode45.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int58 = scriptNode57.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol60 = scriptNode57.getSymbol("hi!");
        scriptNode57.putIntProp(3, 0);
        functionNode45.addResumptionPoint((com.google.javascript.rhino.head.Node) scriptNode57);
        functionNode45.setIsGenerator();
        int int66 = functionNode45.getEncodedSourceStart();
        functionNode45.removeProp((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node69 = functionNode16.getChildBefore((com.google.javascript.rhino.head.Node) functionNode45);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        functionNode1.setSourceName("                                                                                                                                                                                                        /null/");
        com.google.javascript.rhino.head.ast.AstNode astNode5 = functionNode1.getBody();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = functionNode1.toSource((-1110578805));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        int int3 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump6 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int9 = scriptNode8.getEndLineno();
        int int10 = scriptNode8.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList11 = scriptNode8.getChildScopes();
        jump6.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode8);
        java.lang.String str13 = scriptNode8.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode1, (com.google.javascript.rhino.head.ast.Scope) scriptNode8);
        scriptNode1.setRelative(21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode18 = scriptNode1.getFunctionNode((int) (short) -1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(136);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = functionNode1.getRegexpString(21);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        functionNode1.setSourceName("                                                                                                                                                                                                        /null/");
        functionNode1.setRequiresActivation();
        com.google.javascript.rhino.head.Node node6 = functionNode1.target;
        int int7 = functionNode1.getLength();
        java.lang.String str8 = functionNode1.getEncodedSource();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = functionNode9.getTop();
        int int11 = functionNode9.getRegexpCount();
        functionNode9.setFunctionIsGetter();
        com.google.javascript.rhino.head.Node node13 = functionNode9.target;
        functionNode9.clearParentScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node15 = functionNode1.getChildBefore((com.google.javascript.rhino.head.Node) functionNode9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode1.getTop();
        boolean boolean4 = functionNode1.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int7 = scriptNode6.getEndLineno();
        int int8 = scriptNode6.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int14 = scriptNode13.getEndLineno();
        int int15 = scriptNode13.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList16 = scriptNode13.getChildScopes();
        jump11.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode13);
        java.lang.String str18 = scriptNode13.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode6, (com.google.javascript.rhino.head.ast.Scope) scriptNode13);
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode13.target = scope20;
        functionNode1.addChildScope(scope20);
        boolean boolean23 = functionNode1.hasConsistentReturnUsage();
        java.lang.String str24 = functionNode1.getNextTempName();
        com.google.javascript.rhino.head.ast.Jump jump25 = new com.google.javascript.rhino.head.ast.Jump((int) (short) -1, (com.google.javascript.rhino.head.Node) functionNode1);
        boolean boolean26 = functionNode1.isExpressionClosure();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral28 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral28.setFlags("-1\tSCRIPT -1 1\n");
        regExpLiteral28.setValue("hi!");
        functionNode1.addRegExp(regExpLiteral28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = functionNode1.debugPrint();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        java.lang.String str3 = scriptNode2.getJsDoc();
        com.google.javascript.rhino.head.Node node5 = scriptNode2.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int7 = functionNode6.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str10 = functionNode6.toStringTree(scriptNode9);
        com.google.javascript.rhino.head.ast.Scope scope12 = scriptNode9.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList13 = scriptNode9.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int16 = scriptNode15.getEndLineno();
        int int17 = scriptNode15.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode9, (com.google.javascript.rhino.head.ast.Scope) scriptNode15);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int21 = scriptNode20.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int24 = scriptNode23.getEndLineno();
        scriptNode20.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode23);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int27 = functionNode26.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = functionNode26.getTop();
        boolean boolean29 = functionNode26.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int32 = scriptNode31.getEndLineno();
        int int33 = scriptNode31.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump36 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int39 = scriptNode38.getEndLineno();
        int int40 = scriptNode38.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList41 = scriptNode38.getChildScopes();
        jump36.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode38);
        java.lang.String str43 = scriptNode38.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode31, (com.google.javascript.rhino.head.ast.Scope) scriptNode38);
        com.google.javascript.rhino.head.ast.Scope scope45 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode38.target = scope45;
        functionNode26.addChildScope(scope45);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode23, (com.google.javascript.rhino.head.ast.Scope) functionNode26);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(20, (com.google.javascript.rhino.head.Node) scriptNode2, (com.google.javascript.rhino.head.Node) scriptNode9, (com.google.javascript.rhino.head.Node) scriptNode23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str51 = scriptNode2.toSource(6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        functionNode0.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = functionNode0.getFunctionNode(0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode1.getTop();
        boolean boolean4 = functionNode1.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int7 = scriptNode6.getEndLineno();
        int int8 = scriptNode6.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int14 = scriptNode13.getEndLineno();
        int int15 = scriptNode13.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList16 = scriptNode13.getChildScopes();
        jump11.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode13);
        java.lang.String str18 = scriptNode13.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode6, (com.google.javascript.rhino.head.ast.Scope) scriptNode13);
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode13.target = scope20;
        functionNode1.addChildScope(scope20);
        boolean boolean23 = functionNode1.hasConsistentReturnUsage();
        java.lang.String str24 = functionNode1.getNextTempName();
        com.google.javascript.rhino.head.ast.Jump jump25 = new com.google.javascript.rhino.head.ast.Jump((int) (short) -1, (com.google.javascript.rhino.head.Node) functionNode1);
        boolean boolean26 = functionNode1.isExpressionClosure();
        functionNode1.putIntProp(1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = functionNode1.toSource((-1));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = functionNode0.getSymbols();
        functionNode0.setRp(5);
        com.google.javascript.rhino.head.ast.Scope scope7 = functionNode0.getEnclosingScope();
        int int8 = functionNode0.getRp();
        java.util.List<com.google.javascript.rhino.head.Node> nodeList9 = functionNode0.getResumptionPoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = functionNode0.getRegexpFlags(136);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        functionNode0.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList7 = functionNode0.getResumptionPoints();
        int int8 = functionNode0.getLp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = functionNode0.toSource(5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        java.lang.String str3 = scriptNode2.getJsDoc();
        com.google.javascript.rhino.head.Node node5 = scriptNode2.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int7 = functionNode6.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str10 = functionNode6.toStringTree(scriptNode9);
        com.google.javascript.rhino.head.ast.Scope scope12 = scriptNode9.getDefiningScope("");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int15 = scriptNode14.getEndLineno();
        int int16 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node(25, node5, (com.google.javascript.rhino.head.Node) scriptNode9, (com.google.javascript.rhino.head.Node) scriptNode14);
        boolean boolean18 = scriptNode14.hasConsistentReturnUsage();
        java.lang.String str19 = scriptNode14.getNextTempName();
        java.lang.String str20 = scriptNode14.shortName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int22 = functionNode21.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = functionNode21.getTop();
        boolean boolean24 = functionNode21.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList25 = functionNode21.getSymbols();
        scriptNode14.setSymbols(symbolList25);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int30 = functionNode29.getLp();
        functionNode29.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode33 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int34 = functionNode33.getLp();
        functionNode33.setEncodedSource("");
        functionNode33.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode39 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int40 = functionNode39.getLp();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode29, (com.google.javascript.rhino.head.Node) functionNode33, (com.google.javascript.rhino.head.Node) functionNode39, (int) '#');
        functionNode39.setEncodedSourceStart(25);
        boolean boolean45 = functionNode39.requiresActivation();
        java.lang.String str46 = functionNode39.getNextTempName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode48 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = functionNode48.getTop();
        functionNode48.setParens((int) (byte) 1, (int) (short) 1);
        int int53 = functionNode48.getRp();
        com.google.javascript.rhino.head.Node node56 = com.google.javascript.rhino.head.Node.newString((int) (byte) 100, "");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode57 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int58 = functionNode57.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str61 = functionNode57.toStringTree(scriptNode60);
        com.google.javascript.rhino.head.ast.Scope scope63 = scriptNode60.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList64 = scriptNode60.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int67 = scriptNode66.getEndLineno();
        int int68 = scriptNode66.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode60, (com.google.javascript.rhino.head.ast.Scope) scriptNode66);
        java.lang.String str70 = scriptNode66.getEncodedSource();
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node(136, (com.google.javascript.rhino.head.Node) functionNode48, node56, (com.google.javascript.rhino.head.Node) scriptNode66, (int) (short) 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode73 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int74 = functionNode73.getLp();
        functionNode73.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode77 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope79 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode80 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode81 = functionNode80.getTop();
        functionNode80.setParens((int) (byte) 1, (int) (short) 1);
        functionNode80.setEncodedSourceStart((-1));
        functionNode80.setFunctionIsGetter();
        scope79.addChildToFront((com.google.javascript.rhino.head.Node) functionNode80);
        functionNode77.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode80);
        int int90 = functionNode73.addFunction(functionNode77);
        com.google.javascript.rhino.head.Node node92 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) functionNode39, (com.google.javascript.rhino.head.Node) scriptNode66, (com.google.javascript.rhino.head.Node) functionNode77, 3);
        scriptNode14.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode66);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode94 = scriptNode14.getTop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str96 = scriptNode14.getRegexpFlags(5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) (byte) 1, "$0");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int4 = functionNode3.getLp();
        functionNode3.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope9 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = functionNode10.getTop();
        functionNode10.setParens((int) (byte) 1, (int) (short) 1);
        functionNode10.setEncodedSourceStart((-1));
        functionNode10.setFunctionIsGetter();
        scope9.addChildToFront((com.google.javascript.rhino.head.Node) functionNode10);
        functionNode7.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode10);
        int int20 = functionNode3.addFunction(functionNode7);
        com.google.javascript.rhino.head.ast.Symbol symbol22 = functionNode3.getSymbol("-1\tBLOCK -1 1\n");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int25 = scriptNode24.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol27 = scriptNode24.getSymbol("hi!");
        scriptNode24.putIntProp(3, 0);
        functionNode3.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode24);
        java.lang.String str32 = node2.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode3);
        com.google.javascript.rhino.head.ast.Jump jump36 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump36.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump40 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump36, 0);
        com.google.javascript.rhino.head.ast.Jump jump44 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump44.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump48 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump44, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode49 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int50 = functionNode49.getLp();
        functionNode49.setEncodedSource("");
        functionNode49.flattenSymbolTable(false);
        jump36.addChildAfter((com.google.javascript.rhino.head.Node) jump44, (com.google.javascript.rhino.head.Node) functionNode49);
        com.google.javascript.rhino.head.Node node56 = functionNode49.target;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node57 = functionNode3.getChildBefore((com.google.javascript.rhino.head.Node) functionNode49);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setEncodedSource("");
        functionNode0.flattenSymbolTable(false);
        java.lang.String str6 = functionNode0.getName();
        functionNode0.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int9 = functionNode8.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = functionNode8.getTop();
        com.google.javascript.rhino.head.Node node11 = functionNode8.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList12 = functionNode8.getParams();
        functionNode0.setParams(astNodeList12);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int15 = functionNode14.getLp();
        functionNode14.setLp((int) (short) 1);
        int int20 = functionNode14.getIntProp(4, 26);
        functionNode14.flattenSymbolTable(true);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList23 = functionNode14.getParams();
        functionNode0.setParams(astNodeList23);
        int int25 = functionNode0.getFunctionType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = functionNode0.toSource(0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLp((int) (short) 1);
        int int6 = functionNode0.getIntProp(4, 26);
        functionNode0.flattenSymbolTable(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = functionNode0.toSource((-146877426));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode8.getTop();
        functionNode8.setParens((int) (byte) 1, (int) (short) 1);
        functionNode8.setEncodedSourceStart((-1));
        functionNode8.setFunctionIsGetter();
        scope7.addChildToFront((com.google.javascript.rhino.head.Node) functionNode8);
        functionNode5.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode8);
        functionNode5.setFunctionIsSetter();
        int int19 = functionNode0.addFunction(functionNode5);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = functionNode5.getTop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = scriptNode20.toSource(100);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        boolean boolean15 = functionNode11.isGenerator();
        int int16 = functionNode11.getFunctionType();
        com.google.javascript.rhino.head.Node node17 = functionNode11.getNext();
        functionNode11.setFunctionIsSetter();
        com.google.javascript.rhino.head.ast.Scope scope20 = functionNode11.getDefiningScope("-1\tSCRIPT -1 1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = functionNode11.toSource(13);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode8.getTop();
        functionNode8.setParens((int) (byte) 1, (int) (short) 1);
        functionNode8.setEncodedSourceStart((-1));
        functionNode8.setFunctionIsGetter();
        scope7.addChildToFront((com.google.javascript.rhino.head.Node) functionNode8);
        functionNode5.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode8);
        functionNode5.setFunctionIsSetter();
        int int19 = functionNode0.addFunction(functionNode5);
        java.lang.String str20 = functionNode0.getNextTempName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode22 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int23 = functionNode22.getBaseLineno();
        functionNode22.setSourceName("                                                                                                                                                                                                        /null/");
        functionNode22.setRequiresActivation();
        functionNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) functionNode22);
        functionNode22.setEncodedSourceEnd((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode31 = functionNode22.getFunctionNode((int) ' ');
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLp((int) (short) 1);
        int int6 = functionNode0.getIntProp(4, 26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = functionNode0.debugPrint();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = functionNode1.getEnclosingFunction();
        com.google.javascript.rhino.head.Node node3 = functionNode1.target;
        functionNode1.setLineno((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = functionNode1.getFunctionNode(136);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.google.javascript.rhino.head.ast.Jump jump3 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump3.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump3, 0);
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump11.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump15 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump11, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int17 = functionNode16.getLp();
        functionNode16.setEncodedSource("");
        functionNode16.flattenSymbolTable(false);
        jump3.addChildAfter((com.google.javascript.rhino.head.Node) jump11, (com.google.javascript.rhino.head.Node) functionNode16);
        com.google.javascript.rhino.head.Node node23 = functionNode16.target;
        boolean boolean24 = functionNode16.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.Scope scope25 = functionNode16.getEnclosingScope();
        java.util.List<com.google.javascript.rhino.head.Node> nodeList26 = functionNode16.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Jump jump31 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump31.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump35 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump31, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int38 = scriptNode37.getEndLineno();
        int int39 = scriptNode37.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList40 = scriptNode37.getChildScopes();
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump31, (com.google.javascript.rhino.head.Node) scriptNode37);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList42 = scriptNode37.getFunctions();
        int int43 = scriptNode37.getPosition();
        functionNode16.addParam((com.google.javascript.rhino.head.ast.AstNode) scriptNode37);
        functionNode16.setFunctionIsGetter();
        int int46 = functionNode16.getFunctionCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str48 = functionNode16.toSource((int) (short) -1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList15 = scriptNode10.getFunctions();
        int int16 = scriptNode10.getPosition();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList17 = scriptNode10.getChildScopes();
        scriptNode10.flattenSymbolTable(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = scriptNode10.getRegexpString(628528643);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        functionNode0.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList7 = functionNode0.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope9 = functionNode0.getDefiningScope("hi!");
        boolean boolean10 = functionNode0.isGetterOrSetter();
        functionNode0.setSourceName("                                                                                                                                                                                                        /null/");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int14 = functionNode13.getLp();
        functionNode13.setIsExpressionClosure(false);
        com.google.javascript.rhino.head.ast.Scope scope17 = functionNode13.getParentScope();
        int int18 = functionNode13.getFunctionType();
        functionNode0.addParam((com.google.javascript.rhino.head.ast.AstNode) functionNode13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = functionNode13.toSource(5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList15 = scriptNode10.getFunctions();
        functionNodeList15.clear();
        int int18 = functionNodeList15.lastIndexOf((java.lang.Object) (-1L));
        com.google.javascript.rhino.head.ast.Jump jump23 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump23.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump27 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump23, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int30 = scriptNode29.getEndLineno();
        int int31 = scriptNode29.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList32 = scriptNode29.getChildScopes();
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump23, (com.google.javascript.rhino.head.Node) scriptNode29);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList34 = scriptNode29.getFunctions();
        functionNodeList34.clear();
        int int37 = functionNodeList34.lastIndexOf((java.lang.Object) (-1L));
        boolean boolean38 = functionNodeList15.removeAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList34);
        com.google.javascript.rhino.head.ast.Jump jump43 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump43.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump47 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump43, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int50 = scriptNode49.getEndLineno();
        int int51 = scriptNode49.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList52 = scriptNode49.getChildScopes();
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump43, (com.google.javascript.rhino.head.Node) scriptNode49);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList54 = scriptNode49.getFunctions();
        int int55 = functionNodeList15.indexOf((java.lang.Object) scriptNode49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode57 = scriptNode49.getFunctionNode(2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.Jump jump5 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump5.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump9 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump5, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int12 = scriptNode11.getEndLineno();
        int int13 = scriptNode11.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList14 = scriptNode11.getChildScopes();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump5, (com.google.javascript.rhino.head.Node) scriptNode11);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList16 = scriptNode11.getFunctions();
        int int17 = scriptNode11.getPosition();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList18 = scriptNode11.getChildScopes();
        java.lang.String str19 = scriptNode11.getSourceName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int22 = functionNode21.getLp();
        functionNode21.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int26 = functionNode25.getLp();
        functionNode25.setEncodedSource("");
        functionNode25.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode31 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int32 = functionNode31.getLp();
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode21, (com.google.javascript.rhino.head.Node) functionNode25, (com.google.javascript.rhino.head.Node) functionNode31, (int) '#');
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap35 = functionNode25.getSymbolTable();
        com.google.javascript.rhino.head.ast.Jump jump39 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump39.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump43 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump39, 0);
        com.google.javascript.rhino.head.ast.Jump jump47 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump47.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump51 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump47, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode52 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int53 = functionNode52.getLp();
        functionNode52.setEncodedSource("");
        functionNode52.flattenSymbolTable(false);
        jump39.addChildAfter((com.google.javascript.rhino.head.Node) jump47, (com.google.javascript.rhino.head.Node) functionNode52);
        functionNode25.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) functionNode52);
        int int60 = positionComparator0.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode11, (com.google.javascript.rhino.head.ast.AstNode) functionNode25);
        functionNode25.setFunctionType(4);
        com.google.javascript.rhino.head.ast.AstNode astNode63 = functionNode25.getMemberExprNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode65 = functionNode25.getFunctionNode(15);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump7.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump7, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int14 = scriptNode13.getEndLineno();
        int int15 = scriptNode13.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList16 = scriptNode13.getChildScopes();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump7, (com.google.javascript.rhino.head.Node) scriptNode13);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList18 = scriptNode13.getFunctions();
        functionNodeList18.clear();
        com.google.javascript.rhino.head.ast.Jump jump24 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump24.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump28 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump24, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int31 = scriptNode30.getEndLineno();
        int int32 = scriptNode30.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList33 = scriptNode30.getChildScopes();
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump24, (com.google.javascript.rhino.head.Node) scriptNode30);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList35 = scriptNode30.getFunctions();
        boolean boolean36 = functionNodeList18.removeAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList35);
        functionNode1.putProp(20, (java.lang.Object) functionNodeList18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str38 = functionNode1.debugPrint();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode3 = functionNode0.getBody();
        int int4 = functionNode0.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = functionNode0.toSource((-592978996));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int6 = scriptNode5.getEndLineno();
        int int7 = scriptNode5.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = scriptNode12.getChildScopes();
        jump10.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode12);
        java.lang.String str17 = scriptNode12.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode5, (com.google.javascript.rhino.head.ast.Scope) scriptNode12);
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode12.target = scope19;
        functionNode0.addChildScope(scope19);
        boolean boolean22 = functionNode0.hasConsistentReturnUsage();
        boolean boolean23 = functionNode0.hasSideEffects();
        functionNode0.setLp((-1262414679));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = functionNode0.toSource((int) (byte) 1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope(9, 7);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int4 = functionNode3.getLp();
        functionNode3.setEncodedSource("");
        functionNode3.flattenSymbolTable(false);
        java.lang.String str9 = functionNode3.getName();
        functionNode3.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral14 = new com.google.javascript.rhino.head.ast.RegExpLiteral(35, 22);
        com.google.javascript.rhino.head.ast.Jump jump15 = new com.google.javascript.rhino.head.ast.Jump(6, (com.google.javascript.rhino.head.Node) regExpLiteral14);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator16 = jump15.new NodeIterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scope2.addChildBefore((com.google.javascript.rhino.head.Node) functionNode3, (com.google.javascript.rhino.head.Node) jump15);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLp((int) (short) 1);
        int int6 = functionNode0.getIntProp(4, 26);
        functionNode0.flattenSymbolTable(true);
        java.lang.Object obj9 = functionNode0.getCompilerData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = functionNode0.toSource(0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.google.javascript.rhino.head.ast.Jump jump2 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        int int6 = scriptNode4.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList7 = scriptNode4.getChildScopes();
        jump2.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        java.lang.String str9 = scriptNode4.debugPrint();
        java.lang.Object obj11 = scriptNode4.getProp((-1));
        int int12 = scriptNode4.getAbsolutePosition();
        scriptNode4.setEncodedSourceStart((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = scriptNode4.getRegexpFlags((int) '4');
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        functionNode0.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode3);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        int int14 = scriptNode13.getEncodedSourceEnd();
        java.lang.String str16 = scriptNode13.toSource((int) (byte) 10);
        scriptNode13.setEncodedSourceEnd((int) (short) -1);
        com.google.javascript.rhino.head.ast.Jump jump24 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump24.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump28 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump24, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int31 = scriptNode30.getEndLineno();
        int int32 = scriptNode30.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList33 = scriptNode30.getChildScopes();
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump24, (com.google.javascript.rhino.head.Node) scriptNode30);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int37 = scriptNode36.getEndLineno();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral39 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str41 = regExpLiteral39.toSource((int) (byte) 10);
        regExpLiteral39.setFlags("-1\tSCRIPT -1 1\n");
        regExpLiteral39.removeProp(8);
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node(10, node34, (com.google.javascript.rhino.head.Node) scriptNode36, (com.google.javascript.rhino.head.Node) regExpLiteral39, 3);
        java.lang.String str49 = regExpLiteral39.makeIndent((int) (short) 100);
        int int50 = regExpLiteral39.getType();
        boolean boolean51 = regExpLiteral39.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode3.replaceChild((com.google.javascript.rhino.head.Node) scriptNode13, (com.google.javascript.rhino.head.Node) regExpLiteral39);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.google.javascript.rhino.head.Token.CommentType commentType2 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment4 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType2, "109");
        comment4.putIntProp(0, 1);
        java.lang.String str8 = comment4.getValue();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral10 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral10.setFlags("-1\tSCRIPT -1 1\n");
        regExpLiteral10.setFlags("/null/-1\tSCRIPT -1 1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        comment4.removeChild((com.google.javascript.rhino.head.Node) regExpLiteral10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = scriptNode2.debugPrint();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        boolean boolean15 = functionNode11.isGenerator();
        int int16 = functionNode11.getFunctionType();
        com.google.javascript.rhino.head.Node node17 = functionNode11.getFirstChild();
        int int18 = functionNode11.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int20 = functionNode19.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str23 = functionNode19.toStringTree(scriptNode22);
        functionNode19.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode25 = functionNode19.getBody();
        functionNode19.setParens(21, (int) '#');
        functionNode11.addParam((com.google.javascript.rhino.head.ast.AstNode) functionNode19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = functionNode11.toSource(19);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str4 = functionNode0.toStringTree(scriptNode3);
        functionNode0.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode6 = functionNode0.getBody();
        functionNode0.setParens(21, (int) '#');
        int int10 = functionNode0.getLineno();
        functionNode0.setRp(9);
        com.google.javascript.rhino.head.ast.Jump jump16 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump16.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump20 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump16, 0);
        com.google.javascript.rhino.head.ast.Jump jump24 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump24.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump28 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump24, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int30 = functionNode29.getLp();
        functionNode29.setEncodedSource("");
        functionNode29.flattenSymbolTable(false);
        jump16.addChildAfter((com.google.javascript.rhino.head.Node) jump24, (com.google.javascript.rhino.head.Node) functionNode29);
        com.google.javascript.rhino.head.Node node36 = functionNode29.target;
        boolean boolean37 = functionNode29.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.Name name38 = functionNode29.getFunctionName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode39 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope41 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode42 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = functionNode42.getTop();
        functionNode42.setParens((int) (byte) 1, (int) (short) 1);
        functionNode42.setEncodedSourceStart((-1));
        functionNode42.setFunctionIsGetter();
        scope41.addChildToFront((com.google.javascript.rhino.head.Node) functionNode42);
        functionNode39.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode42);
        functionNode42.setRelative(0);
        functionNode29.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node55 = functionNode0.getChildBefore((com.google.javascript.rhino.head.Node) functionNode42);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode((-1));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int4 = scriptNode3.getEndLineno();
        int int5 = scriptNode3.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        jump8.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode10);
        java.lang.String str15 = scriptNode10.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode3, (com.google.javascript.rhino.head.ast.Scope) scriptNode10);
        int int17 = scriptNode3.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump20 = new com.google.javascript.rhino.head.ast.Jump(3, 13);
        functionNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode3, (com.google.javascript.rhino.head.Node) jump20);
        scriptNode3.setEncodedSourceEnd(11);
        int int24 = scriptNode3.getEncodedSourceEnd();
        scriptNode3.flattenSymbolTable(false);
        com.google.javascript.rhino.head.Node node27 = scriptNode3.target;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = scriptNode3.getFunctionNode(26);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLineno(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = functionNode0.toSource((int) '4');
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = functionNode0.getSymbols();
        int int5 = functionNode0.getLength();
        int int6 = functionNode0.depth();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = functionNode0.getRegexpFlags(774094395);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        int int2 = functionNode0.getRegexpCount();
        int int3 = functionNode0.getParamCount();
        com.google.javascript.rhino.head.ast.AstNode astNode4 = functionNode0.getBody();
        java.util.List<com.google.javascript.rhino.head.Node> nodeList5 = functionNode0.getResumptionPoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = functionNode0.toSource(0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = functionNode0.getSymbols();
        int int5 = functionNode0.getLength();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int7 = functionNode6.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str10 = functionNode6.toStringTree(scriptNode9);
        int int11 = scriptNode9.getRegexpCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node12 = functionNode0.getChildBefore((com.google.javascript.rhino.head.Node) scriptNode9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        functionNode1.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode1);
        int int7 = functionNode1.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator8 = functionNode1.new NodeIterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = functionNode1.getRegexpString(0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        boolean boolean15 = functionNode11.isGenerator();
        int int16 = functionNode11.getFunctionType();
        com.google.javascript.rhino.head.Node node17 = functionNode11.getNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = functionNode11.getFunctionNode((int) (byte) 10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int3 = functionNode2.getBaseLineno();
        boolean boolean4 = functionNode2.isGetter();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral6 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral6.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str9 = regExpLiteral6.getValue();
        regExpLiteral6.setFlags("52");
        functionNode2.addChildrenToFront((com.google.javascript.rhino.head.Node) regExpLiteral6);
        boolean boolean13 = functionNode2.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.Jump jump16 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int19 = scriptNode18.getEndLineno();
        int int20 = scriptNode18.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList21 = scriptNode18.getChildScopes();
        jump16.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode18);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor23 = scriptNode18.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int25 = functionNode24.getLp();
        functionNode24.setEncodedSource("");
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode18, (com.google.javascript.rhino.head.ast.Scope) functionNode24);
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) functionNode2, (com.google.javascript.rhino.head.Node) scriptNode18);
        int int30 = functionNode2.getAbsolutePosition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = functionNode2.toSource(9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = functionNode1.toSource(48);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral2 = new com.google.javascript.rhino.head.ast.RegExpLiteral((-1), 3);
        com.google.javascript.rhino.head.Node node4 = regExpLiteral2.setType((int) (short) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int7 = scriptNode6.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int10 = scriptNode9.getEndLineno();
        scriptNode6.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode9);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int13 = functionNode12.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = functionNode12.getTop();
        boolean boolean15 = functionNode12.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int18 = scriptNode17.getEndLineno();
        int int19 = scriptNode17.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump22 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int25 = scriptNode24.getEndLineno();
        int int26 = scriptNode24.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList27 = scriptNode24.getChildScopes();
        jump22.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode24);
        java.lang.String str29 = scriptNode24.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode17, (com.google.javascript.rhino.head.ast.Scope) scriptNode24);
        com.google.javascript.rhino.head.ast.Scope scope31 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode24.target = scope31;
        functionNode12.addChildScope(scope31);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode9, (com.google.javascript.rhino.head.ast.Scope) functionNode12);
        int int35 = functionNode12.getFunctionCount();
        int int36 = functionNode12.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        regExpLiteral2.removeChild((com.google.javascript.rhino.head.Node) functionNode12);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int3 = scriptNode2.getEndLineno();
        int int4 = scriptNode2.getBaseLineno();
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode2, (int) (byte) 0);
        com.google.javascript.rhino.head.ast.Scope scope10 = new com.google.javascript.rhino.head.ast.Scope(6, 4);
        java.lang.String str12 = scope10.toSource(8);
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node(22, (com.google.javascript.rhino.head.Node) scope10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int15 = functionNode14.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str18 = functionNode14.toStringTree(scriptNode17);
        int int19 = scriptNode17.getRegexpCount();
        com.google.javascript.rhino.head.Node node20 = scriptNode17.getLastSibling();
        int int21 = scriptNode17.getRegexpCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node6.replaceChildAfter((com.google.javascript.rhino.head.Node) scope10, (com.google.javascript.rhino.head.Node) scriptNode17);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.Scope scope3 = functionNode0.getDefiningScope("109");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral5 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str7 = regExpLiteral5.toSource((int) (byte) 10);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator8 = regExpLiteral5.new NodeIterator();
        java.lang.String str10 = regExpLiteral5.toSource(100);
        java.lang.String str11 = regExpLiteral5.getJsDoc();
        functionNode0.addResumptionPoint((com.google.javascript.rhino.head.Node) regExpLiteral5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = functionNode0.debugPrint();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setIsExpressionClosure(false);
        com.google.javascript.rhino.head.ast.Scope scope4 = functionNode0.getParentScope();
        int int5 = functionNode0.getFunctionType();
        int int6 = functionNode0.getRegexpCount();
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap7 = functionNode0.getLiveLocals();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = functionNode0.getRegexpFlags(0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLength(19);
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap4 = functionNode0.getLiveLocals();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = functionNode0.toSource((int) (short) 100);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        boolean boolean15 = functionNode11.isGenerator();
        int int16 = functionNode11.getFunctionType();
        com.google.javascript.rhino.head.Node node17 = functionNode11.getNext();
        functionNode11.setBounds(2, 17);
        com.google.javascript.rhino.head.Node node21 = functionNode11.target;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = functionNode11.toSource((int) (byte) 1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral1 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str3 = regExpLiteral1.toSource((int) (byte) 10);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator4 = regExpLiteral1.new NodeIterator();
        regExpLiteral1.setFlags("$0");
        int int7 = regExpLiteral1.getLineno();
        regExpLiteral1.removeProp((int) (byte) 100);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int11 = functionNode10.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = functionNode10.getTop();
        boolean boolean13 = functionNode10.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList14 = functionNode10.getSymbols();
        functionNode10.setRp(5);
        com.google.javascript.rhino.head.ast.Scope scope17 = functionNode10.getEnclosingScope();
        int int18 = functionNode10.getRp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node19 = regExpLiteral1.getChildBefore((com.google.javascript.rhino.head.Node) functionNode10);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        int int2 = functionNode0.getRegexpCount();
        functionNode0.setFunctionIsGetter();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap4 = functionNode0.getSymbolTable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = functionNode0.toSource(10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str1 = symbol0.getName();
        com.google.javascript.rhino.head.Node node2 = symbol0.getNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = new com.google.javascript.rhino.head.ast.FunctionNode((-1));
        symbol0.setNode((com.google.javascript.rhino.head.Node) functionNode4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = functionNode4.toSource(16);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        scriptNode1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.ast.Scope scope7 = scriptNode4.getParentScope();
        com.google.javascript.rhino.head.ast.Scope scope8 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode4.addChildrenToBack((com.google.javascript.rhino.head.Node) scope8);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int12 = scriptNode11.getEndLineno();
        int int13 = scriptNode11.getBaseLineno();
        com.google.javascript.rhino.head.Node node14 = scriptNode11.getNext();
        com.google.javascript.rhino.head.ast.Scope.joinScopes(scope8, (com.google.javascript.rhino.head.ast.Scope) scriptNode11);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode17 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode18 = functionNode17.getEnclosingFunction();
        com.google.javascript.rhino.head.Node node19 = functionNode17.target;
        functionNode17.setLineno((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode();
        int int23 = scriptNode22.getEncodedSourceEnd();
        java.lang.String str25 = scriptNode22.toSource((int) (byte) 10);
        int int26 = scriptNode22.depth();
        boolean boolean27 = scriptNode22.hasChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scope8.replaceChild((com.google.javascript.rhino.head.Node) functionNode17, (com.google.javascript.rhino.head.Node) scriptNode22);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        jump17.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor24 = scriptNode19.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int26 = functionNode25.getLp();
        functionNode25.setEncodedSource("");
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode19, (com.google.javascript.rhino.head.ast.Scope) functionNode25);
        com.google.javascript.rhino.head.ast.Jump jump34 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump34.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump38 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump34, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int41 = scriptNode40.getEndLineno();
        int int42 = scriptNode40.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList43 = scriptNode40.getChildScopes();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump34, (com.google.javascript.rhino.head.Node) scriptNode40);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList45 = scriptNode40.getFunctions();
        functionNodeList45.clear();
        int int48 = functionNodeList45.lastIndexOf((java.lang.Object) (-1L));
        com.google.javascript.rhino.head.ast.Jump jump53 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump53.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump57 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump53, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int60 = scriptNode59.getEndLineno();
        int int61 = scriptNode59.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList62 = scriptNode59.getChildScopes();
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump53, (com.google.javascript.rhino.head.Node) scriptNode59);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList64 = scriptNode59.getFunctions();
        functionNodeList64.clear();
        int int67 = functionNodeList64.lastIndexOf((java.lang.Object) (-1L));
        boolean boolean68 = functionNodeList45.removeAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList64);
        com.google.javascript.rhino.head.ast.Jump jump73 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump73.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump77 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump73, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode79 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int80 = scriptNode79.getEndLineno();
        int int81 = scriptNode79.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList82 = scriptNode79.getChildScopes();
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump73, (com.google.javascript.rhino.head.Node) scriptNode79);
        com.google.javascript.rhino.head.Node node85 = scriptNode79.setType(0);
        int int86 = functionNodeList64.lastIndexOf((java.lang.Object) scriptNode79);
        functionNode11.addChildAfter((com.google.javascript.rhino.head.Node) functionNode25, (com.google.javascript.rhino.head.Node) scriptNode79);
        int int88 = functionNode25.getRegexpCount();
        functionNode25.setFunctionIsGetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str91 = functionNode25.toSource((int) (byte) -1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str1 = symbol0.getName();
        com.google.javascript.rhino.head.Node node2 = symbol0.getNode();
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) ' ');
        symbol0.setNode((com.google.javascript.rhino.head.Node) jump4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int8 = functionNode7.getBaseLineno();
        functionNode7.setSourceName("                                                                                                                                                                                                        /null/");
        symbol0.setContainingTable((com.google.javascript.rhino.head.ast.Scope) functionNode7);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int13 = functionNode12.getLp();
        functionNode12.setLp((int) (short) 1);
        int int18 = functionNode12.getIntProp(4, 26);
        functionNode12.flattenSymbolTable(true);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList21 = functionNode12.getParams();
        functionNode7.setParams(astNodeList21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = functionNode7.debugPrint();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int3 = functionNode2.getLp();
        functionNode2.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int7 = functionNode6.getLp();
        functionNode6.setEncodedSource("");
        functionNode6.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int13 = functionNode12.getLp();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode2, (com.google.javascript.rhino.head.Node) functionNode6, (com.google.javascript.rhino.head.Node) functionNode12, (int) '#');
        functionNode12.setEncodedSourceStart(25);
        boolean boolean18 = functionNode12.requiresActivation();
        java.lang.String str19 = functionNode12.getNextTempName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = functionNode21.getTop();
        functionNode21.setParens((int) (byte) 1, (int) (short) 1);
        int int26 = functionNode21.getRp();
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newString((int) (byte) 100, "");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode30 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int31 = functionNode30.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str34 = functionNode30.toStringTree(scriptNode33);
        com.google.javascript.rhino.head.ast.Scope scope36 = scriptNode33.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList37 = scriptNode33.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int40 = scriptNode39.getEndLineno();
        int int41 = scriptNode39.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode33, (com.google.javascript.rhino.head.ast.Scope) scriptNode39);
        java.lang.String str43 = scriptNode39.getEncodedSource();
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(136, (com.google.javascript.rhino.head.Node) functionNode21, node29, (com.google.javascript.rhino.head.Node) scriptNode39, (int) (short) 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode46 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int47 = functionNode46.getLp();
        functionNode46.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode50 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope52 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode53 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = functionNode53.getTop();
        functionNode53.setParens((int) (byte) 1, (int) (short) 1);
        functionNode53.setEncodedSourceStart((-1));
        functionNode53.setFunctionIsGetter();
        scope52.addChildToFront((com.google.javascript.rhino.head.Node) functionNode53);
        functionNode50.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode53);
        int int63 = functionNode46.addFunction(functionNode50);
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) functionNode12, (com.google.javascript.rhino.head.Node) scriptNode39, (com.google.javascript.rhino.head.Node) functionNode50, 3);
        java.lang.String str66 = functionNode50.getJsDoc();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str67 = functionNode50.debugPrint();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral1 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str3 = regExpLiteral1.toSource((int) (byte) 10);
        regExpLiteral1.setFlags("-1\tSCRIPT -1 1\n");
        regExpLiteral1.removeProp(8);
        java.lang.String str8 = regExpLiteral1.getValue();
        regExpLiteral1.setLineno(10);
        java.lang.String str12 = regExpLiteral1.toSource(4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int14 = functionNode13.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = functionNode13.getTop();
        boolean boolean16 = functionNode13.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int19 = scriptNode18.getEndLineno();
        int int20 = scriptNode18.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump23 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int26 = scriptNode25.getEndLineno();
        int int27 = scriptNode25.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList28 = scriptNode25.getChildScopes();
        jump23.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode25);
        java.lang.String str30 = scriptNode25.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode18, (com.google.javascript.rhino.head.ast.Scope) scriptNode25);
        com.google.javascript.rhino.head.ast.Scope scope32 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode25.target = scope32;
        functionNode13.addChildScope(scope32);
        boolean boolean35 = functionNode13.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode36 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = functionNode36.getTop();
        functionNode36.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode41 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope43 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode44 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = functionNode44.getTop();
        functionNode44.setParens((int) (byte) 1, (int) (short) 1);
        functionNode44.setEncodedSourceStart((-1));
        functionNode44.setFunctionIsGetter();
        scope43.addChildToFront((com.google.javascript.rhino.head.Node) functionNode44);
        functionNode41.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode44);
        functionNode41.setFunctionIsSetter();
        int int55 = functionNode36.addFunction(functionNode41);
        java.lang.String str56 = functionNode36.getNextTempName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode58 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int59 = scriptNode58.getEndLineno();
        int int60 = scriptNode58.getBaseLineno();
        scriptNode58.removeProp(0);
        scriptNode58.setEncodedSourceEnd(19);
        functionNode36.addParam((com.google.javascript.rhino.head.ast.AstNode) scriptNode58);
        functionNode13.addChildrenToFront((com.google.javascript.rhino.head.Node) scriptNode58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node67 = regExpLiteral1.getChildBefore((com.google.javascript.rhino.head.Node) scriptNode58);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int6 = scriptNode5.getEndLineno();
        int int7 = scriptNode5.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = scriptNode12.getChildScopes();
        jump10.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode12);
        java.lang.String str17 = scriptNode12.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode5, (com.google.javascript.rhino.head.ast.Scope) scriptNode12);
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode12.target = scope19;
        functionNode0.addChildScope(scope19);
        boolean boolean22 = functionNode0.hasConsistentReturnUsage();
        boolean boolean23 = functionNode0.hasSideEffects();
        functionNode0.setLp((-1262414679));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = functionNode0.toSource();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) '#');
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral3 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str5 = regExpLiteral3.toSource((int) (byte) 10);
        regExpLiteral3.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str9 = regExpLiteral3.toSource((int) (short) -1);
        regExpLiteral3.setFlags("EOF");
        java.lang.String str13 = regExpLiteral3.makeIndent(10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode15 = new com.google.javascript.rhino.head.ast.FunctionNode((-1));
        boolean boolean16 = functionNode15.isExpressionClosure();
        int int17 = regExpLiteral3.compareTo((com.google.javascript.rhino.head.ast.AstNode) functionNode15);
        boolean boolean18 = functionNode15.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int21 = functionNode20.getLp();
        functionNode20.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int25 = functionNode24.getLp();
        functionNode24.setEncodedSource("");
        functionNode24.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode30 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int31 = functionNode30.getLp();
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode20, (com.google.javascript.rhino.head.Node) functionNode24, (com.google.javascript.rhino.head.Node) functionNode30, (int) '#');
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap34 = functionNode24.getSymbolTable();
        java.lang.String str35 = functionNode24.shortName();
        int int36 = functionNode24.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild((com.google.javascript.rhino.head.Node) functionNode15, (com.google.javascript.rhino.head.Node) functionNode24);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList15 = scriptNode10.getFunctions();
        functionNodeList15.clear();
        functionNodeList15.clear();
        com.google.javascript.rhino.head.ast.Jump jump22 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump22.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump26 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump22, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int29 = scriptNode28.getEndLineno();
        int int30 = scriptNode28.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList31 = scriptNode28.getChildScopes();
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump22, (com.google.javascript.rhino.head.Node) scriptNode28);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList33 = scriptNode28.getFunctions();
        java.util.Spliterator<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeSpliterator34 = functionNodeList33.spliterator();
        int int36 = functionNodeList33.indexOf((java.lang.Object) (byte) 10);
        boolean boolean37 = functionNodeList15.retainAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList33);
        boolean boolean38 = functionNodeList15.isEmpty();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int41 = scriptNode40.getEndLineno();
        int int42 = scriptNode40.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump45 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int48 = scriptNode47.getEndLineno();
        int int49 = scriptNode47.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList50 = scriptNode47.getChildScopes();
        jump45.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode47);
        java.lang.String str52 = scriptNode47.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode40, (com.google.javascript.rhino.head.ast.Scope) scriptNode47);
        int int54 = scriptNode40.getBaseLineno();
        boolean boolean55 = functionNodeList15.equals((java.lang.Object) int54);
        com.google.javascript.rhino.head.ast.Jump jump58 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int61 = scriptNode60.getEndLineno();
        int int62 = scriptNode60.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList63 = scriptNode60.getChildScopes();
        jump58.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode60);
        boolean boolean65 = functionNodeList15.equals((java.lang.Object) scriptNode60);
        com.google.javascript.rhino.head.Node node66 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode68 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode69 = functionNode68.getTop();
        java.lang.String str70 = scriptNode69.getJsDoc();
        com.google.javascript.rhino.head.Node node72 = scriptNode69.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode73 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int74 = functionNode73.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode76 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str77 = functionNode73.toStringTree(scriptNode76);
        com.google.javascript.rhino.head.ast.Scope scope79 = scriptNode76.getDefiningScope("");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode81 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int82 = scriptNode81.getEndLineno();
        int int83 = scriptNode81.getBaseLineno();
        com.google.javascript.rhino.head.Node node84 = new com.google.javascript.rhino.head.Node(25, node72, (com.google.javascript.rhino.head.Node) scriptNode76, (com.google.javascript.rhino.head.Node) scriptNode81);
        java.lang.String str85 = node66.toStringTree(scriptNode81);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode60.removeChild((com.google.javascript.rhino.head.Node) scriptNode81);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) (byte) 100, "");
        com.google.javascript.rhino.head.Token.CommentType commentType7 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment9 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType7, "109");
        com.google.javascript.rhino.head.ast.Comment comment11 = new com.google.javascript.rhino.head.ast.Comment(136, 15, commentType7, "-1\tSCRIPT -1 1\n");
        com.google.javascript.rhino.head.Token.CommentType commentType12 = com.google.javascript.rhino.head.Token.CommentType.JSDOC;
        comment11.setCommentType(commentType12);
        com.google.javascript.rhino.head.Token.CommentType commentType14 = com.google.javascript.rhino.head.Token.CommentType.JSDOC;
        comment11.setCommentType(commentType14);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator16 = comment11.new NodeIterator();
        node2.setJsDocNode(comment11);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode18 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = functionNode18.getTop();
        functionNode18.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode23 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope25 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = functionNode26.getTop();
        functionNode26.setParens((int) (byte) 1, (int) (short) 1);
        functionNode26.setEncodedSourceStart((-1));
        functionNode26.setFunctionIsGetter();
        scope25.addChildToFront((com.google.javascript.rhino.head.Node) functionNode26);
        functionNode23.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode26);
        functionNode23.setFunctionIsSetter();
        int int37 = functionNode18.addFunction(functionNode23);
        boolean boolean38 = functionNode23.isGenerator();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList39 = functionNode23.getFunctions();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList40 = functionNode23.getStatements();
        int int41 = functionNode23.getParamCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild((com.google.javascript.rhino.head.Node) functionNode23);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        int int5 = functionNode0.getRp();
        int int6 = functionNode0.getAbsolutePosition();
        com.google.javascript.rhino.head.ast.AstNode astNode7 = functionNode0.getMemberExprNode();
        int int8 = functionNode0.getBaseLineno();
        java.lang.String str9 = functionNode0.shortName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = functionNode10.getTop();
        functionNode10.setParens((int) (byte) 1, (int) (short) 1);
        functionNode10.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList17 = functionNode10.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope19 = functionNode10.getDefiningScope("hi!");
        boolean boolean20 = functionNode10.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int22 = functionNode21.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = functionNode21.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode24 = functionNode21.getBody();
        int int25 = functionNode21.getLength();
        com.google.javascript.rhino.head.ast.Jump jump28 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int31 = scriptNode30.getEndLineno();
        int int32 = scriptNode30.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList33 = scriptNode30.getChildScopes();
        jump28.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode30);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode36 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int37 = functionNode36.getLp();
        functionNode36.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode40 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int41 = functionNode40.getLp();
        functionNode40.setEncodedSource("");
        functionNode40.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode46 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int47 = functionNode46.getLp();
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode36, (com.google.javascript.rhino.head.Node) functionNode40, (com.google.javascript.rhino.head.Node) functionNode46, (int) '#');
        jump28.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode36);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList51 = functionNode36.getStatements();
        functionNode21.setParams(astNodeList51);
        functionNode10.addChild((com.google.javascript.rhino.head.ast.AstNode) functionNode21);
        java.util.List<com.google.javascript.rhino.head.Node> nodeList54 = functionNode21.getResumptionPoints();
        com.google.javascript.rhino.head.Token.CommentType commentType57 = com.google.javascript.rhino.head.Token.CommentType.LINE;
        com.google.javascript.rhino.head.ast.Comment comment59 = new com.google.javascript.rhino.head.ast.Comment((int) (short) 1, (int) (byte) 100, commentType57, "                                                                                                                                                                                                        ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode0.replaceChild((com.google.javascript.rhino.head.Node) functionNode21, (com.google.javascript.rhino.head.Node) comment59);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int3 = functionNode2.getLp();
        functionNode2.setLp((int) (short) 1);
        int int8 = functionNode2.getIntProp(4, 26);
        com.google.javascript.rhino.head.ast.Jump jump9 = new com.google.javascript.rhino.head.ast.Jump(3, (com.google.javascript.rhino.head.Node) functionNode2);
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) functionNode2);
        functionNode2.setFunctionType(11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = functionNode2.getRegexpFlags(830992929);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = functionNode1.debugPrint();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        com.google.javascript.rhino.head.ast.Comment comment15 = functionNode11.getJsDocNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = functionNode19.getTop();
        functionNode19.setParens((int) (byte) 1, (int) (short) 1);
        functionNode19.setEncodedSourceStart((-1));
        functionNode19.setFunctionIsGetter();
        scope18.addChildToFront((com.google.javascript.rhino.head.Node) functionNode19);
        functionNode16.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode19);
        boolean boolean29 = functionNode11.isParam((com.google.javascript.rhino.head.ast.AstNode) functionNode16);
        functionNode11.setFunctionType(13);
        functionNode11.setRp(19);
        boolean boolean34 = functionNode11.isGenerator();
        java.util.List<com.google.javascript.rhino.head.Node> nodeList35 = functionNode11.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Symbol symbol37 = functionNode11.getSymbol("            {\n            }\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = functionNode11.toSource(9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.google.javascript.rhino.head.ast.Jump jump2 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        int int6 = scriptNode4.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList7 = scriptNode4.getChildScopes();
        jump2.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int11 = functionNode10.getLp();
        functionNode10.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int15 = functionNode14.getLp();
        functionNode14.setEncodedSource("");
        functionNode14.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int21 = functionNode20.getLp();
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode10, (com.google.javascript.rhino.head.Node) functionNode14, (com.google.javascript.rhino.head.Node) functionNode20, (int) '#');
        jump2.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode10);
        int int25 = functionNode10.getLength();
        java.lang.String str26 = functionNode10.getName();
        functionNode10.removeChildren();
        functionNode10.setRequiresActivation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = functionNode10.getRegexpString(16);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int3 = scriptNode2.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol5 = scriptNode2.getSymbol("hi!");
        java.lang.String str6 = scriptNode2.getEncodedSource();
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) (byte) 10, (com.google.javascript.rhino.head.Node) scriptNode2);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList8 = scriptNode2.getChildScopes();
        int int9 = scriptNode2.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = scriptNode2.getFunctionNode((int) (short) 10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = functionNode1.getEnclosingFunction();
        com.google.javascript.rhino.head.Node node3 = functionNode1.target;
        functionNode1.setLineno((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = functionNode1.toSource(136);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList15 = scriptNode10.getFunctions();
        java.util.Spliterator<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeSpliterator16 = functionNodeList15.spliterator();
        int int18 = functionNodeList15.indexOf((java.lang.Object) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope((-1));
        java.lang.String str22 = scope20.toSource((int) (byte) 1);
        boolean boolean23 = functionNodeList15.equals((java.lang.Object) scope20);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int26 = functionNode25.getLp();
        functionNode25.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int30 = functionNode29.getLp();
        functionNode29.setEncodedSource("");
        functionNode29.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode35 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int36 = functionNode35.getLp();
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode25, (com.google.javascript.rhino.head.Node) functionNode29, (com.google.javascript.rhino.head.Node) functionNode35, (int) '#');
        com.google.javascript.rhino.head.ast.Comment comment39 = functionNode35.getJsDocNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode40 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope42 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode43 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = functionNode43.getTop();
        functionNode43.setParens((int) (byte) 1, (int) (short) 1);
        functionNode43.setEncodedSourceStart((-1));
        functionNode43.setFunctionIsGetter();
        scope42.addChildToFront((com.google.javascript.rhino.head.Node) functionNode43);
        functionNode40.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode43);
        boolean boolean53 = functionNode35.isParam((com.google.javascript.rhino.head.ast.AstNode) functionNode40);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode55 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int56 = scriptNode55.getEndLineno();
        int int57 = scriptNode55.getBaseLineno();
        com.google.javascript.rhino.head.Node node58 = scriptNode55.getNext();
        scriptNode55.setEndLineno((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scope20.addChildBefore((com.google.javascript.rhino.head.Node) functionNode35, (com.google.javascript.rhino.head.Node) scriptNode55);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(26);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode(5);
        int int4 = functionNode1.compareTo((com.google.javascript.rhino.head.ast.AstNode) functionNode3);
        functionNode1.setLp((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = functionNode1.getFunctionNode(18);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList15 = scriptNode10.getFunctions();
        int int16 = scriptNode10.getPosition();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList17 = scriptNode10.getChildScopes();
        int int18 = scriptNode10.getEncodedSourceEnd();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList19 = scriptNode10.getSymbols();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = scriptNode10.getFunctionNode(20);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.AstNode astNode1 = functionNode0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = functionNode0.toSource((-18802601));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = functionNode0.getAstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode3 = functionNode0.getMemberExprNode();
        boolean boolean4 = functionNode0.isSetter();
        int int5 = functionNode0.getFunctionCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = functionNode0.getRegexpString(136);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.google.javascript.rhino.head.ast.Jump jump1 = new com.google.javascript.rhino.head.ast.Jump((int) '4');
        jump1.setRelative(1579347477);
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString(13, "/null/-1\tSCRIPT -1 1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node7 = jump1.getChildBefore(node6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(13);
        int int2 = functionNode1.getType();
        functionNode1.setRelative(350469479);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = functionNode1.toSource(161);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        int int3 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int5 = functionNode4.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str8 = functionNode4.toStringTree(scriptNode7);
        functionNode4.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode10 = functionNode4.getBody();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList11 = functionNode4.getParams();
        scriptNode1.replaceWith((com.google.javascript.rhino.head.ast.Scope) functionNode4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = functionNode4.getFunctionNode((-1262414679));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setEncodedSource("");
        functionNode0.flattenSymbolTable(false);
        java.lang.String str6 = functionNode0.getName();
        boolean boolean7 = functionNode0.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.Name name8 = functionNode0.getFunctionName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = functionNode0.getFunctionNode((int) (short) 10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        functionNode1.setParens((int) (byte) 1, (int) (short) 1);
        functionNode1.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList8 = functionNode1.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope10 = functionNode1.getDefiningScope("hi!");
        boolean boolean11 = functionNode1.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.Scope scope13 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        int[] intArray20 = new int[] { 25, 17, (short) 0, 20, 19, (byte) 1 };
        functionNode1.addLiveLocals((com.google.javascript.rhino.head.Node) scope13, intArray20);
        com.google.javascript.rhino.head.Node node23 = functionNode1.setType(100);
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(10, (com.google.javascript.rhino.head.Node) functionNode1, (int) 'a');
        functionNode1.setSourceName("                                            {\n                                            }\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = functionNode1.getFunctionNode(1579347477);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = functionNode0.getSymbols();
        int int5 = functionNode0.getLength();
        int int6 = functionNode0.getRegexpCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int9 = functionNode8.getLp();
        functionNode8.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int13 = functionNode12.getLp();
        functionNode12.setEncodedSource("");
        functionNode12.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode18 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int19 = functionNode18.getLp();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode8, (com.google.javascript.rhino.head.Node) functionNode12, (com.google.javascript.rhino.head.Node) functionNode18, (int) '#');
        com.google.javascript.rhino.head.ast.Comment comment22 = functionNode18.getJsDocNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode23 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope25 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = functionNode26.getTop();
        functionNode26.setParens((int) (byte) 1, (int) (short) 1);
        functionNode26.setEncodedSourceStart((-1));
        functionNode26.setFunctionIsGetter();
        scope25.addChildToFront((com.google.javascript.rhino.head.Node) functionNode26);
        functionNode23.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode26);
        boolean boolean36 = functionNode18.isParam((com.google.javascript.rhino.head.ast.AstNode) functionNode23);
        int int37 = functionNode23.getLp();
        int int38 = functionNode23.getEncodedSourceEnd();
        int int39 = functionNode0.addFunction(functionNode23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str40 = functionNode23.toSource();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.google.javascript.rhino.head.ast.Jump jump3 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump3.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump3, 0);
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump11.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump15 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump11, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int17 = functionNode16.getLp();
        functionNode16.setEncodedSource("");
        functionNode16.flattenSymbolTable(false);
        jump3.addChildAfter((com.google.javascript.rhino.head.Node) jump11, (com.google.javascript.rhino.head.Node) functionNode16);
        com.google.javascript.rhino.head.Node node23 = functionNode16.target;
        boolean boolean24 = functionNode16.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.Name name25 = functionNode16.getFunctionName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = functionNode29.getTop();
        functionNode29.setParens((int) (byte) 1, (int) (short) 1);
        functionNode29.setEncodedSourceStart((-1));
        functionNode29.setFunctionIsGetter();
        scope28.addChildToFront((com.google.javascript.rhino.head.Node) functionNode29);
        functionNode26.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode29);
        functionNode29.setRelative(0);
        functionNode16.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode29);
        boolean boolean42 = functionNode16.isGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str44 = functionNode16.getRegexpFlags(819764875);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int6 = scriptNode5.getEndLineno();
        int int7 = scriptNode5.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = scriptNode12.getChildScopes();
        jump10.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode12);
        java.lang.String str17 = scriptNode12.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode5, (com.google.javascript.rhino.head.ast.Scope) scriptNode12);
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode12.target = scope19;
        functionNode0.addChildScope(scope19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = functionNode0.toSource((-18802601));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(13);
        int int2 = functionNode1.getType();
        functionNode1.setRelative(350469479);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = functionNode1.getFunctionNode(21);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        functionNode1.setParens((int) (byte) 1, (int) (short) 1);
        int int6 = functionNode1.getRp();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString((int) (byte) 100, "");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int11 = functionNode10.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str14 = functionNode10.toStringTree(scriptNode13);
        com.google.javascript.rhino.head.ast.Scope scope16 = scriptNode13.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList17 = scriptNode13.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode13, (com.google.javascript.rhino.head.ast.Scope) scriptNode19);
        java.lang.String str23 = scriptNode19.getEncodedSource();
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(136, (com.google.javascript.rhino.head.Node) functionNode1, node9, (com.google.javascript.rhino.head.Node) scriptNode19, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = scriptNode19.getRegexpString(193715443);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor5 = functionNode0.iterator();
        int int6 = functionNode0.getParamCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = functionNode0.getRegexpFlags((int) (byte) 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        int int3 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node4 = scriptNode1.getNext();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getFirstChild();
        java.lang.String str7 = scriptNode1.toSource(6);
        com.google.javascript.rhino.head.ast.Jump jump12 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump12.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump16 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump12, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int19 = scriptNode18.getEndLineno();
        int int20 = scriptNode18.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList21 = scriptNode18.getChildScopes();
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump12, (com.google.javascript.rhino.head.Node) scriptNode18);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList23 = scriptNode18.getChildScopes();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList24 = scriptNode18.getSymbols();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int27 = functionNode26.getLp();
        functionNode26.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode30 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int31 = functionNode30.getLp();
        functionNode30.setEncodedSource("");
        functionNode30.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode36 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int37 = functionNode36.getLp();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode26, (com.google.javascript.rhino.head.Node) functionNode30, (com.google.javascript.rhino.head.Node) functionNode36, (int) '#');
        com.google.javascript.rhino.head.ast.Comment comment40 = functionNode36.getJsDocNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode41 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope43 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode44 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = functionNode44.getTop();
        functionNode44.setParens((int) (byte) 1, (int) (short) 1);
        functionNode44.setEncodedSourceStart((-1));
        functionNode44.setFunctionIsGetter();
        scope43.addChildToFront((com.google.javascript.rhino.head.Node) functionNode44);
        functionNode41.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode44);
        boolean boolean54 = functionNode36.isParam((com.google.javascript.rhino.head.ast.AstNode) functionNode41);
        scriptNode18.addChildrenToBack((com.google.javascript.rhino.head.Node) functionNode36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode1.removeChild((com.google.javascript.rhino.head.Node) scriptNode18);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        jump17.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor24 = scriptNode19.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int26 = functionNode25.getLp();
        functionNode25.setEncodedSource("");
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode19, (com.google.javascript.rhino.head.ast.Scope) functionNode25);
        com.google.javascript.rhino.head.ast.Jump jump34 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump34.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump38 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump34, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int41 = scriptNode40.getEndLineno();
        int int42 = scriptNode40.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList43 = scriptNode40.getChildScopes();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump34, (com.google.javascript.rhino.head.Node) scriptNode40);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList45 = scriptNode40.getFunctions();
        functionNodeList45.clear();
        int int48 = functionNodeList45.lastIndexOf((java.lang.Object) (-1L));
        com.google.javascript.rhino.head.ast.Jump jump53 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump53.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump57 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump53, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int60 = scriptNode59.getEndLineno();
        int int61 = scriptNode59.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList62 = scriptNode59.getChildScopes();
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump53, (com.google.javascript.rhino.head.Node) scriptNode59);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList64 = scriptNode59.getFunctions();
        functionNodeList64.clear();
        int int67 = functionNodeList64.lastIndexOf((java.lang.Object) (-1L));
        boolean boolean68 = functionNodeList45.removeAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList64);
        com.google.javascript.rhino.head.ast.Jump jump73 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump73.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump77 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump73, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode79 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int80 = scriptNode79.getEndLineno();
        int int81 = scriptNode79.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList82 = scriptNode79.getChildScopes();
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump73, (com.google.javascript.rhino.head.Node) scriptNode79);
        com.google.javascript.rhino.head.Node node85 = scriptNode79.setType(0);
        int int86 = functionNodeList64.lastIndexOf((java.lang.Object) scriptNode79);
        functionNode11.addChildAfter((com.google.javascript.rhino.head.Node) functionNode25, (com.google.javascript.rhino.head.Node) scriptNode79);
        java.lang.String str88 = functionNode11.getNextTempName();
        boolean boolean89 = functionNode11.hasSideEffects();
        boolean boolean90 = functionNode11.requiresActivation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str92 = functionNode11.getRegexpFlags(20);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.google.javascript.rhino.head.ast.Jump jump1 = new com.google.javascript.rhino.head.ast.Jump(26);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode2.getTop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node4 = jump1.getChildBefore((com.google.javascript.rhino.head.Node) functionNode2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        functionNode1.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode1);
        functionNode1.setRequiresActivation();
        java.lang.String str8 = functionNode1.shortName();
        int int9 = functionNode1.getBaseLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = functionNode1.getFunctionNode(12);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str1 = symbol0.getName();
        com.google.javascript.rhino.head.Node node2 = symbol0.getNode();
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) ' ');
        symbol0.setNode((com.google.javascript.rhino.head.Node) jump4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int8 = functionNode7.getBaseLineno();
        functionNode7.setSourceName("                                                                                                                                                                                                        /null/");
        symbol0.setContainingTable((com.google.javascript.rhino.head.ast.Scope) functionNode7);
        java.lang.String str12 = functionNode7.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = functionNode7.getRegexpString(7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        java.lang.String str3 = scriptNode2.getJsDoc();
        com.google.javascript.rhino.head.Node node5 = scriptNode2.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int7 = functionNode6.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str10 = functionNode6.toStringTree(scriptNode9);
        com.google.javascript.rhino.head.ast.Scope scope12 = scriptNode9.getDefiningScope("");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int15 = scriptNode14.getEndLineno();
        int int16 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node(25, node5, (com.google.javascript.rhino.head.Node) scriptNode9, (com.google.javascript.rhino.head.Node) scriptNode14);
        boolean boolean18 = scriptNode14.hasConsistentReturnUsage();
        java.lang.String str19 = scriptNode14.getNextTempName();
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node(774094395, (-14761645));
        scriptNode14.target = node22;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = scriptNode14.getRegexpFlags(350469479);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        functionNode1.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int8 = functionNode7.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode7.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode10 = functionNode7.getBody();
        int int11 = functionNode7.getLength();
        com.google.javascript.rhino.head.ast.Jump jump14 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int17 = scriptNode16.getEndLineno();
        int int18 = scriptNode16.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList19 = scriptNode16.getChildScopes();
        jump14.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode16);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode22 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int23 = functionNode22.getLp();
        functionNode22.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int27 = functionNode26.getLp();
        functionNode26.setEncodedSource("");
        functionNode26.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode32 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int33 = functionNode32.getLp();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode22, (com.google.javascript.rhino.head.Node) functionNode26, (com.google.javascript.rhino.head.Node) functionNode32, (int) '#');
        jump14.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode22);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList37 = functionNode22.getStatements();
        functionNode7.setParams(astNodeList37);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode39 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int40 = functionNode39.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = functionNode39.getTop();
        com.google.javascript.rhino.head.Node node42 = functionNode39.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList43 = functionNode39.getParams();
        functionNode7.setParams(astNodeList43);
        functionNode1.addParam((com.google.javascript.rhino.head.ast.AstNode) functionNode7);
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral47 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) '#');
        java.lang.String str48 = regExpLiteral47.shortName();
        functionNode1.addRegExp(regExpLiteral47);
        boolean boolean50 = functionNode1.hasSideEffects();
        java.lang.String str51 = functionNode1.shortName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str53 = functionNode1.toSource(13);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        boolean boolean3 = functionNode1.isExpressionClosure();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = functionNode1.getRegexpString(628528643);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        functionNode1.setParens((int) (byte) 1, (int) (short) 1);
        int int6 = functionNode1.getRp();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString((int) (byte) 100, "");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int11 = functionNode10.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str14 = functionNode10.toStringTree(scriptNode13);
        com.google.javascript.rhino.head.ast.Scope scope16 = scriptNode13.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList17 = scriptNode13.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode13, (com.google.javascript.rhino.head.ast.Scope) scriptNode19);
        java.lang.String str23 = scriptNode19.getEncodedSource();
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(136, (com.google.javascript.rhino.head.Node) functionNode1, node9, (com.google.javascript.rhino.head.Node) scriptNode19, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = functionNode1.toSource(12);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        java.lang.String str3 = scriptNode2.getJsDoc();
        com.google.javascript.rhino.head.Node node5 = scriptNode2.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int7 = functionNode6.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str10 = functionNode6.toStringTree(scriptNode9);
        com.google.javascript.rhino.head.ast.Scope scope12 = scriptNode9.getDefiningScope("");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int15 = scriptNode14.getEndLineno();
        int int16 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node(25, node5, (com.google.javascript.rhino.head.Node) scriptNode9, (com.google.javascript.rhino.head.Node) scriptNode14);
        boolean boolean18 = scriptNode14.hasConsistentReturnUsage();
        java.lang.String str19 = scriptNode14.getNextTempName();
        java.lang.String str20 = scriptNode14.shortName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int22 = functionNode21.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = functionNode21.getTop();
        boolean boolean24 = functionNode21.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList25 = functionNode21.getSymbols();
        scriptNode14.setSymbols(symbolList25);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int30 = functionNode29.getLp();
        functionNode29.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode33 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int34 = functionNode33.getLp();
        functionNode33.setEncodedSource("");
        functionNode33.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode39 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int40 = functionNode39.getLp();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode29, (com.google.javascript.rhino.head.Node) functionNode33, (com.google.javascript.rhino.head.Node) functionNode39, (int) '#');
        functionNode39.setEncodedSourceStart(25);
        boolean boolean45 = functionNode39.requiresActivation();
        java.lang.String str46 = functionNode39.getNextTempName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode48 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = functionNode48.getTop();
        functionNode48.setParens((int) (byte) 1, (int) (short) 1);
        int int53 = functionNode48.getRp();
        com.google.javascript.rhino.head.Node node56 = com.google.javascript.rhino.head.Node.newString((int) (byte) 100, "");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode57 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int58 = functionNode57.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str61 = functionNode57.toStringTree(scriptNode60);
        com.google.javascript.rhino.head.ast.Scope scope63 = scriptNode60.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList64 = scriptNode60.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int67 = scriptNode66.getEndLineno();
        int int68 = scriptNode66.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode60, (com.google.javascript.rhino.head.ast.Scope) scriptNode66);
        java.lang.String str70 = scriptNode66.getEncodedSource();
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node(136, (com.google.javascript.rhino.head.Node) functionNode48, node56, (com.google.javascript.rhino.head.Node) scriptNode66, (int) (short) 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode73 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int74 = functionNode73.getLp();
        functionNode73.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode77 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope79 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode80 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode81 = functionNode80.getTop();
        functionNode80.setParens((int) (byte) 1, (int) (short) 1);
        functionNode80.setEncodedSourceStart((-1));
        functionNode80.setFunctionIsGetter();
        scope79.addChildToFront((com.google.javascript.rhino.head.Node) functionNode80);
        functionNode77.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode80);
        int int90 = functionNode73.addFunction(functionNode77);
        com.google.javascript.rhino.head.Node node92 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) functionNode39, (com.google.javascript.rhino.head.Node) scriptNode66, (com.google.javascript.rhino.head.Node) functionNode77, 3);
        scriptNode14.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode66);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode94 = scriptNode14.getTop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode96 = scriptNode14.getFunctionNode((-13));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = functionNode0.getSymbols();
        int int5 = functionNode0.getLength();
        boolean boolean6 = functionNode0.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump10.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump14 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump10, 0);
        com.google.javascript.rhino.head.ast.Jump jump18 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump18.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump22 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump18, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode23 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int24 = functionNode23.getLp();
        functionNode23.setEncodedSource("");
        functionNode23.flattenSymbolTable(false);
        jump10.addChildAfter((com.google.javascript.rhino.head.Node) jump18, (com.google.javascript.rhino.head.Node) functionNode23);
        functionNode0.setBody((com.google.javascript.rhino.head.ast.AstNode) jump10);
        int int31 = functionNode0.getEncodedSourceStart();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = functionNode0.getRegexpString((int) 'a');
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str4 = functionNode0.toStringTree(scriptNode3);
        int int5 = scriptNode3.getRegexpCount();
        com.google.javascript.rhino.head.Node node6 = scriptNode3.getLastSibling();
        com.google.javascript.rhino.head.Node node7 = node6.getNext();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = new com.google.javascript.rhino.head.ast.FunctionNode(13);
        node6.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode9);
        int int11 = functionNode9.getType();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList12 = functionNode9.getFunctions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = functionNode9.getFunctionNode(13);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode8.getTop();
        functionNode8.setParens((int) (byte) 1, (int) (short) 1);
        functionNode8.setEncodedSourceStart((-1));
        functionNode8.setFunctionIsGetter();
        scope7.addChildToFront((com.google.javascript.rhino.head.Node) functionNode8);
        functionNode5.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode8);
        functionNode5.setFunctionIsSetter();
        int int19 = functionNode0.addFunction(functionNode5);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = functionNode5.getTop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = functionNode5.toSource();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode1.getTop();
        boolean boolean4 = functionNode1.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int7 = scriptNode6.getEndLineno();
        int int8 = scriptNode6.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int14 = scriptNode13.getEndLineno();
        int int15 = scriptNode13.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList16 = scriptNode13.getChildScopes();
        jump11.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode13);
        java.lang.String str18 = scriptNode13.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode6, (com.google.javascript.rhino.head.ast.Scope) scriptNode13);
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode13.target = scope20;
        functionNode1.addChildScope(scope20);
        boolean boolean23 = functionNode1.hasConsistentReturnUsage();
        java.lang.String str24 = functionNode1.getNextTempName();
        com.google.javascript.rhino.head.ast.Jump jump25 = new com.google.javascript.rhino.head.ast.Jump((int) (short) -1, (com.google.javascript.rhino.head.Node) functionNode1);
        boolean boolean26 = functionNode1.isGetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = functionNode1.toSource(14);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.google.javascript.rhino.head.ast.Jump jump2 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        int int6 = scriptNode4.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList7 = scriptNode4.getChildScopes();
        jump2.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int11 = functionNode10.getLp();
        functionNode10.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int15 = functionNode14.getLp();
        functionNode14.setEncodedSource("");
        functionNode14.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int21 = functionNode20.getLp();
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode10, (com.google.javascript.rhino.head.Node) functionNode14, (com.google.javascript.rhino.head.Node) functionNode20, (int) '#');
        jump2.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode10);
        int int25 = functionNode10.getLength();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int27 = functionNode26.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = functionNode26.getTop();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = functionNode29.getTop();
        functionNode29.setParens((int) (byte) 1, (int) (short) 1);
        functionNode29.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList36 = functionNode29.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope38 = functionNode29.getDefiningScope("hi!");
        boolean boolean39 = functionNode29.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.Scope scope41 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        int[] intArray48 = new int[] { 25, 17, (short) 0, 20, 19, (byte) 1 };
        functionNode29.addLiveLocals((com.google.javascript.rhino.head.Node) scope41, intArray48);
        functionNode10.addLiveLocals((com.google.javascript.rhino.head.Node) scriptNode28, intArray48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str51 = scriptNode28.debugPrint();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.google.javascript.rhino.head.ast.Jump jump3 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump3.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump3, 0);
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump11.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump15 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump11, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int17 = functionNode16.getLp();
        functionNode16.setEncodedSource("");
        functionNode16.flattenSymbolTable(false);
        jump3.addChildAfter((com.google.javascript.rhino.head.Node) jump11, (com.google.javascript.rhino.head.Node) functionNode16);
        com.google.javascript.rhino.head.Node node23 = functionNode16.target;
        boolean boolean24 = functionNode16.hasConsistentReturnUsage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = functionNode16.getFunctionNode(9);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = functionNode4.getTop();
        functionNode4.setParens((int) (byte) 1, (int) (short) 1);
        functionNode4.setEncodedSourceStart((-1));
        functionNode4.setFunctionIsGetter();
        scope3.addChildToFront((com.google.javascript.rhino.head.Node) functionNode4);
        functionNode1.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode4);
        functionNode1.setFunctionIsSetter();
        boolean boolean15 = functionNode1.isExpressionClosure();
        functionNode1.putIntProp(7, (int) (byte) 0);
        com.google.javascript.rhino.head.ast.Jump jump19 = new com.google.javascript.rhino.head.ast.Jump(4, (com.google.javascript.rhino.head.Node) functionNode1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = functionNode1.toSource((int) (short) -1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        boolean boolean3 = functionNode1.isGetter();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral5 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral5.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str8 = regExpLiteral5.getValue();
        regExpLiteral5.setFlags("52");
        functionNode1.addChildrenToFront((com.google.javascript.rhino.head.Node) regExpLiteral5);
        boolean boolean12 = functionNode1.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = functionNode13.getTop();
        int int15 = functionNode13.getRegexpCount();
        int int16 = functionNode13.getParamCount();
        com.google.javascript.rhino.head.ast.AstNode astNode17 = functionNode13.getBody();
        int int18 = functionNode1.addFunction(functionNode13);
        functionNode13.setEncodedSourceStart(17);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int22 = functionNode21.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = functionNode21.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode24 = functionNode21.getBody();
        com.google.javascript.rhino.head.ast.Scope scope25 = functionNode21.getParentScope();
        int int26 = functionNode13.addFunction(functionNode21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = functionNode21.toSource(136);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        functionNode0.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode3);
        functionNode0.setRequiresActivation();
        boolean boolean14 = functionNode0.isExpressionClosure();
        functionNode0.setSourceName("hi!");
        int int17 = functionNode0.getFunctionCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = functionNode0.getFunctionNode(14);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode2.getTop();
        functionNode2.setParens((int) (byte) 1, (int) (short) 1);
        functionNode2.setEncodedSourceStart((-1));
        functionNode2.setFunctionIsGetter();
        scope1.addChildToFront((com.google.javascript.rhino.head.Node) functionNode2);
        functionNode2.setRp(19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int15 = scriptNode14.getEndLineno();
        int int16 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump19 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int22 = scriptNode21.getEndLineno();
        int int23 = scriptNode21.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList24 = scriptNode21.getChildScopes();
        jump19.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode21);
        java.lang.String str26 = scriptNode21.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode14, (com.google.javascript.rhino.head.ast.Scope) scriptNode21);
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode21.target = scope28;
        java.lang.String str30 = functionNode2.toStringTree(scriptNode21);
        java.lang.String str32 = scriptNode21.toSource((int) (short) 10);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap33 = scriptNode21.getSymbolTable();
        int int34 = strMap33.size();
        com.google.javascript.rhino.head.ast.Jump jump39 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump39.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump43 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump39, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int46 = scriptNode45.getEndLineno();
        int int47 = scriptNode45.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList48 = scriptNode45.getChildScopes();
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump39, (com.google.javascript.rhino.head.Node) scriptNode45);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList50 = scriptNode45.getFunctions();
        functionNodeList50.clear();
        functionNodeList50.clear();
        com.google.javascript.rhino.head.ast.Jump jump57 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump57.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump61 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump57, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int64 = scriptNode63.getEndLineno();
        int int65 = scriptNode63.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList66 = scriptNode63.getChildScopes();
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump57, (com.google.javascript.rhino.head.Node) scriptNode63);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList68 = scriptNode63.getFunctions();
        java.util.Spliterator<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeSpliterator69 = functionNodeList68.spliterator();
        int int71 = functionNodeList68.indexOf((java.lang.Object) (byte) 10);
        boolean boolean72 = functionNodeList50.retainAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList68);
        boolean boolean73 = strMap33.containsKey((java.lang.Object) functionNodeList50);
        java.util.Collection<com.google.javascript.rhino.head.ast.Symbol> symbolCollection74 = strMap33.values();
        com.google.javascript.rhino.head.Node node76 = com.google.javascript.rhino.head.Node.newNumber((double) '#');
        com.google.javascript.rhino.head.ast.Symbol symbol77 = strMap33.get((java.lang.Object) '#');
        com.google.javascript.rhino.head.ast.FunctionNode functionNode78 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int79 = functionNode78.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode80 = functionNode78.getTop();
        com.google.javascript.rhino.head.Node node81 = functionNode78.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList82 = functionNode78.getParams();
        com.google.javascript.rhino.head.ast.Symbol symbol83 = new com.google.javascript.rhino.head.ast.Symbol();
        int int84 = symbol83.getIndex();
        symbol83.setIndex(35);
        com.google.javascript.rhino.head.ast.Symbol symbol87 = strMap33.getOrDefault((java.lang.Object) functionNode78, symbol83);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str89 = functionNode78.toSource(24);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int4 = functionNode3.getEncodedSourceStart();
        int int5 = functionNode3.getFunctionCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = functionNode6.getTop();
        functionNode6.setParens((int) (byte) 1, (int) (short) 1);
        int int11 = functionNode6.getRp();
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node(17, (com.google.javascript.rhino.head.Node) functionNode3, (com.google.javascript.rhino.head.Node) functionNode6, (int) (short) 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int16 = scriptNode15.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int19 = scriptNode18.getEndLineno();
        scriptNode15.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode18);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int22 = functionNode21.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = functionNode21.getTop();
        boolean boolean24 = functionNode21.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int27 = scriptNode26.getEndLineno();
        int int28 = scriptNode26.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump31 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int34 = scriptNode33.getEndLineno();
        int int35 = scriptNode33.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList36 = scriptNode33.getChildScopes();
        jump31.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode33);
        java.lang.String str38 = scriptNode33.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode26, (com.google.javascript.rhino.head.ast.Scope) scriptNode33);
        com.google.javascript.rhino.head.ast.Scope scope40 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode33.target = scope40;
        functionNode21.addChildScope(scope40);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode18, (com.google.javascript.rhino.head.ast.Scope) functionNode21);
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(8, (com.google.javascript.rhino.head.Node) functionNode3, (com.google.javascript.rhino.head.Node) scriptNode18, (int) 'a');
        java.lang.String str46 = functionNode3.getSourceName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str48 = functionNode3.toSource(193715443);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str1 = symbol0.getName();
        com.google.javascript.rhino.head.Node node2 = symbol0.getNode();
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) ' ');
        symbol0.setNode((com.google.javascript.rhino.head.Node) jump4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int8 = functionNode7.getBaseLineno();
        functionNode7.setSourceName("                                                                                                                                                                                                        /null/");
        symbol0.setContainingTable((com.google.javascript.rhino.head.ast.Scope) functionNode7);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int13 = functionNode12.getLp();
        functionNode12.setLp((int) (short) 1);
        int int18 = functionNode12.getIntProp(4, 26);
        functionNode12.flattenSymbolTable(true);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList21 = functionNode12.getParams();
        functionNode7.setParams(astNodeList21);
        int int23 = functionNode7.getAbsolutePosition();
        java.lang.String str25 = functionNode7.makeIndent(18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = functionNode7.debugPrint();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        functionNode1.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int8 = functionNode7.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode7.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode10 = functionNode7.getBody();
        int int11 = functionNode7.getLength();
        com.google.javascript.rhino.head.ast.Jump jump14 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int17 = scriptNode16.getEndLineno();
        int int18 = scriptNode16.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList19 = scriptNode16.getChildScopes();
        jump14.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode16);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode22 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int23 = functionNode22.getLp();
        functionNode22.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int27 = functionNode26.getLp();
        functionNode26.setEncodedSource("");
        functionNode26.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode32 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int33 = functionNode32.getLp();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode22, (com.google.javascript.rhino.head.Node) functionNode26, (com.google.javascript.rhino.head.Node) functionNode32, (int) '#');
        jump14.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode22);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList37 = functionNode22.getStatements();
        functionNode7.setParams(astNodeList37);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode39 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int40 = functionNode39.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = functionNode39.getTop();
        com.google.javascript.rhino.head.Node node42 = functionNode39.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList43 = functionNode39.getParams();
        functionNode7.setParams(astNodeList43);
        functionNode1.addParam((com.google.javascript.rhino.head.ast.AstNode) functionNode7);
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral47 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) '#');
        java.lang.String str48 = regExpLiteral47.shortName();
        functionNode1.addRegExp(regExpLiteral47);
        functionNode1.setLp(26);
        com.google.javascript.rhino.head.ast.Scope scope52 = functionNode1.getEnclosingScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str54 = functionNode1.toSource(13);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setEncodedSource("");
        functionNode0.flattenSymbolTable(false);
        java.lang.String str6 = functionNode0.getName();
        functionNode0.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int9 = functionNode8.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = functionNode8.getTop();
        com.google.javascript.rhino.head.Node node11 = functionNode8.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList12 = functionNode8.getParams();
        functionNode0.setParams(astNodeList12);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int15 = functionNode14.getLp();
        functionNode14.setLp((int) (short) 1);
        int int20 = functionNode14.getIntProp(4, 26);
        functionNode14.flattenSymbolTable(true);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList23 = functionNode14.getParams();
        functionNode0.setParams(astNodeList23);
        functionNode0.setEndLineno(12);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor27 = functionNode0.iterator();
        int int28 = functionNode0.getLineno();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode30 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int31 = functionNode30.getBaseLineno();
        boolean boolean32 = functionNode30.isGetter();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral34 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral34.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str37 = regExpLiteral34.getValue();
        regExpLiteral34.setFlags("52");
        functionNode30.addChildrenToFront((com.google.javascript.rhino.head.Node) regExpLiteral34);
        functionNode30.setEncodedSourceStart(5);
        functionNode30.removeProp(25);
        functionNode0.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode30);
        functionNode30.setParens(819764875, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str50 = functionNode30.toSource((-1110578805));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        functionNode0.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList7 = functionNode0.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope9 = functionNode0.getDefiningScope("hi!");
        boolean boolean10 = functionNode0.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = functionNode11.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode14 = functionNode11.getBody();
        int int15 = functionNode11.getLength();
        com.google.javascript.rhino.head.ast.Jump jump18 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int21 = scriptNode20.getEndLineno();
        int int22 = scriptNode20.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList23 = scriptNode20.getChildScopes();
        jump18.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode20);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int27 = functionNode26.getLp();
        functionNode26.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode30 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int31 = functionNode30.getLp();
        functionNode30.setEncodedSource("");
        functionNode30.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode36 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int37 = functionNode36.getLp();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode26, (com.google.javascript.rhino.head.Node) functionNode30, (com.google.javascript.rhino.head.Node) functionNode36, (int) '#');
        jump18.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode26);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList41 = functionNode26.getStatements();
        functionNode11.setParams(astNodeList41);
        functionNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) functionNode11);
        java.util.List<com.google.javascript.rhino.head.Node> nodeList44 = functionNode11.getResumptionPoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str45 = functionNode11.debugPrint();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int3 = scriptNode2.getEndLineno();
        int int4 = scriptNode2.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int10 = scriptNode9.getEndLineno();
        int int11 = scriptNode9.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList12 = scriptNode9.getChildScopes();
        jump7.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode9);
        java.lang.String str14 = scriptNode9.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode2, (com.google.javascript.rhino.head.ast.Scope) scriptNode9);
        com.google.javascript.rhino.head.ast.AstNode astNode16 = scriptNode2.getParent();
        scriptNode2.setSourceName("                    /null/");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope21 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode22 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = functionNode22.getTop();
        functionNode22.setParens((int) (byte) 1, (int) (short) 1);
        functionNode22.setEncodedSourceStart((-1));
        functionNode22.setFunctionIsGetter();
        scope21.addChildToFront((com.google.javascript.rhino.head.Node) functionNode22);
        functionNode19.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode22);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode32 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = functionNode32.getTop();
        functionNode32.setParens((int) (byte) 1, (int) (short) 1);
        functionNode32.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList39 = functionNode32.getResumptionPoints();
        int int40 = functionNode32.getLp();
        functionNode19.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode32);
        com.google.javascript.rhino.head.Node node42 = functionNode32.getNext();
        scriptNode2.addChildScope((com.google.javascript.rhino.head.ast.Scope) functionNode32);
        com.google.javascript.rhino.head.ast.Jump jump45 = new com.google.javascript.rhino.head.ast.Jump(13, (com.google.javascript.rhino.head.Node) functionNode32, 22);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode46 = functionNode32.getEnclosingFunction();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = functionNode46.toSource();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str4 = functionNode0.toStringTree(scriptNode3);
        functionNode0.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode6 = functionNode0.getBody();
        functionNode0.setParens(21, (int) '#');
        int int10 = functionNode0.getLp();
        functionNode0.setFunctionIsSetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int13 = functionNode12.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = functionNode12.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode15 = functionNode12.getBody();
        com.google.javascript.rhino.head.ast.Scope scope16 = functionNode12.getParentScope();
        com.google.javascript.rhino.head.ast.Jump jump22 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump22.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump26 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump22, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int29 = scriptNode28.getEndLineno();
        int int30 = scriptNode28.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList31 = scriptNode28.getChildScopes();
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump22, (com.google.javascript.rhino.head.Node) scriptNode28);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int35 = scriptNode34.getEndLineno();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral37 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str39 = regExpLiteral37.toSource((int) (byte) 10);
        regExpLiteral37.setFlags("-1\tSCRIPT -1 1\n");
        regExpLiteral37.removeProp(8);
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(10, node32, (com.google.javascript.rhino.head.Node) scriptNode34, (com.google.javascript.rhino.head.Node) regExpLiteral37, 3);
        java.lang.String str47 = regExpLiteral37.makeIndent((int) (short) 100);
        java.lang.String str49 = regExpLiteral37.toSource((int) (short) 10);
        functionNode12.addRegExp(regExpLiteral37);
        functionNode0.addResumptionPoint((com.google.javascript.rhino.head.Node) functionNode12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str53 = functionNode0.toSource(26);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode8.getTop();
        functionNode8.setParens((int) (byte) 1, (int) (short) 1);
        functionNode8.setEncodedSourceStart((-1));
        functionNode8.setFunctionIsGetter();
        scope7.addChildToFront((com.google.javascript.rhino.head.Node) functionNode8);
        functionNode5.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode8);
        functionNode5.setFunctionIsSetter();
        int int19 = functionNode0.addFunction(functionNode5);
        functionNode0.setEncodedSourceStart(1);
        boolean boolean22 = functionNode0.isExpressionClosure();
        com.google.javascript.rhino.head.ast.Symbol symbol24 = functionNode0.getSymbol("  {\n  }\n");
        functionNode0.setLp(1579347477);
        functionNode0.setRelative(48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = functionNode0.getRegexpFlags((int) '#');
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList15 = scriptNode10.getFunctions();
        int int16 = scriptNode10.getPosition();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList17 = scriptNode10.getChildScopes();
        scriptNode10.flattenSymbolTable(false);
        boolean boolean20 = scriptNode10.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = scriptNode10.getRegexpFlags(628528643);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope6 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = functionNode7.getTop();
        functionNode7.setParens((int) (byte) 1, (int) (short) 1);
        functionNode7.setEncodedSourceStart((-1));
        functionNode7.setFunctionIsGetter();
        scope6.addChildToFront((com.google.javascript.rhino.head.Node) functionNode7);
        functionNode4.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode7);
        int int17 = functionNode0.addFunction(functionNode4);
        java.lang.Object obj18 = functionNode4.getCompilerData();
        com.google.javascript.rhino.head.ast.Name name19 = functionNode4.getFunctionName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int22 = functionNode21.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = functionNode21.getTop();
        boolean boolean24 = functionNode21.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int27 = scriptNode26.getEndLineno();
        int int28 = scriptNode26.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump31 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int34 = scriptNode33.getEndLineno();
        int int35 = scriptNode33.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList36 = scriptNode33.getChildScopes();
        jump31.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode33);
        java.lang.String str38 = scriptNode33.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode26, (com.google.javascript.rhino.head.ast.Scope) scriptNode33);
        com.google.javascript.rhino.head.ast.Scope scope40 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode33.target = scope40;
        functionNode21.addChildScope(scope40);
        boolean boolean43 = functionNode21.hasConsistentReturnUsage();
        java.lang.String str44 = functionNode21.getNextTempName();
        com.google.javascript.rhino.head.ast.Jump jump45 = new com.google.javascript.rhino.head.ast.Jump((int) (short) -1, (com.google.javascript.rhino.head.Node) functionNode21);
        boolean boolean46 = functionNode21.isExpressionClosure();
        functionNode21.putIntProp(1, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int52 = scriptNode51.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int55 = scriptNode54.getEndLineno();
        scriptNode51.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode54);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode57 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int58 = functionNode57.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = functionNode57.getTop();
        boolean boolean60 = functionNode57.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode62 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int63 = scriptNode62.getEndLineno();
        int int64 = scriptNode62.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump67 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode69 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int70 = scriptNode69.getEndLineno();
        int int71 = scriptNode69.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList72 = scriptNode69.getChildScopes();
        jump67.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode69);
        java.lang.String str74 = scriptNode69.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode62, (com.google.javascript.rhino.head.ast.Scope) scriptNode69);
        com.google.javascript.rhino.head.ast.Scope scope76 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode69.target = scope76;
        functionNode57.addChildScope(scope76);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode54, (com.google.javascript.rhino.head.ast.Scope) functionNode57);
        int int80 = functionNode21.addFunction(functionNode57);
        functionNode4.setTop((com.google.javascript.rhino.head.ast.ScriptNode) functionNode57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str82 = functionNode57.toSource();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        com.google.javascript.rhino.head.ast.Comment comment15 = functionNode11.getJsDocNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = functionNode19.getTop();
        functionNode19.setParens((int) (byte) 1, (int) (short) 1);
        functionNode19.setEncodedSourceStart((-1));
        functionNode19.setFunctionIsGetter();
        scope18.addChildToFront((com.google.javascript.rhino.head.Node) functionNode19);
        functionNode16.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode19);
        boolean boolean29 = functionNode11.isParam((com.google.javascript.rhino.head.ast.AstNode) functionNode16);
        functionNode11.setFunctionType(13);
        functionNode11.setRelative(18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str35 = functionNode11.toSource((-1110578805));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        java.lang.String str3 = scriptNode2.getJsDoc();
        com.google.javascript.rhino.head.Node node5 = scriptNode2.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int7 = functionNode6.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str10 = functionNode6.toStringTree(scriptNode9);
        com.google.javascript.rhino.head.ast.Scope scope12 = scriptNode9.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList13 = scriptNode9.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int16 = scriptNode15.getEndLineno();
        int int17 = scriptNode15.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode9, (com.google.javascript.rhino.head.ast.Scope) scriptNode15);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int21 = scriptNode20.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int24 = scriptNode23.getEndLineno();
        scriptNode20.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode23);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int27 = functionNode26.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = functionNode26.getTop();
        boolean boolean29 = functionNode26.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int32 = scriptNode31.getEndLineno();
        int int33 = scriptNode31.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump36 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int39 = scriptNode38.getEndLineno();
        int int40 = scriptNode38.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList41 = scriptNode38.getChildScopes();
        jump36.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode38);
        java.lang.String str43 = scriptNode38.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode31, (com.google.javascript.rhino.head.ast.Scope) scriptNode38);
        com.google.javascript.rhino.head.ast.Scope scope45 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode38.target = scope45;
        functionNode26.addChildScope(scope45);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode23, (com.google.javascript.rhino.head.ast.Scope) functionNode26);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(20, (com.google.javascript.rhino.head.Node) scriptNode2, (com.google.javascript.rhino.head.Node) scriptNode9, (com.google.javascript.rhino.head.Node) scriptNode23);
        int int50 = scriptNode23.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int53 = scriptNode52.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode55 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int56 = scriptNode55.getEndLineno();
        scriptNode52.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode55);
        java.lang.String str58 = scriptNode52.getNextTempName();
        scriptNode23.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode52);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList60 = scriptNode23.getFunctions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str62 = scriptNode23.getRegexpString(15);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        int int3 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node4 = scriptNode1.getNext();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getFirstChild();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList6 = scriptNode1.getFunctions();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        com.google.javascript.rhino.head.ast.Comment comment10 = scriptNode9.getJsDocNode();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList11 = scriptNode9.getFunctions();
        boolean boolean12 = functionNodeList6.addAll(0, (java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList11);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = functionNode13.getTop();
        functionNode13.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode18 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = functionNode21.getTop();
        functionNode21.setParens((int) (byte) 1, (int) (short) 1);
        functionNode21.setEncodedSourceStart((-1));
        functionNode21.setFunctionIsGetter();
        scope20.addChildToFront((com.google.javascript.rhino.head.Node) functionNode21);
        functionNode18.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode21);
        functionNode18.setFunctionIsSetter();
        int int32 = functionNode13.addFunction(functionNode18);
        boolean boolean33 = functionNode18.isGenerator();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList34 = functionNode18.getFunctions();
        com.google.javascript.rhino.head.ast.Jump jump39 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump39.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump43 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump39, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int46 = scriptNode45.getEndLineno();
        int int47 = scriptNode45.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList48 = scriptNode45.getChildScopes();
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump39, (com.google.javascript.rhino.head.Node) scriptNode45);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList50 = scriptNode45.getFunctions();
        int int51 = functionNodeList50.size();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator52 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        functionNodeList50.sort((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator52);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator54 = positionComparator52.reversed();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator55 = astNodeComparator54.reversed();
        functionNodeList34.sort(astNodeComparator55);
        boolean boolean57 = functionNodeList11.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList34);
        com.google.javascript.rhino.head.ast.Jump jump60 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode62 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int63 = scriptNode62.getEndLineno();
        int int64 = scriptNode62.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList65 = scriptNode62.getChildScopes();
        jump60.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode62);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode68 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int69 = functionNode68.getLp();
        functionNode68.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode72 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int73 = functionNode72.getLp();
        functionNode72.setEncodedSource("");
        functionNode72.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode78 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int79 = functionNode78.getLp();
        com.google.javascript.rhino.head.Node node81 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode68, (com.google.javascript.rhino.head.Node) functionNode72, (com.google.javascript.rhino.head.Node) functionNode78, (int) '#');
        jump60.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode68);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList83 = functionNode68.getStatements();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode84 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode85 = functionNode84.getTop();
        com.google.javascript.rhino.head.ast.AstRoot astRoot86 = functionNode84.getAstRoot();
        functionNode68.replaceWith((com.google.javascript.rhino.head.ast.Scope) functionNode84);
        int int88 = functionNodeList34.lastIndexOf((java.lang.Object) functionNode68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str90 = functionNode68.toSource((-18802601));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = functionNode0.getSymbols();
        int int5 = functionNode0.getLength();
        int int6 = functionNode0.getRegexpCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int9 = functionNode8.getLp();
        functionNode8.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int13 = functionNode12.getLp();
        functionNode12.setEncodedSource("");
        functionNode12.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode18 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int19 = functionNode18.getLp();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode8, (com.google.javascript.rhino.head.Node) functionNode12, (com.google.javascript.rhino.head.Node) functionNode18, (int) '#');
        com.google.javascript.rhino.head.ast.Comment comment22 = functionNode18.getJsDocNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode23 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope25 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = functionNode26.getTop();
        functionNode26.setParens((int) (byte) 1, (int) (short) 1);
        functionNode26.setEncodedSourceStart((-1));
        functionNode26.setFunctionIsGetter();
        scope25.addChildToFront((com.google.javascript.rhino.head.Node) functionNode26);
        functionNode23.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode26);
        boolean boolean36 = functionNode18.isParam((com.google.javascript.rhino.head.ast.AstNode) functionNode23);
        int int37 = functionNode23.getLp();
        int int38 = functionNode23.getEncodedSourceEnd();
        int int39 = functionNode0.addFunction(functionNode23);
        boolean boolean40 = functionNode0.requiresActivation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = functionNode0.toSource((int) (byte) -1);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode17 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int18 = functionNode17.getLp();
        functionNode17.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int22 = functionNode21.getLp();
        functionNode21.setEncodedSource("");
        functionNode21.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode27 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int28 = functionNode27.getLp();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode17, (com.google.javascript.rhino.head.Node) functionNode21, (com.google.javascript.rhino.head.Node) functionNode27, (int) '#');
        com.google.javascript.rhino.head.ast.Comment comment31 = functionNode27.getJsDocNode();
        int int32 = functionNode27.getFunctionCount();
        java.lang.String str33 = scriptNode10.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str35 = scriptNode10.getRegexpString(32);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral3 = new com.google.javascript.rhino.head.ast.RegExpLiteral((-1), 3);
        java.lang.String str4 = regExpLiteral3.getJsDoc();
        com.google.javascript.rhino.head.Node node6 = regExpLiteral3.setType(9);
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral8 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) '#');
        java.lang.String str9 = regExpLiteral8.shortName();
        regExpLiteral8.setFlags("-1\tBLOCK -1 1\n");
        regExpLiteral8.setFlags("                                            {\n                                            }\n");
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newString("EOF");
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator16 = node15.new NodeIterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode17 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = functionNode17.getTop();
        functionNode17.setParens((int) (byte) 1, (int) (short) 1);
        functionNode17.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList24 = functionNode17.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope26 = functionNode17.getDefiningScope("hi!");
        boolean boolean27 = functionNode17.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int30 = scriptNode29.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol32 = scriptNode29.getSymbol("hi!");
        scriptNode29.putIntProp(3, 0);
        functionNode17.addResumptionPoint((com.google.javascript.rhino.head.Node) scriptNode29);
        java.lang.String str37 = node15.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode17);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node(48, node6, (com.google.javascript.rhino.head.Node) regExpLiteral8, (com.google.javascript.rhino.head.Node) functionNode17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str40 = functionNode17.toSource((-860972433));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        int int1 = scriptNode0.getEncodedSourceEnd();
        scriptNode0.setSourceName("");
        int int4 = scriptNode0.getLineno();
        int int5 = scriptNode0.getEndLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = scriptNode0.getFunctionNode(16);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        functionNode1.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode1);
        int int7 = functionNode1.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.Jump jump12 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump12.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump16 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump12, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int19 = scriptNode18.getEndLineno();
        int int20 = scriptNode18.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList21 = scriptNode18.getChildScopes();
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump12, (com.google.javascript.rhino.head.Node) scriptNode18);
        java.lang.String str23 = scriptNode18.getSourceName();
        functionNode1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = functionNode1.toSource();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode1.getTop();
        com.google.javascript.rhino.head.Node node4 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int7 = functionNode6.getLp();
        functionNode6.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int11 = functionNode10.getLp();
        functionNode10.setEncodedSource("");
        functionNode10.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int17 = functionNode16.getLp();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode6, (com.google.javascript.rhino.head.Node) functionNode10, (com.google.javascript.rhino.head.Node) functionNode16, (int) '#');
        boolean boolean20 = functionNode16.isGenerator();
        int int21 = functionNode16.getFunctionType();
        boolean boolean22 = functionNode16.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList23 = functionNode16.getStatements();
        functionNode1.setParams(astNodeList23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = functionNode1.debugPrint();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        boolean boolean15 = functionNode11.isGenerator();
        int int16 = functionNode11.getFunctionType();
        com.google.javascript.rhino.head.Node node17 = functionNode11.getFirstChild();
        int int18 = functionNode11.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int20 = functionNode19.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str23 = functionNode19.toStringTree(scriptNode22);
        functionNode19.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode25 = functionNode19.getBody();
        functionNode19.setParens(21, (int) '#');
        functionNode11.addParam((com.google.javascript.rhino.head.ast.AstNode) functionNode19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = functionNode19.toSource((int) '4');
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor5 = functionNode0.iterator();
        functionNode0.setLp(136);
        int int8 = functionNode0.getFunctionType();
        com.google.javascript.rhino.head.Node node9 = functionNode0.getLastChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = functionNode0.toSource();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol4 = scriptNode1.getSymbol("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = scriptNode1.getRegexpFlags(2);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        jump17.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor24 = scriptNode19.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int26 = functionNode25.getLp();
        functionNode25.setEncodedSource("");
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode19, (com.google.javascript.rhino.head.ast.Scope) functionNode25);
        com.google.javascript.rhino.head.ast.Jump jump34 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump34.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump38 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump34, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int41 = scriptNode40.getEndLineno();
        int int42 = scriptNode40.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList43 = scriptNode40.getChildScopes();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump34, (com.google.javascript.rhino.head.Node) scriptNode40);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList45 = scriptNode40.getFunctions();
        functionNodeList45.clear();
        int int48 = functionNodeList45.lastIndexOf((java.lang.Object) (-1L));
        com.google.javascript.rhino.head.ast.Jump jump53 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump53.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump57 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump53, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int60 = scriptNode59.getEndLineno();
        int int61 = scriptNode59.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList62 = scriptNode59.getChildScopes();
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump53, (com.google.javascript.rhino.head.Node) scriptNode59);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList64 = scriptNode59.getFunctions();
        functionNodeList64.clear();
        int int67 = functionNodeList64.lastIndexOf((java.lang.Object) (-1L));
        boolean boolean68 = functionNodeList45.removeAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList64);
        com.google.javascript.rhino.head.ast.Jump jump73 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump73.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump77 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump73, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode79 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int80 = scriptNode79.getEndLineno();
        int int81 = scriptNode79.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList82 = scriptNode79.getChildScopes();
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump73, (com.google.javascript.rhino.head.Node) scriptNode79);
        com.google.javascript.rhino.head.Node node85 = scriptNode79.setType(0);
        int int86 = functionNodeList64.lastIndexOf((java.lang.Object) scriptNode79);
        functionNode11.addChildAfter((com.google.javascript.rhino.head.Node) functionNode25, (com.google.javascript.rhino.head.Node) scriptNode79);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode89 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int90 = functionNode89.getEncodedSourceStart();
        int int91 = functionNode89.getFunctionCount();
        functionNode25.addParam((com.google.javascript.rhino.head.ast.AstNode) functionNode89);
        functionNode89.setEncodedSource("136");
        boolean boolean95 = functionNode89.isGenerator();
        java.lang.String str96 = functionNode89.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str97 = functionNode89.toSource();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        functionNode0.setEncodedSourceStart((-1));
        functionNode0.setIsGenerator();
        functionNode0.setEncodedSourceBounds(26, (int) (short) 1);
        functionNode0.setRp((-1));
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode15 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = functionNode15.getTop();
        functionNode15.setParens((int) (byte) 1, (int) (short) 1);
        functionNode15.setEncodedSourceStart((-1));
        functionNode15.setFunctionIsGetter();
        scope14.addChildToFront((com.google.javascript.rhino.head.Node) functionNode15);
        functionNode15.setRp(19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int28 = scriptNode27.getEndLineno();
        int int29 = scriptNode27.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump32 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int35 = scriptNode34.getEndLineno();
        int int36 = scriptNode34.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList37 = scriptNode34.getChildScopes();
        jump32.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode34);
        java.lang.String str39 = scriptNode34.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode27, (com.google.javascript.rhino.head.ast.Scope) scriptNode34);
        com.google.javascript.rhino.head.ast.Scope scope41 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode34.target = scope41;
        java.lang.String str43 = functionNode15.toStringTree(scriptNode34);
        java.lang.String str45 = scriptNode34.toSource((int) (short) 10);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap46 = scriptNode34.getSymbolTable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode0.removeChild((com.google.javascript.rhino.head.Node) scriptNode34);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        functionNode1.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode1);
        int int7 = functionNode1.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.Jump jump12 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump12.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump16 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump12, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int19 = scriptNode18.getEndLineno();
        int int20 = scriptNode18.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList21 = scriptNode18.getChildScopes();
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump12, (com.google.javascript.rhino.head.Node) scriptNode18);
        java.lang.String str23 = scriptNode18.getSourceName();
        functionNode1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = functionNode1.getRegexpFlags(445666398);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int6 = scriptNode5.getEndLineno();
        int int7 = scriptNode5.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = scriptNode12.getChildScopes();
        jump10.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode12);
        java.lang.String str17 = scriptNode12.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode5, (com.google.javascript.rhino.head.ast.Scope) scriptNode12);
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode12.target = scope19;
        functionNode0.addChildScope(scope19);
        boolean boolean22 = functionNode0.hasConsistentReturnUsage();
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap23 = functionNode0.getLiveLocals();
        com.google.javascript.rhino.head.Node node24 = functionNode0.getLastChild();
        java.lang.String str25 = functionNode0.getNextTempName();
        boolean boolean26 = functionNode0.requiresActivation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = functionNode0.getRegexpFlags(15);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        scriptNode1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int8 = functionNode7.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode7.getTop();
        boolean boolean10 = functionNode7.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        jump17.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        java.lang.String str24 = scriptNode19.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode12, (com.google.javascript.rhino.head.ast.Scope) scriptNode19);
        com.google.javascript.rhino.head.ast.Scope scope26 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode19.target = scope26;
        functionNode7.addChildScope(scope26);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode4, (com.google.javascript.rhino.head.ast.Scope) functionNode7);
        int int30 = functionNode7.getFunctionCount();
        int int31 = functionNode7.getLineno();
        functionNode7.setFunctionIsSetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = functionNode7.toSource((int) (byte) 100);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        jump17.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor24 = scriptNode19.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int26 = functionNode25.getLp();
        functionNode25.setEncodedSource("");
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode19, (com.google.javascript.rhino.head.ast.Scope) functionNode25);
        com.google.javascript.rhino.head.ast.Jump jump34 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump34.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump38 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump34, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int41 = scriptNode40.getEndLineno();
        int int42 = scriptNode40.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList43 = scriptNode40.getChildScopes();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump34, (com.google.javascript.rhino.head.Node) scriptNode40);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList45 = scriptNode40.getFunctions();
        functionNodeList45.clear();
        int int48 = functionNodeList45.lastIndexOf((java.lang.Object) (-1L));
        com.google.javascript.rhino.head.ast.Jump jump53 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump53.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump57 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump53, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int60 = scriptNode59.getEndLineno();
        int int61 = scriptNode59.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList62 = scriptNode59.getChildScopes();
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump53, (com.google.javascript.rhino.head.Node) scriptNode59);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList64 = scriptNode59.getFunctions();
        functionNodeList64.clear();
        int int67 = functionNodeList64.lastIndexOf((java.lang.Object) (-1L));
        boolean boolean68 = functionNodeList45.removeAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList64);
        com.google.javascript.rhino.head.ast.Jump jump73 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump73.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump77 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump73, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode79 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int80 = scriptNode79.getEndLineno();
        int int81 = scriptNode79.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList82 = scriptNode79.getChildScopes();
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump73, (com.google.javascript.rhino.head.Node) scriptNode79);
        com.google.javascript.rhino.head.Node node85 = scriptNode79.setType(0);
        int int86 = functionNodeList64.lastIndexOf((java.lang.Object) scriptNode79);
        functionNode11.addChildAfter((com.google.javascript.rhino.head.Node) functionNode25, (com.google.javascript.rhino.head.Node) scriptNode79);
        int int88 = functionNode25.getRegexpCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str90 = functionNode25.toSource(23);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        jump17.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor24 = scriptNode19.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int26 = functionNode25.getLp();
        functionNode25.setEncodedSource("");
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode19, (com.google.javascript.rhino.head.ast.Scope) functionNode25);
        com.google.javascript.rhino.head.ast.Jump jump34 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump34.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump38 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump34, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int41 = scriptNode40.getEndLineno();
        int int42 = scriptNode40.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList43 = scriptNode40.getChildScopes();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump34, (com.google.javascript.rhino.head.Node) scriptNode40);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList45 = scriptNode40.getFunctions();
        functionNodeList45.clear();
        int int48 = functionNodeList45.lastIndexOf((java.lang.Object) (-1L));
        com.google.javascript.rhino.head.ast.Jump jump53 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump53.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump57 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump53, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int60 = scriptNode59.getEndLineno();
        int int61 = scriptNode59.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList62 = scriptNode59.getChildScopes();
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump53, (com.google.javascript.rhino.head.Node) scriptNode59);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList64 = scriptNode59.getFunctions();
        functionNodeList64.clear();
        int int67 = functionNodeList64.lastIndexOf((java.lang.Object) (-1L));
        boolean boolean68 = functionNodeList45.removeAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList64);
        com.google.javascript.rhino.head.ast.Jump jump73 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump73.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump77 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump73, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode79 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int80 = scriptNode79.getEndLineno();
        int int81 = scriptNode79.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList82 = scriptNode79.getChildScopes();
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump73, (com.google.javascript.rhino.head.Node) scriptNode79);
        com.google.javascript.rhino.head.Node node85 = scriptNode79.setType(0);
        int int86 = functionNodeList64.lastIndexOf((java.lang.Object) scriptNode79);
        functionNode11.addChildAfter((com.google.javascript.rhino.head.Node) functionNode25, (com.google.javascript.rhino.head.Node) scriptNode79);
        int int88 = functionNode25.getRegexpCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str90 = functionNode25.getRegexpFlags(830992929);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode2.getTop();
        functionNode2.setParens((int) (byte) 1, (int) (short) 1);
        functionNode2.setEncodedSourceStart((-1));
        functionNode2.setFunctionIsGetter();
        scope1.addChildToFront((com.google.javascript.rhino.head.Node) functionNode2);
        functionNode2.setRp(19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int15 = scriptNode14.getEndLineno();
        int int16 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump19 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int22 = scriptNode21.getEndLineno();
        int int23 = scriptNode21.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList24 = scriptNode21.getChildScopes();
        jump19.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode21);
        java.lang.String str26 = scriptNode21.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode14, (com.google.javascript.rhino.head.ast.Scope) scriptNode21);
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode21.target = scope28;
        java.lang.String str30 = functionNode2.toStringTree(scriptNode21);
        java.lang.String str32 = scriptNode21.toSource((int) (short) 10);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap33 = scriptNode21.getSymbolTable();
        com.google.javascript.rhino.head.ast.Symbol symbol34 = new com.google.javascript.rhino.head.ast.Symbol();
        com.google.javascript.rhino.head.Node node35 = symbol34.getNode();
        com.google.javascript.rhino.head.Node node36 = symbol34.getNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int39 = scriptNode38.getEndLineno();
        int int40 = scriptNode38.getBaseLineno();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode41 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int42 = functionNode41.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str45 = functionNode41.toStringTree(scriptNode44);
        functionNode41.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode47 = functionNode41.getBody();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList48 = functionNode41.getParams();
        scriptNode38.replaceWith((com.google.javascript.rhino.head.ast.Scope) functionNode41);
        symbol34.setNode((com.google.javascript.rhino.head.Node) functionNode41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node51 = scriptNode21.getChildBefore((com.google.javascript.rhino.head.Node) functionNode41);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(1299931104);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = functionNode1.getRegexpFlags((-446577320));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        com.google.javascript.rhino.head.Node node3 = functionNode0.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList4 = functionNode0.getParams();
        functionNode0.removeProp(2);
        functionNode0.setParens(14, 3);
        java.lang.String str10 = functionNode0.getSourceName();
        java.lang.Object obj12 = functionNode0.getProp(18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = functionNode0.getFunctionNode(12);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        java.lang.String str3 = scriptNode2.getJsDoc();
        com.google.javascript.rhino.head.Node node5 = scriptNode2.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int7 = functionNode6.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str10 = functionNode6.toStringTree(scriptNode9);
        com.google.javascript.rhino.head.ast.Scope scope12 = scriptNode9.getDefiningScope("");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int15 = scriptNode14.getEndLineno();
        int int16 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node(25, node5, (com.google.javascript.rhino.head.Node) scriptNode9, (com.google.javascript.rhino.head.Node) scriptNode14);
        boolean boolean18 = scriptNode14.hasConsistentReturnUsage();
        java.lang.String str19 = scriptNode14.getNextTempName();
        java.lang.String str20 = scriptNode14.shortName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int22 = functionNode21.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = functionNode21.getTop();
        boolean boolean24 = functionNode21.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList25 = functionNode21.getSymbols();
        scriptNode14.setSymbols(symbolList25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = scriptNode14.getRegexpString(819764875);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList15 = scriptNode10.getFunctions();
        int int16 = functionNodeList15.size();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator17 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        functionNodeList15.sort((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator17);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator19 = positionComparator17.reversed();
        com.google.javascript.rhino.head.ast.Jump jump23 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump23.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump27 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump23, 0);
        com.google.javascript.rhino.head.ast.Jump jump31 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump31.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump35 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump31, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode36 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int37 = functionNode36.getLp();
        functionNode36.setEncodedSource("");
        functionNode36.flattenSymbolTable(false);
        jump23.addChildAfter((com.google.javascript.rhino.head.Node) jump31, (com.google.javascript.rhino.head.Node) functionNode36);
        int int43 = functionNode36.getPosition();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode45 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        boolean boolean46 = functionNode45.isExpressionClosure();
        int int47 = positionComparator17.compare((com.google.javascript.rhino.head.ast.AstNode) functionNode36, (com.google.javascript.rhino.head.ast.AstNode) functionNode45);
        com.google.javascript.rhino.head.ast.Jump jump50 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int53 = scriptNode52.getEndLineno();
        int int54 = scriptNode52.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList55 = scriptNode52.getChildScopes();
        jump50.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode52);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode58 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int59 = functionNode58.getLp();
        functionNode58.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode62 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int63 = functionNode62.getLp();
        functionNode62.setEncodedSource("");
        functionNode62.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode68 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int69 = functionNode68.getLp();
        com.google.javascript.rhino.head.Node node71 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode58, (com.google.javascript.rhino.head.Node) functionNode62, (com.google.javascript.rhino.head.Node) functionNode68, (int) '#');
        jump50.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode58);
        int int73 = functionNode58.getLength();
        functionNode58.setEncodedSource("");
        functionNode36.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str77 = functionNode36.toSource();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode8.getTop();
        functionNode8.setParens((int) (byte) 1, (int) (short) 1);
        functionNode8.setEncodedSourceStart((-1));
        functionNode8.setFunctionIsGetter();
        scope7.addChildToFront((com.google.javascript.rhino.head.Node) functionNode8);
        functionNode5.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode8);
        functionNode5.setFunctionIsSetter();
        int int19 = functionNode0.addFunction(functionNode5);
        functionNode0.setEncodedSourceStart(1);
        java.lang.Object obj23 = functionNode0.getProp((-3285918));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = functionNode0.getRegexpString((int) (byte) 1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        boolean boolean15 = functionNode1.isGetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = functionNode1.getRegexpString((-793599801));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode8.getTop();
        functionNode8.setParens((int) (byte) 1, (int) (short) 1);
        functionNode8.setEncodedSourceStart((-1));
        functionNode8.setFunctionIsGetter();
        scope7.addChildToFront((com.google.javascript.rhino.head.Node) functionNode8);
        functionNode5.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode8);
        functionNode5.setFunctionIsSetter();
        int int19 = functionNode0.addFunction(functionNode5);
        boolean boolean20 = functionNode5.isGenerator();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList21 = functionNode5.getFunctions();
        functionNode5.setBaseLineno(14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = functionNode5.getRegexpString(17);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int3 = functionNode2.getEncodedSourceStart();
        int int4 = functionNode2.getFunctionCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = functionNode5.getTop();
        functionNode5.setParens((int) (byte) 1, (int) (short) 1);
        int int10 = functionNode5.getRp();
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(17, (com.google.javascript.rhino.head.Node) functionNode2, (com.google.javascript.rhino.head.Node) functionNode5, (int) (short) 0);
        functionNode5.setParens((-22), 4);
        com.google.javascript.rhino.head.ast.AstNode astNode16 = functionNode5.getParent();
        int int17 = functionNode5.getEncodedSourceStart();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = functionNode5.getRegexpFlags((-446577320));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int6 = scriptNode5.getEndLineno();
        int int7 = scriptNode5.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = scriptNode12.getChildScopes();
        jump10.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode12);
        java.lang.String str17 = scriptNode12.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode5, (com.google.javascript.rhino.head.ast.Scope) scriptNode12);
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode12.target = scope19;
        functionNode0.addChildScope(scope19);
        boolean boolean22 = functionNode0.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode23 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = functionNode23.getTop();
        functionNode23.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode28 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope30 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode31 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = functionNode31.getTop();
        functionNode31.setParens((int) (byte) 1, (int) (short) 1);
        functionNode31.setEncodedSourceStart((-1));
        functionNode31.setFunctionIsGetter();
        scope30.addChildToFront((com.google.javascript.rhino.head.Node) functionNode31);
        functionNode28.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode31);
        functionNode28.setFunctionIsSetter();
        int int42 = functionNode23.addFunction(functionNode28);
        java.lang.String str43 = functionNode23.getNextTempName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int46 = scriptNode45.getEndLineno();
        int int47 = scriptNode45.getBaseLineno();
        scriptNode45.removeProp(0);
        scriptNode45.setEncodedSourceEnd(19);
        functionNode23.addParam((com.google.javascript.rhino.head.ast.AstNode) scriptNode45);
        functionNode0.addChildrenToFront((com.google.javascript.rhino.head.Node) scriptNode45);
        com.google.javascript.rhino.head.ast.Scope scope56 = new com.google.javascript.rhino.head.ast.Scope(20, 16);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode57 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int58 = functionNode57.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = functionNode57.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode60 = functionNode57.getBody();
        com.google.javascript.rhino.head.ast.Jump jump66 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump66.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump70 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump66, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode72 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int73 = scriptNode72.getEndLineno();
        int int74 = scriptNode72.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList75 = scriptNode72.getChildScopes();
        com.google.javascript.rhino.head.Node node76 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump66, (com.google.javascript.rhino.head.Node) scriptNode72);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList77 = scriptNode72.getChildScopes();
        com.google.javascript.rhino.head.ast.Jump jump78 = new com.google.javascript.rhino.head.ast.Jump(11, (com.google.javascript.rhino.head.Node) scriptNode72);
        functionNode57.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode72);
        com.google.javascript.rhino.head.ast.AstNode astNode80 = functionNode57.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode0.replaceChildAfter((com.google.javascript.rhino.head.Node) scope56, (com.google.javascript.rhino.head.Node) functionNode57);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node((int) (byte) 100, (com.google.javascript.rhino.head.Node) functionNode3, 19);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int15 = functionNode14.getLp();
        functionNode14.setEncodedSource("");
        functionNode14.flattenSymbolTable(false);
        java.lang.String str20 = functionNode14.getName();
        functionNode14.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode22 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int23 = functionNode22.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = functionNode22.getTop();
        com.google.javascript.rhino.head.Node node25 = functionNode22.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList26 = functionNode22.getParams();
        functionNode14.setParams(astNodeList26);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode28 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int29 = functionNode28.getLp();
        functionNode28.setLp((int) (short) 1);
        int int34 = functionNode28.getIntProp(4, 26);
        functionNode28.flattenSymbolTable(true);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList37 = functionNode28.getParams();
        functionNode14.setParams(astNodeList37);
        functionNode14.setEndLineno(12);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor41 = functionNode14.iterator();
        int int42 = functionNode14.getLineno();
        functionNode3.addChildToBack((com.google.javascript.rhino.head.Node) functionNode14);
        int int44 = functionNode14.getEncodedSourceStart();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator45 = functionNode14.new NodeIterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = functionNode14.toSource();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        com.google.javascript.rhino.head.Token.CommentType commentType2 = com.google.javascript.rhino.head.Token.CommentType.JSDOC;
        com.google.javascript.rhino.head.ast.Comment comment4 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 10, 20, commentType2, "                {\n                }\n");
        com.google.javascript.rhino.head.Token.CommentType commentType7 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment9 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType7, "109");
        java.lang.String str11 = comment9.toSource(19);
        java.lang.String str12 = comment9.getValue();
        java.lang.String str13 = comment9.getValue();
        com.google.javascript.rhino.head.Token.CommentType commentType14 = com.google.javascript.rhino.head.Token.CommentType.LINE;
        comment9.setCommentType(commentType14);
        comment4.setCommentType(commentType14);
        int int17 = comment4.getType();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode18 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int19 = functionNode18.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = functionNode18.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode21 = functionNode18.getBody();
        com.google.javascript.rhino.head.ast.Jump jump27 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump27.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump31 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump27, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int34 = scriptNode33.getEndLineno();
        int int35 = scriptNode33.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList36 = scriptNode33.getChildScopes();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump27, (com.google.javascript.rhino.head.Node) scriptNode33);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList38 = scriptNode33.getChildScopes();
        com.google.javascript.rhino.head.ast.Jump jump39 = new com.google.javascript.rhino.head.ast.Jump(11, (com.google.javascript.rhino.head.Node) scriptNode33);
        functionNode18.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode33);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList41 = functionNode18.getFunctions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node42 = comment4.getChildBefore((com.google.javascript.rhino.head.Node) functionNode18);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        jump17.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor24 = scriptNode19.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int26 = functionNode25.getLp();
        functionNode25.setEncodedSource("");
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode19, (com.google.javascript.rhino.head.ast.Scope) functionNode25);
        com.google.javascript.rhino.head.ast.Jump jump34 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump34.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump38 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump34, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int41 = scriptNode40.getEndLineno();
        int int42 = scriptNode40.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList43 = scriptNode40.getChildScopes();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump34, (com.google.javascript.rhino.head.Node) scriptNode40);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList45 = scriptNode40.getFunctions();
        functionNodeList45.clear();
        int int48 = functionNodeList45.lastIndexOf((java.lang.Object) (-1L));
        com.google.javascript.rhino.head.ast.Jump jump53 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump53.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump57 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump53, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int60 = scriptNode59.getEndLineno();
        int int61 = scriptNode59.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList62 = scriptNode59.getChildScopes();
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump53, (com.google.javascript.rhino.head.Node) scriptNode59);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList64 = scriptNode59.getFunctions();
        functionNodeList64.clear();
        int int67 = functionNodeList64.lastIndexOf((java.lang.Object) (-1L));
        boolean boolean68 = functionNodeList45.removeAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList64);
        com.google.javascript.rhino.head.ast.Jump jump73 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump73.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump77 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump73, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode79 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int80 = scriptNode79.getEndLineno();
        int int81 = scriptNode79.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList82 = scriptNode79.getChildScopes();
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump73, (com.google.javascript.rhino.head.Node) scriptNode79);
        com.google.javascript.rhino.head.Node node85 = scriptNode79.setType(0);
        int int86 = functionNodeList64.lastIndexOf((java.lang.Object) scriptNode79);
        functionNode11.addChildAfter((com.google.javascript.rhino.head.Node) functionNode25, (com.google.javascript.rhino.head.Node) scriptNode79);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode89 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int90 = functionNode89.getEncodedSourceStart();
        int int91 = functionNode89.getFunctionCount();
        functionNode25.addParam((com.google.javascript.rhino.head.ast.AstNode) functionNode89);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode93 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int94 = functionNode93.getLp();
        functionNode89.target = functionNode93;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str97 = functionNode93.getRegexpString((int) (short) -1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList15 = scriptNode10.getFunctions();
        int int16 = functionNodeList15.size();
        functionNodeList15.clear();
        int int19 = functionNodeList15.indexOf((java.lang.Object) 10L);
        com.google.javascript.rhino.head.ast.Jump jump24 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump24.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump28 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump24, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int31 = scriptNode30.getEndLineno();
        int int32 = scriptNode30.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList33 = scriptNode30.getChildScopes();
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump24, (com.google.javascript.rhino.head.Node) scriptNode30);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList35 = scriptNode30.getFunctions();
        functionNodeList35.clear();
        functionNodeList35.clear();
        com.google.javascript.rhino.head.ast.Jump jump42 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump42.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump46 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump42, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int49 = scriptNode48.getEndLineno();
        int int50 = scriptNode48.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList51 = scriptNode48.getChildScopes();
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump42, (com.google.javascript.rhino.head.Node) scriptNode48);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList53 = scriptNode48.getFunctions();
        java.util.Spliterator<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeSpliterator54 = functionNodeList53.spliterator();
        int int56 = functionNodeList53.indexOf((java.lang.Object) (byte) 10);
        boolean boolean57 = functionNodeList35.retainAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList53);
        boolean boolean58 = functionNodeList15.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList35);
        java.util.Spliterator<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeSpliterator59 = functionNodeList35.spliterator();
        java.util.stream.Stream<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeStream60 = functionNodeList35.stream();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode61 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int62 = functionNode61.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = functionNode61.getTop();
        boolean boolean64 = functionNode61.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int67 = scriptNode66.getEndLineno();
        int int68 = scriptNode66.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump71 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode73 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int74 = scriptNode73.getEndLineno();
        int int75 = scriptNode73.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList76 = scriptNode73.getChildScopes();
        jump71.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode73);
        java.lang.String str78 = scriptNode73.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode66, (com.google.javascript.rhino.head.ast.Scope) scriptNode73);
        com.google.javascript.rhino.head.ast.Scope scope80 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode73.target = scope80;
        functionNode61.addChildScope(scope80);
        boolean boolean83 = functionNode61.hasConsistentReturnUsage();
        boolean boolean84 = functionNode61.hasSideEffects();
        functionNode61.setLp((-1262414679));
        int int87 = functionNode61.getParamCount();
        functionNode61.putIntProp((-1262414679), (-3285918));
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList91 = functionNode61.getChildScopes();
        boolean boolean92 = functionNodeList35.equals((java.lang.Object) functionNode61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str94 = functionNode61.getRegexpFlags((-544960523));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str1 = symbol0.getName();
        com.google.javascript.rhino.head.Node node2 = symbol0.getNode();
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) ' ');
        symbol0.setNode((com.google.javascript.rhino.head.Node) jump4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int8 = functionNode7.getBaseLineno();
        functionNode7.setSourceName("                                                                                                                                                                                                        /null/");
        symbol0.setContainingTable((com.google.javascript.rhino.head.ast.Scope) functionNode7);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int13 = functionNode12.getLp();
        functionNode12.setLp((int) (short) 1);
        int int18 = functionNode12.getIntProp(4, 26);
        functionNode12.flattenSymbolTable(true);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList21 = functionNode12.getParams();
        functionNode7.setParams(astNodeList21);
        int int23 = functionNode7.getLp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = functionNode7.toSource(7);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        scriptNode1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int8 = functionNode7.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode7.getTop();
        boolean boolean10 = functionNode7.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        jump17.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        java.lang.String str24 = scriptNode19.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode12, (com.google.javascript.rhino.head.ast.Scope) scriptNode19);
        com.google.javascript.rhino.head.ast.Scope scope26 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode19.target = scope26;
        functionNode7.addChildScope(scope26);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode4, (com.google.javascript.rhino.head.ast.Scope) functionNode7);
        int int30 = functionNode7.getFunctionCount();
        int int31 = functionNode7.getEncodedSourceEnd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = functionNode7.toSource();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral2 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str4 = regExpLiteral2.toSource((int) (byte) 10);
        regExpLiteral2.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str8 = regExpLiteral2.toSource((int) (short) -1);
        regExpLiteral2.setFlags("EOF");
        java.lang.String str11 = regExpLiteral2.toSource();
        java.lang.String str12 = regExpLiteral2.getValue();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int14 = functionNode13.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str17 = functionNode13.toStringTree(scriptNode16);
        functionNode13.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode19 = functionNode13.getBody();
        functionNode13.setParens(21, (int) '#');
        int int23 = functionNode13.getLineno();
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newString("EOF");
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator26 = node25.new NodeIterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode27 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = functionNode27.getTop();
        functionNode27.setParens((int) (byte) 1, (int) (short) 1);
        functionNode27.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList34 = functionNode27.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope36 = functionNode27.getDefiningScope("hi!");
        boolean boolean37 = functionNode27.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int40 = scriptNode39.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol42 = scriptNode39.getSymbol("hi!");
        scriptNode39.putIntProp(3, 0);
        functionNode27.addResumptionPoint((com.google.javascript.rhino.head.Node) scriptNode39);
        java.lang.String str47 = node25.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode27);
        java.lang.String str48 = functionNode27.getSourceName();
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) (short) -1, (com.google.javascript.rhino.head.Node) regExpLiteral2, (com.google.javascript.rhino.head.Node) functionNode13, (com.google.javascript.rhino.head.Node) functionNode27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str51 = functionNode13.toSource((int) (byte) 100);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        com.google.javascript.rhino.head.ast.Comment comment15 = functionNode11.getJsDocNode();
        int int16 = functionNode11.getRp();
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newString((int) (byte) 1, "$0");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int21 = functionNode20.getLp();
        functionNode20.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope26 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode27 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = functionNode27.getTop();
        functionNode27.setParens((int) (byte) 1, (int) (short) 1);
        functionNode27.setEncodedSourceStart((-1));
        functionNode27.setFunctionIsGetter();
        scope26.addChildToFront((com.google.javascript.rhino.head.Node) functionNode27);
        functionNode24.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode27);
        int int37 = functionNode20.addFunction(functionNode24);
        com.google.javascript.rhino.head.ast.Symbol symbol39 = functionNode20.getSymbol("-1\tBLOCK -1 1\n");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int42 = scriptNode41.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol44 = scriptNode41.getSymbol("hi!");
        scriptNode41.putIntProp(3, 0);
        functionNode20.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode41);
        java.lang.String str49 = node19.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode20);
        functionNode11.addResumptionPoint(node19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str52 = functionNode11.toSource(161);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        functionNode0.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode3);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int14 = functionNode13.getLp();
        functionNode13.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode17 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = functionNode20.getTop();
        functionNode20.setParens((int) (byte) 1, (int) (short) 1);
        functionNode20.setEncodedSourceStart((-1));
        functionNode20.setFunctionIsGetter();
        scope19.addChildToFront((com.google.javascript.rhino.head.Node) functionNode20);
        functionNode17.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode20);
        int int30 = functionNode13.addFunction(functionNode17);
        com.google.javascript.rhino.head.Node node31 = functionNode17.target;
        com.google.javascript.rhino.head.ast.FunctionNode functionNode32 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int33 = functionNode32.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = functionNode32.getTop();
        boolean boolean35 = functionNode32.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int38 = scriptNode37.getEndLineno();
        int int39 = scriptNode37.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump42 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int45 = scriptNode44.getEndLineno();
        int int46 = scriptNode44.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList47 = scriptNode44.getChildScopes();
        jump42.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode44);
        java.lang.String str49 = scriptNode44.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode37, (com.google.javascript.rhino.head.ast.Scope) scriptNode44);
        com.google.javascript.rhino.head.ast.Scope scope51 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode44.target = scope51;
        functionNode32.addChildScope(scope51);
        boolean boolean54 = functionNode32.hasConsistentReturnUsage();
        boolean boolean55 = functionNode32.hasSideEffects();
        int int56 = functionNode17.addFunction(functionNode32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node57 = functionNode0.getChildBefore((com.google.javascript.rhino.head.Node) functionNode17);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        com.google.javascript.rhino.head.ast.Jump jump2 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        int int6 = scriptNode4.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList7 = scriptNode4.getChildScopes();
        jump2.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        java.lang.String str9 = scriptNode4.debugPrint();
        java.lang.String str10 = scriptNode4.getNextTempName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = scriptNode4.getFunctionNode(84791990);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = functionNode0.getSymbols();
        functionNode0.setRp(5);
        com.google.javascript.rhino.head.ast.Scope scope7 = functionNode0.getEnclosingScope();
        functionNode0.setLineno((int) (short) -1);
        com.google.javascript.rhino.head.ast.Scope scope11 = functionNode0.getDefiningScope("                  ");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int13 = functionNode12.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str16 = functionNode12.toStringTree(scriptNode15);
        com.google.javascript.rhino.head.ast.Scope scope18 = scriptNode15.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList19 = scriptNode15.getSymbols();
        functionNode0.setSymbols(symbolList19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = functionNode0.toSource(109);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((-1262414679), 628528643);
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = scope2.getAstRoot();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = functionNode4.getTop();
        functionNode4.setParens((int) (byte) 1, (int) (short) 1);
        functionNode4.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList11 = functionNode4.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope13 = functionNode4.getDefiningScope("hi!");
        boolean boolean14 = functionNode4.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode15 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int16 = functionNode15.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = functionNode15.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode18 = functionNode15.getBody();
        int int19 = functionNode15.getLength();
        com.google.javascript.rhino.head.ast.Jump jump22 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int25 = scriptNode24.getEndLineno();
        int int26 = scriptNode24.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList27 = scriptNode24.getChildScopes();
        jump22.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode24);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode30 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int31 = functionNode30.getLp();
        functionNode30.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode34 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int35 = functionNode34.getLp();
        functionNode34.setEncodedSource("");
        functionNode34.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode40 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int41 = functionNode40.getLp();
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode30, (com.google.javascript.rhino.head.Node) functionNode34, (com.google.javascript.rhino.head.Node) functionNode40, (int) '#');
        jump22.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode30);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList45 = functionNode30.getStatements();
        functionNode15.setParams(astNodeList45);
        functionNode4.addChild((com.google.javascript.rhino.head.ast.AstNode) functionNode15);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor48 = functionNode4.iterator();
        int int49 = functionNode4.getAbsolutePosition();
        functionNode4.setSourceName("/null/52");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode54 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int55 = functionNode54.getLp();
        functionNode54.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode58 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int59 = functionNode58.getLp();
        functionNode58.setEncodedSource("");
        functionNode58.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode64 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int65 = functionNode64.getLp();
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode54, (com.google.javascript.rhino.head.Node) functionNode58, (com.google.javascript.rhino.head.Node) functionNode64, (int) '#');
        boolean boolean68 = functionNode64.isGenerator();
        int int69 = functionNode64.getFunctionType();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode71 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int72 = functionNode71.getLp();
        functionNode71.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode75 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int76 = functionNode75.getLp();
        functionNode75.setEncodedSource("");
        functionNode75.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode81 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int82 = functionNode81.getLp();
        com.google.javascript.rhino.head.Node node84 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode71, (com.google.javascript.rhino.head.Node) functionNode75, (com.google.javascript.rhino.head.Node) functionNode81, (int) '#');
        boolean boolean85 = functionNode81.isGenerator();
        int int86 = functionNode81.getFunctionType();
        com.google.javascript.rhino.head.Node node87 = functionNode81.getFirstChild();
        boolean boolean88 = functionNode81.isGetterOrSetter();
        functionNode64.setParentScope((com.google.javascript.rhino.head.ast.Scope) functionNode81);
        com.google.javascript.rhino.head.Node node90 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) functionNode64);
        int int91 = functionNode64.getParamCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scope2.replaceChildAfter((com.google.javascript.rhino.head.Node) functionNode4, (com.google.javascript.rhino.head.Node) functionNode64);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList15 = scriptNode10.getFunctions();
        int int16 = scriptNode10.getPosition();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList17 = scriptNode10.getChildScopes();
        scriptNode10.setEncodedSourceEnd(20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = scriptNode10.getRegexpFlags((-601958044));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral1 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str3 = regExpLiteral1.toSource((int) (byte) 10);
        regExpLiteral1.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str7 = regExpLiteral1.toSource((int) (short) -1);
        regExpLiteral1.setFlags("EOF");
        java.lang.String str11 = regExpLiteral1.makeIndent(10);
        com.google.javascript.rhino.head.ast.Jump jump14 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int17 = scriptNode16.getEndLineno();
        int int18 = scriptNode16.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList19 = scriptNode16.getChildScopes();
        jump14.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode16);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator21 = scriptNode16.spliterator();
        regExpLiteral1.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode16);
        scriptNode16.removeChildren();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int26 = functionNode25.getLp();
        functionNode25.setEncodedSource("");
        functionNode25.flattenSymbolTable(false);
        java.lang.String str31 = functionNode25.getName();
        functionNode25.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode33 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int34 = functionNode33.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = functionNode33.getTop();
        boolean boolean36 = functionNode33.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList37 = functionNode33.getSymbols();
        functionNode33.setRp(5);
        com.google.javascript.rhino.head.ast.Scope scope40 = functionNode33.getEnclosingScope();
        functionNode33.setLineno(5);
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode25, (com.google.javascript.rhino.head.Node) functionNode33, 1);
        functionNode33.setSourceName("                                                                                                                                                                                                        /null/-1\tSCRIPT -1 1\n");
        functionNode33.setIsExpressionClosure(true);
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral52 = new com.google.javascript.rhino.head.ast.RegExpLiteral((-1), 3);
        java.lang.String str53 = regExpLiteral52.getJsDoc();
        com.google.javascript.rhino.head.Node node55 = regExpLiteral52.setType(9);
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral57 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) '#');
        java.lang.String str58 = regExpLiteral57.shortName();
        regExpLiteral57.setFlags("-1\tBLOCK -1 1\n");
        regExpLiteral57.setFlags("                                            {\n                                            }\n");
        com.google.javascript.rhino.head.Node node64 = com.google.javascript.rhino.head.Node.newString("EOF");
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator65 = node64.new NodeIterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode66 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = functionNode66.getTop();
        functionNode66.setParens((int) (byte) 1, (int) (short) 1);
        functionNode66.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList73 = functionNode66.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope75 = functionNode66.getDefiningScope("hi!");
        boolean boolean76 = functionNode66.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode78 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int79 = scriptNode78.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol81 = scriptNode78.getSymbol("hi!");
        scriptNode78.putIntProp(3, 0);
        functionNode66.addResumptionPoint((com.google.javascript.rhino.head.Node) scriptNode78);
        java.lang.String str86 = node64.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode66);
        com.google.javascript.rhino.head.Node node87 = new com.google.javascript.rhino.head.Node(48, node55, (com.google.javascript.rhino.head.Node) regExpLiteral57, (com.google.javascript.rhino.head.Node) functionNode66);
        java.lang.Object obj89 = regExpLiteral57.getProp((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode16.replaceChildAfter((com.google.javascript.rhino.head.Node) functionNode33, (com.google.javascript.rhino.head.Node) regExpLiteral57);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        com.google.javascript.rhino.head.ast.Jump jump5 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump5.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump9 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump5, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int12 = scriptNode11.getEndLineno();
        int int13 = scriptNode11.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList14 = scriptNode11.getChildScopes();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump5, (com.google.javascript.rhino.head.Node) scriptNode11);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int17 = functionNode16.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = functionNode16.getTop();
        com.google.javascript.rhino.head.Node node19 = functionNode16.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList20 = functionNode16.getParams();
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump5, (com.google.javascript.rhino.head.Node) functionNode16, 3);
        functionNode16.setSourceName("            {\n            }\n");
        functionNode16.setIsExpressionClosure(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = functionNode16.toSource((-793599801));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        functionNode11.setParens(0, 350469479);
        boolean boolean18 = functionNode11.requiresActivation();
        java.util.List<com.google.javascript.rhino.head.Node> nodeList19 = functionNode11.getResumptionPoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = functionNode11.getRegexpString((-601958044));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList15 = scriptNode10.getFunctions();
        functionNodeList15.clear();
        functionNodeList15.clear();
        java.util.Iterator<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeItor18 = functionNodeList15.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int20 = functionNode19.getLp();
        functionNode19.setLp((int) (short) 1);
        int int25 = functionNode19.getIntProp(4, 26);
        functionNode19.flattenSymbolTable(true);
        boolean boolean28 = functionNodeList15.equals((java.lang.Object) functionNode19);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode30 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int31 = functionNode30.getLp();
        functionNode30.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode34 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int35 = functionNode34.getLp();
        functionNode34.setEncodedSource("");
        functionNode34.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode40 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int41 = functionNode40.getLp();
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode30, (com.google.javascript.rhino.head.Node) functionNode34, (com.google.javascript.rhino.head.Node) functionNode40, (int) '#');
        com.google.javascript.rhino.head.ast.Comment comment44 = functionNode40.getJsDocNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode45 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope47 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode48 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = functionNode48.getTop();
        functionNode48.setParens((int) (byte) 1, (int) (short) 1);
        functionNode48.setEncodedSourceStart((-1));
        functionNode48.setFunctionIsGetter();
        scope47.addChildToFront((com.google.javascript.rhino.head.Node) functionNode48);
        functionNode45.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode48);
        boolean boolean58 = functionNode40.isParam((com.google.javascript.rhino.head.ast.AstNode) functionNode45);
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node(193715443, (-1262414679));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode19.replaceChild((com.google.javascript.rhino.head.Node) functionNode40, node61);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((-446577320));
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode((-1));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int6 = scriptNode5.getEndLineno();
        int int7 = scriptNode5.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = scriptNode12.getChildScopes();
        jump10.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode12);
        java.lang.String str17 = scriptNode12.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode5, (com.google.javascript.rhino.head.ast.Scope) scriptNode12);
        int int19 = scriptNode5.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump22 = new com.google.javascript.rhino.head.ast.Jump(3, 13);
        functionNode3.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode5, (com.google.javascript.rhino.head.Node) jump22);
        scriptNode5.setEncodedSourceEnd(11);
        int int26 = scriptNode5.getEncodedSourceEnd();
        scriptNode5.flattenSymbolTable(false);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList29 = scriptNode5.getChildScopes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scope1.removeChild((com.google.javascript.rhino.head.Node) scriptNode5);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode17 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int18 = functionNode17.getLp();
        functionNode17.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int22 = functionNode21.getLp();
        functionNode21.setEncodedSource("");
        functionNode21.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode27 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int28 = functionNode27.getLp();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode17, (com.google.javascript.rhino.head.Node) functionNode21, (com.google.javascript.rhino.head.Node) functionNode27, (int) '#');
        com.google.javascript.rhino.head.ast.Comment comment31 = functionNode27.getJsDocNode();
        int int32 = functionNode27.getFunctionCount();
        java.lang.String str33 = scriptNode10.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode27);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode34 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int35 = functionNode34.getLp();
        functionNode34.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode38 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope40 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode41 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = functionNode41.getTop();
        functionNode41.setParens((int) (byte) 1, (int) (short) 1);
        functionNode41.setEncodedSourceStart((-1));
        functionNode41.setFunctionIsGetter();
        scope40.addChildToFront((com.google.javascript.rhino.head.Node) functionNode41);
        functionNode38.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode41);
        int int51 = functionNode34.addFunction(functionNode38);
        java.lang.Object obj52 = functionNode38.getCompilerData();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) functionNode27, (com.google.javascript.rhino.head.ast.Scope) functionNode38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str54 = functionNode27.debugPrint();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        int int1 = scriptNode0.getEncodedSourceEnd();
        scriptNode0.clearParentScope();
        scriptNode0.setEncodedSource("                                      /hi!/-1\tSCRIPT -1 1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = scriptNode0.getFunctionNode(0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList15 = scriptNode10.getFunctions();
        int int16 = functionNodeList15.size();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator17 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        functionNodeList15.sort((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator17);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator19 = positionComparator17.reversed();
        com.google.javascript.rhino.head.ast.Jump jump23 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump23.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump27 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump23, 0);
        com.google.javascript.rhino.head.ast.Jump jump31 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump31.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump35 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump31, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode36 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int37 = functionNode36.getLp();
        functionNode36.setEncodedSource("");
        functionNode36.flattenSymbolTable(false);
        jump23.addChildAfter((com.google.javascript.rhino.head.Node) jump31, (com.google.javascript.rhino.head.Node) functionNode36);
        int int43 = functionNode36.getPosition();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode45 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        boolean boolean46 = functionNode45.isExpressionClosure();
        int int47 = positionComparator17.compare((com.google.javascript.rhino.head.ast.AstNode) functionNode36, (com.google.javascript.rhino.head.ast.AstNode) functionNode45);
        java.lang.String str48 = functionNode45.getSourceName();
        int int49 = functionNode45.getRp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = functionNode45.getTop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str52 = functionNode45.toSource(7);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        scriptNode1.removeChildren();
        com.google.javascript.rhino.head.ast.Scope scope4 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = functionNode5.getTop();
        functionNode5.setParens((int) (byte) 1, (int) (short) 1);
        functionNode5.setEncodedSourceStart((-1));
        functionNode5.setFunctionIsGetter();
        scope4.addChildToFront((com.google.javascript.rhino.head.Node) functionNode5);
        functionNode5.setRp(19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int18 = scriptNode17.getEndLineno();
        int int19 = scriptNode17.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump22 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int25 = scriptNode24.getEndLineno();
        int int26 = scriptNode24.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList27 = scriptNode24.getChildScopes();
        jump22.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode24);
        java.lang.String str29 = scriptNode24.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode17, (com.google.javascript.rhino.head.ast.Scope) scriptNode24);
        com.google.javascript.rhino.head.ast.Scope scope31 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode24.target = scope31;
        java.lang.String str33 = functionNode5.toStringTree(scriptNode24);
        scriptNode1.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = scriptNode1.getRegexpFlags((int) (short) 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLp((int) (short) 1);
        int int6 = functionNode0.getIntProp(4, 26);
        boolean boolean7 = functionNode0.hasChildren();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int9 = functionNode8.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str12 = functionNode8.toStringTree(scriptNode11);
        functionNode8.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode14 = functionNode8.getBody();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList15 = functionNode8.getParams();
        functionNode0.setParams(astNodeList15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode18 = functionNode0.getFunctionNode((-1));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral3 = new com.google.javascript.rhino.head.ast.RegExpLiteral((-1), 3);
        java.lang.String str4 = regExpLiteral3.getFlags();
        com.google.javascript.rhino.head.ast.Comment comment5 = regExpLiteral3.getJsDocNode();
        com.google.javascript.rhino.head.ast.Jump jump6 = new com.google.javascript.rhino.head.ast.Jump((-398329421), (com.google.javascript.rhino.head.Node) regExpLiteral3);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int8 = functionNode7.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode7.getTop();
        boolean boolean10 = functionNode7.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList11 = functionNode7.getSymbols();
        int int12 = functionNode7.getLength();
        boolean boolean13 = functionNode7.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump17.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump21 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump17, 0);
        com.google.javascript.rhino.head.ast.Jump jump25 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump25.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump29 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump25, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode30 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int31 = functionNode30.getLp();
        functionNode30.setEncodedSource("");
        functionNode30.flattenSymbolTable(false);
        jump17.addChildAfter((com.google.javascript.rhino.head.Node) jump25, (com.google.javascript.rhino.head.Node) functionNode30);
        functionNode7.setBody((com.google.javascript.rhino.head.ast.AstNode) jump17);
        com.google.javascript.rhino.head.Token.CommentType commentType40 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment42 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType40, "109");
        comment42.putIntProp(0, 1);
        jump17.setJsDocNode(comment42);
        com.google.javascript.rhino.head.Token.CommentType commentType51 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment53 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType51, "109");
        com.google.javascript.rhino.head.ast.Comment comment55 = new com.google.javascript.rhino.head.ast.Comment(136, 15, commentType51, "-1\tSCRIPT -1 1\n");
        com.google.javascript.rhino.head.Token.CommentType commentType56 = com.google.javascript.rhino.head.Token.CommentType.JSDOC;
        comment55.setCommentType(commentType56);
        com.google.javascript.rhino.head.Token.CommentType commentType58 = com.google.javascript.rhino.head.Token.CommentType.JSDOC;
        comment55.setCommentType(commentType58);
        com.google.javascript.rhino.head.Token.CommentType commentType64 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment66 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType64, "109");
        java.lang.String str68 = comment66.toSource(19);
        java.lang.String str69 = comment66.getValue();
        java.lang.String str70 = comment66.getValue();
        com.google.javascript.rhino.head.Token.CommentType commentType71 = com.google.javascript.rhino.head.Token.CommentType.LINE;
        comment66.setCommentType(commentType71);
        com.google.javascript.rhino.head.ast.Comment comment74 = new com.google.javascript.rhino.head.ast.Comment(1, 1, commentType71, "                    /null/");
        java.lang.String str75 = comment74.getValue();
        com.google.javascript.rhino.head.Token.CommentType commentType78 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment80 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType78, "109");
        java.lang.String str82 = comment80.toSource(19);
        com.google.javascript.rhino.head.Token.CommentType commentType83 = comment80.getCommentType();
        comment74.setCommentType(commentType83);
        comment55.setCommentType(commentType83);
        com.google.javascript.rhino.head.Node node86 = comment55.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        regExpLiteral3.replaceChild((com.google.javascript.rhino.head.Node) comment42, (com.google.javascript.rhino.head.Node) comment55);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str5 = functionNode1.toStringTree(scriptNode4);
        functionNode1.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode7 = functionNode1.getBody();
        functionNode1.setParens(21, (int) '#');
        int int11 = functionNode1.getLineno();
        functionNode1.setRp(9);
        functionNode1.setLineno(774094395);
        functionNode1.flattenSymbolTable(true);
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = functionNode1.getRegexpString(671469117);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        int int3 = scriptNode1.getBaseLineno();
        scriptNode1.removeProp(0);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList6 = scriptNode1.getSymbols();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int8 = functionNode7.getLp();
        functionNode7.setLineno(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = functionNode11.getTop();
        boolean boolean14 = functionNode11.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList15 = functionNode11.getSymbols();
        functionNode11.setRp(5);
        com.google.javascript.rhino.head.ast.Scope scope18 = functionNode11.getEnclosingScope();
        functionNode11.setLineno(5);
        functionNode7.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) functionNode11);
        scriptNode1.setParentScope((com.google.javascript.rhino.head.ast.Scope) functionNode7);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = functionNode24.getTop();
        java.lang.String str26 = scriptNode25.getJsDoc();
        com.google.javascript.rhino.head.Node node28 = scriptNode25.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int30 = functionNode29.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str33 = functionNode29.toStringTree(scriptNode32);
        com.google.javascript.rhino.head.ast.Scope scope35 = scriptNode32.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList36 = scriptNode32.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int39 = scriptNode38.getEndLineno();
        int int40 = scriptNode38.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode32, (com.google.javascript.rhino.head.ast.Scope) scriptNode38);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int44 = scriptNode43.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int47 = scriptNode46.getEndLineno();
        scriptNode43.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode46);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode49 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int50 = functionNode49.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = functionNode49.getTop();
        boolean boolean52 = functionNode49.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int55 = scriptNode54.getEndLineno();
        int int56 = scriptNode54.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump59 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode61 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int62 = scriptNode61.getEndLineno();
        int int63 = scriptNode61.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList64 = scriptNode61.getChildScopes();
        jump59.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode61);
        java.lang.String str66 = scriptNode61.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode54, (com.google.javascript.rhino.head.ast.Scope) scriptNode61);
        com.google.javascript.rhino.head.ast.Scope scope68 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode61.target = scope68;
        functionNode49.addChildScope(scope68);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode46, (com.google.javascript.rhino.head.ast.Scope) functionNode49);
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node(20, (com.google.javascript.rhino.head.Node) scriptNode25, (com.google.javascript.rhino.head.Node) scriptNode32, (com.google.javascript.rhino.head.Node) scriptNode46);
        int int73 = scriptNode46.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode75 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int76 = scriptNode75.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode78 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int79 = scriptNode78.getEndLineno();
        scriptNode75.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode78);
        java.lang.String str81 = scriptNode75.getNextTempName();
        scriptNode46.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode7.removeChild((com.google.javascript.rhino.head.Node) scriptNode75);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        functionNode1.setSourceName("                                                                                                                                                                                                        /null/");
        functionNode1.setRequiresActivation();
        functionNode1.removeProp(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int9 = functionNode8.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = functionNode8.getTop();
        com.google.javascript.rhino.head.Node node11 = functionNode8.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList12 = functionNode8.getParams();
        functionNode1.setParams(astNodeList12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = functionNode1.debugPrint();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = functionNode1.getChildScopes();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int18 = scriptNode17.getEndLineno();
        int int19 = scriptNode17.getBaseLineno();
        com.google.javascript.rhino.head.Node node20 = scriptNode17.getNext();
        scriptNode17.setPosition((int) (byte) -1);
        functionNode1.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode17);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode(13);
        int int26 = functionNode25.getType();
        functionNode25.setRelative(350469479);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node29 = scriptNode17.getChildBefore((com.google.javascript.rhino.head.Node) functionNode25);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        scriptNode1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int8 = functionNode7.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode7.getTop();
        boolean boolean10 = functionNode7.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        jump17.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        java.lang.String str24 = scriptNode19.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode12, (com.google.javascript.rhino.head.ast.Scope) scriptNode19);
        com.google.javascript.rhino.head.ast.Scope scope26 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode19.target = scope26;
        functionNode7.addChildScope(scope26);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode4, (com.google.javascript.rhino.head.ast.Scope) functionNode7);
        int int30 = functionNode7.getFunctionCount();
        int int31 = functionNode7.getLineno();
        functionNode7.setFunctionIsSetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = functionNode7.debugPrint();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setEncodedSource("");
        functionNode0.flattenSymbolTable(false);
        java.lang.String str6 = functionNode0.getName();
        functionNode0.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int9 = functionNode8.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = functionNode8.getTop();
        com.google.javascript.rhino.head.Node node11 = functionNode8.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList12 = functionNode8.getParams();
        functionNode0.setParams(astNodeList12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = functionNode0.getRegexpString(4);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode8.getTop();
        functionNode8.setParens((int) (byte) 1, (int) (short) 1);
        functionNode8.setEncodedSourceStart((-1));
        functionNode8.setFunctionIsGetter();
        scope7.addChildToFront((com.google.javascript.rhino.head.Node) functionNode8);
        functionNode5.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode8);
        functionNode5.setFunctionIsSetter();
        int int19 = functionNode0.addFunction(functionNode5);
        functionNode0.setEncodedSourceStart(1);
        boolean boolean22 = functionNode0.isExpressionClosure();
        com.google.javascript.rhino.head.ast.Symbol symbol24 = functionNode0.getSymbol("  {\n  }\n");
        functionNode0.setLp(1579347477);
        functionNode0.setRelative(48);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = functionNode29.getTop();
        functionNode29.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode34 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope36 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode37 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = functionNode37.getTop();
        functionNode37.setParens((int) (byte) 1, (int) (short) 1);
        functionNode37.setEncodedSourceStart((-1));
        functionNode37.setFunctionIsGetter();
        scope36.addChildToFront((com.google.javascript.rhino.head.Node) functionNode37);
        functionNode34.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode37);
        functionNode34.setFunctionIsSetter();
        int int48 = functionNode29.addFunction(functionNode34);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = functionNode34.getTop();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap50 = scriptNode49.getSymbolTable();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode52 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int53 = functionNode52.getLp();
        functionNode52.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode56 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int57 = functionNode56.getLp();
        functionNode56.setEncodedSource("");
        functionNode56.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode62 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int63 = functionNode62.getLp();
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode52, (com.google.javascript.rhino.head.Node) functionNode56, (com.google.javascript.rhino.head.Node) functionNode62, (int) '#');
        functionNode62.setEncodedSourceStart(25);
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap68 = functionNode62.getLiveLocals();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList69 = functionNode62.getSymbols();
        scriptNode49.setSymbols(symbolList69);
        int int73 = scriptNode49.getIntProp(161, 13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode0.removeChild((com.google.javascript.rhino.head.Node) scriptNode49);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        boolean boolean15 = functionNode11.isGenerator();
        com.google.javascript.rhino.head.ast.Scope scope17 = new com.google.javascript.rhino.head.ast.Scope();
        scope17.setBounds(0, 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = functionNode21.getTop();
        int int23 = functionNode21.getRegexpCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = functionNode21.getEnclosingFunction();
        java.lang.String str25 = scope17.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode21);
        functionNode11.putProp(1, (java.lang.Object) functionNode21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = functionNode11.getRegexpFlags(32);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        boolean boolean3 = functionNode1.isGetter();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral5 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral5.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str8 = regExpLiteral5.getValue();
        regExpLiteral5.setFlags("52");
        functionNode1.addChildrenToFront((com.google.javascript.rhino.head.Node) regExpLiteral5);
        boolean boolean12 = functionNode1.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = functionNode13.getTop();
        int int15 = functionNode13.getRegexpCount();
        int int16 = functionNode13.getParamCount();
        com.google.javascript.rhino.head.ast.AstNode astNode17 = functionNode13.getBody();
        int int18 = functionNode1.addFunction(functionNode13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = functionNode1.toSource(12);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        boolean boolean15 = functionNode11.isGenerator();
        com.google.javascript.rhino.head.ast.Scope scope17 = new com.google.javascript.rhino.head.ast.Scope();
        scope17.setBounds(0, 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = functionNode21.getTop();
        int int23 = functionNode21.getRegexpCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = functionNode21.getEnclosingFunction();
        java.lang.String str25 = scope17.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode21);
        functionNode11.putProp(1, (java.lang.Object) functionNode21);
        functionNode11.setParens(8, (int) (byte) 10);
        boolean boolean30 = functionNode11.isGetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode31 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = functionNode31.getTop();
        int int33 = functionNode31.getRegexpCount();
        int int34 = functionNode31.getParamCount();
        com.google.javascript.rhino.head.ast.AstNode astNode35 = functionNode31.getBody();
        java.util.List<com.google.javascript.rhino.head.Node> nodeList36 = functionNode31.getResumptionPoints();
        functionNode11.setTop((com.google.javascript.rhino.head.ast.ScriptNode) functionNode31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = functionNode31.toSource((-446577320));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) ' ');
        java.lang.String str3 = scope1.toSource((int) (byte) 100);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        java.lang.String str11 = functionNode5.getName();
        functionNode5.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int14 = functionNode13.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = functionNode13.getTop();
        boolean boolean16 = functionNode13.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList17 = functionNode13.getSymbols();
        functionNode13.setRp(5);
        com.google.javascript.rhino.head.ast.Scope scope20 = functionNode13.getEnclosingScope();
        functionNode13.setLineno(5);
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode13, 1);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator25 = functionNode5.spliterator();
        scope1.replaceWith((com.google.javascript.rhino.head.ast.Scope) functionNode5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = functionNode5.toSource(2);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(830992929);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = functionNode1.debugPrint();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int6 = scriptNode5.getEndLineno();
        int int7 = scriptNode5.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = scriptNode12.getChildScopes();
        jump10.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode12);
        java.lang.String str17 = scriptNode12.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode5, (com.google.javascript.rhino.head.ast.Scope) scriptNode12);
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode12.target = scope19;
        functionNode0.addChildScope(scope19);
        boolean boolean22 = functionNode0.hasConsistentReturnUsage();
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap23 = functionNode0.getLiveLocals();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int26 = functionNode25.getEncodedSourceStart();
        functionNode0.addResumptionPoint((com.google.javascript.rhino.head.Node) functionNode25);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap28 = functionNode0.getSymbolTable();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode30 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int31 = functionNode30.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = functionNode30.getTop();
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode30);
        functionNode0.addChildScope((com.google.javascript.rhino.head.ast.Scope) functionNode30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = functionNode30.toSource(136);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        com.google.javascript.rhino.head.Token.CommentType commentType2 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment4 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType2, "109");
        java.lang.String str6 = comment4.toSource(19);
        com.google.javascript.rhino.head.Token.CommentType commentType7 = comment4.getCommentType();
        int int8 = comment4.getLineno();
        comment4.setLineno(109);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int14 = functionNode13.getBaseLineno();
        boolean boolean15 = functionNode13.isGetter();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral17 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral17.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str20 = regExpLiteral17.getValue();
        regExpLiteral17.setFlags("52");
        functionNode13.addChildrenToFront((com.google.javascript.rhino.head.Node) regExpLiteral17);
        boolean boolean24 = functionNode13.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.Jump jump27 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int30 = scriptNode29.getEndLineno();
        int int31 = scriptNode29.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList32 = scriptNode29.getChildScopes();
        jump27.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode29);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor34 = scriptNode29.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode35 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int36 = functionNode35.getLp();
        functionNode35.setEncodedSource("");
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode29, (com.google.javascript.rhino.head.ast.Scope) functionNode35);
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) functionNode13, (com.google.javascript.rhino.head.Node) scriptNode29);
        int int41 = scriptNode29.getParamCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node42 = comment4.getChildBefore((com.google.javascript.rhino.head.Node) scriptNode29);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(9);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode2.getTop();
        functionNode2.setParens((int) (byte) 1, (int) (short) 1);
        functionNode2.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList9 = functionNode2.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope11 = functionNode2.getDefiningScope("hi!");
        boolean boolean12 = functionNode2.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int15 = scriptNode14.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol17 = scriptNode14.getSymbol("hi!");
        scriptNode14.putIntProp(3, 0);
        functionNode2.addResumptionPoint((com.google.javascript.rhino.head.Node) scriptNode14);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode23 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = functionNode23.getTop();
        functionNode23.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode23);
        int int29 = functionNode23.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.Jump jump34 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump34.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump38 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump34, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int41 = scriptNode40.getEndLineno();
        int int42 = scriptNode40.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList43 = scriptNode40.getChildScopes();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump34, (com.google.javascript.rhino.head.Node) scriptNode40);
        java.lang.String str45 = scriptNode40.getSourceName();
        functionNode23.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode40);
        functionNode2.setCompilerData((java.lang.Object) scriptNode40);
        int int48 = functionNode2.getEndLineno();
        com.google.javascript.rhino.head.Node node49 = functionNode2.getFirstChild();
        functionNode2.setFunctionType((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node52 = functionNode1.getChildBefore((com.google.javascript.rhino.head.Node) functionNode2);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        com.google.javascript.rhino.head.ast.Jump jump3 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump3.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump3, 0);
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump11.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump15 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump11, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int17 = functionNode16.getLp();
        functionNode16.setEncodedSource("");
        functionNode16.flattenSymbolTable(false);
        jump3.addChildAfter((com.google.javascript.rhino.head.Node) jump11, (com.google.javascript.rhino.head.Node) functionNode16);
        com.google.javascript.rhino.head.Node node23 = functionNode16.target;
        boolean boolean24 = functionNode16.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.Scope scope25 = functionNode16.getEnclosingScope();
        java.util.List<com.google.javascript.rhino.head.Node> nodeList26 = functionNode16.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Jump jump31 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump31.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump35 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump31, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int38 = scriptNode37.getEndLineno();
        int int39 = scriptNode37.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList40 = scriptNode37.getChildScopes();
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump31, (com.google.javascript.rhino.head.Node) scriptNode37);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList42 = scriptNode37.getFunctions();
        int int43 = scriptNode37.getPosition();
        functionNode16.addParam((com.google.javascript.rhino.head.ast.AstNode) scriptNode37);
        com.google.javascript.rhino.head.Node node45 = functionNode16.target;
        java.lang.String[] strArray46 = functionNode16.getParamAndVarNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = functionNode16.toSource();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        symbol0.setIndex(6);
        java.lang.String str3 = symbol0.toString();
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump7.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump7, 0);
        com.google.javascript.rhino.head.ast.Jump jump15 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump15.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump19 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump15, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int21 = functionNode20.getLp();
        functionNode20.setEncodedSource("");
        functionNode20.flattenSymbolTable(false);
        jump7.addChildAfter((com.google.javascript.rhino.head.Node) jump15, (com.google.javascript.rhino.head.Node) functionNode20);
        com.google.javascript.rhino.head.Node node27 = functionNode20.target;
        boolean boolean28 = functionNode20.hasConsistentReturnUsage();
        symbol0.setContainingTable((com.google.javascript.rhino.head.ast.Scope) functionNode20);
        com.google.javascript.rhino.head.ast.Scope scope30 = symbol0.getContainingTable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = scope30.toSource(10);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList2 = functionNode0.getStatements();
        com.google.javascript.rhino.head.ast.AstNode astNode3 = functionNode0.getMemberExprNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = functionNode0.getFunctionNode(19);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int3 = functionNode2.getLp();
        functionNode2.setLp((int) (short) 1);
        int int8 = functionNode2.getIntProp(4, 26);
        com.google.javascript.rhino.head.ast.Jump jump9 = new com.google.javascript.rhino.head.ast.Jump(3, (com.google.javascript.rhino.head.Node) functionNode2);
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) functionNode2);
        functionNode2.setRequiresActivation();
        com.google.javascript.rhino.head.Node node13 = functionNode2.setType(9);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int15 = functionNode14.getLp();
        com.google.javascript.rhino.head.ast.Scope scope17 = functionNode14.getDefiningScope("109");
        functionNode14.setIsGenerator();
        boolean boolean19 = functionNode14.isGetter();
        boolean boolean20 = functionNode14.isGenerator();
        functionNode2.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) functionNode14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = functionNode2.toSource((-1));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = functionNode0.getAstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode3 = functionNode0.getMemberExprNode();
        boolean boolean4 = functionNode0.isSetter();
        int int5 = functionNode0.getFunctionCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int7 = functionNode6.getLp();
        functionNode6.setEncodedSource("");
        functionNode6.flattenSymbolTable(false);
        boolean boolean12 = functionNode6.requiresActivation();
        java.lang.String str13 = functionNode6.getEncodedSource();
        com.google.javascript.rhino.head.Node node15 = functionNode6.setType(19);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int17 = functionNode16.getLp();
        functionNode16.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope22 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode23 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = functionNode23.getTop();
        functionNode23.setParens((int) (byte) 1, (int) (short) 1);
        functionNode23.setEncodedSourceStart((-1));
        functionNode23.setFunctionIsGetter();
        scope22.addChildToFront((com.google.javascript.rhino.head.Node) functionNode23);
        functionNode20.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode23);
        int int33 = functionNode16.addFunction(functionNode20);
        java.lang.Object obj34 = functionNode20.getCompilerData();
        boolean boolean35 = functionNode20.requiresActivation();
        functionNode0.addChildAfter(node15, (com.google.javascript.rhino.head.Node) functionNode20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = functionNode20.toSource();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        scriptNode1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int8 = functionNode7.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode7.getTop();
        boolean boolean10 = functionNode7.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        jump17.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        java.lang.String str24 = scriptNode19.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode12, (com.google.javascript.rhino.head.ast.Scope) scriptNode19);
        com.google.javascript.rhino.head.ast.Scope scope26 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode19.target = scope26;
        functionNode7.addChildScope(scope26);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode4, (com.google.javascript.rhino.head.ast.Scope) functionNode7);
        int int30 = functionNode7.getFunctionCount();
        int int31 = functionNode7.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = functionNode7.toSource((-1110578805));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        com.google.javascript.rhino.head.ast.Jump jump0 = new com.google.javascript.rhino.head.ast.Jump();
        com.google.javascript.rhino.head.Node node1 = jump0.target;
        com.google.javascript.rhino.head.ast.Jump jump6 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump6.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump6, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = scriptNode12.getChildScopes();
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump6, (com.google.javascript.rhino.head.Node) scriptNode12);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList17 = scriptNode12.getFunctions();
        int int18 = functionNodeList17.size();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator19 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        functionNodeList17.sort((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator19);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator21 = positionComparator19.reversed();
        com.google.javascript.rhino.head.ast.Jump jump25 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump25.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump29 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump25, 0);
        com.google.javascript.rhino.head.ast.Jump jump33 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump33.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump37 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump33, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode38 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int39 = functionNode38.getLp();
        functionNode38.setEncodedSource("");
        functionNode38.flattenSymbolTable(false);
        jump25.addChildAfter((com.google.javascript.rhino.head.Node) jump33, (com.google.javascript.rhino.head.Node) functionNode38);
        int int45 = functionNode38.getPosition();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode47 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        boolean boolean48 = functionNode47.isExpressionClosure();
        int int49 = positionComparator19.compare((com.google.javascript.rhino.head.ast.AstNode) functionNode38, (com.google.javascript.rhino.head.ast.AstNode) functionNode47);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode50 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = functionNode50.getTop();
        functionNode50.setParens((int) (byte) 1, (int) (short) 1);
        functionNode50.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList57 = functionNode50.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope59 = functionNode50.getDefiningScope("hi!");
        boolean boolean60 = functionNode50.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.Scope scope62 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        int[] intArray69 = new int[] { 25, 17, (short) 0, 20, 19, (byte) 1 };
        functionNode50.addLiveLocals((com.google.javascript.rhino.head.Node) scope62, intArray69);
        com.google.javascript.rhino.head.Node node72 = functionNode50.setType(100);
        functionNode50.setIsGenerator();
        functionNode47.setCompilerData((java.lang.Object) functionNode50);
        functionNode50.setRp(5);
        com.google.javascript.rhino.head.Node node78 = new com.google.javascript.rhino.head.Node((int) 'a');
        com.google.javascript.rhino.head.Token.CommentType commentType81 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment83 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType81, "109");
        java.lang.String str85 = comment83.toSource(19);
        java.lang.String str86 = comment83.getValue();
        java.lang.String str87 = comment83.getValue();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator88 = comment83.new NodeIterator();
        node78.setJsDocNode(comment83);
        boolean boolean90 = comment83.hasChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        jump0.addChildBefore((com.google.javascript.rhino.head.Node) functionNode50, (com.google.javascript.rhino.head.Node) comment83);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        com.google.javascript.rhino.head.Node node3 = functionNode0.getLastSibling();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int5 = functionNode4.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = functionNode4.getTop();
        boolean boolean7 = functionNode4.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int10 = scriptNode9.getEndLineno();
        int int11 = scriptNode9.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump14 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int17 = scriptNode16.getEndLineno();
        int int18 = scriptNode16.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList19 = scriptNode16.getChildScopes();
        jump14.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode16);
        java.lang.String str21 = scriptNode16.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode9, (com.google.javascript.rhino.head.ast.Scope) scriptNode16);
        com.google.javascript.rhino.head.ast.Scope scope23 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode16.target = scope23;
        functionNode4.addChildScope(scope23);
        boolean boolean26 = functionNode4.hasConsistentReturnUsage();
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap27 = functionNode4.getLiveLocals();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int30 = functionNode29.getEncodedSourceStart();
        functionNode4.addResumptionPoint((com.google.javascript.rhino.head.Node) functionNode29);
        functionNode4.setEncodedSource("/null//null/-1\tSCRIPT -1 1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node34 = functionNode0.getChildBefore((com.google.javascript.rhino.head.Node) functionNode4);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList15 = scriptNode10.getFunctions();
        int int16 = scriptNode10.getPosition();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList17 = scriptNode10.getChildScopes();
        scriptNode10.flattenSymbolTable(false);
        java.lang.String str21 = scriptNode10.toSource((int) ' ');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int25 = scriptNode24.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol26 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str27 = symbol26.getName();
        com.google.javascript.rhino.head.Node node28 = symbol26.getNode();
        com.google.javascript.rhino.head.ast.Jump jump30 = new com.google.javascript.rhino.head.ast.Jump((int) ' ');
        symbol26.setNode((com.google.javascript.rhino.head.Node) jump30);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode33 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int34 = functionNode33.getBaseLineno();
        functionNode33.setSourceName("                                                                                                                                                                                                        /null/");
        symbol26.setContainingTable((com.google.javascript.rhino.head.ast.Scope) functionNode33);
        int int38 = functionNode33.getLp();
        int int39 = functionNode33.getType();
        java.lang.String str40 = scriptNode24.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode33);
        com.google.javascript.rhino.head.ast.AstNode astNode41 = functionNode33.getBody();
        java.lang.String str42 = functionNode33.getSourceName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode((-616130778));
        int int45 = scriptNode44.getLength();
        scriptNode44.setEndLineno((int) ' ');
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral49 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) '#');
        java.lang.String str50 = regExpLiteral49.shortName();
        regExpLiteral49.setFlags("-1\tBLOCK -1 1\n");
        regExpLiteral49.setFlags("                                            {\n                                            }\n");
        regExpLiteral49.setFlags("                          ");
        int int59 = regExpLiteral49.getIntProp(15, (int) '#');
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node((int) '#', (com.google.javascript.rhino.head.Node) functionNode33, (com.google.javascript.rhino.head.Node) scriptNode44, (com.google.javascript.rhino.head.Node) regExpLiteral49, (int) (byte) 10);
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node((int) (short) -1, (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode10.replaceChildAfter((com.google.javascript.rhino.head.Node) regExpLiteral49, node64);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int3 = functionNode2.getEncodedSourceStart();
        int int4 = functionNode2.getFunctionCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = functionNode5.getTop();
        functionNode5.setParens((int) (byte) 1, (int) (short) 1);
        int int10 = functionNode5.getRp();
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(17, (com.google.javascript.rhino.head.Node) functionNode2, (com.google.javascript.rhino.head.Node) functionNode5, (int) (short) 0);
        com.google.javascript.rhino.head.ast.Symbol symbol14 = functionNode5.getSymbol("$0");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode15 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int16 = functionNode15.getLp();
        functionNode15.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope21 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode22 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = functionNode22.getTop();
        functionNode22.setParens((int) (byte) 1, (int) (short) 1);
        functionNode22.setEncodedSourceStart((-1));
        functionNode22.setFunctionIsGetter();
        scope21.addChildToFront((com.google.javascript.rhino.head.Node) functionNode22);
        functionNode19.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode22);
        int int32 = functionNode15.addFunction(functionNode19);
        functionNode5.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode15);
        java.lang.String str34 = functionNode5.getNextTempName();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral36 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str38 = regExpLiteral36.toSource((int) (byte) 10);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator39 = regExpLiteral36.new NodeIterator();
        java.lang.String str41 = regExpLiteral36.toSource(100);
        java.lang.String str42 = regExpLiteral36.getJsDoc();
        functionNode5.addRegExp(regExpLiteral36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str45 = functionNode5.toSource((int) (short) 1);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        scriptNode1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        java.lang.String str7 = scriptNode1.getNextTempName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.AstNode astNode9 = functionNode8.getParent();
        scriptNode1.setParentScope((com.google.javascript.rhino.head.ast.Scope) functionNode8);
        functionNode8.clearParentScope();
        int int12 = functionNode8.getRegexpCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = functionNode8.getRegexpFlags(394394084);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        jump17.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor24 = scriptNode19.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int26 = functionNode25.getLp();
        functionNode25.setEncodedSource("");
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode19, (com.google.javascript.rhino.head.ast.Scope) functionNode25);
        com.google.javascript.rhino.head.ast.Jump jump34 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump34.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump38 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump34, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int41 = scriptNode40.getEndLineno();
        int int42 = scriptNode40.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList43 = scriptNode40.getChildScopes();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump34, (com.google.javascript.rhino.head.Node) scriptNode40);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList45 = scriptNode40.getFunctions();
        functionNodeList45.clear();
        int int48 = functionNodeList45.lastIndexOf((java.lang.Object) (-1L));
        com.google.javascript.rhino.head.ast.Jump jump53 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump53.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump57 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump53, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int60 = scriptNode59.getEndLineno();
        int int61 = scriptNode59.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList62 = scriptNode59.getChildScopes();
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump53, (com.google.javascript.rhino.head.Node) scriptNode59);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList64 = scriptNode59.getFunctions();
        functionNodeList64.clear();
        int int67 = functionNodeList64.lastIndexOf((java.lang.Object) (-1L));
        boolean boolean68 = functionNodeList45.removeAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList64);
        com.google.javascript.rhino.head.ast.Jump jump73 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump73.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump77 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump73, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode79 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int80 = scriptNode79.getEndLineno();
        int int81 = scriptNode79.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList82 = scriptNode79.getChildScopes();
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump73, (com.google.javascript.rhino.head.Node) scriptNode79);
        com.google.javascript.rhino.head.Node node85 = scriptNode79.setType(0);
        int int86 = functionNodeList64.lastIndexOf((java.lang.Object) scriptNode79);
        functionNode11.addChildAfter((com.google.javascript.rhino.head.Node) functionNode25, (com.google.javascript.rhino.head.Node) scriptNode79);
        java.lang.String str88 = functionNode11.getNextTempName();
        boolean boolean89 = functionNode11.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.Node> nodeList90 = functionNode11.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope93 = new com.google.javascript.rhino.head.ast.Scope((int) (short) -1, 0);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator94 = scope93.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node95 = functionNode11.getChildBefore((com.google.javascript.rhino.head.Node) scope93);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        functionNode0.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode3);
        functionNode0.setFunctionIsSetter();
        boolean boolean14 = functionNode0.isExpressionClosure();
        functionNode0.putIntProp(7, (int) (byte) 0);
        functionNode0.setPosition(21);
        functionNode0.setIsGenerator();
        functionNode0.setIsExpressionClosure(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode23 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int24 = functionNode23.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str27 = functionNode23.toStringTree(scriptNode26);
        functionNode23.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode29 = functionNode23.getBody();
        functionNode23.setParens(21, (int) '#');
        int int33 = functionNode23.getLineno();
        functionNode23.setRp(9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = functionNode23.getTop();
        java.lang.Object obj37 = functionNode23.getCompilerData();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral39 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str41 = regExpLiteral39.toSource((int) (byte) 10);
        regExpLiteral39.setFlags("-1\tSCRIPT -1 1\n");
        regExpLiteral39.removeProp(8);
        java.lang.String str46 = regExpLiteral39.getValue();
        regExpLiteral39.setLineno(10);
        java.lang.String str50 = regExpLiteral39.toSource(4);
        com.google.javascript.rhino.head.ast.Scope scope51 = new com.google.javascript.rhino.head.ast.Scope();
        scope51.setBounds(0, 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode55 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode56 = functionNode55.getTop();
        int int57 = functionNode55.getRegexpCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode58 = functionNode55.getEnclosingFunction();
        java.lang.String str59 = scope51.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode55);
        java.lang.String str60 = functionNode55.shortName();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap61 = functionNode55.getSymbolTable();
        regExpLiteral39.addChildrenToBack((com.google.javascript.rhino.head.Node) functionNode55);
        regExpLiteral39.setFlags("20\tCOMMENT 20 1\n");
        com.google.javascript.rhino.head.ast.Jump jump67 = new com.google.javascript.rhino.head.ast.Jump(0, 2);
        regExpLiteral39.addChild((com.google.javascript.rhino.head.ast.AstNode) jump67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode0.replaceChild((com.google.javascript.rhino.head.Node) functionNode23, (com.google.javascript.rhino.head.Node) regExpLiteral39);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode((-1));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int4 = scriptNode3.getEndLineno();
        int int5 = scriptNode3.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        jump8.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode10);
        java.lang.String str15 = scriptNode10.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode3, (com.google.javascript.rhino.head.ast.Scope) scriptNode10);
        int int17 = scriptNode3.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump20 = new com.google.javascript.rhino.head.ast.Jump(3, 13);
        functionNode1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode3, (com.google.javascript.rhino.head.Node) jump20);
        scriptNode3.setEncodedSourceEnd(11);
        int int24 = scriptNode3.getEncodedSourceEnd();
        scriptNode3.flattenSymbolTable(false);
        scriptNode3.putIntProp(16, 23);
        java.lang.String str31 = scriptNode3.toSource((-616130778));
        java.lang.String str32 = scriptNode3.debugPrint();
        com.google.javascript.rhino.head.ast.Symbol symbol34 = scriptNode3.getSymbol("                                                                                                                                                                                                        {\n                                                                                                                                                                                                        }\n");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode35 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int36 = functionNode35.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str39 = functionNode35.toStringTree(scriptNode38);
        int int40 = scriptNode38.getRegexpCount();
        com.google.javascript.rhino.head.Node node41 = scriptNode38.getLastSibling();
        com.google.javascript.rhino.head.Node node42 = node41.getNext();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode44 = new com.google.javascript.rhino.head.ast.FunctionNode(13);
        node41.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode44);
        int int46 = functionNode44.getType();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList47 = functionNode44.getFunctions();
        java.lang.String str48 = functionNode44.getEncodedSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode3.removeChild((com.google.javascript.rhino.head.Node) functionNode44);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        functionNode0.setEncodedSourceStart((-1));
        functionNode0.setIsGenerator();
        functionNode0.setEncodedSourceBounds(26, (int) (short) 1);
        functionNode0.setRp((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = functionNode0.toSource(52);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode1.getTop();
        boolean boolean4 = functionNode1.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int7 = scriptNode6.getEndLineno();
        int int8 = scriptNode6.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int14 = scriptNode13.getEndLineno();
        int int15 = scriptNode13.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList16 = scriptNode13.getChildScopes();
        jump11.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode13);
        java.lang.String str18 = scriptNode13.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode6, (com.google.javascript.rhino.head.ast.Scope) scriptNode13);
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode13.target = scope20;
        functionNode1.addChildScope(scope20);
        boolean boolean23 = functionNode1.hasConsistentReturnUsage();
        java.lang.String str24 = functionNode1.getNextTempName();
        com.google.javascript.rhino.head.ast.Jump jump25 = new com.google.javascript.rhino.head.ast.Jump((int) (short) -1, (com.google.javascript.rhino.head.Node) functionNode1);
        java.lang.String str26 = functionNode1.getEncodedSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = functionNode1.debugPrint();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        functionNode0.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode3);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = functionNode13.getTop();
        functionNode13.setParens((int) (byte) 1, (int) (short) 1);
        functionNode13.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList20 = functionNode13.getResumptionPoints();
        int int21 = functionNode13.getLp();
        functionNode0.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode13);
        com.google.javascript.rhino.head.Node node23 = functionNode13.getNext();
        int int24 = functionNode13.getLineno();
        com.google.javascript.rhino.head.Node node25 = functionNode13.target;
        functionNode13.setEncodedSourceStart((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = functionNode13.debugPrint();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLp((int) (short) 1);
        int int6 = functionNode0.getIntProp(4, 26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = functionNode0.toSource(8);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setIsExpressionClosure(false);
        com.google.javascript.rhino.head.ast.Jump jump6 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int9 = scriptNode8.getEndLineno();
        int int10 = scriptNode8.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList11 = scriptNode8.getChildScopes();
        jump6.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode8);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int15 = functionNode14.getLp();
        functionNode14.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode18 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int19 = functionNode18.getLp();
        functionNode18.setEncodedSource("");
        functionNode18.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int25 = functionNode24.getLp();
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode14, (com.google.javascript.rhino.head.Node) functionNode18, (com.google.javascript.rhino.head.Node) functionNode24, (int) '#');
        jump6.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode14);
        jump6.setPosition((int) (byte) -1);
        int int31 = functionNode0.compareTo((com.google.javascript.rhino.head.ast.AstNode) jump6);
        com.google.javascript.rhino.head.ast.Comment comment32 = functionNode0.getJsDocNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = functionNode0.getRegexpString(136);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode2.getTop();
        functionNode2.setParens((int) (byte) 1, (int) (short) 1);
        functionNode2.setEncodedSourceStart((-1));
        functionNode2.setFunctionIsGetter();
        scope1.addChildToFront((com.google.javascript.rhino.head.Node) functionNode2);
        functionNode2.setRp(19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int15 = scriptNode14.getEndLineno();
        int int16 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump19 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int22 = scriptNode21.getEndLineno();
        int int23 = scriptNode21.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList24 = scriptNode21.getChildScopes();
        jump19.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode21);
        java.lang.String str26 = scriptNode21.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode14, (com.google.javascript.rhino.head.ast.Scope) scriptNode21);
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode21.target = scope28;
        java.lang.String str30 = functionNode2.toStringTree(scriptNode21);
        java.lang.String str32 = scriptNode21.toSource((int) (short) 10);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap33 = scriptNode21.getSymbolTable();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int36 = scriptNode35.getEndLineno();
        int int37 = scriptNode35.getBaseLineno();
        scriptNode35.removeProp(0);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList40 = scriptNode35.getSymbols();
        boolean boolean41 = strMap33.containsValue((java.lang.Object) symbolList40);
        java.util.Collection<com.google.javascript.rhino.head.ast.Symbol> symbolCollection42 = strMap33.values();
        com.google.javascript.rhino.head.ast.Jump jump44 = new com.google.javascript.rhino.head.ast.Jump(1579347477);
        com.google.javascript.rhino.head.ast.Symbol symbol45 = strMap33.remove((java.lang.Object) 1579347477);
        com.google.javascript.rhino.head.ast.Jump jump48 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int51 = scriptNode50.getEndLineno();
        int int52 = scriptNode50.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList53 = scriptNode50.getChildScopes();
        jump48.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode50);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode56 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int57 = functionNode56.getLp();
        functionNode56.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode60 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int61 = functionNode60.getLp();
        functionNode60.setEncodedSource("");
        functionNode60.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode66 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int67 = functionNode66.getLp();
        com.google.javascript.rhino.head.Node node69 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode56, (com.google.javascript.rhino.head.Node) functionNode60, (com.google.javascript.rhino.head.Node) functionNode66, (int) '#');
        jump48.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode56);
        boolean boolean71 = strMap33.containsValue((java.lang.Object) functionNode56);
        com.google.javascript.rhino.head.Node node72 = functionNode56.getLastChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode74 = functionNode56.getFunctionNode(771817347);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) (short) 1, "                                                                                                                                                                                                        /null/");
        node2.removeChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int7 = scriptNode6.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int10 = scriptNode9.getEndLineno();
        scriptNode6.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode9);
        com.google.javascript.rhino.head.ast.Jump jump13 = new com.google.javascript.rhino.head.ast.Jump((int) 'a', (com.google.javascript.rhino.head.Node) scriptNode9, 350469479);
        boolean boolean14 = jump13.hasConsistentReturnUsage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node15 = node2.getChildBefore((com.google.javascript.rhino.head.Node) jump13);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope6 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = functionNode7.getTop();
        functionNode7.setParens((int) (byte) 1, (int) (short) 1);
        functionNode7.setEncodedSourceStart((-1));
        functionNode7.setFunctionIsGetter();
        scope6.addChildToFront((com.google.javascript.rhino.head.Node) functionNode7);
        functionNode4.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode7);
        int int17 = functionNode0.addFunction(functionNode4);
        java.lang.String str18 = functionNode0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = functionNode0.toSource(22);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        int int3 = scriptNode1.getBaseLineno();
        scriptNode1.removeProp(0);
        scriptNode1.setSourceName("109");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = functionNode9.getTop();
        java.lang.String str11 = scriptNode10.getJsDoc();
        com.google.javascript.rhino.head.Node node13 = scriptNode10.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int15 = functionNode14.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str18 = functionNode14.toStringTree(scriptNode17);
        com.google.javascript.rhino.head.ast.Scope scope20 = scriptNode17.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList21 = scriptNode17.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int24 = scriptNode23.getEndLineno();
        int int25 = scriptNode23.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode17, (com.google.javascript.rhino.head.ast.Scope) scriptNode23);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int29 = scriptNode28.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int32 = scriptNode31.getEndLineno();
        scriptNode28.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode31);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode34 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int35 = functionNode34.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = functionNode34.getTop();
        boolean boolean37 = functionNode34.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int40 = scriptNode39.getEndLineno();
        int int41 = scriptNode39.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump44 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int47 = scriptNode46.getEndLineno();
        int int48 = scriptNode46.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList49 = scriptNode46.getChildScopes();
        jump44.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode46);
        java.lang.String str51 = scriptNode46.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode39, (com.google.javascript.rhino.head.ast.Scope) scriptNode46);
        com.google.javascript.rhino.head.ast.Scope scope53 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode46.target = scope53;
        functionNode34.addChildScope(scope53);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode31, (com.google.javascript.rhino.head.ast.Scope) functionNode34);
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node(20, (com.google.javascript.rhino.head.Node) scriptNode10, (com.google.javascript.rhino.head.Node) scriptNode17, (com.google.javascript.rhino.head.Node) scriptNode31);
        boolean boolean58 = scriptNode17.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node59 = scriptNode1.getChildBefore((com.google.javascript.rhino.head.Node) scriptNode17);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope6 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = functionNode7.getTop();
        functionNode7.setParens((int) (byte) 1, (int) (short) 1);
        functionNode7.setEncodedSourceStart((-1));
        functionNode7.setFunctionIsGetter();
        scope6.addChildToFront((com.google.javascript.rhino.head.Node) functionNode7);
        functionNode4.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode7);
        int int17 = functionNode0.addFunction(functionNode4);
        java.lang.Object obj18 = functionNode4.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int21 = scriptNode20.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int24 = scriptNode23.getEndLineno();
        scriptNode20.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode23);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int27 = functionNode26.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = functionNode26.getTop();
        boolean boolean29 = functionNode26.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int32 = scriptNode31.getEndLineno();
        int int33 = scriptNode31.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump36 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int39 = scriptNode38.getEndLineno();
        int int40 = scriptNode38.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList41 = scriptNode38.getChildScopes();
        jump36.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode38);
        java.lang.String str43 = scriptNode38.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode31, (com.google.javascript.rhino.head.ast.Scope) scriptNode38);
        com.google.javascript.rhino.head.ast.Scope scope45 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode38.target = scope45;
        functionNode26.addChildScope(scope45);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode23, (com.google.javascript.rhino.head.ast.Scope) functionNode26);
        int int49 = functionNode26.getFunctionCount();
        int int50 = functionNode26.getLineno();
        int int51 = functionNode26.getAbsolutePosition();
        java.lang.String str52 = functionNode4.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode26);
        functionNode26.putIntProp(109, 17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str57 = functionNode26.toSource((-398329421));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str1 = symbol0.getName();
        com.google.javascript.rhino.head.Node node2 = symbol0.getNode();
        symbol0.setIndex(1);
        com.google.javascript.rhino.head.ast.Scope scope5 = symbol0.getContainingTable();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int7 = functionNode6.getLp();
        functionNode6.setLineno(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int11 = functionNode10.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = functionNode10.getTop();
        boolean boolean13 = functionNode10.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList14 = functionNode10.getSymbols();
        functionNode10.setRp(5);
        com.google.javascript.rhino.head.ast.Scope scope17 = functionNode10.getEnclosingScope();
        functionNode10.setLineno(5);
        functionNode6.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) functionNode10);
        symbol0.setContainingTable((com.google.javascript.rhino.head.ast.Scope) functionNode6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = functionNode6.toSource();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int3 = functionNode2.getLp();
        functionNode2.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int7 = functionNode6.getLp();
        functionNode6.setEncodedSource("");
        functionNode6.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int13 = functionNode12.getLp();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode2, (com.google.javascript.rhino.head.Node) functionNode6, (com.google.javascript.rhino.head.Node) functionNode12, (int) '#');
        com.google.javascript.rhino.head.ast.Jump jump18 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int21 = scriptNode20.getEndLineno();
        int int22 = scriptNode20.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList23 = scriptNode20.getChildScopes();
        jump18.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode20);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor25 = scriptNode20.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int27 = functionNode26.getLp();
        functionNode26.setEncodedSource("");
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode20, (com.google.javascript.rhino.head.ast.Scope) functionNode26);
        com.google.javascript.rhino.head.ast.Jump jump35 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump35.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump39 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump35, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int42 = scriptNode41.getEndLineno();
        int int43 = scriptNode41.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList44 = scriptNode41.getChildScopes();
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump35, (com.google.javascript.rhino.head.Node) scriptNode41);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList46 = scriptNode41.getFunctions();
        functionNodeList46.clear();
        int int49 = functionNodeList46.lastIndexOf((java.lang.Object) (-1L));
        com.google.javascript.rhino.head.ast.Jump jump54 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump54.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump58 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump54, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int61 = scriptNode60.getEndLineno();
        int int62 = scriptNode60.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList63 = scriptNode60.getChildScopes();
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump54, (com.google.javascript.rhino.head.Node) scriptNode60);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList65 = scriptNode60.getFunctions();
        functionNodeList65.clear();
        int int68 = functionNodeList65.lastIndexOf((java.lang.Object) (-1L));
        boolean boolean69 = functionNodeList46.removeAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList65);
        com.google.javascript.rhino.head.ast.Jump jump74 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump74.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump78 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump74, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode80 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int81 = scriptNode80.getEndLineno();
        int int82 = scriptNode80.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList83 = scriptNode80.getChildScopes();
        com.google.javascript.rhino.head.Node node84 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump74, (com.google.javascript.rhino.head.Node) scriptNode80);
        com.google.javascript.rhino.head.Node node86 = scriptNode80.setType(0);
        int int87 = functionNodeList65.lastIndexOf((java.lang.Object) scriptNode80);
        functionNode12.addChildAfter((com.google.javascript.rhino.head.Node) functionNode26, (com.google.javascript.rhino.head.Node) scriptNode80);
        java.lang.String str89 = functionNode12.getNextTempName();
        functionNode12.removeChildren();
        com.google.javascript.rhino.head.Node node92 = new com.google.javascript.rhino.head.Node(10, (com.google.javascript.rhino.head.Node) functionNode12, 109);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str93 = functionNode12.debugPrint();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str4 = functionNode0.toStringTree(scriptNode3);
        functionNode0.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode6 = functionNode0.getBody();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList7 = functionNode0.getParams();
        com.google.javascript.rhino.head.Node node8 = functionNode0.target;
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList9 = functionNode0.getParams();
        com.google.javascript.rhino.head.Token.CommentType commentType12 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment14 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType12, "109");
        java.lang.String str16 = comment14.toSource(0);
        com.google.javascript.rhino.head.ast.Jump jump21 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump21.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump25 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump21, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int28 = scriptNode27.getEndLineno();
        int int29 = scriptNode27.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList30 = scriptNode27.getChildScopes();
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump21, (com.google.javascript.rhino.head.Node) scriptNode27);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList32 = scriptNode27.getFunctions();
        functionNodeList32.clear();
        int int35 = functionNodeList32.lastIndexOf((java.lang.Object) (-1L));
        com.google.javascript.rhino.head.ast.Jump jump40 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump40.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump44 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump40, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int47 = scriptNode46.getEndLineno();
        int int48 = scriptNode46.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList49 = scriptNode46.getChildScopes();
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump40, (com.google.javascript.rhino.head.Node) scriptNode46);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList51 = scriptNode46.getFunctions();
        functionNodeList51.clear();
        int int54 = functionNodeList51.lastIndexOf((java.lang.Object) (-1L));
        boolean boolean55 = functionNodeList32.removeAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList51);
        com.google.javascript.rhino.head.ast.Jump jump60 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump60.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump64 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump60, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int67 = scriptNode66.getEndLineno();
        int int68 = scriptNode66.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList69 = scriptNode66.getChildScopes();
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump60, (com.google.javascript.rhino.head.Node) scriptNode66);
        com.google.javascript.rhino.head.Node node72 = scriptNode66.setType(0);
        int int73 = functionNodeList51.lastIndexOf((java.lang.Object) scriptNode66);
        int int74 = scriptNode66.getLineno();
        scriptNode66.setEncodedSourceBounds(4, 35);
        java.lang.String str79 = scriptNode66.toSource((-592978996));
        comment14.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node81 = functionNode0.getChildBefore((com.google.javascript.rhino.head.Node) comment14);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral2 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) ' ', 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int4 = functionNode3.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = functionNode3.getTop();
        boolean boolean6 = functionNode3.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList7 = functionNode3.getSymbols();
        functionNode3.setRp(5);
        com.google.javascript.rhino.head.ast.Scope scope10 = functionNode3.getEnclosingScope();
        functionNode3.setLineno(5);
        functionNode3.setIsExpressionClosure(false);
        com.google.javascript.rhino.head.ast.Scope scope15 = functionNode3.getParentScope();
        java.lang.String str16 = functionNode3.getNextTempName();
        java.util.List<com.google.javascript.rhino.head.Node> nodeList17 = functionNode3.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope((-146877426), 3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        regExpLiteral2.addChildBefore((com.google.javascript.rhino.head.Node) functionNode3, (com.google.javascript.rhino.head.Node) scope20);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        com.google.javascript.rhino.head.ast.Jump jump6 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump6.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump6, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = scriptNode12.getChildScopes();
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump6, (com.google.javascript.rhino.head.Node) scriptNode12);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList17 = scriptNode12.getChildScopes();
        com.google.javascript.rhino.head.ast.Jump jump18 = new com.google.javascript.rhino.head.ast.Jump(11, (com.google.javascript.rhino.head.Node) scriptNode12);
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node((int) (byte) -1, (com.google.javascript.rhino.head.Node) scriptNode12, 19);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int22 = functionNode21.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = functionNode21.getTop();
        boolean boolean24 = functionNode21.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int27 = scriptNode26.getEndLineno();
        int int28 = scriptNode26.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump31 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int34 = scriptNode33.getEndLineno();
        int int35 = scriptNode33.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList36 = scriptNode33.getChildScopes();
        jump31.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode33);
        java.lang.String str38 = scriptNode33.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode26, (com.google.javascript.rhino.head.ast.Scope) scriptNode33);
        com.google.javascript.rhino.head.ast.Scope scope40 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode33.target = scope40;
        functionNode21.addChildScope(scope40);
        boolean boolean43 = functionNode21.hasConsistentReturnUsage();
        boolean boolean44 = functionNode21.hasSideEffects();
        node20.addChildToFront((com.google.javascript.rhino.head.Node) functionNode21);
        functionNode21.putIntProp(24, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str50 = functionNode21.toSource((-352611807));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        functionNode1.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor6 = functionNode1.iterator();
        functionNode1.setLp(136);
        int int9 = functionNode1.getFunctionType();
        com.google.javascript.rhino.head.Node node10 = functionNode1.getLastChild();
        com.google.javascript.rhino.head.ast.Scope scope11 = functionNode1.getParentScope();
        boolean boolean12 = functionNode1.isGetter();
        com.google.javascript.rhino.head.ast.Jump jump13 = new com.google.javascript.rhino.head.ast.Jump(12, (com.google.javascript.rhino.head.Node) functionNode1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = functionNode1.getRegexpString(350469479);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str4 = functionNode0.toStringTree(scriptNode3);
        functionNode0.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode6 = functionNode0.getBody();
        functionNode0.setParens(21, (int) '#');
        int int10 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.Jump jump15 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump15.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump19 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump15, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int22 = scriptNode21.getEndLineno();
        int int23 = scriptNode21.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList24 = scriptNode21.getChildScopes();
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump15, (com.google.javascript.rhino.head.Node) scriptNode21);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList26 = scriptNode21.getChildScopes();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList27 = scriptNode21.getSymbols();
        functionNode0.setSymbols(symbolList27);
        com.google.javascript.rhino.head.ast.AstNode astNode29 = functionNode0.getBody();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral32 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) '#');
        java.lang.String str33 = regExpLiteral32.shortName();
        regExpLiteral32.setFlags("-1\tBLOCK -1 1\n");
        functionNode0.putProp((int) (byte) -1, (java.lang.Object) "-1\tBLOCK -1 1\n");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral38 = new com.google.javascript.rhino.head.ast.RegExpLiteral((-1262414679));
        java.lang.String str39 = regExpLiteral38.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode0.removeChild((com.google.javascript.rhino.head.Node) regExpLiteral38);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLp((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = functionNode0.toSource(161);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        com.google.javascript.rhino.head.Node node3 = functionNode0.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList4 = functionNode0.getParams();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = functionNode0.toSource(136);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList15 = scriptNode10.getFunctions();
        int int16 = scriptNode10.getPosition();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList17 = scriptNode10.getChildScopes();
        scriptNode10.flattenSymbolTable(false);
        int int20 = scriptNode10.getEncodedSourceEnd();
        java.lang.Object obj22 = scriptNode10.getProp(771817347);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = scriptNode10.getRegexpString(691568742);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode1.getTop();
        boolean boolean4 = functionNode1.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int7 = scriptNode6.getEndLineno();
        int int8 = scriptNode6.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int14 = scriptNode13.getEndLineno();
        int int15 = scriptNode13.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList16 = scriptNode13.getChildScopes();
        jump11.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode13);
        java.lang.String str18 = scriptNode13.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode6, (com.google.javascript.rhino.head.ast.Scope) scriptNode13);
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode13.target = scope20;
        functionNode1.addChildScope(scope20);
        boolean boolean23 = functionNode1.hasConsistentReturnUsage();
        java.lang.String str24 = functionNode1.getNextTempName();
        com.google.javascript.rhino.head.ast.Jump jump25 = new com.google.javascript.rhino.head.ast.Jump((int) (short) -1, (com.google.javascript.rhino.head.Node) functionNode1);
        boolean boolean26 = functionNode1.isExpressionClosure();
        functionNode1.putIntProp(1, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode30 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int31 = functionNode30.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = functionNode30.getTop();
        com.google.javascript.rhino.head.Node node33 = functionNode30.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList34 = functionNode30.getParams();
        functionNode1.target = functionNode30;
        java.lang.String str36 = functionNode1.getEncodedSource();
        java.lang.String str37 = functionNode1.getName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = functionNode1.getTop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = functionNode1.toSource();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        com.google.javascript.rhino.head.ast.AstNode astNode15 = functionNode1.getBody();
        java.lang.String str16 = functionNode1.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = functionNode1.toSource((-592978996));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode8.getTop();
        functionNode8.setParens((int) (byte) 1, (int) (short) 1);
        functionNode8.setEncodedSourceStart((-1));
        functionNode8.setFunctionIsGetter();
        scope7.addChildToFront((com.google.javascript.rhino.head.Node) functionNode8);
        functionNode5.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode8);
        functionNode5.setFunctionIsSetter();
        int int19 = functionNode0.addFunction(functionNode5);
        functionNode0.setEncodedSourceStart(1);
        boolean boolean22 = functionNode0.isExpressionClosure();
        com.google.javascript.rhino.head.ast.Symbol symbol24 = functionNode0.getSymbol("  {\n  }\n");
        functionNode0.setFunctionIsSetter();
        functionNode0.setEncodedSource("8");
        com.google.javascript.rhino.head.Node node29 = functionNode0.setType(6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = functionNode0.getRegexpString(19);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        com.google.javascript.rhino.head.Node node0 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode2.getTop();
        java.lang.String str4 = scriptNode3.getJsDoc();
        com.google.javascript.rhino.head.Node node6 = scriptNode3.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int8 = functionNode7.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str11 = functionNode7.toStringTree(scriptNode10);
        com.google.javascript.rhino.head.ast.Scope scope13 = scriptNode10.getDefiningScope("");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int16 = scriptNode15.getEndLineno();
        int int17 = scriptNode15.getBaseLineno();
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node(25, node6, (com.google.javascript.rhino.head.Node) scriptNode10, (com.google.javascript.rhino.head.Node) scriptNode15);
        java.lang.String str19 = node0.toStringTree(scriptNode15);
        scriptNode15.setEncodedSource("                                                    /null/-1\tSCRIPT -1 1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode23 = scriptNode15.getFunctionNode((-18));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        com.google.javascript.rhino.head.ast.Comment comment15 = functionNode11.getJsDocNode();
        int int16 = functionNode11.getRp();
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newString((int) (byte) 1, "$0");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int21 = functionNode20.getLp();
        functionNode20.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope26 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode27 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = functionNode27.getTop();
        functionNode27.setParens((int) (byte) 1, (int) (short) 1);
        functionNode27.setEncodedSourceStart((-1));
        functionNode27.setFunctionIsGetter();
        scope26.addChildToFront((com.google.javascript.rhino.head.Node) functionNode27);
        functionNode24.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode27);
        int int37 = functionNode20.addFunction(functionNode24);
        com.google.javascript.rhino.head.ast.Symbol symbol39 = functionNode20.getSymbol("-1\tBLOCK -1 1\n");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int42 = scriptNode41.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol44 = scriptNode41.getSymbol("hi!");
        scriptNode41.putIntProp(3, 0);
        functionNode20.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode41);
        java.lang.String str49 = node19.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode20);
        functionNode11.addResumptionPoint(node19);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode51 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int52 = functionNode51.getLp();
        functionNode51.setLength(19);
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap55 = functionNode51.getLiveLocals();
        int int58 = functionNode51.getIntProp(628528643, (int) (short) 10);
        java.lang.String str59 = functionNode51.getSourceName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode61 = new com.google.javascript.rhino.head.ast.FunctionNode((-1262414679));
        boolean boolean62 = functionNode61.isExpressionClosure();
        int int63 = functionNode51.addFunction(functionNode61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode11.removeChild((com.google.javascript.rhino.head.Node) functionNode51);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setEncodedSource("");
        functionNode0.flattenSymbolTable(false);
        java.lang.String str6 = functionNode0.getName();
        int int7 = functionNode0.getType();
        functionNode0.setIsGenerator();
        int int9 = functionNode0.getLineno();
        functionNode0.setIsGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = functionNode0.toSource(24);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        functionNode1.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode1);
        functionNode1.setRequiresActivation();
        java.lang.String str8 = functionNode1.shortName();
        com.google.javascript.rhino.head.Node node10 = functionNode1.setType(14);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = functionNode13.getTop();
        java.lang.String str15 = scriptNode14.getJsDoc();
        com.google.javascript.rhino.head.Node node17 = scriptNode14.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode18 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int19 = functionNode18.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str22 = functionNode18.toStringTree(scriptNode21);
        com.google.javascript.rhino.head.ast.Scope scope24 = scriptNode21.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList25 = scriptNode21.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int28 = scriptNode27.getEndLineno();
        int int29 = scriptNode27.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode21, (com.google.javascript.rhino.head.ast.Scope) scriptNode27);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int33 = scriptNode32.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int36 = scriptNode35.getEndLineno();
        scriptNode32.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode35);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode38 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int39 = functionNode38.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = functionNode38.getTop();
        boolean boolean41 = functionNode38.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int44 = scriptNode43.getEndLineno();
        int int45 = scriptNode43.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump48 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int51 = scriptNode50.getEndLineno();
        int int52 = scriptNode50.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList53 = scriptNode50.getChildScopes();
        jump48.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode50);
        java.lang.String str55 = scriptNode50.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode43, (com.google.javascript.rhino.head.ast.Scope) scriptNode50);
        com.google.javascript.rhino.head.ast.Scope scope57 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode50.target = scope57;
        functionNode38.addChildScope(scope57);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode35, (com.google.javascript.rhino.head.ast.Scope) functionNode38);
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node(20, (com.google.javascript.rhino.head.Node) scriptNode14, (com.google.javascript.rhino.head.Node) scriptNode21, (com.google.javascript.rhino.head.Node) scriptNode35);
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node(136, (com.google.javascript.rhino.head.Node) scriptNode35);
        functionNode1.addParam((com.google.javascript.rhino.head.ast.AstNode) scriptNode35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str65 = functionNode1.toSource(200442009);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode3 = functionNode0.getBody();
        com.google.javascript.rhino.head.ast.Jump jump9 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump9.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump13 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump9, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int16 = scriptNode15.getEndLineno();
        int int17 = scriptNode15.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList18 = scriptNode15.getChildScopes();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump9, (com.google.javascript.rhino.head.Node) scriptNode15);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList20 = scriptNode15.getChildScopes();
        com.google.javascript.rhino.head.ast.Jump jump21 = new com.google.javascript.rhino.head.ast.Jump(11, (com.google.javascript.rhino.head.Node) scriptNode15);
        functionNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode15);
        scriptNode15.setLength(193715443);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = scriptNode15.getRegexpFlags(48);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        functionNode11.flattenSymbolTable(true);
        functionNode11.setLineno(1);
        java.lang.String str19 = functionNode11.getNextTempName();
        int int20 = functionNode11.depth();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = functionNode11.toSource(5);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str4 = functionNode0.toStringTree(scriptNode3);
        functionNode0.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode6 = functionNode0.getBody();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList7 = functionNode0.getParams();
        int int8 = functionNode0.getFunctionType();
        functionNode0.setBaseLineno(350469479);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList11 = functionNode0.getStatements();
        java.lang.Object obj12 = functionNode0.getCompilerData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = functionNode0.getFunctionNode(0);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        com.google.javascript.rhino.head.ast.Jump jump1 = new com.google.javascript.rhino.head.ast.Jump(20);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int4 = functionNode3.getLp();
        functionNode3.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int8 = functionNode7.getLp();
        functionNode7.setEncodedSource("");
        functionNode7.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int14 = functionNode13.getLp();
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode3, (com.google.javascript.rhino.head.Node) functionNode7, (com.google.javascript.rhino.head.Node) functionNode13, (int) '#');
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap17 = functionNode7.getSymbolTable();
        com.google.javascript.rhino.head.ast.Jump jump21 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump21.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump25 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump21, 0);
        com.google.javascript.rhino.head.ast.Jump jump29 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump29.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump33 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump29, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode34 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int35 = functionNode34.getLp();
        functionNode34.setEncodedSource("");
        functionNode34.flattenSymbolTable(false);
        jump21.addChildAfter((com.google.javascript.rhino.head.Node) jump29, (com.google.javascript.rhino.head.Node) functionNode34);
        functionNode7.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) functionNode34);
        jump1.setParent((com.google.javascript.rhino.head.ast.AstNode) functionNode34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str44 = functionNode34.toSource(13);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        functionNode1.setSourceName("                                                                                                                                                                                                        /null/");
        int int5 = functionNode1.getRegexpCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = functionNode1.getRegexpFlags(830992930);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope6 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = functionNode7.getTop();
        functionNode7.setParens((int) (byte) 1, (int) (short) 1);
        functionNode7.setEncodedSourceStart((-1));
        functionNode7.setFunctionIsGetter();
        scope6.addChildToFront((com.google.javascript.rhino.head.Node) functionNode7);
        functionNode4.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode7);
        int int17 = functionNode0.addFunction(functionNode4);
        java.lang.String str18 = functionNode4.getEncodedSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = functionNode4.getRegexpString(0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int3 = functionNode2.getEncodedSourceStart();
        int int4 = functionNode2.getFunctionCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = functionNode5.getTop();
        functionNode5.setParens((int) (byte) 1, (int) (short) 1);
        int int10 = functionNode5.getRp();
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(17, (com.google.javascript.rhino.head.Node) functionNode2, (com.google.javascript.rhino.head.Node) functionNode5, (int) (short) 0);
        com.google.javascript.rhino.head.ast.Jump jump18 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump18.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump22 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump18, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int25 = scriptNode24.getEndLineno();
        int int26 = scriptNode24.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList27 = scriptNode24.getChildScopes();
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump18, (com.google.javascript.rhino.head.Node) scriptNode24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int31 = scriptNode30.getEndLineno();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral33 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str35 = regExpLiteral33.toSource((int) (byte) 10);
        regExpLiteral33.setFlags("-1\tSCRIPT -1 1\n");
        regExpLiteral33.removeProp(8);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node(10, node28, (com.google.javascript.rhino.head.Node) scriptNode30, (com.google.javascript.rhino.head.Node) regExpLiteral33, 3);
        java.lang.String str43 = regExpLiteral33.makeIndent((int) (short) 100);
        int int44 = regExpLiteral33.getType();
        boolean boolean45 = regExpLiteral33.hasSideEffects();
        java.lang.String str46 = regExpLiteral33.getFlags();
        int int47 = functionNode2.compareTo((com.google.javascript.rhino.head.ast.AstNode) regExpLiteral33);
        functionNode2.setBaseLineno((int) (short) 1);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator50 = functionNode2.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str52 = functionNode2.getRegexpFlags((-817814412));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLp((int) (short) 1);
        int int6 = functionNode0.getIntProp(4, 26);
        boolean boolean7 = functionNode0.hasChildren();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList8 = functionNode0.getChildScopes();
        com.google.javascript.rhino.head.ast.Name name9 = functionNode0.getFunctionName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = functionNode0.getRegexpFlags((-22));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int3 = functionNode2.getEncodedSourceStart();
        int int4 = functionNode2.getFunctionCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = functionNode5.getTop();
        functionNode5.setParens((int) (byte) 1, (int) (short) 1);
        int int10 = functionNode5.getRp();
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(17, (com.google.javascript.rhino.head.Node) functionNode2, (com.google.javascript.rhino.head.Node) functionNode5, (int) (short) 0);
        functionNode5.setParens((-22), 4);
        com.google.javascript.rhino.head.Node node16 = functionNode5.getFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = functionNode5.toSource(193715443);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        com.google.javascript.rhino.head.ast.Jump jump3 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump3.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump3, 0);
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump11.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump15 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump11, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int17 = functionNode16.getLp();
        functionNode16.setEncodedSource("");
        functionNode16.flattenSymbolTable(false);
        jump3.addChildAfter((com.google.javascript.rhino.head.Node) jump11, (com.google.javascript.rhino.head.Node) functionNode16);
        int int23 = functionNode16.getPosition();
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap24 = functionNode16.getLiveLocals();
        int int25 = functionNode16.getType();
        int int26 = functionNode16.getRp();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int30 = functionNode29.getLp();
        functionNode29.setLp((int) (short) 1);
        int int35 = functionNode29.getIntProp(4, 26);
        com.google.javascript.rhino.head.ast.Jump jump36 = new com.google.javascript.rhino.head.ast.Jump(3, (com.google.javascript.rhino.head.Node) functionNode29);
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) functionNode29);
        functionNode29.setFunctionType(11);
        boolean boolean40 = functionNode29.hasChildren();
        functionNode29.setParens((-1262414679), (int) '#');
        functionNode16.addParam((com.google.javascript.rhino.head.ast.AstNode) functionNode29);
        com.google.javascript.rhino.head.ast.Scope scope45 = functionNode29.getParentScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = functionNode29.getRegexpString(445666398);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(26);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode(5);
        int int4 = functionNode1.compareTo((com.google.javascript.rhino.head.ast.AstNode) functionNode3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = functionNode1.getFunctionNode(448157869);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump7.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump7, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int14 = scriptNode13.getEndLineno();
        int int15 = scriptNode13.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList16 = scriptNode13.getChildScopes();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump7, (com.google.javascript.rhino.head.Node) scriptNode13);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList18 = scriptNode13.getFunctions();
        functionNodeList18.clear();
        com.google.javascript.rhino.head.ast.Jump jump24 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump24.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump28 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump24, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int31 = scriptNode30.getEndLineno();
        int int32 = scriptNode30.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList33 = scriptNode30.getChildScopes();
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump24, (com.google.javascript.rhino.head.Node) scriptNode30);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList35 = scriptNode30.getFunctions();
        boolean boolean36 = functionNodeList18.removeAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList35);
        functionNode1.putProp(20, (java.lang.Object) functionNodeList18);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode38 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int39 = functionNode38.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str42 = functionNode38.toStringTree(scriptNode41);
        int int43 = functionNode1.addFunction(functionNode38);
        com.google.javascript.rhino.head.Node node44 = functionNode1.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = functionNode1.toSource(32);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLineno(0);
        boolean boolean4 = functionNode0.isGetterOrSetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = functionNode0.toSource();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        int int1 = scriptNode0.getEncodedSourceEnd();
        scriptNode0.clearParentScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = scriptNode0.getRegexpFlags(819764875);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        functionNode1.setSourceName("                                                                                                                                                                                                        /null/");
        functionNode1.setRequiresActivation();
        com.google.javascript.rhino.head.Node node6 = functionNode1.target;
        int int7 = functionNode1.getLength();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral10 = new com.google.javascript.rhino.head.ast.RegExpLiteral((-601958044), (-603955719));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode1.removeChild((com.google.javascript.rhino.head.Node) regExpLiteral10);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = functionNode1.getEnclosingFunction();
        com.google.javascript.rhino.head.Node node3 = functionNode1.target;
        functionNode1.setLineno((int) (byte) -1);
        com.google.javascript.rhino.head.ast.Comment comment6 = functionNode1.getJsDocNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = functionNode1.toSource((-324184714));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int4 = functionNode3.getBaseLineno();
        boolean boolean5 = functionNode3.isGetter();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral7 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral7.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str10 = regExpLiteral7.getValue();
        regExpLiteral7.setFlags("52");
        functionNode3.addChildrenToFront((com.google.javascript.rhino.head.Node) regExpLiteral7);
        boolean boolean14 = functionNode3.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        jump17.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor24 = scriptNode19.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int26 = functionNode25.getLp();
        functionNode25.setEncodedSource("");
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode19, (com.google.javascript.rhino.head.ast.Scope) functionNode25);
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) functionNode3, (com.google.javascript.rhino.head.Node) scriptNode19);
        int int31 = functionNode3.getAbsolutePosition();
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node(97, (com.google.javascript.rhino.head.Node) functionNode3);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode33 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int34 = functionNode33.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = functionNode33.getTop();
        com.google.javascript.rhino.head.Node node36 = functionNode33.getLastSibling();
        com.google.javascript.rhino.head.ast.AstNode astNode37 = functionNode33.getMemberExprNode();
        java.lang.String str38 = node32.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str40 = functionNode33.getRegexpFlags((-715688198));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int3 = scriptNode2.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol5 = scriptNode2.getSymbol("hi!");
        java.lang.String str6 = scriptNode2.getEncodedSource();
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) (byte) 10, (com.google.javascript.rhino.head.Node) scriptNode2);
        com.google.javascript.rhino.head.ast.Jump jump9 = new com.google.javascript.rhino.head.ast.Jump((int) (short) 10);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor10 = jump9.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode2.removeChild((com.google.javascript.rhino.head.Node) jump9);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        com.google.javascript.rhino.head.ast.Jump jump3 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump3.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump3, 0);
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump11.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump15 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump11, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int17 = functionNode16.getLp();
        functionNode16.setEncodedSource("");
        functionNode16.flattenSymbolTable(false);
        jump3.addChildAfter((com.google.javascript.rhino.head.Node) jump11, (com.google.javascript.rhino.head.Node) functionNode16);
        com.google.javascript.rhino.head.Node node23 = functionNode16.target;
        boolean boolean24 = functionNode16.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.Name name25 = functionNode16.getFunctionName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = functionNode29.getTop();
        functionNode29.setParens((int) (byte) 1, (int) (short) 1);
        functionNode29.setEncodedSourceStart((-1));
        functionNode29.setFunctionIsGetter();
        scope28.addChildToFront((com.google.javascript.rhino.head.Node) functionNode29);
        functionNode26.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode29);
        functionNode29.setRelative(0);
        functionNode16.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode29);
        boolean boolean42 = functionNode16.isGenerator();
        com.google.javascript.rhino.head.ast.Comment comment43 = functionNode16.getJsDocNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str45 = functionNode16.getRegexpString(533381813);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor5 = functionNode0.iterator();
        functionNode0.setFunctionIsSetter();
        functionNode0.setParens(4, 819764875);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = functionNode0.debugPrint();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        com.google.javascript.rhino.head.Token.CommentType commentType3 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType3, "109");
        com.google.javascript.rhino.head.Token.CommentType commentType6 = comment5.getCommentType();
        comment5.setLength((int) '4');
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = functionNode10.getTop();
        functionNode10.setParens((int) (byte) 1, (int) (short) 1);
        functionNode10.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList17 = functionNode10.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope19 = functionNode10.getDefiningScope("hi!");
        boolean boolean20 = functionNode10.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.Scope scope22 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        int[] intArray29 = new int[] { 25, 17, (short) 0, 20, 19, (byte) 1 };
        functionNode10.addLiveLocals((com.google.javascript.rhino.head.Node) scope22, intArray29);
        com.google.javascript.rhino.head.Node node32 = functionNode10.setType(100);
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(10, (com.google.javascript.rhino.head.Node) functionNode10, (int) 'a');
        comment5.addChildToFront(node34);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int38 = scriptNode37.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int41 = scriptNode40.getEndLineno();
        scriptNode37.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode40);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode43 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int44 = functionNode43.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = functionNode43.getTop();
        boolean boolean46 = functionNode43.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int49 = scriptNode48.getEndLineno();
        int int50 = scriptNode48.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump53 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode55 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int56 = scriptNode55.getEndLineno();
        int int57 = scriptNode55.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList58 = scriptNode55.getChildScopes();
        jump53.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode55);
        java.lang.String str60 = scriptNode55.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode48, (com.google.javascript.rhino.head.ast.Scope) scriptNode55);
        com.google.javascript.rhino.head.ast.Scope scope62 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode55.target = scope62;
        functionNode43.addChildScope(scope62);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode40, (com.google.javascript.rhino.head.ast.Scope) functionNode43);
        int int66 = functionNode43.getFunctionCount();
        com.google.javascript.rhino.head.ast.Scope scope67 = functionNode43.getEnclosingScope();
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node((int) (byte) 10, (int) '#');
        functionNode43.setCompilerData((java.lang.Object) '#');
        com.google.javascript.rhino.head.Node node73 = new com.google.javascript.rhino.head.Node(8, (com.google.javascript.rhino.head.Node) comment5, (com.google.javascript.rhino.head.Node) functionNode43, (int) (short) -1);
        functionNode43.setLp((-631440296));
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor76 = functionNode43.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str77 = functionNode43.debugPrint();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        jump17.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor24 = scriptNode19.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int26 = functionNode25.getLp();
        functionNode25.setEncodedSource("");
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode19, (com.google.javascript.rhino.head.ast.Scope) functionNode25);
        com.google.javascript.rhino.head.ast.Jump jump34 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump34.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump38 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump34, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int41 = scriptNode40.getEndLineno();
        int int42 = scriptNode40.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList43 = scriptNode40.getChildScopes();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump34, (com.google.javascript.rhino.head.Node) scriptNode40);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList45 = scriptNode40.getFunctions();
        functionNodeList45.clear();
        int int48 = functionNodeList45.lastIndexOf((java.lang.Object) (-1L));
        com.google.javascript.rhino.head.ast.Jump jump53 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump53.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump57 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump53, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int60 = scriptNode59.getEndLineno();
        int int61 = scriptNode59.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList62 = scriptNode59.getChildScopes();
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump53, (com.google.javascript.rhino.head.Node) scriptNode59);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList64 = scriptNode59.getFunctions();
        functionNodeList64.clear();
        int int67 = functionNodeList64.lastIndexOf((java.lang.Object) (-1L));
        boolean boolean68 = functionNodeList45.removeAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList64);
        com.google.javascript.rhino.head.ast.Jump jump73 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump73.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump77 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump73, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode79 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int80 = scriptNode79.getEndLineno();
        int int81 = scriptNode79.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList82 = scriptNode79.getChildScopes();
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump73, (com.google.javascript.rhino.head.Node) scriptNode79);
        com.google.javascript.rhino.head.Node node85 = scriptNode79.setType(0);
        int int86 = functionNodeList64.lastIndexOf((java.lang.Object) scriptNode79);
        functionNode11.addChildAfter((com.google.javascript.rhino.head.Node) functionNode25, (com.google.javascript.rhino.head.Node) scriptNode79);
        java.lang.String str88 = functionNode11.getNextTempName();
        boolean boolean89 = functionNode11.hasSideEffects();
        functionNode11.setFunctionIsSetter();
        functionNode11.removeChildren();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator92 = functionNode11.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str94 = functionNode11.toSource((-324184714));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        scriptNode1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int8 = functionNode7.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode7.getTop();
        boolean boolean10 = functionNode7.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        jump17.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        java.lang.String str24 = scriptNode19.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode12, (com.google.javascript.rhino.head.ast.Scope) scriptNode19);
        com.google.javascript.rhino.head.ast.Scope scope26 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode19.target = scope26;
        functionNode7.addChildScope(scope26);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode4, (com.google.javascript.rhino.head.ast.Scope) functionNode7);
        int int30 = functionNode7.getFunctionCount();
        java.lang.String str31 = functionNode7.shortName();
        int int32 = functionNode7.getParamCount();
        functionNode7.setPosition(23);
        java.lang.Object obj35 = functionNode7.getCompilerData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode37 = functionNode7.getFunctionNode(35);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        java.lang.String str3 = scriptNode2.getJsDoc();
        com.google.javascript.rhino.head.Node node5 = scriptNode2.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int7 = functionNode6.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str10 = functionNode6.toStringTree(scriptNode9);
        com.google.javascript.rhino.head.ast.Scope scope12 = scriptNode9.getDefiningScope("");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int15 = scriptNode14.getEndLineno();
        int int16 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node(25, node5, (com.google.javascript.rhino.head.Node) scriptNode9, (com.google.javascript.rhino.head.Node) scriptNode14);
        boolean boolean18 = scriptNode14.hasConsistentReturnUsage();
        java.lang.String str19 = scriptNode14.getNextTempName();
        java.lang.String str20 = scriptNode14.shortName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int22 = functionNode21.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = functionNode21.getTop();
        boolean boolean24 = functionNode21.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList25 = functionNode21.getSymbols();
        scriptNode14.setSymbols(symbolList25);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList27 = scriptNode14.getStatements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = scriptNode14.getRegexpString(52);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        boolean boolean3 = functionNode1.isGetter();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral5 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral5.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str8 = regExpLiteral5.getValue();
        regExpLiteral5.setFlags("52");
        functionNode1.addChildrenToFront((com.google.javascript.rhino.head.Node) regExpLiteral5);
        boolean boolean12 = functionNode1.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = functionNode13.getTop();
        int int15 = functionNode13.getRegexpCount();
        int int16 = functionNode13.getParamCount();
        com.google.javascript.rhino.head.ast.AstNode astNode17 = functionNode13.getBody();
        int int18 = functionNode1.addFunction(functionNode13);
        functionNode13.setEncodedSourceStart(17);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int22 = functionNode21.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = functionNode21.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode24 = functionNode21.getBody();
        com.google.javascript.rhino.head.ast.Scope scope25 = functionNode21.getParentScope();
        int int26 = functionNode13.addFunction(functionNode21);
        int int27 = functionNode21.getLineno();
        functionNode21.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode(35);
        com.google.javascript.rhino.head.Node node32 = scriptNode30.setType(16);
        functionNode21.setTop(scriptNode30);
        java.lang.String str34 = functionNode21.getName();
        functionNode21.setRequiresActivation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode37 = functionNode21.getFunctionNode(11);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node((int) (byte) 100, (com.google.javascript.rhino.head.Node) functionNode3, 19);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int15 = functionNode14.getLp();
        functionNode14.setEncodedSource("");
        functionNode14.flattenSymbolTable(false);
        java.lang.String str20 = functionNode14.getName();
        functionNode14.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode22 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int23 = functionNode22.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = functionNode22.getTop();
        com.google.javascript.rhino.head.Node node25 = functionNode22.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList26 = functionNode22.getParams();
        functionNode14.setParams(astNodeList26);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode28 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int29 = functionNode28.getLp();
        functionNode28.setLp((int) (short) 1);
        int int34 = functionNode28.getIntProp(4, 26);
        functionNode28.flattenSymbolTable(true);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList37 = functionNode28.getParams();
        functionNode14.setParams(astNodeList37);
        functionNode14.setEndLineno(12);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor41 = functionNode14.iterator();
        int int42 = functionNode14.getLineno();
        functionNode3.addChildToBack((com.google.javascript.rhino.head.Node) functionNode14);
        int int44 = functionNode14.getEncodedSourceStart();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator45 = functionNode14.new NodeIterator();
        functionNode14.setParens(0, (-14761645));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str50 = functionNode14.getRegexpString(200442009);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        com.google.javascript.rhino.head.ast.Comment comment15 = functionNode11.getJsDocNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = functionNode19.getTop();
        functionNode19.setParens((int) (byte) 1, (int) (short) 1);
        functionNode19.setEncodedSourceStart((-1));
        functionNode19.setFunctionIsGetter();
        scope18.addChildToFront((com.google.javascript.rhino.head.Node) functionNode19);
        functionNode16.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode19);
        boolean boolean29 = functionNode11.isParam((com.google.javascript.rhino.head.ast.AstNode) functionNode16);
        functionNode11.setFunctionType(13);
        functionNode11.setRp(19);
        boolean boolean34 = functionNode11.isGenerator();
        java.util.List<com.google.javascript.rhino.head.Node> nodeList35 = functionNode11.getResumptionPoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = functionNode11.toSource();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = functionNode0.getSymbols();
        functionNode0.setRp(5);
        com.google.javascript.rhino.head.ast.Scope scope7 = functionNode0.getEnclosingScope();
        functionNode0.setLineno((int) (short) -1);
        com.google.javascript.rhino.head.ast.Scope scope11 = functionNode0.getDefiningScope("                  ");
        boolean boolean12 = functionNode0.isSetter();
        boolean boolean13 = functionNode0.requiresActivation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = functionNode0.toSource(16);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) (-22));
        boolean boolean2 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.Jump jump6 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump6.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump6, 0);
        com.google.javascript.rhino.head.ast.Jump jump14 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump14.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump18 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump14, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int20 = functionNode19.getLp();
        functionNode19.setEncodedSource("");
        functionNode19.flattenSymbolTable(false);
        jump6.addChildAfter((com.google.javascript.rhino.head.Node) jump14, (com.google.javascript.rhino.head.Node) functionNode19);
        com.google.javascript.rhino.head.Node node26 = functionNode19.target;
        boolean boolean27 = functionNode19.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.Name name28 = functionNode19.getFunctionName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope31 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode32 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = functionNode32.getTop();
        functionNode32.setParens((int) (byte) 1, (int) (short) 1);
        functionNode32.setEncodedSourceStart((-1));
        functionNode32.setFunctionIsGetter();
        scope31.addChildToFront((com.google.javascript.rhino.head.Node) functionNode32);
        functionNode29.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode32);
        functionNode32.setRelative(0);
        functionNode19.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode32);
        functionNode19.setEncodedSourceStart((int) (byte) 0);
        com.google.javascript.rhino.head.ast.AstNode astNode47 = functionNode19.getBody();
        int int48 = functionNode19.getFunctionCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node49 = node1.getChildBefore((com.google.javascript.rhino.head.Node) functionNode19);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode3 = functionNode0.getBody();
        int int4 = functionNode0.getLength();
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int10 = scriptNode9.getEndLineno();
        int int11 = scriptNode9.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList12 = scriptNode9.getChildScopes();
        jump7.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode9);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode15 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int16 = functionNode15.getLp();
        functionNode15.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int20 = functionNode19.getLp();
        functionNode19.setEncodedSource("");
        functionNode19.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int26 = functionNode25.getLp();
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode15, (com.google.javascript.rhino.head.Node) functionNode19, (com.google.javascript.rhino.head.Node) functionNode25, (int) '#');
        jump7.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode15);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList30 = functionNode15.getStatements();
        functionNode0.setParams(astNodeList30);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode32 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int33 = functionNode32.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = functionNode32.getTop();
        com.google.javascript.rhino.head.Node node35 = functionNode32.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList36 = functionNode32.getParams();
        functionNode0.setParams(astNodeList36);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode39 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int40 = functionNode39.getLp();
        functionNode39.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode43 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int44 = functionNode43.getLp();
        functionNode43.setEncodedSource("");
        functionNode43.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode49 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int50 = functionNode49.getLp();
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode39, (com.google.javascript.rhino.head.Node) functionNode43, (com.google.javascript.rhino.head.Node) functionNode49, (int) '#');
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap53 = functionNode43.getSymbolTable();
        com.google.javascript.rhino.head.ast.Jump jump57 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump57.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump61 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump57, 0);
        com.google.javascript.rhino.head.ast.Jump jump65 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump65.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump69 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump65, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode70 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int71 = functionNode70.getLp();
        functionNode70.setEncodedSource("");
        functionNode70.flattenSymbolTable(false);
        jump57.addChildAfter((com.google.javascript.rhino.head.Node) jump65, (com.google.javascript.rhino.head.Node) functionNode70);
        functionNode43.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) functionNode70);
        int int78 = functionNode70.getLp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode0.removeChild((com.google.javascript.rhino.head.Node) functionNode70);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        functionNode11.setEncodedSourceStart(25);
        boolean boolean17 = functionNode11.requiresActivation();
        java.lang.String str18 = functionNode11.getNextTempName();
        boolean boolean19 = functionNode11.hasChildren();
        functionNode11.removeProp((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = functionNode11.toSource((int) (short) 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        functionNode1.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int8 = functionNode7.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode7.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode10 = functionNode7.getBody();
        int int11 = functionNode7.getLength();
        com.google.javascript.rhino.head.ast.Jump jump14 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int17 = scriptNode16.getEndLineno();
        int int18 = scriptNode16.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList19 = scriptNode16.getChildScopes();
        jump14.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode16);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode22 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int23 = functionNode22.getLp();
        functionNode22.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int27 = functionNode26.getLp();
        functionNode26.setEncodedSource("");
        functionNode26.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode32 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int33 = functionNode32.getLp();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode22, (com.google.javascript.rhino.head.Node) functionNode26, (com.google.javascript.rhino.head.Node) functionNode32, (int) '#');
        jump14.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode22);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList37 = functionNode22.getStatements();
        functionNode7.setParams(astNodeList37);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode39 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int40 = functionNode39.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = functionNode39.getTop();
        com.google.javascript.rhino.head.Node node42 = functionNode39.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList43 = functionNode39.getParams();
        functionNode7.setParams(astNodeList43);
        functionNode1.addParam((com.google.javascript.rhino.head.ast.AstNode) functionNode7);
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral47 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) '#');
        java.lang.String str48 = regExpLiteral47.shortName();
        functionNode1.addRegExp(regExpLiteral47);
        functionNode1.setLp(26);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode53 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int54 = functionNode53.getLp();
        functionNode53.setEncodedSource("");
        functionNode53.flattenSymbolTable(false);
        java.lang.String str59 = functionNode53.getName();
        int int60 = functionNode53.getAbsolutePosition();
        java.lang.Object obj61 = functionNode53.getCompilerData();
        com.google.javascript.rhino.head.ast.Jump jump64 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int67 = scriptNode66.getEndLineno();
        int int68 = scriptNode66.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList69 = scriptNode66.getChildScopes();
        jump64.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode66);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode72 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int73 = functionNode72.getLp();
        functionNode72.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode76 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int77 = functionNode76.getLp();
        functionNode76.setEncodedSource("");
        functionNode76.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode82 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int83 = functionNode82.getLp();
        com.google.javascript.rhino.head.Node node85 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode72, (com.google.javascript.rhino.head.Node) functionNode76, (com.google.javascript.rhino.head.Node) functionNode82, (int) '#');
        jump64.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode72);
        int int87 = functionNode72.getLength();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList88 = functionNode72.getStatements();
        int int89 = functionNode72.getLp();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode90 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode91 = functionNode90.getTop();
        int int92 = functionNode90.getRegexpCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode93 = functionNode90.getEnclosingFunction();
        com.google.javascript.rhino.head.Node node94 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode53, (com.google.javascript.rhino.head.Node) functionNode72, (com.google.javascript.rhino.head.Node) functionNode90);
        functionNode53.setFunctionType(136);
        functionNode1.addChild((com.google.javascript.rhino.head.ast.AstNode) functionNode53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str99 = functionNode53.toSource((-979800144));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        com.google.javascript.rhino.head.ast.Jump jump3 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump3.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump3, 0);
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump11.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump15 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump11, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int17 = functionNode16.getLp();
        functionNode16.setEncodedSource("");
        functionNode16.flattenSymbolTable(false);
        jump3.addChildAfter((com.google.javascript.rhino.head.Node) jump11, (com.google.javascript.rhino.head.Node) functionNode16);
        int int23 = functionNode16.getPosition();
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap24 = functionNode16.getLiveLocals();
        int int25 = functionNode16.getType();
        int int26 = functionNode16.getRp();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int30 = functionNode29.getLp();
        functionNode29.setLp((int) (short) 1);
        int int35 = functionNode29.getIntProp(4, 26);
        com.google.javascript.rhino.head.ast.Jump jump36 = new com.google.javascript.rhino.head.ast.Jump(3, (com.google.javascript.rhino.head.Node) functionNode29);
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) functionNode29);
        functionNode29.setFunctionType(11);
        boolean boolean40 = functionNode29.hasChildren();
        functionNode29.setParens((-1262414679), (int) '#');
        functionNode16.addParam((com.google.javascript.rhino.head.ast.AstNode) functionNode29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode46 = functionNode16.getFunctionNode(991683841);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        boolean boolean3 = functionNode1.isGetter();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral5 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral5.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str8 = regExpLiteral5.getValue();
        regExpLiteral5.setFlags("52");
        functionNode1.addChildrenToFront((com.google.javascript.rhino.head.Node) regExpLiteral5);
        boolean boolean12 = functionNode1.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = functionNode13.getTop();
        int int15 = functionNode13.getRegexpCount();
        int int16 = functionNode13.getParamCount();
        com.google.javascript.rhino.head.ast.AstNode astNode17 = functionNode13.getBody();
        int int18 = functionNode1.addFunction(functionNode13);
        functionNode13.setEncodedSourceStart(17);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int22 = functionNode21.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = functionNode21.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode24 = functionNode21.getBody();
        com.google.javascript.rhino.head.ast.Scope scope25 = functionNode21.getParentScope();
        int int26 = functionNode13.addFunction(functionNode21);
        int int27 = functionNode21.getLineno();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral30 = new com.google.javascript.rhino.head.ast.RegExpLiteral(0, 6);
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = regExpLiteral30.getAstRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node32 = functionNode21.getChildBefore((com.google.javascript.rhino.head.Node) regExpLiteral30);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLp((int) (short) 1);
        int int6 = functionNode0.getIntProp(4, 26);
        functionNode0.flattenSymbolTable(true);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList9 = functionNode0.getParams();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = functionNode0.debugPrint();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        com.google.javascript.rhino.head.ast.Jump jump3 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump3.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump3, 0);
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump11.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump15 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump11, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int17 = functionNode16.getLp();
        functionNode16.setEncodedSource("");
        functionNode16.flattenSymbolTable(false);
        jump3.addChildAfter((com.google.javascript.rhino.head.Node) jump11, (com.google.javascript.rhino.head.Node) functionNode16);
        int int23 = functionNode16.getPosition();
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap24 = functionNode16.getLiveLocals();
        int int25 = functionNode16.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = functionNode16.debugPrint();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        functionNode1.setSourceName("                                                                                                                                                                                                        /null/");
        functionNode1.setRequiresActivation();
        com.google.javascript.rhino.head.Node node6 = functionNode1.target;
        int int7 = functionNode1.getLength();
        java.lang.String str8 = functionNode1.getEncodedSource();
        com.google.javascript.rhino.head.Node node9 = functionNode1.target;
        com.google.javascript.rhino.head.ast.AstNode astNode10 = functionNode1.getMemberExprNode();
        functionNode1.setSourceName("                                                                                                                                                                                                        ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = functionNode1.toSource();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        com.google.javascript.rhino.head.ast.Jump jump2 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        int int6 = scriptNode4.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList7 = scriptNode4.getChildScopes();
        jump2.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int11 = functionNode10.getLp();
        functionNode10.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int15 = functionNode14.getLp();
        functionNode14.setEncodedSource("");
        functionNode14.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int21 = functionNode20.getLp();
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode10, (com.google.javascript.rhino.head.Node) functionNode14, (com.google.javascript.rhino.head.Node) functionNode20, (int) '#');
        jump2.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode10);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList25 = functionNode10.getStatements();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = functionNode26.getTop();
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = functionNode26.getAstRoot();
        functionNode10.replaceWith((com.google.javascript.rhino.head.ast.Scope) functionNode26);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode30 = functionNode10.getEnclosingFunction();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode32 = functionNode10.getFunctionNode((-816165888));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        int int2 = functionNode0.getRegexpCount();
        functionNode0.setFunctionIsGetter();
        com.google.javascript.rhino.head.Node node4 = functionNode0.target;
        com.google.javascript.rhino.head.ast.Symbol symbol6 = functionNode0.getSymbol("109");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = functionNode0.toSource(32);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        java.lang.String str4 = functionNode0.toString();
        functionNode0.setParens((int) (short) 10, 8);
        functionNode0.setRequiresActivation();
        java.lang.String str9 = functionNode0.getName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        functionNode11.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode15 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int16 = functionNode15.getLp();
        functionNode15.setEncodedSource("");
        functionNode15.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int22 = functionNode21.getLp();
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode11, (com.google.javascript.rhino.head.Node) functionNode15, (com.google.javascript.rhino.head.Node) functionNode21, (int) '#');
        functionNode21.setEncodedSourceStart(25);
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap27 = functionNode21.getLiveLocals();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node28 = functionNode0.getChildBefore((com.google.javascript.rhino.head.Node) functionNode21);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        com.google.javascript.rhino.head.Node node0 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode2.getTop();
        java.lang.String str4 = scriptNode3.getJsDoc();
        com.google.javascript.rhino.head.Node node6 = scriptNode3.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int8 = functionNode7.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str11 = functionNode7.toStringTree(scriptNode10);
        com.google.javascript.rhino.head.ast.Scope scope13 = scriptNode10.getDefiningScope("");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int16 = scriptNode15.getEndLineno();
        int int17 = scriptNode15.getBaseLineno();
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node(25, node6, (com.google.javascript.rhino.head.Node) scriptNode10, (com.google.javascript.rhino.head.Node) scriptNode15);
        java.lang.String str19 = node0.toStringTree(scriptNode15);
        int int20 = scriptNode15.getFunctionCount();
        int int21 = scriptNode15.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.Scope scope23 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = functionNode24.getTop();
        functionNode24.setParens((int) (byte) 1, (int) (short) 1);
        functionNode24.setEncodedSourceStart((-1));
        functionNode24.setFunctionIsGetter();
        scope23.addChildToFront((com.google.javascript.rhino.head.Node) functionNode24);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor33 = functionNode24.iterator();
        com.google.javascript.rhino.head.ast.Jump jump35 = new com.google.javascript.rhino.head.ast.Jump((-440310255));
        com.google.javascript.rhino.head.ast.FunctionNode functionNode37 = new com.google.javascript.rhino.head.ast.FunctionNode(18);
        jump35.addChild((com.google.javascript.rhino.head.ast.AstNode) functionNode37);
        functionNode24.setTop((com.google.javascript.rhino.head.ast.ScriptNode) functionNode37);
        com.google.javascript.rhino.head.ast.AstNode astNode40 = functionNode37.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node41 = scriptNode15.getChildBefore((com.google.javascript.rhino.head.Node) astNode40);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode8.getTop();
        functionNode8.setParens((int) (byte) 1, (int) (short) 1);
        functionNode8.setEncodedSourceStart((-1));
        functionNode8.setFunctionIsGetter();
        scope7.addChildToFront((com.google.javascript.rhino.head.Node) functionNode8);
        functionNode5.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode8);
        functionNode5.setFunctionIsSetter();
        int int19 = functionNode0.addFunction(functionNode5);
        java.lang.String str20 = functionNode0.getNextTempName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode22 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int23 = functionNode22.getBaseLineno();
        functionNode22.setSourceName("                                                                                                                                                                                                        /null/");
        functionNode22.setRequiresActivation();
        functionNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) functionNode22);
        functionNode22.setEncodedSourceEnd((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = functionNode22.getTop();
        com.google.javascript.rhino.head.Node node31 = functionNode22.target;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = functionNode22.toSource(6);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int3 = functionNode2.getBaseLineno();
        boolean boolean4 = functionNode2.isGetter();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral6 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral6.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str9 = regExpLiteral6.getValue();
        regExpLiteral6.setFlags("52");
        functionNode2.addChildrenToFront((com.google.javascript.rhino.head.Node) regExpLiteral6);
        boolean boolean13 = functionNode2.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.Jump jump16 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int19 = scriptNode18.getEndLineno();
        int int20 = scriptNode18.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList21 = scriptNode18.getChildScopes();
        jump16.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode18);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor23 = scriptNode18.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int25 = functionNode24.getLp();
        functionNode24.setEncodedSource("");
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode18, (com.google.javascript.rhino.head.ast.Scope) functionNode24);
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) functionNode2, (com.google.javascript.rhino.head.Node) scriptNode18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = functionNode2.debugPrint();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope(101);
        boolean boolean2 = scope1.hasChildren();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString((-854226344), "                    {\n                      {\n                      }\n                    }\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node6 = scope1.getChildBefore(node5);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        com.google.javascript.rhino.head.ast.Comment comment15 = functionNode11.getJsDocNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = functionNode19.getTop();
        functionNode19.setParens((int) (byte) 1, (int) (short) 1);
        functionNode19.setEncodedSourceStart((-1));
        functionNode19.setFunctionIsGetter();
        scope18.addChildToFront((com.google.javascript.rhino.head.Node) functionNode19);
        functionNode16.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode19);
        boolean boolean29 = functionNode11.isParam((com.google.javascript.rhino.head.ast.AstNode) functionNode16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode31 = functionNode16.getFunctionNode((-544960523));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList15 = scriptNode10.getFunctions();
        functionNodeList15.clear();
        com.google.javascript.rhino.head.ast.Jump jump21 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump21.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump25 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump21, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int28 = scriptNode27.getEndLineno();
        int int29 = scriptNode27.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList30 = scriptNode27.getChildScopes();
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump21, (com.google.javascript.rhino.head.Node) scriptNode27);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList32 = scriptNode27.getFunctions();
        boolean boolean33 = functionNodeList15.removeAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList32);
        functionNodeList15.clear();
        java.util.stream.Stream<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeStream35 = functionNodeList15.parallelStream();
        com.google.javascript.rhino.head.ast.Jump jump41 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump41.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump45 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump41, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int48 = scriptNode47.getEndLineno();
        int int49 = scriptNode47.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList50 = scriptNode47.getChildScopes();
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump41, (com.google.javascript.rhino.head.Node) scriptNode47);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList52 = scriptNode47.getFunctions();
        int int53 = scriptNode47.getPosition();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList54 = scriptNode47.getChildScopes();
        int int55 = scriptNode47.getEncodedSourceEnd();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList56 = scriptNode47.getSymbols();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode57 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int58 = functionNode57.getLp();
        functionNode57.setEncodedSource("");
        functionNode57.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral64 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str66 = regExpLiteral64.toSource((int) (byte) 10);
        regExpLiteral64.setFlags("-1\tSCRIPT -1 1\n");
        regExpLiteral64.removeProp(8);
        java.lang.String str71 = regExpLiteral64.getValue();
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node(7, (com.google.javascript.rhino.head.Node) scriptNode47, (com.google.javascript.rhino.head.Node) functionNode57, (com.google.javascript.rhino.head.Node) regExpLiteral64);
        int int73 = functionNodeList15.lastIndexOf((java.lang.Object) functionNode57);
        int int74 = functionNode57.getRp();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList75 = functionNode57.getFunctions();
        int int76 = functionNode57.getLp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str78 = functionNode57.toSource((-146877426));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode3 = functionNode0.getBody();
        com.google.javascript.rhino.head.ast.Scope scope4 = functionNode0.getParentScope();
        java.lang.String str5 = functionNode0.getName();
        java.lang.Object obj7 = functionNode0.getProp(350469479);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = functionNode0.getRegexpFlags((-18802601));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        com.google.javascript.rhino.head.ast.Jump jump2 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        int int6 = scriptNode4.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList7 = scriptNode4.getChildScopes();
        jump2.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor9 = scriptNode4.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int11 = functionNode10.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = functionNode10.getTop();
        boolean boolean13 = functionNode10.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int16 = scriptNode15.getEndLineno();
        int int17 = scriptNode15.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump20 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int23 = scriptNode22.getEndLineno();
        int int24 = scriptNode22.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList25 = scriptNode22.getChildScopes();
        jump20.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode22);
        java.lang.String str27 = scriptNode22.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode15, (com.google.javascript.rhino.head.ast.Scope) scriptNode22);
        com.google.javascript.rhino.head.ast.Scope scope29 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode22.target = scope29;
        functionNode10.addChildScope(scope29);
        boolean boolean32 = functionNode10.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode36 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int37 = functionNode36.getEncodedSourceStart();
        int int38 = functionNode36.getFunctionCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode39 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = functionNode39.getTop();
        functionNode39.setParens((int) (byte) 1, (int) (short) 1);
        int int44 = functionNode39.getRp();
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node(17, (com.google.javascript.rhino.head.Node) functionNode36, (com.google.javascript.rhino.head.Node) functionNode39, (int) (short) 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int49 = scriptNode48.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int52 = scriptNode51.getEndLineno();
        scriptNode48.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode51);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode54 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int55 = functionNode54.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode56 = functionNode54.getTop();
        boolean boolean57 = functionNode54.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int60 = scriptNode59.getEndLineno();
        int int61 = scriptNode59.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump64 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int67 = scriptNode66.getEndLineno();
        int int68 = scriptNode66.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList69 = scriptNode66.getChildScopes();
        jump64.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode66);
        java.lang.String str71 = scriptNode66.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode59, (com.google.javascript.rhino.head.ast.Scope) scriptNode66);
        com.google.javascript.rhino.head.ast.Scope scope73 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode66.target = scope73;
        functionNode54.addChildScope(scope73);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode51, (com.google.javascript.rhino.head.ast.Scope) functionNode54);
        com.google.javascript.rhino.head.Node node78 = new com.google.javascript.rhino.head.Node(8, (com.google.javascript.rhino.head.Node) functionNode36, (com.google.javascript.rhino.head.Node) scriptNode51, (int) 'a');
        functionNode10.addResumptionPoint(node78);
        scriptNode4.addChildToBack((com.google.javascript.rhino.head.Node) functionNode10);
        com.google.javascript.rhino.head.ast.AstNode astNode81 = functionNode10.getBody();
        com.google.javascript.rhino.head.ast.Name name82 = functionNode10.getFunctionName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str84 = functionNode10.toSource((-462033282));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        int int2 = functionNode0.getRegexpCount();
        functionNode0.setFunctionIsGetter();
        com.google.javascript.rhino.head.Node node4 = functionNode0.target;
        int int7 = functionNode0.getIntProp(17, 9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = functionNode0.toSource((-532790313));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        functionNode1.setSourceName("                                                                                                                                                                                                        /null/");
        functionNode1.setRequiresActivation();
        com.google.javascript.rhino.head.Node node6 = functionNode1.target;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = functionNode1.getRegexpString(0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setLp((int) (short) 1);
        int int7 = functionNode1.getIntProp(4, 26);
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump(3, (com.google.javascript.rhino.head.Node) functionNode1);
        functionNode1.putIntProp(9, (-1110578805));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = functionNode1.toSource(4);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setEncodedSource("");
        boolean boolean4 = functionNode0.isExpressionClosure();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = functionNode0.getFunctionNode((int) (short) -1);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int6 = scriptNode5.getEndLineno();
        int int7 = scriptNode5.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = scriptNode12.getChildScopes();
        jump10.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode12);
        java.lang.String str17 = scriptNode12.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode5, (com.google.javascript.rhino.head.ast.Scope) scriptNode12);
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode12.target = scope19;
        functionNode0.addChildScope(scope19);
        boolean boolean22 = functionNode0.hasConsistentReturnUsage();
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap23 = functionNode0.getLiveLocals();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int26 = functionNode25.getEncodedSourceStart();
        functionNode0.addResumptionPoint((com.google.javascript.rhino.head.Node) functionNode25);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap28 = functionNode0.getSymbolTable();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode30 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int31 = functionNode30.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = functionNode30.getTop();
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode30);
        functionNode0.addChildScope((com.google.javascript.rhino.head.ast.Scope) functionNode30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str35 = functionNode0.debugPrint();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        functionNode0.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode3);
        functionNode0.setFunctionIsSetter();
        boolean boolean14 = functionNode0.isExpressionClosure();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode15 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int16 = functionNode15.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = functionNode15.getTop();
        com.google.javascript.rhino.head.Node node18 = functionNode15.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList19 = functionNode15.getParams();
        java.lang.String str20 = functionNode15.shortName();
        functionNode0.addChildToBack((com.google.javascript.rhino.head.Node) functionNode15);
        java.lang.String str22 = functionNode0.shortName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = functionNode0.getFunctionNode((-22));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        scriptNode1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        java.lang.String str7 = scriptNode1.getNextTempName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.AstNode astNode9 = functionNode8.getParent();
        scriptNode1.setParentScope((com.google.javascript.rhino.head.ast.Scope) functionNode8);
        functionNode8.clearParentScope();
        int int12 = functionNode8.getRegexpCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = functionNode8.getRegexpString(9);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        java.lang.String str3 = scriptNode2.getJsDoc();
        com.google.javascript.rhino.head.Node node5 = scriptNode2.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int7 = functionNode6.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str10 = functionNode6.toStringTree(scriptNode9);
        com.google.javascript.rhino.head.ast.Scope scope12 = scriptNode9.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList13 = scriptNode9.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int16 = scriptNode15.getEndLineno();
        int int17 = scriptNode15.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode9, (com.google.javascript.rhino.head.ast.Scope) scriptNode15);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int21 = scriptNode20.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int24 = scriptNode23.getEndLineno();
        scriptNode20.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode23);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int27 = functionNode26.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = functionNode26.getTop();
        boolean boolean29 = functionNode26.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int32 = scriptNode31.getEndLineno();
        int int33 = scriptNode31.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump36 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int39 = scriptNode38.getEndLineno();
        int int40 = scriptNode38.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList41 = scriptNode38.getChildScopes();
        jump36.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode38);
        java.lang.String str43 = scriptNode38.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode31, (com.google.javascript.rhino.head.ast.Scope) scriptNode38);
        com.google.javascript.rhino.head.ast.Scope scope45 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode38.target = scope45;
        functionNode26.addChildScope(scope45);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode23, (com.google.javascript.rhino.head.ast.Scope) functionNode26);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(20, (com.google.javascript.rhino.head.Node) scriptNode2, (com.google.javascript.rhino.head.Node) scriptNode9, (com.google.javascript.rhino.head.Node) scriptNode23);
        scriptNode23.flattenSymbolTable(true);
        int int52 = scriptNode23.getLineno();
        int int53 = scriptNode23.getBaseLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str55 = scriptNode23.getRegexpFlags(24);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode((-1262414679));
        com.google.javascript.rhino.head.Token.CommentType commentType6 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment8 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType6, "109");
        java.lang.String str10 = comment8.toSource(19);
        java.lang.String str11 = comment8.getValue();
        com.google.javascript.rhino.head.Token.CommentType commentType12 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        comment8.setCommentType(commentType12);
        com.google.javascript.rhino.head.ast.Comment comment15 = new com.google.javascript.rhino.head.ast.Comment(9, 6, commentType12, "                    ");
        functionNode1.setJsDocNode(comment15);
        functionNode1.setRequiresActivation();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int20 = functionNode19.getLp();
        functionNode19.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode23 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int24 = functionNode23.getLp();
        functionNode23.setEncodedSource("");
        functionNode23.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int30 = functionNode29.getLp();
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode19, (com.google.javascript.rhino.head.Node) functionNode23, (com.google.javascript.rhino.head.Node) functionNode29, (int) '#');
        functionNode29.setEncodedSourceStart(25);
        boolean boolean35 = functionNode29.requiresActivation();
        java.lang.String str36 = functionNode29.getNextTempName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode1.removeChild((com.google.javascript.rhino.head.Node) functionNode29);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode2.getTop();
        functionNode2.setParens((int) (byte) 1, (int) (short) 1);
        functionNode2.setEncodedSourceStart((-1));
        functionNode2.setFunctionIsGetter();
        scope1.addChildToFront((com.google.javascript.rhino.head.Node) functionNode2);
        functionNode2.setRp(19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int15 = scriptNode14.getEndLineno();
        int int16 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump19 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int22 = scriptNode21.getEndLineno();
        int int23 = scriptNode21.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList24 = scriptNode21.getChildScopes();
        jump19.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode21);
        java.lang.String str26 = scriptNode21.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode14, (com.google.javascript.rhino.head.ast.Scope) scriptNode21);
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode21.target = scope28;
        java.lang.String str30 = functionNode2.toStringTree(scriptNode21);
        java.lang.String str32 = scriptNode21.toSource((int) (short) 10);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap33 = scriptNode21.getSymbolTable();
        int int34 = strMap33.size();
        com.google.javascript.rhino.head.ast.Jump jump39 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump39.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump43 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump39, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int46 = scriptNode45.getEndLineno();
        int int47 = scriptNode45.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList48 = scriptNode45.getChildScopes();
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump39, (com.google.javascript.rhino.head.Node) scriptNode45);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList50 = scriptNode45.getFunctions();
        functionNodeList50.clear();
        functionNodeList50.clear();
        com.google.javascript.rhino.head.ast.Jump jump57 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump57.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump61 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump57, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int64 = scriptNode63.getEndLineno();
        int int65 = scriptNode63.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList66 = scriptNode63.getChildScopes();
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump57, (com.google.javascript.rhino.head.Node) scriptNode63);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList68 = scriptNode63.getFunctions();
        java.util.Spliterator<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeSpliterator69 = functionNodeList68.spliterator();
        int int71 = functionNodeList68.indexOf((java.lang.Object) (byte) 10);
        boolean boolean72 = functionNodeList50.retainAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList68);
        boolean boolean73 = strMap33.containsKey((java.lang.Object) functionNodeList50);
        java.util.Collection<com.google.javascript.rhino.head.ast.Symbol> symbolCollection74 = strMap33.values();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode75 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode76 = functionNode75.getTop();
        functionNode75.setParens((int) (byte) 1, (int) (short) 1);
        int int80 = functionNode75.getRp();
        int int81 = functionNode75.getAbsolutePosition();
        com.google.javascript.rhino.head.ast.AstNode astNode82 = functionNode75.getMemberExprNode();
        com.google.javascript.rhino.head.ast.Symbol symbol83 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str84 = symbol83.getDeclTypeName();
        int int85 = symbol83.getDeclType();
        com.google.javascript.rhino.head.ast.Scope scope86 = symbol83.getContainingTable();
        java.lang.String str87 = symbol83.getDeclTypeName();
        symbol83.setName("                              {\n                              }\n");
        com.google.javascript.rhino.head.ast.Symbol symbol90 = strMap33.getOrDefault((java.lang.Object) functionNode75, symbol83);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList91 = functionNode75.getFunctions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str93 = functionNode75.getRegexpFlags(327364487);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral1 = new com.google.javascript.rhino.head.ast.RegExpLiteral((-1262414679));
        regExpLiteral1.setValue("/null//null/-1\tSCRIPT -1 1\n");
        regExpLiteral1.setValue("                                            /null/");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = functionNode6.getTop();
        functionNode6.setParens((int) (byte) 1, (int) (short) 1);
        functionNode6.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList13 = functionNode6.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope15 = functionNode6.getDefiningScope("hi!");
        boolean boolean16 = functionNode6.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int19 = scriptNode18.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol21 = scriptNode18.getSymbol("hi!");
        scriptNode18.putIntProp(3, 0);
        functionNode6.addResumptionPoint((com.google.javascript.rhino.head.Node) scriptNode18);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode27 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = functionNode27.getTop();
        functionNode27.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode27);
        int int33 = functionNode27.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.Jump jump38 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump38.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump42 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump38, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int45 = scriptNode44.getEndLineno();
        int int46 = scriptNode44.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList47 = scriptNode44.getChildScopes();
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump38, (com.google.javascript.rhino.head.Node) scriptNode44);
        java.lang.String str49 = scriptNode44.getSourceName();
        functionNode27.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode44);
        functionNode6.setCompilerData((java.lang.Object) scriptNode44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node52 = regExpLiteral1.getChildBefore((com.google.javascript.rhino.head.Node) functionNode6);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLength(19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = functionNode0.getFunctionNode((int) (byte) 0);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        int int2 = functionNode0.getRegexpCount();
        functionNode0.setFunctionIsGetter();
        com.google.javascript.rhino.head.Node node4 = functionNode0.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int7 = scriptNode6.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int10 = scriptNode9.getEndLineno();
        scriptNode6.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode9);
        com.google.javascript.rhino.head.ast.Scope scope12 = scriptNode9.getParentScope();
        com.google.javascript.rhino.head.ast.Scope scope13 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode9.addChildrenToBack((com.google.javascript.rhino.head.Node) scope13);
        scriptNode9.setBaseLineno((int) '#');
        functionNode0.setParentScope((com.google.javascript.rhino.head.ast.Scope) scriptNode9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = functionNode0.toSource(32);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        scriptNode1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int8 = functionNode7.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode7.getTop();
        boolean boolean10 = functionNode7.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        jump17.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        java.lang.String str24 = scriptNode19.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode12, (com.google.javascript.rhino.head.ast.Scope) scriptNode19);
        com.google.javascript.rhino.head.ast.Scope scope26 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode19.target = scope26;
        functionNode7.addChildScope(scope26);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode4, (com.google.javascript.rhino.head.ast.Scope) functionNode7);
        int int30 = functionNode7.getFunctionCount();
        int int31 = functionNode7.getRp();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList32 = functionNode7.getStatements();
        com.google.javascript.rhino.head.ast.AstNode astNode33 = functionNode7.getMemberExprNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = functionNode7.toSource();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap15 = functionNode5.getSymbolTable();
        java.lang.String str16 = functionNode5.shortName();
        int int17 = functionNode5.getEncodedSourceStart();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList18 = functionNode5.getParams();
        functionNode5.setSourceName("                109");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = functionNode5.getRegexpFlags(0);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str4 = functionNode0.toStringTree(scriptNode3);
        functionNode0.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode6 = functionNode0.getBody();
        functionNode0.setParens(21, (int) '#');
        int int10 = functionNode0.getLp();
        functionNode0.setFunctionIsSetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int13 = functionNode12.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = functionNode12.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode15 = functionNode12.getBody();
        com.google.javascript.rhino.head.ast.Scope scope16 = functionNode12.getParentScope();
        com.google.javascript.rhino.head.ast.Jump jump22 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump22.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump26 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump22, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int29 = scriptNode28.getEndLineno();
        int int30 = scriptNode28.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList31 = scriptNode28.getChildScopes();
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump22, (com.google.javascript.rhino.head.Node) scriptNode28);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int35 = scriptNode34.getEndLineno();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral37 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str39 = regExpLiteral37.toSource((int) (byte) 10);
        regExpLiteral37.setFlags("-1\tSCRIPT -1 1\n");
        regExpLiteral37.removeProp(8);
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(10, node32, (com.google.javascript.rhino.head.Node) scriptNode34, (com.google.javascript.rhino.head.Node) regExpLiteral37, 3);
        java.lang.String str47 = regExpLiteral37.makeIndent((int) (short) 100);
        java.lang.String str49 = regExpLiteral37.toSource((int) (short) 10);
        functionNode12.addRegExp(regExpLiteral37);
        functionNode0.addResumptionPoint((com.google.javascript.rhino.head.Node) functionNode12);
        java.lang.String str52 = functionNode0.shortName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str53 = functionNode0.debugPrint();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str1 = symbol0.getName();
        com.google.javascript.rhino.head.Node node2 = symbol0.getNode();
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) ' ');
        symbol0.setNode((com.google.javascript.rhino.head.Node) jump4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int8 = functionNode7.getBaseLineno();
        functionNode7.setSourceName("                                                                                                                                                                                                        /null/");
        symbol0.setContainingTable((com.google.javascript.rhino.head.ast.Scope) functionNode7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = functionNode7.getRegexpFlags((-164717278));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        functionNode0.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode3);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = functionNode13.getTop();
        functionNode13.setParens((int) (byte) 1, (int) (short) 1);
        functionNode13.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList20 = functionNode13.getResumptionPoints();
        int int21 = functionNode13.getLp();
        functionNode0.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode13);
        com.google.javascript.rhino.head.Node node23 = functionNode13.getNext();
        com.google.javascript.rhino.head.ast.Symbol symbol25 = functionNode13.getSymbol("Jump");
        boolean boolean26 = functionNode13.requiresActivation();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int29 = scriptNode28.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int32 = scriptNode31.getEndLineno();
        scriptNode28.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode31);
        java.lang.String str34 = scriptNode28.getNextTempName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode35 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.AstNode astNode36 = functionNode35.getParent();
        scriptNode28.setParentScope((com.google.javascript.rhino.head.ast.Scope) functionNode35);
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = functionNode35.getAstRoot();
        functionNode35.setFunctionType((-146877426));
        com.google.javascript.rhino.head.ast.FunctionNode functionNode42 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int43 = functionNode42.getBaseLineno();
        boolean boolean44 = functionNode42.isExpressionClosure();
        functionNode35.setParentScope((com.google.javascript.rhino.head.ast.Scope) functionNode42);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) functionNode13, (com.google.javascript.rhino.head.ast.Scope) functionNode42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = functionNode42.debugPrint();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        com.google.javascript.rhino.head.Node node3 = functionNode0.getLastSibling();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap4 = functionNode0.getSymbolTable();
        functionNode0.setParens((-727971506), (-14761645));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = functionNode0.toSource((-1262414679));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode((-1262414679));
        functionNode1.setRp((int) (short) 0);
        boolean boolean4 = functionNode1.isGetter();
        int int5 = functionNode1.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = functionNode1.getRegexpFlags((-3285918));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        scriptNode10.setEncodedSourceBounds(327364487, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = scriptNode10.getRegexpFlags(17);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        com.google.javascript.rhino.head.ast.Jump jump2 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        int int6 = scriptNode4.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList7 = scriptNode4.getChildScopes();
        jump2.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int11 = functionNode10.getLp();
        functionNode10.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int15 = functionNode14.getLp();
        functionNode14.setEncodedSource("");
        functionNode14.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int21 = functionNode20.getLp();
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode10, (com.google.javascript.rhino.head.Node) functionNode14, (com.google.javascript.rhino.head.Node) functionNode20, (int) '#');
        jump2.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode10);
        int int25 = functionNode10.getLength();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int27 = functionNode26.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = functionNode26.getTop();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = functionNode29.getTop();
        functionNode29.setParens((int) (byte) 1, (int) (short) 1);
        functionNode29.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList36 = functionNode29.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope38 = functionNode29.getDefiningScope("hi!");
        boolean boolean39 = functionNode29.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.Scope scope41 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        int[] intArray48 = new int[] { 25, 17, (short) 0, 20, 19, (byte) 1 };
        functionNode29.addLiveLocals((com.google.javascript.rhino.head.Node) scope41, intArray48);
        functionNode10.addLiveLocals((com.google.javascript.rhino.head.Node) scriptNode28, intArray48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str52 = functionNode10.toSource(23);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        scriptNode1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int8 = functionNode7.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode7.getTop();
        boolean boolean10 = functionNode7.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        jump17.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        java.lang.String str24 = scriptNode19.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode12, (com.google.javascript.rhino.head.ast.Scope) scriptNode19);
        com.google.javascript.rhino.head.ast.Scope scope26 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode19.target = scope26;
        functionNode7.addChildScope(scope26);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode4, (com.google.javascript.rhino.head.ast.Scope) functionNode7);
        int int30 = functionNode7.getFunctionCount();
        com.google.javascript.rhino.head.ast.Scope scope31 = functionNode7.getEnclosingScope();
        int int32 = functionNode7.getBaseLineno();
        functionNode7.setFunctionIsGetter();
        functionNode7.setIsGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = functionNode7.toSource((-793599801));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLineno(0);
        boolean boolean4 = functionNode0.requiresActivation();
        int int5 = functionNode0.getFunctionCount();
        boolean boolean6 = functionNode0.isGetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = functionNode0.toSource(129);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral1 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str3 = regExpLiteral1.toSource((int) (byte) 10);
        regExpLiteral1.setFlags("-1\tSCRIPT -1 1\n");
        regExpLiteral1.removeProp(8);
        java.lang.String str8 = regExpLiteral1.getValue();
        regExpLiteral1.setLineno(10);
        java.lang.String str11 = regExpLiteral1.getFlags();
        java.lang.String str13 = regExpLiteral1.toSource(16);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int15 = functionNode14.getLp();
        functionNode14.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode18 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = functionNode21.getTop();
        functionNode21.setParens((int) (byte) 1, (int) (short) 1);
        functionNode21.setEncodedSourceStart((-1));
        functionNode21.setFunctionIsGetter();
        scope20.addChildToFront((com.google.javascript.rhino.head.Node) functionNode21);
        functionNode18.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode21);
        int int31 = functionNode14.addFunction(functionNode18);
        com.google.javascript.rhino.head.ast.Symbol symbol33 = functionNode14.getSymbol("-1\tBLOCK -1 1\n");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int36 = scriptNode35.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol38 = scriptNode35.getSymbol("hi!");
        scriptNode35.putIntProp(3, 0);
        functionNode14.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode35);
        java.util.List<com.google.javascript.rhino.head.Node> nodeList43 = functionNode14.getResumptionPoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node44 = regExpLiteral1.getChildBefore((com.google.javascript.rhino.head.Node) functionNode14);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode3 = functionNode0.getBody();
        com.google.javascript.rhino.head.ast.Jump jump9 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump9.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump13 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump9, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int16 = scriptNode15.getEndLineno();
        int int17 = scriptNode15.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList18 = scriptNode15.getChildScopes();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump9, (com.google.javascript.rhino.head.Node) scriptNode15);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList20 = scriptNode15.getChildScopes();
        com.google.javascript.rhino.head.ast.Jump jump21 = new com.google.javascript.rhino.head.ast.Jump(11, (com.google.javascript.rhino.head.Node) scriptNode15);
        functionNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode15);
        com.google.javascript.rhino.head.ast.AstNode astNode23 = functionNode0.getMemberExprNode();
        com.google.javascript.rhino.head.ast.AstNode astNode24 = functionNode0.getMemberExprNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = functionNode0.toSource(6);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        boolean boolean2 = functionNode1.isExpressionClosure();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = functionNode1.getEnclosingFunction();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = functionNode1.toSource((-860972433));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList15 = scriptNode10.getFunctions();
        int int16 = functionNodeList15.size();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator17 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        functionNodeList15.sort((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator17);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator19 = positionComparator17.reversed();
        com.google.javascript.rhino.head.ast.Jump jump23 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump23.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump27 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump23, 0);
        com.google.javascript.rhino.head.ast.Jump jump31 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump31.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump35 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump31, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode36 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int37 = functionNode36.getLp();
        functionNode36.setEncodedSource("");
        functionNode36.flattenSymbolTable(false);
        jump23.addChildAfter((com.google.javascript.rhino.head.Node) jump31, (com.google.javascript.rhino.head.Node) functionNode36);
        int int43 = functionNode36.getPosition();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode45 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        boolean boolean46 = functionNode45.isExpressionClosure();
        int int47 = positionComparator17.compare((com.google.javascript.rhino.head.ast.AstNode) functionNode36, (com.google.javascript.rhino.head.ast.AstNode) functionNode45);
        int int48 = functionNode45.getAbsolutePosition();
        java.lang.String str49 = functionNode45.getSourceName();
        functionNode45.setEncodedSourceEnd((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str53 = functionNode45.toSource((-601958044));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLineno(0);
        boolean boolean4 = functionNode0.requiresActivation();
        int int5 = functionNode0.getFunctionCount();
        boolean boolean6 = functionNode0.isGetter();
        java.lang.String str7 = functionNode0.toString();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int11 = functionNode10.getBaseLineno();
        boolean boolean12 = functionNode10.isGetter();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral14 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral14.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str17 = regExpLiteral14.getValue();
        regExpLiteral14.setFlags("52");
        functionNode10.addChildrenToFront((com.google.javascript.rhino.head.Node) regExpLiteral14);
        boolean boolean21 = functionNode10.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.Jump jump24 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int27 = scriptNode26.getEndLineno();
        int int28 = scriptNode26.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList29 = scriptNode26.getChildScopes();
        jump24.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode26);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor31 = scriptNode26.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode32 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int33 = functionNode32.getLp();
        functionNode32.setEncodedSource("");
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode26, (com.google.javascript.rhino.head.ast.Scope) functionNode32);
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) functionNode10, (com.google.javascript.rhino.head.Node) scriptNode26);
        functionNode10.setFunctionIsSetter();
        int int39 = functionNode10.depth();
        functionNode0.addChildToFront((com.google.javascript.rhino.head.Node) functionNode10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = functionNode10.getRegexpString(161);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral2 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str4 = regExpLiteral2.toSource((int) (byte) 10);
        regExpLiteral2.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str8 = regExpLiteral2.toSource((int) (short) -1);
        regExpLiteral2.setFlags("EOF");
        java.lang.String str11 = regExpLiteral2.toSource();
        java.lang.String str12 = regExpLiteral2.getValue();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int14 = functionNode13.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str17 = functionNode13.toStringTree(scriptNode16);
        functionNode13.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode19 = functionNode13.getBody();
        functionNode13.setParens(21, (int) '#');
        int int23 = functionNode13.getLineno();
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newString("EOF");
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator26 = node25.new NodeIterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode27 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = functionNode27.getTop();
        functionNode27.setParens((int) (byte) 1, (int) (short) 1);
        functionNode27.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList34 = functionNode27.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope36 = functionNode27.getDefiningScope("hi!");
        boolean boolean37 = functionNode27.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int40 = scriptNode39.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol42 = scriptNode39.getSymbol("hi!");
        scriptNode39.putIntProp(3, 0);
        functionNode27.addResumptionPoint((com.google.javascript.rhino.head.Node) scriptNode39);
        java.lang.String str47 = node25.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode27);
        java.lang.String str48 = functionNode27.getSourceName();
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) (short) -1, (com.google.javascript.rhino.head.Node) regExpLiteral2, (com.google.javascript.rhino.head.Node) functionNode13, (com.google.javascript.rhino.head.Node) functionNode27);
        functionNode27.setFunctionIsSetter();
        functionNode27.setIsGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str53 = functionNode27.toSource((-398329421));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode8.getTop();
        functionNode8.setParens((int) (byte) 1, (int) (short) 1);
        functionNode8.setEncodedSourceStart((-1));
        functionNode8.setFunctionIsGetter();
        scope7.addChildToFront((com.google.javascript.rhino.head.Node) functionNode8);
        functionNode5.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode8);
        functionNode5.setFunctionIsSetter();
        int int19 = functionNode0.addFunction(functionNode5);
        boolean boolean20 = functionNode5.isGenerator();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList21 = functionNode5.getFunctions();
        int int22 = functionNodeList21.size();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int25 = functionNode24.getLp();
        functionNode24.setEncodedSource("");
        functionNode24.flattenSymbolTable(false);
        java.lang.String str30 = functionNode24.getName();
        int int31 = functionNode24.getAbsolutePosition();
        java.lang.Object obj32 = functionNode24.getCompilerData();
        com.google.javascript.rhino.head.ast.Jump jump35 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int38 = scriptNode37.getEndLineno();
        int int39 = scriptNode37.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList40 = scriptNode37.getChildScopes();
        jump35.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode37);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode43 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int44 = functionNode43.getLp();
        functionNode43.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode47 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int48 = functionNode47.getLp();
        functionNode47.setEncodedSource("");
        functionNode47.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode53 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int54 = functionNode53.getLp();
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode43, (com.google.javascript.rhino.head.Node) functionNode47, (com.google.javascript.rhino.head.Node) functionNode53, (int) '#');
        jump35.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode43);
        int int58 = functionNode43.getLength();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList59 = functionNode43.getStatements();
        int int60 = functionNode43.getLp();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode61 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode62 = functionNode61.getTop();
        int int63 = functionNode61.getRegexpCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode64 = functionNode61.getEnclosingFunction();
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode24, (com.google.javascript.rhino.head.Node) functionNode43, (com.google.javascript.rhino.head.Node) functionNode61);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int68 = scriptNode67.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode70 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int71 = scriptNode70.getEndLineno();
        scriptNode67.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode70);
        com.google.javascript.rhino.head.ast.Scope scope73 = scriptNode70.getParentScope();
        com.google.javascript.rhino.head.ast.Scope scope74 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode70.addChildrenToBack((com.google.javascript.rhino.head.Node) scope74);
        scriptNode70.setBaseLineno((int) '#');
        boolean boolean78 = functionNode43.isParam((com.google.javascript.rhino.head.ast.AstNode) scriptNode70);
        int int79 = functionNodeList21.lastIndexOf((java.lang.Object) functionNode43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str80 = functionNode43.debugPrint();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str1 = symbol0.getName();
        com.google.javascript.rhino.head.ast.Jump jump6 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump6.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump6, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = scriptNode12.getChildScopes();
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump6, (com.google.javascript.rhino.head.Node) scriptNode12);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList17 = scriptNode12.getChildScopes();
        symbol0.setContainingTable((com.google.javascript.rhino.head.ast.Scope) scriptNode12);
        com.google.javascript.rhino.head.ast.Scope scope19 = symbol0.getContainingTable();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral21 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral21.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str25 = regExpLiteral21.toSource(0);
        int int26 = regExpLiteral21.getLineno();
        java.lang.String str27 = regExpLiteral21.getFlags();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator28 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.Jump jump33 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump33.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump37 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump33, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int40 = scriptNode39.getEndLineno();
        int int41 = scriptNode39.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList42 = scriptNode39.getChildScopes();
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump33, (com.google.javascript.rhino.head.Node) scriptNode39);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList44 = scriptNode39.getFunctions();
        int int45 = scriptNode39.getPosition();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList46 = scriptNode39.getChildScopes();
        java.lang.String str47 = scriptNode39.getSourceName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode49 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int50 = functionNode49.getLp();
        functionNode49.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode53 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int54 = functionNode53.getLp();
        functionNode53.setEncodedSource("");
        functionNode53.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode59 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int60 = functionNode59.getLp();
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode49, (com.google.javascript.rhino.head.Node) functionNode53, (com.google.javascript.rhino.head.Node) functionNode59, (int) '#');
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap63 = functionNode53.getSymbolTable();
        com.google.javascript.rhino.head.ast.Jump jump67 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump67.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump71 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump67, 0);
        com.google.javascript.rhino.head.ast.Jump jump75 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump75.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump79 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump75, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode80 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int81 = functionNode80.getLp();
        functionNode80.setEncodedSource("");
        functionNode80.flattenSymbolTable(false);
        jump67.addChildAfter((com.google.javascript.rhino.head.Node) jump75, (com.google.javascript.rhino.head.Node) functionNode80);
        functionNode53.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) functionNode80);
        int int88 = positionComparator28.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode39, (com.google.javascript.rhino.head.ast.AstNode) functionNode53);
        functionNode53.setFunctionType(4);
        com.google.javascript.rhino.head.ast.AstNode astNode91 = functionNode53.getMemberExprNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scope19.replaceChild((com.google.javascript.rhino.head.Node) regExpLiteral21, (com.google.javascript.rhino.head.Node) functionNode53);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral2 = new com.google.javascript.rhino.head.ast.RegExpLiteral(17, (-1110578805));
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int5 = functionNode4.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = functionNode4.getTop();
        boolean boolean7 = functionNode4.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int10 = scriptNode9.getEndLineno();
        int int11 = scriptNode9.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump14 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int17 = scriptNode16.getEndLineno();
        int int18 = scriptNode16.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList19 = scriptNode16.getChildScopes();
        jump14.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode16);
        java.lang.String str21 = scriptNode16.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode9, (com.google.javascript.rhino.head.ast.Scope) scriptNode16);
        com.google.javascript.rhino.head.ast.Scope scope23 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode16.target = scope23;
        functionNode4.addChildScope(scope23);
        boolean boolean26 = functionNode4.hasConsistentReturnUsage();
        java.lang.String str27 = functionNode4.getNextTempName();
        com.google.javascript.rhino.head.ast.Jump jump28 = new com.google.javascript.rhino.head.ast.Jump((int) (short) -1, (com.google.javascript.rhino.head.Node) functionNode4);
        boolean boolean29 = functionNode4.isExpressionClosure();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral31 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral31.setFlags("-1\tSCRIPT -1 1\n");
        regExpLiteral31.setValue("hi!");
        functionNode4.addRegExp(regExpLiteral31);
        regExpLiteral2.setParent((com.google.javascript.rhino.head.ast.AstNode) regExpLiteral31);
        regExpLiteral2.setValue("136\tSCRIPT 136 1\n");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode41 = new com.google.javascript.rhino.head.ast.FunctionNode(23);
        java.lang.Object obj42 = functionNode41.getCompilerData();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode44 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = functionNode44.getTop();
        functionNode44.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode44);
        functionNode44.setRequiresActivation();
        java.lang.String str51 = functionNode44.shortName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        regExpLiteral2.replaceChildAfter((com.google.javascript.rhino.head.Node) functionNode41, (com.google.javascript.rhino.head.Node) functionNode44);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        scriptNode1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.ast.Scope scope7 = scriptNode4.getParentScope();
        com.google.javascript.rhino.head.ast.Scope scope8 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode4.addChildrenToBack((com.google.javascript.rhino.head.Node) scope8);
        java.lang.String str11 = scriptNode4.toSource(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = scriptNode4.getRegexpFlags((-462033282));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        functionNode0.setFunctionIsGetter();
        functionNode0.setFunctionType(7);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node((int) (byte) 10, (int) '#');
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int9 = functionNode8.getBaseLineno();
        boolean boolean10 = functionNode8.isGetter();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral12 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral12.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str15 = regExpLiteral12.getValue();
        regExpLiteral12.setFlags("52");
        functionNode8.addChildrenToFront((com.google.javascript.rhino.head.Node) regExpLiteral12);
        boolean boolean19 = functionNode8.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = functionNode20.getTop();
        int int22 = functionNode20.getRegexpCount();
        int int23 = functionNode20.getParamCount();
        com.google.javascript.rhino.head.ast.AstNode astNode24 = functionNode20.getBody();
        int int25 = functionNode8.addFunction(functionNode20);
        functionNode20.setEncodedSourceStart(17);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode28 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int29 = functionNode28.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = functionNode28.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode31 = functionNode28.getBody();
        com.google.javascript.rhino.head.ast.Scope scope32 = functionNode28.getParentScope();
        int int33 = functionNode20.addFunction(functionNode28);
        node6.addChildToFront((com.google.javascript.rhino.head.Node) functionNode28);
        functionNode0.addChildScope((com.google.javascript.rhino.head.ast.Scope) functionNode28);
        functionNode28.setRequiresActivation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str38 = functionNode28.toSource(0);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = functionNode1.getChildScopes();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int17 = functionNode16.getLp();
        functionNode16.setIsExpressionClosure(false);
        com.google.javascript.rhino.head.ast.Scope scope20 = functionNode16.getParentScope();
        int int21 = functionNode16.getFunctionType();
        functionNode1.replaceWith((com.google.javascript.rhino.head.ast.Scope) functionNode16);
        int int23 = functionNode1.getFunctionType();
        functionNode1.setRp(796955);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = functionNode1.getRegexpString((int) (short) 10);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        boolean boolean3 = functionNode1.isExpressionClosure();
        com.google.javascript.rhino.head.Node node5 = functionNode1.setType(3);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int8 = scriptNode7.getEndLineno();
        int int9 = scriptNode7.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump12 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int15 = scriptNode14.getEndLineno();
        int int16 = scriptNode14.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList17 = scriptNode14.getChildScopes();
        jump12.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode14);
        java.lang.String str19 = scriptNode14.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode7, (com.google.javascript.rhino.head.ast.Scope) scriptNode14);
        scriptNode7.setRelative(21);
        com.google.javascript.rhino.head.ast.Jump jump27 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump27.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump31 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump27, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int34 = scriptNode33.getEndLineno();
        int int35 = scriptNode33.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList36 = scriptNode33.getChildScopes();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump27, (com.google.javascript.rhino.head.Node) scriptNode33);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList38 = scriptNode33.getChildScopes();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList39 = scriptNode33.getSymbols();
        scriptNode7.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode33);
        scriptNode7.setEndLineno(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node43 = functionNode1.getChildBefore((com.google.javascript.rhino.head.Node) scriptNode7);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str4 = functionNode0.toStringTree(scriptNode3);
        functionNode0.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode6 = functionNode0.getBody();
        functionNode0.setParens(21, (int) '#');
        int int10 = functionNode0.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = functionNode0.toSource((-440310255));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.Jump jump5 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump5.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump9 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump5, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int12 = scriptNode11.getEndLineno();
        int int13 = scriptNode11.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList14 = scriptNode11.getChildScopes();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump5, (com.google.javascript.rhino.head.Node) scriptNode11);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList16 = scriptNode11.getFunctions();
        int int17 = scriptNode11.getPosition();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList18 = scriptNode11.getChildScopes();
        java.lang.String str19 = scriptNode11.getSourceName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int22 = functionNode21.getLp();
        functionNode21.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int26 = functionNode25.getLp();
        functionNode25.setEncodedSource("");
        functionNode25.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode31 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int32 = functionNode31.getLp();
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode21, (com.google.javascript.rhino.head.Node) functionNode25, (com.google.javascript.rhino.head.Node) functionNode31, (int) '#');
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap35 = functionNode25.getSymbolTable();
        com.google.javascript.rhino.head.ast.Jump jump39 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump39.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump43 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump39, 0);
        com.google.javascript.rhino.head.ast.Jump jump47 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump47.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump51 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump47, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode52 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int53 = functionNode52.getLp();
        functionNode52.setEncodedSource("");
        functionNode52.flattenSymbolTable(false);
        jump39.addChildAfter((com.google.javascript.rhino.head.Node) jump47, (com.google.javascript.rhino.head.Node) functionNode52);
        functionNode25.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) functionNode52);
        int int60 = positionComparator0.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode11, (com.google.javascript.rhino.head.ast.AstNode) functionNode25);
        functionNode25.setFunctionType(4);
        boolean boolean63 = functionNode25.isGenerator();
        int int64 = functionNode25.getRegexpCount();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor65 = functionNode25.iterator();
        boolean boolean66 = functionNode25.isExpressionClosure();
        functionNode25.setIsExpressionClosure(false);
        java.util.List<com.google.javascript.rhino.head.Node> nodeList69 = functionNode25.getResumptionPoints();
        functionNode25.setFunctionIsGetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str71 = functionNode25.debugPrint();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        int int3 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump6 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int9 = scriptNode8.getEndLineno();
        int int10 = scriptNode8.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList11 = scriptNode8.getChildScopes();
        jump6.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode8);
        java.lang.String str13 = scriptNode8.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode1, (com.google.javascript.rhino.head.ast.Scope) scriptNode8);
        com.google.javascript.rhino.head.ast.AstNode astNode15 = scriptNode1.getParent();
        int int16 = scriptNode1.getType();
        com.google.javascript.rhino.head.ast.Symbol symbol18 = scriptNode1.getSymbol("109");
        java.lang.String str19 = scriptNode1.toSource();
        int int20 = scriptNode1.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = functionNode21.getTop();
        functionNode21.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor26 = functionNode21.iterator();
        functionNode21.setLp(136);
        int int29 = functionNode21.getFunctionType();
        scriptNode1.addChildrenToBack((com.google.javascript.rhino.head.Node) functionNode21);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator31 = scriptNode1.spliterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode33 = new com.google.javascript.rhino.head.ast.FunctionNode(13);
        int int34 = functionNode33.getType();
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) functionNode33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = functionNode33.toSource((-616130778));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(671469117);
        int int2 = scriptNode1.getRegexpCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = scriptNode1.getRegexpString((-817814412));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        functionNode0.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode3);
        functionNode0.setFunctionIsSetter();
        boolean boolean14 = functionNode0.isExpressionClosure();
        functionNode0.putIntProp(7, (int) (byte) 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode18 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int19 = functionNode18.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str22 = functionNode18.toStringTree(scriptNode21);
        int int23 = scriptNode21.getRegexpCount();
        java.lang.Object obj24 = scriptNode21.getCompilerData();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList25 = scriptNode21.getStatements();
        functionNode0.setTop(scriptNode21);
        functionNode0.setFunctionIsSetter();
        boolean boolean28 = functionNode0.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = functionNode0.getTop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode31 = scriptNode29.getFunctionNode(52);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor5 = functionNode0.iterator();
        int int6 = functionNode0.getParamCount();
        int int7 = functionNode0.getRp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = functionNode0.debugPrint();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int3 = functionNode2.getLp();
        functionNode2.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int7 = functionNode6.getLp();
        functionNode6.setEncodedSource("");
        functionNode6.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int13 = functionNode12.getLp();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode2, (com.google.javascript.rhino.head.Node) functionNode6, (com.google.javascript.rhino.head.Node) functionNode12, (int) '#');
        boolean boolean16 = functionNode12.isGenerator();
        int int17 = functionNode12.getFunctionType();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int20 = functionNode19.getLp();
        functionNode19.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode23 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int24 = functionNode23.getLp();
        functionNode23.setEncodedSource("");
        functionNode23.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int30 = functionNode29.getLp();
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode19, (com.google.javascript.rhino.head.Node) functionNode23, (com.google.javascript.rhino.head.Node) functionNode29, (int) '#');
        boolean boolean33 = functionNode29.isGenerator();
        int int34 = functionNode29.getFunctionType();
        com.google.javascript.rhino.head.Node node35 = functionNode29.getFirstChild();
        boolean boolean36 = functionNode29.isGetterOrSetter();
        functionNode12.setParentScope((com.google.javascript.rhino.head.ast.Scope) functionNode29);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) functionNode12);
        int int39 = functionNode12.getParamCount();
        java.lang.String str40 = functionNode12.shortName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = functionNode12.toSource(100);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor5 = functionNode0.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = functionNode0.getFunctionNode((-180877978));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setEncodedSource("");
        functionNode0.setLp(2);
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(161, (-13));
        functionNode0.addResumptionPoint(node8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = functionNode0.getRegexpString(0);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setEncodedSource("");
        functionNode0.flattenSymbolTable(false);
        java.lang.String str6 = functionNode0.getName();
        functionNode0.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int9 = functionNode8.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = functionNode8.getTop();
        com.google.javascript.rhino.head.Node node11 = functionNode8.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList12 = functionNode8.getParams();
        functionNode0.setParams(astNodeList12);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int15 = functionNode14.getLp();
        functionNode14.setLp((int) (short) 1);
        int int20 = functionNode14.getIntProp(4, 26);
        functionNode14.flattenSymbolTable(true);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList23 = functionNode14.getParams();
        functionNode0.setParams(astNodeList23);
        functionNode0.setEndLineno(12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = functionNode0.toSource(2);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int6 = scriptNode5.getEndLineno();
        int int7 = scriptNode5.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = scriptNode12.getChildScopes();
        jump10.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode12);
        java.lang.String str17 = scriptNode12.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode5, (com.google.javascript.rhino.head.ast.Scope) scriptNode12);
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode12.target = scope19;
        functionNode0.addChildScope(scope19);
        boolean boolean22 = functionNode0.hasConsistentReturnUsage();
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap23 = functionNode0.getLiveLocals();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int26 = functionNode25.getEncodedSourceStart();
        functionNode0.addResumptionPoint((com.google.javascript.rhino.head.Node) functionNode25);
        boolean boolean28 = functionNode25.hasChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = functionNode25.debugPrint();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        com.google.javascript.rhino.head.ast.Jump jump3 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump3.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump3, 0);
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump11.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump15 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump11, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int17 = functionNode16.getLp();
        functionNode16.setEncodedSource("");
        functionNode16.flattenSymbolTable(false);
        jump3.addChildAfter((com.google.javascript.rhino.head.Node) jump11, (com.google.javascript.rhino.head.Node) functionNode16);
        int int23 = functionNode16.getPosition();
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap24 = functionNode16.getLiveLocals();
        int int25 = functionNode16.getType();
        int int26 = functionNode16.getRp();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int30 = functionNode29.getLp();
        functionNode29.setLp((int) (short) 1);
        int int35 = functionNode29.getIntProp(4, 26);
        com.google.javascript.rhino.head.ast.Jump jump36 = new com.google.javascript.rhino.head.ast.Jump(3, (com.google.javascript.rhino.head.Node) functionNode29);
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) functionNode29);
        functionNode29.setFunctionType(11);
        boolean boolean40 = functionNode29.hasChildren();
        functionNode29.setParens((-1262414679), (int) '#');
        functionNode16.addParam((com.google.javascript.rhino.head.ast.AstNode) functionNode29);
        com.google.javascript.rhino.head.ast.Scope scope46 = functionNode16.getDefiningScope("");
        boolean boolean47 = functionNode16.requiresActivation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str49 = functionNode16.toSource(35);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        boolean boolean15 = functionNode11.isGenerator();
        com.google.javascript.rhino.head.ast.Scope scope17 = new com.google.javascript.rhino.head.ast.Scope();
        scope17.setBounds(0, 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = functionNode21.getTop();
        int int23 = functionNode21.getRegexpCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = functionNode21.getEnclosingFunction();
        java.lang.String str25 = scope17.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode21);
        functionNode11.putProp(1, (java.lang.Object) functionNode21);
        functionNode11.setParens(8, (int) (byte) 10);
        boolean boolean30 = functionNode11.isGetter();
        functionNode11.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int34 = scriptNode33.getEndLineno();
        int int35 = scriptNode33.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump38 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int41 = scriptNode40.getEndLineno();
        int int42 = scriptNode40.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList43 = scriptNode40.getChildScopes();
        jump38.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode40);
        java.lang.String str45 = scriptNode40.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode33, (com.google.javascript.rhino.head.ast.Scope) scriptNode40);
        scriptNode33.setRelative(21);
        int int49 = scriptNode33.getAbsolutePosition();
        scriptNode33.removeChildren();
        java.lang.String str51 = scriptNode33.toString();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode52 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int53 = functionNode52.getLp();
        functionNode52.setIsExpressionClosure(false);
        com.google.javascript.rhino.head.ast.Jump jump58 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int61 = scriptNode60.getEndLineno();
        int int62 = scriptNode60.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList63 = scriptNode60.getChildScopes();
        jump58.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode60);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode66 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int67 = functionNode66.getLp();
        functionNode66.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode70 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int71 = functionNode70.getLp();
        functionNode70.setEncodedSource("");
        functionNode70.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode76 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int77 = functionNode76.getLp();
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode66, (com.google.javascript.rhino.head.Node) functionNode70, (com.google.javascript.rhino.head.Node) functionNode76, (int) '#');
        jump58.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode66);
        jump58.setPosition((int) (byte) -1);
        int int83 = functionNode52.compareTo((com.google.javascript.rhino.head.ast.AstNode) jump58);
        int int84 = functionNode52.getLp();
        int int85 = functionNode52.getFunctionCount();
        int int86 = functionNode52.getEncodedSourceStart();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode11.replaceChildAfter((com.google.javascript.rhino.head.Node) scriptNode33, (com.google.javascript.rhino.head.Node) functionNode52);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode1.getTop();
        boolean boolean4 = functionNode1.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int7 = scriptNode6.getEndLineno();
        int int8 = scriptNode6.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int14 = scriptNode13.getEndLineno();
        int int15 = scriptNode13.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList16 = scriptNode13.getChildScopes();
        jump11.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode13);
        java.lang.String str18 = scriptNode13.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode6, (com.google.javascript.rhino.head.ast.Scope) scriptNode13);
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode13.target = scope20;
        functionNode1.addChildScope(scope20);
        boolean boolean23 = functionNode1.hasConsistentReturnUsage();
        java.lang.String str24 = functionNode1.getNextTempName();
        com.google.javascript.rhino.head.ast.Jump jump25 = new com.google.javascript.rhino.head.ast.Jump((int) (short) -1, (com.google.javascript.rhino.head.Node) functionNode1);
        boolean boolean26 = functionNode1.isGetter();
        functionNode1.setBaseLineno(48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = functionNode1.getRegexpFlags((-600938777));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode1.getTop();
        boolean boolean4 = functionNode1.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList5 = functionNode1.getSymbols();
        functionNode1.setRp(5);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int9 = functionNode8.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str12 = functionNode8.toStringTree(scriptNode11);
        int int13 = scriptNode11.getRegexpCount();
        com.google.javascript.rhino.head.Node node14 = scriptNode11.getLastSibling();
        com.google.javascript.rhino.head.Node node15 = node14.getNext();
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node(2, (com.google.javascript.rhino.head.Node) functionNode1, node14);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode17 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int18 = functionNode17.getLp();
        functionNode17.setLp((int) (short) 1);
        int int23 = functionNode17.getIntProp(4, 26);
        functionNode17.flattenSymbolTable(true);
        java.lang.Object obj26 = functionNode17.getCompilerData();
        functionNode17.setRp(48);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int30 = functionNode29.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = functionNode29.getTop();
        boolean boolean32 = functionNode29.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList33 = functionNode29.getSymbols();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node14.replaceChild((com.google.javascript.rhino.head.Node) functionNode17, (com.google.javascript.rhino.head.Node) functionNode29);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        com.google.javascript.rhino.head.ast.Comment comment15 = functionNode11.getJsDocNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = functionNode19.getTop();
        functionNode19.setParens((int) (byte) 1, (int) (short) 1);
        functionNode19.setEncodedSourceStart((-1));
        functionNode19.setFunctionIsGetter();
        scope18.addChildToFront((com.google.javascript.rhino.head.Node) functionNode19);
        functionNode16.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode19);
        boolean boolean29 = functionNode11.isParam((com.google.javascript.rhino.head.ast.AstNode) functionNode16);
        int int30 = functionNode16.getLp();
        functionNode16.setRelative(136);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = functionNode16.toSource((-616130778));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        boolean boolean3 = functionNode1.isGetter();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral5 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral5.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str8 = regExpLiteral5.getValue();
        regExpLiteral5.setFlags("52");
        functionNode1.addChildrenToFront((com.google.javascript.rhino.head.Node) regExpLiteral5);
        boolean boolean12 = functionNode1.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = functionNode13.getTop();
        int int15 = functionNode13.getRegexpCount();
        int int16 = functionNode13.getParamCount();
        com.google.javascript.rhino.head.ast.AstNode astNode17 = functionNode13.getBody();
        int int18 = functionNode1.addFunction(functionNode13);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int20 = functionNode19.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = functionNode19.getTop();
        boolean boolean22 = functionNode19.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList23 = functionNode19.getSymbols();
        int int24 = functionNode19.getLength();
        boolean boolean25 = functionNode19.isGetterOrSetter();
        functionNode13.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode19);
        java.lang.Object obj28 = functionNode19.getProp(9);
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString(8, "/=");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode19.removeChild(node31);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        int int3 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump6 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int9 = scriptNode8.getEndLineno();
        int int10 = scriptNode8.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList11 = scriptNode8.getChildScopes();
        jump6.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode8);
        java.lang.String str13 = scriptNode8.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode1, (com.google.javascript.rhino.head.ast.Scope) scriptNode8);
        com.google.javascript.rhino.head.ast.AstNode astNode15 = scriptNode1.getParent();
        int int16 = scriptNode1.getType();
        com.google.javascript.rhino.head.ast.Symbol symbol18 = scriptNode1.getSymbol("109");
        java.lang.String str19 = scriptNode1.toSource();
        int int20 = scriptNode1.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = functionNode21.getTop();
        functionNode21.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor26 = functionNode21.iterator();
        functionNode21.setLp(136);
        int int29 = functionNode21.getFunctionType();
        scriptNode1.addChildrenToBack((com.google.javascript.rhino.head.Node) functionNode21);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode32 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int33 = functionNode32.getLp();
        functionNode32.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode36 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int37 = functionNode36.getLp();
        functionNode36.setEncodedSource("");
        functionNode36.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode42 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int43 = functionNode42.getLp();
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode32, (com.google.javascript.rhino.head.Node) functionNode36, (com.google.javascript.rhino.head.Node) functionNode42, (int) '#');
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap46 = functionNode36.getSymbolTable();
        java.lang.String str47 = functionNode36.shortName();
        int int48 = functionNode36.getType();
        functionNode21.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str51 = functionNode21.toSource((-1262414679));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        functionNode5.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode11, (int) '#');
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        jump17.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor24 = scriptNode19.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int26 = functionNode25.getLp();
        functionNode25.setEncodedSource("");
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode19, (com.google.javascript.rhino.head.ast.Scope) functionNode25);
        com.google.javascript.rhino.head.ast.Jump jump34 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump34.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump38 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump34, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int41 = scriptNode40.getEndLineno();
        int int42 = scriptNode40.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList43 = scriptNode40.getChildScopes();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump34, (com.google.javascript.rhino.head.Node) scriptNode40);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList45 = scriptNode40.getFunctions();
        functionNodeList45.clear();
        int int48 = functionNodeList45.lastIndexOf((java.lang.Object) (-1L));
        com.google.javascript.rhino.head.ast.Jump jump53 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump53.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump57 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump53, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int60 = scriptNode59.getEndLineno();
        int int61 = scriptNode59.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList62 = scriptNode59.getChildScopes();
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump53, (com.google.javascript.rhino.head.Node) scriptNode59);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList64 = scriptNode59.getFunctions();
        functionNodeList64.clear();
        int int67 = functionNodeList64.lastIndexOf((java.lang.Object) (-1L));
        boolean boolean68 = functionNodeList45.removeAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList64);
        com.google.javascript.rhino.head.ast.Jump jump73 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump73.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump77 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump73, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode79 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int80 = scriptNode79.getEndLineno();
        int int81 = scriptNode79.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList82 = scriptNode79.getChildScopes();
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump73, (com.google.javascript.rhino.head.Node) scriptNode79);
        com.google.javascript.rhino.head.Node node85 = scriptNode79.setType(0);
        int int86 = functionNodeList64.lastIndexOf((java.lang.Object) scriptNode79);
        functionNode11.addChildAfter((com.google.javascript.rhino.head.Node) functionNode25, (com.google.javascript.rhino.head.Node) scriptNode79);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode89 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int90 = functionNode89.getEncodedSourceStart();
        int int91 = functionNode89.getFunctionCount();
        functionNode25.addParam((com.google.javascript.rhino.head.ast.AstNode) functionNode89);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode93 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int94 = functionNode93.getLp();
        functionNode89.target = functionNode93;
        int int96 = functionNode93.getEndLineno();
        boolean boolean97 = functionNode93.requiresActivation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str99 = functionNode93.getRegexpString(586615353);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        int int3 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump6 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int9 = scriptNode8.getEndLineno();
        int int10 = scriptNode8.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList11 = scriptNode8.getChildScopes();
        jump6.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode8);
        java.lang.String str13 = scriptNode8.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode1, (com.google.javascript.rhino.head.ast.Scope) scriptNode8);
        com.google.javascript.rhino.head.ast.AstNode astNode15 = scriptNode1.getParent();
        int int16 = scriptNode1.getType();
        com.google.javascript.rhino.head.ast.Symbol symbol18 = scriptNode1.getSymbol("109");
        java.lang.String str19 = scriptNode1.toSource();
        int int20 = scriptNode1.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = functionNode21.getTop();
        functionNode21.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor26 = functionNode21.iterator();
        functionNode21.setLp(136);
        int int29 = functionNode21.getFunctionType();
        scriptNode1.addChildrenToBack((com.google.javascript.rhino.head.Node) functionNode21);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator31 = scriptNode1.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = scriptNode1.getRegexpString(136);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = functionNode1.getEnclosingFunction();
        com.google.javascript.rhino.head.Node node3 = functionNode1.target;
        functionNode1.setLineno((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = functionNode1.toSource(8);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((-1262414679));
        java.lang.Object obj3 = scriptNode1.getProp(32);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = scriptNode1.getTop();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int7 = functionNode6.getLp();
        functionNode6.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int11 = functionNode10.getLp();
        functionNode10.setEncodedSource("");
        functionNode10.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int17 = functionNode16.getLp();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode6, (com.google.javascript.rhino.head.Node) functionNode10, (com.google.javascript.rhino.head.Node) functionNode16, (int) '#');
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList20 = functionNode6.getChildScopes();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int23 = scriptNode22.getEndLineno();
        int int24 = scriptNode22.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList25 = scriptNode22.getChildScopes();
        functionNode6.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) scriptNode22);
        functionNode6.setEncodedSourceEnd((int) (short) 100);
        functionNode6.setLp(1579347477);
        int int31 = functionNode6.getFunctionCount();
        scriptNode4.setParentScope((com.google.javascript.rhino.head.ast.Scope) functionNode6);
        com.google.javascript.rhino.head.ast.AstNode astNode33 = scriptNode4.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode35 = scriptNode4.getFunctionNode(200442009);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = functionNode8.getTop();
        functionNode8.setParens((int) (byte) 1, (int) (short) 1);
        functionNode8.setEncodedSourceStart((-1));
        functionNode8.setFunctionIsGetter();
        scope7.addChildToFront((com.google.javascript.rhino.head.Node) functionNode8);
        functionNode5.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode8);
        functionNode5.setFunctionIsSetter();
        int int19 = functionNode0.addFunction(functionNode5);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = functionNode5.getTop();
        int int21 = functionNode5.getAbsolutePosition();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int24 = scriptNode23.getEndLineno();
        int int25 = scriptNode23.getBaseLineno();
        scriptNode23.removeProp(0);
        scriptNode23.setEncodedSourceEnd(19);
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral32 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 100, 23);
        scriptNode23.addRegExp(regExpLiteral32);
        functionNode5.setTop(scriptNode23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode36 = scriptNode23.getFunctionNode(1186675070);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str1 = symbol0.getDeclTypeName();
        com.google.javascript.rhino.head.ast.Scope scope2 = symbol0.getContainingTable();
        symbol0.setIndex(10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int7 = scriptNode6.getEndLineno();
        int int8 = scriptNode6.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int14 = scriptNode13.getEndLineno();
        int int15 = scriptNode13.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList16 = scriptNode13.getChildScopes();
        jump11.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode13);
        java.lang.String str18 = scriptNode13.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode6, (com.google.javascript.rhino.head.ast.Scope) scriptNode13);
        com.google.javascript.rhino.head.ast.AstNode astNode20 = scriptNode6.getParent();
        int int21 = scriptNode6.getType();
        com.google.javascript.rhino.head.ast.Symbol symbol23 = scriptNode6.getSymbol("109");
        java.lang.String str24 = scriptNode6.toSource();
        int int25 = scriptNode6.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = functionNode26.getTop();
        functionNode26.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor31 = functionNode26.iterator();
        functionNode26.setLp(136);
        int int34 = functionNode26.getFunctionType();
        scriptNode6.addChildrenToBack((com.google.javascript.rhino.head.Node) functionNode26);
        symbol0.setContainingTable((com.google.javascript.rhino.head.ast.Scope) scriptNode6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str38 = scriptNode6.toSource(1);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        com.google.javascript.rhino.head.Node node1 = symbol0.getNode();
        symbol0.setIndex(4);
        java.lang.String str4 = symbol0.getDeclTypeName();
        java.lang.String str5 = symbol0.toString();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int7 = functionNode6.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = functionNode6.getTop();
        boolean boolean9 = functionNode6.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int12 = scriptNode11.getEndLineno();
        int int13 = scriptNode11.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump16 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int19 = scriptNode18.getEndLineno();
        int int20 = scriptNode18.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList21 = scriptNode18.getChildScopes();
        jump16.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode18);
        java.lang.String str23 = scriptNode18.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode11, (com.google.javascript.rhino.head.ast.Scope) scriptNode18);
        com.google.javascript.rhino.head.ast.Scope scope25 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode18.target = scope25;
        functionNode6.addChildScope(scope25);
        boolean boolean28 = functionNode6.isGetter();
        symbol0.setNode((com.google.javascript.rhino.head.Node) functionNode6);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode31 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int32 = functionNode31.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = functionNode31.getTop();
        boolean boolean34 = functionNode31.hasSideEffects();
        java.lang.String str35 = functionNode31.toString();
        functionNode31.setParens((int) (short) 10, 8);
        com.google.javascript.rhino.head.ast.Jump jump40 = new com.google.javascript.rhino.head.ast.Jump(22, (com.google.javascript.rhino.head.Node) functionNode31, 12);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode42 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int43 = functionNode42.getLp();
        functionNode42.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode46 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int47 = functionNode46.getLp();
        functionNode46.setEncodedSource("");
        functionNode46.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode52 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int53 = functionNode52.getLp();
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode42, (com.google.javascript.rhino.head.Node) functionNode46, (com.google.javascript.rhino.head.Node) functionNode52, (int) '#');
        boolean boolean56 = functionNode52.isGenerator();
        int int57 = functionNode52.getFunctionType();
        com.google.javascript.rhino.head.Node node58 = functionNode52.getFirstChild();
        boolean boolean59 = functionNode52.isGetterOrSetter();
        functionNode52.flattenSymbolTable(false);
        functionNode31.addChildScope((com.google.javascript.rhino.head.ast.Scope) functionNode52);
        functionNode52.setFunctionType((-3285918));
        int int65 = functionNode6.addFunction(functionNode52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str67 = functionNode52.getRegexpFlags(35);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str1 = symbol0.getDeclTypeName();
        com.google.javascript.rhino.head.ast.Scope scope2 = symbol0.getContainingTable();
        symbol0.setName("                          ");
        com.google.javascript.rhino.head.ast.Jump jump7 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.Scope scope9 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        jump7.addChildrenToBack((com.google.javascript.rhino.head.Node) scope9);
        com.google.javascript.rhino.head.Node node11 = jump7.getLastChild();
        symbol0.setNode(node11);
        int int13 = symbol0.getIndex();
        symbol0.setIndex(136);
        com.google.javascript.rhino.head.ast.Jump jump18 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int21 = scriptNode20.getEndLineno();
        int int22 = scriptNode20.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList23 = scriptNode20.getChildScopes();
        jump18.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode20);
        int int25 = scriptNode20.getLineno();
        symbol0.setNode((com.google.javascript.rhino.head.Node) scriptNode20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = scriptNode20.getRegexpString((-1288016238));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode((-1262414679));
        java.lang.String str2 = functionNode1.getNextTempName();
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump(109);
        functionNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) jump4);
        com.google.javascript.rhino.head.ast.Jump jump9 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int12 = scriptNode11.getEndLineno();
        int int13 = scriptNode11.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList14 = scriptNode11.getChildScopes();
        jump9.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode11);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode17 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int18 = functionNode17.getLp();
        functionNode17.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int22 = functionNode21.getLp();
        functionNode21.setEncodedSource("");
        functionNode21.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode27 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int28 = functionNode27.getLp();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode17, (com.google.javascript.rhino.head.Node) functionNode21, (com.google.javascript.rhino.head.Node) functionNode27, (int) '#');
        jump9.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode17);
        jump9.setPosition((int) (byte) -1);
        com.google.javascript.rhino.head.ast.Jump jump34 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode1.removeChild((com.google.javascript.rhino.head.Node) jump34);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int3 = functionNode2.getLp();
        functionNode2.setEncodedSource("");
        com.google.javascript.rhino.head.Node node6 = functionNode2.getLastChild();
        int int7 = functionNode0.addFunction(functionNode2);
        com.google.javascript.rhino.head.ast.Symbol symbol9 = functionNode2.getSymbol("-1");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int12 = functionNode11.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = functionNode11.getTop();
        boolean boolean14 = functionNode11.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList15 = functionNode11.getSymbols();
        functionNode11.setRp(5);
        functionNode11.setParens((int) '#', 24);
        int int21 = functionNode11.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Token.CommentType commentType27 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment29 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType27, "109");
        java.lang.String str31 = comment29.toSource(19);
        java.lang.String str32 = comment29.getValue();
        java.lang.String str33 = comment29.getValue();
        com.google.javascript.rhino.head.Token.CommentType commentType34 = com.google.javascript.rhino.head.Token.CommentType.LINE;
        comment29.setCommentType(commentType34);
        com.google.javascript.rhino.head.ast.Comment comment37 = new com.google.javascript.rhino.head.ast.Comment(1, 1, commentType34, "                    /null/");
        java.lang.String str38 = comment37.getValue();
        java.lang.String str40 = comment37.toSource(8);
        com.google.javascript.rhino.head.ast.Jump jump42 = new com.google.javascript.rhino.head.ast.Jump((int) (byte) 100, (com.google.javascript.rhino.head.Node) comment37, (int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode43 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = functionNode43.getTop();
        functionNode43.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor48 = functionNode43.iterator();
        int int49 = functionNode43.getParamCount();
        int int50 = functionNode43.getRp();
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) functionNode11, (com.google.javascript.rhino.head.Node) comment37, (com.google.javascript.rhino.head.Node) functionNode43);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode53 = new com.google.javascript.rhino.head.ast.FunctionNode(830992929);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode2.replaceChild((com.google.javascript.rhino.head.Node) functionNode11, (com.google.javascript.rhino.head.Node) functionNode53);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int3 = functionNode2.getLp();
        functionNode2.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int7 = functionNode6.getLp();
        functionNode6.setEncodedSource("");
        functionNode6.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int13 = functionNode12.getLp();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode2, (com.google.javascript.rhino.head.Node) functionNode6, (com.google.javascript.rhino.head.Node) functionNode12, (int) '#');
        boolean boolean16 = functionNode12.isGenerator();
        int int17 = functionNode12.getFunctionType();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int20 = functionNode19.getLp();
        functionNode19.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode23 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int24 = functionNode23.getLp();
        functionNode23.setEncodedSource("");
        functionNode23.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int30 = functionNode29.getLp();
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode19, (com.google.javascript.rhino.head.Node) functionNode23, (com.google.javascript.rhino.head.Node) functionNode29, (int) '#');
        boolean boolean33 = functionNode29.isGenerator();
        int int34 = functionNode29.getFunctionType();
        com.google.javascript.rhino.head.Node node35 = functionNode29.getFirstChild();
        boolean boolean36 = functionNode29.isGetterOrSetter();
        functionNode12.setParentScope((com.google.javascript.rhino.head.ast.Scope) functionNode29);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) functionNode12);
        int int39 = functionNode12.getParamCount();
        java.lang.String str40 = functionNode12.shortName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = functionNode12.toSource((-18));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int6 = scriptNode5.getEndLineno();
        int int7 = scriptNode5.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = scriptNode12.getChildScopes();
        jump10.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode12);
        java.lang.String str17 = scriptNode12.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode5, (com.google.javascript.rhino.head.ast.Scope) scriptNode12);
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode12.target = scope19;
        functionNode0.addChildScope(scope19);
        boolean boolean22 = functionNode0.hasConsistentReturnUsage();
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap23 = functionNode0.getLiveLocals();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int26 = functionNode25.getEncodedSourceStart();
        functionNode0.addResumptionPoint((com.google.javascript.rhino.head.Node) functionNode25);
        int int28 = functionNode25.depth();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap29 = functionNode25.getSymbolTable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = functionNode25.toSource();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int3 = functionNode2.getBaseLineno();
        boolean boolean4 = functionNode2.isGetter();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral6 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral6.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str9 = regExpLiteral6.getValue();
        regExpLiteral6.setFlags("52");
        functionNode2.addChildrenToFront((com.google.javascript.rhino.head.Node) regExpLiteral6);
        boolean boolean13 = functionNode2.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = functionNode14.getTop();
        int int16 = functionNode14.getRegexpCount();
        int int17 = functionNode14.getParamCount();
        com.google.javascript.rhino.head.ast.AstNode astNode18 = functionNode14.getBody();
        int int19 = functionNode2.addFunction(functionNode14);
        functionNode14.setEncodedSourceStart(17);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode23 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int24 = functionNode23.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = functionNode23.getTop();
        boolean boolean26 = functionNode23.hasSideEffects();
        java.lang.String str27 = functionNode23.toString();
        functionNode23.setParens((int) (short) 10, 8);
        com.google.javascript.rhino.head.ast.Jump jump32 = new com.google.javascript.rhino.head.ast.Jump(22, (com.google.javascript.rhino.head.Node) functionNode23, 12);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode34 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int35 = functionNode34.getLp();
        functionNode34.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode38 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int39 = functionNode38.getLp();
        functionNode38.setEncodedSource("");
        functionNode38.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode44 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int45 = functionNode44.getLp();
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode34, (com.google.javascript.rhino.head.Node) functionNode38, (com.google.javascript.rhino.head.Node) functionNode44, (int) '#');
        boolean boolean48 = functionNode44.isGenerator();
        int int49 = functionNode44.getFunctionType();
        com.google.javascript.rhino.head.Node node50 = functionNode44.getFirstChild();
        boolean boolean51 = functionNode44.isGetterOrSetter();
        functionNode44.flattenSymbolTable(false);
        functionNode23.addChildScope((com.google.javascript.rhino.head.ast.Scope) functionNode44);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode56 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int57 = scriptNode56.getEndLineno();
        int int58 = scriptNode56.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump61 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int64 = scriptNode63.getEndLineno();
        int int65 = scriptNode63.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList66 = scriptNode63.getChildScopes();
        jump61.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode63);
        java.lang.String str68 = scriptNode63.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode56, (com.google.javascript.rhino.head.ast.Scope) scriptNode63);
        com.google.javascript.rhino.head.ast.AstNode astNode70 = scriptNode56.getParent();
        int int71 = scriptNode56.getType();
        com.google.javascript.rhino.head.ast.Symbol symbol73 = scriptNode56.getSymbol("109");
        java.lang.String str74 = scriptNode56.toSource();
        int int75 = scriptNode56.getParamCount();
        functionNode44.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode56);
        com.google.javascript.rhino.head.Node node77 = new com.google.javascript.rhino.head.Node(671469117, (com.google.javascript.rhino.head.Node) functionNode14, (com.google.javascript.rhino.head.Node) scriptNode56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode79 = functionNode14.getFunctionNode((-242022205));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor5 = functionNode0.iterator();
        int int6 = functionNode0.getParamCount();
        int int7 = functionNode0.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = functionNode0.getFunctionNode((-14761645));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str4 = functionNode0.toStringTree(scriptNode3);
        int int5 = scriptNode3.getRegexpCount();
        com.google.javascript.rhino.head.Node node6 = scriptNode3.getLastSibling();
        com.google.javascript.rhino.head.Node node7 = node6.getNext();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = new com.google.javascript.rhino.head.ast.FunctionNode(13);
        node6.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode9);
        int int11 = functionNode9.getType();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int14 = functionNode13.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = functionNode13.getTop();
        boolean boolean16 = functionNode13.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int19 = scriptNode18.getEndLineno();
        int int20 = scriptNode18.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump23 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int26 = scriptNode25.getEndLineno();
        int int27 = scriptNode25.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList28 = scriptNode25.getChildScopes();
        jump23.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode25);
        java.lang.String str30 = scriptNode25.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode18, (com.google.javascript.rhino.head.ast.Scope) scriptNode25);
        com.google.javascript.rhino.head.ast.Scope scope32 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode25.target = scope32;
        functionNode13.addChildScope(scope32);
        boolean boolean35 = functionNode13.hasConsistentReturnUsage();
        java.lang.String str36 = functionNode13.getNextTempName();
        com.google.javascript.rhino.head.ast.Jump jump37 = new com.google.javascript.rhino.head.ast.Jump((int) (short) -1, (com.google.javascript.rhino.head.Node) functionNode13);
        boolean boolean38 = functionNode13.isExpressionClosure();
        functionNode13.putIntProp(1, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode42 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int43 = functionNode42.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = functionNode42.getTop();
        com.google.javascript.rhino.head.Node node45 = functionNode42.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList46 = functionNode42.getParams();
        functionNode13.target = functionNode42;
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) functionNode9, (com.google.javascript.rhino.head.ast.Scope) functionNode13);
        com.google.javascript.rhino.head.ast.Name name49 = functionNode9.getFunctionName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str51 = functionNode9.toSource(17);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        com.google.javascript.rhino.head.Token.CommentType commentType5 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment7 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType5, "109");
        java.lang.String str9 = comment7.toSource(19);
        java.lang.String str10 = comment7.getValue();
        java.lang.String str11 = comment7.getValue();
        com.google.javascript.rhino.head.Token.CommentType commentType12 = com.google.javascript.rhino.head.Token.CommentType.LINE;
        comment7.setCommentType(commentType12);
        com.google.javascript.rhino.head.ast.Comment comment15 = new com.google.javascript.rhino.head.ast.Comment(1, 1, commentType12, "                    /null/");
        java.lang.String str16 = comment15.getValue();
        java.lang.String str18 = comment15.toSource(8);
        com.google.javascript.rhino.head.ast.Jump jump20 = new com.google.javascript.rhino.head.ast.Jump(6, (com.google.javascript.rhino.head.Node) comment15, 796955);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int22 = functionNode21.getLp();
        functionNode21.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope27 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode28 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = functionNode28.getTop();
        functionNode28.setParens((int) (byte) 1, (int) (short) 1);
        functionNode28.setEncodedSourceStart((-1));
        functionNode28.setFunctionIsGetter();
        scope27.addChildToFront((com.google.javascript.rhino.head.Node) functionNode28);
        functionNode25.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode28);
        int int38 = functionNode21.addFunction(functionNode25);
        int int39 = functionNode21.getEncodedSourceEnd();
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap40 = functionNode21.getLiveLocals();
        jump20.addChildToFront((com.google.javascript.rhino.head.Node) functionNode21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str43 = functionNode21.toSource(13);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        com.google.javascript.rhino.head.Node node4 = scriptNode1.setType(8);
        int int5 = scriptNode1.getLineno();
        java.lang.String str7 = scriptNode1.toSource(14);
        scriptNode1.setLength(101);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = scriptNode1.getRegexpString(35);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump4.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump4, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode10.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump4, (com.google.javascript.rhino.head.Node) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList15 = scriptNode10.getFunctions();
        int int16 = functionNodeList15.size();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator17 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        functionNodeList15.sort((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator17);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator19 = positionComparator17.reversed();
        com.google.javascript.rhino.head.ast.Jump jump23 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump23.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump27 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump23, 0);
        com.google.javascript.rhino.head.ast.Jump jump31 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump31.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump35 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump31, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode36 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int37 = functionNode36.getLp();
        functionNode36.setEncodedSource("");
        functionNode36.flattenSymbolTable(false);
        jump23.addChildAfter((com.google.javascript.rhino.head.Node) jump31, (com.google.javascript.rhino.head.Node) functionNode36);
        int int43 = functionNode36.getPosition();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode45 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        boolean boolean46 = functionNode45.isExpressionClosure();
        int int47 = positionComparator17.compare((com.google.javascript.rhino.head.ast.AstNode) functionNode36, (com.google.javascript.rhino.head.ast.AstNode) functionNode45);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode48 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = functionNode48.getTop();
        functionNode48.setParens((int) (byte) 1, (int) (short) 1);
        functionNode48.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList55 = functionNode48.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope57 = functionNode48.getDefiningScope("hi!");
        boolean boolean58 = functionNode48.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.Scope scope60 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        int[] intArray67 = new int[] { 25, 17, (short) 0, 20, 19, (byte) 1 };
        functionNode48.addLiveLocals((com.google.javascript.rhino.head.Node) scope60, intArray67);
        com.google.javascript.rhino.head.Node node70 = functionNode48.setType(100);
        functionNode48.setIsGenerator();
        functionNode45.setCompilerData((java.lang.Object) functionNode48);
        java.lang.String str73 = functionNode45.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str75 = functionNode45.toSource((-767426003));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        functionNode1.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode1);
        functionNode1.setRequiresActivation();
        java.lang.String str8 = functionNode1.shortName();
        int int9 = functionNode1.getBaseLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = functionNode1.getFunctionNode((int) 'a');
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int4 = functionNode3.getEncodedSourceStart();
        int int5 = functionNode3.getFunctionCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = functionNode6.getTop();
        functionNode6.setParens((int) (byte) 1, (int) (short) 1);
        int int11 = functionNode6.getRp();
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node(17, (com.google.javascript.rhino.head.Node) functionNode3, (com.google.javascript.rhino.head.Node) functionNode6, (int) (short) 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int16 = scriptNode15.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int19 = scriptNode18.getEndLineno();
        scriptNode15.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode18);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int22 = functionNode21.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = functionNode21.getTop();
        boolean boolean24 = functionNode21.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int27 = scriptNode26.getEndLineno();
        int int28 = scriptNode26.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump31 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int34 = scriptNode33.getEndLineno();
        int int35 = scriptNode33.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList36 = scriptNode33.getChildScopes();
        jump31.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode33);
        java.lang.String str38 = scriptNode33.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode26, (com.google.javascript.rhino.head.ast.Scope) scriptNode33);
        com.google.javascript.rhino.head.ast.Scope scope40 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode33.target = scope40;
        functionNode21.addChildScope(scope40);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode18, (com.google.javascript.rhino.head.ast.Scope) functionNode21);
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(8, (com.google.javascript.rhino.head.Node) functionNode3, (com.google.javascript.rhino.head.Node) scriptNode18, (int) 'a');
        com.google.javascript.rhino.head.ast.AstNode astNode46 = functionNode3.getMemberExprNode();
        int int47 = functionNode3.getParamCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str49 = functionNode3.getRegexpFlags((int) (byte) 100);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode((-1262414679));
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope4 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = functionNode5.getTop();
        functionNode5.setParens((int) (byte) 1, (int) (short) 1);
        functionNode5.setEncodedSourceStart((-1));
        functionNode5.setFunctionIsGetter();
        scope4.addChildToFront((com.google.javascript.rhino.head.Node) functionNode5);
        functionNode2.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode5);
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        jump17.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode19);
        boolean boolean24 = functionNode5.isParam((com.google.javascript.rhino.head.ast.AstNode) jump17);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int26 = functionNode25.getLp();
        functionNode25.setLength(19);
        functionNode5.addChild((com.google.javascript.rhino.head.ast.AstNode) functionNode25);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode30 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = functionNode30.getTop();
        functionNode30.setParens((int) (byte) 1, (int) (short) 1);
        functionNode30.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList37 = functionNode30.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope39 = functionNode30.getDefiningScope("hi!");
        boolean boolean40 = functionNode30.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int43 = scriptNode42.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol45 = scriptNode42.getSymbol("hi!");
        scriptNode42.putIntProp(3, 0);
        functionNode30.addResumptionPoint((com.google.javascript.rhino.head.Node) scriptNode42);
        functionNode30.setIsGenerator();
        int int51 = functionNode30.getEncodedSourceStart();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList52 = functionNode30.getParams();
        functionNode25.setParams(astNodeList52);
        functionNode1.setParams(astNodeList52);
        boolean boolean55 = functionNode1.isGetter();
        com.google.javascript.rhino.head.ast.Jump jump58 = new com.google.javascript.rhino.head.ast.Jump((-22), 25);
        com.google.javascript.rhino.head.Node node59 = jump58.getNext();
        com.google.javascript.rhino.head.ast.Jump jump62 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.Scope scope64 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        jump62.addChildrenToBack((com.google.javascript.rhino.head.Node) scope64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode1.replaceChild((com.google.javascript.rhino.head.Node) jump58, (com.google.javascript.rhino.head.Node) jump62);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope6 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = functionNode7.getTop();
        functionNode7.setParens((int) (byte) 1, (int) (short) 1);
        functionNode7.setEncodedSourceStart((-1));
        functionNode7.setFunctionIsGetter();
        scope6.addChildToFront((com.google.javascript.rhino.head.Node) functionNode7);
        functionNode4.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode7);
        int int17 = functionNode0.addFunction(functionNode4);
        java.lang.Object obj18 = functionNode4.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int21 = scriptNode20.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int24 = scriptNode23.getEndLineno();
        scriptNode20.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode23);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int27 = functionNode26.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = functionNode26.getTop();
        boolean boolean29 = functionNode26.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int32 = scriptNode31.getEndLineno();
        int int33 = scriptNode31.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump36 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int39 = scriptNode38.getEndLineno();
        int int40 = scriptNode38.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList41 = scriptNode38.getChildScopes();
        jump36.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode38);
        java.lang.String str43 = scriptNode38.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode31, (com.google.javascript.rhino.head.ast.Scope) scriptNode38);
        com.google.javascript.rhino.head.ast.Scope scope45 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode38.target = scope45;
        functionNode26.addChildScope(scope45);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode23, (com.google.javascript.rhino.head.ast.Scope) functionNode26);
        int int49 = functionNode26.getFunctionCount();
        int int50 = functionNode26.getLineno();
        int int51 = functionNode26.getAbsolutePosition();
        java.lang.String str52 = functionNode4.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode26);
        com.google.javascript.rhino.head.ast.Scope scope54 = functionNode26.getDefiningScope("Symbol (EOF) name=null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str56 = functionNode26.getRegexpString((-1262414679));
    }
}

