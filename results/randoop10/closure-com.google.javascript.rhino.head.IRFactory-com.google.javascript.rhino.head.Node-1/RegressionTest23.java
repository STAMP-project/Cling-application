import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

    public static boolean debug = false;

    @Test
    public void test11501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11501");
        com.google.javascript.rhino.head.Token.CommentType commentType2 = null;
        com.google.javascript.rhino.head.ast.Comment comment4 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType2, "");
        boolean boolean5 = comment4.hasSideEffects();
        int int6 = comment4.getLineno();
        com.google.javascript.rhino.head.Token.CommentType commentType7 = comment4.getCommentType();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode8.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList11 = scriptNode9.getChildScopes();
        int int12 = scriptNode9.getBaseLineno();
        int int13 = scriptNode9.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode14.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode15);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList17 = scriptNode15.getFunctions();
        scriptNode15.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope20 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode9.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode15, (com.google.javascript.rhino.head.Node) scope20);
        scriptNode15.setEncodedSourceEnd(18);
        comment4.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode15);
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = scriptNode15.getAstRoot();
        int int26 = scriptNode15.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = scriptNode15.getTop();
        boolean boolean28 = scriptNode15.hasConsistentReturnUsage();
        int int29 = scriptNode15.getAbsolutePosition();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList30 = scriptNode15.getSymbols();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor31 = scriptNode15.iterator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(commentType7);
        org.junit.Assert.assertNull(scopeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(functionNodeList17);
        org.junit.Assert.assertNull(astRoot25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 18 + "'", int26 == 18);
        org.junit.Assert.assertNotNull(scriptNode27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9 + "'", int29 == 9);
        org.junit.Assert.assertNotNull(symbolList30);
        org.junit.Assert.assertNotNull(nodeItor31);
    }

    @Test
    public void test11502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11502");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = scriptNode15.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.ScriptNode cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scopeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(functionNodeList9);
        org.junit.Assert.assertNull(scopeList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(astRoot20);
    }

    @Test
    public void test11503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11503");
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
        compilerEnvirons0.setGeneratingSource(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator20 = astRoot19.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType23 = null;
        com.google.javascript.rhino.head.ast.Comment comment25 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType23, "");
        boolean boolean26 = comment25.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType29 = null;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType29, "");
        boolean boolean32 = comment31.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType35 = null;
        com.google.javascript.rhino.head.ast.Comment comment37 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType35, "");
        java.lang.String str39 = comment37.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray40 = new com.google.javascript.rhino.head.ast.Comment[] { comment25, comment31, comment37 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet41 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet41, commentArray40);
        astRoot19.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet41);
        boolean boolean44 = astRoot19.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray45 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList46 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList46, symbolArray45);
        astRoot19.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList46);
        int int49 = astRoot19.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode50.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode51);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList53 = scriptNode51.getChildScopes();
        int int54 = scriptNode51.getBaseLineno();
        com.google.javascript.rhino.head.Node node55 = scriptNode51.getLastSibling();
        scriptNode51.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode58 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode58.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode59);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList61 = scriptNode59.getFunctions();
        scriptNode59.setPosition((int) (byte) 10);
        java.lang.String str64 = scriptNode51.toStringTree(scriptNode59);
        int int65 = scriptNode51.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot19, (com.google.javascript.rhino.head.ast.Scope) scriptNode51);
        java.lang.String str68 = astRoot19.toSource(15);
        int int69 = astRoot19.getFunctionCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode70 = iRFactory18.transformTree(astRoot19);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(errorReporter13);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "                                                                                                                                                                                                        " + "'", str39, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(symbolArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(scopeList53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(functionNodeList61);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(scriptNode70);
    }

    @Test
    public void test11504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11504");
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment(95442629, 9, commentType3, "          hi!");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode7.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode8);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList10 = scriptNode8.getChildScopes();
        int int11 = scriptNode8.getBaseLineno();
        com.google.javascript.rhino.head.Node node12 = scriptNode8.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode13.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode14);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList16 = scriptNode14.getChildScopes();
        java.lang.String str18 = scriptNode14.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode8.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode14, (com.google.javascript.rhino.head.Node) scriptNode20);
        java.lang.Object obj23 = scriptNode14.getProp((int) (short) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str26 = scriptNode24.toSource((int) '4');
        java.lang.String str27 = scriptNode14.toStringTree(scriptNode24);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons28, errorReporter29);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode31.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode32);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList34 = scriptNode32.getChildScopes();
        int int35 = scriptNode32.getBaseLineno();
        int int36 = scriptNode32.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode37.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode38);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList40 = scriptNode38.getFunctions();
        scriptNode38.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope43 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode32.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode38, (com.google.javascript.rhino.head.Node) scope43);
        scriptNode38.setEncodedSourceEnd(18);
        com.google.javascript.rhino.head.Node node47 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode38);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons48 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory50 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons48, errorReporter49);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode51.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode52);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList54 = scriptNode52.getChildScopes();
        int int55 = scriptNode52.getBaseLineno();
        int int56 = scriptNode52.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode58 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode57.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode58);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList60 = scriptNode58.getFunctions();
        scriptNode58.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope63 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode52.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode58, (com.google.javascript.rhino.head.Node) scope63);
        scriptNode58.setEncodedSourceEnd(18);
        com.google.javascript.rhino.head.Node node67 = iRFactory50.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode58);
        scriptNode38.setTop(scriptNode58);
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(2, (com.google.javascript.rhino.head.Node) scriptNode14, (com.google.javascript.rhino.head.Node) scriptNode38, 10);
        scriptNode14.flattenSymbolTable(false);
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node(1891424362, (com.google.javascript.rhino.head.Node) comment5, (com.google.javascript.rhino.head.Node) scriptNode14, 9);
        scriptNode14.setEncodedSource("                                                    ");
        boolean[] booleanArray77 = scriptNode14.getParamAndVarConst();
        org.junit.Assert.assertNull(scopeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(scopeList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "                                                                                                        {\n                                                                                                        }\n" + "'", str26, "                                                                                                        {\n                                                                                                        }\n");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(scopeList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(functionNodeList40);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(scopeList54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(functionNodeList60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(booleanArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray77), "[]");
    }

    @Test
    public void test11505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11505");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        scriptNode1.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap7 = scriptNode6.getSymbolTable();
        scriptNode1.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode9.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList12 = scriptNode10.getChildScopes();
        int int13 = scriptNode10.getBaseLineno();
        com.google.javascript.rhino.head.Node node14 = scriptNode10.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode15.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode16);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList18 = scriptNode16.getChildScopes();
        java.lang.String str20 = scriptNode16.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode10.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode16, (com.google.javascript.rhino.head.Node) scriptNode22);
        scriptNode1.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode10);
        scriptNode10.setBaseLineno(4);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator27 = scriptNode10.spliterator();
        java.lang.String str28 = scriptNode10.getEncodedSource();
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(scopeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(scopeList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeSpliterator27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test11506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11506");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator3 = scope2.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode4.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode5);
        scope2.setTop(scriptNode5);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor8 = scope2.iterator();
        com.google.javascript.rhino.head.Token.CommentType commentType11 = null;
        com.google.javascript.rhino.head.ast.Comment comment13 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType11, "");
        boolean boolean14 = comment13.hasSideEffects();
        int int15 = comment13.getLineno();
        com.google.javascript.rhino.head.Node node17 = comment13.setType(18);
        com.google.javascript.rhino.head.Token.CommentType commentType20 = null;
        com.google.javascript.rhino.head.ast.Comment comment22 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType20, "");
        boolean boolean23 = comment22.hasSideEffects();
        int int24 = comment22.getLineno();
        com.google.javascript.rhino.head.Node node26 = comment22.setType(18);
        comment22.removeChildren();
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node((-1116244898), (com.google.javascript.rhino.head.Node) scope2, (com.google.javascript.rhino.head.Node) comment13, (com.google.javascript.rhino.head.Node) comment22, 15);
        com.google.javascript.rhino.head.Node node30 = scope2.getFirstChild();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap31 = scope2.getSymbolTable();
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newString((int) 'a', "                                                                                                                                                                                                        ");
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((-389113235), (com.google.javascript.rhino.head.Node) scope2, node34, 1001288202);
        org.junit.Assert.assertNotNull(nodeSpliterator3);
        org.junit.Assert.assertNotNull(nodeItor8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(strMap31);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test11507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11507");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator2 = scriptNode1.spliterator();
        com.google.javascript.rhino.head.Node node4 = scriptNode1.setType((int) '#');
        java.lang.Object obj5 = scriptNode1.getCompilerData();
        com.google.javascript.rhino.head.ast.Symbol symbol7 = scriptNode1.getSymbol("typeof");
        scriptNode1.setEncodedSource("{\n}\n");
        scriptNode1.setEncodedSourceBounds((int) (short) 100, 8);
        int int13 = scriptNode1.getRegexpCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode14.putIntProp((int) (short) 1, 1);
        scriptNode14.setEncodedSource("typeof");
        java.lang.Object obj21 = scriptNode14.getProp(2);
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node(574921099, (com.google.javascript.rhino.head.Node) scriptNode1, (com.google.javascript.rhino.head.Node) scriptNode14);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode24.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode25);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList27 = scriptNode25.getChildScopes();
        int int28 = scriptNode25.getBaseLineno();
        int int29 = scriptNode25.getParamCount();
        scriptNode25.flattenSymbolTable(true);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode32.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode33);
        scriptNode33.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap39 = scriptNode38.getSymbolTable();
        scriptNode33.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode38);
        com.google.javascript.rhino.head.ast.Scope scope41 = scriptNode33.getParentScope();
        boolean boolean42 = scriptNode33.hasChildren();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList43 = scriptNode33.getSymbols();
        scriptNode25.setSymbols(symbolList43);
        node22.putProp(1275261773, (java.lang.Object) scriptNode25);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList46 = scriptNode25.getChildScopes();
        java.lang.String str47 = scriptNode25.getJsDoc();
        org.junit.Assert.assertNotNull(nodeSpliterator2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(symbol7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(scopeList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(strMap39);
        org.junit.Assert.assertNull(scope41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(symbolList43);
        org.junit.Assert.assertNull(scopeList46);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test11508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11508");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("136");
        node1.setString("                                                                                                        {\n                                                                                                        }\n");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode6);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList8 = scriptNode6.getChildScopes();
        int int9 = scriptNode6.getBaseLineno();
        com.google.javascript.rhino.head.Node node10 = scriptNode6.getLastSibling();
        int int11 = scriptNode6.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope(5, (int) '#');
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator16 = astRoot15.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType19 = null;
        com.google.javascript.rhino.head.ast.Comment comment21 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType19, "");
        boolean boolean22 = comment21.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType25 = null;
        com.google.javascript.rhino.head.ast.Comment comment27 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType25, "");
        boolean boolean28 = comment27.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType31 = null;
        com.google.javascript.rhino.head.ast.Comment comment33 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType31, "");
        java.lang.String str35 = comment33.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray36 = new com.google.javascript.rhino.head.ast.Comment[] { comment21, comment27, comment33 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet37 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet37, commentArray36);
        astRoot15.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet37);
        boolean boolean40 = astRoot15.isInStrictMode();
        com.google.javascript.rhino.head.ast.AstNode astNode41 = astRoot15.getParent();
        astRoot15.setEndLineno((int) (short) 0);
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode6, (com.google.javascript.rhino.head.Node) scope14, (com.google.javascript.rhino.head.Node) astRoot15, 6);
        java.lang.String str46 = node1.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) astRoot15);
        astRoot15.checkParentLinks();
        java.lang.String str49 = astRoot15.toSource(3);
        java.lang.String str50 = astRoot15.getJsDoc();
        com.google.javascript.rhino.head.ast.Symbol symbol52 = astRoot15.getSymbol("hi!");
        int int53 = astRoot15.getType();
        com.google.javascript.rhino.head.Token.CommentType commentType56 = null;
        com.google.javascript.rhino.head.ast.Comment comment58 = new com.google.javascript.rhino.head.ast.Comment((int) (short) 0, (-1728226312), commentType56, "136");
        astRoot15.addComment(comment58);
        com.google.javascript.rhino.head.Token.CommentType commentType60 = null;
        comment58.setCommentType(commentType60);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(scopeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "                                                                                                                                                                                                        " + "'", str35, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(astNode41);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(symbol52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 136 + "'", int53 == 136);
    }

    @Test
    public void test11509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11509");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean11 = compilerEnvirons0.isGeneratingSource();
        int int12 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean13 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setRecordingComments(true);
        boolean boolean18 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        boolean boolean21 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test11510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11510");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int2 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setLanguageVersion((int) (byte) 100);
        boolean boolean5 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean6 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 170 + "'", int2 == 170);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test11511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11511");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean11 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setIdeMode(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean15 = compilerEnvirons14.isReservedKeywordAsIdentifier();
        int int16 = compilerEnvirons14.getLanguageVersion();
        int int17 = compilerEnvirons14.getLanguageVersion();
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
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons14, errorReporter30);
        compilerEnvirons14.setAllowSharpComments(false);
        compilerEnvirons14.setGeneratingSource(false);
        compilerEnvirons14.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons39 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean40 = compilerEnvirons39.isReservedKeywordAsIdentifier();
        boolean boolean41 = compilerEnvirons39.getWarnTrailingComma();
        boolean boolean42 = compilerEnvirons39.isRecordingComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter43 = compilerEnvirons39.getErrorReporter();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons44 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean45 = compilerEnvirons44.isReservedKeywordAsIdentifier();
        int int46 = compilerEnvirons44.getLanguageVersion();
        compilerEnvirons44.setLanguageVersion((int) (byte) 100);
        boolean boolean49 = compilerEnvirons44.isAllowMemberExprAsFunctionName();
        compilerEnvirons44.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons52 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray58 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet59, strArray58);
        compilerEnvirons52.setActivationNames((java.util.Set<java.lang.String>) strSet59);
        boolean boolean62 = compilerEnvirons52.isGenerateDebugInfo();
        compilerEnvirons52.setOptimizationLevel((int) (short) 1);
        compilerEnvirons52.setAllowSharpComments(true);
        boolean boolean67 = compilerEnvirons52.getAllowSharpComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter68 = compilerEnvirons52.getErrorReporter();
        compilerEnvirons44.setErrorReporter(errorReporter68);
        com.google.javascript.rhino.head.ErrorReporter errorReporter70 = compilerEnvirons44.getErrorReporter();
        compilerEnvirons39.setErrorReporter(errorReporter70);
        compilerEnvirons14.setErrorReporter(errorReporter70);
        com.google.javascript.rhino.head.Parser parser73 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter70);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.EvaluatorException evaluatorException79 = errorReporter70.runtimeError("-1\tBLOCK -1 1\n", "          ", 654067107, "35\tSCRIPT 35 1\n", 14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 170 + "'", int16 == 170);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 170 + "'", int17 == 170);
        org.junit.Assert.assertNotNull(compilerEnvirons18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(strSet29);
        org.junit.Assert.assertNotNull(errorReporter30);
        org.junit.Assert.assertNotNull(compilerEnvirons39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(errorReporter43);
        org.junit.Assert.assertNotNull(compilerEnvirons44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 170 + "'", int46 == 170);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons52);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(errorReporter68);
        org.junit.Assert.assertNotNull(errorReporter70);
    }

    @Test
    public void test11512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11512");
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
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean18 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11513");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean11 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory14.parse("2\tSCRIPT 2 1\n", "+=", 13);
        java.lang.String str20 = astRoot18.toSource((-1662832286));
        com.google.javascript.rhino.head.Node node21 = astRoot18.getNext();
        int int22 = astRoot18.getFunctionCount();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2;\nSCRIPT;\n2;\n1;\n" + "'", str20, "2;\nSCRIPT;\n2;\n1;\n");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test11514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11514");
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
        astRoot28.setLength((-451814955));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode34.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode35);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray38 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList39 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList39, symbolArray38);
        scriptNode37.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList39);
        scriptNode34.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList39);
        int int43 = scriptNode34.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode44.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode45);
        scriptNode45.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap51 = scriptNode50.getSymbolTable();
        scriptNode45.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode50);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode53.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode54);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList56 = scriptNode54.getChildScopes();
        int int57 = scriptNode54.getBaseLineno();
        com.google.javascript.rhino.head.Node node58 = scriptNode54.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode59.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode60);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList62 = scriptNode60.getChildScopes();
        java.lang.String str64 = scriptNode60.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode54.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode60, (com.google.javascript.rhino.head.Node) scriptNode66);
        scriptNode45.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode54);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap69 = null;
        scriptNode54.setSymbolTable(strMap69);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap71 = scriptNode54.getSymbolTable();
        com.google.javascript.rhino.head.ast.Scope scope73 = new com.google.javascript.rhino.head.ast.Scope(1);
        int int74 = scriptNode54.compareTo((com.google.javascript.rhino.head.ast.AstNode) scope73);
        boolean boolean75 = scope73.hasSideEffects();
        com.google.javascript.rhino.head.Node node77 = new com.google.javascript.rhino.head.Node(520206471, (com.google.javascript.rhino.head.Node) astRoot28, (com.google.javascript.rhino.head.Node) scriptNode34, (com.google.javascript.rhino.head.Node) scope73, 51850316);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str78 = node77.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Node cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                                                                                                                                        " + "'", str21, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(symbolArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(strMap51);
        org.junit.Assert.assertNull(scopeList56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(scopeList62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNull(strMap71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test11515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11515");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList3 = scriptNode1.getFunctions();
        scriptNode1.setPosition((int) (byte) 10);
        int int6 = scriptNode1.getEncodedSourceEnd();
        int int7 = scriptNode1.getLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode8.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList11 = scriptNode9.getChildScopes();
        int int12 = scriptNode9.getBaseLineno();
        com.google.javascript.rhino.head.Node node13 = scriptNode9.getLastSibling();
        java.lang.String str14 = scriptNode1.toStringTree(scriptNode9);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode15 = scriptNode9.getEnclosingFunction();
        com.google.javascript.rhino.head.ast.RegExpLiteral regExpLiteral16 = null;
        // The following exception was thrown during execution in test generation
        try {
            scriptNode9.addRegExp(regExpLiteral16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionNodeList3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(scopeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(functionNode15);
    }

    @Test
    public void test11516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11516");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator1 = scriptNode0.spliterator();
        com.google.javascript.rhino.head.Token.CommentType commentType4 = null;
        com.google.javascript.rhino.head.ast.Comment comment6 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType4, "");
        java.lang.String str8 = comment6.toSource(100);
        java.lang.String str9 = comment6.getValue();
        scriptNode0.setParent((com.google.javascript.rhino.head.ast.AstNode) comment6);
        java.lang.String str12 = scriptNode0.makeIndent(11);
        boolean boolean13 = scriptNode0.hasChildren();
        com.google.javascript.rhino.head.ast.Comment comment14 = scriptNode0.getJsDocNode();
        org.junit.Assert.assertNotNull(nodeSpliterator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                                                                                                                        " + "'", str8, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                      " + "'", str12, "                      ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(comment14);
    }

    @Test
    public void test11517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11517");
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
        java.lang.Object obj10 = astRoot3.getCompilerData();
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = astRoot3.getAstRoot();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode14.flattenSymbolTable(true);
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node(538062289, (com.google.javascript.rhino.head.Node) scriptNode14, (-603115504));
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator20 = astRoot19.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType23 = null;
        com.google.javascript.rhino.head.ast.Comment comment25 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType23, "");
        boolean boolean26 = comment25.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType29 = null;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType29, "");
        boolean boolean32 = comment31.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType35 = null;
        com.google.javascript.rhino.head.ast.Comment comment37 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType35, "");
        java.lang.String str39 = comment37.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray40 = new com.google.javascript.rhino.head.ast.Comment[] { comment25, comment31, comment37 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet41 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet41, commentArray40);
        astRoot19.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet41);
        boolean boolean44 = astRoot19.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray45 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList46 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList46, symbolArray45);
        astRoot19.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList46);
        com.google.javascript.rhino.head.Node node49 = astRoot19.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode50.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode51);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot19, (com.google.javascript.rhino.head.ast.Scope) scriptNode51);
        com.google.javascript.rhino.head.ast.FunctionNode functionNode54 = scriptNode51.getEnclosingFunction();
        scriptNode51.setEndLineno(6);
        java.lang.Object obj57 = scriptNode51.getCompilerData();
        int int58 = scriptNode51.getRegexpCount();
        com.google.javascript.rhino.head.ast.Scope scope60 = new com.google.javascript.rhino.head.ast.Scope((int) 'a');
        scriptNode14.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode51, (com.google.javascript.rhino.head.Node) scope60);
        astRoot11.setParentScope((com.google.javascript.rhino.head.ast.Scope) scriptNode14);
        org.junit.Assert.assertNotNull(astNodeComparator2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str5, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(astRoot11);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "                                                                                                                                                                                                        " + "'", str39, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(symbolArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(functionNode54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test11518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11518");
        com.google.javascript.rhino.head.Token.CommentType commentType2 = null;
        com.google.javascript.rhino.head.ast.Comment comment4 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType2, "");
        boolean boolean5 = comment4.hasSideEffects();
        int int6 = comment4.getLineno();
        com.google.javascript.rhino.head.Token.CommentType commentType7 = comment4.getCommentType();
        java.lang.String str9 = comment4.toSource((int) (short) 100);
        com.google.javascript.rhino.head.Token.CommentType commentType12 = null;
        com.google.javascript.rhino.head.ast.Comment comment14 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType12, "");
        com.google.javascript.rhino.head.Token.CommentType commentType15 = null;
        comment14.setCommentType(commentType15);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator17 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator18 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator19 = positionComparator17.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int21 = astRoot20.getBaseLineno();
        java.lang.String str22 = astRoot20.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator24 = astRoot23.new NodeIterator();
        int int25 = positionComparator18.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot20, (com.google.javascript.rhino.head.ast.AstNode) astRoot23);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator27 = scriptNode26.spliterator();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator28 = scriptNode26.new NodeIterator();
        astRoot23.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode26);
        int int30 = scriptNode26.getPosition();
        comment4.addChildAfter((com.google.javascript.rhino.head.Node) comment14, (com.google.javascript.rhino.head.Node) scriptNode26);
        int int32 = comment14.getPosition();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(commentType7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                                                                                                                        " + "'", str9, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(astNodeComparator19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str22, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeSpliterator27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test11519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11519");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.google.javascript.rhino.head.ast.AstNode.operatorToString((-856472255));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid operator: -856472255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11520");
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
        com.google.javascript.rhino.head.Token.CommentType commentType29 = null;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment((int) '#', 2, commentType29, "hi!");
        astRoot1.addComment(comment31);
        astRoot1.setEncodedSource("typeof");
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet36 = astRoot35.getComments();
        int int37 = astRoot35.getEndLineno();
        com.google.javascript.rhino.head.Node node39 = astRoot35.setType((int) (short) 10);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot1, (com.google.javascript.rhino.head.ast.Scope) astRoot35);
        astRoot35.clearParentScope();
        boolean boolean42 = astRoot35.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode43.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode44);
        scriptNode44.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap50 = scriptNode49.getSymbolTable();
        scriptNode44.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode49);
        int int52 = scriptNode49.getParamCount();
        int int53 = scriptNode49.getBaseLineno();
        astRoot35.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode49);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet55 = astRoot35.getComments();
        com.google.javascript.rhino.head.ast.AstRoot astRoot56 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator57 = astRoot56.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType60 = null;
        com.google.javascript.rhino.head.ast.Comment comment62 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType60, "");
        boolean boolean63 = comment62.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType66 = null;
        com.google.javascript.rhino.head.ast.Comment comment68 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType66, "");
        boolean boolean69 = comment68.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType72 = null;
        com.google.javascript.rhino.head.ast.Comment comment74 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType72, "");
        java.lang.String str76 = comment74.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray77 = new com.google.javascript.rhino.head.ast.Comment[] { comment62, comment68, comment74 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet78 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet78, commentArray77);
        astRoot56.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet78);
        boolean boolean81 = astRoot56.isInStrictMode();
        int int82 = astRoot56.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot83 = new com.google.javascript.rhino.head.ast.AstRoot();
        boolean boolean84 = astRoot83.hasSideEffects();
        astRoot56.target = astRoot83;
        astRoot83.checkParentLinks();
        com.google.javascript.rhino.head.Node node88 = new com.google.javascript.rhino.head.Node((-552755211), (com.google.javascript.rhino.head.Node) astRoot35, (com.google.javascript.rhino.head.Node) astRoot83, 0);
        astRoot83.flattenSymbolTable(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                                                                                                                                        " + "'", str21, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(commentSet36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(strMap50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(commentSet55);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "                                                                                                                                                                                                        " + "'", str76, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test11521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11521");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode4.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode5);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList7 = scriptNode5.getChildScopes();
        int int8 = scriptNode5.getBaseLineno();
        int int9 = scriptNode5.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode10.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode11);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList13 = scriptNode11.getFunctions();
        scriptNode11.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope16 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode5.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode11, (com.google.javascript.rhino.head.Node) scope16);
        scriptNode11.setEncodedSourceEnd(18);
        com.google.javascript.rhino.head.Node node20 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode11);
        int int21 = scriptNode11.getRegexpCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator23 = astRoot22.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType26, "");
        boolean boolean29 = comment28.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType32 = null;
        com.google.javascript.rhino.head.ast.Comment comment34 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType32, "");
        boolean boolean35 = comment34.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType38 = null;
        com.google.javascript.rhino.head.ast.Comment comment40 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType38, "");
        java.lang.String str42 = comment40.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray43 = new com.google.javascript.rhino.head.ast.Comment[] { comment28, comment34, comment40 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet44 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet44, commentArray43);
        astRoot22.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet44);
        boolean boolean47 = astRoot22.isInStrictMode();
        com.google.javascript.rhino.head.ast.AstNode astNode48 = astRoot22.getParent();
        astRoot22.setEndLineno((int) (short) 0);
        com.google.javascript.rhino.head.ast.AstNode astNode51 = astRoot22.getParent();
        java.lang.String str52 = scriptNode11.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) astRoot22);
        scriptNode11.setBounds(1499437464, (-110742292));
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node(310881041, (com.google.javascript.rhino.head.Node) scriptNode11, 481479666);
        int int58 = scriptNode11.getLineno();
        com.google.javascript.rhino.head.Node node59 = scriptNode11.getLastChild();
        org.junit.Assert.assertNull(scopeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(functionNodeList13);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "                                                                                                                                                                                                        " + "'", str42, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(astNode48);
        org.junit.Assert.assertNull(astNode51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(node59);
    }

    @Test
    public void test11522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11522");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        int int6 = scriptNode1.getEndLineno();
        scriptNode1.setBaseLineno(4);
        int int9 = scriptNode1.getRegexpCount();
        com.google.javascript.rhino.head.ast.Symbol symbol11 = scriptNode1.getSymbol("        ");
        int int12 = scriptNode1.getRegexpCount();
        scriptNode1.setEndLineno(842975161);
        org.junit.Assert.assertNull(scopeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(symbol11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test11523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11523");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString(5, "                                  ");
        java.lang.Object obj5 = node3.getProp((int) (byte) -1);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(1275261773, node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test11524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11524");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope(12, (-777163487));
        com.google.javascript.rhino.head.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scope2.setDefault(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11525");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray1 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList2 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList2, symbolArray1);
        scriptNode0.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList2);
        int int5 = scriptNode0.getEndLineno();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator6 = scriptNode0.new NodeIterator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator7 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator8 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator9 = positionComparator7.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator8);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode11.removeProp(10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot14 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator15 = astRoot14.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor16 = astRoot14.iterator();
        scriptNode11.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot14);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode18.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode19);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList21 = scriptNode19.getChildScopes();
        int int22 = positionComparator8.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot14, (com.google.javascript.rhino.head.ast.AstNode) scriptNode19);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList23 = scriptNode19.getSymbols();
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator26 = astRoot25.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType29 = null;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType29, "");
        boolean boolean32 = comment31.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType35 = null;
        com.google.javascript.rhino.head.ast.Comment comment37 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType35, "");
        boolean boolean38 = comment37.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType41 = null;
        com.google.javascript.rhino.head.ast.Comment comment43 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType41, "");
        java.lang.String str45 = comment43.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray46 = new com.google.javascript.rhino.head.ast.Comment[] { comment31, comment37, comment43 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet47 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet47, commentArray46);
        astRoot25.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet47);
        boolean boolean50 = astRoot25.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray51 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList52 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList52, symbolArray51);
        astRoot25.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList52);
        com.google.javascript.rhino.head.Node node55 = astRoot25.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode56 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode56.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode57);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot25, (com.google.javascript.rhino.head.ast.Scope) scriptNode57);
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node(4, (com.google.javascript.rhino.head.Node) astRoot25, 129);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet62 = astRoot25.getComments();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode64 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode63.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode64);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList66 = scriptNode64.getFunctions();
        scriptNode64.setPosition((int) (byte) 10);
        astRoot25.target = scriptNode64;
        int int70 = scriptNode64.getType();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode19, (com.google.javascript.rhino.head.ast.Scope) scriptNode64);
        scriptNode0.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode64);
        org.junit.Assert.assertNotNull(symbolArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(astNodeComparator9);
        org.junit.Assert.assertNotNull(nodeItor16);
        org.junit.Assert.assertNull(scopeList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(symbolList23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "                                                                                                                                                                                                        " + "'", str45, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(symbolArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(commentSet62);
        org.junit.Assert.assertNotNull(functionNodeList66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 136 + "'", int70 == 136);
    }

    @Test
    public void test11526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11526");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        boolean boolean3 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setRecordingComments(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean9 = compilerEnvirons8.isReservedKeywordAsIdentifier();
        boolean boolean10 = compilerEnvirons8.isReservedKeywordAsIdentifier();
        java.util.Set<java.lang.String> strSet11 = null;
        compilerEnvirons8.setActivationNames(strSet11);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean14 = compilerEnvirons13.isReservedKeywordAsIdentifier();
        boolean boolean15 = compilerEnvirons13.getWarnTrailingComma();
        boolean boolean16 = compilerEnvirons13.isRecordingComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = compilerEnvirons13.getErrorReporter();
        compilerEnvirons8.setErrorReporter(errorReporter17);
        compilerEnvirons0.setErrorReporter(errorReporter17);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((-693490944));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: -693490944");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(errorReporter17);
    }

    @Test
    public void test11527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11527");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(835353046, 204947058);
    }

    @Test
    public void test11528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11528");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode2);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList4 = scriptNode2.getChildScopes();
        int int5 = scriptNode2.getBaseLineno();
        com.google.javascript.rhino.head.Node node6 = scriptNode2.getLastSibling();
        int int7 = scriptNode2.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope10 = new com.google.javascript.rhino.head.ast.Scope(5, (int) '#');
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator12 = astRoot11.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType15 = null;
        com.google.javascript.rhino.head.ast.Comment comment17 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType15, "");
        boolean boolean18 = comment17.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType21 = null;
        com.google.javascript.rhino.head.ast.Comment comment23 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType21, "");
        boolean boolean24 = comment23.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType27 = null;
        com.google.javascript.rhino.head.ast.Comment comment29 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType27, "");
        java.lang.String str31 = comment29.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray32 = new com.google.javascript.rhino.head.ast.Comment[] { comment17, comment23, comment29 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet33 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet33, commentArray32);
        astRoot11.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet33);
        boolean boolean36 = astRoot11.isInStrictMode();
        com.google.javascript.rhino.head.ast.AstNode astNode37 = astRoot11.getParent();
        astRoot11.setEndLineno((int) (short) 0);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode2, (com.google.javascript.rhino.head.Node) scope10, (com.google.javascript.rhino.head.Node) astRoot11, 6);
        astRoot11.setLineno((int) '#');
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList44 = astRoot11.getFunctions();
        int int45 = astRoot11.getLineno();
        int int46 = astRoot11.getLineno();
        org.junit.Assert.assertNull(scopeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "                                                                                                                                                                                                        " + "'", str31, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(astNode37);
        org.junit.Assert.assertNotNull(functionNodeList44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 35 + "'", int46 == 35);
    }

    @Test
    public void test11529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11529");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean11 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean12 = compilerEnvirons0.isGenerateObserverCount();
        int int13 = compilerEnvirons0.getLanguageVersion();
        boolean boolean14 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 170 + "'", int13 == 170);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test11530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11530");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope((-704784932), (-1728226312));
        // The following exception was thrown during execution in test generation
        try {
            double double3 = scope2.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.Scope cannot be cast to com.google.javascript.rhino.head.ast.NumberLiteral");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11531");
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
        astRoot28.setLength((-451814955));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode34.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode35);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray38 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList39 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList39, symbolArray38);
        scriptNode37.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList39);
        scriptNode34.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList39);
        int int43 = scriptNode34.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode44.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode45);
        scriptNode45.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap51 = scriptNode50.getSymbolTable();
        scriptNode45.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode50);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode53.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode54);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList56 = scriptNode54.getChildScopes();
        int int57 = scriptNode54.getBaseLineno();
        com.google.javascript.rhino.head.Node node58 = scriptNode54.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode59.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode60);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList62 = scriptNode60.getChildScopes();
        java.lang.String str64 = scriptNode60.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode54.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode60, (com.google.javascript.rhino.head.Node) scriptNode66);
        scriptNode45.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode54);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap69 = null;
        scriptNode54.setSymbolTable(strMap69);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap71 = scriptNode54.getSymbolTable();
        com.google.javascript.rhino.head.ast.Scope scope73 = new com.google.javascript.rhino.head.ast.Scope(1);
        int int74 = scriptNode54.compareTo((com.google.javascript.rhino.head.ast.AstNode) scope73);
        boolean boolean75 = scope73.hasSideEffects();
        com.google.javascript.rhino.head.Node node77 = new com.google.javascript.rhino.head.Node(520206471, (com.google.javascript.rhino.head.Node) astRoot28, (com.google.javascript.rhino.head.Node) scriptNode34, (com.google.javascript.rhino.head.Node) scope73, 51850316);
        // The following exception was thrown during execution in test generation
        try {
            int int78 = scope73.labelId();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                                                                                                                                        " + "'", str21, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(symbolArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(strMap51);
        org.junit.Assert.assertNull(scopeList56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(scopeList62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNull(strMap71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test11532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11532");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode1 = scriptNode0.getEnclosingFunction();
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator3 = astRoot2.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType6 = null;
        com.google.javascript.rhino.head.ast.Comment comment8 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType6, "");
        boolean boolean9 = comment8.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType12 = null;
        com.google.javascript.rhino.head.ast.Comment comment14 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType12, "");
        boolean boolean15 = comment14.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType18 = null;
        com.google.javascript.rhino.head.ast.Comment comment20 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType18, "");
        java.lang.String str22 = comment20.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray23 = new com.google.javascript.rhino.head.ast.Comment[] { comment8, comment14, comment20 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet24 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet24, commentArray23);
        astRoot2.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet24);
        boolean boolean27 = astRoot2.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray28 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList29 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList29, symbolArray28);
        astRoot2.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList29);
        int int32 = astRoot2.getBaseLineno();
        com.google.javascript.rhino.head.ast.Comment comment33 = astRoot2.getJsDocNode();
        astRoot2.setInStrictMode(false);
        scriptNode0.addChildScope((com.google.javascript.rhino.head.ast.Scope) astRoot2);
        int int37 = astRoot2.getType();
        astRoot2.setBaseLineno(1275261773);
        astRoot2.setInStrictMode(false);
        org.junit.Assert.assertNull(functionNode1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                                                                                                                                                        " + "'", str22, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(symbolArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(comment33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 136 + "'", int37 == 136);
    }

    @Test
    public void test11533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11533");
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
        java.lang.Object obj10 = astRoot3.getCompilerData();
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = astRoot3.getAstRoot();
        com.google.javascript.rhino.head.ast.Scope scope12 = null;
        // The following exception was thrown during execution in test generation
        try {
            astRoot3.setScope(scope12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(astNodeComparator2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str5, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(astRoot11);
    }

    @Test
    public void test11534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11534");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        int int9 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean10 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        boolean boolean13 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setXmlAvailable(true);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        int int18 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean19 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setStrictMode(false);
        boolean boolean22 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(errorReporter6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test11535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11535");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator3 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator4 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator5 = positionComparator3.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator4);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator6 = astNodeComparator2.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator3);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator7 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator8 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator9 = positionComparator7.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator8);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator10 = positionComparator7.reversed();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator11 = astNodeComparator6.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator7);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator12 = astNodeComparator6.reversed();
        org.junit.Assert.assertNotNull(astNodeComparator2);
        org.junit.Assert.assertNotNull(astNodeComparator5);
        org.junit.Assert.assertNotNull(astNodeComparator6);
        org.junit.Assert.assertNotNull(astNodeComparator9);
        org.junit.Assert.assertNotNull(astNodeComparator10);
        org.junit.Assert.assertNotNull(astNodeComparator11);
        org.junit.Assert.assertNotNull(astNodeComparator12);
    }

    @Test
    public void test11536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11536");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator1 = scriptNode0.spliterator();
        com.google.javascript.rhino.head.Node node3 = scriptNode0.setType((int) '#');
        java.lang.Object obj4 = scriptNode0.getCompilerData();
        com.google.javascript.rhino.head.ast.Symbol symbol6 = scriptNode0.getSymbol("typeof");
        scriptNode0.setEncodedSource("{\n}\n");
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
        int int35 = astRoot9.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot36 = new com.google.javascript.rhino.head.ast.AstRoot();
        boolean boolean37 = astRoot36.hasSideEffects();
        astRoot9.target = astRoot36;
        scriptNode0.setParentScope((com.google.javascript.rhino.head.ast.Scope) astRoot36);
        astRoot36.flattenSymbolTable(true);
        int int42 = astRoot36.getParamAndVarCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap45 = null;
        scriptNode44.setSymbolTable(strMap45);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList47 = scriptNode44.getSymbols();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator48 = scriptNode44.new NodeIterator();
        astRoot36.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode44);
        // The following exception was thrown during execution in test generation
        try {
            astRoot36.setBaseLineno((-1178528397));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeSpliterator1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(symbol6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "                                                                                                                                                                                                        " + "'", str29, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(symbolList47);
    }

    @Test
    public void test11537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11537");
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
        boolean boolean33 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons11);
        org.junit.Assert.assertNotNull(compilerEnvirons14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(strSet19);
        org.junit.Assert.assertNotNull(errorReporter20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(errorReporter30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test11538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11538");
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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode15.flattenSymbolTable(true);
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet19 = astRoot18.getComments();
        int int20 = astRoot18.getEndLineno();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor21 = null;
        astRoot18.visitComments(nodeVisitor21);
        com.google.javascript.rhino.head.Node node23 = astRoot18.getFirstChild();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet24 = astRoot18.getComments();
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(18, (com.google.javascript.rhino.head.Node) scriptNode15, (com.google.javascript.rhino.head.Node) astRoot18);
        int int26 = scriptNode15.getLength();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons27, errorReporter28);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode30.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode31);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList33 = scriptNode31.getFunctions();
        scriptNode31.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.Node node36 = iRFactory29.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode31);
        java.lang.String str37 = scriptNode31.getSourceName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode38.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode39);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList41 = scriptNode39.getChildScopes();
        int int42 = scriptNode39.getBaseLineno();
        com.google.javascript.rhino.head.Node node43 = scriptNode39.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode44.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode45);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList47 = scriptNode45.getChildScopes();
        java.lang.String str49 = scriptNode45.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode39.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode45, (com.google.javascript.rhino.head.Node) scriptNode51);
        java.lang.Object obj54 = scriptNode45.getProp((int) (short) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode55 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str57 = scriptNode55.toSource((int) '4');
        java.lang.String str58 = scriptNode45.toStringTree(scriptNode55);
        scriptNode31.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode45);
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node(170, (com.google.javascript.rhino.head.Node) scriptNode15, (com.google.javascript.rhino.head.Node) scriptNode45);
        astRoot5.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode45);
        java.lang.String str62 = astRoot5.getNextTempName();
        // The following exception was thrown during execution in test generation
        try {
            double double63 = astRoot5.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.AstRoot cannot be cast to com.google.javascript.rhino.head.ast.NumberLiteral");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(symbolArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(commentSet19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(commentSet24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(functionNodeList33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(scopeList41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(scopeList47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "                                                                                                        {\n                                                                                                        }\n" + "'", str57, "                                                                                                        {\n                                                                                                        }\n");
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "$0" + "'", str62, "$0");
    }

    @Test
    public void test11539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11539");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean16 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setAllowSharpComments(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test11540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11540");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        int int6 = scriptNode1.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = scriptNode1.new NodeIterator();
        boolean boolean8 = nodeIterator7.hasNext();
        boolean boolean9 = nodeIterator7.hasNext();
        boolean boolean10 = nodeIterator7.hasNext();
        boolean boolean11 = nodeIterator7.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            nodeIterator7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: next() has not been called");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scopeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11541");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType3, "");
        com.google.javascript.rhino.head.Token.CommentType commentType6 = comment5.getCommentType();
        com.google.javascript.rhino.head.Token.CommentType commentType9 = null;
        com.google.javascript.rhino.head.ast.Comment comment11 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType9, "");
        boolean boolean12 = comment11.hasSideEffects();
        int int13 = comment11.getLineno();
        com.google.javascript.rhino.head.Node node15 = comment11.setType(18);
        comment11.removeChildren();
        com.google.javascript.rhino.head.Token.CommentType commentType19 = null;
        com.google.javascript.rhino.head.ast.Comment comment21 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType19, "");
        boolean boolean22 = comment21.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType23 = null;
        comment21.setCommentType(commentType23);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator26 = scriptNode25.spliterator();
        com.google.javascript.rhino.head.Token.CommentType commentType29 = null;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType29, "");
        java.lang.String str33 = comment31.toSource(100);
        java.lang.String str34 = comment31.getValue();
        scriptNode25.setParent((com.google.javascript.rhino.head.ast.AstNode) comment31);
        com.google.javascript.rhino.head.ast.Comment[] commentArray36 = new com.google.javascript.rhino.head.ast.Comment[] { comment5, comment11, comment21, comment31 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet37 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet37, commentArray36);
        astRoot0.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet37);
        astRoot0.setEncodedSourceStart((-603115504));
        int int42 = astRoot0.getFunctionCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node43 = astRoot0.getDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commentType6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "                                                                                                                                                                                                        " + "'", str33, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(commentArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test11542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11542");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode2);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList4 = scriptNode2.getChildScopes();
        int int5 = scriptNode2.getBaseLineno();
        com.google.javascript.rhino.head.Node node6 = scriptNode2.getLastSibling();
        int int7 = scriptNode2.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator8 = scriptNode2.new NodeIterator();
        int int9 = scriptNode2.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope10 = scriptNode2.getParentScope();
        scriptNode2.removeProp(65536);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode13.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode14);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList16 = scriptNode14.getChildScopes();
        int int17 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.Node node18 = scriptNode14.getLastSibling();
        int int19 = scriptNode14.getEndLineno();
        scriptNode14.setBaseLineno(4);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet23 = astRoot22.getComments();
        int int24 = astRoot22.getEndLineno();
        com.google.javascript.rhino.head.Node node26 = astRoot22.setType((int) (short) 10);
        astRoot22.putIntProp(24, (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator34 = scriptNode33.spliterator();
        com.google.javascript.rhino.head.Token.CommentType commentType37 = null;
        com.google.javascript.rhino.head.ast.Comment comment39 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType37, "");
        java.lang.String str41 = comment39.toSource(100);
        java.lang.String str42 = comment39.getValue();
        scriptNode33.setParent((com.google.javascript.rhino.head.ast.AstNode) comment39);
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
        boolean boolean69 = astRoot44.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray70 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList71 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList71, symbolArray70);
        astRoot44.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList71);
        com.google.javascript.rhino.head.Node node74 = astRoot44.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode75 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode76 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode75.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode76);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot44, (com.google.javascript.rhino.head.ast.Scope) scriptNode76);
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node(16, (com.google.javascript.rhino.head.Node) scriptNode32, (com.google.javascript.rhino.head.Node) comment39, (com.google.javascript.rhino.head.Node) scriptNode76);
        astRoot22.addComment(comment39);
        scriptNode14.addChildrenToFront((com.google.javascript.rhino.head.Node) astRoot22);
        com.google.javascript.rhino.head.Token.CommentType commentType84 = null;
        com.google.javascript.rhino.head.ast.Comment comment86 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType84, "");
        com.google.javascript.rhino.head.Token.CommentType commentType87 = comment86.getCommentType();
        java.lang.String str89 = comment86.toSource(21);
        java.lang.String str90 = comment86.getValue();
        com.google.javascript.rhino.head.Node node92 = new com.google.javascript.rhino.head.Node(15, (com.google.javascript.rhino.head.Node) scriptNode2, (com.google.javascript.rhino.head.Node) astRoot22, (com.google.javascript.rhino.head.Node) comment86, 6);
        java.lang.String str94 = comment86.toSource(170);
        java.lang.String str96 = comment86.toSource((-476424842));
        java.lang.String str98 = comment86.toSource(19);
        java.lang.String str99 = comment86.getValue();
        org.junit.Assert.assertNull(scopeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(scopeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(commentSet23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeSpliterator34);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "                                                                                                                                                                                                        " + "'", str41, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "                                                                                                                                                                                                        " + "'", str64, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(symbolArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNull(commentType87);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "                                          " + "'", str89, "                                          ");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                    " + "'", str94, "                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "                                      " + "'", str98, "                                      ");
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "" + "'", str99, "");
    }

    @Test
    public void test11543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11543");
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType3, "");
        com.google.javascript.rhino.head.Token.CommentType commentType6 = comment5.getCommentType();
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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode21.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode22);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList24 = scriptNode22.getChildScopes();
        int int25 = scriptNode22.getBaseLineno();
        com.google.javascript.rhino.head.Node node26 = scriptNode22.getLastSibling();
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = scriptNode22.getAstRoot();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode8, (com.google.javascript.rhino.head.ast.Scope) scriptNode22);
        comment5.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode8);
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node(15, (com.google.javascript.rhino.head.Node) scriptNode8);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode31.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode32);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList34 = scriptNode32.getFunctions();
        scriptNode32.setPosition((int) (byte) 10);
        int int37 = scriptNode32.getEncodedSourceEnd();
        java.lang.String str38 = scriptNode8.toStringTree(scriptNode32);
        java.lang.String str40 = scriptNode8.toSource(11);
        boolean boolean41 = scriptNode8.hasChildren();
        org.junit.Assert.assertNull(commentType6);
        org.junit.Assert.assertNull(scopeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(functionNodeList16);
        org.junit.Assert.assertNull(scopeList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(astRoot27);
        org.junit.Assert.assertNotNull(functionNodeList34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "                      {\n                      }\n" + "'", str40, "                      {\n                      }\n");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test11544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11544");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) 717018487);
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test11545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11545");
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
        java.lang.String str25 = astRoot0.getEncodedSource();
        boolean boolean26 = astRoot0.isInStrictMode();
        astRoot0.setPosition((-3137945));
        int int29 = astRoot0.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator30 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator31 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator32 = positionComparator30.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator31);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator33 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator34 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator35 = positionComparator33.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator34);
        com.google.javascript.rhino.head.ast.AstRoot astRoot36 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int37 = astRoot36.getBaseLineno();
        java.lang.String str38 = astRoot36.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot39 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator40 = astRoot39.new NodeIterator();
        int int41 = positionComparator34.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot36, (com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator42 = positionComparator30.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator34);
        com.google.javascript.rhino.head.Token.CommentType commentType45 = null;
        com.google.javascript.rhino.head.ast.Comment comment47 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType45, "");
        java.lang.String str49 = comment47.toSource(100);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor50 = comment47.iterator();
        com.google.javascript.rhino.head.Token.CommentType commentType51 = null;
        comment47.setCommentType(commentType51);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator53 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator54 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator55 = positionComparator53.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator54);
        com.google.javascript.rhino.head.ast.AstRoot astRoot56 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int57 = astRoot56.getBaseLineno();
        java.lang.String str58 = astRoot56.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot59 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator60 = astRoot59.new NodeIterator();
        int int61 = positionComparator54.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot56, (com.google.javascript.rhino.head.ast.AstNode) astRoot59);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode62 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode62.putIntProp((int) (short) 1, 1);
        java.lang.String str66 = scriptNode62.getEncodedSource();
        com.google.javascript.rhino.head.ast.Scope scope67 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator68 = scope67.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode69 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode70 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode69.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode70);
        scope67.setTop(scriptNode70);
        scope67.setLineno((int) (short) -1);
        int int75 = positionComparator54.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode62, (com.google.javascript.rhino.head.ast.AstNode) scope67);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode76 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode77 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode76.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode77);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList79 = scriptNode77.getChildScopes();
        int int80 = scriptNode77.getBaseLineno();
        int int81 = scriptNode77.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode82 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode83 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode82.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode83);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList85 = scriptNode83.getFunctions();
        scriptNode83.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope88 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode77.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode83, (com.google.javascript.rhino.head.Node) scope88);
        scriptNode83.setEncodedSource("-1\tSCRIPT -1 1\n");
        java.lang.String str92 = scriptNode62.toStringTree(scriptNode83);
        int int93 = positionComparator34.compare((com.google.javascript.rhino.head.ast.AstNode) comment47, (com.google.javascript.rhino.head.ast.AstNode) scriptNode62);
        boolean boolean94 = scriptNode62.hasSideEffects();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot0, (com.google.javascript.rhino.head.ast.Scope) scriptNode62);
        scriptNode62.setEncodedSource("2;\nSCRIPT;\n2;\n1;\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                                                                                                                        " + "'", str20, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(astNodeComparator32);
        org.junit.Assert.assertNotNull(astNodeComparator35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str38, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(astNodeComparator42);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "                                                                                                                                                                                                        " + "'", str49, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(nodeItor50);
        org.junit.Assert.assertNotNull(astNodeComparator55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str58, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(nodeSpliterator68);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNull(scopeList79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(functionNodeList85);
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 2 + "'", int93 == 2);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test11546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11546");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType3, "");
        com.google.javascript.rhino.head.Token.CommentType commentType6 = comment5.getCommentType();
        com.google.javascript.rhino.head.Token.CommentType commentType9 = null;
        com.google.javascript.rhino.head.ast.Comment comment11 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType9, "");
        boolean boolean12 = comment11.hasSideEffects();
        int int13 = comment11.getLineno();
        com.google.javascript.rhino.head.Node node15 = comment11.setType(18);
        comment11.removeChildren();
        com.google.javascript.rhino.head.Token.CommentType commentType19 = null;
        com.google.javascript.rhino.head.ast.Comment comment21 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType19, "");
        boolean boolean22 = comment21.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType23 = null;
        comment21.setCommentType(commentType23);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator26 = scriptNode25.spliterator();
        com.google.javascript.rhino.head.Token.CommentType commentType29 = null;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType29, "");
        java.lang.String str33 = comment31.toSource(100);
        java.lang.String str34 = comment31.getValue();
        scriptNode25.setParent((com.google.javascript.rhino.head.ast.AstNode) comment31);
        com.google.javascript.rhino.head.ast.Comment[] commentArray36 = new com.google.javascript.rhino.head.ast.Comment[] { comment5, comment11, comment21, comment31 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet37 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet37, commentArray36);
        astRoot0.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet37);
        astRoot0.setEncodedSourceStart((-603115504));
        astRoot0.removeChildren();
        java.lang.String str44 = astRoot0.toSource(161);
        com.google.javascript.rhino.head.ast.Comment comment45 = astRoot0.getJsDocNode();
        java.lang.Object obj47 = astRoot0.getProp((-509521098));
        org.junit.Assert.assertNull(commentType6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "                                                                                                                                                                                                        " + "'", str33, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(commentArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(comment45);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test11547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11547");
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
        java.lang.String str15 = scriptNode9.getNextTempName();
        org.junit.Assert.assertNull(scopeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(functionNodeList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$0" + "'", str15, "$0");
    }

    @Test
    public void test11548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11548");
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
        int int10 = astRoot5.getEndLineno();
        org.junit.Assert.assertNotNull(symbolArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test11549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11549");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode0.toSource((int) '4');
        com.google.javascript.rhino.head.Node node3 = scriptNode0.getFirstChild();
        java.lang.Object obj5 = scriptNode0.getProp(18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode6.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode7);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList9 = scriptNode7.getChildScopes();
        int int10 = scriptNode7.getBaseLineno();
        com.google.javascript.rhino.head.Node node11 = scriptNode7.getLastSibling();
        scriptNode7.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode14.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode15);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList17 = scriptNode15.getFunctions();
        scriptNode15.setPosition((int) (byte) 10);
        java.lang.String str20 = scriptNode7.toStringTree(scriptNode15);
        int int21 = scriptNode7.getBaseLineno();
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet24 = astRoot23.getComments();
        com.google.javascript.rhino.head.ast.Symbol symbol26 = astRoot23.getSymbol("                                                                                                                                                                                                        ");
        com.google.javascript.rhino.head.Token.CommentType commentType29 = null;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment(16, (int) (byte) 0, commentType29, "hi!");
        astRoot23.addChildrenToFront((com.google.javascript.rhino.head.Node) comment31);
        boolean boolean33 = astRoot23.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode34.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode35);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList37 = scriptNode35.getChildScopes();
        int int38 = scriptNode35.getBaseLineno();
        int int39 = scriptNode35.getParamCount();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList40 = scriptNode35.getSymbols();
        int int41 = scriptNode35.getPosition();
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator43 = astRoot42.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType46 = null;
        com.google.javascript.rhino.head.ast.Comment comment48 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType46, "");
        boolean boolean49 = comment48.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType52 = null;
        com.google.javascript.rhino.head.ast.Comment comment54 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType52, "");
        boolean boolean55 = comment54.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType58 = null;
        com.google.javascript.rhino.head.ast.Comment comment60 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType58, "");
        java.lang.String str62 = comment60.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray63 = new com.google.javascript.rhino.head.ast.Comment[] { comment48, comment54, comment60 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet64 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet64, commentArray63);
        astRoot42.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet64);
        boolean boolean67 = astRoot42.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray68 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList69 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList69, symbolArray68);
        astRoot42.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList69);
        com.google.javascript.rhino.head.Node node72 = astRoot42.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode73 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode74 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode73.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode74);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot42, (com.google.javascript.rhino.head.ast.Scope) scriptNode74);
        com.google.javascript.rhino.head.Node node78 = new com.google.javascript.rhino.head.Node(19, (com.google.javascript.rhino.head.Node) astRoot23, (com.google.javascript.rhino.head.Node) scriptNode35, (com.google.javascript.rhino.head.Node) astRoot42, (int) (byte) 1);
        scriptNode7.setParentScope((com.google.javascript.rhino.head.ast.Scope) astRoot42);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode0, (com.google.javascript.rhino.head.ast.Scope) astRoot42);
        int int81 = astRoot42.getRegexpCount();
        java.lang.Object obj83 = astRoot42.getProp(36);
        astRoot42.setBounds((-929928321), (-704784932));
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList87 = astRoot42.getChildScopes();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor88 = null;
        // The following exception was thrown during execution in test generation
        try {
            astRoot42.visit(nodeVisitor88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        {\n                                                                                                        }\n" + "'", str2, "                                                                                                        {\n                                                                                                        }\n");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(scopeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(functionNodeList17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(commentSet24);
        org.junit.Assert.assertNull(symbol26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(scopeList37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(symbolList40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "                                                                                                                                                                                                        " + "'", str62, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(symbolArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNull(scopeList87);
    }

    @Test
    public void test11550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11550");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compilerEnvirons0.getErrorReporter();
        boolean boolean7 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(errorReporter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test11551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11551");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        scriptNode1.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode6);
        scriptNode6.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode10.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode11);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList13 = scriptNode11.getChildScopes();
        int int14 = scriptNode11.getBaseLineno();
        com.google.javascript.rhino.head.Node node15 = scriptNode11.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode16.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList19 = scriptNode17.getChildScopes();
        java.lang.String str21 = scriptNode17.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode11.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode17, (com.google.javascript.rhino.head.Node) scriptNode23);
        int int25 = scriptNode17.getType();
        scriptNode6.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode27.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode28);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList30 = scriptNode28.getChildScopes();
        int int31 = scriptNode28.getBaseLineno();
        com.google.javascript.rhino.head.Node node32 = scriptNode28.getLastSibling();
        scriptNode28.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode35.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode36);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList38 = scriptNode36.getFunctions();
        scriptNode36.setPosition((int) (byte) 10);
        java.lang.String str41 = scriptNode28.toStringTree(scriptNode36);
        int int42 = scriptNode28.getBaseLineno();
        scriptNode28.setEncodedSourceStart((int) '4');
        scriptNode17.addChildrenToFront((com.google.javascript.rhino.head.Node) scriptNode28);
        scriptNode1.setCompilerData((java.lang.Object) scriptNode28);
        java.lang.String str47 = scriptNode1.getJsDoc();
        java.lang.Object obj49 = scriptNode1.getProp((-748307395));
        java.lang.String str50 = scriptNode1.getSourceName();
        // The following exception was thrown during execution in test generation
        try {
            scriptNode1.resetTargets();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scopeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(scopeList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 136 + "'", int25 == 136);
        org.junit.Assert.assertNull(scopeList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(functionNodeList38);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test11552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11552");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        boolean boolean3 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setIdeMode(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test11553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11553");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        boolean boolean6 = compilerEnvirons0.isRecordingComments();
        boolean boolean7 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setStrictMode(true);
        int int10 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean13 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test11554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11554");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int2 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setLanguageVersion((int) (byte) 100);
        boolean boolean5 = compilerEnvirons0.isXmlAvailable();
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean7 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setGenerateObserverCount(true);
        int int10 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 170 + "'", int2 == 170);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test11555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11555");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope(129, (-587993997));
    }

    @Test
    public void test11556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11556");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int4 = astRoot3.getBaseLineno();
        java.lang.String str5 = astRoot3.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = astRoot6.new NodeIterator();
        int int8 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot3, (com.google.javascript.rhino.head.ast.AstNode) astRoot6);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator9 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator10 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator11 = positionComparator9.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator10);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator12 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator13 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator14 = positionComparator12.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator13);
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int16 = astRoot15.getBaseLineno();
        java.lang.String str17 = astRoot15.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator19 = astRoot18.new NodeIterator();
        int int20 = positionComparator13.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot15, (com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator21 = positionComparator9.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator13);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator22 = positionComparator1.thenComparing(astNodeComparator21);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator23 = astNodeComparator21.reversed();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator24 = astNodeComparator21.reversed();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator25 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator26 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator27 = positionComparator25.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator26);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int29 = astRoot28.getBaseLineno();
        java.lang.String str30 = astRoot28.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator32 = astRoot31.new NodeIterator();
        int int33 = positionComparator26.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot28, (com.google.javascript.rhino.head.ast.AstNode) astRoot31);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode34.putIntProp((int) (short) 1, 1);
        java.lang.String str38 = scriptNode34.getEncodedSource();
        com.google.javascript.rhino.head.ast.Scope scope39 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator40 = scope39.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode41.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode42);
        scope39.setTop(scriptNode42);
        scope39.setLineno((int) (short) -1);
        int int47 = positionComparator26.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode34, (com.google.javascript.rhino.head.ast.AstNode) scope39);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator48 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator49 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator50 = positionComparator48.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator49);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator51 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator52 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator53 = positionComparator51.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator52);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator54 = astNodeComparator50.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator51);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator55 = astNodeComparator54.reversed();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator56 = positionComparator26.thenComparing(astNodeComparator54);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator57 = astNodeComparator24.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator26);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator58 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator59 = positionComparator58.reversed();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator60 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator61 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator62 = positionComparator60.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator61);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator63 = positionComparator58.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator60);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator64 = astNodeComparator63.reversed();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator65 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator66 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator67 = positionComparator65.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator66);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator68 = astNodeComparator67.reversed();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator69 = astNodeComparator68.reversed();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator70 = astNodeComparator64.thenComparing(astNodeComparator69);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator71 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator72 = positionComparator71.reversed();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator73 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator74 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator75 = positionComparator73.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator74);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator76 = positionComparator71.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator73);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator77 = astNodeComparator70.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator73);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator78 = astNodeComparator77.reversed();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator79 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator80 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator81 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator82 = positionComparator80.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator81);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator83 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator84 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator85 = positionComparator83.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator84);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator86 = astNodeComparator82.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator83);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator87 = positionComparator79.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator83);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator88 = astNodeComparator77.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator83);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator89 = astNodeComparator24.thenComparing(astNodeComparator77);
        org.junit.Assert.assertNotNull(astNodeComparator2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str5, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(astNodeComparator11);
        org.junit.Assert.assertNotNull(astNodeComparator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str17, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(astNodeComparator21);
        org.junit.Assert.assertNotNull(astNodeComparator22);
        org.junit.Assert.assertNotNull(astNodeComparator23);
        org.junit.Assert.assertNotNull(astNodeComparator24);
        org.junit.Assert.assertNotNull(astNodeComparator27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str30, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(nodeSpliterator40);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(astNodeComparator50);
        org.junit.Assert.assertNotNull(astNodeComparator53);
        org.junit.Assert.assertNotNull(astNodeComparator54);
        org.junit.Assert.assertNotNull(astNodeComparator55);
        org.junit.Assert.assertNotNull(astNodeComparator56);
        org.junit.Assert.assertNotNull(astNodeComparator57);
        org.junit.Assert.assertNotNull(astNodeComparator59);
        org.junit.Assert.assertNotNull(astNodeComparator62);
        org.junit.Assert.assertNotNull(astNodeComparator63);
        org.junit.Assert.assertNotNull(astNodeComparator64);
        org.junit.Assert.assertNotNull(astNodeComparator67);
        org.junit.Assert.assertNotNull(astNodeComparator68);
        org.junit.Assert.assertNotNull(astNodeComparator69);
        org.junit.Assert.assertNotNull(astNodeComparator70);
        org.junit.Assert.assertNotNull(astNodeComparator72);
        org.junit.Assert.assertNotNull(astNodeComparator75);
        org.junit.Assert.assertNotNull(astNodeComparator76);
        org.junit.Assert.assertNotNull(astNodeComparator77);
        org.junit.Assert.assertNotNull(astNodeComparator78);
        org.junit.Assert.assertNotNull(astNodeComparator82);
        org.junit.Assert.assertNotNull(astNodeComparator85);
        org.junit.Assert.assertNotNull(astNodeComparator86);
        org.junit.Assert.assertNotNull(astNodeComparator87);
        org.junit.Assert.assertNotNull(astNodeComparator88);
        org.junit.Assert.assertNotNull(astNodeComparator89);
    }

    @Test
    public void test11557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11557");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        scriptNode1.clearParentScope();
        java.lang.String str5 = scriptNode1.getSourceName();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newNumber((double) 100L);
        com.google.javascript.rhino.head.Token.CommentType commentType10 = null;
        com.google.javascript.rhino.head.ast.Comment comment12 = new com.google.javascript.rhino.head.ast.Comment(842975161, 26, commentType10, "                                                                hi!");
        node7.setJsDocNode(comment12);
        com.google.javascript.rhino.head.Token.CommentType commentType16 = null;
        com.google.javascript.rhino.head.ast.Comment comment18 = new com.google.javascript.rhino.head.ast.Comment((int) '#', 2, commentType16, "hi!");
        com.google.javascript.rhino.head.Token.CommentType commentType19 = null;
        comment18.setCommentType(commentType19);
        int int23 = comment18.getIntProp((int) (byte) 10, 0);
        comment18.setPosition(161);
        java.lang.String str27 = comment18.toSource((-325419474));
        scriptNode1.addChildAfter(node7, (com.google.javascript.rhino.head.Node) comment18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode30 = scriptNode29.getEnclosingFunction();
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator32 = astRoot31.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType35 = null;
        com.google.javascript.rhino.head.ast.Comment comment37 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType35, "");
        boolean boolean38 = comment37.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType41 = null;
        com.google.javascript.rhino.head.ast.Comment comment43 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType41, "");
        boolean boolean44 = comment43.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType47 = null;
        com.google.javascript.rhino.head.ast.Comment comment49 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType47, "");
        java.lang.String str51 = comment49.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray52 = new com.google.javascript.rhino.head.ast.Comment[] { comment37, comment43, comment49 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet53 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet53, commentArray52);
        astRoot31.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet53);
        boolean boolean56 = astRoot31.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray57 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList58 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList58, symbolArray57);
        astRoot31.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList58);
        int int61 = astRoot31.getBaseLineno();
        com.google.javascript.rhino.head.ast.Comment comment62 = astRoot31.getJsDocNode();
        astRoot31.setInStrictMode(false);
        scriptNode29.addChildScope((com.google.javascript.rhino.head.ast.Scope) astRoot31);
        int int66 = astRoot31.getType();
        java.lang.String str67 = node7.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) astRoot31);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet68 = astRoot31.getComments();
        org.junit.Assert.assertNull(scopeList3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(functionNode30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "                                                                                                                                                                                                        " + "'", str51, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(symbolArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(comment62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 136 + "'", int66 == 136);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(commentSet68);
    }

    @Test
    public void test11558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11558");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode2.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode3);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList5 = scriptNode3.getChildScopes();
        int int6 = scriptNode3.getBaseLineno();
        com.google.javascript.rhino.head.Node node7 = scriptNode3.getLastSibling();
        int int8 = scriptNode3.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator9 = scriptNode3.new NodeIterator();
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
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(9, (com.google.javascript.rhino.head.Node) scriptNode3, node27);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int31 = astRoot30.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        java.lang.Object obj35 = scriptNode34.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode36.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode37);
        int int39 = scriptNode36.getEndLineno();
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node(170, (com.google.javascript.rhino.head.Node) scriptNode34, (com.google.javascript.rhino.head.Node) scriptNode36);
        com.google.javascript.rhino.head.ast.Scope scope42 = new com.google.javascript.rhino.head.ast.Scope(16);
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((int) 'a', (com.google.javascript.rhino.head.Node) astRoot30, node40, (com.google.javascript.rhino.head.Node) scope42);
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node(644758030, (com.google.javascript.rhino.head.Node) scriptNode3, node40);
        boolean boolean45 = scriptNode3.hasChildren();
        scriptNode3.setPosition(0);
        org.junit.Assert.assertNull(scopeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(scopeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionNodeList21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test11559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11559");
        com.google.javascript.rhino.head.Token.CommentType commentType2 = null;
        com.google.javascript.rhino.head.ast.Comment comment4 = new com.google.javascript.rhino.head.ast.Comment(0, 11, commentType2, "  ");
        com.google.javascript.rhino.head.Token.CommentType commentType5 = comment4.getCommentType();
        com.google.javascript.rhino.head.Token.CommentType commentType6 = comment4.getCommentType();
        java.lang.String str8 = comment4.makeIndent((-75393689));
        org.junit.Assert.assertNull(commentType5);
        org.junit.Assert.assertNull(commentType6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test11560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11560");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode1.removeProp(10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator5 = astRoot4.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor6 = astRoot4.iterator();
        scriptNode1.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot4);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap8 = scriptNode1.getSymbolTable();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean10 = compilerEnvirons9.isReservedKeywordAsIdentifier();
        boolean boolean11 = compilerEnvirons9.isIdeMode();
        compilerEnvirons9.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray20 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        compilerEnvirons14.setActivationNames((java.util.Set<java.lang.String>) strSet21);
        boolean boolean24 = compilerEnvirons14.isGenerateDebugInfo();
        compilerEnvirons14.setOptimizationLevel((int) (short) 1);
        compilerEnvirons14.setAllowSharpComments(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = compilerEnvirons14.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons9, errorReporter29);
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int32 = astRoot31.getParamCount();
        int int33 = astRoot31.getPosition();
        com.google.javascript.rhino.head.Node node34 = astRoot31.target;
        com.google.javascript.rhino.head.Node node35 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
        scriptNode1.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot31);
        int int37 = scriptNode1.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode38.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode39);
        scriptNode39.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap45 = scriptNode44.getSymbolTable();
        scriptNode39.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode44);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode47.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode48);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList50 = scriptNode48.getChildScopes();
        int int51 = scriptNode48.getBaseLineno();
        com.google.javascript.rhino.head.Node node52 = scriptNode48.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode53.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode54);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList56 = scriptNode54.getChildScopes();
        java.lang.String str58 = scriptNode54.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode48.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode54, (com.google.javascript.rhino.head.Node) scriptNode60);
        scriptNode39.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode48);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList63 = scriptNode39.getSymbols();
        scriptNode1.setSymbols(symbolList63);
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor65 = null;
        // The following exception was thrown during execution in test generation
        try {
            scriptNode1.visit(nodeVisitor65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeItor6);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(compilerEnvirons9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(errorReporter29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(strMap45);
        org.junit.Assert.assertNull(scopeList50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(scopeList56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(symbolList63);
    }

    @Test
    public void test11561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11561");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        boolean boolean3 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean10 = compilerEnvirons0.isRecordingComments();
        boolean boolean11 = compilerEnvirons0.isIdeMode();
        boolean boolean12 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11562");
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator17 = astRoot16.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType20 = null;
        com.google.javascript.rhino.head.ast.Comment comment22 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType20, "");
        boolean boolean23 = comment22.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType26, "");
        boolean boolean29 = comment28.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType32 = null;
        com.google.javascript.rhino.head.ast.Comment comment34 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType32, "");
        java.lang.String str36 = comment34.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray37 = new com.google.javascript.rhino.head.ast.Comment[] { comment22, comment28, comment34 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet38 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet38, commentArray37);
        astRoot16.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet38);
        boolean boolean41 = astRoot16.isInStrictMode();
        com.google.javascript.rhino.head.ast.AstNode astNode42 = astRoot16.getParent();
        astRoot16.setEndLineno((int) (short) 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = astRoot16.getTop();
        scriptNode7.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode45);
        scriptNode7.setEncodedSourceEnd(1410155489);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor49 = scriptNode7.iterator();
        org.junit.Assert.assertNull(scopeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(functionNodeList9);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "                                                                                                                                                                                                        " + "'", str36, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(astNode42);
        org.junit.Assert.assertNotNull(scriptNode45);
        org.junit.Assert.assertNotNull(nodeItor49);
    }

    @Test
    public void test11563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11563");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode3.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode4);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList6 = scriptNode4.getChildScopes();
        int int7 = scriptNode4.getBaseLineno();
        int int8 = scriptNode4.getParamCount();
        scriptNode4.flattenSymbolTable(true);
        com.google.javascript.rhino.head.ast.Scope scope11 = scriptNode4.getEnclosingScope();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode12.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode13);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList15 = scriptNode13.getChildScopes();
        int int16 = scriptNode13.getBaseLineno();
        com.google.javascript.rhino.head.Node node17 = scriptNode13.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode18.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode19);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList21 = scriptNode19.getChildScopes();
        java.lang.String str23 = scriptNode19.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode13.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode19, (com.google.javascript.rhino.head.Node) scriptNode25);
        scriptNode13.setEncodedSourceEnd(170);
        int int29 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) scope11, (com.google.javascript.rhino.head.ast.AstNode) scriptNode13);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons30 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons30, errorReporter31);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode33.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode34);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList36 = scriptNode34.getChildScopes();
        int int37 = scriptNode34.getBaseLineno();
        int int38 = scriptNode34.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode39.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode40);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList42 = scriptNode40.getFunctions();
        scriptNode40.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope45 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode34.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode40, (com.google.javascript.rhino.head.Node) scope45);
        scriptNode40.setEncodedSourceEnd(18);
        com.google.javascript.rhino.head.Node node49 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode40);
        scriptNode40.putProp(17, (java.lang.Object) 18);
        boolean boolean53 = scriptNode40.hasSideEffects();
        scriptNode13.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode40);
        java.lang.String str55 = scriptNode13.getEncodedSource();
        org.junit.Assert.assertNotNull(astNodeComparator2);
        org.junit.Assert.assertNull(scopeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNull(scopeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(scopeList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(scopeList36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(functionNodeList42);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test11564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11564");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean5 = compilerEnvirons0.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons6 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean7 = compilerEnvirons6.isReservedKeywordAsIdentifier();
        int int8 = compilerEnvirons6.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean10 = compilerEnvirons9.isReservedKeywordAsIdentifier();
        boolean boolean11 = compilerEnvirons9.isIdeMode();
        compilerEnvirons9.setRecordingLocalJsDocComments(false);
        boolean boolean14 = compilerEnvirons9.isGenerateDebugInfo();
        compilerEnvirons9.setRecordingLocalJsDocComments(true);
        boolean boolean17 = compilerEnvirons9.isXmlAvailable();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean19 = compilerEnvirons18.isReservedKeywordAsIdentifier();
        boolean boolean20 = compilerEnvirons18.getWarnTrailingComma();
        boolean boolean21 = compilerEnvirons18.isRecordingComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = compilerEnvirons18.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser23 = new com.google.javascript.rhino.head.Parser(compilerEnvirons9, errorReporter22);
        compilerEnvirons6.setErrorReporter(errorReporter22);
        compilerEnvirons0.setErrorReporter(errorReporter22);
        boolean boolean26 = compilerEnvirons0.isXmlAvailable();
        boolean boolean27 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        com.google.javascript.rhino.head.Context context32 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 170 + "'", int8 == 170);
        org.junit.Assert.assertNotNull(compilerEnvirons9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(errorReporter22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test11565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11565");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(true);
        int int4 = compilerEnvirons0.getOptimizationLevel();
        int int5 = compilerEnvirons0.getLanguageVersion();
        boolean boolean6 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        boolean boolean8 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean9 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean10 = compilerEnvirons0.reportWarningAsError();
        boolean boolean11 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 170 + "'", int5 == 170);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test11566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11566");
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
        com.google.javascript.rhino.head.Node node30 = astRoot0.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode31.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode32);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot0, (com.google.javascript.rhino.head.ast.Scope) scriptNode32);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode35.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode36);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList38 = scriptNode36.getChildScopes();
        int int39 = scriptNode36.getBaseLineno();
        com.google.javascript.rhino.head.Node node40 = scriptNode36.getLastSibling();
        scriptNode36.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode43.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode44);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList46 = scriptNode44.getFunctions();
        scriptNode44.setPosition((int) (byte) 10);
        java.lang.String str49 = scriptNode36.toStringTree(scriptNode44);
        int int50 = scriptNode36.getBaseLineno();
        com.google.javascript.rhino.head.Node node52 = scriptNode36.setType((int) (byte) -1);
        java.lang.String str53 = astRoot0.toStringTree(scriptNode36);
        java.lang.String str55 = scriptNode36.toSource((-306271829));
        com.google.javascript.rhino.head.ast.AstRoot astRoot56 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet57 = astRoot56.getComments();
        int int58 = astRoot56.getEndLineno();
        com.google.javascript.rhino.head.Node node60 = astRoot56.setType((int) (short) 10);
        scriptNode36.addChildrenToBack((com.google.javascript.rhino.head.Node) astRoot56);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator62 = scriptNode36.new NodeIterator();
        com.google.javascript.rhino.head.Node node63 = nodeIterator62.next();
        boolean boolean64 = nodeIterator62.hasNext();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                                                                                                                        " + "'", str20, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(symbolArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(scopeList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(functionNodeList46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "{\n}\n" + "'", str55, "{\n}\n");
        org.junit.Assert.assertNull(commentSet57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test11567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11567");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.lang.Object obj3 = scriptNode0.getCompilerData();
        scriptNode0.setBounds((-875654977), (-568490075));
        com.google.javascript.rhino.head.ast.FunctionNode functionNode7 = scriptNode0.getEnclosingFunction();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(functionNode7);
    }

    @Test
    public void test11568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11568");
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
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator47 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator48 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator49 = positionComparator47.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator48);
        com.google.javascript.rhino.head.ast.AstRoot astRoot50 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int51 = astRoot50.getBaseLineno();
        java.lang.String str52 = astRoot50.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot53 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator54 = astRoot53.new NodeIterator();
        int int55 = positionComparator48.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot50, (com.google.javascript.rhino.head.ast.AstNode) astRoot53);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode56 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator57 = scriptNode56.spliterator();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator58 = scriptNode56.new NodeIterator();
        astRoot53.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode56);
        int int60 = scriptNode56.getRegexpCount();
        astRoot9.setParentScope((com.google.javascript.rhino.head.ast.Scope) scriptNode56);
        org.junit.Assert.assertNotNull(symbolArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "                                                                                                                                                                                                        " + "'", str29, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(symbolArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(comment45);
        org.junit.Assert.assertNotNull(astNodeComparator49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str52, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(nodeSpliterator57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test11569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11569");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory2 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode3.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode4);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList6 = scriptNode4.getChildScopes();
        int int7 = scriptNode4.getBaseLineno();
        int int8 = scriptNode4.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode9.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList12 = scriptNode10.getFunctions();
        scriptNode10.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode4.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode10, (com.google.javascript.rhino.head.Node) scope15);
        scriptNode10.setEncodedSourceEnd(18);
        com.google.javascript.rhino.head.Node node19 = iRFactory2.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode10);
        int int20 = scriptNode10.getParamCount();
        java.lang.String str21 = scriptNode10.getEncodedSource();
        org.junit.Assert.assertNull(scopeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(functionNodeList12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test11570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11570");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        boolean boolean6 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test11571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11571");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getBaseLineno();
        java.lang.String str2 = astRoot0.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator4 = astRoot3.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType7 = null;
        com.google.javascript.rhino.head.ast.Comment comment9 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType7, "");
        boolean boolean10 = comment9.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType13 = null;
        com.google.javascript.rhino.head.ast.Comment comment15 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType13, "");
        boolean boolean16 = comment15.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType19 = null;
        com.google.javascript.rhino.head.ast.Comment comment21 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType19, "");
        java.lang.String str23 = comment21.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray24 = new com.google.javascript.rhino.head.ast.Comment[] { comment9, comment15, comment21 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet25 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet25, commentArray24);
        astRoot3.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet25);
        boolean boolean28 = astRoot3.isInStrictMode();
        com.google.javascript.rhino.head.Token.CommentType commentType31 = null;
        com.google.javascript.rhino.head.ast.Comment comment33 = new com.google.javascript.rhino.head.ast.Comment((int) '#', 2, commentType31, "hi!");
        astRoot3.addComment(comment33);
        astRoot0.addComment(comment33);
        int int36 = astRoot0.getPosition();
        int int37 = astRoot0.getFunctionCount();
        java.lang.String str38 = astRoot0.shortName();
        java.lang.String str39 = astRoot0.getSourceName();
        astRoot0.removeChildren();
        astRoot0.checkParentLinks();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray42 = astRoot0.getParamAndVarNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str2, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "                                                                                                                                                                                                        " + "'", str23, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "AstRoot" + "'", str38, "AstRoot");
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test11572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11572");
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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode15.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode16);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList18 = scriptNode16.getChildScopes();
        int int19 = scriptNode16.getBaseLineno();
        int int20 = scriptNode16.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode21.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode22);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList24 = scriptNode22.getFunctions();
        scriptNode22.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope27 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode16.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode22, (com.google.javascript.rhino.head.Node) scope27);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList29 = scriptNode22.getFunctions();
        java.lang.String str30 = scriptNode22.debugPrint();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode7, (com.google.javascript.rhino.head.ast.Scope) scriptNode22);
        int int32 = scriptNode22.getEndLineno();
        int int33 = scriptNode22.getLength();
        org.junit.Assert.assertNull(scopeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(functionNodeList9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(scopeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(functionNodeList24);
        org.junit.Assert.assertNotNull(functionNodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "9\t  SCRIPT 10 1\n" + "'", str30, "9\t  SCRIPT 10 1\n");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test11573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11573");
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
        java.lang.String str35 = astRoot0.toSource(37212131);
        astRoot0.checkParentLinks();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                                                                                                                        " + "'", str20, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test11574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11574");
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
        int int16 = scriptNode12.getAbsolutePosition();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean19 = compilerEnvirons18.isReservedKeywordAsIdentifier();
        boolean boolean20 = compilerEnvirons18.getWarnTrailingComma();
        compilerEnvirons18.setXmlAvailable(true);
        boolean boolean23 = compilerEnvirons18.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet27 = astRoot26.getComments();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode28.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode29);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList31 = scriptNode29.getChildScopes();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator33 = scriptNode32.spliterator();
        com.google.javascript.rhino.head.Node node35 = scriptNode32.setType((int) '#');
        boolean boolean36 = scriptNode32.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node(13, (com.google.javascript.rhino.head.Node) astRoot26, (com.google.javascript.rhino.head.Node) scriptNode29, (com.google.javascript.rhino.head.Node) scriptNode32);
        com.google.javascript.rhino.head.Node node38 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode29);
        com.google.javascript.rhino.head.Node node40 = scriptNode29.setType((-213029975));
        com.google.javascript.rhino.head.Token.CommentType commentType43 = null;
        com.google.javascript.rhino.head.ast.Comment comment45 = new com.google.javascript.rhino.head.ast.Comment((int) '#', 2, commentType43, "hi!");
        com.google.javascript.rhino.head.Token.CommentType commentType46 = null;
        comment45.setCommentType(commentType46);
        int int50 = comment45.getIntProp((int) (byte) 10, 0);
        comment45.setPosition(161);
        java.lang.String str54 = comment45.toSource((-325419474));
        scriptNode29.setJsDocNode(comment45);
        com.google.javascript.rhino.head.ast.AstRoot astRoot56 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int57 = astRoot56.getBaseLineno();
        java.lang.String str58 = astRoot56.debugPrint();
        astRoot56.setEncodedSourceBounds((int) (byte) -1, 18);
        astRoot56.clearParentScope();
        com.google.javascript.rhino.head.ast.Scope scope64 = new com.google.javascript.rhino.head.ast.Scope(18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode65 = scope64.getTop();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode67.removeProp(10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot70 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator71 = astRoot70.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor72 = astRoot70.iterator();
        scriptNode67.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot70);
        scope64.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode67);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode76 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        java.lang.Object obj77 = scriptNode76.getCompilerData();
        com.google.javascript.rhino.head.ast.Scope scope78 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator79 = scope78.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode80 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode81 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode80.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode81);
        scope78.setTop(scriptNode81);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode76, (com.google.javascript.rhino.head.ast.Scope) scriptNode81);
        java.lang.String str85 = scope64.toStringTree(scriptNode76);
        int int86 = scriptNode76.getEncodedSourceEnd();
        astRoot56.setCompilerData((java.lang.Object) int86);
        com.google.javascript.rhino.head.Node node89 = new com.google.javascript.rhino.head.Node(41, (com.google.javascript.rhino.head.Node) comment45, (com.google.javascript.rhino.head.Node) astRoot56, 9);
        java.lang.String str90 = scriptNode12.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) astRoot56);
        org.junit.Assert.assertNotNull(astNodeComparator2);
        org.junit.Assert.assertNotNull(nodeItor9);
        org.junit.Assert.assertNull(scopeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(compilerEnvirons18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(commentSet27);
        org.junit.Assert.assertNull(scopeList31);
        org.junit.Assert.assertNotNull(nodeSpliterator33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str58, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNull(scriptNode65);
        org.junit.Assert.assertNotNull(nodeItor72);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(nodeSpliterator79);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNull(str90);
    }

    @Test
    public void test11575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11575");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot(2);
        boolean boolean2 = astRoot1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString((int) 'a', "                                                                                                                                                                                                        ");
        astRoot1.addChildToFront(node5);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator7 = astRoot1.spliterator();
        com.google.javascript.rhino.head.ast.Symbol symbol9 = astRoot1.getSymbol("                                                                                                                                                                                                        {\n                                                                                                                                                                                                        }\n");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node10 = astRoot1.getFinally();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeSpliterator7);
        org.junit.Assert.assertNull(symbol9);
    }

    @Test
    public void test11576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11576");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet1 = astRoot0.getComments();
        com.google.javascript.rhino.head.ast.Symbol symbol3 = astRoot0.getSymbol("                                                                                                                                                                                                        ");
        com.google.javascript.rhino.head.Token.CommentType commentType6 = null;
        com.google.javascript.rhino.head.ast.Comment comment8 = new com.google.javascript.rhino.head.ast.Comment(16, (int) (byte) 0, commentType6, "hi!");
        astRoot0.addChildrenToFront((com.google.javascript.rhino.head.Node) comment8);
        com.google.javascript.rhino.head.Token.CommentType commentType10 = comment8.getCommentType();
        org.junit.Assert.assertNull(commentSet1);
        org.junit.Assert.assertNull(symbol3);
        org.junit.Assert.assertNull(commentType10);
    }

    @Test
    public void test11577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11577");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.putIntProp((int) (short) 1, 1);
        com.google.javascript.rhino.head.Node node5 = scriptNode0.setType((int) 'a');
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList6 = scriptNode0.getStatements();
        int int7 = scriptNode0.getEncodedSourceStart();
        scriptNode0.setEncodedSourceEnd((-294062237));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(astNodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test11578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11578");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory2 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode3.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode4);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList6 = scriptNode4.getFunctions();
        scriptNode4.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.Node node9 = iRFactory2.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode4);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList10 = scriptNode4.getChildScopes();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator11 = scriptNode4.new NodeIterator();
        boolean boolean12 = nodeIterator11.hasNext();
        boolean boolean13 = nodeIterator11.hasNext();
        boolean boolean14 = nodeIterator11.hasNext();
        boolean boolean15 = nodeIterator11.hasNext();
        org.junit.Assert.assertNotNull(functionNodeList6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(scopeList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11579");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot(2);
        boolean boolean2 = astRoot1.hasConsistentReturnUsage();
        java.lang.String str3 = astRoot1.debugPrint();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        java.lang.Object obj7 = scriptNode6.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode8.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        int int11 = scriptNode8.getEndLineno();
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(170, (com.google.javascript.rhino.head.Node) scriptNode6, (com.google.javascript.rhino.head.Node) scriptNode8);
        int int13 = scriptNode6.getPosition();
        com.google.javascript.rhino.head.ast.Comment comment14 = scriptNode6.getJsDocNode();
        astRoot1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2\tSCRIPT 2 1\n" + "'", str3, "2\tSCRIPT 2 1\n");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(comment14);
    }

    @Test
    public void test11580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11580");
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
        java.lang.String str32 = scriptNode17.debugPrint();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.Scope scope33 = com.google.javascript.rhino.head.ast.Scope.splitScope((com.google.javascript.rhino.head.ast.Scope) scriptNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.Scope cannot be cast to com.google.javascript.rhino.head.ast.ScriptNode");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNull(scopeList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(scopeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-568648527) + "'", int28 == (-568648527));
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-1\t  SCRIPT 0 1\n" + "'", str32, "-1\t  SCRIPT 0 1\n");
    }

    @Test
    public void test11581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11581");
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
        scriptNode9.setEncodedSourceEnd(11);
        scriptNode9.setSourceName("-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n");
        java.lang.Object obj15 = scriptNode9.getCompilerData();
        int int16 = scriptNode1.compareTo((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        com.google.javascript.rhino.head.ast.Scope scope17 = scriptNode1.getParentScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node18 = scope17.target;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scopeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(scope17);
    }

    @Test
    public void test11582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11582");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean11 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean12 = compilerEnvirons0.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray19 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        compilerEnvirons13.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        boolean boolean23 = compilerEnvirons13.isGenerateDebugInfo();
        boolean boolean24 = compilerEnvirons13.isGeneratingSource();
        compilerEnvirons13.setIdeMode(false);
        java.util.Set<java.lang.String> strSet27 = compilerEnvirons13.getActivationNames();
        compilerEnvirons0.setActivationNames(strSet27);
        boolean boolean29 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateDebugInfo(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test11583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11583");
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
        java.lang.String str21 = scriptNode1.getJsDoc();
        org.junit.Assert.assertNotNull(functionNodeList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ScriptNode" + "'", str6, "ScriptNode");
        org.junit.Assert.assertNull(scopeList11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 18 + "'", int20 == 18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test11584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11584");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean11 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean16 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setIdeMode(true);
        boolean boolean19 = compilerEnvirons0.getWarnTrailingComma();
        java.util.Set<java.lang.String> strSet20 = compilerEnvirons0.getActivationNames();
        boolean boolean21 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test11585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11585");
        com.google.javascript.rhino.head.Token.CommentType commentType2 = null;
        com.google.javascript.rhino.head.ast.Comment comment4 = new com.google.javascript.rhino.head.ast.Comment((-602720490), (-964909396), commentType2, "                      {\n                      }\n");
    }

    @Test
    public void test11586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11586");
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
        int int30 = astRoot0.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator32 = astRoot31.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType35 = null;
        com.google.javascript.rhino.head.ast.Comment comment37 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType35, "");
        boolean boolean38 = comment37.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType41 = null;
        com.google.javascript.rhino.head.ast.Comment comment43 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType41, "");
        boolean boolean44 = comment43.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType47 = null;
        com.google.javascript.rhino.head.ast.Comment comment49 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType47, "");
        java.lang.String str51 = comment49.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray52 = new com.google.javascript.rhino.head.ast.Comment[] { comment37, comment43, comment49 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet53 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet53, commentArray52);
        astRoot31.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet53);
        boolean boolean56 = astRoot31.isInStrictMode();
        com.google.javascript.rhino.head.Token.CommentType commentType59 = null;
        com.google.javascript.rhino.head.ast.Comment comment61 = new com.google.javascript.rhino.head.ast.Comment((int) '#', 2, commentType59, "hi!");
        astRoot31.addComment(comment61);
        astRoot0.addComment(comment61);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode65 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode65.removeProp(10);
        astRoot0.setTop(scriptNode65);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode69 = astRoot0.getTop();
        scriptNode69.clearParentScope();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                                                                                                                        " + "'", str20, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(symbolArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "                                                                                                                                                                                                        " + "'", str51, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(scriptNode69);
    }

    @Test
    public void test11587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11587");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean11 = compilerEnvirons0.isGeneratingSource();
        int int12 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean13 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean14 = compilerEnvirons0.isRecordingComments();
        boolean boolean15 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setRecordingComments(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter20 = compilerEnvirons0.getErrorReporter();
        boolean boolean21 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(errorReporter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test11588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11588");
        com.google.javascript.rhino.head.Token.CommentType commentType2 = null;
        com.google.javascript.rhino.head.ast.Comment comment4 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType2, "");
        com.google.javascript.rhino.head.Token.CommentType commentType5 = comment4.getCommentType();
        int int6 = comment4.depth();
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator8 = astRoot7.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType11 = null;
        com.google.javascript.rhino.head.ast.Comment comment13 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType11, "");
        boolean boolean14 = comment13.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType17 = null;
        com.google.javascript.rhino.head.ast.Comment comment19 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType17, "");
        boolean boolean20 = comment19.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType23 = null;
        com.google.javascript.rhino.head.ast.Comment comment25 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType23, "");
        java.lang.String str27 = comment25.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray28 = new com.google.javascript.rhino.head.ast.Comment[] { comment13, comment19, comment25 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet29 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet29, commentArray28);
        astRoot7.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet29);
        com.google.javascript.rhino.head.Token.CommentType commentType34 = null;
        com.google.javascript.rhino.head.ast.Comment comment36 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType34, "");
        boolean boolean37 = comment36.hasSideEffects();
        int int38 = comment36.getLineno();
        com.google.javascript.rhino.head.Node node40 = comment36.setType(18);
        boolean boolean41 = comment36.hasSideEffects();
        astRoot7.addComment(comment36);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons43 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory45 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons43, errorReporter44);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode46.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode47);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList49 = scriptNode47.getChildScopes();
        int int50 = scriptNode47.getBaseLineno();
        int int51 = scriptNode47.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode52.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode53);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList55 = scriptNode53.getFunctions();
        scriptNode53.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope58 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode47.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode53, (com.google.javascript.rhino.head.Node) scope58);
        scriptNode53.setEncodedSourceEnd(18);
        com.google.javascript.rhino.head.Node node62 = iRFactory45.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode53);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons63 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory65 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons63, errorReporter64);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode66.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode67);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList69 = scriptNode67.getChildScopes();
        int int70 = scriptNode67.getBaseLineno();
        int int71 = scriptNode67.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode72 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode73 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode72.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode73);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList75 = scriptNode73.getFunctions();
        scriptNode73.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope78 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode67.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode73, (com.google.javascript.rhino.head.Node) scope78);
        scriptNode73.setEncodedSourceEnd(18);
        com.google.javascript.rhino.head.Node node82 = iRFactory65.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode73);
        scriptNode53.setTop(scriptNode73);
        comment4.addChildAfter((com.google.javascript.rhino.head.Node) astRoot7, (com.google.javascript.rhino.head.Node) scriptNode73);
        java.lang.String str85 = comment4.getValue();
        int int86 = comment4.getAbsolutePosition();
        java.lang.String str87 = comment4.getValue();
        com.google.javascript.rhino.head.Token.CommentType commentType88 = comment4.getCommentType();
        org.junit.Assert.assertNull(commentType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "                                                                                                                                                                                                        " + "'", str27, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(scopeList49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(functionNodeList55);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNull(scopeList69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(functionNodeList75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNull(commentType88);
    }

    @Test
    public void test11589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11589");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        boolean boolean3 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean10 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.Parser parser11 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        compilerEnvirons0.setIdeMode(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test11590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11590");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean11 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setIdeMode(false);
        boolean boolean14 = compilerEnvirons0.isIdeMode();
        boolean boolean15 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion(2050719310);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 2050719310");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11591");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        int int1 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean4 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean5 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setGenerateDebugInfo(false);
        boolean boolean8 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean9 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11592");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((-1094142582), 1847246988);
    }

    @Test
    public void test11593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11593");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean8 = compilerEnvirons0.recoverFromErrors();
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(errorReporter9);
    }

    @Test
    public void test11594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11594");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean11 = compilerEnvirons0.isGeneratingSource();
        int int12 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean13 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setLanguageVersion((int) (short) 0);
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setXmlAvailable(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test11595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11595");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        java.util.Set<java.lang.String> strSet3 = null;
        compilerEnvirons0.setActivationNames(strSet3);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean6 = compilerEnvirons5.isReservedKeywordAsIdentifier();
        boolean boolean7 = compilerEnvirons5.getWarnTrailingComma();
        boolean boolean8 = compilerEnvirons5.isRecordingComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = compilerEnvirons5.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter9);
        compilerEnvirons0.setGenerateDebugInfo(true);
        int int13 = compilerEnvirons0.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean15 = compilerEnvirons14.isReservedKeywordAsIdentifier();
        int int16 = compilerEnvirons14.getLanguageVersion();
        compilerEnvirons14.setLanguageVersion((int) (byte) 100);
        boolean boolean19 = compilerEnvirons14.isAllowMemberExprAsFunctionName();
        compilerEnvirons14.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray28 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        compilerEnvirons22.setActivationNames((java.util.Set<java.lang.String>) strSet29);
        boolean boolean32 = compilerEnvirons22.isGenerateDebugInfo();
        compilerEnvirons22.setOptimizationLevel((int) (short) 1);
        compilerEnvirons22.setAllowSharpComments(true);
        boolean boolean37 = compilerEnvirons22.getAllowSharpComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter38 = compilerEnvirons22.getErrorReporter();
        compilerEnvirons14.setErrorReporter(errorReporter38);
        com.google.javascript.rhino.head.ErrorReporter errorReporter40 = compilerEnvirons14.getErrorReporter();
        boolean boolean41 = compilerEnvirons14.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons42 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean43 = compilerEnvirons42.isReservedKeywordAsIdentifier();
        boolean boolean44 = compilerEnvirons42.isIdeMode();
        boolean boolean45 = compilerEnvirons42.getWarnTrailingComma();
        compilerEnvirons42.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons42.setAllowSharpComments(true);
        boolean boolean50 = compilerEnvirons42.isRecordingLocalJsDocComments();
        compilerEnvirons42.setAllowMemberExprAsFunctionName(true);
        boolean boolean53 = compilerEnvirons42.reportWarningAsError();
        com.google.javascript.rhino.head.Parser parser54 = new com.google.javascript.rhino.head.Parser(compilerEnvirons42);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons55 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean56 = compilerEnvirons55.isReservedKeywordAsIdentifier();
        boolean boolean57 = compilerEnvirons55.isIdeMode();
        boolean boolean58 = compilerEnvirons55.getWarnTrailingComma();
        compilerEnvirons55.setAllowMemberExprAsFunctionName(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons61 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean62 = compilerEnvirons61.isReservedKeywordAsIdentifier();
        int int63 = compilerEnvirons61.getLanguageVersion();
        int int64 = compilerEnvirons61.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons65 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean66 = compilerEnvirons65.isReservedKeywordAsIdentifier();
        compilerEnvirons65.setStrictMode(true);
        compilerEnvirons65.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons71 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean72 = compilerEnvirons71.isReservedKeywordAsIdentifier();
        boolean boolean73 = compilerEnvirons71.getWarnTrailingComma();
        compilerEnvirons71.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet76 = compilerEnvirons71.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter77 = compilerEnvirons71.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory78 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons65, errorReporter77);
        com.google.javascript.rhino.head.IRFactory iRFactory79 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons61, errorReporter77);
        com.google.javascript.rhino.head.IRFactory iRFactory80 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons55, errorReporter77);
        com.google.javascript.rhino.head.IRFactory iRFactory81 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons42, errorReporter77);
        com.google.javascript.rhino.head.IRFactory iRFactory82 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons14, errorReporter77);
        com.google.javascript.rhino.head.IRFactory iRFactory83 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter77);
        // The following exception was thrown during execution in test generation
        try {
            errorReporter77.error("2\tSCRIPT 2 1\n", "-213029975\tSCRIPT -213029975 1\n", 1416940460, "                                                                                                                                                                                                  {\n                                                                                                                                                                                                    {\n                                                                                                                                                                                                    }\n                                                                                                                                                                                                  }\n", (-954561564));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(errorReporter9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 170 + "'", int13 == 170);
        org.junit.Assert.assertNotNull(compilerEnvirons14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 170 + "'", int16 == 170);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(errorReporter38);
        org.junit.Assert.assertNotNull(errorReporter40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 170 + "'", int63 == 170);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 170 + "'", int64 == 170);
        org.junit.Assert.assertNotNull(compilerEnvirons65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(strSet76);
        org.junit.Assert.assertNotNull(errorReporter77);
    }

    @Test
    public void test11596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11596");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        int int5 = scriptNode1.getParamCount();
        scriptNode1.flattenSymbolTable(true);
        com.google.javascript.rhino.head.ast.Scope scope8 = scriptNode1.getEnclosingScope();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode9 = scriptNode1.getEnclosingFunction();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList10 = scriptNode1.getFunctions();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode11.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode12);
        int int14 = scriptNode11.getEndLineno();
        com.google.javascript.rhino.head.ast.Scope scope15 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode11.setParentScope(scope15);
        int int17 = scriptNode1.compareTo((com.google.javascript.rhino.head.ast.AstNode) scope15);
        int int18 = scriptNode1.depth();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = scriptNode1.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.ScriptNode cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scopeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(functionNode9);
        org.junit.Assert.assertNotNull(functionNodeList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1128822546) + "'", int17 == (-1128822546));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test11597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11597");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        boolean boolean1 = astRoot0.hasSideEffects();
        int int2 = astRoot0.getEncodedSourceEnd();
        int int3 = astRoot0.getPosition();
        astRoot0.setBounds((-1034592013), (-748307395));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11598");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int2 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean7 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 170 + "'", int2 == 170);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test11599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11599");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope(15);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node2 = scope1.getContinue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11600");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList3 = scriptNode1.getFunctions();
        scriptNode1.setPosition((int) (byte) 10);
        int int6 = scriptNode1.getEncodedSourceEnd();
        int int7 = scriptNode1.getLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode8.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode9);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList11 = scriptNode9.getChildScopes();
        int int12 = scriptNode9.getBaseLineno();
        com.google.javascript.rhino.head.Node node13 = scriptNode9.getLastSibling();
        java.lang.String str14 = scriptNode1.toStringTree(scriptNode9);
        com.google.javascript.rhino.head.ast.AstNode astNode15 = scriptNode1.getParent();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode16.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList19 = scriptNode17.getChildScopes();
        java.lang.String str21 = scriptNode17.makeIndent((int) (byte) -1);
        scriptNode17.clearParentScope();
        java.lang.Object obj23 = scriptNode17.getCompilerData();
        java.lang.String str24 = scriptNode1.toStringTree(scriptNode17);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = scriptNode1.getTop();
        int int26 = scriptNode1.getLineno();
        org.junit.Assert.assertNotNull(functionNodeList3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(scopeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(astNode15);
        org.junit.Assert.assertNull(scopeList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(scriptNode25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test11601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11601");
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
        int int29 = astRoot0.getEncodedSourceEnd();
        astRoot0.checkParentLinks();
        astRoot0.setPosition((int) (short) 100);
        com.google.javascript.rhino.head.ast.Scope scope33 = astRoot0.getParentScope();
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap34 = astRoot0.getSymbolTable();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor35 = null;
        // The following exception was thrown during execution in test generation
        try {
            astRoot0.visitComments(nodeVisitor35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                                                                                                                        " + "'", str20, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(astNode26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n" + "'", str27, "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertNull(strMap34);
    }

    @Test
    public void test11602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11602");
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
        compilerEnvirons0.setGeneratingSource(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean19 = compilerEnvirons18.isReservedKeywordAsIdentifier();
        boolean boolean20 = compilerEnvirons18.isIdeMode();
        boolean boolean21 = compilerEnvirons18.getWarnTrailingComma();
        compilerEnvirons18.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons18.setAllowSharpComments(true);
        compilerEnvirons18.setRecoverFromErrors(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean29 = compilerEnvirons28.isReservedKeywordAsIdentifier();
        int int30 = compilerEnvirons28.getLanguageVersion();
        compilerEnvirons28.setLanguageVersion((int) (byte) 100);
        boolean boolean33 = compilerEnvirons28.isAllowMemberExprAsFunctionName();
        compilerEnvirons28.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons36 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray42 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        compilerEnvirons36.setActivationNames((java.util.Set<java.lang.String>) strSet43);
        boolean boolean46 = compilerEnvirons36.isGenerateDebugInfo();
        compilerEnvirons36.setOptimizationLevel((int) (short) 1);
        compilerEnvirons36.setAllowSharpComments(true);
        boolean boolean51 = compilerEnvirons36.getAllowSharpComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter52 = compilerEnvirons36.getErrorReporter();
        compilerEnvirons28.setErrorReporter(errorReporter52);
        compilerEnvirons18.setErrorReporter(errorReporter52);
        com.google.javascript.rhino.head.IRFactory iRFactory55 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter52);
        boolean boolean56 = compilerEnvirons0.getAllowSharpComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(compilerEnvirons18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 170 + "'", int30 == 170);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons36);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(errorReporter52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test11603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11603");
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
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor32 = null;
        // The following exception was thrown during execution in test generation
        try {
            astRoot0.visit(nodeVisitor32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                                                                                                                        " + "'", str20, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(symbolArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test11604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11604");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean5 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setRecordingComments(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test11605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11605");
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
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor59 = astRoot55.iterator();
        astRoot55.removeChildren();
        org.junit.Assert.assertNull(scopeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionNodeList15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(scopeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(scopeList36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(functionNodeList44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(scriptNode57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(nodeItor59);
    }

    @Test
    public void test11606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11606");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node(4);
    }

    @Test
    public void test11607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11607");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("136");
        node1.setString("                                                                                                        {\n                                                                                                        }\n");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode6);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList8 = scriptNode6.getChildScopes();
        int int9 = scriptNode6.getBaseLineno();
        com.google.javascript.rhino.head.Node node10 = scriptNode6.getLastSibling();
        int int11 = scriptNode6.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope14 = new com.google.javascript.rhino.head.ast.Scope(5, (int) '#');
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator16 = astRoot15.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType19 = null;
        com.google.javascript.rhino.head.ast.Comment comment21 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType19, "");
        boolean boolean22 = comment21.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType25 = null;
        com.google.javascript.rhino.head.ast.Comment comment27 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType25, "");
        boolean boolean28 = comment27.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType31 = null;
        com.google.javascript.rhino.head.ast.Comment comment33 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType31, "");
        java.lang.String str35 = comment33.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray36 = new com.google.javascript.rhino.head.ast.Comment[] { comment21, comment27, comment33 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet37 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet37, commentArray36);
        astRoot15.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet37);
        boolean boolean40 = astRoot15.isInStrictMode();
        com.google.javascript.rhino.head.ast.AstNode astNode41 = astRoot15.getParent();
        astRoot15.setEndLineno((int) (short) 0);
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode6, (com.google.javascript.rhino.head.Node) scope14, (com.google.javascript.rhino.head.Node) astRoot15, 6);
        java.lang.String str46 = node1.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) astRoot15);
        com.google.javascript.rhino.head.ast.Scope scope47 = astRoot15.getEnclosingScope();
        int int48 = astRoot15.getEndLineno();
        com.google.javascript.rhino.head.Token.CommentType commentType51 = null;
        com.google.javascript.rhino.head.ast.Comment comment53 = new com.google.javascript.rhino.head.ast.Comment((int) '#', 2, commentType51, "hi!");
        java.lang.String str55 = comment53.toSource(0);
        java.lang.String str56 = comment53.shortName();
        boolean boolean57 = comment53.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator58 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator59 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator60 = positionComparator58.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator59);
        com.google.javascript.rhino.head.ast.AstRoot astRoot61 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int62 = astRoot61.getBaseLineno();
        java.lang.String str63 = astRoot61.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot64 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator65 = astRoot64.new NodeIterator();
        int int66 = positionComparator59.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot61, (com.google.javascript.rhino.head.ast.AstNode) astRoot64);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator68 = scriptNode67.spliterator();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator69 = scriptNode67.new NodeIterator();
        astRoot64.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode67);
        com.google.javascript.rhino.head.Node node71 = scriptNode67.getFirstChild();
        comment53.addChildrenToFront((com.google.javascript.rhino.head.Node) scriptNode67);
        java.lang.String str73 = comment53.getValue();
        astRoot15.addComment(comment53);
        int int75 = astRoot15.getParamCount();
        int int76 = astRoot15.getEndLineno();
        java.lang.String str77 = astRoot15.getNextTempName();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(scopeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "                                                                                                                                                                                                        " + "'", str35, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(astNode41);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(scope47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Comment" + "'", str56, "Comment");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(astNodeComparator60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str63, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(nodeSpliterator68);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "$0" + "'", str77, "$0");
    }

    @Test
    public void test11608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11608");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString(161, "ScriptNode");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode6.flattenSymbolTable(true);
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node(538062289, (com.google.javascript.rhino.head.Node) scriptNode6, (-603115504));
        scriptNode6.setEncodedSource("-1\tSCRIPT -1 1\n");
        java.lang.Object obj13 = scriptNode6.getCompilerData();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((-282781957), node3, (com.google.javascript.rhino.head.Node) scriptNode6, 644758030);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = scriptNode6.getTop();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(scriptNode16);
    }

    @Test
    public void test11609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11609");
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
        int int26 = astRoot0.getParamCount();
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = new com.google.javascript.rhino.head.ast.AstRoot();
        boolean boolean28 = astRoot27.hasSideEffects();
        astRoot0.target = astRoot27;
        astRoot27.checkParentLinks();
        java.lang.Object obj32 = astRoot27.getProp((int) (byte) 1);
        int int33 = astRoot27.depth();
        astRoot27.setInStrictMode(false);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode36.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode37);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList39 = scriptNode37.getChildScopes();
        int int40 = scriptNode37.getBaseLineno();
        int int41 = scriptNode37.getParamCount();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList42 = scriptNode37.getSymbols();
        scriptNode37.flattenSymbolTable(false);
        com.google.javascript.rhino.head.ast.AstRoot astRoot45 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator46 = astRoot45.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor47 = astRoot45.iterator();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor48 = null;
        astRoot45.visitComments(nodeVisitor48);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode37, (com.google.javascript.rhino.head.ast.Scope) astRoot45);
        scriptNode37.removeChildren();
        astRoot27.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode37);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                                                                                                                        " + "'", str20, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(scopeList39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(symbolList42);
        org.junit.Assert.assertNotNull(nodeItor47);
    }

    @Test
    public void test11610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11610");
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet18 = astRoot17.getComments();
        com.google.javascript.rhino.head.ast.Symbol symbol20 = astRoot17.getSymbol("                                                                                                                                                                                                        ");
        com.google.javascript.rhino.head.Token.CommentType commentType23 = null;
        com.google.javascript.rhino.head.ast.Comment comment25 = new com.google.javascript.rhino.head.ast.Comment(16, (int) (byte) 0, commentType23, "hi!");
        astRoot17.addChildrenToFront((com.google.javascript.rhino.head.Node) comment25);
        boolean boolean27 = astRoot17.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode28.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode29);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList31 = scriptNode29.getChildScopes();
        int int32 = scriptNode29.getBaseLineno();
        int int33 = scriptNode29.getParamCount();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList34 = scriptNode29.getSymbols();
        int int35 = scriptNode29.getPosition();
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
        com.google.javascript.rhino.head.Node node66 = astRoot36.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode68 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode67.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode68);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot36, (com.google.javascript.rhino.head.ast.Scope) scriptNode68);
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node(19, (com.google.javascript.rhino.head.Node) astRoot17, (com.google.javascript.rhino.head.Node) scriptNode29, (com.google.javascript.rhino.head.Node) astRoot36, (int) (byte) 1);
        scriptNode1.setParentScope((com.google.javascript.rhino.head.ast.Scope) astRoot36);
        com.google.javascript.rhino.head.Token.CommentType commentType76 = null;
        com.google.javascript.rhino.head.ast.Comment comment78 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType76, "");
        boolean boolean79 = comment78.hasSideEffects();
        int int80 = comment78.getLineno();
        com.google.javascript.rhino.head.Token.CommentType commentType81 = null;
        comment78.setCommentType(commentType81);
        comment78.setPosition(2);
        astRoot36.addComment(comment78);
        java.lang.String str86 = astRoot36.getSourceName();
        int int87 = astRoot36.getLineno();
        org.junit.Assert.assertNull(scopeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(functionNodeList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(commentSet18);
        org.junit.Assert.assertNull(symbol20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(scopeList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(symbolList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "                                                                                                                                                                                                        " + "'", str56, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(symbolArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
    }

    @Test
    public void test11611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11611");
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot41 = iRFactory37.parse("0\tSCRIPT 0 1\n", "                                ", 13);
        astRoot41.setPosition(0);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator44 = astRoot41.new NodeIterator();
        boolean boolean45 = nodeIterator44.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            nodeIterator44.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: next() has not been called");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(errorReporter6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 170 + "'", int20 == 170);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 170 + "'", int21 == 170);
        org.junit.Assert.assertNotNull(compilerEnvirons22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(strSet33);
        org.junit.Assert.assertNotNull(errorReporter34);
        org.junit.Assert.assertNotNull(astRoot41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test11612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11612");
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
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(603173706, 0);
        astRoot1.addChildrenToFront(node34);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode36.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode37);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList39 = scriptNode37.getChildScopes();
        int int40 = scriptNode37.getBaseLineno();
        com.google.javascript.rhino.head.Node node41 = scriptNode37.getLastSibling();
        int int42 = scriptNode37.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator43 = scriptNode37.new NodeIterator();
        int int44 = scriptNode37.getLineno();
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node((-1101340812), node34, (com.google.javascript.rhino.head.Node) scriptNode37, 25);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor47 = scriptNode37.iterator();
        com.google.javascript.rhino.head.Node node48 = scriptNode37.getLastChild();
        java.lang.Object obj50 = scriptNode37.getProp(1570909190);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                                                                                                                                        " + "'", str21, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(symbolArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(scopeList39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(nodeItor47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test11613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11613");
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
        int int30 = astRoot0.getEncodedSourceStart();
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
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot0, (com.google.javascript.rhino.head.ast.Scope) scriptNode32);
        java.lang.String str48 = astRoot0.getSourceName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot50 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet51 = astRoot50.getComments();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode52.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode53);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList55 = scriptNode53.getChildScopes();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode56 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator57 = scriptNode56.spliterator();
        com.google.javascript.rhino.head.Node node59 = scriptNode56.setType((int) '#');
        boolean boolean60 = scriptNode56.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node(13, (com.google.javascript.rhino.head.Node) astRoot50, (com.google.javascript.rhino.head.Node) scriptNode53, (com.google.javascript.rhino.head.Node) scriptNode56);
        com.google.javascript.rhino.head.Token.CommentType commentType64 = null;
        com.google.javascript.rhino.head.ast.Comment comment66 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType64, "");
        com.google.javascript.rhino.head.Token.CommentType commentType67 = comment66.getCommentType();
        com.google.javascript.rhino.head.Token.CommentType commentType68 = null;
        comment66.setCommentType(commentType68);
        java.lang.String str70 = comment66.getValue();
        scriptNode53.setCompilerData((java.lang.Object) str70);
        java.lang.String str72 = astRoot0.toStringTree(scriptNode53);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode73 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode73.putIntProp((int) (short) 1, 1);
        scriptNode73.setEncodedSource("typeof");
        java.lang.Object obj80 = scriptNode73.getProp(2);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList81 = scriptNode73.getStatements();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons82 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory84 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons82, errorReporter83);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode85 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode86 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode85.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode86);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList88 = scriptNode86.getFunctions();
        scriptNode86.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.Node node91 = iRFactory84.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode86);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList92 = scriptNode86.getChildScopes();
        scriptNode73.replaceWith((com.google.javascript.rhino.head.ast.Scope) scriptNode86);
        int int94 = scriptNode86.getType();
        astRoot0.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode86);
        java.lang.String str96 = scriptNode86.shortName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                                                                                                                        " + "'", str20, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(symbolArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(scopeList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionNodeList42);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(commentSet51);
        org.junit.Assert.assertNull(scopeList55);
        org.junit.Assert.assertNotNull(nodeSpliterator57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(commentType67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(astNodeList81);
        org.junit.Assert.assertNotNull(functionNodeList88);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNull(scopeList92);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 136 + "'", int94 == 136);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "ScriptNode" + "'", str96, "ScriptNode");
    }

    @Test
    public void test11614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11614");
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
        com.google.javascript.rhino.head.Token.CommentType commentType36 = null;
        com.google.javascript.rhino.head.ast.Comment comment38 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType36, "");
        com.google.javascript.rhino.head.Token.CommentType commentType39 = null;
        comment38.setCommentType(commentType39);
        astRoot0.setJsDocNode(comment38);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode43.removeProp(10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot46 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator47 = astRoot46.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor48 = astRoot46.iterator();
        scriptNode43.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot46);
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor50 = null;
        astRoot46.visitComments(nodeVisitor50);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str54 = scriptNode52.toSource((int) '4');
        com.google.javascript.rhino.head.Node node55 = scriptNode52.getFirstChild();
        astRoot46.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode52);
        comment38.addChild((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
        astRoot46.checkParentLinks();
        com.google.javascript.rhino.head.Node node59 = astRoot46.getNext();
        java.lang.String str60 = astRoot46.debugPrint();
        astRoot46.checkParentLinks();
        com.google.javascript.rhino.head.Node node62 = astRoot46.getNext();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                                                                                                                        " + "'", str20, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(symbolArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(comment31);
        org.junit.Assert.assertNotNull(nodeItor48);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "                                                                                                        {\n                                                                                                        }\n" + "'", str54, "                                                                                                        {\n                                                                                                        }\n");
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "-1\t  SCRIPT -2 1\n-1\tSCRIPT -1 1\n" + "'", str60, "-1\t  SCRIPT -2 1\n-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNull(node62);
    }

    @Test
    public void test11615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11615");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        boolean boolean3 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean4 = compilerEnvirons0.isRecordingComments();
        boolean boolean5 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean6 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test11616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11616");
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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode27.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode28);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList30 = scriptNode28.getChildScopes();
        int int31 = scriptNode28.getBaseLineno();
        com.google.javascript.rhino.head.Node node32 = scriptNode28.getLastSibling();
        int int33 = scriptNode28.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator34 = scriptNode28.new NodeIterator();
        int int35 = scriptNode28.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope36 = scriptNode28.getParentScope();
        java.lang.String str37 = scriptNode28.debugPrint();
        scriptNode1.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode28);
        int int39 = scriptNode1.getLineno();
        org.junit.Assert.assertNull(scopeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(scopeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionNodeList18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(scopeList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(scope36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-1\t  SCRIPT 0 1\n" + "'", str37, "-1\t  SCRIPT 0 1\n");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test11617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11617");
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
        java.lang.String str32 = astRoot0.shortName();
        boolean boolean33 = astRoot0.hasSideEffects();
        int int34 = astRoot0.getEncodedSourceStart();
        astRoot0.checkParentLinks();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                                                                                                                        " + "'", str20, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AstRoot" + "'", str32, "AstRoot");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test11618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11618");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot(365503559);
        int int2 = astRoot1.depth();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = astRoot1.addFunction(functionNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11619");
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
        com.google.javascript.rhino.head.Token.CommentType commentType17 = null;
        com.google.javascript.rhino.head.ast.Comment comment19 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType17, "");
        boolean boolean20 = comment19.hasSideEffects();
        int int21 = comment19.getLineno();
        com.google.javascript.rhino.head.Token.CommentType commentType22 = comment19.getCommentType();
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
        scriptNode30.setEncodedSourceEnd(18);
        comment19.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode30);
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = scriptNode30.getAstRoot();
        scriptNode13.setCompilerData((java.lang.Object) scriptNode30);
        int int42 = scriptNode13.getLineno();
        org.junit.Assert.assertNull(scopeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(scopeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(commentType22);
        org.junit.Assert.assertNull(scopeList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(functionNodeList32);
        org.junit.Assert.assertNull(astRoot40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test11620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11620");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int2 = astRoot1.getParamCount();
        int int3 = astRoot1.getPosition();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode7.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode8);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList10 = scriptNode8.getFunctions();
        scriptNode8.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.Node node13 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode8);
        java.lang.String str14 = scriptNode8.getSourceName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator16 = scriptNode15.spliterator();
        com.google.javascript.rhino.head.Node node18 = scriptNode15.setType((int) '#');
        boolean boolean19 = scriptNode15.hasConsistentReturnUsage();
        scriptNode8.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode15);
        com.google.javascript.rhino.head.ast.Symbol symbol22 = scriptNode8.getSymbol("                                      ");
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot1, (com.google.javascript.rhino.head.ast.Scope) scriptNode8);
        com.google.javascript.rhino.head.ast.AstNode astNode24 = scriptNode8.getParent();
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(100, (com.google.javascript.rhino.head.Node) scriptNode8, 19);
        com.google.javascript.rhino.head.Node node27 = null;
        // The following exception was thrown during execution in test generation
        try {
            scriptNode8.addChildrenToBack(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(functionNodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(nodeSpliterator16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(symbol22);
        org.junit.Assert.assertNotNull(astNode24);
    }

    @Test
    public void test11621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11621");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        boolean boolean5 = compilerEnvirons0.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator8 = astRoot7.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor9 = astRoot7.iterator();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor10 = null;
        astRoot7.visitComments(nodeVisitor10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory6.transformTree(astRoot7);
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet13 = astRoot7.getComments();
        boolean boolean14 = astRoot7.isInStrictMode();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor15 = null;
        astRoot7.visitComments(nodeVisitor15);
        com.google.javascript.rhino.head.Node node17 = astRoot7.target;
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator19 = astRoot18.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor20 = astRoot18.iterator();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor21 = null;
        astRoot18.visitComments(nodeVisitor21);
        astRoot18.setInStrictMode(false);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode26.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode27);
        scriptNode27.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap33 = scriptNode32.getSymbolTable();
        scriptNode27.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode32);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList35 = scriptNode27.getStatements();
        com.google.javascript.rhino.head.ast.Scope scope36 = scriptNode27.getEnclosingScope();
        com.google.javascript.rhino.head.ast.AstRoot astRoot37 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int38 = astRoot37.getBaseLineno();
        java.lang.String str39 = astRoot37.debugPrint();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList40 = astRoot37.getSymbols();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scope36, (com.google.javascript.rhino.head.Node) astRoot37, 0);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons43 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory45 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons43, errorReporter44);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode46.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode47);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList49 = scriptNode47.getFunctions();
        scriptNode47.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.Node node52 = iRFactory45.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode47);
        com.google.javascript.rhino.head.ast.AstNode astNode53 = scriptNode47.getParent();
        int int54 = scriptNode47.getAbsolutePosition();
        scope36.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode47);
        com.google.javascript.rhino.head.ast.AstRoot astRoot57 = new com.google.javascript.rhino.head.ast.AstRoot(2);
        boolean boolean58 = astRoot57.hasConsistentReturnUsage();
        java.lang.String str59 = astRoot57.debugPrint();
        scriptNode47.setTop((com.google.javascript.rhino.head.ast.ScriptNode) astRoot57);
        astRoot18.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode47);
        astRoot7.setParentScope((com.google.javascript.rhino.head.ast.Scope) scriptNode47);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeItor9);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNull(commentSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(nodeItor20);
        org.junit.Assert.assertNull(strMap33);
        org.junit.Assert.assertNotNull(astNodeList35);
        org.junit.Assert.assertNotNull(scope36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str39, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNotNull(symbolList40);
        org.junit.Assert.assertNotNull(functionNodeList49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(astNode53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 9 + "'", int54 == 9);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "2\tSCRIPT 2 1\n" + "'", str59, "2\tSCRIPT 2 1\n");
    }

    @Test
    public void test11622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11622");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet1 = astRoot0.getComments();
        int int2 = astRoot0.getEndLineno();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor3 = null;
        astRoot0.visitComments(nodeVisitor3);
        com.google.javascript.rhino.head.Node node5 = astRoot0.getFirstChild();
        com.google.javascript.rhino.head.ast.Scope scope6 = astRoot0.getEnclosingScope();
        astRoot0.setEncodedSourceStart(23);
        astRoot0.setLineno((-1116244898));
        com.google.javascript.rhino.head.ast.Scope scope11 = astRoot0.getEnclosingScope();
        // The following exception was thrown during execution in test generation
        try {
            astRoot0.setEndLineno((-579074392));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commentSet1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(scope11);
    }

    @Test
    public void test11623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11623");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int4 = astRoot3.getBaseLineno();
        java.lang.String str5 = astRoot3.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = astRoot6.new NodeIterator();
        int int8 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot3, (com.google.javascript.rhino.head.ast.AstNode) astRoot6);
        int int9 = astRoot3.getFunctionCount();
        astRoot3.setPosition(1384960853);
        java.lang.String str12 = astRoot3.debugPrint();
        com.google.javascript.rhino.head.Token.CommentType commentType15 = null;
        com.google.javascript.rhino.head.ast.Comment comment17 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType15, "");
        com.google.javascript.rhino.head.Token.CommentType commentType18 = comment17.getCommentType();
        int int19 = comment17.depth();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator20 = comment17.new NodeIterator();
        int int21 = comment17.getLength();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator22 = comment17.spliterator();
        java.lang.String str23 = comment17.shortName();
        astRoot3.addComment(comment17);
        astRoot3.setEncodedSourceBounds((-134509011), 1449664404);
        org.junit.Assert.assertNotNull(astNodeComparator2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str5, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1384960853\tSCRIPT 1384960853 1\n" + "'", str12, "1384960853\tSCRIPT 1384960853 1\n");
        org.junit.Assert.assertNull(commentType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeSpliterator22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Comment" + "'", str23, "Comment");
    }

    @Test
    public void test11624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11624");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        boolean boolean5 = compilerEnvirons0.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator8 = astRoot7.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor9 = astRoot7.iterator();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor10 = null;
        astRoot7.visitComments(nodeVisitor10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory6.transformTree(astRoot7);
        com.google.javascript.rhino.head.ast.Scope scope13 = astRoot7.getEnclosingScope();
        boolean boolean14 = astRoot7.hasSideEffects();
        boolean boolean15 = astRoot7.hasSideEffects();
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator17 = astRoot16.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType20 = null;
        com.google.javascript.rhino.head.ast.Comment comment22 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType20, "");
        boolean boolean23 = comment22.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType26, "");
        boolean boolean29 = comment28.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType32 = null;
        com.google.javascript.rhino.head.ast.Comment comment34 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType32, "");
        java.lang.String str36 = comment34.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray37 = new com.google.javascript.rhino.head.ast.Comment[] { comment22, comment28, comment34 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet38 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet38, commentArray37);
        astRoot16.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet38);
        boolean boolean41 = astRoot16.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray42 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList43 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList43, symbolArray42);
        astRoot16.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList43);
        com.google.javascript.rhino.head.Node node46 = astRoot16.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode47.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode48);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot16, (com.google.javascript.rhino.head.ast.Scope) scriptNode48);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode51.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode52);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList54 = scriptNode52.getChildScopes();
        int int55 = scriptNode52.getBaseLineno();
        com.google.javascript.rhino.head.Node node56 = scriptNode52.getLastSibling();
        scriptNode52.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode59.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode60);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList62 = scriptNode60.getFunctions();
        scriptNode60.setPosition((int) (byte) 10);
        java.lang.String str65 = scriptNode52.toStringTree(scriptNode60);
        int int66 = scriptNode52.getBaseLineno();
        com.google.javascript.rhino.head.Node node68 = scriptNode52.setType((int) (byte) -1);
        java.lang.String str69 = astRoot16.toStringTree(scriptNode52);
        java.lang.String str70 = astRoot16.debugPrint();
        com.google.javascript.rhino.head.ast.Symbol symbol72 = astRoot16.getSymbol("129");
        int int73 = astRoot16.getParamCount();
        com.google.javascript.rhino.head.ast.Scope scope75 = astRoot16.getDefiningScope("                                                                hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int76 = astRoot7.compareTo((com.google.javascript.rhino.head.ast.AstNode) scope75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeItor9);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "                                                                                                                                                                                                        " + "'", str36, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(symbolArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(scopeList54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(functionNodeList62);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n" + "'", str70, "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n");
        org.junit.Assert.assertNull(symbol72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNull(scope75);
    }

    @Test
    public void test11625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11625");
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
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor74 = astRoot1.iterator();
        astRoot1.setInStrictMode(false);
        boolean boolean77 = astRoot1.isInStrictMode();
        astRoot1.setEndLineno(402672405);
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor80 = null;
        // The following exception was thrown during execution in test generation
        try {
            astRoot1.visitAll(nodeVisitor80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                                                                                                                                        " + "'", str21, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(symbolArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "                                                                                                                                                                                                        " + "'", str52, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(symbolArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(nodeItor69);
        org.junit.Assert.assertNotNull(nodeItor74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test11626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11626");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray11 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet12);
        boolean boolean15 = compilerEnvirons5.isGenerateDebugInfo();
        compilerEnvirons5.setOptimizationLevel((int) (short) 1);
        compilerEnvirons5.setAllowSharpComments(true);
        boolean boolean20 = compilerEnvirons5.getAllowSharpComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = compilerEnvirons5.getErrorReporter();
        compilerEnvirons5.setWarnTrailingComma(true);
        java.util.Set<java.lang.String> strSet24 = compilerEnvirons5.getActivationNames();
        compilerEnvirons0.setActivationNames(strSet24);
        java.util.Set<java.lang.String> strSet26 = compilerEnvirons0.getActivationNames();
        boolean boolean27 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(errorReporter21);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test11627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11627");
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
        com.google.javascript.rhino.head.ast.Comment comment23 = scope14.getJsDocNode();
        org.junit.Assert.assertNotNull(astNodeComparator2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str5, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(nodeSpliterator15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(comment23);
    }

    @Test
    public void test11628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11628");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setGenerateDebugInfo(true);
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean10 = compilerEnvirons0.getWarnTrailingComma();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray17 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        compilerEnvirons11.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        boolean boolean21 = compilerEnvirons11.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = compilerEnvirons11.getErrorReporter();
        compilerEnvirons11.setGenerateObserverCount(true);
        compilerEnvirons11.setIdeMode(false);
        java.util.Set<java.lang.String> strSet27 = compilerEnvirons11.getActivationNames();
        compilerEnvirons0.setActivationNames(strSet27);
        boolean boolean29 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.Parser parser32 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(errorReporter22);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test11629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11629");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot(784433802);
    }

    @Test
    public void test11630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11630");
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
        com.google.javascript.rhino.head.ast.Symbol symbol11 = astRoot9.getSymbol("-1\tSETPROP -1 1\n");
        com.google.javascript.rhino.head.ast.Scope scope13 = astRoot9.getDefiningScope("{\n}\n");
        java.lang.String str15 = astRoot9.toSource(198303179);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean17 = compilerEnvirons16.isReservedKeywordAsIdentifier();
        boolean boolean18 = compilerEnvirons16.getWarnTrailingComma();
        compilerEnvirons16.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet21 = compilerEnvirons16.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = compilerEnvirons16.getErrorReporter();
        java.lang.String[] strArray28 = new java.lang.String[] { "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n", "                                ", "typeof", "                                                                                                                                                                                                        ", "{\n}\n" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet29);
        boolean boolean32 = compilerEnvirons16.isGenerateDebugInfo();
        boolean boolean33 = compilerEnvirons16.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean35 = compilerEnvirons34.isReservedKeywordAsIdentifier();
        int int36 = compilerEnvirons34.getLanguageVersion();
        int int37 = compilerEnvirons34.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons38 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean39 = compilerEnvirons38.isReservedKeywordAsIdentifier();
        compilerEnvirons38.setStrictMode(true);
        compilerEnvirons38.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons44 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean45 = compilerEnvirons44.isReservedKeywordAsIdentifier();
        boolean boolean46 = compilerEnvirons44.getWarnTrailingComma();
        compilerEnvirons44.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet49 = compilerEnvirons44.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter50 = compilerEnvirons44.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory51 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons38, errorReporter50);
        com.google.javascript.rhino.head.IRFactory iRFactory52 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons34, errorReporter50);
        com.google.javascript.rhino.head.IRFactory iRFactory53 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons16, errorReporter50);
        com.google.javascript.rhino.head.ast.AstRoot astRoot57 = iRFactory53.parse("0\tSCRIPT 0 1\n", "                                ", 13);
        astRoot57.setPosition(0);
        java.lang.String str61 = astRoot57.toSource(1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot62 = astRoot57.getAstRoot();
        // The following exception was thrown during execution in test generation
        try {
            astRoot9.setLoop((com.google.javascript.rhino.head.ast.Jump) astRoot57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(symbolArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNull(symbol11);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(compilerEnvirons16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNotNull(errorReporter22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 170 + "'", int36 == 170);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 170 + "'", int37 == 170);
        org.junit.Assert.assertNotNull(compilerEnvirons38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(strSet49);
        org.junit.Assert.assertNotNull(errorReporter50);
        org.junit.Assert.assertNotNull(astRoot57);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "  0;\n  SCRIPT;\n  0;\n  1;\n" + "'", str61, "  0;\n  SCRIPT;\n  0;\n  1;\n");
        org.junit.Assert.assertNotNull(astRoot62);
    }

    @Test
    public void test11631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11631");
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
        java.lang.String str20 = scriptNode1.makeIndent(26);
        java.lang.String str21 = scriptNode1.shortName();
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet23 = astRoot22.getComments();
        int int24 = astRoot22.getEndLineno();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor25 = null;
        astRoot22.visitComments(nodeVisitor25);
        com.google.javascript.rhino.head.Node node27 = astRoot22.getFirstChild();
        boolean boolean28 = astRoot22.isInStrictMode();
        java.lang.String str30 = astRoot22.toSource(4);
        com.google.javascript.rhino.head.Token.CommentType commentType34 = null;
        com.google.javascript.rhino.head.ast.Comment comment36 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType34, "");
        boolean boolean37 = comment36.hasSideEffects();
        int int38 = comment36.getLineno();
        com.google.javascript.rhino.head.Node node40 = comment36.setType(18);
        java.lang.Object obj42 = comment36.getProp((int) '#');
        com.google.javascript.rhino.head.ast.AstRoot astRoot44 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet45 = astRoot44.getComments();
        int int46 = astRoot44.getEndLineno();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor47 = null;
        astRoot44.visitComments(nodeVisitor47);
        com.google.javascript.rhino.head.Node node49 = astRoot44.getFirstChild();
        com.google.javascript.rhino.head.ast.Scope scope50 = astRoot44.getEnclosingScope();
        astRoot44.setEncodedSourceStart(23);
        java.lang.String str54 = astRoot44.toSource(95442629);
        com.google.javascript.rhino.head.Token.CommentType commentType57 = null;
        com.google.javascript.rhino.head.ast.Comment comment59 = new com.google.javascript.rhino.head.ast.Comment((int) '#', 2, commentType57, "hi!");
        java.lang.String str61 = comment59.toSource(5);
        astRoot44.setJsDocNode(comment59);
        com.google.javascript.rhino.head.Token.CommentType commentType65 = null;
        com.google.javascript.rhino.head.ast.Comment comment67 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType65, "");
        java.lang.String str69 = comment67.toSource(100);
        java.lang.String str70 = comment67.getValue();
        com.google.javascript.rhino.head.Node node71 = new com.google.javascript.rhino.head.Node((-476424842), (com.google.javascript.rhino.head.Node) comment59, (com.google.javascript.rhino.head.Node) comment67);
        com.google.javascript.rhino.head.Node node72 = node71.getFirstChild();
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node(1879633086, (com.google.javascript.rhino.head.Node) comment36, node71, 1891424362);
        astRoot22.addChildToFront(node71);
        scriptNode1.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot22);
        int int79 = scriptNode1.getIntProp((-1254326248), 95442629);
        org.junit.Assert.assertNull(scopeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(functionNodeList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeItor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                    " + "'", str20, "                                                    ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ScriptNode" + "'", str21, "ScriptNode");
        org.junit.Assert.assertNull(commentSet23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(commentSet45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(scope50);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "          hi!" + "'", str61, "          hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "                                                                                                                                                                                                        " + "'", str69, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 95442629 + "'", int79 == 95442629);
    }

    @Test
    public void test11632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11632");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = scriptNode1.getLastSibling();
        int int6 = scriptNode1.getEndLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator9 = scriptNode8.spliterator();
        com.google.javascript.rhino.head.Node node11 = scriptNode8.setType((int) '#');
        int int12 = scriptNode8.getLineno();
        boolean boolean13 = scriptNode8.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator15 = scriptNode14.spliterator();
        com.google.javascript.rhino.head.Node node17 = scriptNode14.setType((int) '#');
        java.lang.Object obj18 = scriptNode14.getCompilerData();
        com.google.javascript.rhino.head.ast.Symbol symbol20 = scriptNode14.getSymbol("typeof");
        scriptNode14.setEncodedSource("{\n}\n");
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet24 = astRoot23.getComments();
        int int25 = astRoot23.getEndLineno();
        com.google.javascript.rhino.head.Node node27 = astRoot23.setType((int) (short) 10);
        astRoot23.putIntProp(24, (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator35 = scriptNode34.spliterator();
        com.google.javascript.rhino.head.Token.CommentType commentType38 = null;
        com.google.javascript.rhino.head.ast.Comment comment40 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType38, "");
        java.lang.String str42 = comment40.toSource(100);
        java.lang.String str43 = comment40.getValue();
        scriptNode34.setParent((com.google.javascript.rhino.head.ast.AstNode) comment40);
        com.google.javascript.rhino.head.ast.AstRoot astRoot45 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator46 = astRoot45.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType49 = null;
        com.google.javascript.rhino.head.ast.Comment comment51 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType49, "");
        boolean boolean52 = comment51.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType55 = null;
        com.google.javascript.rhino.head.ast.Comment comment57 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType55, "");
        boolean boolean58 = comment57.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType61 = null;
        com.google.javascript.rhino.head.ast.Comment comment63 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType61, "");
        java.lang.String str65 = comment63.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray66 = new com.google.javascript.rhino.head.ast.Comment[] { comment51, comment57, comment63 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet67 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet67, commentArray66);
        astRoot45.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet67);
        boolean boolean70 = astRoot45.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray71 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList72 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList72, symbolArray71);
        astRoot45.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList72);
        com.google.javascript.rhino.head.Node node75 = astRoot45.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode76 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode77 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode76.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode77);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot45, (com.google.javascript.rhino.head.ast.Scope) scriptNode77);
        com.google.javascript.rhino.head.Node node80 = new com.google.javascript.rhino.head.Node(16, (com.google.javascript.rhino.head.Node) scriptNode33, (com.google.javascript.rhino.head.Node) comment40, (com.google.javascript.rhino.head.Node) scriptNode77);
        astRoot23.addComment(comment40);
        com.google.javascript.rhino.head.Node node82 = astRoot23.getLastSibling();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator83 = node82.spliterator();
        com.google.javascript.rhino.head.Node node85 = new com.google.javascript.rhino.head.Node(21, (com.google.javascript.rhino.head.Node) scriptNode8, (com.google.javascript.rhino.head.Node) scriptNode14, node82, (int) (byte) 10);
        int int86 = scriptNode1.compareTo((com.google.javascript.rhino.head.ast.AstNode) scriptNode8);
        java.lang.Class<?> wildcardClass87 = scriptNode1.getClass();
        org.junit.Assert.assertNull(scopeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(nodeSpliterator9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(nodeSpliterator15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(symbol20);
        org.junit.Assert.assertNull(commentSet24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeSpliterator35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "                                                                                                                                                                                                        " + "'", str42, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "                                                                                                                                                                                                        " + "'", str65, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(symbolArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(nodeSpliterator83);
// flaky:         org.junit.Assert.assertTrue("'" + int86 + "' != '" + 129347849 + "'", int86 == 129347849);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test11633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11633");
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
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setRecoverFromErrors(false);
        int int24 = compilerEnvirons0.getLanguageVersion();
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = compilerEnvirons0.getErrorReporter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.EvaluatorException evaluatorException31 = errorReporter25.runtimeError("                                                                                                                                                                                                                                                                                                                                  {\n                                                                                                                                                                                                                                                                                                                                  }\n", "-1", 1081180646, "0\tCOMMENT 0 100\n", 1151769425);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(strSet17);
        org.junit.Assert.assertNotNull(errorReporter18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 170 + "'", int24 == 170);
        org.junit.Assert.assertNotNull(errorReporter25);
    }

    @Test
    public void test11634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11634");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getBaseLineno();
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int3 = astRoot2.getBaseLineno();
        int int4 = astRoot2.getLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode6);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList8 = scriptNode6.getChildScopes();
        int int9 = scriptNode6.getBaseLineno();
        com.google.javascript.rhino.head.Node node10 = scriptNode6.getLastSibling();
        scriptNode6.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode13.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode14);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList16 = scriptNode14.getFunctions();
        scriptNode14.setPosition((int) (byte) 10);
        java.lang.String str19 = scriptNode6.toStringTree(scriptNode14);
        int int20 = scriptNode6.getBaseLineno();
        astRoot2.target = scriptNode6;
        int int22 = astRoot0.compareTo((com.google.javascript.rhino.head.ast.AstNode) scriptNode6);
        int int23 = astRoot0.getEncodedSourceEnd();
        java.lang.String str24 = astRoot0.debugPrint();
        boolean boolean25 = astRoot0.hasSideEffects();
        java.lang.String str26 = astRoot0.toSource();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(scopeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(functionNodeList16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str24, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test11635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11635");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(true);
        int int4 = compilerEnvirons0.getOptimizationLevel();
        int int5 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setXmlAvailable(true);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet13 = compilerEnvirons0.getActivationNames();
        boolean boolean14 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 170 + "'", int5 == 170);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test11636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11636");
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
        com.google.javascript.rhino.head.Node node30 = astRoot0.getFirstChild();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet31 = astRoot0.getComments();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator32 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator33 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator34 = positionComparator32.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator33);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator35 = positionComparator32.reversed();
        com.google.javascript.rhino.head.Token.CommentType commentType38 = null;
        com.google.javascript.rhino.head.ast.Comment comment40 = new com.google.javascript.rhino.head.ast.Comment((int) '#', 2, commentType38, "hi!");
        java.lang.String str42 = comment40.toSource(0);
        java.lang.String str43 = comment40.shortName();
        boolean boolean44 = comment40.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator45 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator46 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator47 = positionComparator45.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator46);
        com.google.javascript.rhino.head.ast.AstRoot astRoot48 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int49 = astRoot48.getBaseLineno();
        java.lang.String str50 = astRoot48.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot51 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator52 = astRoot51.new NodeIterator();
        int int53 = positionComparator46.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot48, (com.google.javascript.rhino.head.ast.AstNode) astRoot51);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator55 = scriptNode54.spliterator();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator56 = scriptNode54.new NodeIterator();
        astRoot51.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode54);
        com.google.javascript.rhino.head.Node node58 = scriptNode54.getFirstChild();
        comment40.addChildrenToFront((com.google.javascript.rhino.head.Node) scriptNode54);
        java.lang.String str60 = comment40.getValue();
        com.google.javascript.rhino.head.Token.CommentType commentType61 = comment40.getCommentType();
        com.google.javascript.rhino.head.ast.AstRoot astRoot62 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet63 = astRoot62.getComments();
        java.lang.String str64 = astRoot62.getSourceName();
        boolean boolean65 = astRoot62.hasChildren();
        int int66 = astRoot62.getLineno();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor67 = null;
        astRoot62.visitComments(nodeVisitor67);
        int int69 = positionComparator32.compare((com.google.javascript.rhino.head.ast.AstNode) comment40, (com.google.javascript.rhino.head.ast.AstNode) astRoot62);
        java.lang.String str70 = astRoot0.toStringTree((com.google.javascript.rhino.head.ast.ScriptNode) astRoot62);
        astRoot0.setLineno(1836062230);
        boolean boolean73 = astRoot0.hasSideEffects();
        java.lang.String str75 = astRoot0.toSource((-307377263));
        int int76 = astRoot0.getLineno();
        int int77 = astRoot0.getEndLineno();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                                                                                                                        " + "'", str20, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(symbolArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(commentSet31);
        org.junit.Assert.assertNotNull(astNodeComparator34);
        org.junit.Assert.assertNotNull(astNodeComparator35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Comment" + "'", str43, "Comment");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(astNodeComparator47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str50, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(nodeSpliterator55);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNull(commentType61);
        org.junit.Assert.assertNull(commentSet63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 36 + "'", int69 == 36);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1836062230 + "'", int76 == 1836062230);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test11637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11637");
        com.google.javascript.rhino.head.ast.Scope scope0 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator1 = scope0.spliterator();
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = scope0.getAstRoot();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode3.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode4);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList6 = scriptNode4.getChildScopes();
        int int7 = scriptNode4.getBaseLineno();
        com.google.javascript.rhino.head.Node node8 = scriptNode4.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode9.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList12 = scriptNode10.getChildScopes();
        java.lang.String str14 = scriptNode10.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode4.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode10, (com.google.javascript.rhino.head.Node) scriptNode16);
        java.lang.String str18 = scriptNode4.getSourceName();
        com.google.javascript.rhino.head.Node node20 = scriptNode4.setType(25);
        scope0.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode4);
        com.google.javascript.rhino.head.ast.Comment comment22 = scriptNode4.getJsDocNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode24.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode25);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList27 = scriptNode25.getChildScopes();
        int int28 = scriptNode25.getBaseLineno();
        int int29 = scriptNode25.getParamCount();
        scriptNode25.flattenSymbolTable(true);
        com.google.javascript.rhino.head.ast.Scope scope32 = scriptNode25.getEnclosingScope();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode33 = scriptNode25.getEnclosingFunction();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList34 = scriptNode25.getFunctions();
        com.google.javascript.rhino.head.ast.Scope scope35 = scriptNode25.getEnclosingScope();
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node(23, (-603115504));
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node((int) (short) 100, (com.google.javascript.rhino.head.Node) scope35, node38, 667127547);
        scriptNode4.setCompilerData((java.lang.Object) node38);
        java.lang.Object obj43 = scriptNode4.getProp(1859345902);
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode46.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode47);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList49 = scriptNode47.getChildScopes();
        int int50 = scriptNode47.getBaseLineno();
        com.google.javascript.rhino.head.Node node51 = scriptNode47.getLastSibling();
        scriptNode47.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode55 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode54.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode55);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList57 = scriptNode55.getFunctions();
        scriptNode55.setPosition((int) (byte) 10);
        java.lang.String str60 = scriptNode47.toStringTree(scriptNode55);
        int int61 = scriptNode47.getBaseLineno();
        com.google.javascript.rhino.head.Node node63 = scriptNode47.setType((int) (byte) -1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor64 = scriptNode47.iterator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator65 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator66 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator67 = positionComparator65.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator66);
        com.google.javascript.rhino.head.ast.AstRoot astRoot68 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int69 = astRoot68.getBaseLineno();
        java.lang.String str70 = astRoot68.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot71 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator72 = astRoot71.new NodeIterator();
        int int73 = positionComparator66.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot68, (com.google.javascript.rhino.head.ast.AstNode) astRoot71);
        boolean boolean74 = astRoot68.isInStrictMode();
        scriptNode47.addChildToFront((com.google.javascript.rhino.head.Node) astRoot68);
        node45.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode47);
        // The following exception was thrown during execution in test generation
        try {
            scriptNode4.setDefault(node45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeSpliterator1);
        org.junit.Assert.assertNull(astRoot2);
        org.junit.Assert.assertNull(scopeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(scopeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(comment22);
        org.junit.Assert.assertNull(scopeList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(scope32);
        org.junit.Assert.assertNull(functionNode33);
        org.junit.Assert.assertNotNull(functionNodeList34);
        org.junit.Assert.assertNotNull(scope35);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(scopeList49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionNodeList57);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(nodeItor64);
        org.junit.Assert.assertNotNull(astNodeComparator67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str70, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test11638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11638");
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
        boolean boolean17 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean18 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(errorReporter6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test11639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11639");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getParamCount();
        java.lang.String str2 = astRoot0.getNextTempName();
        int int3 = astRoot0.getEncodedSourceStart();
        java.lang.String str4 = astRoot0.shortName();
        com.google.javascript.rhino.head.ast.FunctionNode functionNode5 = astRoot0.getEnclosingFunction();
        astRoot0.checkParentLinks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$0" + "'", str2, "$0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AstRoot" + "'", str4, "AstRoot");
        org.junit.Assert.assertNull(functionNode5);
    }

    @Test
    public void test11640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11640");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot((-1096410579));
    }

    @Test
    public void test11641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11641");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList3 = scriptNode1.getFunctions();
        scriptNode1.setPosition((int) (byte) 10);
        int int6 = scriptNode1.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator8 = astRoot7.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType11 = null;
        com.google.javascript.rhino.head.ast.Comment comment13 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType11, "");
        boolean boolean14 = comment13.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType17 = null;
        com.google.javascript.rhino.head.ast.Comment comment19 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType17, "");
        boolean boolean20 = comment19.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType23 = null;
        com.google.javascript.rhino.head.ast.Comment comment25 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType23, "");
        java.lang.String str27 = comment25.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray28 = new com.google.javascript.rhino.head.ast.Comment[] { comment13, comment19, comment25 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet29 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet29, commentArray28);
        astRoot7.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet29);
        boolean boolean32 = astRoot7.isInStrictMode();
        astRoot7.putIntProp(170, (int) (short) 0);
        scriptNode1.addChildScope((com.google.javascript.rhino.head.ast.Scope) astRoot7);
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
        int int67 = astRoot37.getLineno();
        java.lang.String str68 = astRoot37.getNextTempName();
        java.lang.String str69 = astRoot37.getJsDoc();
        com.google.javascript.rhino.head.Token.CommentType commentType72 = null;
        com.google.javascript.rhino.head.ast.Comment comment74 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType72, "");
        java.lang.String str76 = comment74.toSource(100);
        java.lang.String str77 = comment74.getValue();
        boolean boolean78 = comment74.hasSideEffects();
        java.lang.String str79 = comment74.getValue();
        astRoot37.addComment(comment74);
        scriptNode1.setJsDocNode(comment74);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode82 = scriptNode1.getTop();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode84 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator85 = scriptNode84.spliterator();
        scriptNode84.setRelative((int) (byte) 100);
        int int88 = scriptNode84.getRegexpCount();
        int int89 = scriptNode84.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode90 = scriptNode84.getTop();
        scriptNode1.putProp(459405140, (java.lang.Object) scriptNode84);
        boolean boolean92 = scriptNode84.hasSideEffects();
        org.junit.Assert.assertNotNull(functionNodeList3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "                                                                                                                                                                                                        " + "'", str27, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "                                                                                                                                                                                                        " + "'", str57, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(symbolArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "$0" + "'", str68, "$0");
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "                                                                                                                                                                                                        " + "'", str76, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(scriptNode82);
        org.junit.Assert.assertNotNull(nodeSpliterator85);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(scriptNode90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test11642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11642");
        com.google.javascript.rhino.head.ast.Scope scope1 = new com.google.javascript.rhino.head.ast.Scope(18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = scope1.getTop();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode4.removeProp(10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator8 = astRoot7.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor9 = astRoot7.iterator();
        scriptNode4.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot7);
        scope1.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode4);
        com.google.javascript.rhino.head.ast.AstRoot astRoot13 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator14 = astRoot13.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType17 = null;
        com.google.javascript.rhino.head.ast.Comment comment19 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType17, "");
        boolean boolean20 = comment19.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType23 = null;
        com.google.javascript.rhino.head.ast.Comment comment25 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType23, "");
        boolean boolean26 = comment25.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType29 = null;
        com.google.javascript.rhino.head.ast.Comment comment31 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType29, "");
        java.lang.String str33 = comment31.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray34 = new com.google.javascript.rhino.head.ast.Comment[] { comment19, comment25, comment31 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet35 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet35, commentArray34);
        astRoot13.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet35);
        boolean boolean38 = astRoot13.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray39 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList40 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList40, symbolArray39);
        astRoot13.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList40);
        int int43 = astRoot13.getLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator45 = scriptNode44.spliterator();
        com.google.javascript.rhino.head.Node node47 = scriptNode44.setType((int) '#');
        java.lang.Object obj48 = scriptNode44.getCompilerData();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator49 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator50 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator51 = positionComparator49.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator50);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode53.removeProp(10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot56 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator57 = astRoot56.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor58 = astRoot56.iterator();
        scriptNode53.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot56);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode61 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode60.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode61);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList63 = scriptNode61.getChildScopes();
        int int64 = positionComparator50.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot56, (com.google.javascript.rhino.head.ast.AstNode) scriptNode61);
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node(3, (com.google.javascript.rhino.head.Node) astRoot13, (com.google.javascript.rhino.head.Node) scriptNode44, (com.google.javascript.rhino.head.Node) scriptNode61);
        java.lang.String str66 = scriptNode44.toString();
        com.google.javascript.rhino.head.Token.CommentType commentType69 = null;
        com.google.javascript.rhino.head.ast.Comment comment71 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType69, "");
        com.google.javascript.rhino.head.Token.CommentType commentType72 = comment71.getCommentType();
        java.lang.String str74 = comment71.toSource(21);
        com.google.javascript.rhino.head.Token.CommentType commentType75 = comment71.getCommentType();
        scriptNode44.target = comment71;
        scope1.addChildToFront((com.google.javascript.rhino.head.Node) scriptNode44);
        com.google.javascript.rhino.head.ast.Symbol symbol79 = scriptNode44.getSymbol("1755125620\tSCRIPT 1755125620 1\n");
        scriptNode44.setEncodedSource("-1\tSCRIPT -1 -451814955\n");
        org.junit.Assert.assertNull(scriptNode2);
        org.junit.Assert.assertNotNull(nodeItor9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "                                                                                                                                                                                                        " + "'", str33, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(symbolArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(nodeSpliterator45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(astNodeComparator51);
        org.junit.Assert.assertNotNull(nodeItor58);
        org.junit.Assert.assertNull(scopeList63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "35" + "'", str66, "35");
        org.junit.Assert.assertNull(commentType72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "                                          " + "'", str74, "                                          ");
        org.junit.Assert.assertNull(commentType75);
        org.junit.Assert.assertNull(symbol79);
    }

    @Test
    public void test11643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11643");
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
        int int16 = scriptNode1.depth();
        scriptNode1.putIntProp((-837790279), 6);
        java.lang.Object obj20 = scriptNode1.getCompilerData();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(nodeSpliterator4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test11644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11644");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getBaseLineno();
        com.google.javascript.rhino.head.ast.AstRoot astRoot2 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int3 = astRoot2.getBaseLineno();
        int int4 = astRoot2.getLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode5.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode6);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList8 = scriptNode6.getChildScopes();
        int int9 = scriptNode6.getBaseLineno();
        com.google.javascript.rhino.head.Node node10 = scriptNode6.getLastSibling();
        scriptNode6.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode13.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode14);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList16 = scriptNode14.getFunctions();
        scriptNode14.setPosition((int) (byte) 10);
        java.lang.String str19 = scriptNode6.toStringTree(scriptNode14);
        int int20 = scriptNode6.getBaseLineno();
        astRoot2.target = scriptNode6;
        int int22 = astRoot0.compareTo((com.google.javascript.rhino.head.ast.AstNode) scriptNode6);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList23 = astRoot0.getFunctions();
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = astRoot0.getAstRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray25 = astRoot0.getParamAndVarNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(scopeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(functionNodeList16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(functionNodeList23);
        org.junit.Assert.assertNotNull(astRoot24);
    }

    @Test
    public void test11645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11645");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = compilerEnvirons0.getErrorReporter();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean8 = compilerEnvirons0.isGenerateObserverCount();
        java.util.Set<java.lang.String> strSet9 = compilerEnvirons0.getActivationNames();
        int int10 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGenerateDebugInfo(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test11646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11646");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot60 = parser56.parse("24\tSCRIPT 24 1\n", "-", (-1608028689));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(scopeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(nodeItor23);
        org.junit.Assert.assertNotNull(compilerEnvirons24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(compilerEnvirons29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 170 + "'", int37 == 170);
        org.junit.Assert.assertNotNull(compilerEnvirons38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(errorReporter51);
    }

    @Test
    public void test11647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11647");
        com.google.javascript.rhino.head.ast.Scope scope2 = new com.google.javascript.rhino.head.ast.Scope(18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = scope2.getTop();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode5 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode5.removeProp(10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot8 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator9 = astRoot8.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor10 = astRoot8.iterator();
        scriptNode5.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot8);
        scope2.addChildrenToBack((com.google.javascript.rhino.head.Node) scriptNode5);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        java.lang.Object obj15 = scriptNode14.getCompilerData();
        com.google.javascript.rhino.head.ast.Scope scope16 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator17 = scope16.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode18.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode19);
        scope16.setTop(scriptNode19);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) scriptNode14, (com.google.javascript.rhino.head.ast.Scope) scriptNode19);
        java.lang.String str23 = scope2.toStringTree(scriptNode14);
        com.google.javascript.rhino.head.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scriptNode14, node24, (-1728226312));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scriptNode3);
        org.junit.Assert.assertNotNull(nodeItor10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(nodeSpliterator17);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test11648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11648");
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
        scriptNode1.clearParentScope();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(symbolArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11649");
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
        boolean boolean18 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(errorReporter6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test11650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11650");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        boolean boolean4 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean5 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray13 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet14);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet14);
        boolean boolean18 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean19 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean20 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean21 = compilerEnvirons0.isStrictMode();
        java.util.Set<java.lang.String> strSet22 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test11651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11651");
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
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean22 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(errorReporter16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 170 + "'", int17 == 170);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test11652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11652");
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
        boolean boolean22 = scriptNode17.hasSideEffects();
        boolean boolean23 = scriptNode17.hasConsistentReturnUsage();
        boolean boolean24 = scriptNode17.hasChildren();
        java.lang.Object obj25 = scriptNode17.getCompilerData();
        int int26 = scriptNode17.getEncodedSourceEnd();
        org.junit.Assert.assertNull(scopeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(scopeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                                        {\n                                                                                                        }\n" + "'", str19, "                                                                                                        {\n                                                                                                        }\n");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test11653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11653");
        com.google.javascript.rhino.head.Token.CommentType commentType2 = null;
        com.google.javascript.rhino.head.ast.Comment comment4 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType2, "");
        java.lang.String str6 = comment4.toSource(100);
        java.lang.String str7 = comment4.getValue();
        boolean boolean8 = comment4.hasSideEffects();
        int int9 = comment4.depth();
        java.lang.String str10 = comment4.getValue();
        com.google.javascript.rhino.head.Token.CommentType commentType11 = comment4.getCommentType();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comment4.getExistingIntProp(272088821);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                                                                                                                                        " + "'", str6, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(commentType11);
    }

    @Test
    public void test11654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11654");
        com.google.javascript.rhino.head.Token.CommentType commentType2 = null;
        com.google.javascript.rhino.head.ast.Comment comment4 = new com.google.javascript.rhino.head.ast.Comment(1275261773, 1513235393, commentType2, "505759098\tSCRIPT 505759098 1\n");
    }

    @Test
    public void test11655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11655");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet1 = astRoot0.getComments();
        com.google.javascript.rhino.head.ast.Symbol symbol3 = astRoot0.getSymbol("                                                                                                                                                                                                        ");
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = new com.google.javascript.rhino.head.ast.AstRoot((int) '4');
        astRoot0.setCompilerData((java.lang.Object) astRoot5);
        astRoot0.clearParentScope();
        java.lang.String str8 = astRoot0.getNextTempName();
        astRoot0.checkParentLinks();
        boolean boolean10 = astRoot0.isInStrictMode();
        org.junit.Assert.assertNull(commentSet1);
        org.junit.Assert.assertNull(symbol3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$0" + "'", str8, "$0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11656");
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
        com.google.javascript.rhino.head.ast.Scope scope25 = scriptNode15.getDefiningScope("");
        scriptNode15.setPosition((-1222715009));
        scriptNode15.removeChildren();
        java.lang.Object obj30 = scriptNode15.getProp(161);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node31 = scriptNode15.getFinally();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scopeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(functionNodeList9);
        org.junit.Assert.assertNull(scopeList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(astRoot20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "                                                                                                                                                                                                  " + "'", str23, "                                                                                                                                                                                                  ");
        org.junit.Assert.assertNull(scope25);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test11657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11657");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int2 = astRoot1.getBaseLineno();
        com.google.javascript.rhino.head.Node node5 = new com.google.javascript.rhino.head.Node(100, (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node((int) (short) 100, (com.google.javascript.rhino.head.Node) astRoot1, node5);
        int int9 = astRoot1.getIntProp((int) '4', (-110742292));
        int int10 = astRoot1.getEndLineno();
        int int11 = astRoot1.getRegexpCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = new com.google.javascript.rhino.head.CompilerEnvirons();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons13);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode16.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode17);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList19 = scriptNode17.getChildScopes();
        int int20 = scriptNode17.getBaseLineno();
        com.google.javascript.rhino.head.Node node21 = scriptNode17.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode22.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode23);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList25 = scriptNode23.getChildScopes();
        java.lang.String str27 = scriptNode23.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode17.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode23, (com.google.javascript.rhino.head.Node) scriptNode29);
        java.lang.Object obj32 = scriptNode23.getProp((int) (short) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str35 = scriptNode33.toSource((int) '4');
        java.lang.String str36 = scriptNode23.toStringTree(scriptNode33);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons37 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory39 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons37, errorReporter38);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode40.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode41);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList43 = scriptNode41.getChildScopes();
        int int44 = scriptNode41.getBaseLineno();
        int int45 = scriptNode41.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode46.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode47);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList49 = scriptNode47.getFunctions();
        scriptNode47.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope52 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode41.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode47, (com.google.javascript.rhino.head.Node) scope52);
        scriptNode47.setEncodedSourceEnd(18);
        com.google.javascript.rhino.head.Node node56 = iRFactory39.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode47);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons57 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory59 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons57, errorReporter58);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode61 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode60.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode61);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList63 = scriptNode61.getChildScopes();
        int int64 = scriptNode61.getBaseLineno();
        int int65 = scriptNode61.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode66 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode66.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode67);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList69 = scriptNode67.getFunctions();
        scriptNode67.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope72 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode61.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode67, (com.google.javascript.rhino.head.Node) scope72);
        scriptNode67.setEncodedSourceEnd(18);
        com.google.javascript.rhino.head.Node node76 = iRFactory59.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode67);
        scriptNode47.setTop(scriptNode67);
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node(2, (com.google.javascript.rhino.head.Node) scriptNode23, (com.google.javascript.rhino.head.Node) scriptNode47, 10);
        int int82 = scriptNode23.getIntProp(5, 100);
        com.google.javascript.rhino.head.Node node83 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode23);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator84 = node83.spliterator();
        com.google.javascript.rhino.head.Node node85 = new com.google.javascript.rhino.head.Node(22, node83);
        com.google.javascript.rhino.head.ast.Scope scope88 = new com.google.javascript.rhino.head.ast.Scope(0, 7);
        boolean boolean89 = scope88.hasChildren();
        java.lang.String str91 = scope88.toSource((-1020608546));
        node85.addChildrenToFront((com.google.javascript.rhino.head.Node) scope88);
        astRoot1.addChildrenToBack((com.google.javascript.rhino.head.Node) scope88);
        boolean boolean94 = astRoot1.isInStrictMode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-110742292) + "'", int9 == (-110742292));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(scopeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(scopeList25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "                                                                                                        {\n                                                                                                        }\n" + "'", str35, "                                                                                                        {\n                                                                                                        }\n");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(scopeList43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(functionNodeList49);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNull(scopeList63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(functionNodeList69);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 100 + "'", int82 == 100);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(nodeSpliterator84);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "{\n}\n" + "'", str91, "{\n}\n");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test11658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11658");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int2 = compilerEnvirons0.getLanguageVersion();
        boolean boolean3 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setLanguageVersion(0);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean13 = compilerEnvirons12.isReservedKeywordAsIdentifier();
        boolean boolean14 = compilerEnvirons12.getWarnTrailingComma();
        compilerEnvirons12.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet17 = compilerEnvirons12.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter18 = compilerEnvirons12.getErrorReporter();
        java.lang.String[] strArray24 = new java.lang.String[] { "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n", "                                ", "typeof", "                                                                                                                                                                                                        ", "{\n}\n" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet25);
        boolean boolean28 = compilerEnvirons12.isGenerateDebugInfo();
        java.util.Set<java.lang.String> strSet29 = compilerEnvirons12.getActivationNames();
        compilerEnvirons0.setActivationNames(strSet29);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 170 + "'", int2 == 170);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(strSet17);
        org.junit.Assert.assertNotNull(errorReporter18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test11659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11659");
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
        java.lang.String str19 = scriptNode7.toSource(3);
        java.lang.String str20 = scriptNode7.getSourceName();
        com.google.javascript.rhino.head.Node node21 = scriptNode7.getFirstChild();
        org.junit.Assert.assertNull(scopeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(functionNodeList9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "      {\n      }\n" + "'", str19, "      {\n      }\n");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test11660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11660");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet1 = astRoot0.getComments();
        int int2 = astRoot0.getEndLineno();
        com.google.javascript.rhino.head.Node node4 = astRoot0.setType((int) (short) 10);
        astRoot0.putIntProp(24, (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator12 = scriptNode11.spliterator();
        com.google.javascript.rhino.head.Token.CommentType commentType15 = null;
        com.google.javascript.rhino.head.ast.Comment comment17 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType15, "");
        java.lang.String str19 = comment17.toSource(100);
        java.lang.String str20 = comment17.getValue();
        scriptNode11.setParent((com.google.javascript.rhino.head.ast.AstNode) comment17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator23 = astRoot22.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType26 = null;
        com.google.javascript.rhino.head.ast.Comment comment28 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType26, "");
        boolean boolean29 = comment28.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType32 = null;
        com.google.javascript.rhino.head.ast.Comment comment34 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType32, "");
        boolean boolean35 = comment34.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType38 = null;
        com.google.javascript.rhino.head.ast.Comment comment40 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType38, "");
        java.lang.String str42 = comment40.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray43 = new com.google.javascript.rhino.head.ast.Comment[] { comment28, comment34, comment40 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet44 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet44, commentArray43);
        astRoot22.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet44);
        boolean boolean47 = astRoot22.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray48 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList49 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList49, symbolArray48);
        astRoot22.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList49);
        com.google.javascript.rhino.head.Node node52 = astRoot22.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode53.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode54);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot22, (com.google.javascript.rhino.head.ast.Scope) scriptNode54);
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node(16, (com.google.javascript.rhino.head.Node) scriptNode10, (com.google.javascript.rhino.head.Node) comment17, (com.google.javascript.rhino.head.Node) scriptNode54);
        astRoot0.addComment(comment17);
        com.google.javascript.rhino.head.Node node59 = astRoot0.getLastSibling();
        astRoot0.setPosition(16);
        astRoot0.putIntProp((-306271829), 14);
        boolean boolean65 = astRoot0.hasChildren();
        astRoot0.clearParentScope();
        org.junit.Assert.assertNull(commentSet1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeSpliterator12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                                                                                                                                        " + "'", str19, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "                                                                                                                                                                                                        " + "'", str42, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(symbolArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test11661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11661");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(1224437762);
    }

    @Test
    public void test11662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11662");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean3 = compilerEnvirons0.reportWarningAsError();
        java.util.Set<java.lang.String> strSet4 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        boolean boolean6 = compilerEnvirons0.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean8 = compilerEnvirons7.isReservedKeywordAsIdentifier();
        boolean boolean9 = compilerEnvirons7.getWarnTrailingComma();
        compilerEnvirons7.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet12 = compilerEnvirons7.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = compilerEnvirons7.getErrorReporter();
        boolean boolean14 = compilerEnvirons7.isAllowMemberExprAsFunctionName();
        boolean boolean15 = compilerEnvirons7.isGenerateObserverCount();
        compilerEnvirons7.setOptimizationLevel((int) (short) 0);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean19 = compilerEnvirons18.isReservedKeywordAsIdentifier();
        boolean boolean20 = compilerEnvirons18.getWarnTrailingComma();
        compilerEnvirons18.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet23 = compilerEnvirons18.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = compilerEnvirons18.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter24);
        com.google.javascript.rhino.head.Parser parser26 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter24);
        int int27 = compilerEnvirons0.getLanguageVersion();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNotNull(errorReporter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(strSet23);
        org.junit.Assert.assertNotNull(errorReporter24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 170 + "'", int27 == 170);
    }

    @Test
    public void test11663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11663");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode2.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode3);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList5 = scriptNode3.getChildScopes();
        int int6 = scriptNode3.getBaseLineno();
        com.google.javascript.rhino.head.Node node7 = scriptNode3.getLastSibling();
        int int8 = scriptNode3.getEncodedSourceEnd();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator9 = scriptNode3.new NodeIterator();
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
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(9, (com.google.javascript.rhino.head.Node) scriptNode3, node27);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int31 = astRoot30.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        java.lang.Object obj35 = scriptNode34.getCompilerData();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode36.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode37);
        int int39 = scriptNode36.getEndLineno();
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node(170, (com.google.javascript.rhino.head.Node) scriptNode34, (com.google.javascript.rhino.head.Node) scriptNode36);
        com.google.javascript.rhino.head.ast.Scope scope42 = new com.google.javascript.rhino.head.ast.Scope(16);
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((int) 'a', (com.google.javascript.rhino.head.Node) astRoot30, node40, (com.google.javascript.rhino.head.Node) scope42);
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node(644758030, (com.google.javascript.rhino.head.Node) scriptNode3, node40);
        boolean boolean45 = scriptNode3.hasChildren();
        int int46 = scriptNode3.getEncodedSourceStart();
        org.junit.Assert.assertNull(scopeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(scopeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionNodeList21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test11664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11664");
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
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor13 = null;
        astRoot6.visitComments(nodeVisitor13);
        int int15 = astRoot6.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor16 = null;
        astRoot6.visitComments(nodeVisitor16);
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            astRoot6.visitAll(nodeVisitor18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(astNodeComparator2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str5, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeSpliterator10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test11665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11665");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode(764640907);
    }

    @Test
    public void test11666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11666");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        scriptNode1.setEncodedSourceEnd((-505759099));
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int6 = astRoot5.getParamCount();
        java.lang.String str7 = astRoot5.getJsDoc();
        java.lang.String str8 = astRoot5.getNextTempName();
        scriptNode1.setParentScope((com.google.javascript.rhino.head.ast.Scope) astRoot5);
        astRoot5.setInStrictMode(false);
        astRoot5.setEncodedSourceBounds((-777163487), 97);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode15.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode16);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList18 = scriptNode15.getStatements();
        scriptNode15.setLineno((-777447127));
        int int21 = scriptNode15.getEncodedSourceStart();
        java.lang.String str22 = astRoot5.toStringTree(scriptNode15);
        // The following exception was thrown during execution in test generation
        try {
            astRoot5.setBaseLineno((-317066570));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$0" + "'", str8, "$0");
        org.junit.Assert.assertNotNull(astNodeList18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test11667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11667");
        com.google.javascript.rhino.head.Token.CommentType commentType3 = null;
        com.google.javascript.rhino.head.ast.Comment comment5 = new com.google.javascript.rhino.head.ast.Comment((int) '#', 2, commentType3, "hi!");
        java.lang.String str7 = comment5.toSource(0);
        java.lang.String str8 = comment5.shortName();
        boolean boolean9 = comment5.hasConsistentReturnUsage();
        int int10 = comment5.getLineno();
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node((int) (byte) 1, (com.google.javascript.rhino.head.Node) comment5, (-147910580));
        int int13 = comment5.getPosition();
        java.lang.String str15 = comment5.toSource((-75393689));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Comment" + "'", str8, "Comment");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11668");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator1 = astRoot0.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor2 = astRoot0.iterator();
        astRoot0.setInStrictMode(true);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode7.removeProp(10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator11 = astRoot10.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor12 = astRoot10.iterator();
        scriptNode7.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot10);
        int int14 = astRoot10.getEncodedSourceEnd();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet15 = astRoot10.getComments();
        astRoot0.putProp((-476424842), (java.lang.Object) commentSet15);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode18.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode19);
        scriptNode19.setEncodedSourceEnd(11);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap25 = scriptNode24.getSymbolTable();
        scriptNode19.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode24);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList27 = scriptNode19.getStatements();
        com.google.javascript.rhino.head.ast.Scope scope28 = scriptNode19.getEnclosingScope();
        com.google.javascript.rhino.head.ast.AstRoot astRoot29 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int30 = astRoot29.getBaseLineno();
        java.lang.String str31 = astRoot29.debugPrint();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList32 = astRoot29.getSymbols();
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(0, (com.google.javascript.rhino.head.Node) scope28, (com.google.javascript.rhino.head.Node) astRoot29, 0);
        java.lang.String str35 = astRoot29.getSourceName();
        boolean boolean36 = astRoot29.hasSideEffects();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList37 = astRoot29.getStatements();
        java.lang.String str39 = astRoot29.toSource(875237497);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode40.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode41);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList43 = scriptNode41.getFunctions();
        scriptNode41.setPosition((int) (byte) 10);
        int int46 = scriptNode41.getEncodedSourceEnd();
        com.google.javascript.rhino.head.ast.AstRoot astRoot47 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator48 = astRoot47.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType51 = null;
        com.google.javascript.rhino.head.ast.Comment comment53 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType51, "");
        boolean boolean54 = comment53.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType57 = null;
        com.google.javascript.rhino.head.ast.Comment comment59 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType57, "");
        boolean boolean60 = comment59.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType63 = null;
        com.google.javascript.rhino.head.ast.Comment comment65 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType63, "");
        java.lang.String str67 = comment65.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray68 = new com.google.javascript.rhino.head.ast.Comment[] { comment53, comment59, comment65 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet69 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet69, commentArray68);
        astRoot47.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet69);
        boolean boolean72 = astRoot47.isInStrictMode();
        astRoot47.putIntProp(170, (int) (short) 0);
        scriptNode41.addChildScope((com.google.javascript.rhino.head.ast.Scope) astRoot47);
        com.google.javascript.rhino.head.ast.Scope scope77 = com.google.javascript.rhino.head.ast.Scope.splitScope((com.google.javascript.rhino.head.ast.Scope) astRoot47);
        astRoot47.removeChildren();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet79 = astRoot47.getComments();
        astRoot29.setComments(commentSet79);
        astRoot0.setComments(commentSet79);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap82 = astRoot0.getSymbolTable();
        org.junit.Assert.assertNotNull(nodeItor2);
        org.junit.Assert.assertNotNull(nodeItor12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(commentSet15);
        org.junit.Assert.assertNull(strMap25);
        org.junit.Assert.assertNotNull(astNodeList27);
        org.junit.Assert.assertNotNull(scope28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str31, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNotNull(symbolList32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(astNodeList37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(functionNodeList43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "                                                                                                                                                                                                        " + "'", str67, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(scope77);
        org.junit.Assert.assertNotNull(commentSet79);
        org.junit.Assert.assertNull(strMap82);
    }

    @Test
    public void test11669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11669");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode4 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode3.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode4);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList6 = scriptNode4.getChildScopes();
        int int7 = scriptNode4.getBaseLineno();
        com.google.javascript.rhino.head.Node node8 = scriptNode4.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode9 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode9.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode10);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList12 = scriptNode10.getChildScopes();
        java.lang.String str14 = scriptNode10.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode4.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode10, (com.google.javascript.rhino.head.Node) scriptNode16);
        java.lang.Object obj19 = scriptNode10.getProp((int) (short) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str22 = scriptNode20.toSource((int) '4');
        java.lang.String str23 = scriptNode10.toStringTree(scriptNode20);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons24, errorReporter25);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode27.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode28);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList30 = scriptNode28.getChildScopes();
        int int31 = scriptNode28.getBaseLineno();
        int int32 = scriptNode28.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode33.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode34);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList36 = scriptNode34.getFunctions();
        scriptNode34.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope39 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode28.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode34, (com.google.javascript.rhino.head.Node) scope39);
        scriptNode34.setEncodedSourceEnd(18);
        com.google.javascript.rhino.head.Node node43 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode34);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons44 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory46 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons44, errorReporter45);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode47.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode48);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList50 = scriptNode48.getChildScopes();
        int int51 = scriptNode48.getBaseLineno();
        int int52 = scriptNode48.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode53.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode54);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList56 = scriptNode54.getFunctions();
        scriptNode54.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope59 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode48.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode54, (com.google.javascript.rhino.head.Node) scope59);
        scriptNode54.setEncodedSourceEnd(18);
        com.google.javascript.rhino.head.Node node63 = iRFactory46.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode54);
        scriptNode34.setTop(scriptNode54);
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node(2, (com.google.javascript.rhino.head.Node) scriptNode10, (com.google.javascript.rhino.head.Node) scriptNode34, 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = scriptNode34.getTop();
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node(3, (com.google.javascript.rhino.head.Node) scriptNode67);
        int int69 = scriptNode67.getType();
        com.google.javascript.rhino.head.ast.Scope scope70 = scriptNode67.getEnclosingScope();
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node(225099420, (com.google.javascript.rhino.head.Node) scriptNode67, (-51));
        scriptNode67.clearParentScope();
        org.junit.Assert.assertNull(scopeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(scopeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                                                        {\n                                                                                                        }\n" + "'", str22, "                                                                                                        {\n                                                                                                        }\n");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(scopeList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(functionNodeList36);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(scopeList50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(functionNodeList56);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(scriptNode67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 136 + "'", int69 == 136);
        org.junit.Assert.assertNotNull(scope70);
    }

    @Test
    public void test11670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11670");
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
        astRoot0.setPosition(14);
        java.lang.String str29 = astRoot0.getSourceName();
        astRoot0.setInStrictMode(true);
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList32 = astRoot0.getStatements();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                                                                                                                        " + "'", str20, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(astNode26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(astNodeList32);
    }

    @Test
    public void test11671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11671");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean11 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean12 = compilerEnvirons0.isGenerateObserverCount();
        java.util.Set<java.lang.String> strSet13 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean19 = compilerEnvirons18.isReservedKeywordAsIdentifier();
        boolean boolean20 = compilerEnvirons18.isIdeMode();
        boolean boolean21 = compilerEnvirons18.getWarnTrailingComma();
        compilerEnvirons18.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons18.setAllowSharpComments(true);
        compilerEnvirons18.setRecoverFromErrors(true);
        boolean boolean28 = compilerEnvirons18.isRecordingComments();
        boolean boolean29 = compilerEnvirons18.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons30 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean31 = compilerEnvirons30.isReservedKeywordAsIdentifier();
        boolean boolean32 = compilerEnvirons30.isIdeMode();
        boolean boolean33 = compilerEnvirons30.getWarnTrailingComma();
        compilerEnvirons30.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons30.setAllowSharpComments(true);
        compilerEnvirons30.setRecoverFromErrors(true);
        boolean boolean40 = compilerEnvirons30.isRecordingComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons41 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons41.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons44 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean45 = compilerEnvirons44.isReservedKeywordAsIdentifier();
        boolean boolean46 = compilerEnvirons44.getWarnTrailingComma();
        compilerEnvirons44.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet49 = compilerEnvirons44.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter50 = compilerEnvirons44.getErrorReporter();
        java.lang.String[] strArray56 = new java.lang.String[] { "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n", "                                ", "typeof", "                                                                                                                                                                                                        ", "{\n}\n" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        compilerEnvirons44.setActivationNames((java.util.Set<java.lang.String>) strSet57);
        com.google.javascript.rhino.head.ErrorReporter errorReporter60 = compilerEnvirons44.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser61 = new com.google.javascript.rhino.head.Parser(compilerEnvirons41, errorReporter60);
        com.google.javascript.rhino.head.IRFactory iRFactory62 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons30, errorReporter60);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons63 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray69 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        compilerEnvirons63.setActivationNames((java.util.Set<java.lang.String>) strSet70);
        boolean boolean73 = compilerEnvirons63.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter74 = compilerEnvirons63.getErrorReporter();
        compilerEnvirons30.setErrorReporter(errorReporter74);
        compilerEnvirons18.setErrorReporter(errorReporter74);
        com.google.javascript.rhino.head.IRFactory iRFactory77 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter74);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(compilerEnvirons18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons41);
        org.junit.Assert.assertNotNull(compilerEnvirons44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(strSet49);
        org.junit.Assert.assertNotNull(errorReporter50);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(errorReporter60);
        org.junit.Assert.assertNotNull(compilerEnvirons63);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(errorReporter74);
    }

    @Test
    public void test11672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11672");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) 327994914);
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test11673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11673");
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
        com.google.javascript.rhino.head.Node node30 = astRoot0.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode31.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode32);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot0, (com.google.javascript.rhino.head.ast.Scope) scriptNode32);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode35.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode36);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList38 = scriptNode36.getChildScopes();
        int int39 = scriptNode36.getBaseLineno();
        com.google.javascript.rhino.head.Node node40 = scriptNode36.getLastSibling();
        scriptNode36.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode43.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode44);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList46 = scriptNode44.getFunctions();
        scriptNode44.setPosition((int) (byte) 10);
        java.lang.String str49 = scriptNode36.toStringTree(scriptNode44);
        int int50 = scriptNode36.getBaseLineno();
        com.google.javascript.rhino.head.Node node52 = scriptNode36.setType((int) (byte) -1);
        java.lang.String str53 = astRoot0.toStringTree(scriptNode36);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = scriptNode36.getTop();
        scriptNode54.setBounds((-476424842), 816064609);
        java.lang.String str59 = scriptNode54.toSource((-552755211));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                                                                                                                        " + "'", str20, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(symbolArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(scopeList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(functionNodeList46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(scriptNode54);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "{\n}\n" + "'", str59, "{\n}\n");
    }

    @Test
    public void test11674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11674");
        com.google.javascript.rhino.head.ast.AstRoot astRoot1 = new com.google.javascript.rhino.head.ast.AstRoot(129);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode2.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode3);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList5 = scriptNode3.getChildScopes();
        int int6 = scriptNode3.getBaseLineno();
        com.google.javascript.rhino.head.Node node7 = scriptNode3.getLastSibling();
        scriptNode3.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode11 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode10.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode11);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList13 = scriptNode11.getFunctions();
        scriptNode11.setPosition((int) (byte) 10);
        java.lang.String str16 = scriptNode3.toStringTree(scriptNode11);
        int int17 = scriptNode3.getBaseLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode19.removeProp(10);
        com.google.javascript.rhino.head.ast.Scope scope22 = scriptNode19.getParentScope();
        scriptNode3.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode19);
        com.google.javascript.rhino.head.ast.Scope scope25 = new com.google.javascript.rhino.head.ast.Scope(7);
        scriptNode3.target = scope25;
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator28 = astRoot27.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType31 = null;
        com.google.javascript.rhino.head.ast.Comment comment33 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType31, "");
        boolean boolean34 = comment33.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType37 = null;
        com.google.javascript.rhino.head.ast.Comment comment39 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType37, "");
        boolean boolean40 = comment39.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType43 = null;
        com.google.javascript.rhino.head.ast.Comment comment45 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType43, "");
        java.lang.String str47 = comment45.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray48 = new com.google.javascript.rhino.head.ast.Comment[] { comment33, comment39, comment45 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet49 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet49, commentArray48);
        astRoot27.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet49);
        boolean boolean52 = astRoot27.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray53 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList54 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList54, symbolArray53);
        astRoot27.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList54);
        com.google.javascript.rhino.head.Node node57 = astRoot27.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode58 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode58.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode59);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot27, (com.google.javascript.rhino.head.ast.Scope) scriptNode59);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode62 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode62.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode63);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList65 = scriptNode63.getChildScopes();
        int int66 = scriptNode63.getBaseLineno();
        com.google.javascript.rhino.head.Node node67 = scriptNode63.getLastSibling();
        scriptNode63.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode70 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode71 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode70.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode71);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList73 = scriptNode71.getFunctions();
        scriptNode71.setPosition((int) (byte) 10);
        java.lang.String str76 = scriptNode63.toStringTree(scriptNode71);
        int int77 = scriptNode63.getBaseLineno();
        com.google.javascript.rhino.head.Node node79 = scriptNode63.setType((int) (byte) -1);
        java.lang.String str80 = astRoot27.toStringTree(scriptNode63);
        scriptNode63.clearParentScope();
        scriptNode63.setEncodedSourceBounds(10, (int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope.joinScopes(scope25, (com.google.javascript.rhino.head.ast.Scope) scriptNode63);
        int int86 = scope25.getAbsolutePosition();
        int int87 = astRoot1.compareTo((com.google.javascript.rhino.head.ast.AstNode) scope25);
        org.junit.Assert.assertNull(scopeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionNodeList13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "                                                                                                                                                                                                        " + "'", str47, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(symbolArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(scopeList65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(functionNodeList73);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 7 + "'", int86 == 7);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
    }

    @Test
    public void test11675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11675");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(true);
        int int4 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setRecoverFromErrors(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test11676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11676");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str2 = scriptNode0.toSource((int) '4');
        com.google.javascript.rhino.head.Node node3 = scriptNode0.getFirstChild();
        java.lang.Object obj5 = scriptNode0.getProp(18);
        boolean boolean6 = scriptNode0.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.Comment comment7 = scriptNode0.getJsDocNode();
        scriptNode0.setPosition((int) ' ');
        scriptNode0.setEncodedSourceStart(8);
        scriptNode0.setBaseLineno((int) (short) 100);
        int int14 = scriptNode0.getEncodedSourceStart();
        java.util.List<com.google.javascript.rhino.head.ast.AstNode> astNodeList15 = scriptNode0.getStatements();
        boolean boolean16 = scriptNode0.hasSideEffects();
        java.lang.String str17 = scriptNode0.getSourceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        {\n                                                                                                        }\n" + "'", str2, "                                                                                                        {\n                                                                                                        }\n");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(astNodeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test11677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11677");
        com.google.javascript.rhino.head.Token.CommentType commentType2 = null;
        com.google.javascript.rhino.head.ast.Comment comment4 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType2, "");
        com.google.javascript.rhino.head.Token.CommentType commentType5 = comment4.getCommentType();
        com.google.javascript.rhino.head.Token.CommentType commentType6 = null;
        comment4.setCommentType(commentType6);
        java.lang.Object obj9 = comment4.getProp(0);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int11 = astRoot10.getBaseLineno();
        int int12 = astRoot10.getLineno();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode13.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode14);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList16 = scriptNode14.getChildScopes();
        int int17 = scriptNode14.getBaseLineno();
        com.google.javascript.rhino.head.Node node18 = scriptNode14.getLastSibling();
        scriptNode14.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode21.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode22);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList24 = scriptNode22.getFunctions();
        scriptNode22.setPosition((int) (byte) 10);
        java.lang.String str27 = scriptNode14.toStringTree(scriptNode22);
        int int28 = scriptNode14.getBaseLineno();
        astRoot10.target = scriptNode14;
        com.google.javascript.rhino.head.Token.CommentType commentType32 = null;
        com.google.javascript.rhino.head.ast.Comment comment34 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType32, "");
        boolean boolean35 = comment34.hasSideEffects();
        int int36 = comment34.getLineno();
        com.google.javascript.rhino.head.Node node38 = comment34.setType(18);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor39 = node38.iterator();
        int int40 = node38.getLineno();
        scriptNode14.addChildToFront(node38);
        com.google.javascript.rhino.head.ast.Comment comment42 = node38.getJsDocNode();
        com.google.javascript.rhino.head.Token.CommentType commentType45 = null;
        com.google.javascript.rhino.head.ast.Comment comment47 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType45, "");
        boolean boolean48 = comment47.hasSideEffects();
        int int49 = comment47.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope50 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator51 = scope50.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode52.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode53);
        scope50.setTop(scriptNode53);
        comment47.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode53);
        comment4.addChildAfter(node38, (com.google.javascript.rhino.head.Node) scriptNode53);
        com.google.javascript.rhino.head.Node node59 = node38.setType((-447184571));
        org.junit.Assert.assertNull(commentType5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(scopeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(functionNodeList24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeItor39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(comment42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(nodeSpliterator51);
        org.junit.Assert.assertNotNull(node59);
    }

    @Test
    public void test11678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11678");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int1 = astRoot0.getBaseLineno();
        java.lang.String str2 = astRoot0.debugPrint();
        astRoot0.setEncodedSourceBounds((int) (byte) -1, 18);
        com.google.javascript.rhino.head.ast.Scope scope7 = astRoot0.getDefiningScope("136");
        int int8 = astRoot0.getEncodedSourceStart();
        astRoot0.setEndLineno(24);
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
        int int29 = scriptNode12.getType();
        astRoot0.target = scriptNode12;
        com.google.javascript.rhino.head.ast.Scope scope31 = astRoot0.getEnclosingScope();
        astRoot0.setBaseLineno(1397279810);
        com.google.javascript.rhino.head.Node node34 = astRoot0.getLastChild();
        java.lang.Object obj35 = astRoot0.getCompilerData();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str2, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(scopeList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(scopeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-339634738) + "'", int28 == (-339634738));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 136 + "'", int29 == 136);
        org.junit.Assert.assertNull(scope31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test11679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11679");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList3 = scriptNode1.getFunctions();
        scriptNode1.setEncodedSourceStart((int) 'a');
        java.lang.String str7 = scriptNode1.makeIndent((int) (byte) -1);
        int int8 = scriptNode1.getEndLineno();
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
        int int39 = astRoot9.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode40.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode41);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList43 = scriptNode41.getChildScopes();
        int int44 = scriptNode41.getBaseLineno();
        com.google.javascript.rhino.head.Node node45 = scriptNode41.getLastSibling();
        scriptNode41.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode48.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode49);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList51 = scriptNode49.getFunctions();
        scriptNode49.setPosition((int) (byte) 10);
        java.lang.String str54 = scriptNode41.toStringTree(scriptNode49);
        int int55 = scriptNode41.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot9, (com.google.javascript.rhino.head.ast.Scope) scriptNode41);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap57 = scriptNode41.getSymbolTable();
        scriptNode1.setSymbolTable(strMap57);
        com.google.javascript.rhino.head.ast.AstRoot astRoot60 = new com.google.javascript.rhino.head.ast.AstRoot((int) '#');
        java.lang.String str61 = astRoot60.debugPrint();
        com.google.javascript.rhino.head.ast.AstNode astNode62 = astRoot60.getParent();
        boolean boolean63 = astRoot60.hasChildren();
        scriptNode1.addChildrenToBack((com.google.javascript.rhino.head.Node) astRoot60);
        org.junit.Assert.assertNotNull(functionNodeList3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "                                                                                                                                                                                                        " + "'", str29, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(symbolArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(scopeList43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(functionNodeList51);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "35\tSCRIPT 35 1\n" + "'", str61, "35\tSCRIPT 35 1\n");
        org.junit.Assert.assertNull(astNode62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test11680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11680");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int2 = compilerEnvirons0.getLanguageVersion();
        boolean boolean3 = compilerEnvirons0.isGenerateObserverCount();
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = compilerEnvirons0.getErrorReporter();
        boolean boolean6 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 170 + "'", int2 == 170);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(errorReporter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test11681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11681");
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
        java.lang.String str32 = astRoot0.shortName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.FunctionNode functionNode34 = astRoot0.getFunctionNode(966622072);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                                                                                                                        " + "'", str20, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AstRoot" + "'", str32, "AstRoot");
    }

    @Test
    public void test11682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11682");
        com.google.javascript.rhino.head.Token.CommentType commentType2 = null;
        com.google.javascript.rhino.head.ast.Comment comment4 = new com.google.javascript.rhino.head.ast.Comment((-693490944), (-1088649131), commentType2, "                                                    hi!");
    }

    @Test
    public void test11683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11683");
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
        com.google.javascript.rhino.head.Node node23 = astRoot0.setType((int) (short) 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode24.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode25);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList27 = scriptNode25.getFunctions();
        scriptNode25.setEncodedSourceStart((int) 'a');
        java.lang.String str30 = scriptNode25.shortName();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode32.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode33);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList35 = scriptNode33.getChildScopes();
        scriptNode33.setBaseLineno(18);
        scriptNode33.setEndLineno(26);
        com.google.javascript.rhino.head.Node node40 = scriptNode33.getLastSibling();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(1275261773, (com.google.javascript.rhino.head.Node) scriptNode33, 4);
        scriptNode25.setParent((com.google.javascript.rhino.head.ast.AstNode) scriptNode33);
        astRoot0.setParentScope((com.google.javascript.rhino.head.ast.Scope) scriptNode25);
        java.lang.String str45 = astRoot0.debugPrint();
        org.junit.Assert.assertNull(commentSet1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(scopeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionNodeList15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(functionNodeList27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ScriptNode" + "'", str30, "ScriptNode");
        org.junit.Assert.assertNull(scopeList35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "-1\tEOL -1 1\n" + "'", str45, "-1\tEOL -1 1\n");
    }

    @Test
    public void test11684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11684");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("  0;\n  SCRIPT;\n  0;\n  1;\n");
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test11685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11685");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        scriptNode1.setBaseLineno(18);
        scriptNode1.setEndLineno(26);
        boolean boolean8 = scriptNode1.hasChildren();
        boolean boolean9 = scriptNode1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode10 = scriptNode1.getTop();
        org.junit.Assert.assertNull(scopeList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(scriptNode10);
    }

    @Test
    public void test11686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11686");
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
        com.google.javascript.rhino.head.Parser parser13 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        boolean boolean14 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11687");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean11 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setAllowSharpComments(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11688");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean2 = compilerEnvirons1.isReservedKeywordAsIdentifier();
        boolean boolean3 = compilerEnvirons1.isIdeMode();
        boolean boolean4 = compilerEnvirons1.getWarnTrailingComma();
        compilerEnvirons1.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons1.setAllowSharpComments(true);
        boolean boolean9 = compilerEnvirons1.isRecordingLocalJsDocComments();
        compilerEnvirons1.setAllowMemberExprAsFunctionName(true);
        boolean boolean12 = compilerEnvirons1.reportWarningAsError();
        com.google.javascript.rhino.head.Parser parser13 = new com.google.javascript.rhino.head.Parser(compilerEnvirons1);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean15 = compilerEnvirons14.isReservedKeywordAsIdentifier();
        boolean boolean16 = compilerEnvirons14.isIdeMode();
        boolean boolean17 = compilerEnvirons14.getWarnTrailingComma();
        compilerEnvirons14.setAllowMemberExprAsFunctionName(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean21 = compilerEnvirons20.isReservedKeywordAsIdentifier();
        int int22 = compilerEnvirons20.getLanguageVersion();
        int int23 = compilerEnvirons20.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean25 = compilerEnvirons24.isReservedKeywordAsIdentifier();
        compilerEnvirons24.setStrictMode(true);
        compilerEnvirons24.setXmlAvailable(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons30 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean31 = compilerEnvirons30.isReservedKeywordAsIdentifier();
        boolean boolean32 = compilerEnvirons30.getWarnTrailingComma();
        compilerEnvirons30.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet35 = compilerEnvirons30.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter36 = compilerEnvirons30.getErrorReporter();
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons24, errorReporter36);
        com.google.javascript.rhino.head.IRFactory iRFactory38 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons20, errorReporter36);
        com.google.javascript.rhino.head.IRFactory iRFactory39 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons14, errorReporter36);
        com.google.javascript.rhino.head.IRFactory iRFactory40 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter36);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode41.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode42);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList44 = scriptNode42.getChildScopes();
        scriptNode42.setBaseLineno(18);
        scriptNode42.setEndLineno(26);
        com.google.javascript.rhino.head.Node node49 = scriptNode42.getLastSibling();
        java.lang.String str50 = scriptNode42.getEncodedSource();
        com.google.javascript.rhino.head.Node node51 = iRFactory40.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode42);
        com.google.javascript.rhino.head.ast.AstRoot astRoot52 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator53 = astRoot52.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType56 = null;
        com.google.javascript.rhino.head.ast.Comment comment58 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType56, "");
        boolean boolean59 = comment58.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType62 = null;
        com.google.javascript.rhino.head.ast.Comment comment64 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType62, "");
        boolean boolean65 = comment64.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType68 = null;
        com.google.javascript.rhino.head.ast.Comment comment70 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType68, "");
        java.lang.String str72 = comment70.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray73 = new com.google.javascript.rhino.head.ast.Comment[] { comment58, comment64, comment70 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet74 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet74, commentArray73);
        astRoot52.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet74);
        boolean boolean77 = astRoot52.isInStrictMode();
        com.google.javascript.rhino.head.ast.AstNode astNode78 = astRoot52.getParent();
        astRoot52.setEndLineno((int) (short) 0);
        astRoot52.setBounds((int) (short) 1, 16);
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList84 = astRoot52.getSymbols();
        com.google.javascript.rhino.head.Node node85 = new com.google.javascript.rhino.head.Node(1499437464, node51, (com.google.javascript.rhino.head.Node) astRoot52);
        org.junit.Assert.assertNotNull(compilerEnvirons1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 170 + "'", int22 == 170);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 170 + "'", int23 == 170);
        org.junit.Assert.assertNotNull(compilerEnvirons24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(strSet35);
        org.junit.Assert.assertNotNull(errorReporter36);
        org.junit.Assert.assertNull(scopeList44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "                                                                                                                                                                                                        " + "'", str72, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(astNode78);
        org.junit.Assert.assertNotNull(symbolList84);
    }

    @Test
    public void test11689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11689");
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
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setXmlAvailable(true);
        compilerEnvirons0.setRecordingComments(false);
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory24.parse("+=", "                                              {\n                                              }\n", 1836062230);
        java.io.Reader reader29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot32 = iRFactory24.parse(reader29, "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(astRoot28);
    }

    @Test
    public void test11690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11690");
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
        java.lang.String str32 = astRoot0.shortName();
        boolean boolean33 = astRoot0.hasSideEffects();
        int int34 = astRoot0.getEncodedSourceStart();
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList35 = astRoot0.getFunctions();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator36 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator37 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator38 = positionComparator36.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator37);
        com.google.javascript.rhino.head.ast.AstRoot astRoot39 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int40 = astRoot39.getBaseLineno();
        java.lang.String str41 = astRoot39.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator43 = astRoot42.new NodeIterator();
        int int44 = positionComparator37.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot39, (com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator46 = scriptNode45.spliterator();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator47 = scriptNode45.new NodeIterator();
        astRoot42.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode45);
        astRoot42.setInStrictMode(true);
        astRoot0.addChildToBack((com.google.javascript.rhino.head.Node) astRoot42);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = astRoot0.getExistingIntProp((-189032356));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                                                                                                                        " + "'", str20, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AstRoot" + "'", str32, "AstRoot");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(functionNodeList35);
        org.junit.Assert.assertNotNull(astNodeComparator38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str41, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(nodeSpliterator46);
    }

    @Test
    public void test11691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11691");
        com.google.javascript.rhino.head.Token.CommentType commentType2 = null;
        com.google.javascript.rhino.head.ast.Comment comment4 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType2, "");
        boolean boolean5 = comment4.hasSideEffects();
        int int6 = comment4.getLineno();
        com.google.javascript.rhino.head.Node node8 = comment4.setType(18);
        boolean boolean9 = comment4.hasSideEffects();
        int int10 = comment4.getType();
        java.lang.String str11 = comment4.getValue();
        com.google.javascript.rhino.head.Node node12 = comment4.getLastSibling();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 18 + "'", int10 == 18);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test11692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11692");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compilerEnvirons0.getErrorReporter();
        boolean boolean7 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean8 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean9 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean10 = compilerEnvirons0.isXmlAvailable();
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = compilerEnvirons0.getErrorReporter();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel(989140197);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 989140197");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(errorReporter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(errorReporter11);
    }

    @Test
    public void test11693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11693");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        com.google.javascript.rhino.head.Parser parser10 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray19 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        compilerEnvirons13.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        boolean boolean23 = compilerEnvirons13.isRecordingLocalJsDocComments();
        boolean boolean24 = compilerEnvirons13.reportWarningAsError();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean26 = compilerEnvirons25.isReservedKeywordAsIdentifier();
        boolean boolean27 = compilerEnvirons25.getWarnTrailingComma();
        compilerEnvirons25.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet30 = compilerEnvirons25.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter31 = compilerEnvirons25.getErrorReporter();
        boolean boolean32 = compilerEnvirons25.isAllowMemberExprAsFunctionName();
        boolean boolean33 = compilerEnvirons25.isRecordingComments();
        boolean boolean34 = compilerEnvirons25.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean36 = compilerEnvirons35.isReservedKeywordAsIdentifier();
        boolean boolean37 = compilerEnvirons35.getWarnTrailingComma();
        compilerEnvirons35.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet40 = compilerEnvirons35.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter41 = compilerEnvirons35.getErrorReporter();
        boolean boolean42 = compilerEnvirons35.isRecordingComments();
        compilerEnvirons35.setGeneratingSource(false);
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
        com.google.javascript.rhino.head.IRFactory iRFactory64 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons35, errorReporter61);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons65 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray71 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        compilerEnvirons65.setActivationNames((java.util.Set<java.lang.String>) strSet72);
        boolean boolean75 = compilerEnvirons65.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter76 = compilerEnvirons65.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser77 = new com.google.javascript.rhino.head.Parser(compilerEnvirons35, errorReporter76);
        compilerEnvirons25.setErrorReporter(errorReporter76);
        compilerEnvirons13.setErrorReporter(errorReporter76);
        com.google.javascript.rhino.head.IRFactory iRFactory80 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter76);
        boolean boolean81 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean82 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(strSet30);
        org.junit.Assert.assertNotNull(errorReporter31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(strSet40);
        org.junit.Assert.assertNotNull(errorReporter41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 170 + "'", int47 == 170);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 170 + "'", int48 == 170);
        org.junit.Assert.assertNotNull(compilerEnvirons49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(strSet60);
        org.junit.Assert.assertNotNull(errorReporter61);
        org.junit.Assert.assertNotNull(compilerEnvirons65);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(errorReporter76);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test11694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11694");
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
        java.lang.String str25 = astRoot0.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet27 = astRoot26.getComments();
        java.lang.String str28 = astRoot26.getSourceName();
        boolean boolean29 = astRoot26.hasChildren();
        int int30 = astRoot26.getLineno();
        astRoot0.addChildrenToBack((com.google.javascript.rhino.head.Node) astRoot26);
        com.google.javascript.rhino.head.Token.CommentType commentType34 = null;
        com.google.javascript.rhino.head.ast.Comment comment36 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType34, "");
        boolean boolean37 = comment36.hasSideEffects();
        int int38 = comment36.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope39 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator40 = scope39.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode41.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode42);
        scope39.setTop(scriptNode42);
        comment36.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode42);
        com.google.javascript.rhino.head.Token.CommentType commentType46 = comment36.getCommentType();
        astRoot0.setJsDocNode(comment36);
        java.lang.String str49 = comment36.toSource((-339634738));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                                                                                                                        " + "'", str20, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n" + "'", str25, "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n");
        org.junit.Assert.assertNull(commentSet27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(nodeSpliterator40);
        org.junit.Assert.assertNull(commentType46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test11695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11695");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        int int5 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        int int8 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test11696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11696");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                        {\n                                                                                                        }\n", "                                                                                                        {\n                                                                                                        }\n", "", "-1\tSCRIPT -1 1\n", "-1\tSCRIPT -1 1\n" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setGeneratingSource(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean18 = compilerEnvirons17.isReservedKeywordAsIdentifier();
        boolean boolean19 = compilerEnvirons17.getWarnTrailingComma();
        compilerEnvirons17.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet22 = compilerEnvirons17.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compilerEnvirons17.getErrorReporter();
        com.google.javascript.rhino.head.Parser parser24 = new com.google.javascript.rhino.head.Parser(compilerEnvirons0, errorReporter23);
        // The following exception was thrown during execution in test generation
        try {
            errorReporter23.error("-1\tSCRIPT -1 1\n1\t  LSH 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n", "$1", (-367810462), "505759098\tSCRIPT 505759098 1\n", 850021394);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(strSet22);
        org.junit.Assert.assertNotNull(errorReporter23);
    }

    @Test
    public void test11697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11697");
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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode15 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode15.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode16);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList18 = scriptNode16.getFunctions();
        scriptNode16.setEncodedSourceStart((int) 'a');
        java.lang.String str22 = scriptNode16.makeIndent((int) (byte) -1);
        int int23 = scriptNode16.getEndLineno();
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator25 = astRoot24.new NodeIterator();
        com.google.javascript.rhino.head.Token.CommentType commentType28 = null;
        com.google.javascript.rhino.head.ast.Comment comment30 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType28, "");
        boolean boolean31 = comment30.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType34 = null;
        com.google.javascript.rhino.head.ast.Comment comment36 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType34, "");
        boolean boolean37 = comment36.hasSideEffects();
        com.google.javascript.rhino.head.Token.CommentType commentType40 = null;
        com.google.javascript.rhino.head.ast.Comment comment42 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType40, "");
        java.lang.String str44 = comment42.toSource(100);
        com.google.javascript.rhino.head.ast.Comment[] commentArray45 = new com.google.javascript.rhino.head.ast.Comment[] { comment30, comment36, comment42 };
        java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment> commentSet46 = new java.util.TreeSet<com.google.javascript.rhino.head.ast.Comment>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Comment>) commentSet46, commentArray45);
        astRoot24.setComments((java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment>) commentSet46);
        boolean boolean49 = astRoot24.isInStrictMode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray50 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList51 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList51, symbolArray50);
        astRoot24.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList51);
        int int54 = astRoot24.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode55 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode56 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode55.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode56);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList58 = scriptNode56.getChildScopes();
        int int59 = scriptNode56.getBaseLineno();
        com.google.javascript.rhino.head.Node node60 = scriptNode56.getLastSibling();
        scriptNode56.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode64 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode63.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode64);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList66 = scriptNode64.getFunctions();
        scriptNode64.setPosition((int) (byte) 10);
        java.lang.String str69 = scriptNode56.toStringTree(scriptNode64);
        int int70 = scriptNode56.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot24, (com.google.javascript.rhino.head.ast.Scope) scriptNode56);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap72 = scriptNode56.getSymbolTable();
        scriptNode16.setSymbolTable(strMap72);
        scriptNode7.setSymbolTable(strMap72);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode76 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode76.removeProp(10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot79 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator80 = astRoot79.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor81 = astRoot79.iterator();
        scriptNode76.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot79);
        com.google.javascript.rhino.head.ast.NodeVisitor nodeVisitor83 = null;
        astRoot79.visitComments(nodeVisitor83);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode85 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str87 = scriptNode85.toSource((int) '4');
        com.google.javascript.rhino.head.Node node88 = scriptNode85.getFirstChild();
        astRoot79.addChildToBack((com.google.javascript.rhino.head.Node) scriptNode85);
        com.google.javascript.rhino.head.ast.Scope scope90 = scriptNode85.getEnclosingScope();
        // The following exception was thrown during execution in test generation
        try {
            int int91 = scriptNode7.getIndexForNameNode((com.google.javascript.rhino.head.Node) scriptNode85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scopeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(scopeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(functionNodeList18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "                                                                                                                                                                                                        " + "'", str44, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(symbolArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNull(scopeList58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(functionNodeList66);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertNotNull(nodeItor81);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "                                                                                                        {\n                                                                                                        }\n" + "'", str87, "                                                                                                        {\n                                                                                                        }\n");
        org.junit.Assert.assertNull(node88);
        org.junit.Assert.assertNull(scope90);
    }

    @Test
    public void test11698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11698");
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
        java.lang.String str25 = astRoot0.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet27 = astRoot26.getComments();
        java.lang.String str28 = astRoot26.getSourceName();
        boolean boolean29 = astRoot26.hasChildren();
        int int30 = astRoot26.getLineno();
        astRoot0.addChildrenToBack((com.google.javascript.rhino.head.Node) astRoot26);
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = astRoot0.getAstRoot();
        com.google.javascript.rhino.head.Node node33 = astRoot32.getLastSibling();
        astRoot32.setEncodedSourceStart((-1116244898));
        com.google.javascript.rhino.head.Token.CommentType commentType38 = null;
        com.google.javascript.rhino.head.ast.Comment comment40 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType38, "");
        boolean boolean41 = comment40.hasSideEffects();
        int int42 = comment40.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope43 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator44 = scope43.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode45.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode46);
        scope43.setTop(scriptNode46);
        comment40.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode46);
        java.lang.String str51 = comment40.toSource((-1));
        astRoot32.addComment(comment40);
        astRoot32.setLength(0);
        int int55 = astRoot32.getFunctionCount();
        com.google.javascript.rhino.head.ast.Scope scope56 = astRoot32.getParentScope();
        com.google.javascript.rhino.head.ast.Scope scope57 = astRoot32.getParentScope();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                                                                                                                        " + "'", str20, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n" + "'", str25, "-1\tSCRIPT -1 1\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n1\t  COMMENT 2 0\n");
        org.junit.Assert.assertNull(commentSet27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(astRoot32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(nodeSpliterator44);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(scope56);
        org.junit.Assert.assertNull(scope57);
    }

    @Test
    public void test11699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11699");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator1 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator2 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator1);
        com.google.javascript.rhino.head.ast.AstRoot astRoot3 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int4 = astRoot3.getBaseLineno();
        java.lang.String str5 = astRoot3.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = astRoot6.new NodeIterator();
        int int8 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot3, (com.google.javascript.rhino.head.ast.AstNode) astRoot6);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator9 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator10 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator11 = positionComparator9.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator10);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator12 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator13 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator14 = positionComparator12.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator13);
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int16 = astRoot15.getBaseLineno();
        java.lang.String str17 = astRoot15.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator19 = astRoot18.new NodeIterator();
        int int20 = positionComparator13.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot15, (com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator21 = positionComparator9.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator13);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator22 = positionComparator1.thenComparing(astNodeComparator21);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator23 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator24 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator25 = positionComparator23.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator24);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator26 = positionComparator23.reversed();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator27 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator28 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator29 = positionComparator27.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator28);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator30 = astNodeComparator29.reversed();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator31 = positionComparator23.thenComparing(astNodeComparator30);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator32 = positionComparator1.thenComparing(astNodeComparator30);
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator33 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator34 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator35 = positionComparator33.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator34);
        com.google.javascript.rhino.head.ast.AstRoot astRoot36 = new com.google.javascript.rhino.head.ast.AstRoot();
        int int37 = astRoot36.getBaseLineno();
        java.lang.String str38 = astRoot36.debugPrint();
        com.google.javascript.rhino.head.ast.AstRoot astRoot39 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator40 = astRoot39.new NodeIterator();
        int int41 = positionComparator34.compare((com.google.javascript.rhino.head.ast.AstNode) astRoot36, (com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode42.putIntProp((int) (short) 1, 1);
        java.lang.String str46 = scriptNode42.getEncodedSource();
        com.google.javascript.rhino.head.ast.Scope scope47 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator48 = scope47.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode49.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode50);
        scope47.setTop(scriptNode50);
        scope47.setLineno((int) (short) -1);
        int int55 = positionComparator34.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode42, (com.google.javascript.rhino.head.ast.AstNode) scope47);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode56 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode56.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode57);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList59 = scriptNode57.getChildScopes();
        int int60 = scriptNode57.getBaseLineno();
        int int61 = scriptNode57.getParamCount();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode62 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode62.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode63);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList65 = scriptNode63.getFunctions();
        scriptNode63.setPosition((int) (byte) 10);
        com.google.javascript.rhino.head.ast.Scope scope68 = new com.google.javascript.rhino.head.ast.Scope();
        scriptNode57.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode63, (com.google.javascript.rhino.head.Node) scope68);
        scriptNode63.setEncodedSource("-1\tSCRIPT -1 1\n");
        java.lang.String str72 = scriptNode42.toStringTree(scriptNode63);
        com.google.javascript.rhino.head.Token.CommentType commentType75 = null;
        com.google.javascript.rhino.head.ast.Comment comment77 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType75, "");
        boolean boolean78 = comment77.hasSideEffects();
        int int79 = comment77.getLineno();
        com.google.javascript.rhino.head.ast.Scope scope80 = new com.google.javascript.rhino.head.ast.Scope();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator81 = scope80.spliterator();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode82 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode83 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode82.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode83);
        scope80.setTop(scriptNode83);
        comment77.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode83);
        int int87 = positionComparator1.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode42, (com.google.javascript.rhino.head.ast.AstNode) scriptNode83);
        com.google.javascript.rhino.head.ast.AstNode astNode88 = scriptNode83.getParent();
        com.google.javascript.rhino.head.Node node90 = astNode88.setType((-643276093));
        org.junit.Assert.assertNotNull(astNodeComparator2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str5, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(astNodeComparator11);
        org.junit.Assert.assertNotNull(astNodeComparator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str17, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(astNodeComparator21);
        org.junit.Assert.assertNotNull(astNodeComparator22);
        org.junit.Assert.assertNotNull(astNodeComparator25);
        org.junit.Assert.assertNotNull(astNodeComparator26);
        org.junit.Assert.assertNotNull(astNodeComparator29);
        org.junit.Assert.assertNotNull(astNodeComparator30);
        org.junit.Assert.assertNotNull(astNodeComparator31);
        org.junit.Assert.assertNotNull(astNodeComparator32);
        org.junit.Assert.assertNotNull(astNodeComparator35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-1\tSCRIPT -1 1\n" + "'", str38, "-1\tSCRIPT -1 1\n");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(nodeSpliterator48);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(scopeList59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(functionNodeList65);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(nodeSpliterator81);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertNotNull(astNode88);
        org.junit.Assert.assertNotNull(node90);
    }

    @Test
    public void test11700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11700");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        boolean boolean5 = compilerEnvirons0.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        boolean boolean7 = compilerEnvirons0.recoverFromErrors();
        java.util.Set<java.lang.String> strSet8 = compilerEnvirons0.getActivationNames();
        boolean boolean9 = compilerEnvirons0.isGenerateObserverCount();
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11701");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(true);
        int int4 = compilerEnvirons0.getOptimizationLevel();
        int int5 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setXmlAvailable(true);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setXmlAvailable(true);
        boolean boolean13 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 170 + "'", int5 == 170);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11702");
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot14 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet15 = astRoot14.getComments();
        com.google.javascript.rhino.head.ast.Symbol symbol17 = astRoot14.getSymbol("                                                                                                                                                                                                        ");
        com.google.javascript.rhino.head.Token.CommentType commentType20 = null;
        com.google.javascript.rhino.head.ast.Comment comment22 = new com.google.javascript.rhino.head.ast.Comment(16, (int) (byte) 0, commentType20, "hi!");
        astRoot14.addChildrenToFront((com.google.javascript.rhino.head.Node) comment22);
        boolean boolean24 = astRoot14.hasSideEffects();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode25.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode26);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList28 = scriptNode26.getChildScopes();
        int int29 = scriptNode26.getBaseLineno();
        int int30 = scriptNode26.getParamCount();
        java.util.List<com.google.javascript.rhino.head.ast.Symbol> symbolList31 = scriptNode26.getSymbols();
        int int32 = scriptNode26.getPosition();
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
        com.google.javascript.rhino.head.Node node69 = new com.google.javascript.rhino.head.Node(19, (com.google.javascript.rhino.head.Node) astRoot14, (com.google.javascript.rhino.head.Node) scriptNode26, (com.google.javascript.rhino.head.Node) astRoot33, (int) (byte) 1);
        scriptNode26.setRelative(574921099);
        java.lang.String str73 = scriptNode26.toSource(4);
        // The following exception was thrown during execution in test generation
        try {
            scriptNode1.setFinally((com.google.javascript.rhino.head.Node) scriptNode26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(symbolArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(commentSet15);
        org.junit.Assert.assertNull(symbol17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(scopeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(symbolList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "                                                                                                                                                                                                        " + "'", str53, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(symbolArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "        {\n        }\n" + "'", str73, "        {\n        }\n");
    }

    @Test
    public void test11703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11703");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setStrictMode(true);
        int int7 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        int int10 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setWarnTrailingComma(false);
        java.util.Set<java.lang.String> strSet13 = compilerEnvirons0.getActivationNames();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel(1144873595);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 1144873595");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 170 + "'", int7 == 170);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 170 + "'", int10 == 170);
        org.junit.Assert.assertNull(strSet13);
    }

    @Test
    public void test11704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11704");
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator0 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator1 = positionComparator0.reversed();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator2 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        com.google.javascript.rhino.head.ast.AstNode.PositionComparator positionComparator3 = new com.google.javascript.rhino.head.ast.AstNode.PositionComparator();
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator4 = positionComparator2.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator3);
        java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode> astNodeComparator5 = positionComparator0.thenComparing((java.util.Comparator<com.google.javascript.rhino.head.ast.AstNode>) positionComparator2);
        com.google.javascript.rhino.head.ast.AstRoot astRoot6 = new com.google.javascript.rhino.head.ast.AstRoot();
        java.util.SortedSet<com.google.javascript.rhino.head.ast.Comment> commentSet7 = astRoot6.getComments();
        int int8 = astRoot6.getEndLineno();
        com.google.javascript.rhino.head.Node node10 = astRoot6.setType((int) (short) 10);
        astRoot6.putIntProp(24, (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = new com.google.javascript.rhino.head.ast.ScriptNode((int) (short) 1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator18 = scriptNode17.spliterator();
        com.google.javascript.rhino.head.Token.CommentType commentType21 = null;
        com.google.javascript.rhino.head.ast.Comment comment23 = new com.google.javascript.rhino.head.ast.Comment((int) (byte) 1, 0, commentType21, "");
        java.lang.String str25 = comment23.toSource(100);
        java.lang.String str26 = comment23.getValue();
        scriptNode17.setParent((com.google.javascript.rhino.head.ast.AstNode) comment23);
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
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray54 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList55 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList55, symbolArray54);
        astRoot28.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList55);
        com.google.javascript.rhino.head.Node node58 = astRoot28.getFirstChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode59 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode59.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode60);
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot28, (com.google.javascript.rhino.head.ast.Scope) scriptNode60);
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node(16, (com.google.javascript.rhino.head.Node) scriptNode16, (com.google.javascript.rhino.head.Node) comment23, (com.google.javascript.rhino.head.Node) scriptNode60);
        astRoot6.addComment(comment23);
        com.google.javascript.rhino.head.Node node65 = astRoot6.getLastSibling();
        astRoot6.setPosition(16);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode69 = new com.google.javascript.rhino.head.ast.ScriptNode(24);
        astRoot6.addChildScope((com.google.javascript.rhino.head.ast.Scope) scriptNode69);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode71 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode72 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode71.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode72);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode74 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray75 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList76 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList76, symbolArray75);
        scriptNode74.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList76);
        scriptNode71.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList76);
        int int80 = positionComparator0.compare((com.google.javascript.rhino.head.ast.AstNode) scriptNode69, (com.google.javascript.rhino.head.ast.AstNode) scriptNode71);
        com.google.javascript.rhino.head.ast.Scope scope81 = scriptNode69.getParentScope();
        java.lang.String str82 = scriptNode69.getSourceName();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator83 = scriptNode69.new NodeIterator();
        org.junit.Assert.assertNotNull(astNodeComparator1);
        org.junit.Assert.assertNotNull(astNodeComparator4);
        org.junit.Assert.assertNotNull(astNodeComparator5);
        org.junit.Assert.assertNull(commentSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeSpliterator18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "                                                                                                                                                                                                        " + "'", str25, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "                                                                                                                                                                                                        " + "'", str48, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(symbolArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(symbolArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 25 + "'", int80 == 25);
        org.junit.Assert.assertNotNull(scope81);
        org.junit.Assert.assertNull(str82);
    }

    @Test
    public void test11705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11705");
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode0 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode1 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode0.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode1);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList3 = scriptNode1.getChildScopes();
        int int4 = scriptNode1.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope scope5 = scriptNode1.getEnclosingScope();
        com.google.javascript.rhino.head.Node node6 = scriptNode1.target;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode8 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode7.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode8);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList10 = scriptNode8.getChildScopes();
        int int11 = scriptNode8.getBaseLineno();
        com.google.javascript.rhino.head.Node node12 = scriptNode8.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode13.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode14);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList16 = scriptNode14.getChildScopes();
        java.lang.String str18 = scriptNode14.makeIndent((int) (byte) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode8.addChildAfter((com.google.javascript.rhino.head.Node) scriptNode14, (com.google.javascript.rhino.head.Node) scriptNode20);
        java.lang.Object obj23 = scriptNode14.getProp((int) (short) -1);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = new com.google.javascript.rhino.head.ast.ScriptNode();
        java.lang.String str26 = scriptNode24.toSource((int) '4');
        java.lang.String str27 = scriptNode14.toStringTree(scriptNode24);
        scriptNode24.setLength((-1));
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = new com.google.javascript.rhino.head.ast.ScriptNode(0);
        scriptNode31.removeProp(10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = new com.google.javascript.rhino.head.ast.AstRoot();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator35 = astRoot34.new NodeIterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor36 = astRoot34.iterator();
        scriptNode31.replaceWith((com.google.javascript.rhino.head.ast.Scope) astRoot34);
        java.lang.String str38 = scriptNode31.toString();
        scriptNode24.setCompilerData((java.lang.Object) scriptNode31);
        boolean boolean40 = scriptNode24.hasSideEffects();
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
        com.google.javascript.rhino.head.ast.Symbol[] symbolArray67 = new com.google.javascript.rhino.head.ast.Symbol[] {};
        java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol> symbolList68 = new java.util.ArrayList<com.google.javascript.rhino.head.ast.Symbol>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.head.ast.Symbol>) symbolList68, symbolArray67);
        astRoot41.setSymbols((java.util.List<com.google.javascript.rhino.head.ast.Symbol>) symbolList68);
        int int71 = astRoot41.getEncodedSourceStart();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode72 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode73 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode72.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode73);
        java.util.List<com.google.javascript.rhino.head.ast.Scope> scopeList75 = scriptNode73.getChildScopes();
        int int76 = scriptNode73.getBaseLineno();
        com.google.javascript.rhino.head.Node node77 = scriptNode73.getLastSibling();
        scriptNode73.setPosition(24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode80 = new com.google.javascript.rhino.head.ast.ScriptNode();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode81 = new com.google.javascript.rhino.head.ast.ScriptNode();
        scriptNode80.addChild((com.google.javascript.rhino.head.ast.AstNode) scriptNode81);
        java.util.List<com.google.javascript.rhino.head.ast.FunctionNode> functionNodeList83 = scriptNode81.getFunctions();
        scriptNode81.setPosition((int) (byte) 10);
        java.lang.String str86 = scriptNode73.toStringTree(scriptNode81);
        int int87 = scriptNode73.getBaseLineno();
        com.google.javascript.rhino.head.ast.Scope.joinScopes((com.google.javascript.rhino.head.ast.Scope) astRoot41, (com.google.javascript.rhino.head.ast.Scope) scriptNode73);
        java.util.Map<java.lang.String, com.google.javascript.rhino.head.ast.Symbol> strMap89 = scriptNode73.getSymbolTable();
        scriptNode24.setSymbolTable(strMap89);
        scriptNode1.setSymbolTable(strMap89);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode93 = new com.google.javascript.rhino.head.ast.ScriptNode((-451814955));
        boolean boolean94 = scriptNode93.hasChildren();
        scriptNode1.setParentScope((com.google.javascript.rhino.head.ast.Scope) scriptNode93);
        com.google.javascript.rhino.head.Node node96 = scriptNode1.getLastSibling();
        com.google.javascript.rhino.head.ast.Comment comment97 = scriptNode1.getJsDocNode();
        java.lang.String str98 = scriptNode1.shortName();
        org.junit.Assert.assertNull(scopeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(scopeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(scopeList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "                                                                                                        {\n                                                                                                        }\n" + "'", str26, "                                                                                                        {\n                                                                                                        }\n");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(nodeItor36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "136" + "'", str38, "136");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "                                                                                                                                                                                                        " + "'", str61, "                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(commentArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(symbolArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNull(scopeList75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(functionNodeList83);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(strMap89);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(node96);
        org.junit.Assert.assertNull(comment97);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "ScriptNode" + "'", str98, "ScriptNode");
    }

    @Test
    public void test11706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11706");
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = scriptNode1.getAstRoot();
        java.lang.String str22 = scriptNode1.getSourceName();
        scriptNode1.setSourceName("                                {\n                                }\n");
        scriptNode1.setEndLineno(449877373);
        org.junit.Assert.assertNull(scopeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(functionNodeList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(astRoot21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "typeof" + "'", str22, "typeof");
    }
}
