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
        java.lang.String str7 = functionNode1.toSource((-453175559));
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
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        int int2 = functionNode0.getRegexpCount();
        functionNode0.setFunctionIsGetter();
        com.google.javascript.rhino.head.Node node4 = functionNode0.target;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = functionNode0.getRegexpString((-674310615));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
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
        java.lang.String str22 = functionNode11.getRegexpString((int) ' ');
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        int int2 = functionNode0.getRegexpCount();
        functionNode0.setFunctionIsGetter();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap4 = functionNode0.getSymbolTable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = functionNode0.toSource();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        functionNode0.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList7 = functionNode0.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope9 = functionNode0.getDefiningScope("hi!");
        boolean boolean10 = functionNode0.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol15 = scriptNode12.getSymbol("hi!");
        scriptNode12.putIntProp(3, 0);
        functionNode0.addResumptionPoint((com.google.javascript.rhino.head.Node) scriptNode12);
        scriptNode12.putIntProp(7, 987694010);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int25 = functionNode24.getLp();
        functionNode24.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode28 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int29 = functionNode28.getLp();
        functionNode28.setEncodedSource("");
        functionNode28.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode34 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int35 = functionNode34.getLp();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode24, (com.google.javascript.rhino.head.Node) functionNode28, (com.google.javascript.rhino.head.Node) functionNode34, (int) '#');
        boolean boolean38 = functionNode34.isGenerator();
        int int39 = functionNode34.getFunctionType();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode41 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int42 = functionNode41.getLp();
        functionNode41.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode45 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int46 = functionNode45.getLp();
        functionNode45.setEncodedSource("");
        functionNode45.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode51 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int52 = functionNode51.getLp();
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode41, (com.google.javascript.rhino.head.Node) functionNode45, (com.google.javascript.rhino.head.Node) functionNode51, (int) '#');
        boolean boolean55 = functionNode51.isGenerator();
        int int56 = functionNode51.getFunctionType();
        com.google.javascript.rhino.head.Node node57 = functionNode51.getFirstChild();
        boolean boolean58 = functionNode51.isGetterOrSetter();
        functionNode34.setParentScope((com.google.javascript.rhino.head.ast.Scope) functionNode51);
        functionNode34.setRequiresActivation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode12.removeChild((com.google.javascript.rhino.head.Node) functionNode34);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int30 = scriptNode29.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int33 = scriptNode32.getEndLineno();
        scriptNode29.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode32);
        com.google.javascript.rhino.head.ast.Scope scope35 = scriptNode32.getParentScope();
        com.google.javascript.rhino.head.ast.Scope scope36 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode32.addChildrenToBack((com.google.javascript.rhino.head.Node) scope36);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int40 = scriptNode39.getEndLineno();
        int int41 = scriptNode39.getBaseLineno();
        com.google.javascript.rhino.head.Node node42 = scriptNode39.getNext();
        com.google.javascript.rhino.head.ast.Scope.joinScopes(scope36, (com.google.javascript.rhino.head.ast.Scope) scriptNode39);
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newNumber((double) '4');
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node((-1701742065), (com.google.javascript.rhino.head.Node) scope36, node45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node47 = functionNode1.getChildBefore((com.google.javascript.rhino.head.Node) scope36);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int2 = functionNode1.getEncodedSourceStart();
        int int3 = functionNode1.getFunctionCount();
        boolean boolean4 = functionNode1.isGetter();
        functionNode1.setEncodedSourceEnd(18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = functionNode1.toSource(14);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        int int3 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node4 = scriptNode1.getNext();
        scriptNode1.setPosition((int) (byte) -1);
        com.google.javascript.rhino.head.Token.CommentType commentType9 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment11 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType9, "109");
        scriptNode1.setJsDocNode(comment11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = scriptNode1.getRegexpFlags(24);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
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
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int3 = functionNode2.getLp();
        functionNode2.setLp((int) (short) 1);
        int int8 = functionNode2.getIntProp(4, 26);
        com.google.javascript.rhino.head.ast.Jump jump9 = new com.google.javascript.rhino.head.ast.Jump(3, (com.google.javascript.rhino.head.Node) functionNode2);
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) functionNode2);
        functionNode2.setRequiresActivation();
        com.google.javascript.rhino.head.Node node13 = functionNode2.setType(9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = functionNode2.getRegexpString((-522402608));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
        int int16 = functionNode11.getFunctionCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode17 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = functionNode17.getTop();
        functionNode17.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor22 = functionNode17.iterator();
        functionNode17.setFunctionIsSetter();
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
        functionNode27.setPosition(16);
        int int50 = functionNode17.addFunction(functionNode27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node51 = functionNode11.getChildBefore((com.google.javascript.rhino.head.Node) functionNode27);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setEncodedSource("");
        functionNode0.flattenSymbolTable(false);
        java.lang.String str6 = functionNode0.getName();
        boolean boolean7 = functionNode0.hasConsistentReturnUsage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = functionNode0.toSource(18);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        int int16 = functionNode11.getFunctionCount();
        boolean boolean17 = functionNode11.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode(556794251);
        com.google.javascript.rhino.head.Token.CommentType commentType24 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment26 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType24, "109");
        java.lang.String str28 = comment26.toSource(19);
        java.lang.String str29 = comment26.getValue();
        com.google.javascript.rhino.head.Token.CommentType commentType30 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        comment26.setCommentType(commentType30);
        com.google.javascript.rhino.head.ast.Comment comment33 = new com.google.javascript.rhino.head.ast.Comment(9, 6, commentType30, "                    ");
        functionNode19.setJsDocNode(comment33);
        functionNode19.setRequiresActivation();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = functionNode19.getTop();
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
        scriptNode47.clearParentScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode11.addChildBefore((com.google.javascript.rhino.head.Node) scriptNode36, (com.google.javascript.rhino.head.Node) scriptNode47);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot91 = functionNode11.getAstRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str93 = functionNode11.getRegexpFlags(556794251);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
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
        java.lang.String str19 = functionNode0.makeIndent((-346319059));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = functionNode0.toSource((-674310615));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList20 = scriptNode17.getChildScopes();
        functionNode1.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        functionNode1.setEncodedSourceEnd((int) (short) 100);
        functionNode1.setLp((-1320570006));
        com.google.javascript.rhino.head.ast.Comment comment26 = functionNode1.getJsDocNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode28 = functionNode1.getFunctionNode((int) (byte) 100);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope(6, 4);
        java.lang.String str4 = scope2.toSource((int) (byte) 1);
        int int5 = scope2.getLength();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode(25);
        java.lang.String str8 = scope2.toStringTree(scriptNode7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = scriptNode7.getRegexpString(8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        functionNode0.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList7 = functionNode0.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope9 = functionNode0.getDefiningScope("hi!");
        boolean boolean10 = functionNode0.isGetterOrSetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = functionNode0.toSource(16);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = functionNode1.getEnclosingFunction();
        com.google.javascript.rhino.head.Node node3 = functionNode1.target;
        functionNode1.setLineno((int) (byte) -1);
        com.google.javascript.rhino.head.ast.Comment comment6 = functionNode1.getJsDocNode();
        int int7 = functionNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int9 = functionNode8.getLp();
        functionNode8.setLineno(0);
        boolean boolean12 = functionNode8.requiresActivation();
        int int13 = functionNode8.getFunctionCount();
        com.google.javascript.rhino.head.ast.Scope scope15 = functionNode8.getDefiningScope("                {\n                }\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode1.removeChild((com.google.javascript.rhino.head.Node) functionNode8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        com.google.javascript.rhino.head.Node node3 = functionNode0.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList4 = functionNode0.getParams();
        int int5 = functionNode0.getType();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator6 = functionNode0.new NodeIterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = functionNode0.toSource(136);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.google.javascript.rhino.head.ast.Scope scope0 = new com.google.javascript.rhino.head.ast.Scope();
        scope0.setBounds(0, 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = functionNode4.getTop();
        int int6 = functionNode4.getRegexpCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = functionNode4.getEnclosingFunction();
        java.lang.String str8 = scope0.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode4);
        functionNode4.setEncodedSourceBounds(2, 32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = functionNode4.toSource((int) (byte) -1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
        boolean boolean44 = functionNode16.isGetter();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral46 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str48 = regExpLiteral46.toSource((int) (byte) 10);
        regExpLiteral46.setFlags("-1\tSCRIPT -1 1\n");
        regExpLiteral46.removeProp(8);
        java.lang.String str53 = regExpLiteral46.getValue();
        functionNode16.addRegExp(regExpLiteral46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode56 = functionNode16.getFunctionNode(13);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList1 = functionNode0.getFunctions();
        int int2 = functionNode0.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = functionNode0.getFunctionNode(8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
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
        int int88 = functionNode11.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str90 = functionNode11.getRegexpString(23);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        java.lang.String str23 = functionNode16.toSource();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        int int3 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node4 = scriptNode1.getNext();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getFirstChild();
        java.lang.String str7 = scriptNode1.toSource(6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) scriptNode10, (int) (byte) 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode15 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope17 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode18 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = functionNode18.getTop();
        functionNode18.setParens((int) (byte) 1, (int) (short) 1);
        functionNode18.setEncodedSourceStart((-1));
        functionNode18.setFunctionIsGetter();
        scope17.addChildToFront((com.google.javascript.rhino.head.Node) functionNode18);
        functionNode15.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode18);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode28 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = functionNode28.getTop();
        functionNode28.setParens((int) (byte) 1, (int) (short) 1);
        functionNode28.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList35 = functionNode28.getResumptionPoints();
        int int36 = functionNode28.getLp();
        functionNode15.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode28);
        scriptNode10.setTop((com.google.javascript.rhino.head.ast.ScriptNode) functionNode15);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode39 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = functionNode39.getTop();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode41 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int42 = functionNode41.getLp();
        functionNode41.setEncodedSource("");
        com.google.javascript.rhino.head.Node node45 = functionNode41.getLastChild();
        int int46 = functionNode39.addFunction(functionNode41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode1.addChildBefore((com.google.javascript.rhino.head.Node) functionNode15, (com.google.javascript.rhino.head.Node) functionNode39);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        int int2 = functionNode0.getRegexpCount();
        functionNode0.setFunctionIsGetter();
        com.google.javascript.rhino.head.Node node4 = functionNode0.target;
        int int7 = functionNode0.getIntProp(17, 9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = functionNode0.toSource();
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
        com.google.javascript.rhino.head.Node node17 = functionNode11.getNext();
        functionNode11.setBounds(2, 17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = functionNode11.toSource((-1701742065));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode8.target = scope15;
        com.google.javascript.rhino.head.ast.Jump jump20 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump20.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump24 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump20, 0);
        com.google.javascript.rhino.head.ast.Jump jump28 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump28.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump32 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump28, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode33 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int34 = functionNode33.getLp();
        functionNode33.setEncodedSource("");
        functionNode33.flattenSymbolTable(false);
        jump20.addChildAfter((com.google.javascript.rhino.head.Node) jump28, (com.google.javascript.rhino.head.Node) functionNode33);
        com.google.javascript.rhino.head.Node node40 = functionNode33.target;
        boolean boolean41 = functionNode33.hasConsistentReturnUsage();
        scriptNode8.addChildToFront((com.google.javascript.rhino.head.Node) functionNode33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str43 = functionNode33.debugPrint();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLp((int) (short) 1);
        int int6 = functionNode0.getIntProp(4, 26);
        functionNode0.flattenSymbolTable(true);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList9 = functionNode0.getParams();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = functionNode0.toSource(2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = functionNode0.getSymbols();
        int int5 = functionNode0.getLength();
        int int6 = functionNode0.depth();
        int int7 = functionNode0.getBaseLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = functionNode0.toSource(21);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = functionNode10.toSource(109);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        functionNode0.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode3);
        int int13 = functionNode0.getRegexpCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = functionNode0.toSource((int) 'a');
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
        java.lang.String str27 = functionNode0.toSource(109);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        java.lang.String str2 = scriptNode1.getJsDoc();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = scriptNode1.getFunctionNode((-1320570006));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
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
        java.lang.String str89 = functionNode78.getRegexpString(15);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral1 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (byte) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        java.lang.String str5 = scriptNode4.getJsDoc();
        com.google.javascript.rhino.head.Node node7 = scriptNode4.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int9 = functionNode8.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str12 = functionNode8.toStringTree(scriptNode11);
        com.google.javascript.rhino.head.ast.Scope scope14 = scriptNode11.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList15 = scriptNode11.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int18 = scriptNode17.getEndLineno();
        int int19 = scriptNode17.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode11, (com.google.javascript.rhino.head.ast.Scope) scriptNode17);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int23 = scriptNode22.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int26 = scriptNode25.getEndLineno();
        scriptNode22.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode25);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode28 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int29 = functionNode28.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = functionNode28.getTop();
        boolean boolean31 = functionNode28.hasSideEffects();
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
        com.google.javascript.rhino.head.ast.Scope scope47 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode40.target = scope47;
        functionNode28.addChildScope(scope47);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode25, (com.google.javascript.rhino.head.ast.Scope) functionNode28);
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node(20, (com.google.javascript.rhino.head.Node) scriptNode4, (com.google.javascript.rhino.head.Node) scriptNode11, (com.google.javascript.rhino.head.Node) scriptNode25);
        int int52 = scriptNode25.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int55 = scriptNode54.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int58 = scriptNode57.getEndLineno();
        scriptNode54.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode57);
        java.lang.String str60 = scriptNode54.getNextTempName();
        scriptNode25.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode54);
        int int62 = scriptNode54.getParamCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode64 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int65 = functionNode64.getBaseLineno();
        boolean boolean66 = functionNode64.isGetter();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral68 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral68.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str71 = regExpLiteral68.getValue();
        regExpLiteral68.setFlags("52");
        functionNode64.addChildrenToFront((com.google.javascript.rhino.head.Node) regExpLiteral68);
        boolean boolean75 = functionNode64.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode76 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode77 = functionNode76.getTop();
        int int78 = functionNode76.getRegexpCount();
        int int79 = functionNode76.getParamCount();
        com.google.javascript.rhino.head.ast.AstNode astNode80 = functionNode76.getBody();
        int int81 = functionNode64.addFunction(functionNode76);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode82 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int83 = functionNode82.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode84 = functionNode82.getTop();
        boolean boolean85 = functionNode82.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList86 = functionNode82.getSymbols();
        int int87 = functionNode82.getLength();
        boolean boolean88 = functionNode82.isGetterOrSetter();
        functionNode76.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode82);
        boolean boolean90 = functionNode82.isGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        regExpLiteral1.addChildBefore((com.google.javascript.rhino.head.Node) scriptNode54, (com.google.javascript.rhino.head.Node) functionNode82);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
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
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode8.target = scope15;
        com.google.javascript.rhino.head.ast.Jump jump20 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump20.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump24 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump20, 0);
        com.google.javascript.rhino.head.ast.Jump jump28 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump28.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump32 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump28, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode33 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int34 = functionNode33.getLp();
        functionNode33.setEncodedSource("");
        functionNode33.flattenSymbolTable(false);
        jump20.addChildAfter((com.google.javascript.rhino.head.Node) jump28, (com.google.javascript.rhino.head.Node) functionNode33);
        com.google.javascript.rhino.head.Node node40 = functionNode33.target;
        boolean boolean41 = functionNode33.hasConsistentReturnUsage();
        scriptNode8.addChildToFront((com.google.javascript.rhino.head.Node) functionNode33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str44 = functionNode33.toSource(22);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
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
        int int23 = functionNode16.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = functionNode16.getRegexpString(2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.Scope scope3 = functionNode0.getDefiningScope("109");
        functionNode0.setIsGenerator();
        boolean boolean5 = functionNode0.isGetter();
        functionNode0.setRp((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = functionNode0.toSource((-1619253627));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode1.getTop();
        boolean boolean4 = functionNode1.hasSideEffects();
        java.lang.String str5 = functionNode1.toString();
        functionNode1.setParens((int) (short) 10, 8);
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump(22, (com.google.javascript.rhino.head.Node) functionNode1, 12);
        functionNode1.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int14 = functionNode13.getLp();
        functionNode13.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode17 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int18 = functionNode17.getLp();
        functionNode17.setEncodedSource("");
        functionNode17.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode23 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int24 = functionNode23.getLp();
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode13, (com.google.javascript.rhino.head.Node) functionNode17, (com.google.javascript.rhino.head.Node) functionNode23, (int) '#');
        boolean boolean27 = functionNode23.isGenerator();
        com.google.javascript.rhino.head.ast.Scope scope29 = new com.google.javascript.rhino.head.ast.Scope();
        scope29.setBounds(0, 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode33 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = functionNode33.getTop();
        int int35 = functionNode33.getRegexpCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode36 = functionNode33.getEnclosingFunction();
        java.lang.String str37 = scope29.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode33);
        functionNode23.putProp(1, (java.lang.Object) functionNode33);
        functionNode1.addResumptionPoint((com.google.javascript.rhino.head.Node) functionNode23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str40 = functionNode1.toSource();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope(136, (int) (byte) 100);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope5 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = functionNode6.getTop();
        functionNode6.setParens((int) (byte) 1, (int) (short) 1);
        functionNode6.setEncodedSourceStart((-1));
        functionNode6.setFunctionIsGetter();
        scope5.addChildToFront((com.google.javascript.rhino.head.Node) functionNode6);
        functionNode3.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode6);
        functionNode3.setRequiresActivation();
        boolean boolean17 = functionNode3.isExpressionClosure();
        functionNode3.setSourceName("hi!");
        int int20 = functionNode3.getFunctionCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int25 = functionNode24.getEncodedSourceStart();
        int int26 = functionNode24.getFunctionCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode27 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = functionNode27.getTop();
        functionNode27.setParens((int) (byte) 1, (int) (short) 1);
        int int32 = functionNode27.getRp();
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(17, (com.google.javascript.rhino.head.Node) functionNode24, (com.google.javascript.rhino.head.Node) functionNode27, (int) (short) 0);
        functionNode27.setParens(35, (-674310615));
        com.google.javascript.rhino.head.ast.Jump jump38 = new com.google.javascript.rhino.head.ast.Jump(4, (com.google.javascript.rhino.head.Node) functionNode27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scope2.replaceChildAfter((com.google.javascript.rhino.head.Node) functionNode3, (com.google.javascript.rhino.head.Node) functionNode27);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
        com.google.javascript.rhino.head.ast.FunctionNode functionNode18 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = functionNode18.getTop();
        functionNode18.setParens((int) (byte) 1, (int) (short) 1);
        int int23 = functionNode18.getRp();
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newString((int) (byte) 100, "");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode27 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int28 = functionNode27.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str31 = functionNode27.toStringTree(scriptNode30);
        com.google.javascript.rhino.head.ast.Scope scope33 = scriptNode30.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList34 = scriptNode30.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int37 = scriptNode36.getEndLineno();
        int int38 = scriptNode36.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode30, (com.google.javascript.rhino.head.ast.Scope) scriptNode36);
        java.lang.String str40 = scriptNode36.getEncodedSource();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(136, (com.google.javascript.rhino.head.Node) functionNode18, node26, (com.google.javascript.rhino.head.Node) scriptNode36, (int) (short) 0);
        functionNode11.setParent((com.google.javascript.rhino.head.ast.AstNode) functionNode18);
        int int44 = functionNode11.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = functionNode11.getRegexpString((-1701742065));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) (byte) 1, "$0");
        com.google.javascript.rhino.head.Node node3 = node2.getNext();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber(1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node6 = node2.getChildBefore(node5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = scriptNode37.getRegexpFlags(1272516910);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        functionNode1.setSourceName("                                                                                                                                                                                                        /null/");
        com.google.javascript.rhino.head.ast.AstNode astNode5 = functionNode1.getBody();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = functionNode1.toSource(129);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLp((int) (short) 1);
        int int6 = functionNode0.getIntProp(4, 26);
        functionNode0.flattenSymbolTable(true);
        java.lang.Object obj10 = functionNode0.getProp(0);
        int int11 = functionNode0.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral14 = new com.google.javascript.rhino.head.ast.RegExpLiteral(11, (-674310615));
        functionNode0.addRegExp(regExpLiteral14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode17 = functionNode0.getFunctionNode((-1320570006));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
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
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap17 = functionNode11.getLiveLocals();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = functionNode11.toSource((int) 'a');
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = functionNode7.debugPrint();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str55 = functionNode0.toSource(10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
        com.google.javascript.rhino.head.ast.FunctionNode functionNode17 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int18 = functionNode17.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = functionNode17.getTop();
        boolean boolean20 = functionNode17.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList21 = functionNode17.getSymbols();
        functionNode17.setRp(5);
        functionNode17.setParens((int) '#', 24);
        int int27 = functionNode17.getParamCount();
        functionNode17.setSourceName("");
        com.google.javascript.rhino.head.ast.Jump jump35 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump35.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump39 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump35, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int42 = scriptNode41.getEndLineno();
        int int43 = scriptNode41.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList44 = scriptNode41.getChildScopes();
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump35, (com.google.javascript.rhino.head.Node) scriptNode41);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int48 = scriptNode47.getEndLineno();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral50 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str52 = regExpLiteral50.toSource((int) (byte) 10);
        regExpLiteral50.setFlags("-1\tSCRIPT -1 1\n");
        regExpLiteral50.removeProp(8);
        com.google.javascript.rhino.head.Node node58 = new com.google.javascript.rhino.head.Node(10, node45, (com.google.javascript.rhino.head.Node) scriptNode47, (com.google.javascript.rhino.head.Node) regExpLiteral50, 3);
        regExpLiteral50.setFlags("$0");
        boolean boolean61 = regExpLiteral50.hasChildren();
        functionNode17.addRegExp(regExpLiteral50);
        com.google.javascript.rhino.head.Token.CommentType commentType65 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment67 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType65, "109");
        java.lang.String str69 = comment67.toSource(0);
        com.google.javascript.rhino.head.Token.CommentType commentType70 = comment67.getCommentType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode11.addChildBefore((com.google.javascript.rhino.head.Node) functionNode17, (com.google.javascript.rhino.head.Node) comment67);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        int int16 = functionNode11.getFunctionCount();
        boolean boolean17 = functionNode11.hasConsistentReturnUsage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = functionNode11.toSource((int) (byte) 100);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        com.google.javascript.rhino.head.ast.AstNode astNode28 = functionNode10.getParent();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int30 = functionNode29.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = functionNode29.getTop();
        boolean boolean32 = functionNode29.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList33 = functionNode29.getSymbols();
        functionNode29.setRp(5);
        com.google.javascript.rhino.head.ast.Scope scope36 = functionNode29.getEnclosingScope();
        functionNode29.setParens(14, 19);
        functionNode10.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) functionNode29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = functionNode29.getRegexpFlags((int) (byte) -1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("EOF");
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator2 = node1.new NodeIterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList10 = functionNode3.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope12 = functionNode3.getDefiningScope("hi!");
        boolean boolean13 = functionNode3.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int16 = scriptNode15.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol18 = scriptNode15.getSymbol("hi!");
        scriptNode15.putIntProp(3, 0);
        functionNode3.addResumptionPoint((com.google.javascript.rhino.head.Node) scriptNode15);
        java.lang.String str23 = node1.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode3);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int25 = functionNode24.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = functionNode24.getTop();
        boolean boolean27 = functionNode24.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList28 = functionNode24.getSymbols();
        functionNode24.setRp(5);
        com.google.javascript.rhino.head.ast.Scope scope31 = functionNode24.getEnclosingScope();
        java.lang.String str32 = functionNode24.getJsDoc();
        com.google.javascript.rhino.head.Node node33 = functionNode24.getFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode3.removeChild((com.google.javascript.rhino.head.Node) functionNode24);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode8.target = scope15;
        com.google.javascript.rhino.head.ast.Jump jump20 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump20.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump24 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump20, 0);
        com.google.javascript.rhino.head.ast.Jump jump28 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump28.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump32 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump28, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode33 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int34 = functionNode33.getLp();
        functionNode33.setEncodedSource("");
        functionNode33.flattenSymbolTable(false);
        jump20.addChildAfter((com.google.javascript.rhino.head.Node) jump28, (com.google.javascript.rhino.head.Node) functionNode33);
        com.google.javascript.rhino.head.Node node40 = functionNode33.target;
        boolean boolean41 = functionNode33.hasConsistentReturnUsage();
        scriptNode8.addChildToFront((com.google.javascript.rhino.head.Node) functionNode33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode44 = scriptNode8.getFunctionNode(316661517);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        int int2 = functionNode0.getRegexpCount();
        functionNode0.setFunctionIsGetter();
        com.google.javascript.rhino.head.Node node4 = functionNode0.target;
        functionNode0.clearParentScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = functionNode0.debugPrint();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str1 = symbol0.getName();
        com.google.javascript.rhino.head.Node node2 = symbol0.getNode();
        java.lang.String str3 = symbol0.getDeclTypeName();
        java.lang.String str4 = symbol0.toString();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = functionNode5.getTop();
        boolean boolean8 = functionNode5.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int11 = scriptNode10.getEndLineno();
        int int12 = scriptNode10.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump15 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int18 = scriptNode17.getEndLineno();
        int int19 = scriptNode17.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList20 = scriptNode17.getChildScopes();
        jump15.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode17);
        java.lang.String str22 = scriptNode17.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode10, (com.google.javascript.rhino.head.ast.Scope) scriptNode17);
        com.google.javascript.rhino.head.ast.Scope scope24 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode17.target = scope24;
        functionNode5.addChildScope(scope24);
        boolean boolean27 = functionNode5.hasConsistentReturnUsage();
        java.lang.String str28 = functionNode5.getNextTempName();
        functionNode5.removeProp(5);
        symbol0.setContainingTable((com.google.javascript.rhino.head.ast.Scope) functionNode5);
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap32 = functionNode5.getLiveLocals();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = functionNode5.getRegexpString((int) (byte) 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("EOF");
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator2 = node1.new NodeIterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList10 = functionNode3.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope12 = functionNode3.getDefiningScope("hi!");
        boolean boolean13 = functionNode3.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int16 = scriptNode15.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol18 = scriptNode15.getSymbol("hi!");
        scriptNode15.putIntProp(3, 0);
        functionNode3.addResumptionPoint((com.google.javascript.rhino.head.Node) scriptNode15);
        java.lang.String str23 = node1.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode3);
        int int24 = functionNode3.getEncodedSourceStart();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = functionNode3.toSource((-453175559));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = functionNode2.toSource(10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
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
        java.lang.String str19 = functionNode0.makeIndent((-346319059));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = functionNode0.toSource((-1));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = scriptNode1.getRegexpFlags(0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setIsExpressionClosure(false);
        int int4 = functionNode0.getLineno();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = functionNode5.getTop();
        boolean boolean8 = functionNode5.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList9 = functionNode5.getSymbols();
        functionNode5.setRp(5);
        com.google.javascript.rhino.head.ast.Scope scope12 = functionNode5.getEnclosingScope();
        int int13 = functionNode5.getRp();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int15 = functionNode14.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = functionNode14.getTop();
        boolean boolean17 = functionNode14.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList18 = functionNode14.getSymbols();
        int int19 = functionNode14.getLength();
        int int20 = functionNode14.getRegexpCount();
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
        com.google.javascript.rhino.head.ast.Comment comment36 = functionNode32.getJsDocNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode37 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope39 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode40 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = functionNode40.getTop();
        functionNode40.setParens((int) (byte) 1, (int) (short) 1);
        functionNode40.setEncodedSourceStart((-1));
        functionNode40.setFunctionIsGetter();
        scope39.addChildToFront((com.google.javascript.rhino.head.Node) functionNode40);
        functionNode37.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode40);
        boolean boolean50 = functionNode32.isParam((com.google.javascript.rhino.head.ast.AstNode) functionNode37);
        int int51 = functionNode37.getLp();
        int int52 = functionNode37.getEncodedSourceEnd();
        int int53 = functionNode14.addFunction(functionNode37);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode55 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int56 = functionNode55.getLp();
        functionNode55.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode59 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int60 = functionNode59.getLp();
        functionNode59.setEncodedSource("");
        functionNode59.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode65 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int66 = functionNode65.getLp();
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode55, (com.google.javascript.rhino.head.Node) functionNode59, (com.google.javascript.rhino.head.Node) functionNode65, (int) '#');
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap69 = functionNode59.getSymbolTable();
        java.lang.String str70 = functionNode59.shortName();
        int int71 = functionNode59.getEncodedSourceStart();
        functionNode14.setParentScope((com.google.javascript.rhino.head.ast.Scope) functionNode59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode0.replaceChildAfter((com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode14);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        functionNode3.setRp(19);
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
        java.lang.String str31 = functionNode3.toStringTree(scriptNode22);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode33 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int34 = functionNode33.getBaseLineno();
        functionNode33.setSourceName("                                                                                                                                                                                                        /null/");
        functionNode33.setRequiresActivation();
        com.google.javascript.rhino.head.Node node38 = functionNode33.target;
        int int39 = functionNode33.getLength();
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) scriptNode22, (com.google.javascript.rhino.head.Node) functionNode33, 556794251);
        int int44 = functionNode33.getIntProp((int) (byte) -1, (-453175559));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = functionNode33.toSource((int) '4');
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = functionNode16.getRegexpString(10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
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
        functionNode2.setFunctionIsSetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = functionNode2.getRegexpString(80);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = functionNode16.getTop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = scriptNode24.toSource((-927403505));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
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
        com.google.javascript.rhino.head.ast.Jump jump22 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump22.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump26 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump22, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int29 = scriptNode28.getEndLineno();
        int int30 = scriptNode28.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList31 = scriptNode28.getChildScopes();
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump22, (com.google.javascript.rhino.head.Node) scriptNode28);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList33 = scriptNode28.getFunctions();
        functionNodeList33.clear();
        com.google.javascript.rhino.head.ast.Jump jump39 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump39.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump43 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump39, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int46 = scriptNode45.getEndLineno();
        int int47 = scriptNode45.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList48 = scriptNode45.getChildScopes();
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump39, (com.google.javascript.rhino.head.Node) scriptNode45);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList50 = scriptNode45.getFunctions();
        boolean boolean51 = functionNodeList33.removeAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList50);
        boolean boolean52 = functionNodeList15.addAll(0, (java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList33);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int55 = scriptNode54.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol57 = scriptNode54.getSymbol("hi!");
        java.lang.String str58 = scriptNode54.getEncodedSource();
        boolean boolean59 = functionNodeList33.remove((java.lang.Object) scriptNode54);
        int int60 = scriptNode54.getRegexpCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode62 = scriptNode54.getFunctionNode((int) (byte) -1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope4 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = functionNode5.getTop();
        functionNode5.setParens((int) (byte) 1, (int) (short) 1);
        functionNode5.setEncodedSourceStart((-1));
        functionNode5.setFunctionIsGetter();
        scope4.addChildToFront((com.google.javascript.rhino.head.Node) functionNode5);
        functionNode2.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode5);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode15 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = functionNode15.getTop();
        functionNode15.setParens((int) (byte) 1, (int) (short) 1);
        functionNode15.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList22 = functionNode15.getResumptionPoints();
        int int23 = functionNode15.getLp();
        functionNode2.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode15);
        boolean boolean25 = functionNode15.isGenerator();
        int int26 = functionNode1.addFunction(functionNode15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = functionNode1.getRegexpString(20);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
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
        com.google.javascript.rhino.head.ast.Scope scope50 = scriptNode23.getEnclosingScope();
        com.google.javascript.rhino.head.ast.Jump jump55 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump55.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump59 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump55, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode61 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int62 = scriptNode61.getEndLineno();
        int int63 = scriptNode61.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList64 = scriptNode61.getChildScopes();
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump55, (com.google.javascript.rhino.head.Node) scriptNode61);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList66 = scriptNode61.getFunctions();
        int int67 = scriptNode61.getPosition();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList68 = scriptNode61.getChildScopes();
        int int69 = scriptNode61.getEncodedSourceEnd();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList70 = scriptNode61.getSymbols();
        scriptNode23.setSymbols(symbolList70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str73 = scriptNode23.getRegexpString(10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode((-1));
        java.lang.Object obj2 = functionNode1.getCompilerData();
        com.google.javascript.rhino.head.ast.Jump jump5 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int8 = scriptNode7.getEndLineno();
        int int9 = scriptNode7.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList10 = scriptNode7.getChildScopes();
        jump5.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode7);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int14 = functionNode13.getLp();
        functionNode13.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode17 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int18 = functionNode17.getLp();
        functionNode17.setEncodedSource("");
        functionNode17.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode23 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int24 = functionNode23.getLp();
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode13, (com.google.javascript.rhino.head.Node) functionNode17, (com.google.javascript.rhino.head.Node) functionNode23, (int) '#');
        jump5.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode13);
        int int28 = functionNode13.getLength();
        functionNode13.setEncodedSource("");
        com.google.javascript.rhino.head.ast.AstNode astNode31 = functionNode13.getParent();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode32 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int33 = functionNode32.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = functionNode32.getTop();
        boolean boolean35 = functionNode32.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList36 = functionNode32.getSymbols();
        functionNode32.setRp(5);
        com.google.javascript.rhino.head.ast.Scope scope39 = functionNode32.getEnclosingScope();
        functionNode32.setParens(14, 19);
        functionNode13.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) functionNode32);
        com.google.javascript.rhino.head.ast.Comment comment44 = functionNode32.getJsDocNode();
        functionNode1.addParam((com.google.javascript.rhino.head.ast.AstNode) functionNode32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = functionNode1.toSource();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
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
        com.google.javascript.rhino.head.ast.AstNode astNode28 = functionNode10.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = functionNode10.getRegexpString(655041225);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        scriptNode1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList7 = scriptNode1.getFunctions();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope10 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode11 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = functionNode11.getTop();
        functionNode11.setParens((int) (byte) 1, (int) (short) 1);
        functionNode11.setEncodedSourceStart((-1));
        functionNode11.setFunctionIsGetter();
        scope10.addChildToFront((com.google.javascript.rhino.head.Node) functionNode11);
        functionNode8.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode11);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = functionNode21.getTop();
        functionNode21.setParens((int) (byte) 1, (int) (short) 1);
        functionNode21.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList28 = functionNode21.getResumptionPoints();
        int int29 = functionNode21.getLp();
        functionNode8.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode21);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int33 = scriptNode32.getEndLineno();
        int int34 = scriptNode32.getBaseLineno();
        scriptNode32.removeProp(0);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList37 = scriptNode32.getSymbols();
        functionNode8.setSymbols(symbolList37);
        scriptNode1.setSymbols(symbolList37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode41 = scriptNode1.getFunctionNode(100);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLineno(0);
        boolean boolean4 = functionNode0.requiresActivation();
        int int5 = functionNode0.getFunctionCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = functionNode0.toSource((int) (byte) -1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = functionNode1.debugPrint();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
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
        int int17 = functionNode1.getEncodedSourceStart();
        functionNode1.setLineno(100);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int21 = functionNode20.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str24 = functionNode20.toStringTree(scriptNode23);
        java.lang.String str25 = functionNode20.getName();
        functionNode1.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = functionNode1.toSource();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
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
        com.google.javascript.rhino.head.Token.CommentType commentType25 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment27 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType25, "109");
        java.lang.String str29 = comment27.toSource(19);
        java.lang.String str30 = comment27.getValue();
        java.lang.String str32 = comment27.toSource(2);
        functionNode16.setJsDocNode(comment27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str35 = functionNode16.getRegexpString(2);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setLp((int) (short) 1);
        int int7 = functionNode1.getIntProp(4, 26);
        com.google.javascript.rhino.head.ast.Jump jump8 = new com.google.javascript.rhino.head.ast.Jump(3, (com.google.javascript.rhino.head.Node) functionNode1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = functionNode10.getTop();
        java.lang.String str12 = scriptNode11.getJsDoc();
        com.google.javascript.rhino.head.Node node14 = scriptNode11.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode15 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int16 = functionNode15.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str19 = functionNode15.toStringTree(scriptNode18);
        com.google.javascript.rhino.head.ast.Scope scope21 = scriptNode18.getDefiningScope("");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int24 = scriptNode23.getEndLineno();
        int int25 = scriptNode23.getBaseLineno();
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(25, node14, (com.google.javascript.rhino.head.Node) scriptNode18, (com.google.javascript.rhino.head.Node) scriptNode23);
        node14.removeProp(2);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode(16);
        scriptNode30.setBounds(20134776, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode1.replaceChild(node14, (com.google.javascript.rhino.head.Node) scriptNode30);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str4 = functionNode0.toStringTree(scriptNode3);
        java.lang.String str5 = functionNode0.shortName();
        boolean boolean6 = functionNode0.isGetter();
        functionNode0.setFunctionType((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = functionNode0.toSource((-1147087024));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot91 = functionNode11.getAstRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode93 = functionNode11.getFunctionNode((int) (byte) 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        scriptNode1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        java.lang.String str7 = scriptNode1.getNextTempName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.AstNode astNode9 = functionNode8.getParent();
        scriptNode1.setParentScope((com.google.javascript.rhino.head.ast.Scope) functionNode8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = scriptNode1.getRegexpFlags((-1701742065));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
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
        functionNode38.removeProp(21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = functionNode38.debugPrint();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str64 = functionNode25.debugPrint();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        symbol0.setIndex(6);
        java.lang.String str3 = symbol0.getDeclTypeName();
        com.google.javascript.rhino.head.ast.Scope scope4 = symbol0.getContainingTable();
        com.google.javascript.rhino.head.Node node5 = symbol0.getNode();
        com.google.javascript.rhino.head.ast.Symbol symbol6 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str7 = symbol6.getName();
        com.google.javascript.rhino.head.Node node8 = symbol6.getNode();
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump((int) ' ');
        symbol6.setNode((com.google.javascript.rhino.head.Node) jump10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int14 = functionNode13.getBaseLineno();
        functionNode13.setSourceName("                                                                                                                                                                                                        /null/");
        symbol6.setContainingTable((com.google.javascript.rhino.head.ast.Scope) functionNode13);
        java.lang.String str18 = functionNode13.getName();
        symbol0.setContainingTable((com.google.javascript.rhino.head.ast.Scope) functionNode13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = functionNode13.getRegexpString(129);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        com.google.javascript.rhino.head.ast.Jump jump5 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump5.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump9 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump5, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int12 = scriptNode11.getEndLineno();
        int int13 = scriptNode11.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList14 = scriptNode11.getChildScopes();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump5, (com.google.javascript.rhino.head.Node) scriptNode11);
        symbol0.setContainingTable((com.google.javascript.rhino.head.ast.Scope) scriptNode11);
        java.lang.String str17 = symbol0.toString();
        com.google.javascript.rhino.head.ast.Scope scope18 = symbol0.getContainingTable();
        com.google.javascript.rhino.head.ast.Scope scope19 = symbol0.getContainingTable();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int22 = scriptNode21.getEndLineno();
        int int23 = scriptNode21.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump26 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int29 = scriptNode28.getEndLineno();
        int int30 = scriptNode28.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList31 = scriptNode28.getChildScopes();
        jump26.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode28);
        java.lang.String str33 = scriptNode28.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode21, (com.google.javascript.rhino.head.ast.Scope) scriptNode28);
        int int35 = scriptNode28.getLineno();
        boolean boolean36 = scriptNode28.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node37 = scope19.getChildBefore((com.google.javascript.rhino.head.Node) scriptNode28);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = functionNode4.getTop();
        functionNode4.setParens((int) (byte) 1, (int) (short) 1);
        functionNode4.setEncodedSourceStart((-1));
        functionNode4.setFunctionIsGetter();
        scope3.addChildToFront((com.google.javascript.rhino.head.Node) functionNode4);
        functionNode1.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode4);
        int int14 = functionNode1.getRegexpCount();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((-674310615), (com.google.javascript.rhino.head.Node) functionNode1);
        com.google.javascript.rhino.head.ast.Jump jump20 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump20.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump24 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump20, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int27 = scriptNode26.getEndLineno();
        int int28 = scriptNode26.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList29 = scriptNode26.getChildScopes();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump20, (com.google.javascript.rhino.head.Node) scriptNode26);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList31 = scriptNode26.getFunctions();
        int int32 = scriptNode26.getPosition();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList33 = scriptNode26.getChildScopes();
        java.lang.String str34 = scriptNode26.toSource();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode37 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = functionNode37.getTop();
        java.lang.String str39 = scriptNode38.getJsDoc();
        com.google.javascript.rhino.head.Node node41 = scriptNode38.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode42 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int43 = functionNode42.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str46 = functionNode42.toStringTree(scriptNode45);
        com.google.javascript.rhino.head.ast.Scope scope48 = scriptNode45.getDefiningScope("");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int51 = scriptNode50.getEndLineno();
        int int52 = scriptNode50.getBaseLineno();
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node(25, node41, (com.google.javascript.rhino.head.Node) scriptNode45, (com.google.javascript.rhino.head.Node) scriptNode50);
        boolean boolean54 = scriptNode50.hasConsistentReturnUsage();
        java.lang.String str55 = scriptNode50.getNextTempName();
        java.lang.String str56 = scriptNode50.shortName();
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node((-522402608), (com.google.javascript.rhino.head.Node) scriptNode50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode1.replaceChild((com.google.javascript.rhino.head.Node) scriptNode26, (com.google.javascript.rhino.head.Node) scriptNode50);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(13);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode2.getTop();
        functionNode2.setParens((int) (byte) 1, (int) (short) 1);
        functionNode1.addChildScope((com.google.javascript.rhino.head.ast.Scope) functionNode2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = functionNode2.toSource((int) '#');
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode17 = functionNode1.getFunctionNode(3);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
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
        java.util.Spliterator<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeSpliterator17 = functionNodeList15.spliterator();
        functionNodeList15.clear();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int21 = functionNode20.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = functionNode20.getTop();
        boolean boolean23 = functionNode20.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList24 = functionNode20.getSymbols();
        functionNode20.setRp(5);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode27 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int28 = functionNode27.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str31 = functionNode27.toStringTree(scriptNode30);
        int int32 = scriptNode30.getRegexpCount();
        com.google.javascript.rhino.head.Node node33 = scriptNode30.getLastSibling();
        com.google.javascript.rhino.head.Node node34 = node33.getNext();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(2, (com.google.javascript.rhino.head.Node) functionNode20, node33);
        boolean boolean36 = functionNodeList15.equals((java.lang.Object) functionNode20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode38 = functionNode20.getFunctionNode((-1701742065));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setEncodedSource("");
        functionNode0.flattenSymbolTable(false);
        int int6 = functionNode0.getRp();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope9 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = functionNode10.getTop();
        functionNode10.setParens((int) (byte) 1, (int) (short) 1);
        functionNode10.setEncodedSourceStart((-1));
        functionNode10.setFunctionIsGetter();
        scope9.addChildToFront((com.google.javascript.rhino.head.Node) functionNode10);
        functionNode7.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode10);
        functionNode7.setFunctionIsSetter();
        boolean boolean21 = functionNode7.isExpressionClosure();
        functionNode7.putIntProp(7, (int) (byte) 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int26 = functionNode25.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str29 = functionNode25.toStringTree(scriptNode28);
        int int30 = scriptNode28.getRegexpCount();
        java.lang.Object obj31 = scriptNode28.getCompilerData();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList32 = scriptNode28.getStatements();
        functionNode7.setTop(scriptNode28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node34 = functionNode0.getChildBefore((com.google.javascript.rhino.head.Node) functionNode7);
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
        functionNode0.setRp(5);
        functionNode0.setParens((int) '#', 24);
        functionNode0.setFunctionIsSetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = functionNode0.getRegexpString((int) (short) 1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = functionNode0.getSymbols();
        functionNode0.setRp(5);
        com.google.javascript.rhino.head.ast.Scope scope7 = functionNode0.getEnclosingScope();
        int int8 = functionNode0.getRp();
        java.util.List<com.google.javascript.rhino.head.Node> nodeList9 = functionNode0.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope12 = new com.google.javascript.rhino.head.ast.Scope(100, 13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode0.removeChild((com.google.javascript.rhino.head.Node) scope12);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        int int1 = scriptNode0.getEncodedSourceEnd();
        int int2 = scriptNode0.getFunctionCount();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString(7, "                                            {\n                                            }\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node6 = scriptNode0.getChildBefore(node5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) 26);
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node((-1147087024));
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int6 = functionNode5.getLp();
        functionNode5.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int10 = functionNode9.getLp();
        functionNode9.setEncodedSource("");
        functionNode9.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode15 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int16 = functionNode15.getLp();
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode5, (com.google.javascript.rhino.head.Node) functionNode9, (com.google.javascript.rhino.head.Node) functionNode15, (int) '#');
        com.google.javascript.rhino.head.ast.Jump jump21 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int24 = scriptNode23.getEndLineno();
        int int25 = scriptNode23.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList26 = scriptNode23.getChildScopes();
        jump21.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode23);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor28 = scriptNode23.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int30 = functionNode29.getLp();
        functionNode29.setEncodedSource("");
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode23, (com.google.javascript.rhino.head.ast.Scope) functionNode29);
        com.google.javascript.rhino.head.ast.Jump jump38 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump38.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump42 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump38, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int45 = scriptNode44.getEndLineno();
        int int46 = scriptNode44.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList47 = scriptNode44.getChildScopes();
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump38, (com.google.javascript.rhino.head.Node) scriptNode44);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList49 = scriptNode44.getFunctions();
        functionNodeList49.clear();
        int int52 = functionNodeList49.lastIndexOf((java.lang.Object) (-1L));
        com.google.javascript.rhino.head.ast.Jump jump57 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump57.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump61 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump57, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int64 = scriptNode63.getEndLineno();
        int int65 = scriptNode63.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList66 = scriptNode63.getChildScopes();
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump57, (com.google.javascript.rhino.head.Node) scriptNode63);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList68 = scriptNode63.getFunctions();
        functionNodeList68.clear();
        int int71 = functionNodeList68.lastIndexOf((java.lang.Object) (-1L));
        boolean boolean72 = functionNodeList49.removeAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList68);
        com.google.javascript.rhino.head.ast.Jump jump77 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump77.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump81 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump77, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode83 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int84 = scriptNode83.getEndLineno();
        int int85 = scriptNode83.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList86 = scriptNode83.getChildScopes();
        com.google.javascript.rhino.head.Node node87 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump77, (com.google.javascript.rhino.head.Node) scriptNode83);
        com.google.javascript.rhino.head.Node node89 = scriptNode83.setType(0);
        int int90 = functionNodeList68.lastIndexOf((java.lang.Object) scriptNode83);
        functionNode15.addChildAfter((com.google.javascript.rhino.head.Node) functionNode29, (com.google.javascript.rhino.head.Node) scriptNode83);
        java.lang.String str92 = functionNode15.getNextTempName();
        boolean boolean93 = functionNode15.hasSideEffects();
        int int94 = functionNode15.getFunctionType();
        functionNode15.setLength(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.addChildBefore(node3, (com.google.javascript.rhino.head.Node) functionNode15);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((-22), "161");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int4 = functionNode3.getLp();
        functionNode3.setEncodedSource("");
        functionNode3.flattenSymbolTable(false);
        boolean boolean9 = functionNode3.requiresActivation();
        java.lang.String str10 = functionNode3.getEncodedSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild((com.google.javascript.rhino.head.Node) functionNode3);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
        java.util.ListIterator<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeItor59 = functionNodeList35.listIterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode61 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int62 = scriptNode61.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode64 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int65 = scriptNode64.getEndLineno();
        scriptNode61.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode64);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode67 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int68 = functionNode67.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode69 = functionNode67.getTop();
        boolean boolean70 = functionNode67.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode72 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int73 = scriptNode72.getEndLineno();
        int int74 = scriptNode72.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump77 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode79 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int80 = scriptNode79.getEndLineno();
        int int81 = scriptNode79.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList82 = scriptNode79.getChildScopes();
        jump77.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode79);
        java.lang.String str84 = scriptNode79.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode72, (com.google.javascript.rhino.head.ast.Scope) scriptNode79);
        com.google.javascript.rhino.head.ast.Scope scope86 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode79.target = scope86;
        functionNode67.addChildScope(scope86);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode64, (com.google.javascript.rhino.head.ast.Scope) functionNode67);
        boolean boolean90 = functionNodeList35.contains((java.lang.Object) scriptNode64);
        com.google.javascript.rhino.head.ast.Scope scope91 = scriptNode64.getEnclosingScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str93 = scriptNode64.getRegexpString(5);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        functionNode1.setLp((-346319059));
        int int38 = functionNode1.getIntProp((-522402608), (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str40 = functionNode1.toSource((int) '4');
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
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
        functionNode75.setEncodedSourceBounds(987694010, (-22));
        java.lang.String str94 = functionNode75.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str96 = functionNode75.toSource(6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str4 = functionNode0.toStringTree(scriptNode3);
        java.lang.String str5 = functionNode0.shortName();
        boolean boolean6 = functionNode0.isGetter();
        functionNode0.setFunctionType((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = functionNode0.toSource(1);
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
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator11 = scope1.new NodeIterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int13 = functionNode12.getLp();
        functionNode12.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = functionNode19.getTop();
        functionNode19.setParens((int) (byte) 1, (int) (short) 1);
        functionNode19.setEncodedSourceStart((-1));
        functionNode19.setFunctionIsGetter();
        scope18.addChildToFront((com.google.javascript.rhino.head.Node) functionNode19);
        functionNode16.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode19);
        int int29 = functionNode12.addFunction(functionNode16);
        com.google.javascript.rhino.head.ast.Symbol symbol31 = functionNode12.getSymbol("-1\tBLOCK -1 1\n");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int34 = scriptNode33.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol36 = scriptNode33.getSymbol("hi!");
        scriptNode33.putIntProp(3, 0);
        functionNode12.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode33);
        int int41 = scope1.compareTo((com.google.javascript.rhino.head.ast.AstNode) scriptNode33);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList42 = scriptNode33.getFunctions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str44 = scriptNode33.getRegexpString(1179271826);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        boolean boolean23 = functionNode13.isGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = functionNode13.getRegexpFlags((-811062427));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
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
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList20 = scriptNode17.getChildScopes();
        functionNode1.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        functionNode1.setEncodedSourceEnd((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = functionNode1.toSource(35);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        functionNode0.setEncodedSourceStart((-1));
        boolean boolean7 = functionNode0.isGetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int9 = functionNode8.getLp();
        functionNode8.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode15 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = functionNode15.getTop();
        functionNode15.setParens((int) (byte) 1, (int) (short) 1);
        functionNode15.setEncodedSourceStart((-1));
        functionNode15.setFunctionIsGetter();
        scope14.addChildToFront((com.google.javascript.rhino.head.Node) functionNode15);
        functionNode12.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode15);
        int int25 = functionNode8.addFunction(functionNode12);
        java.lang.Object obj26 = functionNode12.getCompilerData();
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
        int int57 = functionNode34.getFunctionCount();
        int int58 = functionNode34.getLineno();
        int int59 = functionNode34.getAbsolutePosition();
        java.lang.String str60 = functionNode12.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode34);
        java.lang.String str61 = functionNode12.getEncodedSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode0.removeChild((com.google.javascript.rhino.head.Node) functionNode12);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int3 = functionNode2.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode2.getTop();
        boolean boolean5 = functionNode2.hasSideEffects();
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
        com.google.javascript.rhino.head.ast.Scope scope21 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode14.target = scope21;
        functionNode2.addChildScope(scope21);
        boolean boolean24 = functionNode2.hasConsistentReturnUsage();
        java.lang.String str25 = functionNode2.getNextTempName();
        com.google.javascript.rhino.head.ast.Jump jump26 = new com.google.javascript.rhino.head.ast.Jump((int) (short) -1, (com.google.javascript.rhino.head.Node) functionNode2);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int29 = scriptNode28.getEndLineno();
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node(5, (com.google.javascript.rhino.head.Node) functionNode2, (com.google.javascript.rhino.head.Node) scriptNode28, 18);
        com.google.javascript.rhino.head.ast.Scope scope32 = functionNode2.getEnclosingScope();
        java.lang.Object obj33 = functionNode2.getCompilerData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str35 = functionNode2.toSource((-1));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.google.javascript.rhino.head.ast.Jump jump5 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump5.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump9 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump5, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int12 = scriptNode11.getEndLineno();
        int int13 = scriptNode11.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList14 = scriptNode11.getChildScopes();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump5, (com.google.javascript.rhino.head.Node) scriptNode11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int18 = scriptNode17.getEndLineno();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral20 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str22 = regExpLiteral20.toSource((int) (byte) 10);
        regExpLiteral20.setFlags("-1\tSCRIPT -1 1\n");
        regExpLiteral20.removeProp(8);
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(10, node15, (com.google.javascript.rhino.head.Node) scriptNode17, (com.google.javascript.rhino.head.Node) regExpLiteral20, 3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode30 = scriptNode17.getFunctionNode(0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        functionNode0.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList7 = functionNode0.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope9 = functionNode0.getDefiningScope("hi!");
        boolean boolean10 = functionNode0.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol15 = scriptNode12.getSymbol("hi!");
        scriptNode12.putIntProp(3, 0);
        functionNode0.addResumptionPoint((com.google.javascript.rhino.head.Node) scriptNode12);
        functionNode0.setIsGenerator();
        int int21 = functionNode0.getEncodedSourceStart();
        functionNode0.removeProp((int) (short) 100);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int25 = functionNode24.getLp();
        functionNode24.setLp((int) (short) 1);
        int int30 = functionNode24.getIntProp(4, 26);
        boolean boolean31 = functionNode24.hasChildren();
        java.lang.String str32 = functionNode24.getNextTempName();
        functionNode0.replaceWith((com.google.javascript.rhino.head.ast.Scope) functionNode24);
        functionNode24.setLp((-22));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = functionNode24.getRegexpString(15);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
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
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int26 = functionNode25.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = functionNode25.getTop();
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode25);
        functionNode0.target = node28;
        com.google.javascript.rhino.head.Node node30 = node28.getFirstChild();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode31 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = functionNode31.getTop();
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = functionNode31.getAstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode34 = functionNode31.getMemberExprNode();
        functionNode31.setFunctionIsGetter();
        node30.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str38 = functionNode31.getRegexpFlags(514758316);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode2.getTop();
        functionNode2.setParens((int) (byte) 1, (int) (short) 1);
        functionNode2.setEncodedSourceStart((-1));
        functionNode2.setFunctionIsGetter();
        scope1.addChildToFront((com.google.javascript.rhino.head.Node) functionNode2);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator11 = scope1.new NodeIterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int13 = functionNode12.getLp();
        functionNode12.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = functionNode19.getTop();
        functionNode19.setParens((int) (byte) 1, (int) (short) 1);
        functionNode19.setEncodedSourceStart((-1));
        functionNode19.setFunctionIsGetter();
        scope18.addChildToFront((com.google.javascript.rhino.head.Node) functionNode19);
        functionNode16.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode19);
        int int29 = functionNode12.addFunction(functionNode16);
        com.google.javascript.rhino.head.ast.Symbol symbol31 = functionNode12.getSymbol("-1\tBLOCK -1 1\n");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int34 = scriptNode33.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol36 = scriptNode33.getSymbol("hi!");
        scriptNode33.putIntProp(3, 0);
        functionNode12.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode33);
        int int41 = scope1.compareTo((com.google.javascript.rhino.head.ast.AstNode) scriptNode33);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList42 = scriptNode33.getFunctions();
        int int43 = functionNodeList42.size();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode44 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = functionNode44.getTop();
        functionNode44.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode49 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope51 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode52 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = functionNode52.getTop();
        functionNode52.setParens((int) (byte) 1, (int) (short) 1);
        functionNode52.setEncodedSourceStart((-1));
        functionNode52.setFunctionIsGetter();
        scope51.addChildToFront((com.google.javascript.rhino.head.Node) functionNode52);
        functionNode49.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode52);
        functionNode49.setFunctionIsSetter();
        int int63 = functionNode44.addFunction(functionNode49);
        java.lang.String str64 = functionNode44.getNextTempName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode66 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int67 = functionNode66.getBaseLineno();
        functionNode66.setSourceName("                                                                                                                                                                                                        /null/");
        functionNode66.setRequiresActivation();
        functionNode44.addChild((com.google.javascript.rhino.head.ast.AstNode) functionNode66);
        functionNode66.setEncodedSourceEnd((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode74 = functionNode66.getTop();
        boolean boolean75 = functionNodeList42.remove((java.lang.Object) functionNode66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str77 = functionNode66.getRegexpString(670868847);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        functionNode0.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode3);
        com.google.javascript.rhino.head.ast.AstRoot astRoot13 = functionNode3.getAstRoot();
        functionNode3.setIsExpressionClosure(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = functionNode16.getTop();
        functionNode16.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor21 = functionNode16.iterator();
        functionNode16.setFunctionIsSetter();
        int int23 = functionNode3.addFunction(functionNode16);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int25 = functionNode24.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str28 = functionNode24.toStringTree(scriptNode27);
        functionNode24.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode30 = functionNode24.getBody();
        functionNode24.setParens(21, (int) '#');
        int int34 = functionNode24.getLp();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode35 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int36 = functionNode35.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str39 = functionNode35.toStringTree(scriptNode38);
        functionNode24.setBody((com.google.javascript.rhino.head.ast.AstNode) scriptNode38);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList41 = scriptNode38.getChildScopes();
        functionNode16.setTop(scriptNode38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode44 = scriptNode38.getFunctionNode(88879802);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
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
        int int31 = functionNode2.getEndLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = functionNode2.debugPrint();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = functionNode4.getTop();
        functionNode4.setParens((int) (byte) 1, (int) (short) 1);
        functionNode4.setEncodedSourceStart((-1));
        functionNode4.setFunctionIsGetter();
        scope3.addChildToFront((com.google.javascript.rhino.head.Node) functionNode4);
        functionNode1.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode4);
        com.google.javascript.rhino.head.ast.AstRoot astRoot14 = functionNode4.getAstRoot();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node(2, (com.google.javascript.rhino.head.Node) functionNode4);
        java.lang.String str16 = functionNode4.getNextTempName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = functionNode4.debugPrint();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str1 = symbol0.getName();
        com.google.javascript.rhino.head.Node node2 = symbol0.getNode();
        symbol0.setIndex(1);
        int int5 = symbol0.getDeclType();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = functionNode6.getTop();
        functionNode6.setParens((int) (byte) 1, (int) (short) 1);
        functionNode6.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList13 = functionNode6.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope15 = functionNode6.getDefiningScope("hi!");
        boolean boolean16 = functionNode6.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode17 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int18 = functionNode17.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = functionNode17.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode20 = functionNode17.getBody();
        int int21 = functionNode17.getLength();
        com.google.javascript.rhino.head.ast.Jump jump24 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int27 = scriptNode26.getEndLineno();
        int int28 = scriptNode26.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList29 = scriptNode26.getChildScopes();
        jump24.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode26);
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
        jump24.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode32);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList47 = functionNode32.getStatements();
        functionNode17.setParams(astNodeList47);
        functionNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) functionNode17);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor50 = functionNode6.iterator();
        functionNode6.setIsGenerator();
        java.lang.String str52 = functionNode6.getNextTempName();
        symbol0.setNode((com.google.javascript.rhino.head.Node) functionNode6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str54 = functionNode6.debugPrint();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = functionNode0.getSymbols();
        functionNode0.setRp(5);
        com.google.javascript.rhino.head.ast.Scope scope7 = functionNode0.getEnclosingScope();
        functionNode0.setLineno(5);
        functionNode0.setIsExpressionClosure(false);
        functionNode0.setFunctionType(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = functionNode0.toSource((int) (byte) 10);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int32 = scriptNode31.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int35 = scriptNode34.getEndLineno();
        scriptNode31.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode34);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode37 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int38 = functionNode37.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = functionNode37.getTop();
        boolean boolean40 = functionNode37.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int43 = scriptNode42.getEndLineno();
        int int44 = scriptNode42.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump47 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int50 = scriptNode49.getEndLineno();
        int int51 = scriptNode49.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList52 = scriptNode49.getChildScopes();
        jump47.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode49);
        java.lang.String str54 = scriptNode49.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode42, (com.google.javascript.rhino.head.ast.Scope) scriptNode49);
        com.google.javascript.rhino.head.ast.Scope scope56 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode49.target = scope56;
        functionNode37.addChildScope(scope56);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode34, (com.google.javascript.rhino.head.ast.Scope) functionNode37);
        int int60 = functionNode1.addFunction(functionNode37);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList61 = functionNode1.getSymbols();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode63 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int64 = functionNode63.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode65 = functionNode63.getTop();
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode63);
        int int67 = functionNode1.addFunction(functionNode63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str68 = functionNode1.toSource();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
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
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap24 = functionNode1.getLiveLocals();
        functionNode1.setParens(0, 22);
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
        com.google.javascript.rhino.head.ast.FunctionNode functionNode46 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = functionNode46.getTop();
        functionNode46.setParens((int) (byte) 1, (int) (short) 1);
        int int51 = functionNode46.getRp();
        com.google.javascript.rhino.head.Node node54 = com.google.javascript.rhino.head.Node.newString((int) (byte) 100, "");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode55 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int56 = functionNode55.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode58 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str59 = functionNode55.toStringTree(scriptNode58);
        com.google.javascript.rhino.head.ast.Scope scope61 = scriptNode58.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList62 = scriptNode58.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode64 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int65 = scriptNode64.getEndLineno();
        int int66 = scriptNode64.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode58, (com.google.javascript.rhino.head.ast.Scope) scriptNode64);
        java.lang.String str68 = scriptNode64.getEncodedSource();
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(136, (com.google.javascript.rhino.head.Node) functionNode46, node54, (com.google.javascript.rhino.head.Node) scriptNode64, (int) (short) 0);
        functionNode39.setParent((com.google.javascript.rhino.head.ast.AstNode) functionNode46);
        int int72 = functionNode39.getLineno();
        com.google.javascript.rhino.head.Node node73 = new com.google.javascript.rhino.head.Node(9, (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str75 = functionNode1.toSource((-811062427));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.google.javascript.rhino.head.ast.Jump jump3 = new com.google.javascript.rhino.head.ast.Jump(26, 24);
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump(6, (com.google.javascript.rhino.head.Node) jump3);
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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int34 = scriptNode33.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int37 = scriptNode36.getEndLineno();
        scriptNode33.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode36);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode39 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int40 = functionNode39.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = functionNode39.getTop();
        boolean boolean42 = functionNode39.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int45 = scriptNode44.getEndLineno();
        int int46 = scriptNode44.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump49 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int52 = scriptNode51.getEndLineno();
        int int53 = scriptNode51.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList54 = scriptNode51.getChildScopes();
        jump49.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode51);
        java.lang.String str56 = scriptNode51.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode44, (com.google.javascript.rhino.head.ast.Scope) scriptNode51);
        com.google.javascript.rhino.head.ast.Scope scope58 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode51.target = scope58;
        functionNode39.addChildScope(scope58);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode36, (com.google.javascript.rhino.head.ast.Scope) functionNode39);
        int int62 = functionNode39.getFunctionCount();
        com.google.javascript.rhino.head.ast.Jump jump64 = new com.google.javascript.rhino.head.ast.Jump(987694010, (com.google.javascript.rhino.head.Node) functionNode39, (-522402608));
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList65 = functionNode39.getChildScopes();
        boolean boolean66 = functionNode39.isGetterOrSetter();
        functionNode15.setParentScope((com.google.javascript.rhino.head.ast.Scope) functionNode39);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode69 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int70 = scriptNode69.getEndLineno();
        int int71 = scriptNode69.getBaseLineno();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode72 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int73 = functionNode72.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode75 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str76 = functionNode72.toStringTree(scriptNode75);
        functionNode72.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode78 = functionNode72.getBody();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList79 = functionNode72.getParams();
        scriptNode69.replaceWith((com.google.javascript.rhino.head.ast.Scope) functionNode72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        jump4.replaceChildAfter((com.google.javascript.rhino.head.Node) functionNode39, (com.google.javascript.rhino.head.Node) scriptNode69);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(25);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int3 = functionNode2.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode2.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode5 = functionNode2.getBody();
        int int6 = functionNode2.getLength();
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
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList32 = functionNode17.getStatements();
        functionNode2.setParams(astNodeList32);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode34 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int35 = functionNode34.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = functionNode34.getTop();
        com.google.javascript.rhino.head.Node node37 = functionNode34.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList38 = functionNode34.getParams();
        functionNode2.setParams(astNodeList38);
        boolean boolean40 = functionNode2.isGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode1.removeChild((com.google.javascript.rhino.head.Node) functionNode2);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
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
        com.google.javascript.rhino.head.ast.Jump jump19 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump19.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump23 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump19, 0);
        com.google.javascript.rhino.head.ast.Jump jump27 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump27.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump31 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump27, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode32 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int33 = functionNode32.getLp();
        functionNode32.setEncodedSource("");
        functionNode32.flattenSymbolTable(false);
        jump19.addChildAfter((com.google.javascript.rhino.head.Node) jump27, (com.google.javascript.rhino.head.Node) functionNode32);
        functionNode5.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) functionNode32);
        com.google.javascript.rhino.head.ast.Scope scope40 = functionNode5.getEnclosingScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = functionNode5.toSource(22);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLength(19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = functionNode0.toSource();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = functionNode5.toSource(11);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode2.getTop();
        functionNode2.setParens((int) (byte) 1, (int) (short) 1);
        functionNode2.setEncodedSourceStart((-1));
        functionNode2.setFunctionIsGetter();
        scope1.addChildToFront((com.google.javascript.rhino.head.Node) functionNode2);
        functionNode2.setRp(19);
        java.util.List<com.google.javascript.rhino.head.Node> nodeList13 = functionNode2.getResumptionPoints();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap14 = functionNode2.getSymbolTable();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = functionNode19.getTop();
        functionNode19.setParens((int) (byte) 1, (int) (short) 1);
        functionNode19.setEncodedSourceStart((-1));
        functionNode19.setFunctionIsGetter();
        scope18.addChildToFront((com.google.javascript.rhino.head.Node) functionNode19);
        functionNode16.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode19);
        com.google.javascript.rhino.head.ast.Jump jump30 = new com.google.javascript.rhino.head.ast.Jump(2, (com.google.javascript.rhino.head.Node) functionNode19, (int) (byte) 100);
        java.lang.String str31 = functionNode2.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode19);
        functionNode19.setEncodedSourceEnd(1);
        functionNode19.flattenSymbolTable(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = functionNode19.toSource(4);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        functionNode0.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode3);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode15 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = functionNode15.getTop();
        java.lang.String str17 = scriptNode16.getJsDoc();
        com.google.javascript.rhino.head.Node node19 = scriptNode16.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int21 = functionNode20.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str24 = functionNode20.toStringTree(scriptNode23);
        com.google.javascript.rhino.head.ast.Scope scope26 = scriptNode23.getDefiningScope("");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int29 = scriptNode28.getEndLineno();
        int int30 = scriptNode28.getBaseLineno();
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node(25, node19, (com.google.javascript.rhino.head.Node) scriptNode23, (com.google.javascript.rhino.head.Node) scriptNode28);
        boolean boolean32 = scriptNode28.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(18, (com.google.javascript.rhino.head.Node) scriptNode28, 17);
        com.google.javascript.rhino.head.Node node35 = node34.getFirstChild();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode37 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = functionNode37.getTop();
        java.lang.String str39 = scriptNode38.getJsDoc();
        com.google.javascript.rhino.head.Node node41 = scriptNode38.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode42 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int43 = functionNode42.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str46 = functionNode42.toStringTree(scriptNode45);
        com.google.javascript.rhino.head.ast.Scope scope48 = scriptNode45.getDefiningScope("");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int51 = scriptNode50.getEndLineno();
        int int52 = scriptNode50.getBaseLineno();
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node(25, node41, (com.google.javascript.rhino.head.Node) scriptNode45, (com.google.javascript.rhino.head.Node) scriptNode50);
        boolean boolean54 = scriptNode50.hasConsistentReturnUsage();
        java.lang.String str55 = scriptNode50.getNextTempName();
        java.lang.String str56 = scriptNode50.shortName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode57 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int58 = functionNode57.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = functionNode57.getTop();
        boolean boolean60 = functionNode57.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList61 = functionNode57.getSymbols();
        scriptNode50.setSymbols(symbolList61);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList63 = scriptNode50.getStatements();
        functionNode3.addChildAfter(node35, (com.google.javascript.rhino.head.Node) scriptNode50);
        scriptNode50.setRelative((-522402608));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode68 = scriptNode50.getFunctionNode(19);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
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
        com.google.javascript.rhino.head.Node node23 = functionNode0.getNext();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList24 = functionNode0.getChildScopes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = functionNode0.getFunctionNode(109);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
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
        com.google.javascript.rhino.head.Token.CommentType commentType20 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment22 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType20, "109");
        java.lang.String str24 = comment22.toSource(19);
        java.lang.String str25 = comment22.getValue();
        java.lang.String str26 = comment22.getValue();
        com.google.javascript.rhino.head.Token.CommentType commentType27 = com.google.javascript.rhino.head.Token.CommentType.LINE;
        comment22.setCommentType(commentType27);
        com.google.javascript.rhino.head.ast.Comment comment30 = new com.google.javascript.rhino.head.ast.Comment((int) (short) 100, 16, commentType27, "Scope");
        functionNode1.setJsDocNode(comment30);
        com.google.javascript.rhino.head.ast.Scope scope34 = new com.google.javascript.rhino.head.ast.Scope(6, 4);
        java.lang.String str36 = scope34.toSource((int) (byte) 1);
        int int37 = scope34.getLength();
        int int38 = scope34.depth();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList39 = scope34.getChildScopes();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode40 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int41 = functionNode40.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = functionNode40.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode43 = functionNode40.getBody();
        com.google.javascript.rhino.head.ast.Scope scope44 = functionNode40.getParentScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode1.replaceChildAfter((com.google.javascript.rhino.head.Node) scope34, (com.google.javascript.rhino.head.Node) functionNode40);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
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
        com.google.javascript.rhino.head.ast.Scope scope25 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = functionNode26.getTop();
        functionNode26.setParens((int) (byte) 1, (int) (short) 1);
        functionNode26.setEncodedSourceStart((-1));
        functionNode26.setFunctionIsGetter();
        scope25.addChildToFront((com.google.javascript.rhino.head.Node) functionNode26);
        functionNode26.setRp(19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int39 = scriptNode38.getEndLineno();
        int int40 = scriptNode38.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump43 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int46 = scriptNode45.getEndLineno();
        int int47 = scriptNode45.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList48 = scriptNode45.getChildScopes();
        jump43.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode45);
        java.lang.String str50 = scriptNode45.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode38, (com.google.javascript.rhino.head.ast.Scope) scriptNode45);
        com.google.javascript.rhino.head.ast.Scope scope52 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode45.target = scope52;
        java.lang.String str54 = functionNode26.toStringTree(scriptNode45);
        java.lang.String str56 = scriptNode45.toSource((int) (short) 10);
        boolean boolean57 = functionNode13.isParam((com.google.javascript.rhino.head.ast.AstNode) scriptNode45);
        int int58 = functionNode13.depth();
        functionNode13.setIsGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode61 = functionNode13.getFunctionNode((int) (short) 10);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setIsExpressionClosure(false);
        com.google.javascript.rhino.head.ast.Scope scope4 = functionNode0.getParentScope();
        int int5 = functionNode0.getFunctionType();
        functionNode0.removeChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = functionNode0.getRegexpFlags(25);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.google.javascript.rhino.head.ast.Scope scope0 = new com.google.javascript.rhino.head.ast.Scope();
        scope0.setBounds(0, 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = functionNode4.getTop();
        int int6 = functionNode4.getRegexpCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = functionNode4.getEnclosingFunction();
        java.lang.String str8 = scope0.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode4);
        functionNode4.setEncodedSourceBounds(2, 32);
        int int12 = functionNode4.getFunctionCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = functionNode4.toSource((-316661518));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
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
        com.google.javascript.rhino.head.Token.CommentType commentType33 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment35 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType33, "109");
        com.google.javascript.rhino.head.ast.Comment comment37 = new com.google.javascript.rhino.head.ast.Comment(136, 15, commentType33, "-1\tSCRIPT -1 1\n");
        com.google.javascript.rhino.head.Token.CommentType commentType38 = com.google.javascript.rhino.head.Token.CommentType.JSDOC;
        comment37.setCommentType(commentType38);
        com.google.javascript.rhino.head.Token.CommentType commentType40 = com.google.javascript.rhino.head.Token.CommentType.JSDOC;
        comment37.setCommentType(commentType40);
        com.google.javascript.rhino.head.ast.Comment comment43 = new com.google.javascript.rhino.head.ast.Comment((-453175559), (-522402608), commentType40, "                                                                      /null/-1\tSCRIPT -1 1\n");
        functionNode21.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) comment43);
        com.google.javascript.rhino.head.ast.AstRoot astRoot45 = functionNode21.getAstRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = functionNode21.toSource();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
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
        java.util.List<com.google.javascript.rhino.head.Node> nodeList27 = functionNode21.getResumptionPoints();
        boolean boolean28 = functionNode21.isSetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode30 = functionNode21.getFunctionNode((-526076546));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int3 = functionNode2.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode2.getTop();
        boolean boolean5 = functionNode2.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList6 = functionNode2.getSymbols();
        functionNode2.setRp(5);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int10 = functionNode9.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str13 = functionNode9.toStringTree(scriptNode12);
        int int14 = scriptNode12.getRegexpCount();
        com.google.javascript.rhino.head.Node node15 = scriptNode12.getLastSibling();
        com.google.javascript.rhino.head.Node node16 = node15.getNext();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node(2, (com.google.javascript.rhino.head.Node) functionNode2, node15);
        int int18 = functionNode2.getLp();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node(24, (com.google.javascript.rhino.head.Node) functionNode2);
        java.lang.String str20 = functionNode2.getNextTempName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = functionNode2.toSource((int) '#');
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
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
        boolean boolean88 = functionNode11.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str90 = functionNode11.getRegexpString(12);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
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
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator22 = astNodeComparator21.reversed();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator23 = positionComparator1.thenComparing(astNodeComparator21);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator24 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator25 = positionComparator0.reversed();
        com.google.javascript.rhino.head.Token.CommentType commentType32 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment34 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType32, "109");
        com.google.javascript.rhino.head.ast.Comment comment36 = new com.google.javascript.rhino.head.ast.Comment(136, 15, commentType32, "-1\tSCRIPT -1 1\n");
        com.google.javascript.rhino.head.Token.CommentType commentType37 = com.google.javascript.rhino.head.Token.CommentType.JSDOC;
        comment36.setCommentType(commentType37);
        com.google.javascript.rhino.head.Token.CommentType commentType39 = com.google.javascript.rhino.head.Token.CommentType.JSDOC;
        comment36.setCommentType(commentType39);
        com.google.javascript.rhino.head.ast.Comment comment42 = new com.google.javascript.rhino.head.ast.Comment((-453175559), (-522402608), commentType39, "                                                                      /null/-1\tSCRIPT -1 1\n");
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
        boolean boolean65 = functionNode43.hasConsistentReturnUsage();
        boolean boolean66 = functionNode43.hasSideEffects();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap67 = functionNode43.getSymbolTable();
        int int68 = positionComparator0.compare((com.google.javascript.rhino.head.ast.AstNode) comment42, (com.google.javascript.rhino.head.ast.AstNode) functionNode43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode70 = functionNode43.getFunctionNode(668794709);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int31 = scriptNode30.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int34 = scriptNode33.getEndLineno();
        scriptNode30.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode33);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode36 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int37 = functionNode36.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = functionNode36.getTop();
        boolean boolean39 = functionNode36.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int42 = scriptNode41.getEndLineno();
        int int43 = scriptNode41.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump46 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int49 = scriptNode48.getEndLineno();
        int int50 = scriptNode48.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList51 = scriptNode48.getChildScopes();
        jump46.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode48);
        java.lang.String str53 = scriptNode48.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode41, (com.google.javascript.rhino.head.ast.Scope) scriptNode48);
        com.google.javascript.rhino.head.ast.Scope scope55 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode48.target = scope55;
        functionNode36.addChildScope(scope55);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode33, (com.google.javascript.rhino.head.ast.Scope) functionNode36);
        int int59 = functionNode36.getFunctionCount();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) functionNode0, (com.google.javascript.rhino.head.ast.Scope) functionNode36);
        java.lang.String str61 = functionNode36.toString();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList62 = functionNode36.getSymbols();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode64 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope66 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode67 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode68 = functionNode67.getTop();
        functionNode67.setParens((int) (byte) 1, (int) (short) 1);
        functionNode67.setEncodedSourceStart((-1));
        functionNode67.setFunctionIsGetter();
        scope66.addChildToFront((com.google.javascript.rhino.head.Node) functionNode67);
        functionNode64.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode67);
        functionNode64.setFunctionIsSetter();
        boolean boolean78 = functionNode64.isExpressionClosure();
        functionNode64.putIntProp(7, (int) (byte) 0);
        com.google.javascript.rhino.head.ast.Jump jump82 = new com.google.javascript.rhino.head.ast.Jump(4, (com.google.javascript.rhino.head.Node) functionNode64);
        functionNode64.setRequiresActivation();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode84 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int85 = functionNode84.getLp();
        functionNode84.setEncodedSource("");
        com.google.javascript.rhino.head.Node node88 = functionNode84.getLastChild();
        boolean boolean89 = functionNode84.isSetter();
        functionNode64.target = functionNode84;
        boolean boolean91 = functionNode84.isGenerator();
        functionNode36.addParam((com.google.javascript.rhino.head.ast.AstNode) functionNode84);
        java.lang.String str93 = functionNode36.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str95 = functionNode36.getRegexpFlags((int) (short) 10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        functionNode1.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode1);
        functionNode1.setRequiresActivation();
        java.lang.String str8 = functionNode1.shortName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = functionNode9.getTop();
        functionNode9.setParens((int) (byte) 1, (int) (short) 1);
        int int14 = functionNode9.getRp();
        int int15 = functionNode9.getAbsolutePosition();
        com.google.javascript.rhino.head.ast.AstNode astNode16 = functionNode9.getMemberExprNode();
        int int17 = functionNode9.getBaseLineno();
        functionNode1.addResumptionPoint((com.google.javascript.rhino.head.Node) functionNode9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = functionNode1.toSource((-1701742065));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str4 = functionNode0.toStringTree(scriptNode3);
        functionNode0.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode6 = functionNode0.getBody();
        functionNode0.setParens(21, (int) '#');
        int int10 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.Scope scope12 = functionNode0.getDefiningScope("-1");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = functionNode0.getRegexpFlags(881445186);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
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
        com.google.javascript.rhino.head.ast.Jump jump22 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump22.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump26 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump22, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int29 = scriptNode28.getEndLineno();
        int int30 = scriptNode28.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList31 = scriptNode28.getChildScopes();
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump22, (com.google.javascript.rhino.head.Node) scriptNode28);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList33 = scriptNode28.getFunctions();
        functionNodeList33.clear();
        com.google.javascript.rhino.head.ast.Jump jump39 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump39.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump43 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump39, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int46 = scriptNode45.getEndLineno();
        int int47 = scriptNode45.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList48 = scriptNode45.getChildScopes();
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump39, (com.google.javascript.rhino.head.Node) scriptNode45);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList50 = scriptNode45.getFunctions();
        boolean boolean51 = functionNodeList33.removeAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList50);
        boolean boolean52 = functionNodeList15.addAll(0, (java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList33);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int55 = scriptNode54.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol57 = scriptNode54.getSymbol("hi!");
        java.lang.String str58 = scriptNode54.getEncodedSource();
        boolean boolean59 = functionNodeList33.remove((java.lang.Object) scriptNode54);
        int int60 = scriptNode54.getFunctionCount();
        com.google.javascript.rhino.head.Node node62 = com.google.javascript.rhino.head.Node.newNumber((double) 136);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node63 = scriptNode54.getChildBefore(node62);
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
        java.lang.String str20 = functionNode0.getNextTempName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int23 = scriptNode22.getEndLineno();
        int int24 = scriptNode22.getBaseLineno();
        scriptNode22.removeProp(0);
        scriptNode22.setEncodedSourceEnd(19);
        functionNode0.addParam((com.google.javascript.rhino.head.ast.AstNode) scriptNode22);
        int int30 = functionNode0.getFunctionCount();
        int int31 = functionNode0.getEncodedSourceEnd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = functionNode0.toSource();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.google.javascript.rhino.head.ast.Jump jump2 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        int int6 = scriptNode4.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList7 = scriptNode4.getChildScopes();
        jump2.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor9 = scriptNode4.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int11 = functionNode10.getLp();
        functionNode10.setEncodedSource("");
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode4, (com.google.javascript.rhino.head.ast.Scope) functionNode10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = functionNode19.getTop();
        functionNode19.setParens((int) (byte) 1, (int) (short) 1);
        functionNode19.setEncodedSourceStart((-1));
        functionNode19.setFunctionIsGetter();
        scope18.addChildToFront((com.google.javascript.rhino.head.Node) functionNode19);
        functionNode16.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode19);
        com.google.javascript.rhino.head.ast.AstRoot astRoot29 = functionNode19.getAstRoot();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node(2, (com.google.javascript.rhino.head.Node) functionNode19);
        java.lang.String str31 = functionNode19.getNextTempName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode33 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int34 = functionNode33.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = functionNode33.getTop();
        boolean boolean36 = functionNode33.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList37 = functionNode33.getSymbols();
        functionNode33.setRp(5);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode40 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int41 = functionNode40.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str44 = functionNode40.toStringTree(scriptNode43);
        int int45 = scriptNode43.getRegexpCount();
        com.google.javascript.rhino.head.Node node46 = scriptNode43.getLastSibling();
        com.google.javascript.rhino.head.Node node47 = node46.getNext();
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node(2, (com.google.javascript.rhino.head.Node) functionNode33, node46);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator49 = functionNode33.new NodeIterator();
        functionNode19.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode10.removeChild((com.google.javascript.rhino.head.Node) functionNode19);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
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
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator20 = astNodeComparator19.reversed();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator21 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.Jump jump26 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump26.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump30 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump26, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int33 = scriptNode32.getEndLineno();
        int int34 = scriptNode32.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList35 = scriptNode32.getChildScopes();
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump26, (com.google.javascript.rhino.head.Node) scriptNode32);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList37 = scriptNode32.getFunctions();
        int int38 = functionNodeList37.size();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator39 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        functionNodeList37.sort((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator39);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator41 = positionComparator39.reversed();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator42 = astNodeComparator41.reversed();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator43 = positionComparator21.thenComparing(astNodeComparator41);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator44 = astNodeComparator19.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator21);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode46 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int47 = functionNode46.getLp();
        functionNode46.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode50 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int51 = functionNode50.getLp();
        functionNode50.setEncodedSource("");
        functionNode50.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode56 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int57 = functionNode56.getLp();
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode46, (com.google.javascript.rhino.head.Node) functionNode50, (com.google.javascript.rhino.head.Node) functionNode56, (int) '#');
        boolean boolean60 = functionNode56.isGenerator();
        int int61 = functionNode56.getFunctionType();
        com.google.javascript.rhino.head.Node node62 = functionNode56.getNext();
        functionNode56.setFunctionIsSetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode64 = functionNode56.getTop();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode66 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int67 = functionNode66.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode68 = functionNode66.getTop();
        boolean boolean69 = functionNode66.hasSideEffects();
        java.lang.String str70 = functionNode66.toString();
        functionNode66.setParens((int) (short) 10, 8);
        com.google.javascript.rhino.head.ast.Jump jump75 = new com.google.javascript.rhino.head.ast.Jump(22, (com.google.javascript.rhino.head.Node) functionNode66, 12);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode77 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int78 = functionNode77.getLp();
        functionNode77.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode81 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int82 = functionNode81.getLp();
        functionNode81.setEncodedSource("");
        functionNode81.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode87 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int88 = functionNode87.getLp();
        com.google.javascript.rhino.head.Node node90 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode77, (com.google.javascript.rhino.head.Node) functionNode81, (com.google.javascript.rhino.head.Node) functionNode87, (int) '#');
        boolean boolean91 = functionNode87.isGenerator();
        int int92 = functionNode87.getFunctionType();
        com.google.javascript.rhino.head.Node node93 = functionNode87.getFirstChild();
        boolean boolean94 = functionNode87.isGetterOrSetter();
        functionNode87.flattenSymbolTable(false);
        functionNode66.addChildScope((com.google.javascript.rhino.head.ast.Scope) functionNode87);
        int int98 = positionComparator21.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode64, (com.google.javascript.rhino.head.ast.AstNode) functionNode87);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str99 = scriptNode64.debugPrint();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = functionNode3.toSource();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
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
        functionNode75.setEncodedSourceBounds(987694010, (-22));
        functionNode75.flattenSymbolTable(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str97 = functionNode75.toSource((-811062427));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
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
        com.google.javascript.rhino.head.Node node34 = functionNode3.target;
        functionNode3.setIsExpressionClosure(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str38 = functionNode3.getRegexpFlags(9);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int3 = functionNode2.getEncodedSourceStart();
        int int4 = functionNode2.getFunctionCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = functionNode5.getTop();
        functionNode5.setParens((int) (byte) 1, (int) (short) 1);
        int int10 = functionNode5.getRp();
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(17, (com.google.javascript.rhino.head.Node) functionNode2, (com.google.javascript.rhino.head.Node) functionNode5, (int) (short) 0);
        functionNode5.setParens(35, (-674310615));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = functionNode5.getRegexpFlags(9);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        com.google.javascript.rhino.head.Node node3 = functionNode0.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList4 = functionNode0.getParams();
        int int5 = functionNode0.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = functionNode0.getFunctionNode(13);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
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
        int int34 = functionNode11.getRp();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode35 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int36 = functionNode35.getLp();
        functionNode35.setLp((int) (short) 1);
        int int41 = functionNode35.getIntProp(4, 26);
        boolean boolean42 = functionNode35.hasChildren();
        functionNode11.addParam((com.google.javascript.rhino.head.ast.AstNode) functionNode35);
        functionNode11.removeProp((int) 'a');
        functionNode11.setRp(32);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode50 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int51 = functionNode50.getEncodedSourceStart();
        int int52 = functionNode50.getFunctionCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode53 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = functionNode53.getTop();
        functionNode53.setParens((int) (byte) 1, (int) (short) 1);
        int int58 = functionNode53.getRp();
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node(17, (com.google.javascript.rhino.head.Node) functionNode50, (com.google.javascript.rhino.head.Node) functionNode53, (int) (short) 0);
        com.google.javascript.rhino.head.ast.Symbol symbol62 = functionNode53.getSymbol("$0");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode63 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int64 = functionNode63.getLp();
        functionNode63.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode67 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope69 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode70 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode71 = functionNode70.getTop();
        functionNode70.setParens((int) (byte) 1, (int) (short) 1);
        functionNode70.setEncodedSourceStart((-1));
        functionNode70.setFunctionIsGetter();
        scope69.addChildToFront((com.google.javascript.rhino.head.Node) functionNode70);
        functionNode67.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode70);
        int int80 = functionNode63.addFunction(functionNode67);
        functionNode53.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode63);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList82 = functionNode63.getSymbols();
        functionNode11.setSymbols(symbolList82);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode84 = functionNode11.getTop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str86 = scriptNode84.getRegexpString(20);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(13);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode2.getTop();
        functionNode2.setParens((int) (byte) 1, (int) (short) 1);
        functionNode1.addChildScope((com.google.javascript.rhino.head.ast.Scope) functionNode2);
        java.lang.String str8 = functionNode1.getNextTempName();
        boolean boolean9 = functionNode1.isExpressionClosure();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = functionNode1.toSource(14);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str1 = symbol0.getName();
        com.google.javascript.rhino.head.Node node2 = symbol0.getNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList10 = functionNode3.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope12 = functionNode3.getDefiningScope("hi!");
        boolean boolean13 = functionNode3.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int16 = scriptNode15.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol18 = scriptNode15.getSymbol("hi!");
        scriptNode15.putIntProp(3, 0);
        functionNode3.addResumptionPoint((com.google.javascript.rhino.head.Node) scriptNode15);
        functionNode3.setIsGenerator();
        symbol0.setNode((com.google.javascript.rhino.head.Node) functionNode3);
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
        int int42 = scope40.getAbsolutePosition();
        int int43 = functionNode3.compareTo((com.google.javascript.rhino.head.ast.AstNode) scope40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str44 = functionNode3.debugPrint();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("EOF");
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator2 = node1.new NodeIterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList10 = functionNode3.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope12 = functionNode3.getDefiningScope("hi!");
        boolean boolean13 = functionNode3.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int16 = scriptNode15.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol18 = scriptNode15.getSymbol("hi!");
        scriptNode15.putIntProp(3, 0);
        functionNode3.addResumptionPoint((com.google.javascript.rhino.head.Node) scriptNode15);
        java.lang.String str23 = node1.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode3);
        int int24 = functionNode3.getEncodedSourceStart();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = functionNode3.toSource(12);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        boolean boolean3 = functionNode1.isGetter();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral5 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral5.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str8 = regExpLiteral5.getValue();
        regExpLiteral5.setFlags("52");
        functionNode1.addChildrenToFront((com.google.javascript.rhino.head.Node) regExpLiteral5);
        boolean boolean12 = functionNode1.isGetterOrSetter();
        int int13 = functionNode1.getRegexpCount();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral16 = new com.google.javascript.rhino.head.ast.RegExpLiteral(12, 10);
        functionNode1.addRegExp(regExpLiteral16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = functionNode1.toSource((-522402608));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral1 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str3 = regExpLiteral1.toSource((int) (byte) 10);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator4 = regExpLiteral1.new NodeIterator();
        regExpLiteral1.setFlags("                  ");
        regExpLiteral1.setFlags("109");
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
        com.google.javascript.rhino.head.ast.Comment comment24 = functionNode20.getJsDocNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope27 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode28 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = functionNode28.getTop();
        functionNode28.setParens((int) (byte) 1, (int) (short) 1);
        functionNode28.setEncodedSourceStart((-1));
        functionNode28.setFunctionIsGetter();
        scope27.addChildToFront((com.google.javascript.rhino.head.Node) functionNode28);
        functionNode25.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode28);
        boolean boolean38 = functionNode20.isParam((com.google.javascript.rhino.head.ast.AstNode) functionNode25);
        functionNode20.setFunctionType(13);
        functionNode20.setRp(19);
        boolean boolean43 = functionNode20.isGenerator();
        functionNode20.setFunctionIsSetter();
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node(21, 48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        regExpLiteral1.replaceChildAfter((com.google.javascript.rhino.head.Node) functionNode20, node47);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
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
        int int34 = functionNode11.getRp();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode35 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int36 = functionNode35.getLp();
        functionNode35.setLp((int) (short) 1);
        int int41 = functionNode35.getIntProp(4, 26);
        boolean boolean42 = functionNode35.hasChildren();
        functionNode11.addParam((com.google.javascript.rhino.head.ast.AstNode) functionNode35);
        functionNode11.removeProp((int) 'a');
        functionNode11.setRp(32);
        boolean boolean48 = functionNode11.hasChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str50 = functionNode11.getRegexpString(706404030);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        functionNode0.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList7 = functionNode0.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope9 = functionNode0.getDefiningScope("hi!");
        boolean boolean10 = functionNode0.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol15 = scriptNode12.getSymbol("hi!");
        scriptNode12.putIntProp(3, 0);
        functionNode0.addResumptionPoint((com.google.javascript.rhino.head.Node) scriptNode12);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = functionNode21.getTop();
        functionNode21.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode21);
        int int27 = functionNode21.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.Jump jump32 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump32.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump36 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump32, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int39 = scriptNode38.getEndLineno();
        int int40 = scriptNode38.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList41 = scriptNode38.getChildScopes();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump32, (com.google.javascript.rhino.head.Node) scriptNode38);
        java.lang.String str43 = scriptNode38.getSourceName();
        functionNode21.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode38);
        functionNode0.setCompilerData((java.lang.Object) scriptNode38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = functionNode0.toSource();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = functionNode0.getSymbols();
        functionNode0.setRp(5);
        com.google.javascript.rhino.head.ast.Scope scope7 = functionNode0.getEnclosingScope();
        functionNode0.setLineno((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = functionNode0.toSource((int) (short) -1);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
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
        java.lang.String str23 = functionNode0.getNextTempName();
        functionNode0.setEncodedSourceBounds((-522402608), 17);
        com.google.javascript.rhino.head.Token.CommentType commentType29 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment((-1320570006), (int) (short) 10, commentType29, "<=");
        com.google.javascript.rhino.head.Token.CommentType commentType34 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment36 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType34, "109");
        java.lang.String str38 = comment36.toSource(19);
        java.lang.String str39 = comment36.getValue();
        java.lang.String str40 = comment36.getValue();
        com.google.javascript.rhino.head.Token.CommentType commentType41 = comment36.getCommentType();
        comment31.setCommentType(commentType41);
        functionNode0.setJsDocNode(comment31);
        java.lang.String str44 = functionNode0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = functionNode0.toSource((-46171456));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        java.lang.String str2 = scriptNode1.getJsDoc();
        com.google.javascript.rhino.head.Node node4 = scriptNode1.setType(0);
        int int5 = scriptNode1.getAbsolutePosition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = scriptNode1.getRegexpFlags(527364792);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
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
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = functionNode20.getTop();
        functionNode20.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor25 = functionNode20.iterator();
        functionNode20.setLp(136);
        int int28 = functionNode20.getFunctionType();
        functionNode20.setFunctionIsGetter();
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((-1147087024), (com.google.javascript.rhino.head.Node) functionNode2, (com.google.javascript.rhino.head.Node) functionNode20, (int) (byte) 10);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList32 = functionNode20.getFunctions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = functionNode20.toSource((-22));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        int int2 = functionNode0.getRegexpCount();
        functionNode0.setFunctionIsGetter();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap4 = functionNode0.getSymbolTable();
        functionNode0.setLp(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = functionNode0.getFunctionNode(0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) 19);
        com.google.javascript.rhino.head.ast.Comment comment2 = node1.getJsDocNode();
        com.google.javascript.rhino.head.Token.CommentType commentType5 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment7 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType5, "109");
        java.lang.String str9 = comment7.toSource(19);
        java.lang.String str10 = comment7.getValue();
        java.lang.String str11 = comment7.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild((com.google.javascript.rhino.head.Node) comment7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int3 = functionNode2.getLp();
        functionNode2.setLp((int) (short) 1);
        int int8 = functionNode2.getIntProp(4, 26);
        com.google.javascript.rhino.head.ast.Jump jump9 = new com.google.javascript.rhino.head.ast.Jump(3, (com.google.javascript.rhino.head.Node) functionNode2);
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) functionNode2);
        functionNode2.setRequiresActivation();
        com.google.javascript.rhino.head.Node node13 = functionNode2.setType(9);
        functionNode2.setSourceName("                                            {\n                                            }\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode17 = functionNode2.getFunctionNode((-811062427));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
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
        boolean boolean23 = functionNode13.isGenerator();
        java.lang.String str24 = functionNode13.getName();
        int int25 = functionNode13.getRp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = functionNode13.toSource((-1147087024));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral1 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral1.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str4 = regExpLiteral1.getValue();
        regExpLiteral1.setFlags("52");
        com.google.javascript.rhino.head.ast.Jump jump11 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump11.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump15 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump11, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int18 = scriptNode17.getEndLineno();
        int int19 = scriptNode17.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList20 = scriptNode17.getChildScopes();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump11, (com.google.javascript.rhino.head.Node) scriptNode17);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList22 = scriptNode17.getFunctions();
        int int23 = functionNodeList22.size();
        com.google.javascript.rhino.head.ast.Symbol symbol24 = new com.google.javascript.rhino.head.ast.Symbol();
        com.google.javascript.rhino.head.Node node25 = symbol24.getNode();
        symbol24.setIndex(4);
        java.lang.String str28 = symbol24.getDeclTypeName();
        int int29 = functionNodeList22.lastIndexOf((java.lang.Object) str28);
        int int30 = functionNodeList22.size();
        com.google.javascript.rhino.head.Token.CommentType commentType33 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment35 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType33, "109");
        java.lang.String str37 = comment35.toSource(19);
        com.google.javascript.rhino.head.Token.CommentType commentType38 = comment35.getCommentType();
        int int39 = comment35.getLineno();
        boolean boolean40 = functionNodeList22.remove((java.lang.Object) comment35);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor41 = comment35.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        regExpLiteral1.removeChild((com.google.javascript.rhino.head.Node) comment35);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node(21);
        com.google.javascript.rhino.head.ast.Scope scope5 = new com.google.javascript.rhino.head.ast.Scope(15, (int) (byte) 0);
        com.google.javascript.rhino.head.ast.Symbol symbol7 = scope5.getSymbol("");
        java.lang.String str8 = scope5.debugPrint();
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node(16, (com.google.javascript.rhino.head.Node) scope5, 15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node10);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = functionNode13.debugPrint();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLineno(0);
        boolean boolean4 = functionNode0.isGetterOrSetter();
        functionNode0.setPosition(987694010);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = functionNode0.getFunctionNode(1272516910);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
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
        java.lang.String str53 = functionNode26.toSource();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        int int2 = functionNode1.getEncodedSourceStart();
        int int3 = functionNode1.getFunctionCount();
        boolean boolean4 = functionNode1.isGetter();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList5 = functionNode1.getFunctions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = functionNode1.toSource(0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
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
        java.lang.String str25 = scriptNode18.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = scriptNode18.getAstRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = scriptNode18.getRegexpString((-241661658));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
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
        com.google.javascript.rhino.head.ast.Jump jump19 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump19.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump23 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump19, 0);
        com.google.javascript.rhino.head.ast.Jump jump27 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump27.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump31 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump27, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode32 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int33 = functionNode32.getLp();
        functionNode32.setEncodedSource("");
        functionNode32.flattenSymbolTable(false);
        jump19.addChildAfter((com.google.javascript.rhino.head.Node) jump27, (com.google.javascript.rhino.head.Node) functionNode32);
        functionNode5.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) functionNode32);
        com.google.javascript.rhino.head.ast.Scope scope40 = functionNode5.getEnclosingScope();
        boolean boolean41 = functionNode5.isGetterOrSetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = functionNode5.toSource();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = functionNode0.getSymbols();
        functionNode0.setRp(5);
        functionNode0.setParens((int) '#', 24);
        int int10 = functionNode0.getParamCount();
        functionNode0.setSourceName("");
        int int13 = functionNode0.getEncodedSourceEnd();
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
        boolean boolean29 = functionNode25.isGenerator();
        com.google.javascript.rhino.head.ast.Scope scope31 = new com.google.javascript.rhino.head.ast.Scope();
        scope31.setBounds(0, 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode35 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = functionNode35.getTop();
        int int37 = functionNode35.getRegexpCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode38 = functionNode35.getEnclosingFunction();
        java.lang.String str39 = scope31.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode35);
        functionNode25.putProp(1, (java.lang.Object) functionNode35);
        java.lang.String str41 = functionNode25.shortName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node42 = functionNode0.getChildBefore((com.google.javascript.rhino.head.Node) functionNode25);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        functionNode0.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList7 = functionNode0.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope9 = functionNode0.getDefiningScope("hi!");
        boolean boolean10 = functionNode0.isGetterOrSetter();
        functionNode0.setSourceName("                                                                                                                                                                                                        /null/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = functionNode0.debugPrint();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        java.lang.String str2 = functionNode0.getName();
        functionNode0.flattenSymbolTable(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = functionNode0.getRegexpString(881445186);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
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
        com.google.javascript.rhino.head.ast.Comment comment16 = functionNode12.getJsDocNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode17 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = functionNode20.getTop();
        functionNode20.setParens((int) (byte) 1, (int) (short) 1);
        functionNode20.setEncodedSourceStart((-1));
        functionNode20.setFunctionIsGetter();
        scope19.addChildToFront((com.google.javascript.rhino.head.Node) functionNode20);
        functionNode17.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode20);
        boolean boolean30 = functionNode12.isParam((com.google.javascript.rhino.head.ast.AstNode) functionNode17);
        com.google.javascript.rhino.head.ast.Jump jump31 = new com.google.javascript.rhino.head.ast.Jump(8, (com.google.javascript.rhino.head.Node) functionNode12);
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
        com.google.javascript.rhino.head.ast.AstNode astNode47 = scriptNode33.getParent();
        int int48 = scriptNode33.getType();
        com.google.javascript.rhino.head.ast.Symbol symbol50 = scriptNode33.getSymbol("109");
        java.lang.String str51 = scriptNode33.toSource();
        int int52 = scriptNode33.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode53 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = functionNode53.getTop();
        functionNode53.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor58 = functionNode53.iterator();
        functionNode53.setLp(136);
        int int61 = functionNode53.getFunctionType();
        scriptNode33.addChildrenToBack((com.google.javascript.rhino.head.Node) functionNode53);
        functionNode12.setParentScope((com.google.javascript.rhino.head.ast.Scope) functionNode53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str64 = functionNode53.debugPrint();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        boolean boolean3 = functionNode1.isGetter();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral5 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral5.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str8 = regExpLiteral5.getValue();
        regExpLiteral5.setFlags("52");
        functionNode1.addChildrenToFront((com.google.javascript.rhino.head.Node) regExpLiteral5);
        boolean boolean12 = functionNode1.isGetterOrSetter();
        int int13 = functionNode1.getRegexpCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = functionNode1.getRegexpFlags((-238258924));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str45 = functionNode1.toSource(88879802);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor5 = functionNode0.iterator();
        functionNode0.setLp(136);
        int int8 = functionNode0.getFunctionType();
        com.google.javascript.rhino.head.Node node9 = functionNode0.getLastChild();
        int int10 = functionNode0.getParamCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = functionNode0.toSource((-1066766702));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int3 = functionNode2.getLp();
        functionNode2.setLp((int) (short) 1);
        int int8 = functionNode2.getIntProp(4, 26);
        com.google.javascript.rhino.head.ast.Jump jump9 = new com.google.javascript.rhino.head.ast.Jump(3, (com.google.javascript.rhino.head.Node) functionNode2);
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) functionNode2);
        functionNode2.setRequiresActivation();
        com.google.javascript.rhino.head.Node node13 = functionNode2.setType(9);
        com.google.javascript.rhino.head.ast.Jump jump19 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump19.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump23 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump19, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int26 = scriptNode25.getEndLineno();
        int int27 = scriptNode25.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList28 = scriptNode25.getChildScopes();
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump19, (com.google.javascript.rhino.head.Node) scriptNode25);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList30 = scriptNode25.getChildScopes();
        com.google.javascript.rhino.head.ast.Jump jump31 = new com.google.javascript.rhino.head.ast.Jump(11, (com.google.javascript.rhino.head.Node) scriptNode25);
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newString(12, "Symbol (EOF) name=null");
        jump31.target = node34;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node36 = node13.getChildBefore(node34);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("EOF");
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator2 = node1.new NodeIterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList10 = functionNode3.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope12 = functionNode3.getDefiningScope("hi!");
        boolean boolean13 = functionNode3.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int16 = scriptNode15.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol18 = scriptNode15.getSymbol("hi!");
        scriptNode15.putIntProp(3, 0);
        functionNode3.addResumptionPoint((com.google.javascript.rhino.head.Node) scriptNode15);
        java.lang.String str23 = node1.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode3);
        functionNode3.setPosition(16);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = functionNode26.getTop();
        functionNode26.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor31 = functionNode26.iterator();
        functionNode26.setFunctionIsSetter();
        functionNode3.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode35 = functionNode26.getFunctionNode(32);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLp((int) (short) 1);
        int int6 = functionNode0.getIntProp(4, 26);
        boolean boolean7 = functionNode0.hasChildren();
        java.lang.String str8 = functionNode0.getNextTempName();
        com.google.javascript.rhino.head.ast.Jump jump13 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump13.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump17 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump13, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int20 = scriptNode19.getEndLineno();
        int int21 = scriptNode19.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList22 = scriptNode19.getChildScopes();
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump13, (com.google.javascript.rhino.head.Node) scriptNode19);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList24 = scriptNode19.getFunctions();
        functionNodeList24.clear();
        functionNodeList24.clear();
        java.util.Iterator<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeItor27 = functionNodeList24.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode28 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int29 = functionNode28.getLp();
        functionNode28.setLp((int) (short) 1);
        int int34 = functionNode28.getIntProp(4, 26);
        functionNode28.flattenSymbolTable(true);
        boolean boolean37 = functionNodeList24.equals((java.lang.Object) functionNode28);
        com.google.javascript.rhino.head.ast.Symbol symbol39 = functionNode28.getSymbol("            {\n            }\n");
        com.google.javascript.rhino.head.ast.Jump jump46 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump46.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump50 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump46, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int53 = scriptNode52.getEndLineno();
        int int54 = scriptNode52.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList55 = scriptNode52.getChildScopes();
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump46, (com.google.javascript.rhino.head.Node) scriptNode52);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList57 = scriptNode52.getChildScopes();
        com.google.javascript.rhino.head.ast.Jump jump58 = new com.google.javascript.rhino.head.ast.Jump(11, (com.google.javascript.rhino.head.Node) scriptNode52);
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node((int) (byte) -1, (com.google.javascript.rhino.head.Node) scriptNode52, 19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode0.replaceChild((com.google.javascript.rhino.head.Node) functionNode28, node60);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = functionNode0.getSymbols();
        functionNode0.setRp(5);
        com.google.javascript.rhino.head.ast.Scope scope7 = functionNode0.getEnclosingScope();
        boolean boolean8 = functionNode0.isExpressionClosure();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int10 = functionNode9.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = functionNode9.getTop();
        boolean boolean12 = functionNode9.hasSideEffects();
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
        functionNode9.addChildScope(scope28);
        boolean boolean31 = functionNode9.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode32 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = functionNode32.getTop();
        functionNode32.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode37 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope39 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode40 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = functionNode40.getTop();
        functionNode40.setParens((int) (byte) 1, (int) (short) 1);
        functionNode40.setEncodedSourceStart((-1));
        functionNode40.setFunctionIsGetter();
        scope39.addChildToFront((com.google.javascript.rhino.head.Node) functionNode40);
        functionNode37.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode40);
        functionNode37.setFunctionIsSetter();
        int int51 = functionNode32.addFunction(functionNode37);
        java.lang.String str52 = functionNode32.getNextTempName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int55 = scriptNode54.getEndLineno();
        int int56 = scriptNode54.getBaseLineno();
        scriptNode54.removeProp(0);
        scriptNode54.setEncodedSourceEnd(19);
        functionNode32.addParam((com.google.javascript.rhino.head.ast.AstNode) scriptNode54);
        functionNode9.addChildrenToFront((com.google.javascript.rhino.head.Node) scriptNode54);
        functionNode0.setTop(scriptNode54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str65 = scriptNode54.getRegexpString(0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
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
        functionNode25.setSourceName("/null/                            {\n                            }\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str67 = functionNode25.toSource((int) (byte) 100);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
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
        functionNode0.setEncodedSourceStart(7);
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
        functionNodeList46.clear();
        java.util.Iterator<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeItor49 = functionNodeList46.iterator();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode50 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int51 = functionNode50.getLp();
        functionNode50.setLp((int) (short) 1);
        int int56 = functionNode50.getIntProp(4, 26);
        functionNode50.flattenSymbolTable(true);
        boolean boolean59 = functionNodeList46.equals((java.lang.Object) functionNode50);
        int int60 = functionNode0.addFunction(functionNode50);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode62 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int63 = functionNode62.getLp();
        functionNode62.setIsExpressionClosure(false);
        com.google.javascript.rhino.head.ast.Scope scope66 = functionNode62.getParentScope();
        int int67 = functionNode62.getFunctionType();
        int int68 = functionNode62.getRegexpCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode69 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int70 = functionNode69.getLp();
        functionNode69.setIsExpressionClosure(false);
        com.google.javascript.rhino.head.ast.Scope scope73 = functionNode69.getParentScope();
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node(32, (com.google.javascript.rhino.head.Node) functionNode62, (com.google.javascript.rhino.head.Node) functionNode69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node75 = functionNode0.getChildBefore((com.google.javascript.rhino.head.Node) functionNode62);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
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
        com.google.javascript.rhino.head.Node node51 = functionNode10.getLastChild();
        int int52 = functionNode10.getLp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str54 = functionNode10.toSource(0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
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
        java.lang.String str14 = functionNode0.toSource(20);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode1.getTop();
        com.google.javascript.rhino.head.Node node4 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode1);
        functionNode1.setPosition(670868847);
        java.lang.String str7 = functionNode1.getName();
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        int int14 = scriptNode12.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = scriptNode12.getChildScopes();
        jump10.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode12);
        java.lang.String str17 = scriptNode12.debugPrint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode1.removeChild((com.google.javascript.rhino.head.Node) scriptNode12);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        com.google.javascript.rhino.head.Token.CommentType commentType2 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment4 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType2, "109");
        java.lang.String str6 = comment4.toSource(19);
        java.lang.String str7 = comment4.getValue();
        java.lang.String str8 = comment4.getValue();
        com.google.javascript.rhino.head.Token.CommentType commentType9 = comment4.getCommentType();
        com.google.javascript.rhino.head.Token.CommentType commentType12 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment14 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType12, "109");
        java.lang.String str16 = comment14.toSource(19);
        com.google.javascript.rhino.head.Token.CommentType commentType17 = comment14.getCommentType();
        comment4.setCommentType(commentType17);
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral20 = new com.google.javascript.rhino.head.ast.RegExpLiteral(24);
        java.lang.String str22 = regExpLiteral20.toSource((int) ' ');
        com.google.javascript.rhino.head.ast.FunctionNode functionNode23 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = functionNode23.getTop();
        functionNode23.setParens((int) (byte) 1, (int) (short) 1);
        functionNode23.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList30 = functionNode23.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope32 = functionNode23.getDefiningScope("hi!");
        boolean boolean33 = functionNode23.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.Scope scope35 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        int[] intArray42 = new int[] { 25, 17, (short) 0, 20, 19, (byte) 1 };
        functionNode23.addLiveLocals((com.google.javascript.rhino.head.Node) scope35, intArray42);
        com.google.javascript.rhino.head.Node node45 = functionNode23.setType(100);
        functionNode23.setFunctionIsSetter();
        functionNode23.setIsGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        comment4.replaceChild((com.google.javascript.rhino.head.Node) regExpLiteral20, (com.google.javascript.rhino.head.Node) functionNode23);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(556794251);
        com.google.javascript.rhino.head.Token.CommentType commentType6 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment8 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType6, "109");
        java.lang.String str10 = comment8.toSource(19);
        java.lang.String str11 = comment8.getValue();
        com.google.javascript.rhino.head.Token.CommentType commentType12 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        comment8.setCommentType(commentType12);
        com.google.javascript.rhino.head.ast.Comment comment15 = new com.google.javascript.rhino.head.ast.Comment(9, 6, commentType12, "                    ");
        functionNode1.setJsDocNode(comment15);
        functionNode1.setRequiresActivation();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = functionNode1.getTop();
        com.google.javascript.rhino.head.ast.Jump jump23 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump23.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump27 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump23, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int30 = scriptNode29.getEndLineno();
        int int31 = scriptNode29.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList32 = scriptNode29.getChildScopes();
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump23, (com.google.javascript.rhino.head.Node) scriptNode29);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList34 = scriptNode29.getChildScopes();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList35 = scriptNode29.getSymbols();
        scriptNode18.setSymbols(symbolList35);
        int int37 = scriptNode18.getFunctionCount();
        java.lang.String str38 = scriptNode18.getNextTempName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str40 = scriptNode18.getRegexpString(52);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
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
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = functionNode19.getTop();
        functionNode19.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode19);
        int int25 = functionNode19.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.Jump jump30 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump30.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump34 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump30, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int37 = scriptNode36.getEndLineno();
        int int38 = scriptNode36.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList39 = scriptNode36.getChildScopes();
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump30, (com.google.javascript.rhino.head.Node) scriptNode36);
        java.lang.String str41 = scriptNode36.getSourceName();
        functionNode19.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode36);
        java.lang.String str43 = scriptNode36.getNextTempName();
        scriptNode36.setBaseLineno(109);
        functionNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode36);
        functionNode0.setEncodedSourceStart((-1701742065));
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap49 = functionNode0.getLiveLocals();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str51 = functionNode0.toSource((-555316823));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int23 = scriptNode22.getEndLineno();
        int int24 = scriptNode22.getBaseLineno();
        scriptNode22.removeProp(0);
        scriptNode22.setEncodedSourceEnd(19);
        functionNode0.addParam((com.google.javascript.rhino.head.ast.AstNode) scriptNode22);
        functionNode0.setEncodedSource("                {\n                }\n");
        functionNode0.setEncodedSourceBounds(23, 0);
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
        functionNodeList50.clear();
        int int54 = functionNodeList50.indexOf((java.lang.Object) 10L);
        java.util.Iterator<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeItor55 = functionNodeList50.iterator();
        java.util.stream.Stream<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeStream56 = functionNodeList50.stream();
        java.util.stream.Stream<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeStream57 = functionNodeList50.parallelStream();
        com.google.javascript.rhino.head.Token.CommentType commentType61 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment63 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType61, "109");
        java.lang.String str65 = comment63.toSource(19);
        com.google.javascript.rhino.head.ast.Scope scope68 = new com.google.javascript.rhino.head.ast.Scope((int) (short) -1, 0);
        com.google.javascript.rhino.head.Node node69 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) comment63, (com.google.javascript.rhino.head.Node) scope68);
        boolean boolean70 = functionNodeList50.remove((java.lang.Object) comment63);
        functionNode0.setJsDocNode(comment63);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList72 = functionNode0.getParams();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str74 = functionNode0.toSource((-232776031));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        functionNode1.setSourceName("                                                                                                                                                                                                        /null/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = functionNode1.getRegexpString(0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = functionNode1.toSource((-238258924));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str1 = symbol0.getName();
        com.google.javascript.rhino.head.Node node2 = symbol0.getNode();
        com.google.javascript.rhino.head.ast.Jump jump4 = new com.google.javascript.rhino.head.ast.Jump((int) ' ');
        symbol0.setNode((com.google.javascript.rhino.head.Node) jump4);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope8 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = functionNode9.getTop();
        functionNode9.setParens((int) (byte) 1, (int) (short) 1);
        functionNode9.setEncodedSourceStart((-1));
        functionNode9.setFunctionIsGetter();
        scope8.addChildToFront((com.google.javascript.rhino.head.Node) functionNode9);
        functionNode6.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode9);
        functionNode6.setRequiresActivation();
        boolean boolean20 = functionNode6.isExpressionClosure();
        functionNode6.setSourceName("hi!");
        int int23 = functionNode6.getFunctionCount();
        symbol0.setNode((com.google.javascript.rhino.head.Node) functionNode6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = functionNode6.toSource(0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = functionNode0.getSymbols();
        functionNode0.setRp(5);
        com.google.javascript.rhino.head.ast.Scope scope7 = functionNode0.getEnclosingScope();
        functionNode0.setLineno(5);
        functionNode0.setIsExpressionClosure(false);
        functionNode0.setFunctionType(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = functionNode0.getRegexpFlags((-232776031));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
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
        int int27 = functionNode1.getEncodedSourceEnd();
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap28 = functionNode1.getLiveLocals();
        functionNode1.setPosition((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode32 = functionNode1.getFunctionNode((-1439556361));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str1 = symbol0.getName();
        com.google.javascript.rhino.head.Node node2 = symbol0.getNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = new com.google.javascript.rhino.head.ast.FunctionNode((-1));
        symbol0.setNode((com.google.javascript.rhino.head.Node) functionNode4);
        com.google.javascript.rhino.head.ast.AstNode astNode6 = functionNode4.getParent();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList7 = functionNode4.getStatements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = functionNode4.getRegexpFlags(1179271826);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = functionNode0.getSymbols();
        functionNode0.setRp(5);
        functionNode0.setParens((int) '#', 24);
        int int10 = functionNode0.getParamCount();
        functionNode0.setSourceName("");
        functionNode0.setRp(22);
        functionNode0.setFunctionIsSetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = functionNode0.toSource(15);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
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
        com.google.javascript.rhino.head.ast.AstNode astNode28 = functionNode10.getParent();
        int int29 = functionNode10.getFunctionCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = functionNode10.getRegexpString(25);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str35 = functionNode5.toSource((-469244627));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
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
        int int26 = functionNode13.getFunctionType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = functionNode13.toSource((-1066766702));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLp((int) (short) 1);
        int int6 = functionNode0.getIntProp(4, 26);
        functionNode0.setFunctionIsGetter();
        boolean boolean8 = functionNode0.isGetterOrSetter();
        java.lang.String str9 = functionNode0.getNextTempName();
        functionNode0.setBaseLineno(1516440538);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = functionNode0.getRegexpString(363270187);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
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
        functionNode11.setFunctionIsSetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = functionNode11.getRegexpFlags((int) (byte) -1);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
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
        boolean boolean42 = functionNode28.isExpressionClosure();
        functionNode28.putIntProp(7, (int) (byte) 0);
        com.google.javascript.rhino.head.ast.Jump jump46 = new com.google.javascript.rhino.head.ast.Jump(4, (com.google.javascript.rhino.head.Node) functionNode28);
        functionNode13.addChildToFront((com.google.javascript.rhino.head.Node) jump46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str49 = functionNode13.toSource((-560439136));
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
        int int53 = functionNode26.getFunctionCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str55 = functionNode26.toSource((-1));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = functionNode11.toSource();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
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
        functionNode0.setEncodedSourceEnd(13);
        java.lang.Object obj16 = functionNode0.getCompilerData();
        com.google.javascript.rhino.head.Node node17 = functionNode0.target;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = functionNode0.getFunctionNode(48);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
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
        com.google.javascript.rhino.head.ast.FunctionNode functionNode35 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = functionNode35.getTop();
        boolean boolean37 = functionNodeList15.contains((java.lang.Object) scriptNode36);
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
        boolean boolean57 = functionNodeList15.containsAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList53);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode(5);
        boolean boolean60 = functionNodeList53.remove((java.lang.Object) scriptNode59);
        com.google.javascript.rhino.head.ast.Scope scope61 = scriptNode59.getParentScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str63 = scriptNode59.getRegexpString(35);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        functionNode1.setPosition((int) '#');
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
        com.google.javascript.rhino.head.ast.Comment comment20 = functionNode16.getJsDocNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope23 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = functionNode24.getTop();
        functionNode24.setParens((int) (byte) 1, (int) (short) 1);
        functionNode24.setEncodedSourceStart((-1));
        functionNode24.setFunctionIsGetter();
        scope23.addChildToFront((com.google.javascript.rhino.head.Node) functionNode24);
        functionNode21.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode24);
        boolean boolean34 = functionNode16.isParam((com.google.javascript.rhino.head.ast.AstNode) functionNode21);
        functionNode16.setFunctionType(13);
        com.google.javascript.rhino.head.ast.Jump jump39 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.Scope scope41 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        jump39.addChildrenToBack((com.google.javascript.rhino.head.Node) scope41);
        jump39.setBounds(5, (int) (short) 10);
        boolean boolean46 = functionNode16.isParam((com.google.javascript.rhino.head.ast.AstNode) jump39);
        functionNode1.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode16);
        com.google.javascript.rhino.head.ast.AstNode astNode48 = functionNode1.getParent();
        com.google.javascript.rhino.head.ast.Scope scope50 = functionNode1.getDefiningScope("                                                                                                        /null/52");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode52 = functionNode1.getFunctionNode((int) 'a');
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
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
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList20 = scriptNode17.getChildScopes();
        functionNode1.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = functionNode1.toSource(129);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int2 = scriptNode1.getEndLineno();
        int int3 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node4 = scriptNode1.getNext();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getFirstChild();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap6 = scriptNode1.getSymbolTable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = scriptNode1.getRegexpString((-555175474));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str5 = functionNode1.toStringTree(scriptNode4);
        functionNode1.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode7 = functionNode1.getBody();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList8 = functionNode1.getParams();
        int int9 = functionNode1.getFunctionType();
        boolean boolean10 = functionNode1.isSetter();
        com.google.javascript.rhino.head.ast.Jump jump12 = new com.google.javascript.rhino.head.ast.Jump(100, (com.google.javascript.rhino.head.Node) functionNode1, 747370658);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = functionNode1.getRegexpFlags((-260389973));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
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
        com.google.javascript.rhino.head.ast.Scope scope25 = functionNode16.getEnclosingScope();
        java.lang.String str27 = functionNode16.makeIndent(14);
        functionNode16.removeChildren();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode30 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int31 = functionNode30.getLp();
        functionNode30.setLineno(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode34 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int35 = functionNode34.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = functionNode34.getTop();
        boolean boolean37 = functionNode34.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList38 = functionNode34.getSymbols();
        functionNode34.setRp(5);
        com.google.javascript.rhino.head.ast.Scope scope41 = functionNode34.getEnclosingScope();
        functionNode34.setLineno(5);
        functionNode30.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) functionNode34);
        com.google.javascript.rhino.head.Token.CommentType commentType49 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment51 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType49, "109");
        com.google.javascript.rhino.head.Token.CommentType commentType52 = comment51.getCommentType();
        com.google.javascript.rhino.head.Token.CommentType commentType53 = comment51.getCommentType();
        com.google.javascript.rhino.head.ast.Comment comment55 = new com.google.javascript.rhino.head.ast.Comment(0, 35, commentType53, "Symbol (EOF) name=-1\tSCRIPT -1 1\n");
        com.google.javascript.rhino.head.ast.Symbol symbol58 = new com.google.javascript.rhino.head.ast.Symbol(109, "<=");
        com.google.javascript.rhino.head.ast.Symbol symbol59 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str60 = symbol59.getName();
        com.google.javascript.rhino.head.Node node61 = symbol59.getNode();
        com.google.javascript.rhino.head.ast.Jump jump63 = new com.google.javascript.rhino.head.ast.Jump((int) ' ');
        symbol59.setNode((com.google.javascript.rhino.head.Node) jump63);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode66 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int67 = functionNode66.getBaseLineno();
        functionNode66.setSourceName("                                                                                                                                                                                                        /null/");
        symbol59.setContainingTable((com.google.javascript.rhino.head.ast.Scope) functionNode66);
        int int71 = functionNode66.getLp();
        int int72 = functionNode66.getType();
        symbol58.setNode((com.google.javascript.rhino.head.Node) functionNode66);
        com.google.javascript.rhino.head.Node node75 = new com.google.javascript.rhino.head.Node(22, (com.google.javascript.rhino.head.Node) functionNode30, (com.google.javascript.rhino.head.Node) comment55, (com.google.javascript.rhino.head.Node) functionNode66, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node76 = functionNode16.getChildBefore((com.google.javascript.rhino.head.Node) functionNode66);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        com.google.javascript.rhino.head.ast.Jump jump5 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump5.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump9 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump5, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int12 = scriptNode11.getEndLineno();
        int int13 = scriptNode11.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList14 = scriptNode11.getChildScopes();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump5, (com.google.javascript.rhino.head.Node) scriptNode11);
        symbol0.setContainingTable((com.google.javascript.rhino.head.ast.Scope) scriptNode11);
        com.google.javascript.rhino.head.ast.Scope scope17 = symbol0.getContainingTable();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int20 = functionNode19.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = functionNode19.getTop();
        boolean boolean22 = functionNode19.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList23 = functionNode19.getSymbols();
        functionNode19.setRp(5);
        com.google.javascript.rhino.head.ast.Jump jump26 = new com.google.javascript.rhino.head.ast.Jump(35, (com.google.javascript.rhino.head.Node) functionNode19);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap27 = functionNode19.getSymbolTable();
        symbol0.setContainingTable((com.google.javascript.rhino.head.ast.Scope) functionNode19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = functionNode19.getRegexpString((int) (short) 100);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
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
        functionNode5.setFunctionIsGetter();
        boolean boolean19 = functionNode5.hasSideEffects();
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
        com.google.javascript.rhino.head.Node node43 = functionNode36.target;
        boolean boolean44 = functionNode36.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.Name name45 = functionNode36.getFunctionName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode46 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope48 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode49 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = functionNode49.getTop();
        functionNode49.setParens((int) (byte) 1, (int) (short) 1);
        functionNode49.setEncodedSourceStart((-1));
        functionNode49.setFunctionIsGetter();
        scope48.addChildToFront((com.google.javascript.rhino.head.Node) functionNode49);
        functionNode46.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode49);
        functionNode49.setRelative(0);
        functionNode36.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode49);
        functionNode36.setEncodedSourceStart((int) (byte) 0);
        boolean boolean64 = functionNode36.isGetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        com.google.javascript.rhino.head.ast.Jump jump71 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump71.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump75 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump71, 0);
        com.google.javascript.rhino.head.ast.Jump jump79 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump79.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump83 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump79, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode84 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int85 = functionNode84.getLp();
        functionNode84.setEncodedSource("");
        functionNode84.flattenSymbolTable(false);
        jump71.addChildAfter((com.google.javascript.rhino.head.Node) jump79, (com.google.javascript.rhino.head.Node) functionNode84);
        com.google.javascript.rhino.head.Node node91 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode67, (com.google.javascript.rhino.head.Node) jump71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode5.replaceChild((com.google.javascript.rhino.head.Node) functionNode36, (com.google.javascript.rhino.head.Node) scriptNode67);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((-1147087024));
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int3 = functionNode2.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode2.getTop();
        boolean boolean5 = functionNode2.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList6 = functionNode2.getSymbols();
        int int7 = functionNode2.getLength();
        boolean boolean8 = functionNode2.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.Jump jump12 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump12.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump16 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump12, 0);
        com.google.javascript.rhino.head.ast.Jump jump20 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump20.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump24 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump20, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int26 = functionNode25.getLp();
        functionNode25.setEncodedSource("");
        functionNode25.flattenSymbolTable(false);
        jump12.addChildAfter((com.google.javascript.rhino.head.Node) jump20, (com.google.javascript.rhino.head.Node) functionNode25);
        functionNode2.setBody((com.google.javascript.rhino.head.ast.AstNode) jump12);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode33 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = functionNode33.getTop();
        functionNode33.setParens((int) (byte) 1, (int) (short) 1);
        functionNode33.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList40 = functionNode33.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope42 = functionNode33.getDefiningScope("hi!");
        boolean boolean43 = functionNode33.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode44 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int45 = functionNode44.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = functionNode44.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode47 = functionNode44.getBody();
        int int48 = functionNode44.getLength();
        com.google.javascript.rhino.head.ast.Jump jump51 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int54 = scriptNode53.getEndLineno();
        int int55 = scriptNode53.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList56 = scriptNode53.getChildScopes();
        jump51.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode53);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode59 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int60 = functionNode59.getLp();
        functionNode59.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode63 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int64 = functionNode63.getLp();
        functionNode63.setEncodedSource("");
        functionNode63.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode69 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int70 = functionNode69.getLp();
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode59, (com.google.javascript.rhino.head.Node) functionNode63, (com.google.javascript.rhino.head.Node) functionNode69, (int) '#');
        jump51.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode59);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList74 = functionNode59.getStatements();
        functionNode44.setParams(astNodeList74);
        functionNode33.addChild((com.google.javascript.rhino.head.ast.AstNode) functionNode44);
        java.util.List<com.google.javascript.rhino.head.Node> nodeList77 = functionNode44.getResumptionPoints();
        java.util.List<com.google.javascript.rhino.head.Node> nodeList78 = functionNode44.getResumptionPoints();
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap79 = functionNode44.getLiveLocals();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild((com.google.javascript.rhino.head.Node) jump12, (com.google.javascript.rhino.head.Node) functionNode44);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
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
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList46 = functionNode3.getParams();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode47 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int48 = functionNode47.getLp();
        functionNode47.setIsExpressionClosure(false);
        int int51 = functionNode47.getLineno();
        boolean boolean52 = functionNode47.hasChildren();
        functionNode3.addResumptionPoint((com.google.javascript.rhino.head.Node) functionNode47);
        com.google.javascript.rhino.head.Token.CommentType commentType58 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment60 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType58, "109");
        com.google.javascript.rhino.head.ast.Comment comment62 = new com.google.javascript.rhino.head.ast.Comment(136, 15, commentType58, "-1\tSCRIPT -1 1\n");
        com.google.javascript.rhino.head.Token.CommentType commentType63 = com.google.javascript.rhino.head.Token.CommentType.JSDOC;
        comment62.setCommentType(commentType63);
        com.google.javascript.rhino.head.Token.CommentType commentType65 = com.google.javascript.rhino.head.Token.CommentType.JSDOC;
        comment62.setCommentType(commentType65);
        comment62.setRelative((-522402608));
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral71 = new com.google.javascript.rhino.head.ast.RegExpLiteral(18, 0);
        java.lang.String str73 = regExpLiteral71.makeIndent(15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode47.addChildBefore((com.google.javascript.rhino.head.Node) comment62, (com.google.javascript.rhino.head.Node) regExpLiteral71);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node((int) (byte) 100, (com.google.javascript.rhino.head.Node) functionNode3, 19);
        boolean boolean14 = functionNode3.isGetter();
        int int17 = functionNode3.getIntProp(20, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = functionNode3.debugPrint();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
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
        com.google.javascript.rhino.head.ast.FunctionNode functionNode44 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int45 = functionNode44.getLp();
        functionNode44.setIsExpressionClosure(false);
        com.google.javascript.rhino.head.ast.Scope scope48 = functionNode44.getParentScope();
        int int49 = functionNode44.getFunctionType();
        functionNode44.removeChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int53 = scriptNode52.getEndLineno();
        int int54 = scriptNode52.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump57 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int60 = scriptNode59.getEndLineno();
        int int61 = scriptNode59.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList62 = scriptNode59.getChildScopes();
        jump57.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode59);
        java.lang.String str64 = scriptNode59.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode52, (com.google.javascript.rhino.head.ast.Scope) scriptNode59);
        int int66 = scriptNode59.getLineno();
        functionNode44.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode59);
        functionNode11.addChildToBack((com.google.javascript.rhino.head.Node) functionNode44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str70 = functionNode44.getRegexpString((-1866727405));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        com.google.javascript.rhino.head.ast.Jump jump5 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump5.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump9 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump5, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int12 = scriptNode11.getEndLineno();
        int int13 = scriptNode11.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList14 = scriptNode11.getChildScopes();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump5, (com.google.javascript.rhino.head.Node) scriptNode11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int18 = scriptNode17.getEndLineno();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral20 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str22 = regExpLiteral20.toSource((int) (byte) 10);
        regExpLiteral20.setFlags("-1\tSCRIPT -1 1\n");
        regExpLiteral20.removeProp(8);
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(10, node15, (com.google.javascript.rhino.head.Node) scriptNode17, (com.google.javascript.rhino.head.Node) regExpLiteral20, 3);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int30 = functionNode29.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = functionNode29.getTop();
        com.google.javascript.rhino.head.ast.AstNode astNode32 = functionNode29.getBody();
        int int33 = functionNode29.getLength();
        com.google.javascript.rhino.head.ast.Jump jump36 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int39 = scriptNode38.getEndLineno();
        int int40 = scriptNode38.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList41 = scriptNode38.getChildScopes();
        jump36.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode38);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode44 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int45 = functionNode44.getLp();
        functionNode44.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode48 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int49 = functionNode48.getLp();
        functionNode48.setEncodedSource("");
        functionNode48.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode54 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int55 = functionNode54.getLp();
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode44, (com.google.javascript.rhino.head.Node) functionNode48, (com.google.javascript.rhino.head.Node) functionNode54, (int) '#');
        jump36.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode44);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList59 = functionNode44.getStatements();
        functionNode29.setParams(astNodeList59);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode61 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int62 = functionNode61.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = functionNode61.getTop();
        com.google.javascript.rhino.head.Node node64 = functionNode61.getLastSibling();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList65 = functionNode61.getParams();
        functionNode29.setParams(astNodeList65);
        boolean boolean67 = functionNode29.isGenerator();
        functionNode29.setPosition(35);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode70 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int71 = functionNode70.getLp();
        functionNode70.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode74 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope76 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode77 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode78 = functionNode77.getTop();
        functionNode77.setParens((int) (byte) 1, (int) (short) 1);
        functionNode77.setEncodedSourceStart((-1));
        functionNode77.setFunctionIsGetter();
        scope76.addChildToFront((com.google.javascript.rhino.head.Node) functionNode77);
        functionNode74.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode77);
        int int87 = functionNode70.addFunction(functionNode74);
        com.google.javascript.rhino.head.ast.Symbol symbol89 = functionNode70.getSymbol("-1\tBLOCK -1 1\n");
        int int90 = functionNode29.addFunction(functionNode70);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList91 = functionNode29.getStatements();
        com.google.javascript.rhino.head.ast.Scope scope93 = new com.google.javascript.rhino.head.ast.Scope(88879802);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode17.addChildBefore((com.google.javascript.rhino.head.Node) functionNode29, (com.google.javascript.rhino.head.Node) scope93);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
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
        int int15 = functionNode0.getLp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = functionNode0.getRegexpString(13);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int3 = scriptNode2.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int6 = scriptNode5.getEndLineno();
        scriptNode2.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode5);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int9 = functionNode8.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = functionNode8.getTop();
        boolean boolean11 = functionNode8.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int14 = scriptNode13.getEndLineno();
        int int15 = scriptNode13.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump18 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int21 = scriptNode20.getEndLineno();
        int int22 = scriptNode20.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList23 = scriptNode20.getChildScopes();
        jump18.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode20);
        java.lang.String str25 = scriptNode20.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode13, (com.google.javascript.rhino.head.ast.Scope) scriptNode20);
        com.google.javascript.rhino.head.ast.Scope scope27 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode20.target = scope27;
        functionNode8.addChildScope(scope27);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode5, (com.google.javascript.rhino.head.ast.Scope) functionNode8);
        int int31 = functionNode8.getFunctionCount();
        com.google.javascript.rhino.head.ast.Jump jump33 = new com.google.javascript.rhino.head.ast.Jump(987694010, (com.google.javascript.rhino.head.Node) functionNode8, (-522402608));
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList34 = functionNode8.getChildScopes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode36 = functionNode8.getFunctionNode(1179271826);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
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
        functionNode1.setParens(556794251, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = functionNode1.debugPrint();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
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
        com.google.javascript.rhino.head.Token.CommentType commentType25 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment27 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType25, "109");
        java.lang.String str29 = comment27.toSource(19);
        java.lang.String str30 = comment27.getValue();
        java.lang.String str32 = comment27.toSource(2);
        functionNode16.setJsDocNode(comment27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode35 = functionNode16.getFunctionNode(0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
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
        com.google.javascript.rhino.head.ast.Comment comment16 = functionNode12.getJsDocNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode17 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = functionNode20.getTop();
        functionNode20.setParens((int) (byte) 1, (int) (short) 1);
        functionNode20.setEncodedSourceStart((-1));
        functionNode20.setFunctionIsGetter();
        scope19.addChildToFront((com.google.javascript.rhino.head.Node) functionNode20);
        functionNode17.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode20);
        boolean boolean30 = functionNode12.isParam((com.google.javascript.rhino.head.ast.AstNode) functionNode17);
        com.google.javascript.rhino.head.ast.Jump jump31 = new com.google.javascript.rhino.head.ast.Jump(8, (com.google.javascript.rhino.head.Node) functionNode12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = functionNode12.getRegexpFlags(316661517);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
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
        boolean boolean50 = scriptNode23.hasConsistentReturnUsage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode52 = scriptNode23.getFunctionNode(66589492);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setEncodedSource("");
        functionNode0.flattenSymbolTable(false);
        boolean boolean6 = functionNode0.requiresActivation();
        java.lang.String str7 = functionNode0.getEncodedSource();
        boolean boolean8 = functionNode0.isGetter();
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
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList24 = functionNode10.getChildScopes();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int27 = scriptNode26.getEndLineno();
        int int28 = scriptNode26.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList29 = scriptNode26.getChildScopes();
        functionNode10.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) scriptNode26);
        boolean boolean31 = functionNode10.hasSideEffects();
        boolean boolean32 = functionNode10.requiresActivation();
        functionNode0.setTop((com.google.javascript.rhino.head.ast.ScriptNode) functionNode10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode35 = functionNode10.getFunctionNode(13);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
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
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList21 = scriptNode10.getChildScopes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = scriptNode10.getRegexpString(117130539);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
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
        com.google.javascript.rhino.head.ast.FunctionNode functionNode50 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope52 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode53 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = functionNode53.getTop();
        functionNode53.setParens((int) (byte) 1, (int) (short) 1);
        functionNode53.setEncodedSourceStart((-1));
        functionNode53.setFunctionIsGetter();
        scope52.addChildToFront((com.google.javascript.rhino.head.Node) functionNode53);
        functionNode50.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode53);
        functionNode50.setFunctionIsSetter();
        boolean boolean64 = functionNode50.isExpressionClosure();
        functionNode50.putIntProp(7, (int) (byte) 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode68 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int69 = functionNode68.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode71 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str72 = functionNode68.toStringTree(scriptNode71);
        int int73 = scriptNode71.getRegexpCount();
        java.lang.Object obj74 = scriptNode71.getCompilerData();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList75 = scriptNode71.getStatements();
        functionNode50.setTop(scriptNode71);
        com.google.javascript.rhino.head.ast.Jump jump77 = new com.google.javascript.rhino.head.ast.Jump(18, (com.google.javascript.rhino.head.Node) scriptNode71);
        int int78 = scriptNode71.depth();
        functionNode45.setCompilerData((java.lang.Object) int78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode81 = functionNode45.getFunctionNode((-68993062));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode1.getTop();
        boolean boolean4 = functionNode1.hasSideEffects();
        java.lang.String str5 = functionNode1.toString();
        functionNode1.setParens((int) (short) 10, 8);
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump(22, (com.google.javascript.rhino.head.Node) functionNode1, 12);
        functionNode1.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int14 = scriptNode13.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int17 = scriptNode16.getEndLineno();
        scriptNode13.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode16);
        java.lang.String str19 = scriptNode13.getNextTempName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.AstNode astNode21 = functionNode20.getParent();
        scriptNode13.setParentScope((com.google.javascript.rhino.head.ast.Scope) functionNode20);
        com.google.javascript.rhino.head.ast.Symbol symbol24 = functionNode20.getSymbol("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode1.removeChild((com.google.javascript.rhino.head.Node) functionNode20);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
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
        java.lang.String str29 = functionNode1.getRegexpFlags(80);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
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
        com.google.javascript.rhino.head.ast.Jump jump26 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump26.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump30 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump26, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int33 = scriptNode32.getEndLineno();
        int int34 = scriptNode32.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList35 = scriptNode32.getChildScopes();
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump26, (com.google.javascript.rhino.head.Node) scriptNode32);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int39 = scriptNode38.getEndLineno();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral41 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str43 = regExpLiteral41.toSource((int) (byte) 10);
        regExpLiteral41.setFlags("-1\tSCRIPT -1 1\n");
        regExpLiteral41.removeProp(8);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(10, node36, (com.google.javascript.rhino.head.Node) scriptNode38, (com.google.javascript.rhino.head.Node) regExpLiteral41, 3);
        regExpLiteral41.setFlags("$0");
        regExpLiteral41.setRelative((-453175559));
        regExpLiteral41.putIntProp((int) (short) 10, 556794251);
        functionNode13.addRegExp(regExpLiteral41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode59 = functionNode13.getFunctionNode(363270187);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
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
        int int23 = functionNode16.getLength();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int26 = functionNode25.getBaseLineno();
        boolean boolean27 = functionNode25.isGetter();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral29 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        regExpLiteral29.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str32 = regExpLiteral29.getValue();
        regExpLiteral29.setFlags("52");
        functionNode25.addChildrenToFront((com.google.javascript.rhino.head.Node) regExpLiteral29);
        boolean boolean36 = functionNode25.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode37 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = functionNode37.getTop();
        int int39 = functionNode37.getRegexpCount();
        int int40 = functionNode37.getParamCount();
        com.google.javascript.rhino.head.ast.AstNode astNode41 = functionNode37.getBody();
        int int42 = functionNode25.addFunction(functionNode37);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode43 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int44 = functionNode43.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = functionNode43.getTop();
        boolean boolean46 = functionNode43.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList47 = functionNode43.getSymbols();
        int int48 = functionNode43.getLength();
        boolean boolean49 = functionNode43.isGetterOrSetter();
        functionNode37.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode43);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode52 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope54 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode55 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode56 = functionNode55.getTop();
        functionNode55.setParens((int) (byte) 1, (int) (short) 1);
        functionNode55.setEncodedSourceStart((-1));
        functionNode55.setFunctionIsGetter();
        scope54.addChildToFront((com.google.javascript.rhino.head.Node) functionNode55);
        functionNode52.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode55);
        functionNode52.setFunctionIsSetter();
        boolean boolean66 = functionNode52.isExpressionClosure();
        functionNode52.putIntProp(7, (int) (byte) 0);
        com.google.javascript.rhino.head.ast.Jump jump70 = new com.google.javascript.rhino.head.ast.Jump(4, (com.google.javascript.rhino.head.Node) functionNode52);
        functionNode37.addChildToFront((com.google.javascript.rhino.head.Node) jump70);
        com.google.javascript.rhino.head.Node node72 = jump70.getFirstChild();
        node72.setLineno((-1701742065));
        com.google.javascript.rhino.head.ast.FunctionNode functionNode76 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int77 = functionNode76.getLp();
        functionNode76.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode80 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int81 = functionNode80.getLp();
        functionNode80.setEncodedSource("");
        functionNode80.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode86 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int87 = functionNode86.getLp();
        com.google.javascript.rhino.head.Node node89 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode76, (com.google.javascript.rhino.head.Node) functionNode80, (com.google.javascript.rhino.head.Node) functionNode86, (int) '#');
        functionNode86.setEncodedSourceStart(25);
        int int92 = functionNode86.getAbsolutePosition();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator93 = functionNode86.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode16.replaceChildAfter(node72, (com.google.javascript.rhino.head.Node) functionNode86);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
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
        boolean boolean30 = functionNode7.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.AstNode astNode31 = functionNode7.getBody();
        java.util.List<com.google.javascript.rhino.head.Node> nodeList32 = functionNode7.getResumptionPoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode34 = functionNode7.getFunctionNode(987694010);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLp((int) (short) 1);
        int int6 = functionNode0.getIntProp(4, 26);
        functionNode0.flattenSymbolTable(true);
        java.lang.Object obj10 = functionNode0.getProp(0);
        int int11 = functionNode0.getEncodedSourceStart();
        java.util.List<com.google.javascript.rhino.head.Node> nodeList12 = functionNode0.getResumptionPoints();
        int int13 = functionNode0.getBaseLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = functionNode0.getRegexpFlags(136);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = functionNode1.debugPrint();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        functionNode0.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode3);
        com.google.javascript.rhino.head.ast.AstRoot astRoot13 = functionNode3.getAstRoot();
        functionNode3.setIsExpressionClosure(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = functionNode16.getTop();
        functionNode16.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor21 = functionNode16.iterator();
        functionNode16.setFunctionIsSetter();
        int int23 = functionNode3.addFunction(functionNode16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = functionNode16.getRegexpFlags(747370658);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
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
        com.google.javascript.rhino.head.ast.Jump jump22 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump22.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump26 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump22, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int29 = scriptNode28.getEndLineno();
        int int30 = scriptNode28.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList31 = scriptNode28.getChildScopes();
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump22, (com.google.javascript.rhino.head.Node) scriptNode28);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList33 = scriptNode28.getFunctions();
        functionNodeList33.clear();
        com.google.javascript.rhino.head.ast.Jump jump39 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump39.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump43 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump39, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int46 = scriptNode45.getEndLineno();
        int int47 = scriptNode45.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList48 = scriptNode45.getChildScopes();
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump39, (com.google.javascript.rhino.head.Node) scriptNode45);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList50 = scriptNode45.getFunctions();
        boolean boolean51 = functionNodeList33.removeAll((java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList50);
        boolean boolean52 = functionNodeList15.addAll(0, (java.util.Collection<com.google.javascript.rhino.head.ast.FunctionNode>) functionNodeList33);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int55 = scriptNode54.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol57 = scriptNode54.getSymbol("hi!");
        java.lang.String str58 = scriptNode54.getEncodedSource();
        boolean boolean59 = functionNodeList33.remove((java.lang.Object) scriptNode54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode61 = scriptNode54.getFunctionNode(35);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = functionNode11.toSource();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
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
        boolean boolean33 = functionNode3.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str35 = functionNode3.getRegexpString(679712221);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        int int2 = functionNode0.getRegexpCount();
        int int3 = functionNode0.getLp();
        functionNode0.setEndLineno((int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = functionNode0.getEnclosingFunction();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = functionNode0.toSource(88879802);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        functionNode3.setEncodedSourceStart((-1));
        functionNode3.setFunctionIsGetter();
        scope2.addChildToFront((com.google.javascript.rhino.head.Node) functionNode3);
        functionNode3.setRp(19);
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
        java.lang.String str31 = functionNode3.toStringTree(scriptNode22);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode33 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int34 = functionNode33.getBaseLineno();
        functionNode33.setSourceName("                                                                                                                                                                                                        /null/");
        functionNode33.setRequiresActivation();
        com.google.javascript.rhino.head.Node node38 = functionNode33.target;
        int int39 = functionNode33.getLength();
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) scriptNode22, (com.google.javascript.rhino.head.Node) functionNode33, 556794251);
        int int42 = functionNode33.getAbsolutePosition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str44 = functionNode33.getRegexpFlags((-308074801));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) 'a', "^");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral4 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str6 = regExpLiteral4.toSource((int) (byte) 10);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = regExpLiteral4.new NodeIterator();
        java.lang.String str9 = regExpLiteral4.toSource(100);
        java.lang.String str10 = regExpLiteral4.getJsDoc();
        java.lang.String str11 = regExpLiteral4.getFlags();
        com.google.javascript.rhino.head.ast.Scope scope13 = new com.google.javascript.rhino.head.ast.Scope(18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChild((com.google.javascript.rhino.head.Node) regExpLiteral4, (com.google.javascript.rhino.head.Node) scope13);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
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
        com.google.javascript.rhino.head.ast.Comment comment77 = functionNode36.getJsDocNode();
        java.lang.Object obj78 = functionNode36.getCompilerData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str80 = functionNode36.getRegexpString(7);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((-346319059));
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
        functionNode13.setEncodedSourceStart(25);
        int int19 = functionNode13.getAbsolutePosition();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator20 = functionNode13.spliterator();
        com.google.javascript.rhino.head.Token.CommentType commentType23 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment25 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType23, "109");
        java.lang.String str27 = comment25.toSource((int) (byte) 10);
        functionNode13.setJsDocNode(comment25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node29 = scriptNode1.getChildBefore((com.google.javascript.rhino.head.Node) comment25);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        com.google.javascript.rhino.head.ast.Scope scope2 = functionNode1.getEnclosingScope();
        java.lang.Object obj3 = functionNode1.getCompilerData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = functionNode1.getRegexpString(11);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        com.google.javascript.rhino.head.ast.Scope scope0 = new com.google.javascript.rhino.head.ast.Scope();
        scope0.setBounds(0, 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = functionNode4.getTop();
        int int6 = functionNode4.getRegexpCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = functionNode4.getEnclosingFunction();
        java.lang.String str8 = scope0.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode4);
        int int9 = functionNode4.getRegexpCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int12 = scriptNode11.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int15 = scriptNode14.getEndLineno();
        scriptNode11.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode14);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode17 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int18 = functionNode17.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = functionNode17.getTop();
        boolean boolean20 = functionNode17.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int23 = scriptNode22.getEndLineno();
        int int24 = scriptNode22.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump27 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int30 = scriptNode29.getEndLineno();
        int int31 = scriptNode29.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList32 = scriptNode29.getChildScopes();
        jump27.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode29);
        java.lang.String str34 = scriptNode29.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode22, (com.google.javascript.rhino.head.ast.Scope) scriptNode29);
        com.google.javascript.rhino.head.ast.Scope scope36 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode29.target = scope36;
        functionNode17.addChildScope(scope36);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode14, (com.google.javascript.rhino.head.ast.Scope) functionNode17);
        int int40 = functionNode17.getFunctionCount();
        int int41 = functionNode17.getRp();
        functionNode17.setLength(16);
        functionNode4.addChild((com.google.javascript.rhino.head.ast.AstNode) functionNode17);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor45 = functionNode4.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = functionNode4.toSource(14);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
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
        com.google.javascript.rhino.head.ast.FunctionNode functionNode18 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = functionNode18.getTop();
        functionNode18.setParens((int) (byte) 1, (int) (short) 1);
        int int23 = functionNode18.getRp();
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newString((int) (byte) 100, "");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode27 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int28 = functionNode27.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str31 = functionNode27.toStringTree(scriptNode30);
        com.google.javascript.rhino.head.ast.Scope scope33 = scriptNode30.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList34 = scriptNode30.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int37 = scriptNode36.getEndLineno();
        int int38 = scriptNode36.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode30, (com.google.javascript.rhino.head.ast.Scope) scriptNode36);
        java.lang.String str40 = scriptNode36.getEncodedSource();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(136, (com.google.javascript.rhino.head.Node) functionNode18, node26, (com.google.javascript.rhino.head.Node) scriptNode36, (int) (short) 0);
        functionNode11.setParent((com.google.javascript.rhino.head.ast.AstNode) functionNode18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str45 = functionNode18.toSource((int) (short) 10);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLineno(0);
        boolean boolean4 = functionNode0.requiresActivation();
        int int5 = functionNode0.getFunctionCount();
        com.google.javascript.rhino.head.ast.Scope scope7 = functionNode0.getDefiningScope("                {\n                }\n");
        int int8 = functionNode0.getFunctionType();
        com.google.javascript.rhino.head.ast.AstNode astNode9 = functionNode0.getMemberExprNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = functionNode0.toSource((-298801392));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
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
        functionNode29.setPosition(52);
        functionNode29.setFunctionIsSetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str45 = functionNode29.debugPrint();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str4 = functionNode0.toStringTree(scriptNode3);
        java.lang.String str5 = functionNode0.shortName();
        boolean boolean6 = functionNode0.isGetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = functionNode0.debugPrint();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str65 = functionNode25.debugPrint();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
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
        com.google.javascript.rhino.head.ast.Jump jump26 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump26.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump30 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump26, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int33 = scriptNode32.getEndLineno();
        int int34 = scriptNode32.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList35 = scriptNode32.getChildScopes();
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump26, (com.google.javascript.rhino.head.Node) scriptNode32);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int39 = scriptNode38.getEndLineno();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral41 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str43 = regExpLiteral41.toSource((int) (byte) 10);
        regExpLiteral41.setFlags("-1\tSCRIPT -1 1\n");
        regExpLiteral41.removeProp(8);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(10, node36, (com.google.javascript.rhino.head.Node) scriptNode38, (com.google.javascript.rhino.head.Node) regExpLiteral41, 3);
        regExpLiteral41.setFlags("$0");
        regExpLiteral41.setRelative((-453175559));
        regExpLiteral41.putIntProp((int) (short) 10, 556794251);
        functionNode13.addRegExp(regExpLiteral41);
        functionNode13.putIntProp(17, 117130539);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str62 = functionNode13.toSource((-101));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
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
        java.lang.String str61 = functionNode25.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str63 = functionNode25.toSource((int) (short) 0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        com.google.javascript.rhino.head.Node node2 = scriptNode1.target;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = scriptNode1.toSource((-579957076));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode((-21173444));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = scriptNode1.getRegexpFlags((-555175474));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(521924401);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = functionNode1.getRegexpString(21);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = functionNode0.getSymbols();
        functionNode0.setRp(5);
        functionNode0.setParens((int) '#', 24);
        int int10 = functionNode0.getParamCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = functionNode0.getRegexpString(0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
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
        int int44 = functionNode0.getEncodedSourceStart();
        functionNode0.setIsGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = functionNode0.toSource(5);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = functionNode13.toSource((-1567854307));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
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
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = functionNode19.getTop();
        functionNode19.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode19);
        int int25 = functionNode19.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.Jump jump30 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump30.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump34 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump30, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int37 = scriptNode36.getEndLineno();
        int int38 = scriptNode36.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList39 = scriptNode36.getChildScopes();
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump30, (com.google.javascript.rhino.head.Node) scriptNode36);
        java.lang.String str41 = scriptNode36.getSourceName();
        functionNode19.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode36);
        java.lang.String str43 = scriptNode36.getNextTempName();
        scriptNode36.setBaseLineno(109);
        functionNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode36);
        java.lang.String str47 = scriptNode36.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str49 = scriptNode36.getRegexpFlags((-1549624750));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        java.lang.String str5 = scriptNode4.getJsDoc();
        com.google.javascript.rhino.head.Node node7 = scriptNode4.setType(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int9 = functionNode8.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str12 = functionNode8.toStringTree(scriptNode11);
        com.google.javascript.rhino.head.ast.Scope scope14 = scriptNode11.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList15 = scriptNode11.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int18 = scriptNode17.getEndLineno();
        int int19 = scriptNode17.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode11, (com.google.javascript.rhino.head.ast.Scope) scriptNode17);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int23 = scriptNode22.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int26 = scriptNode25.getEndLineno();
        scriptNode22.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode25);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode28 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int29 = functionNode28.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = functionNode28.getTop();
        boolean boolean31 = functionNode28.hasSideEffects();
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
        com.google.javascript.rhino.head.ast.Scope scope47 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode40.target = scope47;
        functionNode28.addChildScope(scope47);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode25, (com.google.javascript.rhino.head.ast.Scope) functionNode28);
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node(20, (com.google.javascript.rhino.head.Node) scriptNode4, (com.google.javascript.rhino.head.Node) scriptNode11, (com.google.javascript.rhino.head.Node) scriptNode25);
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node(136, (com.google.javascript.rhino.head.Node) scriptNode25);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode53 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = functionNode53.getTop();
        functionNode53.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode58 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope60 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode61 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode62 = functionNode61.getTop();
        functionNode61.setParens((int) (byte) 1, (int) (short) 1);
        functionNode61.setEncodedSourceStart((-1));
        functionNode61.setFunctionIsGetter();
        scope60.addChildToFront((com.google.javascript.rhino.head.Node) functionNode61);
        functionNode58.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode61);
        functionNode58.setFunctionIsSetter();
        int int72 = functionNode53.addFunction(functionNode58);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode73 = functionNode58.getTop();
        java.lang.String str74 = scriptNode73.getJsDoc();
        com.google.javascript.rhino.head.ast.Jump jump77 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode79 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int80 = scriptNode79.getEndLineno();
        int int81 = scriptNode79.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList82 = scriptNode79.getChildScopes();
        jump77.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode79);
        java.lang.String str84 = scriptNode79.debugPrint();
        com.google.javascript.rhino.head.Node node86 = new com.google.javascript.rhino.head.Node((-238258924), (com.google.javascript.rhino.head.Node) scriptNode25, (com.google.javascript.rhino.head.Node) scriptNode73, (com.google.javascript.rhino.head.Node) scriptNode79, 100);
        int int87 = scriptNode73.getRegexpCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str89 = scriptNode73.toSource((-461800237));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
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
        boolean boolean93 = functionNode89.isSetter();
        java.lang.String str94 = functionNode89.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str96 = functionNode89.getRegexpFlags(129);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
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
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int20 = functionNode19.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = functionNode19.getTop();
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode19);
        functionNode19.setPosition(670868847);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope27 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode28 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = functionNode28.getTop();
        functionNode28.setParens((int) (byte) 1, (int) (short) 1);
        functionNode28.setEncodedSourceStart((-1));
        functionNode28.setFunctionIsGetter();
        scope27.addChildToFront((com.google.javascript.rhino.head.Node) functionNode28);
        functionNode25.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode28);
        functionNode25.setRequiresActivation();
        boolean boolean39 = functionNode25.isExpressionClosure();
        functionNode25.setSourceName("hi!");
        int int42 = functionNode25.getFunctionCount();
        functionNode19.setParent((com.google.javascript.rhino.head.ast.AstNode) functionNode25);
        functionNode11.addParam((com.google.javascript.rhino.head.ast.AstNode) functionNode19);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode45 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int46 = functionNode45.getLp();
        functionNode45.setLp((int) (short) 1);
        int int51 = functionNode45.getIntProp(4, 26);
        functionNode45.flattenSymbolTable(true);
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
        boolean boolean76 = functionNode54.isGetter();
        int int77 = functionNode45.addFunction(functionNode54);
        int int78 = functionNode19.addFunction(functionNode54);
        com.google.javascript.rhino.head.Token.CommentType commentType85 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment87 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType85, "109");
        com.google.javascript.rhino.head.ast.Comment comment89 = new com.google.javascript.rhino.head.ast.Comment(3, (-1), commentType85, "FunctionNode");
        com.google.javascript.rhino.head.ast.Comment comment91 = new com.google.javascript.rhino.head.ast.Comment(10, 514758316, commentType85, "    ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node92 = functionNode54.getChildBefore((com.google.javascript.rhino.head.Node) comment91);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(6);
        functionNode1.setIsExpressionClosure(true);
        boolean boolean4 = functionNode1.isSetter();
        functionNode1.setFunctionIsSetter();
        boolean boolean6 = functionNode1.isGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = functionNode1.toSource((int) (short) 100);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str55 = functionNode0.toSource(24);
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
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = functionNode1.getChildScopes();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int17 = functionNode16.getLp();
        functionNode16.setIsExpressionClosure(false);
        com.google.javascript.rhino.head.ast.Scope scope20 = functionNode16.getParentScope();
        int int21 = functionNode16.getFunctionType();
        functionNode1.replaceWith((com.google.javascript.rhino.head.ast.Scope) functionNode16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = functionNode1.toSource();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = functionNode16.toSource(0);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
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
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode8.target = scope15;
        com.google.javascript.rhino.head.ast.Jump jump20 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump20.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump24 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump20, 0);
        com.google.javascript.rhino.head.ast.Jump jump28 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump28.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump32 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump28, 0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode33 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int34 = functionNode33.getLp();
        functionNode33.setEncodedSource("");
        functionNode33.flattenSymbolTable(false);
        jump20.addChildAfter((com.google.javascript.rhino.head.Node) jump28, (com.google.javascript.rhino.head.Node) functionNode33);
        com.google.javascript.rhino.head.Node node40 = functionNode33.target;
        boolean boolean41 = functionNode33.hasConsistentReturnUsage();
        scriptNode8.addChildToFront((com.google.javascript.rhino.head.Node) functionNode33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode44 = scriptNode8.getFunctionNode(1888037509);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
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
        int int17 = scriptNode2.getType();
        com.google.javascript.rhino.head.ast.Symbol symbol19 = scriptNode2.getSymbol("109");
        java.lang.String str20 = scriptNode2.toSource();
        int int21 = scriptNode2.getEncodedSourceEnd();
        int int22 = scriptNode2.getFunctionCount();
        com.google.javascript.rhino.head.Node node23 = scriptNode2.getLastSibling();
        int int24 = scriptNode2.getType();
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(556794251, (com.google.javascript.rhino.head.Node) scriptNode2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode27 = scriptNode2.getFunctionNode((-1233054699));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral2 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) -1, (-238258924));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int5 = scriptNode4.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol7 = scriptNode4.getSymbol("hi!");
        java.lang.String str8 = scriptNode4.getEncodedSource();
        int int9 = scriptNode4.getType();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList10 = scriptNode4.getStatements();
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node((-1147087024), 487495188);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        regExpLiteral2.replaceChild((com.google.javascript.rhino.head.Node) scriptNode4, node13);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
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
        functionNode25.flattenSymbolTable(true);
        functionNode25.setLp(4);
        int int33 = functionNode25.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = functionNode25.toSource();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
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
        functionNode20.setParens((-1), 670868847);
        functionNode20.setBaseLineno(26);
        int int35 = functionNode20.getFunctionType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = functionNode20.toSource((int) (short) 100);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode2 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int3 = functionNode2.getLp();
        functionNode2.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope8 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = functionNode9.getTop();
        functionNode9.setParens((int) (byte) 1, (int) (short) 1);
        functionNode9.setEncodedSourceStart((-1));
        functionNode9.setFunctionIsGetter();
        scope8.addChildToFront((com.google.javascript.rhino.head.Node) functionNode9);
        functionNode6.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode9);
        int int19 = functionNode2.addFunction(functionNode6);
        java.lang.Object obj20 = functionNode6.getCompilerData();
        boolean boolean21 = functionNode6.requiresActivation();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int25 = scriptNode24.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol27 = scriptNode24.getSymbol("hi!");
        java.lang.String str28 = scriptNode24.getEncodedSource();
        com.google.javascript.rhino.head.ast.Jump jump29 = new com.google.javascript.rhino.head.ast.Jump((int) (byte) 10, (com.google.javascript.rhino.head.Node) scriptNode24);
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
        functionNode30.removeProp((int) (short) 100);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode54 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int55 = functionNode54.getLp();
        functionNode54.setLp((int) (short) 1);
        int int60 = functionNode54.getIntProp(4, 26);
        boolean boolean61 = functionNode54.hasChildren();
        java.lang.String str62 = functionNode54.getNextTempName();
        functionNode30.replaceWith((com.google.javascript.rhino.head.ast.Scope) functionNode54);
        functionNode54.setLp((-22));
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node((int) (short) -1, (com.google.javascript.rhino.head.Node) functionNode6, (com.google.javascript.rhino.head.Node) jump29, (com.google.javascript.rhino.head.Node) functionNode54, 670868847);
        com.google.javascript.rhino.head.ast.Jump jump68 = new com.google.javascript.rhino.head.ast.Jump((-555175474), (com.google.javascript.rhino.head.Node) functionNode6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str70 = functionNode6.toSource((int) '#');
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode0.getTop();
        boolean boolean3 = functionNode0.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = functionNode0.getSymbols();
        int int5 = functionNode0.getLength();
        int int6 = functionNode0.depth();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = functionNode0.getRegexpString((-555175474));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        int int7 = functionNode0.getIntProp((int) (short) 100, (int) (byte) 10);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator8 = functionNode0.spliterator();
        java.lang.String str9 = functionNode0.getJsDoc();
        functionNode0.setFunctionIsSetter();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral12 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str14 = regExpLiteral12.toSource((int) (byte) 10);
        regExpLiteral12.setLineno(0);
        regExpLiteral12.setValue("EOF");
        java.lang.String str20 = regExpLiteral12.toSource(23);
        functionNode0.addRegExp(regExpLiteral12);
        java.lang.String str22 = regExpLiteral12.getValue();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral26 = new com.google.javascript.rhino.head.ast.RegExpLiteral(6, 26);
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((-562099057), (com.google.javascript.rhino.head.Node) regExpLiteral26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node28 = regExpLiteral12.getChildBefore(node27);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        com.google.javascript.rhino.head.ast.Jump jump3 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int6 = scriptNode5.getEndLineno();
        int int7 = scriptNode5.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList8 = scriptNode5.getChildScopes();
        jump3.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode5);
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
        jump3.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode11);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int27 = functionNode26.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str30 = functionNode26.toStringTree(scriptNode29);
        com.google.javascript.rhino.head.ast.Scope scope32 = scriptNode29.getDefiningScope("");
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList33 = scriptNode29.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int36 = scriptNode35.getEndLineno();
        int int37 = scriptNode35.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode29, (com.google.javascript.rhino.head.ast.Scope) scriptNode35);
        jump3.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode29);
        java.lang.String str41 = scriptNode29.toSource(22);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator42 = scriptNode29.spliterator();
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((-522402608), (com.google.javascript.rhino.head.Node) scriptNode29);
        com.google.javascript.rhino.head.ast.Symbol symbol45 = scriptNode29.getSymbol("                                                                                                        /null/-1\tSCRIPT -1 1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode47 = scriptNode29.getFunctionNode(1128807879);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(0, (int) '4');
        node2.setLineno(20134776);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int7 = scriptNode6.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int10 = scriptNode9.getEndLineno();
        scriptNode6.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode9);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator12 = scriptNode6.new NodeIterator();
        boolean boolean13 = nodeIterator12.hasNext();
        boolean boolean14 = nodeIterator12.hasNext();
        boolean boolean15 = nodeIterator12.hasNext();
        com.google.javascript.rhino.head.Node node16 = nodeIterator12.next();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral19 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (byte) 10, (-811062427));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.addChildBefore(node16, (com.google.javascript.rhino.head.Node) regExpLiteral19);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
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
        functionNode1.setRequiresActivation();
        java.util.List<com.google.javascript.rhino.head.Node> nodeList21 = functionNode1.getResumptionPoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = functionNode1.toSource(7);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
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
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int20 = functionNode19.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = functionNode19.getTop();
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode19);
        functionNode19.setPosition(670868847);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode25 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope27 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode28 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = functionNode28.getTop();
        functionNode28.setParens((int) (byte) 1, (int) (short) 1);
        functionNode28.setEncodedSourceStart((-1));
        functionNode28.setFunctionIsGetter();
        scope27.addChildToFront((com.google.javascript.rhino.head.Node) functionNode28);
        functionNode25.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode28);
        functionNode25.setRequiresActivation();
        boolean boolean39 = functionNode25.isExpressionClosure();
        functionNode25.setSourceName("hi!");
        int int42 = functionNode25.getFunctionCount();
        functionNode19.setParent((com.google.javascript.rhino.head.ast.AstNode) functionNode25);
        functionNode11.addParam((com.google.javascript.rhino.head.ast.AstNode) functionNode19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode46 = functionNode11.getFunctionNode(987694010);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
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
        functionNode1.setRequiresActivation();
        boolean boolean21 = functionNode1.isSetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = functionNode1.toSource((-309200032));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        com.google.javascript.rhino.head.ast.Symbol symbol0 = new com.google.javascript.rhino.head.ast.Symbol();
        symbol0.setIndex(6);
        java.lang.String str3 = symbol0.getDeclTypeName();
        com.google.javascript.rhino.head.ast.Scope scope4 = symbol0.getContainingTable();
        com.google.javascript.rhino.head.Node node5 = symbol0.getNode();
        com.google.javascript.rhino.head.ast.Symbol symbol6 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str7 = symbol6.getName();
        com.google.javascript.rhino.head.Node node8 = symbol6.getNode();
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump((int) ' ');
        symbol6.setNode((com.google.javascript.rhino.head.Node) jump10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int14 = functionNode13.getBaseLineno();
        functionNode13.setSourceName("                                                                                                                                                                                                        /null/");
        symbol6.setContainingTable((com.google.javascript.rhino.head.ast.Scope) functionNode13);
        java.lang.String str18 = functionNode13.getName();
        symbol0.setContainingTable((com.google.javascript.rhino.head.ast.Scope) functionNode13);
        com.google.javascript.rhino.head.ast.Name name20 = functionNode13.getFunctionName();
        java.lang.String str22 = functionNode13.makeIndent(7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = functionNode13.toSource(129);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
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
        scriptNode1.setSourceName("                    /null/");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode18 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = functionNode21.getTop();
        functionNode21.setParens((int) (byte) 1, (int) (short) 1);
        functionNode21.setEncodedSourceStart((-1));
        functionNode21.setFunctionIsGetter();
        scope20.addChildToFront((com.google.javascript.rhino.head.Node) functionNode21);
        functionNode18.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode21);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode31 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = functionNode31.getTop();
        functionNode31.setParens((int) (byte) 1, (int) (short) 1);
        functionNode31.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList38 = functionNode31.getResumptionPoints();
        int int39 = functionNode31.getLp();
        functionNode18.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode31);
        com.google.javascript.rhino.head.Node node41 = functionNode31.getNext();
        scriptNode1.addChildScope((com.google.javascript.rhino.head.ast.Scope) functionNode31);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode43 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = functionNode43.getTop();
        functionNode43.setParens((int) (byte) 1, (int) (short) 1);
        int int48 = functionNode43.getRp();
        int int49 = functionNode31.addFunction(functionNode43);
        functionNode43.setEncodedSourceEnd((-1147087024));
        com.google.javascript.rhino.head.ast.FunctionNode functionNode52 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int53 = functionNode52.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode55 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str56 = functionNode52.toStringTree(scriptNode55);
        functionNode52.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode58 = functionNode52.getBody();
        functionNode52.setParens(21, (int) '#');
        int int62 = functionNode52.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode43.removeChild((com.google.javascript.rhino.head.Node) functionNode52);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor5 = functionNode0.iterator();
        functionNode0.setLp(136);
        functionNode0.removeChildren();
        int int9 = functionNode0.getParamCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = functionNode0.toSource();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
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
        java.lang.String str44 = functionNode1.getJsDoc();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = functionNode1.toSource((-308074801));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = functionNode1.getTop();
        functionNode1.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode1);
        functionNode1.setRequiresActivation();
        java.lang.String str8 = functionNode1.shortName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = functionNode9.getTop();
        functionNode9.setParens((int) (byte) 1, (int) (short) 1);
        int int14 = functionNode9.getRp();
        int int15 = functionNode9.getAbsolutePosition();
        com.google.javascript.rhino.head.ast.AstNode astNode16 = functionNode9.getMemberExprNode();
        int int17 = functionNode9.getBaseLineno();
        functionNode1.addResumptionPoint((com.google.javascript.rhino.head.Node) functionNode9);
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap19 = functionNode9.getLiveLocals();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = functionNode9.toSource((-107629412));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(13);
        int int2 = functionNode1.getType();
        functionNode1.setRelative(987694010);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList5 = functionNode1.getStatements();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int7 = functionNode6.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str10 = functionNode6.toStringTree(scriptNode9);
        functionNode6.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode12 = functionNode6.getBody();
        functionNode6.setParens(21, (int) '#');
        int int16 = functionNode6.getLp();
        boolean boolean17 = functionNode6.isGetter();
        java.lang.Object obj19 = functionNode6.getProp(136);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int21 = functionNode20.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = functionNode20.getTop();
        boolean boolean23 = functionNode20.hasSideEffects();
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
        functionNode20.addChildScope(scope39);
        boolean boolean42 = functionNode20.hasConsistentReturnUsage();
        java.lang.String str43 = functionNode20.getNextTempName();
        functionNode6.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) functionNode20);
        functionNode6.setBaseLineno(109);
        com.google.javascript.rhino.head.ast.AstNode astNode47 = functionNode6.getMemberExprNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode1.removeChild((com.google.javascript.rhino.head.Node) astNode47);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        functionNode0.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList7 = functionNode0.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope9 = functionNode0.getDefiningScope("hi!");
        boolean boolean10 = functionNode0.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol15 = scriptNode12.getSymbol("hi!");
        scriptNode12.putIntProp(3, 0);
        functionNode0.addResumptionPoint((com.google.javascript.rhino.head.Node) scriptNode12);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = functionNode21.getTop();
        functionNode21.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode21);
        int int27 = functionNode21.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.Jump jump32 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump32.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump36 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump32, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int39 = scriptNode38.getEndLineno();
        int int40 = scriptNode38.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList41 = scriptNode38.getChildScopes();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump32, (com.google.javascript.rhino.head.Node) scriptNode38);
        java.lang.String str43 = scriptNode38.getSourceName();
        functionNode21.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode38);
        functionNode0.setCompilerData((java.lang.Object) scriptNode38);
        int int46 = functionNode0.getEncodedSourceEnd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode48 = functionNode0.getFunctionNode(24);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int25 = scriptNode24.getEndLineno();
        int int26 = scriptNode24.getBaseLineno();
        scriptNode24.removeProp(0);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList29 = scriptNode24.getSymbols();
        functionNode0.setSymbols(symbolList29);
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral32 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str34 = regExpLiteral32.toSource((int) (byte) 10);
        regExpLiteral32.setFlags("-1\tSCRIPT -1 1\n");
        java.lang.String str38 = regExpLiteral32.toSource((int) (short) -1);
        java.lang.String str40 = regExpLiteral32.toSource(35);
        com.google.javascript.rhino.head.ast.Scope scope43 = new com.google.javascript.rhino.head.ast.Scope(19, 0);
        java.lang.String str44 = scope43.shortName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode0.replaceChild((com.google.javascript.rhino.head.Node) regExpLiteral32, (com.google.javascript.rhino.head.Node) scope43);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int2 = functionNode1.getBaseLineno();
        functionNode1.setPosition((int) '#');
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
        com.google.javascript.rhino.head.ast.Comment comment20 = functionNode16.getJsDocNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope23 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = functionNode24.getTop();
        functionNode24.setParens((int) (byte) 1, (int) (short) 1);
        functionNode24.setEncodedSourceStart((-1));
        functionNode24.setFunctionIsGetter();
        scope23.addChildToFront((com.google.javascript.rhino.head.Node) functionNode24);
        functionNode21.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode24);
        boolean boolean34 = functionNode16.isParam((com.google.javascript.rhino.head.ast.AstNode) functionNode21);
        functionNode16.setFunctionType(13);
        com.google.javascript.rhino.head.ast.Jump jump39 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.Scope scope41 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        jump39.addChildrenToBack((com.google.javascript.rhino.head.Node) scope41);
        jump39.setBounds(5, (int) (short) 10);
        boolean boolean46 = functionNode16.isParam((com.google.javascript.rhino.head.ast.AstNode) jump39);
        functionNode1.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode16);
        com.google.javascript.rhino.head.ast.Jump jump50 = new com.google.javascript.rhino.head.ast.Jump(5, 4);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator51 = jump50.spliterator();
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node(6, 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        functionNode16.addChildBefore((com.google.javascript.rhino.head.Node) jump50, node54);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        functionNode1.setEncodedSource("");
        functionNode1.flattenSymbolTable(false);
        boolean boolean7 = functionNode1.requiresActivation();
        java.lang.String str8 = functionNode1.getEncodedSource();
        boolean boolean9 = functionNode1.isGetter();
        functionNode1.setRp((-526076546));
        com.google.javascript.rhino.head.ast.FunctionNode functionNode13 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode14 = functionNode13.getEnclosingFunction();
        com.google.javascript.rhino.head.Node node15 = functionNode13.target;
        functionNode13.setLineno((int) (byte) -1);
        com.google.javascript.rhino.head.ast.Comment comment18 = functionNode13.getJsDocNode();
        int int19 = functionNode13.getBaseLineno();
        int int20 = functionNode13.getParamCount();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((-298801392), (com.google.javascript.rhino.head.Node) functionNode1, (com.google.javascript.rhino.head.Node) functionNode13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = functionNode1.toSource(11);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
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
        java.lang.String str22 = functionNode5.toSource((-309200032));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
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
        com.google.javascript.rhino.head.Token.CommentType commentType29 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType29, "109");
        java.lang.String str33 = comment31.toSource(0);
        java.lang.String str34 = comment31.getValue();
        functionNode0.setJsDocNode(comment31);
        com.google.javascript.rhino.head.Token.CommentType commentType38 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment40 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType38, "109");
        java.lang.String str42 = comment40.toSource(19);
        com.google.javascript.rhino.head.Token.CommentType commentType43 = comment40.getCommentType();
        comment31.setCommentType(commentType43);
        com.google.javascript.rhino.head.ast.Scope scope45 = new com.google.javascript.rhino.head.ast.Scope();
        scope45.setBounds(0, 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode49 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = functionNode49.getTop();
        int int51 = functionNode49.getRegexpCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode52 = functionNode49.getEnclosingFunction();
        java.lang.String str53 = scope45.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode49);
        comment31.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str56 = functionNode49.toSource(24);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral1 = new com.google.javascript.rhino.head.ast.RegExpLiteral((int) (short) 1);
        java.lang.String str3 = regExpLiteral1.toSource((int) (byte) 10);
        regExpLiteral1.setFlags("-1\tSCRIPT -1 1\n");
        regExpLiteral1.removeProp(8);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = new com.google.javascript.rhino.head.ast.FunctionNode((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node10 = regExpLiteral1.getChildBefore((com.google.javascript.rhino.head.Node) functionNode9);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope(100, 2);
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
        jump7.setPosition((int) (byte) -1);
        com.google.javascript.rhino.head.ast.Jump jump32 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump7);
        com.google.javascript.rhino.head.ast.Jump jump33 = new com.google.javascript.rhino.head.ast.Jump((-346319059), (com.google.javascript.rhino.head.Node) jump32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scope2.removeChild((com.google.javascript.rhino.head.Node) jump33);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
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
        com.google.javascript.rhino.head.ast.Scope scope25 = functionNode16.getEnclosingScope();
        functionNode16.flattenSymbolTable(true);
        int int28 = functionNode16.getLp();
        com.google.javascript.rhino.head.ast.Scope scope30 = functionNode16.getDefiningScope("        /null/52");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode32 = functionNode16.getFunctionNode((-283298566));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
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
        java.lang.String str17 = functionNode11.getName();
        functionNode11.setEndLineno(941175142);
        functionNode11.setRelative((-560439136));
        boolean boolean22 = functionNode11.isSetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = functionNode11.getFunctionNode(633301447);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLp((int) (short) 1);
        int int6 = functionNode0.getIntProp(4, 26);
        boolean boolean7 = functionNode0.hasChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = functionNode0.getRegexpFlags((-346319059));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        int int1 = scriptNode0.getEncodedSourceEnd();
        java.lang.String str3 = scriptNode0.toSource((int) (byte) 10);
        int int4 = scriptNode0.depth();
        boolean boolean5 = scriptNode0.hasChildren();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int7 = functionNode6.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str10 = functionNode6.toStringTree(scriptNode9);
        functionNode6.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode12 = functionNode6.getBody();
        functionNode6.setParens(21, (int) '#');
        int int16 = functionNode6.getLp();
        com.google.javascript.rhino.head.ast.Jump jump21 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump21.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump25 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump21, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int28 = scriptNode27.getEndLineno();
        int int29 = scriptNode27.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList30 = scriptNode27.getChildScopes();
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump21, (com.google.javascript.rhino.head.Node) scriptNode27);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList32 = scriptNode27.getChildScopes();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList33 = scriptNode27.getSymbols();
        functionNode6.setSymbols(symbolList33);
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) functionNode6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = functionNode6.toSource((int) (byte) 100);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
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
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList20 = functionNode5.getParams();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode22 = functionNode5.getFunctionNode((-21173444));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int2 = functionNode1.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = functionNode1.getTop();
        boolean boolean4 = functionNode1.hasSideEffects();
        java.lang.String str5 = functionNode1.toString();
        functionNode1.setParens((int) (short) 10, 8);
        com.google.javascript.rhino.head.ast.Jump jump10 = new com.google.javascript.rhino.head.ast.Jump(22, (com.google.javascript.rhino.head.Node) functionNode1, 12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = functionNode1.getRegexpString((-413436582));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
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
        int int17 = scriptNode2.getType();
        com.google.javascript.rhino.head.ast.Symbol symbol19 = scriptNode2.getSymbol("109");
        java.lang.String str20 = scriptNode2.toSource();
        int int21 = scriptNode2.getEncodedSourceEnd();
        int int22 = scriptNode2.getFunctionCount();
        com.google.javascript.rhino.head.Node node23 = scriptNode2.getLastSibling();
        int int24 = scriptNode2.getType();
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(556794251, (com.google.javascript.rhino.head.Node) scriptNode2);
        boolean boolean26 = scriptNode2.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = scriptNode2.getRegexpFlags(21);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
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
        com.google.javascript.rhino.head.ast.FunctionNode functionNode27 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = functionNode27.getTop();
        functionNode27.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode32 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope34 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode35 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = functionNode35.getTop();
        functionNode35.setParens((int) (byte) 1, (int) (short) 1);
        functionNode35.setEncodedSourceStart((-1));
        functionNode35.setFunctionIsGetter();
        scope34.addChildToFront((com.google.javascript.rhino.head.Node) functionNode35);
        functionNode32.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode35);
        functionNode32.setFunctionIsSetter();
        int int46 = functionNode27.addFunction(functionNode32);
        functionNode27.setEncodedSourceStart(1);
        boolean boolean49 = functionNode27.isExpressionClosure();
        com.google.javascript.rhino.head.Node node50 = functionNode27.target;
        int int51 = functionNode0.addFunction(functionNode27);
        functionNode0.setBaseLineno(668794709);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode55 = new com.google.javascript.rhino.head.ast.ScriptNode();
        int int56 = scriptNode55.getEncodedSourceEnd();
        java.lang.String str58 = scriptNode55.toSource((int) (byte) 10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot59 = scriptNode55.getAstRoot();
        com.google.javascript.rhino.head.ast.Jump jump60 = new com.google.javascript.rhino.head.ast.Jump(16, (com.google.javascript.rhino.head.Node) scriptNode55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node61 = functionNode0.getChildBefore((com.google.javascript.rhino.head.Node) scriptNode55);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        java.lang.String str4 = functionNode0.toStringTree(scriptNode3);
        functionNode0.setFunctionIsGetter();
        com.google.javascript.rhino.head.ast.AstNode astNode6 = functionNode0.getBody();
        functionNode0.setParens(21, (int) '#');
        int int10 = functionNode0.getLineno();
        functionNode0.setRp(9);
        java.lang.String str13 = functionNode0.getNextTempName();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral15 = new com.google.javascript.rhino.head.ast.RegExpLiteral(26);
        functionNode0.addRegExp(regExpLiteral15);
        com.google.javascript.rhino.head.ast.Symbol symbol17 = new com.google.javascript.rhino.head.ast.Symbol();
        java.lang.String str18 = symbol17.getName();
        com.google.javascript.rhino.head.Node node19 = symbol17.getNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode((-1));
        symbol17.setNode((com.google.javascript.rhino.head.Node) functionNode21);
        com.google.javascript.rhino.head.ast.AstNode astNode23 = functionNode21.getMemberExprNode();
        int int24 = functionNode21.getFunctionCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node25 = regExpLiteral15.getChildBefore((com.google.javascript.rhino.head.Node) functionNode21);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = scriptNode12.getRegexpFlags((-1549624750));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLineno(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int5 = functionNode4.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = functionNode4.getTop();
        boolean boolean7 = functionNode4.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList8 = functionNode4.getSymbols();
        functionNode4.setRp(5);
        com.google.javascript.rhino.head.ast.Scope scope11 = functionNode4.getEnclosingScope();
        functionNode4.setLineno(5);
        functionNode0.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) functionNode4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = functionNode4.getRegexpString((int) (byte) 0);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(100, 20);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = functionNode3.getTop();
        functionNode3.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.ast.Scope scope8 = new com.google.javascript.rhino.head.ast.Scope();
        scope8.setBounds(0, 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = functionNode12.getTop();
        int int14 = functionNode12.getRegexpCount();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode15 = functionNode12.getEnclosingFunction();
        java.lang.String str16 = scope8.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) functionNode12);
        functionNode12.setEncodedSourceBounds(2, 32);
        functionNode3.addResumptionPoint((com.google.javascript.rhino.head.Node) functionNode12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild((com.google.javascript.rhino.head.Node) functionNode12);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        com.google.javascript.rhino.head.ast.Scope scope3 = functionNode0.getDefiningScope("109");
        functionNode0.setIsGenerator();
        boolean boolean5 = functionNode0.isGetter();
        boolean boolean6 = functionNode0.isGenerator();
        java.util.List<com.google.javascript.rhino.head.Node> nodeList7 = functionNode0.getResumptionPoints();
        java.lang.Object obj8 = functionNode0.getCompilerData();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList9 = functionNode0.getStatements();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode10 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int11 = functionNode10.getLp();
        functionNode10.setLineno(0);
        boolean boolean14 = functionNode10.requiresActivation();
        int int15 = functionNode10.getFunctionCount();
        com.google.javascript.rhino.head.ast.Scope scope17 = functionNode10.getDefiningScope("                {\n                }\n");
        int int18 = functionNode10.getFunctionType();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = functionNode10.getTop();
        functionNode0.addParam((com.google.javascript.rhino.head.ast.AstNode) scriptNode19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode22 = scriptNode19.getFunctionNode((-375272218));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
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
        boolean boolean50 = scriptNode2.hasSideEffects();
        com.google.javascript.rhino.head.Node node51 = scriptNode2.target;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str52 = scriptNode2.debugPrint();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
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
        boolean boolean19 = functionNodeList15.isEmpty();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int21 = functionNode20.getLp();
        functionNode20.setLp((int) (short) 1);
        int int26 = functionNode20.getIntProp(4, 26);
        functionNode20.setFunctionIsGetter();
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap28 = functionNode20.getLiveLocals();
        int int29 = functionNodeList15.lastIndexOf((java.lang.Object) functionNode20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = functionNode20.toSource((-453175558));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = functionNode0.getTop();
        functionNode0.setParens((int) (byte) 1, (int) (short) 1);
        functionNode0.setEncodedSourceStart((-1));
        java.util.List<com.google.javascript.rhino.head.Node> nodeList7 = functionNode0.getResumptionPoints();
        com.google.javascript.rhino.head.ast.Scope scope9 = functionNode0.getDefiningScope("hi!");
        boolean boolean10 = functionNode0.isGetterOrSetter();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol15 = scriptNode12.getSymbol("hi!");
        scriptNode12.putIntProp(3, 0);
        functionNode0.addResumptionPoint((com.google.javascript.rhino.head.Node) scriptNode12);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode21 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = functionNode21.getTop();
        functionNode21.setParens((int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) functionNode21);
        int int27 = functionNode21.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.Jump jump32 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump32.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump36 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump32, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int39 = scriptNode38.getEndLineno();
        int int40 = scriptNode38.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList41 = scriptNode38.getChildScopes();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump32, (com.google.javascript.rhino.head.Node) scriptNode38);
        java.lang.String str43 = scriptNode38.getSourceName();
        functionNode21.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode38);
        functionNode0.setCompilerData((java.lang.Object) scriptNode38);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode47 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int48 = functionNode47.getLp();
        functionNode47.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode51 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int52 = functionNode51.getLp();
        functionNode51.setEncodedSource("");
        functionNode51.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode57 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int58 = functionNode57.getLp();
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode47, (com.google.javascript.rhino.head.Node) functionNode51, (com.google.javascript.rhino.head.Node) functionNode57, (int) '#');
        boolean boolean61 = functionNode57.isGenerator();
        boolean boolean62 = functionNode57.isGetterOrSetter();
        boolean boolean63 = functionNode57.hasSideEffects();
        java.lang.String str64 = functionNode57.getNextTempName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node65 = scriptNode38.getChildBefore((com.google.javascript.rhino.head.Node) functionNode57);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
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
        int int16 = functionNode11.getFunctionCount();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap17 = functionNode11.getSymbolTable();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = new com.google.javascript.rhino.head.ast.FunctionNode(0);
        int int20 = functionNode19.getBaseLineno();
        functionNode19.setPosition((int) '#');
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int25 = functionNode24.getLp();
        functionNode24.setEncodedSource("");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode28 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int29 = functionNode28.getLp();
        functionNode28.setEncodedSource("");
        functionNode28.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode34 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int35 = functionNode34.getLp();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) functionNode24, (com.google.javascript.rhino.head.Node) functionNode28, (com.google.javascript.rhino.head.Node) functionNode34, (int) '#');
        com.google.javascript.rhino.head.ast.Comment comment38 = functionNode34.getJsDocNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode39 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope41 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode42 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = functionNode42.getTop();
        functionNode42.setParens((int) (byte) 1, (int) (short) 1);
        functionNode42.setEncodedSourceStart((-1));
        functionNode42.setFunctionIsGetter();
        scope41.addChildToFront((com.google.javascript.rhino.head.Node) functionNode42);
        functionNode39.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode42);
        boolean boolean52 = functionNode34.isParam((com.google.javascript.rhino.head.ast.AstNode) functionNode39);
        functionNode34.setFunctionType(13);
        com.google.javascript.rhino.head.ast.Jump jump57 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.Scope scope59 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        jump57.addChildrenToBack((com.google.javascript.rhino.head.Node) scope59);
        jump57.setBounds(5, (int) (short) 10);
        boolean boolean64 = functionNode34.isParam((com.google.javascript.rhino.head.ast.AstNode) jump57);
        functionNode19.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode34);
        functionNode34.setIsExpressionClosure(true);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) functionNode11, (com.google.javascript.rhino.head.ast.Scope) functionNode34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str69 = functionNode11.debugPrint();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope(21);
        com.google.javascript.rhino.head.Token.CommentType commentType4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment(20, 1, commentType4, "109");
        java.lang.String str8 = comment6.toSource((int) (byte) 10);
        int int9 = comment6.getAbsolutePosition();
        com.google.javascript.rhino.head.Token.CommentType commentType14 = com.google.javascript.rhino.head.Token.CommentType.LINE;
        com.google.javascript.rhino.head.ast.Comment comment16 = new com.google.javascript.rhino.head.ast.Comment((int) (short) 1, (int) (byte) 100, commentType14, "                                                                                                                                                                                                        ");
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment(109, 0, commentType14, "/null/EOF");
        comment6.setCommentType(commentType14);
        comment6.removeChildren();
        java.lang.String str22 = comment6.toSource((-522402608));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node23 = scope1.getChildBefore((com.google.javascript.rhino.head.Node) comment6);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
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
        boolean boolean18 = functionNode4.requiresActivation();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList19 = functionNode4.getParams();
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
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList35 = functionNode21.getChildScopes();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int38 = scriptNode37.getEndLineno();
        int int39 = scriptNode37.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList40 = scriptNode37.getChildScopes();
        functionNode21.setMemberExprNode((com.google.javascript.rhino.head.ast.AstNode) scriptNode37);
        functionNode21.setEncodedSourceEnd((int) (short) 100);
        functionNode21.setLp((-1320570006));
        com.google.javascript.rhino.head.ast.FunctionNode functionNode46 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int47 = functionNode46.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = functionNode46.getTop();
        boolean boolean49 = functionNode46.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList50 = functionNode46.getSymbols();
        int int51 = functionNode46.getLength();
        int int52 = functionNode46.getRegexpCount();
        int int53 = functionNode21.compareTo((com.google.javascript.rhino.head.ast.AstNode) functionNode46);
        int int54 = functionNode21.getEncodedSourceStart();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node55 = functionNode4.getChildBefore((com.google.javascript.rhino.head.Node) functionNode21);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral2 = new com.google.javascript.rhino.head.ast.RegExpLiteral(6, 26);
        regExpLiteral2.setFlags("FunctionNode");
        java.lang.String str6 = regExpLiteral2.toSource(5);
        java.lang.String str7 = regExpLiteral2.getFlags();
        regExpLiteral2.removeChildren();
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node(22, 117130539);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        regExpLiteral2.removeChild(node11);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        functionNode0.setLp((int) (short) 1);
        int int6 = functionNode0.getIntProp(4, 26);
        functionNode0.setFunctionIsGetter();
        functionNode0.setPosition((int) (byte) 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int13 = scriptNode12.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int16 = scriptNode15.getEndLineno();
        scriptNode12.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode15);
        com.google.javascript.rhino.head.ast.Jump jump19 = new com.google.javascript.rhino.head.ast.Jump((int) 'a', (com.google.javascript.rhino.head.Node) scriptNode15, 987694010);
        com.google.javascript.rhino.head.Node node20 = jump19.getLastSibling();
        functionNode0.addChildToFront((com.google.javascript.rhino.head.Node) jump19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode23 = functionNode0.getFunctionNode((-1549624750));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int31 = scriptNode30.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int34 = scriptNode33.getEndLineno();
        scriptNode30.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode33);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode36 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int37 = functionNode36.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = functionNode36.getTop();
        boolean boolean39 = functionNode36.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int42 = scriptNode41.getEndLineno();
        int int43 = scriptNode41.getBaseLineno();
        com.google.javascript.rhino.head.ast.Jump jump46 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int49 = scriptNode48.getEndLineno();
        int int50 = scriptNode48.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList51 = scriptNode48.getChildScopes();
        jump46.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode48);
        java.lang.String str53 = scriptNode48.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode41, (com.google.javascript.rhino.head.ast.Scope) scriptNode48);
        com.google.javascript.rhino.head.ast.Scope scope55 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode48.target = scope55;
        functionNode36.addChildScope(scope55);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode33, (com.google.javascript.rhino.head.ast.Scope) functionNode36);
        int int59 = functionNode36.getFunctionCount();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) functionNode0, (com.google.javascript.rhino.head.ast.Scope) functionNode36);
        boolean boolean61 = functionNode0.isSetter();
        java.lang.String str62 = functionNode0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str64 = functionNode0.toSource((-555316823));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = functionNode16.getTop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = scriptNode24.getFunctionNode(12);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
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
        functionNode0.setEncodedSourceStart(7);
        functionNode0.setEncodedSourceBounds(41, 1179271826);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator34 = functionNode0.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = functionNode0.getRegexpString((-526076546));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
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
        com.google.javascript.rhino.head.ast.FunctionNode functionNode20 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int21 = functionNode20.getLp();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = functionNode20.getTop();
        boolean boolean23 = functionNode20.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList24 = functionNode20.getSymbols();
        int int25 = functionNode20.getLength();
        boolean boolean26 = functionNode20.isGetterOrSetter();
        functionNode14.addChildrenToFront((com.google.javascript.rhino.head.Node) functionNode20);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode29 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.Scope scope31 = new com.google.javascript.rhino.head.ast.Scope((int) (short) 10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode32 = new com.google.javascript.rhino.head.ast.FunctionNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = functionNode32.getTop();
        functionNode32.setParens((int) (byte) 1, (int) (short) 1);
        functionNode32.setEncodedSourceStart((-1));
        functionNode32.setFunctionIsGetter();
        scope31.addChildToFront((com.google.javascript.rhino.head.Node) functionNode32);
        functionNode29.setBody((com.google.javascript.rhino.head.ast.AstNode) functionNode32);
        functionNode29.setFunctionIsSetter();
        boolean boolean43 = functionNode29.isExpressionClosure();
        functionNode29.putIntProp(7, (int) (byte) 0);
        com.google.javascript.rhino.head.ast.Jump jump47 = new com.google.javascript.rhino.head.ast.Jump(4, (com.google.javascript.rhino.head.Node) functionNode29);
        functionNode14.addChildToFront((com.google.javascript.rhino.head.Node) jump47);
        com.google.javascript.rhino.head.ast.Jump jump53 = new com.google.javascript.rhino.head.ast.Jump((int) '4', 1);
        jump53.removeProp((int) 'a');
        com.google.javascript.rhino.head.ast.Jump jump57 = new com.google.javascript.rhino.head.ast.Jump((int) '#', (com.google.javascript.rhino.head.Node) jump53, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (byte) -1);
        int int60 = scriptNode59.getEndLineno();
        int int61 = scriptNode59.getBaseLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList62 = scriptNode59.getChildScopes();
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) jump53, (com.google.javascript.rhino.head.Node) scriptNode59);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList64 = scriptNode59.getFunctions();
        int int65 = scriptNode59.getPosition();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList66 = scriptNode59.getChildScopes();
        int int67 = scriptNode59.getEncodedSourceEnd();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList68 = scriptNode59.getSymbols();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor69 = scriptNode59.iterator();
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(161, (com.google.javascript.rhino.head.Node) functionNode14, (com.google.javascript.rhino.head.Node) scriptNode59);
        boolean boolean71 = functionNode14.isGetterOrSetter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str73 = functionNode14.toSource((-1549624750));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        com.google.javascript.rhino.head.ast.FunctionNode functionNode0 = new com.google.javascript.rhino.head.ast.FunctionNode();
        int int1 = functionNode0.getLp();
        java.util.Map<com.google.javascript.rhino.head.Node, int[]> nodeMap2 = functionNode0.getLiveLocals();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = functionNode0.getChildScopes();
        int int4 = functionNode0.getEncodedSourceStart();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = functionNode0.debugPrint();
    }
}

