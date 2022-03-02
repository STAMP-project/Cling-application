import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), node1, node2, node3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            node4.addChildToBack(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo5 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = node1.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 100.0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = node6.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 100.0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int6 = node5.getType();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(0, node5, node7, node15, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 45 + "'", int6 == 45);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int5 = node4.getType();
        // The following exception was thrown during execution in test generation
        try {
            node4.setSideEffectFlags((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got SHEQ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 45 + "'", int5 == 45);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(1, node5, node6, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder7 = node6.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        node12.setVarArgs(true);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) 'a', node6, node12, node20);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder28 = node27.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean34 = node33.isDefaultCase();
        node33.setVarArgs(true);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) 'a', node27, node33, node41);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 10, node6, node42, 36, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: first new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder28);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node41);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean7 = node6.isDefaultCase();
        node6.setVarArgs(true);
        node6.setVarArgs(false);
        node6.setLength((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = node1.removeChildAfter(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int16 = node15.getType();
        boolean boolean17 = node15.isBlock();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node9, node15, (int) (byte) 10, 44);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder26 = node25.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node34 = node31.useSourceInfoIfMissingFromForTree(node33);
        // The following exception was thrown during execution in test generation
        try {
            node9.addChildAfter(node25, node31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder26);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int5 = node4.getType();
        // The following exception was thrown during execution in test generation
        try {
            node4.setDouble((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SHEQ  1 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 45 + "'", int5 == 45);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean2 = node1.isGetProp();
        boolean boolean3 = node1.isNumber();
        // The following exception was thrown during execution in test generation
        try {
            node1.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        boolean boolean8 = node6.isExprResult();
        boolean boolean9 = node6.isWhile();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags11 = new com.google.javascript.rhino.Node.SideEffectFlags(100);
        sideEffectFlags11.setAllFlags();
        // The following exception was thrown during execution in test generation
        try {
            node6.setSideEffectFlags(sideEffectFlags11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        node4.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId8 = node4.getInputId();
        node4.detachChildren();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) '#', "SHEQ  1 [var_args_name: 1]\n", 30, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = node4.clonePropsFrom(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Node has existing properties.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId8);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry2.registerPropertyOnType("hi!", jSType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node9 = node6.useSourceInfoIfMissingFromForTree(node8);
        node9.setLineno(10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder18 = node17.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean24 = node23.isDefaultCase();
        node23.setVarArgs(true);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) 'a', node17, node23, node31);
        boolean boolean33 = node32.isGetterDef();
        boolean boolean34 = node32.isQuotedString();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int40 = node39.getType();
        node39.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int48 = node47.getType();
        node47.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(40, node9, node32, node39, node47);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node59 = node56.useSourceInfoIfMissingFromForTree(node58);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean62 = node61.isFalse();
        boolean boolean63 = node58.hasChild(node61);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean69 = node68.isDefaultCase();
        node68.setVarArgs(true);
        node68.setVarArgs(false);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable74 = node68.getAncestors();
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node82 = node79.useSourceInfoIfMissingFromForTree(node81);
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean88 = node87.isDefaultCase();
        node87.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId91 = node87.getInputId();
        node87.detachChildren();
        com.google.javascript.rhino.Node node93 = node81.copyInformationFrom(node87);
        int int94 = node87.getType();
        boolean boolean95 = node87.isFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node96 = new com.google.javascript.rhino.Node((int) (short) -1, node32, node61, node68, node87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 45 + "'", int40 == 45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 45 + "'", int48 == 45);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(ancestorIterable74);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(inputId91);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 45 + "'", int94 == 45);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node8 = node5.useSourceInfoIfMissingFromForTree(node7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean11 = node10.isFalse();
        boolean boolean12 = node7.hasChild(node10);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder20 = node19.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean26 = node25.isDefaultCase();
        node25.setVarArgs(true);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) 'a', node19, node25, node33);
        boolean boolean35 = node34.isGetterDef();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(45, node34, node37, 44, 16);
        int int41 = node40.getChildCount();
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node50 = node47.useSourceInfoIfMissingFromForTree(node49);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean53 = node52.isFalse();
        boolean boolean54 = node49.hasChild(node52);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(0, node10, node40, node42, node52, (int) (short) 0, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        node12.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId16 = node12.getInputId();
        node12.detachChildren();
        com.google.javascript.rhino.Node node18 = node6.copyInformationFrom(node12);
        java.lang.String str19 = node12.toStringTree();
        int int20 = node12.getCharno();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = node25.getParent();
        int int27 = node25.getChildCount();
        int int29 = node25.getIntProp(0);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean33 = node32.isGetProp();
        boolean boolean34 = node32.isNumber();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder40 = node39.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int46 = node45.getType();
        boolean boolean47 = node45.isBlock();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (short) 10, node32, node39, node45, (int) (byte) 10, 44);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder56 = node55.getJsDocBuilderForNode();
        node50.addChildrenToFront(node55);
        // The following exception was thrown during execution in test generation
        try {
            node12.addChildBefore(node25, node55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "SHEQ  1 [var_args_name: 1]\n" + "'", str19, "SHEQ  1 [var_args_name: 1]\n");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder40);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 45 + "'", int46 == 45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder56);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        int int0 = com.google.javascript.rhino.Node.OPT_ARG_NAME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 37 + "'", int0 == 37);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node5.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean12 = node11.isDefaultCase();
        node11.setVarArgs(true);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) 'a', node5, node11, node19);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node19);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node29 = node26.useSourceInfoIfMissingFromForTree(node28);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean32 = node31.isFalse();
        boolean boolean33 = node28.hasChild(node31);
        com.google.javascript.rhino.Node node34 = node19.useSourceInfoFromForTree(node28);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo35 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(staticSourceFile21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        int int0 = com.google.javascript.rhino.Node.SLASH_V;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 54 + "'", int0 == 54);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        com.google.javascript.rhino.jstype.FunctionType functionType68 = parameterizedType67.getConstructor();
        boolean boolean69 = parameterizedType67.isNominalType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = parameterizedType67.hasAnyTemplateInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertNull(functionType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = functionType66.isString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isBooleanObjectType();
        com.google.javascript.rhino.jstype.JSType jSType69 = parameterizedType67.autobox();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable74 = jSTypeRegistry72.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean75 = jSTypeRegistry72.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray77 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList78 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList78, jSTypeArray77);
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry72.createFunctionTypeWithVarArgs(jSType76, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList78);
        boolean boolean81 = jSType69.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType80);
        boolean boolean82 = jSType69.isEmptyType();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertNotNull(jSTypeIterable74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(jSTypeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        int int0 = com.google.javascript.rhino.Node.EMPTY_BLOCK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 39 + "'", int0 == 39);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        boolean boolean69 = parameterizedType67.isConstructor();
        boolean boolean70 = parameterizedType67.isEmptyType();
        boolean boolean71 = parameterizedType67.isStringObjectType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str72 = parameterizedType67.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableList18.spliterator();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = node24.useSourceInfoIfMissingFromForTree(node26);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean30 = node29.isFalse();
        boolean boolean31 = node26.hasChild(node29);
        boolean boolean32 = strComparableList18.contains((java.lang.Object) boolean31);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = strComparableList18.remove((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean31 = enumType29.isPropertyTypeDeclared("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = enumType29.getOwnPropertyJSDocInfo("SHEQ  1 [var_args_name: 1]\n");
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate34 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = enumType29.setValidator(jSTypePredicate34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(jSDocInfo33);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType27.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType31 = functionType30.getImplicitPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertNull(functionType30);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node9 = node6.useSourceInfoIfMissingFromForTree(node8);
        node9.setLineno(10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder18 = node17.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean24 = node23.isDefaultCase();
        node23.setVarArgs(true);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) 'a', node17, node23, node31);
        boolean boolean33 = node32.isGetterDef();
        boolean boolean34 = node32.isQuotedString();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int40 = node39.getType();
        node39.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int48 = node47.getType();
        node47.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(40, node9, node32, node39, node47);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder58 = node57.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean64 = node63.isDefaultCase();
        node63.setVarArgs(true);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) 'a', node57, node63, node71);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder79 = node78.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean85 = node84.isDefaultCase();
        node84.setVarArgs(true);
        com.google.javascript.rhino.Node node92 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node93 = new com.google.javascript.rhino.Node((int) 'a', node78, node84, node92);
        boolean boolean94 = node78.isScript();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder95 = node78.new FileLevelJsDocBuilder();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node96 = new com.google.javascript.rhino.Node(100, node51, node72, node78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 45 + "'", int40 == 45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 45 + "'", int48 == 45);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder58);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder79);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        // The following exception was thrown during execution in test generation
        try {
            int int68 = functionType66.getMinArguments();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        node7.setLineno(10);
        boolean boolean10 = node7.isFor();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        int int30 = node14.getType();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 39 + "'", int30 == 39);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.remove(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 16, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        node12.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId16 = node12.getInputId();
        node12.detachChildren();
        com.google.javascript.rhino.Node node18 = node6.copyInformationFrom(node12);
        int int19 = node12.getType();
        java.lang.String[] strArray25 = new java.lang.String[] { "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "Unknown class name", "Unknown class name", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        node12.setDirectives((java.util.Set<java.lang.String>) strSet26);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean31 = strSet26.remove((java.lang.Object) node30);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode32 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode33 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode37 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry36.setResolveMode(resolveMode37);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode[] resolveModeArray39 = new com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode[] { resolveMode32, resolveMode33, resolveMode37 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode[] resolveModeArray40 = strSet26.toArray(resolveModeArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + resolveMode32 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES + "'", resolveMode32.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES));
        org.junit.Assert.assertTrue("'" + resolveMode33 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode33.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode37 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode37.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(resolveModeArray39);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        boolean boolean11 = functionType10.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry14.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean17 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        boolean boolean18 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = node24.useSourceInfoIfMissingFromForTree(node26);
        boolean boolean28 = node26.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable33 = jSTypeRegistry31.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean34 = jSTypeRegistry31.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList37 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList37, jSTypeArray36);
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry31.createFunctionTypeWithVarArgs(jSType35, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList37);
        boolean boolean40 = functionType39.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType41 = jSTypeRegistry14.createEnumType("false", node26, (com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = functionType39.getConstructor();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair43 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType10, (com.google.javascript.rhino.jstype.JSType) functionType39);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType44 = functionType10.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(enumType41);
        org.junit.Assert.assertNull(functionType42);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node8 = node5.useSourceInfoIfMissingFromForTree(node7);
        node8.setLineno(10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder17 = node16.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean23 = node22.isDefaultCase();
        node22.setVarArgs(true);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) 'a', node16, node22, node30);
        boolean boolean32 = node31.isGetterDef();
        boolean boolean33 = node31.isQuotedString();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int39 = node38.getType();
        node38.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int47 = node46.getType();
        node46.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(40, node8, node31, node38, node46);
        boolean boolean51 = node50.isWith();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 45 + "'", int39 == 45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 45 + "'", int47 == 45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node5.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean12 = node11.isDefaultCase();
        node11.setVarArgs(true);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) 'a', node5, node11, node19);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList37 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray36);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList56 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray55);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList75 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray74);
        java.lang.String[] strArray93 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList94 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray93);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>>> strComparableListList95 = com.google.common.collect.ImmutableList.of(strComparableList37, strComparableList56, strComparableList75, strComparableList94);
        boolean boolean97 = strComparableList37.contains((java.lang.Object) (short) 10);
        boolean boolean98 = strComparableList18.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList37);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator99 = strComparableList18.spliterator();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strComparableList37);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strComparableList56);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strComparableList75);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertNotNull(strComparableList94);
        org.junit.Assert.assertNotNull(strComparableListList95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator99);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int16 = node15.getType();
        boolean boolean17 = node15.isBlock();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node9, node15, (int) (byte) 10, 44);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        node12.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId16 = node12.getInputId();
        node12.detachChildren();
        com.google.javascript.rhino.Node node18 = node6.copyInformationFrom(node12);
        int int19 = node12.getType();
        java.lang.String[] strArray25 = new java.lang.String[] { "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "Unknown class name", "Unknown class name", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        node12.setDirectives((java.util.Set<java.lang.String>) strSet26);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean31 = strSet26.remove((java.lang.Object) node30);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int37 = node36.getType();
        boolean boolean38 = node36.isDebugger();
        boolean boolean39 = node36.isString();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder46 = node45.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean52 = node51.isDefaultCase();
        node51.setVarArgs(true);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) 'a', node45, node51, node59);
        com.google.javascript.rhino.InputId inputId61 = node45.getInputId();
        com.google.javascript.rhino.Node node62 = node36.useSourceInfoFrom(node45);
        boolean boolean63 = node62.isAnd();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node71 = node68.useSourceInfoIfMissingFromForTree(node70);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean77 = node76.isDefaultCase();
        node76.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId80 = node76.getInputId();
        node76.detachChildren();
        com.google.javascript.rhino.Node node82 = node70.copyInformationFrom(node76);
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node89 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node90 = node87.useSourceInfoIfMissingFromForTree(node89);
        node90.setLineno(10);
        com.google.javascript.rhino.Node node93 = node76.copyInformationFrom(node90);
        // The following exception was thrown during execution in test generation
        try {
            node30.addChildAfter(node62, node76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 45 + "'", int37 == 45);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(inputId80);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertNotNull(node93);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node5.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean12 = node11.isDefaultCase();
        node11.setVarArgs(true);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) 'a', node5, node11, node19);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = node5.getExistingIntProp(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = functionType66.isReturnTypeInferred();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        int int0 = com.google.javascript.rhino.Node.COLUMN_BITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node13 = node10.useSourceInfoIfMissingFromForTree(node12);
        boolean boolean14 = node12.isExprResult();
        com.google.javascript.rhino.Node node15 = node12.cloneTree();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node20 = jSTypeRegistry18.createParameters(jSTypeArray19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable25 = jSTypeRegistry23.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean26 = jSTypeRegistry23.shouldTolerateUndefinedValues();
        boolean boolean27 = jSTypeRegistry23.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node36 = node33.useSourceInfoIfMissingFromForTree(node35);
        boolean boolean37 = node35.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable42 = jSTypeRegistry40.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean43 = jSTypeRegistry40.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList46 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList46, jSTypeArray45);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry40.createFunctionTypeWithVarArgs(jSType44, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList46);
        boolean boolean49 = functionType48.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType50 = jSTypeRegistry23.createEnumType("false", node35, (com.google.javascript.rhino.jstype.JSType) functionType48);
        boolean boolean52 = enumType50.isPropertyTypeDeclared("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = null;
        enumType50.setPropertyJSDocInfo("SHEQ  1 [var_args_name: 1]\n", jSDocInfo54);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry2.createConstructorType("{209777139}", node15, node20, (com.google.javascript.rhino.jstype.JSType) enumType50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(jSTypeIterable25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(enumType50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.incrementGeneration();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node7 = jSTypeRegistry5.createParameters(jSTypeArray6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable12 = jSTypeRegistry10.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean13 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        boolean boolean14 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node23 = node20.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean24 = node22.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable29 = jSTypeRegistry27.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean30 = jSTypeRegistry27.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList33 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList33, jSTypeArray32);
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry27.createFunctionTypeWithVarArgs(jSType31, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList33);
        boolean boolean36 = functionType35.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType37 = jSTypeRegistry10.createEnumType("false", node22, (com.google.javascript.rhino.jstype.JSType) functionType35);
        java.util.Set<java.lang.String> strSet38 = functionType35.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable43 = jSTypeRegistry41.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean44 = jSTypeRegistry41.shouldTolerateUndefinedValues();
        boolean boolean45 = jSTypeRegistry41.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node54 = node51.useSourceInfoIfMissingFromForTree(node53);
        boolean boolean55 = node53.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable60 = jSTypeRegistry58.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean61 = jSTypeRegistry58.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList64 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList64, jSTypeArray63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry58.createFunctionTypeWithVarArgs(jSType62, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList64);
        boolean boolean67 = functionType66.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType68 = jSTypeRegistry41.createEnumType("false", node53, (com.google.javascript.rhino.jstype.JSType) functionType66);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = functionType66.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType70 = jSTypeRegistry5.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType35, (com.google.javascript.rhino.jstype.JSType) functionType69);
        com.google.javascript.rhino.jstype.FunctionType functionType71 = functionType35.getOwnerFunction();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray73 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType35, true, jSTypeArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(jSTypeIterable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(enumType37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(jSTypeIterable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(enumType68);
        org.junit.Assert.assertNull(functionType69);
        org.junit.Assert.assertNotNull(parameterizedType70);
        org.junit.Assert.assertNull(functionType71);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        boolean boolean8 = node6.isExprResult();
        boolean boolean9 = node6.isDelProp();
        com.google.javascript.rhino.InputId inputId10 = node6.getInputId();
        // The following exception was thrown during execution in test generation
        try {
            node6.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(inputId10);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        node4.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId8 = node4.getInputId();
        node4.detachChildren();
        boolean boolean10 = node4.isNot();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = node4.getExistingIntProp(53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 53");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        node4.setVarArgs(true);
        node4.setVarArgs(false);
        node4.setLength((int) (byte) 0);
        node4.removeProp((int) 'a');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node21 = node18.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean22 = node20.isExprResult();
        boolean boolean23 = node20.isDelProp();
        com.google.javascript.rhino.InputId inputId24 = node20.getInputId();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node33 = node30.useSourceInfoIfMissingFromForTree(node32);
        node33.setLineno(10);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder42 = node41.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean48 = node47.isDefaultCase();
        node47.setVarArgs(true);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) 'a', node41, node47, node55);
        boolean boolean57 = node56.isGetterDef();
        boolean boolean58 = node56.isQuotedString();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int64 = node63.getType();
        node63.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int72 = node71.getType();
        node71.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(40, node33, node56, node63, node71);
        boolean boolean76 = node56.isArrayLit();
        com.google.javascript.rhino.Node node77 = node20.useSourceInfoIfMissingFromForTree(node56);
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean83 = node82.isDefaultCase();
        node82.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId86 = node82.getInputId();
        boolean boolean87 = node82.isCase();
        // The following exception was thrown during execution in test generation
        try {
            node4.addChildBefore(node77, node82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(inputId24);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 45 + "'", int64 == 45);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 45 + "'", int72 == 45);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(inputId86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        node12.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId16 = node12.getInputId();
        node12.detachChildren();
        com.google.javascript.rhino.Node node18 = node6.copyInformationFrom(node12);
        int int19 = node12.getType();
        java.lang.String[] strArray25 = new java.lang.String[] { "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "Unknown class name", "Unknown class name", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        node12.setDirectives((java.util.Set<java.lang.String>) strSet26);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList47 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray46);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator48 = strComparableList47.spliterator();
        boolean boolean49 = strSet26.equals((java.lang.Object) strComparableList47);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable51 = strComparableList47.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strComparableList47);
        org.junit.Assert.assertNotNull(strComparableSpliterator48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType27.getConstructor();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable35 = jSTypeRegistry33.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean36 = jSTypeRegistry33.shouldTolerateUndefinedValues();
        boolean boolean37 = jSTypeRegistry33.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node46 = node43.useSourceInfoIfMissingFromForTree(node45);
        boolean boolean47 = node45.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable52 = jSTypeRegistry50.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean53 = jSTypeRegistry50.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList56 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList56, jSTypeArray55);
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry50.createFunctionTypeWithVarArgs(jSType54, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList56);
        boolean boolean59 = functionType58.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType60 = jSTypeRegistry33.createEnumType("false", node45, (com.google.javascript.rhino.jstype.JSType) functionType58);
        boolean boolean62 = enumType60.isPropertyTypeDeclared("");
        boolean boolean63 = enumType60.matchesStringContext();
        boolean boolean64 = functionType27.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) enumType60);
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate65 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = functionType27.setValidator(jSTypePredicate65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(jSTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(enumType60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean4 = node3.isGetProp();
        boolean boolean5 = node3.isNumber();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder11 = node10.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int17 = node16.getType();
        boolean boolean18 = node16.isBlock();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 10, node3, node10, node16, (int) (byte) 10, 44);
        boolean boolean22 = node3.isSwitch();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean26 = node25.isGetProp();
        boolean boolean27 = node25.isNumber();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder33 = node32.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int39 = node38.getType();
        boolean boolean40 = node38.isBlock();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (short) 10, node25, node32, node38, (int) (byte) 10, 44);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile44 = node43.getStaticSourceFile();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean50 = node49.isName();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node58 = node55.useSourceInfoIfMissingFromForTree(node57);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean64 = node63.isDefaultCase();
        node63.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId67 = node63.getInputId();
        node63.detachChildren();
        com.google.javascript.rhino.Node node69 = node57.copyInformationFrom(node63);
        int int70 = node63.getType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((int) (byte) -1, node3, node43, node49, node63, 2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 45 + "'", int17 == 45);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 45 + "'", int39 == 45);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(staticSourceFile44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(inputId67);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 45 + "'", int70 == 45);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int6 = node5.getType();
        boolean boolean7 = node5.isBlock();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder8 = node5.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node17 = node14.useSourceInfoIfMissingFromForTree(node16);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean23 = node22.isDefaultCase();
        node22.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId26 = node22.getInputId();
        node22.detachChildren();
        com.google.javascript.rhino.Node node28 = node16.copyInformationFrom(node22);
        int int29 = node22.getType();
        java.lang.String[] strArray35 = new java.lang.String[] { "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "Unknown class name", "Unknown class name", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        node22.setDirectives((java.util.Set<java.lang.String>) strSet36);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean41 = strSet36.remove((java.lang.Object) node40);
        boolean boolean42 = node40.isString();
        node40.setCharno(10);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node52 = node49.useSourceInfoIfMissingFromForTree(node51);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(17, node5, node9, node40, node52, 16, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 45 + "'", int6 == 45);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder8);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(inputId26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 45 + "'", int29 == 45);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node52);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList37 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray36);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList56 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray55);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList75 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray74);
        java.lang.String[] strArray93 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList94 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray93);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>>> strComparableListList95 = com.google.common.collect.ImmutableList.of(strComparableList37, strComparableList56, strComparableList75, strComparableList94);
        boolean boolean97 = strComparableList37.contains((java.lang.Object) (short) 10);
        boolean boolean98 = strComparableList18.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList37);
        java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor99 = strComparableList37.listIterator();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strComparableList37);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strComparableList56);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strComparableList75);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertNotNull(strComparableList94);
        org.junit.Assert.assertNotNull(strComparableListList95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertNotNull(strComparableItor99);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType69 = parameterizedType67.toMaybeEnumElementType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = enumElementType69.isUnknownType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(enumElementType69);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType69 = parameterizedType67.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = functionType69.isNumberObjectType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(functionType69);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        java.util.Set<java.lang.String> strSet30 = functionType27.getOwnPropertyNames();
        boolean boolean31 = functionType27.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable36 = jSTypeRegistry34.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean37 = jSTypeRegistry34.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList40 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList40, jSTypeArray39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry34.createFunctionTypeWithVarArgs(jSType38, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList40);
        boolean boolean43 = functionType42.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable48 = jSTypeRegistry46.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean49 = jSTypeRegistry46.shouldTolerateUndefinedValues();
        boolean boolean50 = jSTypeRegistry46.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node59 = node56.useSourceInfoIfMissingFromForTree(node58);
        boolean boolean60 = node58.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable65 = jSTypeRegistry63.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean66 = jSTypeRegistry63.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray68 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList69 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList69, jSTypeArray68);
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry63.createFunctionTypeWithVarArgs(jSType67, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList69);
        boolean boolean72 = functionType71.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType73 = jSTypeRegistry46.createEnumType("false", node58, (com.google.javascript.rhino.jstype.JSType) functionType71);
        java.util.Set<java.lang.String> strSet74 = functionType71.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair75 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType42, (com.google.javascript.rhino.jstype.JSType) functionType71);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable76 = functionType71.getImplementedInterfaces();
        boolean boolean77 = functionType27.hasEqualCallType(functionType71);
        boolean boolean78 = functionType27.matchesUint32Context();
        java.lang.String str79 = functionType27.getReferenceName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType80 = functionType27.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(jSTypeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(enumType73);
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNotNull(objectTypeIterable76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(str79);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType69 = parameterizedType67.toMaybeEnumElementType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = enumElementType69.isVoidType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(enumElementType69);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        node12.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId16 = node12.getInputId();
        node12.detachChildren();
        com.google.javascript.rhino.Node node18 = node6.copyInformationFrom(node12);
        int int19 = node12.getType();
        boolean boolean20 = node12.isFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node4);
        boolean boolean7 = node4.isLabel();
        boolean boolean8 = node4.isGetterDef();
        int int9 = node4.getSourceOffset();
        int int10 = node4.getCharno();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int5 = node4.getType();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder12 = node11.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean18 = node17.isDefaultCase();
        node17.setVarArgs(true);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) 'a', node11, node17, node25);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node25);
        com.google.javascript.rhino.Node node28 = node4.useSourceInfoFromForTree(node25);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = node25.getStaticSourceFile();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 45 + "'", int5 == 45);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(staticSourceFile27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(staticSourceFile29);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node13 = node10.useSourceInfoIfMissingFromForTree(node12);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean19 = node18.isDefaultCase();
        node18.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId22 = node18.getInputId();
        node18.detachChildren();
        com.google.javascript.rhino.Node node24 = node12.copyInformationFrom(node18);
        int int25 = node18.getType();
        boolean boolean26 = node18.isFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry2.createInterfaceType("", node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(inputId22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 45 + "'", int25 == 45);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        boolean boolean11 = functionType10.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry14.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean17 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        boolean boolean18 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = node24.useSourceInfoIfMissingFromForTree(node26);
        boolean boolean28 = node26.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable33 = jSTypeRegistry31.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean34 = jSTypeRegistry31.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList37 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList37, jSTypeArray36);
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry31.createFunctionTypeWithVarArgs(jSType35, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList37);
        boolean boolean40 = functionType39.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType41 = jSTypeRegistry14.createEnumType("false", node26, (com.google.javascript.rhino.jstype.JSType) functionType39);
        java.util.Set<java.lang.String> strSet42 = functionType39.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair43 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType10, (com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.Node node44 = functionType10.getSource();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType46 = functionType10.getTopMostDefiningType("Unknown class name");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(enumType41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNull(node44);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean10 = node9.isDefaultCase();
        node9.setVarArgs(true);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType15 = jSTypeRegistry2.createFromTypeNodes(node9, "{proxy:function (): {882920012}}", jSTypeStaticScope14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected node in type expression: SHEQ  1 [var_args_name: 1]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode3 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry2.setResolveMode(resolveMode3);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType6 = jSTypeRegistry2.getNativeObjectType(jSTypeNative5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + resolveMode3 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode3.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int16 = node15.getType();
        boolean boolean17 = node15.isBlock();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node9, node15, (int) (byte) 10, 44);
        boolean boolean21 = node15.isNull();
        java.lang.String str22 = node15.getSourceFileName();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableList2.size();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean11 = node10.isDefaultCase();
        node10.setVarArgs(true);
        node10.setVarArgs(false);
        boolean boolean16 = strComparableList2.contains((java.lang.Object) node10);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node22 = node21.getParent();
        java.lang.Class<?> wildcardClass23 = node21.getClass();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node29 = node28.getParent();
        java.lang.Class<?> wildcardClass30 = node28.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass23;
        wildcardClassArray33[1] = wildcardClass30;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray38 = strComparableList2.toArray(wildcardClassArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int5 = node4.getType();
        boolean boolean6 = node4.isBlock();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder7 = node4.getJsDocBuilderForNode();
        node4.setQuotedString();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile9 = null;
        node4.setStaticSourceFile(staticSourceFile9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 45 + "'", int5 == 45);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder7);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder7 = node6.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        node12.setVarArgs(true);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) 'a', node6, node12, node20);
        boolean boolean22 = node6.isScript();
        int int23 = node6.getLineno();
        com.google.javascript.rhino.Node[] nodeArray24 = new com.google.javascript.rhino.Node[] { node6 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 100, nodeArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(nodeArray24);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList37 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray36);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList56 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray55);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList75 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray74);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>>> strComparableListList76 = com.google.common.collect.ImmutableList.of(strComparableList18, strComparableList37, strComparableList56, strComparableList75);
        com.google.common.collect.UnmodifiableIterator<java.lang.Comparable<java.lang.String>> strComparableItor77 = strComparableList18.iterator();
        java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor78 = strComparableList18.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Comparable<java.lang.String>> strComparableList81 = strComparableList18.subList(16, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: end index (0) must not be less than start index (16)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strComparableList37);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strComparableList56);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strComparableList75);
        org.junit.Assert.assertNotNull(strComparableListList76);
        org.junit.Assert.assertNotNull(strComparableItor77);
        org.junit.Assert.assertNotNull(strComparableItor78);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node4);
        boolean boolean7 = node4.isLabel();
        boolean boolean8 = node4.isGetterDef();
        int int9 = node4.getSourceOffset();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = node4.getExistingIntProp((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        node12.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId16 = node12.getInputId();
        node12.detachChildren();
        com.google.javascript.rhino.Node node18 = node6.copyInformationFrom(node12);
        int int19 = node12.getType();
        java.lang.String[] strArray25 = new java.lang.String[] { "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "Unknown class name", "Unknown class name", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        node12.setDirectives((java.util.Set<java.lang.String>) strSet26);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList47 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray46);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator48 = strComparableList47.spliterator();
        boolean boolean49 = strSet26.equals((java.lang.Object) strComparableList47);
        java.util.Spliterator<java.lang.String> strSpliterator50 = strSet26.spliterator();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strComparableList47);
        org.junit.Assert.assertNotNull(strComparableSpliterator48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strSpliterator50);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList37 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray36);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList56 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray55);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList75 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray74);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>>> strComparableListList76 = com.google.common.collect.ImmutableList.of(strComparableList18, strComparableList37, strComparableList56, strComparableList75);
        boolean boolean77 = strComparableList37.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean79 = strComparableList37.add((java.lang.Comparable<java.lang.String>) "{581538441}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strComparableList37);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strComparableList56);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strComparableList75);
        org.junit.Assert.assertNotNull(strComparableListList76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder7 = node6.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        node12.setVarArgs(true);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) 'a', node6, node12, node20);
        boolean boolean22 = node21.isGetterDef();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(45, node21, node24, 44, 16);
        // The following exception was thrown during execution in test generation
        try {
            node27.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean33 = node32.isGetProp();
        boolean boolean34 = node32.isNumber();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder40 = node39.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int46 = node45.getType();
        boolean boolean47 = node45.isBlock();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (short) 10, node32, node39, node45, (int) (byte) 10, 44);
        node45.setSourceEncodedPositionForTree(45);
        boolean boolean53 = node45.isSetterDef();
        // The following exception was thrown during execution in test generation
        try {
            node14.addChildToBack(node45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder40);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 45 + "'", int46 == 45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList37 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray36);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList56 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray55);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList75 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray74);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>>> strComparableListList76 = com.google.common.collect.ImmutableList.of(strComparableList18, strComparableList37, strComparableList56, strComparableList75);
        com.google.common.collect.UnmodifiableIterator<java.lang.Comparable<java.lang.String>> strComparableItor77 = strComparableList75.iterator();
        java.lang.String str78 = strComparableList75.toString();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList80 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "");
        com.google.common.collect.UnmodifiableIterator<java.lang.Comparable<java.lang.String>> strComparableItor81 = strComparableList80.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean82 = strComparableList75.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList80);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strComparableList37);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strComparableList56);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strComparableList75);
        org.junit.Assert.assertNotNull(strComparableListList76);
        org.junit.Assert.assertNotNull(strComparableItor77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" + "'", str78, "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strComparableList80);
        org.junit.Assert.assertNotNull(strComparableItor81);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry2.getEachReferenceTypeWithProperty("{2044072356}");
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable10 = jSTypeRegistry8.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean11 = jSTypeRegistry8.shouldTolerateUndefinedValues();
        boolean boolean12 = jSTypeRegistry8.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node21 = node18.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean22 = node20.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable27 = jSTypeRegistry25.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean28 = jSTypeRegistry25.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList31 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList31, jSTypeArray30);
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry25.createFunctionTypeWithVarArgs(jSType29, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList31);
        boolean boolean34 = functionType33.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType35 = jSTypeRegistry8.createEnumType("false", node20, (com.google.javascript.rhino.jstype.JSType) functionType33);
        java.util.Set<java.lang.String> strSet36 = functionType33.getOwnPropertyNames();
        boolean boolean37 = functionType33.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable42 = jSTypeRegistry40.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean43 = jSTypeRegistry40.shouldTolerateUndefinedValues();
        boolean boolean44 = jSTypeRegistry40.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node53 = node50.useSourceInfoIfMissingFromForTree(node52);
        boolean boolean54 = node52.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable59 = jSTypeRegistry57.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean60 = jSTypeRegistry57.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList63 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList63, jSTypeArray62);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry57.createFunctionTypeWithVarArgs(jSType61, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList63);
        boolean boolean66 = functionType65.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType67 = jSTypeRegistry40.createEnumType("false", node52, (com.google.javascript.rhino.jstype.JSType) functionType65);
        boolean boolean69 = enumType67.isPropertyTypeDeclared("");
        boolean boolean70 = enumType67.matchesStringContext();
        java.lang.String str71 = enumType67.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.FunctionType functionType72 = enumType67.getConstructor();
        boolean boolean73 = functionType33.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) enumType67);
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable78 = jSTypeRegistry76.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean79 = jSTypeRegistry76.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType80 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray81 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList82 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList82, jSTypeArray81);
        com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry76.createFunctionTypeWithVarArgs(jSType80, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList82);
        com.google.javascript.rhino.jstype.JSType jSType85 = jSTypeRegistry2.createFunctionTypeWithVarArgs(objectType5, (com.google.javascript.rhino.jstype.JSType) functionType33, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList82);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative86 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType87 = jSTypeRegistry2.getNativeObjectType(jSTypeNative86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(jSTypeIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(enumType35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(enumType67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "{1291320414}" + "'", str71, "{1291320414}");
        org.junit.Assert.assertNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(jSTypeArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(functionType84);
        org.junit.Assert.assertNotNull(jSType85);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        com.google.javascript.rhino.jstype.FunctionType functionType68 = functionType32.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType69 = functionType68.getImplicitPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertNull(functionType68);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int5 = node4.getType();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder12 = node11.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean18 = node17.isDefaultCase();
        node17.setVarArgs(true);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) 'a', node11, node17, node25);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node25);
        com.google.javascript.rhino.Node node28 = node4.useSourceInfoFromForTree(node25);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = node25.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable34 = jSTypeRegistry32.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean35 = jSTypeRegistry32.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList38 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList38, jSTypeArray37);
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry32.createFunctionTypeWithVarArgs(jSType36, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList38);
        boolean boolean41 = functionType40.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable46 = jSTypeRegistry44.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean47 = jSTypeRegistry44.shouldTolerateUndefinedValues();
        boolean boolean48 = jSTypeRegistry44.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node57 = node54.useSourceInfoIfMissingFromForTree(node56);
        boolean boolean58 = node56.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable63 = jSTypeRegistry61.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean64 = jSTypeRegistry61.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList67 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList67, jSTypeArray66);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry61.createFunctionTypeWithVarArgs(jSType65, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList67);
        boolean boolean70 = functionType69.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType71 = jSTypeRegistry44.createEnumType("false", node56, (com.google.javascript.rhino.jstype.JSType) functionType69);
        java.util.Set<java.lang.String> strSet72 = functionType69.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair73 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType40, (com.google.javascript.rhino.jstype.JSType) functionType69);
        com.google.javascript.rhino.Node node74 = functionType40.getSource();
        node25.setJSType((com.google.javascript.rhino.jstype.JSType) functionType40);
        com.google.javascript.rhino.jstype.ObjectType objectType76 = functionType40.getPrototype();
        java.lang.String str77 = functionType40.toString();
        com.google.javascript.rhino.jstype.ObjectType objectType78 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType40);
        boolean boolean79 = objectType78.canBeCalled();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 45 + "'", int5 == 45);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(staticSourceFile27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(staticSourceFile29);
        org.junit.Assert.assertNotNull(jSTypeIterable34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jSTypeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(enumType71);
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "function (): ?" + "'", str77, "function (): ?");
        org.junit.Assert.assertNotNull(objectType78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        java.util.Set<java.lang.String> strSet30 = functionType27.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        boolean boolean33 = strSet30.equals((java.lang.Object) jSTypeRegistry32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = strSet30.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Unknown class name", jSTypeNative1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean8 = node7.isDefaultCase();
        node7.setVarArgs(true);
        node7.setVarArgs(false);
        boolean boolean13 = node7.isDebugger();
        boolean boolean14 = node7.isNoSideEffectsCall();
        com.google.javascript.rhino.InputId inputId16 = new com.google.javascript.rhino.InputId("hi!");
        java.lang.String str17 = inputId16.toString();
        node7.setInputId(inputId16);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean24 = node23.isDefaultCase();
        node23.setVarArgs(true);
        node23.setVarArgs(false);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable29 = node23.getAncestors();
        boolean boolean30 = inputId16.equals((java.lang.Object) node23);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable35 = jSTypeRegistry33.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean36 = jSTypeRegistry33.shouldTolerateUndefinedValues();
        boolean boolean37 = jSTypeRegistry33.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node46 = node43.useSourceInfoIfMissingFromForTree(node45);
        boolean boolean47 = node45.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable52 = jSTypeRegistry50.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean53 = jSTypeRegistry50.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList56 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList56, jSTypeArray55);
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry50.createFunctionTypeWithVarArgs(jSType54, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList56);
        boolean boolean59 = functionType58.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType60 = jSTypeRegistry33.createEnumType("false", node45, (com.google.javascript.rhino.jstype.JSType) functionType58);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable65 = jSTypeRegistry63.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean66 = jSTypeRegistry63.shouldTolerateUndefinedValues();
        boolean boolean67 = jSTypeRegistry63.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node76 = node73.useSourceInfoIfMissingFromForTree(node75);
        boolean boolean77 = node75.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter78 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter78, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable82 = jSTypeRegistry80.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean83 = jSTypeRegistry80.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType84 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray85 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList86 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList86, jSTypeArray85);
        com.google.javascript.rhino.jstype.FunctionType functionType88 = jSTypeRegistry80.createFunctionTypeWithVarArgs(jSType84, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList86);
        boolean boolean89 = functionType88.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType90 = jSTypeRegistry63.createEnumType("false", node75, (com.google.javascript.rhino.jstype.JSType) functionType88);
        boolean boolean92 = enumType90.isPropertyTypeDeclared("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo94 = null;
        enumType90.setPropertyJSDocInfo("SHEQ  1 [var_args_name: 1]\n", jSDocInfo94);
        boolean boolean97 = enumType90.isPropertyInExterns("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType98 = jSTypeRegistry33.createOptionalType((com.google.javascript.rhino.jstype.JSType) enumType90);
        com.google.javascript.rhino.jstype.JSType jSType99 = assertionFunctionSpec2.getAssertedType(node23, jSTypeRegistry33);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "InputId: hi!" + "'", str17, "InputId: hi!");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(ancestorIterable29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(enumType60);
        org.junit.Assert.assertNotNull(jSTypeIterable65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(jSTypeArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(functionType88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(enumType90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(jSType98);
        org.junit.Assert.assertNull(jSType99);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int16 = node15.getType();
        boolean boolean17 = node15.isBlock();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node9, node15, (int) (byte) 10, 44);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder26 = node25.getJsDocBuilderForNode();
        node20.addChildrenToFront(node25);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder26);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        boolean boolean11 = functionType10.canBeCalled();
        boolean boolean12 = functionType10.hasAnyTemplateInternal();
        int int13 = functionType10.getPropertiesCount();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType10.getOwnImplementedInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType15 = functionType10.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node5 = node4.getParent();
        java.lang.Class<?> wildcardClass6 = node4.getClass();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node12 = node11.getParent();
        java.lang.Class<?> wildcardClass13 = node11.getClass();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = node18.getParent();
        java.lang.Class<?> wildcardClass20 = node18.getClass();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = node25.getParent();
        java.lang.Class<?> wildcardClass27 = node25.getClass();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node33 = node32.getParent();
        java.lang.Class<?> wildcardClass34 = node32.getClass();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node40 = node39.getParent();
        java.lang.Class<?> wildcardClass41 = node39.getClass();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node47 = node46.getParent();
        java.lang.Class<?> wildcardClass48 = node46.getClass();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node54 = node53.getParent();
        java.lang.Class<?> wildcardClass55 = node53.getClass();
        java.lang.reflect.Type type56 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node62 = node61.getParent();
        java.lang.Class<?> wildcardClass63 = node61.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList64 = com.google.common.collect.ImmutableList.of((java.lang.reflect.Type) wildcardClass6, (java.lang.reflect.Type) wildcardClass13, (java.lang.reflect.Type) wildcardClass20, (java.lang.reflect.Type) wildcardClass27, (java.lang.reflect.Type) wildcardClass34, (java.lang.reflect.Type) wildcardClass41, (java.lang.reflect.Type) wildcardClass48, (java.lang.reflect.Type) wildcardClass55, type56, (java.lang.reflect.Type) wildcardClass63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 8");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableList18.spliterator();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = node24.useSourceInfoIfMissingFromForTree(node26);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean30 = node29.isFalse();
        boolean boolean31 = node26.hasChild(node29);
        boolean boolean32 = strComparableList18.contains((java.lang.Object) boolean31);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "Unknown class name");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList37 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray36);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList56 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray55);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList75 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray74);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>>> strComparableListList76 = com.google.common.collect.ImmutableList.of(strComparableList18, strComparableList37, strComparableList56, strComparableList75);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor77 = strComparableList18.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean79 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "SHEQ  1 [var_args_name: 1]\n");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strComparableList37);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strComparableList56);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strComparableList75);
        org.junit.Assert.assertNotNull(strComparableListList76);
        org.junit.Assert.assertNotNull(strComparableItor77);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        int int0 = com.google.javascript.rhino.Node.PARENTHESIZED_PROP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 35 + "'", int0 == 35);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType10.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int14 = node13.getType();
        boolean boolean15 = node13.isDebugger();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean19 = node18.isGetProp();
        boolean boolean20 = node18.isNumber();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder26 = node25.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int32 = node31.getType();
        boolean boolean33 = node31.isBlock();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 10, node18, node25, node31, (int) (byte) 10, 44);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship37 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType8, node13, node31);
        // The following exception was thrown during execution in test generation
        try {
            node4.addChildrenToFront(node31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + subclassType8 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType8.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 45 + "'", int14 == 45);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder26);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 45 + "'", int32 == 45);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("Unknown class name");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(Unknown class name)" + "'", str1, "(Unknown class name)");
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        boolean boolean36 = enumType34.isPropertyTypeDeclared("");
        boolean boolean37 = enumType34.matchesStringContext();
        java.lang.String str38 = enumType34.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = enumType34.getConstructor();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = enumType34.getJSDocInfo();
        enumType34.clearCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) enumType34, "", "Not declared as a type name", 36, (int) '#');
        java.util.List<java.lang.String> strList47 = null;
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry2.setTemplateTypeNames(strList47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{1467844854}" + "'", str38, "{1467844854}");
        org.junit.Assert.assertNull(functionType39);
        org.junit.Assert.assertNull(jSDocInfo40);
        org.junit.Assert.assertNotNull(jSType46);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        node12.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId16 = node12.getInputId();
        node12.detachChildren();
        com.google.javascript.rhino.Node node18 = node6.copyInformationFrom(node12);
        int int19 = node12.getType();
        java.lang.String[] strArray25 = new java.lang.String[] { "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "Unknown class name", "Unknown class name", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        node12.setDirectives((java.util.Set<java.lang.String>) strSet26);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean31 = strSet26.remove((java.lang.Object) node30);
        java.lang.Object[] objArray32 = strSet26.toArray();
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList51 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray50);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator52 = strComparableList51.spliterator();
        boolean boolean53 = strSet26.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList51);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable58 = jSTypeRegistry56.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean59 = jSTypeRegistry56.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList62 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList62, jSTypeArray61);
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry56.createFunctionTypeWithVarArgs(jSType60, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList62);
        boolean boolean65 = functionType64.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable70 = jSTypeRegistry68.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean71 = jSTypeRegistry68.shouldTolerateUndefinedValues();
        boolean boolean72 = jSTypeRegistry68.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node81 = node78.useSourceInfoIfMissingFromForTree(node80);
        boolean boolean82 = node80.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry85 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter83, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable87 = jSTypeRegistry85.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean88 = jSTypeRegistry85.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType89 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray90 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList91 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList91, jSTypeArray90);
        com.google.javascript.rhino.jstype.FunctionType functionType93 = jSTypeRegistry85.createFunctionTypeWithVarArgs(jSType89, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList91);
        boolean boolean94 = functionType93.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType95 = jSTypeRegistry68.createEnumType("false", node80, (com.google.javascript.rhino.jstype.JSType) functionType93);
        com.google.javascript.rhino.jstype.FunctionType functionType96 = functionType93.getConstructor();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair97 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType64, (com.google.javascript.rhino.jstype.JSType) functionType93);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean98 = strComparableList51.remove((java.lang.Object) functionType93);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!], Unknown class name]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!], Unknown class name]");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strComparableList51);
        org.junit.Assert.assertNotNull(strComparableSpliterator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(jSTypeArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(functionType93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(enumType95);
        org.junit.Assert.assertNull(functionType96);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        int int0 = com.google.javascript.rhino.Node.POST_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean7 = node6.isDefaultCase();
        node6.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId10 = node6.getInputId();
        node6.detachChildren();
        boolean boolean12 = node6.isNull();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) 'a', node6);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 1, node6, (int) (byte) 1, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(inputId10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableList18.spliterator();
        int int21 = strComparableList18.lastIndexOf((java.lang.Object) "false");
        com.google.common.collect.UnmodifiableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor22 = strComparableList18.listIterator();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node31 = node28.useSourceInfoIfMissingFromForTree(node30);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean37 = node36.isDefaultCase();
        node36.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId40 = node36.getInputId();
        node36.detachChildren();
        com.google.javascript.rhino.Node node42 = node30.copyInformationFrom(node36);
        int int43 = node36.getType();
        java.lang.String[] strArray49 = new java.lang.String[] { "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "Unknown class name", "Unknown class name", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        node36.setDirectives((java.util.Set<java.lang.String>) strSet50);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean55 = strSet50.remove((java.lang.Object) node54);
        java.lang.Object[] objArray56 = strSet50.toArray();
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList75 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray74);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator76 = strComparableList75.spliterator();
        boolean boolean77 = strSet50.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList75);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean78 = strComparableList18.addAll((int) (byte) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList75);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strComparableItor22);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 45 + "'", int43 == 45);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!], Unknown class name]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!], Unknown class name]");
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strComparableList75);
        org.junit.Assert.assertNotNull(strComparableSpliterator76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        boolean boolean11 = functionType10.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry14.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean17 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        boolean boolean18 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = node24.useSourceInfoIfMissingFromForTree(node26);
        boolean boolean28 = node26.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable33 = jSTypeRegistry31.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean34 = jSTypeRegistry31.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList37 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList37, jSTypeArray36);
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry31.createFunctionTypeWithVarArgs(jSType35, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList37);
        boolean boolean40 = functionType39.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType41 = jSTypeRegistry14.createEnumType("false", node26, (com.google.javascript.rhino.jstype.JSType) functionType39);
        java.util.Set<java.lang.String> strSet42 = functionType39.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair43 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType10, (com.google.javascript.rhino.jstype.JSType) functionType39);
        boolean boolean44 = functionType39.isInstanceType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = functionType39.getOwnPropertyJSDocInfo("{142159271}");
        java.util.Set<java.lang.String> strSet47 = functionType39.getOwnPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = strSet47.add("{1060464605}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(enumType41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(jSDocInfo46);
        org.junit.Assert.assertNotNull(strSet47);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable34 = jSTypeRegistry32.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean35 = jSTypeRegistry32.shouldTolerateUndefinedValues();
        boolean boolean36 = jSTypeRegistry32.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node45 = node42.useSourceInfoIfMissingFromForTree(node44);
        boolean boolean46 = node44.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable51 = jSTypeRegistry49.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean52 = jSTypeRegistry49.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList55 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList55, jSTypeArray54);
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry49.createFunctionTypeWithVarArgs(jSType53, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList55);
        boolean boolean58 = functionType57.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType59 = jSTypeRegistry32.createEnumType("false", node44, (com.google.javascript.rhino.jstype.JSType) functionType57);
        boolean boolean61 = enumType59.isPropertyTypeDeclared("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = null;
        enumType59.setPropertyJSDocInfo("SHEQ  1 [var_args_name: 1]\n", jSDocInfo63);
        boolean boolean66 = enumType59.isPropertyInExterns("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType67 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) enumType59);
        boolean boolean68 = jSType67.isVoidType();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertNotNull(jSTypeIterable34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(enumType59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        jSTypeRegistry2.identifyNonNullableName("hi!");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative7 = null;
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray8 = new com.google.javascript.rhino.jstype.JSTypeNative[] { jSTypeNative7 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry2.createUnionType(jSTypeNativeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertNotNull(jSTypeNativeArray8);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        boolean boolean11 = functionType10.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry14.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean17 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        boolean boolean18 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = node24.useSourceInfoIfMissingFromForTree(node26);
        boolean boolean28 = node26.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable33 = jSTypeRegistry31.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean34 = jSTypeRegistry31.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList37 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList37, jSTypeArray36);
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry31.createFunctionTypeWithVarArgs(jSType35, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList37);
        boolean boolean40 = functionType39.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType41 = jSTypeRegistry14.createEnumType("false", node26, (com.google.javascript.rhino.jstype.JSType) functionType39);
        java.util.Set<java.lang.String> strSet42 = functionType39.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair43 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType10, (com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.Node node44 = functionType10.getSource();
        com.google.javascript.rhino.jstype.JSType jSType46 = functionType10.getPropertyType("hi!");
        boolean boolean47 = functionType10.isConstructor();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(enumType41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(jSType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        node7.setLineno(10);
        int int10 = node7.getType();
        java.util.Set<java.lang.String> strSet11 = node7.getDirectives();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder18 = node17.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean24 = node23.isDefaultCase();
        node23.setVarArgs(true);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) 'a', node17, node23, node31);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node40 = node37.useSourceInfoIfMissingFromForTree(node39);
        int int41 = node37.getSourceOffset();
        com.google.javascript.rhino.Node node42 = node31.clonePropsFrom(node37);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean47 = node46.isGetProp();
        boolean boolean48 = node46.isNumber();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder54 = node53.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int60 = node59.getType();
        boolean boolean61 = node59.isBlock();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (short) 10, node46, node53, node59, (int) (byte) 10, 44);
        com.google.javascript.rhino.Node node65 = node46.detachFromParent();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node73 = node70.useSourceInfoIfMissingFromForTree(node72);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean79 = node78.isDefaultCase();
        node78.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId82 = node78.getInputId();
        node78.detachChildren();
        com.google.javascript.rhino.Node node84 = node72.copyInformationFrom(node78);
        com.google.javascript.rhino.Node node89 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node91 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node92 = node89.useSourceInfoIfMissingFromForTree(node91);
        node92.setLineno(10);
        com.google.javascript.rhino.Node node95 = node78.copyInformationFrom(node92);
        com.google.javascript.rhino.Node node98 = new com.google.javascript.rhino.Node((-1), node65, node78, (int) ' ', 1);
        // The following exception was thrown during execution in test generation
        try {
            node7.replaceChild(node42, node65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The new child node has siblings.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder54);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 45 + "'", int60 == 45);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(inputId82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertNotNull(node95);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = functionType32.hasReferenceName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = functionType32.getOwnPropertyJSDocInfo("[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]");
        java.lang.Iterable iterable71 = functionType32.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.FunctionType functionType72 = functionType32.getOwnerFunction();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(jSDocInfo70);
        org.junit.Assert.assertNotNull(iterable71);
        org.junit.Assert.assertNull(functionType72);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getDescription();
        jSDocInfo0.setLicense("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node5.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean12 = node11.isDefaultCase();
        node11.setVarArgs(true);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) 'a', node5, node11, node19);
        com.google.javascript.rhino.InputId inputId21 = node5.getInputId();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node29 = node26.useSourceInfoIfMissingFromForTree(node28);
        node29.setLineno(10);
        int int32 = node29.getType();
        java.util.Set<java.lang.String> strSet33 = node29.getDirectives();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean39 = node38.isDefaultCase();
        node38.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId42 = node38.getInputId();
        boolean boolean43 = node38.isCase();
        boolean boolean44 = node38.isInc();
        com.google.javascript.jscomp.CodingConvention.Bind bind45 = new com.google.javascript.jscomp.CodingConvention.Bind(node5, node29, node38);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(inputId21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 45 + "'", int32 == 45);
        org.junit.Assert.assertNull(strSet33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(inputId42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType69 = parameterizedType67.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.TemplateType templateType70 = parameterizedType67.toMaybeTemplateType();
        boolean boolean72 = parameterizedType67.isPropertyTypeInferred("hi!");
        com.google.javascript.rhino.jstype.JSType jSType74 = parameterizedType67.findPropertyType("{1687381779}");
        com.google.javascript.rhino.jstype.ObjectType.Property property76 = parameterizedType67.getOwnSlot("hi!");
        boolean boolean77 = parameterizedType67.isFunctionPrototypeType();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(enumElementType69);
        org.junit.Assert.assertNull(templateType70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertNull(property76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean2 = node1.isGetProp();
        boolean boolean3 = node1.isNumber();
        com.google.javascript.rhino.Node node4 = node1.removeChildren();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = node4.isOr();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.NOT_A_CLASS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Not declared as a constructor" + "'", str0, "Not declared as a constructor");
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = enumType29.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet31 = functionType30.getPossibleToBooleanOutcomes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertNull(functionType30);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("{585923242}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType7 = jSTypeRegistry2.createNamedType("{375517443}", "ASSIGN_MOD", 53, 0);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable12 = jSTypeRegistry10.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean13 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        boolean boolean14 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node23 = node20.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean24 = node22.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable29 = jSTypeRegistry27.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean30 = jSTypeRegistry27.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList33 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList33, jSTypeArray32);
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry27.createFunctionTypeWithVarArgs(jSType31, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList33);
        boolean boolean36 = functionType35.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType37 = jSTypeRegistry10.createEnumType("false", node22, (com.google.javascript.rhino.jstype.JSType) functionType35);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = functionType35.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType39 = jSType7.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSType7);
        org.junit.Assert.assertNotNull(jSTypeIterable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(enumType37);
        org.junit.Assert.assertNull(functionType38);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableList18.spliterator();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = node24.useSourceInfoIfMissingFromForTree(node26);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean30 = node29.isFalse();
        boolean boolean31 = node26.hasChild(node29);
        boolean boolean32 = strComparableList18.contains((java.lang.Object) boolean31);
        int int33 = strComparableList18.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable36 = strComparableList18.set(53, (java.lang.Comparable<java.lang.String>) "{928842531}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17 + "'", int33 == 17);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        java.util.Set<java.lang.String> strSet30 = functionType27.getOwnPropertyNames();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node36 = node35.getParent();
        java.lang.Class<?> wildcardClass37 = node35.getClass();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node43 = node42.getParent();
        java.lang.Class<?> wildcardClass44 = node42.getClass();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = node49.getParent();
        java.lang.Class<?> wildcardClass51 = node49.getClass();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node57 = node56.getParent();
        java.lang.Class<?> wildcardClass58 = node56.getClass();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node64 = node63.getParent();
        java.lang.Class<?> wildcardClass65 = node63.getClass();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node71 = node70.getParent();
        java.lang.Class<?> wildcardClass72 = node70.getClass();
        java.lang.Class[] classArray74 = new java.lang.Class[6];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray75 = (java.lang.Class<?>[]) classArray74;
        wildcardClassArray75[0] = wildcardClass37;
        wildcardClassArray75[1] = wildcardClass44;
        wildcardClassArray75[2] = wildcardClass51;
        wildcardClassArray75[3] = wildcardClass58;
        wildcardClassArray75[4] = wildcardClass65;
        wildcardClassArray75[5] = wildcardClass72;
        com.google.common.collect.ImmutableList<java.lang.Class<?>> wildcardClassList88 = com.google.common.collect.ImmutableList.of(wildcardClassArray75);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean89 = strSet30.remove((java.lang.Object) wildcardClassList88);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.common.collect.RegularImmutableList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(classArray74);
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertNotNull(wildcardClassList88);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        int int0 = com.google.javascript.rhino.Node.MAX_COLUMN_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4095 + "'", int0 == 4095);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        com.google.javascript.rhino.jstype.FunctionType functionType68 = functionType32.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet69 = functionType68.getOwnPropertyNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertNull(functionType68);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean31 = enumType29.isPropertyTypeDeclared("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = null;
        enumType29.setPropertyJSDocInfo("SHEQ  1 [var_args_name: 1]\n", jSDocInfo33);
        boolean boolean36 = enumType29.isPropertyInExterns("Unknown class name");
        boolean boolean37 = enumType29.matchesNumberContext();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("{1789792193}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "({1789792193})" + "'", str1, "({1789792193})");
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("{1558761574}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node8 = node5.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean9 = node7.isExprResult();
        boolean boolean10 = node7.isDelProp();
        com.google.javascript.rhino.InputId inputId11 = node7.getInputId();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        node20.setLineno(10);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder29 = node28.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean35 = node34.isDefaultCase();
        node34.setVarArgs(true);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) 'a', node28, node34, node42);
        boolean boolean44 = node43.isGetterDef();
        boolean boolean45 = node43.isQuotedString();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int51 = node50.getType();
        node50.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int59 = node58.getType();
        node58.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(40, node20, node43, node50, node58);
        boolean boolean63 = node43.isArrayLit();
        com.google.javascript.rhino.Node node64 = node7.useSourceInfoIfMissingFromForTree(node43);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder71 = node70.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean77 = node76.isDefaultCase();
        node76.setVarArgs(true);
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node((int) 'a', node70, node76, node84);
        java.lang.String str86 = node76.toStringTree();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node89 = new com.google.javascript.rhino.Node(44, node43, node76, 16, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: first new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 45 + "'", int51 == 45);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 45 + "'", int59 == 45);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder71);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "SHEQ  1 [var_args_name: 1]\n" + "'", str86, "SHEQ  1 [var_args_name: 1]\n");
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        node4.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId8 = node4.getInputId();
        boolean boolean9 = node4.isCase();
        boolean boolean10 = node4.isFalse();
        java.lang.String str11 = node4.getString();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean2 = node1.isFalse();
        boolean boolean3 = node1.isQualifiedName();
        boolean boolean4 = node1.isDebugger();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node12 = node9.useSourceInfoIfMissingFromForTree(node11);
        boolean boolean13 = node9.isSwitch();
        boolean boolean14 = node9.isName();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder21 = node20.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean27 = node26.isDefaultCase();
        node26.setVarArgs(true);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) 'a', node20, node26, node34);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile36 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node34);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node44 = node41.useSourceInfoIfMissingFromForTree(node43);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean47 = node46.isFalse();
        boolean boolean48 = node43.hasChild(node46);
        com.google.javascript.rhino.Node node49 = node34.useSourceInfoFromForTree(node43);
        com.google.javascript.rhino.Node node50 = node9.srcrefTree(node34);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative52 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec53 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", jSTypeNative52);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean59 = node58.isDefaultCase();
        node58.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId62 = node58.getInputId();
        node58.detachChildren();
        boolean boolean64 = node58.isNot();
        boolean boolean65 = node58.isSetterDef();
        com.google.javascript.rhino.Node node66 = assertionFunctionSpec53.getAssertedParam(node58);
        // The following exception was thrown during execution in test generation
        try {
            node1.addChildrenAfter(node9, node66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(staticSourceFile36);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(inputId62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node66);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList37 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray36);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList56 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray55);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList75 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray74);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>>> strComparableListList76 = com.google.common.collect.ImmutableList.of(strComparableList18, strComparableList37, strComparableList56, strComparableList75);
        boolean boolean77 = strComparableList37.isEmpty();
        boolean boolean78 = strComparableList37.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable81 = strComparableList37.set(2, (java.lang.Comparable<java.lang.String>) "{967704162}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strComparableList37);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strComparableList56);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strComparableList75);
        org.junit.Assert.assertNotNull(strComparableListList76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList37 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray36);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList56 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray55);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList75 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray74);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>>> strComparableListList76 = com.google.common.collect.ImmutableList.of(strComparableList18, strComparableList37, strComparableList56, strComparableList75);
        boolean boolean77 = strComparableList37.isEmpty();
        java.lang.String[] strArray95 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList96 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray95);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator97 = strComparableList96.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean98 = strComparableList37.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList96);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strComparableList37);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strComparableList56);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strComparableList75);
        org.junit.Assert.assertNotNull(strComparableListList76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertNotNull(strComparableList96);
        org.junit.Assert.assertNotNull(strComparableSpliterator97);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node8 = node5.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean9 = node7.isExprResult();
        com.google.javascript.rhino.Node node10 = node7.cloneTree();
        int int11 = node10.getSourcePosition();
        boolean boolean12 = node10.isIn();
        boolean boolean13 = node10.isDec();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder21 = node20.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean27 = node26.isDefaultCase();
        node26.setVarArgs(true);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) 'a', node20, node26, node34);
        boolean boolean36 = node35.isGetterDef();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(45, node35, node38, 44, 16);
        boolean boolean42 = node38.isFromExterns();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node50 = node47.useSourceInfoIfMissingFromForTree(node49);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean56 = node55.isDefaultCase();
        node55.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId59 = node55.getInputId();
        node55.detachChildren();
        com.google.javascript.rhino.Node node61 = node49.copyInformationFrom(node55);
        int int62 = node55.getType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(44, node10, node38, node55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(inputId59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 45 + "'", int62 == 45);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("{1687381779}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int5 = node4.getType();
        boolean boolean6 = node4.isBlock();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder7 = node4.getJsDocBuilderForNode();
        node4.setQuotedString();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile9 = null;
        node4.setStaticSourceFile(staticSourceFile9);
        com.google.javascript.rhino.InputId inputId11 = node4.getInputId();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 45 + "'", int5 == 45);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder7);
        org.junit.Assert.assertNull(inputId11);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        node4.setVarArgs(true);
        boolean boolean8 = node4.isThrow();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder15 = node14.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean21 = node20.isDefaultCase();
        node20.setVarArgs(true);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) 'a', node14, node20, node28);
        com.google.javascript.rhino.InputId inputId30 = node14.getInputId();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node38 = node35.useSourceInfoIfMissingFromForTree(node37);
        node38.setLineno(10);
        int int41 = node38.getType();
        java.util.Set<java.lang.String> strSet42 = node38.getDirectives();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean48 = node47.isDefaultCase();
        node47.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId51 = node47.getInputId();
        boolean boolean52 = node47.isCase();
        boolean boolean53 = node47.isInc();
        com.google.javascript.jscomp.CodingConvention.Bind bind54 = new com.google.javascript.jscomp.CodingConvention.Bind(node14, node38, node47);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition55 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean56 = typePosition55.hasBrackets();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean62 = node61.isDefaultCase();
        node61.setVarArgs(true);
        node61.setVarArgs(false);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable67 = node61.getAncestors();
        typePosition55.setItem(node61);
        // The following exception was thrown during execution in test generation
        try {
            node4.replaceChildAfter(node38, node61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder15);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(inputId30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 45 + "'", int41 == 45);
        org.junit.Assert.assertNull(strSet42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(inputId51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(ancestorIterable67);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableList18.spliterator();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = node24.useSourceInfoIfMissingFromForTree(node26);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean30 = node29.isFalse();
        boolean boolean31 = node26.hasChild(node29);
        boolean boolean32 = strComparableList18.contains((java.lang.Object) boolean31);
        int int33 = strComparableList18.size();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList43 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean44 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "{1789057375}");
        boolean boolean45 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "{1123380231}");
        boolean boolean46 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean47 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "true");
        boolean boolean48 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "({1789792193})");
        boolean boolean49 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "{1789057375}");
        boolean boolean50 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "true");
        boolean boolean51 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "{928842531}");
        boolean boolean52 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "{1400315076}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = strComparableList18.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList43);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17 + "'", int33 == 17);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        boolean boolean8 = node6.isExprResult();
        int int9 = node6.getLineno();
        boolean boolean10 = node6.isOr();
        java.lang.Class<?> wildcardClass11 = node6.getClass();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.EMPTY_TYPE_COMPONENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Named type with empty name component" + "'", str0, "Named type with empty name component");
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode3 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry2.setResolveMode(resolveMode3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable39 = jSTypeRegistry37.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean40 = jSTypeRegistry37.shouldTolerateUndefinedValues();
        boolean boolean41 = jSTypeRegistry37.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node50 = node47.useSourceInfoIfMissingFromForTree(node49);
        boolean boolean51 = node49.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable56 = jSTypeRegistry54.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean57 = jSTypeRegistry54.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList60 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList60, jSTypeArray59);
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry54.createFunctionTypeWithVarArgs(jSType58, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList60);
        boolean boolean63 = functionType62.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType64 = jSTypeRegistry37.createEnumType("false", node49, (com.google.javascript.rhino.jstype.JSType) functionType62);
        boolean boolean66 = enumType64.isPropertyTypeDeclared("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo68 = null;
        enumType64.setPropertyJSDocInfo("SHEQ  1 [var_args_name: 1]\n", jSDocInfo68);
        boolean boolean71 = enumType64.isPropertyInExterns("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType72 = jSTypeRegistry7.createOptionalType((com.google.javascript.rhino.jstype.JSType) enumType64);
        boolean boolean74 = jSTypeRegistry2.canPropertyBeDefined(jSType72, "{585923242}");
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean76 = jSType72.isSubtype(jSType75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + resolveMode3 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode3.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(jSTypeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(enumType64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        boolean boolean69 = parameterizedType67.isConstructor();
        boolean boolean70 = parameterizedType67.isEmptyType();
        boolean boolean72 = parameterizedType67.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.FunctionType functionType73 = parameterizedType67.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean74 = functionType73.isStringValueType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(functionType73);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        boolean boolean8 = node6.isExprResult();
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        node6.setCharno(29);
        boolean boolean12 = node6.isStringKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = node6.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 100.0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int16 = node15.getType();
        boolean boolean17 = node15.isBlock();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node9, node15, (int) (byte) 10, 44);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder26 = node25.getJsDocBuilderForNode();
        node20.addChildrenToFront(node25);
        // The following exception was thrown during execution in test generation
        try {
            node20.setDouble((double) 17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: BITXOR 10 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder26);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable10 = jSTypeRegistry8.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean11 = jSTypeRegistry8.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList14 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList14, jSTypeArray13);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry8.createFunctionTypeWithVarArgs(jSType12, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList14);
        boolean boolean17 = functionType16.canBeCalled();
        boolean boolean18 = functionType16.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry2.createConstructorType((com.google.javascript.rhino.jstype.JSType) functionType16, jSTypeArray19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType.TypePair typePair22 = functionType16.getTypesUnderInequality(jSType21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        int int0 = com.google.javascript.rhino.Node.IS_NAMESPACE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 46 + "'", int0 == 46);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isBooleanObjectType();
        com.google.javascript.rhino.jstype.JSType jSType69 = parameterizedType67.autobox();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable74 = jSTypeRegistry72.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean75 = jSTypeRegistry72.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray77 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList78 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList78, jSTypeArray77);
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry72.createFunctionTypeWithVarArgs(jSType76, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList78);
        boolean boolean81 = jSType69.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType80);
        int int82 = functionType80.getMinArguments();
        boolean boolean83 = functionType80.isInterface();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertNotNull(jSTypeIterable74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(jSTypeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        node4.setVarArgs(true);
        node4.setWasEmptyNode(true);
        boolean boolean10 = node4.hasChildren();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        boolean boolean5 = jSTypeRegistry2.canPropertyBeDefined(jSType3, "Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType8 = jSTypeRegistry2.createOptionalNullableType(jSType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(errorReporter6);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean6 = node5.isDefaultCase();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection7 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node5);
        boolean boolean8 = node5.isLabel();
        boolean boolean9 = node5.isHook();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean15 = node14.isDefaultCase();
        node14.setVarArgs(true);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean23 = node22.isDefaultCase();
        node22.setVarArgs(true);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(29, node5, node14, node22);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        jSTypeRegistry28.incrementGeneration();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean36 = node35.isDefaultCase();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection37 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node35);
        boolean boolean38 = node35.isLabel();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable43 = jSTypeRegistry41.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean44 = jSTypeRegistry41.shouldTolerateUndefinedValues();
        boolean boolean45 = jSTypeRegistry41.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node54 = node51.useSourceInfoIfMissingFromForTree(node53);
        boolean boolean55 = node53.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable60 = jSTypeRegistry58.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean61 = jSTypeRegistry58.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList64 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList64, jSTypeArray63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry58.createFunctionTypeWithVarArgs(jSType62, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList64);
        boolean boolean67 = functionType66.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType68 = jSTypeRegistry41.createEnumType("false", node53, (com.google.javascript.rhino.jstype.JSType) functionType66);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = functionType66.getConstructor();
        com.google.javascript.rhino.jstype.EnumType enumType70 = jSTypeRegistry28.createEnumType("SHEQ  1 [var_args_name: 1]\n", node35, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean71 = node35.isLabel();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node72 = node26.removeChildAfter(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(nodeCollection37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(enumType68);
        org.junit.Assert.assertNull(functionType69);
        org.junit.Assert.assertNotNull(enumType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        boolean boolean8 = node4.isSwitch();
        boolean boolean9 = node4.isName();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder16 = node15.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean22 = node21.isDefaultCase();
        node21.setVarArgs(true);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) 'a', node15, node21, node29);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile31 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node29);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node39 = node36.useSourceInfoIfMissingFromForTree(node38);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean42 = node41.isFalse();
        boolean boolean43 = node38.hasChild(node41);
        com.google.javascript.rhino.Node node44 = node29.useSourceInfoFromForTree(node38);
        com.google.javascript.rhino.Node node45 = node4.srcrefTree(node29);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder52 = node51.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean58 = node57.isDefaultCase();
        node57.setVarArgs(true);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) 'a', node51, node57, node65);
        boolean boolean67 = node51.isScript();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder68 = node51.new FileLevelJsDocBuilder();
        boolean boolean69 = node51.isQuotedString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node70 = node45.removeChildAfter(node51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(staticSourceFile31);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder52);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean6 = node5.isDefaultCase();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection7 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node5);
        boolean boolean8 = node5.isLabel();
        boolean boolean9 = node5.isGetterDef();
        boolean boolean10 = node5.isIf();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean14 = node13.isGetProp();
        boolean boolean15 = node13.isNumber();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder21 = node20.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int27 = node26.getType();
        boolean boolean28 = node26.isBlock();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 10, node13, node20, node26, (int) (byte) 10, 44);
        com.google.javascript.rhino.Node node32 = node13.getNext();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node5, node13, 17, 4097);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: second new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 45 + "'", int27 == 45);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isBooleanObjectType();
        com.google.javascript.rhino.jstype.JSType jSType69 = parameterizedType67.autobox();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable74 = jSTypeRegistry72.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean75 = jSTypeRegistry72.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray77 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList78 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList78, jSTypeArray77);
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry72.createFunctionTypeWithVarArgs(jSType76, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList78);
        boolean boolean81 = jSType69.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType80);
        com.google.javascript.rhino.jstype.JSType jSType82 = jSType69.autobox();
        boolean boolean83 = jSType82.isResolved();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertNotNull(jSTypeIterable74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(jSTypeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 2, 54, (int) (short) 100);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node11 = node8.useSourceInfoIfMissingFromForTree(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node8);
        boolean boolean13 = node3.isEquivalentTo(node8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = node3.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable11 = jSTypeRegistry9.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean12 = jSTypeRegistry9.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable17 = jSTypeRegistry15.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean18 = jSTypeRegistry15.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable23 = jSTypeRegistry21.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean24 = jSTypeRegistry21.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = jSTypeRegistry21.getErrorReporter();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList26 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry9, jSTypeRegistry15, jSTypeRegistry21);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable31 = jSTypeRegistry29.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean32 = jSTypeRegistry29.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable37 = jSTypeRegistry35.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean38 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList41 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList41, jSTypeArray40);
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry35.createFunctionTypeWithVarArgs(jSType39, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList41);
        boolean boolean44 = functionType43.canBeCalled();
        boolean boolean45 = functionType43.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry29.createConstructorType((com.google.javascript.rhino.jstype.JSType) functionType43, jSTypeArray46);
        com.google.javascript.rhino.Node node48 = jSTypeRegistry9.createOptionalParameters(jSTypeArray46);
        com.google.javascript.rhino.Node node49 = node48.getParent();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(errorReporter25);
        org.junit.Assert.assertNotNull(jSTypeRegistryList26);
        org.junit.Assert.assertNotNull(jSTypeIterable31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(node49);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableList18.spliterator();
        int int21 = strComparableList18.lastIndexOf((java.lang.Object) "false");
        com.google.common.collect.UnmodifiableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor22 = strComparableList18.listIterator();
        boolean boolean23 = strComparableList18.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable26 = strComparableList18.set((-1), (java.lang.Comparable<java.lang.String>) "{proxy:function (): {173867202}}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strComparableItor22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        java.lang.String str2 = ternaryValue1.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = ternaryValue1.or(ternaryValue3);
        boolean boolean6 = ternaryValue4.toBoolean(false);
        java.lang.String str7 = ternaryValue4.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue4.xor(ternaryValue8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "false" + "'", str2, "false");
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "true" + "'", str7, "true");
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList1 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "");
        boolean boolean2 = strComparableList1.isEmpty();
        java.lang.Object[] objArray3 = strComparableList1.toArray();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList22 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray21);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList41 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray40);
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList60 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray59);
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList79 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray78);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>>> strComparableListList80 = com.google.common.collect.ImmutableList.of(strComparableList22, strComparableList41, strComparableList60, strComparableList79);
        com.google.common.collect.UnmodifiableIterator<java.lang.Comparable<java.lang.String>> strComparableItor81 = strComparableList22.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean82 = strComparableList1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strComparableList22);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strComparableList41);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strComparableList60);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strComparableList79);
        org.junit.Assert.assertNotNull(strComparableListList80);
        org.junit.Assert.assertNotNull(strComparableItor81);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable11 = jSTypeRegistry9.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean12 = jSTypeRegistry9.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList15 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList15, jSTypeArray14);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry9.createFunctionTypeWithVarArgs(jSType13, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList15);
        boolean boolean18 = functionType17.canBeCalled();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot20 = functionType17.getOwnSlot("[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]");
        boolean boolean21 = functionType17.isUnionType();
        java.lang.String str22 = functionType17.toString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet23 = functionType17.getPossibleToBooleanOutcomes();
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry2.overwriteDeclaredType("{1400315076}", (com.google.javascript.rhino.jstype.JSType) functionType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(errorReporter5);
        org.junit.Assert.assertNotNull(jSTypeIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "function (): ?" + "'", str22, "function (): ?");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet23 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet23.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node5 = node4.getParent();
        int int6 = node4.getChildCount();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node14 = node11.useSourceInfoIfMissingFromForTree(node13);
        boolean boolean15 = node13.isExprResult();
        com.google.javascript.rhino.Node node16 = node13.cloneTree();
        int int17 = node16.getSourcePosition();
        boolean boolean18 = node16.isIn();
        com.google.javascript.rhino.Node node19 = node16.getFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node20 = node4.copyInformationFrom(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int6 = node5.getType();
        boolean boolean7 = node5.isDebugger();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean11 = node10.isGetProp();
        boolean boolean12 = node10.isNumber();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder18 = node17.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int24 = node23.getType();
        boolean boolean25 = node23.isBlock();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 10, node10, node17, node23, (int) (byte) 10, 44);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship29 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node5, node23);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType30 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int36 = node35.getType();
        boolean boolean37 = node35.isDebugger();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean41 = node40.isGetProp();
        boolean boolean42 = node40.isNumber();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder48 = node47.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int54 = node53.getType();
        boolean boolean55 = node53.isBlock();
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (short) 10, node40, node47, node53, (int) (byte) 10, 44);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship59 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType30, node35, node53);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType60 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int66 = node65.getType();
        boolean boolean67 = node65.isDebugger();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean71 = node70.isGetProp();
        boolean boolean72 = node70.isNumber();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder78 = node77.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int84 = node83.getType();
        boolean boolean85 = node83.isBlock();
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node((int) (short) 10, node70, node77, node83, (int) (byte) 10, 44);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship89 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType60, node65, node83);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType90 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType91 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType92 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList93 = com.google.common.collect.ImmutableList.of(subclassType0, subclassType30, subclassType60, subclassType90, subclassType91, subclassType92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 5");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 45 + "'", int6 == 45);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 45 + "'", int24 == 45);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + subclassType30 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType30.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 45 + "'", int36 == 45);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder48);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 45 + "'", int54 == 45);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + subclassType60 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType60.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 45 + "'", int66 == 45);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder78);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 45 + "'", int84 == 45);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + subclassType90 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType90.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + subclassType91 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType91.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable11 = jSTypeRegistry9.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean12 = jSTypeRegistry9.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable17 = jSTypeRegistry15.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean18 = jSTypeRegistry15.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable23 = jSTypeRegistry21.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean24 = jSTypeRegistry21.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = jSTypeRegistry21.getErrorReporter();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList26 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry9, jSTypeRegistry15, jSTypeRegistry21);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable31 = jSTypeRegistry29.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean32 = jSTypeRegistry29.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList35 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList35, jSTypeArray34);
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry29.createFunctionTypeWithVarArgs(jSType33, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList35);
        com.google.javascript.rhino.Node node38 = jSTypeRegistry2.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList35);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative39 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry2.getNativeFunctionType(jSTypeNative39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(errorReporter25);
        org.junit.Assert.assertNotNull(jSTypeRegistryList26);
        org.junit.Assert.assertNotNull(jSTypeIterable31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        boolean boolean69 = parameterizedType67.isConstructor();
        boolean boolean70 = parameterizedType67.isEmptyType();
        boolean boolean72 = parameterizedType67.isPropertyTypeDeclared("false");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean73 = parameterizedType67.hasAnyTemplateInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        jSTypeRegistry2.forwardDeclareType("{1687381779}");
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray13 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType14 = jSTypeRegistry2.createUnionType(jSTypeNativeArray13);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType16 = jSTypeRegistry2.getNativeObjectType(jSTypeNative15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNotNull(jSTypeNativeArray13);
        org.junit.Assert.assertNotNull(jSType14);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        functionType10.clearCachedValues();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = functionType10.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = functionType12.isFunctionPrototypeType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(functionType12);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        boolean boolean11 = functionType10.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry14.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean17 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        boolean boolean18 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = node24.useSourceInfoIfMissingFromForTree(node26);
        boolean boolean28 = node26.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable33 = jSTypeRegistry31.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean34 = jSTypeRegistry31.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList37 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList37, jSTypeArray36);
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry31.createFunctionTypeWithVarArgs(jSType35, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList37);
        boolean boolean40 = functionType39.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType41 = jSTypeRegistry14.createEnumType("false", node26, (com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = functionType39.getConstructor();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair43 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType10, (com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType10.findPropertyType("");
        boolean boolean46 = functionType10.hasCachedValues();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(enumType41);
        org.junit.Assert.assertNull(functionType42);
        org.junit.Assert.assertNull(jSType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        // The following exception was thrown during execution in test generation
        try {
            typePosition0.setPositionInformation(39, 4097, 8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 39?end-line: 8");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int5 = node4.getType();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder12 = node11.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean18 = node17.isDefaultCase();
        node17.setVarArgs(true);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) 'a', node11, node17, node25);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node25);
        com.google.javascript.rhino.Node node28 = node4.useSourceInfoFromForTree(node25);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = node25.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable34 = jSTypeRegistry32.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean35 = jSTypeRegistry32.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList38 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList38, jSTypeArray37);
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry32.createFunctionTypeWithVarArgs(jSType36, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList38);
        boolean boolean41 = functionType40.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable46 = jSTypeRegistry44.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean47 = jSTypeRegistry44.shouldTolerateUndefinedValues();
        boolean boolean48 = jSTypeRegistry44.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node57 = node54.useSourceInfoIfMissingFromForTree(node56);
        boolean boolean58 = node56.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable63 = jSTypeRegistry61.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean64 = jSTypeRegistry61.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList67 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList67, jSTypeArray66);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry61.createFunctionTypeWithVarArgs(jSType65, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList67);
        boolean boolean70 = functionType69.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType71 = jSTypeRegistry44.createEnumType("false", node56, (com.google.javascript.rhino.jstype.JSType) functionType69);
        java.util.Set<java.lang.String> strSet72 = functionType69.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair73 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType40, (com.google.javascript.rhino.jstype.JSType) functionType69);
        com.google.javascript.rhino.Node node74 = functionType40.getSource();
        node25.setJSType((com.google.javascript.rhino.jstype.JSType) functionType40);
        com.google.javascript.rhino.jstype.ObjectType objectType76 = functionType40.getPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType77 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType40);
        boolean boolean78 = objectType77.isParameterizedType();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 45 + "'", int5 == 45);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(staticSourceFile27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(staticSourceFile29);
        org.junit.Assert.assertNotNull(jSTypeIterable34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jSTypeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(enumType71);
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertNotNull(objectType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int5 = node4.getType();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder12 = node11.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean18 = node17.isDefaultCase();
        node17.setVarArgs(true);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) 'a', node11, node17, node25);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node25);
        com.google.javascript.rhino.Node node28 = node4.useSourceInfoFromForTree(node25);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = node25.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable34 = jSTypeRegistry32.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean35 = jSTypeRegistry32.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList38 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList38, jSTypeArray37);
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry32.createFunctionTypeWithVarArgs(jSType36, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList38);
        boolean boolean41 = functionType40.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable46 = jSTypeRegistry44.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean47 = jSTypeRegistry44.shouldTolerateUndefinedValues();
        boolean boolean48 = jSTypeRegistry44.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node57 = node54.useSourceInfoIfMissingFromForTree(node56);
        boolean boolean58 = node56.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable63 = jSTypeRegistry61.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean64 = jSTypeRegistry61.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList67 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList67, jSTypeArray66);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry61.createFunctionTypeWithVarArgs(jSType65, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList67);
        boolean boolean70 = functionType69.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType71 = jSTypeRegistry44.createEnumType("false", node56, (com.google.javascript.rhino.jstype.JSType) functionType69);
        java.util.Set<java.lang.String> strSet72 = functionType69.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair73 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType40, (com.google.javascript.rhino.jstype.JSType) functionType69);
        com.google.javascript.rhino.Node node74 = functionType40.getSource();
        node25.setJSType((com.google.javascript.rhino.jstype.JSType) functionType40);
        com.google.javascript.rhino.jstype.JSType jSType77 = functionType40.findPropertyType("({1789792193})");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 45 + "'", int5 == 45);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(staticSourceFile27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(staticSourceFile29);
        org.junit.Assert.assertNotNull(jSTypeIterable34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jSTypeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(enumType71);
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNull(jSType77);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList14 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean15 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "(Unknown class name)");
        boolean boolean16 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "{1631934685}");
        boolean boolean17 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "{928842531}");
        boolean boolean18 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "{1789792193}");
        boolean boolean19 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "{126427428}");
        boolean boolean20 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "{796389407}");
        boolean boolean21 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "{1631953089}");
        boolean boolean22 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "{proxy:function (): {173867202}}");
        boolean boolean23 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "{1571838970}");
        boolean boolean24 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "{680394635}");
        boolean boolean25 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "{1822158766}");
        boolean boolean26 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "{726289308}");
        boolean boolean27 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "{1060464605}");
        boolean boolean28 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "{2044072356}");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable30 = strComparableList14.remove(39);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 39, Size: 14");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList1 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "");
        com.google.common.collect.UnmodifiableIterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableList1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList1);
        org.junit.Assert.assertNotNull(strComparableItor2);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasFileOverview();
        boolean boolean2 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression3);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableList2.size();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean11 = node10.isDefaultCase();
        node10.setVarArgs(true);
        node10.setVarArgs(false);
        boolean boolean16 = strComparableList2.contains((java.lang.Object) node10);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean31 = enumType29.isPropertyTypeDeclared("");
        boolean boolean32 = enumType29.matchesStringContext();
        java.lang.String str33 = enumType29.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.FunctionType functionType34 = enumType29.getConstructor();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = enumType29.getJSDocInfo();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder43 = node42.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean49 = node48.isDefaultCase();
        node48.setVarArgs(true);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) 'a', node42, node48, node56);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile58 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node56);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node66 = node63.useSourceInfoIfMissingFromForTree(node65);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean69 = node68.isFalse();
        boolean boolean70 = node65.hasChild(node68);
        com.google.javascript.rhino.Node node71 = node56.useSourceInfoFromForTree(node65);
        boolean boolean72 = enumType29.defineElement("", node65);
        com.google.javascript.rhino.jstype.ObjectType.Property property74 = enumType29.getSlot("{1631953089}");
        boolean boolean75 = enumType29.matchesNumberContext();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{53194876}" + "'", str33, "{53194876}");
        org.junit.Assert.assertNull(functionType34);
        org.junit.Assert.assertNull(jSDocInfo35);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder43);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNull(staticSourceFile58);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(property74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable10 = jSTypeRegistry8.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean11 = jSTypeRegistry8.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList14 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList14, jSTypeArray13);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry8.createFunctionTypeWithVarArgs(jSType12, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList14);
        boolean boolean17 = functionType16.canBeCalled();
        boolean boolean18 = functionType16.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry2.createConstructorType((com.google.javascript.rhino.jstype.JSType) functionType16, jSTypeArray19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable25 = jSTypeRegistry23.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean26 = jSTypeRegistry23.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList29 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList29, jSTypeArray28);
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry23.createFunctionTypeWithVarArgs(jSType27, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList29);
        boolean boolean32 = functionType31.canBeCalled();
        java.util.Set<java.lang.String> strSet33 = functionType31.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.FunctionType functionType35 = functionType31.getBindReturnType(40);
        boolean boolean36 = functionType31.isNominalType();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node42 = jSTypeRegistry40.createParameters(jSTypeArray41);
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType31, false, jSTypeArray41);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType44 = functionType43.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(jSTypeIterable25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int6 = node5.getType();
        boolean boolean7 = node5.isDebugger();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean11 = node10.isGetProp();
        boolean boolean12 = node10.isNumber();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder18 = node17.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int24 = node23.getType();
        boolean boolean25 = node23.isBlock();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 10, node10, node17, node23, (int) (byte) 10, 44);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship29 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node5, node23);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean36 = node35.isDefaultCase();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection37 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node35);
        boolean boolean38 = node35.isLabel();
        boolean boolean39 = node35.isGetterDef();
        boolean boolean40 = node35.isIf();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = node35.getJSDocInfo();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship42 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node30, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 45 + "'", int6 == 45);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 45 + "'", int24 == 45);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(nodeCollection37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(jSDocInfo41);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node5.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean12 = node11.isDefaultCase();
        node11.setVarArgs(true);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) 'a', node5, node11, node19);
        boolean boolean21 = node20.isGetterDef();
        boolean boolean22 = node20.isQuotedString();
        node20.setSourceEncodedPosition(4);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo25 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        boolean boolean11 = functionType10.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry14.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean17 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        boolean boolean18 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = node24.useSourceInfoIfMissingFromForTree(node26);
        boolean boolean28 = node26.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable33 = jSTypeRegistry31.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean34 = jSTypeRegistry31.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList37 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList37, jSTypeArray36);
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry31.createFunctionTypeWithVarArgs(jSType35, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList37);
        boolean boolean40 = functionType39.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType41 = jSTypeRegistry14.createEnumType("false", node26, (com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = functionType39.getConstructor();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair43 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType10, (com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable48 = jSTypeRegistry46.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean49 = jSTypeRegistry46.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray51 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList52 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList52, jSTypeArray51);
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry46.createFunctionTypeWithVarArgs(jSType50, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList52);
        boolean boolean55 = functionType54.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable60 = jSTypeRegistry58.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean61 = jSTypeRegistry58.shouldTolerateUndefinedValues();
        boolean boolean62 = jSTypeRegistry58.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node71 = node68.useSourceInfoIfMissingFromForTree(node70);
        boolean boolean72 = node70.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable77 = jSTypeRegistry75.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean78 = jSTypeRegistry75.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray80 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList81 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList81, jSTypeArray80);
        com.google.javascript.rhino.jstype.FunctionType functionType83 = jSTypeRegistry75.createFunctionTypeWithVarArgs(jSType79, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList81);
        boolean boolean84 = functionType83.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType85 = jSTypeRegistry58.createEnumType("false", node70, (com.google.javascript.rhino.jstype.JSType) functionType83);
        java.util.Set<java.lang.String> strSet86 = functionType83.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair87 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType54, (com.google.javascript.rhino.jstype.JSType) functionType83);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSType.TypePair> typePairList88 = com.google.common.collect.ImmutableList.of(typePair43, typePair87);
        com.google.javascript.rhino.jstype.JSType jSType89 = typePair43.typeA;
        boolean boolean90 = jSType89.matchesNumberContext();
        boolean boolean91 = jSType89.isEnumElementType();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(enumType41);
        org.junit.Assert.assertNull(functionType42);
        org.junit.Assert.assertNotNull(jSTypeIterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(jSTypeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(jSTypeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(functionType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(enumType85);
        org.junit.Assert.assertNotNull(strSet86);
        org.junit.Assert.assertNotNull(typePairList88);
        org.junit.Assert.assertNotNull(jSType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isBooleanObjectType();
        com.google.javascript.rhino.jstype.JSType jSType69 = parameterizedType67.getIndexType();
        boolean boolean71 = parameterizedType67.isPropertyTypeInferred("Unknown class name");
        java.lang.Class<?> wildcardClass72 = parameterizedType67.getClass();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList37 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray36);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList56 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray55);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList75 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray74);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>>> strComparableListList76 = com.google.common.collect.ImmutableList.of(strComparableList18, strComparableList37, strComparableList56, strComparableList75);
        boolean boolean78 = strComparableList18.contains((java.lang.Object) (short) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream79 = strComparableList18.parallelStream();
        com.google.javascript.rhino.JSDocInfo jSDocInfo80 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean81 = jSDocInfo80.hasReturnType();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection82 = jSDocInfo80.getTypeNodes();
        java.lang.String str83 = jSDocInfo80.getBlockDescription();
        com.google.javascript.rhino.JSDocInfo jSDocInfo84 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str85 = jSDocInfo84.getDescription();
        jSDocInfo84.setLicense("");
        boolean boolean88 = jSDocInfo84.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression89 = jSDocInfo84.getReturnType();
        com.google.javascript.rhino.JSDocInfo[] jSDocInfoArray90 = new com.google.javascript.rhino.JSDocInfo[] { jSDocInfo80, jSDocInfo84 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo[] jSDocInfoArray91 = strComparableList18.toArray(jSDocInfoArray90);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strComparableList37);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strComparableList56);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strComparableList75);
        org.junit.Assert.assertNotNull(strComparableListList76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strComparableStream79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(nodeCollection82);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(jSTypeExpression89);
        org.junit.Assert.assertNotNull(jSDocInfoArray90);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        node12.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId16 = node12.getInputId();
        node12.detachChildren();
        com.google.javascript.rhino.Node node18 = node6.copyInformationFrom(node12);
        int int19 = node12.getType();
        java.lang.String[] strArray25 = new java.lang.String[] { "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "Unknown class name", "Unknown class name", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        node12.setDirectives((java.util.Set<java.lang.String>) strSet26);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean31 = strSet26.remove((java.lang.Object) node30);
        boolean boolean32 = node30.isString();
        node30.setCharno(10);
        boolean boolean35 = node30.isScript();
        com.google.javascript.rhino.Node node36 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node37 = node30.useSourceInfoIfMissingFrom(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableList18.spliterator();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = node24.useSourceInfoIfMissingFromForTree(node26);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean30 = node29.isFalse();
        boolean boolean31 = node26.hasChild(node29);
        boolean boolean32 = strComparableList18.contains((java.lang.Object) boolean31);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "{126693880}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList37 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray36);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList56 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray55);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList75 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray74);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>>> strComparableListList76 = com.google.common.collect.ImmutableList.of(strComparableList18, strComparableList37, strComparableList56, strComparableList75);
        com.google.common.collect.UnmodifiableIterator<java.lang.Comparable<java.lang.String>> strComparableItor77 = strComparableList56.iterator();
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator78 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList56.replaceAll(strComparableUnaryOperator78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strComparableList37);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strComparableList56);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strComparableList75);
        org.junit.Assert.assertNotNull(strComparableListList76);
        org.junit.Assert.assertNotNull(strComparableItor77);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType69 = parameterizedType67.getIndexType();
        boolean boolean71 = parameterizedType67.isPropertyInExterns("NUMBER 100.0");
        com.google.javascript.rhino.jstype.UnionType unionType72 = parameterizedType67.toMaybeUnionType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType73 = unionType72.unboxesTo();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(unionType72);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean31 = enumType29.isPropertyTypeDeclared("");
        boolean boolean32 = enumType29.matchesStringContext();
        java.lang.String str33 = enumType29.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.FunctionType functionType34 = enumType29.getConstructor();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = enumType29.getJSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = null;
        enumType29.setPropertyJSDocInfo("{1631953089}", jSDocInfo37);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = enumType29.getImplicitPrototype();
        boolean boolean40 = objectType39.hasReferenceName();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{1560722860}" + "'", str33, "{1560722860}");
        org.junit.Assert.assertNull(functionType34);
        org.junit.Assert.assertNull(jSDocInfo35);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        boolean boolean11 = functionType10.canBeCalled();
        boolean boolean12 = functionType10.hasAnyTemplateInternal();
        int int13 = functionType10.getPropertiesCount();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType10.getOwnImplementedInterfaces();
        boolean boolean15 = functionType10.isOrdinaryFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType16 = functionType10.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        node4.setVarArgs(true);
        node4.setVarArgs(false);
        node4.setLength((int) (byte) 0);
        node4.removeProp((int) 'a');
        node4.setIsSyntheticBlock(true);
        com.google.javascript.rhino.Node node16 = node4.cloneTree();
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        boolean boolean18 = node4.isSetterDef();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        com.google.javascript.rhino.Node node70 = parameterizedType67.getPropertyNode("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean71 = parameterizedType67.hasAnyTemplateInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(node70);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        int int0 = com.google.javascript.rhino.Node.INCRDECR_PROP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("{680394635}");
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        functionType10.clearCachedValues();
        int int12 = functionType10.getExtendedInterfacesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = functionType10.getTypeOfThis();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable18 = jSTypeRegistry16.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean19 = jSTypeRegistry16.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList22 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList22, jSTypeArray21);
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry16.createFunctionTypeWithVarArgs(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList22);
        boolean boolean25 = functionType24.matchesObjectContext();
        boolean boolean27 = functionType24.isPropertyTypeDeclared("{2044072356}");
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType24.getParameterType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair29 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType10, (com.google.javascript.rhino.jstype.JSType) functionType24);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType31 = functionType24.getTopMostDefiningType("function (): ?");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(jSTypeIterable18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(jSType28);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node5.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean12 = node11.isDefaultCase();
        node11.setVarArgs(true);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) 'a', node5, node11, node19);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node19);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node29 = node26.useSourceInfoIfMissingFromForTree(node28);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean32 = node31.isFalse();
        boolean boolean33 = node28.hasChild(node31);
        com.google.javascript.rhino.Node node34 = node19.useSourceInfoFromForTree(node28);
        int int35 = node19.getType();
        boolean boolean36 = node19.isCase();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(staticSourceFile21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 45 + "'", int35 == 45);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        boolean boolean8 = node4.isFor();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable7 = jSTypeRegistry5.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean8 = jSTypeRegistry5.shouldTolerateUndefinedValues();
        boolean boolean9 = jSTypeRegistry5.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node18 = node15.useSourceInfoIfMissingFromForTree(node17);
        boolean boolean19 = node17.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable24 = jSTypeRegistry22.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean25 = jSTypeRegistry22.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList28 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList28, jSTypeArray27);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry22.createFunctionTypeWithVarArgs(jSType26, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList28);
        boolean boolean31 = functionType30.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType32 = jSTypeRegistry5.createEnumType("false", node17, (com.google.javascript.rhino.jstype.JSType) functionType30);
        java.util.Set<java.lang.String> strSet33 = functionType30.getOwnPropertyNames();
        boolean boolean34 = functionType30.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable39 = jSTypeRegistry37.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean40 = jSTypeRegistry37.shouldTolerateUndefinedValues();
        boolean boolean41 = jSTypeRegistry37.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node50 = node47.useSourceInfoIfMissingFromForTree(node49);
        boolean boolean51 = node49.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable56 = jSTypeRegistry54.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean57 = jSTypeRegistry54.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList60 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList60, jSTypeArray59);
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry54.createFunctionTypeWithVarArgs(jSType58, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList60);
        boolean boolean63 = functionType62.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType64 = jSTypeRegistry37.createEnumType("false", node49, (com.google.javascript.rhino.jstype.JSType) functionType62);
        boolean boolean66 = enumType64.isPropertyTypeDeclared("");
        boolean boolean67 = enumType64.matchesStringContext();
        java.lang.String str68 = enumType64.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.FunctionType functionType69 = enumType64.getConstructor();
        boolean boolean70 = functionType30.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) enumType64);
        com.google.common.collect.ImmutableList<java.lang.String> strList71 = functionType30.getTemplateTypeNames();
        jSTypeRegistry2.setTemplateTypeNames((java.util.List<java.lang.String>) strList71);
        jSTypeRegistry2.forwardDeclareType("{328973212}");
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable80 = jSTypeRegistry78.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean81 = jSTypeRegistry78.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable86 = jSTypeRegistry84.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean87 = jSTypeRegistry84.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType88 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray89 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList90 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList90, jSTypeArray89);
        com.google.javascript.rhino.jstype.FunctionType functionType92 = jSTypeRegistry84.createFunctionTypeWithVarArgs(jSType88, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList90);
        boolean boolean93 = functionType92.canBeCalled();
        boolean boolean94 = functionType92.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray95 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType96 = jSTypeRegistry78.createConstructorType((com.google.javascript.rhino.jstype.JSType) functionType92, jSTypeArray95);
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList97 = functionType96.getSubTypes();
        boolean boolean98 = jSTypeRegistry2.declareType("{581538441}", (com.google.javascript.rhino.jstype.JSType) functionType96);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable99 = functionType96.getImplementedInterfaces();
        org.junit.Assert.assertNotNull(jSTypeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(enumType32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(enumType64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "{523756211}" + "'", str68, "{523756211}");
        org.junit.Assert.assertNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(jSTypeIterable80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(jSTypeArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(functionType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(jSTypeArray95);
        org.junit.Assert.assertNotNull(functionType96);
        org.junit.Assert.assertNull(functionTypeList97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable99);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "{393150955}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int5 = node4.getType();
        boolean boolean6 = node4.isDebugger();
        boolean boolean7 = node4.isString();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder14 = node13.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean20 = node19.isDefaultCase();
        node19.setVarArgs(true);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) 'a', node13, node19, node27);
        com.google.javascript.rhino.InputId inputId29 = node13.getInputId();
        com.google.javascript.rhino.Node node30 = node4.useSourceInfoFrom(node13);
        boolean boolean31 = node30.isInstanceOf();
        boolean boolean32 = node30.isInstanceOf();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node40 = node37.useSourceInfoIfMissingFromForTree(node39);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean46 = node45.isDefaultCase();
        node45.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId49 = node45.getInputId();
        node45.detachChildren();
        com.google.javascript.rhino.Node node51 = node39.copyInformationFrom(node45);
        int int52 = node45.getType();
        java.lang.String[] strArray58 = new java.lang.String[] { "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "Unknown class name", "Unknown class name", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" };
        java.util.LinkedHashSet<java.lang.String> strSet59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet59, strArray58);
        node45.setDirectives((java.util.Set<java.lang.String>) strSet59);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean64 = strSet59.remove((java.lang.Object) node63);
        boolean boolean65 = node63.isString();
        node63.setCharno(10);
        boolean boolean68 = node63.isScript();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node76 = node73.useSourceInfoIfMissingFromForTree(node75);
        boolean boolean77 = node75.isExprResult();
        com.google.javascript.rhino.Node node78 = node75.cloneTree();
        boolean boolean79 = node78.isStringKey();
        // The following exception was thrown during execution in test generation
        try {
            node30.addChildrenAfter(node63, node78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 45 + "'", int5 == 45);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(inputId49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 45 + "'", int52 == 45);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder5 = node4.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node6 = node4.getLastSibling();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node4.siblings();
        boolean boolean8 = node4.hasChildren();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str10 = jSDocInfo9.getDescription();
        boolean boolean11 = jSDocInfo9.hasFileOverview();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean16 = node15.isGetProp();
        boolean boolean17 = node15.isNumber();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder23 = node22.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int29 = node28.getType();
        boolean boolean30 = node28.isBlock();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (short) 10, node15, node22, node28, (int) (byte) 10, 44);
        com.google.javascript.rhino.Node node34 = node15.detachFromParent();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node42 = node39.useSourceInfoIfMissingFromForTree(node41);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean48 = node47.isDefaultCase();
        node47.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId51 = node47.getInputId();
        node47.detachChildren();
        com.google.javascript.rhino.Node node53 = node41.copyInformationFrom(node47);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node61 = node58.useSourceInfoIfMissingFromForTree(node60);
        node61.setLineno(10);
        com.google.javascript.rhino.Node node64 = node47.copyInformationFrom(node61);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node((-1), node34, node47, (int) ' ', 1);
        boolean boolean68 = node34.isHook();
        java.lang.String str69 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node34);
        jSDocInfo9.setAssociatedNode(node34);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean77 = node76.isDefaultCase();
        node76.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId80 = node76.getInputId();
        node76.detachChildren();
        boolean boolean82 = node76.isNull();
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node((int) 'a', node76);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable84 = node76.children();
        boolean boolean85 = node76.isIn();
        com.google.javascript.rhino.Node node86 = node76.detachFromParent();
        // The following exception was thrown during execution in test generation
        try {
            node4.addChildrenAfter(node34, node76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 45 + "'", int29 == 45);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(inputId51);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(inputId80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(nodeIterable84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(node86);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.UnmodifiableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor20 = strComparableList18.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (-1) must not be negative");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int16 = node15.getType();
        boolean boolean17 = node15.isBlock();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node9, node15, (int) (byte) 10, 44);
        node15.setSourceEncodedPositionForTree(45);
        boolean boolean23 = node15.isSetterDef();
        boolean boolean24 = node15.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo25 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        jSTypeRegistry2.forwardDeclareType("{1687381779}");
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray13 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType14 = jSTypeRegistry2.createUnionType(jSTypeNativeArray13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable19 = jSTypeRegistry17.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean20 = jSTypeRegistry17.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList23 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList23, jSTypeArray22);
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry17.createFunctionTypeWithVarArgs(jSType21, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList23);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node31 = jSTypeRegistry29.createParameters(jSTypeArray30);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable36 = jSTypeRegistry34.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean37 = jSTypeRegistry34.shouldTolerateUndefinedValues();
        boolean boolean38 = jSTypeRegistry34.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node47 = node44.useSourceInfoIfMissingFromForTree(node46);
        boolean boolean48 = node46.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable53 = jSTypeRegistry51.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean54 = jSTypeRegistry51.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList57 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList57, jSTypeArray56);
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry51.createFunctionTypeWithVarArgs(jSType55, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList57);
        boolean boolean60 = functionType59.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType61 = jSTypeRegistry34.createEnumType("false", node46, (com.google.javascript.rhino.jstype.JSType) functionType59);
        java.util.Set<java.lang.String> strSet62 = functionType59.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable67 = jSTypeRegistry65.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean68 = jSTypeRegistry65.shouldTolerateUndefinedValues();
        boolean boolean69 = jSTypeRegistry65.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node78 = node75.useSourceInfoIfMissingFromForTree(node77);
        boolean boolean79 = node77.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter80 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter80, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable84 = jSTypeRegistry82.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean85 = jSTypeRegistry82.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType86 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray87 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList88 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList88, jSTypeArray87);
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry82.createFunctionTypeWithVarArgs(jSType86, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList88);
        boolean boolean91 = functionType90.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType92 = jSTypeRegistry65.createEnumType("false", node77, (com.google.javascript.rhino.jstype.JSType) functionType90);
        com.google.javascript.rhino.jstype.FunctionType functionType93 = functionType90.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType94 = jSTypeRegistry29.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType59, (com.google.javascript.rhino.jstype.JSType) functionType93);
        boolean boolean95 = parameterizedType94.isNativeObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType96 = parameterizedType94.getTypeOfThis();
        boolean boolean98 = parameterizedType94.isPropertyTypeInferred("InputId: hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType99 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) parameterizedType94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNotNull(jSTypeNativeArray13);
        org.junit.Assert.assertNotNull(jSType14);
        org.junit.Assert.assertNotNull(jSTypeIterable19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(jSTypeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(enumType61);
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNotNull(jSTypeIterable67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(jSTypeArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(enumType92);
        org.junit.Assert.assertNull(functionType93);
        org.junit.Assert.assertNotNull(parameterizedType94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(objectType96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "{523756211}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        com.google.common.collect.ImmutableList.Builder<java.lang.Object> objBuilder0 = com.google.common.collect.ImmutableList.builder();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList19 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray18);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList38 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray37);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList57 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray56);
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList76 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray75);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>>> strComparableListList77 = com.google.common.collect.ImmutableList.of(strComparableList19, strComparableList38, strComparableList57, strComparableList76);
        com.google.common.collect.UnmodifiableIterator<java.lang.Comparable<java.lang.String>> strComparableItor78 = strComparableList76.iterator();
        com.google.common.collect.ImmutableList.Builder<java.lang.Object> objBuilder79 = objBuilder0.addAll((java.util.Iterator<java.lang.Comparable<java.lang.String>>) strComparableItor78);
        com.google.common.collect.ImmutableList<java.lang.Object> objList80 = objBuilder0.build();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList82 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "");
        com.google.common.collect.UnmodifiableIterator<java.lang.Comparable<java.lang.String>> strComparableItor83 = strComparableList82.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor84 = strComparableList82.iterator();
        com.google.common.collect.ImmutableList.Builder<java.lang.Object> objBuilder85 = objBuilder0.add((java.lang.Object) strComparableItor84);
        org.junit.Assert.assertNotNull(objBuilder0);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strComparableList19);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strComparableList38);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strComparableList57);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(strComparableList76);
        org.junit.Assert.assertNotNull(strComparableListList77);
        org.junit.Assert.assertNotNull(strComparableItor78);
        org.junit.Assert.assertNotNull(objBuilder79);
        org.junit.Assert.assertNotNull(objList80);
        org.junit.Assert.assertNotNull(strComparableList82);
        org.junit.Assert.assertNotNull(strComparableItor83);
        org.junit.Assert.assertNotNull(strComparableItor84);
        org.junit.Assert.assertNotNull(objBuilder85);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", jSTypeNative1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean8 = node7.isDefaultCase();
        node7.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId11 = node7.getInputId();
        node7.detachChildren();
        boolean boolean13 = node7.isNot();
        boolean boolean14 = node7.isSetterDef();
        com.google.javascript.rhino.Node node15 = assertionFunctionSpec2.getAssertedParam(node7);
        node15.setLineno((int) (short) 10);
        com.google.javascript.rhino.Node node18 = node15.removeChildren();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = node18.getIntProp(97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node18);
    }
}
