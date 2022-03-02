import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) (byte) 100, node1, node2, node3, node4, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) (short) 1, node1, node2, node3, node4, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) (short) 10, node1, node2, node3, (int) '4', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.google.javascript.rhino.Node node0 = null;
        java.lang.String str1 = com.google.javascript.jscomp.NodeUtil.getSourceName(node0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile1 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node0);
        org.junit.Assert.assertNull(staticSourceFile1);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        com.google.javascript.rhino.InputId inputId4 = com.google.javascript.jscomp.NodeUtil.getInputId(node1);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node1);
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator6 = nodeCollection5.spliterator();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputId4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertNotNull(nodeSpliterator6);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        // The following exception was thrown during execution in test generation
        try {
            node1.setSideEffectFlags((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        node1.setLineno(2);
        int int5 = node1.getCharno();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean8 = node7.isOr();
        boolean boolean9 = node7.isLabel();
        java.lang.String str10 = node7.toStringTree();
        boolean boolean11 = node7.isDebugger();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind18 = new com.google.javascript.jscomp.CodingConvention.Bind(node7, node13, node16);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean22 = node21.hasOneChild();
        boolean boolean23 = node21.isObjectLit();
        com.google.javascript.rhino.InputId inputId24 = com.google.javascript.jscomp.NodeUtil.getInputId(node21);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((-1), node21);
        boolean boolean26 = node21.isName();
        boolean boolean27 = node21.isComma();
        // The following exception was thrown during execution in test generation
        try {
            node1.replaceChild(node7, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The new child node already has a parent.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NUMBER -1.0\n" + "'", str10, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(inputId24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(4095);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isObjectLit();
        com.google.javascript.rhino.InputId inputId6 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1), node3);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = null;
        node9.setStaticSourceFile(staticSourceFile10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) -1, node3, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: first new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        boolean boolean7 = node6.isTry();
        // The following exception was thrown during execution in test generation
        try {
            node6.setString("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: ERROR is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        java.lang.Appendable appendable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            node1.appendStringTree(appendable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(12);
        boolean boolean2 = node1.isExprResult();
        java.lang.Appendable appendable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            node1.appendStringTree(appendable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str2 = assertionFunctionSpec1.getFunctionName();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean6 = node5.isOr();
        node5.setLineno(2);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0, node5);
        com.google.javascript.rhino.Node node10 = assertionFunctionSpec1.getAssertedParam(node5);
        int int11 = node5.getChildCount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        node6.setType(43);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = null;
        node10.setStaticSourceFile(staticSourceFile11);
        // The following exception was thrown during execution in test generation
        try {
            node6.removeChild(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        boolean boolean4 = node2.hasMoreThanOneChild();
        com.google.javascript.rhino.jstype.JSType jSType5 = node2.getJSType();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean8 = node7.isOr();
        boolean boolean9 = node7.hasMoreThanOneChild();
        com.google.javascript.rhino.jstype.JSType jSType10 = node7.getJSType();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean13 = node12.isOr();
        boolean boolean14 = node12.isLabel();
        java.lang.String str15 = node12.toStringTree();
        boolean boolean16 = node12.isDebugger();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean19 = node18.hasOneChild();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean22 = node21.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind23 = new com.google.javascript.jscomp.CodingConvention.Bind(node12, node18, node21);
        boolean boolean24 = node12.isSwitch();
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(46, node2, node7, node12, node25, 4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "NUMBER -1.0\n" + "'", str15, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getModifies();
        int int7 = strSet6.size();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean10 = node9.isOr();
        node9.setLineno(2);
        boolean boolean13 = strSet6.contains((java.lang.Object) 2);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList17 = com.google.common.collect.ImmutableList.copyOf(strArray16);
        java.util.Iterator<java.lang.String> strItor18 = strList17.iterator();
        boolean boolean19 = strSet6.retainAll((java.util.Collection<java.lang.String>) strList17);
        java.lang.String str20 = strList17.toString();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.Spliterator<java.lang.String> strSpliterator26 = strList24.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = strList17.retainAll((java.util.Collection<java.lang.String>) strList24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!]" + "'", str20, "[, hi!]");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strSpliterator26);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getModifies();
        int int7 = strSet6.size();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean10 = node9.isOr();
        node9.setLineno(2);
        boolean boolean13 = strSet6.contains((java.lang.Object) 2);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList17 = com.google.common.collect.ImmutableList.copyOf(strArray16);
        java.util.Iterator<java.lang.String> strItor18 = strList17.iterator();
        boolean boolean19 = strSet6.retainAll((java.util.Collection<java.lang.String>) strList17);
        java.lang.String str20 = strList17.toString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression22 = jSDocInfo21.getReturnType();
        java.lang.String str23 = jSDocInfo21.getOriginalCommentString();
        boolean boolean24 = jSDocInfo21.isExterns();
        jSDocInfo21.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet27 = jSDocInfo21.getModifies();
        int int28 = strSet27.size();
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList32 = com.google.common.collect.ImmutableList.copyOf(strArray31);
        java.util.Iterator<java.lang.String> strItor33 = strList32.iterator();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList37 = com.google.common.collect.ImmutableList.copyOf(strArray36);
        int int39 = strList37.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean40 = strList32.contains((java.lang.Object) int39);
        boolean boolean41 = strSet27.remove((java.lang.Object) int39);
        java.util.Spliterator<java.lang.String> strSpliterator42 = strSet27.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = strList17.retainAll((java.util.Collection<java.lang.String>) strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!]" + "'", str20, "[, hi!]");
        org.junit.Assert.assertNull(jSTypeExpression22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strItor33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strSpliterator42);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        com.google.javascript.rhino.InputId inputId4 = com.google.javascript.jscomp.NodeUtil.getInputId(node1);
        com.google.javascript.rhino.jstype.JSType jSType5 = node1.getJSType();
        // The following exception was thrown during execution in test generation
        try {
            node1.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputId4);
        org.junit.Assert.assertNull(jSType5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        boolean boolean2 = jSDocInfo0.isNoTypeCheck();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = null;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        boolean boolean5 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean6 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean7 = jSDocInfo0.isExport();
        boolean boolean8 = jSDocInfo0.hasEnumParameterType();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        int int0 = com.google.javascript.rhino.jstype.JSType.ENUMDECL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isObjectLit();
        com.google.javascript.rhino.InputId inputId6 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1), node3);
        node7.setType(43);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean12 = node11.hasOneChild();
        boolean boolean13 = node11.isObjectLit();
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node11);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.isOr();
        boolean boolean18 = node16.isLabel();
        java.lang.String str19 = node16.toStringTree();
        node16.setVarArgs(false);
        double double22 = node16.getDouble();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(3, node7, node11, node16, 2, 49);
        // The following exception was thrown during execution in test generation
        try {
            node11.setString("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER -1.0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "NUMBER -1.0\n" + "'", str19, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation(10, 2, (int) (short) 10, (int) '4');
        com.google.javascript.rhino.Node node6 = namePosition0.getItem();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation(52, 16, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 52?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable21 = functionType20.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType22 = functionType20.getPrototype();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType24 = functionType20.getTopMostDefiningType("Function");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(objectTypeIterable21);
        org.junit.Assert.assertNotNull(objectType22);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean7 = strList3.equals((java.lang.Object) 8);
        boolean boolean8 = strList3.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo9.getReturnType();
        java.lang.String str11 = jSDocInfo9.getOriginalCommentString();
        boolean boolean12 = jSDocInfo9.isExterns();
        jSDocInfo9.addSuppression("");
        boolean boolean15 = jSDocInfo9.isDeprecated();
        boolean boolean16 = strList3.equals((java.lang.Object) boolean15);
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.String> strList19 = strList3.subList((int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (10) must not be greater than size (2)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("unknown");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(unknown)" + "'", str1, "(unknown)");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        java.lang.String str4 = node1.toStringTree();
        boolean boolean5 = node1.isDebugger();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean8 = node7.hasOneChild();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind12 = new com.google.javascript.jscomp.CodingConvention.Bind(node1, node7, node10);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean18 = node17.hasOneChild();
        boolean boolean19 = node17.isObjectLit();
        com.google.javascript.rhino.InputId inputId20 = com.google.javascript.jscomp.NodeUtil.getInputId(node17);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), node17);
        node21.setType(43);
        com.google.javascript.jscomp.CodingConvention.Bind bind24 = new com.google.javascript.jscomp.CodingConvention.Bind(node10, node14, node21);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags25 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags25.setMutatesGlobalState();
        // The following exception was thrown during execution in test generation
        try {
            node21.setSideEffectFlags(sideEffectFlags25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got FALSE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NUMBER -1.0\n" + "'", str4, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(inputId20);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isObjectLit();
        com.google.javascript.rhino.InputId inputId6 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1), node3);
        node7.setType(43);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean12 = node11.hasOneChild();
        boolean boolean13 = node11.isObjectLit();
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node11);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.isOr();
        boolean boolean18 = node16.isLabel();
        java.lang.String str19 = node16.toStringTree();
        node16.setVarArgs(false);
        double double22 = node16.getDouble();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(3, node7, node11, node16, 2, 49);
        // The following exception was thrown during execution in test generation
        try {
            node25.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "NUMBER -1.0\n" + "'", str19, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        jSTypeRegistry22.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean28 = node27.hasOneChild();
        boolean boolean29 = node27.isObjectLit();
        com.google.javascript.rhino.InputId inputId30 = com.google.javascript.jscomp.NodeUtil.getInputId(node27);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), node27);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node34);
        boolean boolean39 = node38.isNE();
        node31.addChildToBack(node38);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry22.createFunctionType(jSType24, node38);
        int int42 = functionType41.getMaxArguments();
        functionType20.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType41);
        com.google.javascript.rhino.jstype.JSType jSType44 = functionType20.autoboxesTo();
        boolean boolean45 = functionType20.hasCachedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        jSTypeRegistry47.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean53 = node52.hasOneChild();
        boolean boolean54 = node52.isObjectLit();
        com.google.javascript.rhino.InputId inputId55 = com.google.javascript.jscomp.NodeUtil.getInputId(node52);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((-1), node52);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean60 = node59.hasOneChild();
        boolean boolean61 = node59.isObjectLit();
        com.google.javascript.rhino.InputId inputId62 = com.google.javascript.jscomp.NodeUtil.getInputId(node59);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((-1), node59);
        boolean boolean64 = node63.isNE();
        node56.addChildToBack(node63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry47.createFunctionType(jSType49, node63);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable67 = functionType66.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType68 = functionType66.getPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType69 = functionType66.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = functionType20.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputId30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNull(jSType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(inputId55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(inputId62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertNotNull(objectTypeIterable67);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNull(functionType69);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = jSDocInfo0.getTypeNodes();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeCollection6);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(31, "");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        jSTypeRegistry22.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean28 = node27.hasOneChild();
        boolean boolean29 = node27.isObjectLit();
        com.google.javascript.rhino.InputId inputId30 = com.google.javascript.jscomp.NodeUtil.getInputId(node27);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), node27);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node34);
        boolean boolean39 = node38.isNE();
        node31.addChildToBack(node38);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry22.createFunctionType(jSType24, node38);
        int int42 = functionType41.getMaxArguments();
        functionType20.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType41);
        com.google.javascript.rhino.jstype.JSType jSType44 = functionType20.autoboxesTo();
        boolean boolean45 = functionType20.hasCachedValues();
        boolean boolean47 = functionType20.isPropertyTypeInferred("[, hi!]");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType49 = functionType20.getTopMostDefiningType("NUMBER -1.0 2\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputId30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNull(jSType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        java.util.Iterator<java.lang.String> strItor4 = strList3.iterator();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.copyOf(strArray7);
        int int10 = strList8.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean11 = strList3.contains((java.lang.Object) int10);
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo12.getReturnType();
        java.lang.String str14 = jSDocInfo12.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility15 = jSDocInfo12.getVisibility();
        java.lang.String str16 = jSDocInfo12.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = jSDocInfo12.getParameterType("");
        int int19 = jSDocInfo12.getExtendedInterfacesCount();
        boolean boolean20 = strList3.equals((java.lang.Object) jSDocInfo12);
        boolean boolean21 = jSDocInfo12.isNoSideEffects();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSTypeExpression13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(visibility15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(jSTypeExpression18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = com.google.common.collect.ImmutableList.copyOf(strArray5);
        int int8 = strList6.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean10 = strList6.equals((java.lang.Object) 8);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        boolean boolean16 = strList6.containsAll((java.util.Collection<java.lang.String>) strList14);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList20 = com.google.common.collect.ImmutableList.copyOf(strArray19);
        boolean boolean21 = strList6.contains((java.lang.Object) strArray19);
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = jSDocInfo22.getReturnType();
        java.lang.String str24 = jSDocInfo22.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility25 = jSDocInfo22.getVisibility();
        java.lang.String str26 = jSDocInfo22.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = jSDocInfo22.getParameterType("");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList29 = jSDocInfo22.getThrownTypes();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility30 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean33 = node32.isOr();
        boolean boolean34 = node32.isLabel();
        boolean boolean35 = node32.isAssignAdd();
        boolean boolean36 = node32.isQualifiedName();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.clearTemplateTypeNames();
        boolean boolean41 = jSTypeRegistry38.isForwardDeclaredType("JSDocInfo");
        java.io.Serializable serializable42 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.io.Serializable> serializableList43 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 1.0d, (java.io.Serializable) "JSDocInfo", (java.io.Serializable) 1L, (java.io.Serializable) boolean21, (java.io.Serializable) jSDocInfo22, (java.io.Serializable) visibility30, (java.io.Serializable) boolean36, (java.io.Serializable) jSTypeRegistry38, serializable42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 8");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(jSTypeExpression23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(visibility25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(jSTypeExpression28);
        org.junit.Assert.assertNotNull(jSTypeExpressionList29);
        org.junit.Assert.assertTrue("'" + visibility30 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility30.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(31, "");
        node2.detachChildren();
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        jSTypeRegistry22.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean28 = node27.hasOneChild();
        boolean boolean29 = node27.isObjectLit();
        com.google.javascript.rhino.InputId inputId30 = com.google.javascript.jscomp.NodeUtil.getInputId(node27);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), node27);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node34);
        boolean boolean39 = node38.isNE();
        node31.addChildToBack(node38);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry22.createFunctionType(jSType24, node38);
        int int42 = functionType41.getMaxArguments();
        functionType20.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType41);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        jSTypeRegistry46.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean52 = node51.hasOneChild();
        boolean boolean53 = node51.isObjectLit();
        com.google.javascript.rhino.InputId inputId54 = com.google.javascript.jscomp.NodeUtil.getInputId(node51);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), node51);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean59 = node58.hasOneChild();
        boolean boolean60 = node58.isObjectLit();
        com.google.javascript.rhino.InputId inputId61 = com.google.javascript.jscomp.NodeUtil.getInputId(node58);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1), node58);
        boolean boolean63 = node62.isNE();
        node55.addChildToBack(node62);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry46.createFunctionType(jSType48, node62);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable66 = functionType65.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType67 = functionType65.getPrototype();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType68 = functionType20.forceResolve(errorReporter44, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputId30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(inputId54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertNotNull(objectTypeIterable66);
        org.junit.Assert.assertNotNull(objectType67);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry1.getNativeObjectType(jSTypeNative21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        java.lang.String str4 = node1.toStringTree();
        boolean boolean5 = node1.isDebugger();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean8 = node7.hasOneChild();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind12 = new com.google.javascript.jscomp.CodingConvention.Bind(node1, node7, node10);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean18 = node17.hasOneChild();
        boolean boolean19 = node17.isObjectLit();
        com.google.javascript.rhino.InputId inputId20 = com.google.javascript.jscomp.NodeUtil.getInputId(node17);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), node17);
        node21.setType(43);
        com.google.javascript.jscomp.CodingConvention.Bind bind24 = new com.google.javascript.jscomp.CodingConvention.Bind(node10, node14, node21);
        // The following exception was thrown during execution in test generation
        try {
            node21.setSideEffectFlags(36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got FALSE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NUMBER -1.0\n" + "'", str4, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(inputId20);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        java.lang.String str4 = node1.toStringTree();
        boolean boolean5 = node1.isDebugger();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean8 = node7.hasOneChild();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind12 = new com.google.javascript.jscomp.CodingConvention.Bind(node1, node7, node10);
        boolean boolean13 = node1.isSwitch();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean18 = node17.hasOneChild();
        boolean boolean19 = node17.isObjectLit();
        com.google.javascript.rhino.InputId inputId20 = com.google.javascript.jscomp.NodeUtil.getInputId(node17);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), node17);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean25 = node24.hasOneChild();
        boolean boolean26 = node24.isObjectLit();
        com.google.javascript.rhino.InputId inputId27 = com.google.javascript.jscomp.NodeUtil.getInputId(node24);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1), node24);
        boolean boolean29 = node28.isNE();
        node21.addChildToBack(node28);
        node28.addSuppression("");
        // The following exception was thrown during execution in test generation
        try {
            node1.addChildAfter(node14, node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NUMBER -1.0\n" + "'", str4, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(inputId27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newExpr(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile2 = null;
        node1.setStaticSourceFile(staticSourceFile2);
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = node4.getExistingIntProp(30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 30");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile24 = null;
        node23.setStaticSourceFile(staticSourceFile24);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newExpr(node23);
        java.lang.String str27 = node23.toStringTree();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        jSTypeRegistry29.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node34);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean42 = node41.hasOneChild();
        boolean boolean43 = node41.isObjectLit();
        com.google.javascript.rhino.InputId inputId44 = com.google.javascript.jscomp.NodeUtil.getInputId(node41);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((-1), node41);
        boolean boolean46 = node45.isNE();
        node38.addChildToBack(node45);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry29.createFunctionType(jSType31, node45);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.EnumType enumType49 = jSTypeRegistry1.createEnumType("NUMBER -1.0\n", node23, jSType31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EQ\n" + "'", str27, "EQ\n");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(inputId44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(functionType48);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.isParameterizedType();
        com.google.javascript.rhino.jstype.JSType jSType23 = functionType20.getIndexType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = functionType20.toDebugHashCodeString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSType23);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        jSTypeRegistry5.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.hasOneChild();
        boolean boolean12 = node10.isObjectLit();
        com.google.javascript.rhino.InputId inputId13 = com.google.javascript.jscomp.NodeUtil.getInputId(node10);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1), node10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean18 = node17.hasOneChild();
        boolean boolean19 = node17.isObjectLit();
        com.google.javascript.rhino.InputId inputId20 = com.google.javascript.jscomp.NodeUtil.getInputId(node17);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), node17);
        boolean boolean22 = node21.isNE();
        node14.addChildToBack(node21);
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry5.createFunctionType(jSType7, node21);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = functionType24.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType24.getPrototype();
        boolean boolean27 = jSTypeRegistry1.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        jSTypeRegistry29.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node34);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean42 = node41.hasOneChild();
        boolean boolean43 = node41.isObjectLit();
        com.google.javascript.rhino.InputId inputId44 = com.google.javascript.jscomp.NodeUtil.getInputId(node41);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((-1), node41);
        boolean boolean46 = node45.isNE();
        node38.addChildToBack(node45);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry29.createFunctionType(jSType31, node45);
        int int49 = functionType48.getMaxArguments();
        boolean boolean50 = functionType48.hasDisplayName();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection51 = jSTypeRegistry1.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType48);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean55 = node54.hasOneChild();
        boolean boolean56 = node54.isObjectLit();
        com.google.javascript.rhino.InputId inputId57 = com.google.javascript.jscomp.NodeUtil.getInputId(node54);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((-1), node54);
        java.lang.String str59 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node58);
        node58.setLineno(15);
        functionType48.setSource(node58);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType63 = functionType48.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(inputId13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(inputId44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(functionTypeCollection51);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(inputId57);
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.add("");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = com.google.common.collect.ImmutableList.copyOf(strArray9);
        int int12 = strList10.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean14 = strList10.equals((java.lang.Object) 8);
        boolean boolean15 = strList10.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = jSDocInfo16.getReturnType();
        java.lang.String str18 = jSDocInfo16.getOriginalCommentString();
        boolean boolean19 = jSDocInfo16.isExterns();
        jSDocInfo16.addSuppression("");
        boolean boolean22 = jSDocInfo16.isDeprecated();
        boolean boolean23 = strList10.equals((java.lang.Object) boolean22);
        boolean boolean24 = strList3.containsAll((java.util.Collection<java.lang.String>) strList10);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean28 = node27.hasOneChild();
        boolean boolean29 = node27.isObjectLit();
        com.google.javascript.rhino.InputId inputId30 = com.google.javascript.jscomp.NodeUtil.getInputId(node27);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), node27);
        java.lang.String str32 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node31);
        boolean boolean33 = node31.isFor();
        boolean boolean34 = node31.isOptionalArg();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = strList10.remove((java.lang.Object) node31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSTypeExpression17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputId30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.isParameterizedType();
        java.lang.String str23 = null; // flaky: functionType20.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet24 = functionType20.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node25 = functionType20.getParametersNode();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = null;
        node28.setStaticSourceFile(staticSourceFile29);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newExpr(node28);
        // The following exception was thrown during execution in test generation
        try {
            node25.addChildBefore(node26, node31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet24 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet24.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.isParameterizedType();
        java.lang.String str23 = null; // flaky: functionType20.toAnnotationString();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        jSTypeRegistry25.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean31 = node30.hasOneChild();
        boolean boolean32 = node30.isObjectLit();
        com.google.javascript.rhino.InputId inputId33 = com.google.javascript.jscomp.NodeUtil.getInputId(node30);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), node30);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean38 = node37.hasOneChild();
        boolean boolean39 = node37.isObjectLit();
        com.google.javascript.rhino.InputId inputId40 = com.google.javascript.jscomp.NodeUtil.getInputId(node37);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1), node37);
        boolean boolean42 = node41.isNE();
        node34.addChildToBack(node41);
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry25.createFunctionType(jSType27, node41);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        jSTypeRegistry46.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean52 = node51.hasOneChild();
        boolean boolean53 = node51.isObjectLit();
        com.google.javascript.rhino.InputId inputId54 = com.google.javascript.jscomp.NodeUtil.getInputId(node51);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), node51);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean59 = node58.hasOneChild();
        boolean boolean60 = node58.isObjectLit();
        com.google.javascript.rhino.InputId inputId61 = com.google.javascript.jscomp.NodeUtil.getInputId(node58);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1), node58);
        boolean boolean63 = node62.isNE();
        node55.addChildToBack(node62);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry46.createFunctionType(jSType48, node62);
        int int66 = functionType65.getMaxArguments();
        functionType44.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType65);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair68 = functionType20.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType65);
        com.google.javascript.rhino.jstype.UnionType unionType69 = functionType20.toMaybeUnionType();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate70 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean71 = functionType20.setValidator(jSTypePredicate70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(inputId33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(inputId54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(typePair68);
        org.junit.Assert.assertNull(unionType69);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        com.google.javascript.rhino.InputId inputId4 = com.google.javascript.jscomp.NodeUtil.getInputId(node1);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node1);
        int int6 = node1.getLineno();
        // The following exception was thrown during execution in test generation
        try {
            node1.setString("java.io.IOException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER -1.0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputId4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isExpose();
        java.lang.String str6 = jSDocInfo0.getVersion();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        node1.setLineno(2);
        int int5 = node1.getCharno();
        // The following exception was thrown during execution in test generation
        try {
            node1.setString("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER -1.0 2 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "[, hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType23 = functionType20.getTopMostDefiningType("(unknown)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        jSTypeRegistry22.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean28 = node27.hasOneChild();
        boolean boolean29 = node27.isObjectLit();
        com.google.javascript.rhino.InputId inputId30 = com.google.javascript.jscomp.NodeUtil.getInputId(node27);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), node27);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node34);
        boolean boolean39 = node38.isNE();
        node31.addChildToBack(node38);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry22.createFunctionType(jSType24, node38);
        int int42 = functionType41.getMaxArguments();
        functionType20.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType41);
        com.google.javascript.rhino.jstype.JSType jSType44 = functionType20.autoboxesTo();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        jSTypeRegistry46.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean52 = node51.hasOneChild();
        boolean boolean53 = node51.isObjectLit();
        com.google.javascript.rhino.InputId inputId54 = com.google.javascript.jscomp.NodeUtil.getInputId(node51);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), node51);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean59 = node58.hasOneChild();
        boolean boolean60 = node58.isObjectLit();
        com.google.javascript.rhino.InputId inputId61 = com.google.javascript.jscomp.NodeUtil.getInputId(node58);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1), node58);
        boolean boolean63 = node62.isNE();
        node55.addChildToBack(node62);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry46.createFunctionType(jSType48, node62);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable66 = functionType65.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType67 = functionType65.getPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable68 = objectType67.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node70 = objectType67.getPropertyNode("hi!");
        boolean boolean71 = functionType20.isSubtype((com.google.javascript.rhino.jstype.JSType) objectType67);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType72 = functionType20.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputId30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNull(jSType44);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(inputId54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertNotNull(objectTypeIterable66);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectTypeIterable68);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        jSTypeRegistry23.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.hasOneChild();
        boolean boolean30 = node28.isObjectLit();
        com.google.javascript.rhino.InputId inputId31 = com.google.javascript.jscomp.NodeUtil.getInputId(node28);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1), node28);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean36 = node35.hasOneChild();
        boolean boolean37 = node35.isObjectLit();
        com.google.javascript.rhino.InputId inputId38 = com.google.javascript.jscomp.NodeUtil.getInputId(node35);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((-1), node35);
        boolean boolean40 = node39.isNE();
        node32.addChildToBack(node39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry23.createFunctionType(jSType25, node39);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable43 = functionType42.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType44 = functionType42.getPrototype();
        jSTypeRegistry1.registerPropertyOnType("NUMBER -1.0\n", (com.google.javascript.rhino.jstype.JSType) functionType42);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48);
        jSTypeRegistry49.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean55 = node54.hasOneChild();
        boolean boolean56 = node54.isObjectLit();
        com.google.javascript.rhino.InputId inputId57 = com.google.javascript.jscomp.NodeUtil.getInputId(node54);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((-1), node54);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean62 = node61.hasOneChild();
        boolean boolean63 = node61.isObjectLit();
        com.google.javascript.rhino.InputId inputId64 = com.google.javascript.jscomp.NodeUtil.getInputId(node61);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((-1), node61);
        boolean boolean66 = node65.isNE();
        node58.addChildToBack(node65);
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry49.createFunctionType(jSType51, node65);
        int int69 = functionType68.getMaxArguments();
        boolean boolean70 = functionType68.isParameterizedType();
        java.lang.String str71 = null; // flaky: functionType68.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet72 = functionType68.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.JSType jSType73 = functionType68.autoboxesTo();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray74 = new com.google.javascript.rhino.jstype.JSType[] { jSType73 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList75 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList75, jSTypeArray74);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry1.createFunctionTypeWithVarArgs(jSType47, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inputId31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertNotNull(objectTypeIterable43);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(inputId57);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(inputId64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Function" + "'", str71, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet72 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet72.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNull(jSType73);
        org.junit.Assert.assertNotNull(jSTypeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        jSTypeRegistry22.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean28 = node27.hasOneChild();
        boolean boolean29 = node27.isObjectLit();
        com.google.javascript.rhino.InputId inputId30 = com.google.javascript.jscomp.NodeUtil.getInputId(node27);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), node27);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node34);
        boolean boolean39 = node38.isNE();
        node31.addChildToBack(node38);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry22.createFunctionType(jSType24, node38);
        int int42 = functionType41.getMaxArguments();
        functionType20.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType41);
        com.google.javascript.rhino.jstype.JSType jSType44 = functionType20.autoboxesTo();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = functionType20.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType20.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputId30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNull(jSType44);
        org.junit.Assert.assertNotNull(nodeIterable45);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getBaseType();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNull(jSTypeExpression8);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.io.IOException iOException1 = new java.io.IOException("(JSDocInfo)");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        java.util.Iterator<java.lang.String> strItor4 = strList3.iterator();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.copyOf(strArray7);
        int int10 = strList8.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean11 = strList3.contains((java.lang.Object) int10);
        java.util.Collection<java.lang.String> strCollection12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = strList3.containsAll(strCollection12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        java.lang.String str4 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node1);
        node1.removeProp((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int8 = node1.getExistingIntProp(36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 36");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.isParameterizedType();
        java.lang.String str23 = null; // flaky: functionType20.toAnnotationString();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        jSTypeRegistry25.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean31 = node30.hasOneChild();
        boolean boolean32 = node30.isObjectLit();
        com.google.javascript.rhino.InputId inputId33 = com.google.javascript.jscomp.NodeUtil.getInputId(node30);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), node30);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean38 = node37.hasOneChild();
        boolean boolean39 = node37.isObjectLit();
        com.google.javascript.rhino.InputId inputId40 = com.google.javascript.jscomp.NodeUtil.getInputId(node37);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1), node37);
        boolean boolean42 = node41.isNE();
        node34.addChildToBack(node41);
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry25.createFunctionType(jSType27, node41);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        jSTypeRegistry46.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean52 = node51.hasOneChild();
        boolean boolean53 = node51.isObjectLit();
        com.google.javascript.rhino.InputId inputId54 = com.google.javascript.jscomp.NodeUtil.getInputId(node51);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), node51);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean59 = node58.hasOneChild();
        boolean boolean60 = node58.isObjectLit();
        com.google.javascript.rhino.InputId inputId61 = com.google.javascript.jscomp.NodeUtil.getInputId(node58);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1), node58);
        boolean boolean63 = node62.isNE();
        node55.addChildToBack(node62);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry46.createFunctionType(jSType48, node62);
        int int66 = functionType65.getMaxArguments();
        functionType44.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType65);
        functionType20.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType65);
        boolean boolean69 = functionType65.hasReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70);
        jSTypeRegistry71.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean77 = node76.hasOneChild();
        boolean boolean78 = node76.isObjectLit();
        com.google.javascript.rhino.InputId inputId79 = com.google.javascript.jscomp.NodeUtil.getInputId(node76);
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((-1), node76);
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean84 = node83.hasOneChild();
        boolean boolean85 = node83.isObjectLit();
        com.google.javascript.rhino.InputId inputId86 = com.google.javascript.jscomp.NodeUtil.getInputId(node83);
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node((-1), node83);
        boolean boolean88 = node87.isNE();
        node80.addChildToBack(node87);
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry71.createFunctionType(jSType73, node87);
        int int91 = functionType90.getMaxArguments();
        boolean boolean92 = functionType90.hasImplementedInterfaces();
        boolean boolean93 = functionType65.hasEqualCallType(functionType90);
        boolean boolean94 = functionType90.isOrdinaryFunction();
        boolean boolean95 = functionType90.matchesUint32Context();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(inputId33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(inputId54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(inputId79);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(inputId86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Not declared as a type name");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(12);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = node1.removeChildAfter(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        boolean boolean4 = node1.isAssignAdd();
        boolean boolean5 = node1.isQualifiedName();
        java.lang.String str6 = node1.getSourceFileName();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean9 = node8.isOr();
        boolean boolean10 = node8.isLabel();
        java.lang.String str11 = node8.toStringTree();
        boolean boolean12 = node8.isDebugger();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean15 = node14.hasOneChild();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean18 = node17.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind19 = new com.google.javascript.jscomp.CodingConvention.Bind(node8, node14, node17);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean25 = node24.hasOneChild();
        boolean boolean26 = node24.isObjectLit();
        com.google.javascript.rhino.InputId inputId27 = com.google.javascript.jscomp.NodeUtil.getInputId(node24);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1), node24);
        node28.setType(43);
        com.google.javascript.jscomp.CodingConvention.Bind bind31 = new com.google.javascript.jscomp.CodingConvention.Bind(node17, node21, node28);
        node28.setSourceEncodedPosition((int) (byte) 10);
        boolean boolean34 = node28.isReturn();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean38 = node37.hasOneChild();
        boolean boolean39 = node37.isObjectLit();
        com.google.javascript.rhino.InputId inputId40 = com.google.javascript.jscomp.NodeUtil.getInputId(node37);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1), node37);
        node41.setType(43);
        // The following exception was thrown during execution in test generation
        try {
            node1.addChildBefore(node28, node41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "NUMBER -1.0\n" + "'", str11, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(inputId27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(inputId40);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        jSTypeRegistry23.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.hasOneChild();
        boolean boolean30 = node28.isObjectLit();
        com.google.javascript.rhino.InputId inputId31 = com.google.javascript.jscomp.NodeUtil.getInputId(node28);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1), node28);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean36 = node35.hasOneChild();
        boolean boolean37 = node35.isObjectLit();
        com.google.javascript.rhino.InputId inputId38 = com.google.javascript.jscomp.NodeUtil.getInputId(node35);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((-1), node35);
        boolean boolean40 = node39.isNE();
        node32.addChildToBack(node39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry23.createFunctionType(jSType25, node39);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable43 = functionType42.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType44 = functionType42.getPrototype();
        jSTypeRegistry1.registerPropertyOnType("NUMBER -1.0\n", (com.google.javascript.rhino.jstype.JSType) functionType42);
        com.google.javascript.rhino.jstype.FunctionType functionType46 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47);
        jSTypeRegistry48.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean54 = node53.hasOneChild();
        boolean boolean55 = node53.isObjectLit();
        com.google.javascript.rhino.InputId inputId56 = com.google.javascript.jscomp.NodeUtil.getInputId(node53);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((-1), node53);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean61 = node60.hasOneChild();
        boolean boolean62 = node60.isObjectLit();
        com.google.javascript.rhino.InputId inputId63 = com.google.javascript.jscomp.NodeUtil.getInputId(node60);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((-1), node60);
        boolean boolean65 = node64.isNE();
        node57.addChildToBack(node64);
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSTypeRegistry48.createFunctionType(jSType50, node64);
        int int68 = functionType67.getMaxArguments();
        boolean boolean69 = functionType67.isParameterizedType();
        java.lang.String str70 = null; // flaky: functionType67.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet71 = functionType67.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node72 = functionType67.getParametersNode();
        com.google.javascript.rhino.jstype.FunctionType functionType73 = functionType67.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.FunctionType functionType74 = functionType67.toMaybeFunctionType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType75 = jSTypeRegistry1.createFunctionTypeWithNewThisType(functionType46, (com.google.javascript.rhino.jstype.ObjectType) functionType74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inputId31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertNotNull(objectTypeIterable43);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(inputId56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(inputId63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(functionType67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Function" + "'", str70, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet71 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet71.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertNotNull(functionType74);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean7 = strList3.equals((java.lang.Object) 8);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList3.containsAll((java.util.Collection<java.lang.String>) strList11);
        boolean boolean14 = strList3.isEmpty();
        java.util.Spliterator<java.lang.String> strSpliterator15 = strList3.spliterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = jSDocInfo16.getReturnType();
        java.lang.String str18 = jSDocInfo16.getOriginalCommentString();
        boolean boolean19 = jSDocInfo16.isExterns();
        jSDocInfo16.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet22 = jSDocInfo16.getModifies();
        java.lang.Object[] objArray23 = strSet22.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = strList3.remove((java.lang.Object) objArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNull(jSTypeExpression17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        java.util.Iterator<java.lang.String> strItor6 = strList3.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo7.getReturnType();
        java.lang.String str9 = jSDocInfo7.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility10 = jSDocInfo7.getVisibility();
        boolean boolean11 = strList3.contains((java.lang.Object) visibility10);
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo12.getReturnType();
        java.lang.String str14 = jSDocInfo12.getOriginalCommentString();
        boolean boolean15 = jSDocInfo12.isExterns();
        jSDocInfo12.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet18 = jSDocInfo12.getModifies();
        int int19 = strSet18.size();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean22 = node21.isOr();
        node21.setLineno(2);
        boolean boolean25 = strSet18.contains((java.lang.Object) 2);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList29 = com.google.common.collect.ImmutableList.copyOf(strArray28);
        java.util.Iterator<java.lang.String> strItor30 = strList29.iterator();
        boolean boolean31 = strSet18.retainAll((java.util.Collection<java.lang.String>) strList29);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = strList3.retainAll((java.util.Collection<java.lang.String>) strSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(visibility10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSTypeExpression13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strItor30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isObjectLit();
        com.google.javascript.rhino.InputId inputId6 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1), node3);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.hasOneChild();
        boolean boolean12 = node10.isObjectLit();
        com.google.javascript.rhino.InputId inputId13 = com.google.javascript.jscomp.NodeUtil.getInputId(node10);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1), node10);
        boolean boolean15 = node14.isNE();
        node7.addChildToBack(node14);
        node14.addSuppression("");
        boolean boolean19 = node14.isComma();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = jSDocInfo20.getReturnType();
        java.lang.String str22 = jSDocInfo20.getOriginalCommentString();
        boolean boolean23 = jSDocInfo20.isExterns();
        jSDocInfo20.addSuppression("hi!");
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean28 = node27.hasOneChild();
        boolean boolean29 = node27.isObjectLit();
        java.lang.String str30 = com.google.javascript.jscomp.NodeUtil.getSourceName(node27);
        jSDocInfo20.setAssociatedNode(node27);
        node27.setCharno(0);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 10.0f);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean39 = node38.isOr();
        node38.setLineno(2);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(0, node38);
        java.lang.String str43 = node38.toStringTree();
        int int44 = node38.getChildCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) '4', node14, node27, node35, node38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(inputId13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jSTypeExpression21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "NUMBER -1.0 2\n" + "'", str43, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        jSTypeRegistry23.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.hasOneChild();
        boolean boolean30 = node28.isObjectLit();
        com.google.javascript.rhino.InputId inputId31 = com.google.javascript.jscomp.NodeUtil.getInputId(node28);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1), node28);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean36 = node35.hasOneChild();
        boolean boolean37 = node35.isObjectLit();
        com.google.javascript.rhino.InputId inputId38 = com.google.javascript.jscomp.NodeUtil.getInputId(node35);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((-1), node35);
        boolean boolean40 = node39.isNE();
        node32.addChildToBack(node39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry23.createFunctionType(jSType25, node39);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable43 = functionType42.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType44 = functionType42.getPrototype();
        jSTypeRegistry1.registerPropertyOnType("NUMBER -1.0\n", (com.google.javascript.rhino.jstype.JSType) functionType42);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray47 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType48 = jSTypeRegistry1.createUnionType(jSTypeNativeArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inputId31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertNotNull(objectTypeIterable43);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(objectType46);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.isParameterizedType();
        java.lang.String str23 = null; // flaky: functionType20.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet24 = functionType20.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node25 = functionType20.getParametersNode();
        com.google.javascript.rhino.Node node26 = node25.detachFromParent();
        // The following exception was thrown during execution in test generation
        try {
            double double27 = node26.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: ERROR is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet24 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet24.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        com.google.javascript.rhino.InputId inputId4 = com.google.javascript.jscomp.NodeUtil.getInputId(node1);
        int int5 = node1.getLength();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec7 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str8 = assertionFunctionSpec7.getFunctionName();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean12 = node11.isOr();
        node11.setLineno(2);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0, node11);
        com.google.javascript.rhino.Node node16 = assertionFunctionSpec7.getAssertedParam(node11);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean19 = node18.isOr();
        boolean boolean20 = node18.isLabel();
        node18.setOptionalArg(false);
        // The following exception was thrown during execution in test generation
        try {
            node1.addChildrenAfter(node16, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputId4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.hasMoreThanOneChild();
        boolean boolean4 = node1.isReturn();
        boolean boolean5 = node1.isLabelName();
        boolean boolean6 = node1.isDebugger();
        com.google.javascript.rhino.Node node7 = node1.removeFirstChild();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable21 = functionType20.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = functionType20.getParentScope();
        boolean boolean23 = functionType20.hasAnyTemplate();
        com.google.javascript.rhino.jstype.JSType jSType24 = functionType20.getReturnType();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = jSType24.setValidator(jSTypePredicate25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(objectTypeIterable21);
        org.junit.Assert.assertNotNull(jSTypeStaticScope22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSType24);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        jSTypeRegistry23.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.hasOneChild();
        boolean boolean30 = node28.isObjectLit();
        com.google.javascript.rhino.InputId inputId31 = com.google.javascript.jscomp.NodeUtil.getInputId(node28);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1), node28);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean36 = node35.hasOneChild();
        boolean boolean37 = node35.isObjectLit();
        com.google.javascript.rhino.InputId inputId38 = com.google.javascript.jscomp.NodeUtil.getInputId(node35);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((-1), node35);
        boolean boolean40 = node39.isNE();
        node32.addChildToBack(node39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry23.createFunctionType(jSType25, node39);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable43 = functionType42.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType44 = functionType42.getPrototype();
        jSTypeRegistry1.registerPropertyOnType("NUMBER -1.0\n", (com.google.javascript.rhino.jstype.JSType) functionType42);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean50 = node49.hasOneChild();
        boolean boolean51 = node49.isObjectLit();
        com.google.javascript.rhino.InputId inputId52 = com.google.javascript.jscomp.NodeUtil.getInputId(node49);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((-1), node49);
        boolean boolean54 = node49.isName();
        boolean boolean55 = node49.isComma();
        node49.setOptionalArg(true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.EnumType enumType59 = jSTypeRegistry1.createEnumType("NUMBER -1.0", node49, jSType58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inputId31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertNotNull(objectTypeIterable43);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(inputId52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        com.google.javascript.rhino.InputId inputId4 = com.google.javascript.jscomp.NodeUtil.getInputId(node1);
        com.google.javascript.rhino.jstype.JSType jSType5 = node1.getJSType();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean9 = node8.hasOneChild();
        boolean boolean10 = node8.isObjectLit();
        com.google.javascript.rhino.InputId inputId11 = com.google.javascript.jscomp.NodeUtil.getInputId(node8);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((-1), node8);
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node12);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec15 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str16 = assertionFunctionSpec15.getFunctionName();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean20 = node19.isOr();
        node19.setLineno(2);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0, node19);
        com.google.javascript.rhino.Node node24 = assertionFunctionSpec15.getAssertedParam(node19);
        com.google.javascript.rhino.Node node25 = node12.srcref(node24);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean28 = node27.isOr();
        boolean boolean29 = node27.isLabel();
        java.lang.String str30 = node27.toStringTree();
        boolean boolean31 = node27.isDebugger();
        // The following exception was thrown during execution in test generation
        try {
            node1.addChildrenAfter(node25, node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputId4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "NUMBER -1.0\n" + "'", str30, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        java.util.ListIterator<java.lang.String> strItor7 = strList3.listIterator(1);
        boolean boolean8 = strItor7.hasNext();
        java.lang.String str9 = strItor7.next();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strItor7.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        jSTypeRegistry23.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.hasOneChild();
        boolean boolean30 = node28.isObjectLit();
        com.google.javascript.rhino.InputId inputId31 = com.google.javascript.jscomp.NodeUtil.getInputId(node28);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1), node28);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean36 = node35.hasOneChild();
        boolean boolean37 = node35.isObjectLit();
        com.google.javascript.rhino.InputId inputId38 = com.google.javascript.jscomp.NodeUtil.getInputId(node35);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((-1), node35);
        boolean boolean40 = node39.isNE();
        node32.addChildToBack(node39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry23.createFunctionType(jSType25, node39);
        int int43 = functionType42.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType44 = functionType42.collapseUnion();
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry1.overwriteDeclaredType("Not declared as a type name", (com.google.javascript.rhino.jstype.JSType) functionType42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inputId31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(jSType44);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getModifies();
        int int7 = strSet6.size();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = com.google.common.collect.ImmutableList.copyOf(strArray10);
        java.util.Iterator<java.lang.String> strItor12 = strList11.iterator();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList16 = com.google.common.collect.ImmutableList.copyOf(strArray15);
        int int18 = strList16.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean19 = strList11.contains((java.lang.Object) int18);
        boolean boolean20 = strSet6.remove((java.lang.Object) int18);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        jSTypeRegistry22.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean28 = node27.hasOneChild();
        boolean boolean29 = node27.isObjectLit();
        com.google.javascript.rhino.InputId inputId30 = com.google.javascript.jscomp.NodeUtil.getInputId(node27);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), node27);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node34);
        boolean boolean39 = node38.isNE();
        node31.addChildToBack(node38);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry22.createFunctionType(jSType24, node38);
        int int42 = functionType41.getMaxArguments();
        boolean boolean43 = functionType41.isParameterizedType();
        java.lang.String str44 = null; // flaky: functionType41.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet45 = functionType41.getPossibleToBooleanOutcomes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = functionType41.getAllExtendedInterfaces();
        boolean boolean47 = strSet6.equals((java.lang.Object) objectTypeIterable46);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = strSet6.add("Not declared as a type name");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputId30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Function" + "'", str44, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet45 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet45.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectTypeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        boolean boolean21 = functionType20.matchesStringContext();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType22 = functionType20.toMaybeEnumElementType();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean30 = node29.hasOneChild();
        boolean boolean31 = node29.isObjectLit();
        com.google.javascript.rhino.InputId inputId32 = com.google.javascript.jscomp.NodeUtil.getInputId(node29);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((-1), node29);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean37 = node36.hasOneChild();
        boolean boolean38 = node36.isObjectLit();
        com.google.javascript.rhino.InputId inputId39 = com.google.javascript.jscomp.NodeUtil.getInputId(node36);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((-1), node36);
        boolean boolean41 = node40.isNE();
        node33.addChildToBack(node40);
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry24.createFunctionType(jSType26, node40);
        int int44 = functionType43.getMaxArguments();
        boolean boolean45 = functionType43.isParameterizedType();
        java.lang.String str46 = null; // flaky: functionType43.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet47 = functionType43.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node48 = functionType43.getParametersNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = enumElementType22.equals((java.lang.Object) functionType43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(enumElementType22);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(inputId32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(inputId39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Function" + "'", str46, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet47 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet47.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node48);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node6);
        boolean boolean8 = node6.isBreak();
        boolean boolean9 = node6.isAssignAdd();
        boolean boolean10 = node6.hasMoreThanOneChild();
        boolean boolean11 = node6.isExprResult();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        jSTypeRegistry5.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.hasOneChild();
        boolean boolean12 = node10.isObjectLit();
        com.google.javascript.rhino.InputId inputId13 = com.google.javascript.jscomp.NodeUtil.getInputId(node10);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1), node10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean18 = node17.hasOneChild();
        boolean boolean19 = node17.isObjectLit();
        com.google.javascript.rhino.InputId inputId20 = com.google.javascript.jscomp.NodeUtil.getInputId(node17);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), node17);
        boolean boolean22 = node21.isNE();
        node14.addChildToBack(node21);
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry5.createFunctionType(jSType7, node21);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = functionType24.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType24.getPrototype();
        boolean boolean27 = jSTypeRegistry1.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        jSTypeRegistry29.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node34);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean42 = node41.hasOneChild();
        boolean boolean43 = node41.isObjectLit();
        com.google.javascript.rhino.InputId inputId44 = com.google.javascript.jscomp.NodeUtil.getInputId(node41);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((-1), node41);
        boolean boolean46 = node45.isNE();
        node38.addChildToBack(node45);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry29.createFunctionType(jSType31, node45);
        int int49 = functionType48.getMaxArguments();
        boolean boolean50 = functionType48.hasDisplayName();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection51 = jSTypeRegistry1.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType48);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean55 = node54.hasOneChild();
        boolean boolean56 = node54.isObjectLit();
        com.google.javascript.rhino.InputId inputId57 = com.google.javascript.jscomp.NodeUtil.getInputId(node54);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((-1), node54);
        java.lang.String str59 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node58);
        node58.setLineno(15);
        functionType48.setSource(node58);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable63 = functionType48.getExtendedInterfaces();
        java.lang.String str64 = null; // flaky: functionType48.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = functionType48.toDebugHashCodeString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(inputId13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(inputId44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(functionTypeCollection51);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(inputId57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(objectTypeIterable63);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Function" + "'", str64, "Function");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        int int0 = com.google.javascript.rhino.Node.OPT_ARG_NAME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 37 + "'", int0 == 37);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        boolean boolean21 = functionType20.matchesStringContext();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType22 = functionType20.toMaybeEnumElementType();
        boolean boolean23 = functionType20.isRecordType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType25 = functionType20.getTopMostDefiningType("JSDocInfo");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(enumElementType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.isParameterizedType();
        java.lang.String str23 = null; // flaky: functionType20.toAnnotationString();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        jSTypeRegistry25.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean31 = node30.hasOneChild();
        boolean boolean32 = node30.isObjectLit();
        com.google.javascript.rhino.InputId inputId33 = com.google.javascript.jscomp.NodeUtil.getInputId(node30);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), node30);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean38 = node37.hasOneChild();
        boolean boolean39 = node37.isObjectLit();
        com.google.javascript.rhino.InputId inputId40 = com.google.javascript.jscomp.NodeUtil.getInputId(node37);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1), node37);
        boolean boolean42 = node41.isNE();
        node34.addChildToBack(node41);
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry25.createFunctionType(jSType27, node41);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        jSTypeRegistry46.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean52 = node51.hasOneChild();
        boolean boolean53 = node51.isObjectLit();
        com.google.javascript.rhino.InputId inputId54 = com.google.javascript.jscomp.NodeUtil.getInputId(node51);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), node51);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean59 = node58.hasOneChild();
        boolean boolean60 = node58.isObjectLit();
        com.google.javascript.rhino.InputId inputId61 = com.google.javascript.jscomp.NodeUtil.getInputId(node58);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1), node58);
        boolean boolean63 = node62.isNE();
        node55.addChildToBack(node62);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry46.createFunctionType(jSType48, node62);
        int int66 = functionType65.getMaxArguments();
        functionType44.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType65);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair68 = functionType20.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType65);
        java.util.List<com.google.javascript.rhino.jstype.ObjectType> objectTypeList69 = null;
        // The following exception was thrown during execution in test generation
        try {
            functionType65.setImplementedInterfaces(objectTypeList69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(inputId33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(inputId54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(typePair68);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        long long0 = com.google.javascript.rhino.InputId.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1L + "'", long0 == 1L);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("EQ\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("");
        boolean boolean6 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.isParameterizedType();
        java.lang.String str23 = null; // flaky: functionType20.toAnnotationString();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        jSTypeRegistry25.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean31 = node30.hasOneChild();
        boolean boolean32 = node30.isObjectLit();
        com.google.javascript.rhino.InputId inputId33 = com.google.javascript.jscomp.NodeUtil.getInputId(node30);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), node30);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean38 = node37.hasOneChild();
        boolean boolean39 = node37.isObjectLit();
        com.google.javascript.rhino.InputId inputId40 = com.google.javascript.jscomp.NodeUtil.getInputId(node37);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1), node37);
        boolean boolean42 = node41.isNE();
        node34.addChildToBack(node41);
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry25.createFunctionType(jSType27, node41);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        jSTypeRegistry46.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean52 = node51.hasOneChild();
        boolean boolean53 = node51.isObjectLit();
        com.google.javascript.rhino.InputId inputId54 = com.google.javascript.jscomp.NodeUtil.getInputId(node51);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), node51);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean59 = node58.hasOneChild();
        boolean boolean60 = node58.isObjectLit();
        com.google.javascript.rhino.InputId inputId61 = com.google.javascript.jscomp.NodeUtil.getInputId(node58);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1), node58);
        boolean boolean63 = node62.isNE();
        node55.addChildToBack(node62);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry46.createFunctionType(jSType48, node62);
        int int66 = functionType65.getMaxArguments();
        functionType44.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType65);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair68 = functionType20.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType65);
        com.google.javascript.rhino.jstype.EnumType enumType69 = functionType20.toMaybeEnumType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = enumType69.canBeCalled();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(inputId33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(inputId54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(typePair68);
        org.junit.Assert.assertNull(enumType69);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.isParameterizedType();
        java.lang.String str23 = null; // flaky: functionType20.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet24 = functionType20.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node25 = functionType20.getParametersNode();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = functionType20.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.FunctionType functionType27 = functionType20.toMaybeFunctionType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType28 = functionType27.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet24 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet24.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(functionType27);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(1, "NUMBER -1.0", 50, (int) (short) 10);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        node1.setLineno(2);
        com.google.javascript.rhino.Node node5 = node1.cloneTree();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean9 = node8.hasOneChild();
        boolean boolean10 = node8.isObjectLit();
        com.google.javascript.rhino.InputId inputId11 = com.google.javascript.jscomp.NodeUtil.getInputId(node8);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((-1), node8);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean16 = node15.hasOneChild();
        boolean boolean17 = node15.isObjectLit();
        com.google.javascript.rhino.InputId inputId18 = com.google.javascript.jscomp.NodeUtil.getInputId(node15);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1), node15);
        boolean boolean20 = node19.isNE();
        node12.addChildToBack(node19);
        node19.addSuppression("");
        boolean boolean24 = node19.isComma();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean27 = node26.isOr();
        boolean boolean28 = node26.isLabel();
        java.lang.String str29 = node26.toStringTree();
        boolean boolean30 = node26.isDebugger();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean33 = node32.hasOneChild();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean36 = node35.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind37 = new com.google.javascript.jscomp.CodingConvention.Bind(node26, node32, node35);
        boolean boolean38 = node26.isSwitch();
        boolean boolean39 = node26.isQuotedString();
        boolean boolean40 = node26.isOr();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable41 = node26.children();
        // The following exception was thrown during execution in test generation
        try {
            node5.addChildAfter(node19, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(inputId18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "NUMBER -1.0\n" + "'", str29, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(nodeIterable41);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        int int0 = com.google.javascript.rhino.Node.IS_VAR_ARGS_PARAM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 45 + "'", int0 == 45);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.hasImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = functionType20.getOwnImplementedInterfaces();
        com.google.javascript.rhino.jstype.TemplateType templateType24 = functionType20.toMaybeTemplateType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNull(templateType24);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.isParameterizedType();
        java.lang.String str23 = null; // flaky: functionType20.toAnnotationString();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        jSTypeRegistry25.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean31 = node30.hasOneChild();
        boolean boolean32 = node30.isObjectLit();
        com.google.javascript.rhino.InputId inputId33 = com.google.javascript.jscomp.NodeUtil.getInputId(node30);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), node30);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean38 = node37.hasOneChild();
        boolean boolean39 = node37.isObjectLit();
        com.google.javascript.rhino.InputId inputId40 = com.google.javascript.jscomp.NodeUtil.getInputId(node37);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1), node37);
        boolean boolean42 = node41.isNE();
        node34.addChildToBack(node41);
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry25.createFunctionType(jSType27, node41);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        jSTypeRegistry46.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean52 = node51.hasOneChild();
        boolean boolean53 = node51.isObjectLit();
        com.google.javascript.rhino.InputId inputId54 = com.google.javascript.jscomp.NodeUtil.getInputId(node51);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), node51);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean59 = node58.hasOneChild();
        boolean boolean60 = node58.isObjectLit();
        com.google.javascript.rhino.InputId inputId61 = com.google.javascript.jscomp.NodeUtil.getInputId(node58);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1), node58);
        boolean boolean63 = node62.isNE();
        node55.addChildToBack(node62);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry46.createFunctionType(jSType48, node62);
        int int66 = functionType65.getMaxArguments();
        functionType44.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType65);
        functionType20.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType65);
        com.google.javascript.rhino.jstype.JSType jSType70 = functionType65.findPropertyType("(unknown)");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType71 = functionType65.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(inputId33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(inputId54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNull(jSType70);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        jSTypeRegistry23.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.hasOneChild();
        boolean boolean30 = node28.isObjectLit();
        com.google.javascript.rhino.InputId inputId31 = com.google.javascript.jscomp.NodeUtil.getInputId(node28);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1), node28);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean36 = node35.hasOneChild();
        boolean boolean37 = node35.isObjectLit();
        com.google.javascript.rhino.InputId inputId38 = com.google.javascript.jscomp.NodeUtil.getInputId(node35);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((-1), node35);
        boolean boolean40 = node39.isNE();
        node32.addChildToBack(node39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry23.createFunctionType(jSType25, node39);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable43 = functionType42.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType44 = functionType42.getPrototype();
        jSTypeRegistry1.registerPropertyOnType("NUMBER -1.0\n", (com.google.javascript.rhino.jstype.JSType) functionType42);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = objectType46.isSubtype(jSType47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inputId31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertNotNull(objectTypeIterable43);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(objectType46);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        node6.setType(43);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean12 = node11.hasOneChild();
        boolean boolean13 = node11.isObjectLit();
        com.google.javascript.rhino.InputId inputId14 = com.google.javascript.jscomp.NodeUtil.getInputId(node11);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((-1), node11);
        java.lang.String str16 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node15);
        boolean boolean17 = node15.isBreak();
        boolean boolean18 = node15.isAssignAdd();
        boolean boolean19 = node15.hasMoreThanOneChild();
        java.lang.String str20 = node15.getQualifiedName();
        com.google.javascript.rhino.Node node21 = node6.copyInformationFromForTree(node15);
        boolean boolean22 = node15.isSwitch();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        boolean boolean8 = jSDocInfo0.isNoCompile();
        boolean boolean9 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getBaseType();
        boolean boolean11 = jSDocInfo0.hasFileOverview();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = jSTypeRegistry1.getErrorReporter();
        boolean boolean22 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType24 = jSTypeRegistry1.getNativeType(jSTypeNative23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNull(errorReporter21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.util.Iterator<java.lang.String> strItor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList1 = com.google.common.collect.ImmutableList.copyOf(strItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.lang.String[] strArray2 = new java.lang.String[] { "unknown", "unknown" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        boolean boolean11 = strList8.add("");
        boolean boolean12 = strSet3.remove((java.lang.Object) strList8);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        jSTypeRegistry14.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean20 = node19.hasOneChild();
        boolean boolean21 = node19.isObjectLit();
        com.google.javascript.rhino.InputId inputId22 = com.google.javascript.jscomp.NodeUtil.getInputId(node19);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((-1), node19);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean27 = node26.hasOneChild();
        boolean boolean28 = node26.isObjectLit();
        com.google.javascript.rhino.InputId inputId29 = com.google.javascript.jscomp.NodeUtil.getInputId(node26);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((-1), node26);
        boolean boolean31 = node30.isNE();
        node23.addChildToBack(node30);
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry14.createFunctionType(jSType16, node30);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34);
        jSTypeRegistry35.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean41 = node40.hasOneChild();
        boolean boolean42 = node40.isObjectLit();
        com.google.javascript.rhino.InputId inputId43 = com.google.javascript.jscomp.NodeUtil.getInputId(node40);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((-1), node40);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean48 = node47.hasOneChild();
        boolean boolean49 = node47.isObjectLit();
        com.google.javascript.rhino.InputId inputId50 = com.google.javascript.jscomp.NodeUtil.getInputId(node47);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((-1), node47);
        boolean boolean52 = node51.isNE();
        node44.addChildToBack(node51);
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry35.createFunctionType(jSType37, node51);
        int int55 = functionType54.getMaxArguments();
        functionType33.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType54);
        com.google.javascript.rhino.jstype.JSType jSType57 = functionType33.autoboxesTo();
        com.google.javascript.rhino.Node node58 = functionType33.getSource();
        java.util.Set<java.lang.String> strSet59 = functionType33.getOwnPropertyNames();
        boolean boolean60 = strList8.containsAll((java.util.Collection<java.lang.String>) strSet59);
        java.util.stream.Stream<java.lang.String> strStream61 = strSet59.parallelStream();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(inputId22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(inputId43);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(inputId50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNull(jSType57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strStream61);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.NOT_A_CLASS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Not declared as a constructor" + "'", str0, "Not declared as a constructor");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        java.util.List<com.google.javascript.rhino.jstype.ObjectType> objectTypeList22 = null;
        // The following exception was thrown during execution in test generation
        try {
            functionType20.setImplementedInterfaces(objectTypeList22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType23 = jSTypeRegistry1.createUnionType(jSTypeNativeArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        com.google.javascript.rhino.InputId inputId4 = com.google.javascript.jscomp.NodeUtil.getInputId(node1);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node1.children();
        // The following exception was thrown during execution in test generation
        try {
            node1.setString("Node tree inequality:\nTree1:\nEQ\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: EQ\n\n\nSubtree2: NUMBER -1.0\n");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER -1.0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputId4);
        org.junit.Assert.assertNotNull(nodeIterable5);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        int int0 = com.google.javascript.rhino.Node.FLAG_ARGUMENTS_UNMODIFIED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        java.lang.String str4 = node1.toStringTree();
        boolean boolean5 = node1.isDebugger();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean8 = node7.hasOneChild();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind12 = new com.google.javascript.jscomp.CodingConvention.Bind(node1, node7, node10);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean18 = node17.hasOneChild();
        boolean boolean19 = node17.isObjectLit();
        com.google.javascript.rhino.InputId inputId20 = com.google.javascript.jscomp.NodeUtil.getInputId(node17);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), node17);
        node21.setType(43);
        com.google.javascript.jscomp.CodingConvention.Bind bind24 = new com.google.javascript.jscomp.CodingConvention.Bind(node10, node14, node21);
        node21.setSourceEncodedPosition((int) (byte) 10);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node21.children();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean31 = node30.hasOneChild();
        boolean boolean32 = node30.isObjectLit();
        com.google.javascript.rhino.InputId inputId33 = com.google.javascript.jscomp.NodeUtil.getInputId(node30);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), node30);
        java.lang.String str35 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node34);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec37 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str38 = assertionFunctionSpec37.getFunctionName();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean42 = node41.isOr();
        node41.setLineno(2);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(0, node41);
        com.google.javascript.rhino.Node node46 = assertionFunctionSpec37.getAssertedParam(node41);
        com.google.javascript.rhino.Node node47 = node34.srcref(node46);
        com.google.javascript.rhino.Node node48 = node21.useSourceInfoFrom(node47);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = node47.getExistingIntProp(50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 50");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NUMBER -1.0\n" + "'", str4, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertNotNull(nodeIterable27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(inputId33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        boolean boolean21 = functionType20.matchesStringContext();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType22 = functionType20.toMaybeEnumElementType();
        java.lang.String str23 = null; // flaky: functionType20.toString();
        com.google.javascript.rhino.jstype.FunctionType functionType24 = functionType20.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = functionType24.isNoObjectType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(enumElementType22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertNull(functionType24);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.hasDisplayName();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean25 = node24.isOr();
        boolean boolean26 = node24.hasMoreThanOneChild();
        com.google.javascript.rhino.jstype.JSType jSType27 = node24.getJSType();
        boolean boolean28 = node24.isAssignAdd();
        boolean boolean29 = functionType20.equals((java.lang.Object) boolean28);
        boolean boolean30 = functionType20.isVoidType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = functionType20.toDebugHashCodeString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(jSType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.isParameterizedType();
        java.lang.String str23 = null; // flaky: functionType20.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet24 = functionType20.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node25 = functionType20.getParametersNode();
        com.google.javascript.rhino.Node node26 = node25.detachFromParent();
        boolean boolean27 = node26.isTry();
        com.google.javascript.rhino.Node node28 = node26.cloneNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet24 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet24.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isAnd();
        typePosition0.setItem(node2);
        int int6 = typePosition0.getStartLine();
        int int7 = typePosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            typePosition0.setPositionInformation(46, 12, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 46?end-line: 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getModifies();
        int int7 = strSet6.size();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean10 = node9.isOr();
        node9.setLineno(2);
        boolean boolean13 = strSet6.contains((java.lang.Object) 2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = strSet6.add("(unknown)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        int int0 = com.google.javascript.rhino.Node.IS_OPTIONAL_PARAM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 44 + "'", int0 == 44);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isObjectLit();
        com.google.javascript.rhino.InputId inputId6 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1), node3);
        node7.setType(43);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean13 = node12.hasOneChild();
        boolean boolean14 = node12.isObjectLit();
        com.google.javascript.rhino.InputId inputId15 = com.google.javascript.jscomp.NodeUtil.getInputId(node12);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((-1), node12);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node16);
        boolean boolean18 = node16.isBreak();
        boolean boolean19 = node16.isAssignAdd();
        boolean boolean20 = node16.hasMoreThanOneChild();
        java.lang.String str21 = node16.getQualifiedName();
        com.google.javascript.rhino.Node node22 = node7.copyInformationFromForTree(node16);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        jSTypeRegistry25.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        jSTypeRegistry29.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node34);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean42 = node41.hasOneChild();
        boolean boolean43 = node41.isObjectLit();
        com.google.javascript.rhino.InputId inputId44 = com.google.javascript.jscomp.NodeUtil.getInputId(node41);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((-1), node41);
        boolean boolean46 = node45.isNE();
        node38.addChildToBack(node45);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry29.createFunctionType(jSType31, node45);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable49 = functionType48.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType50 = functionType48.getPrototype();
        boolean boolean51 = jSTypeRegistry25.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType50);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        jSTypeRegistry53.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean59 = node58.hasOneChild();
        boolean boolean60 = node58.isObjectLit();
        com.google.javascript.rhino.InputId inputId61 = com.google.javascript.jscomp.NodeUtil.getInputId(node58);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1), node58);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean66 = node65.hasOneChild();
        boolean boolean67 = node65.isObjectLit();
        com.google.javascript.rhino.InputId inputId68 = com.google.javascript.jscomp.NodeUtil.getInputId(node65);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((-1), node65);
        boolean boolean70 = node69.isNE();
        node62.addChildToBack(node69);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry53.createFunctionType(jSType55, node69);
        int int73 = functionType72.getMaxArguments();
        boolean boolean74 = functionType72.hasDisplayName();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection75 = jSTypeRegistry25.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType72);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean79 = node78.hasOneChild();
        boolean boolean80 = node78.isObjectLit();
        com.google.javascript.rhino.InputId inputId81 = com.google.javascript.jscomp.NodeUtil.getInputId(node78);
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node((-1), node78);
        java.lang.String str83 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node82);
        node82.setLineno(15);
        functionType72.setSource(node82);
        com.google.javascript.rhino.Node node91 = com.google.javascript.rhino.Node.newString((-1), "hi!", 36, (int) (byte) 0);
        node91.setVarArgs(false);
        boolean boolean94 = node91.isOptionalArg();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node97 = new com.google.javascript.rhino.Node((int) (byte) 0, node22, node23, node82, node91, 37, 44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(inputId15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(inputId44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertNotNull(objectTypeIterable49);
        org.junit.Assert.assertNotNull(objectType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(inputId68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(functionTypeCollection75);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(inputId81);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.hasImplementedInterfaces();
        boolean boolean24 = functionType20.removeProperty("true");
        boolean boolean26 = functionType20.isPropertyInExterns("");
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType20.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType28 = functionType20.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSType27);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = null;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        boolean boolean5 = jSDocInfo0.isConsistentIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getParameterType("NUMBER -1.0 2\n");
        boolean boolean8 = jSDocInfo0.isConsistentIdGenerator();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isAnd();
        node1.addSuppression("");
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean9 = node8.isOr();
        boolean boolean10 = node8.hasMoreThanOneChild();
        boolean boolean11 = node8.isReturn();
        boolean boolean12 = node8.isScript();
        boolean boolean13 = node8.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean16 = node15.isOr();
        com.google.javascript.rhino.InputId inputId17 = node15.getInputId();
        boolean boolean18 = node15.isNot();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(31, "");
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean25 = node24.isOr();
        node24.setLineno(2);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0, node24);
        com.google.javascript.rhino.Node node29 = node21.useSourceInfoFromForTree(node24);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean32 = node31.isOr();
        boolean boolean33 = node31.hasMoreThanOneChild();
        com.google.javascript.rhino.jstype.JSType jSType34 = node31.getJSType();
        boolean boolean35 = node31.isAssignAdd();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(41, node8, node15, node29, node31, (int) '4', 45);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node39 = node1.clonePropsFrom(node38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Node has existing properties.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(inputId17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.isParameterizedType();
        java.lang.String str23 = null; // flaky: functionType20.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet24 = functionType20.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node25 = functionType20.getParametersNode();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.hasOneChild();
        boolean boolean30 = node28.isObjectLit();
        com.google.javascript.rhino.InputId inputId31 = com.google.javascript.jscomp.NodeUtil.getInputId(node28);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1), node28);
        node32.setType(43);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node35 = node25.getChildBefore(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet24 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet24.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inputId31);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        boolean boolean4 = node1.isAssignAdd();
        boolean boolean5 = node1.isQualifiedName();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean9 = node8.isOr();
        boolean boolean10 = node8.isLabel();
        java.lang.String str11 = node8.toStringTree();
        boolean boolean12 = node8.isDebugger();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean15 = node14.hasOneChild();
        boolean boolean16 = node14.isObjectLit();
        com.google.javascript.rhino.InputId inputId17 = com.google.javascript.jscomp.NodeUtil.getInputId(node14);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection18 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node14);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean21 = node20.hasOneChild();
        boolean boolean22 = node20.isAnd();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean25 = node24.hasOneChild();
        boolean boolean26 = node24.isObjectLit();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0, node8, node14, node20, node24, 12, 0);
        boolean boolean30 = node1.isEquivalentToTyped(node20);
        boolean boolean31 = node1.isName();
        boolean boolean32 = node1.isVarArgs();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "NUMBER -1.0\n" + "'", str11, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(inputId17);
        org.junit.Assert.assertNotNull(nodeCollection18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.isParameterizedType();
        java.lang.String str23 = null; // flaky: functionType20.toAnnotationString();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        jSTypeRegistry25.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean31 = node30.hasOneChild();
        boolean boolean32 = node30.isObjectLit();
        com.google.javascript.rhino.InputId inputId33 = com.google.javascript.jscomp.NodeUtil.getInputId(node30);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), node30);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean38 = node37.hasOneChild();
        boolean boolean39 = node37.isObjectLit();
        com.google.javascript.rhino.InputId inputId40 = com.google.javascript.jscomp.NodeUtil.getInputId(node37);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1), node37);
        boolean boolean42 = node41.isNE();
        node34.addChildToBack(node41);
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry25.createFunctionType(jSType27, node41);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        jSTypeRegistry46.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean52 = node51.hasOneChild();
        boolean boolean53 = node51.isObjectLit();
        com.google.javascript.rhino.InputId inputId54 = com.google.javascript.jscomp.NodeUtil.getInputId(node51);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), node51);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean59 = node58.hasOneChild();
        boolean boolean60 = node58.isObjectLit();
        com.google.javascript.rhino.InputId inputId61 = com.google.javascript.jscomp.NodeUtil.getInputId(node58);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1), node58);
        boolean boolean63 = node62.isNE();
        node55.addChildToBack(node62);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry46.createFunctionType(jSType48, node62);
        int int66 = functionType65.getMaxArguments();
        functionType44.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType65);
        functionType20.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType65);
        boolean boolean69 = functionType65.hasReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70);
        jSTypeRegistry71.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean77 = node76.hasOneChild();
        boolean boolean78 = node76.isObjectLit();
        com.google.javascript.rhino.InputId inputId79 = com.google.javascript.jscomp.NodeUtil.getInputId(node76);
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((-1), node76);
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean84 = node83.hasOneChild();
        boolean boolean85 = node83.isObjectLit();
        com.google.javascript.rhino.InputId inputId86 = com.google.javascript.jscomp.NodeUtil.getInputId(node83);
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node((-1), node83);
        boolean boolean88 = node87.isNE();
        node80.addChildToBack(node87);
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry71.createFunctionType(jSType73, node87);
        int int91 = functionType90.getMaxArguments();
        boolean boolean92 = functionType90.hasImplementedInterfaces();
        boolean boolean93 = functionType65.hasEqualCallType(functionType90);
        int int94 = functionType65.getMaxArguments();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType95 = functionType65.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(inputId33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(inputId54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(inputId79);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(inputId86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.isParameterizedType();
        java.lang.String str23 = null; // flaky: functionType20.toAnnotationString();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        jSTypeRegistry25.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean31 = node30.hasOneChild();
        boolean boolean32 = node30.isObjectLit();
        com.google.javascript.rhino.InputId inputId33 = com.google.javascript.jscomp.NodeUtil.getInputId(node30);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), node30);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean38 = node37.hasOneChild();
        boolean boolean39 = node37.isObjectLit();
        com.google.javascript.rhino.InputId inputId40 = com.google.javascript.jscomp.NodeUtil.getInputId(node37);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1), node37);
        boolean boolean42 = node41.isNE();
        node34.addChildToBack(node41);
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry25.createFunctionType(jSType27, node41);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        jSTypeRegistry46.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean52 = node51.hasOneChild();
        boolean boolean53 = node51.isObjectLit();
        com.google.javascript.rhino.InputId inputId54 = com.google.javascript.jscomp.NodeUtil.getInputId(node51);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), node51);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean59 = node58.hasOneChild();
        boolean boolean60 = node58.isObjectLit();
        com.google.javascript.rhino.InputId inputId61 = com.google.javascript.jscomp.NodeUtil.getInputId(node58);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1), node58);
        boolean boolean63 = node62.isNE();
        node55.addChildToBack(node62);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry46.createFunctionType(jSType48, node62);
        int int66 = functionType65.getMaxArguments();
        functionType44.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType65);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair68 = functionType20.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType65);
        com.google.javascript.rhino.jstype.EnumType enumType69 = functionType20.toMaybeEnumType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = enumType69.isRecordType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(inputId33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(inputId54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(typePair68);
        org.junit.Assert.assertNull(enumType69);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean27 = node26.hasOneChild();
        boolean boolean28 = node26.isObjectLit();
        com.google.javascript.rhino.InputId inputId29 = com.google.javascript.jscomp.NodeUtil.getInputId(node26);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((-1), node26);
        java.lang.String str31 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node30);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean34 = node33.isOr();
        boolean boolean35 = node33.isLabel();
        boolean boolean36 = node33.isAssignAdd();
        boolean boolean37 = node33.isQualifiedName();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(30, node30, node33, 4095, (int) (short) 0);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node40);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean44 = node43.hasOneChild();
        boolean boolean45 = node43.isObjectLit();
        java.lang.String str46 = com.google.javascript.jscomp.NodeUtil.getSourceName(node43);
        java.lang.String str47 = node43.getSourceFileName();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48);
        jSTypeRegistry49.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean55 = node54.hasOneChild();
        boolean boolean56 = node54.isObjectLit();
        com.google.javascript.rhino.InputId inputId57 = com.google.javascript.jscomp.NodeUtil.getInputId(node54);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((-1), node54);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean62 = node61.hasOneChild();
        boolean boolean63 = node61.isObjectLit();
        com.google.javascript.rhino.InputId inputId64 = com.google.javascript.jscomp.NodeUtil.getInputId(node61);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((-1), node61);
        boolean boolean66 = node65.isNE();
        node58.addChildToBack(node65);
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry49.createFunctionType(jSType51, node65);
        int int69 = functionType68.getMaxArguments();
        boolean boolean70 = functionType68.hasDisplayName();
        com.google.javascript.rhino.jstype.JSType jSType72 = functionType68.getPropertyType("NUMBER -1.0\n");
        com.google.javascript.rhino.jstype.ObjectType objectType73 = functionType68.getPrototype();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry1.createConstructorType("JSDocInfo", node40, node43, (com.google.javascript.rhino.jstype.JSType) objectType73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNull(errorReporter21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(inputId57);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(inputId64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertNotNull(objectType73);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int22 = node17.getIntProp(12);
        boolean boolean23 = node17.isTrue();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node6);
        boolean boolean8 = node6.isBreak();
        boolean boolean9 = node6.isAssignAdd();
        boolean boolean10 = node6.hasChildren();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = node6.getExistingIntProp(42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 42");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) 'a');
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        boolean boolean21 = functionType20.matchesStringContext();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType22 = functionType20.toMaybeEnumElementType();
        java.lang.String str23 = null; // flaky: functionType20.toString();
        com.google.javascript.rhino.jstype.FunctionType functionType24 = functionType20.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType25 = functionType24.getParentScope();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(enumElementType22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertNull(functionType24);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        com.google.javascript.rhino.InputId inputId4 = com.google.javascript.jscomp.NodeUtil.getInputId(node1);
        com.google.javascript.rhino.Node node5 = node1.getFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = node5.isLocalResultCall();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputId4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = jSTypeRegistry1.getErrorReporter();
        boolean boolean22 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        jSTypeRegistry25.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        jSTypeRegistry29.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node34);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean42 = node41.hasOneChild();
        boolean boolean43 = node41.isObjectLit();
        com.google.javascript.rhino.InputId inputId44 = com.google.javascript.jscomp.NodeUtil.getInputId(node41);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((-1), node41);
        boolean boolean46 = node45.isNE();
        node38.addChildToBack(node45);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry29.createFunctionType(jSType31, node45);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable49 = functionType48.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType50 = functionType48.getPrototype();
        boolean boolean51 = jSTypeRegistry25.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType50);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        jSTypeRegistry53.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean59 = node58.hasOneChild();
        boolean boolean60 = node58.isObjectLit();
        com.google.javascript.rhino.InputId inputId61 = com.google.javascript.jscomp.NodeUtil.getInputId(node58);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1), node58);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean66 = node65.hasOneChild();
        boolean boolean67 = node65.isObjectLit();
        com.google.javascript.rhino.InputId inputId68 = com.google.javascript.jscomp.NodeUtil.getInputId(node65);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((-1), node65);
        boolean boolean70 = node69.isNE();
        node62.addChildToBack(node69);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry53.createFunctionType(jSType55, node69);
        int int73 = functionType72.getMaxArguments();
        boolean boolean74 = functionType72.hasDisplayName();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection75 = jSTypeRegistry25.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType72);
        jSTypeRegistry1.registerPropertyOnType("EQ\n", (com.google.javascript.rhino.jstype.JSType) functionType72);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative77 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType78 = jSTypeRegistry1.getNativeType(jSTypeNative77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNull(errorReporter21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(inputId44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertNotNull(objectTypeIterable49);
        org.junit.Assert.assertNotNull(objectType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(inputId68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(functionTypeCollection75);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        int int0 = com.google.javascript.rhino.Node.PARENTHESIZED_PROP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 35 + "'", int0 == 35);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        jSTypeRegistry22.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean28 = node27.hasOneChild();
        boolean boolean29 = node27.isObjectLit();
        com.google.javascript.rhino.InputId inputId30 = com.google.javascript.jscomp.NodeUtil.getInputId(node27);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), node27);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node34);
        boolean boolean39 = node38.isNE();
        node31.addChildToBack(node38);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry22.createFunctionType(jSType24, node38);
        int int42 = functionType41.getMaxArguments();
        functionType20.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType41);
        com.google.javascript.rhino.jstype.JSType jSType44 = functionType20.autoboxesTo();
        boolean boolean45 = functionType20.hasCachedValues();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = functionType20.getAllExtendedInterfaces();
        boolean boolean47 = functionType20.isFunctionType();
        boolean boolean48 = functionType20.matchesNumberContext();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputId30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNull(jSType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        boolean boolean4 = node2.isLabel();
        java.lang.String str5 = node2.toStringTree();
        boolean boolean6 = node2.isDebugger();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean9 = node8.hasOneChild();
        boolean boolean10 = node8.isObjectLit();
        com.google.javascript.rhino.InputId inputId11 = com.google.javascript.jscomp.NodeUtil.getInputId(node8);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection12 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean15 = node14.hasOneChild();
        boolean boolean16 = node14.isAnd();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean19 = node18.hasOneChild();
        boolean boolean20 = node18.isObjectLit();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0, node2, node8, node14, node18, 12, 0);
        com.google.javascript.rhino.Node node24 = node8.cloneNode();
        boolean boolean25 = node24.wasEmptyNode();
        boolean boolean26 = node24.isGetProp();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = jSDocInfo27.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility29 = null;
        jSDocInfo27.setVisibility(visibility29);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression31 = jSDocInfo27.getReturnType();
        boolean boolean32 = jSDocInfo27.isConsistentIdGenerator();
        boolean boolean33 = jSDocInfo27.isConsistentIdGenerator();
        java.util.Set<java.lang.String> strSet34 = jSDocInfo27.getParameterNames();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean37 = node36.isOr();
        boolean boolean38 = node36.isLabel();
        node36.setOptionalArg(false);
        boolean boolean41 = strSet34.equals((java.lang.Object) node36);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean44 = node43.isOr();
        boolean boolean45 = node43.isLabel();
        java.lang.String str46 = node43.toStringTree();
        boolean boolean47 = node43.isDebugger();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean50 = node49.hasOneChild();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean53 = node52.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind54 = new com.google.javascript.jscomp.CodingConvention.Bind(node43, node49, node52);
        // The following exception was thrown during execution in test generation
        try {
            node24.addChildrenAfter(node36, node49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "NUMBER -1.0\n" + "'", str5, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNotNull(nodeCollection12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(jSTypeExpression28);
        org.junit.Assert.assertNull(jSTypeExpression31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "NUMBER -1.0\n" + "'", str46, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable21 = functionType20.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType22 = functionType20.getPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = functionType20.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ParameterizedType parameterizedType24 = functionType23.toMaybeParameterizedType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(objectTypeIterable21);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNull(functionType23);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.google.common.collect.UnmodifiableListIterator<java.lang.String>[] strItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<com.google.common.collect.UnmodifiableListIterator<java.lang.String>> strItorList1 = com.google.common.collect.ImmutableList.copyOf(strItorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        boolean boolean4 = node2.isLabel();
        java.lang.String str5 = node2.toStringTree();
        boolean boolean6 = node2.isDebugger();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean9 = node8.hasOneChild();
        boolean boolean10 = node8.isObjectLit();
        com.google.javascript.rhino.InputId inputId11 = com.google.javascript.jscomp.NodeUtil.getInputId(node8);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection12 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean15 = node14.hasOneChild();
        boolean boolean16 = node14.isAnd();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean19 = node18.hasOneChild();
        boolean boolean20 = node18.isObjectLit();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0, node2, node8, node14, node18, 12, 0);
        com.google.javascript.rhino.Node node24 = node8.cloneNode();
        node24.addSuppression("NUMBER -1.0 2\n");
        boolean boolean27 = node24.isFromExterns();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "NUMBER -1.0\n" + "'", str5, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNotNull(nodeCollection12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        boolean boolean4 = jSTypeRegistry1.isForwardDeclaredType("JSDocInfo");
        jSTypeRegistry1.clearNamedTypes();
        jSTypeRegistry1.forwardDeclareType("(unknown)");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType9 = jSTypeRegistry1.getNativeObjectType(jSTypeNative8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = jSTypeRegistry1.createParameters(jSTypeArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        java.lang.Object obj6 = null;
        int int7 = strList3.indexOf(obj6);
        boolean boolean8 = strList3.isEmpty();
        java.util.ListIterator<java.lang.String> strItor9 = strList3.listIterator();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList13 = com.google.common.collect.ImmutableList.copyOf(strArray12);
        java.util.Iterator<java.lang.String> strItor14 = strList13.iterator();
        boolean boolean15 = strList3.containsAll((java.util.Collection<java.lang.String>) strList13);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags17 = new com.google.javascript.rhino.Node.SideEffectFlags(46);
        boolean boolean18 = strList3.contains((java.lang.Object) sideEffectFlags17);
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = jSDocInfo19.getReturnType();
        java.lang.String str21 = jSDocInfo19.getOriginalCommentString();
        boolean boolean22 = jSDocInfo19.isExterns();
        jSDocInfo19.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet25 = jSDocInfo19.getModifies();
        int int26 = strSet25.size();
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList30 = com.google.common.collect.ImmutableList.copyOf(strArray29);
        java.util.Iterator<java.lang.String> strItor31 = strList30.iterator();
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList35 = com.google.common.collect.ImmutableList.copyOf(strArray34);
        int int37 = strList35.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean38 = strList30.contains((java.lang.Object) int37);
        boolean boolean39 = strSet25.remove((java.lang.Object) int37);
        java.util.Spliterator<java.lang.String> strSpliterator40 = strSet25.spliterator();
        int int41 = strSet25.size();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        jSTypeRegistry43.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        jSTypeRegistry46.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean52 = node51.hasOneChild();
        boolean boolean53 = node51.isObjectLit();
        com.google.javascript.rhino.InputId inputId54 = com.google.javascript.jscomp.NodeUtil.getInputId(node51);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), node51);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean59 = node58.hasOneChild();
        boolean boolean60 = node58.isObjectLit();
        com.google.javascript.rhino.InputId inputId61 = com.google.javascript.jscomp.NodeUtil.getInputId(node58);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1), node58);
        boolean boolean63 = node62.isNE();
        node55.addChildToBack(node62);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry46.createFunctionType(jSType48, node62);
        int int66 = functionType65.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType67 = functionType65.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry43.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType65);
        com.google.javascript.rhino.Node node69 = functionType65.getRootNode();
        boolean boolean70 = strSet25.contains((java.lang.Object) functionType65);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean71 = strList3.removeAll((java.util.Collection<java.lang.String>) strSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(jSTypeExpression20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strItor31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strSpliterator40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(inputId54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.hasImplementedInterfaces();
        boolean boolean23 = functionType20.isBooleanObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        jSTypeRegistry26.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean32 = node31.hasOneChild();
        boolean boolean33 = node31.isObjectLit();
        com.google.javascript.rhino.InputId inputId34 = com.google.javascript.jscomp.NodeUtil.getInputId(node31);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((-1), node31);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean39 = node38.hasOneChild();
        boolean boolean40 = node38.isObjectLit();
        com.google.javascript.rhino.InputId inputId41 = com.google.javascript.jscomp.NodeUtil.getInputId(node38);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((-1), node38);
        boolean boolean43 = node42.isNE();
        node35.addChildToBack(node42);
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry26.createFunctionType(jSType28, node42);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        jSTypeRegistry47.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean53 = node52.hasOneChild();
        boolean boolean54 = node52.isObjectLit();
        com.google.javascript.rhino.InputId inputId55 = com.google.javascript.jscomp.NodeUtil.getInputId(node52);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((-1), node52);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean60 = node59.hasOneChild();
        boolean boolean61 = node59.isObjectLit();
        com.google.javascript.rhino.InputId inputId62 = com.google.javascript.jscomp.NodeUtil.getInputId(node59);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((-1), node59);
        boolean boolean64 = node63.isNE();
        node56.addChildToBack(node63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry47.createFunctionType(jSType49, node63);
        int int67 = functionType66.getMaxArguments();
        functionType45.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType66);
        com.google.javascript.rhino.jstype.JSType jSType69 = functionType45.autoboxesTo();
        boolean boolean70 = functionType45.hasCachedValues();
        boolean boolean72 = functionType45.isPropertyTypeInferred("[, hi!]");
        boolean boolean73 = functionType45.isBooleanValueType();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean76 = node75.hasOneChild();
        boolean boolean77 = node75.isAnd();
        node75.setLength(50);
        boolean boolean80 = functionType20.defineSynthesizedProperty("[, hi!]", (com.google.javascript.rhino.jstype.JSType) functionType45, node75);
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean83 = node82.hasOneChild();
        boolean boolean84 = node82.isObjectLit();
        java.lang.String str85 = com.google.javascript.jscomp.NodeUtil.getSourceName(node82);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile86 = null;
        node82.setStaticSourceFile(staticSourceFile86);
        boolean boolean88 = node82.isObjectLit();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node89 = node75.getChildBefore(node82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(inputId34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(inputId41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(inputId55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(inputId62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        boolean boolean8 = jSDocInfo0.isNoCompile();
        boolean boolean9 = jSDocInfo0.isInterface();
        boolean boolean10 = jSDocInfo0.hasBaseType();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection11 = jSDocInfo0.getTypeNodes();
        java.lang.String str12 = jSDocInfo0.getSourceName();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeCollection11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        jSTypeRegistry5.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.hasOneChild();
        boolean boolean12 = node10.isObjectLit();
        com.google.javascript.rhino.InputId inputId13 = com.google.javascript.jscomp.NodeUtil.getInputId(node10);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1), node10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean18 = node17.hasOneChild();
        boolean boolean19 = node17.isObjectLit();
        com.google.javascript.rhino.InputId inputId20 = com.google.javascript.jscomp.NodeUtil.getInputId(node17);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), node17);
        boolean boolean22 = node21.isNE();
        node14.addChildToBack(node21);
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry5.createFunctionType(jSType7, node21);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = functionType24.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType24.getPrototype();
        boolean boolean27 = jSTypeRegistry1.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        jSTypeRegistry29.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node34);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean42 = node41.hasOneChild();
        boolean boolean43 = node41.isObjectLit();
        com.google.javascript.rhino.InputId inputId44 = com.google.javascript.jscomp.NodeUtil.getInputId(node41);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((-1), node41);
        boolean boolean46 = node45.isNE();
        node38.addChildToBack(node45);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry29.createFunctionType(jSType31, node45);
        int int49 = functionType48.getMaxArguments();
        boolean boolean50 = functionType48.hasDisplayName();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection51 = jSTypeRegistry1.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType48);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot53 = functionType48.getSlot("NUMBER -1.0\n");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(inputId13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(inputId44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(functionTypeCollection51);
        org.junit.Assert.assertNull(staticSlot53);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(1, "NUMBER -1.0\n", 0, 42);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.lang.String[] strArray5 = new java.lang.String[] { "Function", "Function", "NUMBER -1.0", "java.io.IOException: ", "Not declared as a type name" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.lang.Object obj8 = null;
        int int9 = strList6.lastIndexOf(obj8);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo10.getReturnType();
        java.lang.String str12 = jSDocInfo10.getOriginalCommentString();
        boolean boolean13 = jSDocInfo10.isExterns();
        jSDocInfo10.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet16 = jSDocInfo10.getModifies();
        int int17 = strSet16.size();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean20 = node19.isOr();
        node19.setLineno(2);
        boolean boolean23 = strSet16.contains((java.lang.Object) 2);
        java.util.Set[] setArray25 = new java.util.Set[1];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray26 = (java.util.Set<java.lang.String>[]) setArray25;
        strSetArray26[0] = strSet16;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String>[] strSetArray29 = strList6.toArray(strSetArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(setArray25);
        org.junit.Assert.assertNotNull(strSetArray26);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.clearTemplateTypeNames();
        boolean boolean7 = jSTypeRegistry4.isForwardDeclaredType("JSDocInfo");
        jSTypeRegistry4.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType9 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        jSTypeRegistry12.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean22 = node21.hasOneChild();
        boolean boolean23 = node21.isObjectLit();
        com.google.javascript.rhino.InputId inputId24 = com.google.javascript.jscomp.NodeUtil.getInputId(node21);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((-1), node21);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.hasOneChild();
        boolean boolean30 = node28.isObjectLit();
        com.google.javascript.rhino.InputId inputId31 = com.google.javascript.jscomp.NodeUtil.getInputId(node28);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1), node28);
        boolean boolean33 = node32.isNE();
        node25.addChildToBack(node32);
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry16.createFunctionType(jSType18, node32);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable36 = functionType35.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType37 = functionType35.getPrototype();
        boolean boolean38 = jSTypeRegistry12.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType37);
        com.google.javascript.rhino.jstype.JSType jSType40 = objectType37.findPropertyType("(unknown)");
        com.google.javascript.rhino.jstype.JSType jSType41 = objectType37.restrictByNotNullOrUndefined();
        jSTypeRegistry4.unregisterPropertyOnType("", jSType41);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean46 = node45.isOr();
        boolean boolean47 = node45.isLabel();
        java.lang.String str48 = node45.toStringTree();
        boolean boolean49 = node45.isDebugger();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean52 = node51.hasOneChild();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean55 = node54.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind56 = new com.google.javascript.jscomp.CodingConvention.Bind(node45, node51, node54);
        boolean boolean57 = node51.isSetterDef();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean61 = node60.hasOneChild();
        boolean boolean62 = node60.isObjectLit();
        com.google.javascript.rhino.InputId inputId63 = com.google.javascript.jscomp.NodeUtil.getInputId(node60);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((-1), node60);
        boolean boolean65 = node60.isName();
        boolean boolean66 = node60.isComma();
        node60.setOptionalArg(true);
        com.google.javascript.rhino.Node node69 = node51.useSourceInfoIfMissingFromForTree(node60);
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70);
        jSTypeRegistry71.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean77 = node76.hasOneChild();
        boolean boolean78 = node76.isObjectLit();
        com.google.javascript.rhino.InputId inputId79 = com.google.javascript.jscomp.NodeUtil.getInputId(node76);
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((-1), node76);
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean84 = node83.hasOneChild();
        boolean boolean85 = node83.isObjectLit();
        com.google.javascript.rhino.InputId inputId86 = com.google.javascript.jscomp.NodeUtil.getInputId(node83);
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node((-1), node83);
        boolean boolean88 = node87.isNE();
        node80.addChildToBack(node87);
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry71.createFunctionType(jSType73, node87);
        int int91 = functionType90.getMaxArguments();
        boolean boolean92 = functionType90.isParameterizedType();
        java.lang.String str93 = null; // flaky: functionType90.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet94 = functionType90.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node95 = functionType90.getParametersNode();
        com.google.javascript.rhino.jstype.FunctionType functionType96 = functionType90.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType97 = functionType96.getImplicitPrototype();
        boolean boolean98 = functionType96.isInterface();
        com.google.javascript.rhino.jstype.EnumType enumType99 = jSTypeRegistry4.createEnumType("Not declared as a constructor", node60, (com.google.javascript.rhino.jstype.JSType) functionType96);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(inputId24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inputId31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertNotNull(objectTypeIterable36);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "NUMBER -1.0\n" + "'", str48, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(inputId63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(inputId79);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(inputId86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Function" + "'", str93, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet94 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet94.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertNotNull(functionType96);
        org.junit.Assert.assertNotNull(objectType97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNotNull(enumType99);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable21 = functionType20.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType22 = functionType20.getPrototype();
        com.google.javascript.rhino.jstype.JSType jSType23 = functionType20.getParameterType();
        boolean boolean24 = functionType20.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        jSTypeRegistry26.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean32 = node31.hasOneChild();
        boolean boolean33 = node31.isObjectLit();
        com.google.javascript.rhino.InputId inputId34 = com.google.javascript.jscomp.NodeUtil.getInputId(node31);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((-1), node31);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean39 = node38.hasOneChild();
        boolean boolean40 = node38.isObjectLit();
        com.google.javascript.rhino.InputId inputId41 = com.google.javascript.jscomp.NodeUtil.getInputId(node38);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((-1), node38);
        boolean boolean43 = node42.isNE();
        node35.addChildToBack(node42);
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry26.createFunctionType(jSType28, node42);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        jSTypeRegistry47.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean53 = node52.hasOneChild();
        boolean boolean54 = node52.isObjectLit();
        com.google.javascript.rhino.InputId inputId55 = com.google.javascript.jscomp.NodeUtil.getInputId(node52);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((-1), node52);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean60 = node59.hasOneChild();
        boolean boolean61 = node59.isObjectLit();
        com.google.javascript.rhino.InputId inputId62 = com.google.javascript.jscomp.NodeUtil.getInputId(node59);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((-1), node59);
        boolean boolean64 = node63.isNE();
        node56.addChildToBack(node63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry47.createFunctionType(jSType49, node63);
        int int67 = functionType66.getMaxArguments();
        functionType45.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType66);
        com.google.javascript.rhino.jstype.JSType jSType69 = functionType45.autoboxesTo();
        boolean boolean70 = functionType45.hasCachedValues();
        functionType20.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType45);
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72);
        jSTypeRegistry73.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean79 = node78.hasOneChild();
        boolean boolean80 = node78.isObjectLit();
        com.google.javascript.rhino.InputId inputId81 = com.google.javascript.jscomp.NodeUtil.getInputId(node78);
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node((-1), node78);
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean86 = node85.hasOneChild();
        boolean boolean87 = node85.isObjectLit();
        com.google.javascript.rhino.InputId inputId88 = com.google.javascript.jscomp.NodeUtil.getInputId(node85);
        com.google.javascript.rhino.Node node89 = new com.google.javascript.rhino.Node((-1), node85);
        boolean boolean90 = node89.isNE();
        node82.addChildToBack(node89);
        com.google.javascript.rhino.jstype.FunctionType functionType92 = jSTypeRegistry73.createFunctionType(jSType75, node89);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable93 = functionType92.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType94 = functionType92.getPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable95 = objectType94.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node97 = objectType94.getPropertyNode("hi!");
        boolean boolean98 = objectType94.isUnknownType();
        boolean boolean99 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType20, (com.google.javascript.rhino.jstype.JSType) objectType94);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(objectTypeIterable21);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(inputId34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(inputId41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(inputId55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(inputId62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(inputId81);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(inputId88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(functionType92);
        org.junit.Assert.assertNotNull(objectTypeIterable93);
        org.junit.Assert.assertNotNull(objectType94);
        org.junit.Assert.assertNotNull(objectTypeIterable95);
        org.junit.Assert.assertNull(node97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getEndLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<java.lang.String>> strSourcePositionList2 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition0);
        stringPosition0.setItem("[, hi!]");
        int int5 = stringPosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strSourcePositionList2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = ternaryValue1.not();
        java.lang.String str3 = ternaryValue1.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = ternaryValue1.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = ternaryValue5.not();
        java.lang.String str7 = ternaryValue5.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue5.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue4.and(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue0.or(ternaryValue4);
        java.lang.String str11 = ternaryValue10.toString();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "unknown" + "'", str3, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "unknown" + "'", str7, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "true" + "'", str11, "true");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(0);
        sideEffectFlags1.setReturnsTainted();
        sideEffectFlags1.setMutatesThis();
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(0);
        boolean boolean2 = sideEffectFlags1.areAllFlagsSet();
        sideEffectFlags1.clearSideEffectFlags();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        boolean boolean21 = functionType20.isNominalConstructor();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        jSTypeRegistry23.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.hasOneChild();
        boolean boolean30 = node28.isObjectLit();
        com.google.javascript.rhino.InputId inputId31 = com.google.javascript.jscomp.NodeUtil.getInputId(node28);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1), node28);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean36 = node35.hasOneChild();
        boolean boolean37 = node35.isObjectLit();
        com.google.javascript.rhino.InputId inputId38 = com.google.javascript.jscomp.NodeUtil.getInputId(node35);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((-1), node35);
        boolean boolean40 = node39.isNE();
        node32.addChildToBack(node39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry23.createFunctionType(jSType25, node39);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        jSTypeRegistry44.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean50 = node49.hasOneChild();
        boolean boolean51 = node49.isObjectLit();
        com.google.javascript.rhino.InputId inputId52 = com.google.javascript.jscomp.NodeUtil.getInputId(node49);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((-1), node49);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean57 = node56.hasOneChild();
        boolean boolean58 = node56.isObjectLit();
        com.google.javascript.rhino.InputId inputId59 = com.google.javascript.jscomp.NodeUtil.getInputId(node56);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((-1), node56);
        boolean boolean61 = node60.isNE();
        node53.addChildToBack(node60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry44.createFunctionType(jSType46, node60);
        int int64 = functionType63.getMaxArguments();
        functionType42.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType63);
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType42.autoboxesTo();
        com.google.javascript.rhino.Node node67 = functionType42.getSource();
        java.util.Set<java.lang.String> strSet68 = functionType42.getOwnPropertyNames();
        boolean boolean69 = functionType20.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType42);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType70 = functionType42.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inputId31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(inputId52);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(inputId59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNull(jSType66);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.add("");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = com.google.common.collect.ImmutableList.copyOf(strArray9);
        int int12 = strList10.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean14 = strList10.equals((java.lang.Object) 8);
        boolean boolean15 = strList10.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = jSDocInfo16.getReturnType();
        java.lang.String str18 = jSDocInfo16.getOriginalCommentString();
        boolean boolean19 = jSDocInfo16.isExterns();
        jSDocInfo16.addSuppression("");
        boolean boolean22 = jSDocInfo16.isDeprecated();
        boolean boolean23 = strList10.equals((java.lang.Object) boolean22);
        boolean boolean24 = strList3.containsAll((java.util.Collection<java.lang.String>) strList10);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        jSTypeRegistry26.clearTemplateTypeNames();
        boolean boolean29 = jSTypeRegistry26.isForwardDeclaredType("JSDocInfo");
        jSTypeRegistry26.clearNamedTypes();
        jSTypeRegistry26.forwardDeclareType("(unknown)");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = strList10.remove((java.lang.Object) "(unknown)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSTypeExpression17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean9 = node8.isOr();
        boolean boolean10 = node8.isLabel();
        java.lang.String str11 = node8.toStringTree();
        node8.setVarArgs(false);
        double double14 = node8.getDouble();
        boolean boolean15 = node8.isNE();
        node6.addChildrenToBack(node8);
        // The following exception was thrown during execution in test generation
        try {
            node8.setString("true");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER -1.0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "NUMBER -1.0\n" + "'", str11, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        boolean boolean4 = node1.isAssignAdd();
        int int5 = node1.getChildCount();
        boolean boolean6 = node1.hasMoreThanOneChild();
        boolean boolean7 = node1.isReturn();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(54);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.isParameterizedType();
        java.lang.String str23 = null; // flaky: functionType20.toAnnotationString();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        jSTypeRegistry25.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean31 = node30.hasOneChild();
        boolean boolean32 = node30.isObjectLit();
        com.google.javascript.rhino.InputId inputId33 = com.google.javascript.jscomp.NodeUtil.getInputId(node30);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), node30);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean38 = node37.hasOneChild();
        boolean boolean39 = node37.isObjectLit();
        com.google.javascript.rhino.InputId inputId40 = com.google.javascript.jscomp.NodeUtil.getInputId(node37);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1), node37);
        boolean boolean42 = node41.isNE();
        node34.addChildToBack(node41);
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry25.createFunctionType(jSType27, node41);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        jSTypeRegistry46.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean52 = node51.hasOneChild();
        boolean boolean53 = node51.isObjectLit();
        com.google.javascript.rhino.InputId inputId54 = com.google.javascript.jscomp.NodeUtil.getInputId(node51);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), node51);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean59 = node58.hasOneChild();
        boolean boolean60 = node58.isObjectLit();
        com.google.javascript.rhino.InputId inputId61 = com.google.javascript.jscomp.NodeUtil.getInputId(node58);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1), node58);
        boolean boolean63 = node62.isNE();
        node55.addChildToBack(node62);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry46.createFunctionType(jSType48, node62);
        int int66 = functionType65.getMaxArguments();
        functionType44.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType65);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair68 = functionType20.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType65);
        boolean boolean69 = functionType65.isEnumElementType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str70 = functionType65.toDebugHashCodeString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(inputId33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(inputId54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(typePair68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.isParameterizedType();
        java.lang.String str23 = null; // flaky: functionType20.toAnnotationString();
        boolean boolean24 = functionType20.isObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = functionType20.toDebugHashCodeString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        boolean boolean4 = node1.isAssignAdd();
        boolean boolean5 = node1.isQualifiedName();
        com.google.javascript.rhino.Node node6 = node1.removeChildren();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = node6.isDefaultCase();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        node2.setLineno(2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0, node2);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean10 = node9.isOr();
        node9.setLineno(2);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(0, node9);
        java.lang.String str14 = node9.toStringTree();
        int int15 = node9.getChildCount();
        boolean boolean16 = node9.isArrayLit();
        // The following exception was thrown during execution in test generation
        try {
            node2.addChildToBack(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "NUMBER -1.0 2\n" + "'", str14, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = functionType20.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType24 = functionType23.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(functionType23);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.String[] strArray2 = new java.lang.String[] { "unknown", "unknown" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        boolean boolean11 = strList8.add("");
        boolean boolean12 = strSet3.remove((java.lang.Object) strList8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue13.not();
        java.lang.String str15 = ternaryValue13.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue13.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = ternaryValue17.not();
        java.lang.String str19 = ternaryValue17.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = ternaryValue17.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue16.and(ternaryValue20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = ternaryValue16.not();
        boolean boolean23 = strSet3.remove((java.lang.Object) ternaryValue22);
        java.util.Iterator<java.lang.String> strItor24 = strSet3.iterator();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "unknown" + "'", str15, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "unknown" + "'", str19, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strItor24);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node6);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec9 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str10 = assertionFunctionSpec9.getFunctionName();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.isOr();
        node13.setLineno(2);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0, node13);
        com.google.javascript.rhino.Node node18 = assertionFunctionSpec9.getAssertedParam(node13);
        com.google.javascript.rhino.Node node19 = node6.srcref(node18);
        com.google.javascript.rhino.Node node20 = node19.getFirstChild();
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = node19.isEquivalentToTyped(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.isParameterizedType();
        java.lang.String str23 = null; // flaky: functionType20.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet24 = functionType20.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node25 = functionType20.getParametersNode();
        com.google.javascript.rhino.Node node26 = node25.detachFromParent();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.isFor();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("unknown");
        // The following exception was thrown during execution in test generation
        try {
            node26.replaceChild(node28, node31);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet24 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet24.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getBaseType();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        jSTypeRegistry1.identifyNonNullableName("InputId: Function");
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean30 = node29.hasOneChild();
        boolean boolean31 = node29.isObjectLit();
        com.google.javascript.rhino.InputId inputId32 = com.google.javascript.jscomp.NodeUtil.getInputId(node29);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((-1), node29);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean37 = node36.hasOneChild();
        boolean boolean38 = node36.isObjectLit();
        com.google.javascript.rhino.InputId inputId39 = com.google.javascript.jscomp.NodeUtil.getInputId(node36);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((-1), node36);
        boolean boolean41 = node40.isNE();
        node33.addChildToBack(node40);
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry24.createFunctionType(jSType26, node40);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable44 = functionType43.getExtendedInterfaces();
        boolean boolean45 = functionType43.matchesStringContext();
        boolean boolean47 = functionType43.isPropertyTypeDeclared("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType52 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType43, "(unknown)", "Not declared as a type name", 4, (int) (short) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        jSTypeRegistry54.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57);
        jSTypeRegistry58.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean64 = node63.hasOneChild();
        boolean boolean65 = node63.isObjectLit();
        com.google.javascript.rhino.InputId inputId66 = com.google.javascript.jscomp.NodeUtil.getInputId(node63);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node((-1), node63);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean71 = node70.hasOneChild();
        boolean boolean72 = node70.isObjectLit();
        com.google.javascript.rhino.InputId inputId73 = com.google.javascript.jscomp.NodeUtil.getInputId(node70);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((-1), node70);
        boolean boolean75 = node74.isNE();
        node67.addChildToBack(node74);
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry58.createFunctionType(jSType60, node74);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable78 = functionType77.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType79 = functionType77.getPrototype();
        boolean boolean80 = jSTypeRegistry54.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType79);
        com.google.javascript.rhino.jstype.JSType jSType82 = objectType79.findPropertyType("(unknown)");
        com.google.javascript.rhino.jstype.JSType jSType83 = objectType79.autoboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean84 = jSType52.canTestForShallowEqualityWith(jSType83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(inputId32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(inputId39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertNotNull(objectTypeIterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSType52);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(inputId66);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(inputId73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(functionType77);
        org.junit.Assert.assertNotNull(objectTypeIterable78);
        org.junit.Assert.assertNotNull(objectType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertNull(jSType83);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        com.google.javascript.rhino.InputId inputId3 = node1.getInputId();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags4 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags4.setMutatesGlobalState();
        int int6 = sideEffectFlags4.valueOf();
        sideEffectFlags4.setMutatesArguments();
        // The following exception was thrown during execution in test generation
        try {
            node1.setSideEffectFlags(sideEffectFlags4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputId3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry1.getTypesWithProperty("JSDocInfo");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        jSTypeRegistry6.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean12 = node11.hasOneChild();
        boolean boolean13 = node11.isObjectLit();
        com.google.javascript.rhino.InputId inputId14 = com.google.javascript.jscomp.NodeUtil.getInputId(node11);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((-1), node11);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean19 = node18.hasOneChild();
        boolean boolean20 = node18.isObjectLit();
        com.google.javascript.rhino.InputId inputId21 = com.google.javascript.jscomp.NodeUtil.getInputId(node18);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((-1), node18);
        boolean boolean23 = node22.isNE();
        node15.addChildToBack(node22);
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry6.createFunctionType(jSType8, node22);
        int int26 = functionType25.getMaxArguments();
        boolean boolean27 = functionType25.hasImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = functionType25.getOwnImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType25.getReturnType();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.util.Spliterator<java.lang.String> strSpliterator35 = strList33.spliterator();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean39 = node38.isOr();
        boolean boolean40 = node38.isLabel();
        java.lang.String str41 = node38.toStringTree();
        boolean boolean42 = node38.isDebugger();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean45 = node44.hasOneChild();
        boolean boolean46 = node44.isObjectLit();
        com.google.javascript.rhino.InputId inputId47 = com.google.javascript.jscomp.NodeUtil.getInputId(node44);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection48 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node44);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean51 = node50.hasOneChild();
        boolean boolean52 = node50.isAnd();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean55 = node54.hasOneChild();
        boolean boolean56 = node54.isObjectLit();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(0, node38, node44, node50, node54, 12, 0);
        boolean boolean60 = strList33.contains((java.lang.Object) node54);
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType25, node54);
        boolean boolean62 = node54.isDo();
        // The following exception was thrown during execution in test generation
        try {
            node54.setSideEffectFlags(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(inputId21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strSpliterator35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "NUMBER -1.0\n" + "'", str41, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(inputId47);
        org.junit.Assert.assertNotNull(nodeCollection48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        com.google.javascript.rhino.InputId inputId4 = com.google.javascript.jscomp.NodeUtil.getInputId(node1);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean10 = node9.hasOneChild();
        boolean boolean11 = node9.isObjectLit();
        com.google.javascript.rhino.InputId inputId12 = com.google.javascript.jscomp.NodeUtil.getInputId(node9);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), node9);
        node13.setType(43);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean18 = node17.hasOneChild();
        boolean boolean19 = node17.isObjectLit();
        java.lang.String str20 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean23 = node22.isOr();
        boolean boolean24 = node22.isLabel();
        java.lang.String str25 = node22.toStringTree();
        node22.setVarArgs(false);
        double double28 = node22.getDouble();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(3, node13, node17, node22, 2, 49);
        boolean boolean32 = node17.isDefaultCase();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.isOr();
        boolean boolean36 = node34.isLabel();
        boolean boolean37 = node34.isAssignAdd();
        boolean boolean38 = node34.isQualifiedName();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean42 = node41.isOr();
        boolean boolean43 = node41.isLabel();
        java.lang.String str44 = node41.toStringTree();
        boolean boolean45 = node41.isDebugger();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean48 = node47.hasOneChild();
        boolean boolean49 = node47.isObjectLit();
        com.google.javascript.rhino.InputId inputId50 = com.google.javascript.jscomp.NodeUtil.getInputId(node47);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection51 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node47);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean54 = node53.hasOneChild();
        boolean boolean55 = node53.isAnd();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean58 = node57.hasOneChild();
        boolean boolean59 = node57.isObjectLit();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(0, node41, node47, node53, node57, 12, 0);
        boolean boolean63 = node34.isEquivalentToTyped(node53);
        com.google.javascript.jscomp.CodingConvention.Bind bind64 = new com.google.javascript.jscomp.CodingConvention.Bind(node1, node17, node53);
        boolean boolean65 = node17.isThis();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputId4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NUMBER -1.0\n" + "'", str25, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "NUMBER -1.0\n" + "'", str44, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(inputId50);
        org.junit.Assert.assertNotNull(nodeCollection51);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList1 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertNotNull(jSTypeExpressionList1);
        org.junit.Assert.assertNull(jSTypeExpression2);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.isParameterizedType();
        java.lang.String str23 = null; // flaky: functionType20.toAnnotationString();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        jSTypeRegistry25.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean31 = node30.hasOneChild();
        boolean boolean32 = node30.isObjectLit();
        com.google.javascript.rhino.InputId inputId33 = com.google.javascript.jscomp.NodeUtil.getInputId(node30);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), node30);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean38 = node37.hasOneChild();
        boolean boolean39 = node37.isObjectLit();
        com.google.javascript.rhino.InputId inputId40 = com.google.javascript.jscomp.NodeUtil.getInputId(node37);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1), node37);
        boolean boolean42 = node41.isNE();
        node34.addChildToBack(node41);
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry25.createFunctionType(jSType27, node41);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        jSTypeRegistry46.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean52 = node51.hasOneChild();
        boolean boolean53 = node51.isObjectLit();
        com.google.javascript.rhino.InputId inputId54 = com.google.javascript.jscomp.NodeUtil.getInputId(node51);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), node51);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean59 = node58.hasOneChild();
        boolean boolean60 = node58.isObjectLit();
        com.google.javascript.rhino.InputId inputId61 = com.google.javascript.jscomp.NodeUtil.getInputId(node58);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1), node58);
        boolean boolean63 = node62.isNE();
        node55.addChildToBack(node62);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry46.createFunctionType(jSType48, node62);
        int int66 = functionType65.getMaxArguments();
        functionType44.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType65);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair68 = functionType20.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType65);
        com.google.javascript.rhino.jstype.EnumType enumType69 = functionType20.toMaybeEnumType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet70 = enumType69.getPossibleToBooleanOutcomes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(inputId33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(inputId54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(typePair68);
        org.junit.Assert.assertNull(enumType69);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        jSTypeRegistry5.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.hasOneChild();
        boolean boolean12 = node10.isObjectLit();
        com.google.javascript.rhino.InputId inputId13 = com.google.javascript.jscomp.NodeUtil.getInputId(node10);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1), node10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean18 = node17.hasOneChild();
        boolean boolean19 = node17.isObjectLit();
        com.google.javascript.rhino.InputId inputId20 = com.google.javascript.jscomp.NodeUtil.getInputId(node17);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), node17);
        boolean boolean22 = node21.isNE();
        node14.addChildToBack(node21);
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry5.createFunctionType(jSType7, node21);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = functionType24.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType24.getPrototype();
        boolean boolean27 = jSTypeRegistry1.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        jSTypeRegistry29.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node34);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean42 = node41.hasOneChild();
        boolean boolean43 = node41.isObjectLit();
        com.google.javascript.rhino.InputId inputId44 = com.google.javascript.jscomp.NodeUtil.getInputId(node41);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((-1), node41);
        boolean boolean46 = node45.isNE();
        node38.addChildToBack(node45);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry29.createFunctionType(jSType31, node45);
        int int49 = functionType48.getMaxArguments();
        boolean boolean50 = functionType48.isParameterizedType();
        java.lang.String str51 = null; // flaky: functionType48.toAnnotationString();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        jSTypeRegistry53.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean59 = node58.hasOneChild();
        boolean boolean60 = node58.isObjectLit();
        com.google.javascript.rhino.InputId inputId61 = com.google.javascript.jscomp.NodeUtil.getInputId(node58);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1), node58);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean66 = node65.hasOneChild();
        boolean boolean67 = node65.isObjectLit();
        com.google.javascript.rhino.InputId inputId68 = com.google.javascript.jscomp.NodeUtil.getInputId(node65);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((-1), node65);
        boolean boolean70 = node69.isNE();
        node62.addChildToBack(node69);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry53.createFunctionType(jSType55, node69);
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73);
        jSTypeRegistry74.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean80 = node79.hasOneChild();
        boolean boolean81 = node79.isObjectLit();
        com.google.javascript.rhino.InputId inputId82 = com.google.javascript.jscomp.NodeUtil.getInputId(node79);
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node((-1), node79);
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean87 = node86.hasOneChild();
        boolean boolean88 = node86.isObjectLit();
        com.google.javascript.rhino.InputId inputId89 = com.google.javascript.jscomp.NodeUtil.getInputId(node86);
        com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node((-1), node86);
        boolean boolean91 = node90.isNE();
        node83.addChildToBack(node90);
        com.google.javascript.rhino.jstype.FunctionType functionType93 = jSTypeRegistry74.createFunctionType(jSType76, node90);
        int int94 = functionType93.getMaxArguments();
        functionType72.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType93);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair96 = functionType48.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType93);
        com.google.javascript.rhino.jstype.UnionType unionType97 = functionType48.toMaybeUnionType();
        com.google.javascript.rhino.jstype.ObjectType objectType98 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType48);
        jSTypeRegistry1.clearTemplateTypeNames();
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(inputId13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(inputId44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Function" + "'", str51, "Function");
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(inputId68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(inputId82);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(inputId89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(functionType93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
        org.junit.Assert.assertNotNull(typePair96);
        org.junit.Assert.assertNull(unionType97);
        org.junit.Assert.assertNotNull(objectType98);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isObjectLit();
        boolean boolean6 = node3.isFunction();
        boolean boolean7 = node3.isSyntheticBlock();
        boolean boolean8 = node3.isCall();
        boolean boolean9 = node3.isInc();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean12 = node11.isOr();
        boolean boolean13 = node11.isLabel();
        java.lang.String str14 = node11.toStringTree();
        boolean boolean15 = node11.isDebugger();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean18 = node17.hasOneChild();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean21 = node20.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind22 = new com.google.javascript.jscomp.CodingConvention.Bind(node11, node17, node20);
        boolean boolean23 = node11.isSwitch();
        boolean boolean24 = node11.isQuotedString();
        boolean boolean25 = node11.isOr();
        com.google.javascript.rhino.Node node26 = node3.copyInformationFrom(node11);
        node3.setIsSyntheticBlock(true);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 1, node3);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("Not declared as a type name");
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean34 = node33.isOr();
        boolean boolean35 = node33.isLabel();
        java.lang.String str36 = node33.toStringTree();
        boolean boolean37 = node33.isDebugger();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean40 = node39.hasOneChild();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean43 = node42.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind44 = new com.google.javascript.jscomp.CodingConvention.Bind(node33, node39, node42);
        boolean boolean45 = node42.isCatch();
        node42.detachChildren();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(53, node3, node31, node42, 2, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "NUMBER -1.0\n" + "'", str14, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "NUMBER -1.0\n" + "'", str36, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        java.util.Iterator<java.lang.String> strItor6 = strList3.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo7.getReturnType();
        java.lang.String str9 = jSDocInfo7.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility10 = jSDocInfo7.getVisibility();
        boolean boolean11 = strList3.contains((java.lang.Object) visibility10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean19 = node18.hasOneChild();
        boolean boolean20 = node18.isObjectLit();
        com.google.javascript.rhino.InputId inputId21 = com.google.javascript.jscomp.NodeUtil.getInputId(node18);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((-1), node18);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean26 = node25.hasOneChild();
        boolean boolean27 = node25.isObjectLit();
        com.google.javascript.rhino.InputId inputId28 = com.google.javascript.jscomp.NodeUtil.getInputId(node25);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((-1), node25);
        boolean boolean30 = node29.isNE();
        node22.addChildToBack(node29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry13.createFunctionType(jSType15, node29);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable33 = functionType32.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType32.getPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType35 = functionType32.getOwnerFunction();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        jSTypeRegistry37.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean43 = node42.hasOneChild();
        boolean boolean44 = node42.isObjectLit();
        com.google.javascript.rhino.InputId inputId45 = com.google.javascript.jscomp.NodeUtil.getInputId(node42);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((-1), node42);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean50 = node49.hasOneChild();
        boolean boolean51 = node49.isObjectLit();
        com.google.javascript.rhino.InputId inputId52 = com.google.javascript.jscomp.NodeUtil.getInputId(node49);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((-1), node49);
        boolean boolean54 = node53.isNE();
        node46.addChildToBack(node53);
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry37.createFunctionType(jSType39, node53);
        int int57 = functionType56.getMaxArguments();
        boolean boolean58 = functionType56.hasImplementedInterfaces();
        boolean boolean60 = functionType56.removeProperty("true");
        boolean boolean62 = functionType56.isPropertyInExterns("");
        com.google.javascript.rhino.jstype.JSType jSType63 = functionType56.getReturnType();
        java.lang.Iterable iterable64 = functionType56.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray65 = new com.google.javascript.rhino.jstype.ObjectType[] { functionType32, functionType56 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray66 = strList3.toArray(objectTypeArray65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(visibility10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(inputId21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(inputId28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertNotNull(objectTypeIterable33);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNull(functionType35);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(inputId45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(inputId52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertNotNull(iterable64);
        org.junit.Assert.assertNotNull(objectTypeArray65);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        jSTypeRegistry5.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.hasOneChild();
        boolean boolean12 = node10.isObjectLit();
        com.google.javascript.rhino.InputId inputId13 = com.google.javascript.jscomp.NodeUtil.getInputId(node10);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1), node10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean18 = node17.hasOneChild();
        boolean boolean19 = node17.isObjectLit();
        com.google.javascript.rhino.InputId inputId20 = com.google.javascript.jscomp.NodeUtil.getInputId(node17);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), node17);
        boolean boolean22 = node21.isNE();
        node14.addChildToBack(node21);
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry5.createFunctionType(jSType7, node21);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = functionType24.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType24.getPrototype();
        boolean boolean27 = jSTypeRegistry1.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        jSTypeRegistry29.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node34);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean42 = node41.hasOneChild();
        boolean boolean43 = node41.isObjectLit();
        com.google.javascript.rhino.InputId inputId44 = com.google.javascript.jscomp.NodeUtil.getInputId(node41);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((-1), node41);
        boolean boolean46 = node45.isNE();
        node38.addChildToBack(node45);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry29.createFunctionType(jSType31, node45);
        int int49 = functionType48.getMaxArguments();
        boolean boolean50 = functionType48.hasDisplayName();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection51 = jSTypeRegistry1.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType48);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean55 = node54.hasOneChild();
        boolean boolean56 = node54.isObjectLit();
        com.google.javascript.rhino.InputId inputId57 = com.google.javascript.jscomp.NodeUtil.getInputId(node54);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((-1), node54);
        java.lang.String str59 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node58);
        node58.setLineno(15);
        functionType48.setSource(node58);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable63 = functionType48.getExtendedInterfaces();
        java.lang.String str64 = null; // flaky: functionType48.toString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = functionType48.getJSDocInfo();
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(inputId13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(inputId44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(functionTypeCollection51);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(inputId57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(objectTypeIterable63);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Function" + "'", str64, "Function");
        org.junit.Assert.assertNull(jSDocInfo65);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node6);
        boolean boolean8 = node6.isBreak();
        boolean boolean9 = node6.isAssignAdd();
        boolean boolean10 = node6.isOnlyModifiesThisCall();
        boolean boolean11 = node6.isSetterDef();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags12 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags12.setMutatesGlobalState();
        int int14 = sideEffectFlags12.valueOf();
        // The following exception was thrown during execution in test generation
        try {
            node6.setSideEffectFlags(sideEffectFlags12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got ERROR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean9 = node8.isOr();
        boolean boolean10 = node8.isLabel();
        java.lang.String str11 = node8.toStringTree();
        node8.setVarArgs(false);
        double double14 = node8.getDouble();
        boolean boolean15 = node8.isNE();
        node6.addChildrenToBack(node8);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        jSTypeRegistry18.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        jSTypeRegistry22.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean28 = node27.hasOneChild();
        boolean boolean29 = node27.isObjectLit();
        com.google.javascript.rhino.InputId inputId30 = com.google.javascript.jscomp.NodeUtil.getInputId(node27);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), node27);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node34);
        boolean boolean39 = node38.isNE();
        node31.addChildToBack(node38);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry22.createFunctionType(jSType24, node38);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable42 = functionType41.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType43 = functionType41.getPrototype();
        boolean boolean44 = jSTypeRegistry18.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType43);
        com.google.javascript.rhino.jstype.JSType jSType45 = objectType43.getParameterType();
        node6.setJSType(jSType45);
        boolean boolean47 = node6.isWhile();
        boolean boolean48 = node6.isObjectLit();
        boolean boolean49 = node6.isDelProp();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "NUMBER -1.0\n" + "'", str11, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputId30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertNotNull(objectTypeIterable42);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(jSType45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        jSTypeRegistry5.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.hasOneChild();
        boolean boolean12 = node10.isObjectLit();
        com.google.javascript.rhino.InputId inputId13 = com.google.javascript.jscomp.NodeUtil.getInputId(node10);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1), node10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean18 = node17.hasOneChild();
        boolean boolean19 = node17.isObjectLit();
        com.google.javascript.rhino.InputId inputId20 = com.google.javascript.jscomp.NodeUtil.getInputId(node17);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), node17);
        boolean boolean22 = node21.isNE();
        node14.addChildToBack(node21);
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry5.createFunctionType(jSType7, node21);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = functionType24.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType24.getPrototype();
        boolean boolean27 = jSTypeRegistry1.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        jSTypeRegistry29.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node34);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean42 = node41.hasOneChild();
        boolean boolean43 = node41.isObjectLit();
        com.google.javascript.rhino.InputId inputId44 = com.google.javascript.jscomp.NodeUtil.getInputId(node41);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((-1), node41);
        boolean boolean46 = node45.isNE();
        node38.addChildToBack(node45);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry29.createFunctionType(jSType31, node45);
        int int49 = functionType48.getMaxArguments();
        boolean boolean50 = functionType48.isParameterizedType();
        java.lang.String str51 = null; // flaky: functionType48.toAnnotationString();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        jSTypeRegistry53.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean59 = node58.hasOneChild();
        boolean boolean60 = node58.isObjectLit();
        com.google.javascript.rhino.InputId inputId61 = com.google.javascript.jscomp.NodeUtil.getInputId(node58);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1), node58);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean66 = node65.hasOneChild();
        boolean boolean67 = node65.isObjectLit();
        com.google.javascript.rhino.InputId inputId68 = com.google.javascript.jscomp.NodeUtil.getInputId(node65);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((-1), node65);
        boolean boolean70 = node69.isNE();
        node62.addChildToBack(node69);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry53.createFunctionType(jSType55, node69);
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73);
        jSTypeRegistry74.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean80 = node79.hasOneChild();
        boolean boolean81 = node79.isObjectLit();
        com.google.javascript.rhino.InputId inputId82 = com.google.javascript.jscomp.NodeUtil.getInputId(node79);
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node((-1), node79);
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean87 = node86.hasOneChild();
        boolean boolean88 = node86.isObjectLit();
        com.google.javascript.rhino.InputId inputId89 = com.google.javascript.jscomp.NodeUtil.getInputId(node86);
        com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node((-1), node86);
        boolean boolean91 = node90.isNE();
        node83.addChildToBack(node90);
        com.google.javascript.rhino.jstype.FunctionType functionType93 = jSTypeRegistry74.createFunctionType(jSType76, node90);
        int int94 = functionType93.getMaxArguments();
        functionType72.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType93);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair96 = functionType48.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType93);
        com.google.javascript.rhino.jstype.UnionType unionType97 = functionType48.toMaybeUnionType();
        com.google.javascript.rhino.jstype.ObjectType objectType98 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType48);
        com.google.javascript.rhino.jstype.JSType jSType99 = objectType98.getIndexType();
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(inputId13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(inputId44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Function" + "'", str51, "Function");
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(inputId68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(inputId82);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(inputId89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(functionType93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
        org.junit.Assert.assertNotNull(typePair96);
        org.junit.Assert.assertNull(unionType97);
        org.junit.Assert.assertNotNull(objectType98);
        org.junit.Assert.assertNull(jSType99);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        int int1 = jSDocInfo0.getParameterCount();
        boolean boolean2 = jSDocInfo0.isNoCompile();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getImplementedInterfaces();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean10 = node9.hasOneChild();
        boolean boolean11 = node9.isObjectLit();
        com.google.javascript.rhino.InputId inputId12 = com.google.javascript.jscomp.NodeUtil.getInputId(node9);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), node9);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.hasOneChild();
        boolean boolean18 = node16.isObjectLit();
        com.google.javascript.rhino.InputId inputId19 = com.google.javascript.jscomp.NodeUtil.getInputId(node16);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((-1), node16);
        boolean boolean21 = node20.isNE();
        node13.addChildToBack(node20);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry4.createFunctionType(jSType6, node20);
        int int24 = functionType23.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType25 = functionType23.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType26 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType23);
        boolean boolean27 = jSType26.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        jSTypeRegistry29.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node34);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean42 = node41.hasOneChild();
        boolean boolean43 = node41.isObjectLit();
        com.google.javascript.rhino.InputId inputId44 = com.google.javascript.jscomp.NodeUtil.getInputId(node41);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((-1), node41);
        boolean boolean46 = node45.isNE();
        node38.addChildToBack(node45);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry29.createFunctionType(jSType31, node45);
        boolean boolean49 = functionType48.matchesStringContext();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType50 = functionType48.toMaybeEnumElementType();
        java.lang.String str51 = null; // flaky: functionType48.toString();
        com.google.javascript.rhino.jstype.FunctionType functionType52 = functionType48.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = jSType26.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(inputId19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(jSType25);
        org.junit.Assert.assertNotNull(jSType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(inputId44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(enumElementType50);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Function" + "'", str51, "Function");
        org.junit.Assert.assertNull(functionType52);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = com.google.common.collect.ImmutableList.copyOf(strArray8);
        int int11 = strList9.lastIndexOf((java.lang.Object) (short) 100);
        java.lang.Object obj12 = null;
        int int13 = strList9.indexOf(obj12);
        boolean boolean14 = strList9.isEmpty();
        java.util.ListIterator<java.lang.String> strItor15 = strList9.listIterator();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = com.google.common.collect.ImmutableList.copyOf(strArray18);
        java.util.Iterator<java.lang.String> strItor20 = strList19.iterator();
        boolean boolean21 = strList9.containsAll((java.util.Collection<java.lang.String>) strList19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = strList3.retainAll((java.util.Collection<java.lang.String>) strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isObjectLit();
        com.google.javascript.rhino.InputId inputId6 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1), node3);
        node7.setType(43);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean12 = node11.hasOneChild();
        boolean boolean13 = node11.isObjectLit();
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node11);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.isOr();
        boolean boolean18 = node16.isLabel();
        java.lang.String str19 = node16.toStringTree();
        node16.setVarArgs(false);
        double double22 = node16.getDouble();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(3, node7, node11, node16, 2, 49);
        java.lang.String str29 = node16.toString(true, true, false);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList30 = com.google.common.collect.ImmutableList.of((java.io.Serializable) str29);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "NUMBER -1.0\n" + "'", str19, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "NUMBER -1.0" + "'", str29, "NUMBER -1.0");
        org.junit.Assert.assertNotNull(serializableList30);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isCatch();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo4 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = ternaryValue1.not();
        java.lang.String str3 = ternaryValue1.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = ternaryValue1.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = ternaryValue5.not();
        java.lang.String str7 = ternaryValue5.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue5.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue4.and(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue0.or(ternaryValue4);
        java.lang.String str11 = ternaryValue4.toString();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "unknown" + "'", str3, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "unknown" + "'", str7, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "unknown" + "'", str11, "unknown");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.isParameterizedType();
        java.lang.String str23 = null; // flaky: functionType20.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet24 = functionType20.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node25 = functionType20.getParametersNode();
        com.google.javascript.rhino.Node node26 = node25.detachFromParent();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = node25.getExistingIntProp(47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 47");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet24 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet24.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        java.lang.String str4 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = null;
        node1.setStaticSourceFile(staticSourceFile5);
        boolean boolean7 = node1.isFor();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.isOr();
        boolean boolean12 = node10.isLabel();
        java.lang.String str13 = node10.toStringTree();
        boolean boolean14 = node10.isDebugger();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.hasOneChild();
        boolean boolean18 = node16.isObjectLit();
        com.google.javascript.rhino.InputId inputId19 = com.google.javascript.jscomp.NodeUtil.getInputId(node16);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection20 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node16);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean23 = node22.hasOneChild();
        boolean boolean24 = node22.isAnd();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean27 = node26.hasOneChild();
        boolean boolean28 = node26.isObjectLit();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(0, node10, node16, node22, node26, 12, 0);
        com.google.javascript.rhino.Node node32 = node1.useSourceInfoIfMissingFromForTree(node10);
        boolean boolean33 = node32.isDec();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags34 = null;
        // The following exception was thrown during execution in test generation
        try {
            node32.setSideEffectFlags(sideEffectFlags34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "NUMBER -1.0\n" + "'", str13, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(inputId19);
        org.junit.Assert.assertNotNull(nodeCollection20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.Spliterator<java.lang.String> strSpliterator5 = strList3.spliterator();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean9 = node8.isOr();
        boolean boolean10 = node8.isLabel();
        java.lang.String str11 = node8.toStringTree();
        boolean boolean12 = node8.isDebugger();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean15 = node14.hasOneChild();
        boolean boolean16 = node14.isObjectLit();
        com.google.javascript.rhino.InputId inputId17 = com.google.javascript.jscomp.NodeUtil.getInputId(node14);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection18 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node14);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean21 = node20.hasOneChild();
        boolean boolean22 = node20.isAnd();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean25 = node24.hasOneChild();
        boolean boolean26 = node24.isObjectLit();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0, node8, node14, node20, node24, 12, 0);
        boolean boolean30 = strList3.contains((java.lang.Object) node24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = strList3.get(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 31, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strSpliterator5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "NUMBER -1.0\n" + "'", str11, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(inputId17);
        org.junit.Assert.assertNotNull(nodeCollection18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        int int21 = functionType20.getMaxArguments();
        boolean boolean22 = functionType20.isParameterizedType();
        java.lang.String str23 = null; // flaky: functionType20.toAnnotationString();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        jSTypeRegistry25.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean31 = node30.hasOneChild();
        boolean boolean32 = node30.isObjectLit();
        com.google.javascript.rhino.InputId inputId33 = com.google.javascript.jscomp.NodeUtil.getInputId(node30);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), node30);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean38 = node37.hasOneChild();
        boolean boolean39 = node37.isObjectLit();
        com.google.javascript.rhino.InputId inputId40 = com.google.javascript.jscomp.NodeUtil.getInputId(node37);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1), node37);
        boolean boolean42 = node41.isNE();
        node34.addChildToBack(node41);
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry25.createFunctionType(jSType27, node41);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        jSTypeRegistry46.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean52 = node51.hasOneChild();
        boolean boolean53 = node51.isObjectLit();
        com.google.javascript.rhino.InputId inputId54 = com.google.javascript.jscomp.NodeUtil.getInputId(node51);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), node51);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean59 = node58.hasOneChild();
        boolean boolean60 = node58.isObjectLit();
        com.google.javascript.rhino.InputId inputId61 = com.google.javascript.jscomp.NodeUtil.getInputId(node58);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1), node58);
        boolean boolean63 = node62.isNE();
        node55.addChildToBack(node62);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry46.createFunctionType(jSType48, node62);
        int int66 = functionType65.getMaxArguments();
        functionType44.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType65);
        functionType20.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType65);
        boolean boolean69 = functionType65.hasReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70);
        jSTypeRegistry71.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean77 = node76.hasOneChild();
        boolean boolean78 = node76.isObjectLit();
        com.google.javascript.rhino.InputId inputId79 = com.google.javascript.jscomp.NodeUtil.getInputId(node76);
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((-1), node76);
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean84 = node83.hasOneChild();
        boolean boolean85 = node83.isObjectLit();
        com.google.javascript.rhino.InputId inputId86 = com.google.javascript.jscomp.NodeUtil.getInputId(node83);
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node((-1), node83);
        boolean boolean88 = node87.isNE();
        node80.addChildToBack(node87);
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry71.createFunctionType(jSType73, node87);
        int int91 = functionType90.getMaxArguments();
        boolean boolean92 = functionType90.hasImplementedInterfaces();
        boolean boolean93 = functionType65.hasEqualCallType(functionType90);
        java.lang.String str94 = functionType90.getReferenceName();
        boolean boolean95 = functionType90.isCheckedUnknownType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(inputId33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(inputId54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(inputId79);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(inputId86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNull(str94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        jSTypeRegistry1.identifyNonNullableName("InputId: Function");
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean30 = node29.hasOneChild();
        boolean boolean31 = node29.isObjectLit();
        com.google.javascript.rhino.InputId inputId32 = com.google.javascript.jscomp.NodeUtil.getInputId(node29);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((-1), node29);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean37 = node36.hasOneChild();
        boolean boolean38 = node36.isObjectLit();
        com.google.javascript.rhino.InputId inputId39 = com.google.javascript.jscomp.NodeUtil.getInputId(node36);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((-1), node36);
        boolean boolean41 = node40.isNE();
        node33.addChildToBack(node40);
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry24.createFunctionType(jSType26, node40);
        int int44 = functionType43.getMaxArguments();
        boolean boolean45 = functionType43.hasImplementedInterfaces();
        java.util.Set<java.lang.String> strSet46 = functionType43.getOwnPropertyNames();
        boolean boolean47 = functionType43.hasReferenceName();
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType43);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative49 = null;
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray50 = new com.google.javascript.rhino.jstype.JSTypeNative[] { jSTypeNative49 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType51 = jSTypeRegistry1.createUnionType(jSTypeNativeArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(inputId32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(inputId39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeNativeArray50);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean7 = strList3.equals((java.lang.Object) 8);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList3.containsAll((java.util.Collection<java.lang.String>) strList11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = strList3.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "Function");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        boolean boolean18 = node17.isNE();
        node10.addChildToBack(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createFunctionType(jSType3, node17);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        jSTypeRegistry22.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean28 = node27.hasOneChild();
        boolean boolean29 = node27.isObjectLit();
        com.google.javascript.rhino.InputId inputId30 = com.google.javascript.jscomp.NodeUtil.getInputId(node27);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), node27);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node34);
        boolean boolean39 = node38.isNE();
        node31.addChildToBack(node38);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry22.createFunctionType(jSType24, node38);
        int int42 = functionType41.getMaxArguments();
        functionType20.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType41);
        com.google.javascript.rhino.jstype.JSType jSType44 = functionType20.autoboxesTo();
        boolean boolean45 = functionType20.hasCachedValues();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = functionType20.getAllExtendedInterfaces();
        boolean boolean47 = functionType20.hasCachedValues();
        boolean boolean48 = functionType20.isInterface();
        java.lang.Iterable iterable49 = functionType20.getCtorExtendedInterfaces();
        java.lang.Class<?> wildcardClass50 = functionType20.getClass();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputId30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNull(jSType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterable49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        java.lang.String str4 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node1);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node1.children();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator6 = nodeIterable5.spliterator();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(nodeIterable5);
        org.junit.Assert.assertNotNull(nodeSpliterator6);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getModifies();
        int int7 = strSet6.size();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean10 = node9.isOr();
        node9.setLineno(2);
        boolean boolean13 = strSet6.contains((java.lang.Object) 2);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList17 = com.google.common.collect.ImmutableList.copyOf(strArray16);
        java.util.Iterator<java.lang.String> strItor18 = strList17.iterator();
        boolean boolean19 = strSet6.retainAll((java.util.Collection<java.lang.String>) strList17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = strList17.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        java.lang.String str4 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node1);
        boolean boolean5 = node1.isRegExp();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }
}
