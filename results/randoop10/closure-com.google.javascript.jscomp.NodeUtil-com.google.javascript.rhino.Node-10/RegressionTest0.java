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
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(10, node1, node2, node3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.google.javascript.rhino.Node> nodeCollection1 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node0);
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
            com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(0, node1, node2, node3, node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(40, node1, node2, node3, node4, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node4.siblings();
        // The following exception was thrown during execution in test generation
        try {
            node4.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNotNull(nodeIterable5);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node4.siblings();
        boolean boolean6 = node4.isAdd();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNotNull(nodeIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        node4.setLength((int) (byte) 10);
        node4.setType((int) ' ');
        com.google.javascript.rhino.Node node9 = node4.cloneNode();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = node4.getExistingIntProp(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("()");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = node1.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: STRING () is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.lang.String str5 = node4.getQualifiedName();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(48, nodeArray11, (int) (short) 0, (int) ' ');
        java.lang.String str15 = node14.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind16 = new com.google.javascript.jscomp.CodingConvention.Bind(node4, node9, node14);
        com.google.javascript.rhino.Node[] nodeArray18 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(48, nodeArray18, (int) (short) 0, (int) ' ');
        node21.setLength((int) (byte) 10);
        boolean boolean24 = node21.isGetProp();
        node9.addChildrenToBack(node21);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(nodeArray18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.lang.String str5 = node4.getQualifiedName();
        node4.detachChildren();
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.lang.String str5 = node4.getQualifiedName();
        node4.setIsSyntheticBlock(true);
        com.google.javascript.rhino.InputId inputId9 = new com.google.javascript.rhino.InputId("hi!");
        node4.setInputId(inputId9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = node4.toStringTree();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 48");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.lang.String str5 = node4.getQualifiedName();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(48, nodeArray11, (int) (short) 0, (int) ' ');
        java.lang.String str15 = node14.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind16 = new com.google.javascript.jscomp.CodingConvention.Bind(node4, node9, node14);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        node4.setLength((int) (byte) 10);
        boolean boolean7 = node4.isGetProp();
        node4.setSourceEncodedPosition(48);
        boolean boolean10 = node4.isComma();
        // The following exception was thrown during execution in test generation
        try {
            node4.setDouble((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 48");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) ' ', "hi!", 51, 51);
        com.google.javascript.rhino.Node node5 = node4.getLastChild();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = node5.isArrayLit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = null;
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(48, nodeArray2, (int) (short) 0, (int) ' ');
        node5.setLength((int) (byte) 10);
        boolean boolean8 = node5.isGetProp();
        node5.setSourceEncodedPosition(48);
        boolean boolean11 = node5.isComma();
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship13 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node5, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.lang.String str5 = node4.getQualifiedName();
        node4.setIsSyntheticBlock(true);
        com.google.javascript.rhino.InputId inputId9 = new com.google.javascript.rhino.InputId("hi!");
        node4.setInputId(inputId9);
        // The following exception was thrown during execution in test generation
        try {
            node4.setSideEffectFlags(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 48");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.google.javascript.rhino.Node node1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node((int) (short) -1, node1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        node4.setLength((int) (byte) 10);
        boolean boolean7 = node4.isLabelName();
        boolean boolean8 = node4.isString();
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getEnumParameterType();
        boolean boolean2 = jSDocInfo0.isHidden();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = null;
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(48, nodeArray2, (int) (short) 0, (int) ' ');
        java.util.Set<java.lang.String> strSet6 = node5.getDirectives();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(48, nodeArray8, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        node14.setJSType(jSType15);
        com.google.javascript.rhino.Node node17 = node11.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship18 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node5, node11);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = new com.google.javascript.rhino.JSTypeExpression(node5, "Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList31 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList31, jSTypeArray30);
        com.google.javascript.rhino.Node node33 = jSTypeRegistry29.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList31);
        com.google.javascript.rhino.jstype.FunctionType functionType34 = jSTypeRegistry22.createFunctionType(jSType27, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList31);
        boolean boolean35 = functionType34.isNativeObjectType();
        boolean boolean36 = functionType34.hasImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList40 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList40, jSTypeArray39);
        com.google.javascript.rhino.Node node42 = jSTypeRegistry38.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList40);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList47 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList47, jSTypeArray46);
        com.google.javascript.rhino.Node node49 = jSTypeRegistry45.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList47);
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry38.createFunctionType(jSType43, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList47);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType51 = jSTypeExpression20.evaluate((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType34, jSTypeRegistry38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 48");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(functionType50);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType13.getOwnerFunction();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList19 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList19, jSTypeArray18);
        com.google.javascript.rhino.Node node21 = jSTypeRegistry17.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList19);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList26 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList26, jSTypeArray25);
        com.google.javascript.rhino.Node node28 = jSTypeRegistry24.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList26);
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry17.createFunctionType(jSType22, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList26);
        boolean boolean30 = functionType29.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType32 = functionType29.findPropertyType("Unknown class name");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType33 = null;
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(48, nodeArray35, (int) (short) 0, (int) ' ');
        java.util.Set<java.lang.String> strSet39 = node38.getDirectives();
        com.google.javascript.rhino.Node[] nodeArray41 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(48, nodeArray41, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        node47.setJSType(jSType48);
        com.google.javascript.rhino.Node node50 = node44.useSourceInfoIfMissingFrom(node47);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship51 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType33, node38, node44);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression53 = new com.google.javascript.rhino.JSTypeExpression(node38, "Unknown class name");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = functionType14.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType29, node38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(jSType32);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertNull(strSet39);
        org.junit.Assert.assertNotNull(nodeArray41);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType13.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = functionType14.isStringValueType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNull(functionType14);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType6 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(48, nodeArray8, (int) (short) 0, (int) ' ');
        java.util.Set<java.lang.String> strSet12 = node11.getDirectives();
        com.google.javascript.rhino.Node[] nodeArray14 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(48, nodeArray14, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        node20.setJSType(jSType21);
        com.google.javascript.rhino.Node node23 = node17.useSourceInfoIfMissingFrom(node20);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship24 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType6, node11, node17);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = new com.google.javascript.rhino.JSTypeExpression(node11, "Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList31 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList31, jSTypeArray30);
        com.google.javascript.rhino.Node node33 = jSTypeRegistry29.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList31);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList38 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList38, jSTypeArray37);
        com.google.javascript.rhino.Node node40 = jSTypeRegistry36.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList38);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry29.createFunctionType(jSType34, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList38);
        boolean boolean42 = functionType41.isNativeObjectType();
        boolean boolean43 = functionType41.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType41.findPropertyType("unknown");
        com.google.javascript.rhino.jstype.EnumElementType enumElementType46 = functionType41.toMaybeEnumElementType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType47 = jSTypeRegistry1.createFromTypeNodes(node11, "Named type with empty name component", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 48");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNotNull(nodeArray14);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(jSType45);
        org.junit.Assert.assertNull(enumElementType46);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType13.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType17 = functionType13.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType18 = objectType17.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList22 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList22, jSTypeArray21);
        com.google.javascript.rhino.Node node24 = jSTypeRegistry20.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList22);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList29 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList29, jSTypeArray28);
        com.google.javascript.rhino.Node node31 = jSTypeRegistry27.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry20.createFunctionType(jSType25, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList29);
        boolean boolean33 = functionType32.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType35 = functionType32.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType36 = functionType32.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType37 = objectType36.getImplicitPrototype();
        // The following exception was thrown during execution in test generation
        try {
            objectType18.matchConstraint(objectType36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNull(objectType18);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(jSType35);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNull(objectType37);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        boolean boolean15 = functionType13.hasImplementedInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType16 = functionType13.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList14 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList15 = objList14.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList16 = objList14.asList();
        com.google.javascript.rhino.InputId inputId18 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList25 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList26 = objList25.asList();
        java.lang.Object[] objArray27 = objList26.toArray();
        boolean boolean28 = inputId18.equals((java.lang.Object) objList26);
        com.google.common.collect.ImmutableList<java.lang.Object> objList35 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList36 = objList35.asList();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableCollection<java.lang.Object>> objCollectionList37 = com.google.common.collect.ImmutableList.of((com.google.common.collect.ImmutableCollection<java.lang.Object>) objList14, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList26, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList35);
        int int39 = objList26.indexOf((java.lang.Object) 100.0d);
        java.lang.Object[] objArray40 = objList26.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = objList6.retainAll((java.util.Collection<java.lang.Object>) objList26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objList14);
        org.junit.Assert.assertNotNull(objList15);
        org.junit.Assert.assertNotNull(objList16);
        org.junit.Assert.assertNotNull(objList25);
        org.junit.Assert.assertNotNull(objList26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objList35);
        org.junit.Assert.assertNotNull(objList36);
        org.junit.Assert.assertNotNull(objCollectionList37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[ , 0, 0, 0, 100, -1]");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection17 = jSDocInfo16.getAuthors();
        boolean boolean18 = jSDocInfo16.hasBaseType();
        functionType13.setPropertyJSDocInfo("Unknown class name", jSDocInfo16);
        boolean boolean20 = jSDocInfo16.hasModifies();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility21 = jSDocInfo16.getVisibility();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strCollection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(visibility21);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        boolean boolean35 = functionType27.matchesInt32Context();
        boolean boolean36 = functionType27.isFunctionPrototypeType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType37 = functionType27.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        int int0 = com.google.javascript.rhino.Node.INPUT_ID;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 53 + "'", int0 == 53);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType13.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType17 = functionType13.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType18 = objectType17.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList22 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList22, jSTypeArray21);
        com.google.javascript.rhino.Node node24 = jSTypeRegistry20.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList22);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList29 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList29, jSTypeArray28);
        com.google.javascript.rhino.Node node31 = jSTypeRegistry27.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry20.createFunctionType(jSType25, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList29);
        boolean boolean33 = functionType32.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType35 = functionType32.findPropertyType("Unknown class name");
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = functionType32.getOwnPropertyJSDocInfo("Named type with empty name component");
        boolean boolean38 = objectType17.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType32);
        boolean boolean39 = functionType32.hasCachedValues();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNull(objectType18);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(jSType35);
        org.junit.Assert.assertNull(jSDocInfo37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType13.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType17 = functionType13.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType18 = objectType17.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList22 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList22, jSTypeArray21);
        com.google.javascript.rhino.Node node24 = jSTypeRegistry20.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList22);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList29 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList29, jSTypeArray28);
        com.google.javascript.rhino.Node node31 = jSTypeRegistry27.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry20.createFunctionType(jSType25, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList29);
        boolean boolean33 = functionType32.isNativeObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection36 = jSDocInfo35.getAuthors();
        boolean boolean37 = jSDocInfo35.hasBaseType();
        functionType32.setPropertyJSDocInfo("Unknown class name", jSDocInfo35);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = functionType32.getParentScope();
        boolean boolean40 = functionType32.isNumberValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType.TypePair typePair41 = objectType18.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNull(objectType18);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(strCollection36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        org.junit.Assert.assertNotNull(ternaryValue0);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList14 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList15 = objList14.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList16 = objList14.asList();
        com.google.javascript.rhino.InputId inputId18 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList25 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList26 = objList25.asList();
        java.lang.Object[] objArray27 = objList26.toArray();
        boolean boolean28 = inputId18.equals((java.lang.Object) objList26);
        com.google.common.collect.ImmutableList<java.lang.Object> objList35 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList36 = objList35.asList();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableCollection<java.lang.Object>> objCollectionList37 = com.google.common.collect.ImmutableList.of((com.google.common.collect.ImmutableCollection<java.lang.Object>) objList14, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList26, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList35);
        boolean boolean39 = objList26.equals((java.lang.Object) (byte) 10);
        boolean boolean40 = objList6.containsAll((java.util.Collection<java.lang.Object>) objList26);
        com.google.javascript.rhino.Node[] nodeArray42 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(48, nodeArray42, (int) (short) 0, (int) ' ');
        int int46 = objList26.indexOf((java.lang.Object) 48);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        node49.setJSType(jSType50);
        boolean boolean52 = node49.isStringKey();
        boolean boolean53 = node49.isGetProp();
        boolean boolean54 = node49.isLabelName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = objList26.remove((java.lang.Object) node49);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objList14);
        org.junit.Assert.assertNotNull(objList15);
        org.junit.Assert.assertNotNull(objList16);
        org.junit.Assert.assertNotNull(objList25);
        org.junit.Assert.assertNotNull(objList26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objList35);
        org.junit.Assert.assertNotNull(objList36);
        org.junit.Assert.assertNotNull(objCollectionList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(nodeArray42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        node7.setJSType(jSType8);
        com.google.javascript.rhino.Node node10 = node4.useSourceInfoIfMissingFrom(node7);
        node4.putBooleanProp(52, true);
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(48, nodeArray15, (int) (short) 0, (int) ' ');
        node18.setLength((int) (byte) 10);
        boolean boolean21 = node18.isFor();
        boolean boolean22 = node4.isEquivalentTo(node18);
        boolean boolean23 = node18.isFunction();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection24 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node18);
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator25 = nodeCollection24.spliterator();
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeCollection24);
        org.junit.Assert.assertNotNull(nodeSpliterator25);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList8 = objList6.asList();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.Object> objList11 = objList6.subList(4, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: end index (48) must not be greater than size (6)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        boolean boolean5 = node4.isRegExp();
        com.google.javascript.rhino.Node[] nodeArray7 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(48, nodeArray7, (int) (short) 0, (int) ' ');
        node10.setLength((int) (byte) 10);
        node10.setType((int) ' ');
        com.google.javascript.rhino.Node node15 = node10.cloneNode();
        com.google.javascript.rhino.Node node16 = node4.useSourceInfoIfMissingFrom(node15);
        boolean boolean17 = node4.hasOneChild();
        // The following exception was thrown during execution in test generation
        try {
            node4.setDouble((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 48");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeArray7);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) ' ', "");
        com.google.javascript.rhino.Node node3 = node2.getLastSibling();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) ' ', "");
        com.google.javascript.rhino.Node node7 = node6.getLastSibling();
        com.google.javascript.rhino.Node node8 = node2.useSourceInfoIfMissingFrom(node7);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 4, (int) '4', 47);
        com.google.javascript.rhino.Node node13 = node12.cloneTree();
        boolean boolean14 = node12.isWhile();
        com.google.javascript.rhino.Node[] nodeArray16 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(48, nodeArray16, (int) (short) 0, (int) ' ');
        java.lang.String str20 = node19.getQualifiedName();
        boolean boolean21 = node19.isIf();
        boolean boolean22 = node19.isFromExterns();
        // The following exception was thrown during execution in test generation
        try {
            node2.addChildrenAfter(node12, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeArray16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList14 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList15 = objList14.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList16 = objList14.asList();
        com.google.javascript.rhino.InputId inputId18 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList25 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList26 = objList25.asList();
        java.lang.Object[] objArray27 = objList26.toArray();
        boolean boolean28 = inputId18.equals((java.lang.Object) objList26);
        com.google.common.collect.ImmutableList<java.lang.Object> objList35 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList36 = objList35.asList();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableCollection<java.lang.Object>> objCollectionList37 = com.google.common.collect.ImmutableList.of((com.google.common.collect.ImmutableCollection<java.lang.Object>) objList14, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList26, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList35);
        boolean boolean39 = objList26.equals((java.lang.Object) (byte) 10);
        boolean boolean40 = objList6.containsAll((java.util.Collection<java.lang.Object>) objList26);
        // The following exception was thrown during execution in test generation
        try {
            objList6.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objList14);
        org.junit.Assert.assertNotNull(objList15);
        org.junit.Assert.assertNotNull(objList16);
        org.junit.Assert.assertNotNull(objList25);
        org.junit.Assert.assertNotNull(objList26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objList35);
        org.junit.Assert.assertNotNull(objList36);
        org.junit.Assert.assertNotNull(objCollectionList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList14 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList15 = objList14.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList16 = objList14.asList();
        com.google.javascript.rhino.InputId inputId18 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList25 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList26 = objList25.asList();
        java.lang.Object[] objArray27 = objList26.toArray();
        boolean boolean28 = inputId18.equals((java.lang.Object) objList26);
        com.google.common.collect.ImmutableList<java.lang.Object> objList35 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList36 = objList35.asList();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableCollection<java.lang.Object>> objCollectionList37 = com.google.common.collect.ImmutableList.of((com.google.common.collect.ImmutableCollection<java.lang.Object>) objList14, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList26, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList35);
        boolean boolean39 = objList26.equals((java.lang.Object) (byte) 10);
        boolean boolean40 = objList6.containsAll((java.util.Collection<java.lang.Object>) objList26);
        java.lang.Object[] objArray41 = objList26.toArray();
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objList14);
        org.junit.Assert.assertNotNull(objList15);
        org.junit.Assert.assertNotNull(objList16);
        org.junit.Assert.assertNotNull(objList25);
        org.junit.Assert.assertNotNull(objList26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objList35);
        org.junit.Assert.assertNotNull(objList36);
        org.junit.Assert.assertNotNull(objCollectionList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[ , 0, 0, 0, 100, -1]");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        java.lang.Object[] objArray8 = objList7.toArray();
        com.google.common.collect.UnmodifiableIterator<java.lang.Object> objItor9 = objList7.iterator();
        com.google.common.collect.ImmutableList<java.lang.Object> objList10 = objList7.asList();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        node15.setJSType(jSType16);
        int int18 = node15.getSideEffectFlags();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(48, node15, 10, 0);
        node15.setQuotedString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = objList10.set(15, (java.lang.Object) node15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertNotNull(objList10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType13.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType17 = functionType13.getTypeOfThis();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList22 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList22, jSTypeArray21);
        com.google.javascript.rhino.Node node24 = jSTypeRegistry20.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList22);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList29 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList29, jSTypeArray28);
        com.google.javascript.rhino.Node node31 = jSTypeRegistry27.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry20.createFunctionType(jSType25, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList29);
        com.google.javascript.rhino.jstype.FunctionType functionType33 = functionType32.getOwnerFunction();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec35 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("unknown");
        com.google.javascript.rhino.Node[] nodeArray37 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(48, nodeArray37, (int) (short) 0, (int) ' ');
        node40.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(48, nodeArray44, (int) (short) 0, (int) ' ');
        java.lang.String str48 = node47.getQualifiedName();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray54 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(48, nodeArray54, (int) (short) 0, (int) ' ');
        java.lang.String str58 = node57.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind59 = new com.google.javascript.jscomp.CodingConvention.Bind(node47, node52, node57);
        com.google.javascript.rhino.Node node60 = node40.useSourceInfoFromForTree(node52);
        com.google.javascript.rhino.Node node61 = assertionFunctionSpec35.getAssertedParam(node60);
        boolean boolean62 = objectType17.defineDeclaredProperty("", (com.google.javascript.rhino.jstype.JSType) functionType32, node60);
        boolean boolean63 = functionType32.isEmptyType();
        com.google.javascript.rhino.jstype.JSType jSType64 = functionType32.autoboxesTo();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertNull(functionType33);
        org.junit.Assert.assertNotNull(nodeArray37);
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeArray54);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(jSType64);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = functionType27.testForEquality(jSType35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList8 = objList6.asList();
        com.google.javascript.rhino.InputId inputId10 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList17 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList18 = objList17.asList();
        java.lang.Object[] objArray19 = objList18.toArray();
        boolean boolean20 = inputId10.equals((java.lang.Object) objList18);
        com.google.common.collect.ImmutableList<java.lang.Object> objList27 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList28 = objList27.asList();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableCollection<java.lang.Object>> objCollectionList29 = com.google.common.collect.ImmutableList.of((com.google.common.collect.ImmutableCollection<java.lang.Object>) objList6, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList18, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList27);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.Object> objItor31 = objList6.listIterator((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (52) must not be greater than size (6)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objList8);
        org.junit.Assert.assertNotNull(objList17);
        org.junit.Assert.assertNotNull(objList18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objList27);
        org.junit.Assert.assertNotNull(objList28);
        org.junit.Assert.assertNotNull(objCollectionList29);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        java.lang.Object[] objArray8 = objList7.toArray();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 4, (int) '4', 47);
        com.google.javascript.rhino.Node node13 = node12.getLastSibling();
        boolean boolean14 = node13.isGetElem();
        double double15 = node13.getDouble();
        boolean boolean16 = objList7.equals((java.lang.Object) node13);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = node13.getExistingIntProp(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        node3.setJSType(jSType4);
        int int6 = node3.getSideEffectFlags();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(16, node3, 52, 52);
        boolean boolean10 = node9.isAssignAdd();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.util.Set<java.lang.String> strSet5 = node4.getDirectives();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        boolean boolean10 = node9.isCall();
        boolean boolean11 = node4.isEquivalentTo(node9);
        java.lang.String str12 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        node15.setJSType(jSType16);
        boolean boolean18 = node15.isStringKey();
        boolean boolean19 = node15.isGetProp();
        int int20 = node4.getIndexOfChild(node15);
        com.google.javascript.rhino.Node[] nodeArray22 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(48, nodeArray22, (int) (short) 0, (int) ' ');
        node25.setLength((int) (byte) 10);
        boolean boolean28 = node25.isBreak();
        com.google.javascript.rhino.Node node29 = node25.getLastSibling();
        com.google.javascript.rhino.Node node30 = node4.clonePropsFrom(node25);
        com.google.javascript.rhino.Node node31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node32 = node30.srcref(node31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        java.lang.Object[] objArray8 = objList7.toArray();
        com.google.common.collect.ImmutableList<java.lang.Object> objList15 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList16 = objList15.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList23 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList24 = objList23.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList25 = objList23.asList();
        com.google.javascript.rhino.InputId inputId27 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList34 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList35 = objList34.asList();
        java.lang.Object[] objArray36 = objList35.toArray();
        boolean boolean37 = inputId27.equals((java.lang.Object) objList35);
        com.google.common.collect.ImmutableList<java.lang.Object> objList44 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList45 = objList44.asList();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableCollection<java.lang.Object>> objCollectionList46 = com.google.common.collect.ImmutableList.of((com.google.common.collect.ImmutableCollection<java.lang.Object>) objList23, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList35, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList44);
        boolean boolean48 = objList35.equals((java.lang.Object) (byte) 10);
        boolean boolean49 = objList15.containsAll((java.util.Collection<java.lang.Object>) objList35);
        com.google.javascript.rhino.Node[] nodeArray51 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(48, nodeArray51, (int) (short) 0, (int) ' ');
        int int55 = objList35.indexOf((java.lang.Object) 48);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = objList7.retainAll((java.util.Collection<java.lang.Object>) objList35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertNotNull(objList15);
        org.junit.Assert.assertNotNull(objList16);
        org.junit.Assert.assertNotNull(objList23);
        org.junit.Assert.assertNotNull(objList24);
        org.junit.Assert.assertNotNull(objList25);
        org.junit.Assert.assertNotNull(objList34);
        org.junit.Assert.assertNotNull(objList35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objList44);
        org.junit.Assert.assertNotNull(objList45);
        org.junit.Assert.assertNotNull(objCollectionList46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(nodeArray51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable36 = jSTypeRegistry1.getEachReferenceTypeWithProperty("");
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        boolean boolean41 = node40.isString();
        boolean boolean42 = node40.isCatch();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList47 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList47, jSTypeArray46);
        com.google.javascript.rhino.Node node49 = jSTypeRegistry45.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList47);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList54 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList54, jSTypeArray53);
        com.google.javascript.rhino.Node node56 = jSTypeRegistry52.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList54);
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry45.createFunctionType(jSType50, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList54);
        boolean boolean58 = functionType57.isNativeObjectType();
        boolean boolean59 = functionType57.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType61 = functionType57.findPropertyType("unknown");
        com.google.javascript.rhino.jstype.EnumElementType enumElementType62 = functionType57.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.JSType jSType63 = functionType57.unboxesTo();
        java.lang.String str64 = functionType57.toDebugHashCodeString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry1.createFromTypeNodes(node40, "()", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected node in type expression: NUMBER 100.0 52");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(objectTypeIterable36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(jSType61);
        org.junit.Assert.assertNull(enumElementType62);
        org.junit.Assert.assertNull(jSType63);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "function (): {2004974790}" + "'", str64, "function (): {2004974790}");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.lang.String str5 = node4.getQualifiedName();
        node4.setIsSyntheticBlock(true);
        boolean boolean8 = node4.hasOneChild();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(51);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            node4.addChildBefore(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        boolean boolean15 = functionType13.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType17 = functionType13.findPropertyType("unknown");
        com.google.javascript.rhino.jstype.EnumElementType enumElementType18 = functionType13.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.JSType jSType19 = functionType13.unboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = jSType19.isNumberObjectType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(enumElementType18);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        boolean boolean4 = node3.isString();
        com.google.javascript.rhino.Node node5 = node3.getLastSibling();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node3.children();
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str1 = stringPosition0.getItem();
        int int2 = stringPosition0.getPositionOnStartLine();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(44, (int) (short) 100, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 44?end-line: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        int int0 = com.google.javascript.rhino.Node.SYNTHETIC_BLOCK_PROP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 38 + "'", int0 == 38);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.google.javascript.rhino.Node[] nodeArray3 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(48, nodeArray3, (int) (short) 0, (int) ' ');
        boolean boolean7 = node6.isRegExp();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = null;
        node6.setJSDocInfo(jSDocInfo8);
        int int10 = node6.getSideEffectFlags();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 100, node6);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node[] nodeArray14 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(48, nodeArray14, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        node20.setJSType(jSType21);
        com.google.javascript.rhino.Node node23 = node17.useSourceInfoIfMissingFrom(node20);
        node17.putBooleanProp(52, true);
        boolean boolean27 = node17.isCase();
        boolean boolean28 = node17.isGetterDef();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(48, node11, node12, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeArray14);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList14 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList15 = objList14.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList16 = objList14.asList();
        com.google.javascript.rhino.InputId inputId18 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList25 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList26 = objList25.asList();
        java.lang.Object[] objArray27 = objList26.toArray();
        boolean boolean28 = inputId18.equals((java.lang.Object) objList26);
        com.google.common.collect.ImmutableList<java.lang.Object> objList35 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList36 = objList35.asList();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableCollection<java.lang.Object>> objCollectionList37 = com.google.common.collect.ImmutableList.of((com.google.common.collect.ImmutableCollection<java.lang.Object>) objList14, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList26, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList35);
        boolean boolean39 = objList26.equals((java.lang.Object) (byte) 10);
        boolean boolean40 = objList6.containsAll((java.util.Collection<java.lang.Object>) objList26);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet41 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet42 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet43 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet44 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet46 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet47 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList48 = com.google.common.collect.ImmutableList.of(booleanLiteralSet41, booleanLiteralSet42, booleanLiteralSet43, booleanLiteralSet44, booleanLiteralSet46, booleanLiteralSet47);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet49 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet50 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet51 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet52 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet54 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet55 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList56 = com.google.common.collect.ImmutableList.of(booleanLiteralSet49, booleanLiteralSet50, booleanLiteralSet51, booleanLiteralSet52, booleanLiteralSet54, booleanLiteralSet55);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet57 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet58 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet59 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet60 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet62 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet63 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList64 = com.google.common.collect.ImmutableList.of(booleanLiteralSet57, booleanLiteralSet58, booleanLiteralSet59, booleanLiteralSet60, booleanLiteralSet62, booleanLiteralSet63);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet65 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet66 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList67 = com.google.common.collect.ImmutableList.of(booleanLiteralSet42, booleanLiteralSet49, booleanLiteralSet57, booleanLiteralSet65, booleanLiteralSet66);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet68 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet69 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet70 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet71 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet73 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet74 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList75 = com.google.common.collect.ImmutableList.of(booleanLiteralSet68, booleanLiteralSet69, booleanLiteralSet70, booleanLiteralSet71, booleanLiteralSet73, booleanLiteralSet74);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet76 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet77 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet78 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet79 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet81 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet82 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList83 = com.google.common.collect.ImmutableList.of(booleanLiteralSet76, booleanLiteralSet77, booleanLiteralSet78, booleanLiteralSet79, booleanLiteralSet81, booleanLiteralSet82);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet84 = booleanLiteralSet74.union(booleanLiteralSet79);
        com.google.javascript.rhino.jstype.BooleanLiteralSet[] booleanLiteralSetArray85 = new com.google.javascript.rhino.jstype.BooleanLiteralSet[] { booleanLiteralSet65, booleanLiteralSet79 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.BooleanLiteralSet[] booleanLiteralSetArray86 = objList26.toArray(booleanLiteralSetArray85);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objList14);
        org.junit.Assert.assertNotNull(objList15);
        org.junit.Assert.assertNotNull(objList16);
        org.junit.Assert.assertNotNull(objList25);
        org.junit.Assert.assertNotNull(objList26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objList35);
        org.junit.Assert.assertNotNull(objList36);
        org.junit.Assert.assertNotNull(objCollectionList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet41 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet41.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet42 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet42.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet43 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet43.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet44 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet44.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet46 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet46.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet47 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet47.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertNotNull(booleanLiteralSetList48);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet49 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet49.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet50 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet50.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet51 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet51.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet52 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet52.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet54 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet54.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet55 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet55.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertNotNull(booleanLiteralSetList56);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet57 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet57.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet58 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet58.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet59 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet59.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet60 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet60.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet62 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet62.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet63 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet63.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertNotNull(booleanLiteralSetList64);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet65 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet65.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet66 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet66.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(booleanLiteralSetList67);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet68 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet68.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet69 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet69.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet70 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet70.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet71 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet71.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet73 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet73.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet74 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet74.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertNotNull(booleanLiteralSetList75);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet76 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet76.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet77 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet77.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet78 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet78.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet79 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet79.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet81 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet81.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet82 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet82.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertNotNull(booleanLiteralSetList83);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet84 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet84.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertNotNull(booleanLiteralSetArray85);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection1 = jSDocInfo0.getAuthors();
        boolean boolean2 = jSDocInfo0.hasBaseType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getTypedefType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getBaseType();
        java.lang.String str5 = jSDocInfo0.getVersion();
        org.junit.Assert.assertNull(strCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        node7.setJSType(jSType8);
        com.google.javascript.rhino.Node node10 = node4.useSourceInfoIfMissingFrom(node7);
        node4.putBooleanProp(52, true);
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(48, nodeArray15, (int) (short) 0, (int) ' ');
        node18.setLength((int) (byte) 10);
        boolean boolean21 = node18.isFor();
        boolean boolean22 = node4.isEquivalentTo(node18);
        boolean boolean23 = node18.isFunction();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection24 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node18);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = node18.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeCollection24);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        int int0 = com.google.javascript.rhino.Node.SLASH_V;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 54 + "'", int0 == 54);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        java.lang.Object[] objArray8 = objList7.toArray();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 4, (int) '4', 47);
        com.google.javascript.rhino.Node node13 = node12.getLastSibling();
        boolean boolean14 = node13.isGetElem();
        double double15 = node13.getDouble();
        boolean boolean16 = objList7.equals((java.lang.Object) node13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Object> objList19 = objList7.subList(54, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (54) must not be greater than size (6)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        int int0 = com.google.javascript.rhino.Node.JSDOC_INFO_PROP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 29 + "'", int0 == 29);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.lang.String str5 = node4.getQualifiedName();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(48, nodeArray11, (int) (short) 0, (int) ' ');
        java.lang.String str15 = node14.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind16 = new com.google.javascript.jscomp.CodingConvention.Bind(node4, node9, node14);
        node4.putBooleanProp(10, true);
        java.util.Set<java.lang.String> strSet20 = node4.getDirectives();
        // The following exception was thrown during execution in test generation
        try {
            node4.setString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 48");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strSet20);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = null;
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(48, nodeArray2, (int) (short) 0, (int) ' ');
        java.util.Set<java.lang.String> strSet6 = node5.getDirectives();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(48, nodeArray8, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        node14.setJSType(jSType15);
        com.google.javascript.rhino.Node node17 = node11.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship18 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node5, node11);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = new com.google.javascript.rhino.JSTypeExpression(node5, "Unknown class name");
        boolean boolean21 = jSTypeExpression20.isVarArgs();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.Node node27 = jSTypeRegistry23.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList32 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList32, jSTypeArray31);
        com.google.javascript.rhino.Node node34 = jSTypeRegistry30.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList32);
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry23.createFunctionType(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList32);
        boolean boolean36 = functionType35.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType38 = functionType35.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType39 = functionType35.getTypeOfThis();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList44 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList44, jSTypeArray43);
        com.google.javascript.rhino.Node node46 = jSTypeRegistry42.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList44);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList51 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList51, jSTypeArray50);
        com.google.javascript.rhino.Node node53 = jSTypeRegistry49.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList51);
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry42.createFunctionType(jSType47, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList51);
        com.google.javascript.rhino.jstype.FunctionType functionType55 = functionType54.getOwnerFunction();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec57 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("unknown");
        com.google.javascript.rhino.Node[] nodeArray59 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(48, nodeArray59, (int) (short) 0, (int) ' ');
        node62.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray66 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node(48, nodeArray66, (int) (short) 0, (int) ' ');
        java.lang.String str70 = node69.getQualifiedName();
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray76 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node(48, nodeArray76, (int) (short) 0, (int) ' ');
        java.lang.String str80 = node79.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind81 = new com.google.javascript.jscomp.CodingConvention.Bind(node69, node74, node79);
        com.google.javascript.rhino.Node node82 = node62.useSourceInfoFromForTree(node74);
        com.google.javascript.rhino.Node node83 = assertionFunctionSpec57.getAssertedParam(node82);
        boolean boolean84 = objectType39.defineDeclaredProperty("", (com.google.javascript.rhino.jstype.JSType) functionType54, node82);
        boolean boolean85 = objectType39.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter86 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry87 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter86);
        jSTypeRegistry87.setLastGeneration(true);
        com.google.javascript.rhino.jstype.ObjectType objectType90 = jSTypeRegistry87.createAnonymousObjectType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType91 = jSTypeExpression20.evaluate((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType39, jSTypeRegistry87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 48");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(jSTypeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertNull(functionType55);
        org.junit.Assert.assertNotNull(nodeArray59);
        org.junit.Assert.assertNotNull(nodeArray66);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(nodeArray76);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(objectType90);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        boolean boolean15 = functionType13.hasImplementedInterfaces();
        boolean boolean16 = functionType13.isGlobalThisType();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList20 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList20, jSTypeArray19);
        com.google.javascript.rhino.Node node22 = jSTypeRegistry18.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList20);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList27 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList27, jSTypeArray26);
        com.google.javascript.rhino.Node node29 = jSTypeRegistry25.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList27);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry18.createFunctionType(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList27);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray33 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList34 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList34, jSTypeArray33);
        com.google.javascript.rhino.Node node36 = jSTypeRegistry32.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList34);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList41 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList41, jSTypeArray40);
        com.google.javascript.rhino.Node node43 = jSTypeRegistry39.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList41);
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry32.createFunctionType(jSType37, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList41);
        boolean boolean45 = functionType44.isNativeObjectType();
        boolean boolean46 = functionType44.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType51 = jSTypeRegistry18.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType44, "", "()", 51, 47);
        boolean boolean52 = functionType13.canAssignTo(jSType51);
        boolean boolean53 = jSType51.isNoType();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertNotNull(jSTypeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        node4.setLength((int) (byte) 10);
        node4.setType((int) ' ');
        com.google.javascript.rhino.Node node9 = node4.cloneNode();
        boolean boolean10 = node9.isGetElem();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList14 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList14, jSTypeArray13);
        com.google.javascript.rhino.Node node16 = jSTypeRegistry12.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList14);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList21 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList21, jSTypeArray20);
        com.google.javascript.rhino.Node node23 = jSTypeRegistry19.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList21);
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry12.createFunctionType(jSType17, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList21);
        boolean boolean25 = functionType24.isNativeObjectType();
        boolean boolean26 = functionType24.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType24.findPropertyType("unknown");
        com.google.javascript.rhino.Node[] nodeArray30 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(48, nodeArray30, (int) (short) 0, (int) ' ');
        java.lang.String str34 = node33.getQualifiedName();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray40 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(48, nodeArray40, (int) (short) 0, (int) ' ');
        java.lang.String str44 = node43.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind45 = new com.google.javascript.jscomp.CodingConvention.Bind(node33, node38, node43);
        boolean boolean46 = node33.isRegExp();
        functionType24.setSource(node33);
        com.google.common.collect.ImmutableList<java.lang.Object> objList54 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList55 = objList54.asList();
        java.lang.Object[] objArray56 = objList55.toArray();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 4, (int) '4', 47);
        com.google.javascript.rhino.Node node61 = node60.getLastSibling();
        boolean boolean62 = node61.isGetElem();
        double double63 = node61.getDouble();
        boolean boolean64 = objList55.equals((java.lang.Object) node61);
        // The following exception was thrown during execution in test generation
        try {
            node9.addChildAfter(node33, node61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(jSType28);
        org.junit.Assert.assertNotNull(nodeArray30);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeArray40);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objList54);
        org.junit.Assert.assertNotNull(objList55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 4.0d + "'", double63 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType13.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType17 = functionType13.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType18 = objectType17.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList22 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList22, jSTypeArray21);
        com.google.javascript.rhino.Node node24 = jSTypeRegistry20.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList22);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList29 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList29, jSTypeArray28);
        com.google.javascript.rhino.Node node31 = jSTypeRegistry27.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry20.createFunctionType(jSType25, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList29);
        boolean boolean33 = functionType32.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType35 = functionType32.findPropertyType("Unknown class name");
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = functionType32.getOwnPropertyJSDocInfo("Named type with empty name component");
        boolean boolean38 = objectType17.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType32);
        boolean boolean39 = objectType17.matchesStringContext();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNull(objectType18);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(jSType35);
        org.junit.Assert.assertNull(jSDocInfo37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        node4.setLength((int) (byte) 10);
        node4.setType((int) ' ');
        com.google.javascript.rhino.Node node9 = node4.cloneNode();
        // The following exception was thrown during execution in test generation
        try {
            node4.setSideEffectFlags(38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got TYPEOF");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) ' ', "");
        com.google.javascript.rhino.Node node4 = node3.getLastSibling();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) ' ', "");
        com.google.javascript.rhino.Node node8 = node7.getLastSibling();
        com.google.javascript.rhino.Node node9 = node3.useSourceInfoIfMissingFrom(node8);
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(48, nodeArray11, (int) (short) 0, (int) ' ');
        node14.setLength((int) (byte) 10);
        boolean boolean17 = node14.isBreak();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(45, node9, node14);
        // The following exception was thrown during execution in test generation
        try {
            node14.setSideEffectFlags((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 48");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(48, nodeArray2, (int) (short) 0, (int) ' ');
        node5.setLength((int) (byte) 10);
        boolean boolean8 = node5.isBreak();
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(48, nodeArray10, (int) (short) 0, (int) ' ');
        node13.setLength((int) (byte) 10);
        boolean boolean16 = node13.isFor();
        com.google.javascript.rhino.Node[] nodeArray18 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(48, nodeArray18, (int) (short) 0, (int) ' ');
        node21.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray25 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(48, nodeArray25, (int) (short) 0, (int) ' ');
        java.lang.String str29 = node28.getQualifiedName();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(48, nodeArray35, (int) (short) 0, (int) ' ');
        java.lang.String str39 = node38.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind40 = new com.google.javascript.jscomp.CodingConvention.Bind(node28, node33, node38);
        com.google.javascript.rhino.Node node41 = node21.useSourceInfoFromForTree(node33);
        node13.addChildrenToBack(node21);
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(48, nodeArray44, (int) (short) 0, (int) ' ');
        node47.setLength((int) (byte) 10);
        node47.setType((int) ' ');
        com.google.javascript.rhino.InputId inputId53 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList60 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList61 = objList60.asList();
        java.lang.Object[] objArray62 = objList61.toArray();
        boolean boolean63 = inputId53.equals((java.lang.Object) objList61);
        node47.setInputId(inputId53);
        com.google.javascript.rhino.Node node65 = node13.copyInformationFromForTree(node47);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType66 = null;
        com.google.javascript.rhino.Node[] nodeArray68 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(48, nodeArray68, (int) (short) 0, (int) ' ');
        java.util.Set<java.lang.String> strSet72 = node71.getDirectives();
        com.google.javascript.rhino.Node[] nodeArray74 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(48, nodeArray74, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType81 = null;
        node80.setJSType(jSType81);
        com.google.javascript.rhino.Node node83 = node77.useSourceInfoIfMissingFrom(node80);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship84 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType66, node71, node77);
        com.google.javascript.rhino.Node node85 = node47.srcrefTree(node77);
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(52, node5, node47);
        boolean boolean87 = node86.isBreak();
        boolean boolean88 = node86.isExprResult();
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeArray18);
        org.junit.Assert.assertNotNull(nodeArray25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNotNull(objList60);
        org.junit.Assert.assertNotNull(objList61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(nodeArray68);
        org.junit.Assert.assertNull(strSet72);
        org.junit.Assert.assertNotNull(nodeArray74);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getEnumParameterType();
        boolean boolean2 = jSDocInfo0.isOverride();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        boolean boolean4 = jSDocInfo0.isOverride();
        boolean boolean5 = jSDocInfo0.hasThisType();
        boolean boolean6 = jSDocInfo0.hasBaseType();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        boolean boolean15 = functionType13.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType17 = functionType13.findPropertyType("unknown");
        com.google.javascript.rhino.Node[] nodeArray19 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(48, nodeArray19, (int) (short) 0, (int) ' ');
        java.lang.String str23 = node22.getQualifiedName();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(48, nodeArray29, (int) (short) 0, (int) ' ');
        java.lang.String str33 = node32.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind34 = new com.google.javascript.jscomp.CodingConvention.Bind(node22, node27, node32);
        boolean boolean35 = node22.isRegExp();
        functionType13.setSource(node22);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(48, nodeArray38, (int) (short) 0, (int) ' ');
        java.lang.String str42 = node41.getQualifiedName();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray48 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(48, nodeArray48, (int) (short) 0, (int) ' ');
        java.lang.String str52 = node51.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind53 = new com.google.javascript.jscomp.CodingConvention.Bind(node41, node46, node51);
        boolean boolean54 = node41.isRegExp();
        boolean boolean55 = node41.isNoSideEffectsCall();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node56 = node22.removeChildAfter(node41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNotNull(nodeArray19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(nodeArray38);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(nodeArray48);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList14 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList15 = objList14.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList16 = objList14.asList();
        com.google.javascript.rhino.InputId inputId18 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList25 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList26 = objList25.asList();
        java.lang.Object[] objArray27 = objList26.toArray();
        boolean boolean28 = inputId18.equals((java.lang.Object) objList26);
        com.google.common.collect.ImmutableList<java.lang.Object> objList35 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList36 = objList35.asList();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableCollection<java.lang.Object>> objCollectionList37 = com.google.common.collect.ImmutableList.of((com.google.common.collect.ImmutableCollection<java.lang.Object>) objList14, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList26, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList35);
        boolean boolean39 = objList26.equals((java.lang.Object) (byte) 10);
        boolean boolean40 = objList6.containsAll((java.util.Collection<java.lang.Object>) objList26);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        node43.setJSType(jSType44);
        int int46 = node43.getSideEffectFlags();
        boolean boolean47 = objList6.equals((java.lang.Object) node43);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(36, "function (): ?");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node51 = node43.getChildBefore(node50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objList14);
        org.junit.Assert.assertNotNull(objList15);
        org.junit.Assert.assertNotNull(objList16);
        org.junit.Assert.assertNotNull(objList25);
        org.junit.Assert.assertNotNull(objList26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objList35);
        org.junit.Assert.assertNotNull(objList36);
        org.junit.Assert.assertNotNull(objCollectionList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        boolean boolean15 = functionType13.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType17 = functionType13.findPropertyType("unknown");
        com.google.javascript.rhino.jstype.EnumElementType enumElementType18 = functionType13.toMaybeEnumElementType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType19 = enumElementType18.dereference();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(enumElementType18);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList8 = objList6.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList15 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList16 = objList15.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList17 = objList15.asList();
        boolean boolean18 = objList6.contains((java.lang.Object) objList15);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(48, nodeArray21, (int) (short) 0, (int) ' ');
        node24.setLength((int) (byte) 10);
        boolean boolean27 = node24.isFor();
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(48, nodeArray29, (int) (short) 0, (int) ' ');
        node32.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray36 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(48, nodeArray36, (int) (short) 0, (int) ' ');
        java.lang.String str40 = node39.getQualifiedName();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray46 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(48, nodeArray46, (int) (short) 0, (int) ' ');
        java.lang.String str50 = node49.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind51 = new com.google.javascript.jscomp.CodingConvention.Bind(node39, node44, node49);
        com.google.javascript.rhino.Node node52 = node32.useSourceInfoFromForTree(node44);
        node24.addChildrenToBack(node32);
        com.google.javascript.rhino.Node[] nodeArray55 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(48, nodeArray55, (int) (short) 0, (int) ' ');
        node58.setLength((int) (byte) 10);
        node58.setType((int) ' ');
        com.google.javascript.rhino.InputId inputId64 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList71 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList72 = objList71.asList();
        java.lang.Object[] objArray73 = objList72.toArray();
        boolean boolean74 = inputId64.equals((java.lang.Object) objList72);
        node58.setInputId(inputId64);
        com.google.javascript.rhino.Node node76 = node24.copyInformationFromForTree(node58);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType77 = null;
        com.google.javascript.rhino.Node[] nodeArray79 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(48, nodeArray79, (int) (short) 0, (int) ' ');
        java.util.Set<java.lang.String> strSet83 = node82.getDirectives();
        com.google.javascript.rhino.Node[] nodeArray85 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node(48, nodeArray85, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node91 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType92 = null;
        node91.setJSType(jSType92);
        com.google.javascript.rhino.Node node94 = node88.useSourceInfoIfMissingFrom(node91);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship95 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType77, node82, node88);
        com.google.javascript.rhino.Node node96 = node58.srcrefTree(node88);
        // The following exception was thrown during execution in test generation
        try {
            objList6.add(46, (java.lang.Object) node58);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objList8);
        org.junit.Assert.assertNotNull(objList15);
        org.junit.Assert.assertNotNull(objList16);
        org.junit.Assert.assertNotNull(objList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNotNull(nodeArray36);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeArray46);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeArray55);
        org.junit.Assert.assertNotNull(objList71);
        org.junit.Assert.assertNotNull(objList72);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(nodeArray79);
        org.junit.Assert.assertNull(strSet83);
        org.junit.Assert.assertNotNull(nodeArray85);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(node96);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = null;
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(48, nodeArray2, (int) (short) 0, (int) ' ');
        java.util.Set<java.lang.String> strSet6 = node5.getDirectives();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(48, nodeArray8, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        node14.setJSType(jSType15);
        com.google.javascript.rhino.Node node17 = node11.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship18 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node5, node11);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = new com.google.javascript.rhino.JSTypeExpression(node5, "Unknown class name");
        boolean boolean21 = jSTypeExpression20.isVarArgs();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.Node node27 = jSTypeRegistry23.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList32 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList32, jSTypeArray31);
        com.google.javascript.rhino.Node node34 = jSTypeRegistry30.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList32);
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry23.createFunctionType(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList32);
        boolean boolean36 = functionType35.isNativeObjectType();
        boolean boolean37 = functionType35.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType39 = functionType35.findPropertyType("unknown");
        com.google.javascript.rhino.jstype.EnumElementType enumElementType40 = functionType35.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.JSType jSType41 = functionType35.unboxesTo();
        java.lang.String str42 = functionType35.toDebugHashCodeString();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList46 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList46, jSTypeArray45);
        com.google.javascript.rhino.Node node48 = jSTypeRegistry44.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList46);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList53 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList53, jSTypeArray52);
        com.google.javascript.rhino.Node node55 = jSTypeRegistry51.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList53);
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry44.createFunctionType(jSType49, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList53);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList60 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList60, jSTypeArray59);
        com.google.javascript.rhino.Node node62 = jSTypeRegistry58.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList60);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList67 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList67, jSTypeArray66);
        com.google.javascript.rhino.Node node69 = jSTypeRegistry65.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList67);
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry58.createFunctionType(jSType63, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList67);
        boolean boolean71 = functionType70.isNativeObjectType();
        boolean boolean72 = functionType70.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType77 = jSTypeRegistry44.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType70, "", "()", 51, 47);
        boolean boolean79 = jSTypeRegistry44.hasNamespace("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter80 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry81 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter80);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray82 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList83 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList83, jSTypeArray82);
        com.google.javascript.rhino.Node node85 = jSTypeRegistry81.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList83);
        com.google.javascript.rhino.jstype.JSType jSType86 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter87 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry88 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter87);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray89 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList90 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList90, jSTypeArray89);
        com.google.javascript.rhino.Node node92 = jSTypeRegistry88.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList90);
        com.google.javascript.rhino.jstype.FunctionType functionType93 = jSTypeRegistry81.createFunctionType(jSType86, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList90);
        boolean boolean94 = functionType93.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType96 = functionType93.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType97 = null;
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType98 = jSTypeRegistry44.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType93, jSType97);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType99 = jSTypeExpression20.evaluate((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType35, jSTypeRegistry44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 48");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(jSTypeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(jSType39);
        org.junit.Assert.assertNull(enumElementType40);
        org.junit.Assert.assertNull(jSType41);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "function (): {781253472}" + "'", str42, "function (): {781253472}");
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(jSTypeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jSTypeArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(jSTypeArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertNotNull(functionType93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNull(jSType96);
        org.junit.Assert.assertNotNull(parameterizedType98);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.util.Set<java.lang.String> strSet5 = node4.getDirectives();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        boolean boolean10 = node9.isCall();
        boolean boolean11 = node4.isEquivalentTo(node9);
        java.lang.String str12 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        node15.setJSType(jSType16);
        boolean boolean18 = node15.isStringKey();
        boolean boolean19 = node15.isGetProp();
        int int20 = node4.getIndexOfChild(node15);
        boolean boolean21 = node4.isCall();
        com.google.javascript.rhino.InputId inputId22 = com.google.javascript.jscomp.NodeUtil.getInputId(node4);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = node4.isEquivalentToTyped(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(inputId22);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.Node[] nodeArray7 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(48, nodeArray7, (int) (short) 0, (int) ' ');
        node10.setLength((int) (byte) 10);
        boolean boolean13 = node10.isGetProp();
        node10.setSourceEncodedPosition(48);
        com.google.javascript.rhino.Node[] nodeArray19 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(48, nodeArray19, (int) (short) 0, (int) ' ');
        boolean boolean23 = node22.isRegExp();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = null;
        node22.setJSDocInfo(jSDocInfo24);
        int int26 = node22.getSideEffectFlags();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (short) 100, node22);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList31 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList31, jSTypeArray30);
        com.google.javascript.rhino.Node node33 = jSTypeRegistry29.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList31);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList38 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList38, jSTypeArray37);
        com.google.javascript.rhino.Node node40 = jSTypeRegistry36.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList38);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry29.createFunctionType(jSType34, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList38);
        boolean boolean42 = functionType41.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType44 = functionType41.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType45 = functionType41.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType46 = objectType45.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList50 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList50, jSTypeArray49);
        com.google.javascript.rhino.Node node52 = jSTypeRegistry48.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList50);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList57 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList57, jSTypeArray56);
        com.google.javascript.rhino.Node node59 = jSTypeRegistry55.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList57);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry48.createFunctionType(jSType53, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList57);
        boolean boolean61 = functionType60.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType63 = functionType60.findPropertyType("Unknown class name");
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = functionType60.getOwnPropertyJSDocInfo("Named type with empty name component");
        boolean boolean66 = objectType45.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType60);
        node22.setJSType((com.google.javascript.rhino.jstype.JSType) objectType45);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry1.createFromTypeNodes(node10, "Unknown class name", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 48");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(jSType44);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertNull(objectType46);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(jSType63);
        org.junit.Assert.assertNull(jSDocInfo65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList8 = objList6.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList15 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList16 = objList15.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList17 = objList15.asList();
        boolean boolean18 = objList6.contains((java.lang.Object) objList15);
        com.google.common.collect.ImmutableList<java.lang.Object> objList26 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList27 = objList26.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList28 = objList26.asList();
        com.google.javascript.rhino.InputId inputId30 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList37 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList38 = objList37.asList();
        java.lang.Object[] objArray39 = objList38.toArray();
        boolean boolean40 = inputId30.equals((java.lang.Object) objList38);
        com.google.common.collect.ImmutableList<java.lang.Object> objList47 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList48 = objList47.asList();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableCollection<java.lang.Object>> objCollectionList49 = com.google.common.collect.ImmutableList.of((com.google.common.collect.ImmutableCollection<java.lang.Object>) objList26, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList38, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList47);
        // The following exception was thrown during execution in test generation
        try {
            objList6.add((int) ' ', (java.lang.Object) objList26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objList8);
        org.junit.Assert.assertNotNull(objList15);
        org.junit.Assert.assertNotNull(objList16);
        org.junit.Assert.assertNotNull(objList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objList26);
        org.junit.Assert.assertNotNull(objList27);
        org.junit.Assert.assertNotNull(objList28);
        org.junit.Assert.assertNotNull(objList37);
        org.junit.Assert.assertNotNull(objList38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objList47);
        org.junit.Assert.assertNotNull(objList48);
        org.junit.Assert.assertNotNull(objCollectionList49);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        int int0 = com.google.javascript.rhino.Node.LAST_PROP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 54 + "'", int0 == 54);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        boolean boolean36 = jSTypeRegistry1.hasNamespace("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList40 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList40, jSTypeArray39);
        com.google.javascript.rhino.Node node42 = jSTypeRegistry38.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList40);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList47 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList47, jSTypeArray46);
        com.google.javascript.rhino.Node node49 = jSTypeRegistry45.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList47);
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry38.createFunctionType(jSType43, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList47);
        boolean boolean51 = functionType50.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType50.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType55 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType50, jSType54);
        java.lang.Iterable iterable56 = parameterizedType55.getCtorImplementedInterfaces();
        int int57 = parameterizedType55.getPropertiesCount();
        java.lang.String str58 = parameterizedType55.getReferenceName();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType59 = parameterizedType55.toMaybeParameterizedType();
        int int60 = parameterizedType59.getPropertiesCount();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertNotNull(parameterizedType55);
        org.junit.Assert.assertNotNull(iterable56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(parameterizedType59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) ' ', "hi!", 51, 51);
        com.google.javascript.rhino.Node node5 = node4.getLastChild();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = node5.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        node2.setJSType(jSType3);
        int int5 = node2.getSideEffectFlags();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        node9.setJSType(jSType10);
        int int12 = node9.getSideEffectFlags();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(48, node9, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            node2.removeChild(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(4095);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry1.getType("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList41 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList41, jSTypeArray40);
        com.google.javascript.rhino.Node node43 = jSTypeRegistry39.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList41);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList48 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList48, jSTypeArray47);
        com.google.javascript.rhino.Node node50 = jSTypeRegistry46.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList48);
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry39.createFunctionType(jSType44, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList48);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList55 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList55, jSTypeArray54);
        com.google.javascript.rhino.Node node57 = jSTypeRegistry53.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList55);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList62 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList62, jSTypeArray61);
        com.google.javascript.rhino.Node node64 = jSTypeRegistry60.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList62);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry53.createFunctionType(jSType58, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList62);
        boolean boolean66 = functionType65.isNativeObjectType();
        boolean boolean67 = functionType65.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType72 = jSTypeRegistry39.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType65, "", "()", 51, 47);
        com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry39.getType("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType75 = jSTypeRegistry39.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType75, "java.io.IOException: hi!", "Unknown class name", 0, 0);
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate81 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean82 = objectType75.setValidator(jSTypePredicate81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNull(jSType36);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(jSType80);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(0, "hi!");
        boolean boolean3 = node2.isNew();
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(48, nodeArray5, (int) (short) 0, (int) ' ');
        node8.setLength((int) (byte) 10);
        node8.setType((int) ' ');
        com.google.javascript.rhino.Node node13 = node8.cloneNode();
        boolean boolean14 = node13.isGetElem();
        com.google.javascript.rhino.Node[] nodeArray16 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(48, nodeArray16, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        node22.setJSType(jSType23);
        com.google.javascript.rhino.Node node25 = node19.useSourceInfoIfMissingFrom(node22);
        node19.putBooleanProp(52, true);
        int int29 = node13.getIndexOfChild(node19);
        com.google.javascript.rhino.Node[] nodeArray31 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(48, nodeArray31, (int) (short) 0, (int) ' ');
        boolean boolean35 = node34.isNumber();
        // The following exception was thrown during execution in test generation
        try {
            node2.replaceChild(node19, node34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeArray16);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(nodeArray31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) ' ', "");
        com.google.javascript.rhino.Node node4 = node3.getLastSibling();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) ' ', "");
        com.google.javascript.rhino.Node node8 = node7.getLastSibling();
        com.google.javascript.rhino.Node node9 = node3.useSourceInfoIfMissingFrom(node8);
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(48, nodeArray11, (int) (short) 0, (int) ' ');
        node14.setLength((int) (byte) 10);
        boolean boolean17 = node14.isBreak();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(45, node9, node14);
        com.google.common.collect.ImmutableList<java.lang.Object> objList25 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList26 = objList25.asList();
        java.lang.Object[] objArray27 = objList26.toArray();
        com.google.common.collect.UnmodifiableIterator<java.lang.Object> objItor28 = objList26.iterator();
        com.google.common.collect.ImmutableList<java.lang.Object> objList29 = objList26.asList();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        java.lang.Object[] objArray31 = new java.lang.Object[] { ternaryValue30 };
        java.util.ArrayList<java.lang.Object> objList32 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList32, objArray31);
        java.util.List<java.lang.Object> objList36 = objList32.subList(0, (int) (byte) 1);
        boolean boolean37 = objList26.containsAll((java.util.Collection<java.lang.Object>) objList32);
        com.google.javascript.rhino.Node[] nodeArray39 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(48, nodeArray39, (int) (short) 0, (int) ' ');
        node42.setLength((int) (byte) 10);
        boolean boolean45 = node42.isBreak();
        com.google.javascript.rhino.Node node46 = node42.getLastSibling();
        boolean boolean47 = objList32.remove((java.lang.Object) node46);
        com.google.javascript.rhino.Node[] nodeArray49 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(48, nodeArray49, (int) (short) 0, (int) ' ');
        java.util.Set<java.lang.String> strSet53 = node52.getDirectives();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        boolean boolean58 = node57.isCall();
        boolean boolean59 = node52.isEquivalentTo(node57);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile60 = node57.getStaticSourceFile();
        // The following exception was thrown during execution in test generation
        try {
            node18.addChildBefore(node46, node57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objList25);
        org.junit.Assert.assertNotNull(objList26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertNotNull(objItor28);
        org.junit.Assert.assertNotNull(objList29);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[unknown]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[unknown]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(nodeArray39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(nodeArray49);
        org.junit.Assert.assertNull(strSet53);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(staticSourceFile60);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        node7.setJSType(jSType8);
        com.google.javascript.rhino.Node node10 = node4.useSourceInfoIfMissingFrom(node7);
        node4.putBooleanProp(52, true);
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(48, nodeArray15, (int) (short) 0, (int) ' ');
        node18.setLength((int) (byte) 10);
        boolean boolean21 = node18.isFor();
        boolean boolean22 = node4.isEquivalentTo(node18);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.lang.String str5 = node4.getQualifiedName();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(48, nodeArray11, (int) (short) 0, (int) ' ');
        java.lang.String str15 = node14.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind16 = new com.google.javascript.jscomp.CodingConvention.Bind(node4, node9, node14);
        node4.putBooleanProp(10, true);
        java.util.Set<java.lang.String> strSet20 = node4.getDirectives();
        node4.setCharno(16);
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strSet20);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.util.Set<java.lang.String> strSet5 = node4.getDirectives();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        boolean boolean10 = node9.isCall();
        boolean boolean11 = node4.isEquivalentTo(node9);
        java.lang.String str12 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        node15.setJSType(jSType16);
        boolean boolean18 = node15.isStringKey();
        boolean boolean19 = node15.isGetProp();
        int int20 = node4.getIndexOfChild(node15);
        com.google.javascript.rhino.jstype.JSType jSType21 = node15.getJSType();
        com.google.javascript.rhino.Node[] nodeArray24 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(48, nodeArray24, (int) (short) 0, (int) ' ');
        boolean boolean28 = node27.isRegExp();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = null;
        node27.setJSDocInfo(jSDocInfo29);
        int int31 = node27.getSideEffectFlags();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 100, node27);
        // The following exception was thrown during execution in test generation
        try {
            node15.addChildrenToFront(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNotNull(nodeArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        boolean boolean36 = jSTypeRegistry1.hasNamespace("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList40 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList40, jSTypeArray39);
        com.google.javascript.rhino.Node node42 = jSTypeRegistry38.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList40);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList47 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList47, jSTypeArray46);
        com.google.javascript.rhino.Node node49 = jSTypeRegistry45.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList47);
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry38.createFunctionType(jSType43, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList47);
        boolean boolean51 = functionType50.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType50.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType55 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType50, jSType54);
        java.lang.Iterable iterable56 = parameterizedType55.getCtorImplementedInterfaces();
        int int57 = parameterizedType55.getPropertiesCount();
        com.google.javascript.rhino.Node node59 = parameterizedType55.getPropertyNode("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = parameterizedType55.hasAnyTemplateInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertNotNull(parameterizedType55);
        org.junit.Assert.assertNotNull(iterable56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(node59);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getEnumParameterType();
        boolean boolean2 = jSDocInfo0.isHidden();
        java.lang.String str3 = jSDocInfo0.getDeprecationReason();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getSuppressions();
        com.google.common.collect.ImmutableList<java.lang.Object> objList11 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList12 = objList11.asList();
        java.lang.Object[] objArray13 = objList12.toArray();
        int int15 = objList12.lastIndexOf((java.lang.Object) 100);
        java.util.Spliterator<java.lang.Object> objSpliterator16 = objList12.spliterator();
        boolean boolean17 = strSet4.removeAll((java.util.Collection<java.lang.Object>) objList12);
        com.google.javascript.rhino.Node[] nodeArray19 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(48, nodeArray19, (int) (short) 0, (int) ' ');
        node22.setLength((int) (byte) 10);
        boolean boolean25 = node22.isFor();
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(48, nodeArray27, (int) (short) 0, (int) ' ');
        node30.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray34 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(48, nodeArray34, (int) (short) 0, (int) ' ');
        java.lang.String str38 = node37.getQualifiedName();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(48, nodeArray44, (int) (short) 0, (int) ' ');
        java.lang.String str48 = node47.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind49 = new com.google.javascript.jscomp.CodingConvention.Bind(node37, node42, node47);
        com.google.javascript.rhino.Node node50 = node30.useSourceInfoFromForTree(node42);
        node22.addChildrenToBack(node30);
        com.google.javascript.rhino.Node[] nodeArray53 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(48, nodeArray53, (int) (short) 0, (int) ' ');
        node56.setLength((int) (byte) 10);
        node56.setType((int) ' ');
        com.google.javascript.rhino.InputId inputId62 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList69 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList70 = objList69.asList();
        java.lang.Object[] objArray71 = objList70.toArray();
        boolean boolean72 = inputId62.equals((java.lang.Object) objList70);
        node56.setInputId(inputId62);
        com.google.javascript.rhino.Node node74 = node22.copyInformationFromForTree(node56);
        boolean boolean75 = strSet4.remove((java.lang.Object) node22);
        com.google.javascript.rhino.Node[] nodeArray77 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node(48, nodeArray77, (int) (short) 0, (int) ' ');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable81 = node80.siblings();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator82 = nodeIterable81.spliterator();
        boolean boolean83 = strSet4.equals((java.lang.Object) nodeIterable81);
        com.google.common.collect.ImmutableList<java.lang.Object> objList90 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList91 = objList90.asList();
        java.lang.Object[] objArray92 = objList91.toArray();
        com.google.common.collect.UnmodifiableIterator<java.lang.Object> objItor93 = objList91.iterator();
        com.google.common.collect.ImmutableList<java.lang.Object> objList94 = objList91.asList();
        boolean boolean95 = strSet4.retainAll((java.util.Collection<java.lang.Object>) objList91);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean97 = strSet4.add("()");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(objList11);
        org.junit.Assert.assertNotNull(objList12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNotNull(nodeArray34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(nodeArray53);
        org.junit.Assert.assertNotNull(objList69);
        org.junit.Assert.assertNotNull(objList70);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(nodeArray77);
        org.junit.Assert.assertNotNull(nodeIterable81);
        org.junit.Assert.assertNotNull(nodeSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(objList90);
        org.junit.Assert.assertNotNull(objList91);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray92), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray92), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertNotNull(objItor93);
        org.junit.Assert.assertNotNull(objList94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getEnumParameterType();
        boolean boolean2 = jSDocInfo0.isHidden();
        java.lang.String str3 = jSDocInfo0.getDeprecationReason();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getSuppressions();
        com.google.common.collect.ImmutableList<java.lang.Object> objList11 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList12 = objList11.asList();
        java.lang.Object[] objArray13 = objList12.toArray();
        int int15 = objList12.lastIndexOf((java.lang.Object) 100);
        java.util.Spliterator<java.lang.Object> objSpliterator16 = objList12.spliterator();
        boolean boolean17 = strSet4.removeAll((java.util.Collection<java.lang.Object>) objList12);
        com.google.javascript.rhino.Node[] nodeArray19 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(48, nodeArray19, (int) (short) 0, (int) ' ');
        node22.setLength((int) (byte) 10);
        boolean boolean25 = node22.isFor();
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(48, nodeArray27, (int) (short) 0, (int) ' ');
        node30.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray34 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(48, nodeArray34, (int) (short) 0, (int) ' ');
        java.lang.String str38 = node37.getQualifiedName();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(48, nodeArray44, (int) (short) 0, (int) ' ');
        java.lang.String str48 = node47.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind49 = new com.google.javascript.jscomp.CodingConvention.Bind(node37, node42, node47);
        com.google.javascript.rhino.Node node50 = node30.useSourceInfoFromForTree(node42);
        node22.addChildrenToBack(node30);
        com.google.javascript.rhino.Node[] nodeArray53 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(48, nodeArray53, (int) (short) 0, (int) ' ');
        node56.setLength((int) (byte) 10);
        node56.setType((int) ' ');
        com.google.javascript.rhino.InputId inputId62 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList69 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList70 = objList69.asList();
        java.lang.Object[] objArray71 = objList70.toArray();
        boolean boolean72 = inputId62.equals((java.lang.Object) objList70);
        node56.setInputId(inputId62);
        com.google.javascript.rhino.Node node74 = node22.copyInformationFromForTree(node56);
        boolean boolean75 = strSet4.remove((java.lang.Object) node22);
        // The following exception was thrown during execution in test generation
        try {
            double double76 = node22.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 48");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(objList11);
        org.junit.Assert.assertNotNull(objList12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNotNull(nodeArray34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(nodeArray53);
        org.junit.Assert.assertNotNull(objList69);
        org.junit.Assert.assertNotNull(objList70);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        java.lang.Object[] objArray8 = objList7.toArray();
        com.google.common.collect.UnmodifiableIterator<java.lang.Object> objItor9 = objList7.iterator();
        com.google.common.collect.ImmutableList<java.lang.Object> objList10 = objList7.asList();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        java.lang.Object[] objArray12 = new java.lang.Object[] { ternaryValue11 };
        java.util.ArrayList<java.lang.Object> objList13 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList13, objArray12);
        java.util.List<java.lang.Object> objList17 = objList13.subList(0, (int) (byte) 1);
        boolean boolean18 = objList7.containsAll((java.util.Collection<java.lang.Object>) objList13);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility19 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        boolean boolean20 = objList7.equals((java.lang.Object) visibility19);
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor21 = objList7.listIterator();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList26 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList26, jSTypeArray25);
        com.google.javascript.rhino.Node node28 = jSTypeRegistry24.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList26);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList33 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList33, jSTypeArray32);
        com.google.javascript.rhino.Node node35 = jSTypeRegistry31.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList33);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry24.createFunctionType(jSType29, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList33);
        boolean boolean37 = functionType36.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType39 = functionType36.findPropertyType("Unknown class name");
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType36.getOwnPropertyJSDocInfo("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            objList7.add(45, (java.lang.Object) jSDocInfo41);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertNotNull(objList10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[unknown]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[unknown]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + visibility19 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility19.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objItor21);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(jSType39);
        org.junit.Assert.assertNull(jSDocInfo41);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        java.lang.Object[] objArray8 = objList7.toArray();
        com.google.common.collect.UnmodifiableIterator<java.lang.Object> objItor9 = objList7.iterator();
        com.google.common.collect.ImmutableList<java.lang.Object> objList10 = objList7.asList();
        java.lang.Object[] objArray11 = objList10.toArray();
        com.google.common.collect.ImmutableList<java.lang.Object> objList18 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        java.util.stream.Stream<java.lang.Object> objStream19 = objList18.stream();
        int int21 = objList18.indexOf((java.lang.Object) 100);
        com.google.javascript.rhino.Node[] nodeArray24 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(48, nodeArray24, (int) (short) 0, (int) ' ');
        node27.setLength((int) (byte) 10);
        boolean boolean30 = node27.isFor();
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(48, nodeArray32, (int) (short) 0, (int) ' ');
        node35.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray39 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(48, nodeArray39, (int) (short) 0, (int) ' ');
        java.lang.String str43 = node42.getQualifiedName();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray49 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(48, nodeArray49, (int) (short) 0, (int) ' ');
        java.lang.String str53 = node52.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind54 = new com.google.javascript.jscomp.CodingConvention.Bind(node42, node47, node52);
        com.google.javascript.rhino.Node node55 = node35.useSourceInfoFromForTree(node47);
        node27.addChildrenToBack(node35);
        com.google.javascript.rhino.Node[] nodeArray58 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(48, nodeArray58, (int) (short) 0, (int) ' ');
        java.lang.String str62 = node61.getQualifiedName();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray68 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(48, nodeArray68, (int) (short) 0, (int) ' ');
        java.lang.String str72 = node71.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind73 = new com.google.javascript.jscomp.CodingConvention.Bind(node61, node66, node71);
        boolean boolean74 = node61.isTypeOf();
        boolean boolean75 = node61.isBlock();
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node(40, node27, node61);
        java.lang.String str77 = com.google.javascript.jscomp.NodeUtil.getSourceName(node27);
        boolean boolean78 = objList18.equals((java.lang.Object) str77);
        boolean boolean79 = objList10.equals((java.lang.Object) objList18);
        java.util.Spliterator<java.lang.Object> objSpliterator80 = objList18.spliterator();
        boolean boolean81 = objList18.isEmpty();
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator82 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList18.replaceAll(objUnaryOperator82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertNotNull(objList10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertNotNull(objList18);
        org.junit.Assert.assertNotNull(objStream19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(nodeArray24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertNotNull(nodeArray39);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeArray49);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(nodeArray58);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(nodeArray68);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(objSpliterator80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        node2.setJSType(jSType3);
        boolean boolean5 = node2.isStringKey();
        com.google.javascript.rhino.Node node7 = node2.getAncestor(1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = node7.getCharno();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation(1, 4, (int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        java.lang.Object[] objArray8 = objList7.toArray();
        com.google.common.collect.UnmodifiableIterator<java.lang.Object> objItor9 = objList7.iterator();
        java.lang.Object obj10 = objItor9.next();
        boolean boolean11 = objItor9.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            objItor9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + ' ' + "'", obj10, ' ');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        boolean boolean36 = jSTypeRegistry1.hasNamespace("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList40 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList40, jSTypeArray39);
        com.google.javascript.rhino.Node node42 = jSTypeRegistry38.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList40);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList47 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList47, jSTypeArray46);
        com.google.javascript.rhino.Node node49 = jSTypeRegistry45.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList47);
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry38.createFunctionType(jSType43, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList47);
        boolean boolean51 = functionType50.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType50.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType55 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType50, jSType54);
        java.lang.Iterable iterable56 = parameterizedType55.getCtorImplementedInterfaces();
        int int57 = parameterizedType55.getPropertiesCount();
        boolean boolean59 = parameterizedType55.hasProperty("function (): {872023649}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = parameterizedType55.hasAnyTemplateInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertNotNull(parameterizedType55);
        org.junit.Assert.assertNotNull(iterable56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType13.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType17 = functionType13.getTypeOfThis();
        boolean boolean18 = objectType17.isEnumElementType();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        node3.setJSType(jSType4);
        int int6 = node3.getSideEffectFlags();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(16, node3, 52, 52);
        com.google.javascript.rhino.Node node11 = node9.getAncestor(46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = node11.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(48, nodeArray2, (int) (short) 0, (int) ' ');
        boolean boolean6 = node5.isRegExp();
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = null;
        node5.setJSDocInfo(jSDocInfo7);
        int int9 = node5.getSideEffectFlags();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 100, node5);
        boolean boolean11 = node10.isNumber();
        boolean boolean12 = node10.isIf();
        com.google.javascript.rhino.Node[] nodeArray14 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(48, nodeArray14, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        node20.setJSType(jSType21);
        com.google.javascript.rhino.Node node23 = node17.useSourceInfoIfMissingFrom(node20);
        node17.putBooleanProp(52, true);
        com.google.javascript.rhino.Node[] nodeArray28 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(48, nodeArray28, (int) (short) 0, (int) ' ');
        node31.setLength((int) (byte) 10);
        boolean boolean34 = node31.isFor();
        boolean boolean35 = node17.isEquivalentTo(node31);
        boolean boolean36 = node31.isExprResult();
        boolean boolean37 = node10.isEquivalentToTyped(node31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = node31.toString(true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 48");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeArray14);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeArray28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(48, nodeArray2, (int) (short) 0, (int) ' ');
        node5.setLength((int) (byte) 10);
        boolean boolean8 = node5.isLabelName();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(1, node5, 45, (int) (short) -1);
        boolean boolean12 = node11.hasMoreThanOneChild();
        com.google.javascript.rhino.Node[] nodeArray14 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(48, nodeArray14, (int) (short) 0, (int) ' ');
        java.lang.String str18 = node17.getQualifiedName();
        com.google.javascript.rhino.Node node19 = node11.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        node23.setJSType(jSType24);
        int int26 = node23.getSideEffectFlags();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(48, node23, 10, 0);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            node17.replaceChildAfter(node23, node30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeArray14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        int int15 = functionType13.getExtendedInterfacesCount();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry1.getType("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList42 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList42, jSTypeArray41);
        com.google.javascript.rhino.Node node44 = jSTypeRegistry40.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList42);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList49 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList49, jSTypeArray48);
        com.google.javascript.rhino.Node node51 = jSTypeRegistry47.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList49);
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry40.createFunctionType(jSType45, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList49);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList56 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList56, jSTypeArray55);
        com.google.javascript.rhino.Node node58 = jSTypeRegistry54.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList56);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList63 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList63, jSTypeArray62);
        com.google.javascript.rhino.Node node65 = jSTypeRegistry61.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry54.createFunctionType(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList63);
        boolean boolean67 = functionType66.isNativeObjectType();
        boolean boolean68 = functionType66.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType73 = jSTypeRegistry40.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType66, "", "()", 51, 47);
        com.google.javascript.rhino.jstype.JSType jSType74 = objectType37.resolve(errorReporter38, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType66);
        boolean boolean75 = jSType74.isDateType();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNull(jSType36);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(jSTypeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType73);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry1.getType("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable38 = jSTypeRegistry1.getTypesWithProperty("unknown");
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry1.createNamedType("function (): {1804540486}", "function (): {2090026542}", 45, (int) (byte) 0);
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNull(jSType36);
        org.junit.Assert.assertNotNull(jSTypeIterable38);
        org.junit.Assert.assertNotNull(jSType43);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        java.lang.Object[] objArray8 = objList7.toArray();
        com.google.common.collect.UnmodifiableIterator<java.lang.Object> objItor9 = objList7.iterator();
        com.google.common.collect.ImmutableList<java.lang.Object> objList10 = objList7.asList();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        java.lang.Object[] objArray12 = new java.lang.Object[] { ternaryValue11 };
        java.util.ArrayList<java.lang.Object> objList13 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList13, objArray12);
        java.util.List<java.lang.Object> objList17 = objList13.subList(0, (int) (byte) 1);
        boolean boolean18 = objList7.containsAll((java.util.Collection<java.lang.Object>) objList13);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility19 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        boolean boolean20 = objList7.equals((java.lang.Object) visibility19);
        java.util.Spliterator<java.lang.Object> objSpliterator21 = objList7.spliterator();
        java.io.IOException iOException23 = new java.io.IOException("hi!");
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) iOException23);
        java.io.IOException iOException26 = new java.io.IOException("hi!");
        java.io.IOException iOException28 = new java.io.IOException("hi!");
        java.io.IOException iOException30 = new java.io.IOException("hi!");
        com.google.common.collect.ImmutableList<java.io.IOException> iOExceptionList31 = com.google.common.collect.ImmutableList.of(iOException26, iOException28, iOException30);
        iOException23.addSuppressed((java.lang.Throwable) iOException26);
        int int33 = objList7.lastIndexOf((java.lang.Object) iOException23);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator34 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList7.replaceAll(objUnaryOperator34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertNotNull(objList10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[unknown]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[unknown]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + visibility19 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility19.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objSpliterator21);
        org.junit.Assert.assertNotNull(iOExceptionList31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection17 = jSDocInfo16.getAuthors();
        boolean boolean18 = jSDocInfo16.hasBaseType();
        functionType13.setPropertyJSDocInfo("Unknown class name", jSDocInfo16);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = functionType13.getParentScope();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList31 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList31, jSTypeArray30);
        com.google.javascript.rhino.Node node33 = jSTypeRegistry29.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList31);
        com.google.javascript.rhino.jstype.FunctionType functionType34 = jSTypeRegistry22.createFunctionType(jSType27, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList31);
        boolean boolean35 = functionType34.isNativeObjectType();
        boolean boolean36 = functionType34.hasImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable37 = functionType34.getExtendedInterfaces();
        boolean boolean38 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType13, (com.google.javascript.rhino.jstype.JSType) functionType34);
        boolean boolean39 = functionType13.isFunctionPrototypeType();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strCollection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) (byte) -1);
        sideEffectFlags1.setMutatesGlobalState();
        sideEffectFlags1.setThrows();
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        boolean boolean4 = node3.isString();
        com.google.javascript.rhino.Node node5 = node3.getLastSibling();
        boolean boolean6 = node3.isIf();
        boolean boolean7 = node3.isName();
        com.google.javascript.rhino.Node node8 = node3.getNext();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        boolean boolean5 = node4.isRegExp();
        com.google.javascript.rhino.Node[] nodeArray7 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(48, nodeArray7, (int) (short) 0, (int) ' ');
        node10.setLength((int) (byte) 10);
        node10.setType((int) ' ');
        com.google.javascript.rhino.Node node15 = node10.cloneNode();
        com.google.javascript.rhino.Node node16 = node4.useSourceInfoIfMissingFrom(node15);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node15);
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeArray7);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4, (int) '4', 47);
        com.google.javascript.rhino.Node node4 = node3.getLastSibling();
        boolean boolean5 = node4.isGetElem();
        boolean boolean6 = node4.isDelProp();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(48, nodeArray8, (int) (short) 0, (int) ' ');
        node11.setLength((int) (byte) 10);
        node11.setType((int) ' ');
        com.google.javascript.rhino.Node node16 = node11.cloneNode();
        boolean boolean17 = node16.isGetElem();
        com.google.javascript.rhino.Node[] nodeArray19 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(48, nodeArray19, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        node25.setJSType(jSType26);
        com.google.javascript.rhino.Node node28 = node22.useSourceInfoIfMissingFrom(node25);
        node22.putBooleanProp(52, true);
        int int32 = node16.getIndexOfChild(node22);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node33 = node4.getChildBefore(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeArray19);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        node7.setJSType(jSType8);
        com.google.javascript.rhino.Node node10 = node4.useSourceInfoIfMissingFrom(node7);
        node7.setSourceEncodedPositionForTree(10);
        boolean boolean13 = node7.isNE();
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(48, nodeArray15, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        node21.setJSType(jSType22);
        com.google.javascript.rhino.Node node24 = node18.useSourceInfoIfMissingFrom(node21);
        com.google.javascript.rhino.Node[] nodeArray26 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(48, nodeArray26, (int) (short) 0, (int) ' ');
        node29.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(48, nodeArray33, (int) (short) 0, (int) ' ');
        java.lang.String str37 = node36.getQualifiedName();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray43 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(48, nodeArray43, (int) (short) 0, (int) ' ');
        java.lang.String str47 = node46.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind48 = new com.google.javascript.jscomp.CodingConvention.Bind(node36, node41, node46);
        com.google.javascript.rhino.Node node49 = node29.useSourceInfoFromForTree(node41);
        // The following exception was thrown during execution in test generation
        try {
            node7.replaceChild(node24, node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeArray26);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeArray43);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(node49);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("function (): {250556602}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = null;
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(48, nodeArray2, (int) (short) 0, (int) ' ');
        java.util.Set<java.lang.String> strSet6 = node5.getDirectives();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(48, nodeArray8, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        node14.setJSType(jSType15);
        com.google.javascript.rhino.Node node17 = node11.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship18 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node5, node11);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = new com.google.javascript.rhino.JSTypeExpression(node5, "Unknown class name");
        boolean boolean21 = jSTypeExpression20.isVarArgs();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression22 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression20);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeExpression22);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList8 = objList6.asList();
        com.google.javascript.rhino.InputId inputId10 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList17 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList18 = objList17.asList();
        java.lang.Object[] objArray19 = objList18.toArray();
        boolean boolean20 = inputId10.equals((java.lang.Object) objList18);
        com.google.common.collect.ImmutableList<java.lang.Object> objList27 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList28 = objList27.asList();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableCollection<java.lang.Object>> objCollectionList29 = com.google.common.collect.ImmutableList.of((com.google.common.collect.ImmutableCollection<java.lang.Object>) objList6, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList18, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList27);
        int int31 = objList18.indexOf((java.lang.Object) 100.0d);
        com.google.javascript.rhino.Node[] nodeArray34 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(48, nodeArray34, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(49, nodeArray34, 29, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable[] cloneableArray41 = objList18.toArray((java.lang.Cloneable[]) nodeArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objList8);
        org.junit.Assert.assertNotNull(objList17);
        org.junit.Assert.assertNotNull(objList18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objList27);
        org.junit.Assert.assertNotNull(objList28);
        org.junit.Assert.assertNotNull(objCollectionList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(nodeArray34);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node[] nodeArray3 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(48, nodeArray3, (int) (short) 0, (int) ' ');
        java.lang.String str7 = node6.getQualifiedName();
        boolean boolean8 = node6.isIf();
        boolean boolean9 = node6.isSyntheticBlock();
        java.lang.String str10 = node6.getQualifiedName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) '#', node1, node6, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        int int15 = functionType13.getPropertiesCount();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable16 = functionType13.getOwnImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType13.findPropertyType("function (): {1306230942}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = jSType18.isNumber();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objectTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.google.javascript.rhino.Node[] nodeArray3 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(48, nodeArray3, (int) (short) 0, (int) ' ');
        java.lang.String str7 = node6.getQualifiedName();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node6, 46, 36);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition11 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node[] nodeArray14 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(48, nodeArray14, (int) (short) 0, (int) ' ');
        node17.setLength((int) (byte) 10);
        boolean boolean20 = node17.isLabelName();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(1, node17, 45, (int) (short) -1);
        boolean boolean24 = node23.hasMoreThanOneChild();
        com.google.javascript.rhino.Node[] nodeArray26 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(48, nodeArray26, (int) (short) 0, (int) ' ');
        java.lang.String str30 = node29.getQualifiedName();
        com.google.javascript.rhino.Node node31 = node23.copyInformationFrom(node29);
        typePosition11.setItem(node29);
        int int33 = typePosition11.getPositionOnStartLine();
        com.google.javascript.rhino.Node node34 = typePosition11.getItem();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (short) 1, node6, node34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: first new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(nodeArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeArray26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative35 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry1.getNativeFunctionType(jSTypeNative35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4, (int) '4', 47);
        boolean boolean4 = node3.isVarArgs();
        int int6 = node3.getIntProp((int) (short) 100);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getAnnotation();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray5 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList6 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList6, jSTypeArray5);
        com.google.javascript.rhino.Node node8 = jSTypeRegistry4.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList6);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList13 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList13, jSTypeArray12);
        com.google.javascript.rhino.Node node15 = jSTypeRegistry11.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList13);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry4.createFunctionType(jSType9, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList13);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList20 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList20, jSTypeArray19);
        com.google.javascript.rhino.Node node22 = jSTypeRegistry18.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList20);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList27 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList27, jSTypeArray26);
        com.google.javascript.rhino.Node node29 = jSTypeRegistry25.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList27);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry18.createFunctionType(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList27);
        boolean boolean31 = functionType30.isNativeObjectType();
        boolean boolean32 = functionType30.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType37 = jSTypeRegistry4.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType30, "", "()", 51, 47);
        boolean boolean39 = jSTypeRegistry4.hasNamespace("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray42 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList43 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList43, jSTypeArray42);
        com.google.javascript.rhino.Node node45 = jSTypeRegistry41.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList43);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList50 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList50, jSTypeArray49);
        com.google.javascript.rhino.Node node52 = jSTypeRegistry48.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList50);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry41.createFunctionType(jSType46, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList50);
        boolean boolean54 = functionType53.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType53.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType58 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType53, jSType57);
        java.lang.Iterable iterable59 = parameterizedType58.getCtorImplementedInterfaces();
        int int60 = parameterizedType58.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType61 = parameterizedType58.collapseUnion();
        com.google.javascript.rhino.Node node63 = parameterizedType58.getPropertyNode("function (): {2090026542}");
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType58, "function (): {1306230942}", "hi!", (int) (byte) 1, 35);
        java.lang.String str69 = jSType68.getDisplayName();
        org.junit.Assert.assertNotNull(jSTypeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSTypeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(jSType56);
        org.junit.Assert.assertNotNull(parameterizedType58);
        org.junit.Assert.assertNotNull(iterable59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(jSType61);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "function " + "'", str69, "function ");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList39 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList39, jSTypeArray38);
        com.google.javascript.rhino.Node node41 = jSTypeRegistry37.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList39);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList46 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList46, jSTypeArray45);
        com.google.javascript.rhino.Node node48 = jSTypeRegistry44.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList46);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry37.createFunctionType(jSType42, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList46);
        boolean boolean50 = functionType49.isNativeObjectType();
        boolean boolean51 = functionType49.isTemplateType();
        com.google.javascript.rhino.jstype.JSType jSType52 = functionType27.forceResolve(errorReporter35, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType49);
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate53 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = functionType27.setValidator(jSTypePredicate53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jSType52);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        boolean boolean36 = jSTypeRegistry1.hasNamespace("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList40 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList40, jSTypeArray39);
        com.google.javascript.rhino.Node node42 = jSTypeRegistry38.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList40);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList47 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList47, jSTypeArray46);
        com.google.javascript.rhino.Node node49 = jSTypeRegistry45.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList47);
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry38.createFunctionType(jSType43, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList47);
        boolean boolean51 = functionType50.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType50.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType55 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType50, jSType54);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative56 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType57 = jSTypeRegistry1.getNativeObjectType(jSTypeNative56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertNotNull(parameterizedType55);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType13.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType17 = functionType13.getTypeOfThis();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList22 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList22, jSTypeArray21);
        com.google.javascript.rhino.Node node24 = jSTypeRegistry20.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList22);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList29 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList29, jSTypeArray28);
        com.google.javascript.rhino.Node node31 = jSTypeRegistry27.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry20.createFunctionType(jSType25, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList29);
        com.google.javascript.rhino.jstype.FunctionType functionType33 = functionType32.getOwnerFunction();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec35 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("unknown");
        com.google.javascript.rhino.Node[] nodeArray37 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(48, nodeArray37, (int) (short) 0, (int) ' ');
        node40.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(48, nodeArray44, (int) (short) 0, (int) ' ');
        java.lang.String str48 = node47.getQualifiedName();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray54 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(48, nodeArray54, (int) (short) 0, (int) ' ');
        java.lang.String str58 = node57.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind59 = new com.google.javascript.jscomp.CodingConvention.Bind(node47, node52, node57);
        com.google.javascript.rhino.Node node60 = node40.useSourceInfoFromForTree(node52);
        com.google.javascript.rhino.Node node61 = assertionFunctionSpec35.getAssertedParam(node60);
        boolean boolean62 = objectType17.defineDeclaredProperty("", (com.google.javascript.rhino.jstype.JSType) functionType32, node60);
        boolean boolean63 = functionType32.isEmptyType();
        java.lang.String str64 = functionType32.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType32.getPrototype();
        com.google.javascript.rhino.jstype.JSType jSType67 = objectType65.findPropertyType("function (): {1306230942}");
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertNull(functionType33);
        org.junit.Assert.assertNotNull(nodeArray37);
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeArray54);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "function (): {1999720740}" + "'", str64, "function (): {1999720740}");
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNotNull(jSType67);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        node7.setJSType(jSType8);
        com.google.javascript.rhino.Node node10 = node4.useSourceInfoIfMissingFrom(node7);
        node4.putBooleanProp(52, true);
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(48, nodeArray15, (int) (short) 0, (int) ' ');
        node18.setLength((int) (byte) 10);
        boolean boolean21 = node18.isFor();
        boolean boolean22 = node4.isEquivalentTo(node18);
        boolean boolean23 = node18.isFunction();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection24 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node18);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        node27.setJSType(jSType28);
        boolean boolean30 = node27.isStringKey();
        boolean boolean31 = node27.isCase();
        com.google.javascript.rhino.Node node32 = node18.useSourceInfoFromForTree(node27);
        node18.setSourceEncodedPositionForTree((int) (byte) 100);
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeCollection24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        java.lang.Object[] objArray8 = objList7.toArray();
        int int10 = objList7.lastIndexOf((java.lang.Object) 100);
        com.google.javascript.jscomp.CodingConvention.Bind[] bindArray11 = new com.google.javascript.jscomp.CodingConvention.Bind[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind[] bindArray12 = objList7.toArray(bindArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(bindArray11);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList14 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList15 = objList14.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList16 = objList14.asList();
        com.google.javascript.rhino.InputId inputId18 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList25 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList26 = objList25.asList();
        java.lang.Object[] objArray27 = objList26.toArray();
        boolean boolean28 = inputId18.equals((java.lang.Object) objList26);
        com.google.common.collect.ImmutableList<java.lang.Object> objList35 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList36 = objList35.asList();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableCollection<java.lang.Object>> objCollectionList37 = com.google.common.collect.ImmutableList.of((com.google.common.collect.ImmutableCollection<java.lang.Object>) objList14, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList26, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList35);
        boolean boolean39 = objList26.equals((java.lang.Object) (byte) 10);
        boolean boolean40 = objList6.containsAll((java.util.Collection<java.lang.Object>) objList26);
        com.google.javascript.rhino.Node[] nodeArray42 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(48, nodeArray42, (int) (short) 0, (int) ' ');
        int int46 = objList26.indexOf((java.lang.Object) 48);
        java.lang.Object obj47 = null;
        int int48 = objList26.lastIndexOf(obj47);
        java.lang.Object obj50 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList26.add((int) '#', obj50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objList14);
        org.junit.Assert.assertNotNull(objList15);
        org.junit.Assert.assertNotNull(objList16);
        org.junit.Assert.assertNotNull(objList25);
        org.junit.Assert.assertNotNull(objList26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objList35);
        org.junit.Assert.assertNotNull(objList36);
        org.junit.Assert.assertNotNull(objCollectionList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(nodeArray42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        boolean boolean36 = jSTypeRegistry1.hasNamespace("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList40 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList40, jSTypeArray39);
        com.google.javascript.rhino.Node node42 = jSTypeRegistry38.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList40);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList47 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList47, jSTypeArray46);
        com.google.javascript.rhino.Node node49 = jSTypeRegistry45.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList47);
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry38.createFunctionType(jSType43, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList47);
        boolean boolean51 = functionType50.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType50.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType55 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType50, jSType54);
        java.lang.Iterable iterable56 = parameterizedType55.getCtorImplementedInterfaces();
        int int57 = parameterizedType55.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType58 = parameterizedType55.collapseUnion();
        com.google.javascript.rhino.Node node60 = parameterizedType55.getPropertyNode("function (): {2090026542}");
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList64 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList64, jSTypeArray63);
        com.google.javascript.rhino.Node node66 = jSTypeRegistry62.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList64);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray70 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList71 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList71, jSTypeArray70);
        com.google.javascript.rhino.Node node73 = jSTypeRegistry69.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList71);
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry62.createFunctionType(jSType67, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList71);
        boolean boolean75 = functionType74.isNativeObjectType();
        boolean boolean76 = functionType74.hasImplementedInterfaces();
        boolean boolean77 = functionType74.isGlobalThisType();
        parameterizedType55.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType74);
        com.google.javascript.rhino.jstype.JSType jSType79 = parameterizedType55.collapseUnion();
        boolean boolean80 = jSType79.isRegexpType();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertNotNull(parameterizedType55);
        org.junit.Assert.assertNotNull(iterable56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(jSTypeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jSType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        boolean boolean5 = node4.isRegExp();
        com.google.javascript.rhino.Node[] nodeArray7 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(48, nodeArray7, (int) (short) 0, (int) ' ');
        node10.setLength((int) (byte) 10);
        node10.setType((int) ' ');
        com.google.javascript.rhino.Node node15 = node10.cloneNode();
        com.google.javascript.rhino.Node node16 = node4.useSourceInfoIfMissingFrom(node15);
        boolean boolean17 = node4.isNot();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo18 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeArray7);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        node4.setLength((int) (byte) 10);
        boolean boolean7 = node4.isGetProp();
        node4.setSourceEncodedPosition(48);
        boolean boolean10 = node4.isComma();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = node4.toStringTree();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 48");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        node4.setLength((int) (byte) 10);
        node4.setType((int) ' ');
        com.google.javascript.rhino.Node node9 = node4.cloneNode();
        boolean boolean10 = node9.isGetElem();
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(48, nodeArray12, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        node18.setJSType(jSType19);
        com.google.javascript.rhino.Node node21 = node15.useSourceInfoIfMissingFrom(node18);
        node15.putBooleanProp(52, true);
        int int25 = node9.getIndexOfChild(node15);
        boolean boolean26 = node15.isExprResult();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        node30.setJSType(jSType31);
        int int33 = node30.getSideEffectFlags();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(16, node30, 52, 52);
        com.google.javascript.rhino.Node node38 = node36.getAncestor(46);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node39 = node15.getChildBefore(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(node38);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4, (int) '4', 47);
        com.google.javascript.rhino.Node node4 = node3.getLastSibling();
        boolean boolean5 = node4.isGetElem();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags7 = new com.google.javascript.rhino.Node.SideEffectFlags((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            node4.setSideEffectFlags(sideEffectFlags7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        boolean boolean36 = jSTypeRegistry1.hasNamespace("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList40 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList40, jSTypeArray39);
        com.google.javascript.rhino.Node node42 = jSTypeRegistry38.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList40);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList47 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList47, jSTypeArray46);
        com.google.javascript.rhino.Node node49 = jSTypeRegistry45.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList47);
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry38.createFunctionType(jSType43, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList47);
        boolean boolean51 = functionType50.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType50.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType55 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType50, jSType54);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray57 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry1.createFunctionType(jSType56, jSTypeArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertNotNull(parameterizedType55);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) ' ', "");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship5 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node1, node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        node4.setLength((int) (byte) 10);
        boolean boolean7 = node4.isBreak();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        node10.setJSType(jSType11);
        boolean boolean13 = node10.isStringKey();
        node4.addChildrenToBack(node10);
        com.google.javascript.rhino.Node node16 = node4.getAncestor(51);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = node16.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection17 = jSDocInfo16.getAuthors();
        boolean boolean18 = jSDocInfo16.hasBaseType();
        functionType13.setPropertyJSDocInfo("Unknown class name", jSDocInfo16);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = functionType13.getParentScope();
        boolean boolean21 = objectType20.canBeCalled();
        boolean boolean22 = objectType20.isUnknownType();
        boolean boolean23 = objectType20.isStringObjectType();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strCollection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        node4.setLength((int) (byte) 10);
        boolean boolean7 = node4.isFor();
        com.google.javascript.rhino.Node[] nodeArray9 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(48, nodeArray9, (int) (short) 0, (int) ' ');
        node12.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray16 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(48, nodeArray16, (int) (short) 0, (int) ' ');
        java.lang.String str20 = node19.getQualifiedName();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray26 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(48, nodeArray26, (int) (short) 0, (int) ' ');
        java.lang.String str30 = node29.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind31 = new com.google.javascript.jscomp.CodingConvention.Bind(node19, node24, node29);
        com.google.javascript.rhino.Node node32 = node12.useSourceInfoFromForTree(node24);
        node4.addChildrenToBack(node12);
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(48, nodeArray35, (int) (short) 0, (int) ' ');
        node38.setLength((int) (byte) 10);
        node38.setType((int) ' ');
        com.google.javascript.rhino.InputId inputId44 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList51 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList52 = objList51.asList();
        java.lang.Object[] objArray53 = objList52.toArray();
        boolean boolean54 = inputId44.equals((java.lang.Object) objList52);
        node38.setInputId(inputId44);
        com.google.javascript.rhino.Node node56 = node4.copyInformationFromForTree(node38);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        boolean boolean61 = node60.isString();
        com.google.javascript.rhino.Node node62 = node60.getLastSibling();
        boolean boolean63 = node60.isIf();
        boolean boolean64 = node60.isSetterDef();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node65 = node4.removeChildAfter(node60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeArray9);
        org.junit.Assert.assertNotNull(nodeArray16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeArray26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertNotNull(objList51);
        org.junit.Assert.assertNotNull(objList52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        java.lang.Object[] objArray8 = objList7.toArray();
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(48, nodeArray10, (int) (short) 0, (int) ' ');
        java.lang.String str14 = node13.getQualifiedName();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray20 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(48, nodeArray20, (int) (short) 0, (int) ' ');
        java.lang.String str24 = node23.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind25 = new com.google.javascript.jscomp.CodingConvention.Bind(node13, node18, node23);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(48, nodeArray27, (int) (short) 0, (int) ' ');
        node30.setLength((int) (byte) 10);
        boolean boolean33 = node30.isGetProp();
        node18.addChildrenToBack(node30);
        boolean boolean35 = node30.isThis();
        boolean boolean36 = node30.isIn();
        com.google.javascript.rhino.Node node37 = node30.getFirstChild();
        com.google.javascript.rhino.Node[] nodeArray39 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(48, nodeArray39, (int) (short) 0, (int) ' ');
        node42.setLength((int) (byte) 10);
        boolean boolean45 = node42.isBreak();
        com.google.javascript.rhino.Node node46 = node42.getLastSibling();
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection48 = jSDocInfo47.getAuthors();
        boolean boolean49 = jSDocInfo47.hasBaseType();
        boolean boolean50 = jSDocInfo47.isDeprecated();
        boolean boolean51 = jSDocInfo47.isConsistentIdGenerator();
        node46.setJSDocInfo(jSDocInfo47);
        node30.addChildToFront(node46);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = objList7.add((java.lang.Object) node46);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeArray20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(nodeArray39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(strCollection48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList39 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList39, jSTypeArray38);
        com.google.javascript.rhino.Node node41 = jSTypeRegistry37.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList39);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList46 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList46, jSTypeArray45);
        com.google.javascript.rhino.Node node48 = jSTypeRegistry44.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList46);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry37.createFunctionType(jSType42, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList46);
        boolean boolean50 = functionType49.isNativeObjectType();
        boolean boolean51 = functionType49.isTemplateType();
        com.google.javascript.rhino.jstype.JSType jSType52 = functionType27.forceResolve(errorReporter35, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType49);
        boolean boolean53 = jSType52.isNoObjectType();
        boolean boolean54 = jSType52.isBooleanValueType();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jSType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        node7.setJSType(jSType8);
        com.google.javascript.rhino.Node node10 = node4.useSourceInfoIfMissingFrom(node7);
        node4.putBooleanProp(52, true);
        boolean boolean14 = node4.isCase();
        boolean boolean15 = node4.isGetterDef();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = node4.toStringTree();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 48");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList38 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList38, jSTypeArray37);
        com.google.javascript.rhino.Node node40 = jSTypeRegistry36.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList38);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList45 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList45, jSTypeArray44);
        com.google.javascript.rhino.Node node47 = jSTypeRegistry43.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList45);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry36.createFunctionType(jSType41, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList45);
        com.google.javascript.rhino.Node node49 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList45);
        com.google.javascript.rhino.jstype.ObjectType objectType50 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList54 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList54, jSTypeArray53);
        com.google.javascript.rhino.Node node56 = jSTypeRegistry52.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList54);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.Node node63 = jSTypeRegistry59.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry52.createFunctionType(jSType57, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean65 = functionType64.isNativeObjectType();
        int int66 = functionType64.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray69 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList70 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList70, jSTypeArray69);
        com.google.javascript.rhino.Node node72 = jSTypeRegistry68.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList70);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList77 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList77, jSTypeArray76);
        com.google.javascript.rhino.Node node79 = jSTypeRegistry75.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList77);
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry68.createFunctionType(jSType73, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList77);
        boolean boolean81 = functionType80.isNativeObjectType();
        boolean boolean82 = functionType80.hasImplementedInterfaces();
        boolean boolean83 = functionType80.isGlobalThisType();
        functionType64.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType80);
        com.google.javascript.rhino.jstype.JSType jSType85 = objectType50.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType80);
        boolean boolean86 = objectType50.hasDisplayName();
        com.google.javascript.rhino.Node node87 = objectType50.getRootNode();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(objectType50);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(jSTypeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jSType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(node87);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node[] nodeArray3 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(48, nodeArray3, (int) (short) 0, (int) ' ');
        node6.setLength((int) (byte) 10);
        boolean boolean9 = node6.isLabelName();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(1, node6, 45, (int) (short) -1);
        boolean boolean13 = node12.hasMoreThanOneChild();
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(48, nodeArray15, (int) (short) 0, (int) ' ');
        java.lang.String str19 = node18.getQualifiedName();
        com.google.javascript.rhino.Node node20 = node12.copyInformationFrom(node18);
        typePosition0.setItem(node18);
        int int22 = typePosition0.getPositionOnStartLine();
        int int23 = typePosition0.getStartLine();
        // The following exception was thrown during execution in test generation
        try {
            typePosition0.setPositionInformation(47, (-1), (int) (short) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 47?end-line: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.lang.String str5 = node4.getQualifiedName();
        node4.setIsSyntheticBlock(true);
        com.google.javascript.rhino.InputId inputId9 = new com.google.javascript.rhino.InputId("hi!");
        node4.setInputId(inputId9);
        int int11 = node4.getSourceOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = node4.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 48");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry1.getType("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList41 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList41, jSTypeArray40);
        com.google.javascript.rhino.Node node43 = jSTypeRegistry39.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList41);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList48 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList48, jSTypeArray47);
        com.google.javascript.rhino.Node node50 = jSTypeRegistry46.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList48);
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry39.createFunctionType(jSType44, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList48);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList55 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList55, jSTypeArray54);
        com.google.javascript.rhino.Node node57 = jSTypeRegistry53.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList55);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList62 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList62, jSTypeArray61);
        com.google.javascript.rhino.Node node64 = jSTypeRegistry60.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList62);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry53.createFunctionType(jSType58, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList62);
        boolean boolean66 = functionType65.isNativeObjectType();
        boolean boolean67 = functionType65.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType72 = jSTypeRegistry39.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType65, "", "()", 51, 47);
        com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry39.getType("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType75 = jSTypeRegistry39.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType75, "java.io.IOException: hi!", "Unknown class name", 0, 0);
        jSTypeRegistry1.forwardDeclareType("()");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative83 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry1.getNativeFunctionType(jSTypeNative83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNull(jSType36);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(jSType80);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = null;
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(48, nodeArray4, (int) (short) 0, (int) ' ');
        java.util.Set<java.lang.String> strSet8 = node7.getDirectives();
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(48, nodeArray10, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        node16.setJSType(jSType17);
        com.google.javascript.rhino.Node node19 = node13.useSourceInfoIfMissingFrom(node16);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship20 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node7, node13);
        com.google.javascript.rhino.Node[] nodeArray22 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(48, nodeArray22, (int) (short) 0, (int) ' ');
        java.lang.String str26 = node25.getQualifiedName();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(48, nodeArray32, (int) (short) 0, (int) ' ');
        java.lang.String str36 = node35.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind37 = new com.google.javascript.jscomp.CodingConvention.Bind(node25, node30, node35);
        boolean boolean38 = node25.isTypeOf();
        com.google.javascript.rhino.Node node39 = node25.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray41 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(48, nodeArray41, (int) (short) 0, (int) ' ');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node44.siblings();
        boolean boolean46 = node44.isAdd();
        boolean boolean47 = node44.isNoSideEffectsCall();
        boolean boolean48 = node44.isObjectLit();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(46, node1, node7, node39, node44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(nodeArray41);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList38 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList38, jSTypeArray37);
        com.google.javascript.rhino.Node node40 = jSTypeRegistry36.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList38);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList45 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList45, jSTypeArray44);
        com.google.javascript.rhino.Node node47 = jSTypeRegistry43.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList45);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry36.createFunctionType(jSType41, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList45);
        com.google.javascript.rhino.Node node49 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList45);
        com.google.javascript.rhino.jstype.ObjectType objectType50 = jSTypeRegistry1.createAnonymousObjectType();
        jSTypeRegistry1.forwardDeclareType("function (): {804674755}");
        jSTypeRegistry1.identifyNonNullableName("");
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(objectType50);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(31, 47, 47);
        node3.putIntProp(44, 46);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(2);
        // The following exception was thrown during execution in test generation
        try {
            node3.addChildBefore(node7, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(48, nodeArray5, (int) (short) 0, (int) ' ');
        boolean boolean9 = node8.isRegExp();
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(48, nodeArray11, (int) (short) 0, (int) ' ');
        node14.setLength((int) (byte) 10);
        node14.setType((int) ' ');
        com.google.javascript.rhino.Node node19 = node14.cloneNode();
        com.google.javascript.rhino.Node node20 = node8.useSourceInfoIfMissingFrom(node19);
        com.google.javascript.rhino.Node[] nodeArray22 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(48, nodeArray22, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        node28.setJSType(jSType29);
        com.google.javascript.rhino.Node node31 = node25.useSourceInfoIfMissingFrom(node28);
        com.google.javascript.rhino.Node node32 = node19.copyInformationFromForTree(node31);
        com.google.javascript.rhino.Node node33 = node3.srcref(node31);
        node33.setSourceEncodedPosition((int) (byte) 1);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition36 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        node40.setJSType(jSType41);
        int int43 = node40.getSideEffectFlags();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(16, node40, 52, 52);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString((int) ' ', "");
        java.lang.String str50 = com.google.javascript.jscomp.NodeUtil.getSourceName(node49);
        com.google.javascript.rhino.Node node51 = node40.useSourceInfoFromForTree(node49);
        typePosition36.setItem(node51);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node53 = node33.getChildBefore(node51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(node51);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray5 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList6 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList6, jSTypeArray5);
        com.google.javascript.rhino.Node node8 = jSTypeRegistry4.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList6);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList13 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList13, jSTypeArray12);
        com.google.javascript.rhino.Node node15 = jSTypeRegistry11.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList13);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry4.createFunctionType(jSType9, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList13);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList20 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList20, jSTypeArray19);
        com.google.javascript.rhino.Node node22 = jSTypeRegistry18.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList20);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList27 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList27, jSTypeArray26);
        com.google.javascript.rhino.Node node29 = jSTypeRegistry25.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList27);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry18.createFunctionType(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList27);
        boolean boolean31 = functionType30.isNativeObjectType();
        boolean boolean32 = functionType30.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType37 = jSTypeRegistry4.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType30, "", "()", 51, 47);
        boolean boolean39 = jSTypeRegistry4.hasNamespace("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray42 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList43 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList43, jSTypeArray42);
        com.google.javascript.rhino.Node node45 = jSTypeRegistry41.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList43);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList50 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList50, jSTypeArray49);
        com.google.javascript.rhino.Node node52 = jSTypeRegistry48.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList50);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry41.createFunctionType(jSType46, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList50);
        boolean boolean54 = functionType53.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType53.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType58 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType53, jSType57);
        java.lang.Iterable iterable59 = parameterizedType58.getCtorImplementedInterfaces();
        int int60 = parameterizedType58.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType61 = parameterizedType58.collapseUnion();
        com.google.javascript.rhino.Node node63 = parameterizedType58.getPropertyNode("function (): {2090026542}");
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType58, "function (): {1306230942}", "hi!", (int) (byte) 1, 35);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative69 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry2.getNativeFunctionType(jSTypeNative69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSTypeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(jSType56);
        org.junit.Assert.assertNotNull(parameterizedType58);
        org.junit.Assert.assertNotNull(iterable59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(jSType61);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(jSType68);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection17 = jSDocInfo16.getAuthors();
        boolean boolean18 = jSDocInfo16.hasBaseType();
        functionType13.setPropertyJSDocInfo("Unknown class name", jSDocInfo16);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = functionType13.getParentScope();
        com.google.javascript.rhino.jstype.ObjectType objectType21 = functionType13.getParentScope();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList26 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList26, jSTypeArray25);
        com.google.javascript.rhino.Node node28 = jSTypeRegistry24.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList26);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList33 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList33, jSTypeArray32);
        com.google.javascript.rhino.Node node35 = jSTypeRegistry31.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList33);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry24.createFunctionType(jSType29, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList33);
        boolean boolean37 = functionType36.isNativeObjectType();
        boolean boolean38 = functionType36.hasImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection41 = jSDocInfo40.getAuthors();
        boolean boolean42 = jSDocInfo40.hasBaseType();
        boolean boolean43 = jSDocInfo40.isDeprecated();
        functionType36.setPropertyJSDocInfo("hi!", jSDocInfo40);
        com.google.javascript.rhino.Node[] nodeArray46 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(48, nodeArray46, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        node52.setJSType(jSType53);
        com.google.javascript.rhino.Node node55 = node49.useSourceInfoIfMissingFrom(node52);
        boolean boolean56 = functionType13.defineSynthesizedProperty("JSDocInfo", (com.google.javascript.rhino.jstype.JSType) functionType36, node55);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node57 = node55.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strCollection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(strCollection41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(nodeArray46);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.lang.Class<?> wildcardClass0 = null;
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(48, nodeArray2, (int) (short) 0, (int) ' ');
        java.lang.String str6 = node5.getQualifiedName();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(48, nodeArray12, (int) (short) 0, (int) ' ');
        java.lang.String str16 = node15.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind17 = new com.google.javascript.jscomp.CodingConvention.Bind(node5, node10, node15);
        com.google.javascript.rhino.Node[] nodeArray19 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(48, nodeArray19, (int) (short) 0, (int) ' ');
        node22.setLength((int) (byte) 10);
        boolean boolean25 = node22.isGetProp();
        node10.addChildrenToBack(node22);
        boolean boolean27 = node22.isLabelName();
        java.lang.Class<?> wildcardClass28 = node22.getClass();
        com.google.common.collect.ImmutableList<java.lang.Object> objList35 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList36 = objList35.asList();
        java.lang.Class<?> wildcardClass37 = objList35.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.Class<?>> wildcardClassList38 = com.google.common.collect.ImmutableList.of(wildcardClass0, wildcardClass28, wildcardClass37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 0");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(nodeArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(objList35);
        org.junit.Assert.assertNotNull(objList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.lang.String str5 = node4.getQualifiedName();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(48, nodeArray11, (int) (short) 0, (int) ' ');
        java.lang.String str15 = node14.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind16 = new com.google.javascript.jscomp.CodingConvention.Bind(node4, node9, node14);
        com.google.javascript.rhino.Node[] nodeArray18 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(48, nodeArray18, (int) (short) 0, (int) ' ');
        node21.setLength((int) (byte) 10);
        boolean boolean24 = node21.isGetProp();
        node9.addChildrenToBack(node21);
        boolean boolean26 = node21.isThis();
        boolean boolean27 = node21.isIn();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        node30.setJSType(jSType31);
        com.google.javascript.rhino.Node[] nodeArray34 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(48, nodeArray34, (int) (short) 0, (int) ' ');
        node37.setLength((int) (byte) 10);
        boolean boolean40 = node37.isFor();
        com.google.javascript.rhino.Node[] nodeArray42 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(48, nodeArray42, (int) (short) 0, (int) ' ');
        node45.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray49 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(48, nodeArray49, (int) (short) 0, (int) ' ');
        java.lang.String str53 = node52.getQualifiedName();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray59 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(48, nodeArray59, (int) (short) 0, (int) ' ');
        java.lang.String str63 = node62.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind64 = new com.google.javascript.jscomp.CodingConvention.Bind(node52, node57, node62);
        com.google.javascript.rhino.Node node65 = node45.useSourceInfoFromForTree(node57);
        node37.addChildrenToBack(node45);
        com.google.javascript.rhino.Node[] nodeArray68 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(48, nodeArray68, (int) (short) 0, (int) ' ');
        node71.setLength((int) (byte) 10);
        node71.setType((int) ' ');
        com.google.javascript.rhino.InputId inputId77 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList84 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList85 = objList84.asList();
        java.lang.Object[] objArray86 = objList85.toArray();
        boolean boolean87 = inputId77.equals((java.lang.Object) objList85);
        node71.setInputId(inputId77);
        com.google.javascript.rhino.Node node89 = node37.copyInformationFromForTree(node71);
        boolean boolean90 = node71.isThrow();
        node30.addChildToFront(node71);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node92 = node21.getChildBefore(node71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(nodeArray18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeArray34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(nodeArray42);
        org.junit.Assert.assertNotNull(nodeArray49);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(nodeArray59);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(nodeArray68);
        org.junit.Assert.assertNotNull(objList84);
        org.junit.Assert.assertNotNull(objList85);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray86), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        java.lang.Object[] objArray8 = objList7.toArray();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 4, (int) '4', 47);
        com.google.javascript.rhino.Node node13 = node12.getLastSibling();
        boolean boolean14 = node13.isGetElem();
        double double15 = node13.getDouble();
        boolean boolean16 = objList7.equals((java.lang.Object) node13);
        // The following exception was thrown during execution in test generation
        try {
            node13.setSideEffectFlags(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(48, nodeArray2, (int) (short) 0, (int) ' ');
        node5.setLength((int) (byte) 10);
        boolean boolean8 = node5.isLabelName();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(1, node5, 45, (int) (short) -1);
        boolean boolean12 = node11.hasMoreThanOneChild();
        com.google.javascript.rhino.Node[] nodeArray14 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(48, nodeArray14, (int) (short) 0, (int) ' ');
        java.lang.String str18 = node17.getQualifiedName();
        com.google.javascript.rhino.Node node19 = node11.copyInformationFrom(node17);
        // The following exception was thrown during execution in test generation
        try {
            node17.setString("function (): {721034181}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 48");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeArray14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(48, nodeArray2, (int) (short) 0, (int) ' ');
        node5.setLength((int) (byte) 10);
        boolean boolean8 = node5.isLabelName();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(1, node5, 45, (int) (short) -1);
        boolean boolean12 = node11.hasMoreThanOneChild();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = node11.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList7 = com.google.common.collect.ImmutableList.of(booleanLiteralSet0, booleanLiteralSet1, booleanLiteralSet2, booleanLiteralSet3, booleanLiteralSet5, booleanLiteralSet6);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList15 = com.google.common.collect.ImmutableList.of(booleanLiteralSet8, booleanLiteralSet9, booleanLiteralSet10, booleanLiteralSet11, booleanLiteralSet13, booleanLiteralSet14);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet18 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList23 = com.google.common.collect.ImmutableList.of(booleanLiteralSet16, booleanLiteralSet17, booleanLiteralSet18, booleanLiteralSet19, booleanLiteralSet21, booleanLiteralSet22);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList26 = com.google.common.collect.ImmutableList.of(booleanLiteralSet1, booleanLiteralSet8, booleanLiteralSet16, booleanLiteralSet24, booleanLiteralSet25);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet28 = booleanLiteralSet16.intersection(booleanLiteralSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet2 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet2.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet3 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet3.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet5 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet5.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet6 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet6.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertNotNull(booleanLiteralSetList7);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet8 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet8.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet10 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet10.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet11 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet11.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet13 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet13.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet14 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet14.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertNotNull(booleanLiteralSetList15);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet16 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet16.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet17 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet17.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet18 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet18.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet19 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet19.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet21 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet21.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet22 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet22.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertNotNull(booleanLiteralSetList23);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet24 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet24.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet25 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet25.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(booleanLiteralSetList26);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.lang.String str5 = node4.getQualifiedName();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(48, nodeArray11, (int) (short) 0, (int) ' ');
        java.lang.String str15 = node14.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind16 = new com.google.javascript.jscomp.CodingConvention.Bind(node4, node9, node14);
        node4.putBooleanProp(10, true);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        boolean boolean24 = node23.isString();
        com.google.javascript.rhino.Node node25 = node23.getLastSibling();
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(48, nodeArray27, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        node33.setJSType(jSType34);
        com.google.javascript.rhino.Node node36 = node30.useSourceInfoIfMissingFrom(node33);
        node33.setSourceEncodedPositionForTree(10);
        com.google.javascript.rhino.Node node39 = node25.useSourceInfoFrom(node33);
        com.google.javascript.rhino.Node[] nodeArray41 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(48, nodeArray41, (int) (short) 0, (int) ' ');
        boolean boolean45 = node44.isRegExp();
        com.google.javascript.rhino.Node[] nodeArray47 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(48, nodeArray47, (int) (short) 0, (int) ' ');
        node50.setLength((int) (byte) 10);
        node50.setType((int) ' ');
        com.google.javascript.rhino.Node node55 = node50.cloneNode();
        com.google.javascript.rhino.Node node56 = node44.useSourceInfoIfMissingFrom(node55);
        com.google.javascript.jscomp.CodingConvention.Bind bind57 = new com.google.javascript.jscomp.CodingConvention.Bind(node4, node25, node55);
        com.google.javascript.rhino.Node[] nodeArray59 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(48, nodeArray59, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        node65.setJSType(jSType66);
        com.google.javascript.rhino.Node node68 = node62.useSourceInfoIfMissingFrom(node65);
        node62.putBooleanProp(52, true);
        boolean boolean72 = node62.isAssignAdd();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node73 = node25.getChildBefore(node62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeArray41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodeArray47);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(nodeArray59);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node[] nodeArray3 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(48, nodeArray3, (int) (short) 0, (int) ' ');
        node6.setLength((int) (byte) 10);
        boolean boolean9 = node6.isLabelName();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(1, node6, 45, (int) (short) -1);
        boolean boolean13 = node12.hasMoreThanOneChild();
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(48, nodeArray15, (int) (short) 0, (int) ' ');
        java.lang.String str19 = node18.getQualifiedName();
        com.google.javascript.rhino.Node node20 = node12.copyInformationFrom(node18);
        typePosition0.setItem(node18);
        int int22 = typePosition0.getPositionOnStartLine();
        // The following exception was thrown during execution in test generation
        try {
            typePosition0.setPositionInformation(29, (int) (short) -1, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 29?end-line: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType13.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType17 = functionType13.getTypeOfThis();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList22 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList22, jSTypeArray21);
        com.google.javascript.rhino.Node node24 = jSTypeRegistry20.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList22);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList29 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList29, jSTypeArray28);
        com.google.javascript.rhino.Node node31 = jSTypeRegistry27.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry20.createFunctionType(jSType25, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList29);
        com.google.javascript.rhino.jstype.FunctionType functionType33 = functionType32.getOwnerFunction();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec35 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("unknown");
        com.google.javascript.rhino.Node[] nodeArray37 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(48, nodeArray37, (int) (short) 0, (int) ' ');
        node40.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(48, nodeArray44, (int) (short) 0, (int) ' ');
        java.lang.String str48 = node47.getQualifiedName();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray54 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(48, nodeArray54, (int) (short) 0, (int) ' ');
        java.lang.String str58 = node57.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind59 = new com.google.javascript.jscomp.CodingConvention.Bind(node47, node52, node57);
        com.google.javascript.rhino.Node node60 = node40.useSourceInfoFromForTree(node52);
        com.google.javascript.rhino.Node node61 = assertionFunctionSpec35.getAssertedParam(node60);
        boolean boolean62 = objectType17.defineDeclaredProperty("", (com.google.javascript.rhino.jstype.JSType) functionType32, node60);
        boolean boolean63 = functionType32.isEmptyType();
        boolean boolean64 = functionType32.isNativeObjectType();
        com.google.javascript.rhino.Node node66 = functionType32.getPropertyNode("hi!");
        com.google.javascript.rhino.Node node67 = functionType32.getRootNode();
        functionType32.clearResolved();
        boolean boolean69 = functionType32.hasAnyTemplate();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertNull(functionType33);
        org.junit.Assert.assertNotNull(nodeArray37);
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeArray54);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList39 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList39, jSTypeArray38);
        com.google.javascript.rhino.Node node41 = jSTypeRegistry37.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList39);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList46 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList46, jSTypeArray45);
        com.google.javascript.rhino.Node node48 = jSTypeRegistry44.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList46);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry37.createFunctionType(jSType42, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList46);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList53 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList53, jSTypeArray52);
        com.google.javascript.rhino.Node node55 = jSTypeRegistry51.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList53);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList60 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList60, jSTypeArray59);
        com.google.javascript.rhino.Node node62 = jSTypeRegistry58.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry51.createFunctionType(jSType56, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList60);
        boolean boolean64 = functionType63.isNativeObjectType();
        boolean boolean65 = functionType63.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType70 = jSTypeRegistry37.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType63, "", "()", 51, 47);
        boolean boolean72 = jSTypeRegistry37.hasNamespace("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray75 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList76 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList76, jSTypeArray75);
        com.google.javascript.rhino.Node node78 = jSTypeRegistry74.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList76);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter80 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry81 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter80);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray82 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList83 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList83, jSTypeArray82);
        com.google.javascript.rhino.Node node85 = jSTypeRegistry81.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList83);
        com.google.javascript.rhino.jstype.FunctionType functionType86 = jSTypeRegistry74.createFunctionType(jSType79, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList83);
        boolean boolean87 = functionType86.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType89 = functionType86.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType90 = null;
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType91 = jSTypeRegistry37.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType86, jSType90);
        java.lang.Iterable iterable92 = parameterizedType91.getCtorImplementedInterfaces();
        int int93 = parameterizedType91.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType94 = parameterizedType91.collapseUnion();
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry1.overwriteDeclaredType("Named type with empty name component", (com.google.javascript.rhino.jstype.JSType) parameterizedType91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(jSType70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSTypeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(jSTypeArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(jSType89);
        org.junit.Assert.assertNotNull(parameterizedType91);
        org.junit.Assert.assertNotNull(iterable92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(jSType94);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.lang.String[] strArray8 = new java.lang.String[] { "()", "Named type with empty name component", "Named type with empty name component", "Named type with empty name component", "InputId: hi!", "InputId: hi!", "()", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        strSet9.clear();
        com.google.common.collect.ImmutableList<java.lang.Object> objList18 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList19 = objList18.asList();
        java.lang.Object[] objArray20 = objList19.toArray();
        com.google.common.collect.UnmodifiableIterator<java.lang.Object> objItor21 = objList19.iterator();
        com.google.common.collect.ImmutableList<java.lang.Object> objList22 = objList19.asList();
        java.lang.Object[] objArray23 = objList22.toArray();
        com.google.common.collect.ImmutableList<java.lang.Object> objList30 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        java.util.stream.Stream<java.lang.Object> objStream31 = objList30.stream();
        int int33 = objList30.indexOf((java.lang.Object) 100);
        com.google.javascript.rhino.Node[] nodeArray36 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(48, nodeArray36, (int) (short) 0, (int) ' ');
        node39.setLength((int) (byte) 10);
        boolean boolean42 = node39.isFor();
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(48, nodeArray44, (int) (short) 0, (int) ' ');
        node47.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray51 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(48, nodeArray51, (int) (short) 0, (int) ' ');
        java.lang.String str55 = node54.getQualifiedName();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray61 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(48, nodeArray61, (int) (short) 0, (int) ' ');
        java.lang.String str65 = node64.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind66 = new com.google.javascript.jscomp.CodingConvention.Bind(node54, node59, node64);
        com.google.javascript.rhino.Node node67 = node47.useSourceInfoFromForTree(node59);
        node39.addChildrenToBack(node47);
        com.google.javascript.rhino.Node[] nodeArray70 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(48, nodeArray70, (int) (short) 0, (int) ' ');
        java.lang.String str74 = node73.getQualifiedName();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray80 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node(48, nodeArray80, (int) (short) 0, (int) ' ');
        java.lang.String str84 = node83.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind85 = new com.google.javascript.jscomp.CodingConvention.Bind(node73, node78, node83);
        boolean boolean86 = node73.isTypeOf();
        boolean boolean87 = node73.isBlock();
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node(40, node39, node73);
        java.lang.String str89 = com.google.javascript.jscomp.NodeUtil.getSourceName(node39);
        boolean boolean90 = objList30.equals((java.lang.Object) str89);
        boolean boolean91 = objList22.equals((java.lang.Object) objList30);
        boolean boolean92 = strSet9.retainAll((java.util.Collection<java.lang.Object>) objList22);
        boolean boolean93 = strSet9.isEmpty();
        strSet9.clear();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objList18);
        org.junit.Assert.assertNotNull(objList19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertNotNull(objItor21);
        org.junit.Assert.assertNotNull(objList22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertNotNull(objList30);
        org.junit.Assert.assertNotNull(objStream31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(nodeArray36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNotNull(nodeArray51);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(nodeArray61);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(nodeArray70);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(nodeArray80);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str1 = stringPosition0.getItem();
        int int2 = stringPosition0.getPositionOnEndLine();
        int int3 = stringPosition0.getPositionOnEndLine();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("function (): {250556602}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList38 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList38, jSTypeArray37);
        com.google.javascript.rhino.Node node40 = jSTypeRegistry36.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList38);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList45 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList45, jSTypeArray44);
        com.google.javascript.rhino.Node node47 = jSTypeRegistry43.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList45);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry36.createFunctionType(jSType41, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList45);
        com.google.javascript.rhino.Node node49 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList45);
        com.google.javascript.rhino.jstype.ObjectType objectType50 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList54 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList54, jSTypeArray53);
        com.google.javascript.rhino.Node node56 = jSTypeRegistry52.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList54);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.Node node63 = jSTypeRegistry59.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry52.createFunctionType(jSType57, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean65 = functionType64.isNativeObjectType();
        int int66 = functionType64.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray69 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList70 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList70, jSTypeArray69);
        com.google.javascript.rhino.Node node72 = jSTypeRegistry68.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList70);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList77 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList77, jSTypeArray76);
        com.google.javascript.rhino.Node node79 = jSTypeRegistry75.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList77);
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry68.createFunctionType(jSType73, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList77);
        boolean boolean81 = functionType80.isNativeObjectType();
        boolean boolean82 = functionType80.hasImplementedInterfaces();
        boolean boolean83 = functionType80.isGlobalThisType();
        functionType64.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType80);
        com.google.javascript.rhino.jstype.JSType jSType85 = objectType50.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType80);
        java.lang.Iterable iterable86 = functionType80.getCtorImplementedInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType87 = functionType80.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(objectType50);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(jSTypeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jSType85);
        org.junit.Assert.assertNotNull(iterable86);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry1.getType("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList41 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList41, jSTypeArray40);
        com.google.javascript.rhino.Node node43 = jSTypeRegistry39.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList41);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList48 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList48, jSTypeArray47);
        com.google.javascript.rhino.Node node50 = jSTypeRegistry46.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList48);
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry39.createFunctionType(jSType44, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList48);
        boolean boolean52 = functionType51.isNativeObjectType();
        boolean boolean53 = functionType51.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType51.findPropertyType("unknown");
        com.google.javascript.rhino.jstype.EnumElementType enumElementType56 = functionType51.toMaybeEnumElementType();
        com.google.javascript.rhino.Node node57 = functionType51.getParametersNode();
        boolean boolean58 = functionType51.hasInstanceType();
        boolean boolean59 = functionType51.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType64 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType51, "function (): {2090026542}", "", 51, 0);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) 4, (int) '4', 47);
        com.google.javascript.rhino.Node node69 = node68.getLastSibling();
        boolean boolean70 = node68.isExprResult();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope72 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType73 = jSTypeRegistry1.createFromTypeNodes(node68, "function (): {1999720740}", jSTypeStaticScope72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected node in type expression: NUMBER 4.0 52");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNull(jSType36);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(jSType55);
        org.junit.Assert.assertNull(enumElementType56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(jSType64);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType13.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType17 = functionType13.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType18 = objectType17.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList22 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList22, jSTypeArray21);
        com.google.javascript.rhino.Node node24 = jSTypeRegistry20.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList22);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList29 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList29, jSTypeArray28);
        com.google.javascript.rhino.Node node31 = jSTypeRegistry27.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry20.createFunctionType(jSType25, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList29);
        boolean boolean33 = functionType32.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType35 = functionType32.findPropertyType("Unknown class name");
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = functionType32.getOwnPropertyJSDocInfo("Named type with empty name component");
        boolean boolean38 = objectType17.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType32);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable39 = functionType32.getImplementedInterfaces();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNull(objectType18);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(jSType35);
        org.junit.Assert.assertNull(jSDocInfo37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable39);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        boolean boolean36 = jSTypeRegistry1.hasNamespace("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList40 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList40, jSTypeArray39);
        com.google.javascript.rhino.Node node42 = jSTypeRegistry38.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList40);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList47 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList47, jSTypeArray46);
        com.google.javascript.rhino.Node node49 = jSTypeRegistry45.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList47);
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry38.createFunctionType(jSType43, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList47);
        boolean boolean51 = functionType50.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType50.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType55 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType50, jSType54);
        java.lang.Iterable iterable56 = parameterizedType55.getCtorImplementedInterfaces();
        int int57 = parameterizedType55.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType58 = parameterizedType55.collapseUnion();
        com.google.javascript.rhino.Node node60 = parameterizedType55.getPropertyNode("function (): {2090026542}");
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList64 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList64, jSTypeArray63);
        com.google.javascript.rhino.Node node66 = jSTypeRegistry62.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList64);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray70 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList71 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList71, jSTypeArray70);
        com.google.javascript.rhino.Node node73 = jSTypeRegistry69.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList71);
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry62.createFunctionType(jSType67, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList71);
        boolean boolean75 = functionType74.isNativeObjectType();
        boolean boolean76 = functionType74.hasImplementedInterfaces();
        boolean boolean77 = functionType74.isGlobalThisType();
        parameterizedType55.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType74);
        java.lang.Iterable iterable79 = functionType74.getCtorImplementedInterfaces();
        boolean boolean81 = functionType74.isPropertyTypeDeclared("function (): ?");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable82 = functionType74.getAllImplementedInterfaces();
        boolean boolean83 = functionType74.isUnknownType();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertNotNull(parameterizedType55);
        org.junit.Assert.assertNotNull(iterable56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(jSTypeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(iterable79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4, (int) '4', 47);
        com.google.javascript.rhino.Node node4 = node3.getLastSibling();
        boolean boolean5 = node4.isGetElem();
        boolean boolean6 = node4.isDelProp();
        boolean boolean7 = node4.isSwitch();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("Named type with empty name component");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode6 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry1.setResolveMode(resolveMode6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(48, nodeArray10, (int) (short) 0, (int) ' ');
        java.lang.String str14 = node13.getQualifiedName();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray20 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(48, nodeArray20, (int) (short) 0, (int) ' ');
        java.lang.String str24 = node23.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind25 = new com.google.javascript.jscomp.CodingConvention.Bind(node13, node18, node23);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(48, nodeArray27, (int) (short) 0, (int) ' ');
        node30.setLength((int) (byte) 10);
        boolean boolean33 = node30.isGetProp();
        node18.addChildrenToBack(node30);
        boolean boolean35 = node30.isThis();
        boolean boolean36 = node30.isIn();
        boolean boolean37 = node30.isTry();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable38 = node30.siblings();
        boolean boolean39 = node30.isFromExterns();
        com.google.javascript.rhino.Node[] nodeArray41 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(48, nodeArray41, (int) (short) 0, (int) ' ');
        node44.setLength((int) (byte) 10);
        boolean boolean47 = node44.isBreak();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        node50.setJSType(jSType51);
        boolean boolean53 = node50.isStringKey();
        node44.addChildrenToBack(node50);
        node50.setOptionalArg(false);
        com.google.javascript.rhino.Node node57 = node30.copyInformationFrom(node50);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry1.createInterfaceType("", node50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + resolveMode6 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode6.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeArray20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(nodeIterable38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(nodeArray41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node57);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(48, nodeArray2, (int) (short) 0, (int) ' ');
        node5.setLength((int) (byte) 10);
        boolean boolean8 = node5.isFor();
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(48, nodeArray10, (int) (short) 0, (int) ' ');
        node13.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(48, nodeArray17, (int) (short) 0, (int) ' ');
        java.lang.String str21 = node20.getQualifiedName();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(48, nodeArray27, (int) (short) 0, (int) ' ');
        java.lang.String str31 = node30.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind32 = new com.google.javascript.jscomp.CodingConvention.Bind(node20, node25, node30);
        com.google.javascript.rhino.Node node33 = node13.useSourceInfoFromForTree(node25);
        node5.addChildrenToBack(node13);
        com.google.javascript.rhino.Node[] nodeArray36 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(48, nodeArray36, (int) (short) 0, (int) ' ');
        java.lang.String str40 = node39.getQualifiedName();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray46 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(48, nodeArray46, (int) (short) 0, (int) ' ');
        java.lang.String str50 = node49.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind51 = new com.google.javascript.jscomp.CodingConvention.Bind(node39, node44, node49);
        boolean boolean52 = node39.isTypeOf();
        boolean boolean53 = node39.isBlock();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(40, node5, node39);
        java.lang.String str55 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        boolean boolean56 = node5.isFromExterns();
        java.lang.Appendable appendable57 = null;
        // The following exception was thrown during execution in test generation
        try {
            node5.appendStringTree(appendable57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 48");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeArray36);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeArray46);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray5 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList6 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList6, jSTypeArray5);
        com.google.javascript.rhino.Node node8 = jSTypeRegistry4.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList6);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList13 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList13, jSTypeArray12);
        com.google.javascript.rhino.Node node15 = jSTypeRegistry11.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList13);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry4.createFunctionType(jSType9, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList13);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList20 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList20, jSTypeArray19);
        com.google.javascript.rhino.Node node22 = jSTypeRegistry18.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList20);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList27 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList27, jSTypeArray26);
        com.google.javascript.rhino.Node node29 = jSTypeRegistry25.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList27);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry18.createFunctionType(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList27);
        boolean boolean31 = functionType30.isNativeObjectType();
        boolean boolean32 = functionType30.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType37 = jSTypeRegistry4.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType30, "", "()", 51, 47);
        com.google.javascript.rhino.jstype.JSType jSType39 = jSTypeRegistry4.getType("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType40 = jSTypeRegistry4.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList44 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList44, jSTypeArray43);
        com.google.javascript.rhino.Node node46 = jSTypeRegistry42.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList44);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList51 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList51, jSTypeArray50);
        com.google.javascript.rhino.Node node53 = jSTypeRegistry49.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList51);
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry42.createFunctionType(jSType47, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList51);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray57 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList58 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList58, jSTypeArray57);
        com.google.javascript.rhino.Node node60 = jSTypeRegistry56.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList58);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList65 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList65, jSTypeArray64);
        com.google.javascript.rhino.Node node67 = jSTypeRegistry63.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList65);
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry56.createFunctionType(jSType61, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList65);
        boolean boolean69 = functionType68.isNativeObjectType();
        boolean boolean70 = functionType68.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry42.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType68, "", "()", 51, 47);
        boolean boolean76 = functionType68.matchesInt32Context();
        boolean boolean77 = functionType68.isFunctionPrototypeType();
        com.google.javascript.rhino.ErrorReporter errorReporter78 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry79 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter78);
        jSTypeRegistry79.setLastGeneration(true);
        com.google.javascript.rhino.jstype.ObjectType objectType82 = jSTypeRegistry79.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter83);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray85 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList86 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList86, jSTypeArray85);
        com.google.javascript.rhino.Node node88 = jSTypeRegistry84.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList86);
        com.google.javascript.rhino.jstype.JSType jSType89 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter90 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry91 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter90);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray92 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList93 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList93, jSTypeArray92);
        com.google.javascript.rhino.Node node95 = jSTypeRegistry91.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList93);
        com.google.javascript.rhino.jstype.FunctionType functionType96 = jSTypeRegistry84.createFunctionType(jSType89, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList93);
        com.google.javascript.rhino.jstype.JSType jSType97 = jSTypeRegistry4.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.ObjectType) functionType68, (com.google.javascript.rhino.jstype.JSType) objectType82, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList93);
        com.google.javascript.rhino.Node node98 = jSTypeRegistry2.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList93);
        // The following exception was thrown during execution in test generation
        try {
            double double99 = node98.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PARAM_LIST is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType37);
        org.junit.Assert.assertNull(jSType39);
        org.junit.Assert.assertNotNull(objectType40);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertNotNull(jSTypeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objectType82);
        org.junit.Assert.assertNotNull(jSTypeArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(jSTypeArray92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertNotNull(functionType96);
        org.junit.Assert.assertNotNull(jSType97);
        org.junit.Assert.assertNotNull(node98);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        boolean boolean36 = jSTypeRegistry1.hasNamespace("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList40 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList40, jSTypeArray39);
        com.google.javascript.rhino.Node node42 = jSTypeRegistry38.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList40);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList47 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList47, jSTypeArray46);
        com.google.javascript.rhino.Node node49 = jSTypeRegistry45.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList47);
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry38.createFunctionType(jSType43, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList47);
        boolean boolean51 = functionType50.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType50.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType55 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType50, jSType54);
        java.lang.Iterable iterable56 = parameterizedType55.getCtorImplementedInterfaces();
        int int57 = parameterizedType55.getPropertiesCount();
        java.lang.String str58 = parameterizedType55.getReferenceName();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType59 = parameterizedType55.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.JSType jSType60 = parameterizedType55.getParameterType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean61 = jSType60.matchesInt32Context();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertNotNull(parameterizedType55);
        org.junit.Assert.assertNotNull(iterable56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(parameterizedType59);
        org.junit.Assert.assertNull(jSType60);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.setLastGeneration(true);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList9 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList9, jSTypeArray8);
        com.google.javascript.rhino.Node node11 = jSTypeRegistry7.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList9);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList16 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList16, jSTypeArray15);
        com.google.javascript.rhino.Node node18 = jSTypeRegistry14.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList16);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry7.createFunctionType(jSType12, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList16);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(48, nodeArray21, (int) (short) 0, (int) ' ');
        java.lang.String str25 = node24.getQualifiedName();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray31 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(48, nodeArray31, (int) (short) 0, (int) ' ');
        java.lang.String str35 = node34.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind36 = new com.google.javascript.jscomp.CodingConvention.Bind(node24, node29, node34);
        boolean boolean37 = node24.isTypeOf();
        boolean boolean38 = node24.isDebugger();
        functionType19.setSource(node24);
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry1.overwriteDeclaredType("Not declared as a type name", (com.google.javascript.rhino.jstype.JSType) functionType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeArray31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(54, "Unknown class name");
        boolean boolean3 = node2.isCall();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = node2.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 54");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(48, nodeArray2, (int) (short) 0, (int) ' ');
        node5.setLength((int) (byte) 10);
        boolean boolean8 = node5.isLabelName();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(1, node5, 45, (int) (short) -1);
        boolean boolean12 = node5.isReturn();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags14 = new com.google.javascript.rhino.Node.SideEffectFlags((int) (byte) -1);
        sideEffectFlags14.setMutatesGlobalState();
        boolean boolean16 = sideEffectFlags14.areAllFlagsSet();
        sideEffectFlags14.setAllFlags();
        sideEffectFlags14.setMutatesGlobalState();
        sideEffectFlags14.setThrows();
        // The following exception was thrown during execution in test generation
        try {
            node5.setSideEffectFlags(sideEffectFlags14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 48");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.util.Set<java.lang.String> strSet5 = node4.getDirectives();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        boolean boolean10 = node9.isCall();
        boolean boolean11 = node4.isEquivalentTo(node9);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile12 = node9.getStaticSourceFile();
        boolean boolean13 = node9.isStringKey();
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(staticSourceFile12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(48, nodeArray2, (int) (short) 0, (int) ' ');
        node5.setLength((int) (byte) 10);
        boolean boolean8 = node5.isBreak();
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(48, nodeArray10, (int) (short) 0, (int) ' ');
        node13.setLength((int) (byte) 10);
        boolean boolean16 = node13.isFor();
        com.google.javascript.rhino.Node[] nodeArray18 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(48, nodeArray18, (int) (short) 0, (int) ' ');
        node21.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray25 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(48, nodeArray25, (int) (short) 0, (int) ' ');
        java.lang.String str29 = node28.getQualifiedName();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(48, nodeArray35, (int) (short) 0, (int) ' ');
        java.lang.String str39 = node38.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind40 = new com.google.javascript.jscomp.CodingConvention.Bind(node28, node33, node38);
        com.google.javascript.rhino.Node node41 = node21.useSourceInfoFromForTree(node33);
        node13.addChildrenToBack(node21);
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(48, nodeArray44, (int) (short) 0, (int) ' ');
        node47.setLength((int) (byte) 10);
        node47.setType((int) ' ');
        com.google.javascript.rhino.InputId inputId53 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList60 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList61 = objList60.asList();
        java.lang.Object[] objArray62 = objList61.toArray();
        boolean boolean63 = inputId53.equals((java.lang.Object) objList61);
        node47.setInputId(inputId53);
        com.google.javascript.rhino.Node node65 = node13.copyInformationFromForTree(node47);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType66 = null;
        com.google.javascript.rhino.Node[] nodeArray68 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(48, nodeArray68, (int) (short) 0, (int) ' ');
        java.util.Set<java.lang.String> strSet72 = node71.getDirectives();
        com.google.javascript.rhino.Node[] nodeArray74 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(48, nodeArray74, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType81 = null;
        node80.setJSType(jSType81);
        com.google.javascript.rhino.Node node83 = node77.useSourceInfoIfMissingFrom(node80);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship84 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType66, node71, node77);
        com.google.javascript.rhino.Node node85 = node47.srcrefTree(node77);
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(52, node5, node47);
        com.google.javascript.rhino.Node node90 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        boolean boolean91 = node90.isString();
        com.google.javascript.rhino.Node node92 = node90.getLastSibling();
        int int93 = node92.getCharno();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection94 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node92);
        boolean boolean95 = node47.isEquivalentToTyped(node92);
        boolean boolean96 = node47.isAssign();
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeArray18);
        org.junit.Assert.assertNotNull(nodeArray25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNotNull(objList60);
        org.junit.Assert.assertNotNull(objList61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(nodeArray68);
        org.junit.Assert.assertNull(strSet72);
        org.junit.Assert.assertNotNull(nodeArray74);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 100 + "'", int93 == 100);
        org.junit.Assert.assertNotNull(nodeCollection94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType13.findPropertyType("Unknown class name");
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = functionType13.getOwnPropertyJSDocInfo("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType19 = functionType13.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSDocInfo18);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType13.findPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType17 = functionType13.getTypeOfThis();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList22 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList22, jSTypeArray21);
        com.google.javascript.rhino.Node node24 = jSTypeRegistry20.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList22);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList29 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList29, jSTypeArray28);
        com.google.javascript.rhino.Node node31 = jSTypeRegistry27.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry20.createFunctionType(jSType25, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList29);
        com.google.javascript.rhino.jstype.FunctionType functionType33 = functionType32.getOwnerFunction();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec35 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("unknown");
        com.google.javascript.rhino.Node[] nodeArray37 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(48, nodeArray37, (int) (short) 0, (int) ' ');
        node40.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(48, nodeArray44, (int) (short) 0, (int) ' ');
        java.lang.String str48 = node47.getQualifiedName();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray54 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(48, nodeArray54, (int) (short) 0, (int) ' ');
        java.lang.String str58 = node57.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind59 = new com.google.javascript.jscomp.CodingConvention.Bind(node47, node52, node57);
        com.google.javascript.rhino.Node node60 = node40.useSourceInfoFromForTree(node52);
        com.google.javascript.rhino.Node node61 = assertionFunctionSpec35.getAssertedParam(node60);
        boolean boolean62 = objectType17.defineDeclaredProperty("", (com.google.javascript.rhino.jstype.JSType) functionType32, node60);
        boolean boolean63 = functionType32.isEmptyType();
        boolean boolean64 = functionType32.isNativeObjectType();
        boolean boolean65 = functionType32.matchesNumberContext();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertNull(functionType33);
        org.junit.Assert.assertNotNull(nodeArray37);
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeArray54);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        node7.setJSType(jSType8);
        com.google.javascript.rhino.Node node10 = node4.useSourceInfoIfMissingFrom(node7);
        // The following exception was thrown during execution in test generation
        try {
            node7.setSideEffectFlags(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        boolean boolean4 = node3.isCall();
        // The following exception was thrown during execution in test generation
        try {
            node3.setSideEffectFlags(47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        boolean boolean15 = functionType13.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType17 = functionType13.findPropertyType("unknown");
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType13.getIndexType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = jSType18.matchesStringContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList38 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList38, jSTypeArray37);
        com.google.javascript.rhino.Node node40 = jSTypeRegistry36.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList38);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList45 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList45, jSTypeArray44);
        com.google.javascript.rhino.Node node47 = jSTypeRegistry43.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList45);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry36.createFunctionType(jSType41, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList45);
        com.google.javascript.rhino.Node node49 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList45);
        com.google.javascript.rhino.jstype.ObjectType objectType50 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList54 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList54, jSTypeArray53);
        com.google.javascript.rhino.Node node56 = jSTypeRegistry52.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList54);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.Node node63 = jSTypeRegistry59.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry52.createFunctionType(jSType57, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean65 = functionType64.isNativeObjectType();
        int int66 = functionType64.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray69 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList70 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList70, jSTypeArray69);
        com.google.javascript.rhino.Node node72 = jSTypeRegistry68.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList70);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList77 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList77, jSTypeArray76);
        com.google.javascript.rhino.Node node79 = jSTypeRegistry75.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList77);
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry68.createFunctionType(jSType73, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList77);
        boolean boolean81 = functionType80.isNativeObjectType();
        boolean boolean82 = functionType80.hasImplementedInterfaces();
        boolean boolean83 = functionType80.isGlobalThisType();
        functionType64.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType80);
        com.google.javascript.rhino.jstype.JSType jSType85 = objectType50.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType80);
        boolean boolean86 = functionType80.hasDisplayName();
        boolean boolean87 = functionType80.isEnumElementType();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(objectType50);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(jSTypeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jSType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry8.createFunctionType(jSType13, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        boolean boolean21 = functionType20.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType26 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType20, "java.io.IOException: hi!", "()", 47, (int) (short) 10);
        functionType20.clearCachedValues();
        boolean boolean28 = functionType20.isUnknownType();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(errorReporter6);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSType26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(48, nodeArray2, (int) (short) 0, (int) ' ');
        node5.setLength((int) (byte) 10);
        boolean boolean8 = node5.isBreak();
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(48, nodeArray10, (int) (short) 0, (int) ' ');
        node13.setLength((int) (byte) 10);
        boolean boolean16 = node13.isFor();
        com.google.javascript.rhino.Node[] nodeArray18 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(48, nodeArray18, (int) (short) 0, (int) ' ');
        node21.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray25 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(48, nodeArray25, (int) (short) 0, (int) ' ');
        java.lang.String str29 = node28.getQualifiedName();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(48, nodeArray35, (int) (short) 0, (int) ' ');
        java.lang.String str39 = node38.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind40 = new com.google.javascript.jscomp.CodingConvention.Bind(node28, node33, node38);
        com.google.javascript.rhino.Node node41 = node21.useSourceInfoFromForTree(node33);
        node13.addChildrenToBack(node21);
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(48, nodeArray44, (int) (short) 0, (int) ' ');
        node47.setLength((int) (byte) 10);
        node47.setType((int) ' ');
        com.google.javascript.rhino.InputId inputId53 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList60 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList61 = objList60.asList();
        java.lang.Object[] objArray62 = objList61.toArray();
        boolean boolean63 = inputId53.equals((java.lang.Object) objList61);
        node47.setInputId(inputId53);
        com.google.javascript.rhino.Node node65 = node13.copyInformationFromForTree(node47);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType66 = null;
        com.google.javascript.rhino.Node[] nodeArray68 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(48, nodeArray68, (int) (short) 0, (int) ' ');
        java.util.Set<java.lang.String> strSet72 = node71.getDirectives();
        com.google.javascript.rhino.Node[] nodeArray74 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(48, nodeArray74, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType81 = null;
        node80.setJSType(jSType81);
        com.google.javascript.rhino.Node node83 = node77.useSourceInfoIfMissingFrom(node80);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship84 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType66, node71, node77);
        com.google.javascript.rhino.Node node85 = node47.srcrefTree(node77);
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(52, node5, node47);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable87 = node47.children();
        com.google.javascript.rhino.Node node90 = com.google.javascript.rhino.Node.newString((int) ' ', "");
        com.google.javascript.rhino.Node node91 = node90.getLastSibling();
        com.google.javascript.rhino.Node node94 = com.google.javascript.rhino.Node.newString((int) ' ', "");
        com.google.javascript.rhino.Node node95 = node94.getLastSibling();
        com.google.javascript.rhino.Node node96 = node90.useSourceInfoIfMissingFrom(node95);
        boolean boolean97 = node95.isInc();
        boolean boolean98 = node47.isEquivalentToTyped(node95);
        boolean boolean99 = node95.isOptionalArg();
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeArray18);
        org.junit.Assert.assertNotNull(nodeArray25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNotNull(objList60);
        org.junit.Assert.assertNotNull(objList61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(nodeArray68);
        org.junit.Assert.assertNull(strSet72);
        org.junit.Assert.assertNotNull(nodeArray74);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(nodeIterable87);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertNotNull(node96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(48, nodeArray2, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node6 = node5.cloneNode();
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(0, node5, node7, 8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        jSTypeRegistry2.incrementGeneration();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.Node node9 = jSTypeRegistry5.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList14 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList14, jSTypeArray13);
        com.google.javascript.rhino.Node node16 = jSTypeRegistry12.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList14);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry5.createFunctionType(jSType10, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList14);
        boolean boolean18 = functionType17.isNativeObjectType();
        boolean boolean19 = functionType17.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType21 = functionType17.findPropertyType("unknown");
        boolean boolean22 = functionType17.isBooleanObjectType();
        jSTypeRegistry2.resolveTypesInScope((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType17);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType25 = functionType17.getGreatestSubtype(jSType24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode6 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry1.setResolveMode(resolveMode6);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode8 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode9 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode> resolveModeList10 = com.google.common.collect.ImmutableList.of(resolveMode6, resolveMode8, resolveMode9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList14 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList14, jSTypeArray13);
        com.google.javascript.rhino.Node node16 = jSTypeRegistry12.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList14);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode17 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry12.setResolveMode(resolveMode17);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode19 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode20 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode> resolveModeList21 = com.google.common.collect.ImmutableList.of(resolveMode17, resolveMode19, resolveMode20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.Node node27 = jSTypeRegistry23.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode28 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry23.setResolveMode(resolveMode28);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode30 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode31 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode> resolveModeList32 = com.google.common.collect.ImmutableList.of(resolveMode28, resolveMode30, resolveMode31);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode33 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode> resolveModeList34 = com.google.common.collect.ImmutableList.of(resolveMode9, resolveMode19, resolveMode30, resolveMode33);
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + resolveMode6 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode6.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode8 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode8.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode9 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode9.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertNotNull(resolveModeList10);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + resolveMode17 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode17.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode19 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode19.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode20 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode20.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertNotNull(resolveModeList21);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + resolveMode28 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode28.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode30 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode30.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode31 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode31.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertNotNull(resolveModeList32);
        org.junit.Assert.assertTrue("'" + resolveMode33 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode33.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(resolveModeList34);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(31, 48, (int) (short) 1);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList14 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList15 = objList14.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList16 = objList14.asList();
        com.google.javascript.rhino.InputId inputId18 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList25 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList26 = objList25.asList();
        java.lang.Object[] objArray27 = objList26.toArray();
        boolean boolean28 = inputId18.equals((java.lang.Object) objList26);
        com.google.common.collect.ImmutableList<java.lang.Object> objList35 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList36 = objList35.asList();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableCollection<java.lang.Object>> objCollectionList37 = com.google.common.collect.ImmutableList.of((com.google.common.collect.ImmutableCollection<java.lang.Object>) objList14, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList26, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList35);
        boolean boolean39 = objList26.equals((java.lang.Object) (byte) 10);
        boolean boolean40 = objList6.containsAll((java.util.Collection<java.lang.Object>) objList26);
        com.google.javascript.rhino.Node[] nodeArray42 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(48, nodeArray42, (int) (short) 0, (int) ' ');
        int int46 = objList26.indexOf((java.lang.Object) 48);
        java.lang.Object obj47 = null;
        int int48 = objList26.lastIndexOf(obj47);
        // The following exception was thrown during execution in test generation
        try {
            objList26.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objList14);
        org.junit.Assert.assertNotNull(objList15);
        org.junit.Assert.assertNotNull(objList16);
        org.junit.Assert.assertNotNull(objList25);
        org.junit.Assert.assertNotNull(objList26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objList35);
        org.junit.Assert.assertNotNull(objList36);
        org.junit.Assert.assertNotNull(objCollectionList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(nodeArray42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        boolean boolean14 = functionType13.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType13.findPropertyType("Unknown class name");
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = functionType13.getOwnPropertyJSDocInfo("Named type with empty name component");
        int int19 = functionType13.getMinArguments();
        boolean boolean20 = functionType13.hasImplementedInterfaces();
        boolean boolean21 = functionType13.hasImplementedInterfaces();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSDocInfo18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.createFunctionType(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry15.createFunctionType(jSType20, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean28 = functionType27.isNativeObjectType();
        boolean boolean29 = functionType27.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27, "", "()", 51, 47);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry1.getType("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList42 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList42, jSTypeArray41);
        com.google.javascript.rhino.Node node44 = jSTypeRegistry40.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList42);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList49 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList49, jSTypeArray48);
        com.google.javascript.rhino.Node node51 = jSTypeRegistry47.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList49);
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry40.createFunctionType(jSType45, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList49);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList56 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList56, jSTypeArray55);
        com.google.javascript.rhino.Node node58 = jSTypeRegistry54.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList56);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList63 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList63, jSTypeArray62);
        com.google.javascript.rhino.Node node65 = jSTypeRegistry61.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry54.createFunctionType(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList63);
        boolean boolean67 = functionType66.isNativeObjectType();
        boolean boolean68 = functionType66.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType73 = jSTypeRegistry40.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType66, "", "()", 51, 47);
        com.google.javascript.rhino.jstype.JSType jSType74 = objectType37.resolve(errorReporter38, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType66);
        boolean boolean75 = functionType66.isConstructor();
        boolean boolean76 = functionType66.isUnknownType();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNull(jSType36);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(jSTypeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType73);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = objList6.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList8 = objList6.asList();
        com.google.javascript.rhino.InputId inputId10 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList17 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList18 = objList17.asList();
        java.lang.Object[] objArray19 = objList18.toArray();
        boolean boolean20 = inputId10.equals((java.lang.Object) objList18);
        com.google.common.collect.ImmutableList<java.lang.Object> objList27 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList28 = objList27.asList();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableCollection<java.lang.Object>> objCollectionList29 = com.google.common.collect.ImmutableList.of((com.google.common.collect.ImmutableCollection<java.lang.Object>) objList6, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList18, (com.google.common.collect.ImmutableCollection<java.lang.Object>) objList27);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility30 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        int int31 = objList18.indexOf((java.lang.Object) visibility30);
        java.lang.Object[] objArray32 = objList18.toArray();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        java.lang.Object[] objArray34 = new java.lang.Object[] { ternaryValue33 };
        java.util.ArrayList<java.lang.Object> objList35 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList35, objArray34);
        java.util.List<java.lang.Object> objList39 = objList35.subList(0, (int) (byte) 1);
        boolean boolean40 = objList39.isEmpty();
        com.google.javascript.rhino.JSDocInfo.Marker marker41 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition42 = marker41.getName();
        boolean boolean43 = objList39.add((java.lang.Object) stringPosition42);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = objList18.retainAll((java.util.Collection<java.lang.Object>) objList39);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objList8);
        org.junit.Assert.assertNotNull(objList17);
        org.junit.Assert.assertNotNull(objList18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objList27);
        org.junit.Assert.assertNotNull(objList28);
        org.junit.Assert.assertNotNull(objCollectionList29);
        org.junit.Assert.assertTrue("'" + visibility30 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility30.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[unknown]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[unknown]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(stringPosition42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        node4.setLength((int) (byte) 10);
        boolean boolean7 = node4.isFor();
        com.google.javascript.rhino.Node[] nodeArray9 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(48, nodeArray9, (int) (short) 0, (int) ' ');
        node12.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray16 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(48, nodeArray16, (int) (short) 0, (int) ' ');
        java.lang.String str20 = node19.getQualifiedName();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray26 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(48, nodeArray26, (int) (short) 0, (int) ' ');
        java.lang.String str30 = node29.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind31 = new com.google.javascript.jscomp.CodingConvention.Bind(node19, node24, node29);
        com.google.javascript.rhino.Node node32 = node12.useSourceInfoFromForTree(node24);
        node4.addChildrenToBack(node12);
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(48, nodeArray35, (int) (short) 0, (int) ' ');
        node38.setLength((int) (byte) 10);
        node38.setType((int) ' ');
        com.google.javascript.rhino.InputId inputId44 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList51 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList52 = objList51.asList();
        java.lang.Object[] objArray53 = objList52.toArray();
        boolean boolean54 = inputId44.equals((java.lang.Object) objList52);
        node38.setInputId(inputId44);
        com.google.javascript.rhino.Node node56 = node4.copyInformationFromForTree(node38);
        java.util.Set<java.lang.String> strSet57 = node4.getDirectives();
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeArray9);
        org.junit.Assert.assertNotNull(nodeArray16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeArray26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertNotNull(objList51);
        org.junit.Assert.assertNotNull(objList52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[ , 0, 0, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNull(strSet57);
    }
}
