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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) 'a', node1, node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        com.google.javascript.rhino.Node node0 = null;
        java.lang.String str1 = com.google.javascript.jscomp.NodeUtil.getSourceName(node0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] { node1 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0, nodeArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray2);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isComma();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node4.siblings();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = node1.removeChildAfter(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeIterable5);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node4.siblings();
        int int6 = node4.getSideEffectFlags();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.siblings();
        node4.addChildToBack(node8);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("");
        boolean boolean15 = node14.isComma();
        boolean boolean16 = node14.isOnlyModifiesThisCall();
        boolean boolean17 = node14.isSetterDef();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.siblings();
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] { node2, node8, node12, node14, node19 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(15, nodeArray21, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeIterable5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertNotNull(nodeArray21);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        int int3 = node1.getSideEffectFlags();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        node1.addChildToBack(node5);
        // The following exception was thrown during execution in test generation
        try {
            node1.setDouble((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: STRING  is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList10 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "Not declared as a type name", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "Not declared as a type name", (java.lang.Comparable<java.lang.String>) "true", (java.lang.Comparable<java.lang.String>) "Not declared as a type name", strComparable6, (java.lang.Comparable<java.lang.String>) "true", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "Not declared as a type name");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 6");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        int int3 = node1.getSideEffectFlags();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        node1.addChildToBack(node5);
        node5.setIsSyntheticBlock(true);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = node5.getExistingIntProp((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        boolean boolean3 = node1.isAdd();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        int int7 = node5.getSideEffectFlags();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.siblings();
        node5.addChildToBack(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable14 = node13.siblings();
        int int15 = node13.getSideEffectFlags();
        boolean boolean16 = node13.isLabelName();
        com.google.javascript.rhino.Node node17 = node5.copyInformationFromForTree(node13);
        boolean boolean18 = node1.isEquivalentTo(node13);
        // The following exception was thrown during execution in test generation
        try {
            node1.setSideEffectFlags((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got STRING");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        boolean boolean3 = node1.isAdd();
        com.google.javascript.rhino.Node node4 = node1.getNext();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = node4.isDefaultCase();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry1.registerPropertyOnType("", jSType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        boolean boolean3 = node1.isAdd();
        com.google.javascript.rhino.Node node4 = node1.getNext();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = node4.checkTreeEquals(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        int int3 = node1.getSideEffectFlags();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        node1.addChildToBack(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        boolean boolean10 = node9.isComma();
        boolean boolean11 = node9.isOnlyModifiesThisCall();
        boolean boolean12 = node9.isSetterDef();
        com.google.javascript.rhino.Node node13 = node5.useSourceInfoFrom(node9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        int int3 = node1.getSideEffectFlags();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        node1.addChildToBack(node5);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo8 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        boolean boolean3 = node2.isComma();
        node2.setType(1);
        com.google.javascript.rhino.Node node7 = node2.getAncestor((int) (short) 100);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node12.siblings();
        int int14 = node12.getSideEffectFlags();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.siblings();
        node12.addChildToBack(node16);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("");
        boolean boolean21 = node20.isComma();
        boolean boolean22 = node20.isOnlyModifiesThisCall();
        boolean boolean23 = node20.isSetterDef();
        com.google.javascript.rhino.Node node24 = node16.useSourceInfoFrom(node20);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(50, node7, node10, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeIterable13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isComma();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("");
        node4.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        boolean boolean8 = node4.isSyntheticBlock();
        boolean boolean9 = node1.isEquivalentToTyped(node4);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!");
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable14 = node13.siblings();
        // The following exception was thrown during execution in test generation
        try {
            node1.addChildBefore(node11, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeIterable14);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isComma();
        node1.setType(1);
        com.google.javascript.rhino.Node node6 = node1.getAncestor((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            node6.setVarArgs(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags3 = null;
        // The following exception was thrown during execution in test generation
        try {
            node1.setSideEffectFlags(sideEffectFlags3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        boolean boolean5 = objectType4.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType7 = objectType4.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType7, "");
        boolean boolean10 = jSType7.isRecordType();
        com.google.javascript.rhino.jstype.JSType jSType12 = jSType7.findPropertyType("Unknown class name");
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSType12);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        int int3 = node1.getSideEffectFlags();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        node1.addChildToBack(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.siblings();
        int int11 = node9.getSideEffectFlags();
        boolean boolean12 = node9.isLabelName();
        com.google.javascript.rhino.Node node13 = node1.copyInformationFromForTree(node9);
        // The following exception was thrown during execution in test generation
        try {
            node9.setDouble((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: STRING  is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = jSTypeRegistry11.createAnonymousObjectType();
        boolean boolean13 = objectType12.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType15 = objectType12.findPropertyType("true");
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry1.overwriteDeclaredType("Not declared as a type name", (com.google.javascript.rhino.jstype.JSType) objectType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        java.lang.String str37 = jSDocInfoList26.toString();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.ObjectType objectType40 = jSTypeRegistry39.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType41 = objectType40.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable42 = objectType41.getCtorExtendedInterfaces();
        boolean boolean44 = objectType41.removeProperty("hi!");
        boolean boolean45 = jSDocInfoList26.contains((java.lang.Object) objectType41);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSTypeRegistry47.createAnonymousObjectType();
        boolean boolean49 = objectType48.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType51 = objectType48.findPropertyType("true");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType.TypePair typePair52 = objectType41.getTypesUnderInequality(jSType51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]" + "'", str37, "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertNotNull(objectType40);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(objectTypeIterable42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(jSType51);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (short) 100, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = node3.getExistingIntProp((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        boolean boolean10 = functionType8.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType11 = functionType8.autoboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType12 = functionType8.autoboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType13 = functionType8.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable3 = node2.siblings();
        namePosition0.setItem(node2);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable5 = node2.getAncestors();
        java.util.Iterator<com.google.javascript.rhino.Node> nodeItor6 = ancestorIterable5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = nodeItor6.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeIterable3);
        org.junit.Assert.assertNotNull(ancestorIterable5);
        org.junit.Assert.assertNotNull(nodeItor6);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        int int3 = node1.getSideEffectFlags();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        node1.addChildToBack(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.siblings();
        int int11 = node9.getSideEffectFlags();
        boolean boolean12 = node9.isLabelName();
        com.google.javascript.rhino.Node node13 = node1.copyInformationFromForTree(node9);
        boolean boolean14 = node13.isNoSideEffectsCall();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags15 = null;
        // The following exception was thrown during execution in test generation
        try {
            node13.setSideEffectFlags(sideEffectFlags15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        boolean boolean37 = jSDocInfoList17.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean41 = jSDocInfo40.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean43 = jSDocInfo42.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean45 = jSDocInfo44.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList46 = com.google.common.collect.ImmutableList.of(jSDocInfo38, jSDocInfo39, jSDocInfo40, jSDocInfo42, jSDocInfo44);
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean50 = jSDocInfo49.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean52 = jSDocInfo51.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean54 = jSDocInfo53.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList55 = com.google.common.collect.ImmutableList.of(jSDocInfo47, jSDocInfo48, jSDocInfo49, jSDocInfo51, jSDocInfo53);
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean59 = jSDocInfo58.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo60 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean61 = jSDocInfo60.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo62 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean63 = jSDocInfo62.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList64 = com.google.common.collect.ImmutableList.of(jSDocInfo56, jSDocInfo57, jSDocInfo58, jSDocInfo60, jSDocInfo62);
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo67 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean68 = jSDocInfo67.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean70 = jSDocInfo69.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo71 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean72 = jSDocInfo71.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList73 = com.google.common.collect.ImmutableList.of(jSDocInfo65, jSDocInfo66, jSDocInfo67, jSDocInfo69, jSDocInfo71);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList74 = com.google.common.collect.ImmutableList.of(jSDocInfoList46, jSDocInfoList55, jSDocInfoList64, jSDocInfoList73);
        java.lang.String str75 = jSDocInfoList64.toString();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.ObjectType objectType78 = jSTypeRegistry77.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType79 = objectType78.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable80 = objectType79.getCtorExtendedInterfaces();
        boolean boolean82 = objectType79.removeProperty("hi!");
        boolean boolean83 = jSDocInfoList64.contains((java.lang.Object) objectType79);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean84 = jSDocInfoList17.remove((java.lang.Object) objectType79);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList64);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList73);
        org.junit.Assert.assertNotNull(jSDocInfoListList74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]" + "'", str75, "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertNotNull(objectType78);
        org.junit.Assert.assertNotNull(objectType79);
        org.junit.Assert.assertNotNull(objectTypeIterable80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = jSTypeRegistry7.createAnonymousObjectType();
        boolean boolean9 = objectType8.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType11 = objectType8.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType13 = jSTypeRegistry5.getGreatestSubtypeWithProperty(jSType11, "");
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry1.overwriteDeclaredType("", jSType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNotNull(jSType13);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        java.lang.String str9 = functionType8.getDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = functionType8.getOwnerFunction();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean18 = jSDocInfo17.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList19 = com.google.common.collect.ImmutableList.of(jSDocInfo11, jSDocInfo12, jSDocInfo13, jSDocInfo15, jSDocInfo17);
        boolean boolean20 = jSDocInfo11.isNoCompile();
        java.lang.String str21 = jSDocInfo11.getVersion();
        functionType8.setJSDocInfo(jSDocInfo11);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = functionType8.getOwnerFunction();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.jstype.ObjectType objectType28 = jSTypeRegistry27.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType29 = objectType28.getParentScope();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry25.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType28, node31);
        boolean boolean34 = functionType32.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType35 = functionType32.autoboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType36 = functionType32.autoboxesTo();
        boolean boolean38 = functionType32.removeProperty("");
        // The following exception was thrown during execution in test generation
        try {
            functionType23.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(functionType23);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType35);
        org.junit.Assert.assertNull(jSType36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable3 = node2.siblings();
        namePosition0.setItem(node2);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.siblings();
        int int8 = node6.getSideEffectFlags();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.siblings();
        node6.addChildToBack(node10);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("");
        boolean boolean15 = node14.isComma();
        boolean boolean16 = node14.isOnlyModifiesThisCall();
        boolean boolean17 = node14.isSetterDef();
        com.google.javascript.rhino.Node node18 = node10.useSourceInfoFrom(node14);
        boolean boolean19 = node14.isInc();
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        node14.setJSType(jSType20);
        boolean boolean22 = node14.isVarArgs();
        boolean boolean23 = node14.isParamList();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.siblings();
        int int27 = node25.getSideEffectFlags();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable30 = node29.siblings();
        node25.addChildToBack(node29);
        boolean boolean32 = node29.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder33 = node29.getJsDocBuilderForNode();
        boolean boolean34 = node29.isTrue();
        // The following exception was thrown during execution in test generation
        try {
            node2.addChildrenAfter(node14, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeIterable3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeIterable30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        int int3 = node1.getSideEffectFlags();
        boolean boolean4 = node1.isLabelName();
        boolean boolean5 = node1.hasChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node7.siblings();
        int int9 = node7.getSideEffectFlags();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node11.siblings();
        node7.addChildToBack(node11);
        boolean boolean14 = node11.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder15 = node11.getJsDocBuilderForNode();
        // The following exception was thrown during execution in test generation
        try {
            node1.addChildrenToFront(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeIterable8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder15);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = jSTypeRegistry1.createAnonymousObjectType();
        boolean boolean3 = objectType2.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType5 = objectType2.findPropertyType("true");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType7 = jSType5.getRestrictedTypeGivenToBooleanOutcome(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSType5);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("true");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (byte) 0, 1, 12);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node11.siblings();
        int int13 = node11.getSideEffectFlags();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.siblings();
        node11.addChildToBack(node15);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.siblings();
        int int21 = node19.getSideEffectFlags();
        boolean boolean22 = node19.isLabelName();
        com.google.javascript.rhino.Node node23 = node11.copyInformationFromForTree(node19);
        boolean boolean24 = node23.isNoSideEffectsCall();
        node23.putBooleanProp(50, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry1.createInterfaceType("true", node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        boolean boolean5 = node1.isSyntheticBlock();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node1.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile7 = null;
        node1.setStaticSourceFile(staticSourceFile7);
        // The following exception was thrown during execution in test generation
        try {
            node1.setDouble((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: unexpect prop id 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        int int3 = node1.getSideEffectFlags();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        node1.addChildToBack(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        boolean boolean10 = node9.isComma();
        boolean boolean11 = node9.isOnlyModifiesThisCall();
        boolean boolean12 = node9.isSetterDef();
        com.google.javascript.rhino.Node node13 = node5.useSourceInfoFrom(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("");
        boolean boolean16 = node15.isComma();
        boolean boolean17 = node15.isOnlyModifiesThisCall();
        boolean boolean18 = node15.isVarArgs();
        boolean boolean19 = node13.hasChild(node15);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = node15.useSourceInfoIfMissingFromForTree(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        boolean boolean10 = functionType8.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType11 = functionType8.autoboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType12 = jSType11.toObjectType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSType11);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        java.lang.String str9 = functionType8.getDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = functionType8.getOwnerFunction();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = jSTypeRegistry12.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = objectType13.getParentScope();
        boolean boolean15 = objectType13.isNoResolvedType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = functionType10.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(functionType10);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        java.lang.Object[] objArray37 = jSDocInfoList26.toArray();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = jSDocInfoList26.get(0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo41 = jSDocInfoList26.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertNotNull(jSDocInfo39);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable3 = node2.siblings();
        int int4 = node2.getSideEffectFlags();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.siblings();
        node2.addChildToBack(node6);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.siblings();
        int int12 = node10.getSideEffectFlags();
        boolean boolean13 = node10.isLabelName();
        com.google.javascript.rhino.Node node14 = node2.copyInformationFromForTree(node10);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(38, node2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = node15.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NAME is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeIterable3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = objectType2.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = objectType3.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType5 = objectType3.collapseUnion();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = objectType3.getImplicitPrototype();
        boolean boolean7 = objectType6.matchesNumberContext();
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(jSType5);
        org.junit.Assert.assertNotNull(objectType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        org.junit.Assert.assertNotNull(ternaryValue0);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = objectType2.getParentScope();
        boolean boolean4 = objectType2.isUnknownType();
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        int int0 = com.google.javascript.rhino.Node.SIDE_EFFECTS_FLAGS_MASK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 31 + "'", int0 == 31);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = jSTypeRegistry4.createAnonymousObjectType();
        jSTypeRegistry1.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType5);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = jSTypeRegistry8.createAnonymousObjectType();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSTypeRegistry17.createAnonymousObjectType();
        jSTypeRegistry14.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType18);
        com.google.javascript.rhino.jstype.JSType jSType20 = jSTypeRegistry8.createFromTypeNodes(node11, "", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType18);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode21 = null;
        jSTypeRegistry8.setResolveMode(resolveMode21);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("");
        boolean boolean27 = node26.isComma();
        node26.setType(1);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(15, node26);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSTypeRegistry32.createAnonymousObjectType();
        boolean boolean34 = objectType33.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType36 = objectType33.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean37 = objectType33.canBeCalled();
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSTypeRegistry8.createObjectType("Not declared as a type name", node26, objectType33);
        java.util.List<com.google.javascript.rhino.jstype.JSType> jSTypeList39 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry1.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType38, jSTypeList39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertNotNull(jSType20);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objectType38);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        int int0 = com.google.javascript.rhino.Node.INPUT_ID;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 53 + "'", int0 == 53);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSTypeRegistry10.createAnonymousObjectType();
        jSTypeRegistry7.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = jSTypeRegistry1.createFromTypeNodes(node4, "", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType11);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode14 = null;
        jSTypeRegistry1.setResolveMode(resolveMode14);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry1.getNativeFunctionType(jSTypeNative16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNotNull(jSType13);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        java.lang.Object[] objArray37 = jSDocInfoList26.toArray();
        boolean boolean39 = jSDocInfoList26.contains((java.lang.Object) "true");
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean44 = jSDocInfo43.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean46 = jSDocInfo45.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean48 = jSDocInfo47.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList49 = com.google.common.collect.ImmutableList.of(jSDocInfo41, jSDocInfo42, jSDocInfo43, jSDocInfo45, jSDocInfo47);
        int int51 = jSDocInfoList49.lastIndexOf((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = jSDocInfoList26.addAll((int) (byte) 1, (java.util.Collection<com.google.javascript.rhino.JSDocInfo>) jSDocInfoList49);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        java.lang.Object[] objArray37 = jSDocInfoList26.toArray();
        boolean boolean39 = jSDocInfoList26.equals((java.lang.Object) 'a');
        java.util.stream.Stream<com.google.javascript.rhino.JSDocInfo> jSDocInfoStream40 = jSDocInfoList26.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoList26.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSDocInfoStream40);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable3 = node2.siblings();
        namePosition0.setItem(node2);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable5 = node2.getAncestors();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node7.siblings();
        int int9 = node7.getSideEffectFlags();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node11.siblings();
        node7.addChildToBack(node11);
        boolean boolean14 = node11.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder15 = node11.getJsDocBuilderForNode();
        node11.addSuppression("()");
        node11.setString("");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition20 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.siblings();
        namePosition20.setItem(node22);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable25 = node22.getAncestors();
        int int26 = node22.getLineno();
        // The following exception was thrown during execution in test generation
        try {
            node2.addChildAfter(node11, node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeIterable3);
        org.junit.Assert.assertNotNull(ancestorIterable5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeIterable8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder15);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertNotNull(ancestorIterable25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        com.google.common.collect.ImmutableList.Builder<java.util.Iterator<com.google.javascript.rhino.Node>> nodeItorBuilder0 = new com.google.common.collect.ImmutableList.Builder<java.util.Iterator<com.google.javascript.rhino.Node>>();
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        boolean boolean5 = objectType4.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType7 = objectType4.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType7, "");
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = jSTypeRegistry13.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = objectType14.getParentScope();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry11.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType14, node17);
        java.lang.String str19 = functionType18.getDisplayName();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.siblings();
        int int23 = node21.getSideEffectFlags();
        boolean boolean24 = node21.isLabelName();
        boolean boolean25 = node21.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType18, node21);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry30.createAnonymousObjectType();
        boolean boolean32 = objectType31.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType34 = objectType31.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.getGreatestSubtypeWithProperty(jSType34, "");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSTypeRegistry40.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType42 = objectType41.getParentScope();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry38.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType41, node44);
        java.lang.String str46 = functionType45.getDisplayName();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.siblings();
        int int50 = node48.getSideEffectFlags();
        boolean boolean51 = node48.isLabelName();
        boolean boolean52 = node48.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry28.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType45, node48);
        java.lang.String str54 = functionType53.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSTypeRegistry56.createAnonymousObjectType();
        boolean boolean58 = objectType57.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType60 = objectType57.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean61 = objectType57.hasDisplayName();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair62 = functionType53.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry66.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType68 = objectType67.getParentScope();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry64.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType67, node70);
        boolean boolean73 = functionType71.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType71.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType71.getTypeOfThis();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet76 = objectType75.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79);
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSTypeRegistry80.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType82 = objectType81.getParentScope();
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry78.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType81, node84);
        java.lang.String str86 = functionType85.getDisplayName();
        boolean boolean87 = objectType75.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean88 = functionType85.hasCachedValues();
        int int89 = functionType85.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter90 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry91 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter90);
        com.google.javascript.rhino.jstype.ObjectType objectType92 = jSTypeRegistry91.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType93 = objectType92.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable94 = objectType93.getCtorExtendedInterfaces();
        boolean boolean95 = objectType93.isStringValueType();
        functionType85.setPrototypeBasedOn(objectType93);
        java.util.Set<java.lang.String> strSet97 = functionType85.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType98 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType53, (com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean99 = parameterizedType98.hasAnyTemplateInternal();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(typePair62);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet76 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet76.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertNotNull(objectType82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(objectType92);
        org.junit.Assert.assertNotNull(objectType93);
        org.junit.Assert.assertNotNull(objectTypeIterable94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(strSet97);
        org.junit.Assert.assertNotNull(parameterizedType98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("Unknown class name");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        boolean boolean3 = node1.isAdd();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        int int7 = node5.getSideEffectFlags();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.siblings();
        node5.addChildToBack(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable14 = node13.siblings();
        int int15 = node13.getSideEffectFlags();
        boolean boolean16 = node13.isLabelName();
        com.google.javascript.rhino.Node node17 = node5.copyInformationFromForTree(node13);
        boolean boolean18 = node1.isEquivalentTo(node13);
        boolean boolean19 = node1.isReturn();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = node1.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: STRING  is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable3 = node2.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = new com.google.javascript.rhino.JSTypeExpression(node2, "Not declared as a type name");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node7.siblings();
        int int9 = node7.getSideEffectFlags();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node11.siblings();
        node7.addChildToBack(node11);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("");
        boolean boolean16 = node15.isComma();
        boolean boolean17 = node15.isOnlyModifiesThisCall();
        boolean boolean18 = node15.isSetterDef();
        com.google.javascript.rhino.Node node19 = node11.useSourceInfoFrom(node15);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("");
        boolean boolean22 = node21.isComma();
        boolean boolean23 = node21.isOnlyModifiesThisCall();
        boolean boolean24 = node21.isVarArgs();
        boolean boolean25 = node19.hasChild(node21);
        int int27 = node19.getIntProp(32);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) '#');
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable32 = node31.siblings();
        int int33 = node31.getSideEffectFlags();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.siblings();
        node31.addChildToBack(node35);
        boolean boolean38 = node35.isOnlyModifiesThisCall();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (short) 100, node2, node19, node29, node35, 45, 54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeIterable3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeIterable8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeIterable32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(54);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        boolean boolean5 = objectType4.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType7 = objectType4.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType7, "");
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = jSTypeRegistry13.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = objectType14.getParentScope();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry11.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType14, node17);
        java.lang.String str19 = functionType18.getDisplayName();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.siblings();
        int int23 = node21.getSideEffectFlags();
        boolean boolean24 = node21.isLabelName();
        boolean boolean25 = node21.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType18, node21);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry30.createAnonymousObjectType();
        boolean boolean32 = objectType31.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType34 = objectType31.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.getGreatestSubtypeWithProperty(jSType34, "");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSTypeRegistry40.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType42 = objectType41.getParentScope();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry38.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType41, node44);
        java.lang.String str46 = functionType45.getDisplayName();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.siblings();
        int int50 = node48.getSideEffectFlags();
        boolean boolean51 = node48.isLabelName();
        boolean boolean52 = node48.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry28.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType45, node48);
        java.lang.String str54 = functionType53.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSTypeRegistry56.createAnonymousObjectType();
        boolean boolean58 = objectType57.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType60 = objectType57.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean61 = objectType57.hasDisplayName();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair62 = functionType53.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry66.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType68 = objectType67.getParentScope();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry64.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType67, node70);
        boolean boolean73 = functionType71.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType71.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType71.getTypeOfThis();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet76 = objectType75.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79);
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSTypeRegistry80.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType82 = objectType81.getParentScope();
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry78.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType81, node84);
        java.lang.String str86 = functionType85.getDisplayName();
        boolean boolean87 = objectType75.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean88 = functionType85.hasCachedValues();
        int int89 = functionType85.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter90 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry91 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter90);
        com.google.javascript.rhino.jstype.ObjectType objectType92 = jSTypeRegistry91.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType93 = objectType92.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable94 = objectType93.getCtorExtendedInterfaces();
        boolean boolean95 = objectType93.isStringValueType();
        functionType85.setPrototypeBasedOn(objectType93);
        java.util.Set<java.lang.String> strSet97 = functionType85.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType98 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType53, (com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean99 = parameterizedType98.isUnknownType();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(typePair62);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet76 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet76.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertNotNull(objectType82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(objectType92);
        org.junit.Assert.assertNotNull(objectType93);
        org.junit.Assert.assertNotNull(objectTypeIterable94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(strSet97);
        org.junit.Assert.assertNotNull(parameterizedType98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        boolean boolean5 = objectType4.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType7 = objectType4.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType7, "");
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = jSTypeRegistry13.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = objectType14.getParentScope();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry11.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType14, node17);
        java.lang.String str19 = functionType18.getDisplayName();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.siblings();
        int int23 = node21.getSideEffectFlags();
        boolean boolean24 = node21.isLabelName();
        boolean boolean25 = node21.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType18, node21);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeNativeArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(functionType26);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        jSDocInfo2.addSuppression("");
        java.lang.String str12 = jSDocInfo2.getDescriptionForParameter("");
        boolean boolean13 = jSDocInfo2.isExport();
        java.util.Set<java.lang.String> strSet14 = jSDocInfo2.getSuppressions();
        java.util.Iterator<java.lang.String> strItor15 = strSet14.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry19.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType21 = objectType20.getParentScope();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType20, node23);
        boolean boolean26 = functionType24.removeProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSTypeRegistry28.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType30 = objectType29.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = objectType30.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType32 = objectType30.collapseUnion();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry34.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = objectType35.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable37 = objectType36.getCtorExtendedInterfaces();
        boolean boolean39 = objectType36.removeProperty("hi!");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair40 = jSType32.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) objectType36);
        boolean boolean41 = functionType24.isSubtype((com.google.javascript.rhino.jstype.JSType) objectType36);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSTypeRegistry45.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType47 = objectType46.getParentScope();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry43.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType46, node49);
        boolean boolean52 = functionType50.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType50.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray54 = new com.google.javascript.rhino.jstype.ObjectType[] { objectType36, functionType50 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray55 = strSet14.toArray(objectTypeArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectTypeIterable31);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(objectTypeIterable37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(typePair40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertNotNull(objectTypeArray54);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry6.createAnonymousObjectType();
        boolean boolean8 = objectType7.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType10 = objectType7.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry4.getGreatestSubtypeWithProperty(jSType10, "");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = jSTypeRegistry14.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = objectType15.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = objectType16.getCtorExtendedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry19.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry22.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = objectType23.getParentScope();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry26.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType28 = objectType27.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable29 = objectType28.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType30 = objectType28.collapseUnion();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry34.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = objectType35.getParentScope();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry32.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType35, node38);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        functionType39.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo41);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] { objectType24, objectType28, functionType39 };
        com.google.javascript.rhino.Node node44 = jSTypeRegistry19.createParameters(jSTypeArray43);
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry4.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType16, jSTypeArray43);
        com.google.javascript.rhino.Node node46 = jSTypeRegistry1.createParameters(jSTypeArray43);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(jSType12);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertNotNull(objectTypeIterable29);
        org.junit.Assert.assertNotNull(jSType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertNotNull(node46);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        boolean boolean5 = objectType4.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType7 = objectType4.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType7, "");
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = jSTypeRegistry13.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = objectType14.getParentScope();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry11.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType14, node17);
        java.lang.String str19 = functionType18.getDisplayName();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.siblings();
        int int23 = node21.getSideEffectFlags();
        boolean boolean24 = node21.isLabelName();
        boolean boolean25 = node21.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType18, node21);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry30.createAnonymousObjectType();
        boolean boolean32 = objectType31.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType34 = objectType31.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.getGreatestSubtypeWithProperty(jSType34, "");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSTypeRegistry40.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType42 = objectType41.getParentScope();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry38.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType41, node44);
        java.lang.String str46 = functionType45.getDisplayName();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.siblings();
        int int50 = node48.getSideEffectFlags();
        boolean boolean51 = node48.isLabelName();
        boolean boolean52 = node48.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry28.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType45, node48);
        java.lang.String str54 = functionType53.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSTypeRegistry56.createAnonymousObjectType();
        boolean boolean58 = objectType57.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType60 = objectType57.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean61 = objectType57.hasDisplayName();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair62 = functionType53.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry66.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType68 = objectType67.getParentScope();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry64.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType67, node70);
        boolean boolean73 = functionType71.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType71.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType71.getTypeOfThis();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet76 = objectType75.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79);
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSTypeRegistry80.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType82 = objectType81.getParentScope();
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry78.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType81, node84);
        java.lang.String str86 = functionType85.getDisplayName();
        boolean boolean87 = objectType75.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean88 = functionType85.hasCachedValues();
        int int89 = functionType85.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter90 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry91 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter90);
        com.google.javascript.rhino.jstype.ObjectType objectType92 = jSTypeRegistry91.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType93 = objectType92.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable94 = objectType93.getCtorExtendedInterfaces();
        boolean boolean95 = objectType93.isStringValueType();
        functionType85.setPrototypeBasedOn(objectType93);
        java.util.Set<java.lang.String> strSet97 = functionType85.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType98 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType53, (com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean99 = parameterizedType98.matchesStringContext();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(typePair62);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet76 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet76.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertNotNull(objectType82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(objectType92);
        org.junit.Assert.assertNotNull(objectType93);
        org.junit.Assert.assertNotNull(objectTypeIterable94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(strSet97);
        org.junit.Assert.assertNotNull(parameterizedType98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        int int3 = node1.getSideEffectFlags();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        node1.addChildToBack(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.siblings();
        int int11 = node9.getSideEffectFlags();
        boolean boolean12 = node9.isLabelName();
        com.google.javascript.rhino.Node node13 = node1.copyInformationFromForTree(node9);
        java.lang.Object obj15 = node13.getProp(51);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = obj15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        jSDocInfo2.addSuppression("");
        java.lang.String str12 = jSDocInfo2.getDescriptionForParameter("");
        boolean boolean13 = jSDocInfo2.isExport();
        java.util.Set<java.lang.String> strSet14 = jSDocInfo2.getSuppressions();
        java.lang.String str16 = jSDocInfo2.getDescriptionForParameter("()");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isComma();
        node1.setType(1);
        com.google.javascript.rhino.Node node6 = node1.getAncestor((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = node6.getParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = jSTypeRegistry1.createAnonymousObjectType();
        boolean boolean3 = objectType2.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType5 = objectType2.getRestrictedTypeGivenToBooleanOutcome(true);
        java.lang.String str6 = jSType5.toAnnotationString();
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{}" + "'", str6, "{}");
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isComma();
        boolean boolean3 = node1.isOnlyModifiesThisCall();
        boolean boolean4 = node1.isSetterDef();
        boolean boolean5 = node1.isInstanceOf();
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        boolean boolean5 = objectType4.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType7 = objectType4.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType7, "");
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = jSTypeRegistry11.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = objectType12.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = objectType13.getCtorExtendedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry16.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry19.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType21 = objectType20.getParentScope();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry23.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType25 = objectType24.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable26 = objectType25.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType27 = objectType25.collapseUnion();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry31.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType33 = objectType32.getParentScope();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry29.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType32, node35);
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        functionType36.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo38);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] { objectType21, objectType25, functionType36 };
        com.google.javascript.rhino.Node node41 = jSTypeRegistry16.createParameters(jSTypeArray40);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType13, jSTypeArray40);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative43 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType44 = jSTypeRegistry1.getNativeObjectType(jSTypeNative43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectTypeIterable26);
        org.junit.Assert.assertNotNull(jSType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(functionType42);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) '#');
        boolean boolean2 = node1.isNumber();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable3 = node2.siblings();
        int int4 = node2.getSideEffectFlags();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.siblings();
        node2.addChildToBack(node6);
        boolean boolean9 = node6.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node6.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("");
        boolean boolean13 = node12.isComma();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("");
        node15.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        boolean boolean19 = node15.isSyntheticBlock();
        boolean boolean20 = node12.isEquivalentToTyped(node15);
        boolean boolean21 = node12.isTypeOf();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.siblings();
        int int25 = node23.getSideEffectFlags();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.siblings();
        node23.addChildToBack(node27);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("");
        boolean boolean32 = node31.isComma();
        boolean boolean33 = node31.isOnlyModifiesThisCall();
        boolean boolean34 = node31.isSetterDef();
        com.google.javascript.rhino.Node node35 = node27.useSourceInfoFrom(node31);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("");
        boolean boolean38 = node37.isComma();
        boolean boolean39 = node37.isOnlyModifiesThisCall();
        boolean boolean40 = node37.isVarArgs();
        boolean boolean41 = node35.hasChild(node37);
        int int43 = node35.getIntProp(32);
        boolean boolean44 = node35.isWhile();
        com.google.javascript.rhino.Node[] nodeArray45 = new com.google.javascript.rhino.Node[] { node6, node12, node35 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (short) 100, nodeArray45, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeIterable3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(nodeArray45);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        java.lang.Object[] objArray37 = jSDocInfoList26.toArray();
        int int38 = jSDocInfoList26.size();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry44.createAnonymousObjectType();
        jSTypeRegistry41.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType45);
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean50 = jSDocInfo49.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean52 = jSDocInfo51.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean54 = jSDocInfo53.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList55 = com.google.common.collect.ImmutableList.of(jSDocInfo47, jSDocInfo48, jSDocInfo49, jSDocInfo51, jSDocInfo53);
        jSDocInfo49.addSuppression("");
        java.lang.String str59 = jSDocInfo49.getDescriptionForParameter("");
        objectType45.setJSDocInfo(jSDocInfo49);
        boolean boolean61 = jSDocInfo49.isHidden();
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoList26.add(49, jSDocInfo49);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList55);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        functionType8.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo10);
        int int12 = functionType8.getMaxArguments();
        java.lang.String str13 = functionType8.getDisplayName();
        int int14 = functionType8.getMaxArguments();
        boolean boolean15 = functionType8.isArrayType();
        boolean boolean16 = functionType8.isInstanceType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType17 = functionType8.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable3 = node2.siblings();
        int int4 = node2.getSideEffectFlags();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.siblings();
        node2.addChildToBack(node6);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.siblings();
        int int12 = node10.getSideEffectFlags();
        boolean boolean13 = node10.isLabelName();
        com.google.javascript.rhino.Node node14 = node2.copyInformationFromForTree(node10);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(38, node2);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable19 = node18.siblings();
        int int20 = node18.getSideEffectFlags();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.siblings();
        node18.addChildToBack(node22);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node26.siblings();
        int int28 = node26.getSideEffectFlags();
        boolean boolean29 = node26.isLabelName();
        com.google.javascript.rhino.Node node30 = node18.copyInformationFromForTree(node26);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(38, node18);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable34 = node33.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression36 = new com.google.javascript.rhino.JSTypeExpression(node33, "Not declared as a type name");
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node38.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression41 = new com.google.javascript.rhino.JSTypeExpression(node38, "Not declared as a type name");
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression46 = new com.google.javascript.rhino.JSTypeExpression(node43, "Not declared as a type name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression51 = new com.google.javascript.rhino.JSTypeExpression(node48, "Not declared as a type name");
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable54 = node53.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression56 = new com.google.javascript.rhino.JSTypeExpression(node53, "Not declared as a type name");
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable59 = node58.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression61 = new com.google.javascript.rhino.JSTypeExpression(node58, "Not declared as a type name");
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable64 = node63.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression66 = new com.google.javascript.rhino.JSTypeExpression(node63, "Not declared as a type name");
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable69 = node68.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression71 = new com.google.javascript.rhino.JSTypeExpression(node68, "Not declared as a type name");
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable74 = node73.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression76 = new com.google.javascript.rhino.JSTypeExpression(node73, "Not declared as a type name");
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable79 = node78.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression81 = new com.google.javascript.rhino.JSTypeExpression(node78, "Not declared as a type name");
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable84 = node83.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression86 = new com.google.javascript.rhino.JSTypeExpression(node83, "Not declared as a type name");
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList87 = com.google.common.collect.ImmutableList.of(jSTypeExpression36, jSTypeExpression41, jSTypeExpression46, jSTypeExpression51, jSTypeExpression56, jSTypeExpression61, jSTypeExpression66, jSTypeExpression71, jSTypeExpression76, jSTypeExpression81, jSTypeExpression86);
        com.google.javascript.rhino.Node node88 = jSTypeExpression66.getRoot();
        int int89 = node88.getCharno();
        node88.setCharno(32);
        com.google.javascript.rhino.Node node92 = node31.copyInformationFrom(node88);
        // The following exception was thrown during execution in test generation
        try {
            node2.removeChild(node31);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeIterable3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeIterable19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeIterable27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeIterable34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(nodeIterable54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(nodeIterable59);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(nodeIterable64);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(nodeIterable69);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(nodeIterable74);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(nodeIterable79);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(nodeIterable84);
        org.junit.Assert.assertNotNull(jSTypeExpressionList87);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(node92);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        boolean boolean5 = objectType4.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType7 = objectType4.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType7, "");
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = jSTypeRegistry13.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = objectType14.getParentScope();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry11.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType14, node17);
        java.lang.String str19 = functionType18.getDisplayName();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.siblings();
        int int23 = node21.getSideEffectFlags();
        boolean boolean24 = node21.isLabelName();
        boolean boolean25 = node21.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType18, node21);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry30.createAnonymousObjectType();
        boolean boolean32 = objectType31.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType34 = objectType31.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.getGreatestSubtypeWithProperty(jSType34, "");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSTypeRegistry40.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType42 = objectType41.getParentScope();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry38.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType41, node44);
        java.lang.String str46 = functionType45.getDisplayName();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.siblings();
        int int50 = node48.getSideEffectFlags();
        boolean boolean51 = node48.isLabelName();
        boolean boolean52 = node48.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry28.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType45, node48);
        java.lang.String str54 = functionType53.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSTypeRegistry56.createAnonymousObjectType();
        boolean boolean58 = objectType57.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType60 = objectType57.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean61 = objectType57.hasDisplayName();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair62 = functionType53.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry66.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType68 = objectType67.getParentScope();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry64.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType67, node70);
        boolean boolean73 = functionType71.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType71.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType71.getTypeOfThis();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet76 = objectType75.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79);
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSTypeRegistry80.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType82 = objectType81.getParentScope();
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry78.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType81, node84);
        java.lang.String str86 = functionType85.getDisplayName();
        boolean boolean87 = objectType75.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean88 = functionType85.hasCachedValues();
        int int89 = functionType85.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter90 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry91 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter90);
        com.google.javascript.rhino.jstype.ObjectType objectType92 = jSTypeRegistry91.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType93 = objectType92.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable94 = objectType93.getCtorExtendedInterfaces();
        boolean boolean95 = objectType93.isStringValueType();
        functionType85.setPrototypeBasedOn(objectType93);
        java.util.Set<java.lang.String> strSet97 = functionType85.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType98 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType53, (com.google.javascript.rhino.jstype.JSType) functionType85);
        com.google.javascript.rhino.jstype.FunctionType functionType99 = parameterizedType98.getOwnerFunction();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(typePair62);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet76 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet76.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertNotNull(objectType82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(objectType92);
        org.junit.Assert.assertNotNull(objectType93);
        org.junit.Assert.assertNotNull(objectTypeIterable94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(strSet97);
        org.junit.Assert.assertNotNull(parameterizedType98);
        org.junit.Assert.assertNull(functionType99);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = jSTypeRegistry4.createAnonymousObjectType();
        jSTypeRegistry1.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType5);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = jSTypeRegistry11.createAnonymousObjectType();
        jSTypeRegistry8.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType12);
        boolean boolean14 = objectType12.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry16.createAnonymousObjectType();
        boolean boolean18 = objectType17.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType20 = objectType17.findPropertyType("true");
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry22.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = objectType23.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = objectType24.getCtorExtendedInterfaces();
        boolean boolean26 = objectType24.isStringValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry30.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.getParentScope();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry28.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType31, node34);
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = new com.google.javascript.rhino.JSDocInfo();
        functionType35.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo37);
        int int39 = functionType35.getMaxArguments();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSTypeRegistry41.createAnonymousObjectType();
        boolean boolean43 = objectType42.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType45 = objectType42.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSTypeRegistry47.createAnonymousObjectType();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSTypeRegistry56.createAnonymousObjectType();
        jSTypeRegistry53.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType57);
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry47.createFromTypeNodes(node50, "", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType57);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] { objectType12, objectType17, objectType24, functionType35, objectType42, objectType57 };
        com.google.javascript.rhino.Node node61 = jSTypeRegistry1.createParametersWithVarArgs(jSTypeArray60);
        jSTypeRegistry1.incrementGeneration();
        boolean boolean63 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative64 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry1.getNativeType(jSTypeNative64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        java.lang.Object[] objArray37 = jSDocInfoList26.toArray();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = jSDocInfoList26.get(0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo42 = jSDocInfoList26.set(12, jSDocInfo41);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertNotNull(jSDocInfo39);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        com.google.common.collect.ImmutableList.Builder<java.lang.CharSequence> charSequenceBuilder0 = new com.google.common.collect.ImmutableList.Builder<java.lang.CharSequence>();
        com.google.common.collect.ImmutableList.Builder<java.lang.CharSequence> charSequenceBuilder2 = charSequenceBuilder0.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList.Builder<java.lang.CharSequence> charSequenceBuilder4 = charSequenceBuilder0.add(charSequenceArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceBuilder2);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        boolean boolean3 = node1.isAdd();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        int int7 = node5.getSideEffectFlags();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.siblings();
        node5.addChildToBack(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable14 = node13.siblings();
        int int15 = node13.getSideEffectFlags();
        boolean boolean16 = node13.isLabelName();
        com.google.javascript.rhino.Node node17 = node5.copyInformationFromForTree(node13);
        boolean boolean18 = node1.isEquivalentTo(node13);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo19 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = node1.toString(true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: unexpect prop id 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSTypeRegistry10.createAnonymousObjectType();
        jSTypeRegistry7.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = jSTypeRegistry1.createFromTypeNodes(node4, "", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType11);
        java.lang.String str14 = jSType13.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry18.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = objectType19.getParentScope();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry16.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType19, node22);
        java.lang.String str24 = functionType23.getDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = functionType23.getOwnerFunction();
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean29 = jSDocInfo28.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean31 = jSDocInfo30.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean33 = jSDocInfo32.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList34 = com.google.common.collect.ImmutableList.of(jSDocInfo26, jSDocInfo27, jSDocInfo28, jSDocInfo30, jSDocInfo32);
        boolean boolean35 = jSDocInfo26.isNoCompile();
        java.lang.String str36 = jSDocInfo26.getVersion();
        functionType23.setJSDocInfo(jSDocInfo26);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = functionType23.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType.TypePair typePair39 = jSType13.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) functionType38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(functionType38);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isComma();
        boolean boolean3 = node1.isOnlyModifiesThisCall();
        boolean boolean4 = node1.isAdd();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(38);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable3 = node2.siblings();
        int int4 = node2.getSideEffectFlags();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.siblings();
        node2.addChildToBack(node6);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.siblings();
        int int12 = node10.getSideEffectFlags();
        boolean boolean13 = node10.isLabelName();
        com.google.javascript.rhino.Node node14 = node2.copyInformationFromForTree(node10);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(38, node2);
        int int16 = node2.getCharno();
        boolean boolean17 = node2.isDebugger();
        // The following exception was thrown during execution in test generation
        try {
            node2.setDouble((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: STRING  is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeIterable3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node4.siblings();
        int int6 = node4.getSideEffectFlags();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.siblings();
        node4.addChildToBack(node8);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("");
        boolean boolean13 = node12.isComma();
        boolean boolean14 = node12.isOnlyModifiesThisCall();
        boolean boolean15 = node12.isSetterDef();
        com.google.javascript.rhino.Node node16 = node8.useSourceInfoFrom(node12);
        com.google.javascript.rhino.Node node17 = node16.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = null;
        com.google.javascript.rhino.jstype.JSType jSType20 = jSTypeRegistry1.createFromTypeNodes(node16, "", jSTypeStaticScope19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry24.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = objectType25.getParentScope();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry22.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType25, node28);
        boolean boolean31 = functionType29.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType32 = functionType29.autoboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType29.autoboxesTo();
        boolean boolean35 = functionType29.removeProperty("");
        java.lang.String str36 = functionType29.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSTypeRegistry40.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType42 = objectType41.getParentScope();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry38.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType41, node44);
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = new com.google.javascript.rhino.JSDocInfo();
        functionType45.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo47);
        int int49 = functionType45.getMaxArguments();
        boolean boolean50 = functionType45.canBeCalled();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        com.google.javascript.rhino.jstype.ObjectType objectType55 = jSTypeRegistry54.createAnonymousObjectType();
        boolean boolean56 = objectType55.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType58 = objectType55.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry52.getGreatestSubtypeWithProperty(jSType58, "");
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry64.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType66 = objectType65.getParentScope();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry62.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType65, node68);
        java.lang.String str70 = functionType69.getDisplayName();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable73 = node72.siblings();
        int int74 = node72.getSideEffectFlags();
        boolean boolean75 = node72.isLabelName();
        boolean boolean76 = node72.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry52.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType69, node72);
        functionType45.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType69);
        boolean boolean80 = functionType69.removeProperty("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType29.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType69);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray82 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType83 = jSTypeRegistry1.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) functionType29, jSTypeArray82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeIterable5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(jSType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(jSType32);
        org.junit.Assert.assertNull(jSType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objectType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNotNull(objectType66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(nodeIterable73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(functionType77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(jSType81);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        boolean boolean5 = objectType4.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType7 = objectType4.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType7, "");
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = jSTypeRegistry13.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = objectType14.getParentScope();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry11.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType14, node17);
        java.lang.String str19 = functionType18.getDisplayName();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.siblings();
        int int23 = node21.getSideEffectFlags();
        boolean boolean24 = node21.isLabelName();
        boolean boolean25 = node21.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType18, node21);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry30.createAnonymousObjectType();
        boolean boolean32 = objectType31.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType34 = objectType31.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.getGreatestSubtypeWithProperty(jSType34, "");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSTypeRegistry40.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType42 = objectType41.getParentScope();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry38.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType41, node44);
        java.lang.String str46 = functionType45.getDisplayName();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.siblings();
        int int50 = node48.getSideEffectFlags();
        boolean boolean51 = node48.isLabelName();
        boolean boolean52 = node48.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry28.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType45, node48);
        java.lang.String str54 = functionType53.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSTypeRegistry56.createAnonymousObjectType();
        boolean boolean58 = objectType57.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType60 = objectType57.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean61 = objectType57.hasDisplayName();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair62 = functionType53.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry66.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType68 = objectType67.getParentScope();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry64.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType67, node70);
        boolean boolean73 = functionType71.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType71.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType71.getTypeOfThis();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet76 = objectType75.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79);
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSTypeRegistry80.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType82 = objectType81.getParentScope();
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry78.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType81, node84);
        java.lang.String str86 = functionType85.getDisplayName();
        boolean boolean87 = objectType75.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean88 = functionType85.hasCachedValues();
        int int89 = functionType85.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter90 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry91 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter90);
        com.google.javascript.rhino.jstype.ObjectType objectType92 = jSTypeRegistry91.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType93 = objectType92.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable94 = objectType93.getCtorExtendedInterfaces();
        boolean boolean95 = objectType93.isStringValueType();
        functionType85.setPrototypeBasedOn(objectType93);
        java.util.Set<java.lang.String> strSet97 = functionType85.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType98 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType53, (com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean99 = parameterizedType98.matchesObjectContext();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(typePair62);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet76 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet76.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertNotNull(objectType82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(objectType92);
        org.junit.Assert.assertNotNull(objectType93);
        org.junit.Assert.assertNotNull(objectTypeIterable94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(strSet97);
        org.junit.Assert.assertNotNull(parameterizedType98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 1, nodeArray2, 43, 50);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        node7.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        boolean boolean11 = node7.isSyntheticBlock();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder12 = node7.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = null;
        node7.setStaticSourceFile(staticSourceFile13);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.siblings();
        int int18 = node16.getSideEffectFlags();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.siblings();
        node16.addChildToBack(node20);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("");
        boolean boolean25 = node24.isComma();
        boolean boolean26 = node24.isOnlyModifiesThisCall();
        boolean boolean27 = node24.isSetterDef();
        com.google.javascript.rhino.Node node28 = node20.useSourceInfoFrom(node24);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(0, node5, node7, node24, (int) (short) 100, 15);
        boolean boolean32 = node24.isHook();
        java.lang.Object obj34 = node24.getProp(36);
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        boolean boolean3 = node2.isComma();
        boolean boolean4 = node2.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("");
        boolean boolean7 = node6.isComma();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        boolean boolean10 = node9.isComma();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("");
        node12.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        boolean boolean16 = node12.isSyntheticBlock();
        boolean boolean17 = node9.isEquivalentToTyped(node12);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 1, node2, node6, node9);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder19 = node6.new FileLevelJsDocBuilder();
        boolean boolean20 = node6.isGetElem();
        node6.removeProp((int) '#');
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable25 = node24.siblings();
        int int26 = node24.getSideEffectFlags();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node28.siblings();
        node24.addChildToBack(node28);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node32.siblings();
        int int34 = node32.getSideEffectFlags();
        boolean boolean35 = node32.isLabelName();
        com.google.javascript.rhino.Node node36 = node24.copyInformationFromForTree(node32);
        java.lang.Object obj38 = node36.getProp(51);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable41 = node40.siblings();
        boolean boolean42 = node40.isAdd();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node44.siblings();
        int int46 = node44.getSideEffectFlags();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.siblings();
        node44.addChildToBack(node48);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.siblings();
        int int54 = node52.getSideEffectFlags();
        boolean boolean55 = node52.isLabelName();
        com.google.javascript.rhino.Node node56 = node44.copyInformationFromForTree(node52);
        boolean boolean57 = node40.isEquivalentTo(node52);
        boolean boolean58 = node40.isReturn();
        boolean boolean59 = node40.isNull();
        int int60 = node36.getIndexOfChild(node40);
        node6.addChildToBack(node36);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable64 = node63.siblings();
        boolean boolean65 = node63.isAdd();
        com.google.javascript.rhino.Node node66 = node63.getNext();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile67 = node63.getStaticSourceFile();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node68 = node6.getChildBefore(node63);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeIterable25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeIterable29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeIterable33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(nodeIterable41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(nodeIterable64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(staticSourceFile67);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        boolean boolean10 = functionType8.removeProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = jSTypeRegistry12.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = objectType13.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable15 = objectType14.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType16 = objectType14.collapseUnion();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry18.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = objectType19.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable21 = objectType20.getCtorExtendedInterfaces();
        boolean boolean23 = objectType20.removeProperty("hi!");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair24 = jSType16.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) objectType20);
        boolean boolean25 = functionType8.isSubtype((com.google.javascript.rhino.jstype.JSType) objectType20);
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType8.getPropertyType("hi!");
        boolean boolean28 = jSType27.isAllType();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(typePair24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jSType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = new com.google.javascript.rhino.JSTypeExpression(node1, "Not declared as a type name");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = new com.google.javascript.rhino.JSTypeExpression(node6, "Not declared as a type name");
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node11.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = new com.google.javascript.rhino.JSTypeExpression(node11, "Not declared as a type name");
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression19 = new com.google.javascript.rhino.JSTypeExpression(node16, "Not declared as a type name");
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = new com.google.javascript.rhino.JSTypeExpression(node21, "Not declared as a type name");
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node26.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression29 = new com.google.javascript.rhino.JSTypeExpression(node26, "Not declared as a type name");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable32 = node31.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression34 = new com.google.javascript.rhino.JSTypeExpression(node31, "Not declared as a type name");
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable37 = node36.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression39 = new com.google.javascript.rhino.JSTypeExpression(node36, "Not declared as a type name");
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression44 = new com.google.javascript.rhino.JSTypeExpression(node41, "Not declared as a type name");
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable47 = node46.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression49 = new com.google.javascript.rhino.JSTypeExpression(node46, "Not declared as a type name");
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable52 = node51.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression54 = new com.google.javascript.rhino.JSTypeExpression(node51, "Not declared as a type name");
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList55 = com.google.common.collect.ImmutableList.of(jSTypeExpression4, jSTypeExpression9, jSTypeExpression14, jSTypeExpression19, jSTypeExpression24, jSTypeExpression29, jSTypeExpression34, jSTypeExpression39, jSTypeExpression44, jSTypeExpression49, jSTypeExpression54);
        com.google.javascript.rhino.Node node56 = jSTypeExpression34.getRoot();
        int int57 = node56.getCharno();
        node56.setCharno(32);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeIterable27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeIterable32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeIterable37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(nodeIterable47);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(nodeIterable52);
        org.junit.Assert.assertNotNull(jSTypeExpressionList55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        boolean boolean10 = functionType8.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType11 = functionType8.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = functionType8.getTypeOfThis();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = jSTypeRegistry14.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = objectType15.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = objectType16.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry22.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = objectType23.getParentScope();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry20.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType23, node26);
        boolean boolean29 = functionType27.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType30 = functionType27.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType31 = functionType27.getTypeOfThis();
        com.google.javascript.rhino.jstype.FunctionType functionType32 = functionType27.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.FunctionType functionType33 = functionType27.toMaybeFunctionType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>> jSTypeStaticScopeList34 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType8, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType16, jSTypeStaticScope18, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 2");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(jSType30);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertNotNull(functionType33);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        functionType8.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo10);
        boolean boolean12 = functionType8.isNominalType();
        com.google.javascript.rhino.Node node14 = functionType8.getPropertyNode("");
        com.google.javascript.rhino.Node node16 = functionType8.getPropertyNode("true");
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        java.lang.Object[] objArray37 = jSDocInfoList26.toArray();
        boolean boolean39 = jSDocInfoList26.equals((java.lang.Object) 'a');
        boolean boolean41 = jSDocInfoList26.equals((java.lang.Object) (byte) -1);
        java.lang.Object obj42 = null;
        int int43 = jSDocInfoList26.indexOf(obj42);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition44 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable47 = node46.siblings();
        namePosition44.setItem(node46);
        com.google.javascript.rhino.Node node49 = namePosition44.getItem();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("");
        boolean boolean53 = node52.isComma();
        boolean boolean54 = node52.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("");
        boolean boolean57 = node56.isComma();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("");
        boolean boolean60 = node59.isComma();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("");
        node62.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        boolean boolean66 = node62.isSyntheticBlock();
        boolean boolean67 = node59.isEquivalentToTyped(node62);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((int) (short) 1, node52, node56, node59);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable71 = node70.siblings();
        int int72 = node70.getSideEffectFlags();
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable75 = node74.siblings();
        node70.addChildToBack(node74);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable79 = node78.siblings();
        int int80 = node78.getSideEffectFlags();
        boolean boolean81 = node78.isLabelName();
        com.google.javascript.rhino.Node node82 = node70.copyInformationFromForTree(node78);
        boolean boolean83 = node82.isNoSideEffectsCall();
        java.lang.Cloneable[] cloneableArray84 = new java.lang.Cloneable[] { node49, node52, node82 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable[] cloneableArray85 = jSDocInfoList26.toArray(cloneableArray84);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(nodeIterable47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(nodeIterable71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(nodeIterable75);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(nodeIterable79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(cloneableArray84);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        java.lang.Object obj37 = null;
        boolean boolean38 = jSDocInfoList35.equals(obj37);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo40 = jSDocInfoList35.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (100) must be less than size (5)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        java.lang.Object[] objArray37 = jSDocInfoList26.toArray();
        int int38 = jSDocInfoList26.size();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean42 = jSDocInfo41.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean44 = jSDocInfo43.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean46 = jSDocInfo45.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList47 = com.google.common.collect.ImmutableList.of(jSDocInfo39, jSDocInfo40, jSDocInfo41, jSDocInfo43, jSDocInfo45);
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean51 = jSDocInfo50.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean53 = jSDocInfo52.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean55 = jSDocInfo54.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList56 = com.google.common.collect.ImmutableList.of(jSDocInfo48, jSDocInfo49, jSDocInfo50, jSDocInfo52, jSDocInfo54);
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean60 = jSDocInfo59.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean62 = jSDocInfo61.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean64 = jSDocInfo63.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList65 = com.google.common.collect.ImmutableList.of(jSDocInfo57, jSDocInfo58, jSDocInfo59, jSDocInfo61, jSDocInfo63);
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo67 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo68 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean69 = jSDocInfo68.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean71 = jSDocInfo70.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo72 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean73 = jSDocInfo72.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList74 = com.google.common.collect.ImmutableList.of(jSDocInfo66, jSDocInfo67, jSDocInfo68, jSDocInfo70, jSDocInfo72);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList75 = com.google.common.collect.ImmutableList.of(jSDocInfoList47, jSDocInfoList56, jSDocInfoList65, jSDocInfoList74);
        java.lang.Object[] objArray76 = jSDocInfoList65.toArray();
        int int77 = jSDocInfoList65.size();
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString("");
        node79.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        node79.setSourceEncodedPosition((-1));
        com.google.javascript.rhino.Node node86 = node79.getAncestor(2);
        boolean boolean87 = jSDocInfoList65.contains((java.lang.Object) 2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean88 = jSDocInfoList26.retainAll((java.util.Collection<com.google.javascript.rhino.JSDocInfo>) jSDocInfoList65);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList65);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList74);
        org.junit.Assert.assertNotNull(jSDocInfoListList75);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 5 + "'", int77 == 5);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNull(node86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        boolean boolean3 = node2.isComma();
        node2.setType(1);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(15, node2);
        boolean boolean7 = node2.isVar();
        // The following exception was thrown during execution in test generation
        try {
            node2.setSideEffectFlags(54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        boolean boolean9 = jSDocInfo0.isNoCompile();
        java.lang.String str10 = jSDocInfo0.getVersion();
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = jSDocInfo0.getTemplateTypeNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList12 = jSDocInfo0.getExtendedInterfaces();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(jSTypeExpressionList12);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        java.lang.Object[] objArray37 = jSDocInfoList26.toArray();
        boolean boolean39 = jSDocInfoList26.equals((java.lang.Object) 'a');
        boolean boolean41 = jSDocInfoList26.equals((java.lang.Object) (byte) -1);
        com.google.common.collect.UnmodifiableIterator<com.google.javascript.rhino.JSDocInfo> jSDocInfoItor42 = jSDocInfoList26.iterator();
        java.util.AbstractSet[] abstractSetArray44 = new java.util.AbstractSet[0];
        @SuppressWarnings("unchecked")
        java.util.AbstractSet<java.lang.String>[] strSetArray45 = (java.util.AbstractSet<java.lang.String>[]) abstractSetArray44;
        // The following exception was thrown during execution in test generation
        try {
            java.util.AbstractSet<java.lang.String>[] strSetArray46 = jSDocInfoList26.toArray(strSetArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jSDocInfoItor42);
        org.junit.Assert.assertNotNull(abstractSetArray44);
        org.junit.Assert.assertNotNull(strSetArray45);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = objectType2.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType4 = objectType2.getIndexType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jSType4.isDateType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNull(jSType4);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry6.createAnonymousObjectType();
        boolean boolean8 = objectType7.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType10 = objectType7.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry4.getGreatestSubtypeWithProperty(jSType10, "");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = jSTypeRegistry14.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = objectType15.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = objectType16.getCtorExtendedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry19.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry22.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = objectType23.getParentScope();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry26.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType28 = objectType27.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable29 = objectType28.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType30 = objectType28.collapseUnion();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry34.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = objectType35.getParentScope();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry32.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType35, node38);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        functionType39.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo41);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] { objectType24, objectType28, functionType39 };
        com.google.javascript.rhino.Node node44 = jSTypeRegistry19.createParameters(jSTypeArray43);
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry4.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType16, jSTypeArray43);
        com.google.javascript.rhino.Node node46 = jSTypeRegistry1.createParameters(jSTypeArray43);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node48 = jSTypeRegistry1.createOptionalParameters(jSTypeArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(jSType12);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertNotNull(objectTypeIterable29);
        org.junit.Assert.assertNotNull(jSType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertNotNull(node46);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(15);
        sideEffectFlags1.setReturnsTainted();
        sideEffectFlags1.setThrows();
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        boolean boolean3 = node1.isAdd();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        int int7 = node5.getSideEffectFlags();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.siblings();
        node5.addChildToBack(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable14 = node13.siblings();
        int int15 = node13.getSideEffectFlags();
        boolean boolean16 = node13.isLabelName();
        com.google.javascript.rhino.Node node17 = node5.copyInformationFromForTree(node13);
        boolean boolean18 = node1.isEquivalentTo(node13);
        boolean boolean19 = node1.isCall();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry21.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType23 = objectType22.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable24 = objectType23.getCtorExtendedInterfaces();
        boolean boolean26 = objectType23.removeProperty("hi!");
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean31 = jSDocInfo30.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean33 = jSDocInfo32.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean35 = jSDocInfo34.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList36 = com.google.common.collect.ImmutableList.of(jSDocInfo28, jSDocInfo29, jSDocInfo30, jSDocInfo32, jSDocInfo34);
        boolean boolean37 = jSDocInfo29.isConsistentIdGenerator();
        objectType23.setPropertyJSDocInfo("hi!", jSDocInfo29);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression39 = jSDocInfo29.getEnumParameterType();
        java.lang.String str40 = jSDocInfo29.getLendsName();
        node1.setJSDocInfo(jSDocInfo29);
        boolean boolean42 = node1.hasChildren();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectTypeIterable24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(jSTypeExpression39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 1, nodeArray2, 43, 50);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        node7.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        boolean boolean11 = node7.isSyntheticBlock();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder12 = node7.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = null;
        node7.setStaticSourceFile(staticSourceFile13);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.siblings();
        int int18 = node16.getSideEffectFlags();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.siblings();
        node16.addChildToBack(node20);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("");
        boolean boolean25 = node24.isComma();
        boolean boolean26 = node24.isOnlyModifiesThisCall();
        boolean boolean27 = node24.isSetterDef();
        com.google.javascript.rhino.Node node28 = node20.useSourceInfoFrom(node24);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(0, node5, node7, node24, (int) (short) 100, 15);
        boolean boolean32 = node31.isObjectLit();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        int int0 = com.google.javascript.rhino.Node.MAX_COLUMN_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4095 + "'", int0 == 4095);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        boolean boolean10 = functionType8.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType11 = functionType8.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = functionType8.getTypeOfThis();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = functionType8.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType8.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = functionType8.getPrototype();
        int int16 = functionType8.getMaxArguments();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        boolean boolean5 = objectType4.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType7 = objectType4.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType7, "");
        jSTypeRegistry1.forwardDeclareType("");
        boolean boolean12 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry16.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType18 = objectType17.getParentScope();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType17, node20);
        boolean boolean23 = functionType21.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType24 = functionType21.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType25 = functionType21.getTypeOfThis();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = functionType21.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.FunctionType functionType27 = functionType21.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType21);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType30 = jSTypeRegistry1.getNativeType(jSTypeNative29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jSType24);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertNotNull(jSType28);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSTypeRegistry10.createAnonymousObjectType();
        jSTypeRegistry7.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = jSTypeRegistry1.createFromTypeNodes(node4, "", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType11);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode14 = null;
        jSTypeRegistry1.setResolveMode(resolveMode14);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("");
        boolean boolean20 = node19.isComma();
        node19.setType(1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(15, node19);
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = jSTypeRegistry25.createAnonymousObjectType();
        boolean boolean27 = objectType26.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType29 = objectType26.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean30 = objectType26.canBeCalled();
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry1.createObjectType("Not declared as a type name", node19, objectType26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = node19.toString(false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objectType31);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = objectType2.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = objectType3.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType5 = objectType3.collapseUnion();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = objectType3.getImplicitPrototype();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = objectType3.setValidator(jSTypePredicate7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(jSType5);
        org.junit.Assert.assertNotNull(objectType6);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        boolean boolean3 = node2.isComma();
        boolean boolean4 = node2.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("");
        boolean boolean7 = node6.isComma();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        boolean boolean10 = node9.isComma();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("");
        node12.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        boolean boolean16 = node12.isSyntheticBlock();
        boolean boolean17 = node9.isEquivalentToTyped(node12);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 1, node2, node6, node9);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder19 = node6.new FileLevelJsDocBuilder();
        node6.setQuotedString();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) (short) 10);
        com.google.javascript.rhino.Node node23 = node6.copyInformationFrom(node22);
        // The following exception was thrown during execution in test generation
        try {
            node23.setSideEffectFlags(51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got STRING");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        boolean boolean10 = functionType8.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType11 = functionType8.autoboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType12 = functionType8.autoboxesTo();
        boolean boolean14 = functionType8.removeProperty("");
        java.lang.String str15 = functionType8.getDisplayName();
        com.google.javascript.rhino.jstype.TemplateType templateType16 = functionType8.toMaybeTemplateType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = templateType16.getDisplayName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(templateType16);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable3 = node2.siblings();
        namePosition0.setItem(node2);
        com.google.javascript.rhino.Node node5 = namePosition0.getItem();
        boolean boolean6 = node5.isRegExp();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeIterable3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        boolean boolean5 = objectType4.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType7 = objectType4.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType7, "");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry1.getNativeType(jSTypeNative10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType7);
        org.junit.Assert.assertNotNull(jSType9);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo2.getThisType();
        boolean boolean10 = jSDocInfo2.hasEnumParameterType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList11 = jSDocInfo2.getImplementedInterfaces();
        java.lang.String str12 = jSDocInfo2.getDeprecationReason();
        boolean boolean13 = jSDocInfo2.hasType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        int int3 = node1.getSideEffectFlags();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        node1.addChildToBack(node5);
        boolean boolean8 = node5.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder9 = node5.getJsDocBuilderForNode();
        node5.addSuppression("()");
        boolean boolean12 = node5.isDefaultCase();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        boolean boolean3 = node1.isAdd();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        int int7 = node5.getSideEffectFlags();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.siblings();
        node5.addChildToBack(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable14 = node13.siblings();
        int int15 = node13.getSideEffectFlags();
        boolean boolean16 = node13.isLabelName();
        com.google.javascript.rhino.Node node17 = node5.copyInformationFromForTree(node13);
        boolean boolean18 = node1.isEquivalentTo(node13);
        boolean boolean19 = node1.isCall();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile20 = null;
        node1.setStaticSourceFile(staticSourceFile20);
        boolean boolean22 = node1.isReturn();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isComma();
        node1.setType(1);
        com.google.javascript.rhino.Node node6 = node1.getAncestor((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            node1.setSideEffectFlags(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        jSDocInfo2.addSuppression("");
        java.lang.String str12 = jSDocInfo2.getDescriptionForParameter("");
        boolean boolean13 = jSDocInfo2.isExport();
        java.util.Set<java.lang.String> strSet14 = jSDocInfo2.getSuppressions();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean18 = jSDocInfo17.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean20 = jSDocInfo19.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean22 = jSDocInfo21.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList23 = com.google.common.collect.ImmutableList.of(jSDocInfo15, jSDocInfo16, jSDocInfo17, jSDocInfo19, jSDocInfo21);
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean27 = jSDocInfo26.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean29 = jSDocInfo28.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean31 = jSDocInfo30.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList32 = com.google.common.collect.ImmutableList.of(jSDocInfo24, jSDocInfo25, jSDocInfo26, jSDocInfo28, jSDocInfo30);
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean36 = jSDocInfo35.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean38 = jSDocInfo37.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean40 = jSDocInfo39.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList41 = com.google.common.collect.ImmutableList.of(jSDocInfo33, jSDocInfo34, jSDocInfo35, jSDocInfo37, jSDocInfo39);
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean45 = jSDocInfo44.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean47 = jSDocInfo46.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean49 = jSDocInfo48.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList50 = com.google.common.collect.ImmutableList.of(jSDocInfo42, jSDocInfo43, jSDocInfo44, jSDocInfo46, jSDocInfo48);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList51 = com.google.common.collect.ImmutableList.of(jSDocInfoList23, jSDocInfoList32, jSDocInfoList41, jSDocInfoList50);
        java.lang.Object[] objArray52 = jSDocInfoList41.toArray();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = jSDocInfoList41.get(0);
        com.google.common.collect.UnmodifiableListIterator<com.google.javascript.rhino.JSDocInfo> jSDocInfoItor56 = jSDocInfoList41.listIterator((int) (short) 1);
        boolean boolean57 = strSet14.containsAll((java.util.Collection<com.google.javascript.rhino.JSDocInfo>) jSDocInfoList41);
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSTypeRegistry59.createAnonymousObjectType();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = jSTypeRegistry68.createAnonymousObjectType();
        jSTypeRegistry65.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType69);
        com.google.javascript.rhino.jstype.JSType jSType71 = jSTypeRegistry59.createFromTypeNodes(node62, "", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType69);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode72 = null;
        jSTypeRegistry59.setResolveMode(resolveMode72);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean74 = jSDocInfoList41.remove((java.lang.Object) resolveMode72);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList50);
        org.junit.Assert.assertNotNull(jSDocInfoListList51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertNotNull(jSDocInfo54);
        org.junit.Assert.assertNotNull(jSDocInfoItor56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(jSType71);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = node1.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 10.0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = jSTypeRegistry4.createAnonymousObjectType();
        jSTypeRegistry1.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType5);
        boolean boolean7 = objectType5.isNativeObjectType();
        com.google.javascript.rhino.jstype.TemplateType templateType8 = objectType5.toMaybeTemplateType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = templateType8.matchesInt32Context();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(templateType8);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        java.lang.Object[] objArray37 = jSDocInfoList26.toArray();
        int int38 = jSDocInfoList26.size();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("");
        node40.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        node40.setSourceEncodedPosition((-1));
        com.google.javascript.rhino.Node node47 = node40.getAncestor(2);
        boolean boolean48 = jSDocInfoList26.contains((java.lang.Object) 2);
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoList26.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        boolean boolean5 = objectType4.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType7 = objectType4.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType7, "");
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = jSTypeRegistry13.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = objectType14.getParentScope();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry11.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType14, node17);
        java.lang.String str19 = functionType18.getDisplayName();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.siblings();
        int int23 = node21.getSideEffectFlags();
        boolean boolean24 = node21.isLabelName();
        boolean boolean25 = node21.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType18, node21);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry30.createAnonymousObjectType();
        boolean boolean32 = objectType31.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType34 = objectType31.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.getGreatestSubtypeWithProperty(jSType34, "");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSTypeRegistry40.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType42 = objectType41.getParentScope();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry38.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType41, node44);
        java.lang.String str46 = functionType45.getDisplayName();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.siblings();
        int int50 = node48.getSideEffectFlags();
        boolean boolean51 = node48.isLabelName();
        boolean boolean52 = node48.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry28.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType45, node48);
        java.lang.String str54 = functionType53.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSTypeRegistry56.createAnonymousObjectType();
        boolean boolean58 = objectType57.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType60 = objectType57.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean61 = objectType57.hasDisplayName();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair62 = functionType53.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry66.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType68 = objectType67.getParentScope();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry64.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType67, node70);
        boolean boolean73 = functionType71.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType71.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType71.getTypeOfThis();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet76 = objectType75.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79);
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSTypeRegistry80.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType82 = objectType81.getParentScope();
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry78.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType81, node84);
        java.lang.String str86 = functionType85.getDisplayName();
        boolean boolean87 = objectType75.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean88 = functionType85.hasCachedValues();
        int int89 = functionType85.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter90 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry91 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter90);
        com.google.javascript.rhino.jstype.ObjectType objectType92 = jSTypeRegistry91.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType93 = objectType92.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable94 = objectType93.getCtorExtendedInterfaces();
        boolean boolean95 = objectType93.isStringValueType();
        functionType85.setPrototypeBasedOn(objectType93);
        java.util.Set<java.lang.String> strSet97 = functionType85.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType98 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType53, (com.google.javascript.rhino.jstype.JSType) functionType85);
        java.lang.String str99 = parameterizedType98.getReferenceName();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(typePair62);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet76 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet76.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertNotNull(objectType82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(objectType92);
        org.junit.Assert.assertNotNull(objectType93);
        org.junit.Assert.assertNotNull(objectTypeIterable94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(strSet97);
        org.junit.Assert.assertNotNull(parameterizedType98);
        org.junit.Assert.assertNull(str99);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("{}");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node4.siblings();
        boolean boolean6 = node4.isAdd();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.siblings();
        int int10 = node8.getSideEffectFlags();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node12.siblings();
        node8.addChildToBack(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.siblings();
        int int18 = node16.getSideEffectFlags();
        boolean boolean19 = node16.isLabelName();
        com.google.javascript.rhino.Node node20 = node8.copyInformationFromForTree(node16);
        boolean boolean21 = node4.isEquivalentTo(node16);
        boolean boolean22 = node4.isOnlyModifiesThisCall();
        boolean boolean23 = node4.hasOneChild();
        node2.addChildToFront(node4);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("");
        boolean boolean27 = node26.isComma();
        node4.addChildToFront(node26);
        com.google.javascript.rhino.Node[] nodeArray30 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (short) 1, nodeArray30, 43, 50);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.siblings();
        boolean boolean37 = node35.isAdd();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.siblings();
        int int41 = node39.getSideEffectFlags();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.siblings();
        node39.addChildToBack(node43);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node47.siblings();
        int int49 = node47.getSideEffectFlags();
        boolean boolean50 = node47.isLabelName();
        com.google.javascript.rhino.Node node51 = node39.copyInformationFromForTree(node47);
        boolean boolean52 = node35.isEquivalentTo(node47);
        boolean boolean53 = node35.isCall();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile54 = null;
        node35.setStaticSourceFile(staticSourceFile54);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(10, node4, node33, node35, 15, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeIterable13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodeArray30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        com.google.javascript.rhino.Node[] nodeArray3 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) (short) 1, nodeArray3, 43, 50);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("");
        node8.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        boolean boolean12 = node8.isSyntheticBlock();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node8.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = null;
        node8.setStaticSourceFile(staticSourceFile14);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable18 = node17.siblings();
        int int19 = node17.getSideEffectFlags();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.siblings();
        node17.addChildToBack(node21);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("");
        boolean boolean26 = node25.isComma();
        boolean boolean27 = node25.isOnlyModifiesThisCall();
        boolean boolean28 = node25.isSetterDef();
        com.google.javascript.rhino.Node node29 = node21.useSourceInfoFrom(node25);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0, node6, node8, node25, (int) (short) 100, 15);
        int int33 = node25.getType();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.siblings();
        int int37 = node35.getSideEffectFlags();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.siblings();
        node35.addChildToBack(node39);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.siblings();
        int int45 = node43.getSideEffectFlags();
        boolean boolean46 = node43.isLabelName();
        com.google.javascript.rhino.Node node47 = node35.copyInformationFromForTree(node43);
        java.lang.Object obj49 = node47.getProp(51);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("");
        boolean boolean53 = node52.isComma();
        boolean boolean54 = node52.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("");
        boolean boolean57 = node56.isComma();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("");
        boolean boolean60 = node59.isComma();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("");
        node62.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        boolean boolean66 = node62.isSyntheticBlock();
        boolean boolean67 = node59.isEquivalentToTyped(node62);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((int) (short) 1, node52, node56, node59);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder69 = node56.new FileLevelJsDocBuilder();
        boolean boolean70 = node56.isGetElem();
        boolean boolean71 = node56.isQualifiedName();
        com.google.javascript.rhino.InputId inputId72 = com.google.javascript.jscomp.NodeUtil.getInputId(node56);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((int) (short) 1, node25, node47, node56, 45, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeIterable18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 40 + "'", int33 == 40);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(inputId72);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        boolean boolean5 = objectType4.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType7 = objectType4.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType7, "");
        jSTypeRegistry1.forwardDeclareType("");
        boolean boolean12 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative13 = null;
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray14 = new com.google.javascript.rhino.jstype.JSTypeNative[] { jSTypeNative13 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType15 = jSTypeRegistry1.createUnionType(jSTypeNativeArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSTypeNativeArray14);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean40 = jSDocInfo39.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean42 = jSDocInfo41.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean44 = jSDocInfo43.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList45 = com.google.common.collect.ImmutableList.of(jSDocInfo37, jSDocInfo38, jSDocInfo39, jSDocInfo41, jSDocInfo43);
        com.google.common.collect.ImmutableList<java.util.List<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList46 = com.google.common.collect.ImmutableList.of((java.util.List<com.google.javascript.rhino.JSDocInfo>) jSDocInfoList26, (java.util.List<com.google.javascript.rhino.JSDocInfo>) jSDocInfoList45);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48);
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSTypeRegistry52.createAnonymousObjectType();
        jSTypeRegistry49.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType53);
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean58 = jSDocInfo57.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean60 = jSDocInfo59.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean62 = jSDocInfo61.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList63 = com.google.common.collect.ImmutableList.of(jSDocInfo55, jSDocInfo56, jSDocInfo57, jSDocInfo59, jSDocInfo61);
        jSDocInfo57.addSuppression("");
        java.lang.String str67 = jSDocInfo57.getDescriptionForParameter("");
        objectType53.setJSDocInfo(jSDocInfo57);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo69 = jSDocInfoList45.set(51, jSDocInfo57);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList45);
        org.junit.Assert.assertNotNull(jSDocInfoListList46);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList63);
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        java.lang.String str9 = functionType8.getDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = functionType8.getOwnerFunction();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean18 = jSDocInfo17.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList19 = com.google.common.collect.ImmutableList.of(jSDocInfo11, jSDocInfo12, jSDocInfo13, jSDocInfo15, jSDocInfo17);
        boolean boolean20 = jSDocInfo11.isNoCompile();
        java.lang.String str21 = jSDocInfo11.getVersion();
        functionType8.setJSDocInfo(jSDocInfo11);
        com.google.javascript.rhino.jstype.ObjectType.Property property24 = functionType8.getSlot("Unknown class name");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = functionType8.getOwnImplementedInterfaces();
        boolean boolean26 = functionType8.isConstructor();
        java.lang.Iterable iterable27 = functionType8.getCtorImplementedInterfaces();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = functionType8.setValidator(jSTypePredicate28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(property24);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterable27);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "function (): {1517638406}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo10 = jSDocInfoList8.remove(15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        jSTypeRegistry1.identifyNonNullableName("PARAM_LIST");
        jSTypeRegistry1.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType13 = jSTypeRegistry1.getNativeObjectType(jSTypeNative12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        int int3 = node1.getSideEffectFlags();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        node1.addChildToBack(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.siblings();
        int int11 = node9.getSideEffectFlags();
        boolean boolean12 = node9.isLabelName();
        com.google.javascript.rhino.Node node13 = node1.copyInformationFromForTree(node9);
        boolean boolean14 = node13.isNoSideEffectsCall();
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node13);
        boolean boolean16 = node13.isCall();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        boolean boolean5 = objectType4.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType7 = objectType4.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType7, "");
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = jSTypeRegistry13.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = objectType14.getParentScope();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry11.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType14, node17);
        java.lang.String str19 = functionType18.getDisplayName();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.siblings();
        int int23 = node21.getSideEffectFlags();
        boolean boolean24 = node21.isLabelName();
        boolean boolean25 = node21.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType18, node21);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry30.createAnonymousObjectType();
        boolean boolean32 = objectType31.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType34 = objectType31.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.getGreatestSubtypeWithProperty(jSType34, "");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSTypeRegistry40.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType42 = objectType41.getParentScope();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry38.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType41, node44);
        java.lang.String str46 = functionType45.getDisplayName();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.siblings();
        int int50 = node48.getSideEffectFlags();
        boolean boolean51 = node48.isLabelName();
        boolean boolean52 = node48.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry28.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType45, node48);
        java.lang.String str54 = functionType53.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSTypeRegistry56.createAnonymousObjectType();
        boolean boolean58 = objectType57.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType60 = objectType57.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean61 = objectType57.hasDisplayName();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair62 = functionType53.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry66.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType68 = objectType67.getParentScope();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry64.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType67, node70);
        boolean boolean73 = functionType71.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType71.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType71.getTypeOfThis();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet76 = objectType75.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79);
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSTypeRegistry80.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType82 = objectType81.getParentScope();
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry78.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType81, node84);
        java.lang.String str86 = functionType85.getDisplayName();
        boolean boolean87 = objectType75.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean88 = functionType85.hasCachedValues();
        int int89 = functionType85.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter90 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry91 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter90);
        com.google.javascript.rhino.jstype.ObjectType objectType92 = jSTypeRegistry91.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType93 = objectType92.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable94 = objectType93.getCtorExtendedInterfaces();
        boolean boolean95 = objectType93.isStringValueType();
        functionType85.setPrototypeBasedOn(objectType93);
        java.util.Set<java.lang.String> strSet97 = functionType85.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType98 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType53, (com.google.javascript.rhino.jstype.JSType) functionType85);
        com.google.javascript.rhino.jstype.EnumType enumType99 = parameterizedType98.toMaybeEnumType();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(typePair62);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet76 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet76.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertNotNull(objectType82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(objectType92);
        org.junit.Assert.assertNotNull(objectType93);
        org.junit.Assert.assertNotNull(objectTypeIterable94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(strSet97);
        org.junit.Assert.assertNotNull(parameterizedType98);
        org.junit.Assert.assertNull(enumType99);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = com.google.common.collect.ImmutableList.of("function (): {1652162886}", "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]", "InputId: hi!", "{}", "Not declared as a constructor", "", "function (): {1559136837}");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable3 = node2.siblings();
        int int4 = node2.getSideEffectFlags();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.siblings();
        node2.addChildToBack(node6);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.siblings();
        int int12 = node10.getSideEffectFlags();
        boolean boolean13 = node10.isLabelName();
        com.google.javascript.rhino.Node node14 = node2.copyInformationFromForTree(node10);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(38, node2);
        java.lang.String str19 = node15.toString(false, false, true);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeIterable3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "NAME" + "'", str19, "NAME");
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = jSTypeRegistry4.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = objectType5.getParentScope();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = jSTypeRegistry8.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType10 = objectType9.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable11 = objectType10.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType12 = objectType10.collapseUnion();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry16.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType18 = objectType17.getParentScope();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType17, node20);
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        functionType21.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo23);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] { objectType6, objectType10, functionType21 };
        com.google.javascript.rhino.Node node26 = jSTypeRegistry1.createParameters(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry31.createAnonymousObjectType();
        jSTypeRegistry28.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType32);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSTypeRegistry37.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType39 = objectType38.getParentScope();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType38, node41);
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = new com.google.javascript.rhino.JSDocInfo();
        functionType42.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo44);
        int int46 = functionType42.getMaxArguments();
        boolean boolean47 = functionType42.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType52 = jSTypeRegistry28.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType42, "Unknown class name", "Not declared as a type name", 44, (int) '4');
        int int53 = functionType42.getMinArguments();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType42);
        com.google.javascript.rhino.jstype.JSType jSType55 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType42);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56);
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSTypeRegistry59.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType61 = objectType60.getParentScope();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry57.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType60, node63);
        int int65 = functionType64.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType66 = jSTypeRegistry1.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType64);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative67 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry1.getNativeType(jSTypeNative67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(objectType6);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(objectType10);
        org.junit.Assert.assertNotNull(objectTypeIterable11);
        org.junit.Assert.assertNotNull(jSType12);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jSType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertNotNull(objectType61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(jSType66);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        java.util.Spliterator<com.google.javascript.rhino.JSDocInfo> jSDocInfoSpliterator37 = jSDocInfoList17.spliterator();
        boolean boolean38 = jSDocInfoList17.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean42 = jSDocInfo41.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean44 = jSDocInfo43.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean46 = jSDocInfo45.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList47 = com.google.common.collect.ImmutableList.of(jSDocInfo39, jSDocInfo40, jSDocInfo41, jSDocInfo43, jSDocInfo45);
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean51 = jSDocInfo50.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean53 = jSDocInfo52.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean55 = jSDocInfo54.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList56 = com.google.common.collect.ImmutableList.of(jSDocInfo48, jSDocInfo49, jSDocInfo50, jSDocInfo52, jSDocInfo54);
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean60 = jSDocInfo59.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean62 = jSDocInfo61.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean64 = jSDocInfo63.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList65 = com.google.common.collect.ImmutableList.of(jSDocInfo57, jSDocInfo58, jSDocInfo59, jSDocInfo61, jSDocInfo63);
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo67 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo68 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean69 = jSDocInfo68.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean71 = jSDocInfo70.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo72 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean73 = jSDocInfo72.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList74 = com.google.common.collect.ImmutableList.of(jSDocInfo66, jSDocInfo67, jSDocInfo68, jSDocInfo70, jSDocInfo72);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList75 = com.google.common.collect.ImmutableList.of(jSDocInfoList47, jSDocInfoList56, jSDocInfoList65, jSDocInfoList74);
        java.lang.String str76 = jSDocInfoList65.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean77 = jSDocInfoList17.removeAll((java.util.Collection<com.google.javascript.rhino.JSDocInfo>) jSDocInfoList65);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertNotNull(jSDocInfoSpliterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList65);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList74);
        org.junit.Assert.assertNotNull(jSDocInfoListList75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]" + "'", str76, "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 1, nodeArray2, 43, 50);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        node7.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        boolean boolean11 = node7.isSyntheticBlock();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder12 = node7.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = null;
        node7.setStaticSourceFile(staticSourceFile13);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.siblings();
        int int18 = node16.getSideEffectFlags();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.siblings();
        node16.addChildToBack(node20);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("");
        boolean boolean25 = node24.isComma();
        boolean boolean26 = node24.isOnlyModifiesThisCall();
        boolean boolean27 = node24.isSetterDef();
        com.google.javascript.rhino.Node node28 = node20.useSourceInfoFrom(node24);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(0, node5, node7, node24, (int) (short) 100, 15);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = node24.getExistingIntProp(4095);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 4095");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isComma();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("");
        node4.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        boolean boolean8 = node4.isSyntheticBlock();
        boolean boolean9 = node1.isEquivalentToTyped(node4);
        boolean boolean10 = node1.isTypeOf();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = jSTypeRegistry14.createAnonymousObjectType();
        boolean boolean16 = objectType15.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType18 = objectType15.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType20 = jSTypeRegistry12.getGreatestSubtypeWithProperty(jSType18, "");
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry24.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = objectType25.getParentScope();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry22.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType25, node28);
        java.lang.String str30 = functionType29.getDisplayName();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node32.siblings();
        int int34 = node32.getSideEffectFlags();
        boolean boolean35 = node32.isLabelName();
        boolean boolean36 = node32.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry12.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType29, node32);
        java.lang.String str38 = functionType37.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSTypeRegistry40.createAnonymousObjectType();
        boolean boolean42 = objectType41.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType44 = objectType41.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean45 = objectType41.hasDisplayName();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair46 = functionType37.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) objectType41);
        com.google.javascript.rhino.jstype.ObjectType objectType47 = functionType37.getTypeOfThis();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48);
        com.google.javascript.rhino.jstype.ObjectType objectType50 = jSTypeRegistry49.createAnonymousObjectType();
        boolean boolean51 = objectType50.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType53 = objectType50.findPropertyType("true");
        java.util.Set<java.lang.String> strSet54 = objectType50.getPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType37.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType) objectType50);
        node1.setJSType(jSType55);
        boolean boolean57 = jSType55.isNominalConstructor();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSType18);
        org.junit.Assert.assertNotNull(jSType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeIterable33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(typePair46);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNotNull(objectType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        boolean boolean5 = objectType4.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType7 = objectType4.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType7, "");
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = jSTypeRegistry13.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = objectType14.getParentScope();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry11.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType14, node17);
        java.lang.String str19 = functionType18.getDisplayName();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.siblings();
        int int23 = node21.getSideEffectFlags();
        boolean boolean24 = node21.isLabelName();
        boolean boolean25 = node21.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType18, node21);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry30.createAnonymousObjectType();
        boolean boolean32 = objectType31.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType34 = objectType31.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.getGreatestSubtypeWithProperty(jSType34, "");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSTypeRegistry40.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType42 = objectType41.getParentScope();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry38.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType41, node44);
        java.lang.String str46 = functionType45.getDisplayName();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.siblings();
        int int50 = node48.getSideEffectFlags();
        boolean boolean51 = node48.isLabelName();
        boolean boolean52 = node48.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry28.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType45, node48);
        java.lang.String str54 = functionType53.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSTypeRegistry56.createAnonymousObjectType();
        boolean boolean58 = objectType57.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType60 = objectType57.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean61 = objectType57.hasDisplayName();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair62 = functionType53.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry66.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType68 = objectType67.getParentScope();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry64.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType67, node70);
        boolean boolean73 = functionType71.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType71.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType71.getTypeOfThis();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet76 = objectType75.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79);
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSTypeRegistry80.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType82 = objectType81.getParentScope();
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry78.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType81, node84);
        java.lang.String str86 = functionType85.getDisplayName();
        boolean boolean87 = objectType75.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean88 = functionType85.hasCachedValues();
        int int89 = functionType85.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter90 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry91 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter90);
        com.google.javascript.rhino.jstype.ObjectType objectType92 = jSTypeRegistry91.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType93 = objectType92.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable94 = objectType93.getCtorExtendedInterfaces();
        boolean boolean95 = objectType93.isStringValueType();
        functionType85.setPrototypeBasedOn(objectType93);
        java.util.Set<java.lang.String> strSet97 = functionType85.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType98 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType53, (com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean99 = parameterizedType98.isCheckedUnknownType();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(typePair62);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet76 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet76.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertNotNull(objectType82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(objectType92);
        org.junit.Assert.assertNotNull(objectType93);
        org.junit.Assert.assertNotNull(objectTypeIterable94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(strSet97);
        org.junit.Assert.assertNotNull(parameterizedType98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        int int3 = node1.getSideEffectFlags();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        node1.addChildToBack(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        boolean boolean10 = node9.isComma();
        boolean boolean11 = node9.isOnlyModifiesThisCall();
        boolean boolean12 = node9.isSetterDef();
        com.google.javascript.rhino.Node node13 = node5.useSourceInfoFrom(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("");
        boolean boolean16 = node15.isComma();
        boolean boolean17 = node15.isOnlyModifiesThisCall();
        boolean boolean18 = node15.isVarArgs();
        boolean boolean19 = node13.hasChild(node15);
        int int21 = node13.getIntProp(32);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.siblings();
        boolean boolean25 = node23.isAdd();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.siblings();
        int int29 = node27.getSideEffectFlags();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable32 = node31.siblings();
        node27.addChildToBack(node31);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.siblings();
        int int37 = node35.getSideEffectFlags();
        boolean boolean38 = node35.isLabelName();
        com.google.javascript.rhino.Node node39 = node27.copyInformationFromForTree(node35);
        boolean boolean40 = node23.isEquivalentTo(node35);
        boolean boolean41 = node23.isCall();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSTypeRegistry43.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType45 = objectType44.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = objectType45.getCtorExtendedInterfaces();
        boolean boolean48 = objectType45.removeProperty("hi!");
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean53 = jSDocInfo52.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean55 = jSDocInfo54.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean57 = jSDocInfo56.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList58 = com.google.common.collect.ImmutableList.of(jSDocInfo50, jSDocInfo51, jSDocInfo52, jSDocInfo54, jSDocInfo56);
        boolean boolean59 = jSDocInfo51.isConsistentIdGenerator();
        objectType45.setPropertyJSDocInfo("hi!", jSDocInfo51);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression61 = jSDocInfo51.getEnumParameterType();
        java.lang.String str62 = jSDocInfo51.getLendsName();
        node23.setJSDocInfo(jSDocInfo51);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node64 = node13.getChildBefore(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeIterable32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertNotNull(objectTypeIterable46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(jSTypeExpression61);
        org.junit.Assert.assertNull(str62);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean4 = jSDocInfo3.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean6 = jSDocInfo5.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean8 = jSDocInfo7.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList9 = com.google.common.collect.ImmutableList.of(jSDocInfo1, jSDocInfo2, jSDocInfo3, jSDocInfo5, jSDocInfo7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean13 = jSDocInfo12.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean15 = jSDocInfo14.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean17 = jSDocInfo16.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList18 = com.google.common.collect.ImmutableList.of(jSDocInfo10, jSDocInfo11, jSDocInfo12, jSDocInfo14, jSDocInfo16);
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean22 = jSDocInfo21.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean24 = jSDocInfo23.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean26 = jSDocInfo25.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList27 = com.google.common.collect.ImmutableList.of(jSDocInfo19, jSDocInfo20, jSDocInfo21, jSDocInfo23, jSDocInfo25);
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean31 = jSDocInfo30.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean33 = jSDocInfo32.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean35 = jSDocInfo34.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList36 = com.google.common.collect.ImmutableList.of(jSDocInfo28, jSDocInfo29, jSDocInfo30, jSDocInfo32, jSDocInfo34);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList37 = com.google.common.collect.ImmutableList.of(jSDocInfoList9, jSDocInfoList18, jSDocInfoList27, jSDocInfoList36);
        java.lang.Object[] objArray38 = jSDocInfoList27.toArray();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        java.lang.String str40 = ternaryValue39.toString();
        boolean boolean41 = jSDocInfoList27.equals((java.lang.Object) ternaryValue39);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = ternaryValue39.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = ternaryValue0.xor(ternaryValue42);
        java.lang.String str44 = ternaryValue42.toString();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList36);
        org.junit.Assert.assertNotNull(jSDocInfoListList37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "true" + "'", str40, "true");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "false" + "'", str44, "false");
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        com.google.javascript.rhino.jstype.FunctionType functionType9 = objectType4.toMaybeFunctionType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.autobox();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(functionType9);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("{proxy:{269772458}}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        boolean boolean10 = functionType8.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType11 = functionType8.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = functionType8.getTypeOfThis();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet13 = objectType12.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSTypeRegistry17.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType19 = objectType18.getParentScope();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType18, node21);
        java.lang.String str23 = functionType22.getDisplayName();
        boolean boolean24 = objectType12.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType22);
        boolean boolean25 = functionType22.hasCachedValues();
        int int26 = functionType22.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSTypeRegistry28.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType30 = objectType29.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = objectType30.getCtorExtendedInterfaces();
        boolean boolean32 = objectType30.isStringValueType();
        functionType22.setPrototypeBasedOn(objectType30);
        functionType22.clearCachedValues();
        java.lang.String str35 = functionType22.toDebugHashCodeString();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry38.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType40 = objectType39.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable41 = objectType40.getCtorExtendedInterfaces();
        boolean boolean42 = objectType40.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType22.forceResolve(errorReporter36, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType40);
        boolean boolean44 = jSType43.isRecordType();
        java.lang.String str45 = jSType43.toDebugHashCodeString();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet13 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet13.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectTypeIterable31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "function (): {1183181076}" + "'", str35, "function (): {1183181076}");
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertNotNull(objectType40);
        org.junit.Assert.assertNotNull(objectTypeIterable41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "function (): {1183181076}" + "'", str45, "function (): {1183181076}");
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        jSTypeRegistry1.identifyNonNullableName("PARAM_LIST");
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = jSTypeRegistry14.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = objectType15.getParentScope();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry12.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType15, node18);
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        functionType19.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo21);
        boolean boolean23 = functionType19.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.jstype.ObjectType objectType28 = jSTypeRegistry27.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType29 = objectType28.getParentScope();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry25.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType28, node31);
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = new com.google.javascript.rhino.JSDocInfo();
        functionType32.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo34);
        java.lang.String str36 = functionType32.getDisplayName();
        boolean boolean37 = functionType19.hasEqualCallType(functionType32);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.ObjectType objectType40 = jSTypeRegistry39.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType41 = objectType40.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable42 = objectType41.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType43 = objectType41.collapseUnion();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSTypeRegistry45.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType47 = objectType46.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable48 = objectType47.getCtorExtendedInterfaces();
        boolean boolean50 = objectType47.removeProperty("hi!");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair51 = jSType43.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) objectType47);
        boolean boolean52 = objectType47.isNoObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry1.createFunctionTypeWithNewThisType(functionType19, objectType47);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative54 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType55 = jSTypeRegistry1.getNativeType(jSTypeNative54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objectType40);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(objectTypeIterable42);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNotNull(objectTypeIterable48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(typePair51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(functionType53);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getEnumParameterType();
        boolean boolean3 = jSDocInfo0.isExterns();
        boolean boolean4 = jSDocInfo0.isIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        boolean boolean5 = objectType4.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType7 = objectType4.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType7, "");
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = jSTypeRegistry13.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = objectType14.getParentScope();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry11.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType14, node17);
        java.lang.String str19 = functionType18.getDisplayName();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.siblings();
        int int23 = node21.getSideEffectFlags();
        boolean boolean24 = node21.isLabelName();
        boolean boolean25 = node21.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType18, node21);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry30.createAnonymousObjectType();
        boolean boolean32 = objectType31.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType34 = objectType31.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.getGreatestSubtypeWithProperty(jSType34, "");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSTypeRegistry40.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType42 = objectType41.getParentScope();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry38.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType41, node44);
        java.lang.String str46 = functionType45.getDisplayName();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.siblings();
        int int50 = node48.getSideEffectFlags();
        boolean boolean51 = node48.isLabelName();
        boolean boolean52 = node48.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry28.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType45, node48);
        java.lang.String str54 = functionType53.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSTypeRegistry56.createAnonymousObjectType();
        boolean boolean58 = objectType57.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType60 = objectType57.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean61 = objectType57.hasDisplayName();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair62 = functionType53.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry66.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType68 = objectType67.getParentScope();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry64.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType67, node70);
        boolean boolean73 = functionType71.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType71.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType71.getTypeOfThis();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet76 = objectType75.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79);
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSTypeRegistry80.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType82 = objectType81.getParentScope();
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry78.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType81, node84);
        java.lang.String str86 = functionType85.getDisplayName();
        boolean boolean87 = objectType75.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean88 = functionType85.hasCachedValues();
        int int89 = functionType85.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter90 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry91 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter90);
        com.google.javascript.rhino.jstype.ObjectType objectType92 = jSTypeRegistry91.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType93 = objectType92.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable94 = objectType93.getCtorExtendedInterfaces();
        boolean boolean95 = objectType93.isStringValueType();
        functionType85.setPrototypeBasedOn(objectType93);
        java.util.Set<java.lang.String> strSet97 = functionType85.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType98 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType53, (com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean99 = parameterizedType98.isNullable();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(typePair62);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet76 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet76.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertNotNull(objectType82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(objectType92);
        org.junit.Assert.assertNotNull(objectType93);
        org.junit.Assert.assertNotNull(objectTypeIterable94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(strSet97);
        org.junit.Assert.assertNotNull(parameterizedType98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        int int3 = node1.getSideEffectFlags();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        node1.addChildToBack(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        boolean boolean10 = node9.isComma();
        boolean boolean11 = node9.isOnlyModifiesThisCall();
        boolean boolean12 = node9.isSetterDef();
        com.google.javascript.rhino.Node node13 = node5.useSourceInfoFrom(node9);
        com.google.javascript.rhino.Node node14 = node13.getParent();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = new com.google.javascript.rhino.JSTypeExpression(node14, "(true)");
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable19 = node18.siblings();
        boolean boolean20 = node18.isAdd();
        boolean boolean21 = node18.isBreak();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.siblings();
        int int25 = node23.getSideEffectFlags();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.siblings();
        node23.addChildToBack(node27);
        com.google.javascript.rhino.jstype.JSType jSType30 = node23.getJSType();
        boolean boolean31 = node23.isCase();
        // The following exception was thrown during execution in test generation
        try {
            node14.addChildBefore(node18, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeIterable19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertNull(jSType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        boolean boolean10 = functionType8.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType11 = functionType8.autoboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType12 = functionType8.autoboxesTo();
        boolean boolean14 = functionType8.removeProperty("");
        java.lang.String str15 = functionType8.getDisplayName();
        com.google.javascript.rhino.jstype.TemplateType templateType16 = functionType8.toMaybeTemplateType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType18 = templateType16.findPropertyType("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(templateType16);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo2.getThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo2.getType();
        java.lang.String str11 = jSDocInfo2.getDescription();
        boolean boolean12 = jSDocInfo2.isImplicitCast();
        boolean boolean13 = jSDocInfo2.isNoShadow();
        boolean boolean14 = jSDocInfo2.hasTypedefType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        boolean boolean6 = node5.isComma();
        node5.setType(1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(15, node5);
        boolean boolean10 = node9.isAdd();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node12.siblings();
        int int14 = node12.getSideEffectFlags();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.siblings();
        node12.addChildToBack(node16);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry23.createAnonymousObjectType();
        jSTypeRegistry20.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean29 = jSDocInfo28.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean31 = jSDocInfo30.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean33 = jSDocInfo32.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList34 = com.google.common.collect.ImmutableList.of(jSDocInfo26, jSDocInfo27, jSDocInfo28, jSDocInfo30, jSDocInfo32);
        jSDocInfo28.addSuppression("");
        java.lang.String str38 = jSDocInfo28.getDescriptionForParameter("");
        objectType24.setJSDocInfo(jSDocInfo28);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry1.createConstructorType("?", node9, node16, (com.google.javascript.rhino.jstype.JSType) objectType24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeIterable13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList34);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        int int3 = node1.getSideEffectFlags();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        node1.addChildToBack(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        boolean boolean10 = node9.isComma();
        boolean boolean11 = node9.isOnlyModifiesThisCall();
        boolean boolean12 = node9.isSetterDef();
        com.google.javascript.rhino.Node node13 = node5.useSourceInfoFrom(node9);
        com.google.javascript.rhino.Node node14 = node13.getParent();
        boolean boolean15 = node14.isFromExterns();
        java.lang.Object obj17 = node14.getProp(54);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.siblings();
        int int21 = node19.getSideEffectFlags();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.siblings();
        node19.addChildToBack(node23);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("");
        boolean boolean28 = node27.isComma();
        boolean boolean29 = node27.isOnlyModifiesThisCall();
        boolean boolean30 = node27.isSetterDef();
        com.google.javascript.rhino.Node node31 = node23.useSourceInfoFrom(node27);
        com.google.javascript.rhino.Node node32 = node31.getParent();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable33 = node32.getAncestors();
        boolean boolean34 = node32.isParamList();
        com.google.javascript.rhino.Node node35 = node32.getParent();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node38.siblings();
        int int40 = node38.getSideEffectFlags();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = node42.siblings();
        node38.addChildToBack(node42);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable47 = node46.siblings();
        int int48 = node46.getSideEffectFlags();
        boolean boolean49 = node46.isLabelName();
        com.google.javascript.rhino.Node node50 = node38.copyInformationFromForTree(node46);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(38, node38);
        // The following exception was thrown during execution in test generation
        try {
            node14.addChildAfter(node35, node38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(ancestorIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeIterable43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(nodeIterable47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        int int3 = node1.getSideEffectFlags();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        node1.addChildToBack(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.siblings();
        int int11 = node9.getSideEffectFlags();
        boolean boolean12 = node9.isLabelName();
        com.google.javascript.rhino.Node node13 = node1.copyInformationFromForTree(node9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo14 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        java.lang.String str9 = jSDocInfo6.getMeaning();
        java.lang.String str10 = jSDocInfo6.getDescription();
        boolean boolean12 = jSDocInfo6.hasParameterType("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo6.getEnumParameterType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSTypeExpression13);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(15);
        sideEffectFlags1.setReturnsTainted();
        sideEffectFlags1.clearSideEffectFlags();
        sideEffectFlags1.clearAllFlags();
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        node1.setSourceEncodedPosition((-1));
        node1.addSuppression("{}");
        boolean boolean9 = node1.isComma();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        int int0 = com.google.javascript.rhino.Node.DECR_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        boolean boolean5 = objectType4.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType7 = objectType4.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType7, "");
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = jSTypeRegistry13.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = objectType14.getParentScope();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry11.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType14, node17);
        java.lang.String str19 = functionType18.getDisplayName();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.siblings();
        int int23 = node21.getSideEffectFlags();
        boolean boolean24 = node21.isLabelName();
        boolean boolean25 = node21.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType18, node21);
        boolean boolean28 = jSTypeRegistry1.hasNamespace("STRING ");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry1.getNativeFunctionType(jSTypeNative29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable3 = node2.siblings();
        int int4 = node2.getSideEffectFlags();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.siblings();
        node2.addChildToBack(node6);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.siblings();
        int int12 = node10.getSideEffectFlags();
        boolean boolean13 = node10.isLabelName();
        com.google.javascript.rhino.Node node14 = node2.copyInformationFromForTree(node10);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(38, node2);
        int int16 = node2.getCharno();
        boolean boolean17 = node2.isDebugger();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.siblings();
        boolean boolean22 = node20.isAdd();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable25 = node24.siblings();
        int int26 = node24.getSideEffectFlags();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node28.siblings();
        node24.addChildToBack(node28);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node32.siblings();
        int int34 = node32.getSideEffectFlags();
        boolean boolean35 = node32.isLabelName();
        com.google.javascript.rhino.Node node36 = node24.copyInformationFromForTree(node32);
        boolean boolean37 = node20.isEquivalentTo(node32);
        boolean boolean38 = node20.isReturn();
        boolean boolean39 = node20.isNull();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.siblings();
        int int43 = node41.getSideEffectFlags();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable46 = node45.siblings();
        node41.addChildToBack(node45);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable50 = node49.siblings();
        int int51 = node49.getSideEffectFlags();
        boolean boolean52 = node49.isLabelName();
        com.google.javascript.rhino.Node node53 = node41.copyInformationFromForTree(node49);
        boolean boolean54 = node53.isQuotedString();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(2, node20, node53, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            node2.addChildToBack(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeIterable3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeIterable25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeIterable29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeIterable33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(nodeIterable46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(nodeIterable50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        functionType8.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo10);
        int int12 = functionType8.getMaxArguments();
        java.lang.String str13 = functionType8.getDisplayName();
        int int14 = functionType8.getMaxArguments();
        boolean boolean15 = functionType8.isArrayType();
        boolean boolean16 = functionType8.isInstanceType();
        int int17 = functionType8.getMinArguments();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry19.createAnonymousObjectType();
        boolean boolean21 = objectType20.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType23 = objectType20.findPropertyType("true");
        boolean boolean25 = objectType20.removeProperty("[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        com.google.javascript.rhino.jstype.JSType jSType27 = objectType20.findPropertyType("true");
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry31.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType33 = objectType32.getParentScope();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry29.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType32, node35);
        boolean boolean38 = functionType36.removeProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSTypeRegistry40.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType42 = objectType41.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable43 = objectType42.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType44 = objectType42.collapseUnion();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry46.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable49 = objectType48.getCtorExtendedInterfaces();
        boolean boolean51 = objectType48.removeProperty("hi!");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair52 = jSType44.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) objectType48);
        boolean boolean53 = functionType36.isSubtype((com.google.javascript.rhino.jstype.JSType) objectType48);
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType36.getPropertyType("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType56 = functionType36.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair57 = objectType20.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot59 = functionType36.getOwnSlot("{}");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair60 = functionType8.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) functionType36);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType61 = functionType36.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(jSType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(objectTypeIterable43);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertNotNull(objectTypeIterable49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(typePair52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNotNull(typePair57);
        org.junit.Assert.assertNull(jSTypeStaticSlot59);
        org.junit.Assert.assertNotNull(typePair60);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        java.util.Spliterator<com.google.javascript.rhino.JSDocInfo> jSDocInfoSpliterator37 = jSDocInfoList17.spliterator();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("");
        node39.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        boolean boolean43 = node39.isSyntheticBlock();
        node39.putIntProp(51, (int) (byte) 0);
        boolean boolean47 = jSDocInfoList17.contains((java.lang.Object) node39);
        int int48 = jSDocInfoList17.size();
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean53 = jSDocInfo52.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean55 = jSDocInfo54.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean57 = jSDocInfo56.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList58 = com.google.common.collect.ImmutableList.of(jSDocInfo50, jSDocInfo51, jSDocInfo52, jSDocInfo54, jSDocInfo56);
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo60 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean62 = jSDocInfo61.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean64 = jSDocInfo63.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean66 = jSDocInfo65.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList67 = com.google.common.collect.ImmutableList.of(jSDocInfo59, jSDocInfo60, jSDocInfo61, jSDocInfo63, jSDocInfo65);
        com.google.javascript.rhino.JSDocInfo jSDocInfo68 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean71 = jSDocInfo70.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo72 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean73 = jSDocInfo72.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo74 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean75 = jSDocInfo74.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList76 = com.google.common.collect.ImmutableList.of(jSDocInfo68, jSDocInfo69, jSDocInfo70, jSDocInfo72, jSDocInfo74);
        com.google.javascript.rhino.JSDocInfo jSDocInfo77 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo78 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo79 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean80 = jSDocInfo79.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo81 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean82 = jSDocInfo81.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo83 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean84 = jSDocInfo83.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList85 = com.google.common.collect.ImmutableList.of(jSDocInfo77, jSDocInfo78, jSDocInfo79, jSDocInfo81, jSDocInfo83);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList86 = com.google.common.collect.ImmutableList.of(jSDocInfoList58, jSDocInfoList67, jSDocInfoList76, jSDocInfoList85);
        java.lang.Object[] objArray87 = jSDocInfoList76.toArray();
        int int88 = jSDocInfoList76.size();
        com.google.common.collect.UnmodifiableIterator<com.google.javascript.rhino.JSDocInfo> jSDocInfoItor89 = jSDocInfoList76.iterator();
        java.util.Iterator<com.google.javascript.rhino.JSDocInfo> jSDocInfoItor90 = jSDocInfoList76.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean91 = jSDocInfoList17.addAll(0, (java.util.Collection<com.google.javascript.rhino.JSDocInfo>) jSDocInfoList76);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertNotNull(jSDocInfoSpliterator37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5 + "'", int48 == 5);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList76);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList85);
        org.junit.Assert.assertNotNull(jSDocInfoListList86);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray87), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray87), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 5 + "'", int88 == 5);
        org.junit.Assert.assertNotNull(jSDocInfoItor89);
        org.junit.Assert.assertNotNull(jSDocInfoItor90);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Unknown class name");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("");
        node3.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        node3.setSourceEncodedPosition((-1));
        boolean boolean9 = node3.isFunction();
        com.google.javascript.rhino.Node node11 = node3.getAncestor((int) (byte) 0);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            node1.addChildBefore(node3, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "true");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        boolean boolean10 = jSDocInfo4.hasParameter("hi!");
        boolean boolean11 = jSDocInfo4.containsDeclaration();
        boolean boolean12 = jSDocInfo4.hasType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "Unknown class name");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        java.util.Spliterator<com.google.javascript.rhino.JSDocInfo> jSDocInfoSpliterator37 = jSDocInfoList17.spliterator();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("");
        node39.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        boolean boolean43 = node39.isSyntheticBlock();
        node39.putIntProp(51, (int) (byte) 0);
        boolean boolean47 = jSDocInfoList17.contains((java.lang.Object) node39);
        int int48 = jSDocInfoList17.size();
        boolean boolean49 = jSDocInfoList17.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean53 = jSDocInfo52.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean55 = jSDocInfo54.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean57 = jSDocInfo56.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList58 = com.google.common.collect.ImmutableList.of(jSDocInfo50, jSDocInfo51, jSDocInfo52, jSDocInfo54, jSDocInfo56);
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo60 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean62 = jSDocInfo61.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean64 = jSDocInfo63.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean66 = jSDocInfo65.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList67 = com.google.common.collect.ImmutableList.of(jSDocInfo59, jSDocInfo60, jSDocInfo61, jSDocInfo63, jSDocInfo65);
        com.google.javascript.rhino.JSDocInfo jSDocInfo68 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean71 = jSDocInfo70.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo72 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean73 = jSDocInfo72.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo74 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean75 = jSDocInfo74.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList76 = com.google.common.collect.ImmutableList.of(jSDocInfo68, jSDocInfo69, jSDocInfo70, jSDocInfo72, jSDocInfo74);
        com.google.javascript.rhino.JSDocInfo jSDocInfo77 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo78 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo79 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean80 = jSDocInfo79.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo81 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean82 = jSDocInfo81.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo83 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean84 = jSDocInfo83.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList85 = com.google.common.collect.ImmutableList.of(jSDocInfo77, jSDocInfo78, jSDocInfo79, jSDocInfo81, jSDocInfo83);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList86 = com.google.common.collect.ImmutableList.of(jSDocInfoList58, jSDocInfoList67, jSDocInfoList76, jSDocInfoList85);
        boolean boolean87 = jSDocInfoList67.isEmpty();
        boolean boolean88 = jSDocInfoList67.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean89 = jSDocInfoList17.removeAll((java.util.Collection<com.google.javascript.rhino.JSDocInfo>) jSDocInfoList67);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertNotNull(jSDocInfoSpliterator37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5 + "'", int48 == 5);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList76);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList85);
        org.junit.Assert.assertNotNull(jSDocInfoListList86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry6.createAnonymousObjectType();
        boolean boolean8 = objectType7.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType10 = objectType7.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry4.getGreatestSubtypeWithProperty(jSType10, "");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = jSTypeRegistry14.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = objectType15.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = objectType16.getCtorExtendedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry19.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry22.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = objectType23.getParentScope();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry26.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType28 = objectType27.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable29 = objectType28.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType30 = objectType28.collapseUnion();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry34.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = objectType35.getParentScope();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry32.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType35, node38);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        functionType39.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo41);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] { objectType24, objectType28, functionType39 };
        com.google.javascript.rhino.Node node44 = jSTypeRegistry19.createParameters(jSTypeArray43);
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry4.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType16, jSTypeArray43);
        com.google.javascript.rhino.Node node46 = jSTypeRegistry1.createParameters(jSTypeArray43);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable48 = jSTypeRegistry1.getEachReferenceTypeWithProperty("Unknown");
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSTypeRegistry50.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType52 = objectType51.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable53 = objectType52.getCtorExtendedInterfaces();
        boolean boolean54 = objectType52.isNativeObjectType();
        boolean boolean56 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) objectType52, "function (): {}");
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(jSType12);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertNotNull(objectTypeIterable29);
        org.junit.Assert.assertNotNull(jSType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(objectTypeIterable48);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertNotNull(objectTypeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        int int3 = node1.getSideEffectFlags();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        node1.addChildToBack(node5);
        boolean boolean8 = node5.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder9 = node5.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node11.siblings();
        int int13 = node11.getSideEffectFlags();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.siblings();
        node11.addChildToBack(node15);
        boolean boolean18 = node15.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder19 = node15.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) '#');
        boolean boolean22 = node21.isNumber();
        boolean boolean23 = node21.isDec();
        boolean boolean24 = node21.isTry();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder25 = node21.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.siblings();
        int int29 = node27.getSideEffectFlags();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable32 = node31.siblings();
        node27.addChildToBack(node31);
        boolean boolean34 = node31.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder35 = node31.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder[] fileLevelJsDocBuilderArray36 = new com.google.javascript.rhino.Node.FileLevelJsDocBuilder[] { fileLevelJsDocBuilder9, fileLevelJsDocBuilder19, fileLevelJsDocBuilder25, fileLevelJsDocBuilder35 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.Node.FileLevelJsDocBuilder> fileLevelJsDocBuilderList37 = com.google.common.collect.ImmutableList.copyOf(fileLevelJsDocBuilderArray36);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeIterable32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder35);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilderArray36);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilderList37);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        int int3 = node1.getSideEffectFlags();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        node1.addChildToBack(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        boolean boolean10 = node9.isComma();
        boolean boolean11 = node9.isOnlyModifiesThisCall();
        boolean boolean12 = node9.isSetterDef();
        com.google.javascript.rhino.Node node13 = node5.useSourceInfoFrom(node9);
        com.google.javascript.rhino.Node node14 = node13.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        int int3 = node1.getSideEffectFlags();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        node1.addChildToBack(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.siblings();
        int int11 = node9.getSideEffectFlags();
        boolean boolean12 = node9.isLabelName();
        com.google.javascript.rhino.Node node13 = node1.copyInformationFromForTree(node9);
        boolean boolean14 = node13.isNoSideEffectsCall();
        boolean boolean15 = node13.isDo();
        // The following exception was thrown during execution in test generation
        try {
            node13.setDouble(1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: STRING  is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        boolean boolean10 = jSDocInfo4.hasParameter("hi!");
        boolean boolean11 = jSDocInfo4.containsDeclaration();
        java.util.Collection<java.lang.String> strCollection12 = jSDocInfo4.getAuthors();
        boolean boolean13 = jSDocInfo4.hasBaseType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = jSTypeRegistry4.createAnonymousObjectType();
        jSTypeRegistry1.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType5);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = jSTypeRegistry11.createAnonymousObjectType();
        jSTypeRegistry8.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType12);
        boolean boolean14 = objectType12.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry16.createAnonymousObjectType();
        boolean boolean18 = objectType17.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType20 = objectType17.findPropertyType("true");
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry22.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = objectType23.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = objectType24.getCtorExtendedInterfaces();
        boolean boolean26 = objectType24.isStringValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry30.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.getParentScope();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry28.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType31, node34);
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = new com.google.javascript.rhino.JSDocInfo();
        functionType35.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo37);
        int int39 = functionType35.getMaxArguments();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSTypeRegistry41.createAnonymousObjectType();
        boolean boolean43 = objectType42.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType45 = objectType42.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSTypeRegistry47.createAnonymousObjectType();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSTypeRegistry56.createAnonymousObjectType();
        jSTypeRegistry53.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType57);
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry47.createFromTypeNodes(node50, "", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType57);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] { objectType12, objectType17, objectType24, functionType35, objectType42, objectType57 };
        com.google.javascript.rhino.Node node61 = jSTypeRegistry1.createParametersWithVarArgs(jSTypeArray60);
        jSTypeRegistry1.incrementGeneration();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry66.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType68 = objectType67.getParentScope();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry64.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType67, node70);
        boolean boolean73 = functionType71.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType71.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType71.getTypeOfThis();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet76 = objectType75.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79);
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSTypeRegistry80.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType82 = objectType81.getParentScope();
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry78.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType81, node84);
        java.lang.String str86 = functionType85.getDisplayName();
        boolean boolean87 = objectType75.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean88 = functionType85.hasCachedValues();
        int int89 = functionType85.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter90 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry91 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter90);
        com.google.javascript.rhino.jstype.ObjectType objectType92 = jSTypeRegistry91.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType93 = objectType92.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable94 = objectType93.getCtorExtendedInterfaces();
        boolean boolean95 = objectType93.isStringValueType();
        functionType85.setPrototypeBasedOn(objectType93);
        functionType85.clearCachedValues();
        java.lang.String str98 = functionType85.toDebugHashCodeString();
        jSTypeRegistry1.resolveTypesInScope((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType85);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet76 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet76.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertNotNull(objectType82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(objectType92);
        org.junit.Assert.assertNotNull(objectType93);
        org.junit.Assert.assertNotNull(objectTypeIterable94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str98 + "' != '" + "function (): {1177818798}" + "'", str98, "function (): {1177818798}");
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        boolean boolean10 = functionType8.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType11 = functionType8.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = functionType8.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType8.getIndexType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = jSType13.matchesNumberContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertNull(jSType13);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        boolean boolean37 = jSDocInfoList17.isEmpty();
        boolean boolean38 = jSDocInfoList17.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean42 = jSDocInfo41.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean44 = jSDocInfo43.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean46 = jSDocInfo45.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList47 = com.google.common.collect.ImmutableList.of(jSDocInfo39, jSDocInfo40, jSDocInfo41, jSDocInfo43, jSDocInfo45);
        int int49 = jSDocInfoList47.lastIndexOf((java.lang.Object) 1);
        com.google.common.collect.UnmodifiableIterator<com.google.javascript.rhino.JSDocInfo> jSDocInfoItor50 = jSDocInfoList47.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = jSDocInfoList17.retainAll((java.util.Collection<com.google.javascript.rhino.JSDocInfo>) jSDocInfoList47);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(jSDocInfoItor50);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        boolean boolean3 = node1.isAdd();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.siblings();
        int int7 = node5.getSideEffectFlags();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.siblings();
        node5.addChildToBack(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable14 = node13.siblings();
        int int15 = node13.getSideEffectFlags();
        boolean boolean16 = node13.isLabelName();
        com.google.javascript.rhino.Node node17 = node5.copyInformationFromForTree(node13);
        boolean boolean18 = node1.isEquivalentTo(node13);
        boolean boolean19 = node1.isSyntheticBlock();
        // The following exception was thrown during execution in test generation
        try {
            node1.setDouble((double) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: STRING  is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        boolean boolean3 = node2.isComma();
        boolean boolean4 = node2.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("");
        boolean boolean7 = node6.isComma();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        boolean boolean10 = node9.isComma();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("");
        node12.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        boolean boolean16 = node12.isSyntheticBlock();
        boolean boolean17 = node9.isEquivalentToTyped(node12);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 1, node2, node6, node9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo19 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable3 = node2.siblings();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = new com.google.javascript.rhino.JSTypeExpression(node2, "Not declared as a type name");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node7.siblings();
        int int9 = node7.getSideEffectFlags();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node11.siblings();
        node7.addChildToBack(node11);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.siblings();
        int int17 = node15.getSideEffectFlags();
        boolean boolean18 = node15.isLabelName();
        com.google.javascript.rhino.Node node19 = node7.copyInformationFromForTree(node15);
        boolean boolean20 = node15.isExprResult();
        com.google.javascript.rhino.Node node21 = node2.clonePropsFrom(node15);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("");
        boolean boolean24 = node23.isComma();
        node23.setType(1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) 1, node2, node23, 40, 1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable32 = node31.siblings();
        int int33 = node31.getSideEffectFlags();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.siblings();
        node31.addChildToBack(node35);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("");
        boolean boolean40 = node39.isComma();
        boolean boolean41 = node39.isOnlyModifiesThisCall();
        boolean boolean42 = node39.isSetterDef();
        com.google.javascript.rhino.Node node43 = node35.useSourceInfoFrom(node39);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node44 = node29.getChildBefore(node43);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeIterable3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeIterable8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeIterable32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        java.util.Spliterator<com.google.javascript.rhino.JSDocInfo> jSDocInfoSpliterator37 = jSDocInfoList35.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.UnmodifiableListIterator<com.google.javascript.rhino.JSDocInfo> jSDocInfoItor39 = jSDocInfoList35.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (100) must not be greater than size (5)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertNotNull(jSDocInfoSpliterator37);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        boolean boolean5 = objectType4.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType7 = objectType4.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType7, "");
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = jSTypeRegistry13.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = objectType14.getParentScope();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry11.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType14, node17);
        java.lang.String str19 = functionType18.getDisplayName();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.siblings();
        int int23 = node21.getSideEffectFlags();
        boolean boolean24 = node21.isLabelName();
        boolean boolean25 = node21.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType18, node21);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry30.createAnonymousObjectType();
        boolean boolean32 = objectType31.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType34 = objectType31.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.getGreatestSubtypeWithProperty(jSType34, "");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSTypeRegistry40.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType42 = objectType41.getParentScope();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry38.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType41, node44);
        java.lang.String str46 = functionType45.getDisplayName();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.siblings();
        int int50 = node48.getSideEffectFlags();
        boolean boolean51 = node48.isLabelName();
        boolean boolean52 = node48.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry28.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType45, node48);
        java.lang.String str54 = functionType53.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSTypeRegistry56.createAnonymousObjectType();
        boolean boolean58 = objectType57.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType60 = objectType57.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean61 = objectType57.hasDisplayName();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair62 = functionType53.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry66.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType68 = objectType67.getParentScope();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry64.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType67, node70);
        boolean boolean73 = functionType71.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType71.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType71.getTypeOfThis();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet76 = objectType75.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79);
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSTypeRegistry80.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType82 = objectType81.getParentScope();
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry78.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType81, node84);
        java.lang.String str86 = functionType85.getDisplayName();
        boolean boolean87 = objectType75.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean88 = functionType85.hasCachedValues();
        int int89 = functionType85.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter90 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry91 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter90);
        com.google.javascript.rhino.jstype.ObjectType objectType92 = jSTypeRegistry91.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType93 = objectType92.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable94 = objectType93.getCtorExtendedInterfaces();
        boolean boolean95 = objectType93.isStringValueType();
        functionType85.setPrototypeBasedOn(objectType93);
        java.util.Set<java.lang.String> strSet97 = functionType85.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType98 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType53, (com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean99 = parameterizedType98.isNoType();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(typePair62);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet76 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet76.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertNotNull(objectType82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(objectType92);
        org.junit.Assert.assertNotNull(objectType93);
        org.junit.Assert.assertNotNull(objectTypeIterable94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(strSet97);
        org.junit.Assert.assertNotNull(parameterizedType98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        boolean boolean10 = functionType8.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType11 = functionType8.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = functionType8.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType8.getIndexType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType14 = jSType13.toObjectType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertNull(jSType13);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isComma();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("");
        node4.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        boolean boolean8 = node4.isSyntheticBlock();
        boolean boolean9 = node1.isEquivalentToTyped(node4);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean40 = jSDocInfo39.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean42 = jSDocInfo41.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean44 = jSDocInfo43.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList45 = com.google.common.collect.ImmutableList.of(jSDocInfo37, jSDocInfo38, jSDocInfo39, jSDocInfo41, jSDocInfo43);
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean49 = jSDocInfo48.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean51 = jSDocInfo50.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean53 = jSDocInfo52.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList54 = com.google.common.collect.ImmutableList.of(jSDocInfo46, jSDocInfo47, jSDocInfo48, jSDocInfo50, jSDocInfo52);
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean58 = jSDocInfo57.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean60 = jSDocInfo59.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean62 = jSDocInfo61.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList63 = com.google.common.collect.ImmutableList.of(jSDocInfo55, jSDocInfo56, jSDocInfo57, jSDocInfo59, jSDocInfo61);
        com.google.javascript.rhino.JSDocInfo jSDocInfo64 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean67 = jSDocInfo66.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo68 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean69 = jSDocInfo68.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean71 = jSDocInfo70.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList72 = com.google.common.collect.ImmutableList.of(jSDocInfo64, jSDocInfo65, jSDocInfo66, jSDocInfo68, jSDocInfo70);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList73 = com.google.common.collect.ImmutableList.of(jSDocInfoList45, jSDocInfoList54, jSDocInfoList63, jSDocInfoList72);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean74 = jSDocInfoList17.retainAll((java.util.Collection<com.google.javascript.rhino.JSDocInfo>) jSDocInfoList45);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList72);
        org.junit.Assert.assertNotNull(jSDocInfoListList73);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = jSTypeRegistry4.createAnonymousObjectType();
        jSTypeRegistry1.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType5);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSTypeRegistry10.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = objectType11.getParentScope();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType11, node14);
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        functionType15.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo17);
        int int19 = functionType15.getMaxArguments();
        boolean boolean20 = functionType15.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType25 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType15, "Unknown class name", "Not declared as a type name", 44, (int) '4');
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        // The following exception was thrown during execution in test generation
        try {
            functionType15.matchConstraint(objectType26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jSType25);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        java.lang.Object[] objArray37 = jSDocInfoList26.toArray();
        boolean boolean39 = jSDocInfoList26.equals((java.lang.Object) 'a');
        java.util.Spliterator<com.google.javascript.rhino.JSDocInfo> jSDocInfoSpliterator40 = jSDocInfoList26.spliterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean44 = jSDocInfo43.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean46 = jSDocInfo45.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean48 = jSDocInfo47.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList49 = com.google.common.collect.ImmutableList.of(jSDocInfo41, jSDocInfo42, jSDocInfo43, jSDocInfo45, jSDocInfo47);
        java.lang.String str50 = jSDocInfo47.getMeaning();
        java.lang.String str51 = jSDocInfo47.getDescription();
        boolean boolean53 = jSDocInfo47.hasParameterType("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = jSDocInfoList26.add(jSDocInfo47);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSDocInfoSpliterator40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        java.lang.Object[] objArray37 = jSDocInfoList26.toArray();
        boolean boolean39 = jSDocInfoList26.equals((java.lang.Object) 'a');
        boolean boolean41 = jSDocInfoList26.equals((java.lang.Object) (byte) -1);
        int int42 = jSDocInfoList26.size();
        int int43 = jSDocInfoList26.size();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList46 = jSDocInfoList26.subList(4095, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (4095) must not be greater than size (5)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5 + "'", int43 == 5);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 1, nodeArray2, 43, 50);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        node7.putProp((int) (short) 1, (java.lang.Object) (short) -1);
        boolean boolean11 = node7.isSyntheticBlock();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder12 = node7.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = null;
        node7.setStaticSourceFile(staticSourceFile13);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.siblings();
        int int18 = node16.getSideEffectFlags();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.siblings();
        node16.addChildToBack(node20);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("");
        boolean boolean25 = node24.isComma();
        boolean boolean26 = node24.isOnlyModifiesThisCall();
        boolean boolean27 = node24.isSetterDef();
        com.google.javascript.rhino.Node node28 = node20.useSourceInfoFrom(node24);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(0, node5, node7, node24, (int) (short) 100, 15);
        boolean boolean32 = node31.isStringKey();
        boolean boolean33 = node31.isNot();
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo2.getThisType();
        boolean boolean10 = jSDocInfo2.hasEnumParameterType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList11 = jSDocInfo2.getImplementedInterfaces();
        java.lang.String str12 = jSDocInfo2.getDeprecationReason();
        boolean boolean13 = jSDocInfo2.shouldPreserveTry();
        boolean boolean14 = jSDocInfo2.isConstant();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        boolean boolean5 = objectType4.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType7 = objectType4.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType7, "");
        jSTypeRegistry1.forwardDeclareType("");
        boolean boolean12 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        jSTypeRegistry1.incrementGeneration();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = jSTypeRegistry1.createObjectType(objectType14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) (short) 10);
        node18.setLength(43);
        boolean boolean21 = node18.isSwitch();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry1.createInterfaceType("function (): {1183181076}", node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("");
        boolean boolean39 = node38.isComma();
        node38.setType(1);
        com.google.javascript.rhino.Node node43 = node38.getAncestor((int) (short) 100);
        boolean boolean44 = node38.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable47 = node46.siblings();
        int int48 = node46.getSideEffectFlags();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable51 = node50.siblings();
        node46.addChildToBack(node50);
        boolean boolean53 = node50.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder54 = node50.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newExpr(node56);
        com.google.javascript.jscomp.CodingConvention.Bind bind58 = new com.google.javascript.jscomp.CodingConvention.Bind(node38, node50, node57);
        com.google.javascript.jscomp.CodingConvention.Bind[] bindArray59 = new com.google.javascript.jscomp.CodingConvention.Bind[] { bind58 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind[] bindArray60 = jSDocInfoList17.toArray(bindArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(nodeIterable47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(nodeIterable51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(bindArray59);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        boolean boolean10 = functionType8.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType11 = functionType8.autoboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType12 = functionType8.autoboxesTo();
        boolean boolean14 = functionType8.removeProperty("");
        java.lang.String str15 = functionType8.getDisplayName();
        com.google.javascript.rhino.jstype.TemplateType templateType16 = functionType8.toMaybeTemplateType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = templateType16.isDateType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(templateType16);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo4, jSDocInfo6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList17 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo13, jSDocInfo15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo22, jSDocInfo24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList35 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo31, jSDocInfo33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo>> jSDocInfoListList36 = com.google.common.collect.ImmutableList.of(jSDocInfoList8, jSDocInfoList17, jSDocInfoList26, jSDocInfoList35);
        java.util.Spliterator<com.google.javascript.rhino.JSDocInfo> jSDocInfoSpliterator37 = jSDocInfoList35.spliterator();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.siblings();
        int int41 = node39.getSideEffectFlags();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.siblings();
        node39.addChildToBack(node43);
        boolean boolean46 = node43.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder47 = node43.getJsDocBuilderForNode();
        node43.addSuppression("()");
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSTypeRegistry53.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType55 = objectType54.getParentScope();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry51.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType54, node57);
        com.google.javascript.rhino.JSDocInfo jSDocInfo60 = new com.google.javascript.rhino.JSDocInfo();
        functionType58.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo60);
        int int62 = functionType58.getMaxArguments();
        java.lang.String str63 = functionType58.toAnnotationString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo67 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean68 = jSDocInfo67.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean70 = jSDocInfo69.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo71 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean72 = jSDocInfo71.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList73 = com.google.common.collect.ImmutableList.of(jSDocInfo65, jSDocInfo66, jSDocInfo67, jSDocInfo69, jSDocInfo71);
        jSDocInfo67.addSuppression("");
        java.lang.String str77 = jSDocInfo67.getDescriptionForParameter("");
        boolean boolean78 = jSDocInfo67.isExport();
        functionType58.setPropertyJSDocInfo("(true)", jSDocInfo67);
        node43.setJSDocInfo(jSDocInfo67);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = jSDocInfoList35.add(jSDocInfo67);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList35);
        org.junit.Assert.assertNotNull(jSDocInfoListList36);
        org.junit.Assert.assertNotNull(jSDocInfoSpliterator37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder47);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(objectType55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "function (): {}" + "'", str63, "function (): {}");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList73);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSTypeRegistry10.createAnonymousObjectType();
        jSTypeRegistry7.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = jSTypeRegistry1.createFromTypeNodes(node4, "", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType11);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode14 = null;
        jSTypeRegistry1.setResolveMode(resolveMode14);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSTypeRegistry17.createAnonymousObjectType();
        boolean boolean19 = objectType18.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType21 = objectType18.findPropertyType("true");
        boolean boolean23 = objectType18.removeProperty("[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        boolean boolean24 = objectType18.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType26 = jSTypeRegistry1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) objectType18, "()");
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry30.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.getParentScope();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry28.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType31, node34);
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = new com.google.javascript.rhino.JSDocInfo();
        functionType35.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo37);
        int int39 = functionType35.getMaxArguments();
        java.lang.String str40 = functionType35.toAnnotationString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean45 = jSDocInfo44.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean47 = jSDocInfo46.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean49 = jSDocInfo48.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList50 = com.google.common.collect.ImmutableList.of(jSDocInfo42, jSDocInfo43, jSDocInfo44, jSDocInfo46, jSDocInfo48);
        jSDocInfo44.addSuppression("");
        java.lang.String str54 = jSDocInfo44.getDescriptionForParameter("");
        boolean boolean55 = jSDocInfo44.isExport();
        functionType35.setPropertyJSDocInfo("(true)", jSDocInfo44);
        boolean boolean57 = functionType35.isNominalType();
        boolean boolean58 = functionType35.isNoResolvedType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry1.createConstructorType((com.google.javascript.rhino.jstype.JSType) functionType35, jSTypeArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSType26);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "function (): {}" + "'", str40, "function (): {}");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        functionType8.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo10);
        boolean boolean12 = functionType8.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType8.autobox();
        boolean boolean14 = functionType8.isConstructor();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        boolean boolean5 = objectType4.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType7 = objectType4.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType7, "");
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = jSTypeRegistry13.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = objectType14.getParentScope();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry11.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType14, node17);
        java.lang.String str19 = functionType18.getDisplayName();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.siblings();
        int int23 = node21.getSideEffectFlags();
        boolean boolean24 = node21.isLabelName();
        boolean boolean25 = node21.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType18, node21);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry30.createAnonymousObjectType();
        boolean boolean32 = objectType31.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType34 = objectType31.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.getGreatestSubtypeWithProperty(jSType34, "");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSTypeRegistry40.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType42 = objectType41.getParentScope();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry38.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType41, node44);
        java.lang.String str46 = functionType45.getDisplayName();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.siblings();
        int int50 = node48.getSideEffectFlags();
        boolean boolean51 = node48.isLabelName();
        boolean boolean52 = node48.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry28.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType45, node48);
        java.lang.String str54 = functionType53.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSTypeRegistry56.createAnonymousObjectType();
        boolean boolean58 = objectType57.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType60 = objectType57.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean61 = objectType57.hasDisplayName();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair62 = functionType53.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry66.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType68 = objectType67.getParentScope();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry64.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType67, node70);
        boolean boolean73 = functionType71.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType71.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType71.getTypeOfThis();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet76 = objectType75.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79);
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSTypeRegistry80.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType82 = objectType81.getParentScope();
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry78.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType81, node84);
        java.lang.String str86 = functionType85.getDisplayName();
        boolean boolean87 = objectType75.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean88 = functionType85.hasCachedValues();
        int int89 = functionType85.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter90 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry91 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter90);
        com.google.javascript.rhino.jstype.ObjectType objectType92 = jSTypeRegistry91.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType93 = objectType92.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable94 = objectType93.getCtorExtendedInterfaces();
        boolean boolean95 = objectType93.isStringValueType();
        functionType85.setPrototypeBasedOn(objectType93);
        java.util.Set<java.lang.String> strSet97 = functionType85.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType98 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType53, (com.google.javascript.rhino.jstype.JSType) functionType85);
        java.lang.String str99 = parameterizedType98.toDebugHashCodeString();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(typePair62);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet76 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet76.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertNotNull(objectType82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(objectType92);
        org.junit.Assert.assertNotNull(objectType93);
        org.junit.Assert.assertNotNull(objectTypeIterable94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(strSet97);
        org.junit.Assert.assertNotNull(parameterizedType98);
// flaky:         org.junit.Assert.assertEquals("'" + str99 + "' != '" + "{proxy:function (): function (): {192135467}}" + "'", str99, "{proxy:function (): function (): {192135467}}");
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isConstant();
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean4 = jSDocInfo0.isHidden();
        boolean boolean5 = jSDocInfo0.isDefine();
        boolean boolean6 = jSDocInfo0.isJavaDispatch();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry3.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getParentScope();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType4, node7);
        boolean boolean10 = functionType8.removeProperty("");
        com.google.javascript.rhino.jstype.JSType jSType11 = functionType8.autoboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType12 = functionType8.autoboxesTo();
        boolean boolean14 = functionType8.removeProperty("");
        java.lang.String str15 = functionType8.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry19.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType21 = objectType20.getParentScope();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType20, node23);
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = new com.google.javascript.rhino.JSDocInfo();
        functionType24.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo26);
        int int28 = functionType24.getMaxArguments();
        boolean boolean29 = functionType24.canBeCalled();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry33.createAnonymousObjectType();
        boolean boolean35 = objectType34.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType37 = objectType34.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.JSType jSType39 = jSTypeRegistry31.getGreatestSubtypeWithProperty(jSType37, "");
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSTypeRegistry43.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType45 = objectType44.getParentScope();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry41.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType44, node47);
        java.lang.String str49 = functionType48.getDisplayName();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable52 = node51.siblings();
        int int53 = node51.getSideEffectFlags();
        boolean boolean54 = node51.isLabelName();
        boolean boolean55 = node51.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry31.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType48, node51);
        functionType24.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType48);
        boolean boolean59 = functionType48.removeProperty("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType60 = functionType8.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType48);
        boolean boolean61 = jSType60.isNumberValueType();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSType37);
        org.junit.Assert.assertNotNull(jSType39);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(nodeIterable52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = jSTypeRegistry1.createAnonymousObjectType();
        boolean boolean3 = objectType2.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType5 = objectType2.findPropertyType("true");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = jSType5.isTemplateType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSType5);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("{}");
        boolean boolean2 = node1.isDelProp();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = jSTypeRegistry1.createAnonymousObjectType();
        boolean boolean3 = objectType2.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType5 = objectType2.findPropertyType("true");
        boolean boolean7 = objectType2.removeProperty("[JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo, JSDocInfo]");
        com.google.javascript.rhino.jstype.JSType jSType9 = objectType2.findPropertyType("true");
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = jSTypeRegistry13.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = objectType14.getParentScope();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry11.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType14, node17);
        boolean boolean20 = functionType18.removeProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry22.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = objectType23.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = objectType24.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType26 = objectType24.collapseUnion();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSTypeRegistry28.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType30 = objectType29.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = objectType30.getCtorExtendedInterfaces();
        boolean boolean33 = objectType30.removeProperty("hi!");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair34 = jSType26.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) objectType30);
        boolean boolean35 = functionType18.isSubtype((com.google.javascript.rhino.jstype.JSType) objectType30);
        com.google.javascript.rhino.jstype.JSType jSType37 = functionType18.getPropertyType("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType38 = functionType18.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair39 = objectType2.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) functionType18);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot41 = functionType18.getOwnSlot("{}");
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSTypeRegistry45.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType47 = objectType46.getParentScope();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry43.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType46, node49);
        java.lang.String str51 = functionType50.getDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType52 = functionType50.getOwnerFunction();
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean58 = jSDocInfo57.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean60 = jSDocInfo59.hasReturnType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList61 = com.google.common.collect.ImmutableList.of(jSDocInfo53, jSDocInfo54, jSDocInfo55, jSDocInfo57, jSDocInfo59);
        boolean boolean62 = jSDocInfo53.isNoCompile();
        java.lang.String str63 = jSDocInfo53.getVersion();
        functionType50.setJSDocInfo(jSDocInfo53);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = functionType50.getOwnerFunction();
        com.google.common.collect.ImmutableList<java.lang.String> strList66 = functionType50.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType67 = functionType50.collapseUnion();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair68 = functionType18.getTypesUnderEquality(jSType67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69);
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72);
        com.google.javascript.rhino.jstype.ObjectType objectType74 = jSTypeRegistry73.createAnonymousObjectType();
        jSTypeRegistry70.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType74);
        com.google.javascript.rhino.jstype.JSType jSType76 = objectType74.autoboxesTo();
        com.google.javascript.rhino.jstype.UnionType unionType77 = objectType74.toMaybeUnionType();
        boolean boolean78 = objectType74.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType79 = objectType74.autobox();
        com.google.javascript.rhino.jstype.JSType jSType81 = objectType74.getRestrictedTypeGivenToBooleanOutcome(false);
        com.google.javascript.rhino.jstype.UnionType unionType82 = objectType74.toMaybeUnionType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean83 = functionType18.isSubtype((com.google.javascript.rhino.jstype.JSType) unionType82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertNotNull(jSType26);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectTypeIterable31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(typePair34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jSType37);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(typePair39);
        org.junit.Assert.assertNull(jSTypeStaticSlot41);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(functionType52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(functionType65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertNotNull(typePair68);
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertNull(jSType76);
        org.junit.Assert.assertNull(unionType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(jSType79);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNull(unionType82);
    }
}
