import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29 {

    public static boolean debug = false;

    @Test
    public void test14501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14501");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean3 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGeneratingSource(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons6 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons6.setWarnTrailingComma(true);
        boolean boolean9 = compilerEnvirons6.isRecordingLocalJsDocComments();
        compilerEnvirons6.setWarnTrailingComma(false);
        compilerEnvirons6.setAllowSharpComments(false);
        boolean boolean14 = compilerEnvirons6.isGenerateDebugInfo();
        compilerEnvirons6.setIdeMode(false);
        compilerEnvirons6.setWarnTrailingComma(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons19.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = compilerEnvirons19.getErrorReporter();
        boolean boolean23 = compilerEnvirons19.isGenerateObserverCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = compilerEnvirons19.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser25 = new com.google.javascript.rhino.head.Parser(compilerEnvirons6, errorReporter24);
        compilerEnvirons0.setErrorReporter(errorReporter24);
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        boolean boolean28 = compilerEnvirons0.isRecordingComments();
        boolean boolean29 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean30 = compilerEnvirons0.getAllowSharpComments();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(errorReporter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(errorReporter24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test14502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14502");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode0.toSource(0);
        scriptNode0.clearParentScope();
        boolean boolean4 = scriptNode0.hasChildren();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap5 = null;
        scriptNode0.setSymbolTable(strMap5);
        int int7 = scriptNode0.getRegexpCount();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList8 = scriptNode0.getStatements();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str11 = scriptNode9.toSource(0);
        scriptNode9.clearParentScope();
        boolean boolean13 = scriptNode9.hasChildren();
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str16 = astRoot15.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope17 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator18 = scope17.spliterator();
        astRoot15.addChildScope(scope17);
        java.lang.String str21 = astRoot15.toSource(9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str23 = astRoot22.getNextTempName();
        java.lang.String str24 = astRoot22.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList26 = scriptNode25.getSymbols();
        java.lang.String str27 = astRoot22.toStringTree(scriptNode25);
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope29 = new com.google.javascript.rhino.head.ast.Scope();
        scope28.addChild((com.google.javascript.rhino.head.ast.AstNode) scope29);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope29.setTop(scriptNode31);
        java.lang.String str34 = scope29.toSource(12);
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot15, (com.google.javascript.rhino.head.Node) scriptNode25, (com.google.javascript.rhino.head.Node) scope29);
        astRoot15.setBaseLineno(19);
        scriptNode9.addChildToBack((com.google.javascript.rhino.head.Node) astRoot15);
        astRoot15.removeChildren();
        int int40 = astRoot15.getEncodedSourceEnd();
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        astRoot15.setBounds(11, 775058292);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator46 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot47 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str48 = astRoot47.getNextTempName();
        java.lang.String str49 = astRoot47.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList51 = scriptNode50.getSymbols();
        java.lang.String str52 = astRoot47.toStringTree(scriptNode50);
        com.google.javascript.rhino.head.ast.Scope scope53 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope54 = new com.google.javascript.rhino.head.ast.Scope();
        scope53.addChild((com.google.javascript.rhino.head.ast.AstNode) scope54);
        int int56 = positionComparator46.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode50, (com.google.javascript.rhino.head.ast.AstNode) scope53);
        com.google.javascript.rhino.head.ast.AstRoot astRoot57 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str58 = astRoot57.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope59 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator60 = scope59.spliterator();
        astRoot57.addChildScope(scope59);
        java.lang.String str63 = astRoot57.toSource(9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList64 = astRoot57.getFunctions();
        com.google.javascript.rhino.head.ast.AstRoot astRoot66 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str67 = astRoot66.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot68 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode69 = astRoot68.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode70 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode70.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node73 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot66, (com.google.javascript.rhino.head.Node) astRoot68, (com.google.javascript.rhino.head.Node) scriptNode70);
        int int74 = positionComparator46.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot57, (com.google.javascript.rhino.head.ast.AstNode) astRoot66);
        com.google.javascript.rhino.head.Node node76 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot66, 24);
        astRoot66.removeChildren();
        java.lang.String str78 = astRoot66.toString();
        astRoot15.setTop((com.google.javascript.rhino.head.ast.ScriptNode) astRoot66);
        astRoot15.setEncodedSourceEnd((int) 'a');
        astRoot15.setEncodedSourceBounds(88171227, 563913884);
        com.google.javascript.rhino.head.ast.AstRoot astRoot85 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str86 = astRoot85.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope87 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator88 = scope87.spliterator();
        astRoot85.addChildScope(scope87);
        java.lang.String str91 = astRoot85.toSource(9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList92 = astRoot85.getFunctions();
        java.lang.String str93 = astRoot85.toSource();
        int int94 = astRoot15.compareTo((com.google.javascript.rhino.head.ast.AstNode) astRoot85);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node95 = astRoot85.getContinue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{\n}\n" + "'", str2, "{\n}\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(astNodeList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{\n}\n" + "'", str11, "{\n}\n");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$0" + "'", str16, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "$0" + "'", str23, "$0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "136" + "'", str24, "136");
        org.junit.Assert.assertNotNull(symbolList26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "                        {\n                        }\n" + "'", str34, "                        {\n                        }\n");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "$0" + "'", str48, "$0");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "136" + "'", str49, "136");
        org.junit.Assert.assertNotNull(symbolList51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "$0" + "'", str58, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(functionNodeList64);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "$0" + "'", str67, "$0");
        org.junit.Assert.assertNull(astNode69);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "136" + "'", str78, "136");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "$0" + "'", str86, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator88);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNotNull(functionNodeList92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
    }

    @Test
    public void test14503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14503");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray2 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList3 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList3, symbolArray2);
        astRoot0.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList3);
        boolean boolean6 = astRoot0.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons7.setWarnTrailingComma(true);
        boolean boolean10 = compilerEnvirons7.isRecordingLocalJsDocComments();
        compilerEnvirons7.setWarnTrailingComma(false);
        compilerEnvirons7.setAllowSharpComments(false);
        boolean boolean15 = compilerEnvirons7.isGenerateDebugInfo();
        astRoot0.setCompilerData((java.lang.Object) boolean15);
        java.lang.String str17 = astRoot0.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = astRoot0.getAstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = new com.google.javascript.rhino.head.ast.AstRoot(8);
        java.lang.String str21 = astRoot20.debugPrint();
        astRoot20.setInStrictMode(false);
        com.google.javascript.rhino.head.ast.Comment comment24 = null;
        astRoot20.setJsDocNode(comment24);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList26 = astRoot20.getChildScopes();
        java.lang.String str27 = astRoot20.debugPrint();
        astRoot20.clearParentScope();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator29 = astRoot20.new NodeIterator();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot0, (com.google.javascript.rhino.head.ast.Scope) astRoot20);
        java.lang.String str31 = astRoot20.getSourceName();
        astRoot20.clearParentScope();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(symbolArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str17, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "8\tSCRIPT 8 1\n" + "'", str21, "8\tSCRIPT 8 1\n");
        org.junit.Assert.assertNull(scopeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "8\tSCRIPT 8 1\n" + "'", str27, "8\tSCRIPT 8 1\n");
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test14504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14504");
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot47 = astRoot33.getAstRoot();
        astRoot33.checkParentLinks();
        int int49 = astRoot33.getLineno();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet50 = astRoot33.getComments();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet51 = astRoot33.getComments();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$0" + "'", str1, "$0");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(functionNodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$0" + "'", str6, "$0");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(functionNodeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$0" + "'", str15, "$0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "136" + "'", str16, "136");
        org.junit.Assert.assertNotNull(symbolList18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "$0" + "'", str25, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(functionNodeList31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "$0" + "'", str34, "$0");
        org.junit.Assert.assertNull(astNode36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(astRoot45);
        org.junit.Assert.assertNotNull(astRoot47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(commentSet50);
        org.junit.Assert.assertNull(commentSet51);
    }

    @Test
    public void test14505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14505");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) 374803108);
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node(639708273, node2);
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test14506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14506");
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
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList22 = astRoot1.getSymbols();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator23 = astRoot1.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str26 = scriptNode25.getNextTempName();
        java.lang.String str27 = scriptNode25.debugPrint();
        scriptNode25.setLineno((int) (byte) -1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str32 = astRoot31.getNextTempName();
        java.lang.String str33 = astRoot31.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList35 = scriptNode34.getSymbols();
        java.lang.String str36 = astRoot31.toStringTree(scriptNode34);
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node(6, (com.google.javascript.rhino.head.Node) astRoot31);
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int39 = astRoot38.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int41 = astRoot40.getEndLineno();
        java.lang.Object obj42 = astRoot40.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray43 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet44 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet44, commentArray43);
        astRoot40.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet44);
        astRoot38.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet44);
        int int48 = astRoot38.getRegexpCount();
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node(136, (com.google.javascript.rhino.head.Node) scriptNode25, (com.google.javascript.rhino.head.Node) astRoot31, (com.google.javascript.rhino.head.Node) astRoot38, 550287075);
        com.google.javascript.rhino.head.Node node51 = astRoot31.target;
        java.lang.String str52 = astRoot31.debugPrint();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor53 = null;
        astRoot31.visitComments(nodeVisitor53);
        astRoot1.addChildScope((com.google.javascript.rhino.head.ast.Scope) astRoot31);
        com.google.javascript.rhino.head.Node node56 = astRoot31.getFirstChild();
        com.google.javascript.rhino.head.ast.Symbol symbol58 = astRoot31.getSymbol("{\n{\n}\n}\n");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode(7);
        int int61 = scriptNode60.getLineno();
        scriptNode60.removeChildren();
        java.lang.Object obj63 = scriptNode60.getCompilerData();
        // The following exception was thrown during execution in test generation
        try {
            astRoot31.setContinue((com.google.javascript.rhino.head.Node) scriptNode60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$0" + "'", str2, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$0" + "'", str9, "$0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "136" + "'", str10, "136");
        org.junit.Assert.assertNotNull(symbolList12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                        {\n                        }\n" + "'", str20, "                        {\n                        }\n");
        org.junit.Assert.assertNotNull(symbolList22);
        org.junit.Assert.assertNotNull(nodeSpliterator23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "$0" + "'", str26, "$0");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str27, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "$0" + "'", str32, "$0");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "136" + "'", str33, "136");
        org.junit.Assert.assertNotNull(symbolList35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(commentArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str52, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(symbol58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test14507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14507");
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str3 = astRoot2.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope4 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator5 = scope4.spliterator();
        astRoot2.addChildScope(scope4);
        java.lang.String str8 = astRoot2.toSource(9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str10 = astRoot9.getNextTempName();
        java.lang.String str11 = astRoot9.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList13 = scriptNode12.getSymbols();
        java.lang.String str14 = astRoot9.toStringTree(scriptNode12);
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope16 = new com.google.javascript.rhino.head.ast.Scope();
        scope15.addChild((com.google.javascript.rhino.head.ast.AstNode) scope16);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope16.setTop(scriptNode18);
        java.lang.String str21 = scope16.toSource(12);
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot2, (com.google.javascript.rhino.head.Node) scriptNode12, (com.google.javascript.rhino.head.Node) scope16);
        int int23 = astRoot2.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str25 = astRoot24.getNextTempName();
        java.lang.String str26 = astRoot24.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList28 = scriptNode27.getSymbols();
        java.lang.String str29 = astRoot24.toStringTree(scriptNode27);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList30 = scriptNode27.getStatements();
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = astRoot31.getAstRoot();
        java.lang.String str33 = astRoot32.shortName();
        java.lang.String str34 = astRoot32.getSourceName();
        astRoot32.checkParentLinks();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap36 = astRoot32.getSymbolTable();
        java.lang.String str38 = astRoot32.makeIndent(32);
        astRoot2.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode27, (com.google.javascript.rhino.head.Node) astRoot32);
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(4, 0);
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((-159100019), (com.google.javascript.rhino.head.Node) scriptNode27, node42, 488584366);
        com.google.javascript.rhino.head.ast.AstRoot astRoot45 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int46 = astRoot45.getEndLineno();
        java.lang.Object obj47 = astRoot45.getCompilerData();
        astRoot45.setBaseLineno(14);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor50 = astRoot45.iterator();
        astRoot45.clearParentScope();
        java.lang.String str52 = astRoot45.getEncodedSource();
        com.google.javascript.rhino.head.ast.Scope scope53 = astRoot45.getEnclosingScope();
        java.lang.String str54 = scriptNode27.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) astRoot45);
        int int55 = scriptNode27.getLineno();
        int int56 = scriptNode27.getEncodedSourceEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$0" + "'", str3, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$0" + "'", str10, "$0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "136" + "'", str11, "136");
        org.junit.Assert.assertNotNull(symbolList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                        {\n                        }\n" + "'", str21, "                        {\n                        }\n");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "$0" + "'", str25, "$0");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "136" + "'", str26, "136");
        org.junit.Assert.assertNotNull(symbolList28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(astNodeList30);
        org.junit.Assert.assertNotNull(astRoot32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AstRoot" + "'", str33, "AstRoot");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(strMap36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "                                                                " + "'", str38, "                                                                ");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(nodeItor50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(scope53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test14508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14508");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot(8);
        java.lang.String str2 = astRoot1.debugPrint();
        astRoot1.setInStrictMode(false);
        com.google.javascript.rhino.head.ast.Comment comment5 = null;
        astRoot1.setJsDocNode(comment5);
        java.lang.String str7 = astRoot1.getSourceName();
        com.google.javascript.rhino.head.Node node8 = astRoot1.getLastSibling();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = astRoot9.getAstRoot();
        java.lang.String str11 = astRoot10.shortName();
        java.lang.String str12 = astRoot10.getSourceName();
        int int13 = astRoot10.getAbsolutePosition();
        int int14 = astRoot10.getPosition();
        astRoot1.addChildToFront((com.google.javascript.rhino.head.Node) astRoot10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = astRoot10.getTop();
        int int17 = astRoot10.getParamCount();
        java.lang.String str18 = astRoot10.toSource();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8\tSCRIPT 8 1\n" + "'", str2, "8\tSCRIPT 8 1\n");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AstRoot" + "'", str11, "AstRoot");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test14509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14509");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean3 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean8 = compilerEnvirons0.isIdeMode();
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons10.setRecordingLocalJsDocComments(false);
        boolean boolean13 = compilerEnvirons10.isGeneratingSource();
        compilerEnvirons10.setGeneratingSource(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons16.setWarnTrailingComma(true);
        boolean boolean19 = compilerEnvirons16.isRecordingLocalJsDocComments();
        compilerEnvirons16.setWarnTrailingComma(false);
        compilerEnvirons16.setAllowSharpComments(false);
        boolean boolean24 = compilerEnvirons16.isGenerateDebugInfo();
        compilerEnvirons16.setIdeMode(false);
        compilerEnvirons16.setWarnTrailingComma(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons29.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = compilerEnvirons29.getErrorReporter();
        boolean boolean33 = compilerEnvirons29.isGenerateObserverCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter34 = compilerEnvirons29.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser35 = new com.google.javascript.rhino.head.Parser(compilerEnvirons16, errorReporter34);
        compilerEnvirons10.setErrorReporter(errorReporter34);
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter34);
        com.google.javascript.rhino.head.IRFactory iRFactory38 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        boolean boolean39 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(errorReporter32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(errorReporter34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test14510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14510");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray2 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList3 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList3, symbolArray2);
        astRoot0.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList3);
        astRoot0.clearParentScope();
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int8 = astRoot7.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int10 = astRoot9.getEndLineno();
        java.lang.Object obj11 = astRoot9.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray12 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet13 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet13, commentArray12);
        astRoot9.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet13);
        astRoot7.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet13);
        astRoot0.target = astRoot7;
        com.google.javascript.rhino.head.ast.Scope scope19 = astRoot0.getDefiningScope("14");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(symbolArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(commentArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(scope19);
    }

    @Test
    public void test14511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14511");
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
        com.google.javascript.rhino.head.Node node15 = astRoot5.target;
        int int16 = astRoot5.getLength();
        // The following exception was thrown during execution in test generation
        try {
            astRoot5.resetTargets();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$0" + "'", str6, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator8);
        org.junit.Assert.assertNull(symbol12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test14512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14512");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setStrictMode(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons3 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons3.setWarnTrailingComma(true);
        boolean boolean6 = compilerEnvirons3.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter7 = compilerEnvirons3.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser8 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter7);
        boolean boolean9 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setGeneratingSource(true);
        com.google.javascript.rhino.head.Parser parser14 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        compilerEnvirons0.setRecordingComments(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(errorReporter7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14513");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(2, "                        {\n                        }\n");
        int int5 = node2.getIntProp(9, 15);
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int8 = astRoot7.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int10 = astRoot9.getEndLineno();
        java.lang.Object obj11 = astRoot9.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray12 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet13 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet13, commentArray12);
        astRoot9.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet13);
        astRoot9.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str18 = scriptNode17.getNextTempName();
        com.google.javascript.rhino.head.Node node19 = scriptNode17.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList20 = scriptNode17.getFunctions();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot7, (com.google.javascript.rhino.head.Node) astRoot9, (com.google.javascript.rhino.head.Node) scriptNode17);
        int int22 = astRoot7.getEncodedSourceStart();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator23 = astRoot7.new NodeIterator();
        java.lang.String str25 = astRoot7.makeIndent(25);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str27 = scriptNode26.getNextTempName();
        com.google.javascript.rhino.head.Node node28 = scriptNode26.target;
        int int29 = scriptNode26.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node node30 = scriptNode26.getLastChild();
        int int31 = scriptNode26.getEndLineno();
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int33 = astRoot32.getEndLineno();
        java.lang.Object obj34 = astRoot32.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray35 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet36 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet36, commentArray35);
        astRoot32.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet36);
        astRoot32.removeProp((int) (short) 0);
        int int41 = astRoot32.getAbsolutePosition();
        scriptNode26.setParent((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        node2.replaceChildAfter((com.google.javascript.rhino.head.Node) astRoot7, (com.google.javascript.rhino.head.Node) astRoot32);
        com.google.javascript.rhino.head.ast.Scope scope44 = null;
        astRoot7.setParentScope(scope44);
        int int46 = astRoot7.getBaseLineno();
        int int49 = astRoot7.getIntProp(997550455, 0);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(commentArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "$0" + "'", str18, "$0");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(functionNodeList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "                                                  " + "'", str25, "                                                  ");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "$0" + "'", str27, "$0");
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(commentArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test14514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14514");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.recoverFromErrors();
        boolean boolean5 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        boolean boolean7 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setGeneratingSource(true);
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        com.google.javascript.rhino.head.Parser parser11 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = parser11.parse("", "-1\tSCRIPT -1 1\n", 19);
        astRoot15.setInStrictMode(true);
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newString((-414560696), "                        {\n                        }\n");
        astRoot15.setCompilerData((java.lang.Object) node20);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = iRFactory10.transformTree(astRoot15);
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str26 = astRoot25.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode28 = astRoot27.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode29.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot25, (com.google.javascript.rhino.head.Node) astRoot27, (com.google.javascript.rhino.head.Node) scriptNode29);
        astRoot27.setInStrictMode(true);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str36 = scriptNode35.getNextTempName();
        com.google.javascript.rhino.head.Node node37 = scriptNode35.target;
        int int38 = scriptNode35.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node node39 = scriptNode35.getLastChild();
        int int40 = scriptNode35.getEndLineno();
        astRoot27.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode35);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap42 = astRoot27.getSymbolTable();
        int int43 = astRoot27.getType();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor44 = null;
        astRoot27.visitComments(nodeVisitor44);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor46 = astRoot27.iterator();
        astRoot15.putProp((-1690421917), (java.lang.Object) astRoot27);
        // The following exception was thrown during execution in test generation
        try {
            astRoot27.setBaseLineno((-419350393));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(astRoot15);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(scriptNode22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "$0" + "'", str26, "$0");
        org.junit.Assert.assertNull(astNode28);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "$0" + "'", str36, "$0");
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(strMap42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 136 + "'", int43 == 136);
        org.junit.Assert.assertNotNull(nodeItor46);
    }

    @Test
    public void test14515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14515");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot(8);
        java.lang.String str2 = astRoot1.debugPrint();
        astRoot1.setInStrictMode(false);
        com.google.javascript.rhino.head.ast.Comment comment5 = null;
        astRoot1.setJsDocNode(comment5);
        java.lang.String str7 = astRoot1.getSourceName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = astRoot1.getEnclosingFunction();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = functionNode8.addFunction(functionNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8\tSCRIPT 8 1\n" + "'", str2, "8\tSCRIPT 8 1\n");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(functionNode8);
    }

    @Test
    public void test14516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14516");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        java.util.Set<java.lang.String> strSet10 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertNull(strSet10);
    }

    @Test
    public void test14517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14517");
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
        astRoot13.clearParentScope();
        com.google.javascript.rhino.head.ast.AstRoot astRoot36 = astRoot13.getAstRoot();
        com.google.javascript.rhino.head.ast.Scope scope37 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope38 = new com.google.javascript.rhino.head.ast.Scope();
        scope37.addChild((com.google.javascript.rhino.head.ast.AstNode) scope38);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator40 = scope38.new NodeIterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.Node node43 = node42.getLastSibling();
        com.google.javascript.rhino.head.ast.Scope scope44 = new com.google.javascript.rhino.head.ast.Scope();
        node42.addChildToFront((com.google.javascript.rhino.head.Node) scope44);
        scope38.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode41, node42);
        int int47 = scriptNode41.getEncodedSourceEnd();
        java.lang.String str48 = scriptNode41.shortName();
        int int49 = scriptNode41.getEncodedSourceEnd();
        scriptNode41.setPosition(0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode52.setCompilerData((java.lang.Object) (byte) 100);
        java.lang.String str55 = scriptNode52.getJsDoc();
        scriptNode52.clearParentScope();
        int int57 = scriptNode52.getLength();
        int int58 = scriptNode52.getEndLineno();
        java.lang.String str59 = scriptNode41.toStringTree(scriptNode52);
        scriptNode41.setBaseLineno(636967956);
        // The following exception was thrown during execution in test generation
        try {
            astRoot13.setFinally((com.google.javascript.rhino.head.Node) scriptNode41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(symbolArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(commentArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "$0" + "'", str24, "$0");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionNodeList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AstRoot" + "'", str33, "AstRoot");
        org.junit.Assert.assertNull(comment34);
        org.junit.Assert.assertNotNull(astRoot36);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ScriptNode" + "'", str48, "ScriptNode");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test14518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14518");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str1 = astRoot0.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator3 = scope2.spliterator();
        astRoot0.addChildScope(scope2);
        java.lang.String str6 = astRoot0.toSource(9);
        com.google.javascript.rhino.head.ast.Comment comment7 = null;
        astRoot0.setJsDocNode(comment7);
        int int9 = astRoot0.getType();
        java.lang.String str10 = astRoot0.getEncodedSource();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap11 = null;
        astRoot0.setSymbolTable(strMap11);
        int int13 = astRoot0.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = new com.google.javascript.rhino.head.ast.AstRoot((-236001159));
        astRoot0.addChildScope((com.google.javascript.rhino.head.ast.Scope) astRoot15);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = astRoot15.getAstRoot();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList18 = astRoot17.getSymbols();
        java.lang.Object obj20 = null;
        astRoot17.putProp(32535658, obj20);
        java.lang.String str22 = astRoot17.debugPrint();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$0" + "'", str1, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 136 + "'", int9 == 136);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(symbolList18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-236001159\tSCRIPT -236001159 1\n" + "'", str22, "-236001159\tSCRIPT -236001159 1\n");
    }

    @Test
    public void test14519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14519");
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
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator29 = astRoot12.new NodeIterator();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.Jump jump30 = astRoot12.getJumpStatement();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(symbolArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(commentArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "$0" + "'", str23, "$0");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionNodeList25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test14520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14520");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        java.lang.String[] strArray12 = new java.lang.String[] { "-1\tSCRIPT -1 1\n", "java.io.IOException: ", "136", "136", "java.io.IOException: ", "136", "java.io.IOException: ", "$0", "  {\n  }\n" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet13);
        boolean boolean16 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.Parser parser17 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        boolean boolean18 = compilerEnvirons0.isIdeMode();
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        boolean boolean22 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean23 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test14521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14521");
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
        com.google.javascript.rhino.head.ast.Scope scope16 = scriptNode1.getEnclosingScope();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = scope16.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.ScriptNode cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$0" + "'", str2, "$0");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(functionNodeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$0" + "'", str7, "$0");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(functionNodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(scope16);
    }

    @Test
    public void test14522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14522");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getEndLineno();
        java.lang.Object obj2 = astRoot0.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray3 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet4 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet4, commentArray3);
        astRoot0.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet4);
        com.google.javascript.rhino.head.Node node7 = astRoot0.getLastSibling();
        astRoot0.setEncodedSourceBounds((int) (byte) -1, 20);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList11 = astRoot0.getFunctions();
        java.lang.String str12 = astRoot0.toSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons13.setWarnTrailingComma(true);
        boolean boolean16 = compilerEnvirons13.getWarnTrailingComma();
        compilerEnvirons13.setGeneratingSource(true);
        compilerEnvirons13.setIdeMode(true);
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons13);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str23 = astRoot22.getNextTempName();
        java.lang.String str24 = astRoot22.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList26 = scriptNode25.getSymbols();
        java.lang.String str27 = astRoot22.toStringTree(scriptNode25);
        astRoot22.checkParentLinks();
        int int29 = astRoot22.depth();
        com.google.javascript.rhino.head.Node node30 = iRFactory21.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
        astRoot0.addChildToFront((com.google.javascript.rhino.head.Node) astRoot22);
        astRoot0.setLineno((-605534234));
        astRoot0.setPosition(1017016923);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(commentArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionNodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "$0" + "'", str23, "$0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "136" + "'", str24, "136");
        org.junit.Assert.assertNotNull(symbolList26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test14523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14523");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = astRoot0.getAstRoot();
        java.lang.String str2 = astRoot1.shortName();
        java.lang.String str3 = astRoot1.debugPrint();
        astRoot1.clearParentScope();
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
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator21 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str23 = astRoot22.getNextTempName();
        java.lang.String str24 = astRoot22.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList26 = scriptNode25.getSymbols();
        java.lang.String str27 = astRoot22.toStringTree(scriptNode25);
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope29 = new com.google.javascript.rhino.head.ast.Scope();
        scope28.addChild((com.google.javascript.rhino.head.ast.AstNode) scope29);
        int int31 = positionComparator21.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode25, (com.google.javascript.rhino.head.ast.AstNode) scope28);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator32 = positionComparator5.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator21);
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int35 = astRoot34.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray36 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList37 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList37, symbolArray36);
        astRoot34.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList37);
        com.google.javascript.rhino.head.ast.Scope scope40 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope41 = new com.google.javascript.rhino.head.ast.Scope();
        scope40.addChild((com.google.javascript.rhino.head.ast.AstNode) scope41);
        astRoot34.addChildScope(scope41);
        com.google.javascript.rhino.head.ast.AstRoot astRoot45 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int46 = astRoot45.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot47 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int48 = astRoot47.getEndLineno();
        java.lang.Object obj49 = astRoot47.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray50 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet51 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet51, commentArray50);
        astRoot47.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet51);
        astRoot47.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode55 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str56 = scriptNode55.getNextTempName();
        com.google.javascript.rhino.head.Node node57 = scriptNode55.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList58 = scriptNode55.getFunctions();
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot45, (com.google.javascript.rhino.head.Node) astRoot47, (com.google.javascript.rhino.head.Node) scriptNode55);
        int int60 = astRoot45.getEncodedSourceStart();
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) astRoot34, (com.google.javascript.rhino.head.Node) astRoot45);
        astRoot45.setEncodedSourceBounds((int) (short) 1, (int) (byte) 100);
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node((int) (short) 10, 14);
        com.google.javascript.rhino.head.ast.Scope scope71 = new com.google.javascript.rhino.head.ast.Scope(2, (int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode72 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str74 = scriptNode72.toSource(0);
        scriptNode72.setEncodedSourceBounds(12, 10);
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node((int) '#', node68, (com.google.javascript.rhino.head.Node) scope71, (com.google.javascript.rhino.head.Node) scriptNode72, 2);
        int int80 = positionComparator5.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot45, (com.google.javascript.rhino.head.ast.AstNode) scope71);
        java.lang.String str81 = astRoot45.debugPrint();
        astRoot1.target = astRoot45;
        java.lang.String str83 = astRoot1.getJsDoc();
        com.google.javascript.rhino.head.ast.Scope scope84 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope85 = new com.google.javascript.rhino.head.ast.Scope();
        scope84.addChild((com.google.javascript.rhino.head.ast.AstNode) scope85);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode87 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope85.setTop(scriptNode87);
        com.google.javascript.rhino.head.ast.Symbol symbol90 = scope85.getSymbol("java.io.IOException: ");
        java.lang.String str91 = scope85.debugPrint();
        java.lang.String str92 = scope85.toSource();
        java.lang.Object obj94 = scope85.getProp((-638464135));
        astRoot1.setParentScope(scope85);
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor96 = null;
        // The following exception was thrown during execution in test generation
        try {
            astRoot1.visit(nodeVisitor96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AstRoot" + "'", str2, "AstRoot");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str3, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNotNull(astNodeComparator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$0" + "'", str10, "$0");
        org.junit.Assert.assertNull(astNode12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-3) + "'", int20 == (-3));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "$0" + "'", str23, "$0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "136" + "'", str24, "136");
        org.junit.Assert.assertNotNull(symbolList26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(astNodeComparator32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(symbolArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(commentArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "$0" + "'", str56, "$0");
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(functionNodeList58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "{\n}\n" + "'", str74, "{\n}\n");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-3) + "'", int80 == (-3));
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str81, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNull(symbol90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "-1\t  BLOCK 0 1\n" + "'", str91, "-1\t  BLOCK 0 1\n");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "{\n}\n" + "'", str92, "{\n}\n");
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test14524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14524");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getNextTempName();
        com.google.javascript.rhino.head.Node node2 = scriptNode0.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList3 = scriptNode0.getFunctions();
        int int4 = scriptNode0.getEncodedSourceEnd();
        scriptNode0.setBounds((int) (byte) 0, 3);
        boolean boolean8 = scriptNode0.hasSideEffects();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons9.setRecordingLocalJsDocComments(false);
        java.util.Set<java.lang.String> strSet12 = compilerEnvirons9.getActivationNames();
        boolean boolean13 = compilerEnvirons9.recoverFromErrors();
        boolean boolean14 = compilerEnvirons9.getWarnTrailingComma();
        boolean boolean15 = compilerEnvirons9.isIdeMode();
        boolean boolean16 = compilerEnvirons9.isRecordingLocalJsDocComments();
        compilerEnvirons9.setGeneratingSource(true);
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = astRoot20.getAstRoot();
        java.lang.String str22 = astRoot21.shortName();
        java.lang.String str23 = astRoot21.getSourceName();
        astRoot21.checkParentLinks();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap25 = astRoot21.getSymbolTable();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = iRFactory19.transformTree(astRoot21);
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        boolean boolean28 = astRoot21.isInStrictMode();
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str31 = astRoot30.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope32 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator33 = scope32.spliterator();
        astRoot30.addChildScope(scope32);
        java.lang.String str36 = astRoot30.toSource(9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot37 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str38 = astRoot37.getNextTempName();
        java.lang.String str39 = astRoot37.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList41 = scriptNode40.getSymbols();
        java.lang.String str42 = astRoot37.toStringTree(scriptNode40);
        com.google.javascript.rhino.head.ast.Scope scope43 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope44 = new com.google.javascript.rhino.head.ast.Scope();
        scope43.addChild((com.google.javascript.rhino.head.ast.AstNode) scope44);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope44.setTop(scriptNode46);
        java.lang.String str49 = scope44.toSource(12);
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot30, (com.google.javascript.rhino.head.Node) scriptNode40, (com.google.javascript.rhino.head.Node) scope44);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = scope44.getTop();
        int int52 = scriptNode51.getLength();
        int int53 = scriptNode51.getRegexpCount();
        astRoot21.setTop(scriptNode51);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap55 = astRoot21.getSymbolTable();
        com.google.javascript.rhino.head.ast.AstRoot astRoot56 = astRoot21.getAstRoot();
        com.google.javascript.rhino.head.Node node58 = astRoot21.setType((-3));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$0" + "'", str1, "$0");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(functionNodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(astRoot21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AstRoot" + "'", str22, "AstRoot");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(strMap25);
        org.junit.Assert.assertNotNull(scriptNode26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "$0" + "'", str31, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "$0" + "'", str38, "$0");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "136" + "'", str39, "136");
        org.junit.Assert.assertNotNull(symbolList41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "                        {\n                        }\n" + "'", str49, "                        {\n                        }\n");
        org.junit.Assert.assertNotNull(scriptNode51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(strMap55);
        org.junit.Assert.assertNotNull(astRoot56);
        org.junit.Assert.assertNotNull(node58);
    }

    @Test
    public void test14525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14525");
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
        astRoot1.setBounds(10, (int) (byte) -1);
        astRoot1.checkParentLinks();
        java.lang.String str34 = astRoot1.toSource((-134670566));
        astRoot1.setEncodedSourceEnd(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(symbolArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(commentArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "$0" + "'", str23, "$0");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionNodeList25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test14526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14526");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setRecoverFromErrors(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons4.setWarnTrailingComma(true);
        boolean boolean7 = compilerEnvirons4.isRecordingLocalJsDocComments();
        compilerEnvirons4.setWarnTrailingComma(false);
        compilerEnvirons4.setAllowSharpComments(false);
        boolean boolean12 = compilerEnvirons4.isGenerateDebugInfo();
        compilerEnvirons4.setIdeMode(false);
        compilerEnvirons4.setWarnTrailingComma(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons17.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter20 = compilerEnvirons17.getErrorReporter();
        boolean boolean21 = compilerEnvirons17.isGenerateObserverCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = compilerEnvirons17.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser23 = new com.google.javascript.rhino.head.Parser(compilerEnvirons4, errorReporter22);
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter22);
        boolean boolean25 = compilerEnvirons0.isStrictMode();
        com.google.javascript.rhino.head.Parser parser26 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        boolean boolean27 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean30 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean33 = compilerEnvirons0.recoverFromErrors();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(errorReporter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(errorReporter22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test14527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14527");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        boolean boolean6 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test14528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14528");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getNextTempName();
        java.lang.String str2 = scriptNode0.debugPrint();
        scriptNode0.setLineno((int) (byte) -1);
        scriptNode0.flattenSymbolTable(true);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = scriptNode0.getTop();
        int int8 = scriptNode7.getRegexpCount();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$0" + "'", str1, "$0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str2, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNotNull(scriptNode7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test14529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14529");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.recoverFromErrors();
        boolean boolean5 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean8 = compilerEnvirons0.isRecordingComments();
        boolean boolean9 = compilerEnvirons0.isStrictMode();
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int12 = astRoot11.getEndLineno();
        java.lang.Object obj13 = astRoot11.getCompilerData();
        com.google.javascript.rhino.head.Node node14 = astRoot11.getFirstChild();
        java.lang.String str15 = astRoot11.getNextTempName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory10.transformTree(astRoot11);
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newString("com.google.javascript.rhino.head.EvaluatorException: java.io.IOException: hi! (136#100)");
        scriptNode16.addChildrenToFront(node18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int22 = astRoot21.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray23 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList24 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList24, symbolArray23);
        astRoot21.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList24);
        com.google.javascript.rhino.head.ast.Scope scope27 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope();
        scope27.addChild((com.google.javascript.rhino.head.ast.AstNode) scope28);
        astRoot21.addChildScope(scope28);
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int33 = astRoot32.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int35 = astRoot34.getEndLineno();
        java.lang.Object obj36 = astRoot34.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray37 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet38 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet38, commentArray37);
        astRoot34.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet38);
        astRoot34.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str43 = scriptNode42.getNextTempName();
        com.google.javascript.rhino.head.Node node44 = scriptNode42.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList45 = scriptNode42.getFunctions();
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot32, (com.google.javascript.rhino.head.Node) astRoot34, (com.google.javascript.rhino.head.Node) scriptNode42);
        int int47 = astRoot32.getEncodedSourceStart();
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) astRoot21, (com.google.javascript.rhino.head.Node) astRoot32);
        astRoot32.setEncodedSource("java.io.IOException: ");
        int int51 = astRoot32.getEncodedSourceEnd();
        java.lang.String str53 = astRoot32.makeIndent(14);
        // The following exception was thrown during execution in test generation
        try {
            scriptNode16.setFinally((com.google.javascript.rhino.head.Node) astRoot32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$0" + "'", str15, "$0");
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(symbolArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(commentArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "$0" + "'", str43, "$0");
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(functionNodeList45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "                            " + "'", str53, "                            ");
    }

    @Test
    public void test14530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14530");
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
        boolean boolean16 = compilerEnvirons0.isRecordingComments();
        boolean boolean17 = compilerEnvirons0.isGenerateDebugInfo();
        java.util.Set<java.lang.String> strSet18 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertNotNull(errorReporter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(errorReporter14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strSet18);
    }

    @Test
    public void test14531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14531");
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
        java.lang.String str27 = scriptNode1.debugPrint();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = scriptNode1.getTop();
        com.google.javascript.rhino.head.Node node29 = scriptNode28.getNext();
        int int30 = scriptNode28.getAbsolutePosition();
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = new com.google.javascript.rhino.head.ast.AstRoot((int) (short) 10);
        boolean boolean33 = astRoot32.hasSideEffects();
        int int34 = astRoot32.getParamCount();
        java.lang.String str35 = astRoot32.getEncodedSource();
        scriptNode28.addChildToFront((com.google.javascript.rhino.head.Node) astRoot32);
        astRoot32.setEncodedSourceEnd(997550455);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$0" + "'", str2, "$0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str3, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$0" + "'", str8, "$0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "136" + "'", str9, "136");
        org.junit.Assert.assertNotNull(symbolList11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(commentArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str27, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNotNull(scriptNode28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test14532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14532");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = astRoot1.getAstRoot();
        java.lang.String str3 = astRoot2.shortName();
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.Node node5 = node4.getLastSibling();
        com.google.javascript.rhino.head.ast.Scope scope6 = new com.google.javascript.rhino.head.ast.Scope();
        node4.addChildToFront((com.google.javascript.rhino.head.Node) scope6);
        int int8 = scope6.getLineno();
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node(100, (com.google.javascript.rhino.head.Node) astRoot2, (com.google.javascript.rhino.head.Node) scope6, (int) ' ');
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope12 = new com.google.javascript.rhino.head.ast.Scope();
        scope11.addChild((com.google.javascript.rhino.head.ast.AstNode) scope12);
        astRoot2.addChildrenToFront((com.google.javascript.rhino.head.Node) scope12);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator15 = astRoot2.new NodeIterator();
        int int16 = astRoot2.getPosition();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator18 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str20 = astRoot19.getNextTempName();
        java.lang.String str21 = astRoot19.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList23 = scriptNode22.getSymbols();
        java.lang.String str24 = astRoot19.toStringTree(scriptNode22);
        com.google.javascript.rhino.head.ast.Scope scope25 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope26 = new com.google.javascript.rhino.head.ast.Scope();
        scope25.addChild((com.google.javascript.rhino.head.ast.AstNode) scope26);
        int int28 = positionComparator18.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode22, (com.google.javascript.rhino.head.ast.AstNode) scope25);
        com.google.javascript.rhino.head.ast.AstRoot astRoot29 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str30 = astRoot29.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope31 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator32 = scope31.spliterator();
        astRoot29.addChildScope(scope31);
        java.lang.String str35 = astRoot29.toSource(9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList36 = astRoot29.getFunctions();
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str39 = astRoot38.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode41 = astRoot40.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode42.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot38, (com.google.javascript.rhino.head.Node) astRoot40, (com.google.javascript.rhino.head.Node) scriptNode42);
        int int46 = positionComparator18.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot29, (com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot38, 24);
        astRoot38.removeChildren();
        com.google.javascript.rhino.head.ast.AstRoot astRoot50 = astRoot38.getAstRoot();
        int int51 = astRoot2.compareTo((com.google.javascript.rhino.head.ast.AstNode) astRoot50);
        com.google.javascript.rhino.head.ast.AstRoot astRoot53 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str54 = astRoot53.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope55 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator56 = scope55.spliterator();
        astRoot53.addChildScope(scope55);
        java.lang.String str59 = astRoot53.toSource(9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot60 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str61 = astRoot60.getNextTempName();
        java.lang.String str62 = astRoot60.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList64 = scriptNode63.getSymbols();
        java.lang.String str65 = astRoot60.toStringTree(scriptNode63);
        com.google.javascript.rhino.head.ast.Scope scope66 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope67 = new com.google.javascript.rhino.head.ast.Scope();
        scope66.addChild((com.google.javascript.rhino.head.ast.AstNode) scope67);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode69 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope67.setTop(scriptNode69);
        java.lang.String str72 = scope67.toSource(12);
        com.google.javascript.rhino.head.Node node73 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot53, (com.google.javascript.rhino.head.Node) scriptNode63, (com.google.javascript.rhino.head.Node) scope67);
        astRoot50.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode63);
        com.google.javascript.rhino.head.ast.AstRoot astRoot75 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int76 = astRoot75.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray77 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList78 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList78, symbolArray77);
        astRoot75.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList78);
        astRoot75.clearParentScope();
        astRoot50.addChildrenToBack((com.google.javascript.rhino.head.Node) astRoot75);
        java.lang.String str83 = astRoot50.getNextTempName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode84 = astRoot50.getEnclosingFunction();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap85 = astRoot50.getSymbolTable();
        astRoot50.setEncodedSource("^");
        boolean boolean88 = astRoot50.isInStrictMode();
        org.junit.Assert.assertNotNull(astRoot2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AstRoot" + "'", str3, "AstRoot");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "$0" + "'", str20, "$0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "136" + "'", str21, "136");
        org.junit.Assert.assertNotNull(symbolList23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "$0" + "'", str30, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(functionNodeList36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "$0" + "'", str39, "$0");
        org.junit.Assert.assertNull(astNode41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(astRoot50);
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-705679618) + "'", int51 == (-705679618));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "$0" + "'", str54, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "$0" + "'", str61, "$0");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "136" + "'", str62, "136");
        org.junit.Assert.assertNotNull(symbolList64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "                        {\n                        }\n" + "'", str72, "                        {\n                        }\n");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(symbolArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "$1" + "'", str83, "$1");
        org.junit.Assert.assertNull(functionNode84);
        org.junit.Assert.assertNull(strMap85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test14533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14533");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean3 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setWarnTrailingComma(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setGeneratingSource(true);
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        boolean boolean10 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setXmlAvailable(true);
        int int13 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(errorReporter6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test14534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14534");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode1.getNextTempName();
        java.lang.String str3 = scriptNode1.debugPrint();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = scriptNode1.getEnclosingFunction();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.Node node6 = node5.getLastSibling();
        com.google.javascript.rhino.head.ast.AstRoot astRoot8 = new com.google.javascript.rhino.head.ast.AstRoot(14);
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node(26, (com.google.javascript.rhino.head.Node) scriptNode1, node6, (com.google.javascript.rhino.head.Node) astRoot8);
        int int10 = astRoot8.getEncodedSourceEnd();
        int int11 = astRoot8.getFunctionCount();
        astRoot8.setEncodedSourceStart(25);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str16 = scriptNode15.getNextTempName();
        java.lang.String str17 = scriptNode15.debugPrint();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode18 = scriptNode15.getEnclosingFunction();
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.Node node20 = node19.getLastSibling();
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = new com.google.javascript.rhino.head.ast.AstRoot(14);
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node(26, (com.google.javascript.rhino.head.Node) scriptNode15, node20, (com.google.javascript.rhino.head.Node) astRoot22);
        int int24 = astRoot22.getEncodedSourceEnd();
        int int25 = astRoot22.getFunctionCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int27 = astRoot26.getParamCount();
        astRoot26.setEndLineno((int) (byte) 100);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = astRoot26.getAstRoot();
        java.lang.String str31 = astRoot30.shortName();
        astRoot30.clearParentScope();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor33 = null;
        astRoot30.visitComments(nodeVisitor33);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons35.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter38 = compilerEnvirons35.getErrorReporter();
        boolean boolean39 = compilerEnvirons35.isGenerateObserverCount();
        boolean boolean40 = compilerEnvirons35.recoverFromErrors();
        java.util.Set<java.lang.String> strSet41 = compilerEnvirons35.getActivationNames();
        boolean boolean42 = compilerEnvirons35.reportWarningAsError();
        compilerEnvirons35.setWarnTrailingComma(false);
        boolean boolean45 = compilerEnvirons35.isXmlAvailable();
        com.google.javascript.rhino.head.IRFactory iRFactory46 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons35);
        com.google.javascript.rhino.head.ast.AstRoot astRoot47 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str48 = astRoot47.getNextTempName();
        java.lang.String str49 = astRoot47.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList51 = scriptNode50.getSymbols();
        java.lang.String str52 = astRoot47.toStringTree(scriptNode50);
        astRoot47.checkParentLinks();
        com.google.javascript.rhino.head.Node node54 = astRoot47.getNext();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons56 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons56.setStrictMode(true);
        boolean boolean59 = compilerEnvirons56.recoverFromErrors();
        compilerEnvirons56.setRecordingComments(true);
        astRoot47.putProp(11, (java.lang.Object) true);
        astRoot47.setEncodedSourceEnd(20);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode65 = iRFactory46.transformTree(astRoot47);
        com.google.javascript.rhino.head.ast.AstRoot astRoot67 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str68 = astRoot67.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot69 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode70 = astRoot69.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode71 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode71.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot67, (com.google.javascript.rhino.head.Node) astRoot69, (com.google.javascript.rhino.head.Node) scriptNode71);
        int int75 = astRoot67.getParamCount();
        com.google.javascript.rhino.head.ast.Scope scope76 = new com.google.javascript.rhino.head.ast.Scope();
        scope76.clearParentScope();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot67, scope76);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap79 = astRoot67.getSymbolTable();
        astRoot47.setSymbolTable(strMap79);
        astRoot30.setSymbolTable(strMap79);
        astRoot22.setSymbolTable(strMap79);
        astRoot8.addChildToBack((com.google.javascript.rhino.head.Node) astRoot22);
        boolean boolean84 = astRoot22.hasSideEffects();
        int int85 = astRoot22.getEncodedSourceEnd();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList86 = astRoot22.getStatements();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$0" + "'", str2, "$0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str3, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNull(functionNode4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$0" + "'", str16, "$0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str17, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNull(functionNode18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(astRoot30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AstRoot" + "'", str31, "AstRoot");
        org.junit.Assert.assertNotNull(errorReporter38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(strSet41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "$0" + "'", str48, "$0");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "136" + "'", str49, "136");
        org.junit.Assert.assertNotNull(symbolList51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(scriptNode65);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "$0" + "'", str68, "$0");
        org.junit.Assert.assertNull(astNode70);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(strMap79);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(astNodeList86);
    }

    @Test
    public void test14535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14535");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int2 = astRoot1.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray3 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList4, symbolArray3);
        astRoot1.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList4);
        boolean boolean7 = astRoot1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons8.setWarnTrailingComma(true);
        boolean boolean11 = compilerEnvirons8.isRecordingLocalJsDocComments();
        compilerEnvirons8.setWarnTrailingComma(false);
        compilerEnvirons8.setAllowSharpComments(false);
        boolean boolean16 = compilerEnvirons8.isGenerateDebugInfo();
        astRoot1.setCompilerData((java.lang.Object) boolean16);
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node((int) ' ', (com.google.javascript.rhino.head.Node) astRoot1);
        astRoot1.setPosition(0);
        astRoot1.setInStrictMode(false);
        int int23 = astRoot1.getEndLineno();
        int int24 = astRoot1.getEncodedSourceStart();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(symbolArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test14536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14536");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean3 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean8 = compilerEnvirons0.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons9.setWarnTrailingComma(true);
        java.lang.String[] strArray21 = new java.lang.String[] { "-1\tSCRIPT -1 1\n", "java.io.IOException: ", "136", "136", "java.io.IOException: ", "136", "java.io.IOException: ", "$0", "  {\n  }\n" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        compilerEnvirons9.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        int int28 = compilerEnvirons0.getLanguageVersion();
        boolean boolean29 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean30 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setStrictMode(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test14537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14537");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compilerEnvirons0.getErrorReporter();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.recoverFromErrors();
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        boolean boolean7 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setWarnTrailingComma(false);
        boolean boolean10 = compilerEnvirons0.isXmlAvailable();
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        boolean boolean12 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean13 = compilerEnvirons0.getAllowSharpComments();
        org.junit.Assert.assertNotNull(errorReporter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14538");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList2 = scriptNode1.getSymbols();
        com.google.javascript.rhino.head.Node node3 = scriptNode1.getFirstChild();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int5 = astRoot4.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray6 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList7 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList7, symbolArray6);
        astRoot4.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList7);
        com.google.javascript.rhino.head.ast.Scope scope10 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope();
        scope10.addChild((com.google.javascript.rhino.head.ast.AstNode) scope11);
        astRoot4.addChildScope(scope11);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList14 = astRoot4.getStatements();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList15 = astRoot4.getSymbols();
        scriptNode1.setParent((com.google.javascript.rhino.head.ast.AstNode) astRoot4);
        com.google.javascript.rhino.head.ast.Scope scope17 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope();
        scope17.addChild((com.google.javascript.rhino.head.ast.AstNode) scope18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope18.setTop(scriptNode20);
        com.google.javascript.rhino.head.ast.Scope scope22 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope23 = new com.google.javascript.rhino.head.ast.Scope();
        scope22.addChild((com.google.javascript.rhino.head.ast.AstNode) scope23);
        scriptNode20.setCompilerData((java.lang.Object) scope23);
        scriptNode20.setEncodedSourceEnd(0);
        int int28 = scriptNode20.getType();
        com.google.javascript.rhino.head.ast.AstRoot astRoot29 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str30 = astRoot29.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope31 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator32 = scope31.spliterator();
        astRoot29.addChildScope(scope31);
        java.lang.String str35 = astRoot29.toSource(9);
        scriptNode20.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot29);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str39 = scriptNode37.toSource(0);
        scriptNode37.setPosition((int) 'a');
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(7, (com.google.javascript.rhino.head.Node) astRoot4, (com.google.javascript.rhino.head.Node) scriptNode20, (com.google.javascript.rhino.head.Node) scriptNode37);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList43 = scriptNode20.getStatements();
        org.junit.Assert.assertNotNull(symbolList2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(symbolArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(astNodeList14);
        org.junit.Assert.assertNotNull(symbolList15);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 136 + "'", int28 == 136);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "$0" + "'", str30, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "{\n}\n" + "'", str39, "{\n}\n");
        org.junit.Assert.assertNotNull(astNodeList43);
    }

    @Test
    public void test14539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14539");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str5 = astRoot4.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode7 = astRoot6.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode8.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot4, (com.google.javascript.rhino.head.Node) astRoot6, (com.google.javascript.rhino.head.Node) scriptNode8);
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope(2, (int) (byte) -1);
        int int15 = positionComparator0.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot6, (com.google.javascript.rhino.head.ast.AstNode) scope14);
        astRoot6.removeChildren();
        java.lang.String str18 = astRoot6.toSource(10);
        int int19 = astRoot6.getAbsolutePosition();
        astRoot6.setEncodedSourceStart(545157531);
        org.junit.Assert.assertNotNull(astNodeComparator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$0" + "'", str5, "$0");
        org.junit.Assert.assertNull(astNode7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test14540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14540");
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int31 = astRoot30.getEndLineno();
        java.lang.Object obj32 = astRoot30.getCompilerData();
        com.google.javascript.rhino.head.Node node33 = astRoot30.getFirstChild();
        astRoot20.putProp(2, (java.lang.Object) astRoot30);
        com.google.javascript.rhino.head.Node node35 = astRoot20.target;
        com.google.javascript.rhino.head.ast.Scope scope36 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator37 = scope36.spliterator();
        scope36.setRelative((int) (short) 10);
        com.google.javascript.rhino.head.Node node40 = scope36.target;
        com.google.javascript.rhino.head.ast.AstRoot astRoot41 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str42 = astRoot41.getNextTempName();
        java.lang.String str43 = astRoot41.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = astRoot41.getTop();
        int int45 = astRoot41.getParamCount();
        astRoot41.checkParentLinks();
        scope36.setParent((com.google.javascript.rhino.head.ast.AstNode) astRoot41);
        astRoot20.setTop((com.google.javascript.rhino.head.ast.ScriptNode) astRoot41);
        com.google.javascript.rhino.head.ast.Scope scope49 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope50 = new com.google.javascript.rhino.head.ast.Scope();
        scope49.addChild((com.google.javascript.rhino.head.ast.AstNode) scope50);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope50.setTop(scriptNode52);
        com.google.javascript.rhino.head.ast.Scope scope54 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope55 = new com.google.javascript.rhino.head.ast.Scope();
        scope54.addChild((com.google.javascript.rhino.head.ast.AstNode) scope55);
        scriptNode52.setCompilerData((java.lang.Object) scope55);
        com.google.javascript.rhino.head.ast.AstRoot astRoot58 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot59 = astRoot58.getAstRoot();
        java.lang.String str60 = astRoot59.shortName();
        java.lang.String str61 = astRoot59.debugPrint();
        scope55.addChildToFront((com.google.javascript.rhino.head.Node) astRoot59);
        astRoot20.addChild((com.google.javascript.rhino.head.ast.AstNode) scope55);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator64 = astRoot20.spliterator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot66 = new com.google.javascript.rhino.head.ast.AstRoot(0);
        astRoot20.setTop((com.google.javascript.rhino.head.ast.ScriptNode) astRoot66);
        java.lang.String str68 = astRoot66.debugPrint();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$0" + "'", str2, "$0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
        org.junit.Assert.assertNotNull(symbolList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$0" + "'", str12, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(functionNodeList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "$0" + "'", str21, "$0");
        org.junit.Assert.assertNull(astNode23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(nodeSpliterator37);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "$0" + "'", str42, "$0");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "136" + "'", str43, "136");
        org.junit.Assert.assertNotNull(scriptNode44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(astRoot59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "AstRoot" + "'", str60, "AstRoot");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str61, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNotNull(nodeSpliterator64);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "0\tSCRIPT 0 1\n" + "'", str68, "0\tSCRIPT 0 1\n");
    }

    @Test
    public void test14541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14541");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean3 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setOptimizationLevel(4);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter9);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons11.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter14 = compilerEnvirons11.getErrorReporter();
        compilerEnvirons11.setRecordingComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons17.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter20 = compilerEnvirons17.getErrorReporter();
        boolean boolean21 = compilerEnvirons17.isGenerateObserverCount();
        compilerEnvirons17.setRecordingComments(true);
        boolean boolean24 = compilerEnvirons17.isGenerateObserverCount();
        boolean boolean25 = compilerEnvirons17.isGenerateDebugInfo();
        compilerEnvirons17.setReservedKeywordAsIdentifier(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons28.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter31 = compilerEnvirons28.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons17, errorReporter31);
        boolean boolean33 = compilerEnvirons17.isStrictMode();
        com.google.javascript.rhino.head.ErrorReporter errorReporter34 = compilerEnvirons17.getErrorReporter();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons35.setRecordingLocalJsDocComments(false);
        boolean boolean38 = compilerEnvirons35.isGeneratingSource();
        compilerEnvirons35.setReservedKeywordAsIdentifier(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons41 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons41.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter44 = compilerEnvirons41.getErrorReporter();
        boolean boolean45 = compilerEnvirons41.isGenerateObserverCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter46 = compilerEnvirons41.getErrorReporter();
        com.google.javascript.rhino.head.EvaluatorException evaluatorException52 = errorReporter46.runtimeError("  {\n  }\n", "                                                {\n                                                }\n", (int) (short) 0, "$0", 25);
        errorReporter46.warning("java.io.IOException: java.io.IOException", "                                                {\n                                                }\n", (-12), "$0", (int) '4');
        com.google.javascript.rhino.head.Parser parser59 = new com.google.javascript.rhino.head.Parser(compilerEnvirons35, errorReporter46);
        compilerEnvirons17.setErrorReporter(errorReporter46);
        java.util.Set<java.lang.String> strSet61 = compilerEnvirons17.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons62 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons62.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter65 = compilerEnvirons62.getErrorReporter();
        boolean boolean66 = compilerEnvirons62.isGenerateObserverCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter67 = compilerEnvirons62.getErrorReporter();
        com.google.javascript.rhino.head.EvaluatorException evaluatorException73 = errorReporter67.runtimeError("  {\n  }\n", "                                                {\n                                                }\n", (int) (short) 0, "$0", 25);
        com.google.javascript.rhino.head.Parser parser74 = new com.google.javascript.rhino.head.Parser(compilerEnvirons17, errorReporter67);
        com.google.javascript.rhino.head.Parser parser75 = new com.google.javascript.rhino.head.Parser(compilerEnvirons11, errorReporter67);
        boolean boolean76 = compilerEnvirons11.isGenerateObserverCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter77 = compilerEnvirons11.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter77);
        int int79 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(errorReporter14);
        org.junit.Assert.assertNotNull(errorReporter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(errorReporter31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(errorReporter34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(errorReporter44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(errorReporter46);
        org.junit.Assert.assertNotNull(evaluatorException52);
        org.junit.Assert.assertNull(strSet61);
        org.junit.Assert.assertNotNull(errorReporter65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(errorReporter67);
        org.junit.Assert.assertNotNull(evaluatorException73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(errorReporter77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 4 + "'", int79 == 4);
    }

    @Test
    public void test14542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14542");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.recoverFromErrors();
        boolean boolean5 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean8 = compilerEnvirons0.isRecordingComments();
        boolean boolean9 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        compilerEnvirons0.setRecordingComments(true);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test14543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14543");
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
        astRoot1.removeProp(8);
        astRoot1.setEndLineno(12);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator34 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str36 = astRoot35.getNextTempName();
        java.lang.String str37 = astRoot35.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList39 = scriptNode38.getSymbols();
        java.lang.String str40 = astRoot35.toStringTree(scriptNode38);
        com.google.javascript.rhino.head.ast.Scope scope41 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope42 = new com.google.javascript.rhino.head.ast.Scope();
        scope41.addChild((com.google.javascript.rhino.head.ast.AstNode) scope42);
        int int44 = positionComparator34.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode38, (com.google.javascript.rhino.head.ast.AstNode) scope41);
        com.google.javascript.rhino.head.ast.AstRoot astRoot45 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str46 = astRoot45.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope47 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator48 = scope47.spliterator();
        astRoot45.addChildScope(scope47);
        java.lang.String str51 = astRoot45.toSource(9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList52 = astRoot45.getFunctions();
        com.google.javascript.rhino.head.ast.AstRoot astRoot54 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str55 = astRoot54.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot56 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode57 = astRoot56.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode58 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode58.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot54, (com.google.javascript.rhino.head.Node) astRoot56, (com.google.javascript.rhino.head.Node) scriptNode58);
        int int62 = positionComparator34.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot45, (com.google.javascript.rhino.head.ast.AstNode) astRoot54);
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot54, 24);
        astRoot54.removeChildren();
        com.google.javascript.rhino.head.ast.AstRoot astRoot66 = astRoot54.getAstRoot();
        int int67 = astRoot54.getBaseLineno();
        com.google.javascript.rhino.head.ast.AstRoot astRoot68 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int69 = astRoot68.getEndLineno();
        java.lang.Object obj70 = astRoot68.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray71 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet72 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet72, commentArray71);
        astRoot68.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet72);
        astRoot54.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet72);
        astRoot1.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet72);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode77 = astRoot1.getEnclosingFunction();
        // The following exception was thrown during execution in test generation
        try {
            double double78 = functionNode77.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(symbolArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(commentArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "$0" + "'", str23, "$0");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionNodeList25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "$0" + "'", str36, "$0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "136" + "'", str37, "136");
        org.junit.Assert.assertNotNull(symbolList39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "$0" + "'", str46, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(functionNodeList52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "$0" + "'", str55, "$0");
        org.junit.Assert.assertNull(astNode57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(astRoot66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(commentArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(functionNode77);
    }

    @Test
    public void test14544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14544");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "-1\tSCRIPT -1 1\n", 19);
        astRoot4.setInStrictMode(true);
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString((-414560696), "                        {\n                        }\n");
        astRoot4.setCompilerData((java.lang.Object) node9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str12 = astRoot11.getNextTempName();
        java.lang.String str13 = astRoot11.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList15 = scriptNode14.getSymbols();
        java.lang.String str16 = astRoot11.toStringTree(scriptNode14);
        astRoot11.checkParentLinks();
        com.google.javascript.rhino.head.Node node18 = astRoot11.getNext();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons20.setStrictMode(true);
        boolean boolean23 = compilerEnvirons20.recoverFromErrors();
        compilerEnvirons20.setRecordingComments(true);
        astRoot11.putProp(11, (java.lang.Object) true);
        astRoot11.setInStrictMode(true);
        int int29 = astRoot4.compareTo((com.google.javascript.rhino.head.ast.AstNode) astRoot11);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList30 = astRoot11.getStatements();
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$0" + "'", str12, "$0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "136" + "'", str13, "136");
        org.junit.Assert.assertNotNull(symbolList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(astNodeList30);
    }

    @Test
    public void test14545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14545");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compilerEnvirons0.getErrorReporter();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setRecordingComments(true);
        boolean boolean7 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean8 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean13 = compilerEnvirons0.reportWarningAsError();
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean17 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(errorReporter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test14546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14546");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = astRoot1.getAstRoot();
        java.lang.String str3 = astRoot2.shortName();
        java.lang.String str4 = astRoot2.debugPrint();
        com.google.javascript.rhino.head.Node node5 = astRoot2.getFirstChild();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList6 = astRoot2.getStatements();
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = astRoot2.getAstRoot();
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node((-1268796928), (com.google.javascript.rhino.head.Node) astRoot7);
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope((-1));
        com.google.javascript.rhino.head.ast.AstRoot astRoot13 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int14 = astRoot13.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray15 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList16 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList16, symbolArray15);
        astRoot13.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList16);
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope();
        scope19.addChild((com.google.javascript.rhino.head.ast.AstNode) scope20);
        astRoot13.addChildScope(scope20);
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int25 = astRoot24.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int27 = astRoot26.getEndLineno();
        java.lang.Object obj28 = astRoot26.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray29 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet30 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet30, commentArray29);
        astRoot26.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet30);
        astRoot26.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str35 = scriptNode34.getNextTempName();
        com.google.javascript.rhino.head.Node node36 = scriptNode34.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList37 = scriptNode34.getFunctions();
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot24, (com.google.javascript.rhino.head.Node) astRoot26, (com.google.javascript.rhino.head.Node) scriptNode34);
        int int39 = astRoot24.getEncodedSourceStart();
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) astRoot13, (com.google.javascript.rhino.head.Node) astRoot24);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList41 = astRoot24.getChildScopes();
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = astRoot24.getAstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot43 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str44 = astRoot43.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope45 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator46 = scope45.spliterator();
        astRoot43.addChildScope(scope45);
        java.lang.String str49 = astRoot43.toSource(9);
        com.google.javascript.rhino.head.ast.Comment comment50 = null;
        astRoot43.setJsDocNode(comment50);
        int int52 = astRoot43.getType();
        java.lang.String str53 = astRoot43.getEncodedSource();
        astRoot43.setInStrictMode(false);
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node(703513808, (com.google.javascript.rhino.head.Node) scope11, (com.google.javascript.rhino.head.Node) astRoot24, (com.google.javascript.rhino.head.Node) astRoot43, (int) (byte) 1);
        boolean boolean58 = astRoot24.isInStrictMode();
        java.lang.String str59 = astRoot24.toString();
        astRoot24.setEndLineno(1183427271);
        // The following exception was thrown during execution in test generation
        try {
            astRoot7.setContinue((com.google.javascript.rhino.head.Node) astRoot24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AstRoot" + "'", str3, "AstRoot");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str4, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(astNodeList6);
        org.junit.Assert.assertNotNull(astRoot7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(symbolArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(commentArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "$0" + "'", str35, "$0");
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(functionNodeList37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(scopeList41);
        org.junit.Assert.assertNotNull(astRoot42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "$0" + "'", str44, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 136 + "'", int52 == 136);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "136" + "'", str59, "136");
    }

    @Test
    public void test14547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14547");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean3 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        boolean boolean8 = compilerEnvirons0.isRecordingComments();
        boolean boolean9 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons10.setStrictMode(true);
        boolean boolean13 = compilerEnvirons10.recoverFromErrors();
        compilerEnvirons10.setRecordingComments(true);
        boolean boolean16 = compilerEnvirons10.recoverFromErrors();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons17.setRecordingLocalJsDocComments(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons20.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compilerEnvirons20.getErrorReporter();
        compilerEnvirons17.setErrorReporter(errorReporter23);
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter23);
        com.google.javascript.rhino.head.Parser parser26 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter23);
        boolean boolean27 = compilerEnvirons0.isIdeMode();
        boolean boolean28 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test14548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14548");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setStrictMode(true);
        boolean boolean3 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons5.setWarnTrailingComma(true);
        boolean boolean8 = compilerEnvirons5.isRecordingLocalJsDocComments();
        boolean boolean9 = compilerEnvirons5.isRecordingComments();
        boolean boolean10 = compilerEnvirons5.isReservedKeywordAsIdentifier();
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = compilerEnvirons5.getErrorReporter();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons12.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = compilerEnvirons12.getErrorReporter();
        boolean boolean16 = compilerEnvirons12.isGenerateObserverCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = compilerEnvirons12.getErrorReporter();
        com.google.javascript.rhino.head.EvaluatorException evaluatorException23 = errorReporter17.runtimeError("  {\n  }\n", "                                                {\n                                                }\n", (int) (short) 0, "$0", 25);
        compilerEnvirons5.setErrorReporter(errorReporter17);
        compilerEnvirons5.setAllowMemberExprAsFunctionName(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons27.setRecordingLocalJsDocComments(false);
        java.util.Set<java.lang.String> strSet30 = compilerEnvirons27.getActivationNames();
        boolean boolean31 = compilerEnvirons27.recoverFromErrors();
        boolean boolean32 = compilerEnvirons27.getWarnTrailingComma();
        boolean boolean33 = compilerEnvirons27.isIdeMode();
        boolean boolean34 = compilerEnvirons27.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons35.setStrictMode(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons38 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons38.setWarnTrailingComma(true);
        boolean boolean41 = compilerEnvirons38.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter42 = compilerEnvirons38.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser43 = new com.google.javascript.rhino.head.Parser(compilerEnvirons35, errorReporter42);
        com.google.javascript.rhino.head.Parser parser44 = new com.google.javascript.rhino.head.Parser(compilerEnvirons27, errorReporter42);
        compilerEnvirons5.setErrorReporter(errorReporter42);
        com.google.javascript.rhino.head.IRFactory iRFactory46 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter42);
        errorReporter42.warning("  ", "-1\tSCRIPT -1 1\n-1\tSCRIPT -1 1\n-1\tSCRIPT -1 1\n10\tSCRIPT 10 1\n-1\tSCRIPT -1 1\n", 910648842, "java.io.IOException: ScriptNode", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(errorReporter11);
        org.junit.Assert.assertNotNull(errorReporter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(errorReporter17);
        org.junit.Assert.assertNotNull(evaluatorException23);
        org.junit.Assert.assertNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(errorReporter42);
    }

    @Test
    public void test14549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14549");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getEndLineno();
        java.lang.Object obj2 = astRoot0.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray3 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet4 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet4, commentArray3);
        astRoot0.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet4);
        astRoot0.checkParentLinks();
        java.lang.String str8 = astRoot0.getEncodedSource();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str11 = astRoot10.getNextTempName();
        java.lang.String str12 = astRoot10.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList14 = scriptNode13.getSymbols();
        java.lang.String str15 = astRoot10.toStringTree(scriptNode13);
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node(6, (com.google.javascript.rhino.head.Node) astRoot10);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator17 = astRoot10.spliterator();
        astRoot0.addChildScope((com.google.javascript.rhino.head.ast.Scope) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = astRoot10.getAstRoot();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(commentArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$0" + "'", str11, "$0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "136" + "'", str12, "136");
        org.junit.Assert.assertNotNull(symbolList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(nodeSpliterator17);
        org.junit.Assert.assertNotNull(astRoot19);
    }

    @Test
    public void test14550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14550");
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str3 = astRoot2.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode5 = astRoot4.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot2, (com.google.javascript.rhino.head.Node) astRoot4, (com.google.javascript.rhino.head.Node) scriptNode6);
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray10 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList11 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList11, symbolArray10);
        scriptNode6.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = scriptNode6.getTop();
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = new com.google.javascript.rhino.head.ast.AstRoot((int) (short) 10);
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor17 = null;
        astRoot16.visitComments(nodeVisitor17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int21 = astRoot20.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray22 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList23 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList23, symbolArray22);
        astRoot20.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList23);
        boolean boolean26 = astRoot20.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons27.setWarnTrailingComma(true);
        boolean boolean30 = compilerEnvirons27.isRecordingLocalJsDocComments();
        compilerEnvirons27.setWarnTrailingComma(false);
        compilerEnvirons27.setAllowSharpComments(false);
        boolean boolean35 = compilerEnvirons27.isGenerateDebugInfo();
        astRoot20.setCompilerData((java.lang.Object) boolean35);
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) ' ', (com.google.javascript.rhino.head.Node) astRoot20);
        astRoot16.addChildrenToBack(node37);
        scriptNode6.addChildrenToBack((com.google.javascript.rhino.head.Node) astRoot16);
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int41 = astRoot40.getEndLineno();
        java.lang.Object obj42 = astRoot40.getCompilerData();
        com.google.javascript.rhino.head.ast.Symbol symbol44 = astRoot40.getSymbol("java.io.IOException: ");
        astRoot40.setSourceName("java.io.IOException: ");
        boolean boolean47 = astRoot40.isInStrictMode();
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node(170, (com.google.javascript.rhino.head.Node) astRoot16, (com.google.javascript.rhino.head.Node) astRoot40);
        astRoot40.setPosition(19);
        com.google.javascript.rhino.head.Node node51 = astRoot40.getNext();
        com.google.javascript.rhino.head.ast.Scope scope54 = new com.google.javascript.rhino.head.ast.Scope(550287075, (-543879055));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode55 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str56 = scriptNode55.getNextTempName();
        com.google.javascript.rhino.head.Node node57 = scriptNode55.target;
        int int58 = scriptNode55.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node node59 = scriptNode55.getLastChild();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList60 = scriptNode55.getSymbols();
        scriptNode55.setBaseLineno(19);
        scope54.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode55);
        boolean boolean64 = scope54.hasSideEffects();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator65 = scope54.new NodeIterator();
        com.google.javascript.rhino.head.Node node66 = nodeIterator65.next();
        astRoot40.addChildToBack(node66);
        int int68 = astRoot40.getLineno();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$0" + "'", str3, "$0");
        org.junit.Assert.assertNull(astNode5);
        org.junit.Assert.assertNotNull(symbolArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(scriptNode14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(symbolArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(symbol44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "$0" + "'", str56, "$0");
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(symbolList60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test14551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14551");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope();
        scope2.addChild((com.google.javascript.rhino.head.ast.AstNode) scope3);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope3.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode5);
        com.google.javascript.rhino.head.ast.Comment comment7 = null;
        scriptNode5.setJsDocNode(comment7);
        int int9 = scriptNode5.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope(20);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList12 = scope11.getChildScopes();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((-11), (com.google.javascript.rhino.head.Node) scriptNode5, (com.google.javascript.rhino.head.Node) scope11, (int) (short) 10);
        java.lang.Object obj16 = scope11.getProp((-1));
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int20 = astRoot19.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray21 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList22 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList22, symbolArray21);
        astRoot19.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList22);
        com.google.javascript.rhino.head.ast.Scope scope25 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope26 = new com.google.javascript.rhino.head.ast.Scope();
        scope25.addChild((com.google.javascript.rhino.head.ast.AstNode) scope26);
        astRoot19.addChildScope(scope26);
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
        int int45 = astRoot30.getEncodedSourceStart();
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) astRoot19, (com.google.javascript.rhino.head.Node) astRoot30);
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node((int) (byte) 100, (com.google.javascript.rhino.head.Node) astRoot30);
        com.google.javascript.rhino.head.Node node48 = astRoot30.getLastSibling();
        com.google.javascript.rhino.head.ast.AstRoot astRoot49 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot50 = astRoot49.getAstRoot();
        java.lang.String str51 = astRoot50.shortName();
        java.lang.String str53 = astRoot50.toSource(1);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList54 = astRoot50.getFunctions();
        astRoot50.checkParentLinks();
        boolean boolean56 = astRoot50.hasChildren();
        int int57 = astRoot50.getLineno();
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((-1), (com.google.javascript.rhino.head.Node) scope11, (com.google.javascript.rhino.head.Node) astRoot30, (com.google.javascript.rhino.head.Node) astRoot50, (int) ' ');
        java.lang.String str60 = astRoot30.getSourceName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot61 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int62 = astRoot61.getEndLineno();
        java.lang.Object obj63 = astRoot61.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray64 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet65 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet65, commentArray64);
        astRoot61.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet65);
        astRoot61.checkParentLinks();
        astRoot61.setEndLineno((int) (short) 10);
        java.lang.String str71 = astRoot61.shortName();
        com.google.javascript.rhino.head.Node node73 = com.google.javascript.rhino.head.Node.newString("-3\tSCRIPT -3 1\n");
        com.google.javascript.rhino.head.ast.AstRoot astRoot76 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str77 = astRoot76.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot78 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode79 = astRoot78.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode80 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode80.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot76, (com.google.javascript.rhino.head.Node) astRoot78, (com.google.javascript.rhino.head.Node) scriptNode80);
        int int84 = astRoot76.getParamCount();
        java.lang.String str85 = astRoot76.debugPrint();
        com.google.javascript.rhino.head.Node node86 = new com.google.javascript.rhino.head.Node(26, (com.google.javascript.rhino.head.Node) astRoot76);
        com.google.javascript.rhino.head.ast.AstRoot astRoot87 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int88 = astRoot87.getEndLineno();
        java.lang.Object obj89 = astRoot87.getCompilerData();
        astRoot87.setBaseLineno(14);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor92 = astRoot87.iterator();
        astRoot87.clearParentScope();
        java.lang.String str94 = astRoot87.getEncodedSource();
        int int95 = astRoot87.getEncodedSourceStart();
        node73.addChildAfter(node86, (com.google.javascript.rhino.head.Node) astRoot87);
        astRoot61.target = node73;
        // The following exception was thrown during execution in test generation
        try {
            astRoot30.setFinally(node73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(scopeList12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(symbolArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(commentArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "$0" + "'", str41, "$0");
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionNodeList43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(astRoot50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "AstRoot" + "'", str51, "AstRoot");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(functionNodeList54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(commentArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "AstRoot" + "'", str71, "AstRoot");
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "$0" + "'", str77, "$0");
        org.junit.Assert.assertNull(astNode79);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str85, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(nodeItor92);
        org.junit.Assert.assertNull(str94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
    }

    @Test
    public void test14552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14552");
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
        java.lang.String str19 = scriptNode12.getSourceName();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node(2, (com.google.javascript.rhino.head.Node) scriptNode12, 6);
        com.google.javascript.rhino.head.ast.Scope scope23 = scriptNode12.getDefiningScope("8\tSCRIPT 8 1\n");
        com.google.javascript.rhino.head.Node node24 = scriptNode12.getNext();
        com.google.javascript.rhino.head.Node node25 = scriptNode12.target;
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList26 = scriptNode12.getStatements();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$0" + "'", str3, "$0");
        org.junit.Assert.assertNull(astNode5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$0" + "'", str13, "$0");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(scope23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(astNodeList26);
    }

    @Test
    public void test14553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14553");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.recoverFromErrors();
        boolean boolean5 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean8 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean11 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        boolean boolean16 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14554");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = astRoot0.getAstRoot();
        java.lang.String str2 = astRoot1.shortName();
        java.lang.String str3 = astRoot1.getSourceName();
        astRoot1.checkParentLinks();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap5 = astRoot1.getSymbolTable();
        java.lang.String str7 = astRoot1.makeIndent(32);
        com.google.javascript.rhino.head.ast.Scope scope9 = astRoot1.getDefiningScope("136");
        astRoot1.setEncodedSourceEnd(627479866);
        astRoot1.setSourceName("-3\tSCRIPT -3 1\n");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = null;
        java.lang.String str15 = astRoot1.toStringTree(scriptNode14);
        astRoot1.flattenSymbolTable(false);
        astRoot1.removeProp(1942790351);
        org.junit.Assert.assertNotNull(astRoot1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AstRoot" + "'", str2, "AstRoot");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                " + "'", str7, "                                                                ");
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test14555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14555");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setWarnTrailingComma(false);
        int int6 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = compilerEnvirons0.getErrorReporter();
        boolean boolean10 = compilerEnvirons0.isStrictMode();
        boolean boolean11 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertNotNull(errorReporter3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(errorReporter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14556");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setRecordingComments(true);
        com.google.javascript.rhino.head.Parser parser9 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        compilerEnvirons0.setGenerateDebugInfo(false);
        boolean boolean12 = compilerEnvirons0.isXmlAvailable();
        int int13 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean14 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test14557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14557");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean3 = compilerEnvirons0.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons4.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter7 = compilerEnvirons4.getErrorReporter();
        boolean boolean8 = compilerEnvirons4.isGenerateObserverCount();
        compilerEnvirons4.setRecordingComments(true);
        boolean boolean11 = compilerEnvirons4.isGenerateObserverCount();
        boolean boolean12 = compilerEnvirons4.isGenerateDebugInfo();
        compilerEnvirons4.setReservedKeywordAsIdentifier(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons15.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter18 = compilerEnvirons15.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter18);
        boolean boolean20 = compilerEnvirons4.isStrictMode();
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = compilerEnvirons4.getErrorReporter();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons22.setRecordingLocalJsDocComments(false);
        boolean boolean25 = compilerEnvirons22.isGeneratingSource();
        compilerEnvirons22.setReservedKeywordAsIdentifier(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons28.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter31 = compilerEnvirons28.getErrorReporter();
        boolean boolean32 = compilerEnvirons28.isGenerateObserverCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter33 = compilerEnvirons28.getErrorReporter();
        com.google.javascript.rhino.head.EvaluatorException evaluatorException39 = errorReporter33.runtimeError("  {\n  }\n", "                                                {\n                                                }\n", (int) (short) 0, "$0", 25);
        errorReporter33.warning("java.io.IOException: java.io.IOException", "                                                {\n                                                }\n", (-12), "$0", (int) '4');
        com.google.javascript.rhino.head.Parser parser46 = new com.google.javascript.rhino.head.Parser(compilerEnvirons22, errorReporter33);
        compilerEnvirons4.setErrorReporter(errorReporter33);
        com.google.javascript.rhino.head.Parser parser48 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter33);
        java.util.Set<java.lang.String> strSet49 = compilerEnvirons0.getActivationNames();
        boolean boolean50 = compilerEnvirons0.isXmlAvailable();
        com.google.javascript.rhino.head.ErrorReporter errorReporter51 = compilerEnvirons0.getErrorReporter();
        boolean boolean52 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setWarnTrailingComma(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(errorReporter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(errorReporter18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(errorReporter21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(errorReporter31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(errorReporter33);
        org.junit.Assert.assertNotNull(evaluatorException39);
        org.junit.Assert.assertNull(strSet49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(errorReporter51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test14558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14558");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = astRoot0.getAstRoot();
        java.lang.String str2 = astRoot1.shortName();
        java.lang.String str3 = astRoot1.getSourceName();
        astRoot1.checkParentLinks();
        int int5 = astRoot1.depth();
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int8 = astRoot7.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int10 = astRoot9.getEndLineno();
        java.lang.Object obj11 = astRoot9.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray12 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet13 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet13, commentArray12);
        astRoot9.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet13);
        astRoot9.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str18 = scriptNode17.getNextTempName();
        com.google.javascript.rhino.head.Node node19 = scriptNode17.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList20 = scriptNode17.getFunctions();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot7, (com.google.javascript.rhino.head.Node) astRoot9, (com.google.javascript.rhino.head.Node) scriptNode17);
        astRoot7.setEncodedSourceBounds(21, (int) (short) 10);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet25 = astRoot7.getComments();
        astRoot1.target = astRoot7;
        java.lang.String str27 = astRoot7.toSource();
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int29 = astRoot28.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray30 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList31 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList31, symbolArray30);
        astRoot28.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList31);
        boolean boolean34 = astRoot28.hasChildren();
        int int35 = astRoot28.getAbsolutePosition();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str37 = scriptNode36.getNextTempName();
        int int38 = scriptNode36.depth();
        com.google.javascript.rhino.head.ast.Comment comment39 = null;
        scriptNode36.setJsDocNode(comment39);
        com.google.javascript.rhino.head.Node node41 = scriptNode36.getLastSibling();
        astRoot28.target = scriptNode36;
        int int43 = scriptNode36.getRegexpCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot44 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot45 = astRoot44.getAstRoot();
        java.lang.String str46 = astRoot45.shortName();
        java.lang.String str48 = astRoot45.toSource(1);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList49 = astRoot45.getFunctions();
        astRoot45.checkParentLinks();
        boolean boolean51 = astRoot45.hasConsistentReturnUsage();
        int int52 = astRoot45.getRegexpCount();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList53 = astRoot45.getSymbols();
        scriptNode36.setSymbols(symbolList53);
        com.google.javascript.rhino.head.ast.AstRoot astRoot55 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str56 = astRoot55.getNextTempName();
        java.lang.String str57 = astRoot55.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode58 = astRoot55.getTop();
        int int59 = astRoot55.getParamCount();
        boolean boolean60 = astRoot55.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator61 = astRoot55.new NodeIterator();
        com.google.javascript.rhino.head.ast.Symbol symbol63 = astRoot55.getSymbol("                                    ");
        boolean boolean64 = astRoot55.isInStrictMode();
        com.google.javascript.rhino.head.ast.Scope scope65 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope66 = new com.google.javascript.rhino.head.ast.Scope();
        scope65.addChild((com.google.javascript.rhino.head.ast.AstNode) scope66);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode68 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope66.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode68);
        int int72 = scriptNode68.getIntProp((int) 'a', 19);
        scriptNode68.removeChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode74 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList75 = scriptNode74.getSymbols();
        scriptNode68.setSymbols(symbolList75);
        astRoot55.setSymbols(symbolList75);
        scriptNode36.setSymbols(symbolList75);
        astRoot7.setSymbols(symbolList75);
        int int80 = astRoot7.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol symbol81 = null;
        // The following exception was thrown during execution in test generation
        try {
            astRoot7.putSymbol(symbol81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AstRoot" + "'", str2, "AstRoot");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(commentArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "$0" + "'", str18, "$0");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(functionNodeList20);
        org.junit.Assert.assertNull(commentSet25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(symbolArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "$0" + "'", str37, "$0");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(astRoot45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "AstRoot" + "'", str46, "AstRoot");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(functionNodeList49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(symbolList53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "$0" + "'", str56, "$0");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "136" + "'", str57, "136");
        org.junit.Assert.assertNotNull(scriptNode58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(symbol63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 19 + "'", int72 == 19);
        org.junit.Assert.assertNotNull(symbolList75);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test14559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14559");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compilerEnvirons0.getErrorReporter();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        boolean boolean8 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.Parser parser9 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        boolean boolean10 = compilerEnvirons0.isGeneratingSource();
        int int11 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        org.junit.Assert.assertNotNull(errorReporter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(errorReporter5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test14560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14560");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode1.getNextTempName();
        java.lang.String str3 = scriptNode1.debugPrint();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode4 = scriptNode1.getEnclosingFunction();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.Node node6 = node5.getLastSibling();
        com.google.javascript.rhino.head.ast.AstRoot astRoot8 = new com.google.javascript.rhino.head.ast.AstRoot(14);
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node(26, (com.google.javascript.rhino.head.Node) scriptNode1, node6, (com.google.javascript.rhino.head.Node) astRoot8);
        int int10 = astRoot8.getEncodedSourceEnd();
        int int11 = astRoot8.getFunctionCount();
        astRoot8.setEncodedSourceStart((int) (short) -1);
        java.lang.String str14 = astRoot8.shortName();
        astRoot8.setInStrictMode(true);
        astRoot8.setPosition((-408128072));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$0" + "'", str2, "$0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str3, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNull(functionNode4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AstRoot" + "'", str14, "AstRoot");
    }

    @Test
    public void test14561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14561");
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str18 = astRoot17.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope19 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator20 = scope19.spliterator();
        astRoot17.addChildScope(scope19);
        java.lang.String str23 = astRoot17.toSource(9);
        com.google.javascript.rhino.head.ast.Comment comment24 = null;
        astRoot17.setJsDocNode(comment24);
        astRoot17.setEncodedSourceStart(4);
        com.google.javascript.rhino.head.ast.AstRoot astRoot29 = new com.google.javascript.rhino.head.ast.AstRoot((int) (short) 10);
        boolean boolean30 = astRoot29.hasSideEffects();
        int int31 = astRoot29.getParamCount();
        astRoot17.addChildrenToBack((com.google.javascript.rhino.head.Node) astRoot29);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str35 = scriptNode33.toSource(0);
        scriptNode33.setEncodedSourceBounds(12, 10);
        scriptNode33.setSourceName("");
        astRoot17.setTop(scriptNode33);
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int43 = astRoot42.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray44 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList45 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList45, symbolArray44);
        astRoot42.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList45);
        boolean boolean48 = astRoot42.hasConsistentReturnUsage();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap49 = astRoot42.getSymbolTable();
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node((int) ' ', (com.google.javascript.rhino.head.Node) astRoot2, (com.google.javascript.rhino.head.Node) astRoot17, (com.google.javascript.rhino.head.Node) astRoot42);
        int int51 = astRoot2.depth();
        com.google.javascript.rhino.head.ast.AstNode astNode52 = astRoot2.getParent();
        java.lang.String str54 = astRoot2.toSource((-2098348212));
        astRoot2.removeProp(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(commentArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$0" + "'", str13, "$0");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(functionNodeList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "$0" + "'", str18, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "{\n}\n" + "'", str35, "{\n}\n");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(symbolArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(strMap49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(astNode52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test14562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14562");
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
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean34 = compilerEnvirons0.recoverFromErrors();
        boolean boolean35 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test14563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14563");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = astRoot0.getAstRoot();
        java.lang.String str2 = astRoot1.shortName();
        java.lang.String str4 = astRoot1.toSource(1);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList5 = astRoot1.getFunctions();
        astRoot1.checkParentLinks();
        boolean boolean7 = astRoot1.hasChildren();
        java.lang.String str8 = astRoot1.debugPrint();
        com.google.javascript.rhino.head.Node node9 = astRoot1.getLastSibling();
        java.lang.String str11 = astRoot1.toSource((-455627157));
        org.junit.Assert.assertNotNull(astRoot1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AstRoot" + "'", str2, "AstRoot");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(functionNodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str8, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test14564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14564");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons1.setRecordingLocalJsDocComments(false);
        java.util.Set<java.lang.String> strSet4 = compilerEnvirons1.getActivationNames();
        boolean boolean5 = compilerEnvirons1.recoverFromErrors();
        boolean boolean6 = compilerEnvirons1.getWarnTrailingComma();
        compilerEnvirons1.setWarnTrailingComma(true);
        boolean boolean9 = compilerEnvirons1.isRecordingComments();
        boolean boolean10 = compilerEnvirons1.isStrictMode();
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot13 = new com.google.javascript.rhino.head.ast.AstRoot((int) (short) 10);
        int int14 = astRoot13.getType();
        com.google.javascript.rhino.head.Node node15 = astRoot13.getFirstChild();
        astRoot13.putIntProp((int) (short) 100, 953557037);
        int int19 = astRoot13.getEndLineno();
        com.google.javascript.rhino.head.Node node20 = iRFactory11.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot13);
        int int21 = astRoot13.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.Scope scope23 = new com.google.javascript.rhino.head.ast.Scope(627479866);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons24.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = compilerEnvirons24.getErrorReporter();
        boolean boolean28 = compilerEnvirons24.isGenerateObserverCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = compilerEnvirons24.getErrorReporter();
        compilerEnvirons24.setRecordingLocalJsDocComments(true);
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons24);
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons24);
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
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node(6, (com.google.javascript.rhino.head.Node) scope45);
        com.google.javascript.rhino.head.ast.AstRoot astRoot50 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str51 = astRoot50.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope52 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator53 = scope52.spliterator();
        astRoot50.addChildScope(scope52);
        java.lang.String str56 = astRoot50.toSource(9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot57 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str58 = astRoot57.getNextTempName();
        java.lang.String str59 = astRoot57.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList61 = scriptNode60.getSymbols();
        java.lang.String str62 = astRoot57.toStringTree(scriptNode60);
        com.google.javascript.rhino.head.ast.Scope scope63 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope64 = new com.google.javascript.rhino.head.ast.Scope();
        scope63.addChild((com.google.javascript.rhino.head.ast.AstNode) scope64);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope64.setTop(scriptNode66);
        java.lang.String str69 = scope64.toSource(12);
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot50, (com.google.javascript.rhino.head.Node) scriptNode60, (com.google.javascript.rhino.head.Node) scope64);
        astRoot50.setBaseLineno(19);
        astRoot50.checkParentLinks();
        com.google.javascript.rhino.head.Node node76 = new com.google.javascript.rhino.head.Node(14, 26);
        scope45.replaceChildAfter((com.google.javascript.rhino.head.Node) astRoot50, node76);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode78 = iRFactory33.transformTree(astRoot50);
        com.google.javascript.rhino.head.Node node80 = new com.google.javascript.rhino.head.Node((-207088395), (com.google.javascript.rhino.head.Node) astRoot13, (com.google.javascript.rhino.head.Node) scope23, (com.google.javascript.rhino.head.Node) astRoot50, 903468300);
        int int81 = astRoot13.getPosition();
        java.lang.String str83 = astRoot13.makeIndent(22);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 136 + "'", int14 == 136);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(errorReporter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(errorReporter29);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "$0" + "'", str37, "$0");
        org.junit.Assert.assertNull(astNode39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "$0" + "'", str51, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "$0" + "'", str58, "$0");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "136" + "'", str59, "136");
        org.junit.Assert.assertNotNull(symbolList61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "                        {\n                        }\n" + "'", str69, "                        {\n                        }\n");
        org.junit.Assert.assertNotNull(scriptNode78);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 10 + "'", int81 == 10);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "                                            " + "'", str83, "                                            ");
    }

    @Test
    public void test14565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14565");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.recoverFromErrors();
        boolean boolean5 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons9.setWarnTrailingComma(true);
        boolean boolean12 = compilerEnvirons9.getWarnTrailingComma();
        compilerEnvirons9.setGeneratingSource(true);
        compilerEnvirons9.setIdeMode(true);
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons9);
        boolean boolean18 = compilerEnvirons9.getWarnTrailingComma();
        compilerEnvirons9.setAllowMemberExprAsFunctionName(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons21.setRecordingLocalJsDocComments(false);
        boolean boolean24 = compilerEnvirons21.isGeneratingSource();
        compilerEnvirons21.setGeneratingSource(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons27.setWarnTrailingComma(true);
        boolean boolean30 = compilerEnvirons27.isRecordingLocalJsDocComments();
        compilerEnvirons27.setWarnTrailingComma(false);
        compilerEnvirons27.setAllowSharpComments(false);
        boolean boolean35 = compilerEnvirons27.isGenerateDebugInfo();
        compilerEnvirons27.setIdeMode(false);
        compilerEnvirons27.setWarnTrailingComma(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons40 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons40.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter43 = compilerEnvirons40.getErrorReporter();
        boolean boolean44 = compilerEnvirons40.isGenerateObserverCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter45 = compilerEnvirons40.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser46 = new com.google.javascript.rhino.head.Parser(compilerEnvirons27, errorReporter45);
        compilerEnvirons21.setErrorReporter(errorReporter45);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons48 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons48.setWarnTrailingComma(true);
        boolean boolean51 = compilerEnvirons48.getWarnTrailingComma();
        compilerEnvirons48.setGeneratingSource(true);
        compilerEnvirons48.setOptimizationLevel(4);
        boolean boolean56 = compilerEnvirons48.isGeneratingSource();
        boolean boolean57 = compilerEnvirons48.getWarnTrailingComma();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons58 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons58.setRecordingLocalJsDocComments(false);
        java.util.Set<java.lang.String> strSet61 = compilerEnvirons58.getActivationNames();
        boolean boolean62 = compilerEnvirons58.recoverFromErrors();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons63 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons63.setWarnTrailingComma(true);
        boolean boolean66 = compilerEnvirons63.isRecordingLocalJsDocComments();
        compilerEnvirons63.setWarnTrailingComma(false);
        compilerEnvirons63.setAllowSharpComments(false);
        boolean boolean71 = compilerEnvirons63.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons72 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons72.setWarnTrailingComma(true);
        java.lang.String[] strArray84 = new java.lang.String[] { "-1\tSCRIPT -1 1\n", "java.io.IOException: ", "136", "136", "java.io.IOException: ", "136", "java.io.IOException: ", "$0", "  {\n  }\n" };
        java.util.LinkedHashSet<java.lang.String> strSet85 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet85, strArray84);
        compilerEnvirons72.setActivationNames((java.util.Set<java.lang.String>) strSet85);
        compilerEnvirons63.setActivationNames((java.util.Set<java.lang.String>) strSet85);
        compilerEnvirons58.setActivationNames((java.util.Set<java.lang.String>) strSet85);
        compilerEnvirons48.setActivationNames((java.util.Set<java.lang.String>) strSet85);
        compilerEnvirons21.setActivationNames((java.util.Set<java.lang.String>) strSet85);
        compilerEnvirons9.setActivationNames((java.util.Set<java.lang.String>) strSet85);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet85);
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(errorReporter43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(errorReporter45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(strSet61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test14566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14566");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode1 = astRoot0.getParent();
        com.google.javascript.rhino.head.ast.Scope scope3 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope4 = new com.google.javascript.rhino.head.ast.Scope();
        scope3.addChild((com.google.javascript.rhino.head.ast.AstNode) scope4);
        com.google.javascript.rhino.head.Node node6 = scope4.getFirstChild();
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node((int) (byte) -1, (com.google.javascript.rhino.head.Node) scope4);
        astRoot0.target = node7;
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = astRoot0.getAstRoot();
        boolean boolean10 = astRoot9.hasSideEffects();
        astRoot9.removeProp(1020469049);
        org.junit.Assert.assertNull(astNode1);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test14567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14567");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((-1169853118), 531785163);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = scope2.labelId();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14568");
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
        boolean boolean63 = scriptNode38.hasSideEffects();
        scriptNode38.setEndLineno(1577815058);
        com.google.javascript.rhino.head.ast.AstNode astNode66 = scriptNode38.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node67 = scriptNode38.getFinally();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(astNodeComparator2);
        org.junit.Assert.assertNotNull(astNodeComparator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$0" + "'", str8, "$0");
        org.junit.Assert.assertNull(astNode10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertNotNull(astNodeComparator19);
        org.junit.Assert.assertNotNull(astNodeComparator22);
        org.junit.Assert.assertNotNull(astNodeComparator23);
        org.junit.Assert.assertNotNull(astNodeComparator25);
        org.junit.Assert.assertNotNull(astRoot30);
        org.junit.Assert.assertNull(comment31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 19 + "'", int32 == 19);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "{\n}\n" + "'", str40, "{\n}\n");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "$0" + "'", str46, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator48);
        org.junit.Assert.assertNotNull(scopeList50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(astNode66);
    }

    @Test
    public void test14569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14569");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot(304482124);
        astRoot1.setEncodedSourceBounds(0, (-1159695761));
    }

    @Test
    public void test14570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14570");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode2.setCompilerData((java.lang.Object) (byte) 100);
        java.lang.String str5 = scriptNode2.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope8 = new com.google.javascript.rhino.head.ast.Scope(2, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode2, (com.google.javascript.rhino.head.Node) scope8, 25);
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = astRoot11.getAstRoot();
        java.lang.String str13 = astRoot12.shortName();
        java.lang.String str14 = astRoot12.getSourceName();
        astRoot12.checkParentLinks();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap16 = astRoot12.getSymbolTable();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) scope8, (com.google.javascript.rhino.head.Node) astRoot12);
        java.lang.Object obj18 = astRoot12.getCompilerData();
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str22 = astRoot21.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode24 = astRoot23.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode25.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot21, (com.google.javascript.rhino.head.Node) astRoot23, (com.google.javascript.rhino.head.Node) scriptNode25);
        astRoot23.setInStrictMode(true);
        int int31 = astRoot23.getBaseLineno();
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str33 = astRoot32.getNextTempName();
        java.lang.String str34 = astRoot32.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList36 = scriptNode35.getSymbols();
        java.lang.String str37 = astRoot32.toStringTree(scriptNode35);
        astRoot32.checkParentLinks();
        int int41 = astRoot32.getIntProp(11, 32);
        int int42 = astRoot32.getPosition();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((-738182430), (com.google.javascript.rhino.head.Node) astRoot23, (com.google.javascript.rhino.head.Node) astRoot32, 2);
        com.google.javascript.rhino.head.ast.Scope scope46 = new com.google.javascript.rhino.head.ast.Scope(23);
        scope46.removeProp(22);
        astRoot12.addChildAfter((com.google.javascript.rhino.head.Node) astRoot32, (com.google.javascript.rhino.head.Node) scope46);
        com.google.javascript.rhino.head.ast.Comment comment50 = null;
        // The following exception was thrown during execution in test generation
        try {
            astRoot32.addComment(comment50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: arg cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$0" + "'", str5, "$0");
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AstRoot" + "'", str13, "AstRoot");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "$0" + "'", str22, "$0");
        org.junit.Assert.assertNull(astNode24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "$0" + "'", str33, "$0");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "136" + "'", str34, "136");
        org.junit.Assert.assertNotNull(symbolList36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test14571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14571");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = astRoot1.getAstRoot();
        java.lang.String str3 = astRoot2.shortName();
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.Node node5 = node4.getLastSibling();
        com.google.javascript.rhino.head.ast.Scope scope6 = new com.google.javascript.rhino.head.ast.Scope();
        node4.addChildToFront((com.google.javascript.rhino.head.Node) scope6);
        int int8 = scope6.getLineno();
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node(100, (com.google.javascript.rhino.head.Node) astRoot2, (com.google.javascript.rhino.head.Node) scope6, (int) ' ');
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope12 = new com.google.javascript.rhino.head.ast.Scope();
        scope11.addChild((com.google.javascript.rhino.head.ast.AstNode) scope12);
        astRoot2.addChildrenToFront((com.google.javascript.rhino.head.Node) scope12);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator15 = astRoot2.new NodeIterator();
        boolean boolean16 = astRoot2.hasSideEffects();
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int18 = astRoot17.getEndLineno();
        java.lang.Object obj19 = astRoot17.getCompilerData();
        int int20 = astRoot17.getLineno();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList21 = astRoot17.getSymbols();
        astRoot2.setSymbols(symbolList21);
        org.junit.Assert.assertNotNull(astRoot2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AstRoot" + "'", str3, "AstRoot");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(symbolList21);
    }

    @Test
    public void test14572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14572");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean3 = compilerEnvirons0.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        boolean boolean9 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setXmlAvailable(true);
        boolean boolean12 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14573");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope((-1024348814));
    }

    @Test
    public void test14574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14574");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((-116461350), 55468885);
    }

    @Test
    public void test14575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14575");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode1 = astRoot0.getParent();
        astRoot0.checkParentLinks();
        com.google.javascript.rhino.head.Node node3 = astRoot0.getFirstChild();
        int int4 = astRoot0.getEncodedSourceStart();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap5 = astRoot0.getSymbolTable();
        int int6 = astRoot0.getRegexpCount();
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
        int int23 = astRoot10.getRegexpCount();
        java.lang.String str24 = astRoot10.getJsDoc();
        astRoot10.checkParentLinks();
        astRoot0.setTop((com.google.javascript.rhino.head.ast.ScriptNode) astRoot10);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet27 = astRoot0.getComments();
        org.junit.Assert.assertNull(astNode1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(commentArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "$0" + "'", str19, "$0");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(functionNodeList21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(commentSet27);
    }

    @Test
    public void test14576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14576");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = astRoot0.getAstRoot();
        java.lang.String str2 = astRoot1.shortName();
        java.lang.String str4 = astRoot1.toSource(1);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList5 = astRoot1.getFunctions();
        astRoot1.checkParentLinks();
        boolean boolean7 = astRoot1.hasConsistentReturnUsage();
        int int8 = astRoot1.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope9 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope10 = new com.google.javascript.rhino.head.ast.Scope();
        scope9.addChild((com.google.javascript.rhino.head.ast.AstNode) scope10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope10.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str16 = scriptNode14.toSource(0);
        scriptNode14.setEncodedSourceBounds(12, 10);
        scriptNode12.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode14);
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str22 = astRoot21.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope23 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator24 = scope23.spliterator();
        astRoot21.addChildScope(scope23);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList26 = astRoot21.getChildScopes();
        com.google.javascript.rhino.head.ast.Scope scope27 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope();
        scope27.addChild((com.google.javascript.rhino.head.ast.AstNode) scope28);
        boolean boolean30 = scope27.hasSideEffects();
        com.google.javascript.rhino.head.ast.Scope scope31 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope32 = new com.google.javascript.rhino.head.ast.Scope();
        scope31.addChild((com.google.javascript.rhino.head.ast.AstNode) scope32);
        com.google.javascript.rhino.head.ast.Scope.joinScopes(scope27, scope31);
        astRoot21.replaceWith(scope27);
        int int36 = astRoot21.getEncodedSourceEnd();
        scriptNode14.setParentScope((com.google.javascript.rhino.head.ast.Scope) astRoot21);
        astRoot21.setEncodedSourceBounds(8, 1471166993);
        com.google.javascript.rhino.head.Node node41 = astRoot21.getFirstChild();
        astRoot1.setParentScope((com.google.javascript.rhino.head.ast.Scope) astRoot21);
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newNumber(1.0d);
        com.google.javascript.rhino.head.ast.Scope scope45 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope46 = new com.google.javascript.rhino.head.ast.Scope();
        scope45.addChild((com.google.javascript.rhino.head.ast.AstNode) scope46);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope46.setTop(scriptNode48);
        com.google.javascript.rhino.head.ast.Scope scope50 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope51 = new com.google.javascript.rhino.head.ast.Scope();
        scope50.addChild((com.google.javascript.rhino.head.ast.AstNode) scope51);
        scriptNode48.setCompilerData((java.lang.Object) scope51);
        scriptNode48.setEncodedSourceEnd(0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode56 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str57 = scriptNode56.getNextTempName();
        com.google.javascript.rhino.head.Node node58 = scriptNode56.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList59 = scriptNode56.getFunctions();
        int int60 = scriptNode56.getEncodedSourceEnd();
        scriptNode48.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode56);
        node44.addChildrenToFront((com.google.javascript.rhino.head.Node) scriptNode56);
        astRoot1.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode56);
        org.junit.Assert.assertNotNull(astRoot1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AstRoot" + "'", str2, "AstRoot");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(functionNodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{\n}\n" + "'", str16, "{\n}\n");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "$0" + "'", str22, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator24);
        org.junit.Assert.assertNotNull(scopeList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "$0" + "'", str57, "$0");
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(functionNodeList59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test14577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14577");
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
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean34 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingComments(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test14578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14578");
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
        astRoot7.flattenSymbolTable(true);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet29 = astRoot7.getComments();
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = astRoot31.getAstRoot();
        java.lang.String str33 = astRoot32.shortName();
        java.lang.String str35 = astRoot32.toSource(1);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList36 = astRoot32.getFunctions();
        astRoot32.checkParentLinks();
        boolean boolean38 = astRoot32.hasChildren();
        int int39 = astRoot32.getLineno();
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node((int) ' ', (com.google.javascript.rhino.head.Node) astRoot32, 2);
        com.google.javascript.rhino.head.ast.AstRoot astRoot44 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str45 = astRoot44.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot46 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode47 = astRoot46.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode48.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot44, (com.google.javascript.rhino.head.Node) astRoot46, (com.google.javascript.rhino.head.Node) scriptNode48);
        int int52 = astRoot44.getParamCount();
        com.google.javascript.rhino.head.ast.Scope scope53 = new com.google.javascript.rhino.head.ast.Scope();
        scope53.clearParentScope();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot44, scope53);
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node(6, (com.google.javascript.rhino.head.Node) scope53);
        com.google.javascript.rhino.head.ast.Scope scope57 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope58 = new com.google.javascript.rhino.head.ast.Scope();
        scope57.addChild((com.google.javascript.rhino.head.ast.AstNode) scope58);
        boolean boolean60 = scope57.hasSideEffects();
        int int61 = scope53.compareTo((com.google.javascript.rhino.head.ast.AstNode) scope57);
        boolean boolean62 = scope57.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.AstRoot astRoot64 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str65 = astRoot64.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot66 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode67 = astRoot66.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode68 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode68.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node71 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot64, (com.google.javascript.rhino.head.Node) astRoot66, (com.google.javascript.rhino.head.Node) scriptNode68);
        int int72 = astRoot64.getParamCount();
        com.google.javascript.rhino.head.ast.Scope scope73 = new com.google.javascript.rhino.head.ast.Scope();
        scope73.clearParentScope();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot64, scope73);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap76 = astRoot64.getSymbolTable();
        scope57.setSymbolTable(strMap76);
        astRoot32.setSymbolTable(strMap76);
        astRoot32.checkParentLinks();
        astRoot32.setPosition(97);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList82 = astRoot32.getSymbols();
        astRoot7.setCompilerData((java.lang.Object) astRoot32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$0" + "'", str2, "$0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str3, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$0" + "'", str8, "$0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "136" + "'", str9, "136");
        org.junit.Assert.assertNotNull(symbolList11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(commentArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(commentSet29);
        org.junit.Assert.assertNotNull(astRoot32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AstRoot" + "'", str33, "AstRoot");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(functionNodeList36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "$0" + "'", str45, "$0");
        org.junit.Assert.assertNull(astNode47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int61 + "' != '" + 859962634 + "'", int61 == 859962634);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "$0" + "'", str65, "$0");
        org.junit.Assert.assertNull(astNode67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(strMap76);
        org.junit.Assert.assertNotNull(symbolList82);
    }

    @Test
    public void test14579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14579");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setStrictMode(true);
        boolean boolean3 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.Parser parser10 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        int int11 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setGenerateDebugInfo(false);
        boolean boolean14 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean15 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setGeneratingSource(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14580");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean3 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setOptimizationLevel(4);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setIdeMode(true);
        java.util.Set<java.lang.String> strSet11 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(strSet11);
    }

    @Test
    public void test14581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14581");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = astRoot0.getAstRoot();
        java.lang.String str2 = astRoot1.shortName();
        java.lang.String str3 = astRoot1.getSourceName();
        int int4 = astRoot1.getAbsolutePosition();
        int int5 = astRoot1.getRegexpCount();
        java.lang.String str7 = astRoot1.makeIndent(0);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode8 = astRoot1.getEnclosingFunction();
        org.junit.Assert.assertNotNull(astRoot1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AstRoot" + "'", str2, "AstRoot");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(functionNode8);
    }

    @Test
    public void test14582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14582");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope();
        scope1.addChild((com.google.javascript.rhino.head.ast.AstNode) scope2);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope2.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode4);
        java.lang.String str7 = scriptNode4.toSource(5);
        scriptNode4.putIntProp(0, 1);
        com.google.javascript.rhino.head.Node node11 = scriptNode4.target;
        java.lang.String str13 = scriptNode4.toSource((-557946458));
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((-236001159), (com.google.javascript.rhino.head.Node) scriptNode4, (-12));
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node16 = scriptNode4.getContinue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "          {\n          }\n" + "'", str7, "          {\n          }\n");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{\n}\n" + "'", str13, "{\n}\n");
    }

    @Test
    public void test14583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14583");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator1 = positionComparator0.reversed();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator2 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator3 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator4 = positionComparator2.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator3);
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.Node node6 = node5.getLastSibling();
        com.google.javascript.rhino.head.ast.Scope scope7 = new com.google.javascript.rhino.head.ast.Scope();
        node5.addChildToFront((com.google.javascript.rhino.head.Node) scope7);
        int int9 = scope7.getLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol11 = scope7.getSymbol("java.io.IOException: ");
        com.google.javascript.rhino.head.ast.AstRoot astRoot13 = new com.google.javascript.rhino.head.ast.AstRoot(11);
        int int14 = positionComparator3.compare((com.google.javascript.rhino.head.ast.AstNode) scope7, (com.google.javascript.rhino.head.ast.AstNode) astRoot13);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str17 = astRoot16.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode19 = astRoot18.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode20.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot16, (com.google.javascript.rhino.head.Node) astRoot18, (com.google.javascript.rhino.head.Node) scriptNode20);
        boolean boolean24 = astRoot16.isInStrictMode();
        astRoot16.setRelative((int) '4');
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int28 = astRoot27.getEndLineno();
        java.lang.Object obj29 = astRoot27.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray30 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet31 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet31, commentArray30);
        astRoot27.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet31);
        astRoot27.checkParentLinks();
        int int35 = positionComparator3.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot16, (com.google.javascript.rhino.head.ast.AstNode) astRoot27);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator36 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator3);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str38 = scriptNode37.getNextTempName();
        com.google.javascript.rhino.head.Node node39 = scriptNode37.target;
        int int40 = scriptNode37.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node node41 = scriptNode37.getLastChild();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList42 = scriptNode37.getSymbols();
        com.google.javascript.rhino.head.ast.Scope scope44 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope45 = new com.google.javascript.rhino.head.ast.Scope();
        scope44.addChild((com.google.javascript.rhino.head.ast.AstNode) scope45);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope45.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode47);
        com.google.javascript.rhino.head.ast.Comment comment49 = null;
        scriptNode47.setJsDocNode(comment49);
        int int51 = scriptNode47.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope53 = new com.google.javascript.rhino.head.ast.Scope(20);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList54 = scope53.getChildScopes();
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node((-11), (com.google.javascript.rhino.head.Node) scriptNode47, (com.google.javascript.rhino.head.Node) scope53, (int) (short) 10);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList57 = scriptNode47.getChildScopes();
        int int58 = positionComparator3.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode37, (com.google.javascript.rhino.head.ast.AstNode) scriptNode47);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str61 = scriptNode60.getNextTempName();
        int int62 = scriptNode60.depth();
        com.google.javascript.rhino.head.ast.AstRoot astRoot63 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot64 = astRoot63.getAstRoot();
        java.lang.String str65 = astRoot64.shortName();
        java.lang.String str67 = astRoot64.toSource(1);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList68 = astRoot64.getFunctions();
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode60, (com.google.javascript.rhino.head.Node) astRoot64, 6);
        com.google.javascript.rhino.head.ast.AstNode astNode71 = scriptNode60.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode73 = new com.google.javascript.rhino.head.ast.ScriptNode(7);
        int int74 = positionComparator3.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode60, (com.google.javascript.rhino.head.ast.AstNode) scriptNode73);
        int int75 = scriptNode60.getParamCount();
        java.lang.String str76 = scriptNode60.shortName();
        int int77 = scriptNode60.getEncodedSourceEnd();
        org.junit.Assert.assertNotNull(astNodeComparator1);
        org.junit.Assert.assertNotNull(astNodeComparator4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(symbol11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-12) + "'", int14 == (-12));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$0" + "'", str17, "$0");
        org.junit.Assert.assertNull(astNode19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(commentArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-52) + "'", int35 == (-52));
        org.junit.Assert.assertNotNull(astNodeComparator36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "$0" + "'", str38, "$0");
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(symbolList42);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(scopeList54);
        org.junit.Assert.assertNull(scopeList57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "$0" + "'", str61, "$0");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(astRoot64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "AstRoot" + "'", str65, "AstRoot");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(functionNodeList68);
        org.junit.Assert.assertNull(astNode71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-8) + "'", int74 == (-8));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "ScriptNode" + "'", str76, "ScriptNode");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test14584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14584");
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
        boolean boolean32 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean33 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean36 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean37 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test14585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14585");
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
        int int16 = astRoot3.getRegexpCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str20 = astRoot19.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode22 = astRoot21.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode23.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot19, (com.google.javascript.rhino.head.Node) astRoot21, (com.google.javascript.rhino.head.Node) scriptNode23);
        int int27 = astRoot19.getParamCount();
        java.lang.String str28 = astRoot19.debugPrint();
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node(26, (com.google.javascript.rhino.head.Node) astRoot19);
        astRoot3.addChildrenToFront((com.google.javascript.rhino.head.Node) astRoot19);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator31 = astRoot19.spliterator();
        com.google.javascript.rhino.head.ast.Scope scope33 = astRoot19.getDefiningScope("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(commentArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$0" + "'", str12, "$0");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(functionNodeList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "$0" + "'", str20, "$0");
        org.junit.Assert.assertNull(astNode22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str28, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNotNull(nodeSpliterator31);
        org.junit.Assert.assertNull(scope33);
    }

    @Test
    public void test14586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14586");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = astRoot1.getAstRoot();
        java.lang.String str3 = astRoot2.shortName();
        java.lang.String str5 = astRoot2.toSource(1);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList6 = astRoot2.getFunctions();
        astRoot2.checkParentLinks();
        boolean boolean8 = astRoot2.hasChildren();
        int int9 = astRoot2.getLineno();
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node((int) ' ', (com.google.javascript.rhino.head.Node) astRoot2, 2);
        com.google.javascript.rhino.head.ast.Scope scope13 = astRoot2.getDefiningScope("136");
        java.lang.String str14 = astRoot2.debugPrint();
        astRoot2.setEndLineno(852076584);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator17 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator18 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator19 = positionComparator17.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str22 = astRoot21.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode24 = astRoot23.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode25.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot21, (com.google.javascript.rhino.head.Node) astRoot23, (com.google.javascript.rhino.head.Node) scriptNode25);
        com.google.javascript.rhino.head.ast.Scope scope31 = new com.google.javascript.rhino.head.ast.Scope(2, (int) (byte) -1);
        int int32 = positionComparator17.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot23, (com.google.javascript.rhino.head.ast.AstNode) scope31);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator33 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str35 = astRoot34.getNextTempName();
        java.lang.String str36 = astRoot34.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList38 = scriptNode37.getSymbols();
        java.lang.String str39 = astRoot34.toStringTree(scriptNode37);
        com.google.javascript.rhino.head.ast.Scope scope40 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope41 = new com.google.javascript.rhino.head.ast.Scope();
        scope40.addChild((com.google.javascript.rhino.head.ast.AstNode) scope41);
        int int43 = positionComparator33.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode37, (com.google.javascript.rhino.head.ast.AstNode) scope40);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator44 = positionComparator17.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator33);
        com.google.javascript.rhino.head.ast.AstRoot astRoot46 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot47 = astRoot46.getAstRoot();
        java.lang.String str48 = astRoot47.shortName();
        java.lang.String str50 = astRoot47.toSource(1);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList51 = astRoot47.getFunctions();
        astRoot47.checkParentLinks();
        boolean boolean53 = astRoot47.hasChildren();
        int int54 = astRoot47.getLineno();
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node((int) ' ', (com.google.javascript.rhino.head.Node) astRoot47, 2);
        com.google.javascript.rhino.head.ast.AstRoot astRoot57 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int58 = positionComparator33.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot47, (com.google.javascript.rhino.head.ast.AstNode) astRoot57);
        com.google.javascript.rhino.head.ast.AstRoot astRoot59 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int60 = astRoot59.getEndLineno();
        java.lang.Object obj61 = astRoot59.getCompilerData();
        com.google.javascript.rhino.head.ast.Symbol symbol63 = astRoot59.getSymbol("java.io.IOException: ");
        astRoot59.setEncodedSourceStart(0);
        java.lang.String str67 = astRoot59.toSource(14);
        com.google.javascript.rhino.head.ast.AstRoot astRoot69 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str70 = astRoot69.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot71 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode72 = astRoot71.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode73 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode73.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node76 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot69, (com.google.javascript.rhino.head.Node) astRoot71, (com.google.javascript.rhino.head.Node) scriptNode73);
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray77 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList78 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList78, symbolArray77);
        scriptNode73.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList78);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode81 = scriptNode73.getTop();
        int int82 = scriptNode81.getEncodedSourceEnd();
        astRoot59.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode81);
        astRoot47.addChildrenToFront((com.google.javascript.rhino.head.Node) astRoot59);
        int int85 = astRoot59.getEncodedSourceStart();
        astRoot2.setTop((com.google.javascript.rhino.head.ast.ScriptNode) astRoot59);
        org.junit.Assert.assertNotNull(astRoot2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AstRoot" + "'", str3, "AstRoot");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(functionNodeList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str14, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNotNull(astNodeComparator19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "$0" + "'", str22, "$0");
        org.junit.Assert.assertNull(astNode24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-3) + "'", int32 == (-3));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "$0" + "'", str35, "$0");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "136" + "'", str36, "136");
        org.junit.Assert.assertNotNull(symbolList38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(astNodeComparator44);
        org.junit.Assert.assertNotNull(astRoot47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "AstRoot" + "'", str48, "AstRoot");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(functionNodeList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(symbol63);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "$0" + "'", str70, "$0");
        org.junit.Assert.assertNull(astNode72);
        org.junit.Assert.assertNotNull(symbolArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(scriptNode81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test14587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14587");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str1 = astRoot0.getNextTempName();
        java.lang.String str2 = astRoot0.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList4 = scriptNode3.getSymbols();
        java.lang.String str5 = astRoot0.toStringTree(scriptNode3);
        astRoot0.checkParentLinks();
        int int9 = astRoot0.getIntProp(11, 32);
        int int10 = astRoot0.getPosition();
        java.lang.String str11 = astRoot0.debugPrint();
        com.google.javascript.rhino.head.Node node12 = astRoot0.getLastChild();
        astRoot0.setBounds((-882907488), (-55137080));
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList16 = astRoot0.getFunctions();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$0" + "'", str1, "$0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "136" + "'", str2, "136");
        org.junit.Assert.assertNotNull(symbolList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str11, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(functionNodeList16);
    }

    @Test
    public void test14588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14588");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean3 = compilerEnvirons0.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setGeneratingSource(false);
        int int7 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setRecordingComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons13.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = compilerEnvirons13.getErrorReporter();
        compilerEnvirons13.setWarnTrailingComma(false);
        int int19 = compilerEnvirons13.getOptimizationLevel();
        java.util.Set<java.lang.String> strSet20 = compilerEnvirons13.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons21.setWarnTrailingComma(true);
        boolean boolean24 = compilerEnvirons21.getWarnTrailingComma();
        java.util.Set<java.lang.String> strSet25 = compilerEnvirons21.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons26.setWarnTrailingComma(true);
        boolean boolean29 = compilerEnvirons26.isRecordingLocalJsDocComments();
        compilerEnvirons26.setWarnTrailingComma(false);
        compilerEnvirons26.setAllowSharpComments(false);
        boolean boolean34 = compilerEnvirons26.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons35.setWarnTrailingComma(true);
        java.lang.String[] strArray47 = new java.lang.String[] { "-1\tSCRIPT -1 1\n", "java.io.IOException: ", "136", "136", "java.io.IOException: ", "136", "java.io.IOException: ", "$0", "  {\n  }\n" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        compilerEnvirons35.setActivationNames((java.util.Set<java.lang.String>) strSet48);
        compilerEnvirons26.setActivationNames((java.util.Set<java.lang.String>) strSet48);
        compilerEnvirons21.setActivationNames((java.util.Set<java.lang.String>) strSet48);
        compilerEnvirons13.setActivationNames((java.util.Set<java.lang.String>) strSet48);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet48);
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setAllowSharpComments(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorReporter16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test14589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14589");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str3 = astRoot2.getNextTempName();
        java.lang.String str4 = astRoot2.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList6 = scriptNode5.getSymbols();
        java.lang.String str7 = astRoot2.toStringTree(scriptNode5);
        com.google.javascript.rhino.head.ast.Scope scope8 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope9 = new com.google.javascript.rhino.head.ast.Scope();
        scope8.addChild((com.google.javascript.rhino.head.ast.AstNode) scope9);
        int int11 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode5, (com.google.javascript.rhino.head.ast.AstNode) scope8);
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str13 = astRoot12.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator15 = scope14.spliterator();
        astRoot12.addChildScope(scope14);
        java.lang.String str18 = astRoot12.toSource(9);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList19 = astRoot12.getFunctions();
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str22 = astRoot21.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode24 = astRoot23.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode25.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot21, (com.google.javascript.rhino.head.Node) astRoot23, (com.google.javascript.rhino.head.Node) scriptNode25);
        int int29 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot12, (com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot21, 24);
        astRoot21.removeChildren();
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = astRoot21.getAstRoot();
        int int36 = astRoot21.getIntProp(761599885, 136);
        com.google.javascript.rhino.head.ast.Comment comment37 = astRoot21.getJsDocNode();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor38 = null;
        // The following exception was thrown during execution in test generation
        try {
            astRoot21.visit(nodeVisitor38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$0" + "'", str3, "$0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "136" + "'", str4, "136");
        org.junit.Assert.assertNotNull(symbolList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$0" + "'", str13, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(functionNodeList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "$0" + "'", str22, "$0");
        org.junit.Assert.assertNull(astNode24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(astRoot33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 136 + "'", int36 == 136);
        org.junit.Assert.assertNull(comment37);
    }

    @Test
    public void test14590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14590");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str1 = scriptNode0.getNextTempName();
        com.google.javascript.rhino.head.Node node2 = scriptNode0.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList3 = scriptNode0.getFunctions();
        int int4 = scriptNode0.getEncodedSourceEnd();
        scriptNode0.setBounds((int) (byte) 0, 3);
        boolean boolean8 = scriptNode0.hasSideEffects();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons9.setRecordingLocalJsDocComments(false);
        java.util.Set<java.lang.String> strSet12 = compilerEnvirons9.getActivationNames();
        boolean boolean13 = compilerEnvirons9.recoverFromErrors();
        boolean boolean14 = compilerEnvirons9.getWarnTrailingComma();
        boolean boolean15 = compilerEnvirons9.isIdeMode();
        boolean boolean16 = compilerEnvirons9.isRecordingLocalJsDocComments();
        compilerEnvirons9.setGeneratingSource(true);
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = astRoot20.getAstRoot();
        java.lang.String str22 = astRoot21.shortName();
        java.lang.String str23 = astRoot21.getSourceName();
        astRoot21.checkParentLinks();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap25 = astRoot21.getSymbolTable();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = iRFactory19.transformTree(astRoot21);
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        boolean boolean28 = astRoot21.isInStrictMode();
        astRoot21.setEncodedSourceStart(0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList32 = scriptNode31.getSymbols();
        com.google.javascript.rhino.head.Node node33 = scriptNode31.getFirstChild();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList34 = scriptNode31.getSymbols();
        astRoot21.setSymbols(symbolList34);
        java.lang.String str36 = astRoot21.debugPrint();
        int int37 = astRoot21.getParamCount();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$0" + "'", str1, "$0");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(functionNodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(astRoot21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AstRoot" + "'", str22, "AstRoot");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(strMap25);
        org.junit.Assert.assertNotNull(scriptNode26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(symbolList32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(symbolList34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str36, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test14591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14591");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compilerEnvirons0.getErrorReporter();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.recoverFromErrors();
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setWarnTrailingComma(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons9.setWarnTrailingComma(true);
        boolean boolean12 = compilerEnvirons9.isRecordingLocalJsDocComments();
        compilerEnvirons9.setWarnTrailingComma(false);
        compilerEnvirons9.setAllowSharpComments(false);
        boolean boolean17 = compilerEnvirons9.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons18.setWarnTrailingComma(true);
        java.lang.String[] strArray30 = new java.lang.String[] { "-1\tSCRIPT -1 1\n", "java.io.IOException: ", "136", "136", "java.io.IOException: ", "136", "java.io.IOException: ", "$0", "  {\n  }\n" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        compilerEnvirons18.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        compilerEnvirons9.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons35.setWarnTrailingComma(true);
        boolean boolean38 = compilerEnvirons35.isRecordingLocalJsDocComments();
        compilerEnvirons35.setWarnTrailingComma(false);
        compilerEnvirons35.setAllowSharpComments(false);
        boolean boolean43 = compilerEnvirons35.isGenerateDebugInfo();
        compilerEnvirons35.setIdeMode(false);
        compilerEnvirons35.setWarnTrailingComma(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons48 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons48.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter51 = compilerEnvirons48.getErrorReporter();
        boolean boolean52 = compilerEnvirons48.isGenerateObserverCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter53 = compilerEnvirons48.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser54 = new com.google.javascript.rhino.head.Parser(compilerEnvirons35, errorReporter53);
        com.google.javascript.rhino.head.IRFactory iRFactory55 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons9, errorReporter53);
        compilerEnvirons0.setErrorReporter(errorReporter53);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons57 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean58 = compilerEnvirons57.recoverFromErrors();
        int int59 = compilerEnvirons57.getLanguageVersion();
        boolean boolean60 = compilerEnvirons57.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons61 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons61.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter64 = compilerEnvirons61.getErrorReporter();
        boolean boolean65 = compilerEnvirons61.isGenerateObserverCount();
        compilerEnvirons61.setRecordingComments(true);
        boolean boolean68 = compilerEnvirons61.isGenerateObserverCount();
        boolean boolean69 = compilerEnvirons61.isGenerateDebugInfo();
        compilerEnvirons61.setReservedKeywordAsIdentifier(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons72 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons72.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter75 = compilerEnvirons72.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory76 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons61, errorReporter75);
        boolean boolean77 = compilerEnvirons61.isStrictMode();
        com.google.javascript.rhino.head.ErrorReporter errorReporter78 = compilerEnvirons61.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory79 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons57, errorReporter78);
        com.google.javascript.rhino.head.Parser parser80 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter78);
        boolean boolean81 = compilerEnvirons0.isGeneratingSource();
        boolean boolean82 = compilerEnvirons0.isGenerateObserverCount();
        com.google.javascript.rhino.head.Parser parser83 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        org.junit.Assert.assertNotNull(errorReporter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(errorReporter51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(errorReporter53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(errorReporter64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(errorReporter75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(errorReporter78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test14592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14592");
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
        boolean boolean16 = compilerEnvirons0.isStrictMode();
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = compilerEnvirons0.getErrorReporter();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons18.setWarnTrailingComma(true);
        boolean boolean21 = compilerEnvirons18.getWarnTrailingComma();
        java.util.Set<java.lang.String> strSet22 = compilerEnvirons18.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons23.setWarnTrailingComma(true);
        boolean boolean26 = compilerEnvirons23.isRecordingLocalJsDocComments();
        compilerEnvirons23.setWarnTrailingComma(false);
        compilerEnvirons23.setAllowSharpComments(false);
        boolean boolean31 = compilerEnvirons23.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons32.setWarnTrailingComma(true);
        java.lang.String[] strArray44 = new java.lang.String[] { "-1\tSCRIPT -1 1\n", "java.io.IOException: ", "136", "136", "java.io.IOException: ", "136", "java.io.IOException: ", "$0", "  {\n  }\n" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        compilerEnvirons32.setActivationNames((java.util.Set<java.lang.String>) strSet45);
        compilerEnvirons23.setActivationNames((java.util.Set<java.lang.String>) strSet45);
        compilerEnvirons18.setActivationNames((java.util.Set<java.lang.String>) strSet45);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet45);
        boolean boolean51 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean52 = compilerEnvirons0.isRecordingComments();
        java.util.Set<java.lang.String> strSet53 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertNotNull(errorReporter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(errorReporter14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(errorReporter17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strSet53);
    }

    @Test
    public void test14593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14593");
        com.google.javascript.rhino.head.ast.Scope scope0 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope();
        scope0.addChild((com.google.javascript.rhino.head.ast.AstNode) scope1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode3);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str7 = scriptNode5.toSource(0);
        scriptNode5.setEncodedSourceBounds(12, 10);
        scriptNode3.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode5);
        java.lang.String str12 = scriptNode3.getSourceName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot13 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot14 = astRoot13.getAstRoot();
        java.lang.String str15 = astRoot14.shortName();
        java.lang.String str17 = astRoot14.toSource(1);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList18 = astRoot14.getFunctions();
        astRoot14.checkParentLinks();
        boolean boolean20 = astRoot14.hasConsistentReturnUsage();
        int int21 = astRoot14.getRegexpCount();
        scriptNode3.setTop((com.google.javascript.rhino.head.ast.ScriptNode) astRoot14);
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str25 = astRoot24.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode27 = astRoot26.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode28.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot24, (com.google.javascript.rhino.head.Node) astRoot26, (com.google.javascript.rhino.head.Node) scriptNode28);
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray32 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList33 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList33, symbolArray32);
        scriptNode28.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList33);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = scriptNode28.getTop();
        scriptNode28.setSourceName("{\n}\n");
        int int39 = scriptNode28.getBaseLineno();
        java.lang.String str40 = scriptNode3.toStringTree(scriptNode28);
        java.lang.String str41 = scriptNode3.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode44.setCompilerData((java.lang.Object) (byte) 100);
        java.lang.String str47 = scriptNode44.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope50 = new com.google.javascript.rhino.head.ast.Scope(2, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode44, (com.google.javascript.rhino.head.Node) scope50, 25);
        com.google.javascript.rhino.head.ast.AstRoot astRoot53 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot54 = astRoot53.getAstRoot();
        java.lang.String str55 = astRoot54.shortName();
        java.lang.String str56 = astRoot54.getSourceName();
        astRoot54.checkParentLinks();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap58 = astRoot54.getSymbolTable();
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) scope50, (com.google.javascript.rhino.head.Node) astRoot54);
        java.lang.Object obj60 = astRoot54.getCompilerData();
        com.google.javascript.rhino.head.ast.AstRoot astRoot63 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str64 = astRoot63.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot65 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode66 = astRoot65.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode67.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot63, (com.google.javascript.rhino.head.Node) astRoot65, (com.google.javascript.rhino.head.Node) scriptNode67);
        astRoot65.setInStrictMode(true);
        int int73 = astRoot65.getBaseLineno();
        com.google.javascript.rhino.head.ast.AstRoot astRoot74 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str75 = astRoot74.getNextTempName();
        java.lang.String str76 = astRoot74.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode77 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList78 = scriptNode77.getSymbols();
        java.lang.String str79 = astRoot74.toStringTree(scriptNode77);
        astRoot74.checkParentLinks();
        int int83 = astRoot74.getIntProp(11, 32);
        int int84 = astRoot74.getPosition();
        com.google.javascript.rhino.head.Node node86 = new com.google.javascript.rhino.head.Node((-738182430), (com.google.javascript.rhino.head.Node) astRoot65, (com.google.javascript.rhino.head.Node) astRoot74, 2);
        com.google.javascript.rhino.head.ast.Scope scope88 = new com.google.javascript.rhino.head.ast.Scope(23);
        scope88.removeProp(22);
        astRoot54.addChildAfter((com.google.javascript.rhino.head.Node) astRoot74, (com.google.javascript.rhino.head.Node) scope88);
        scriptNode3.setCompilerData((java.lang.Object) astRoot74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\n}\n" + "'", str7, "{\n}\n");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(astRoot14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AstRoot" + "'", str15, "AstRoot");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(functionNodeList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "$0" + "'", str25, "$0");
        org.junit.Assert.assertNull(astNode27);
        org.junit.Assert.assertNotNull(symbolArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(scriptNode36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "136" + "'", str41, "136");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "$0" + "'", str47, "$0");
        org.junit.Assert.assertNotNull(astRoot54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "AstRoot" + "'", str55, "AstRoot");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(strMap58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "$0" + "'", str64, "$0");
        org.junit.Assert.assertNull(astNode66);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "$0" + "'", str75, "$0");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "136" + "'", str76, "136");
        org.junit.Assert.assertNotNull(symbolList78);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 32 + "'", int83 == 32);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
    }

    @Test
    public void test14594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14594");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = astRoot0.getAstRoot();
        java.lang.String str2 = astRoot1.shortName();
        java.lang.String str3 = astRoot1.debugPrint();
        astRoot1.clearParentScope();
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
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator21 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str23 = astRoot22.getNextTempName();
        java.lang.String str24 = astRoot22.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList26 = scriptNode25.getSymbols();
        java.lang.String str27 = astRoot22.toStringTree(scriptNode25);
        com.google.javascript.rhino.head.ast.Scope scope28 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope29 = new com.google.javascript.rhino.head.ast.Scope();
        scope28.addChild((com.google.javascript.rhino.head.ast.AstNode) scope29);
        int int31 = positionComparator21.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode25, (com.google.javascript.rhino.head.ast.AstNode) scope28);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator32 = positionComparator5.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator21);
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int35 = astRoot34.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray36 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList37 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList37, symbolArray36);
        astRoot34.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList37);
        com.google.javascript.rhino.head.ast.Scope scope40 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope41 = new com.google.javascript.rhino.head.ast.Scope();
        scope40.addChild((com.google.javascript.rhino.head.ast.AstNode) scope41);
        astRoot34.addChildScope(scope41);
        com.google.javascript.rhino.head.ast.AstRoot astRoot45 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int46 = astRoot45.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot47 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int48 = astRoot47.getEndLineno();
        java.lang.Object obj49 = astRoot47.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray50 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet51 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet51, commentArray50);
        astRoot47.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet51);
        astRoot47.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode55 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str56 = scriptNode55.getNextTempName();
        com.google.javascript.rhino.head.Node node57 = scriptNode55.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList58 = scriptNode55.getFunctions();
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot45, (com.google.javascript.rhino.head.Node) astRoot47, (com.google.javascript.rhino.head.Node) scriptNode55);
        int int60 = astRoot45.getEncodedSourceStart();
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) astRoot34, (com.google.javascript.rhino.head.Node) astRoot45);
        astRoot45.setEncodedSourceBounds((int) (short) 1, (int) (byte) 100);
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node((int) (short) 10, 14);
        com.google.javascript.rhino.head.ast.Scope scope71 = new com.google.javascript.rhino.head.ast.Scope(2, (int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode72 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str74 = scriptNode72.toSource(0);
        scriptNode72.setEncodedSourceBounds(12, 10);
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node((int) '#', node68, (com.google.javascript.rhino.head.Node) scope71, (com.google.javascript.rhino.head.Node) scriptNode72, 2);
        int int80 = positionComparator5.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot45, (com.google.javascript.rhino.head.ast.AstNode) scope71);
        java.lang.String str81 = astRoot45.debugPrint();
        astRoot1.target = astRoot45;
        com.google.javascript.rhino.head.ast.Scope scope83 = astRoot45.getParentScope();
        java.lang.String str84 = astRoot45.toString();
        org.junit.Assert.assertNotNull(astRoot1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AstRoot" + "'", str2, "AstRoot");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str3, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNotNull(astNodeComparator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$0" + "'", str10, "$0");
        org.junit.Assert.assertNull(astNode12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-3) + "'", int20 == (-3));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "$0" + "'", str23, "$0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "136" + "'", str24, "136");
        org.junit.Assert.assertNotNull(symbolList26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(astNodeComparator32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(symbolArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(commentArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "$0" + "'", str56, "$0");
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(functionNodeList58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "{\n}\n" + "'", str74, "{\n}\n");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-3) + "'", int80 == (-3));
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str81, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNull(scope83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "136" + "'", str84, "136");
    }

    @Test
    public void test14595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14595");
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot14 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int15 = astRoot14.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int17 = astRoot16.getEndLineno();
        java.lang.Object obj18 = astRoot16.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray19 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet20 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet20, commentArray19);
        astRoot16.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet20);
        astRoot16.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str25 = scriptNode24.getNextTempName();
        com.google.javascript.rhino.head.Node node26 = scriptNode24.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList27 = scriptNode24.getFunctions();
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot14, (com.google.javascript.rhino.head.Node) astRoot16, (com.google.javascript.rhino.head.Node) scriptNode24);
        int int29 = astRoot14.getEncodedSourceStart();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) astRoot3, (com.google.javascript.rhino.head.Node) astRoot14);
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((int) (byte) 100, (com.google.javascript.rhino.head.Node) astRoot14);
        com.google.javascript.rhino.head.Node node32 = astRoot14.getLastSibling();
        boolean boolean33 = astRoot14.isInStrictMode();
        astRoot14.setEncodedSourceBounds(1796887248, (int) (byte) 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = astRoot14.getTop();
        astRoot14.setRelative(608130738);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node((-1438167940), (com.google.javascript.rhino.head.Node) astRoot14, 320034005);
        astRoot14.setBounds(550287075, (-534516630));
        // The following exception was thrown during execution in test generation
        try {
            astRoot14.resetTargets();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(symbolArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(commentArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "$0" + "'", str25, "$0");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(functionNodeList27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(scriptNode37);
    }

    @Test
    public void test14596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14596");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot(8);
        java.lang.String str2 = astRoot1.debugPrint();
        astRoot1.setInStrictMode(false);
        int int5 = astRoot1.getType();
        int int6 = astRoot1.depth();
        com.google.javascript.rhino.head.ast.AstRoot astRoot8 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int9 = astRoot8.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray10 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList11 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList11, symbolArray10);
        astRoot8.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList11);
        astRoot8.clearParentScope();
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int16 = astRoot15.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int18 = astRoot17.getEndLineno();
        java.lang.Object obj19 = astRoot17.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray20 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet21 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet21, commentArray20);
        astRoot17.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet21);
        astRoot15.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet21);
        astRoot8.target = astRoot15;
        int int26 = astRoot15.getType();
        java.lang.String str27 = astRoot15.debugPrint();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList28 = astRoot15.getFunctions();
        int int29 = astRoot15.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int31 = astRoot30.getParamCount();
        astRoot30.setEndLineno((int) (byte) 100);
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = astRoot30.getAstRoot();
        java.lang.String str35 = astRoot34.shortName();
        astRoot34.clearParentScope();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor37 = null;
        astRoot34.visitComments(nodeVisitor37);
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str41 = astRoot40.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode43 = astRoot42.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode44.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot40, (com.google.javascript.rhino.head.Node) astRoot42, (com.google.javascript.rhino.head.Node) scriptNode44);
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor48 = null;
        astRoot40.visitComments(nodeVisitor48);
        com.google.javascript.rhino.head.ast.AstRoot astRoot50 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str51 = astRoot50.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope52 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator53 = scope52.spliterator();
        astRoot50.addChildScope(scope52);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList55 = astRoot50.getChildScopes();
        java.lang.String str56 = astRoot50.toString();
        astRoot40.addChildToBack((com.google.javascript.rhino.head.Node) astRoot50);
        astRoot50.setEncodedSourceBounds(6, (-1438167940));
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node((-78159348), (com.google.javascript.rhino.head.Node) astRoot15, (com.google.javascript.rhino.head.Node) astRoot34, (com.google.javascript.rhino.head.Node) astRoot50);
        astRoot1.addChildrenToBack((com.google.javascript.rhino.head.Node) astRoot15);
        astRoot1.setLineno((-236001159));
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node65 = astRoot1.getFinally();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8\tSCRIPT 8 1\n" + "'", str2, "8\tSCRIPT 8 1\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 136 + "'", int5 == 136);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(symbolArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(commentArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 136 + "'", int26 == 136);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str27, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNotNull(functionNodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(astRoot34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "AstRoot" + "'", str35, "AstRoot");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "$0" + "'", str41, "$0");
        org.junit.Assert.assertNull(astNode43);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "$0" + "'", str51, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator53);
        org.junit.Assert.assertNotNull(scopeList55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "136" + "'", str56, "136");
    }

    @Test
    public void test14597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14597");
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str18 = astRoot17.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode20 = astRoot19.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode21.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot17, (com.google.javascript.rhino.head.Node) astRoot19, (com.google.javascript.rhino.head.Node) scriptNode21);
        int int25 = astRoot17.getParamCount();
        com.google.javascript.rhino.head.ast.Scope scope26 = new com.google.javascript.rhino.head.ast.Scope();
        scope26.clearParentScope();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot17, scope26);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = iRFactory15.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.Scope scope30 = scriptNode29.getEnclosingScope();
        int int31 = scriptNode29.getEndLineno();
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int33 = astRoot32.getEndLineno();
        java.lang.Object obj34 = astRoot32.getCompilerData();
        com.google.javascript.rhino.head.ast.Symbol symbol36 = astRoot32.getSymbol("java.io.IOException: ");
        com.google.javascript.rhino.head.Node node37 = null;
        astRoot32.target = node37;
        java.lang.Object obj39 = astRoot32.getCompilerData();
        scriptNode29.addChildrenToFront((com.google.javascript.rhino.head.Node) astRoot32);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node41 = astRoot32.getFinally();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorReporter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(errorReporter14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "$0" + "'", str18, "$0");
        org.junit.Assert.assertNull(astNode20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(scriptNode29);
        org.junit.Assert.assertNull(scope30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(symbol36);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test14598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14598");
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str3 = astRoot2.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode5 = astRoot4.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot2, (com.google.javascript.rhino.head.Node) astRoot4, (com.google.javascript.rhino.head.Node) scriptNode6);
        int int10 = astRoot2.getParamCount();
        com.google.javascript.rhino.head.ast.Scope scope11 = new com.google.javascript.rhino.head.ast.Scope();
        scope11.clearParentScope();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot2, scope11);
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(6, (com.google.javascript.rhino.head.Node) scope11);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str17 = astRoot16.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator19 = scope18.spliterator();
        astRoot16.addChildScope(scope18);
        java.lang.String str22 = astRoot16.toSource(9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str24 = astRoot23.getNextTempName();
        java.lang.String str25 = astRoot23.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList27 = scriptNode26.getSymbols();
        java.lang.String str28 = astRoot23.toStringTree(scriptNode26);
        com.google.javascript.rhino.head.ast.Scope scope29 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope30 = new com.google.javascript.rhino.head.ast.Scope();
        scope29.addChild((com.google.javascript.rhino.head.ast.AstNode) scope30);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope30.setTop(scriptNode32);
        java.lang.String str35 = scope30.toSource(12);
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot16, (com.google.javascript.rhino.head.Node) scriptNode26, (com.google.javascript.rhino.head.Node) scope30);
        astRoot16.setBaseLineno(19);
        astRoot16.checkParentLinks();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(14, 26);
        scope11.replaceChildAfter((com.google.javascript.rhino.head.Node) astRoot16, node42);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str45 = scriptNode44.getNextTempName();
        com.google.javascript.rhino.head.Node node46 = scriptNode44.target;
        int int47 = scriptNode44.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node node48 = scriptNode44.getLastChild();
        int int49 = scriptNode44.getEndLineno();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap50 = scriptNode44.getSymbolTable();
        astRoot16.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode44);
        astRoot16.removeChildren();
        boolean boolean53 = astRoot16.hasSideEffects();
        com.google.javascript.rhino.head.ast.AstRoot astRoot56 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int57 = astRoot56.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray58 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList59 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList59, symbolArray58);
        astRoot56.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList59);
        boolean boolean62 = astRoot56.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons63 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons63.setWarnTrailingComma(true);
        boolean boolean66 = compilerEnvirons63.isRecordingLocalJsDocComments();
        compilerEnvirons63.setWarnTrailingComma(false);
        compilerEnvirons63.setAllowSharpComments(false);
        boolean boolean71 = compilerEnvirons63.isGenerateDebugInfo();
        astRoot56.setCompilerData((java.lang.Object) boolean71);
        com.google.javascript.rhino.head.Node node73 = new com.google.javascript.rhino.head.Node((int) ' ', (com.google.javascript.rhino.head.Node) astRoot56);
        astRoot56.setPosition(0);
        com.google.javascript.rhino.head.ast.AstRoot astRoot76 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot77 = astRoot76.getAstRoot();
        java.lang.String str78 = astRoot77.shortName();
        java.lang.String str80 = astRoot77.toSource(1);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList81 = astRoot77.getFunctions();
        com.google.javascript.rhino.head.ast.AstRoot astRoot82 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int83 = astRoot82.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray84 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList85 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList85, symbolArray84);
        astRoot82.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList85);
        boolean boolean88 = astRoot82.hasChildren();
        com.google.javascript.rhino.head.Node node89 = new com.google.javascript.rhino.head.Node((int) (short) 100, (com.google.javascript.rhino.head.Node) astRoot56, (com.google.javascript.rhino.head.Node) astRoot77, (com.google.javascript.rhino.head.Node) astRoot82);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList90 = astRoot56.getStatements();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap91 = astRoot56.getSymbolTable();
        astRoot16.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot56);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$0" + "'", str3, "$0");
        org.junit.Assert.assertNull(astNode5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$0" + "'", str17, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "$0" + "'", str24, "$0");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "136" + "'", str25, "136");
        org.junit.Assert.assertNotNull(symbolList27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "                        {\n                        }\n" + "'", str35, "                        {\n                        }\n");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "$0" + "'", str45, "$0");
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(strMap50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(symbolArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(astRoot77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "AstRoot" + "'", str78, "AstRoot");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(functionNodeList81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(symbolArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(astNodeList90);
        org.junit.Assert.assertNull(strMap91);
    }

    @Test
    public void test14599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14599");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str1 = astRoot0.getNextTempName();
        java.lang.String str2 = astRoot0.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = astRoot0.getTop();
        int int4 = astRoot0.getParamCount();
        boolean boolean5 = astRoot0.hasConsistentReturnUsage();
        astRoot0.setEncodedSourceStart(520361644);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int11 = astRoot10.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray12 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList13 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList13, symbolArray12);
        astRoot10.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList13);
        com.google.javascript.rhino.head.ast.Scope scope16 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope17 = new com.google.javascript.rhino.head.ast.Scope();
        scope16.addChild((com.google.javascript.rhino.head.ast.AstNode) scope17);
        astRoot10.addChildScope(scope17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int22 = astRoot21.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int24 = astRoot23.getEndLineno();
        java.lang.Object obj25 = astRoot23.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray26 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet27 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet27, commentArray26);
        astRoot23.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet27);
        astRoot23.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str32 = scriptNode31.getNextTempName();
        com.google.javascript.rhino.head.Node node33 = scriptNode31.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList34 = scriptNode31.getFunctions();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot21, (com.google.javascript.rhino.head.Node) astRoot23, (com.google.javascript.rhino.head.Node) scriptNode31);
        int int36 = astRoot21.getEncodedSourceStart();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) astRoot10, (com.google.javascript.rhino.head.Node) astRoot21);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList38 = astRoot21.getChildScopes();
        com.google.javascript.rhino.head.ast.AstRoot astRoot39 = astRoot21.getAstRoot();
        java.lang.String str40 = astRoot21.debugPrint();
        int int41 = astRoot21.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int43 = astRoot42.getEndLineno();
        java.lang.Object obj44 = astRoot42.getCompilerData();
        int int45 = astRoot42.getLineno();
        boolean boolean46 = astRoot42.hasSideEffects();
        java.lang.String str47 = astRoot42.getSourceName();
        java.lang.String str48 = astRoot42.getJsDoc();
        astRoot42.setEncodedSourceStart((-131519396));
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator51 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator52 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator53 = positionComparator51.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator52);
        com.google.javascript.rhino.head.ast.AstRoot astRoot55 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str56 = astRoot55.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot57 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode58 = astRoot57.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode59.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot55, (com.google.javascript.rhino.head.Node) astRoot57, (com.google.javascript.rhino.head.Node) scriptNode59);
        com.google.javascript.rhino.head.ast.Scope scope65 = new com.google.javascript.rhino.head.ast.Scope(2, (int) (byte) -1);
        int int66 = positionComparator51.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot57, (com.google.javascript.rhino.head.ast.AstNode) scope65);
        com.google.javascript.rhino.head.ast.AstRoot astRoot67 = astRoot57.getAstRoot();
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node((-12), (com.google.javascript.rhino.head.Node) astRoot21, (com.google.javascript.rhino.head.Node) astRoot42, (com.google.javascript.rhino.head.Node) astRoot67);
        com.google.javascript.rhino.head.ast.Comment[] commentArray69 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet70 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet70, commentArray69);
        astRoot21.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet70);
        astRoot0.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet70);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$0" + "'", str1, "$0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "136" + "'", str2, "136");
        org.junit.Assert.assertNotNull(scriptNode3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(symbolArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(commentArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "$0" + "'", str32, "$0");
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(functionNodeList34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(scopeList38);
        org.junit.Assert.assertNotNull(astRoot39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str40, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(astNodeComparator53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "$0" + "'", str56, "$0");
        org.junit.Assert.assertNull(astNode58);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-3) + "'", int66 == (-3));
        org.junit.Assert.assertNotNull(astRoot67);
        org.junit.Assert.assertNotNull(commentArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test14600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14600");
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
        int int31 = astRoot13.getParamCount();
        astRoot13.removeProp(21);
        int int34 = astRoot13.getAbsolutePosition();
        astRoot13.setEncodedSource("                  ");
        astRoot13.setLength(681237292);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList39 = astRoot13.getStatements();
        astRoot13.setInStrictMode(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(symbolArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(commentArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "$0" + "'", str24, "$0");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionNodeList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(astNodeList39);
    }

    @Test
    public void test14601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14601");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot(11);
        com.google.javascript.rhino.head.ast.Scope scope3 = astRoot1.getDefiningScope("AstRoot");
        astRoot1.setEncodedSourceStart((int) (byte) -1);
        int int6 = astRoot1.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor7 = null;
        astRoot1.visitComments(nodeVisitor7);
        java.lang.String str9 = astRoot1.debugPrint();
        com.google.javascript.rhino.head.ast.Scope scope12 = new com.google.javascript.rhino.head.ast.Scope((-1));
        com.google.javascript.rhino.head.ast.AstRoot astRoot14 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int15 = astRoot14.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray16 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList17 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList17, symbolArray16);
        astRoot14.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList17);
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope21 = new com.google.javascript.rhino.head.ast.Scope();
        scope20.addChild((com.google.javascript.rhino.head.ast.AstNode) scope21);
        astRoot14.addChildScope(scope21);
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int26 = astRoot25.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int28 = astRoot27.getEndLineno();
        java.lang.Object obj29 = astRoot27.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray30 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet31 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet31, commentArray30);
        astRoot27.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet31);
        astRoot27.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str36 = scriptNode35.getNextTempName();
        com.google.javascript.rhino.head.Node node37 = scriptNode35.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList38 = scriptNode35.getFunctions();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot25, (com.google.javascript.rhino.head.Node) astRoot27, (com.google.javascript.rhino.head.Node) scriptNode35);
        int int40 = astRoot25.getEncodedSourceStart();
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node((int) (short) 0, (com.google.javascript.rhino.head.Node) astRoot14, (com.google.javascript.rhino.head.Node) astRoot25);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList42 = astRoot25.getChildScopes();
        com.google.javascript.rhino.head.ast.AstRoot astRoot43 = astRoot25.getAstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot44 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str45 = astRoot44.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope46 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator47 = scope46.spliterator();
        astRoot44.addChildScope(scope46);
        java.lang.String str50 = astRoot44.toSource(9);
        com.google.javascript.rhino.head.ast.Comment comment51 = null;
        astRoot44.setJsDocNode(comment51);
        int int53 = astRoot44.getType();
        java.lang.String str54 = astRoot44.getEncodedSource();
        astRoot44.setInStrictMode(false);
        com.google.javascript.rhino.head.Node node58 = new com.google.javascript.rhino.head.Node(703513808, (com.google.javascript.rhino.head.Node) scope12, (com.google.javascript.rhino.head.Node) astRoot25, (com.google.javascript.rhino.head.Node) astRoot44, (int) (byte) 1);
        astRoot1.addChildToFront((com.google.javascript.rhino.head.Node) scope12);
        int int60 = astRoot1.getLength();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11\tSCRIPT 11 1\n" + "'", str9, "11\tSCRIPT 11 1\n");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(symbolArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(commentArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "$0" + "'", str36, "$0");
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(functionNodeList38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(scopeList42);
        org.junit.Assert.assertNotNull(astRoot43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "$0" + "'", str45, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 136 + "'", int53 == 136);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
    }

    @Test
    public void test14602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14602");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean3 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setWarnTrailingComma(false);
        boolean boolean6 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean9 = compilerEnvirons0.isGeneratingSource();
        boolean boolean10 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean11 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14603");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean3 = compilerEnvirons0.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        boolean boolean9 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setXmlAvailable(true);
        boolean boolean12 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean15 = compilerEnvirons0.recoverFromErrors();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14604");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException("", (java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException5 = new java.io.IOException();
        java.io.IOException iOException6 = new java.io.IOException("  {\n  }\n", (java.lang.Throwable) iOException5);
        iOException1.addSuppressed((java.lang.Throwable) iOException5);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException5);
    }

    @Test
    public void test14605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14605");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node(28391110);
    }

    @Test
    public void test14606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14606");
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
        java.lang.String str14 = astRoot7.toSource(17);
        astRoot7.clearParentScope();
        int int16 = astRoot7.getAbsolutePosition();
        int int17 = astRoot7.getLineno();
        boolean boolean18 = astRoot7.hasConsistentReturnUsage();
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
        astRoot7.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode20);
        boolean boolean36 = astRoot7.hasConsistentReturnUsage();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$0" + "'", str1, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 25 + "'", int16 == 25);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{\n}\n" + "'", str22, "{\n}\n");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(commentArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test14607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14607");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean3 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setOptimizationLevel(4);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.getWarnTrailingComma();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons10.setRecordingLocalJsDocComments(false);
        java.util.Set<java.lang.String> strSet13 = compilerEnvirons10.getActivationNames();
        boolean boolean14 = compilerEnvirons10.recoverFromErrors();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons15.setWarnTrailingComma(true);
        boolean boolean18 = compilerEnvirons15.isRecordingLocalJsDocComments();
        compilerEnvirons15.setWarnTrailingComma(false);
        compilerEnvirons15.setAllowSharpComments(false);
        boolean boolean23 = compilerEnvirons15.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons24.setWarnTrailingComma(true);
        java.lang.String[] strArray36 = new java.lang.String[] { "-1\tSCRIPT -1 1\n", "java.io.IOException: ", "136", "136", "java.io.IOException: ", "136", "java.io.IOException: ", "$0", "  {\n  }\n" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        compilerEnvirons24.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons10.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        boolean boolean43 = compilerEnvirons0.recoverFromErrors();
        boolean boolean44 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test14608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14608");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean7 = compilerEnvirons0.reportWarningAsError();
        boolean boolean8 = compilerEnvirons0.isRecordingComments();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion(115729381);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 115729381");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test14609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14609");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean3 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setIdeMode(true);
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str11 = astRoot10.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope12 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator13 = scope12.spliterator();
        astRoot10.addChildScope(scope12);
        java.lang.String str16 = astRoot10.toSource(9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str18 = astRoot17.getNextTempName();
        java.lang.String str19 = astRoot17.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList21 = scriptNode20.getSymbols();
        java.lang.String str22 = astRoot17.toStringTree(scriptNode20);
        com.google.javascript.rhino.head.ast.Scope scope23 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope24 = new com.google.javascript.rhino.head.ast.Scope();
        scope23.addChild((com.google.javascript.rhino.head.ast.AstNode) scope24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope24.setTop(scriptNode26);
        java.lang.String str29 = scope24.toSource(12);
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot10, (com.google.javascript.rhino.head.Node) scriptNode20, (com.google.javascript.rhino.head.Node) scope24);
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str33 = astRoot32.getNextTempName();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node((int) (byte) 10, (com.google.javascript.rhino.head.Node) astRoot32, 4);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet36 = astRoot32.getComments();
        node30.addChildToBack((com.google.javascript.rhino.head.Node) astRoot32);
        com.google.javascript.rhino.head.Node node38 = astRoot32.getLastSibling();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode39 = astRoot32.getEnclosingFunction();
        boolean boolean40 = astRoot32.hasChildren();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = iRFactory8.transformTree(astRoot32);
        com.google.javascript.rhino.head.ast.AstRoot astRoot43 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int44 = astRoot43.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot45 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int46 = astRoot45.getEndLineno();
        java.lang.Object obj47 = astRoot45.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray48 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet49 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet49, commentArray48);
        astRoot45.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet49);
        astRoot45.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str54 = scriptNode53.getNextTempName();
        com.google.javascript.rhino.head.Node node55 = scriptNode53.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList56 = scriptNode53.getFunctions();
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot43, (com.google.javascript.rhino.head.Node) astRoot45, (com.google.javascript.rhino.head.Node) scriptNode53);
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor58 = null;
        astRoot45.visitComments(nodeVisitor58);
        int int60 = astRoot45.getEncodedSourceStart();
        java.lang.String str61 = astRoot45.debugPrint();
        com.google.javascript.rhino.head.ast.Scope scope62 = astRoot45.getParentScope();
        com.google.javascript.rhino.head.ast.Comment comment63 = null;
        astRoot45.setJsDocNode(comment63);
        astRoot45.setEncodedSourceBounds(0, (-547091060));
        astRoot45.setSourceName("                                                {\n                                                }\n");
        int int70 = astRoot45.getLength();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node71 = iRFactory8.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$0" + "'", str11, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "$0" + "'", str18, "$0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "136" + "'", str19, "136");
        org.junit.Assert.assertNotNull(symbolList21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "                        {\n                        }\n" + "'", str29, "                        {\n                        }\n");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "$0" + "'", str33, "$0");
        org.junit.Assert.assertNull(commentSet36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(functionNode39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(scriptNode41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(commentArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "$0" + "'", str54, "$0");
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionNodeList56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str61, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNull(scope62);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
    }

    @Test
    public void test14610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14610");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(627479866, "/");
        boolean boolean3 = node2.hasConsistentReturnUsage();
        boolean boolean4 = node2.hasChildren();
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot(15);
        astRoot6.setPosition((-1076304790));
        node2.setScope((com.google.javascript.rhino.head.ast.Scope) astRoot6);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test14611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14611");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.Node node4 = node3.getLastSibling();
        com.google.javascript.rhino.head.ast.Scope scope5 = new com.google.javascript.rhino.head.ast.Scope();
        node3.addChildToFront((com.google.javascript.rhino.head.Node) scope5);
        int int7 = scope5.getLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol9 = scope5.getSymbol("java.io.IOException: ");
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = new com.google.javascript.rhino.head.ast.AstRoot(11);
        int int12 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) scope5, (com.google.javascript.rhino.head.ast.AstNode) astRoot11);
        com.google.javascript.rhino.head.ast.AstRoot astRoot14 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str15 = astRoot14.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode17 = astRoot16.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode18.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot14, (com.google.javascript.rhino.head.Node) astRoot16, (com.google.javascript.rhino.head.Node) scriptNode18);
        boolean boolean22 = astRoot14.isInStrictMode();
        astRoot14.setRelative((int) '4');
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int26 = astRoot25.getEndLineno();
        java.lang.Object obj27 = astRoot25.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray28 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet29 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet29, commentArray28);
        astRoot25.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet29);
        astRoot25.checkParentLinks();
        int int33 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot14, (com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.ast.Scope scope35 = new com.google.javascript.rhino.head.ast.Scope((-1));
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList36 = scope35.getChildScopes();
        astRoot25.addChildScope(scope35);
        org.junit.Assert.assertNotNull(astNodeComparator2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(symbol9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-12) + "'", int12 == (-12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$0" + "'", str15, "$0");
        org.junit.Assert.assertNull(astNode17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(commentArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-52) + "'", int33 == (-52));
        org.junit.Assert.assertNull(scopeList36);
    }

    @Test
    public void test14612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14612");
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int11 = astRoot10.getParamCount();
        java.lang.String str12 = node5.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) astRoot10);
        java.lang.String str13 = astRoot10.getNextTempName();
        boolean boolean14 = astRoot10.hasSideEffects();
        java.lang.String str16 = astRoot10.toSource(100);
        int int17 = astRoot10.getParamCount();
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope21 = new com.google.javascript.rhino.head.ast.Scope();
        scope20.addChild((com.google.javascript.rhino.head.ast.AstNode) scope21);
        com.google.javascript.rhino.head.Node node23 = scope21.getFirstChild();
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node((int) (byte) -1, (com.google.javascript.rhino.head.Node) scope21);
        scope21.setRelative(100);
        com.google.javascript.rhino.head.ast.AstNode astNode27 = scope21.getParent();
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int29 = astRoot28.getEndLineno();
        java.lang.Object obj30 = astRoot28.getCompilerData();
        com.google.javascript.rhino.head.ast.Symbol symbol32 = astRoot28.getSymbol("java.io.IOException: ");
        astRoot28.setEncodedSourceStart(0);
        java.lang.String str36 = astRoot28.toSource(14);
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) (short) 100, (com.google.javascript.rhino.head.Node) astNode27, (com.google.javascript.rhino.head.Node) astRoot28);
        astRoot10.target = astRoot28;
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = new com.google.javascript.rhino.head.ast.AstRoot(8);
        java.lang.String str41 = astRoot40.debugPrint();
        astRoot40.setInStrictMode(false);
        com.google.javascript.rhino.head.ast.Comment comment44 = null;
        astRoot40.setJsDocNode(comment44);
        java.lang.String str46 = astRoot40.getSourceName();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor47 = null;
        astRoot40.visitComments(nodeVisitor47);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet49 = astRoot40.getComments();
        astRoot28.addChildrenToFront((com.google.javascript.rhino.head.Node) astRoot40);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode51 = astRoot40.getEnclosingFunction();
        int int52 = astRoot40.getFunctionCount();
        java.lang.String str54 = astRoot40.toSource((-1268796928));
        astRoot40.setPosition((-1024348814));
        astRoot40.setEncodedSource("+=");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$0" + "'", str13, "$0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(astNode27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(symbol32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "8\tSCRIPT 8 1\n" + "'", str41, "8\tSCRIPT 8 1\n");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(commentSet49);
        org.junit.Assert.assertNull(functionNode51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test14613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14613");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode1.getNextTempName();
        int int3 = scriptNode1.depth();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = astRoot4.getAstRoot();
        java.lang.String str6 = astRoot5.shortName();
        java.lang.String str8 = astRoot5.toSource(1);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList9 = astRoot5.getFunctions();
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node(12, (com.google.javascript.rhino.head.Node) scriptNode1, (com.google.javascript.rhino.head.Node) astRoot5, 6);
        scriptNode1.putIntProp(910648842, 20);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int17 = astRoot16.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int19 = astRoot18.getEndLineno();
        java.lang.Object obj20 = astRoot18.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray21 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet22 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet22, commentArray21);
        astRoot18.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet22);
        astRoot18.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str27 = scriptNode26.getNextTempName();
        com.google.javascript.rhino.head.Node node28 = scriptNode26.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList29 = scriptNode26.getFunctions();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot16, (com.google.javascript.rhino.head.Node) astRoot18, (com.google.javascript.rhino.head.Node) scriptNode26);
        boolean boolean31 = astRoot18.isInStrictMode();
        com.google.javascript.rhino.head.ast.Comment comment32 = null;
        astRoot18.setJsDocNode(comment32);
        java.lang.String str34 = astRoot18.getEncodedSource();
        astRoot18.setInStrictMode(false);
        com.google.javascript.rhino.head.ast.AstRoot astRoot39 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str40 = astRoot39.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope41 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator42 = scope41.spliterator();
        astRoot39.addChildScope(scope41);
        java.lang.String str45 = astRoot39.toSource(9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot46 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str47 = astRoot46.getNextTempName();
        java.lang.String str48 = astRoot46.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList50 = scriptNode49.getSymbols();
        java.lang.String str51 = astRoot46.toStringTree(scriptNode49);
        com.google.javascript.rhino.head.ast.Scope scope52 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope53 = new com.google.javascript.rhino.head.ast.Scope();
        scope52.addChild((com.google.javascript.rhino.head.ast.AstNode) scope53);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode55 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scope53.setTop(scriptNode55);
        java.lang.String str58 = scope53.toSource(12);
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((int) (short) 10, (com.google.javascript.rhino.head.Node) astRoot39, (com.google.javascript.rhino.head.Node) scriptNode49, (com.google.javascript.rhino.head.Node) scope53);
        com.google.javascript.rhino.head.ast.AstRoot astRoot61 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str62 = astRoot61.getNextTempName();
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node((int) (byte) 10, (com.google.javascript.rhino.head.Node) astRoot61, 4);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet65 = astRoot61.getComments();
        node59.addChildToBack((com.google.javascript.rhino.head.Node) astRoot61);
        com.google.javascript.rhino.head.Node node67 = astRoot61.getLastSibling();
        com.google.javascript.rhino.head.ast.AstRoot astRoot69 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str70 = astRoot69.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot71 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode72 = astRoot71.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode73 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode73.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node76 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot69, (com.google.javascript.rhino.head.Node) astRoot71, (com.google.javascript.rhino.head.Node) scriptNode73);
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor77 = null;
        astRoot69.visitComments(nodeVisitor77);
        com.google.javascript.rhino.head.Node node80 = new com.google.javascript.rhino.head.Node(526823265, node67, (com.google.javascript.rhino.head.Node) astRoot69, 1);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator81 = astRoot69.new NodeIterator();
        astRoot18.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot69);
        astRoot69.removeProp((-1115328205));
        scriptNode1.setParentScope((com.google.javascript.rhino.head.ast.Scope) astRoot69);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator86 = astRoot69.spliterator();
        boolean boolean87 = astRoot69.isInStrictMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$0" + "'", str2, "$0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AstRoot" + "'", str6, "AstRoot");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(functionNodeList9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(commentArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "$0" + "'", str27, "$0");
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionNodeList29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "$0" + "'", str40, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "$0" + "'", str47, "$0");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "136" + "'", str48, "136");
        org.junit.Assert.assertNotNull(symbolList50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "                        {\n                        }\n" + "'", str58, "                        {\n                        }\n");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "$0" + "'", str62, "$0");
        org.junit.Assert.assertNull(commentSet65);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "$0" + "'", str70, "$0");
        org.junit.Assert.assertNull(astNode72);
        org.junit.Assert.assertNotNull(nodeSpliterator86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test14614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14614");
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
        scriptNode3.setBaseLineno(6);
        java.lang.String str19 = scriptNode3.getEncodedSource();
        java.lang.String str20 = scriptNode3.getJsDoc();
        int int23 = scriptNode3.getIntProp((-932305774), (-547091060));
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int26 = astRoot25.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int28 = astRoot27.getEndLineno();
        java.lang.Object obj29 = astRoot27.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray30 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet31 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet31, commentArray30);
        astRoot27.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet31);
        astRoot27.checkParentLinks();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str36 = scriptNode35.getNextTempName();
        com.google.javascript.rhino.head.Node node37 = scriptNode35.target;
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList38 = scriptNode35.getFunctions();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node(14, (com.google.javascript.rhino.head.Node) astRoot25, (com.google.javascript.rhino.head.Node) astRoot27, (com.google.javascript.rhino.head.Node) scriptNode35);
        int int40 = astRoot27.getRegexpCount();
        com.google.javascript.rhino.head.Node node41 = astRoot27.getNext();
        astRoot27.setBaseLineno(10);
        astRoot27.setEncodedSourceBounds(136, 3);
        com.google.javascript.rhino.head.ast.AstRoot astRoot47 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int48 = astRoot47.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot49 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int50 = astRoot49.getEndLineno();
        java.lang.Object obj51 = astRoot49.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray52 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet53 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet53, commentArray52);
        astRoot49.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet53);
        astRoot47.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet53);
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node((int) (short) 10, 14);
        com.google.javascript.rhino.head.ast.Scope scope63 = new com.google.javascript.rhino.head.ast.Scope(2, (int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode64 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str66 = scriptNode64.toSource(0);
        scriptNode64.setEncodedSourceBounds(12, 10);
        com.google.javascript.rhino.head.Node node71 = new com.google.javascript.rhino.head.Node((int) '#', node60, (com.google.javascript.rhino.head.Node) scope63, (com.google.javascript.rhino.head.Node) scriptNode64, 2);
        astRoot47.setParentScope((com.google.javascript.rhino.head.ast.Scope) scriptNode64);
        java.lang.String str73 = astRoot47.debugPrint();
        int int74 = astRoot47.getLength();
        java.lang.String str75 = astRoot27.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) astRoot47);
        astRoot47.clearParentScope();
        // The following exception was thrown during execution in test generation
        try {
            int int77 = scriptNode3.getIndexForNameNode((com.google.javascript.rhino.head.Node) astRoot47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$0" + "'", str12, "$0");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(functionNodeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-547091060) + "'", int23 == (-547091060));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(commentArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "$0" + "'", str36, "$0");
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(functionNodeList38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(commentArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "{\n}\n" + "'", str66, "{\n}\n");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str73, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNull(str75);
    }

    @Test
    public void test14615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14615");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newTarget();
        com.google.javascript.rhino.head.Node node4 = node3.getLastSibling();
        com.google.javascript.rhino.head.ast.Scope scope5 = new com.google.javascript.rhino.head.ast.Scope();
        node3.addChildToFront((com.google.javascript.rhino.head.Node) scope5);
        int int7 = scope5.getLineno();
        com.google.javascript.rhino.head.ast.Symbol symbol9 = scope5.getSymbol("java.io.IOException: ");
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = new com.google.javascript.rhino.head.ast.AstRoot(11);
        int int12 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) scope5, (com.google.javascript.rhino.head.ast.AstNode) astRoot11);
        com.google.javascript.rhino.head.ast.AstRoot astRoot14 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str15 = astRoot14.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode17 = astRoot16.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode18.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot14, (com.google.javascript.rhino.head.Node) astRoot16, (com.google.javascript.rhino.head.Node) scriptNode18);
        boolean boolean22 = astRoot14.isInStrictMode();
        astRoot14.setRelative((int) '4');
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int26 = astRoot25.getEndLineno();
        java.lang.Object obj27 = astRoot25.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray28 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet29 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet29, commentArray28);
        astRoot25.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet29);
        astRoot25.checkParentLinks();
        int int33 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot14, (com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        astRoot14.setLength((int) '4');
        astRoot14.setEncodedSourceBounds((-738182430), (-1076304790));
        boolean boolean39 = astRoot14.hasSideEffects();
        astRoot14.checkParentLinks();
        org.junit.Assert.assertNotNull(astNodeComparator2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(symbol9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-12) + "'", int12 == (-12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$0" + "'", str15, "$0");
        org.junit.Assert.assertNull(astNode17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(commentArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-52) + "'", int33 == (-52));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test14616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14616");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.setCompilerData((java.lang.Object) (byte) 100);
        java.lang.String str3 = scriptNode0.getJsDoc();
        scriptNode0.clearParentScope();
        java.lang.String str6 = scriptNode0.toSource((-197385824));
        java.lang.String str8 = scriptNode0.makeIndent(170);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList9 = scriptNode0.getChildScopes();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{\n}\n" + "'", str6, "{\n}\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                    " + "'", str8, "                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertNull(scopeList9);
    }

    @Test
    public void test14617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14617");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray2 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList3 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList3, symbolArray2);
        astRoot0.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList3);
        astRoot0.clearParentScope();
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int8 = astRoot7.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int10 = astRoot9.getEndLineno();
        java.lang.Object obj11 = astRoot9.getCompilerData();
        com.google.javascript.rhino.head.ast.Comment[] commentArray12 = new com.google.javascript.rhino.head.ast.Comment[] {};
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet13 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet13, commentArray12);
        astRoot9.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet13);
        astRoot7.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet13);
        astRoot0.target = astRoot7;
        boolean boolean18 = astRoot7.hasSideEffects();
        com.google.javascript.rhino.head.ast.Comment comment19 = null;
        astRoot7.setJsDocNode(comment19);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator21 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator22 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator23 = positionComparator21.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator22);
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str26 = astRoot25.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode28 = astRoot27.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode29.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot25, (com.google.javascript.rhino.head.Node) astRoot27, (com.google.javascript.rhino.head.Node) scriptNode29);
        com.google.javascript.rhino.head.ast.Scope scope35 = new com.google.javascript.rhino.head.ast.Scope(2, (int) (byte) -1);
        int int36 = positionComparator21.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot27, (com.google.javascript.rhino.head.ast.AstNode) scope35);
        astRoot27.removeChildren();
        java.lang.String str39 = astRoot27.toSource(10);
        int int40 = astRoot27.getAbsolutePosition();
        com.google.javascript.rhino.head.ast.AstRoot astRoot41 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str42 = astRoot41.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope43 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator44 = scope43.spliterator();
        astRoot41.addChildScope(scope43);
        java.lang.String str47 = astRoot41.toSource(9);
        com.google.javascript.rhino.head.ast.Comment comment48 = null;
        astRoot41.setJsDocNode(comment48);
        int int50 = astRoot41.getType();
        java.lang.String str51 = astRoot41.getEncodedSource();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap52 = null;
        astRoot41.setSymbolTable(strMap52);
        astRoot41.clearParentScope();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons55 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons55.setWarnTrailingComma(true);
        boolean boolean58 = compilerEnvirons55.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter59 = compilerEnvirons55.getErrorReporter();
        compilerEnvirons55.setGeneratingSource(false);
        compilerEnvirons55.setReservedKeywordAsIdentifier(false);
        compilerEnvirons55.setGenerateDebugInfo(true);
        int int66 = compilerEnvirons55.getOptimizationLevel();
        astRoot41.setCompilerData((java.lang.Object) compilerEnvirons55);
        astRoot41.removeProp(26);
        int int70 = astRoot27.compareTo((com.google.javascript.rhino.head.ast.AstNode) astRoot41);
        java.lang.String str71 = astRoot27.getEncodedSource();
        astRoot7.addChild((com.google.javascript.rhino.head.ast.AstNode) astRoot27);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(symbolArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(commentArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(astNodeComparator23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "$0" + "'", str26, "$0");
        org.junit.Assert.assertNull(astNode28);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-3) + "'", int36 == (-3));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "$0" + "'", str42, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 136 + "'", int50 == 136);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(errorReporter59);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1090635053 + "'", int70 == 1090635053);
        org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test14618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14618");
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
        int int10 = astRoot9.getParamCount();
        astRoot9.setEndLineno((int) (byte) 100);
        com.google.javascript.rhino.head.ast.AstRoot astRoot13 = astRoot9.getAstRoot();
        java.lang.String str14 = astRoot13.shortName();
        astRoot13.clearParentScope();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor16 = null;
        astRoot13.visitComments(nodeVisitor16);
        scriptNode4.addChildToFront((com.google.javascript.rhino.head.Node) astRoot13);
        com.google.javascript.rhino.head.Parser parser19 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = parser19.parse("$0", "AstRoot", (int) '#');
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str25 = astRoot24.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope26 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator27 = scope26.spliterator();
        astRoot24.addChildScope(scope26);
        astRoot23.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot24);
        com.google.javascript.rhino.head.ast.Scope scope30 = astRoot23.getParentScope();
        java.lang.String str31 = astRoot23.toString();
        astRoot13.addChildrenToBack((com.google.javascript.rhino.head.Node) astRoot23);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList33 = astRoot13.getStatements();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons35.setWarnTrailingComma(true);
        boolean boolean38 = compilerEnvirons35.isRecordingLocalJsDocComments();
        compilerEnvirons35.setWarnTrailingComma(false);
        compilerEnvirons35.setAllowSharpComments(false);
        boolean boolean43 = compilerEnvirons35.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons44 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons44.setWarnTrailingComma(true);
        java.lang.String[] strArray56 = new java.lang.String[] { "-1\tSCRIPT -1 1\n", "java.io.IOException: ", "136", "136", "java.io.IOException: ", "136", "java.io.IOException: ", "$0", "  {\n  }\n" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        compilerEnvirons44.setActivationNames((java.util.Set<java.lang.String>) strSet57);
        compilerEnvirons35.setActivationNames((java.util.Set<java.lang.String>) strSet57);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons61 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons61.setWarnTrailingComma(true);
        boolean boolean64 = compilerEnvirons61.isRecordingLocalJsDocComments();
        compilerEnvirons61.setWarnTrailingComma(false);
        compilerEnvirons61.setAllowSharpComments(false);
        boolean boolean69 = compilerEnvirons61.isGenerateDebugInfo();
        compilerEnvirons61.setIdeMode(false);
        compilerEnvirons61.setWarnTrailingComma(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons74 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons74.setStrictMode(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter77 = compilerEnvirons74.getErrorReporter();
        boolean boolean78 = compilerEnvirons74.isGenerateObserverCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter79 = compilerEnvirons74.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser80 = new com.google.javascript.rhino.head.Parser(compilerEnvirons61, errorReporter79);
        com.google.javascript.rhino.head.IRFactory iRFactory81 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons35, errorReporter79);
        boolean boolean82 = compilerEnvirons35.getAllowSharpComments();
        astRoot13.putProp((-993460695), (java.lang.Object) boolean82);
        org.junit.Assert.assertNotNull(symbolList1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(symbolList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$0" + "'", str5, "$0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str6, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 136 + "'", int8 == 136);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(astRoot13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AstRoot" + "'", str14, "AstRoot");
        org.junit.Assert.assertNotNull(astRoot23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "$0" + "'", str25, "$0");
        org.junit.Assert.assertNotNull(nodeSpliterator27);
        org.junit.Assert.assertNull(scope30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "136" + "'", str31, "136");
        org.junit.Assert.assertNotNull(astNodeList33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(errorReporter77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(errorReporter79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test14619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14619");
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
        astRoot14.removeChildren();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$0" + "'", str2, "$0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str3, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$0" + "'", str8, "$0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "136" + "'", str9, "136");
        org.junit.Assert.assertNotNull(symbolList11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(commentArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test14620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14620");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(122705610, "23\tBLOCK 23 1\n");
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test14621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14621");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator2 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator3 = positionComparator1.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator2);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator4 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator5 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator6 = positionComparator4.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot8 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str9 = astRoot8.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode11 = astRoot10.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode12.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot8, (com.google.javascript.rhino.head.Node) astRoot10, (com.google.javascript.rhino.head.Node) scriptNode12);
        com.google.javascript.rhino.head.ast.Scope scope18 = new com.google.javascript.rhino.head.ast.Scope(2, (int) (byte) -1);
        int int19 = positionComparator4.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot10, (com.google.javascript.rhino.head.ast.AstNode) scope18);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator20 = astNodeComparator3.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator4);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator21 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator22 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator23 = positionComparator21.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator22);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator24 = astNodeComparator20.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator22);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator25 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator26 = positionComparator22.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator25);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode29.setCompilerData((java.lang.Object) (byte) 100);
        java.lang.String str32 = scriptNode29.getNextTempName();
        com.google.javascript.rhino.head.ast.Scope scope35 = new com.google.javascript.rhino.head.ast.Scope(2, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode29, (com.google.javascript.rhino.head.Node) scope35, 25);
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstRoot astRoot39 = astRoot38.getAstRoot();
        java.lang.String str40 = astRoot39.shortName();
        java.lang.String str41 = astRoot39.getSourceName();
        astRoot39.checkParentLinks();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap43 = astRoot39.getSymbolTable();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((int) '4', (com.google.javascript.rhino.head.Node) scope35, (com.google.javascript.rhino.head.Node) astRoot39);
        int int45 = scope35.getLineno();
        com.google.javascript.rhino.head.Node node46 = scope35.getLastSibling();
        int int47 = scope35.getLineno();
        com.google.javascript.rhino.head.ast.AstRoot astRoot49 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int50 = astRoot49.getParamCount();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray51 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList52 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList52, symbolArray51);
        astRoot49.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList52);
        boolean boolean55 = astRoot49.hasConsistentReturnUsage();
        astRoot49.setLineno((-3));
        com.google.javascript.rhino.head.Node node58 = new com.google.javascript.rhino.head.Node((int) (byte) -1, (com.google.javascript.rhino.head.Node) astRoot49);
        int int59 = positionComparator25.compare((com.google.javascript.rhino.head.ast.AstNode) scope35, (com.google.javascript.rhino.head.ast.AstNode) astRoot49);
        java.lang.String str61 = astRoot49.toSource((-1291599107));
        astRoot49.setSourceName("653625563");
        int int64 = astRoot49.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot67 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.lang.String str68 = astRoot67.getNextTempName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot69 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.ast.AstNode astNode70 = astRoot69.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode71 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode71.setCompilerData((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) astRoot67, (com.google.javascript.rhino.head.Node) astRoot69, (com.google.javascript.rhino.head.Node) scriptNode71);
        int int75 = astRoot67.getParamCount();
        com.google.javascript.rhino.head.ast.Scope scope76 = new com.google.javascript.rhino.head.ast.Scope();
        scope76.clearParentScope();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot67, scope76);
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node(6, (com.google.javascript.rhino.head.Node) scope76);
        com.google.javascript.rhino.head.ast.Scope scope80 = new com.google.javascript.rhino.head.ast.Scope();
        com.google.javascript.rhino.head.ast.Scope scope81 = new com.google.javascript.rhino.head.ast.Scope();
        scope80.addChild((com.google.javascript.rhino.head.ast.AstNode) scope81);
        boolean boolean83 = scope80.hasSideEffects();
        int int84 = scope76.compareTo((com.google.javascript.rhino.head.ast.AstNode) scope80);
        com.google.javascript.rhino.head.Node node86 = scope76.setType((-297370766));
        com.google.javascript.rhino.head.Node node88 = new com.google.javascript.rhino.head.Node(531785163, (com.google.javascript.rhino.head.Node) astRoot49, node86, (-1311048095));
        org.junit.Assert.assertNotNull(astNodeComparator3);
        org.junit.Assert.assertNotNull(astNodeComparator6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$0" + "'", str9, "$0");
        org.junit.Assert.assertNull(astNode11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-3) + "'", int19 == (-3));
        org.junit.Assert.assertNotNull(astNodeComparator20);
        org.junit.Assert.assertNotNull(astNodeComparator23);
        org.junit.Assert.assertNotNull(astNodeComparator24);
        org.junit.Assert.assertNotNull(astNodeComparator26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "$0" + "'", str32, "$0");
        org.junit.Assert.assertNotNull(astRoot39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "AstRoot" + "'", str40, "AstRoot");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(strMap43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(symbolArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "$0" + "'", str68, "$0");
        org.junit.Assert.assertNull(astNode70);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-96626968) + "'", int84 == (-96626968));
        org.junit.Assert.assertNotNull(node86);
    }
}
