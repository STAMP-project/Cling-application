import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compilerEnvirons0.getErrorReporter();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setRecordingComments(true);
        boolean boolean7 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean8 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons11.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter14 = compilerEnvirons11.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter14);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator17 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str19 = astRoot18.getNextTempName();
        java.lang.String str20 = astRoot18.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList22 = scriptNode21.getSymbols();
        java.lang.String str23 = astRoot18.toStringTree(scriptNode21);
        com.google.javascript.rhino.head.ast.Scope scope24 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope25 = new com.google.javascript.rhino.head.ast.Scope();
        scope24.addChild((com.google.javascript.rhino.head.ast.AstNode) scope25);
        int int27 = positionComparator17.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode21, (com.google.javascript.rhino.head.ast.AstNode) scope24);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str29 = astRoot28.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope30 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator31 = scope30.spliterator();
        astRoot28.addChildScope(scope30);
        java.lang.String str34 = astRoot28.toSource(9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList35 = astRoot28.getFunctions();
        com.google.javascript.rhino.head.ast.AstRoot astRoot37 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str38 = astRoot37.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot39 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode40 = astRoot39.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode41.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot37, (com.google.javascript.rhino.head.Node) astRoot39, (com.google.javascript.rhino.head.Node) scriptNode41);
        int int45 = positionComparator17.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot28, (com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot37, 24);
        astRoot37.removeChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = iRFactory15.transformTree(astRoot37);
        scriptNode49.setLength((-289553421));
        java.lang.String str52 = scriptNode49.shortName();
        scriptNode49.removeChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str55 = scriptNode49.getRegexpString(0);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getEndLineno();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet2 = astRoot0.getComments();
        int int3 = astRoot0.getRegexpCount();
        astRoot0.setLength((-112076812));
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str8 = astRoot7.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode10 = astRoot9.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode11.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot7, (com.google.javascript.rhino.head.Node) astRoot9, (com.google.javascript.rhino.head.Node) scriptNode11);
        com.google.javascript.rhino.head.Node node15 = astRoot7.getLastSibling();
        java.lang.String str17 = astRoot7.toSource(0);
        java.lang.String str18 = astRoot7.toSource();
        astRoot7.setInStrictMode(false);
        java.lang.String str21 = astRoot7.getEncodedSource();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator22 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str24 = astRoot23.getNextTempName();
        java.lang.String str25 = astRoot23.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList27 = scriptNode26.getSymbols();
        java.lang.String str28 = astRoot23.toStringTree(scriptNode26);
        com.google.javascript.rhino.head.ast.Scope scope29 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope30 = new com.google.javascript.rhino.head.ast.Scope();
        scope29.addChild((com.google.javascript.rhino.head.ast.AstNode) scope30);
        int int32 = positionComparator22.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode26, (com.google.javascript.rhino.head.ast.AstNode) scope29);
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str34 = astRoot33.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope35 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator36 = scope35.spliterator();
        astRoot33.addChildScope(scope35);
        java.lang.String str39 = astRoot33.toSource(9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList40 = astRoot33.getFunctions();
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str43 = astRoot42.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot44 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode45 = astRoot44.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode46.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot42, (com.google.javascript.rhino.head.Node) astRoot44, (com.google.javascript.rhino.head.Node) scriptNode46);
        int int50 = positionComparator22.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot33, (com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.ast.AstRoot astRoot52 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int53 = astRoot52.getEndLineno();
        java.lang.Object obj54 = astRoot52.getCompilerData();
        com.google.javascript.rhino.head.Node node55 = astRoot52.getFirstChild();
        astRoot42.putProp(2, (java.lang.Object) astRoot52);
        com.google.javascript.rhino.head.Node node57 = astRoot42.target;
        com.google.javascript.rhino.head.ast.Scope scope58 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator59 = scope58.spliterator();
        scope58.setRelative((int) (short) 10);
        com.google.javascript.rhino.head.Node node62 = scope58.target;
        com.google.javascript.rhino.head.ast.AstRoot astRoot63 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str64 = astRoot63.getNextTempName();
        java.lang.String str65 = astRoot63.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = astRoot63.getTop();
        int int67 = astRoot63.getParamCount();
        astRoot63.checkParentLinks();
        scope58.setParent((com.google.javascript.rhino.head.ast.AstNode) astRoot63);
        astRoot42.setTop((com.google.javascript.rhino.head.ast.ScriptNode) astRoot63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        astRoot0.replaceChild((com.google.javascript.rhino.head.Node) astRoot7, (com.google.javascript.rhino.head.Node) astRoot42);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str1 = astRoot0.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator3 = scope2.spliterator();
        astRoot0.addChildScope(scope2);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList5 = astRoot0.getChildScopes();
        astRoot0.checkParentLinks();
        int int7 = astRoot0.getEndLineno();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str10 = astRoot9.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode12 = astRoot11.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode13.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot9, (com.google.javascript.rhino.head.Node) astRoot11, (com.google.javascript.rhino.head.Node) scriptNode13);
        scriptNode13.setEncodedSourceStart(17);
        java.lang.Object obj19 = scriptNode13.getCompilerData();
        scriptNode13.putIntProp((int) '#', 938587703);
        java.lang.String str23 = scriptNode13.getEncodedSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node24 = astRoot0.getChildBefore((com.google.javascript.rhino.head.Node) scriptNode13);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator1 = positionComparator0.reversed();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator2 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator3 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator4 = positionComparator2.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator3);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator5 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator6 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator7 = positionComparator5.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator6);
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str10 = astRoot9.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode12 = astRoot11.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode13.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot9, (com.google.javascript.rhino.head.Node) astRoot11, (com.google.javascript.rhino.head.Node) scriptNode13);
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope(2, (int) (byte) -1);
        int int20 = positionComparator5.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot11, (com.google.javascript.rhino.head.ast.AstNode) scope19);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator21 = astNodeComparator4.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator5);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator22 = astNodeComparator21.reversed();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator23 = astNodeComparator21.reversed();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator24 = positionComparator0.thenComparing(astNodeComparator21);
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str26 = astRoot25.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope27 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator28 = scope27.spliterator();
        astRoot25.addChildScope(scope27);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList30 = astRoot25.getChildScopes();
        com.google.javascript.rhino.head.ast.Scope scope31 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope32 = new com.google.javascript.rhino.head.ast.Scope();
        scope31.addChild((com.google.javascript.rhino.head.ast.AstNode) scope32);
        boolean boolean34 = scope31.hasSideEffects();
        com.google.javascript.rhino.head.ast.Scope scope35 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope36 = new com.google.javascript.rhino.head.ast.Scope();
        scope35.addChild((com.google.javascript.rhino.head.ast.AstNode) scope36);
        com.google.javascript.rhino.head.ast.Scope.joinScopes(scope31, scope35);
        astRoot25.replaceWith(scope31);
        int int40 = astRoot25.getEndLineno();
        com.google.javascript.rhino.head.ast.AstRoot astRoot41 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int42 = astRoot41.getEndLineno();
        astRoot25.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot41);
        java.lang.String str45 = astRoot25.toSource(8);
        com.google.javascript.rhino.head.ast.AstRoot astRoot47 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str48 = astRoot47.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope49 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator50 = scope49.spliterator();
        astRoot47.addChildScope(scope49);
        java.lang.String str53 = astRoot47.toSource(9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot54 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str55 = astRoot54.getNextTempName();
        java.lang.String str56 = astRoot54.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList58 = scriptNode57.getSymbols();
        java.lang.String str59 = astRoot54.toStringTree(scriptNode57);
        com.google.javascript.rhino.head.ast.Scope scope60 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope61 = new com.google.javascript.rhino.head.ast.Scope();
        scope60.addChild((com.google.javascript.rhino.head.ast.AstNode) scope61);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope61.setTop(scriptNode63);
        java.lang.String str66 = scope61.toSource(12);
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot47, (com.google.javascript.rhino.head.Node) scriptNode57, (com.google.javascript.rhino.head.Node) scope61);
        int int68 = astRoot47.getEncodedSourceEnd();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator69 = astRoot47.spliterator();
        int int70 = astRoot47.depth();
        int int71 = positionComparator0.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot25, (com.google.javascript.rhino.head.ast.AstNode) astRoot47);
        boolean boolean72 = astRoot47.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str74 = astRoot47.getRegexpFlags((-1710880241));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList1 = scriptNode0.getSymbols();
        com.google.javascript.rhino.head.Node node2 = scriptNode0.getFirstChild();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList3 = scriptNode0.getSymbols();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode5 = astRoot4.getParent();
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope8 = new com.google.javascript.rhino.head.ast.Scope();
        scope7.addChild((com.google.javascript.rhino.head.ast.AstNode) scope8);
        com.google.javascript.rhino.head.Node node10 = scope8.getFirstChild();
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node((int) (byte) -1, (com.google.javascript.rhino.head.Node) scope8);
        astRoot4.target = node11;
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) astRoot4);
        int int14 = scriptNode0.getLength();
        int int15 = scriptNode0.getBaseLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = scriptNode0.getRegexpString((-1536851783));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        com.google.javascript.rhino.head.ast.Scope scope0 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope();
        scope0.addChild((com.google.javascript.rhino.head.ast.AstNode) scope1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode3);
        int int7 = scriptNode3.getIntProp((int) 'a', 19);
        scriptNode3.removeChildren();
        com.google.javascript.rhino.head.ast.Scope scope9 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope10 = new com.google.javascript.rhino.head.ast.Scope();
        scope9.addChild((com.google.javascript.rhino.head.ast.AstNode) scope10);
        boolean boolean12 = scope10.hasChildren();
        scope10.clearParentScope();
        scriptNode3.addChild((com.google.javascript.rhino.head.ast.AstNode) scope10);
        com.google.javascript.rhino.head.ast.AstNode astNode15 = scope10.getParent();
        com.google.javascript.rhino.head.Parser parser16 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = parser16.parse("$0", "AstRoot", (int) '#');
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str22 = astRoot21.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope23 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator24 = scope23.spliterator();
        astRoot21.addChildScope(scope23);
        astRoot20.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot21);
        com.google.javascript.rhino.head.ast.Symbol symbol28 = astRoot21.getSymbol("                  ");
        int int29 = astRoot21.getFunctionCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = astRoot30.getAstRoot();
        java.lang.String str32 = astRoot31.shortName();
        java.lang.String str33 = astRoot31.getSourceName();
        astRoot31.checkParentLinks();
        int int35 = astRoot31.depth();
        com.google.javascript.rhino.head.ast.AstRoot astRoot37 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int38 = astRoot37.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot39 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int40 = astRoot39.getEndLineno();
        java.lang.Object obj41 = astRoot39.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray42 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet43 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet43, commentArray42);
        astRoot39.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet43);
        astRoot39.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str48 = scriptNode47.getNextTempName();
        com.google.javascript.rhino.head.Node node49 = scriptNode47.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList50 = scriptNode47.getFunctions();
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot37, (com.google.javascript.rhino.head.Node) astRoot39, (com.google.javascript.rhino.head.Node) scriptNode47);
        astRoot37.setEncodedSourceBounds(21, (int) (short) 10);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet55 = astRoot37.getComments();
        astRoot31.target = astRoot37;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        astNode15.replaceChildAfter((com.google.javascript.rhino.head.Node) astRoot21, (com.google.javascript.rhino.head.Node) astRoot31);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str2 = astRoot1.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode4 = astRoot3.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot1, (com.google.javascript.rhino.head.Node) astRoot3, (com.google.javascript.rhino.head.Node) scriptNode5);
        int int9 = astRoot1.getParamCount();
        com.google.javascript.rhino.head.ast.Scope scope10 = new com.google.javascript.rhino.head.ast.Scope();
        scope10.clearParentScope();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot1, scope10);
        java.lang.String str13 = astRoot1.getEncodedSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons14.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = compilerEnvirons14.getErrorReporter();
        boolean boolean18 = compilerEnvirons14.isGenerateObserverCount();
        boolean boolean19 = compilerEnvirons14.recoverFromErrors();
        java.util.Set<java.lang.String> strSet20 = compilerEnvirons14.getActivationNames();
        compilerEnvirons14.setWarnTrailingComma(true);
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons14);
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = new com.google.javascript.rhino.head.ast.AstRoot(8);
        java.lang.String str26 = astRoot25.debugPrint();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = iRFactory23.transformTree(astRoot25);
        astRoot1.addChildToFront((com.google.javascript.rhino.head.Node) astRoot25);
        boolean boolean29 = astRoot25.hasConsistentReturnUsage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = astRoot25.getRegexpFlags((-470569664));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList1 = scriptNode0.getSymbols();
        com.google.javascript.rhino.head.Node node2 = scriptNode0.getFirstChild();
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int4 = astRoot3.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray5 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList6 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList6, symbolArray5);
        astRoot3.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList6);
        com.google.javascript.rhino.head.ast.Scope scope9 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope10 = new com.google.javascript.rhino.head.ast.Scope();
        scope9.addChild((com.google.javascript.rhino.head.ast.AstNode) scope10);
        astRoot3.addChildScope(scope10);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList13 = astRoot3.getStatements();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList14 = astRoot3.getSymbols();
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) astRoot3);
        java.lang.String str16 = scriptNode0.getJsDoc();
        int int17 = scriptNode0.getEndLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode19 = scriptNode0.getFunctionNode((int) '4');
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(278475323);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = scriptNode1.getFunctionNode((-1258487090));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        com.google.javascript.rhino.head.ast.Scope scope0 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope();
        scope0.addChild((com.google.javascript.rhino.head.ast.AstNode) scope1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode3);
        int int7 = scriptNode3.getIntProp((int) 'a', 19);
        int int8 = scriptNode3.getFunctionCount();
        scriptNode3.setEncodedSourceEnd(22);
        int int11 = scriptNode3.getFunctionCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons12.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = compilerEnvirons12.getErrorReporter();
        boolean boolean16 = compilerEnvirons12.isGenerateObserverCount();
        compilerEnvirons12.setRecordingComments(true);
        boolean boolean19 = compilerEnvirons12.isGenerateObserverCount();
        boolean boolean20 = compilerEnvirons12.isGenerateDebugInfo();
        compilerEnvirons12.setReservedKeywordAsIdentifier(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons23.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = compilerEnvirons23.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons12, errorReporter26);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator29 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str31 = astRoot30.getNextTempName();
        java.lang.String str32 = astRoot30.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList34 = scriptNode33.getSymbols();
        java.lang.String str35 = astRoot30.toStringTree(scriptNode33);
        com.google.javascript.rhino.head.ast.Scope scope36 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope37 = new com.google.javascript.rhino.head.ast.Scope();
        scope36.addChild((com.google.javascript.rhino.head.ast.AstNode) scope37);
        int int39 = positionComparator29.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode33, (com.google.javascript.rhino.head.ast.AstNode) scope36);
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str41 = astRoot40.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope42 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator43 = scope42.spliterator();
        astRoot40.addChildScope(scope42);
        java.lang.String str46 = astRoot40.toSource(9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList47 = astRoot40.getFunctions();
        com.google.javascript.rhino.head.ast.AstRoot astRoot49 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str50 = astRoot49.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot51 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode52 = astRoot51.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode53.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot49, (com.google.javascript.rhino.head.Node) astRoot51, (com.google.javascript.rhino.head.Node) scriptNode53);
        int int57 = positionComparator29.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot40, (com.google.javascript.rhino.head.ast.AstNode) astRoot49);
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot49, 24);
        astRoot49.removeChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode61 = iRFactory27.transformTree(astRoot49);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList62 = astRoot49.getChildScopes();
        java.lang.String str63 = astRoot49.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot64 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str65 = astRoot64.getNextTempName();
        java.lang.String str66 = astRoot64.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = astRoot64.getTop();
        astRoot64.setEncodedSourceEnd(520361644);
        astRoot49.setParent((com.google.javascript.rhino.head.ast.AstNode) astRoot64);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode3, (com.google.javascript.rhino.head.ast.Scope) astRoot49);
        astRoot49.clearParentScope();
        java.lang.String str73 = astRoot49.toSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str75 = astRoot49.getRegexpFlags(550287075);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.recoverFromErrors();
        boolean boolean5 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean8 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setGenerateDebugInfo(true);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        boolean boolean13 = compilerEnvirons0.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons14.setRecordingLocalJsDocComments(false);
        java.util.Set<java.lang.String> strSet17 = compilerEnvirons14.getActivationNames();
        boolean boolean18 = compilerEnvirons14.recoverFromErrors();
        boolean boolean19 = compilerEnvirons14.getWarnTrailingComma();
        boolean boolean20 = compilerEnvirons14.isIdeMode();
        boolean boolean21 = compilerEnvirons14.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons22.setStrictMode(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons25.setWarnTrailingComma(true);
        boolean boolean28 = compilerEnvirons25.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = compilerEnvirons25.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser30 = new com.google.javascript.rhino.head.Parser(compilerEnvirons22, errorReporter29);
        com.google.javascript.rhino.head.Parser parser31 = new com.google.javascript.rhino.head.Parser(compilerEnvirons14, errorReporter29);
        boolean boolean32 = compilerEnvirons14.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons33 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons33.setWarnTrailingComma(true);
        boolean boolean36 = compilerEnvirons33.isRecordingLocalJsDocComments();
        compilerEnvirons33.setWarnTrailingComma(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter39 = compilerEnvirons33.getErrorReporter();
        com.google.javascript.rhino.head.EvaluatorException evaluatorException45 = errorReporter39.runtimeError("$0", "                        {\n                        }\n", (int) (byte) 1, "$0", 100);
        com.google.javascript.rhino.head.Parser parser46 = new com.google.javascript.rhino.head.Parser(compilerEnvirons14, errorReporter39);
        boolean boolean47 = compilerEnvirons14.getWarnTrailingComma();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons48 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean49 = compilerEnvirons48.recoverFromErrors();
        int int50 = compilerEnvirons48.getLanguageVersion();
        com.google.javascript.rhino.head.ErrorReporter errorReporter51 = compilerEnvirons48.getErrorReporter();
        compilerEnvirons14.setErrorReporter(errorReporter51);
        com.google.javascript.rhino.head.IRFactory iRFactory53 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean54 = iRFactory53.eof();
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode0.toSource(0);
        scriptNode0.clearParentScope();
        boolean boolean4 = scriptNode0.hasChildren();
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str7 = astRoot6.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope8 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator9 = scope8.spliterator();
        astRoot6.addChildScope(scope8);
        java.lang.String str12 = astRoot6.toSource(9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot13 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str14 = astRoot13.getNextTempName();
        java.lang.String str15 = astRoot13.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList17 = scriptNode16.getSymbols();
        java.lang.String str18 = astRoot13.toStringTree(scriptNode16);
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope();
        scope19.addChild((com.google.javascript.rhino.head.ast.AstNode) scope20);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope20.setTop(scriptNode22);
        java.lang.String str25 = scope20.toSource(12);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot6, (com.google.javascript.rhino.head.Node) scriptNode16, (com.google.javascript.rhino.head.Node) scope20);
        astRoot6.setBaseLineno(19);
        scriptNode0.addChildToBack((com.google.javascript.rhino.head.Node) astRoot6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = scriptNode0.getRegexpString((int) ' ');
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str2 = astRoot1.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode4 = astRoot3.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot1, (com.google.javascript.rhino.head.Node) astRoot3, (com.google.javascript.rhino.head.Node) scriptNode5);
        int int9 = astRoot1.getParamCount();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator10 = astRoot1.spliterator();
        java.lang.Object obj11 = astRoot1.getCompilerData();
        int int14 = astRoot1.getIntProp((int) (short) 0, 1);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet15 = astRoot1.getComments();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = astRoot1.getRegexpFlags((-1282335040));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot(8);
        java.lang.String str2 = astRoot1.debugPrint();
        astRoot1.setInStrictMode(false);
        java.lang.String str5 = astRoot1.toSource();
        com.google.javascript.rhino.head.ast.Scope scope7 = astRoot1.getDefiningScope("java.io.IOException:                   {\n                  }\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = astRoot1.getFunctionNode(1022253418);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str3 = astRoot2.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode5 = astRoot4.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot2, (com.google.javascript.rhino.head.Node) astRoot4, (com.google.javascript.rhino.head.Node) scriptNode6);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList10 = scriptNode6.getChildScopes();
        scriptNode6.setBaseLineno(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str15 = scriptNode13.toSource(0);
        scriptNode13.removeProp((int) (short) 1);
        int int18 = scriptNode13.getEncodedSourceStart();
        com.google.javascript.rhino.head.Parser parser19 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = parser19.parse("$0", "AstRoot", (int) '#');
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str25 = astRoot24.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope26 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator27 = scope26.spliterator();
        astRoot24.addChildScope(scope26);
        astRoot23.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot24);
        com.google.javascript.rhino.head.ast.Symbol symbol31 = astRoot24.getSymbol("                  ");
        java.lang.String str33 = astRoot24.toSource(5);
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(5, (com.google.javascript.rhino.head.Node) scriptNode6, (com.google.javascript.rhino.head.Node) scriptNode13, (com.google.javascript.rhino.head.Node) astRoot24, (-280309866));
        java.lang.String str37 = scriptNode6.makeIndent((-543879055));
        com.google.javascript.rhino.head.ast.Scope scope40 = new com.google.javascript.rhino.head.ast.Scope(170);
        boolean boolean41 = scope40.hasSideEffects();
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str43 = astRoot42.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope44 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator45 = scope44.spliterator();
        astRoot42.addChildScope(scope44);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList47 = astRoot42.getChildScopes();
        java.lang.String str48 = astRoot42.toString();
        com.google.javascript.rhino.head.Node node49 = astRoot42.target;
        com.google.javascript.rhino.head.Parser parser50 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot54 = parser50.parse("", "-1\tSCRIPT -1 1\n", 19);
        astRoot54.setInStrictMode(true);
        astRoot54.checkParentLinks();
        astRoot42.setParent((com.google.javascript.rhino.head.ast.AstNode) astRoot54);
        com.google.javascript.rhino.head.ast.Scope scope61 = new com.google.javascript.rhino.head.ast.Scope((int) '#', 0);
        int int62 = scope61.getLineno();
        scope61.setBounds(1, 10);
        com.google.javascript.rhino.head.Node node66 = scope61.getLastChild();
        astRoot42.replaceWith(scope61);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet68 = astRoot42.getComments();
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(314810198, (com.google.javascript.rhino.head.Node) scope40, (com.google.javascript.rhino.head.Node) astRoot42, (-280309866));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode6.removeChild(node70);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int3 = astRoot2.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray4 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList5 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList5, symbolArray4);
        astRoot2.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList5);
        com.google.javascript.rhino.head.ast.Scope scope8 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope9 = new com.google.javascript.rhino.head.ast.Scope();
        scope8.addChild((com.google.javascript.rhino.head.ast.AstNode) scope9);
        astRoot2.addChildScope(scope9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot13 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int14 = astRoot13.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int16 = astRoot15.getEndLineno();
        java.lang.Object obj17 = astRoot15.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray18 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet19 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet19, commentArray18);
        astRoot15.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet19);
        astRoot15.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str24 = scriptNode23.getNextTempName();
        com.google.javascript.rhino.head.Node node25 = scriptNode23.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList26 = scriptNode23.getFunctions();
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot13, (com.google.javascript.rhino.head.Node) astRoot15, (com.google.javascript.rhino.head.Node) scriptNode23);
        int int28 = astRoot13.getEncodedSourceStart();
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) astRoot2, (com.google.javascript.rhino.head.Node) astRoot13);
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (byte) 100, (com.google.javascript.rhino.head.Node) astRoot13);
        com.google.javascript.rhino.head.Node node31 = astRoot13.getLastSibling();
        boolean boolean32 = astRoot13.isInStrictMode();
        java.lang.String str33 = astRoot13.shortName();
        com.google.javascript.rhino.head.ast.Comment comment34 = astRoot13.getJsDocNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = astRoot13.getRegexpFlags(1403594947);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str1 = astRoot0.getNextTempName();
        java.lang.String str2 = astRoot0.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = astRoot0.getTop();
        int int4 = astRoot0.getParamCount();
        boolean boolean5 = astRoot0.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator6 = astRoot0.new NodeIterator();
        com.google.javascript.rhino.head.ast.Symbol symbol8 = astRoot0.getSymbol("                                    ");
        boolean boolean9 = astRoot0.isInStrictMode();
        astRoot0.setCompilerData((java.lang.Object) 108898952);
        com.google.javascript.rhino.head.ast.AstRoot astRoot13 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int14 = astRoot13.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int16 = astRoot15.getEndLineno();
        java.lang.Object obj17 = astRoot15.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray18 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet19 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet19, commentArray18);
        astRoot15.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet19);
        astRoot15.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str24 = scriptNode23.getNextTempName();
        com.google.javascript.rhino.head.Node node25 = scriptNode23.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList26 = scriptNode23.getFunctions();
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot13, (com.google.javascript.rhino.head.Node) astRoot15, (com.google.javascript.rhino.head.Node) scriptNode23);
        int int28 = astRoot15.getParamCount();
        int int29 = astRoot15.getLength();
        boolean boolean30 = astRoot15.hasSideEffects();
        astRoot15.setCompilerData((java.lang.Object) "                    {\n                    }\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node33 = astRoot0.getChildBefore((com.google.javascript.rhino.head.Node) astRoot15);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str2 = astRoot1.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode4 = astRoot3.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot1, (com.google.javascript.rhino.head.Node) astRoot3, (com.google.javascript.rhino.head.Node) scriptNode5);
        int int9 = astRoot1.getParamCount();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator10 = astRoot1.spliterator();
        java.lang.Object obj11 = astRoot1.getCompilerData();
        astRoot1.setEncodedSourceStart(0);
        com.google.javascript.rhino.head.ast.AstRoot astRoot14 = astRoot1.getAstRoot();
        int int15 = astRoot1.getRegexpCount();
        java.lang.String str17 = astRoot1.toSource((-17617447));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getNextTempName();
        int int22 = scriptNode20.depth();
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = astRoot23.getAstRoot();
        java.lang.String str25 = astRoot24.shortName();
        java.lang.String str27 = astRoot24.toSource(1);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList28 = astRoot24.getFunctions();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode20, (com.google.javascript.rhino.head.Node) astRoot24, 6);
        com.google.javascript.rhino.head.ast.AstNode astNode31 = scriptNode20.getParent();
        com.google.javascript.rhino.head.ast.Scope scope33 = new com.google.javascript.rhino.head.ast.Scope(526823265);
        scope33.removeChildren();
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int36 = astRoot35.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray37 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList38 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList38, symbolArray37);
        astRoot35.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList38);
        boolean boolean41 = astRoot35.hasChildren();
        int int42 = astRoot35.getAbsolutePosition();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((-1668176296), (com.google.javascript.rhino.head.Node) scriptNode20, (com.google.javascript.rhino.head.Node) scope33, (com.google.javascript.rhino.head.Node) astRoot35, (-359275769));
        boolean boolean45 = astRoot35.hasSideEffects();
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newNumber((double) 9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        astRoot1.addChildBefore((com.google.javascript.rhino.head.Node) astRoot35, node47);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot(8);
        astRoot1.setBounds(0, (-414560696));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = astRoot1.getRegexpString((-852661786));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray2 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList3 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList3, symbolArray2);
        astRoot0.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList3);
        com.google.javascript.rhino.head.ast.Scope scope6 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope();
        scope6.addChild((com.google.javascript.rhino.head.ast.AstNode) scope7);
        astRoot0.addChildScope(scope7);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str11 = astRoot10.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope12 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator13 = scope12.spliterator();
        astRoot10.addChildScope(scope12);
        int int15 = astRoot10.getPosition();
        int int16 = astRoot10.getPosition();
        java.lang.String str17 = astRoot10.debugPrint();
        astRoot0.setTop((com.google.javascript.rhino.head.ast.ScriptNode) astRoot10);
        boolean boolean19 = astRoot0.hasConsistentReturnUsage();
        astRoot0.removeChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str22 = scriptNode21.getNextTempName();
        com.google.javascript.rhino.head.Node node23 = scriptNode21.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList24 = scriptNode21.getFunctions();
        int int25 = scriptNode21.getEncodedSourceEnd();
        scriptNode21.setBounds((int) (byte) 0, 3);
        astRoot0.setParentScope((com.google.javascript.rhino.head.ast.Scope) scriptNode21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode31 = scriptNode21.getFunctionNode(1205984638);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((-289553421));
        java.lang.String str2 = scope1.toString();
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str4 = astRoot3.getNextTempName();
        java.lang.String str5 = astRoot3.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList7 = scriptNode6.getSymbols();
        java.lang.String str8 = astRoot3.toStringTree(scriptNode6);
        astRoot3.checkParentLinks();
        int int12 = astRoot3.getIntProp(11, 32);
        int int13 = astRoot3.getPosition();
        java.lang.String str14 = astRoot3.debugPrint();
        scope1.setParent((com.google.javascript.rhino.head.ast.AstNode) astRoot3);
        scope1.setRelative((-547091060));
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int19 = astRoot18.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray20 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList21 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList21, symbolArray20);
        astRoot18.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList21);
        com.google.javascript.rhino.head.ast.Scope scope24 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope25 = new com.google.javascript.rhino.head.ast.Scope();
        scope24.addChild((com.google.javascript.rhino.head.ast.AstNode) scope25);
        astRoot18.addChildScope(scope25);
        scope25.setPosition(17);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode31.setCompilerData((java.lang.Object) (byte) 100);
        java.lang.String str34 = scriptNode31.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope37 = new com.google.javascript.rhino.head.ast.Scope(2, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode31, (com.google.javascript.rhino.head.Node) scope37, 25);
        java.lang.Object obj41 = scriptNode31.getProp(0);
        scope25.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode31);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode44.setCompilerData((java.lang.Object) (byte) 100);
        java.lang.String str47 = scriptNode44.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope50 = new com.google.javascript.rhino.head.ast.Scope(2, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode44, (com.google.javascript.rhino.head.Node) scope50, 25);
        com.google.javascript.rhino.head.ast.Scope scope54 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope55 = new com.google.javascript.rhino.head.ast.Scope();
        scope54.addChild((com.google.javascript.rhino.head.ast.AstNode) scope55);
        com.google.javascript.rhino.head.Node node57 = scope55.getFirstChild();
        com.google.javascript.rhino.head.Node node58 = new com.google.javascript.rhino.head.Node((int) (byte) -1, (com.google.javascript.rhino.head.Node) scope55);
        scope55.setRelative(100);
        com.google.javascript.rhino.head.ast.AstNode astNode61 = scope55.getParent();
        scope50.addChildToBack((com.google.javascript.rhino.head.Node) astNode61);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList63 = scope50.getStatements();
        com.google.javascript.rhino.head.ast.Scope scope64 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope65 = new com.google.javascript.rhino.head.ast.Scope();
        scope64.addChild((com.google.javascript.rhino.head.ast.AstNode) scope65);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope65.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode67);
        scriptNode67.setEncodedSourceStart(4);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList71 = scriptNode67.getStatements();
        scope50.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode67);
        scriptNode67.clearParentScope();
        boolean boolean74 = scriptNode67.hasConsistentReturnUsage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scope1.addChildBefore((com.google.javascript.rhino.head.Node) scope25, (com.google.javascript.rhino.head.Node) scriptNode67);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode0.toSource(0);
        scriptNode0.setEncodedSourceBounds(12, 10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = astRoot6.getAstRoot();
        java.lang.String str8 = astRoot7.shortName();
        java.lang.String str9 = astRoot7.getSourceName();
        java.lang.String str10 = astRoot7.toSource();
        java.lang.String str11 = scriptNode0.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) astRoot7);
        scriptNode0.setBounds((-665324045), (-396559699));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = scriptNode0.getFunctionNode(79606921);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode1.getNextTempName();
        java.lang.String str3 = scriptNode1.debugPrint();
        scriptNode1.setLineno((int) (byte) -1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str8 = astRoot7.getNextTempName();
        java.lang.String str9 = astRoot7.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList11 = scriptNode10.getSymbols();
        java.lang.String str12 = astRoot7.toStringTree(scriptNode10);
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node(6, (com.google.javascript.rhino.head.Node) astRoot7);
        com.google.javascript.rhino.head.ast.AstRoot astRoot14 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int15 = astRoot14.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int17 = astRoot16.getEndLineno();
        java.lang.Object obj18 = astRoot16.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray19 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet20 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet20, commentArray19);
        astRoot16.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet20);
        astRoot14.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet20);
        int int24 = astRoot14.getRegexpCount();
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(136, (com.google.javascript.rhino.head.Node) scriptNode1, (com.google.javascript.rhino.head.Node) astRoot7, (com.google.javascript.rhino.head.Node) astRoot14, 550287075);
        java.lang.String str27 = astRoot14.shortName();
        com.google.javascript.rhino.head.ast.Scope scope31 = new com.google.javascript.rhino.head.ast.Scope(12, 21);
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int33 = astRoot32.getEndLineno();
        java.lang.Object obj34 = astRoot32.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray35 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet36 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet36, commentArray35);
        astRoot32.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet36);
        com.google.javascript.rhino.head.Node node39 = astRoot32.getLastSibling();
        int int40 = node39.getType();
        com.google.javascript.rhino.head.ast.AstRoot astRoot41 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str42 = astRoot41.getNextTempName();
        java.lang.String str43 = astRoot41.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList45 = scriptNode44.getSymbols();
        java.lang.String str46 = astRoot41.toStringTree(scriptNode44);
        java.lang.String str48 = astRoot41.toSource(0);
        java.lang.String str50 = astRoot41.toSource(25);
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node((int) (short) 100, (com.google.javascript.rhino.head.Node) scope31, node39, (com.google.javascript.rhino.head.Node) astRoot41);
        int int52 = astRoot41.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.AstRoot astRoot53 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str54 = astRoot53.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope55 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator56 = scope55.spliterator();
        astRoot53.addChildScope(scope55);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList58 = astRoot53.getChildScopes();
        java.lang.String str59 = astRoot53.toString();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot41, (com.google.javascript.rhino.head.ast.Scope) astRoot53);
        com.google.javascript.rhino.head.Node node61 = astRoot41.getFirstChild();
        java.lang.String str62 = astRoot14.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) astRoot41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode64 = astRoot41.getFunctionNode((-1693746091));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compilerEnvirons0.getErrorReporter();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.recoverFromErrors();
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setWarnTrailingComma(true);
        com.google.javascript.rhino.head.Parser parser9 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        com.google.javascript.rhino.head.ast.AstRoot astRoot13 = parser9.parse("", "java.io.IOException: java.io.IOException: ", (int) (short) 100);
        astRoot13.setEncodedSourceEnd(4);
        astRoot13.setEncodedSource("$0");
        java.lang.String str19 = astRoot13.toSource((int) (byte) 1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = astRoot21.getAstRoot();
        java.lang.String str23 = astRoot22.shortName();
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.Node node25 = node24.getLastSibling();
        com.google.javascript.rhino.head.ast.Scope scope26 = new com.google.javascript.rhino.head.ast.Scope();
        node24.addChildToFront((com.google.javascript.rhino.head.Node) scope26);
        int int28 = scope26.getLineno();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node(100, (com.google.javascript.rhino.head.Node) astRoot22, (com.google.javascript.rhino.head.Node) scope26, (int) ' ');
        com.google.javascript.rhino.head.ast.Scope scope31 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope32 = new com.google.javascript.rhino.head.ast.Scope();
        scope31.addChild((com.google.javascript.rhino.head.ast.AstNode) scope32);
        astRoot22.addChildrenToFront((com.google.javascript.rhino.head.Node) scope32);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator35 = astRoot22.new NodeIterator();
        int int36 = astRoot22.getPosition();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator38 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot39 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str40 = astRoot39.getNextTempName();
        java.lang.String str41 = astRoot39.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList43 = scriptNode42.getSymbols();
        java.lang.String str44 = astRoot39.toStringTree(scriptNode42);
        com.google.javascript.rhino.head.ast.Scope scope45 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope46 = new com.google.javascript.rhino.head.ast.Scope();
        scope45.addChild((com.google.javascript.rhino.head.ast.AstNode) scope46);
        int int48 = positionComparator38.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode42, (com.google.javascript.rhino.head.ast.AstNode) scope45);
        com.google.javascript.rhino.head.ast.AstRoot astRoot49 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str50 = astRoot49.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope51 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator52 = scope51.spliterator();
        astRoot49.addChildScope(scope51);
        java.lang.String str55 = astRoot49.toSource(9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList56 = astRoot49.getFunctions();
        com.google.javascript.rhino.head.ast.AstRoot astRoot58 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str59 = astRoot58.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot60 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode61 = astRoot60.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode62 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode62.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot58, (com.google.javascript.rhino.head.Node) astRoot60, (com.google.javascript.rhino.head.Node) scriptNode62);
        int int66 = positionComparator38.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot49, (com.google.javascript.rhino.head.ast.AstNode) astRoot58);
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot58, 24);
        astRoot58.removeChildren();
        com.google.javascript.rhino.head.ast.AstRoot astRoot70 = astRoot58.getAstRoot();
        int int71 = astRoot22.compareTo((com.google.javascript.rhino.head.ast.AstNode) astRoot70);
        com.google.javascript.rhino.head.ast.AstRoot astRoot73 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str74 = astRoot73.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope75 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator76 = scope75.spliterator();
        astRoot73.addChildScope(scope75);
        java.lang.String str79 = astRoot73.toSource(9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot80 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str81 = astRoot80.getNextTempName();
        java.lang.String str82 = astRoot80.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode83 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList84 = scriptNode83.getSymbols();
        java.lang.String str85 = astRoot80.toStringTree(scriptNode83);
        com.google.javascript.rhino.head.ast.Scope scope86 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope87 = new com.google.javascript.rhino.head.ast.Scope();
        scope86.addChild((com.google.javascript.rhino.head.ast.AstNode) scope87);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode89 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope87.setTop(scriptNode89);
        java.lang.String str92 = scope87.toSource(12);
        com.google.javascript.rhino.head.Node node93 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot73, (com.google.javascript.rhino.head.Node) scriptNode83, (com.google.javascript.rhino.head.Node) scope87);
        astRoot70.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode83);
        astRoot13.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode83);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode97 = scriptNode83.getFunctionNode(281135490);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList1 = scriptNode0.getSymbols();
        com.google.javascript.rhino.head.Node node2 = scriptNode0.getFirstChild();
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int4 = astRoot3.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray5 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList6 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList6, symbolArray5);
        astRoot3.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList6);
        com.google.javascript.rhino.head.ast.Scope scope9 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope10 = new com.google.javascript.rhino.head.ast.Scope();
        scope9.addChild((com.google.javascript.rhino.head.ast.AstNode) scope10);
        astRoot3.addChildScope(scope10);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList13 = astRoot3.getStatements();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList14 = astRoot3.getSymbols();
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) astRoot3);
        int int16 = scriptNode0.getAbsolutePosition();
        java.lang.String str17 = scriptNode0.getSourceName();
        boolean boolean18 = scriptNode0.hasConsistentReturnUsage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = scriptNode0.getRegexpString(0);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getParamCount();
        java.lang.String str2 = astRoot0.debugPrint();
        java.lang.String str3 = astRoot0.getSourceName();
        com.google.javascript.rhino.head.ast.Scope scope5 = astRoot0.getDefiningScope("                    ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = astRoot0.getRegexpFlags((-1610320791));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = astRoot0.getAstRoot();
        java.lang.String str2 = astRoot1.shortName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = astRoot1.getTop();
        astRoot1.setEncodedSourceEnd(0);
        astRoot1.setInStrictMode(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = astRoot1.getRegexpString(910648842);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((-407655094), (-408128072));
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str6 = astRoot5.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode8 = astRoot7.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode9.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot5, (com.google.javascript.rhino.head.Node) astRoot7, (com.google.javascript.rhino.head.Node) scriptNode9);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode9.getChildScopes();
        scriptNode9.setBaseLineno(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str18 = scriptNode16.toSource(0);
        scriptNode16.removeProp((int) (short) 1);
        int int21 = scriptNode16.getEncodedSourceStart();
        com.google.javascript.rhino.head.Parser parser22 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = parser22.parse("$0", "AstRoot", (int) '#');
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str28 = astRoot27.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope29 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator30 = scope29.spliterator();
        astRoot27.addChildScope(scope29);
        astRoot26.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot27);
        com.google.javascript.rhino.head.ast.Symbol symbol34 = astRoot27.getSymbol("                  ");
        java.lang.String str36 = astRoot27.toSource(5);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node(5, (com.google.javascript.rhino.head.Node) scriptNode9, (com.google.javascript.rhino.head.Node) scriptNode16, (com.google.javascript.rhino.head.Node) astRoot27, (-280309866));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node39 = scope2.getChildBefore((com.google.javascript.rhino.head.Node) scriptNode16);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str3 = astRoot2.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode5 = astRoot4.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot2, (com.google.javascript.rhino.head.Node) astRoot4, (com.google.javascript.rhino.head.Node) scriptNode6);
        astRoot4.setInStrictMode(true);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str13 = scriptNode12.getNextTempName();
        com.google.javascript.rhino.head.Node node14 = scriptNode12.target;
        int int15 = scriptNode12.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node node16 = scriptNode12.getLastChild();
        int int17 = scriptNode12.getEndLineno();
        astRoot4.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode12);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap19 = astRoot4.getSymbolTable();
        int int20 = astRoot4.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = new com.google.javascript.rhino.head.ast.AstRoot(8);
        java.lang.String str23 = astRoot22.debugPrint();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap24 = astRoot22.getSymbolTable();
        astRoot22.checkParentLinks();
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node(627479866, (com.google.javascript.rhino.head.Node) astRoot4, (com.google.javascript.rhino.head.Node) astRoot22, (-61111));
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str29 = astRoot28.getNextTempName();
        java.lang.String str30 = astRoot28.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList32 = scriptNode31.getSymbols();
        java.lang.String str33 = astRoot28.toStringTree(scriptNode31);
        com.google.javascript.rhino.head.ast.Scope scope36 = new com.google.javascript.rhino.head.ast.Scope((int) (byte) 100, 541550340);
        java.lang.String str37 = scope36.toString();
        astRoot28.addChildrenToBack((com.google.javascript.rhino.head.Node) scope36);
        int int39 = astRoot28.getFunctionCount();
        java.lang.String str40 = astRoot28.getSourceName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str43 = astRoot42.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot44 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode45 = astRoot44.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode46.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot42, (com.google.javascript.rhino.head.Node) astRoot44, (com.google.javascript.rhino.head.Node) scriptNode46);
        com.google.javascript.rhino.head.Node node50 = astRoot42.getLastSibling();
        java.lang.String str52 = astRoot42.toSource(0);
        java.lang.String str53 = astRoot42.toSource();
        astRoot28.addChildrenToBack((com.google.javascript.rhino.head.Node) astRoot42);
        com.google.javascript.rhino.head.ast.AstRoot astRoot55 = astRoot42.getAstRoot();
        astRoot42.putIntProp((-766081488), 0);
        int int59 = astRoot22.compareTo((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.ast.AstRoot astRoot60 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str61 = astRoot60.getNextTempName();
        java.lang.String str62 = astRoot60.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = astRoot60.getTop();
        int int64 = astRoot60.getParamCount();
        boolean boolean65 = astRoot60.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator66 = astRoot60.new NodeIterator();
        astRoot60.checkParentLinks();
        int int68 = astRoot60.getRegexpCount();
        astRoot60.setEncodedSourceBounds(653625563, 441866554);
        int int72 = astRoot60.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        astRoot42.removeChild((com.google.javascript.rhino.head.Node) astRoot60);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str3 = scriptNode2.getNextTempName();
        java.lang.String str4 = scriptNode2.debugPrint();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = scriptNode2.getEnclosingFunction();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.Node node7 = node6.getLastSibling();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = new com.google.javascript.rhino.head.ast.AstRoot(14);
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node(26, (com.google.javascript.rhino.head.Node) scriptNode2, node7, (com.google.javascript.rhino.head.Node) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str13 = astRoot12.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator15 = scope14.spliterator();
        astRoot12.addChildScope(scope14);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList17 = astRoot12.getChildScopes();
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope();
        scope18.addChild((com.google.javascript.rhino.head.ast.AstNode) scope19);
        boolean boolean21 = scope18.hasSideEffects();
        com.google.javascript.rhino.head.ast.Scope scope22 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope23 = new com.google.javascript.rhino.head.ast.Scope();
        scope22.addChild((com.google.javascript.rhino.head.ast.AstNode) scope23);
        com.google.javascript.rhino.head.ast.Scope.joinScopes(scope18, scope22);
        astRoot12.replaceWith(scope18);
        scope18.setLength((int) (short) -1);
        com.google.javascript.rhino.head.ast.Symbol symbol30 = scope18.getSymbol("-1\tSCRIPT -1 1\n");
        com.google.javascript.rhino.head.Node node31 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) scope18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str34 = astRoot33.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope35 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator36 = scope35.spliterator();
        astRoot33.addChildScope(scope35);
        java.lang.String str39 = astRoot33.toSource(9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str41 = astRoot40.getNextTempName();
        java.lang.String str42 = astRoot40.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList44 = scriptNode43.getSymbols();
        java.lang.String str45 = astRoot40.toStringTree(scriptNode43);
        com.google.javascript.rhino.head.ast.Scope scope46 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope47 = new com.google.javascript.rhino.head.ast.Scope();
        scope46.addChild((com.google.javascript.rhino.head.ast.AstNode) scope47);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope47.setTop(scriptNode49);
        java.lang.String str52 = scope47.toSource(12);
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot33, (com.google.javascript.rhino.head.Node) scriptNode43, (com.google.javascript.rhino.head.Node) scope47);
        int int54 = astRoot33.getEncodedSourceEnd();
        boolean boolean55 = astRoot33.isInStrictMode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator56 = astRoot33.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = iRFactory0.transformTree(astRoot33);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator3 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator4 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator5 = positionComparator3.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator4);
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str8 = astRoot7.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode10 = astRoot9.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode11.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot7, (com.google.javascript.rhino.head.Node) astRoot9, (com.google.javascript.rhino.head.Node) scriptNode11);
        com.google.javascript.rhino.head.ast.Scope scope17 = new com.google.javascript.rhino.head.ast.Scope(2, (int) (byte) -1);
        int int18 = positionComparator3.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot9, (com.google.javascript.rhino.head.ast.AstNode) scope17);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator19 = astNodeComparator2.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator3);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator20 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator21 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator22 = positionComparator20.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator21);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator23 = astNodeComparator19.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator21);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator24 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator25 = astNodeComparator19.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator24);
        com.google.javascript.rhino.head.Parser parser26 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = parser26.parse("", "-1\tSCRIPT -1 1\n", 19);
        com.google.javascript.rhino.head.ast.Comment comment31 = astRoot30.getJsDocNode();
        int int32 = astRoot30.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope33 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope34 = new com.google.javascript.rhino.head.ast.Scope();
        scope33.addChild((com.google.javascript.rhino.head.ast.AstNode) scope34);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope34.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode36);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str40 = scriptNode38.toSource(0);
        scriptNode38.setEncodedSourceBounds(12, 10);
        scriptNode36.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode38);
        com.google.javascript.rhino.head.ast.AstRoot astRoot45 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str46 = astRoot45.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope47 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator48 = scope47.spliterator();
        astRoot45.addChildScope(scope47);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList50 = astRoot45.getChildScopes();
        com.google.javascript.rhino.head.ast.Scope scope51 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope52 = new com.google.javascript.rhino.head.ast.Scope();
        scope51.addChild((com.google.javascript.rhino.head.ast.AstNode) scope52);
        boolean boolean54 = scope51.hasSideEffects();
        com.google.javascript.rhino.head.ast.Scope scope55 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope56 = new com.google.javascript.rhino.head.ast.Scope();
        scope55.addChild((com.google.javascript.rhino.head.ast.AstNode) scope56);
        com.google.javascript.rhino.head.ast.Scope.joinScopes(scope51, scope55);
        astRoot45.replaceWith(scope51);
        int int60 = astRoot45.getEncodedSourceEnd();
        scriptNode38.setParentScope((com.google.javascript.rhino.head.ast.Scope) astRoot45);
        int int62 = positionComparator24.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot30, (com.google.javascript.rhino.head.ast.AstNode) scriptNode38);
        astRoot30.setEncodedSourceStart((-1268796928));
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator65 = astRoot30.spliterator();
        astRoot30.setEncodedSourceBounds(8, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str70 = astRoot30.getRegexpString(0);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getEndLineno();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet2 = astRoot0.getComments();
        int int5 = astRoot0.getIntProp(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = astRoot0.getRegexpString((-17617447));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("$0", "AstRoot", (int) '#');
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str6 = astRoot5.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator8 = scope7.spliterator();
        astRoot5.addChildScope(scope7);
        astRoot4.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot5);
        com.google.javascript.rhino.head.ast.Symbol symbol12 = astRoot5.getSymbol("                  ");
        java.lang.String str14 = astRoot5.toSource(5);
        int int15 = astRoot5.getBaseLineno();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str19 = astRoot18.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode21 = astRoot20.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode22.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot18, (com.google.javascript.rhino.head.Node) astRoot20, (com.google.javascript.rhino.head.Node) scriptNode22);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons26.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = compilerEnvirons26.getErrorReporter();
        boolean boolean30 = compilerEnvirons26.isGenerateObserverCount();
        compilerEnvirons26.setRecordingComments(true);
        boolean boolean33 = compilerEnvirons26.isGenerateObserverCount();
        boolean boolean34 = compilerEnvirons26.isGenerateDebugInfo();
        compilerEnvirons26.setReservedKeywordAsIdentifier(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons37 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons37.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter40 = compilerEnvirons37.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory41 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter40);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator43 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot44 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str45 = astRoot44.getNextTempName();
        java.lang.String str46 = astRoot44.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList48 = scriptNode47.getSymbols();
        java.lang.String str49 = astRoot44.toStringTree(scriptNode47);
        com.google.javascript.rhino.head.ast.Scope scope50 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope51 = new com.google.javascript.rhino.head.ast.Scope();
        scope50.addChild((com.google.javascript.rhino.head.ast.AstNode) scope51);
        int int53 = positionComparator43.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode47, (com.google.javascript.rhino.head.ast.AstNode) scope50);
        com.google.javascript.rhino.head.ast.AstRoot astRoot54 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str55 = astRoot54.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope56 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator57 = scope56.spliterator();
        astRoot54.addChildScope(scope56);
        java.lang.String str60 = astRoot54.toSource(9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList61 = astRoot54.getFunctions();
        com.google.javascript.rhino.head.ast.AstRoot astRoot63 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str64 = astRoot63.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot65 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode66 = astRoot65.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode67.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot63, (com.google.javascript.rhino.head.Node) astRoot65, (com.google.javascript.rhino.head.Node) scriptNode67);
        int int71 = positionComparator43.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot54, (com.google.javascript.rhino.head.ast.AstNode) astRoot63);
        com.google.javascript.rhino.head.Node node73 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot63, 24);
        astRoot63.removeChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode75 = iRFactory41.transformTree(astRoot63);
        int int76 = astRoot63.getAbsolutePosition();
        com.google.javascript.rhino.head.Node node77 = new com.google.javascript.rhino.head.Node(953557037, (com.google.javascript.rhino.head.Node) astRoot18, (com.google.javascript.rhino.head.Node) astRoot63);
        com.google.javascript.rhino.head.ast.AstRoot astRoot78 = astRoot18.getAstRoot();
        astRoot5.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot78);
        int int80 = astRoot78.getEndLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str82 = astRoot78.getRegexpFlags(0);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        com.google.javascript.rhino.head.ast.Scope scope0 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope();
        scope0.addChild((com.google.javascript.rhino.head.ast.AstNode) scope1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode3);
        int int7 = scriptNode3.getIntProp((int) 'a', 19);
        scriptNode3.removeChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList10 = scriptNode9.getSymbols();
        scriptNode3.setSymbols(symbolList10);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode12 = scriptNode3.getEnclosingFunction();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = scriptNode3.getRegexpString(9876721);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList1 = scriptNode0.getSymbols();
        com.google.javascript.rhino.head.Node node2 = scriptNode0.getFirstChild();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList3 = scriptNode0.getSymbols();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str5 = scriptNode4.getNextTempName();
        java.lang.String str6 = scriptNode4.debugPrint();
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode4);
        int int8 = scriptNode4.getType();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int10 = astRoot9.getEndLineno();
        java.lang.Object obj11 = astRoot9.getCompilerData();
        int int12 = astRoot9.getLineno();
        boolean boolean13 = astRoot9.hasSideEffects();
        java.lang.String str14 = astRoot9.getSourceName();
        java.lang.String str15 = astRoot9.getJsDoc();
        scriptNode4.setTop((com.google.javascript.rhino.head.ast.ScriptNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str19 = scriptNode17.toSource(0);
        scriptNode17.setEncodedSourceBounds(12, 10);
        scriptNode17.setSourceName("");
        java.lang.String str26 = scriptNode17.toSource(2);
        boolean boolean27 = scriptNode17.hasChildren();
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope29 = new com.google.javascript.rhino.head.ast.Scope();
        scope28.addChild((com.google.javascript.rhino.head.ast.AstNode) scope29);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope29.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode31);
        java.lang.String str34 = scriptNode31.toSource(5);
        scriptNode31.putIntProp(0, 1);
        com.google.javascript.rhino.head.Node node38 = scriptNode31.target;
        java.lang.String str39 = scriptNode31.shortName();
        int int40 = scriptNode31.depth();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        astRoot9.replaceChildAfter((com.google.javascript.rhino.head.Node) scriptNode17, (com.google.javascript.rhino.head.Node) scriptNode31);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getNextTempName();
        com.google.javascript.rhino.head.Node node2 = scriptNode0.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList3 = scriptNode0.getFunctions();
        int int4 = scriptNode0.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str6 = scriptNode5.getNextTempName();
        com.google.javascript.rhino.head.Node node7 = scriptNode5.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList8 = scriptNode5.getFunctions();
        int int9 = scriptNode5.getEncodedSourceEnd();
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode5);
        scriptNode0.removeChildren();
        scriptNode0.setRelative(0);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str17 = astRoot16.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode19 = astRoot18.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode20.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot16, (com.google.javascript.rhino.head.Node) astRoot18, (com.google.javascript.rhino.head.Node) scriptNode20);
        int int24 = astRoot16.getParamCount();
        com.google.javascript.rhino.head.ast.Scope scope25 = new com.google.javascript.rhino.head.ast.Scope();
        scope25.clearParentScope();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot16, scope25);
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(6, (com.google.javascript.rhino.head.Node) scope25);
        com.google.javascript.rhino.head.ast.Scope scope29 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope30 = new com.google.javascript.rhino.head.ast.Scope();
        scope29.addChild((com.google.javascript.rhino.head.ast.AstNode) scope30);
        boolean boolean32 = scope29.hasSideEffects();
        int int33 = scope25.compareTo((com.google.javascript.rhino.head.ast.AstNode) scope29);
        boolean boolean34 = scope29.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.AstRoot astRoot36 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str37 = astRoot36.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode39 = astRoot38.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode40.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot36, (com.google.javascript.rhino.head.Node) astRoot38, (com.google.javascript.rhino.head.Node) scriptNode40);
        int int44 = astRoot36.getParamCount();
        com.google.javascript.rhino.head.ast.Scope scope45 = new com.google.javascript.rhino.head.ast.Scope();
        scope45.clearParentScope();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot36, scope45);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap48 = astRoot36.getSymbolTable();
        scope29.setSymbolTable(strMap48);
        scriptNode0.setSymbolTable(strMap48);
        java.lang.String str51 = scriptNode0.getNextTempName();
        java.lang.String str53 = scriptNode0.toSource((-443001414));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str55 = scriptNode0.getRegexpString(956959870);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str1 = astRoot0.getNextTempName();
        java.lang.String str2 = astRoot0.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = scriptNode3.getSymbols();
        java.lang.String str5 = astRoot0.toStringTree(scriptNode3);
        astRoot0.checkParentLinks();
        com.google.javascript.rhino.head.Node node7 = astRoot0.getNext();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons9.setStrictMode(true);
        boolean boolean12 = compilerEnvirons9.recoverFromErrors();
        compilerEnvirons9.setRecordingComments(true);
        astRoot0.putProp(11, (java.lang.Object) true);
        int int16 = astRoot0.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.Scope scope17 = astRoot0.getParentScope();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getNextTempName();
        java.lang.String str22 = scriptNode20.debugPrint();
        scriptNode20.setLineno((int) (byte) -1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str27 = astRoot26.getNextTempName();
        java.lang.String str28 = astRoot26.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList30 = scriptNode29.getSymbols();
        java.lang.String str31 = astRoot26.toStringTree(scriptNode29);
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node(6, (com.google.javascript.rhino.head.Node) astRoot26);
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int34 = astRoot33.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int36 = astRoot35.getEndLineno();
        java.lang.Object obj37 = astRoot35.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray38 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet39 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet39, commentArray38);
        astRoot35.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet39);
        astRoot33.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet39);
        int int43 = astRoot33.getRegexpCount();
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(136, (com.google.javascript.rhino.head.Node) scriptNode20, (com.google.javascript.rhino.head.Node) astRoot26, (com.google.javascript.rhino.head.Node) astRoot33, 550287075);
        java.lang.String str46 = scriptNode20.debugPrint();
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node(4, (com.google.javascript.rhino.head.Node) scriptNode20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node48 = astRoot0.getChildBefore(node47);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getNextTempName();
        com.google.javascript.rhino.head.Node node2 = scriptNode0.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList3 = scriptNode0.getFunctions();
        int int4 = scriptNode0.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str6 = scriptNode5.getNextTempName();
        com.google.javascript.rhino.head.Node node7 = scriptNode5.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList8 = scriptNode5.getFunctions();
        int int9 = scriptNode5.getEncodedSourceEnd();
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode5);
        int int11 = scriptNode0.getLength();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator13 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot14 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str15 = astRoot14.getNextTempName();
        java.lang.String str16 = astRoot14.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList18 = scriptNode17.getSymbols();
        java.lang.String str19 = astRoot14.toStringTree(scriptNode17);
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope21 = new com.google.javascript.rhino.head.ast.Scope();
        scope20.addChild((com.google.javascript.rhino.head.ast.AstNode) scope21);
        int int23 = positionComparator13.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode17, (com.google.javascript.rhino.head.ast.AstNode) scope20);
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str25 = astRoot24.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope26 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator27 = scope26.spliterator();
        astRoot24.addChildScope(scope26);
        java.lang.String str30 = astRoot24.toSource(9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList31 = astRoot24.getFunctions();
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str34 = astRoot33.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode36 = astRoot35.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode37.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot33, (com.google.javascript.rhino.head.Node) astRoot35, (com.google.javascript.rhino.head.Node) scriptNode37);
        int int41 = positionComparator13.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot24, (com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot33, 24);
        astRoot33.removeChildren();
        com.google.javascript.rhino.head.ast.AstRoot astRoot45 = astRoot33.getAstRoot();
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str48 = astRoot33.getRegexpString(1332156079);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        com.google.javascript.rhino.head.ast.Scope scope0 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode1.getNextTempName();
        com.google.javascript.rhino.head.Node node3 = scriptNode1.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList4 = scriptNode1.getFunctions();
        int int5 = scriptNode1.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str7 = scriptNode6.getNextTempName();
        com.google.javascript.rhino.head.Node node8 = scriptNode6.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList9 = scriptNode6.getFunctions();
        int int10 = scriptNode6.getEncodedSourceEnd();
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode6);
        scriptNode1.setPosition(13);
        com.google.javascript.rhino.head.ast.Scope.joinScopes(scope0, (com.google.javascript.rhino.head.ast.Scope) scriptNode1);
        java.lang.String str15 = scriptNode1.getJsDoc();
        int int16 = scriptNode1.getEncodedSourceEnd();
        scriptNode1.setSourceName("%");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = scriptNode1.getRegexpString((-852661786));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.setCompilerData((java.lang.Object) (byte) 100);
        scriptNode0.setEncodedSourceBounds((int) (short) 100, 10);
        java.lang.String str6 = scriptNode0.getJsDoc();
        java.lang.String str8 = scriptNode0.toSource(2);
        java.lang.String str9 = scriptNode0.getNextTempName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = scriptNode0.getRegexpString((-670235790));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList1 = scriptNode0.getSymbols();
        com.google.javascript.rhino.head.Node node2 = scriptNode0.getFirstChild();
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int4 = astRoot3.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray5 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList6 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList6, symbolArray5);
        astRoot3.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList6);
        com.google.javascript.rhino.head.ast.Scope scope9 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope10 = new com.google.javascript.rhino.head.ast.Scope();
        scope9.addChild((com.google.javascript.rhino.head.ast.AstNode) scope10);
        astRoot3.addChildScope(scope10);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList13 = astRoot3.getStatements();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList14 = astRoot3.getSymbols();
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) astRoot3);
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str19 = astRoot18.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator21 = scope20.spliterator();
        astRoot18.addChildScope(scope20);
        java.lang.String str24 = astRoot18.toSource(9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str26 = astRoot25.getNextTempName();
        java.lang.String str27 = astRoot25.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList29 = scriptNode28.getSymbols();
        java.lang.String str30 = astRoot25.toStringTree(scriptNode28);
        com.google.javascript.rhino.head.ast.Scope scope31 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope32 = new com.google.javascript.rhino.head.ast.Scope();
        scope31.addChild((com.google.javascript.rhino.head.ast.AstNode) scope32);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope32.setTop(scriptNode34);
        java.lang.String str37 = scope32.toSource(12);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot18, (com.google.javascript.rhino.head.Node) scriptNode28, (com.google.javascript.rhino.head.Node) scope32);
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str41 = astRoot40.getNextTempName();
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((int) (byte) 10, (com.google.javascript.rhino.head.Node) astRoot40, 4);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet44 = astRoot40.getComments();
        node38.addChildToBack((com.google.javascript.rhino.head.Node) astRoot40);
        com.google.javascript.rhino.head.Node node46 = astRoot40.getLastSibling();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator47 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator48 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator49 = positionComparator47.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator48);
        com.google.javascript.rhino.head.Node node50 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.Node node51 = node50.getLastSibling();
        com.google.javascript.rhino.head.ast.Scope scope52 = new com.google.javascript.rhino.head.ast.Scope();
        node50.addChildToFront((com.google.javascript.rhino.head.Node) scope52);
        int int54 = scope52.getLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol56 = scope52.getSymbol("java.io.IOException: ");
        com.google.javascript.rhino.head.ast.AstRoot astRoot58 = new com.google.javascript.rhino.head.ast.AstRoot(11);
        int int59 = positionComparator48.compare((com.google.javascript.rhino.head.ast.AstNode) scope52, (com.google.javascript.rhino.head.ast.AstNode) astRoot58);
        node46.addChildToFront((com.google.javascript.rhino.head.Node) astRoot58);
        com.google.javascript.rhino.head.Node node61 = astRoot58.getLastSibling();
        boolean boolean62 = astRoot58.hasSideEffects();
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node(17, (com.google.javascript.rhino.head.Node) astRoot58);
        scriptNode0.addChildrenToFront(node63);
        java.lang.String str65 = scriptNode0.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot67 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str68 = astRoot67.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope69 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator70 = scope69.spliterator();
        astRoot67.addChildScope(scope69);
        java.lang.String str73 = astRoot67.toSource(9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList74 = astRoot67.getFunctions();
        java.lang.String str75 = astRoot67.toSource();
        astRoot67.setBaseLineno(0);
        com.google.javascript.rhino.head.ast.AstRoot astRoot78 = astRoot67.getAstRoot();
        scriptNode0.putProp((-605534234), (java.lang.Object) astRoot67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str81 = astRoot67.getRegexpFlags(319087888);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str2 = astRoot1.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode4 = astRoot3.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot1, (com.google.javascript.rhino.head.Node) astRoot3, (com.google.javascript.rhino.head.Node) scriptNode5);
        scriptNode5.setEncodedSourceStart(17);
        scriptNode5.setLength((int) (short) -1);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList13 = scriptNode5.getStatements();
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope((-1));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str17 = scriptNode16.getNextTempName();
        com.google.javascript.rhino.head.Node node18 = scriptNode16.target;
        int int19 = scriptNode16.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node node20 = scriptNode16.getLastChild();
        int int21 = scriptNode16.getEndLineno();
        scope15.setTop(scriptNode16);
        java.lang.String str23 = scriptNode16.getSourceName();
        com.google.javascript.rhino.head.Parser parser24 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = parser24.parse("$0", "AstRoot", (int) '#');
        com.google.javascript.rhino.head.ast.Scope scope29 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope30 = new com.google.javascript.rhino.head.ast.Scope();
        scope29.addChild((com.google.javascript.rhino.head.ast.AstNode) scope30);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator32 = scope30.new NodeIterator();
        scope30.setRelative((int) (short) 100);
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str36 = astRoot35.getNextTempName();
        java.lang.String str37 = astRoot35.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList39 = scriptNode38.getSymbols();
        java.lang.String str40 = astRoot35.toStringTree(scriptNode38);
        java.lang.String str42 = astRoot35.toSource(0);
        java.lang.String str44 = astRoot35.toSource(25);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str46 = scriptNode45.getNextTempName();
        com.google.javascript.rhino.head.Node node47 = scriptNode45.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList48 = scriptNode45.getFunctions();
        int int49 = scriptNode45.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str51 = scriptNode50.getNextTempName();
        com.google.javascript.rhino.head.Node node52 = scriptNode50.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList53 = scriptNode50.getFunctions();
        int int54 = scriptNode50.getEncodedSourceEnd();
        scriptNode45.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode50);
        com.google.javascript.rhino.head.ast.AstRoot astRoot57 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str58 = astRoot57.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot59 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode60 = astRoot59.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode61 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode61.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot57, (com.google.javascript.rhino.head.Node) astRoot59, (com.google.javascript.rhino.head.Node) scriptNode61);
        int int65 = astRoot57.getParamCount();
        com.google.javascript.rhino.head.ast.Scope scope66 = new com.google.javascript.rhino.head.ast.Scope();
        scope66.clearParentScope();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot57, scope66);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap69 = astRoot57.getSymbolTable();
        scriptNode45.setSymbolTable(strMap69);
        astRoot35.setSymbolTable(strMap69);
        scope30.setSymbolTable(strMap69);
        astRoot28.setSymbolTable(strMap69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode5.replaceChild((com.google.javascript.rhino.head.Node) scriptNode16, (com.google.javascript.rhino.head.Node) astRoot28);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        com.google.javascript.rhino.head.ast.Scope scope0 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope();
        scope0.addChild((com.google.javascript.rhino.head.ast.AstNode) scope1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope1.setTop(scriptNode3);
        com.google.javascript.rhino.head.ast.Scope scope5 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope6 = new com.google.javascript.rhino.head.ast.Scope();
        scope5.addChild((com.google.javascript.rhino.head.ast.AstNode) scope6);
        scriptNode3.setCompilerData((java.lang.Object) scope6);
        scriptNode3.setEncodedSourceEnd(0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str12 = scriptNode11.getNextTempName();
        com.google.javascript.rhino.head.Node node13 = scriptNode11.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList14 = scriptNode11.getFunctions();
        int int15 = scriptNode11.getEncodedSourceEnd();
        scriptNode3.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode11);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = astRoot17.getAstRoot();
        int int19 = scriptNode11.compareTo((com.google.javascript.rhino.head.ast.AstNode) astRoot17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = astRoot17.getRegexpFlags((-116461350));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int3 = astRoot2.getEndLineno();
        java.lang.Object obj4 = astRoot2.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray5 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet6 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet6, commentArray5);
        astRoot2.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet6);
        astRoot0.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = astRoot0.getRegexpFlags(973854177);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str2 = astRoot1.getNextTempName();
        java.lang.String str3 = astRoot1.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList5 = scriptNode4.getSymbols();
        java.lang.String str6 = astRoot1.toStringTree(scriptNode4);
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope8 = new com.google.javascript.rhino.head.ast.Scope();
        scope7.addChild((com.google.javascript.rhino.head.ast.AstNode) scope8);
        int int10 = positionComparator0.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode4, (com.google.javascript.rhino.head.ast.AstNode) scope7);
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str12 = astRoot11.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope13 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator14 = scope13.spliterator();
        astRoot11.addChildScope(scope13);
        java.lang.String str17 = astRoot11.toSource(9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList18 = astRoot11.getFunctions();
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str21 = astRoot20.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode23 = astRoot22.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode24.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot20, (com.google.javascript.rhino.head.Node) astRoot22, (com.google.javascript.rhino.head.Node) scriptNode24);
        int int28 = positionComparator0.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot11, (com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = astRoot11.getRegexpString(627479866);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getNextTempName();
        com.google.javascript.rhino.head.Node node2 = scriptNode0.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList3 = scriptNode0.getFunctions();
        int int4 = scriptNode0.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str6 = scriptNode5.getNextTempName();
        com.google.javascript.rhino.head.Node node7 = scriptNode5.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList8 = scriptNode5.getFunctions();
        int int9 = scriptNode5.getEncodedSourceEnd();
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode5);
        scriptNode0.setPosition(13);
        java.lang.String str14 = scriptNode0.toSource((-543879055));
        scriptNode0.setEncodedSourceStart((int) (short) 1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int18 = astRoot17.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int20 = astRoot19.getEndLineno();
        java.lang.Object obj21 = astRoot19.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray22 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet23 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet23, commentArray22);
        astRoot19.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet23);
        astRoot17.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet23);
        int int27 = astRoot17.getRegexpCount();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap28 = astRoot17.getSymbolTable();
        com.google.javascript.rhino.head.ast.Comment comment29 = astRoot17.getJsDocNode();
        astRoot17.setLineno((-1115328205));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = astRoot17.getTop();
        scriptNode32.putIntProp((int) ' ', (-1438167940));
        com.google.javascript.rhino.head.ast.AstRoot astRoot37 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str38 = astRoot37.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot39 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode40 = astRoot39.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode41.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot37, (com.google.javascript.rhino.head.Node) astRoot39, (com.google.javascript.rhino.head.Node) scriptNode41);
        astRoot39.setInStrictMode(true);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str48 = scriptNode47.getNextTempName();
        com.google.javascript.rhino.head.Node node49 = scriptNode47.target;
        int int50 = scriptNode47.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node node51 = scriptNode47.getLastChild();
        int int52 = scriptNode47.getEndLineno();
        astRoot39.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode0.addChildBefore((com.google.javascript.rhino.head.Node) scriptNode32, (com.google.javascript.rhino.head.Node) scriptNode47);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str4 = scriptNode3.getNextTempName();
        java.lang.String str5 = scriptNode3.debugPrint();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode6 = scriptNode3.getEnclosingFunction();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.Node node8 = node7.getLastSibling();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = new com.google.javascript.rhino.head.ast.AstRoot(14);
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node(26, (com.google.javascript.rhino.head.Node) scriptNode3, node8, (com.google.javascript.rhino.head.Node) astRoot10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory1.transformTree(astRoot10);
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope(11);
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((int) (byte) 100, (com.google.javascript.rhino.head.Node) scriptNode12, (com.google.javascript.rhino.head.Node) scope14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode17 = scriptNode12.getFunctionNode((-414560696));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        java.util.Set<java.lang.String> strSet7 = compilerEnvirons0.getActivationNames();
        java.util.Set<java.lang.String> strSet8 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons9.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = compilerEnvirons9.getErrorReporter();
        boolean boolean13 = compilerEnvirons9.isGenerateObserverCount();
        compilerEnvirons9.setRecordingComments(true);
        boolean boolean16 = compilerEnvirons9.isGenerateObserverCount();
        boolean boolean17 = compilerEnvirons9.isGenerateDebugInfo();
        compilerEnvirons9.setReservedKeywordAsIdentifier(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons20.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compilerEnvirons20.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons9, errorReporter23);
        boolean boolean25 = compilerEnvirons9.isStrictMode();
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = compilerEnvirons9.getErrorReporter();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons27.setRecordingLocalJsDocComments(false);
        boolean boolean30 = compilerEnvirons27.isGeneratingSource();
        compilerEnvirons27.setReservedKeywordAsIdentifier(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons33 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons33.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter36 = compilerEnvirons33.getErrorReporter();
        boolean boolean37 = compilerEnvirons33.isGenerateObserverCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter38 = compilerEnvirons33.getErrorReporter();
        com.google.javascript.rhino.head.EvaluatorException evaluatorException44 = errorReporter38.runtimeError("  {\n  }\n", "                                                {\n                                                }\n", (int) (short) 0, "$0", 25);
        errorReporter38.warning("java.io.IOException: java.io.IOException", "                                                {\n                                                }\n", (-12), "$0", (int) '4');
        com.google.javascript.rhino.head.Parser parser51 = new com.google.javascript.rhino.head.Parser(compilerEnvirons27, errorReporter38);
        compilerEnvirons9.setErrorReporter(errorReporter38);
        com.google.javascript.rhino.head.Parser parser53 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean54 = parser53.eof();
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot(8);
        java.lang.String str2 = astRoot1.debugPrint();
        astRoot1.setInStrictMode(false);
        java.lang.String str5 = astRoot1.toSource();
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int8 = astRoot7.getEndLineno();
        java.lang.Object obj9 = astRoot7.getCompilerData();
        java.lang.String str11 = astRoot7.makeIndent(18);
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node((int) '#', (com.google.javascript.rhino.head.Node) astRoot7, 526823265);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons14.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = compilerEnvirons14.getErrorReporter();
        boolean boolean18 = compilerEnvirons14.isGenerateObserverCount();
        boolean boolean19 = compilerEnvirons14.recoverFromErrors();
        java.util.Set<java.lang.String> strSet20 = compilerEnvirons14.getActivationNames();
        compilerEnvirons14.setWarnTrailingComma(true);
        com.google.javascript.rhino.head.Parser parser23 = new com.google.javascript.rhino.head.Parser(compilerEnvirons14);
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = parser23.parse("", "java.io.IOException: java.io.IOException: ", (int) (short) 100);
        astRoot27.setEncodedSourceEnd(4);
        astRoot27.setEncodedSource("$0");
        astRoot1.addChildAfter((com.google.javascript.rhino.head.Node) astRoot7, (com.google.javascript.rhino.head.Node) astRoot27);
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int34 = astRoot33.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray35 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList36 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList36, symbolArray35);
        astRoot33.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList36);
        com.google.javascript.rhino.head.ast.Scope scope39 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope40 = new com.google.javascript.rhino.head.ast.Scope();
        scope39.addChild((com.google.javascript.rhino.head.ast.AstNode) scope40);
        astRoot33.addChildScope(scope40);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList43 = astRoot33.getStatements();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList44 = astRoot33.getSymbols();
        astRoot27.setSymbols(symbolList44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = astRoot27.getRegexpString(662501102);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) (-1282335040));
        com.google.javascript.rhino.head.ast.Scope scope4 = new com.google.javascript.rhino.head.ast.Scope(0, (int) ' ');
        com.google.javascript.rhino.head.ast.Scope scope5 = scope4.getEnclosingScope();
        com.google.javascript.rhino.head.ast.Scope scope6 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope();
        scope6.addChild((com.google.javascript.rhino.head.ast.AstNode) scope7);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope7.setTop(scriptNode9);
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope12 = new com.google.javascript.rhino.head.ast.Scope();
        scope11.addChild((com.google.javascript.rhino.head.ast.AstNode) scope12);
        scriptNode9.setCompilerData((java.lang.Object) scope12);
        scriptNode9.setEncodedSourceEnd(0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str18 = scriptNode17.getNextTempName();
        com.google.javascript.rhino.head.Node node19 = scriptNode17.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList20 = scriptNode17.getFunctions();
        int int21 = scriptNode17.getEncodedSourceEnd();
        scriptNode9.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = astRoot23.getAstRoot();
        int int25 = scriptNode17.compareTo((com.google.javascript.rhino.head.ast.AstNode) astRoot23);
        com.google.javascript.rhino.head.ast.Scope.joinScopes(scope4, (com.google.javascript.rhino.head.ast.Scope) astRoot23);
        astRoot23.setLength(1034001328);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int31 = astRoot30.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int33 = astRoot32.getEndLineno();
        java.lang.Object obj34 = astRoot32.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray35 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet36 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet36, commentArray35);
        astRoot32.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet36);
        astRoot32.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str41 = scriptNode40.getNextTempName();
        com.google.javascript.rhino.head.Node node42 = scriptNode40.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList43 = scriptNode40.getFunctions();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot30, (com.google.javascript.rhino.head.Node) astRoot32, (com.google.javascript.rhino.head.Node) scriptNode40);
        java.lang.String str46 = astRoot30.toSource(20);
        boolean boolean47 = astRoot30.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChildAfter((com.google.javascript.rhino.head.Node) astRoot23, (com.google.javascript.rhino.head.Node) astRoot30);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean3 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setWarnTrailingComma(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setIdeMode(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons13.setWarnTrailingComma(true);
        boolean boolean16 = compilerEnvirons13.getWarnTrailingComma();
        compilerEnvirons13.setGeneratingSource(true);
        compilerEnvirons13.setOptimizationLevel(4);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons21.setRecordingLocalJsDocComments(false);
        boolean boolean24 = compilerEnvirons21.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons25.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = compilerEnvirons25.getErrorReporter();
        boolean boolean29 = compilerEnvirons25.isGenerateObserverCount();
        compilerEnvirons25.setRecordingComments(true);
        boolean boolean32 = compilerEnvirons25.isGenerateObserverCount();
        boolean boolean33 = compilerEnvirons25.isGenerateDebugInfo();
        compilerEnvirons25.setReservedKeywordAsIdentifier(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons36 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons36.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter39 = compilerEnvirons36.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory40 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons25, errorReporter39);
        boolean boolean41 = compilerEnvirons25.isStrictMode();
        com.google.javascript.rhino.head.ErrorReporter errorReporter42 = compilerEnvirons25.getErrorReporter();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons43 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons43.setRecordingLocalJsDocComments(false);
        boolean boolean46 = compilerEnvirons43.isGeneratingSource();
        compilerEnvirons43.setReservedKeywordAsIdentifier(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons49 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons49.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter52 = compilerEnvirons49.getErrorReporter();
        boolean boolean53 = compilerEnvirons49.isGenerateObserverCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter54 = compilerEnvirons49.getErrorReporter();
        com.google.javascript.rhino.head.EvaluatorException evaluatorException60 = errorReporter54.runtimeError("  {\n  }\n", "                                                {\n                                                }\n", (int) (short) 0, "$0", 25);
        errorReporter54.warning("java.io.IOException: java.io.IOException", "                                                {\n                                                }\n", (-12), "$0", (int) '4');
        com.google.javascript.rhino.head.Parser parser67 = new com.google.javascript.rhino.head.Parser(compilerEnvirons43, errorReporter54);
        compilerEnvirons25.setErrorReporter(errorReporter54);
        com.google.javascript.rhino.head.Parser parser69 = new com.google.javascript.rhino.head.Parser(compilerEnvirons21, errorReporter54);
        java.util.Set<java.lang.String> strSet70 = compilerEnvirons21.getActivationNames();
        boolean boolean71 = compilerEnvirons21.isXmlAvailable();
        com.google.javascript.rhino.head.ErrorReporter errorReporter72 = compilerEnvirons21.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory73 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons13, errorReporter72);
        com.google.javascript.rhino.head.Parser parser74 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean75 = parser74.eof();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str1 = astRoot0.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator3 = scope2.spliterator();
        astRoot0.addChildScope(scope2);
        java.lang.String str6 = astRoot0.toSource(9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int8 = astRoot7.getEndLineno();
        java.lang.Object obj9 = astRoot7.getCompilerData();
        astRoot0.addChildrenToFront((com.google.javascript.rhino.head.Node) astRoot7);
        astRoot7.setPosition(25);
        astRoot7.setEncodedSourceStart(10);
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope16 = new com.google.javascript.rhino.head.ast.Scope();
        scope15.addChild((com.google.javascript.rhino.head.ast.AstNode) scope16);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope16.setTop(scriptNode18);
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope21 = new com.google.javascript.rhino.head.ast.Scope();
        scope20.addChild((com.google.javascript.rhino.head.ast.AstNode) scope21);
        scriptNode18.setCompilerData((java.lang.Object) scope21);
        scriptNode18.setEncodedSourceEnd(0);
        int int26 = scriptNode18.getType();
        astRoot7.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode18);
        astRoot7.removeProp((int) (short) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = astRoot7.getTop();
        astRoot7.setLineno(574124565);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = astRoot7.getRegexpFlags((-1219090492));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean3 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean6 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.Parser parser7 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = parser7.eof();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode1.setEndLineno(25);
        boolean boolean4 = scriptNode1.hasChildren();
        com.google.javascript.rhino.head.ast.Scope scope6 = new com.google.javascript.rhino.head.ast.Scope((-1));
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList7 = scope6.getChildScopes();
        scope6.clearParentScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode1.removeChild((com.google.javascript.rhino.head.Node) scope6);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = astRoot0.getAstRoot();
        java.lang.String str2 = astRoot1.shortName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = astRoot1.getTop();
        astRoot1.setEncodedSourceEnd(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = astRoot1.getRegexpFlags((-240085015));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getEndLineno();
        java.lang.Object obj2 = astRoot0.getCompilerData();
        astRoot0.setBaseLineno(14);
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int6 = astRoot5.getEndLineno();
        java.lang.Object obj7 = astRoot5.getCompilerData();
        java.lang.String str8 = astRoot5.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int10 = astRoot9.getEndLineno();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet11 = astRoot9.getComments();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot13 = astRoot12.getAstRoot();
        java.lang.String str14 = astRoot13.shortName();
        java.lang.String str15 = astRoot13.getSourceName();
        astRoot13.checkParentLinks();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap17 = astRoot13.getSymbolTable();
        astRoot9.addChild((com.google.javascript.rhino.head.ast.AstNode) astRoot13);
        int int19 = astRoot13.getFunctionCount();
        boolean boolean20 = astRoot13.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        astRoot0.replaceChild((com.google.javascript.rhino.head.Node) astRoot5, (com.google.javascript.rhino.head.Node) astRoot13);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str2 = astRoot1.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator4 = scope3.spliterator();
        astRoot1.addChildScope(scope3);
        java.lang.String str7 = astRoot1.toSource(9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot8 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str9 = astRoot8.getNextTempName();
        java.lang.String str10 = astRoot8.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList12 = scriptNode11.getSymbols();
        java.lang.String str13 = astRoot8.toStringTree(scriptNode11);
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope();
        scope14.addChild((com.google.javascript.rhino.head.ast.AstNode) scope15);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope15.setTop(scriptNode17);
        java.lang.String str20 = scope15.toSource(12);
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot1, (com.google.javascript.rhino.head.Node) scriptNode11, (com.google.javascript.rhino.head.Node) scope15);
        astRoot1.setBaseLineno(19);
        astRoot1.checkParentLinks();
        astRoot1.clearParentScope();
        boolean boolean26 = astRoot1.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = astRoot1.getRegexpString(1779213838);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int2 = astRoot1.getEndLineno();
        java.lang.Object obj3 = astRoot1.getCompilerData();
        com.google.javascript.rhino.head.Node node4 = astRoot1.getFirstChild();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList5 = astRoot1.getStatements();
        java.lang.String str7 = astRoot1.toSource(23);
        com.google.javascript.rhino.head.ast.Scope scope10 = new com.google.javascript.rhino.head.ast.Scope(17, 10);
        astRoot1.addChild((com.google.javascript.rhino.head.ast.AstNode) scope10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str13 = scriptNode12.getNextTempName();
        java.lang.String str14 = scriptNode12.debugPrint();
        scriptNode12.setLineno((int) (byte) -1);
        int int17 = scriptNode12.getEndLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList18 = scriptNode12.getChildScopes();
        int int19 = scriptNode12.getEndLineno();
        scriptNode12.setEncodedSourceEnd((-443001414));
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList22 = scriptNode12.getStatements();
        astRoot1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode12);
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node((-680958327), (com.google.javascript.rhino.head.Node) scriptNode12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = scriptNode12.getRegexpString((-1710880241));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot(550287075);
        com.google.javascript.rhino.head.Node node4 = new com.google.javascript.rhino.head.Node(26, (-3));
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = astRoot5.getAstRoot();
        java.lang.String str7 = astRoot6.shortName();
        java.lang.String str8 = astRoot6.getSourceName();
        astRoot6.checkParentLinks();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap10 = astRoot6.getSymbolTable();
        astRoot6.removeProp((int) '4');
        int int13 = astRoot6.getFunctionCount();
        com.google.javascript.rhino.head.Node node14 = astRoot6.getLastChild();
        java.lang.String str15 = astRoot6.getEncodedSource();
        node4.addChildrenToFront((com.google.javascript.rhino.head.Node) astRoot6);
        com.google.javascript.rhino.head.ast.Symbol symbol18 = astRoot6.getSymbol("                  {\n                  }\n");
        com.google.javascript.rhino.head.ast.Scope scope21 = new com.google.javascript.rhino.head.ast.Scope((-508712079), 488584366);
        com.google.javascript.rhino.head.Node node22 = scope21.target;
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int24 = astRoot23.getEndLineno();
        java.lang.Object obj25 = astRoot23.getCompilerData();
        astRoot23.setBaseLineno(14);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor28 = astRoot23.iterator();
        astRoot23.clearParentScope();
        scope21.setTop((com.google.javascript.rhino.head.ast.ScriptNode) astRoot23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        astRoot1.addChildBefore((com.google.javascript.rhino.head.Node) astRoot6, (com.google.javascript.rhino.head.Node) scope21);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList1 = scriptNode0.getSymbols();
        com.google.javascript.rhino.head.Node node2 = scriptNode0.getFirstChild();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList3 = scriptNode0.getSymbols();
        int int4 = scriptNode0.depth();
        java.lang.String str5 = scriptNode0.shortName();
        java.lang.String str6 = scriptNode0.debugPrint();
        com.google.javascript.rhino.head.Node node8 = scriptNode0.setType(32);
        boolean boolean9 = scriptNode0.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = scriptNode0.getRegexpString((-61111));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode1 = astRoot0.getParent();
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope4 = new com.google.javascript.rhino.head.ast.Scope();
        scope3.addChild((com.google.javascript.rhino.head.ast.AstNode) scope4);
        com.google.javascript.rhino.head.Node node6 = scope4.getFirstChild();
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node((int) (byte) -1, (com.google.javascript.rhino.head.Node) scope4);
        astRoot0.target = node7;
        boolean boolean9 = node7.hasChildren();
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int12 = astRoot11.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray13 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList14 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList14, symbolArray13);
        astRoot11.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList14);
        com.google.javascript.rhino.head.ast.Scope scope17 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope();
        scope17.addChild((com.google.javascript.rhino.head.ast.AstNode) scope18);
        astRoot11.addChildScope(scope18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int23 = astRoot22.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int25 = astRoot24.getEndLineno();
        java.lang.Object obj26 = astRoot24.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray27 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet28 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet28, commentArray27);
        astRoot24.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet28);
        astRoot24.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str33 = scriptNode32.getNextTempName();
        com.google.javascript.rhino.head.Node node34 = scriptNode32.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList35 = scriptNode32.getFunctions();
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot22, (com.google.javascript.rhino.head.Node) astRoot24, (com.google.javascript.rhino.head.Node) scriptNode32);
        int int37 = astRoot22.getEncodedSourceStart();
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) astRoot11, (com.google.javascript.rhino.head.Node) astRoot22);
        node7.addChildToBack((com.google.javascript.rhino.head.Node) astRoot11);
        com.google.javascript.rhino.head.ast.Scope scope41 = new com.google.javascript.rhino.head.ast.Scope((-12));
        com.google.javascript.rhino.head.ast.FunctionNode functionNode42 = scope41.getEnclosingFunction();
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList43 = scope41.getChildScopes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        astRoot11.removeChild((com.google.javascript.rhino.head.Node) scope41);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = astRoot0.getAstRoot();
        java.lang.String str2 = astRoot1.shortName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = astRoot1.getTop();
        astRoot1.setEncodedSourceEnd(0);
        int int6 = astRoot1.getAbsolutePosition();
        java.lang.String str8 = astRoot1.makeIndent(9);
        java.lang.Object obj10 = astRoot1.getProp(3);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator11 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator12 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator13 = positionComparator11.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str16 = astRoot15.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode18 = astRoot17.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode19.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot15, (com.google.javascript.rhino.head.Node) astRoot17, (com.google.javascript.rhino.head.Node) scriptNode19);
        com.google.javascript.rhino.head.ast.Scope scope25 = new com.google.javascript.rhino.head.ast.Scope(2, (int) (byte) -1);
        int int26 = positionComparator11.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot17, (com.google.javascript.rhino.head.ast.AstNode) scope25);
        astRoot17.removeChildren();
        java.lang.String str29 = astRoot17.toSource(10);
        int int30 = astRoot17.getAbsolutePosition();
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = astRoot31.getAstRoot();
        java.lang.String str33 = astRoot32.shortName();
        java.lang.String str34 = astRoot32.getSourceName();
        astRoot32.checkParentLinks();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap36 = astRoot32.getSymbolTable();
        java.lang.String str38 = astRoot32.makeIndent(32);
        astRoot32.putProp(100, (java.lang.Object) (-1468440406));
        astRoot17.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot32);
        astRoot1.target = astRoot32;
        com.google.javascript.rhino.head.ast.AstRoot astRoot44 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot45 = astRoot44.getAstRoot();
        java.lang.String str46 = astRoot45.shortName();
        java.lang.String str47 = astRoot45.getSourceName();
        astRoot45.checkParentLinks();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap49 = astRoot45.getSymbolTable();
        astRoot45.removeProp((int) '4');
        com.google.javascript.rhino.head.ast.AstNode astNode52 = astRoot45.getParent();
        com.google.javascript.rhino.head.ast.Scope scope55 = new com.google.javascript.rhino.head.ast.Scope((int) '#', 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode56 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str58 = scriptNode56.toSource(0);
        scriptNode56.clearParentScope();
        boolean boolean60 = scriptNode56.hasChildren();
        com.google.javascript.rhino.head.ast.AstRoot astRoot62 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str63 = astRoot62.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope64 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator65 = scope64.spliterator();
        astRoot62.addChildScope(scope64);
        java.lang.String str68 = astRoot62.toSource(9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot69 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str70 = astRoot69.getNextTempName();
        java.lang.String str71 = astRoot69.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode72 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList73 = scriptNode72.getSymbols();
        java.lang.String str74 = astRoot69.toStringTree(scriptNode72);
        com.google.javascript.rhino.head.ast.Scope scope75 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope76 = new com.google.javascript.rhino.head.ast.Scope();
        scope75.addChild((com.google.javascript.rhino.head.ast.AstNode) scope76);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode78 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope76.setTop(scriptNode78);
        java.lang.String str81 = scope76.toSource(12);
        com.google.javascript.rhino.head.Node node82 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot62, (com.google.javascript.rhino.head.Node) scriptNode72, (com.google.javascript.rhino.head.Node) scope76);
        astRoot62.setBaseLineno(19);
        scriptNode56.addChildToBack((com.google.javascript.rhino.head.Node) astRoot62);
        astRoot62.removeChildren();
        scope55.addChildToFront((com.google.javascript.rhino.head.Node) astRoot62);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode88 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList89 = scriptNode88.getSymbols();
        com.google.javascript.rhino.head.Node node90 = scriptNode88.getFirstChild();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList91 = scriptNode88.getSymbols();
        astRoot62.setSymbols(symbolList91);
        astRoot62.setEncodedSourceBounds(8, (-280309866));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        astRoot1.replaceChildAfter((com.google.javascript.rhino.head.Node) astRoot45, (com.google.javascript.rhino.head.Node) astRoot62);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator3 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator4 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator5 = positionComparator3.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator4);
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str8 = astRoot7.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode10 = astRoot9.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode11.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot7, (com.google.javascript.rhino.head.Node) astRoot9, (com.google.javascript.rhino.head.Node) scriptNode11);
        com.google.javascript.rhino.head.ast.Scope scope17 = new com.google.javascript.rhino.head.ast.Scope(2, (int) (byte) -1);
        int int18 = positionComparator3.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot9, (com.google.javascript.rhino.head.ast.AstNode) scope17);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator19 = astNodeComparator2.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator3);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator20 = positionComparator3.reversed();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator21 = positionComparator3.reversed();
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = new com.google.javascript.rhino.head.ast.AstRoot(136);
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int26 = astRoot25.getParamCount();
        java.lang.String str27 = astRoot25.debugPrint();
        java.lang.String str28 = astRoot25.getSourceName();
        int int29 = astRoot25.getLineno();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator30 = astRoot25.new NodeIterator();
        astRoot23.putProp(1239469476, (java.lang.Object) astRoot25);
        com.google.javascript.rhino.head.ast.Scope scope33 = astRoot25.getDefiningScope("550287075\tBLOCK 550287075 -543879055\n-1\tSCRIPT -1 1\n");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList35 = scriptNode34.getSymbols();
        com.google.javascript.rhino.head.Node node36 = scriptNode34.getFirstChild();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList37 = scriptNode34.getSymbols();
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode39 = astRoot38.getParent();
        com.google.javascript.rhino.head.ast.Scope scope41 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope42 = new com.google.javascript.rhino.head.ast.Scope();
        scope41.addChild((com.google.javascript.rhino.head.ast.AstNode) scope42);
        com.google.javascript.rhino.head.Node node44 = scope42.getFirstChild();
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node((int) (byte) -1, (com.google.javascript.rhino.head.Node) scope42);
        astRoot38.target = node45;
        scriptNode34.addChild((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.ast.AstRoot astRoot48 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str49 = astRoot48.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot38, (com.google.javascript.rhino.head.ast.Scope) astRoot48);
        com.google.javascript.rhino.head.ast.Symbol symbol52 = astRoot38.getSymbol("java.io.IOException: 136");
        int int53 = astRoot38.getFunctionCount();
        int int54 = positionComparator3.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot25, (com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str56 = astRoot38.getRegexpFlags(444385247);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str1 = astRoot0.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator3 = scope2.spliterator();
        astRoot0.addChildScope(scope2);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList5 = astRoot0.getChildScopes();
        astRoot0.removeProp(520361644);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = astRoot0.getFunctionNode(922682255);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node((int) (short) 10, 14);
        com.google.javascript.rhino.head.ast.Scope scope6 = new com.google.javascript.rhino.head.ast.Scope(2, (int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str9 = scriptNode7.toSource(0);
        scriptNode7.setEncodedSourceBounds(12, 10);
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) '#', node3, (com.google.javascript.rhino.head.Node) scope6, (com.google.javascript.rhino.head.Node) scriptNode7, 2);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = scriptNode7.getTop();
        com.google.javascript.rhino.head.ast.Comment comment16 = scriptNode15.getJsDocNode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons17.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter20 = compilerEnvirons17.getErrorReporter();
        boolean boolean21 = compilerEnvirons17.isGenerateObserverCount();
        boolean boolean22 = compilerEnvirons17.recoverFromErrors();
        java.util.Set<java.lang.String> strSet23 = compilerEnvirons17.getActivationNames();
        compilerEnvirons17.setWarnTrailingComma(true);
        com.google.javascript.rhino.head.Parser parser26 = new com.google.javascript.rhino.head.Parser(compilerEnvirons17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = parser26.parse("", "java.io.IOException: java.io.IOException: ", (int) (short) 100);
        astRoot30.setEncodedSourceEnd(4);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList33 = astRoot30.getFunctions();
        scriptNode15.setCompilerData((java.lang.Object) astRoot30);
        com.google.javascript.rhino.head.ast.Scope scope35 = astRoot30.getParentScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = astRoot30.getRegexpString(6356536);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope(0, (int) ' ');
        com.google.javascript.rhino.head.ast.Scope scope3 = scope2.getEnclosingScope();
        com.google.javascript.rhino.head.ast.Scope scope4 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope5 = new com.google.javascript.rhino.head.ast.Scope();
        scope4.addChild((com.google.javascript.rhino.head.ast.AstNode) scope5);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope5.setTop(scriptNode7);
        com.google.javascript.rhino.head.ast.Scope scope9 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope10 = new com.google.javascript.rhino.head.ast.Scope();
        scope9.addChild((com.google.javascript.rhino.head.ast.AstNode) scope10);
        scriptNode7.setCompilerData((java.lang.Object) scope10);
        scriptNode7.setEncodedSourceEnd(0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str16 = scriptNode15.getNextTempName();
        com.google.javascript.rhino.head.Node node17 = scriptNode15.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList18 = scriptNode15.getFunctions();
        int int19 = scriptNode15.getEncodedSourceEnd();
        scriptNode7.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode15);
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = astRoot21.getAstRoot();
        int int23 = scriptNode15.compareTo((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        com.google.javascript.rhino.head.ast.Scope.joinScopes(scope2, (com.google.javascript.rhino.head.ast.Scope) astRoot21);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons25.setWarnTrailingComma(true);
        boolean boolean28 = compilerEnvirons25.isRecordingLocalJsDocComments();
        compilerEnvirons25.setWarnTrailingComma(false);
        compilerEnvirons25.setWarnTrailingComma(true);
        compilerEnvirons25.setIdeMode(false);
        boolean boolean35 = compilerEnvirons25.isAllowMemberExprAsFunctionName();
        astRoot21.setCompilerData((java.lang.Object) compilerEnvirons25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str38 = astRoot21.getRegexpString(6356536);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str2 = astRoot1.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode4 = astRoot3.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot1, (com.google.javascript.rhino.head.Node) astRoot3, (com.google.javascript.rhino.head.Node) scriptNode5);
        boolean boolean9 = astRoot1.isInStrictMode();
        astRoot1.setRelative((int) '4');
        int int12 = astRoot1.getEncodedSourceStart();
        boolean boolean13 = astRoot1.isInStrictMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode15 = astRoot1.getFunctionNode(0);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str2 = astRoot1.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode4 = astRoot3.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot1, (com.google.javascript.rhino.head.Node) astRoot3, (com.google.javascript.rhino.head.Node) scriptNode5);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str10 = scriptNode9.getNextTempName();
        com.google.javascript.rhino.head.Node node11 = scriptNode9.target;
        scriptNode9.setBounds((int) (byte) -1, 23);
        int int15 = astRoot3.compareTo((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode16.setCompilerData((java.lang.Object) (byte) 100);
        scriptNode16.setEncodedSourceBounds((int) (short) 100, 10);
        int int24 = scriptNode16.getIntProp(0, 9);
        astRoot3.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode16);
        boolean boolean26 = scriptNode16.hasConsistentReturnUsage();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor27 = scriptNode16.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = scriptNode16.getRegexpString(1535221619);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        int int7 = compilerEnvirons0.getLanguageVersion();
        boolean boolean8 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.Parser parser9 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = parser9.eof();
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int3 = astRoot2.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int5 = astRoot4.getEndLineno();
        java.lang.Object obj6 = astRoot4.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray7 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet8 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet8, commentArray7);
        astRoot4.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet8);
        astRoot4.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str13 = scriptNode12.getNextTempName();
        com.google.javascript.rhino.head.Node node14 = scriptNode12.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList15 = scriptNode12.getFunctions();
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot2, (com.google.javascript.rhino.head.Node) astRoot4, (com.google.javascript.rhino.head.Node) scriptNode12);
        int int17 = astRoot4.getRegexpCount();
        com.google.javascript.rhino.head.Node node18 = astRoot4.getNext();
        astRoot4.setBaseLineno(10);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet21 = astRoot4.getComments();
        astRoot4.setLength((-12));
        com.google.javascript.rhino.head.ast.AstNode astNode24 = astRoot4.getParent();
        astRoot4.setBounds(775058292, 653625563);
        astRoot4.setEncodedSourceBounds((-1610320791), 1159083728);
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = astRoot32.getAstRoot();
        java.lang.String str34 = astRoot33.shortName();
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.Node node36 = node35.getLastSibling();
        com.google.javascript.rhino.head.ast.Scope scope37 = new com.google.javascript.rhino.head.ast.Scope();
        node35.addChildToFront((com.google.javascript.rhino.head.Node) scope37);
        int int39 = scope37.getLineno();
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node(100, (com.google.javascript.rhino.head.Node) astRoot33, (com.google.javascript.rhino.head.Node) scope37, (int) ' ');
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int43 = astRoot42.getEndLineno();
        java.lang.Object obj44 = astRoot42.getCompilerData();
        scope37.addChild((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        int int46 = scope37.getLineno();
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node(21, (com.google.javascript.rhino.head.Node) astRoot4, (com.google.javascript.rhino.head.Node) scope37);
        astRoot4.setInStrictMode(false);
        java.lang.String str51 = astRoot4.toSource(1051569336);
        com.google.javascript.rhino.head.ast.AstRoot astRoot52 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot53 = astRoot52.getAstRoot();
        java.lang.String str54 = astRoot53.shortName();
        java.lang.String str55 = astRoot53.debugPrint();
        com.google.javascript.rhino.head.Node node56 = astRoot53.getFirstChild();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap57 = astRoot53.getSymbolTable();
        com.google.javascript.rhino.head.ast.Scope scope58 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope59 = new com.google.javascript.rhino.head.ast.Scope();
        scope58.addChild((com.google.javascript.rhino.head.ast.AstNode) scope59);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode61 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope59.setTop(scriptNode61);
        com.google.javascript.rhino.head.ast.Scope scope63 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope64 = new com.google.javascript.rhino.head.ast.Scope();
        scope63.addChild((com.google.javascript.rhino.head.ast.AstNode) scope64);
        scriptNode61.setCompilerData((java.lang.Object) scope64);
        com.google.javascript.rhino.head.ast.AstRoot astRoot67 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot68 = astRoot67.getAstRoot();
        java.lang.String str69 = astRoot68.shortName();
        java.lang.String str70 = astRoot68.debugPrint();
        scope64.addChildToFront((com.google.javascript.rhino.head.Node) astRoot68);
        astRoot53.addChild((com.google.javascript.rhino.head.ast.AstNode) astRoot68);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode74 = new com.google.javascript.rhino.head.ast.ScriptNode(242344114);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        astRoot4.replaceChildAfter((com.google.javascript.rhino.head.Node) astRoot68, (com.google.javascript.rhino.head.Node) scriptNode74);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot((int) (short) 10);
        int int2 = astRoot1.getType();
        com.google.javascript.rhino.head.Node node3 = astRoot1.getFirstChild();
        astRoot1.putIntProp((int) (short) 100, 953557037);
        int int7 = astRoot1.getEndLineno();
        int int8 = astRoot1.getLineno();
        int int11 = astRoot1.getIntProp((-236001159), 0);
        astRoot1.setEncodedSourceStart((-543879055));
        int int14 = astRoot1.getBaseLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode16 = astRoot1.getFunctionNode((-340379855));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str3 = scriptNode2.getNextTempName();
        java.lang.String str4 = scriptNode2.debugPrint();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = scriptNode2.getEnclosingFunction();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.Node node7 = node6.getLastSibling();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = new com.google.javascript.rhino.head.ast.AstRoot(14);
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node(26, (com.google.javascript.rhino.head.Node) scriptNode2, node7, (com.google.javascript.rhino.head.Node) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.Node node12 = astRoot9.getNext();
        com.google.javascript.rhino.head.ast.AstRoot astRoot14 = new com.google.javascript.rhino.head.ast.AstRoot(8);
        java.lang.String str15 = astRoot14.debugPrint();
        int int18 = astRoot14.getIntProp((int) (short) 1, (-1));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str21 = scriptNode20.getNextTempName();
        com.google.javascript.rhino.head.Node node22 = scriptNode20.target;
        int int23 = scriptNode20.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node node24 = scriptNode20.getLastChild();
        int int25 = scriptNode20.getEndLineno();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap26 = scriptNode20.getSymbolTable();
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope29 = new com.google.javascript.rhino.head.ast.Scope();
        scope28.addChild((com.google.javascript.rhino.head.ast.AstNode) scope29);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator31 = scope29.new NodeIterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.Node node34 = node33.getLastSibling();
        com.google.javascript.rhino.head.ast.Scope scope35 = new com.google.javascript.rhino.head.ast.Scope();
        node33.addChildToFront((com.google.javascript.rhino.head.Node) scope35);
        scope29.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode32, node33);
        scope29.setRelative(5);
        scriptNode20.putProp((int) (byte) 1, (java.lang.Object) 5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str43 = astRoot42.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot44 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode45 = astRoot44.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode46.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot42, (com.google.javascript.rhino.head.Node) astRoot44, (com.google.javascript.rhino.head.Node) scriptNode46);
        int int50 = astRoot42.getParamCount();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator51 = astRoot42.spliterator();
        com.google.javascript.rhino.head.Node node53 = astRoot42.setType(550287075);
        com.google.javascript.rhino.head.ast.Scope scope54 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator55 = scope54.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode56 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str57 = scriptNode56.getNextTempName();
        scope54.addChildrenToFront((com.google.javascript.rhino.head.Node) scriptNode56);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList59 = scriptNode56.getChildScopes();
        scriptNode56.clearParentScope();
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node(65536, (com.google.javascript.rhino.head.Node) scriptNode20, node53, (com.google.javascript.rhino.head.Node) scriptNode56);
        astRoot14.target = scriptNode20;
        com.google.javascript.rhino.head.ast.AstRoot astRoot64 = new com.google.javascript.rhino.head.ast.AstRoot(550287075);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList65 = astRoot64.getFunctions();
        com.google.javascript.rhino.head.ast.AstRoot astRoot66 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str67 = astRoot66.getNextTempName();
        java.lang.String str69 = astRoot66.toSource((-2110645446));
        com.google.javascript.rhino.head.ast.AstRoot astRoot70 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot71 = astRoot70.getAstRoot();
        java.lang.String str72 = astRoot71.shortName();
        java.lang.String str74 = astRoot71.toSource(1);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList75 = astRoot71.getFunctions();
        astRoot71.checkParentLinks();
        boolean boolean77 = astRoot71.hasChildren();
        int int78 = astRoot71.getLineno();
        java.lang.String str79 = astRoot66.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) astRoot71);
        int int80 = astRoot64.compareTo((com.google.javascript.rhino.head.ast.AstNode) astRoot66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        astRoot9.replaceChild((com.google.javascript.rhino.head.Node) scriptNode20, (com.google.javascript.rhino.head.Node) astRoot66);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = astRoot0.getAstRoot();
        java.lang.String str2 = astRoot1.shortName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = astRoot1.getTop();
        astRoot1.setEncodedSourceEnd(0);
        astRoot1.setInStrictMode(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = astRoot1.getRegexpString(9);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean3 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean4 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons5.setWarnTrailingComma(true);
        boolean boolean8 = compilerEnvirons5.isRecordingLocalJsDocComments();
        compilerEnvirons5.setWarnTrailingComma(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = compilerEnvirons5.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser12 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = parser12.eof();
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str2 = astRoot1.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator4 = scope3.spliterator();
        astRoot1.addChildScope(scope3);
        java.lang.String str7 = astRoot1.toSource(9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot8 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str9 = astRoot8.getNextTempName();
        java.lang.String str10 = astRoot8.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList12 = scriptNode11.getSymbols();
        java.lang.String str13 = astRoot8.toStringTree(scriptNode11);
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope();
        scope14.addChild((com.google.javascript.rhino.head.ast.AstNode) scope15);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope15.setTop(scriptNode17);
        java.lang.String str20 = scope15.toSource(12);
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot1, (com.google.javascript.rhino.head.Node) scriptNode11, (com.google.javascript.rhino.head.Node) scope15);
        int int22 = astRoot1.getEncodedSourceEnd();
        boolean boolean23 = astRoot1.isInStrictMode();
        java.lang.Object obj25 = astRoot1.getProp(956776324);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = astRoot1.getRegexpFlags(115729381);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean3 = compilerEnvirons0.getWarnTrailingComma();
        java.util.Set<java.lang.String> strSet4 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons5.setWarnTrailingComma(true);
        boolean boolean8 = compilerEnvirons5.isRecordingLocalJsDocComments();
        compilerEnvirons5.setWarnTrailingComma(false);
        compilerEnvirons5.setAllowSharpComments(false);
        boolean boolean13 = compilerEnvirons5.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons14.setWarnTrailingComma(true);
        java.lang.String[] strArray26 = new java.lang.String[] { "-1\tSCRIPT -1 1\n", "java.io.IOException: ", "136", "136", "java.io.IOException: ", "136", "java.io.IOException: ", "$0", "  {\n  }\n" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        compilerEnvirons14.setActivationNames((java.util.Set<java.lang.String>) strSet27);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet27);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet27);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean36 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setAllowSharpComments(true);
        java.util.Set<java.lang.String> strSet39 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.Parser parser40 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean41 = parser40.eof();
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean3 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean8 = compilerEnvirons0.isIdeMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons9.setRecordingLocalJsDocComments(false);
        java.util.Set<java.lang.String> strSet12 = compilerEnvirons9.getActivationNames();
        boolean boolean13 = compilerEnvirons9.recoverFromErrors();
        boolean boolean14 = compilerEnvirons9.getWarnTrailingComma();
        boolean boolean15 = compilerEnvirons9.isIdeMode();
        boolean boolean16 = compilerEnvirons9.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons17.setStrictMode(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons20.setWarnTrailingComma(true);
        boolean boolean23 = compilerEnvirons20.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = compilerEnvirons20.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser25 = new com.google.javascript.rhino.head.Parser(compilerEnvirons17, errorReporter24);
        com.google.javascript.rhino.head.Parser parser26 = new com.google.javascript.rhino.head.Parser(compilerEnvirons9, errorReporter24);
        boolean boolean27 = compilerEnvirons9.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons28.setWarnTrailingComma(true);
        boolean boolean31 = compilerEnvirons28.isRecordingLocalJsDocComments();
        compilerEnvirons28.setWarnTrailingComma(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter34 = compilerEnvirons28.getErrorReporter();
        com.google.javascript.rhino.head.EvaluatorException evaluatorException40 = errorReporter34.runtimeError("$0", "                        {\n                        }\n", (int) (byte) 1, "$0", 100);
        com.google.javascript.rhino.head.Parser parser41 = new com.google.javascript.rhino.head.Parser(compilerEnvirons9, errorReporter34);
        compilerEnvirons0.setErrorReporter(errorReporter34);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setAllowSharpComments(true);
        com.google.javascript.rhino.head.IRFactory iRFactory47 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean48 = iRFactory47.eof();
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compilerEnvirons0.getErrorReporter();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.recoverFromErrors();
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setWarnTrailingComma(true);
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = new com.google.javascript.rhino.head.ast.AstRoot(8);
        java.lang.String str12 = astRoot11.debugPrint();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = iRFactory9.transformTree(astRoot11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = iRFactory9.eof();
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.recoverFromErrors();
        boolean boolean5 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean8 = compilerEnvirons0.isRecordingComments();
        java.util.Set<java.lang.String> strSet9 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setRecordingComments(false);
        com.google.javascript.rhino.head.Parser parser12 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = parser12.eof();
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode1 = astRoot0.getParent();
        astRoot0.checkParentLinks();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap3 = astRoot0.getSymbolTable();
        java.lang.Object obj4 = astRoot0.getCompilerData();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons5.setWarnTrailingComma(true);
        boolean boolean8 = compilerEnvirons5.getWarnTrailingComma();
        compilerEnvirons5.setGeneratingSource(true);
        compilerEnvirons5.setIdeMode(true);
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons5);
        astRoot0.setCompilerData((java.lang.Object) iRFactory13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = iRFactory13.eof();
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean3 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean4 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons5.setWarnTrailingComma(true);
        boolean boolean8 = compilerEnvirons5.isRecordingLocalJsDocComments();
        compilerEnvirons5.setWarnTrailingComma(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = compilerEnvirons5.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser12 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter11);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons13.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = compilerEnvirons13.getErrorReporter();
        boolean boolean17 = compilerEnvirons13.isGenerateObserverCount();
        boolean boolean18 = compilerEnvirons13.recoverFromErrors();
        java.util.Set<java.lang.String> strSet19 = compilerEnvirons13.getActivationNames();
        boolean boolean20 = compilerEnvirons13.reportWarningAsError();
        compilerEnvirons13.setWarnTrailingComma(false);
        boolean boolean23 = compilerEnvirons13.isXmlAvailable();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons13);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons25.setWarnTrailingComma(true);
        java.lang.String[] strArray37 = new java.lang.String[] { "-1\tSCRIPT -1 1\n", "java.io.IOException: ", "136", "136", "java.io.IOException: ", "136", "java.io.IOException: ", "$0", "  {\n  }\n" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        compilerEnvirons25.setActivationNames((java.util.Set<java.lang.String>) strSet38);
        boolean boolean41 = compilerEnvirons25.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.Parser parser42 = new com.google.javascript.rhino.head.Parser(compilerEnvirons25);
        compilerEnvirons25.setAllowSharpComments(true);
        compilerEnvirons25.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons47 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons47.setWarnTrailingComma(true);
        boolean boolean50 = compilerEnvirons47.isRecordingLocalJsDocComments();
        compilerEnvirons47.setWarnTrailingComma(false);
        compilerEnvirons47.setAllowSharpComments(false);
        boolean boolean55 = compilerEnvirons47.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons56 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons56.setWarnTrailingComma(true);
        java.lang.String[] strArray68 = new java.lang.String[] { "-1\tSCRIPT -1 1\n", "java.io.IOException: ", "136", "136", "java.io.IOException: ", "136", "java.io.IOException: ", "$0", "  {\n  }\n" };
        java.util.LinkedHashSet<java.lang.String> strSet69 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet69, strArray68);
        compilerEnvirons56.setActivationNames((java.util.Set<java.lang.String>) strSet69);
        compilerEnvirons47.setActivationNames((java.util.Set<java.lang.String>) strSet69);
        compilerEnvirons25.setActivationNames((java.util.Set<java.lang.String>) strSet69);
        compilerEnvirons13.setActivationNames((java.util.Set<java.lang.String>) strSet69);
        boolean boolean75 = compilerEnvirons13.recoverFromErrors();
        com.google.javascript.rhino.head.ErrorReporter errorReporter76 = compilerEnvirons13.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory77 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean78 = iRFactory77.eof();
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int2 = astRoot1.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int4 = astRoot3.getEndLineno();
        java.lang.Object obj5 = astRoot3.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray6 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet7 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet7, commentArray6);
        astRoot3.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet7);
        astRoot3.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str12 = scriptNode11.getNextTempName();
        com.google.javascript.rhino.head.Node node13 = scriptNode11.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList14 = scriptNode11.getFunctions();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot1, (com.google.javascript.rhino.head.Node) astRoot3, (com.google.javascript.rhino.head.Node) scriptNode11);
        int int16 = astRoot3.getParamCount();
        int int17 = astRoot3.getLength();
        com.google.javascript.rhino.head.ast.Scope scope18 = astRoot3.getEnclosingScope();
        boolean boolean19 = astRoot3.isInStrictMode();
        com.google.javascript.rhino.head.ast.Scope scope22 = new com.google.javascript.rhino.head.ast.Scope((int) '#', (-236001159));
        astRoot3.replaceWith(scope22);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str25 = scriptNode24.getNextTempName();
        java.lang.String str26 = scriptNode24.debugPrint();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean28 = compilerEnvirons27.recoverFromErrors();
        int int29 = compilerEnvirons27.getLanguageVersion();
        boolean boolean30 = compilerEnvirons27.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons31.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter34 = compilerEnvirons31.getErrorReporter();
        boolean boolean35 = compilerEnvirons31.isGenerateObserverCount();
        compilerEnvirons31.setRecordingComments(true);
        boolean boolean38 = compilerEnvirons31.isGenerateObserverCount();
        boolean boolean39 = compilerEnvirons31.isGenerateDebugInfo();
        compilerEnvirons31.setReservedKeywordAsIdentifier(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons42 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons42.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter45 = compilerEnvirons42.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory46 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons31, errorReporter45);
        boolean boolean47 = compilerEnvirons31.isStrictMode();
        com.google.javascript.rhino.head.ErrorReporter errorReporter48 = compilerEnvirons31.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory49 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons27, errorReporter48);
        com.google.javascript.rhino.head.ast.AstRoot astRoot51 = new com.google.javascript.rhino.head.ast.AstRoot(23890841);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = iRFactory49.transformTree(astRoot51);
        astRoot3.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode24, (com.google.javascript.rhino.head.Node) astRoot51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode55 = scriptNode24.getFunctionNode((-1142053997));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot(0);
        com.google.javascript.rhino.head.Node node2 = astRoot1.target;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = astRoot1.getFunctionNode((-14));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.recoverFromErrors();
        boolean boolean5 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean8 = compilerEnvirons0.isRecordingComments();
        java.util.Set<java.lang.String> strSet9 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str12 = astRoot11.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope13 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator14 = scope13.spliterator();
        astRoot11.addChildScope(scope13);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList16 = astRoot11.getChildScopes();
        com.google.javascript.rhino.head.ast.Scope scope17 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope();
        scope17.addChild((com.google.javascript.rhino.head.ast.AstNode) scope18);
        boolean boolean20 = scope17.hasSideEffects();
        com.google.javascript.rhino.head.ast.Scope scope21 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope22 = new com.google.javascript.rhino.head.ast.Scope();
        scope21.addChild((com.google.javascript.rhino.head.ast.AstNode) scope22);
        com.google.javascript.rhino.head.ast.Scope.joinScopes(scope17, scope21);
        astRoot11.replaceWith(scope17);
        int int26 = astRoot11.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = iRFactory10.transformTree(astRoot11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str30 = scriptNode29.getNextTempName();
        java.lang.String str31 = scriptNode29.debugPrint();
        scriptNode29.setLineno((int) (byte) -1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str36 = astRoot35.getNextTempName();
        java.lang.String str37 = astRoot35.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList39 = scriptNode38.getSymbols();
        java.lang.String str40 = astRoot35.toStringTree(scriptNode38);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node(6, (com.google.javascript.rhino.head.Node) astRoot35);
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int43 = astRoot42.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot44 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int45 = astRoot44.getEndLineno();
        java.lang.Object obj46 = astRoot44.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray47 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet48 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet48, commentArray47);
        astRoot44.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet48);
        astRoot42.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet48);
        int int52 = astRoot42.getRegexpCount();
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node(136, (com.google.javascript.rhino.head.Node) scriptNode29, (com.google.javascript.rhino.head.Node) astRoot35, (com.google.javascript.rhino.head.Node) astRoot42, 550287075);
        int int55 = astRoot42.depth();
        int int56 = astRoot42.getLineno();
        astRoot42.setRelative(6);
        int int59 = astRoot42.getFunctionCount();
        astRoot42.removeProp(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node62 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope(13, (-12));
        com.google.javascript.rhino.head.ast.Scope scope5 = new com.google.javascript.rhino.head.ast.Scope((-1));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str7 = scriptNode6.getNextTempName();
        com.google.javascript.rhino.head.Node node8 = scriptNode6.target;
        int int9 = scriptNode6.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node node10 = scriptNode6.getLastChild();
        int int11 = scriptNode6.getEndLineno();
        scope5.setTop(scriptNode6);
        scope3.addChildrenToFront((com.google.javascript.rhino.head.Node) scope5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot14 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = astRoot14.getAstRoot();
        java.lang.String str16 = astRoot15.shortName();
        java.lang.String str17 = astRoot15.debugPrint();
        com.google.javascript.rhino.head.Node node18 = astRoot15.getFirstChild();
        java.lang.String str19 = astRoot15.getEncodedSource();
        astRoot15.flattenSymbolTable(false);
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node(1);
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node((-407655094), (com.google.javascript.rhino.head.Node) scope3, (com.google.javascript.rhino.head.Node) astRoot15, node23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode26 = astRoot15.getFunctionNode((-1276937147));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str2 = astRoot1.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode4 = astRoot3.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot1, (com.google.javascript.rhino.head.Node) astRoot3, (com.google.javascript.rhino.head.Node) scriptNode5);
        boolean boolean9 = astRoot1.isInStrictMode();
        astRoot1.setRelative((int) '4');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str13 = scriptNode12.getNextTempName();
        com.google.javascript.rhino.head.Node node14 = scriptNode12.target;
        int int15 = scriptNode12.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node node16 = scriptNode12.getLastChild();
        astRoot1.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode12);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList18 = scriptNode12.getStatements();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str20 = astRoot19.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope21 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator22 = scope21.spliterator();
        astRoot19.addChildScope(scope21);
        java.lang.String str25 = astRoot19.toSource(9);
        astRoot19.setEndLineno(0);
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((int) (short) 10, 14);
        com.google.javascript.rhino.head.ast.Scope scope34 = new com.google.javascript.rhino.head.ast.Scope(2, (int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str37 = scriptNode35.toSource(0);
        scriptNode35.setEncodedSourceBounds(12, 10);
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node((int) '#', node31, (com.google.javascript.rhino.head.Node) scope34, (com.google.javascript.rhino.head.Node) scriptNode35, 2);
        com.google.javascript.rhino.head.ast.AstNode astNode43 = scriptNode35.getParent();
        scriptNode35.setEncodedSourceEnd(10);
        java.lang.Object obj46 = scriptNode35.getCompilerData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        scriptNode12.addChildBefore((com.google.javascript.rhino.head.Node) astRoot19, (com.google.javascript.rhino.head.Node) scriptNode35);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getEndLineno();
        java.lang.Object obj2 = astRoot0.getCompilerData();
        int int3 = astRoot0.getLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = astRoot0.getSymbols();
        astRoot0.setInStrictMode(true);
        com.google.javascript.rhino.head.ast.AstRoot astRoot8 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int9 = astRoot8.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int11 = astRoot10.getEndLineno();
        java.lang.Object obj12 = astRoot10.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray13 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet14 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet14, commentArray13);
        astRoot10.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet14);
        astRoot10.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str19 = scriptNode18.getNextTempName();
        com.google.javascript.rhino.head.Node node20 = scriptNode18.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList21 = scriptNode18.getFunctions();
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot8, (com.google.javascript.rhino.head.Node) astRoot10, (com.google.javascript.rhino.head.Node) scriptNode18);
        java.lang.String str24 = astRoot8.toSource(20);
        astRoot8.setPosition(0);
        int int27 = astRoot8.getFunctionCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node28 = astRoot0.getChildBefore((com.google.javascript.rhino.head.Node) astRoot8);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        com.google.javascript.rhino.head.ast.Scope scope0 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope();
        scope0.addChild((com.google.javascript.rhino.head.ast.AstNode) scope1);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator3 = scope1.new NodeIterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.Node node6 = node5.getLastSibling();
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope();
        node5.addChildToFront((com.google.javascript.rhino.head.Node) scope7);
        scope1.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode4, node5);
        int int10 = scriptNode4.getEncodedSourceEnd();
        java.lang.String str11 = scriptNode4.shortName();
        int int12 = scriptNode4.getEncodedSourceEnd();
        scriptNode4.setLineno((-1438167940));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = scriptNode4.getRegexpFlags(1115693949);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getEndLineno();
        java.lang.Object obj2 = astRoot0.getCompilerData();
        com.google.javascript.rhino.head.ast.Symbol symbol4 = astRoot0.getSymbol("java.io.IOException: ");
        astRoot0.setEncodedSourceStart(0);
        java.lang.String str8 = astRoot0.toSource(14);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str11 = astRoot10.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode13 = astRoot12.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode14.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot10, (com.google.javascript.rhino.head.Node) astRoot12, (com.google.javascript.rhino.head.Node) scriptNode14);
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray18 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList19 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList19, symbolArray18);
        scriptNode14.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = scriptNode14.getTop();
        int int23 = scriptNode22.getEncodedSourceEnd();
        astRoot0.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode22);
        com.google.javascript.rhino.head.Node node25 = astRoot0.getLastChild();
        java.lang.String str26 = astRoot0.getSourceName();
        astRoot0.setEncodedSourceBounds((-1291599107), (-443001414));
        astRoot0.setSourceName("122705610");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = astRoot0.getRegexpString(651202471);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getParamCount();
        astRoot0.setEndLineno((int) (byte) 100);
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = astRoot0.getAstRoot();
        int int5 = astRoot4.getParamCount();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator6 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str8 = astRoot7.getNextTempName();
        java.lang.String str9 = astRoot7.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList11 = scriptNode10.getSymbols();
        java.lang.String str12 = astRoot7.toStringTree(scriptNode10);
        com.google.javascript.rhino.head.ast.Scope scope13 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope();
        scope13.addChild((com.google.javascript.rhino.head.ast.AstNode) scope14);
        int int16 = positionComparator6.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode10, (com.google.javascript.rhino.head.ast.AstNode) scope13);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str18 = astRoot17.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator20 = scope19.spliterator();
        astRoot17.addChildScope(scope19);
        java.lang.String str23 = astRoot17.toSource(9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList24 = astRoot17.getFunctions();
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str27 = astRoot26.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode29 = astRoot28.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode30.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot26, (com.google.javascript.rhino.head.Node) astRoot28, (com.google.javascript.rhino.head.Node) scriptNode30);
        int int34 = positionComparator6.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot17, (com.google.javascript.rhino.head.ast.AstNode) astRoot26);
        astRoot4.setParent((com.google.javascript.rhino.head.ast.AstNode) astRoot26);
        astRoot26.setEncodedSourceBounds((-207088395), 444385247);
        astRoot26.removeChildren();
        com.google.javascript.rhino.head.ast.Comment comment40 = astRoot26.getJsDocNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode42 = astRoot26.getFunctionNode(665248667);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((-1045744400));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str3 = scriptNode2.getNextTempName();
        com.google.javascript.rhino.head.Node node4 = scriptNode2.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList5 = scriptNode2.getFunctions();
        int int6 = scriptNode2.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str8 = scriptNode7.getNextTempName();
        com.google.javascript.rhino.head.Node node9 = scriptNode7.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList10 = scriptNode7.getFunctions();
        int int11 = scriptNode7.getEncodedSourceEnd();
        scriptNode2.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        int int13 = scriptNode2.getLength();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator15 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str17 = astRoot16.getNextTempName();
        java.lang.String str18 = astRoot16.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList20 = scriptNode19.getSymbols();
        java.lang.String str21 = astRoot16.toStringTree(scriptNode19);
        com.google.javascript.rhino.head.ast.Scope scope22 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope23 = new com.google.javascript.rhino.head.ast.Scope();
        scope22.addChild((com.google.javascript.rhino.head.ast.AstNode) scope23);
        int int25 = positionComparator15.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode19, (com.google.javascript.rhino.head.ast.AstNode) scope22);
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str27 = astRoot26.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator29 = scope28.spliterator();
        astRoot26.addChildScope(scope28);
        java.lang.String str32 = astRoot26.toSource(9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList33 = astRoot26.getFunctions();
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str36 = astRoot35.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot37 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode38 = astRoot37.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode39.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot35, (com.google.javascript.rhino.head.Node) astRoot37, (com.google.javascript.rhino.head.Node) scriptNode39);
        int int43 = positionComparator15.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot26, (com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot35, 24);
        astRoot35.removeChildren();
        com.google.javascript.rhino.head.ast.AstRoot astRoot47 = astRoot35.getAstRoot();
        scriptNode2.setParent((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        scriptNode2.setRelative((-236001159));
        scope1.setTop(scriptNode2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode53 = scriptNode2.getFunctionNode(6);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int2 = astRoot1.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int4 = astRoot3.getEndLineno();
        java.lang.Object obj5 = astRoot3.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray6 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet7 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet7, commentArray6);
        astRoot3.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet7);
        astRoot3.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str12 = scriptNode11.getNextTempName();
        com.google.javascript.rhino.head.Node node13 = scriptNode11.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList14 = scriptNode11.getFunctions();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot1, (com.google.javascript.rhino.head.Node) astRoot3, (com.google.javascript.rhino.head.Node) scriptNode11);
        int int16 = astRoot1.getEncodedSourceStart();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator17 = astRoot1.new NodeIterator();
        java.lang.String str19 = astRoot1.makeIndent(25);
        astRoot1.setBounds((int) '#', 0);
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = astRoot23.getAstRoot();
        java.lang.String str25 = astRoot24.shortName();
        java.lang.String str26 = astRoot24.getSourceName();
        int int27 = astRoot24.getAbsolutePosition();
        int int28 = astRoot24.getRegexpCount();
        java.lang.String str30 = astRoot24.makeIndent(0);
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int32 = astRoot31.getEndLineno();
        java.lang.Object obj33 = astRoot31.getCompilerData();
        com.google.javascript.rhino.head.ast.Symbol symbol35 = astRoot31.getSymbol("java.io.IOException: ");
        astRoot31.setEncodedSourceStart(0);
        java.lang.String str39 = astRoot31.toSource(14);
        com.google.javascript.rhino.head.ast.AstRoot astRoot41 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str42 = astRoot41.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot43 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode44 = astRoot43.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode45.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot41, (com.google.javascript.rhino.head.Node) astRoot43, (com.google.javascript.rhino.head.Node) scriptNode45);
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray49 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList50 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList50, symbolArray49);
        scriptNode45.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList50);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = scriptNode45.getTop();
        int int54 = scriptNode53.getEncodedSourceEnd();
        astRoot31.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode53);
        int int56 = astRoot31.getPosition();
        com.google.javascript.rhino.head.ast.AstRoot astRoot58 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int59 = astRoot58.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray60 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList61 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList61, symbolArray60);
        astRoot58.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList61);
        boolean boolean64 = astRoot58.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons65 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons65.setWarnTrailingComma(true);
        boolean boolean68 = compilerEnvirons65.isRecordingLocalJsDocComments();
        compilerEnvirons65.setWarnTrailingComma(false);
        compilerEnvirons65.setAllowSharpComments(false);
        boolean boolean73 = compilerEnvirons65.isGenerateDebugInfo();
        astRoot58.setCompilerData((java.lang.Object) boolean73);
        com.google.javascript.rhino.head.Node node75 = new com.google.javascript.rhino.head.Node((int) ' ', (com.google.javascript.rhino.head.Node) astRoot58);
        astRoot58.setLineno(0);
        int int78 = astRoot58.getEncodedSourceEnd();
        astRoot31.setTop((com.google.javascript.rhino.head.ast.ScriptNode) astRoot58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        astRoot1.replaceChildAfter((com.google.javascript.rhino.head.Node) astRoot24, (com.google.javascript.rhino.head.Node) astRoot58);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int2 = astRoot1.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray3 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList4, symbolArray3);
        astRoot1.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList4);
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope8 = new com.google.javascript.rhino.head.ast.Scope();
        scope7.addChild((com.google.javascript.rhino.head.ast.AstNode) scope8);
        astRoot1.addChildScope(scope8);
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int13 = astRoot12.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot14 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int15 = astRoot14.getEndLineno();
        java.lang.Object obj16 = astRoot14.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray17 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet18 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet18, commentArray17);
        astRoot14.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet18);
        astRoot14.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str23 = scriptNode22.getNextTempName();
        com.google.javascript.rhino.head.Node node24 = scriptNode22.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList25 = scriptNode22.getFunctions();
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot12, (com.google.javascript.rhino.head.Node) astRoot14, (com.google.javascript.rhino.head.Node) scriptNode22);
        int int27 = astRoot12.getEncodedSourceStart();
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) astRoot1, (com.google.javascript.rhino.head.Node) astRoot12);
        astRoot12.setEncodedSourceBounds((int) (short) 1, (int) (byte) 100);
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int34 = astRoot33.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int36 = astRoot35.getEndLineno();
        java.lang.Object obj37 = astRoot35.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray38 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet39 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet39, commentArray38);
        astRoot35.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet39);
        astRoot35.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str44 = scriptNode43.getNextTempName();
        com.google.javascript.rhino.head.Node node45 = scriptNode43.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList46 = scriptNode43.getFunctions();
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot33, (com.google.javascript.rhino.head.Node) astRoot35, (com.google.javascript.rhino.head.Node) scriptNode43);
        astRoot12.addChildrenToFront((com.google.javascript.rhino.head.Node) astRoot35);
        astRoot12.setBaseLineno(1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str52 = scriptNode51.getNextTempName();
        com.google.javascript.rhino.head.Node node53 = scriptNode51.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList54 = scriptNode51.getFunctions();
        int int55 = scriptNode51.getEncodedSourceEnd();
        scriptNode51.setBounds((int) (byte) 0, 3);
        astRoot12.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode51);
        java.lang.String str60 = scriptNode51.getNextTempName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str62 = scriptNode51.getRegexpFlags(22);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = astRoot0.getAstRoot();
        java.lang.String str2 = astRoot0.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope3 = astRoot0.getParentScope();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str6 = astRoot5.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode8 = astRoot7.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode9.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot5, (com.google.javascript.rhino.head.Node) astRoot7, (com.google.javascript.rhino.head.Node) scriptNode9);
        int int13 = astRoot5.getParamCount();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator14 = astRoot5.spliterator();
        com.google.javascript.rhino.head.Node node16 = astRoot5.setType(550287075);
        int int17 = astRoot5.getPosition();
        astRoot0.addChildToFront((com.google.javascript.rhino.head.Node) astRoot5);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str22 = scriptNode20.toSource(0);
        scriptNode20.removeProp((int) (short) 1);
        int int25 = scriptNode20.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int27 = astRoot26.getEndLineno();
        java.lang.Object obj28 = astRoot26.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray29 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet30 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet30, commentArray29);
        astRoot26.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet30);
        astRoot26.checkParentLinks();
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(18, (com.google.javascript.rhino.head.Node) scriptNode20, (com.google.javascript.rhino.head.Node) astRoot26);
        astRoot26.checkParentLinks();
        astRoot26.setPosition((-1438167940));
        astRoot0.addChildScope((com.google.javascript.rhino.head.ast.Scope) astRoot26);
        com.google.javascript.rhino.head.ast.Scope scope41 = new com.google.javascript.rhino.head.ast.Scope(2, (int) (byte) -1);
        int int44 = scope41.getIntProp((-138693843), 89620153);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node45 = astRoot26.getChildBefore((com.google.javascript.rhino.head.Node) scope41);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str2 = astRoot1.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator4 = scope3.spliterator();
        astRoot1.addChildScope(scope3);
        java.lang.String str7 = astRoot1.toSource(9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot8 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str9 = astRoot8.getNextTempName();
        java.lang.String str10 = astRoot8.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList12 = scriptNode11.getSymbols();
        java.lang.String str13 = astRoot8.toStringTree(scriptNode11);
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope();
        scope14.addChild((com.google.javascript.rhino.head.ast.AstNode) scope15);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope15.setTop(scriptNode17);
        java.lang.String str20 = scope15.toSource(12);
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot1, (com.google.javascript.rhino.head.Node) scriptNode11, (com.google.javascript.rhino.head.Node) scope15);
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str24 = astRoot23.getNextTempName();
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node((int) (byte) 10, (com.google.javascript.rhino.head.Node) astRoot23, 4);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet27 = astRoot23.getComments();
        node21.addChildToBack((com.google.javascript.rhino.head.Node) astRoot23);
        com.google.javascript.rhino.head.Node node29 = astRoot23.getLastSibling();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator30 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator31 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator32 = positionComparator30.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator31);
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.Node node34 = node33.getLastSibling();
        com.google.javascript.rhino.head.ast.Scope scope35 = new com.google.javascript.rhino.head.ast.Scope();
        node33.addChildToFront((com.google.javascript.rhino.head.Node) scope35);
        int int37 = scope35.getLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol39 = scope35.getSymbol("java.io.IOException: ");
        com.google.javascript.rhino.head.ast.AstRoot astRoot41 = new com.google.javascript.rhino.head.ast.AstRoot(11);
        int int42 = positionComparator31.compare((com.google.javascript.rhino.head.ast.AstNode) scope35, (com.google.javascript.rhino.head.ast.AstNode) astRoot41);
        node29.addChildToFront((com.google.javascript.rhino.head.Node) astRoot41);
        com.google.javascript.rhino.head.ast.Comment comment44 = astRoot41.getJsDocNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = astRoot41.getRegexpFlags((-473711171));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int3 = astRoot2.getEndLineno();
        java.lang.Object obj4 = astRoot2.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray5 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet6 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet6, commentArray5);
        astRoot2.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet6);
        astRoot0.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet6);
        astRoot0.setRelative((int) (byte) -1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str13 = astRoot12.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator15 = scope14.spliterator();
        astRoot12.addChildScope(scope14);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList17 = astRoot12.getChildScopes();
        java.lang.String str18 = astRoot12.toString();
        com.google.javascript.rhino.head.Node node19 = astRoot12.target;
        int int20 = astRoot0.compareTo((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        astRoot12.setPosition((-1355535815));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode24 = astRoot12.getFunctionNode((-1044174146));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str2 = astRoot1.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator4 = scope3.spliterator();
        astRoot1.addChildScope(scope3);
        java.lang.String str7 = astRoot1.toSource(9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot8 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str9 = astRoot8.getNextTempName();
        java.lang.String str10 = astRoot8.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList12 = scriptNode11.getSymbols();
        java.lang.String str13 = astRoot8.toStringTree(scriptNode11);
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope();
        scope14.addChild((com.google.javascript.rhino.head.ast.AstNode) scope15);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope15.setTop(scriptNode17);
        java.lang.String str20 = scope15.toSource(12);
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot1, (com.google.javascript.rhino.head.Node) scriptNode11, (com.google.javascript.rhino.head.Node) scope15);
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str24 = astRoot23.getNextTempName();
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node((int) (byte) 10, (com.google.javascript.rhino.head.Node) astRoot23, 4);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet27 = astRoot23.getComments();
        node21.addChildToBack((com.google.javascript.rhino.head.Node) astRoot23);
        com.google.javascript.rhino.head.Node node29 = astRoot23.getLastSibling();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator30 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator31 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator32 = positionComparator30.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator31);
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.Node node34 = node33.getLastSibling();
        com.google.javascript.rhino.head.ast.Scope scope35 = new com.google.javascript.rhino.head.ast.Scope();
        node33.addChildToFront((com.google.javascript.rhino.head.Node) scope35);
        int int37 = scope35.getLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol39 = scope35.getSymbol("java.io.IOException: ");
        com.google.javascript.rhino.head.ast.AstRoot astRoot41 = new com.google.javascript.rhino.head.ast.AstRoot(11);
        int int42 = positionComparator31.compare((com.google.javascript.rhino.head.ast.AstNode) scope35, (com.google.javascript.rhino.head.ast.AstNode) astRoot41);
        node29.addChildToFront((com.google.javascript.rhino.head.Node) astRoot41);
        com.google.javascript.rhino.head.Node node44 = astRoot41.getLastSibling();
        astRoot41.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.AstRoot astRoot49 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str50 = astRoot49.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot51 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode52 = astRoot51.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode53.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot49, (com.google.javascript.rhino.head.Node) astRoot51, (com.google.javascript.rhino.head.Node) scriptNode53);
        int int57 = astRoot49.getParamCount();
        com.google.javascript.rhino.head.ast.Scope scope58 = new com.google.javascript.rhino.head.ast.Scope();
        scope58.clearParentScope();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot49, scope58);
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node(6, (com.google.javascript.rhino.head.Node) scope58);
        com.google.javascript.rhino.head.ast.Scope scope62 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope63 = new com.google.javascript.rhino.head.ast.Scope();
        scope62.addChild((com.google.javascript.rhino.head.ast.AstNode) scope63);
        boolean boolean65 = scope62.hasSideEffects();
        int int66 = scope58.compareTo((com.google.javascript.rhino.head.ast.AstNode) scope62);
        boolean boolean67 = scope62.hasConsistentReturnUsage();
        astRoot41.addChildrenToFront((com.google.javascript.rhino.head.Node) scope62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode70 = astRoot41.getFunctionNode(0);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str3 = astRoot2.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode5 = astRoot4.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot2, (com.google.javascript.rhino.head.Node) astRoot4, (com.google.javascript.rhino.head.Node) scriptNode6);
        int int10 = astRoot2.getParamCount();
        java.lang.String str11 = astRoot2.debugPrint();
        boolean boolean12 = astRoot2.isInStrictMode();
        int int13 = astRoot2.getPosition();
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str16 = astRoot15.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode18 = astRoot17.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode19.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot15, (com.google.javascript.rhino.head.Node) astRoot17, (com.google.javascript.rhino.head.Node) scriptNode19);
        astRoot17.setInStrictMode(true);
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node((-407655094), (com.google.javascript.rhino.head.Node) astRoot2, (com.google.javascript.rhino.head.Node) astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int28 = astRoot27.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray29 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList30 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList30, symbolArray29);
        astRoot27.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList30);
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str35 = astRoot34.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot36 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode37 = astRoot36.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode38.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot34, (com.google.javascript.rhino.head.Node) astRoot36, (com.google.javascript.rhino.head.Node) scriptNode38);
        int int42 = astRoot34.getParamCount();
        java.lang.String str43 = astRoot34.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot45 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int46 = astRoot45.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray47 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList48 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList48, symbolArray47);
        astRoot45.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList48);
        com.google.javascript.rhino.head.ast.Scope scope51 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope52 = new com.google.javascript.rhino.head.ast.Scope();
        scope51.addChild((com.google.javascript.rhino.head.ast.AstNode) scope52);
        astRoot45.addChildScope(scope52);
        com.google.javascript.rhino.head.ast.AstRoot astRoot56 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int57 = astRoot56.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot58 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int59 = astRoot58.getEndLineno();
        java.lang.Object obj60 = astRoot58.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray61 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet62 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet62, commentArray61);
        astRoot58.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet62);
        astRoot58.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str67 = scriptNode66.getNextTempName();
        com.google.javascript.rhino.head.Node node68 = scriptNode66.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList69 = scriptNode66.getFunctions();
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot56, (com.google.javascript.rhino.head.Node) astRoot58, (com.google.javascript.rhino.head.Node) scriptNode66);
        int int71 = astRoot56.getEncodedSourceStart();
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) astRoot45, (com.google.javascript.rhino.head.Node) astRoot56);
        astRoot56.setEncodedSourceBounds((int) (short) 1, (int) (byte) 100);
        com.google.javascript.rhino.head.ast.AstRoot astRoot77 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int78 = astRoot77.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot79 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int80 = astRoot79.getEndLineno();
        java.lang.Object obj81 = astRoot79.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray82 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet83 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet83, commentArray82);
        astRoot79.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet83);
        astRoot79.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode87 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str88 = scriptNode87.getNextTempName();
        com.google.javascript.rhino.head.Node node89 = scriptNode87.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList90 = scriptNode87.getFunctions();
        com.google.javascript.rhino.head.Node node91 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot77, (com.google.javascript.rhino.head.Node) astRoot79, (com.google.javascript.rhino.head.Node) scriptNode87);
        astRoot56.addChildrenToFront((com.google.javascript.rhino.head.Node) astRoot79);
        com.google.javascript.rhino.head.Node node93 = new com.google.javascript.rhino.head.Node(16, (com.google.javascript.rhino.head.Node) astRoot27, (com.google.javascript.rhino.head.Node) astRoot34, (com.google.javascript.rhino.head.Node) astRoot79);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node94 = astRoot17.getChildBefore((com.google.javascript.rhino.head.Node) astRoot79);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getEndLineno();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet2 = astRoot0.getComments();
        int int3 = astRoot0.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = astRoot5.getAstRoot();
        java.lang.String str7 = astRoot6.shortName();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.Node node9 = node8.getLastSibling();
        com.google.javascript.rhino.head.ast.Scope scope10 = new com.google.javascript.rhino.head.ast.Scope();
        node8.addChildToFront((com.google.javascript.rhino.head.Node) scope10);
        int int12 = scope10.getLineno();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(100, (com.google.javascript.rhino.head.Node) astRoot6, (com.google.javascript.rhino.head.Node) scope10, (int) ' ');
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int16 = astRoot15.getEndLineno();
        java.lang.Object obj17 = astRoot15.getCompilerData();
        scope10.addChild((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        int int19 = scope10.getLineno();
        scope10.putIntProp(953557037, 136);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        astRoot0.removeChild((com.google.javascript.rhino.head.Node) scope10);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot((int) (short) 10);
        astRoot1.setEncodedSource("java.io.IOException:                         {\n                        }\n");
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str6 = astRoot5.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode8 = astRoot7.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode9.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot5, (com.google.javascript.rhino.head.Node) astRoot7, (com.google.javascript.rhino.head.Node) scriptNode9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str14 = scriptNode13.getNextTempName();
        com.google.javascript.rhino.head.Node node15 = scriptNode13.target;
        scriptNode13.setBounds((int) (byte) -1, 23);
        int int19 = astRoot7.compareTo((com.google.javascript.rhino.head.ast.AstNode) scriptNode13);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode20.setCompilerData((java.lang.Object) (byte) 100);
        scriptNode20.setEncodedSourceBounds((int) (short) 100, 10);
        int int28 = scriptNode20.getIntProp(0, 9);
        astRoot7.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode20);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str31 = astRoot30.getNextTempName();
        java.lang.String str32 = astRoot30.toSource();
        scriptNode20.addChildScope((com.google.javascript.rhino.head.ast.Scope) astRoot30);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = astRoot30.getTop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        astRoot1.removeChild((com.google.javascript.rhino.head.Node) scriptNode34);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = astRoot0.getAstRoot();
        boolean boolean2 = astRoot1.hasSideEffects();
        astRoot1.flattenSymbolTable(true);
        astRoot1.setEncodedSource("com.google.javascript.rhino.head.EvaluatorException: {\n}\n (#3)");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = astRoot1.getRegexpFlags(488584366);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str2 = astRoot1.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode4 = astRoot3.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot1, (com.google.javascript.rhino.head.Node) astRoot3, (com.google.javascript.rhino.head.Node) scriptNode5);
        astRoot3.setInStrictMode(true);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str12 = scriptNode11.getNextTempName();
        com.google.javascript.rhino.head.Node node13 = scriptNode11.target;
        int int14 = scriptNode11.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node node15 = scriptNode11.getLastChild();
        int int16 = scriptNode11.getEndLineno();
        astRoot3.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str19 = scriptNode18.getNextTempName();
        com.google.javascript.rhino.head.Node node20 = scriptNode18.target;
        int int21 = scriptNode18.getBaseLineno();
        int int22 = scriptNode18.getParamCount();
        scriptNode18.setPosition(21);
        scriptNode11.setParentScope((com.google.javascript.rhino.head.ast.Scope) scriptNode18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.FunctionNode functionNode27 = scriptNode18.getFunctionNode((-276468670));
    }
}

